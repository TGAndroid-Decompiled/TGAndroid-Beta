package org.telegram.ui.TON;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.zxing.qrcode.decoder.Version;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.AccountFrozenAlert;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.ColorPicker;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FireworksOverlay;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.GradientHeaderActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.QrActivity;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stars.BotStarsController;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.LivePlayer$1$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda17;
import org.telegram.ui.TopicsFragment$$ExternalSyntheticLambda9;
import org.telegram.ui.VoIPFragment$12$$ExternalSyntheticLambda0;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment;
import org.telegram.ui.iv.RichDetailsCell;
import org.telegram.ui.web.WebActionBar$$ExternalSyntheticLambda9;

public final class TONIntroActivity extends GradientHeaderActivity implements NotificationCenter.NotificationCenterDelegate {
    public FrameLayout aboveTitleView;
    public AnonymousClass5 adapter;
    public final boolean allowTopUp;
    public LinearLayout balanceLayout;
    public ButtonWithCounterView buyButton;
    public RichDetailsCell.AnonymousClass2 emptyLayout;
    public boolean hadTransactions;
    public GLIconTextureView iconTextureView;
    public LoginActivity.AnonymousClass4 oneButtonsLayout;
    public SpannableStringBuilder starBalanceIcon;
    public AnimatedTextView starBalanceTextView;
    public AnimatedTextView starBalanceTitleView;
    public ButtonWithCounterView topUpButton;
    public StarsIntroActivity.StarsTransactionsLayout transactionsLayout;
    public boolean twoButtons;
    public PhotoViewer.AnonymousClass35 twoButtonsLayout;
    public ButtonWithCounterView withdrawButton;

    public final class AnonymousClass4 extends StarParticlesView {
        public Paint[] paints;
        public final int val$particlesCount;
        public final int val$type;

        public AnonymousClass4(Context context, int i, int i2) {
            super(context);
            this.val$particlesCount = i;
            this.val$type = i2;
            setClipWithGradient();
        }

        @Override
        public final void configure() {
            StarParticlesView.Drawable drawable = new StarParticlesView.Drawable(this.val$particlesCount);
            this.drawable = drawable;
            drawable.type = 106;
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
                if (i >= paintArr.length) {
                    StarParticlesView.Drawable drawable2 = this.drawable;
                    drawable2.getPaint = new WebActionBar$$ExternalSyntheticLambda9(this, 12);
                    drawable2.size1 = 17;
                    drawable2.size2 = 18;
                    drawable2.size3 = 19;
                    drawable2.colorKey = Theme.key_windowBackgroundWhiteBlackText;
                    drawable2.init();
                    return;
                }
                paintArr[i] = new Paint(1);
                this.paints[i].setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(i / (this.paints.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                i++;
            }
        }

        @Override
        public final int getStarsRectWidth() {
            return getMeasuredWidth();
        }
    }

    public final class NestedFrameLayout extends GradientHeaderActivity.ContentView {
        public final int $r8$classId = 1;
        public final Version.ECB nestedScrollingParentHelper;
        public final GradientHeaderActivity this$0;

        public NestedFrameLayout(StarsIntroActivity starsIntroActivity, Activity activity) {
            super(activity);
            this.this$0 = starsIntroActivity;
            this.nestedScrollingParentHelper = new Version.ECB();
        }

        @Override
        public final void onNestedPreScroll(ViewGroup viewGroup, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            switch (this.$r8$classId) {
                case 0:
                    TONIntroActivity tONIntroActivity = (TONIntroActivity) this.this$0;
                    if (viewGroup == tONIntroActivity.listView && tONIntroActivity.transactionsLayout.isAttachedToWindow()) {
                        boolean z = ((BaseFragment) tONIntroActivity).actionBar.isSearchFieldVisible;
                        int top = (((View) tONIntroActivity.transactionsLayout.getParent()).getTop() - AndroidUtilities.statusBarHeight) - ActionBar.getCurrentActionBarHeight();
                        int bottom = ((View) tONIntroActivity.transactionsLayout.getParent()).getBottom();
                        boolean z2 = false;
                        if (i2 < 0) {
                            if (tONIntroActivity.listView.getHeight() - bottom >= 0) {
                                RecyclerListView currentListView = tONIntroActivity.transactionsLayout.getCurrentListView();
                                int iFindFirstVisibleItemPosition = ((LinearLayoutManager) currentListView.getLayoutManager()).findFirstVisibleItemPosition();
                                if (iFindFirstVisibleItemPosition != -1) {
                                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = currentListView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                                    int top2 = viewHolderFindViewHolderForAdapterPosition != null ? viewHolderFindViewHolderForAdapterPosition.itemView.getTop() : -1;
                                    int paddingTop = currentListView.getPaddingTop();
                                    if (top2 != paddingTop || iFindFirstVisibleItemPosition != 0) {
                                        iArr[1] = iFindFirstVisibleItemPosition != 0 ? i2 : Math.max(i2, top2 - paddingTop);
                                        currentListView.scrollBy(0, i2);
                                        z2 = true;
                                    }
                                }
                            }
                            if (z) {
                                if (!z2 && top < 0) {
                                    iArr[1] = i2 - Math.max(top, i2);
                                } else {
                                    iArr[1] = i2;
                                }
                            }
                            break;
                        } else if (z) {
                            RecyclerListView currentListView2 = tONIntroActivity.transactionsLayout.getCurrentListView();
                            iArr[1] = i2;
                            if (top > 0) {
                                iArr[1] = 0;
                            }
                            if (currentListView2 != null && (i4 = iArr[1]) > 0) {
                                currentListView2.scrollBy(0, i4);
                                break;
                            }
                        } else if (i2 > 0) {
                            RecyclerListView currentListView3 = tONIntroActivity.transactionsLayout.getCurrentListView();
                            if (tONIntroActivity.listView.getHeight() - bottom >= 0 && currentListView3 != null && !currentListView3.canScrollVertically(1)) {
                                iArr[1] = i2;
                                tONIntroActivity.listView.stopScroll();
                                break;
                            }
                        }
                    }
                    break;
                default:
                    StarsIntroActivity starsIntroActivity = (StarsIntroActivity) this.this$0;
                    if (viewGroup == starsIntroActivity.listView && starsIntroActivity.transactionsLayout.isAttachedToWindow()) {
                        boolean z3 = ((BaseFragment) starsIntroActivity).actionBar.isSearchFieldVisible;
                        int top3 = (((View) starsIntroActivity.transactionsLayout.getParent()).getTop() - AndroidUtilities.statusBarHeight) - ActionBar.getCurrentActionBarHeight();
                        int bottom2 = ((View) starsIntroActivity.transactionsLayout.getParent()).getBottom();
                        boolean z4 = false;
                        if (i2 < 0) {
                            if ((starsIntroActivity.listView.getHeight() - starsIntroActivity.listView.getPaddingBottom()) - bottom2 >= 0) {
                                RecyclerListView currentListView4 = starsIntroActivity.transactionsLayout.getCurrentListView();
                                int iFindFirstVisibleItemPosition2 = ((LinearLayoutManager) currentListView4.getLayoutManager()).findFirstVisibleItemPosition();
                                if (iFindFirstVisibleItemPosition2 != -1) {
                                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = currentListView4.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition2);
                                    int top4 = viewHolderFindViewHolderForAdapterPosition2 != null ? viewHolderFindViewHolderForAdapterPosition2.itemView.getTop() : -1;
                                    int paddingTop2 = currentListView4.getPaddingTop();
                                    if (top4 != paddingTop2 || iFindFirstVisibleItemPosition2 != 0) {
                                        iArr[1] = iFindFirstVisibleItemPosition2 != 0 ? i2 : Math.max(i2, top4 - paddingTop2);
                                        currentListView4.scrollBy(0, i2);
                                        z4 = true;
                                    }
                                }
                            }
                            if (z3) {
                                if (!z4 && top3 < 0) {
                                    iArr[1] = i2 - Math.max(top3, i2);
                                } else {
                                    iArr[1] = i2;
                                }
                            }
                            break;
                        } else if (z3) {
                            RecyclerListView currentListView5 = starsIntroActivity.transactionsLayout.getCurrentListView();
                            iArr[1] = i2;
                            if (top3 > 0) {
                                iArr[1] = 0;
                            }
                            if (currentListView5 != null && (i5 = iArr[1]) > 0) {
                                currentListView5.scrollBy(0, i5);
                                break;
                            }
                        } else if (i2 > 0) {
                            RecyclerListView currentListView6 = starsIntroActivity.transactionsLayout.getCurrentListView();
                            if ((starsIntroActivity.listView.getHeight() - starsIntroActivity.listView.getPaddingBottom()) - bottom2 >= 0 && currentListView6 != null && !currentListView6.canScrollVertically(1)) {
                                iArr[1] = i2;
                                starsIntroActivity.listView.stopScroll();
                                break;
                            }
                        }
                    }
                    break;
            }
        }

        @Override
        public final void onNestedScroll(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5) {
            int i6 = this.$r8$classId;
        }

        @Override
        public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    this.nestedScrollingParentHelper.count = i;
                    break;
                default:
                    this.nestedScrollingParentHelper.count = i;
                    break;
            }
        }

        @Override
        public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    return i == 2;
                default:
                    return i == 2;
            }
        }

        @Override
        public final void onStopNestedScroll(View view) {
            int i = this.$r8$classId;
        }

        @Override
        public final void onNestedScroll(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            switch (this.$r8$classId) {
                case 0:
                    TONIntroActivity tONIntroActivity = (TONIntroActivity) this.this$0;
                    try {
                        if (viewGroup == tONIntroActivity.listView && tONIntroActivity.transactionsLayout.isAttachedToWindow()) {
                            RecyclerListView currentListView = tONIntroActivity.transactionsLayout.getCurrentListView();
                            if (tONIntroActivity.listView.getHeight() - ((View) tONIntroActivity.transactionsLayout.getParent()).getBottom() >= 0) {
                                iArr[1] = i4;
                                currentListView.scrollBy(0, i4);
                            }
                            break;
                        }
                    } catch (Throwable th) {
                        FileLog.e(th);
                        AndroidUtilities.runOnUIThread(new VoIPFragment$12$$ExternalSyntheticLambda0(this, 25));
                        return;
                    }
                    break;
                default:
                    StarsIntroActivity starsIntroActivity = (StarsIntroActivity) this.this$0;
                    try {
                        if (viewGroup == starsIntroActivity.listView && starsIntroActivity.transactionsLayout.isAttachedToWindow()) {
                            RecyclerListView currentListView2 = starsIntroActivity.transactionsLayout.getCurrentListView();
                            if ((starsIntroActivity.listView.getHeight() - starsIntroActivity.listView.getPaddingBottom()) - ((View) starsIntroActivity.transactionsLayout.getParent()).getBottom() >= 0) {
                                iArr[1] = i4;
                                currentListView2.scrollBy(0, i4);
                            }
                            break;
                        }
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                        AndroidUtilities.runOnUIThread(new LivePlayer$1$$ExternalSyntheticLambda0(this, 2));
                    }
                    break;
            }
        }

        @Override
        public final void onStopNestedScroll(int i, View view) {
            switch (this.$r8$classId) {
                case 0:
                    this.nestedScrollingParentHelper.count = 0;
                    break;
                default:
                    this.nestedScrollingParentHelper.count = 0;
                    break;
            }
        }

        public NestedFrameLayout(TONIntroActivity tONIntroActivity, Activity activity) {
            super(activity);
            this.this$0 = tONIntroActivity;
            this.nestedScrollingParentHelper = new Version.ECB();
        }

        private final void onStopNestedScroll$org$telegram$ui$Stars$StarsIntroActivity$NestedFrameLayout(View view) {
        }

        private final void onStopNestedScroll$org$telegram$ui$TON$TONIntroActivity$NestedFrameLayout(View view) {
        }

        private final void onNestedScroll$org$telegram$ui$Stars$StarsIntroActivity$NestedFrameLayout(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5) {
        }

        private final void onNestedScroll$org$telegram$ui$TON$TONIntroActivity$NestedFrameLayout(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5) {
        }
    }

    public final class StarsNeededSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
        public UniversalAdapter adapter;
        public final FrameLayout footerView;
        public final ColorPicker.AnonymousClass1 headerView;
        public final AmountUtils$Amount requiredAmount;
        public Runnable whenPurchased;

        public StarsNeededSheet(Context context, Theme.ResourcesProvider resourcesProvider, AmountUtils$Amount amountUtils$Amount, boolean z, Runnable runnable) {
            super(context, null, false, false, false, resourcesProvider);
            this.topPadding = 0.2f;
            this.whenPurchased = runnable;
            fixNavigationBar();
            RecyclerListView recyclerListView = this.recyclerListView;
            int i = this.backgroundPaddingLeft;
            final int i2 = 0;
            recyclerListView.setPadding(i, 0, i, 0);
            this.recyclerListView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda9(this, 20));
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.mSupportsChangeAnimations = false;
            defaultItemAnimator.delayAnimations = false;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.setDurations(350L);
            this.recyclerListView.setItemAnimator(defaultItemAnimator);
            setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
            this.requiredAmount = amountUtils$Amount;
            ColorPicker.AnonymousClass1 anonymousClass1 = new ColorPicker.AnonymousClass1(context, 4, resourcesProvider);
            this.headerView = anonymousClass1;
            final int i3 = 1;
            ((TextView) anonymousClass1.paint).setText(LocaleController.formatString(R.string.TonNeededTitle, AmountUtils$Amount.fromNano(amountUtils$Amount.nanos - StarsController.getInstance(this.currentAccount, true).getBalanceAmount().nanos, AmountUtils$Currency.TON).asFormatString()));
            TextView textView = (TextView) anonymousClass1.this$0;
            FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(R.string.FragmentAddFunds, textView);
            textView.setMaxWidth(HintView2.cutInFancyHalf(textView.getText(), textView.getPaint()));
            this.actionBar.setTitle(getTitle());
            FrameLayout frameLayout = new FrameLayout(context);
            this.footerView = frameLayout;
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), getResourcesProvider(), true);
            frameLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 17, 20, 10, 20, 20));
            if (z || ApplicationLoader.isStandaloneBuild() || BuildVars.isBetaApp() || BuildVars.isHuaweiStoreApp()) {
                buttonWithCounterView.setText(LocaleController.getString(R.string.TopUpViaFragment), false, true);
                buttonWithCounterView.setOnClickListener(new View.OnClickListener(this) {
                    public final TONIntroActivity.StarsNeededSheet f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i3) {
                            case 0:
                                this.f$0.lambda$new$2$13(view);
                                break;
                            default:
                                Browser.openUrlInSystemBrowser(this.f$0.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                                break;
                        }
                    }
                });
            } else {
                buttonWithCounterView.setText(LocaleController.getString(R.string.Close), false, true);
                buttonWithCounterView.setOnClickListener(new View.OnClickListener(this) {
                    public final TONIntroActivity.StarsNeededSheet f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i2) {
                            case 0:
                                this.f$0.lambda$new$2$13(view);
                                break;
                            default:
                                Browser.openUrlInSystemBrowser(this.f$0.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                                break;
                        }
                    }
                });
            }
            UniversalAdapter universalAdapter = this.adapter;
            if (universalAdapter != null) {
                universalAdapter.update(false);
            }
        }

        @Override
        public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
            UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new TodoItemMenu$$ExternalSyntheticLambda17(this, 7), this.resourcesProvider);
            this.adapter = universalAdapter;
            return universalAdapter;
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            Runnable runnable;
            if (i == NotificationCenter.starOptionsLoaded || i == NotificationCenter.starBalanceUpdated) {
                UniversalAdapter universalAdapter = this.adapter;
                if (universalAdapter != null) {
                    universalAdapter.update(true);
                }
                AmountUtils$Amount balanceAmount = StarsController.getInstance(this.currentAccount, true).getBalanceAmount();
                TextView textView = (TextView) this.headerView.paint;
                int i3 = R.string.TonNeededTitle;
                AmountUtils$Amount amountUtils$Amount = this.requiredAmount;
                textView.setText(LocaleController.formatString(i3, AmountUtils$Amount.fromNano(amountUtils$Amount.nanos - balanceAmount.nanos, AmountUtils$Currency.TON).asFormatString()));
                BottomSheetWithRecyclerListView.AnonymousClass4 anonymousClass4 = this.actionBar;
                if (anonymousClass4 != null) {
                    anonymousClass4.setTitle(getTitle());
                }
                if (balanceAmount.nanos < amountUtils$Amount.nanos || (runnable = this.whenPurchased) == null) {
                    return;
                }
                runnable.run();
                this.whenPurchased = null;
                lambda$showGiftOfferSheet$15();
            }
        }

        @Override
        public final void lambda$showGiftOfferSheet$15() {
            super.lambda$showGiftOfferSheet$15();
            ColorPicker.AnonymousClass1 anonymousClass1 = this.headerView;
            if (anonymousClass1 != null) {
                ((GLIconTextureView) anonymousClass1.rect).setPaused(true);
            }
        }

        @Override
        public final void dismissInternal() {
            super.dismissInternal();
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        }

        @Override
        public final CharSequence getTitle() {
            ColorPicker.AnonymousClass1 anonymousClass1 = this.headerView;
            if (anonymousClass1 == null) {
                return null;
            }
            return ((TextView) anonymousClass1.paint).getText();
        }

        @Override
        public final void show() {
            ChatActivity.AnonymousClass39 anonymousClass39;
            if (StarsController.getInstance(this.currentAccount, true).getBalanceAmount().nanos >= this.requiredAmount.nanos) {
                Runnable runnable = this.whenPurchased;
                if (runnable != null) {
                    runnable.run();
                    this.whenPurchased = null;
                    return;
                }
                return;
            }
            BaseFragment lastFragment = LaunchActivity.getLastFragment();
            if (lastFragment instanceof ChatActivity) {
                ChatActivity chatActivity = (ChatActivity) lastFragment;
                if (chatActivity.isKeyboardVisible() && (anonymousClass39 = chatActivity.chatActivityEnterView) != null) {
                    AndroidUtilities.hideKeyboard(anonymousClass39.messageEditText);
                }
            }
            super.show();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        }
    }

    public TONIntroActivity() {
        this.allowTopUp = ApplicationLoader.isStandaloneBuild() || BuildVars.isBetaApp() || BuildVars.isHuaweiStoreApp();
        this.whiteBackground = true;
    }

    @Override
    public final RecyclerView.Adapter createAdapter() {
        ?? r0 = new UniversalAdapter(this.listView, getParentActivity(), this.currentAccount, this.classGuid, new TodoItemMenu$$ExternalSyntheticLambda17(this, 6), getResourceProvider()) {
            @Override
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                if (i != 42) {
                    return super.onCreateViewHolder(viewGroup, i);
                }
                TONIntroActivity tONIntroActivity = TONIntroActivity.this;
                HeaderCell headerCell = new HeaderCell(tONIntroActivity.getParentActivity(), Theme.key_windowBackgroundWhiteBlueHeader, 21, 0, 0, false, false, ((BaseFragment) tONIntroActivity).resourceProvider);
                headerCell.setHeight(25);
                return new RecyclerListView.Holder(headerCell);
            }
        };
        this.adapter = r0;
        r0.applyBackground = false;
        return r0;
    }

    @Override
    public final GradientHeaderActivity.ContentView createContentView() {
        return new NestedFrameLayout(this, getParentActivity());
    }

    @Override
    public final StarParticlesView createParticlesView() {
        return new AnonymousClass4(getParentActivity(), 75, 1);
    }

    @Override
    public final View createView(Context context) {
        this.useFillLastLayoutManager = false;
        this.particlesViewHeight = AndroidUtilities.dp(238.0f);
        this.transactionsLayout = new StarsIntroActivity.StarsTransactionsLayout(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider());
        this.emptyLayout = new RichDetailsCell.AnonymousClass2(this, context, 3);
        super.createView(context);
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isRightLayout) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.aboveTitleView = frameLayout;
        frameLayout.setClickable(true);
        GLIconTextureView gLIconTextureView = new GLIconTextureView(context, 1, 4);
        this.iconTextureView = gLIconTextureView;
        GLIconRenderer gLIconRenderer = gLIconTextureView.mRenderer;
        gLIconRenderer.colorKey1 = Theme.key_starsGradient1;
        gLIconRenderer.colorKey2 = Theme.key_starsGradient2;
        gLIconRenderer.updateColors();
        this.iconTextureView.setStarParticlesView(this.particlesView);
        this.aboveTitleView.addView(this.iconTextureView, LayoutHelper.createFrame(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        configureHeader(LocaleController.getString(R.string.TONBalanceTitle), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TONBalanceText), new OAuthSheet$$ExternalSyntheticLambda0(context, 19)), true), this.aboveTitleView, null);
        this.listView.setOverScrollMode(2);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.mSupportsChangeAnimations = false;
        defaultItemAnimator.delayAnimations = false;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.setDurations(350L);
        this.listView.setItemAnimator(defaultItemAnimator);
        this.listView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda9(this, 19));
        this.contentView.addView(new FireworksOverlay(getParentActivity()), LayoutHelper.createFrame(-1.0f, -1));
        StarsController.getInstance(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.balanceLayout = linearLayout;
        linearLayout.setOrientation(1);
        this.balanceLayout.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(10.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(getParentActivity(), false, true, false);
        this.starBalanceTextView = animatedTextView;
        animatedTextView.setTypeface(AndroidUtilities.bold());
        this.starBalanceTextView.setTextSize(AndroidUtilities.dp(32.0f));
        this.starBalanceTextView.setGravity(17);
        this.starBalanceTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourceProvider));
        this.starBalanceIcon = new SpannableStringBuilder("S");
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_gram_72);
        coloredImageSpan.setOverrideColor(-13397548);
        coloredImageSpan.setScale(0.5f, 0.5f);
        coloredImageSpan.translate(-AndroidUtilities.dp(3.0f), 0.0f);
        this.starBalanceIcon.setSpan(coloredImageSpan, 0, 1, 33);
        this.balanceLayout.addView(this.starBalanceTextView, LayoutHelper.createFrame(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        AnimatedTextView animatedTextView2 = new AnimatedTextView(getParentActivity(), false, false, false);
        this.starBalanceTitleView = animatedTextView2;
        animatedTextView2.setTextSize(AndroidUtilities.dp(14.0f));
        this.starBalanceTitleView.setGravity(17);
        this.starBalanceTitleView.setText(LocaleController.getString(R.string.YourTonBalance));
        this.starBalanceTitleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, this.resourceProvider));
        this.balanceLayout.addView(this.starBalanceTitleView, LayoutHelper.createFrame(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        LoginActivity.AnonymousClass4 anonymousClass4 = new LoginActivity.AnonymousClass4(this, getParentActivity(), 23);
        this.oneButtonsLayout = anonymousClass4;
        frameLayout2.addView(anonymousClass4);
        if (this.allowTopUp) {
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getParentActivity(), this.resourceProvider, true);
            buttonWithCounterView.setRoundRadius(24);
            this.buyButton = buttonWithCounterView;
            buttonWithCounterView.setRoundRadius(24);
            this.buyButton.setText(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            final int i = 0;
            this.buyButton.setOnClickListener(new View.OnClickListener(this) {
                public final TONIntroActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            Browser.openUrlInSystemBrowser(this.f$0.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        case 1:
                            Browser.openUrlInSystemBrowser(this.f$0.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        default:
                            TONIntroActivity tONIntroActivity = this.f$0;
                            tONIntroActivity.presentFragment(new BotStarsActivity(1, tONIntroActivity.getUserConfig().getClientUserId()));
                            break;
                    }
                }
            });
            this.oneButtonsLayout.addView(this.buyButton, LayoutHelper.createFrame(-1, 48, 119));
        }
        PhotoViewer.AnonymousClass35 anonymousClass35 = new PhotoViewer.AnonymousClass35(this, getParentActivity(), 14);
        this.twoButtonsLayout = anonymousClass35;
        frameLayout2.addView(anonymousClass35);
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(getParentActivity(), this.resourceProvider, true);
        buttonWithCounterView2.setRoundRadius(24);
        this.topUpButton = buttonWithCounterView2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new ColoredImageSpan(2, ApplicationLoader.applicationContext.getDrawable(R.drawable.mini_topup).mutate()), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TonTopUp));
        this.topUpButton.setText(spannableStringBuilder, false, true);
        final int i2 = 1;
        this.topUpButton.setOnClickListener(new View.OnClickListener(this) {
            public final TONIntroActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        Browser.openUrlInSystemBrowser(this.f$0.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    case 1:
                        Browser.openUrlInSystemBrowser(this.f$0.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    default:
                        TONIntroActivity tONIntroActivity = this.f$0;
                        tONIntroActivity.presentFragment(new BotStarsActivity(1, tONIntroActivity.getUserConfig().getClientUserId()));
                        break;
                }
            }
        });
        if (this.allowTopUp) {
            this.twoButtonsLayout.addView(this.topUpButton, LayoutHelper.createLinear(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        ButtonWithCounterView buttonWithCounterView3 = new ButtonWithCounterView(getParentActivity(), this.resourceProvider, true);
        buttonWithCounterView3.setRoundRadius(24);
        this.withdrawButton = buttonWithCounterView3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new ColoredImageSpan(2, ApplicationLoader.applicationContext.getDrawable(R.drawable.mini_stats).mutate()), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.TonStats));
        this.withdrawButton.setText(spannableStringBuilder2, false, true);
        final int i3 = 2;
        this.withdrawButton.setOnClickListener(new View.OnClickListener(this) {
            public final TONIntroActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        Browser.openUrlInSystemBrowser(this.f$0.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    case 1:
                        Browser.openUrlInSystemBrowser(this.f$0.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        break;
                    default:
                        TONIntroActivity tONIntroActivity = this.f$0;
                        tONIntroActivity.presentFragment(new BotStarsActivity(1, tONIntroActivity.getUserConfig().getClientUserId()));
                        break;
                }
            }
        });
        this.twoButtonsLayout.addView(this.withdrawButton, LayoutHelper.createLinear(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.balanceLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        this.oneButtonsLayout.animate().cancel();
        this.twoButtonsLayout.animate().cancel();
        this.twoButtonsLayout.setAlpha(this.twoButtons ? 1.0f : 0.0f);
        this.oneButtonsLayout.setAlpha(this.twoButtons ? 0.0f : 1.0f);
        this.twoButtonsLayout.setVisibility(this.twoButtons ? 0 : 8);
        this.oneButtonsLayout.setVisibility(this.twoButtons ? 8 : 0);
        updateBalance$1$1();
        AnonymousClass5 anonymousClass5 = this.adapter;
        if (anonymousClass5 != null) {
            anonymousClass5.update(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.starOptionsLoaded) {
            saveScrollPosition$2();
            AnonymousClass5 anonymousClass5 = this.adapter;
            if (anonymousClass5 != null) {
                anonymousClass5.update(true);
            }
            if (this.savedScrollPosition == 0 && this.savedScrollOffset < 0) {
                this.savedScrollOffset = 0;
            }
            applyScrolledPosition();
            return;
        }
        if (i == NotificationCenter.starTransactionsLoaded) {
            StarsController starsController = StarsController.getInstance(this.currentAccount, true);
            if (this.hadTransactions != starsController.hasTransactions(0)) {
                this.hadTransactions = starsController.hasTransactions(0);
                saveScrollPosition$2();
                AnonymousClass5 anonymousClass6 = this.adapter;
                if (anonymousClass6 != null) {
                    anonymousClass6.update(true);
                }
                if (this.savedScrollPosition == 0 && this.savedScrollOffset < 0) {
                    this.savedScrollOffset = 0;
                }
                applyScrolledPosition();
                return;
            }
            return;
        }
        if (i == NotificationCenter.starSubscriptionsLoaded) {
            AnonymousClass5 anonymousClass7 = this.adapter;
            if (anonymousClass7 != null) {
                anonymousClass7.update(true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.starBalanceUpdated) {
            updateBalance$1$1();
        } else if (i == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue()) {
            updateBalance$1$1();
        }
    }

    @Override
    public final boolean drawActionBarShadow() {
        boolean z;
        StarsIntroActivity.StarsTransactionsLayout starsTransactionsLayout = this.transactionsLayout;
        if (starsTransactionsLayout == null || !(starsTransactionsLayout.getParent() instanceof View)) {
            z = false;
        } else {
            if (this.listView.getHeight() - ((View) this.transactionsLayout.getParent()).getBottom() >= 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return !z;
    }

    public final void fillItems$1(ArrayList arrayList, UniversalAdapter universalAdapter) {
        if (getParentActivity() == null) {
            return;
        }
        StarsController starsController = StarsController.getInstance(this.currentAccount, true);
        QrActivity.AnonymousClass2 anonymousClass2 = new QrActivity.AnonymousClass2(this, getParentActivity(), 21);
        anonymousClass2.setTag(-33024);
        UItem uItem = new UItem(-2);
        uItem.view = anonymousClass2;
        arrayList.add(uItem);
        arrayList.add(UItem.asCustom(this.balanceLayout));
        boolean z = this.allowTopUp;
        if (z) {
            String string = LocaleController.getString(R.string.TopUpViaFragmentInfo);
            UItem uItem2 = new UItem(7);
            uItem2.text = string;
            arrayList.add(uItem2);
        }
        boolean zHasTransactions = starsController.hasTransactions(0);
        this.hadTransactions = zHasTransactions;
        if (!zHasTransactions) {
            arrayList.add(UItem.asCustomShadow(this.emptyLayout));
            return;
        }
        if (!z) {
            UItem uItem3 = new UItem(7);
            uItem3.text = null;
            arrayList.add(uItem3);
        }
        StarsIntroActivity.StarsTransactionsLayout starsTransactionsLayout = this.transactionsLayout;
        int iDp = AndroidUtilities.dp(24.0f) + ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight;
        UItem uItem4 = new UItem(-3);
        uItem4.view = starsTransactionsLayout;
        uItem4.intValue = iDp;
        uItem4.flags = 0;
        arrayList.add(uItem4);
    }

    @Override
    public final int getNavigationBarColor() {
        return Theme.getColor(null, Theme.key_dialogBackgroundGray, false);
    }

    public final void lambda$createView$1$7(int i) {
        UItem item;
        AnonymousClass5 anonymousClass5 = this.adapter;
        if (anonymousClass5 == null || (item = anonymousClass5.getItem(i)) == null) {
            return;
        }
        int i2 = item.id;
        if (i2 == -1) {
            update(true);
            return;
        }
        if (i2 == -2) {
            StarsController.getInstance(this.currentAccount, true).getGiftOptions();
            UserSelectorBottomSheet.open(1, BirthdayController.getInstance(this.currentAccount).getState());
        } else if (i2 == -3) {
            StarsController.getInstance(this.currentAccount, true).loadSubscriptions();
            update(true);
        } else if (i2 == -4) {
            if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
                AccountFrozenAlert.show(this.currentAccount);
            } else {
                presentFragment(new ChannelAffiliateProgramsFragment(getUserConfig().getClientUserId()));
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        StarsController.getInstance(this.currentAccount, true).invalidateTransactions(true);
        StarsController.getInstance(this.currentAccount, true).invalidateSubscriptions();
        StarsController.getInstance(this.currentAccount, true).getOptions();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onPause() {
        super.onPause();
        GLIconTextureView gLIconTextureView = this.iconTextureView;
        if (gLIconTextureView != null) {
            gLIconTextureView.setPaused(true);
            this.iconTextureView.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        GLIconTextureView gLIconTextureView = this.iconTextureView;
        if (gLIconTextureView != null) {
            gLIconTextureView.setPaused(false);
            this.iconTextureView.setDialogVisible(false);
        }
    }

    public final void updateBalance$1$1() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        StarsController starsController = StarsController.getInstance(this.currentAccount, true);
        double d = getMessagesController().config.tonUsdRate.get();
        TL_stars.StarsAmount balance = starsController.getBalance();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.starBalanceIcon);
        spannableStringBuilder.append((CharSequence) StarsIntroActivity.formatStarsAmount(balance, 0.66f, ' '));
        this.starBalanceTextView.setText(spannableStringBuilder);
        int i = (int) ((balance.amount / 1.0E9d) * d * 100.0d);
        if (i > 0) {
            this.starBalanceTitleView.setText("≈" + BillingController.getInstance().formatCurrency(i, "USD"));
        } else {
            this.starBalanceTitleView.setText(LocaleController.getString(R.string.YourTonBalance));
        }
        TLRPC.TL_payments_starsRevenueStats tONRevenueStats = BotStarsController.getInstance(this.currentAccount).getTONRevenueStats(getUserConfig().getClientUserId(), true);
        final boolean z = (tONRevenueStats == null || (tL_starsRevenueStatus = tONRevenueStats.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) ? false : true;
        if (this.twoButtons == z) {
            return;
        }
        this.twoButtons = z;
        this.oneButtonsLayout.setVisibility(0);
        this.twoButtonsLayout.setVisibility(0);
        final int i2 = 0;
        this.oneButtonsLayout.animate().alpha(z ? 0.0f : 1.0f).withEndAction(new Runnable(this) {
            public final TONIntroActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i2) {
                    case 0:
                        TONIntroActivity tONIntroActivity = this.f$0;
                        if (!z) {
                            tONIntroActivity.getClass();
                        } else {
                            tONIntroActivity.oneButtonsLayout.setVisibility(8);
                        }
                        break;
                    default:
                        TONIntroActivity tONIntroActivity2 = this.f$0;
                        if (!z) {
                            tONIntroActivity2.twoButtonsLayout.setVisibility(8);
                        } else {
                            tONIntroActivity2.getClass();
                        }
                        break;
                }
            }
        }).start();
        final int i3 = 1;
        this.twoButtonsLayout.animate().alpha(z ? 1.0f : 0.0f).withEndAction(new Runnable(this) {
            public final TONIntroActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i3) {
                    case 0:
                        TONIntroActivity tONIntroActivity = this.f$0;
                        if (!z) {
                            tONIntroActivity.getClass();
                        } else {
                            tONIntroActivity.oneButtonsLayout.setVisibility(8);
                        }
                        break;
                    default:
                        TONIntroActivity tONIntroActivity2 = this.f$0;
                        if (!z) {
                            tONIntroActivity2.twoButtonsLayout.setVisibility(8);
                        } else {
                            tONIntroActivity2.getClass();
                        }
                        break;
                }
            }
        }).start();
    }
}
