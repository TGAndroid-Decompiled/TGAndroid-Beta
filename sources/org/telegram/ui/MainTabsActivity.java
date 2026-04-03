package org.telegram.ui;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.math.MathUtils;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.BlurredBackgroundWithFadeDrawable;
import org.telegram.ui.Components.blur3.RenderNodeWithHash;
import org.telegram.ui.Components.blur3.capture.IBlur3Hash;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.glass.GlassTabView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.ViewPagerActivity;

public class MainTabsActivity extends ViewPagerActivity implements NotificationCenter.NotificationCenterDelegate, FactorAnimator.Target {
    private HintView2 accountSwitchHint;
    private boolean accountSwitchHintShown;
    private DialogsActivity dialogsActivity;
    private boolean dropCallsFragmentAfterPageScroll;
    private View fadeView;
    private final BlurredBackgroundSourceColor iBlur3SourceColor;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceTabGlass;
    private int navigationBarHeight;
    public GlassTabView[] tabs;
    private MainTabsLayout tabsView;
    private BlurredBackgroundDrawable tabsViewBackground;
    private FrameLayout tabsViewWrapper;
    private IUpdateLayout updateLayout;
    private UpdateLayoutWrapper updateLayoutWrapper;
    private final BoolAnimator animatorTabsVisible = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 380, true);
    private final RectF fragmentPosition = new RectF();

    public interface TabFragmentDelegate {

        public abstract class CC {
            public static boolean $default$canParentTabsSlide(TabFragmentDelegate tabFragmentDelegate, MotionEvent motionEvent, boolean z) {
                return false;
            }
        }

        boolean canParentTabsSlide(MotionEvent motionEvent, boolean z);

        BlurredBackgroundSourceRenderNode getGlassSource();

        void onParentScrollToTop();
    }

    private static int indexToPosition(int i) {
        return i > 2 ? i - 1 : i;
    }

    public static void lambda$createView$2(View view) {
    }

    @Override
    protected int getFragmentsCount() {
        return 4;
    }

    @Override
    protected int getStartPosition() {
        return 0;
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    public MainTabsActivity() {
        if (Build.VERSION.SDK_INT >= 31) {
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceTabGlass = blurredBackgroundSourceRenderNode;
            blurredBackgroundSourceRenderNode.setupRenderer(new RenderNodeWithHash.Renderer() {
                @Override
                public void renderNodeCalculateHash(IBlur3Hash iBlur3Hash) {
                    iBlur3Hash.add(MainTabsActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    iBlur3Hash.add(SharedConfig.chatBlurEnabled());
                    int size = MainTabsActivity.this.fragmentsArr.size();
                    for (int i = 0; i < size; i++) {
                        BaseFragment baseFragment = ((ViewPagerActivity.FragmentState) MainTabsActivity.this.fragmentsArr.valueAt(i)).fragment;
                        View view = baseFragment.fragmentView;
                        if (view != null) {
                            MainTabsActivity mainTabsActivity = MainTabsActivity.this;
                            if (ViewPositionWatcher.computeRectInParent(view, mainTabsActivity.contentView, mainTabsActivity.fragmentPosition) && MainTabsActivity.this.fragmentPosition.right > 0.0f && MainTabsActivity.this.fragmentPosition.left < MainTabsActivity.this.fragmentView.getMeasuredWidth() && (baseFragment instanceof TabFragmentDelegate) && ((TabFragmentDelegate) baseFragment).getGlassSource() != null) {
                                iBlur3Hash.addF(MainTabsActivity.this.fragmentPosition.left);
                                iBlur3Hash.addF(MainTabsActivity.this.fragmentPosition.top);
                                iBlur3Hash.add(baseFragment.getClassGuid());
                            }
                        }
                    }
                }

                @Override
                public void renderNodeUpdateDisplayList(Canvas canvas) {
                    BlurredBackgroundSourceRenderNode glassSource;
                    int measuredWidth = MainTabsActivity.this.fragmentView.getMeasuredWidth();
                    int measuredHeight = MainTabsActivity.this.fragmentView.getMeasuredHeight();
                    canvas.drawColor(MainTabsActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    int size = MainTabsActivity.this.fragmentsArr.size();
                    for (int i = 0; i < size; i++) {
                        BaseFragment baseFragment = ((ViewPagerActivity.FragmentState) MainTabsActivity.this.fragmentsArr.valueAt(i)).fragment;
                        View view = baseFragment.fragmentView;
                        if (view != null) {
                            MainTabsActivity mainTabsActivity = MainTabsActivity.this;
                            if (ViewPositionWatcher.computeRectInParent(view, mainTabsActivity.contentView, mainTabsActivity.fragmentPosition) && MainTabsActivity.this.fragmentPosition.right > 0.0f && MainTabsActivity.this.fragmentPosition.left < MainTabsActivity.this.fragmentView.getMeasuredWidth() && (baseFragment instanceof TabFragmentDelegate) && (glassSource = ((TabFragmentDelegate) baseFragment).getGlassSource()) != null) {
                                canvas.save();
                                canvas.translate(MainTabsActivity.this.fragmentPosition.left, MainTabsActivity.this.fragmentPosition.top);
                                glassSource.draw(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                                canvas.restore();
                            }
                        }
                    }
                }
            });
        } else {
            this.iBlur3SourceTabGlass = null;
        }
        this.iBlur3SourceColor = new BlurredBackgroundSourceColor();
    }

    @Override
    protected FrameLayout createContentView(Context context) {
        return new FrameLayout(context) {
            @Override
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                MainTabsActivity.this.checkUi_tabsPosition();
                MainTabsActivity.this.checkUi_fadeView();
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                MainTabsActivity.this.blur3_invalidateBlur();
            }
        };
    }

    @Override
    public void onResume() {
        super.onResume();
        blur3_updateColors();
        checkContactsTabBadge();
        checkUnreadCount(true);
        Bulletin.Delegate delegate = new Bulletin.Delegate() {
            @Override
            public boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public boolean bottomOffsetAnimated() {
                return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
            }

            @Override
            public boolean clipWithGradient(int i) {
                return Bulletin.Delegate.CC.$default$clipWithGradient(this, i);
            }

            @Override
            public int getTopOffset(int i) {
                return Bulletin.Delegate.CC.$default$getTopOffset(this, i);
            }

            @Override
            public void onBottomOffsetChange(float f) {
                Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
            }

            @Override
            public void onHide(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onHide(this, bulletin);
            }

            @Override
            public void onShow(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onShow(this, bulletin);
            }

            @Override
            public int getBottomOffset(int i) {
                return MainTabsActivity.this.navigationBarHeight + AndroidUtilities.dp(64.0f);
            }
        };
        Bulletin.addDelegate(this, delegate);
        Bulletin.addDelegate(this.contentView, delegate);
        showAccountChangeHint();
    }

    private void checkContactsTabBadge() {
        if (this.tabsView == null || this.tabs[1] == null) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        boolean z = i >= 23 && ContactsController.hasContactsPermission();
        if (z) {
            MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts2", true).apply();
        }
        if (i >= 23 && UserConfig.getInstance(this.currentAccount).syncContacts && !z && MessagesController.getGlobalNotificationsSettings().getBoolean("askAboutContacts2", true)) {
            this.tabs[1].setCounter("!", true, true);
        } else {
            this.tabs[1].setCounter(null, true, true);
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        Bulletin.removeDelegate(this);
        Bulletin.removeDelegate(this.contentView);
        HintView2 hintView2 = this.accountSwitchHint;
        if (hintView2 != null) {
            hintView2.hide();
        }
    }

    @Override
    public View createView(Context context) {
        super.createView(context);
        MainTabsLayout mainTabsLayout = new MainTabsLayout(context);
        this.tabsView = mainTabsLayout;
        mainTabsLayout.setClipChildren(false);
        this.tabsView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        GlassTabView[] glassTabViewArr = new GlassTabView[5];
        this.tabs = glassTabViewArr;
        glassTabViewArr[0] = GlassTabView.createMainTab(context, this.resourceProvider, GlassTabView.TabAnimation.CHATS, R.string.MainTabsChats);
        this.tabs[1] = GlassTabView.createMainTab(context, this.resourceProvider, GlassTabView.TabAnimation.CONTACTS, R.string.MainTabsContacts);
        this.tabs[2] = GlassTabView.createMainTab(context, this.resourceProvider, GlassTabView.TabAnimation.SETTINGS, R.string.Settings);
        this.tabs[3] = GlassTabView.createMainTab(context, this.resourceProvider, GlassTabView.TabAnimation.CALLS, R.string.MainTabsCalls);
        this.tabs[4] = GlassTabView.createAvatar(context, this.resourceProvider, this.currentAccount, R.string.MainTabsProfile);
        this.tabs[4].setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                return this.f$0.lambda$createView$0(view);
            }
        });
        int i = 0;
        while (true) {
            GlassTabView[] glassTabViewArr2 = this.tabs;
            if (i >= glassTabViewArr2.length) {
                break;
            }
            GlassTabView glassTabView = glassTabViewArr2[i];
            final int iIndexToPosition = indexToPosition(i);
            this.tabs[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$createView$1(iIndexToPosition, view);
                }
            });
            this.tabsView.addView(this.tabs[i]);
            this.tabsView.setViewVisible(glassTabView, true, false);
            i++;
        }
        checkUi_callTabVisible(getUserConfig().showCallsTab, false);
        selectTab(this.viewPager.getCurrentPosition(), false);
        this.iBlur3SourceColor.setColor(getThemedColor(Theme.key_windowBackgroundWhite));
        ViewPositionWatcher viewPositionWatcher = new ViewPositionWatcher(this.contentView);
        BlurredBackgroundSource blurredBackgroundSource = this.iBlur3SourceTabGlass;
        if (blurredBackgroundSource == null) {
            blurredBackgroundSource = this.iBlur3SourceColor;
        }
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSource);
        blurredBackgroundDrawableViewFactory.setSourceRootView(viewPositionWatcher, this.contentView);
        blurredBackgroundDrawableViewFactory.setLiquidGlassEffectAllowed(LiteMode.isEnabled(262144));
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(this.tabsView, BlurredBackgroundProviderImpl.mainTabs(this.resourceProvider));
        this.tabsViewBackground = blurredBackgroundDrawableCreate;
        blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(28.0f));
        this.tabsViewBackground.setPadding(AndroidUtilities.dp(7.666f));
        this.tabsView.setBackground(this.tabsViewBackground);
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory2 = new BlurredBackgroundDrawableViewFactory(this.iBlur3SourceColor);
        blurredBackgroundDrawableViewFactory2.setSourceRootView(viewPositionWatcher, this.contentView);
        this.fadeView = new View(context);
        BlurredBackgroundWithFadeDrawable blurredBackgroundWithFadeDrawable = new BlurredBackgroundWithFadeDrawable(blurredBackgroundDrawableViewFactory2.create(this.fadeView, (BlurredBackgroundColorProvider) null));
        blurredBackgroundWithFadeDrawable.setFadeHeight(AndroidUtilities.dp(60.0f), true);
        this.fadeView.setBackground(blurredBackgroundWithFadeDrawable);
        this.contentView.addView(this.fadeView, LayoutHelper.createFrame(-1, 0, 80));
        FrameLayout frameLayout = new FrameLayout(context);
        this.tabsViewWrapper = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                MainTabsActivity.lambda$createView$2(view);
            }
        });
        this.tabsViewWrapper.addView(this.tabsView, LayoutHelper.createFrame(344, 72, 81));
        this.tabsViewWrapper.setClipToPadding(false);
        this.contentView.addView(this.tabsViewWrapper, LayoutHelper.createFrame(-1, -2, 80));
        UpdateLayoutWrapper updateLayoutWrapper = new UpdateLayoutWrapper(context);
        this.updateLayoutWrapper = updateLayoutWrapper;
        this.contentView.addView(updateLayoutWrapper, LayoutHelper.createFrame(-1, -2, 80));
        IUpdateLayout iUpdateLayoutTakeUpdateLayout = ApplicationLoader.applicationLoaderInstance.takeUpdateLayout(getParentActivity(), this.updateLayoutWrapper);
        this.updateLayout = iUpdateLayoutTakeUpdateLayout;
        if (iUpdateLayoutTakeUpdateLayout != null) {
            iUpdateLayoutTakeUpdateLayout.updateAppUpdateViews(this.currentAccount, false);
        }
        checkUnreadCount(false);
        return this.contentView;
    }

    public boolean lambda$createView$0(View view) {
        openAccountSelector(view);
        return true;
    }

    public void lambda$createView$1(int i, View view) {
        if (this.viewPager.isManualScrolling() || this.viewPager.isTouch()) {
            return;
        }
        if (this.viewPager.getCurrentPosition() == i) {
            Object currentVisibleFragment = getCurrentVisibleFragment();
            if (currentVisibleFragment instanceof TabFragmentDelegate) {
                ((TabFragmentDelegate) currentVisibleFragment).onParentScrollToTop();
                return;
            }
            return;
        }
        selectTab(i, true);
        this.viewPager.scrollToPosition(i);
    }

    private void checkUnreadCount(boolean z) {
        if (this.tabsView == null) {
            return;
        }
        int mainUnreadCount = MessagesStorage.getInstance(this.currentAccount).getMainUnreadCount();
        if (mainUnreadCount > 0) {
            this.tabs[0].setCounter(LocaleController.formatNumber(mainUnreadCount, ','), false, z);
        } else {
            this.tabs[0].setCounter(null, false, z);
        }
    }

    public void openAccountSelector(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i = 0; i < 4; i++) {
            if (UserConfig.getInstance(i).isClientActivated()) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return MainTabsActivity.lambda$openAccountSelector$3((Integer) obj, (Integer) obj2);
            }
        });
        final ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this, view);
        if (UserConfig.getActivatedAccountsCount() < 4) {
            itemOptionsMakeOptions.add(R.drawable.msg_addbot, LocaleController.getString(R.string.AddAccount), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$openAccountSelector$4();
                }
            });
        }
        if (arrayList.size() > 0) {
            if (itemOptionsMakeOptions.getItemsCount() > 0) {
                itemOptionsMakeOptions.addGap();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                final int iIntValue = ((Integer) it.next()).intValue();
                LinearLayout linearLayoutAccountView = accountView(iIntValue, this.currentAccount == iIntValue);
                linearLayoutAccountView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        this.f$0.lambda$openAccountSelector$5(iIntValue, itemOptionsMakeOptions, view2);
                    }
                });
                itemOptionsMakeOptions.addView(linearLayoutAccountView, LayoutHelper.createLinear(230, 48));
            }
        }
        itemOptionsMakeOptions.setBlur(true);
        itemOptionsMakeOptions.translate(0.0f, -AndroidUtilities.dp(4.0f));
        ShapeDrawable shapeDrawableCreateRoundRectDrawable = Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), getThemedColor(Theme.key_windowBackgroundWhite));
        shapeDrawableCreateRoundRectDrawable.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), Theme.multAlpha(-16777216, 0.15f));
        itemOptionsMakeOptions.setScrimViewBackground(shapeDrawableCreateRoundRectDrawable);
        itemOptionsMakeOptions.show();
        MessagesController.getGlobalMainSettings().edit().putInt("accountswitchhint", 3).apply();
    }

    public static int lambda$openAccountSelector$3(Integer num, Integer num2) {
        long j = UserConfig.getInstance(num.intValue()).loginTime;
        long j2 = UserConfig.getInstance(num2.intValue()).loginTime;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    public void lambda$openAccountSelector$4() {
        int i = 0;
        Integer numValueOf = null;
        for (int i2 = 3; i2 >= 0; i2--) {
            if (!UserConfig.getInstance(i2).isClientActivated()) {
                i++;
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(i2);
                }
            }
        }
        if (!UserConfig.hasPremiumOnAccounts()) {
            i--;
        }
        if (i > 0 && numValueOf != null) {
            presentFragment(new LoginActivity(numValueOf.intValue()));
        } else {
            if (UserConfig.hasPremiumOnAccounts()) {
                return;
            }
            showDialog(new LimitReachedBottomSheet(this, getContext(), 7, this.currentAccount, null));
        }
    }

    public void lambda$openAccountSelector$5(int i, ItemOptions itemOptions, View view) {
        if (this.currentAccount == i) {
            return;
        }
        itemOptions.dismiss();
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity != null) {
            launchActivity.switchToAccount(i, true);
        }
    }

    public LinearLayout accountView(int i, final boolean z) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setBackground(Theme.createRadSelectorDrawable(getThemedColor(Theme.key_listSelector), 0, 0));
        TLRPC.User currentUser = UserConfig.getInstance(i).getCurrentUser();
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setInfo(currentUser);
        FrameLayout frameLayout = new FrameLayout(getContext()) {
            private final Paint selectedPaint = new Paint(1);

            @Override
            protected void dispatchDraw(Canvas canvas) {
                if (z) {
                    this.selectedPaint.setStyle(Paint.Style.STROKE);
                    this.selectedPaint.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    this.selectedPaint.setColor(MainTabsActivity.this.getThemedColor(Theme.key_featuredStickers_addButton));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), this.selectedPaint);
                }
                super.dispatchDraw(canvas);
            }
        };
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(34, 34, 16, 12, 0, 0, 0));
        BackupImageView backupImageView = new BackupImageView(getContext());
        if (z) {
            backupImageView.setScaleX(0.833f);
            backupImageView.setScaleY(0.833f);
        }
        backupImageView.setRoundRadius(AndroidUtilities.dp(16.0f));
        backupImageView.getImageReceiver().setCurrentAccount(i);
        backupImageView.setForUserOrChat(currentUser, avatarDrawable);
        frameLayout.addView(backupImageView, LayoutHelper.createLinear(32, 32, 17, 1, 1, 1, 1));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
        textView.setText(UserObject.getUserName(currentUser));
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, LayoutHelper.createLinear(0, -2, 1.0f, 16, 13, 0, 14, 0));
        return linearLayout;
    }

    @Override
    protected void onViewPagerScrollEnd() {
        if (this.tabsView != null) {
            selectTab(this.viewPager.getCurrentPosition(), true);
            setGestureSelectedOverride(0.0f, false);
        }
        blur3_invalidateBlur();
        ViewPagerFixed viewPagerFixed = this.viewPager;
        if (viewPagerFixed != null) {
            int currentPosition = viewPagerFixed.getCurrentPosition();
            if (currentPosition != 2 && this.dropCallsFragmentAfterPageScroll) {
                dropFragmentAtPosition(2);
                this.dropCallsFragmentAfterPageScroll = false;
            }
            if (currentPosition != 3) {
                dropFragmentAtPosition(3);
            }
        }
    }

    @Override
    protected void onViewPagerTabAnimationUpdate(boolean z) {
        boolean z2 = !z;
        if (this.tabsView != null) {
            float positionAnimated = this.viewPager.getPositionAnimated();
            setGestureSelectedOverride(positionAnimated, z2);
            if (!z) {
                selectTab(Math.round(positionAnimated), true);
            }
        }
        checkUi_fadeView();
        blur3_invalidateBlur();
    }

    @Override
    public boolean onBackPressed(boolean z) {
        int startPosition;
        boolean zOnBackPressed = super.onBackPressed(z);
        if (!zOnBackPressed || this.viewPager.getCurrentPosition() == (startPosition = getStartPosition())) {
            return zOnBackPressed;
        }
        if (!z) {
            return false;
        }
        this.viewPager.scrollToPosition(startPosition);
        return false;
    }

    public DialogsActivity prepareDialogsActivity(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("hasMainTabs", true);
        DialogsActivity dialogsActivity = new DialogsActivity(bundle);
        this.dialogsActivity = dialogsActivity;
        dialogsActivity.setMainTabsActivityController(new MainTabsActivityControllerImpl());
        putFragmentAtPosition(0, this.dialogsActivity);
        return this.dialogsActivity;
    }

    @Override
    protected BaseFragment createBaseFragmentAt(int i) {
        if (i == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("needPhonebook", true);
            bundle.putBoolean("needFinishFragment", false);
            bundle.putBoolean("hasMainTabs", true);
            return new ContactsActivity(bundle);
        }
        if (i == 2) {
            if (getUserConfig().showCallsTab) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("hasMainTabs", true);
                return new CallLogActivity(bundle2);
            }
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean("hasMainTabs", true);
            return new SettingsActivity(bundle3);
        }
        if (i == 0) {
            Bundle bundle4 = new Bundle();
            bundle4.putBoolean("hasMainTabs", true);
            DialogsActivity dialogsActivity = new DialogsActivity(bundle4);
            this.dialogsActivity = dialogsActivity;
            dialogsActivity.setMainTabsActivityController(new MainTabsActivityControllerImpl());
            return this.dialogsActivity;
        }
        if (i != 3) {
            return null;
        }
        Bundle bundle5 = new Bundle();
        bundle5.putLong("user_id", UserConfig.getInstance(this.currentAccount).getClientUserId());
        bundle5.putBoolean("my_profile", true);
        bundle5.putBoolean("hasMainTabs", true);
        return new ProfileActivity(bundle5);
    }

    public DialogsActivity getDialogsActivity() {
        return this.dialogsActivity;
    }

    public void selectTab(int i, boolean z) {
        int i2 = 0;
        while (true) {
            GlassTabView[] glassTabViewArr = this.tabs;
            if (i2 >= glassTabViewArr.length) {
                return;
            }
            glassTabViewArr[i2].setSelected(indexToPosition(i2) == i, z);
            i2++;
        }
    }

    public void setGestureSelectedOverride(float f, boolean z) {
        for (int i = 0; i < this.tabs.length; i++) {
            this.tabs[i].setGestureSelectedOverride(Math.max(0.0f, 1.0f - Math.abs(indexToPosition(i) - f)), z);
        }
        this.tabsView.invalidate();
    }

    @Override
    protected boolean canScrollForward(MotionEvent motionEvent) {
        return canScrollInternal(motionEvent, true);
    }

    @Override
    protected boolean canScrollBackward(MotionEvent motionEvent) {
        return canScrollInternal(motionEvent, false);
    }

    private boolean canScrollInternal(MotionEvent motionEvent, boolean z) {
        Object currentVisibleFragment = getCurrentVisibleFragment();
        if (currentVisibleFragment instanceof TabFragmentDelegate) {
            return ((TabFragmentDelegate) currentVisibleFragment).canParentTabsSlide(motionEvent, z);
        }
        return false;
    }

    @Override
    protected WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.navigationBarHeight = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).bottom;
        boolean zIsUpdateLayoutVisible = this.updateLayoutWrapper.isUpdateLayoutVisible();
        int iDp = zIsUpdateLayoutVisible ? AndroidUtilities.dp(44.0f) : 0;
        this.updateLayoutWrapper.setPadding(0, 0, 0, this.navigationBarHeight);
        int iDp2 = this.navigationBarHeight + iDp + AndroidUtilities.dp(72.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.fadeView.getLayoutParams();
        if (marginLayoutParams.height != iDp2) {
            marginLayoutParams.height = iDp2;
            this.fadeView.setLayoutParams(marginLayoutParams);
        }
        int i = zIsUpdateLayoutVisible ? this.navigationBarHeight + iDp : 0;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.viewPager.getLayoutParams();
        if (marginLayoutParams2.bottomMargin != i) {
            marginLayoutParams2.bottomMargin = i;
            this.viewPager.setLayoutParams(marginLayoutParams2);
        }
        this.tabsViewWrapper.setPadding(0, 0, 0, this.navigationBarHeight);
        if (zIsUpdateLayoutVisible) {
            windowInsetsCompat = windowInsetsCompat.inset(0, 0, 0, this.navigationBarHeight);
        }
        checkUi_tabsPosition();
        checkUi_fadeView();
        return super.onApplyWindowInsets(view, windowInsetsCompat);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        GlassTabView glassTabView;
        IUpdateLayout iUpdateLayout;
        IUpdateLayout iUpdateLayout2;
        if (i == NotificationCenter.notificationsCountUpdated || i == NotificationCenter.updateInterfaces) {
            View view = this.fragmentView;
            if (view != null && view.isAttachedToWindow()) {
                z = true;
            }
            checkUnreadCount(z);
            return;
        }
        if (i == NotificationCenter.appUpdateLoading) {
            IUpdateLayout iUpdateLayout3 = this.updateLayout;
            if (iUpdateLayout3 != null) {
                iUpdateLayout3.updateFileProgress(null);
                this.updateLayout.updateAppUpdateViews(this.currentAccount, true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str) && (iUpdateLayout2 = this.updateLayout) != null) {
                iUpdateLayout2.updateAppUpdateViews(this.currentAccount, true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.fileLoadFailed) {
            String str2 = (String) objArr[0];
            if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str2) && (iUpdateLayout = this.updateLayout) != null) {
                iUpdateLayout.updateAppUpdateViews(this.currentAccount, true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.fileLoadProgressChanged) {
            IUpdateLayout iUpdateLayout4 = this.updateLayout;
            if (iUpdateLayout4 != null) {
                iUpdateLayout4.updateFileProgress(objArr);
                return;
            }
            return;
        }
        if (i == NotificationCenter.appUpdateAvailable) {
            IUpdateLayout iUpdateLayout5 = this.updateLayout;
            if (iUpdateLayout5 != null) {
                iUpdateLayout5.updateAppUpdateViews(this.currentAccount, LaunchActivity.getMainFragmentsStackSize() == 1);
                return;
            }
            return;
        }
        if (i == NotificationCenter.needSetDayNightTheme) {
            clearAllHiddenFragments();
            return;
        }
        if (i == NotificationCenter.callTabsVisibleToggled) {
            checkUi_callTabVisible(getUserConfig().showCallsTab, true);
            ViewPagerFixed viewPagerFixed = this.viewPager;
            if (viewPagerFixed != null && viewPagerFixed.getCurrentPosition() == 2) {
                this.viewPager.scrollToPosition(0);
                selectTab(0, true);
                this.dropCallsFragmentAfterPageScroll = true;
                return;
            }
            dropFragmentAtPosition(2);
            return;
        }
        if (i == NotificationCenter.mainUserInfoChanged) {
            GlassTabView[] glassTabViewArr = this.tabs;
            if (glassTabViewArr == null || (glassTabView = glassTabViewArr[4]) == null) {
                return;
            }
            glassTabView.updateUserAvatar(this.currentAccount);
            return;
        }
        if (i == NotificationCenter.contactsPermissionBadgeCheck) {
            checkContactsTabBadge();
        }
    }

    @Override
    public boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.notificationsCountUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.callTabsVisibleToggled);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.mainUserInfoChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsPermissionBadgeCheck);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.appUpdateAvailable);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.appUpdateLoading);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.needSetDayNightTheme);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsCountUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.callTabsVisibleToggled);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.mainUserInfoChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsPermissionBadgeCheck);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.appUpdateAvailable);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.appUpdateLoading);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.needSetDayNightTheme);
        super.onFragmentDestroy();
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 0) {
            checkUi_tabsPosition();
            checkUi_fadeView();
        }
    }

    public void checkUi_fadeView() {
        ViewPagerFixed viewPagerFixed = this.viewPager;
        if (viewPagerFixed == null || this.fadeView == null) {
            return;
        }
        float fClamp = 1.0f - MathUtils.clamp(Math.abs(3.0f - viewPagerFixed.getPositionAnimated()), 0.0f, 1.0f);
        float navigationBarThirdButtonsFactor = (1.0f - ((1.0f - AndroidUtilities.getNavigationBarThirdButtonsFactor(0.0f, 1.0f, this.navigationBarHeight)) * fClamp)) * this.animatorTabsVisible.getFloatValue();
        this.fadeView.setAlpha(navigationBarThirdButtonsFactor);
        this.fadeView.setTranslationY(fClamp * AndroidUtilities.dp(48.0f));
        this.fadeView.setVisibility(navigationBarThirdButtonsFactor > 0.0f ? 0 : 8);
    }

    public void checkUi_tabsPosition() {
        int iDp = AndroidUtilities.dp(40.0f) + (-(this.updateLayoutWrapper.isUpdateLayoutVisible() ? AndroidUtilities.dp(44.0f) : 0));
        float floatValue = this.animatorTabsVisible.getFloatValue();
        float fLerp = AndroidUtilities.lerp(0.85f, 1.0f, floatValue);
        this.tabsViewWrapper.setTranslationY(AndroidUtilities.lerp(iDp, r0, floatValue));
        this.tabsView.setScaleX(fLerp);
        this.tabsView.setScaleY(fLerp);
        this.tabsView.setClickable(floatValue > 1.0f);
        this.tabsView.setEnabled(floatValue > 1.0f);
        this.tabsView.setAlpha(floatValue);
        this.tabsView.setVisibility(floatValue <= 0.0f ? 8 : 0);
    }

    private void checkUi_callTabVisible(boolean z, boolean z2) {
        MainTabsLayout mainTabsLayout = this.tabsView;
        if (mainTabsLayout != null) {
            mainTabsLayout.setViewVisible(this.tabs[2], !z, z2);
            this.tabsView.setViewVisible(this.tabs[3], z, z2);
        }
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList themeDescriptions = super.getThemeDescriptions();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                this.f$0.blur3_updateColors();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        themeDescriptions.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_windowBackgroundWhite));
        themeDescriptions.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_dialogBackground));
        return themeDescriptions;
    }

    private class MainTabsActivityControllerImpl implements MainTabsActivityController {
        private MainTabsActivityControllerImpl() {
        }

        @Override
        public void setTabsVisible(boolean z) {
            MainTabsActivity.this.animatorTabsVisible.setValue(z, true);
        }
    }

    @Override
    public boolean canBeginSlide() {
        BaseFragment currentVisibleFragment = getCurrentVisibleFragment();
        return currentVisibleFragment != null && currentVisibleFragment.canBeginSlide();
    }

    @Override
    public void onBeginSlide() {
        super.onBeginSlide();
        BaseFragment currentVisibleFragment = getCurrentVisibleFragment();
        if (currentVisibleFragment != null) {
            currentVisibleFragment.onBeginSlide();
        }
    }

    @Override
    public void onSlideProgress(boolean z, float f) {
        BaseFragment currentVisibleFragment = getCurrentVisibleFragment();
        if (currentVisibleFragment != null) {
            currentVisibleFragment.onSlideProgress(z, f);
        }
    }

    @Override
    public Animator getCustomSlideTransition(boolean z, boolean z2, float f) {
        BaseFragment currentVisibleFragment = getCurrentVisibleFragment();
        if (currentVisibleFragment != null) {
            return currentVisibleFragment.getCustomSlideTransition(z, z2, f);
        }
        return null;
    }

    @Override
    public void prepareFragmentToSlide(boolean z, boolean z2) {
        BaseFragment currentVisibleFragment = getCurrentVisibleFragment();
        if (currentVisibleFragment != null) {
            currentVisibleFragment.prepareFragmentToSlide(z, z2);
        }
    }

    private void showAccountChangeHint() {
        if (this.accountSwitchHintShown) {
            return;
        }
        if (this.accountSwitchHint == null && MessagesController.getGlobalMainSettings().getInt("accountswitchhint", 0) < 2) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$showAccountChangeHint$7();
                }
            }, 1500L);
            MessagesController.getGlobalMainSettings().edit().putInt("accountswitchhint", MessagesController.getGlobalMainSettings().getInt("channelgifthint", 0) + 1).apply();
        }
        this.accountSwitchHintShown = true;
    }

    public void lambda$showAccountChangeHint$7() {
        GlassTabView[] glassTabViewArr;
        if (getContext() == null || (glassTabViewArr = this.tabs) == null) {
            return;
        }
        float width = ((this.contentView.getWidth() - ((this.tabsView.getX() + glassTabViewArr[4].getX()) + r0.getWidth())) + (r0.getWidth() / 2.0f)) / AndroidUtilities.density;
        HintView2 hintView2 = new HintView2(getContext(), 3);
        this.accountSwitchHint = hintView2;
        hintView2.setTranslationY((-this.navigationBarHeight) + AndroidUtilities.dp(4.0f));
        this.accountSwitchHint.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
        this.accountSwitchHint.setMultilineText(false);
        this.accountSwitchHint.setCloseButton(true);
        this.accountSwitchHint.setText(LocaleController.getString(R.string.SwitchAccountHint));
        this.accountSwitchHint.setJoint(1.0f, (-width) + 7.33f);
        this.contentView.addView(this.accountSwitchHint, LayoutHelper.createFrame(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
        this.accountSwitchHint.setOnHiddenListener(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showAccountChangeHint$6();
            }
        });
        this.accountSwitchHint.setDuration(8000L);
        this.accountSwitchHint.show();
    }

    public void lambda$showAccountChangeHint$6() {
        AndroidUtilities.removeFromParent(this.accountSwitchHint);
    }

    public void blur3_invalidateBlur() {
        View view;
        if (Build.VERSION.SDK_INT < 31 || this.iBlur3SourceTabGlass == null || (view = this.fragmentView) == null) {
            return;
        }
        this.iBlur3SourceTabGlass.setSize(view.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        this.iBlur3SourceTabGlass.updateDisplayListIfNeeded();
    }

    public void blur3_updateColors() {
        this.iBlur3SourceColor.setColor(getThemedColor(Theme.key_windowBackgroundWhite));
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.tabsViewBackground;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.updateColors();
        }
        blur3_invalidateBlur();
        View view = this.fadeView;
        if (view != null) {
            view.invalidate();
        }
        MainTabsLayout mainTabsLayout = this.tabsView;
        if (mainTabsLayout != null) {
            mainTabsLayout.invalidate();
        }
        GlassTabView[] glassTabViewArr = this.tabs;
        if (glassTabViewArr != null) {
            for (GlassTabView glassTabView : glassTabViewArr) {
                glassTabView.updateColorsLottie();
            }
        }
    }
}
