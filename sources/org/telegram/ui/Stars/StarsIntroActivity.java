package org.telegram.ui.Stars;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$StarsTransaction;
import org.telegram.tgnet.TLRPC$StarsTransactionPeer;
import org.telegram.tgnet.TLRPC$TL_payments_paymentReceiptStars;
import org.telegram.tgnet.TLRPC$TL_starsTopupOption;
import org.telegram.tgnet.TLRPC$TL_starsTransactionPeer;
import org.telegram.tgnet.TLRPC$TL_starsTransactionPeerAppStore;
import org.telegram.tgnet.TLRPC$TL_starsTransactionPeerFragment;
import org.telegram.tgnet.TLRPC$TL_starsTransactionPeerPlayMarket;
import org.telegram.tgnet.TLRPC$TL_starsTransactionPeerPremiumBot;
import org.telegram.tgnet.TLRPC$TL_starsTransactionPeerUnsupported;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$WebDocument;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.SessionCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FireworksOverlay;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.LoadingSpan;
import org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.TableView;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.GradientHeaderActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;

public class StarsIntroActivity extends GradientHeaderActivity implements NotificationCenter.NotificationCenterDelegate {
    private FrameLayout aboveTitleView;
    private UniversalAdapter adapter;
    private StarsBalanceView balanceView;
    private View emptyLayout;
    private boolean expanded = false;
    private FireworksOverlay fireworksOverlay;
    private GLIconTextureView iconTextureView;
    private StarsTransactionsLayout transactionsLayout;

    public StarsIntroActivity() {
        setWhiteBackground(true);
    }

    @Override
    public boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        StarsController.getInstance(this.currentAccount).invalidateTransactions(true);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.starOptionsLoaded) {
            saveScrollPosition();
            UniversalAdapter universalAdapter = this.adapter;
            if (universalAdapter != null) {
                universalAdapter.update(true);
            }
            if (this.savedScrollPosition == 0 && this.savedScrollOffset < 0) {
                this.savedScrollOffset = 0;
            }
            applyScrolledPosition();
        }
    }

    @Override
    public View createView(Context context) {
        this.useFillLastLayoutManager = false;
        this.particlesViewHeight = AndroidUtilities.dp(238.0f);
        this.transactionsLayout = new StarsTransactionsLayout(context, this.currentAccount, 0L, getClassGuid(), getResourceProvider());
        View view = new View(this, context) {
            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(300.0f), 1073741824));
            }
        };
        this.emptyLayout = view;
        view.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        super.createView(context);
        StarsBalanceView starsBalanceView = new StarsBalanceView(context, this.currentAccount);
        this.balanceView = starsBalanceView;
        this.actionBar.addView(starsBalanceView, LayoutHelper.createFrame(-2, -2, 85));
        FrameLayout frameLayout = new FrameLayout(context);
        this.aboveTitleView = frameLayout;
        frameLayout.setClickable(true);
        GLIconTextureView gLIconTextureView = new GLIconTextureView(context, 1, 2);
        this.iconTextureView = gLIconTextureView;
        GLIconRenderer gLIconRenderer = gLIconTextureView.mRenderer;
        gLIconRenderer.colorKey1 = Theme.key_starsGradient1;
        gLIconRenderer.colorKey2 = Theme.key_starsGradient2;
        gLIconRenderer.updateColors();
        this.iconTextureView.setStarParticlesView(this.particlesView);
        this.aboveTitleView.addView(this.iconTextureView, LayoutHelper.createFrame(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        configureHeader(LocaleController.getString(R.string.TelegramStars), LocaleController.getString(R.string.TelegramStarsInfo), this.aboveTitleView, null);
        this.listView.setOverScrollMode(2);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(350L);
        this.listView.setItemAnimator(defaultItemAnimator);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view2, int i) {
                StarsIntroActivity.this.lambda$createView$0(view2, i);
            }
        });
        FireworksOverlay fireworksOverlay = new FireworksOverlay(getContext());
        this.fireworksOverlay = fireworksOverlay;
        this.contentView.addView(fireworksOverlay, LayoutHelper.createFrame(-1, -1.0f));
        return this.fragmentView;
    }

    public void lambda$createView$0(View view, int i) {
        UItem item;
        UniversalAdapter universalAdapter = this.adapter;
        if (universalAdapter == null || (item = universalAdapter.getItem(i)) == null) {
            return;
        }
        onItemClick(item, i);
    }

    @Override
    protected GradientHeaderActivity.ContentView createContentView() {
        return new NestedFrameLayout(getContext());
    }

    public class NestedFrameLayout extends GradientHeaderActivity.ContentView {
        private NestedScrollingParentHelper nestedScrollingParentHelper;

        @Override
        public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        }

        @Override
        public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
            return i == 2;
        }

        @Override
        public void onStopNestedScroll(View view) {
        }

        public NestedFrameLayout(Context context) {
            super(context);
            this.nestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        }

        @Override
        public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            try {
                if (view == ((GradientHeaderActivity) StarsIntroActivity.this).listView && StarsIntroActivity.this.transactionsLayout.isAttachedToWindow()) {
                    RecyclerListView currentListView = StarsIntroActivity.this.transactionsLayout.getCurrentListView();
                    if (((GradientHeaderActivity) StarsIntroActivity.this).listView.getHeight() - ((View) StarsIntroActivity.this.transactionsLayout.getParent()).getBottom() >= 0) {
                        iArr[1] = i4;
                        currentListView.scrollBy(0, i4);
                    }
                }
            } catch (Throwable th) {
                FileLog.e(th);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        StarsIntroActivity.NestedFrameLayout.this.lambda$onNestedScroll$0();
                    }
                });
            }
        }

        public void lambda$onNestedScroll$0() {
            try {
                RecyclerListView currentListView = StarsIntroActivity.this.transactionsLayout.getCurrentListView();
                if (currentListView == null || currentListView.getAdapter() == null) {
                    return;
                }
                currentListView.getAdapter().notifyDataSetChanged();
            } catch (Throwable unused) {
            }
        }

        @Override
        public boolean onNestedPreFling(View view, float f, float f2) {
            return super.onNestedPreFling(view, f, f2);
        }

        @Override
        public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
            if (view == ((GradientHeaderActivity) StarsIntroActivity.this).listView && StarsIntroActivity.this.transactionsLayout.isAttachedToWindow()) {
                boolean isSearchFieldVisible = ((BaseFragment) StarsIntroActivity.this).actionBar.isSearchFieldVisible();
                int top = (((View) StarsIntroActivity.this.transactionsLayout.getParent()).getTop() - AndroidUtilities.statusBarHeight) - ActionBar.getCurrentActionBarHeight();
                int bottom = ((View) StarsIntroActivity.this.transactionsLayout.getParent()).getBottom();
                boolean z = false;
                if (i2 >= 0) {
                    if (isSearchFieldVisible) {
                        RecyclerListView currentListView = StarsIntroActivity.this.transactionsLayout.getCurrentListView();
                        iArr[1] = i2;
                        if (top > 0) {
                            iArr[1] = iArr[1] - i2;
                        }
                        if (currentListView == null || iArr[1] <= 0) {
                            return;
                        }
                        currentListView.scrollBy(0, iArr[1]);
                        return;
                    }
                    return;
                }
                if (((GradientHeaderActivity) StarsIntroActivity.this).listView.getHeight() - bottom >= 0) {
                    RecyclerListView currentListView2 = StarsIntroActivity.this.transactionsLayout.getCurrentListView();
                    int findFirstVisibleItemPosition = ((LinearLayoutManager) currentListView2.getLayoutManager()).findFirstVisibleItemPosition();
                    if (findFirstVisibleItemPosition != -1) {
                        RecyclerView.ViewHolder findViewHolderForAdapterPosition = currentListView2.findViewHolderForAdapterPosition(findFirstVisibleItemPosition);
                        int top2 = findViewHolderForAdapterPosition != null ? findViewHolderForAdapterPosition.itemView.getTop() : -1;
                        int paddingTop = currentListView2.getPaddingTop();
                        if (top2 != paddingTop || findFirstVisibleItemPosition != 0) {
                            iArr[1] = findFirstVisibleItemPosition != 0 ? i2 : Math.max(i2, top2 - paddingTop);
                            currentListView2.scrollBy(0, i2);
                            z = true;
                        }
                    }
                }
                if (isSearchFieldVisible) {
                    if (!z && top < 0) {
                        iArr[1] = i2 - Math.max(top, i2);
                    } else {
                        iArr[1] = i2;
                    }
                }
            }
        }

        @Override
        public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
            this.nestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i);
        }

        @Override
        public void onStopNestedScroll(View view, int i) {
            this.nestedScrollingParentHelper.onStopNestedScroll(view);
        }
    }

    public boolean attachedTransactionsLayout() {
        StarsTransactionsLayout starsTransactionsLayout = this.transactionsLayout;
        if (starsTransactionsLayout == null || !(starsTransactionsLayout.getParent() instanceof View)) {
            return false;
        }
        return this.listView.getHeight() - ((View) this.transactionsLayout.getParent()).getBottom() >= 0;
    }

    @Override
    protected boolean drawActionBarShadow() {
        return !attachedTransactionsLayout();
    }

    @Override
    public StarParticlesView createParticlesView() {
        return makeParticlesView(getContext(), 75, 1);
    }

    public class AnonymousClass2 extends StarParticlesView {
        Paint[] paints;
        final int val$particlesCount;
        final int val$type;

        AnonymousClass2(Context context, int i, int i2) {
            super(context);
            this.val$particlesCount = i;
            this.val$type = i2;
            setClipWithGradient();
        }

        @Override
        protected void configure() {
            StarParticlesView.Drawable drawable = new StarParticlesView.Drawable(this.val$particlesCount);
            this.drawable = drawable;
            drawable.type = R.styleable.AppCompatTheme_textAppearanceListItemSmall;
            int i = 0;
            drawable.roundEffect = false;
            drawable.useRotate = false;
            drawable.useBlur = true;
            drawable.checkBounds = true;
            drawable.isCircle = false;
            drawable.useScale = true;
            drawable.startFromCenter = true;
            if (this.val$type == 1) {
                drawable.centerOffsetY = AndroidUtilities.dp(24.0f);
            }
            this.paints = new Paint[20];
            while (true) {
                Paint[] paintArr = this.paints;
                if (i < paintArr.length) {
                    paintArr[i] = new Paint(1);
                    this.paints[i].setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(-371690, -14281, i / (this.paints.length - 1)), PorterDuff.Mode.SRC_IN));
                    i++;
                } else {
                    this.drawable.getPaint = new Utilities.CallbackReturn() {
                        @Override
                        public final Object run(Object obj) {
                            Paint lambda$configure$0;
                            lambda$configure$0 = StarsIntroActivity.AnonymousClass2.this.lambda$configure$0((Integer) obj);
                            return lambda$configure$0;
                        }
                    };
                    StarParticlesView.Drawable drawable2 = this.drawable;
                    drawable2.size1 = 17;
                    drawable2.size2 = 18;
                    drawable2.size3 = 19;
                    drawable2.colorKey = Theme.key_windowBackgroundWhiteBlackText;
                    drawable2.init();
                    return;
                }
            }
        }

        public Paint lambda$configure$0(Integer num) {
            return this.paints[num.intValue() % this.paints.length];
        }

        @Override
        protected int getStarsRectWidth() {
            return getMeasuredWidth();
        }
    }

    public static StarParticlesView makeParticlesView(Context context, int i, int i2) {
        return new AnonymousClass2(context, i, i2);
    }

    @Override
    public void onResume() {
        super.onResume();
        GLIconTextureView gLIconTextureView = this.iconTextureView;
        if (gLIconTextureView != null) {
            gLIconTextureView.setPaused(false);
            this.iconTextureView.setDialogVisible(false);
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        GLIconTextureView gLIconTextureView = this.iconTextureView;
        if (gLIconTextureView != null) {
            gLIconTextureView.setPaused(true);
            this.iconTextureView.setDialogVisible(true);
        }
    }

    @Override
    protected View getHeader(Context context) {
        return super.getHeader(context);
    }

    @Override
    protected RecyclerView.Adapter<?> createAdapter() {
        UniversalAdapter universalAdapter = new UniversalAdapter(this.listView, getContext(), this.currentAccount, this.classGuid, true, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                StarsIntroActivity.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, getResourceProvider()) {
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                if (i == 0) {
                    HeaderCell headerCell = new HeaderCell(StarsIntroActivity.this.getContext(), Theme.key_windowBackgroundWhiteBlueHeader, 21, 0, false, ((BaseFragment) StarsIntroActivity.this).resourceProvider);
                    headerCell.setHeight(25);
                    return new RecyclerListView.Holder(headerCell);
                }
                return super.onCreateViewHolder(viewGroup, i);
            }
        };
        this.adapter = universalAdapter;
        return universalAdapter;
    }

    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        if (getContext() == null) {
            return;
        }
        StarsController starsController = StarsController.getInstance(this.currentAccount);
        arrayList.add(UItem.asFullyCustom(getHeader(getContext())));
        arrayList.add(UItem.asHeader(LocaleController.getString(R.string.TelegramStarsChoose)));
        ArrayList<TLRPC$TL_starsTopupOption> options = starsController.getOptions();
        if (options != null && !options.isEmpty()) {
            int i = 0;
            int i2 = 1;
            for (int i3 = 0; i3 < options.size(); i3++) {
                TLRPC$TL_starsTopupOption tLRPC$TL_starsTopupOption = options.get(i3);
                if (!tLRPC$TL_starsTopupOption.collapsed || this.expanded) {
                    arrayList.add(StarTierView.Factory.asStarTier(i3, i2, tLRPC$TL_starsTopupOption));
                    i2++;
                } else {
                    i++;
                }
            }
            boolean z = this.expanded;
            if (!z && i > 0) {
                arrayList.add(ExpandView.Factory.asExpand(-1, LocaleController.getString(z ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions), true ^ this.expanded).accent());
            }
        } else {
            arrayList.add(UItem.asFlicker(31));
            arrayList.add(UItem.asFlicker(31));
            arrayList.add(UItem.asFlicker(31));
            arrayList.add(UItem.asFlicker(31));
            arrayList.add(UItem.asFlicker(31));
        }
        arrayList.add(UItem.asShadow(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable() {
            @Override
            public final void run() {
                StarsIntroActivity.this.lambda$fillItems$1();
            }
        })));
        arrayList.add(UItem.asFullscreenCustom(this.transactionsLayout, ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight));
    }

    public void lambda$fillItems$1() {
        Browser.openUrl(getContext(), LocaleController.getString(R.string.StarsTOSLink));
    }

    public void onItemClick(final UItem uItem, int i) {
        if (uItem.id == -1) {
            this.expanded = !this.expanded;
            this.adapter.update(true);
        } else if (uItem.instanceOf(StarTierView.Factory.class) && (uItem.object instanceof TLRPC$TL_starsTopupOption)) {
            StarsController.getInstance(this.currentAccount).buy(getParentActivity(), (TLRPC$TL_starsTopupOption) uItem.object, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    StarsIntroActivity.this.lambda$onItemClick$2(uItem, (Boolean) obj, (String) obj2);
                }
            });
        }
    }

    public void lambda$onItemClick$2(UItem uItem, Boolean bool, String str) {
        if (getContext() == null) {
            return;
        }
        if (bool.booleanValue()) {
            BulletinFactory.of(this).createSimpleBulletin(getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) uItem.longValue, new Object[0]))).show();
            this.fireworksOverlay.start(true);
            StarsController.getInstance(this.currentAccount).invalidateTransactions(true);
        } else if (str != null) {
            BulletinFactory.of(this).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str)).show();
        }
    }

    public static class StarsBalanceView extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
        private final AnimatedTextView amountTextView;
        private ValueAnimator bounceAnimator;
        private final int currentAccount;
        private final TextView headerTextView;
        private long lastBalance;
        private SpannableString loadingString;

        public StarsBalanceView(Context context, int i) {
            super(context);
            this.lastBalance = -1L;
            this.currentAccount = i;
            setOrientation(1);
            setGravity(21);
            TextView textView = new TextView(context);
            this.headerTextView = textView;
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i2));
            textView.setTextSize(1, 13.0f);
            textView.setText(LocaleController.getString(R.string.StarsBalance));
            textView.setGravity(5);
            textView.setTypeface(AndroidUtilities.bold());
            addView(textView, LayoutHelper.createLinear(-2, -2, 5));
            final Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
            AnimatedTextView animatedTextView = new AnimatedTextView(this, context) {
                @Override
                protected void dispatchDraw(Canvas canvas) {
                    int measuredWidth = (int) ((getMeasuredWidth() - getDrawable().getCurrentWidth()) - AndroidUtilities.dp(20.0f));
                    mutate.setBounds(measuredWidth, (getMeasuredHeight() - AndroidUtilities.dp(17.0f)) / 2, AndroidUtilities.dp(17.0f) + measuredWidth, (getMeasuredHeight() + AndroidUtilities.dp(17.0f)) / 2);
                    mutate.draw(canvas);
                    super.dispatchDraw(canvas);
                }
            };
            this.amountTextView = animatedTextView;
            animatedTextView.adaptWidth = true;
            animatedTextView.getDrawable().setHacks(false, true, true);
            animatedTextView.setTypeface(AndroidUtilities.bold());
            animatedTextView.setTextColor(Theme.getColor(i2));
            animatedTextView.setTextSize(AndroidUtilities.dp(13.0f));
            animatedTextView.setGravity(5);
            animatedTextView.setPadding(AndroidUtilities.dp(19.0f), 0, 0, 0);
            addView(animatedTextView, LayoutHelper.createLinear(-2, 20, 5, 0, -2, 0, 0));
            updateBalance(false);
            setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f));
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            updateBalance(false);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.starBalanceUpdated) {
                updateBalance(true);
            }
        }

        public void updateBalance(boolean z) {
            StarsController starsController = StarsController.getInstance(this.currentAccount);
            this.amountTextView.cancelAnimation();
            long balance = StarsController.getInstance(this.currentAccount).getBalance();
            long j = this.lastBalance;
            if (balance > j && j != -1) {
                bounce();
            }
            if (!starsController.balanceAvailable()) {
                if (this.loadingString == null) {
                    SpannableString spannableString = new SpannableString("x");
                    this.loadingString = spannableString;
                    spannableString.setSpan(new LoadingSpan(this.amountTextView, AndroidUtilities.dp(48.0f)), 0, this.loadingString.length(), 33);
                }
                this.amountTextView.setText(this.loadingString, z);
                this.lastBalance = -1L;
                return;
            }
            this.amountTextView.setText(LocaleController.formatNumber(balance, ' '));
            this.lastBalance = balance;
        }

        public void bounce() {
            ValueAnimator valueAnimator = this.bounceAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.bounceAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    StarsIntroActivity.StarsBalanceView.this.lambda$bounce$0(valueAnimator2);
                }
            });
            this.bounceAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    StarsBalanceView.this.amountTextView.setScaleX(1.0f);
                    StarsBalanceView.this.amountTextView.setScaleY(1.0f);
                }
            });
            this.bounceAnimator.setDuration(320L);
            this.bounceAnimator.setInterpolator(new OvershootInterpolator());
            this.bounceAnimator.start();
        }

        public void lambda$bounce$0(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.amountTextView.setScaleX(floatValue);
            this.amountTextView.setScaleY(floatValue);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(ActionBar.getCurrentActionBarHeight(), 1073741824));
        }
    }

    public static class StarTierView extends FrameLayout {
        private final AnimatedFloat animatedStarsCount;
        private SpannableString loading;
        private boolean needDivider;
        private final Drawable starDrawable;
        private final Drawable starDrawableOutline;
        private int starsCount;
        private final TextView textView;
        private final AnimatedTextView textView2;

        public StarTierView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.animatedStarsCount = new AnimatedFloat(this, 0L, 500L, CubicBezierInterpolator.EASE_OUT_QUINT);
            Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_outline).mutate();
            this.starDrawableOutline = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogBackground, resourcesProvider), PorterDuff.Mode.SRC_IN));
            this.starDrawable = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
            setWillNotDraw(false);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 15.0f);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            addView(textView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388627, 48.0f, 0.0f, 0.0f, 0.0f));
            AnimatedTextView animatedTextView = new AnimatedTextView(context);
            this.textView2 = animatedTextView;
            animatedTextView.setTextSize(AndroidUtilities.dp(15.0f));
            animatedTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            animatedTextView.setGravity(LocaleController.isRTL ? 3 : 5);
            addView(animatedTextView, LayoutHelper.createFrameRelatively(-2.0f, 21.0f, 8388629, 0.0f, 0.0f, 19.0f, 0.0f));
        }

        public void set(int i, CharSequence charSequence, CharSequence charSequence2, boolean z) {
            boolean equals = TextUtils.equals(this.textView.getText(), charSequence);
            this.starsCount = i;
            if (!equals) {
                this.animatedStarsCount.set(i, true);
            }
            this.textView.setText(charSequence);
            if (charSequence2 == null) {
                if (this.loading == null) {
                    SpannableString spannableString = new SpannableString("x");
                    this.loading = spannableString;
                    spannableString.setSpan(new LoadingSpan(this.textView2, AndroidUtilities.dp(55.0f)), 0, this.loading.length(), 33);
                }
                charSequence2 = this.loading;
            }
            this.textView2.setText(charSequence2);
            float f = LocaleController.isRTL ? -1.0f : 1.0f;
            if (equals) {
                this.textView.animate().translationX(f * (i - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            } else {
                this.textView.setTranslationX(f * (i - 1) * AndroidUtilities.dp(2.66f));
            }
            this.needDivider = z;
            invalidate();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            float f = this.animatedStarsCount.set(this.starsCount);
            float f2 = LocaleController.isRTL ? -1.0f : 1.0f;
            float dp = AndroidUtilities.dp(24.0f);
            float dp2 = AndroidUtilities.dp(24.0f);
            float dp3 = AndroidUtilities.dp(2.5f);
            float width = LocaleController.isRTL ? (getWidth() - AndroidUtilities.dp(19.0f)) - dp : AndroidUtilities.dp(19.0f);
            int ceil = (int) Math.ceil(f);
            while (true) {
                ceil--;
                if (ceil < 0) {
                    break;
                }
                float clamp = Utilities.clamp(f - ceil, 1.0f, 0.0f);
                float f3 = (((ceil - 1) - (1.0f - clamp)) * dp3 * f2) + width;
                float measuredHeight = (getMeasuredHeight() - dp2) / 2.0f;
                int i = (int) f3;
                int i2 = (int) measuredHeight;
                int i3 = (int) (f3 + dp);
                int i4 = (int) (measuredHeight + dp2);
                this.starDrawableOutline.setBounds(i, i2, i3, i4);
                int i5 = (int) (clamp * 255.0f);
                this.starDrawableOutline.setAlpha(i5);
                this.starDrawableOutline.draw(canvas);
                this.starDrawable.setBounds(i, i2, i3, i4);
                this.starDrawable.setAlpha(i5);
                this.starDrawable.draw(canvas);
            }
            if (this.needDivider) {
                canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : 0), getMeasuredHeight(), Theme.dividerPaint);
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
        }

        public static class Factory extends UItem.UItemFactory<StarTierView> {
            @Override
            public StarTierView createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new StarTierView(context, resourcesProvider);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z) {
                ((StarTierView) view).set(uItem.intValue, uItem.text, uItem.subtext, z);
            }

            public static UItem asStarTier(int i, int i2, TLRPC$TL_starsTopupOption tLRPC$TL_starsTopupOption) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.id = i;
                ofFactory.intValue = i2;
                long j = tLRPC$TL_starsTopupOption.stars;
                ofFactory.longValue = j;
                ofFactory.text = LocaleController.formatPluralString("StarsCount", (int) j, new Object[0]);
                ofFactory.subtext = tLRPC$TL_starsTopupOption.loadingStorePrice ? null : BillingController.getInstance().formatCurrency(tLRPC$TL_starsTopupOption.amount, tLRPC$TL_starsTopupOption.currency);
                ofFactory.object = tLRPC$TL_starsTopupOption;
                return ofFactory;
            }

            @Override
            public boolean equals(UItem uItem, UItem uItem2) {
                return uItem.id == uItem2.id;
            }

            @Override
            public boolean contentsEquals(UItem uItem, UItem uItem2) {
                return uItem.intValue == uItem2.intValue && uItem.id == uItem2.id && TextUtils.equals(uItem.subtext, uItem2.subtext);
            }
        }
    }

    public static class ExpandView extends FrameLayout {
        public final ImageView arrowView;
        private int lastId;
        private boolean needDivider;
        public final AnimatedTextView textView;

        public ExpandView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            AnimatedTextView animatedTextView = new AnimatedTextView(context);
            this.textView = animatedTextView;
            animatedTextView.getDrawable().setHacks(true, true, true);
            animatedTextView.setTextSize(AndroidUtilities.dp(15.0f));
            addView(animatedTextView, LayoutHelper.createFrameRelatively(-1.0f, -1.0f, 8388627, 22.0f, 0.0f, 58.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.arrowView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.arrow_more);
            addView(imageView, LayoutHelper.createFrameRelatively(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 17.0f, 0.0f));
        }

        public void set(UItem uItem, boolean z) {
            int i = this.lastId;
            int i2 = uItem.id;
            boolean z2 = i == i2;
            this.lastId = i2;
            this.textView.setText(uItem.text, z2);
            int color = Theme.getColor(uItem.accent ? Theme.key_windowBackgroundWhiteBlueText2 : Theme.key_windowBackgroundWhiteBlackText);
            this.textView.setTextColor(color);
            this.arrowView.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            if (z2) {
                this.arrowView.animate().rotation(uItem.collapsed ? 0.0f : 180.0f).setDuration(340L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            } else {
                this.arrowView.setRotation(uItem.collapsed ? 0.0f : 180.0f);
            }
            this.needDivider = z;
            setWillNotDraw(!z);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.needDivider) {
                canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : 0), getMeasuredHeight(), Theme.dividerPaint);
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.lastId = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }

        public static class Factory extends UItem.UItemFactory<ExpandView> {
            @Override
            public ExpandView createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new ExpandView(context, resourcesProvider);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z) {
                ((ExpandView) view).set(uItem, z);
            }

            public static UItem asExpand(int i, CharSequence charSequence, boolean z) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.id = i;
                ofFactory.text = charSequence;
                ofFactory.collapsed = z;
                return ofFactory;
            }
        }
    }

    public static class StarsTransactionsLayout extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
        private final PageAdapter adapter;
        private final int currentAccount;
        private final ViewPagerFixed.TabsView tabsView;
        private final ViewPagerFixed viewPager;

        private static class PageAdapter extends ViewPagerFixed.Adapter {
            private final long bot_id;
            private final int classGuid;
            private final Context context;
            private final int currentAccount;
            private final ArrayList<UItem> items = new ArrayList<>();
            private final Theme.ResourcesProvider resourcesProvider;

            @Override
            public void bindView(View view, int i, int i2) {
            }

            public PageAdapter(Context context, int i, long j, int i2, Theme.ResourcesProvider resourcesProvider) {
                this.context = context;
                this.currentAccount = i;
                this.classGuid = i2;
                this.resourcesProvider = resourcesProvider;
                this.bot_id = j;
                fill();
            }

            public void fill() {
                this.items.clear();
                if (this.bot_id == 0) {
                    StarsController starsController = StarsController.getInstance(this.currentAccount);
                    this.items.add(UItem.asSpace(0));
                    if (starsController.hasTransactions(1)) {
                        this.items.add(UItem.asSpace(1));
                    }
                    if (starsController.hasTransactions(2)) {
                        this.items.add(UItem.asSpace(2));
                        return;
                    }
                    return;
                }
                BotStarsController botStarsController = BotStarsController.getInstance(this.currentAccount);
                this.items.add(UItem.asSpace(0));
                if (botStarsController.hasTransactions(this.bot_id, 1)) {
                    this.items.add(UItem.asSpace(1));
                }
                if (botStarsController.hasTransactions(this.bot_id, 2)) {
                    this.items.add(UItem.asSpace(2));
                }
            }

            @Override
            public int getItemCount() {
                return this.items.size();
            }

            @Override
            public View createView(int i) {
                return new Page(this.context, this.bot_id, i, this.currentAccount, this.classGuid, this.resourcesProvider);
            }

            @Override
            public int getItemViewType(int i) {
                if (i < 0 || i >= this.items.size()) {
                    return 0;
                }
                return this.items.get(i).intValue;
            }

            @Override
            public String getItemTitle(int i) {
                int itemViewType = getItemViewType(i);
                if (itemViewType == 0) {
                    return LocaleController.getString(R.string.StarsTransactionsAll);
                }
                if (itemViewType != 1) {
                    return itemViewType != 2 ? "" : LocaleController.getString(R.string.StarsTransactionsOutgoing);
                }
                return LocaleController.getString(R.string.StarsTransactionsIncoming);
            }
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.starTransactionsLoaded) {
                this.adapter.fill();
                this.viewPager.fillTabs(true);
            }
        }

        public StarsTransactionsLayout(Context context, int i, long j, int i2, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.currentAccount = i;
            setOrientation(1);
            ViewPagerFixed viewPagerFixed = new ViewPagerFixed(context);
            this.viewPager = viewPagerFixed;
            PageAdapter pageAdapter = new PageAdapter(context, i, j, i2, resourcesProvider);
            this.adapter = pageAdapter;
            viewPagerFixed.setAdapter(pageAdapter);
            ViewPagerFixed.TabsView createTabsView = viewPagerFixed.createTabsView(true, 3);
            this.tabsView = createTabsView;
            View view = new View(context);
            view.setBackgroundColor(Theme.getColor(Theme.key_divider, resourcesProvider));
            addView(createTabsView, LayoutHelper.createLinear(-1, 48));
            addView(view, LayoutHelper.createLinear(-1.0f, 1.0f / AndroidUtilities.density));
            addView(viewPagerFixed, LayoutHelper.createLinear(-1, -1));
            setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
        }

        @Override
        protected void onAttachedToWindow() {
            this.adapter.fill();
            this.viewPager.fillTabs(false);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
            super.onAttachedToWindow();
        }

        @Override
        protected void onDetachedFromWindow() {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
            super.onDetachedFromWindow();
        }

        public RecyclerListView getCurrentListView() {
            View currentView = this.viewPager.getCurrentView();
            if (currentView instanceof Page) {
                return ((Page) currentView).listView;
            }
            return null;
        }

        public static class Page extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
            private final long bot_id;
            private final int currentAccount;
            private final UniversalRecyclerView listView;
            private final Runnable loadTransactionsRunnable;
            private final Theme.ResourcesProvider resourcesProvider;
            private final int type;

            public Page(Context context, final long j, final int i, final int i2, int i3, Theme.ResourcesProvider resourcesProvider) {
                super(context);
                this.type = i;
                this.currentAccount = i2;
                this.bot_id = j;
                this.resourcesProvider = resourcesProvider;
                this.loadTransactionsRunnable = new Runnable() {
                    @Override
                    public final void run() {
                        StarsIntroActivity.StarsTransactionsLayout.Page.lambda$new$0(j, i2, i);
                    }
                };
                UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, i2, i3, true, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        StarsIntroActivity.StarsTransactionsLayout.Page.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                    }
                }, new Utilities.Callback5() {
                    @Override
                    public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                        StarsIntroActivity.StarsTransactionsLayout.Page.this.onClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
                    }
                }, null, resourcesProvider);
                this.listView = universalRecyclerView;
                addView(universalRecyclerView, LayoutHelper.createFrame(-1, -1.0f));
                universalRecyclerView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                    @Override
                    public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
                        Page.this.scheduleLoadTransactions();
                    }
                });
            }

            public static void lambda$new$0(long j, int i, int i2) {
                if (j != 0) {
                    BotStarsController.getInstance(i).loadTransactions(j, i2);
                } else {
                    StarsController.getInstance(i).loadTransactions(i2);
                }
            }

            public void scheduleLoadTransactions() {
                if (this.listView.canScrollVertically(1)) {
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(this.loadTransactionsRunnable);
                AndroidUtilities.runOnUIThread(this.loadTransactionsRunnable, 250L);
            }

            @Override
            public void didReceivedNotification(int i, int i2, Object... objArr) {
                if (i == NotificationCenter.starTransactionsLoaded) {
                    this.listView.adapter.update(true);
                } else if (i == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.bot_id) {
                    this.listView.adapter.update(true);
                }
            }

            @Override
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                if (this.bot_id != 0) {
                    NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
                } else {
                    NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
                }
                this.listView.adapter.update(false);
            }

            @Override
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                if (this.bot_id != 0) {
                    NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
                } else {
                    NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
                }
            }

            public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
                if (this.bot_id != 0) {
                    BotStarsController botStarsController = BotStarsController.getInstance(this.currentAccount);
                    Iterator<TLRPC$StarsTransaction> it = botStarsController.getTransactions(this.bot_id, this.type).iterator();
                    while (it.hasNext()) {
                        arrayList.add(StarsTransactionView.Factory.asTransaction(it.next(), true));
                    }
                    if (botStarsController.didFullyLoadTransactions(this.bot_id, this.type)) {
                        return;
                    }
                    arrayList.add(UItem.asFlicker(arrayList.size(), 7));
                    arrayList.add(UItem.asFlicker(arrayList.size(), 7));
                    arrayList.add(UItem.asFlicker(arrayList.size(), 7));
                    return;
                }
                StarsController starsController = StarsController.getInstance(this.currentAccount);
                Iterator<TLRPC$StarsTransaction> it2 = starsController.transactions[this.type].iterator();
                while (it2.hasNext()) {
                    arrayList.add(StarsTransactionView.Factory.asTransaction(it2.next(), false));
                }
                if (starsController.didFullyLoadTransactions(this.type)) {
                    return;
                }
                arrayList.add(UItem.asFlicker(arrayList.size(), 7));
                arrayList.add(UItem.asFlicker(arrayList.size(), 7));
                arrayList.add(UItem.asFlicker(arrayList.size(), 7));
            }

            public void onClick(UItem uItem, View view, int i, float f, float f2) {
                if (uItem.object instanceof TLRPC$StarsTransaction) {
                    StarsIntroActivity.showTransactionSheet(getContext(), this.currentAccount, (TLRPC$StarsTransaction) uItem.object, this.resourcesProvider);
                }
            }
        }
    }

    public static class StarsTransactionView extends LinearLayout {
        public static HashMap<String, Drawable> cachedPlatformDrawables;
        private final TextView amountTextView;
        private final AvatarDrawable avatarDrawable;
        private final int currentAccount;
        private final TextView dateTextView;
        private final BackupImageView imageView;
        private boolean needDivider;
        private final SpannableString star;
        private final TextView subtitleTextView;
        private final LinearLayout textLayout;
        private boolean threeLines;
        private final TextView titleTextView;
        private final LinearLayout.LayoutParams titleTextViewParams;

        public StarsTransactionView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.currentAccount = i;
            setOrientation(0);
            this.avatarDrawable = new AvatarDrawable();
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(46.0f));
            addView(backupImageView, LayoutHelper.createLinear(46, 46, 16, 13, 0, 13, 0));
            LinearLayout linearLayout = new LinearLayout(context);
            this.textLayout = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setGravity(19);
            addView(linearLayout, LayoutHelper.createLinear(-2, -1, 119));
            TextView textView = new TextView(context);
            this.titleTextView = textView;
            textView.setTypeface(AndroidUtilities.bold());
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i2, resourcesProvider));
            textView.setTextSize(1, 16.0f);
            LinearLayout.LayoutParams createLinear = LayoutHelper.createLinear(-2, -2, 0.0f, 0.0f, 0.0f, 4.33f);
            this.titleTextViewParams = createLinear;
            linearLayout.addView(textView, createLinear);
            TextView textView2 = new TextView(context);
            this.subtitleTextView = textView2;
            textView2.setTextColor(Theme.getColor(i2, resourcesProvider));
            textView2.setTextSize(1, 13.0f);
            linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 0.0f, 0.0f, 0.0f, 0.33f));
            TextView textView3 = new TextView(context);
            this.dateTextView = textView3;
            textView3.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            textView3.setTextSize(1, 14.0f);
            linearLayout.addView(textView3, LayoutHelper.createLinear(-2, -2));
            TextView textView4 = new TextView(context);
            this.amountTextView = textView4;
            textView4.setTypeface(AndroidUtilities.bold());
            textView4.setTextSize(1, 15.3f);
            textView4.setGravity(5);
            addView(textView4, LayoutHelper.createLinear(-1, -2, 21, 0, 0, 20, 0));
            SpannableString spannableString = new SpannableString("⭐️");
            this.star = spannableString;
            Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
            mutate.setBounds(0, 0, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f));
            spannableString.setSpan(new ImageSpan(mutate), 0, spannableString.length(), 33);
        }

        public static Drawable getPlatformDrawable(String str) {
            if (cachedPlatformDrawables == null) {
                cachedPlatformDrawables = new HashMap<>();
            }
            Drawable drawable = cachedPlatformDrawables.get(str);
            if (drawable != null) {
                return drawable;
            }
            HashMap<String, Drawable> hashMap = cachedPlatformDrawables;
            Drawable createDrawable = SessionCell.createDrawable(44, str);
            hashMap.put(str, createDrawable);
            return createDrawable;
        }

        public void set(TLRPC$StarsTransaction tLRPC$StarsTransaction, boolean z, boolean z2) {
            String str;
            long peerDialogId = DialogObject.getPeerDialogId(tLRPC$StarsTransaction.peer.peer);
            boolean z3 = peerDialogId != 0;
            this.threeLines = z3;
            this.titleTextViewParams.bottomMargin = z3 ? 0 : AndroidUtilities.dp(4.33f);
            this.subtitleTextView.setVisibility(this.threeLines ? 0 : 8);
            this.dateTextView.setTextSize(1, this.threeLines ? 13.0f : 14.0f);
            this.dateTextView.setText(LocaleController.formatShortDateTime(tLRPC$StarsTransaction.date));
            if (tLRPC$StarsTransaction.refund) {
                TextView textView = this.dateTextView;
                textView.setText(TextUtils.concat(textView.getText(), " — ", LocaleController.getString(R.string.StarsRefunded)));
            } else if (tLRPC$StarsTransaction.failed) {
                TextView textView2 = this.dateTextView;
                textView2.setText(TextUtils.concat(textView2.getText(), " — ", LocaleController.getString(R.string.StarsFailed)));
            } else if (tLRPC$StarsTransaction.pending) {
                TextView textView3 = this.dateTextView;
                textView3.setText(TextUtils.concat(textView3.getText(), " — ", LocaleController.getString(R.string.StarsPending)));
            }
            if (peerDialogId != 0) {
                if (peerDialogId >= 0) {
                    TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                    if (tLRPC$StarsTransaction.photo == null) {
                        this.avatarDrawable.setInfo(user);
                        this.imageView.setForUserOrChat(user, this.avatarDrawable);
                    }
                    str = UserObject.getUserName(user);
                } else {
                    TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerDialogId));
                    if (tLRPC$StarsTransaction.photo == null) {
                        this.avatarDrawable.setInfo(chat);
                        this.imageView.setForUserOrChat(chat, this.avatarDrawable);
                    }
                    str = chat == null ? "" : chat.title;
                }
                TextView textView4 = this.titleTextView;
                String str2 = tLRPC$StarsTransaction.title;
                textView4.setText(str2 != null ? str2 : "");
                this.subtitleTextView.setText(str);
                TLRPC$WebDocument tLRPC$WebDocument = tLRPC$StarsTransaction.photo;
                if (tLRPC$WebDocument != null) {
                    this.imageView.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(tLRPC$WebDocument)), "46_46", (Drawable) null, 0, (Object) null);
                }
            } else {
                TLRPC$StarsTransactionPeer tLRPC$StarsTransactionPeer = tLRPC$StarsTransaction.peer;
                if (tLRPC$StarsTransactionPeer instanceof TLRPC$TL_starsTransactionPeerAppStore) {
                    this.titleTextView.setText(LocaleController.getString(R.string.StarsTransactionInApp));
                    this.imageView.setImageDrawable(getPlatformDrawable("ios"));
                } else if (tLRPC$StarsTransactionPeer instanceof TLRPC$TL_starsTransactionPeerPlayMarket) {
                    this.titleTextView.setText(LocaleController.getString(R.string.StarsTransactionInApp));
                    this.imageView.setImageDrawable(getPlatformDrawable("android"));
                } else if (tLRPC$StarsTransactionPeer instanceof TLRPC$TL_starsTransactionPeerFragment) {
                    this.titleTextView.setText(LocaleController.getString(z ? R.string.StarsTransactionWithdrawFragment : R.string.StarsTransactionFragment));
                    this.imageView.setImageDrawable(getPlatformDrawable("fragment"));
                } else if (tLRPC$StarsTransactionPeer instanceof TLRPC$TL_starsTransactionPeerPremiumBot) {
                    this.titleTextView.setText(LocaleController.getString(R.string.StarsTransactionBot));
                    this.imageView.setImageDrawable(getPlatformDrawable("premiumbot"));
                } else if (tLRPC$StarsTransactionPeer instanceof TLRPC$TL_starsTransactionPeerUnsupported) {
                    this.titleTextView.setText(LocaleController.getString(R.string.StarsTransactionUnsupported));
                    this.imageView.setImageDrawable(getPlatformDrawable("?"));
                } else {
                    this.titleTextView.setText("");
                    this.imageView.setImageDrawable(null);
                }
            }
            long j = tLRPC$StarsTransaction.stars;
            if (j > 0) {
                this.amountTextView.setVisibility(0);
                this.amountTextView.setTextColor(Theme.getColor(Theme.key_color_green));
                this.amountTextView.setText(TextUtils.concat("+", LocaleController.formatNumber(tLRPC$StarsTransaction.stars, ' '), " ", this.star));
            } else if (j < 0) {
                this.amountTextView.setVisibility(0);
                this.amountTextView.setTextColor(Theme.getColor(Theme.key_color_red));
                this.amountTextView.setText(TextUtils.concat("-", LocaleController.formatNumber(-tLRPC$StarsTransaction.stars, ' '), " ", this.star));
            } else {
                this.amountTextView.setVisibility(8);
            }
            this.needDivider = z2;
            setWillNotDraw(!z2);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.needDivider) {
                canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(72.0f) : 0), getMeasuredHeight(), Theme.dividerPaint);
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.threeLines ? 71.0f : 58.0f), 1073741824));
        }

        public static class Factory extends UItem.UItemFactory<StarsTransactionView> {
            @Override
            public StarsTransactionView createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                StarsTransactionView cached = getCached();
                return cached != null ? cached : new StarsTransactionView(context, i, resourcesProvider);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z) {
                ((StarsTransactionView) view).set((TLRPC$StarsTransaction) uItem.object, uItem.accent, z);
            }

            public static UItem asTransaction(TLRPC$StarsTransaction tLRPC$StarsTransaction, boolean z) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.object = tLRPC$StarsTransaction;
                ofFactory.accent = z;
                return ofFactory;
            }
        }
    }

    public static BottomSheet openConfirmPurchaseSheet(Context context, Theme.ResourcesProvider resourcesProvider, int i, long j, String str, long j2, TLRPC$WebDocument tLRPC$WebDocument, final Utilities.Callback<Utilities.Callback<Boolean>> callback, final Runnable runnable) {
        BottomSheet.Builder builder = new BottomSheet.Builder(context, false, resourcesProvider);
        TLRPC$User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(makeParticlesView(context, 40, 0), LayoutHelper.createFrame(-1, -1.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        if (tLRPC$WebDocument == null) {
            backupImageView.setRoundRadius(AndroidUtilities.dp(80.0f));
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setInfo(user);
            backupImageView.setForUserOrChat(user, avatarDrawable);
        } else {
            backupImageView.setRoundRadius(AndroidUtilities.dp(80.0f));
            backupImageView.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(tLRPC$WebDocument)), "80_80", (Drawable) null, 0, (Object) null);
        }
        frameLayout.addView(backupImageView, LayoutHelper.createFrame(80, 80, 17));
        final StarsBalanceView starsBalanceView = new StarsBalanceView(context, i);
        ScaleStateListAnimator.apply(starsBalanceView);
        starsBalanceView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StarsIntroActivity.lambda$openConfirmPurchaseSheet$3(StarsIntroActivity.StarsBalanceView.this, view);
            }
        });
        frameLayout.addView(starsBalanceView, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, 117, 7));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i2 = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView.setText(LocaleController.getString(R.string.StarsConfirmPurchaseTitle));
        textView.setGravity(17);
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 8, 0, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(Theme.getColor(i2, resourcesProvider));
        int i3 = (int) j2;
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmPurchaseText", i3, str, UserObject.getUserName(user))));
        textView2.setMaxWidth(HintView2.cutInFancyHalf(textView2.getText(), textView2.getPaint()));
        textView2.setGravity(17);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 0, 6, 0, 24));
        final ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        buttonWithCounterView.setText(replaceStars(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmPurchaseButton", i3))), false);
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f));
        builder.setCustomView(linearLayout);
        final BottomSheet create = builder.create();
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StarsIntroActivity.lambda$openConfirmPurchaseSheet$6(Utilities.Callback.this, create, buttonWithCounterView, view);
            }
        });
        create.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                StarsIntroActivity.lambda$openConfirmPurchaseSheet$7(runnable, dialogInterface);
            }
        });
        create.fixNavigationBar();
        create.show();
        return create;
    }

    public static void lambda$openConfirmPurchaseSheet$3(StarsBalanceView starsBalanceView, View view) {
        BaseFragment lastFragment;
        if (starsBalanceView.lastBalance > 0 && (lastFragment = LaunchActivity.getLastFragment()) != null) {
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            bottomSheetParams.allowNestedScroll = false;
            lastFragment.showAsSheet(new StarsIntroActivity(), bottomSheetParams);
        }
    }

    public static void lambda$openConfirmPurchaseSheet$6(Utilities.Callback callback, final BottomSheet bottomSheet, final ButtonWithCounterView buttonWithCounterView, View view) {
        if (callback != null) {
            bottomSheet.setCanDismissWithSwipe(false);
            buttonWithCounterView.setLoading(true);
            callback.run(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    StarsIntroActivity.lambda$openConfirmPurchaseSheet$5(BottomSheet.this, buttonWithCounterView, (Boolean) obj);
                }
            });
            return;
        }
        bottomSheet.dismiss();
    }

    public static void lambda$openConfirmPurchaseSheet$5(final BottomSheet bottomSheet, final ButtonWithCounterView buttonWithCounterView, Boolean bool) {
        if (bool.booleanValue()) {
            bottomSheet.dismiss();
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StarsIntroActivity.lambda$openConfirmPurchaseSheet$4(BottomSheet.this, buttonWithCounterView);
                }
            }, 400L);
        }
    }

    public static void lambda$openConfirmPurchaseSheet$4(BottomSheet bottomSheet, ButtonWithCounterView buttonWithCounterView) {
        bottomSheet.setCanDismissWithSwipe(false);
        buttonWithCounterView.setLoading(false);
    }

    public static void lambda$openConfirmPurchaseSheet$7(Runnable runnable, DialogInterface dialogInterface) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static class StarsNeededSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
        private UniversalAdapter adapter;
        private boolean expanded;
        private final FireworksOverlay fireworksOverlay;
        private final FrameLayout footerView;
        private final HeaderView headerView;
        private final long starsNeeded;
        private Runnable whenPurchased;

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            Runnable runnable;
            if (i == NotificationCenter.starOptionsLoaded || i == NotificationCenter.starBalanceUpdated) {
                UniversalAdapter universalAdapter = this.adapter;
                if (universalAdapter != null) {
                    universalAdapter.update(true);
                }
                long balance = StarsController.getInstance(this.currentAccount).getBalance();
                this.headerView.titleView.setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (this.starsNeeded - balance)));
                ActionBar actionBar = this.actionBar;
                if (actionBar != null) {
                    actionBar.setTitle(getTitle());
                }
                if (balance < this.starsNeeded || (runnable = this.whenPurchased) == null) {
                    return;
                }
                runnable.run();
                this.whenPurchased = null;
                dismiss();
            }
        }

        @Override
        public void show() {
            BaseFragment lastFragment = LaunchActivity.getLastFragment();
            if (lastFragment instanceof ChatActivity) {
                ChatActivity chatActivity = (ChatActivity) lastFragment;
                if (chatActivity.isKeyboardVisible() && chatActivity.getChatActivityEnterView() != null) {
                    chatActivity.getChatActivityEnterView().closeKeyboard();
                }
            }
            super.show();
        }

        @Override
        public void dismissInternal() {
            super.dismissInternal();
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        }

        public StarsNeededSheet(Context context, Theme.ResourcesProvider resourcesProvider, long j, String str, Runnable runnable) {
            super(context, null, false, false, false, resourcesProvider);
            this.topPadding = 0.2f;
            this.whenPurchased = runnable;
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
            fixNavigationBar();
            RecyclerListView recyclerListView = this.recyclerListView;
            int i = this.backgroundPaddingLeft;
            recyclerListView.setPadding(i, 0, i, 0);
            this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(View view, int i2) {
                    StarsIntroActivity.StarsNeededSheet.this.lambda$new$0(view, i2);
                }
            });
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.setSupportsChangeAnimations(false);
            defaultItemAnimator.setDelayAnimations(false);
            defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            defaultItemAnimator.setDurations(350L);
            this.recyclerListView.setItemAnimator(defaultItemAnimator);
            setBackgroundColor(Theme.getColor(Theme.key_dialogBackgroundGray, resourcesProvider));
            this.starsNeeded = j;
            HeaderView headerView = new HeaderView(context, this.currentAccount, resourcesProvider);
            this.headerView = headerView;
            headerView.titleView.setText(LocaleController.formatPluralString("StarsNeededTitle", (int) (j - StarsController.getInstance(this.currentAccount).getBalance()), new Object[0]));
            headerView.subtitleView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsNeededText, str)));
            TextView textView = headerView.subtitleView;
            textView.setMaxWidth(HintView2.cutInFancyHalf(textView.getText(), headerView.subtitleView.getPaint()));
            this.actionBar.setTitle(getTitle());
            FrameLayout frameLayout = new FrameLayout(context);
            this.footerView = frameLayout;
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
            frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
            linksTextView.setTextSize(1, 12.0f);
            linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4, resourcesProvider));
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
            linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable() {
                @Override
                public final void run() {
                    StarsIntroActivity.StarsNeededSheet.this.lambda$new$1();
                }
            }));
            linksTextView.setGravity(17);
            linksTextView.setMaxWidth(HintView2.cutInFancyHalf(linksTextView.getText(), linksTextView.getPaint()));
            frameLayout.addView(linksTextView, LayoutHelper.createFrame(-2, -1, 17));
            frameLayout.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
            FireworksOverlay fireworksOverlay = new FireworksOverlay(getContext());
            this.fireworksOverlay = fireworksOverlay;
            this.containerView.addView(fireworksOverlay, LayoutHelper.createFrame(-1, -1.0f));
            UniversalAdapter universalAdapter = this.adapter;
            if (universalAdapter != null) {
                universalAdapter.update(false);
            }
        }

        public void lambda$new$0(View view, int i) {
            UItem item;
            UniversalAdapter universalAdapter = this.adapter;
            if (universalAdapter == null || (item = universalAdapter.getItem(i - 1)) == null) {
                return;
            }
            onItemClick(item, this.adapter);
        }

        public void lambda$new$1() {
            Browser.openUrl(getContext(), LocaleController.getString(R.string.StarsTOSLink));
        }

        @Override
        protected CharSequence getTitle() {
            HeaderView headerView = this.headerView;
            if (headerView == null) {
                return null;
            }
            return headerView.titleView.getText();
        }

        @Override
        protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
            UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    StarsIntroActivity.StarsNeededSheet.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, this.resourcesProvider);
            this.adapter = universalAdapter;
            return universalAdapter;
        }

        public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
            arrayList.add(UItem.asCustom(this.headerView));
            arrayList.add(UItem.asHeader(LocaleController.getString(R.string.TelegramStarsChoose)));
            ArrayList<TLRPC$TL_starsTopupOption> options = StarsController.getInstance(this.currentAccount).getOptions();
            if (options != null && !options.isEmpty()) {
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 1;
                for (int i5 = 0; i5 < options.size(); i5++) {
                    TLRPC$TL_starsTopupOption tLRPC$TL_starsTopupOption = options.get(i5);
                    if (tLRPC$TL_starsTopupOption.stars >= this.starsNeeded) {
                        if (!tLRPC$TL_starsTopupOption.collapsed || this.expanded) {
                            arrayList.add(StarTierView.Factory.asStarTier(i5, i4, tLRPC$TL_starsTopupOption));
                            i2++;
                            i4++;
                        } else {
                            i3++;
                        }
                    }
                }
                if (i2 > 0) {
                    boolean z = this.expanded;
                    if (!z && i3 > 0) {
                        arrayList.add(ExpandView.Factory.asExpand(-1, LocaleController.getString(z ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions), true ^ this.expanded).accent());
                    }
                } else {
                    while (i < options.size()) {
                        arrayList.add(StarTierView.Factory.asStarTier(i, i4, options.get(i)));
                        i++;
                        i4++;
                    }
                }
            } else {
                arrayList.add(UItem.asFlicker(31));
                arrayList.add(UItem.asFlicker(31));
                arrayList.add(UItem.asFlicker(31));
            }
            arrayList.add(UItem.asCustom(this.footerView));
        }

        public void onItemClick(final UItem uItem, UniversalAdapter universalAdapter) {
            if (uItem.id == -1) {
                this.expanded = !this.expanded;
                universalAdapter.update(true);
            } else if (uItem.instanceOf(StarTierView.Factory.class) && (uItem.object instanceof TLRPC$TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.instance;
                }
                if (findActivity == null) {
                    return;
                }
                StarsController.getInstance(this.currentAccount).buy(findActivity, (TLRPC$TL_starsTopupOption) uItem.object, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        StarsIntroActivity.StarsNeededSheet.this.lambda$onItemClick$2(uItem, (Boolean) obj, (String) obj2);
                    }
                });
            }
        }

        public void lambda$onItemClick$2(UItem uItem, Boolean bool, String str) {
            if (getContext() == null) {
                return;
            }
            if (bool.booleanValue()) {
                BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).createSimpleBulletin(getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) uItem.longValue, new Object[0]))).show();
                this.fireworksOverlay.start(true);
                StarsController.getInstance(this.currentAccount).invalidateTransactions(true);
            } else if (str != null) {
                BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str)).show();
            }
        }

        @Override
        public void dismiss() {
            super.dismiss();
            HeaderView headerView = this.headerView;
            if (headerView != null) {
                headerView.iconView.setPaused(true);
            }
        }

        public static class HeaderView extends LinearLayout {
            public final StarsBalanceView balanceView;
            public final GLIconTextureView iconView;
            public final StarParticlesView particlesView;
            public final TextView subtitleView;
            public final TextView titleView;
            private final FrameLayout topView;

            public HeaderView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                this.topView = frameLayout;
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                StarParticlesView makeParticlesView = StarsIntroActivity.makeParticlesView(context, 70, 0);
                this.particlesView = makeParticlesView;
                frameLayout.addView(makeParticlesView, LayoutHelper.createFrame(-1, -1.0f));
                GLIconTextureView gLIconTextureView = new GLIconTextureView(context, 1, 2);
                this.iconView = gLIconTextureView;
                GLIconRenderer gLIconRenderer = gLIconTextureView.mRenderer;
                gLIconRenderer.colorKey1 = Theme.key_starsGradient1;
                gLIconRenderer.colorKey2 = Theme.key_starsGradient2;
                gLIconRenderer.updateColors();
                gLIconTextureView.setStarParticlesView(makeParticlesView);
                frameLayout.addView(gLIconTextureView, LayoutHelper.createFrame(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                gLIconTextureView.setPaused(false);
                StarsBalanceView starsBalanceView = new StarsBalanceView(context, i);
                this.balanceView = starsBalanceView;
                ScaleStateListAnimator.apply(starsBalanceView);
                starsBalanceView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        StarsIntroActivity.StarsNeededSheet.HeaderView.this.lambda$new$0(view);
                    }
                });
                frameLayout.addView(starsBalanceView, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
                addView(frameLayout, LayoutHelper.createFrame(-1, 150.0f));
                TextView textView = new TextView(context);
                this.titleView = textView;
                textView.setTextSize(1, 20.0f);
                textView.setTypeface(AndroidUtilities.bold());
                int i2 = Theme.key_dialogTextBlack;
                textView.setTextColor(Theme.getColor(i2, resourcesProvider));
                textView.setGravity(17);
                addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 2, 0, 0));
                TextView textView2 = new TextView(context);
                this.subtitleView = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(Theme.getColor(i2, resourcesProvider));
                textView2.setGravity(17);
                addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 0, 9, 0, 18));
            }

            public void lambda$new$0(View view) {
                BaseFragment lastFragment;
                if (this.balanceView.lastBalance > 0 && (lastFragment = LaunchActivity.getLastFragment()) != null) {
                    BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                    bottomSheetParams.transitionFromLeft = true;
                    bottomSheetParams.allowNestedScroll = false;
                    lastFragment.showAsSheet(new StarsIntroActivity(), bottomSheetParams);
                }
            }
        }
    }

    public static SpannableStringBuilder replaceStars(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof SpannableStringBuilder)) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_premium_liststar);
        coloredImageSpan.setScale(1.13f, 1.13f);
        spannableString.setSpan(coloredImageSpan, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder replaceStars(CharSequence charSequence, ColoredImageSpan[] coloredImageSpanArr) {
        SpannableStringBuilder spannableStringBuilder;
        ColoredImageSpan coloredImageSpan;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof SpannableStringBuilder)) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        }
        if (coloredImageSpanArr != null && coloredImageSpanArr[0] != null) {
            coloredImageSpan = coloredImageSpanArr[0];
        } else {
            coloredImageSpan = new ColoredImageSpan(R.drawable.msg_premium_liststar);
            coloredImageSpan.setScale(1.13f, 1.13f);
        }
        if (coloredImageSpanArr != null) {
            coloredImageSpanArr[0] = coloredImageSpan;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(coloredImageSpan, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder replaceStarsWithPlain(CharSequence charSequence, float f) {
        SpannableStringBuilder spannableStringBuilder;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof SpannableStringBuilder)) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.star_small_inner);
        coloredImageSpan.recolorDrawable = false;
        coloredImageSpan.setScale(f, f);
        spannableString.setSpan(coloredImageSpan, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static CharSequence getTransactionTitle(TLRPC$StarsTransaction tLRPC$StarsTransaction) {
        String str = tLRPC$StarsTransaction.title;
        if (str != null) {
            return str;
        }
        long peerDialogId = DialogObject.getPeerDialogId(tLRPC$StarsTransaction.peer.peer);
        if (peerDialogId != 0) {
            if (peerDialogId >= 0) {
                return UserObject.getUserName(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(peerDialogId)));
            }
            TLRPC$Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-peerDialogId));
            return chat == null ? "" : chat.title;
        }
        TLRPC$StarsTransactionPeer tLRPC$StarsTransactionPeer = tLRPC$StarsTransaction.peer;
        if (tLRPC$StarsTransactionPeer instanceof TLRPC$TL_starsTransactionPeerFragment) {
            return LocaleController.getString(R.string.StarsTransactionFragment);
        }
        if (tLRPC$StarsTransactionPeer instanceof TLRPC$TL_starsTransactionPeerPremiumBot) {
            return LocaleController.getString(R.string.StarsTransactionBot);
        }
        return LocaleController.getString(R.string.StarsTransactionUnsupported);
    }

    public static BottomSheet showTransactionSheet(Context context, int i, TLRPC$TL_payments_paymentReceiptStars tLRPC$TL_payments_paymentReceiptStars, Theme.ResourcesProvider resourcesProvider) {
        TLRPC$StarsTransaction tLRPC$StarsTransaction = new TLRPC$StarsTransaction();
        tLRPC$StarsTransaction.title = tLRPC$TL_payments_paymentReceiptStars.title;
        tLRPC$StarsTransaction.description = tLRPC$TL_payments_paymentReceiptStars.description;
        tLRPC$StarsTransaction.photo = tLRPC$TL_payments_paymentReceiptStars.photo;
        TLRPC$TL_starsTransactionPeer tLRPC$TL_starsTransactionPeer = new TLRPC$TL_starsTransactionPeer();
        tLRPC$StarsTransaction.peer = tLRPC$TL_starsTransactionPeer;
        tLRPC$TL_starsTransactionPeer.peer = MessagesController.getInstance(i).getPeer(tLRPC$TL_payments_paymentReceiptStars.bot_id);
        tLRPC$StarsTransaction.date = tLRPC$TL_payments_paymentReceiptStars.date;
        tLRPC$StarsTransaction.stars = tLRPC$TL_payments_paymentReceiptStars.total_amount;
        tLRPC$StarsTransaction.id = tLRPC$TL_payments_paymentReceiptStars.transaction_id;
        return showTransactionSheet(context, i, tLRPC$StarsTransaction, resourcesProvider);
    }

    public static BottomSheet showTransactionSheet(final Context context, int i, final TLRPC$StarsTransaction tLRPC$StarsTransaction, final Theme.ResourcesProvider resourcesProvider) {
        String str;
        char c;
        String str2;
        if (tLRPC$StarsTransaction == null || context == null) {
            return null;
        }
        BottomSheet.Builder builder = new BottomSheet.Builder(context, false, resourcesProvider);
        final BottomSheet[] bottomSheetArr = new BottomSheet[1];
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        TLRPC$StarsTransactionPeer tLRPC$StarsTransactionPeer = tLRPC$StarsTransaction.peer;
        if (tLRPC$StarsTransactionPeer instanceof TLRPC$TL_starsTransactionPeer) {
            if (tLRPC$StarsTransaction.photo != null) {
                backupImageView.setRoundRadius(AndroidUtilities.dp(50.0f));
                backupImageView.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(tLRPC$StarsTransaction.photo)), "100_100", (Drawable) null, 0, (Object) null);
            } else {
                backupImageView.setRoundRadius(AndroidUtilities.dp(50.0f));
                long peerDialogId = DialogObject.getPeerDialogId(tLRPC$StarsTransaction.peer.peer);
                AvatarDrawable avatarDrawable = new AvatarDrawable();
                if (peerDialogId >= 0) {
                    TLRPC$User user = MessagesController.getInstance(i).getUser(Long.valueOf(peerDialogId));
                    avatarDrawable.setInfo(user);
                    backupImageView.setForUserOrChat(user, avatarDrawable);
                } else {
                    TLRPC$Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(peerDialogId));
                    avatarDrawable.setInfo(chat);
                    backupImageView.setForUserOrChat(chat, avatarDrawable);
                }
            }
            linearLayout.addView(backupImageView, LayoutHelper.createLinear(100, 100, 17, 0, 0, 0, 10));
        } else {
            if (tLRPC$StarsTransactionPeer instanceof TLRPC$TL_starsTransactionPeerAppStore) {
                str = "ios";
            } else if (tLRPC$StarsTransactionPeer instanceof TLRPC$TL_starsTransactionPeerPlayMarket) {
                str = "android";
            } else if (tLRPC$StarsTransactionPeer instanceof TLRPC$TL_starsTransactionPeerPremiumBot) {
                str = "premiumbot";
            } else {
                str = tLRPC$StarsTransactionPeer instanceof TLRPC$TL_starsTransactionPeerFragment ? "fragment" : "?";
            }
            CombinedDrawable combinedDrawable = (CombinedDrawable) SessionCell.createDrawable(100, str);
            combinedDrawable.setIconSize(AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
            backupImageView.setImageDrawable(combinedDrawable);
        }
        TextView textView = new TextView(context);
        int i2 = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(getTransactionTitle(tLRPC$StarsTransaction));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4));
        TextView textView2 = new TextView(context);
        textView2.setTextColor(Theme.getColor(tLRPC$StarsTransaction.stars >= 0 ? Theme.key_color_green : Theme.key_color_red, resourcesProvider));
        textView2.setTextSize(1, 18.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(17);
        StringBuilder sb = new StringBuilder();
        sb.append(tLRPC$StarsTransaction.stars >= 0 ? "+" : "-");
        sb.append(LocaleController.formatNumber((int) Math.abs(tLRPC$StarsTransaction.stars), ' '));
        sb.append("\u2009⭐️");
        textView2.setText(replaceStarsWithPlain(sb.toString(), 0.8f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textView2.getText());
        if (tLRPC$StarsTransaction.refund) {
            appendStatus(spannableStringBuilder, textView2, LocaleController.getString(R.string.StarsRefunded));
        } else if (tLRPC$StarsTransaction.failed) {
            textView2.setTextColor(Theme.getColor(Theme.key_color_red, resourcesProvider));
            appendStatus(spannableStringBuilder, textView2, LocaleController.getString(R.string.StarsFailed));
        } else if (tLRPC$StarsTransaction.pending) {
            textView2.setTextColor(Theme.getColor(Theme.key_color_yellow, resourcesProvider));
            appendStatus(spannableStringBuilder, textView2, LocaleController.getString(R.string.StarsPending));
        }
        textView2.setText(spannableStringBuilder);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4));
        if (tLRPC$StarsTransaction.description != null) {
            TextView textView3 = new TextView(context);
            textView3.setTextColor(Theme.getColor(i2, resourcesProvider));
            textView3.setTextSize(1, 16.0f);
            textView3.setGravity(17);
            textView3.setText(tLRPC$StarsTransaction.description);
            linearLayout.addView(textView3, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4));
        }
        TableView tableView = new TableView(context, resourcesProvider);
        TLRPC$StarsTransactionPeer tLRPC$StarsTransactionPeer2 = tLRPC$StarsTransaction.peer;
        if (tLRPC$StarsTransactionPeer2 instanceof TLRPC$TL_starsTransactionPeer) {
            final long peerDialogId2 = DialogObject.getPeerDialogId(tLRPC$StarsTransactionPeer2.peer);
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
            linksTextView.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
            linksTextView.setEllipsize(TextUtils.TruncateAt.END);
            int i3 = Theme.key_chat_messageLinkIn;
            linksTextView.setTextColor(Theme.getColor(i3, resourcesProvider));
            linksTextView.setLinkTextColor(Theme.getColor(i3, resourcesProvider));
            linksTextView.setTextSize(1, 14.0f);
            linksTextView.setDisablePaddingsOffsetY(true);
            AvatarSpan avatarSpan = new AvatarSpan(linksTextView, i, 24.0f);
            if (peerDialogId2 >= 0) {
                TLRPC$User user2 = MessagesController.getInstance(i).getUser(Long.valueOf(peerDialogId2));
                str2 = UserObject.getUserName(user2);
                avatarSpan.setUser(user2);
            } else {
                TLRPC$Chat chat2 = MessagesController.getInstance(i).getChat(Long.valueOf(-peerDialogId2));
                str2 = chat2 == null ? "" : chat2.title;
                avatarSpan.setChat(chat2);
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) str2));
            spannableStringBuilder2.setSpan(avatarSpan, 0, 1, 33);
            spannableStringBuilder2.setSpan(new ClickableSpan() {
                @Override
                public void onClick(View view) {
                    bottomSheetArr[0].dismiss();
                    BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                    if (safeLastFragment != null) {
                        safeLastFragment.presentFragment(ChatActivity.of(peerDialogId2));
                    }
                }

                @Override
                public void updateDrawState(TextPaint textPaint) {
                    textPaint.setUnderlineText(false);
                }
            }, 3, spannableStringBuilder2.length(), 33);
            linksTextView.setText(spannableStringBuilder2);
            tableView.addRowUnpadded(LocaleController.getString(R.string.StarsTransactionRecipient), linksTextView);
        } else if (tLRPC$StarsTransactionPeer2 instanceof TLRPC$TL_starsTransactionPeerFragment) {
            tableView.addRow(LocaleController.getString(R.string.StarsTransactionSource), LocaleController.getString(R.string.Fragment));
        } else if (tLRPC$StarsTransactionPeer2 instanceof TLRPC$TL_starsTransactionPeerAppStore) {
            tableView.addRow(LocaleController.getString(R.string.StarsTransactionSource), LocaleController.getString(R.string.AppStore));
        } else if (tLRPC$StarsTransactionPeer2 instanceof TLRPC$TL_starsTransactionPeerPlayMarket) {
            tableView.addRow(LocaleController.getString(R.string.StarsTransactionSource), LocaleController.getString(R.string.PlayMarket));
        } else if (tLRPC$StarsTransactionPeer2 instanceof TLRPC$TL_starsTransactionPeerPremiumBot) {
            tableView.addRow(LocaleController.getString(R.string.StarsTransactionSource), LocaleController.getString(R.string.StarsTransactionBot));
        }
        if (!TextUtils.isEmpty(tLRPC$StarsTransaction.id)) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
            TextView textView4 = new TextView(context);
            textView4.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
            textView4.setTextSize(1, 13.0f);
            textView4.setTextColor(Theme.getColor(i2, resourcesProvider));
            textView4.setMaxLines(4);
            textView4.setSingleLine(false);
            textView4.setText(tLRPC$StarsTransaction.id);
            frameLayout.addView(textView4, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.msg_copy);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i4 = Theme.key_windowBackgroundWhiteBlueIcon;
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i4, resourcesProvider), PorterDuff.Mode.SRC_IN));
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    StarsIntroActivity.lambda$showTransactionSheet$8(TLRPC$StarsTransaction.this, bottomSheetArr, resourcesProvider, view);
                }
            });
            ScaleStateListAnimator.apply(imageView);
            imageView.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(Theme.getColor(i4, resourcesProvider), 0.1f), 7));
            frameLayout.addView(imageView, LayoutHelper.createFrame(30, 30, 21));
            tableView.addRowUnpadded(LocaleController.getString(R.string.StarsTransactionID), frameLayout);
        }
        CharSequence string = LocaleController.getString(R.string.StarsTransactionDate);
        int i5 = R.string.formatDateAtTime;
        tableView.addRow(string, LocaleController.formatString(i5, LocaleController.getInstance().formatterGiveawayCard.format(new Date(tLRPC$StarsTransaction.date * 1000)), LocaleController.getInstance().formatterDay.format(new Date(tLRPC$StarsTransaction.date * 1000))));
        linearLayout.addView(tableView, LayoutHelper.createLinear(-1, -2, 0.0f, 17.0f, 0.0f, 0.0f));
        if ((tLRPC$StarsTransaction.flags & 32) != 0) {
            tableView.addRow(LocaleController.getString(R.string.StarsTransactionTONDate), LocaleController.formatString(i5, LocaleController.getInstance().formatterGiveawayCard.format(new Date(tLRPC$StarsTransaction.transaction_date * 1000)), LocaleController.getInstance().formatterDay.format(new Date(tLRPC$StarsTransaction.transaction_date * 1000))));
        }
        LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        linksTextView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
        linksTextView2.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
        linksTextView2.setTextSize(1, 14.0f);
        linksTextView2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() {
            @Override
            public final void run() {
                StarsIntroActivity.lambda$showTransactionSheet$9(context);
            }
        }));
        linksTextView2.setGravity(17);
        linearLayout.addView(linksTextView2, LayoutHelper.createLinear(-1, -2, 0.0f, 15.0f, 0.0f, 15.0f));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        if ((tLRPC$StarsTransaction.flags & 32) != 0) {
            c = 0;
            buttonWithCounterView.setText(LocaleController.getString(R.string.StarsTransactionViewInBlockchainExplorer), false);
        } else {
            c = 0;
            buttonWithCounterView.setText(LocaleController.getString(R.string.OK), false);
        }
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48));
        builder.setCustomView(linearLayout);
        bottomSheetArr[c] = builder.create();
        if ((tLRPC$StarsTransaction.flags & 32) != 0) {
            buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    StarsIntroActivity.lambda$showTransactionSheet$10(context, tLRPC$StarsTransaction, view);
                }
            });
        } else {
            buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    StarsIntroActivity.lambda$showTransactionSheet$11(bottomSheetArr, view);
                }
            });
        }
        bottomSheetArr[0].fixNavigationBar();
        bottomSheetArr[0].show();
        return bottomSheetArr[0];
    }

    public static void lambda$showTransactionSheet$8(TLRPC$StarsTransaction tLRPC$StarsTransaction, BottomSheet[] bottomSheetArr, Theme.ResourcesProvider resourcesProvider, View view) {
        AndroidUtilities.addToClipboard(tLRPC$StarsTransaction.id);
        BulletinFactory.of(bottomSheetArr[0].topBulletinContainer, resourcesProvider).createSimpleBulletin(R.raw.copy, LocaleController.getString(R.string.StarsTransactionIDCopied)).show(false);
    }

    public static void lambda$showTransactionSheet$9(Context context) {
        Browser.openUrl(context, LocaleController.getString(R.string.StarsTOSLink));
    }

    public static void lambda$showTransactionSheet$10(Context context, TLRPC$StarsTransaction tLRPC$StarsTransaction, View view) {
        Browser.openUrl(context, tLRPC$StarsTransaction.transaction_url);
    }

    public static void lambda$showTransactionSheet$11(BottomSheet[] bottomSheetArr, View view) {
        bottomSheetArr[0].dismiss();
    }

    private static CharSequence appendStatus(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ReplacementSpan(textView.getCurrentTextColor(), str) {
            private final Paint backgroundPaint;
            private final Text layout;
            final int val$color;
            final String val$string;

            {
                this.val$color = r3;
                this.val$string = str;
                Paint paint = new Paint(1);
                this.backgroundPaint = paint;
                paint.setColor(Theme.multAlpha(r3, 0.1f));
                this.layout = new Text(str, 13.0f, AndroidUtilities.bold());
            }

            @Override
            public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
                return (int) (AndroidUtilities.dp(12.0f) + this.layout.getCurrentWidth());
            }

            @Override
            public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f, (r12 - AndroidUtilities.dp(20.0f)) / 2.0f, AndroidUtilities.dp(12.0f) + f + this.layout.getCurrentWidth(), (AndroidUtilities.dp(20.0f) + r12) / 2.0f);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.backgroundPaint);
                this.layout.draw(canvas, f + AndroidUtilities.dp(6.0f), (i3 + i5) / 2.0f, this.val$color, 1.0f);
            }
        }, 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        return spannableStringBuilder;
    }
}
