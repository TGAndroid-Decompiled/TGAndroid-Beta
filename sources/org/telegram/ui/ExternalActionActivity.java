package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.view.menu.CascadingMenuPopup;
import androidx.appcompat.view.menu.StandardMenuPopup;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.DrawerLayoutContainer;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.SessionCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.PagerSlidingTabStrip;
import org.telegram.ui.Components.PasscodeView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.VideoEditTextureView$$ExternalSyntheticLambda1;

public class ExternalActionActivity extends Activity implements INavigationLayout.INavigationLayoutDelegate {
    public ActionBarLayout actionBarLayout;
    public SizeNotifierFrameLayout backgroundTablet;
    public DrawerLayoutContainer drawerLayoutContainer;
    public boolean finished;
    public ActionBarLayout layersActionBarLayout;
    public LaunchActivity.AnonymousClass18 lockRunnable;
    public Intent passcodeSaveIntent;
    public int passcodeSaveIntentAccount;
    public boolean passcodeSaveIntentIsNew;
    public boolean passcodeSaveIntentIsRestore;
    public int passcodeSaveIntentState;
    public PasscodeView passcodeView;
    public static final ArrayList mainFragmentsStack = new ArrayList();
    public static final ArrayList layerFragmentsStack = new ArrayList();

    public final class AnonymousClass3 implements ViewTreeObserver.OnGlobalLayoutListener {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass3(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public final void onGlobalLayout() {
            int i = 0;
            Object obj = this.this$0;
            switch (this.$r8$classId) {
                case 0:
                    ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                    externalActionActivity.needLayout();
                    ActionBarLayout actionBarLayout = externalActionActivity.actionBarLayout;
                    if (actionBarLayout != null) {
                        actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                    break;
                case 1:
                    CascadingMenuPopup cascadingMenuPopup = (CascadingMenuPopup) obj;
                    if (cascadingMenuPopup.isShowing()) {
                        ArrayList arrayList = cascadingMenuPopup.mShowingMenus;
                        if (arrayList.size() > 0 && !((CascadingMenuPopup.CascadingMenuInfo) arrayList.get(0)).window.mModal) {
                            View view = cascadingMenuPopup.mShownAnchorView;
                            if (view != null && view.isShown()) {
                                int size = arrayList.size();
                                while (i < size) {
                                    Object obj2 = arrayList.get(i);
                                    i++;
                                    ((CascadingMenuPopup.CascadingMenuInfo) obj2).window.show();
                                }
                            } else {
                                cascadingMenuPopup.dismiss();
                            }
                            break;
                        }
                    }
                    break;
                case 2:
                    StandardMenuPopup standardMenuPopup = (StandardMenuPopup) obj;
                    if (standardMenuPopup.isShowing()) {
                        MenuPopupWindow menuPopupWindow = standardMenuPopup.mPopup;
                        if (!menuPopupWindow.mModal) {
                            View view2 = standardMenuPopup.mShownAnchorView;
                            if (view2 != null && view2.isShown()) {
                                menuPopupWindow.show();
                            } else {
                                standardMenuPopup.dismiss();
                            }
                        }
                    }
                    break;
                case 3:
                    AppCompatSpinner appCompatSpinner = (AppCompatSpinner) obj;
                    if (!appCompatSpinner.getInternalPopup().isShowing()) {
                        appCompatSpinner.mPopup.show(AppCompatSpinner.Api17Impl.getTextDirection(appCompatSpinner), AppCompatSpinner.Api17Impl.getTextAlignment(appCompatSpinner));
                    }
                    ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
                    if (viewTreeObserver != null) {
                        AppCompatSpinner.Api16Impl.removeOnGlobalLayoutListener(viewTreeObserver, this);
                    }
                    break;
                case 4:
                    AppCompatSpinner.DropdownPopup dropdownPopup = (AppCompatSpinner.DropdownPopup) obj;
                    AppCompatSpinner appCompatSpinner2 = AppCompatSpinner.this;
                    dropdownPopup.getClass();
                    WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                    if (appCompatSpinner2.isAttachedToWindow() && appCompatSpinner2.getGlobalVisibleRect(dropdownPopup.mVisibleRect)) {
                        dropdownPopup.computeContentWidth();
                        dropdownPopup.show();
                    } else {
                        dropdownPopup.dismiss();
                    }
                    break;
                default:
                    PagerSlidingTabStrip pagerSlidingTabStrip = (PagerSlidingTabStrip) obj;
                    pagerSlidingTabStrip.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    pagerSlidingTabStrip.currentPosition = pagerSlidingTabStrip.pager.getCurrentItem();
                    PagerSlidingTabStrip.access$300(pagerSlidingTabStrip, pagerSlidingTabStrip.currentPosition, 0);
                    break;
            }
        }
    }

    public static void lambda$onCreate$1(View view) {
    }

    public final boolean checkPasscode(int i, Intent intent, boolean z, boolean z2, boolean z3, int i2) {
        if (z3 || !(AndroidUtilities.needShowPasscode(true) || SharedConfig.isWaitingForPasscodeEnter)) {
            return true;
        }
        showPasscodeActivity$1();
        this.passcodeSaveIntent = intent;
        this.passcodeSaveIntentIsNew = z;
        this.passcodeSaveIntentIsRestore = z2;
        this.passcodeSaveIntentAccount = i;
        this.passcodeSaveIntentState = i2;
        UserConfig.getInstance(i).saveConfig(false);
        return false;
    }

    public void handleIntent$1(final int i, final Intent intent, final boolean z, final boolean z2, final boolean z3, int i2) {
        if (checkPasscode(i, intent, z, z2, z3, i2)) {
            if (!"org.telegram.passport.AUTHORIZE".equals(intent.getAction())) {
                if (AndroidUtilities.isTablet()) {
                    if (this.layersActionBarLayout.getFragmentStack().isEmpty()) {
                        ActionBarLayout actionBarLayout = this.layersActionBarLayout;
                        CacheControlActivity cacheControlActivity = new CacheControlActivity();
                        actionBarLayout.getClass();
                        actionBarLayout.addFragmentToStack(-1, cacheControlActivity);
                    }
                } else if (this.actionBarLayout.getFragmentStack().isEmpty()) {
                    ActionBarLayout actionBarLayout2 = this.actionBarLayout;
                    CacheControlActivity cacheControlActivity2 = new CacheControlActivity();
                    actionBarLayout2.getClass();
                    actionBarLayout2.addFragmentToStack(-1, cacheControlActivity2);
                }
                if (!AndroidUtilities.isTablet()) {
                    this.backgroundTablet.setVisibility(8);
                }
                this.actionBarLayout.showLastFragment();
                if (AndroidUtilities.isTablet()) {
                    this.layersActionBarLayout.showLastFragment();
                }
                intent.setAction(null);
                return;
            }
            if (i2 == 0) {
                int activatedAccountsCount = UserConfig.getActivatedAccountsCount();
                if (activatedAccountsCount == 0) {
                    this.passcodeSaveIntent = intent;
                    this.passcodeSaveIntentIsNew = z;
                    this.passcodeSaveIntentIsRestore = z2;
                    this.passcodeSaveIntentAccount = i;
                    this.passcodeSaveIntentState = i2;
                    LoginActivity loginActivity = new LoginActivity();
                    if (AndroidUtilities.isTablet()) {
                        ActionBarLayout actionBarLayout3 = this.layersActionBarLayout;
                        actionBarLayout3.getClass();
                        actionBarLayout3.addFragmentToStack(-1, loginActivity);
                    } else {
                        ActionBarLayout actionBarLayout4 = this.actionBarLayout;
                        actionBarLayout4.getClass();
                        actionBarLayout4.addFragmentToStack(-1, loginActivity);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        this.backgroundTablet.setVisibility(8);
                    }
                    this.actionBarLayout.showLastFragment();
                    if (AndroidUtilities.isTablet()) {
                        this.layersActionBarLayout.showLastFragment();
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(this, 0, null);
                    String string = LocaleController.getString(R.string.AppName);
                    AlertDialog alertDialog = builder.alertDialog;
                    alertDialog.title = string;
                    alertDialog.message = LocaleController.getString(R.string.PleaseLoginPassport);
                    builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                    builder.show();
                    return;
                }
                if (activatedAccountsCount >= 2) {
                    AlertDialog alertDialogCreateAccountSelectDialog = AlertsCreator.createAccountSelectDialog(this, new AlertsCreator.AccountSelectDelegate() {
                        @Override
                        public final void didSelectAccount(int i3) {
                            int i4;
                            ExternalActionActivity externalActionActivity = this.f$0;
                            int i5 = i;
                            Intent intent2 = intent;
                            boolean z4 = z;
                            boolean z5 = z2;
                            boolean z6 = z3;
                            externalActionActivity.getClass();
                            if (i3 != i5 && i3 != (i4 = UserConfig.selectedAccount)) {
                                ConnectionsManager.getInstance(i4).setAppPaused(true, false);
                                UserConfig.selectedAccount = i3;
                                UserConfig.getInstance(0).saveConfig(false);
                                if (!ApplicationLoader.mainInterfacePaused) {
                                    ConnectionsManager.getInstance(UserConfig.selectedAccount).setAppPaused(false, false);
                                }
                            }
                            externalActionActivity.handleIntent$1(i3, intent2, z4, z5, z6, 1);
                        }
                    });
                    alertDialogCreateAccountSelectDialog.show();
                    alertDialogCreateAccountSelectDialog.setCanceledOnTouchOutside(false);
                    alertDialogCreateAccountSelectDialog.setOnDismissListener(new OAuthSheet$$ExternalSyntheticLambda11(this, 22));
                    return;
                }
            }
            long longExtra = intent.getLongExtra("bot_id", intent.getIntExtra("bot_id", 0));
            String stringExtra = intent.getStringExtra("nonce");
            String stringExtra2 = intent.getStringExtra("payload");
            TL_account.getAuthorizationForm getauthorizationform = new TL_account.getAuthorizationForm();
            getauthorizationform.bot_id = longExtra;
            getauthorizationform.scope = intent.getStringExtra("scope");
            getauthorizationform.public_key = intent.getStringExtra("public_key");
            if (longExtra == 0 || ((TextUtils.isEmpty(stringExtra2) && TextUtils.isEmpty(stringExtra)) || TextUtils.isEmpty(getauthorizationform.scope) || TextUtils.isEmpty(getauthorizationform.public_key))) {
                finish();
                return;
            }
            int[] iArr = {0};
            AlertDialog alertDialog2 = new AlertDialog(this, 3, null);
            alertDialog2.setOnCancelListener(new LaunchActivity$$ExternalSyntheticLambda59(i, 1, iArr));
            alertDialog2.show();
            iArr[0] = ConnectionsManager.getInstance(i).sendRequest(getauthorizationform, new CallLogActivity$$ExternalSyntheticLambda46(this, iArr, i, alertDialog2, getauthorizationform, stringExtra2, stringExtra, 1), 10);
        }
    }

    @Override
    public final boolean needAddFragmentToStack(ActionBarLayout actionBarLayout, BaseFragment baseFragment) {
        return true;
    }

    @Override
    public final boolean needCloseLastFragment(ActionBarLayout actionBarLayout) {
        if (AndroidUtilities.isTablet()) {
            if (actionBarLayout == this.actionBarLayout && actionBarLayout.getFragmentStack().size() <= 1) {
                onFinish$3();
                finish();
                return false;
            }
            if (actionBarLayout == this.layersActionBarLayout && this.actionBarLayout.getFragmentStack().isEmpty() && this.layersActionBarLayout.getFragmentStack().size() == 1) {
                onFinish$3();
                finish();
                return false;
            }
        } else if (actionBarLayout.getFragmentStack().size() <= 1) {
            onFinish$3();
            finish();
            return false;
        }
        return true;
    }

    public final void needLayout() {
        if (AndroidUtilities.isTablet()) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.layersActionBarLayout.getView().getLayoutParams();
            layoutParams.leftMargin = (AndroidUtilities.displaySize.x - layoutParams.width) / 2;
            int i = AndroidUtilities.statusBarHeight;
            layoutParams.topMargin = (((AndroidUtilities.displaySize.y - layoutParams.height) - i) / 2) + i;
            this.layersActionBarLayout.getView().setLayoutParams(layoutParams);
            if (AndroidUtilities.isSmallTablet() && getResources().getConfiguration().orientation != 2) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.actionBarLayout.getView().getLayoutParams();
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                this.actionBarLayout.getView().setLayoutParams(layoutParams2);
                return;
            }
            int iDp = (AndroidUtilities.displaySize.x / 100) * 35;
            if (iDp < AndroidUtilities.dp(320.0f)) {
                iDp = AndroidUtilities.dp(320.0f);
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.actionBarLayout.getView().getLayoutParams();
            layoutParams3.width = iDp;
            layoutParams3.height = -1;
            this.actionBarLayout.getView().setLayoutParams(layoutParams3);
            if (AndroidUtilities.isSmallTablet() && this.actionBarLayout.getFragmentStack().size() == 2) {
                this.actionBarLayout.getFragmentStack().get(1).onPause();
                this.actionBarLayout.getFragmentStack().remove(1);
                this.actionBarLayout.showLastFragment();
            }
        }
    }

    @Override
    public final boolean needPresentFragment(ActionBarLayout actionBarLayout, INavigationLayout.NavigationParams navigationParams) {
        BaseFragment baseFragment = navigationParams.fragment;
        return true;
    }

    @Override
    public final void onBackPressed() throws Throwable {
        if (this.passcodeView.getVisibility() == 0) {
            finish();
            return;
        }
        if (PhotoViewer.getInstance().isVisible()) {
            PhotoViewer.getInstance().closePhoto(true, false);
            return;
        }
        if (!AndroidUtilities.isTablet()) {
            this.actionBarLayout.onBackPressed();
        } else if (this.layersActionBarLayout.getView().getVisibility() == 0) {
            this.layersActionBarLayout.onBackPressed();
        } else {
            this.actionBarLayout.onBackPressed();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        ActionBarLayout actionBarLayout;
        AndroidUtilities.checkDisplaySize(this, configuration);
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        super.onConfigurationChanged(configuration);
        if (AndroidUtilities.isTablet() && (actionBarLayout = this.actionBarLayout) != null) {
            actionBarLayout.getView().getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass3(this, 0));
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        ApplicationLoader.postInitApplication();
        requestWindowFeature(1);
        setTheme(R.style.Theme_TMessages);
        getWindow().setBackgroundDrawable(new SessionCell.CircleGradientDrawable());
        if (!SharedConfig.passcodeHash.isEmpty() && !SharedConfig.allowScreenCapture) {
            try {
                getWindow().setFlags(8192, 8192);
                AndroidUtilities.logFlagSecure();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        super.onCreate(bundle);
        if (!SharedConfig.passcodeHash.isEmpty() && SharedConfig.appLocked) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        AndroidUtilities.fillStatusBarHeight(this, false);
        Theme.createDialogsResources(this);
        Theme.createChatResources(this);
        this.actionBarLayout = new ActionBarLayout(this, false);
        DrawerLayoutContainer drawerLayoutContainer = new DrawerLayoutContainer(this);
        this.drawerLayoutContainer = drawerLayoutContainer;
        setContentView(drawerLayoutContainer, new ViewGroup.LayoutParams(-1, -1));
        INavigationLayout iNavigationLayout = null;
        if (AndroidUtilities.isTablet()) {
            getWindow().setSoftInputMode(16);
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.drawerLayoutContainer.addView(relativeLayout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            relativeLayout.setLayoutParams(layoutParams);
            LaunchActivity.AnonymousClass11 anonymousClass11 = new LaunchActivity.AnonymousClass11(this, iNavigationLayout, 3);
            this.backgroundTablet = anonymousClass11;
            anonymousClass11.setOccupyStatusBar(false);
            this.backgroundTablet.setBackgroundImage(Theme.getCachedWallpaper());
            relativeLayout.addView(this.backgroundTablet, LayoutHelper.createRelative(-1, -1));
            relativeLayout.addView(this.actionBarLayout.getView(), LayoutHelper.createRelative(-1, -1));
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(2130706432);
            relativeLayout.addView(frameLayout, LayoutHelper.createRelative(-1, -1));
            frameLayout.setOnTouchListener(new TodoItemMenu$$ExternalSyntheticLambda4(this, 10));
            frameLayout.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda267(14));
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.layersActionBarLayout = actionBarLayout;
            actionBarLayout.setRemoveActionBarExtraHeight(true);
            this.layersActionBarLayout.setBackgroundView(frameLayout);
            this.layersActionBarLayout.setUseAlphaAnimations(true);
            this.layersActionBarLayout.getView().setBackgroundResource(R.drawable.boxshadow);
            relativeLayout.addView(this.layersActionBarLayout.getView(), LayoutHelper.createRelative(530, AndroidUtilities.isSmallTablet() ? 528 : 700));
            this.layersActionBarLayout.setFragmentStack(layerFragmentsStack);
            this.layersActionBarLayout.setDelegate(this);
            this.layersActionBarLayout.setDrawerLayoutContainer(this.drawerLayoutContainer);
        } else {
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            this.drawerLayoutContainer.addView(relativeLayout2, LayoutHelper.createFrame(-1.0f, -1));
            LaunchActivity.AnonymousClass11 anonymousClass12 = new LaunchActivity.AnonymousClass11(this, iNavigationLayout, 4);
            this.backgroundTablet = anonymousClass12;
            anonymousClass12.setOccupyStatusBar(false);
            this.backgroundTablet.setBackgroundImage(Theme.getCachedWallpaper());
            relativeLayout2.addView(this.backgroundTablet, LayoutHelper.createRelative(-1, -1));
            relativeLayout2.addView(this.actionBarLayout.getView(), LayoutHelper.createRelative(-1, -1));
        }
        this.drawerLayoutContainer.setParentActionBarLayout(this.actionBarLayout);
        this.actionBarLayout.setDrawerLayoutContainer(this.drawerLayoutContainer);
        this.actionBarLayout.setFragmentStack(mainFragmentsStack);
        this.actionBarLayout.setDelegate(this);
        PasscodeView passcodeView = new PasscodeView(this);
        this.passcodeView = passcodeView;
        this.drawerLayoutContainer.addView(passcodeView, LayoutHelper.createFrame(-1.0f, -1));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeOtherAppActivities, this);
        this.actionBarLayout.removeAllFragments();
        ActionBarLayout actionBarLayout2 = this.layersActionBarLayout;
        if (actionBarLayout2 != null) {
            actionBarLayout2.removeAllFragments();
        }
        handleIntent$1(UserConfig.selectedAccount, getIntent(), false, bundle != null, false, 0);
        needLayout();
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        onFinish$3();
    }

    public final void onFinish$3() {
        if (this.finished) {
            return;
        }
        LaunchActivity.AnonymousClass18 anonymousClass18 = this.lockRunnable;
        if (anonymousClass18 != null) {
            AndroidUtilities.cancelRunOnUIThread(anonymousClass18);
            this.lockRunnable = null;
        }
        this.finished = true;
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        this.actionBarLayout.onLowMemory();
        if (AndroidUtilities.isTablet()) {
            this.layersActionBarLayout.onLowMemory();
        }
    }

    @Override
    public final void onMeasureOverride(int[] iArr) {
    }

    @Override
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        handleIntent$1(UserConfig.selectedAccount, intent, true, false, false, 0);
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.actionBarLayout.onPause();
        if (AndroidUtilities.isTablet()) {
            this.layersActionBarLayout.onPause();
        }
        ApplicationLoader.externalInterfacePaused = true;
        LaunchActivity.AnonymousClass18 anonymousClass18 = this.lockRunnable;
        if (anonymousClass18 != null) {
            AndroidUtilities.cancelRunOnUIThread(anonymousClass18);
            this.lockRunnable = null;
        }
        if (SharedConfig.passcodeHash.isEmpty()) {
            SharedConfig.lastPauseTime = 0;
        } else {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
            LaunchActivity.AnonymousClass18 anonymousClass19 = new LaunchActivity.AnonymousClass18(this, 9);
            this.lockRunnable = anonymousClass19;
            if (SharedConfig.appLocked) {
                AndroidUtilities.runOnUIThread(anonymousClass19, 1000L);
            } else {
                int i = SharedConfig.autoLockIn;
                if (i != 0) {
                    AndroidUtilities.runOnUIThread(anonymousClass19, (((long) i) * 1000) + 1000);
                }
            }
        }
        SharedConfig.saveConfig();
        PasscodeView passcodeView = this.passcodeView;
        if (passcodeView != null) {
            AndroidUtilities.cancelRunOnUIThread(passcodeView.checkRunnable);
        }
    }

    @Override
    public final boolean onPreIme() {
        return false;
    }

    @Override
    public final void onRebuildAllFragments(ActionBarLayout actionBarLayout, boolean z) {
        if (AndroidUtilities.isTablet() && actionBarLayout == this.layersActionBarLayout) {
            this.actionBarLayout.rebuildAllFragmentViews(z, z);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.actionBarLayout.onResume();
        if (AndroidUtilities.isTablet()) {
            this.layersActionBarLayout.onResume();
        }
        ApplicationLoader.externalInterfacePaused = false;
        LaunchActivity.AnonymousClass18 anonymousClass18 = this.lockRunnable;
        if (anonymousClass18 != null) {
            AndroidUtilities.cancelRunOnUIThread(anonymousClass18);
            this.lockRunnable = null;
        }
        if (AndroidUtilities.needShowPasscode(true)) {
            showPasscodeActivity$1();
        }
        if (SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            SharedConfig.saveConfig();
        }
        if (this.passcodeView.getVisibility() != 0) {
            this.actionBarLayout.onResume();
            if (AndroidUtilities.isTablet()) {
                this.layersActionBarLayout.onResume();
                return;
            }
            return;
        }
        this.actionBarLayout.dismissDialogs();
        if (AndroidUtilities.isTablet()) {
            this.layersActionBarLayout.dismissDialogs();
        }
        this.passcodeView.onResume();
    }

    @Override
    public final void onThemeProgress(float f) {
    }

    public final void showPasscodeActivity$1() {
        if (this.passcodeView == null) {
            return;
        }
        SharedConfig.appLocked = true;
        if (SecretMediaViewer.hasInstance() && SecretMediaViewer.getInstance().isVisible) {
            SecretMediaViewer.getInstance().closePhoto(false, false);
        } else if (PhotoViewer.hasInstance() && PhotoViewer.getInstance().isVisible()) {
            PhotoViewer.getInstance().closePhoto(false, true);
        } else if (ArticleViewer.hasInstance() && ArticleViewer.getInstance().isVisible) {
            ArticleViewer.getInstance().close(false, true);
        }
        this.passcodeView.onShow(false, -1, -1, null);
        SharedConfig.isWaitingForPasscodeEnter = true;
        this.passcodeView.setDelegate(new VideoEditTextureView$$ExternalSyntheticLambda1(this, 20));
    }
}
