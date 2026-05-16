package org.telegram.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.DrawerLayoutContainer;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.PasscodeView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;

public class ExternalActionActivity extends Activity implements INavigationLayout.INavigationLayoutDelegate {
    protected INavigationLayout actionBarLayout;
    protected SizeNotifierFrameLayout backgroundTablet;
    protected DrawerLayoutContainer drawerLayoutContainer;
    private boolean finished;
    protected INavigationLayout layersActionBarLayout;
    private Runnable lockRunnable;
    private Intent passcodeSaveIntent;
    private int passcodeSaveIntentAccount;
    private boolean passcodeSaveIntentIsNew;
    private boolean passcodeSaveIntentIsRestore;
    private int passcodeSaveIntentState;
    private PasscodeView passcodeView;
    private static final ArrayList mainFragmentsStack = new ArrayList();
    private static final ArrayList layerFragmentsStack = new ArrayList();

    public static void lambda$onCreate$1(View view) {
    }

    @Override
    public boolean needAddFragmentToStack(BaseFragment baseFragment, INavigationLayout iNavigationLayout) {
        return true;
    }

    @Override
    public boolean needPresentFragment(BaseFragment baseFragment, boolean z, boolean z2, INavigationLayout iNavigationLayout) {
        return true;
    }

    @Override
    public boolean needPresentFragment(INavigationLayout iNavigationLayout, INavigationLayout.NavigationParams navigationParams) {
        return needPresentFragment(navigationParams.fragment, navigationParams.removeLast, navigationParams.noAnimation, iNavigationLayout);
    }

    @Override
    public void onMeasureOverride(int[] iArr) {
        INavigationLayout.INavigationLayoutDelegate.CC.$default$onMeasureOverride(this, iArr);
    }

    @Override
    public boolean onPreIme() {
        return false;
    }

    @Override
    public void onThemeProgress(float f) {
        INavigationLayout.INavigationLayoutDelegate.CC.$default$onThemeProgress(this, f);
    }

    @Override
    protected void onCreate(Bundle bundle) throws Resources.NotFoundException {
        ApplicationLoader.postInitApplication();
        requestWindowFeature(1);
        setTheme(R.style.Theme_TMessages);
        getWindow().setBackgroundDrawableResource(R.drawable.transparent);
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
        Theme.createChatResources(this, false);
        this.actionBarLayout = INavigationLayout.CC.newLayout(this, false);
        DrawerLayoutContainer drawerLayoutContainer = new DrawerLayoutContainer(this);
        this.drawerLayoutContainer = drawerLayoutContainer;
        setContentView(drawerLayoutContainer, new ViewGroup.LayoutParams(-1, -1));
        if (AndroidUtilities.isTablet()) {
            getWindow().setSoftInputMode(16);
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.drawerLayoutContainer.addView(relativeLayout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            relativeLayout.setLayoutParams(layoutParams);
            SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(this) {
                @Override
                protected boolean isActionBarVisible() {
                    return false;
                }
            };
            this.backgroundTablet = sizeNotifierFrameLayout;
            sizeNotifierFrameLayout.setOccupyStatusBar(false);
            this.backgroundTablet.setBackgroundImage(Theme.getCachedWallpaper(), Theme.isWallpaperMotion());
            relativeLayout.addView(this.backgroundTablet, LayoutHelper.createRelative(-1, -1));
            relativeLayout.addView(this.actionBarLayout.getView(), LayoutHelper.createRelative(-1, -1));
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(2130706432);
            relativeLayout.addView(frameLayout, LayoutHelper.createRelative(-1, -1));
            frameLayout.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f$0.lambda$onCreate$0(view, motionEvent);
                }
            });
            frameLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ExternalActionActivity.lambda$onCreate$1(view);
                }
            });
            INavigationLayout iNavigationLayoutNewLayout = INavigationLayout.CC.newLayout(this, false);
            this.layersActionBarLayout = iNavigationLayoutNewLayout;
            iNavigationLayoutNewLayout.setRemoveActionBarExtraHeight(true);
            this.layersActionBarLayout.setBackgroundView(frameLayout);
            this.layersActionBarLayout.setUseAlphaAnimations(true);
            this.layersActionBarLayout.getView().setBackgroundResource(R.drawable.boxshadow);
            relativeLayout.addView(this.layersActionBarLayout.getView(), LayoutHelper.createRelative(530, AndroidUtilities.isSmallTablet() ? 528 : 700));
            this.layersActionBarLayout.setFragmentStack(layerFragmentsStack);
            this.layersActionBarLayout.setDelegate(this);
            this.layersActionBarLayout.setDrawerLayoutContainer(this.drawerLayoutContainer);
        } else {
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            this.drawerLayoutContainer.addView(relativeLayout2, LayoutHelper.createFrame(-1, -1.0f));
            SizeNotifierFrameLayout sizeNotifierFrameLayout2 = new SizeNotifierFrameLayout(this) {
                @Override
                protected boolean isActionBarVisible() {
                    return false;
                }
            };
            this.backgroundTablet = sizeNotifierFrameLayout2;
            sizeNotifierFrameLayout2.setOccupyStatusBar(false);
            this.backgroundTablet.setBackgroundImage(Theme.getCachedWallpaper(), Theme.isWallpaperMotion());
            relativeLayout2.addView(this.backgroundTablet, LayoutHelper.createRelative(-1, -1));
            relativeLayout2.addView(this.actionBarLayout.getView(), LayoutHelper.createRelative(-1, -1));
        }
        this.drawerLayoutContainer.setParentActionBarLayout(this.actionBarLayout);
        this.actionBarLayout.setDrawerLayoutContainer(this.drawerLayoutContainer);
        this.actionBarLayout.setFragmentStack(mainFragmentsStack);
        this.actionBarLayout.setDelegate(this);
        PasscodeView passcodeView = new PasscodeView(this);
        this.passcodeView = passcodeView;
        this.drawerLayoutContainer.addView(passcodeView, LayoutHelper.createFrame(-1, -1.0f));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeOtherAppActivities, this);
        this.actionBarLayout.removeAllFragments();
        INavigationLayout iNavigationLayout = this.layersActionBarLayout;
        if (iNavigationLayout != null) {
            iNavigationLayout.removeAllFragments();
        }
        handleIntent(getIntent(), false, bundle != null, false, UserConfig.selectedAccount, 0);
        needLayout();
    }

    public boolean lambda$onCreate$0(View view, MotionEvent motionEvent) {
        if (!this.actionBarLayout.getFragmentStack().isEmpty() && motionEvent.getAction() == 1) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int[] iArr = new int[2];
            this.layersActionBarLayout.getView().getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            if (!this.layersActionBarLayout.checkTransitionAnimation() && (x <= i || x >= i + this.layersActionBarLayout.getView().getWidth() || y <= i2 || y >= i2 + this.layersActionBarLayout.getView().getHeight())) {
                if (!this.layersActionBarLayout.getFragmentStack().isEmpty()) {
                    while (this.layersActionBarLayout.getFragmentStack().size() - 1 > 0) {
                        INavigationLayout iNavigationLayout = this.layersActionBarLayout;
                        iNavigationLayout.removeFragmentFromStack((BaseFragment) iNavigationLayout.getFragmentStack().get(0));
                    }
                    this.layersActionBarLayout.closeLastFragment(true);
                }
                return true;
            }
        }
        return false;
    }

    public void showPasscodeActivity() throws NumberFormatException {
        if (this.passcodeView == null) {
            return;
        }
        SharedConfig.appLocked = true;
        if (SecretMediaViewer.hasInstance() && SecretMediaViewer.getInstance().isVisible()) {
            SecretMediaViewer.getInstance().closePhoto(false, false);
        } else if (PhotoViewer.hasInstance() && PhotoViewer.getInstance().isVisible()) {
            PhotoViewer.getInstance().closePhoto(false, true);
        } else if (ArticleViewer.hasInstance() && ArticleViewer.getInstance().isVisible()) {
            ArticleViewer.getInstance().close(false, true);
        }
        this.passcodeView.onShow(true, false);
        SharedConfig.isWaitingForPasscodeEnter = true;
        this.passcodeView.setDelegate(new PasscodeView.PasscodeViewDelegate() {
            @Override
            public final void didAcceptedPassword(PasscodeView passcodeView) {
                this.f$0.lambda$showPasscodeActivity$2(passcodeView);
            }
        });
    }

    public void lambda$showPasscodeActivity$2(PasscodeView passcodeView) {
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = this.passcodeSaveIntent;
        if (intent != null) {
            handleIntent(intent, this.passcodeSaveIntentIsNew, this.passcodeSaveIntentIsRestore, true, this.passcodeSaveIntentAccount, this.passcodeSaveIntentState);
            this.passcodeSaveIntent = null;
        }
        this.actionBarLayout.showLastFragment();
        if (AndroidUtilities.isTablet()) {
            this.layersActionBarLayout.showLastFragment();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, passcodeView);
    }

    public void onFinishLogin() {
        handleIntent(this.passcodeSaveIntent, this.passcodeSaveIntentIsNew, this.passcodeSaveIntentIsRestore, true, this.passcodeSaveIntentAccount, this.passcodeSaveIntentState);
        this.actionBarLayout.removeAllFragments();
        INavigationLayout iNavigationLayout = this.layersActionBarLayout;
        if (iNavigationLayout != null) {
            iNavigationLayout.removeAllFragments();
        }
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.backgroundTablet;
        if (sizeNotifierFrameLayout != null) {
            sizeNotifierFrameLayout.setVisibility(0);
        }
    }

    protected boolean checkPasscode(Intent intent, boolean z, boolean z2, boolean z3, int i, int i2) throws NumberFormatException {
        if (z3 || !(AndroidUtilities.needShowPasscode(true) || SharedConfig.isWaitingForPasscodeEnter)) {
            return true;
        }
        showPasscodeActivity();
        this.passcodeSaveIntent = intent;
        this.passcodeSaveIntentIsNew = z;
        this.passcodeSaveIntentIsRestore = z2;
        this.passcodeSaveIntentAccount = i;
        this.passcodeSaveIntentState = i2;
        UserConfig.getInstance(i).saveConfig(false);
        return false;
    }

    protected boolean handleIntent(final Intent intent, final boolean z, final boolean z2, final boolean z3, final int i, int i2) {
        if (!checkPasscode(intent, z, z2, z3, i, i2)) {
            return false;
        }
        if ("org.telegram.passport.AUTHORIZE".equals(intent.getAction())) {
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
                        this.layersActionBarLayout.addFragmentToStack(loginActivity);
                    } else {
                        this.actionBarLayout.addFragmentToStack(loginActivity);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        this.backgroundTablet.setVisibility(8);
                    }
                    this.actionBarLayout.showLastFragment();
                    if (AndroidUtilities.isTablet()) {
                        this.layersActionBarLayout.showLastFragment();
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setTitle(LocaleController.getString(R.string.AppName));
                    builder.setMessage(LocaleController.getString(R.string.PleaseLoginPassport));
                    builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                    builder.show();
                    return true;
                }
                if (activatedAccountsCount >= 2) {
                    AlertDialog alertDialogCreateAccountSelectDialog = AlertsCreator.createAccountSelectDialog(this, new AlertsCreator.AccountSelectDelegate() {
                        @Override
                        public final void didSelectAccount(int i3) {
                            this.f$0.lambda$handleIntent$3(i, intent, z, z2, z3, i3);
                        }
                    });
                    alertDialogCreateAccountSelectDialog.show();
                    alertDialogCreateAccountSelectDialog.setCanceledOnTouchOutside(false);
                    alertDialogCreateAccountSelectDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public final void onDismiss(DialogInterface dialogInterface) {
                            this.f$0.lambda$handleIntent$4(dialogInterface);
                        }
                    });
                    return true;
                }
            }
            long longExtra = intent.getLongExtra("bot_id", intent.getIntExtra("bot_id", 0));
            final String stringExtra = intent.getStringExtra("nonce");
            final String stringExtra2 = intent.getStringExtra("payload");
            final TL_account.getAuthorizationForm getauthorizationform = new TL_account.getAuthorizationForm();
            getauthorizationform.bot_id = longExtra;
            getauthorizationform.scope = intent.getStringExtra("scope");
            getauthorizationform.public_key = intent.getStringExtra("public_key");
            if (longExtra == 0 || ((TextUtils.isEmpty(stringExtra2) && TextUtils.isEmpty(stringExtra)) || TextUtils.isEmpty(getauthorizationform.scope) || TextUtils.isEmpty(getauthorizationform.public_key))) {
                finish();
                return false;
            }
            final int[] iArr = {0};
            final AlertDialog alertDialog = new AlertDialog(this, 3);
            alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    ExternalActionActivity.lambda$handleIntent$5(i, iArr, dialogInterface);
                }
            });
            alertDialog.show();
            iArr[0] = ConnectionsManager.getInstance(i).sendRequest(getauthorizationform, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$handleIntent$10(iArr, i, alertDialog, getauthorizationform, stringExtra2, stringExtra, tLObject, tL_error);
                }
            }, 10);
        } else {
            if (AndroidUtilities.isTablet()) {
                if (this.layersActionBarLayout.getFragmentStack().isEmpty()) {
                    this.layersActionBarLayout.addFragmentToStack(new CacheControlActivity());
                }
            } else if (this.actionBarLayout.getFragmentStack().isEmpty()) {
                this.actionBarLayout.addFragmentToStack(new CacheControlActivity());
            }
            if (!AndroidUtilities.isTablet()) {
                this.backgroundTablet.setVisibility(8);
            }
            this.actionBarLayout.showLastFragment();
            if (AndroidUtilities.isTablet()) {
                this.layersActionBarLayout.showLastFragment();
            }
            intent.setAction(null);
        }
        return false;
    }

    public void lambda$handleIntent$3(int i, Intent intent, boolean z, boolean z2, boolean z3, int i2) {
        if (i2 != i) {
            switchToAccount(i2);
        }
        handleIntent(intent, z, z2, z3, i2, 1);
    }

    public void lambda$handleIntent$4(DialogInterface dialogInterface) {
        setResult(0);
        finish();
    }

    public static void lambda$handleIntent$5(int i, int[] iArr, DialogInterface dialogInterface) {
        ConnectionsManager.getInstance(i).cancelRequest(iArr[0], true);
    }

    public void lambda$handleIntent$10(int[] iArr, final int i, final AlertDialog alertDialog, final TL_account.getAuthorizationForm getauthorizationform, final String str, final String str2, TLObject tLObject, final TLRPC.TL_error tL_error) {
        final TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
        if (authorizationform != null) {
            iArr[0] = ConnectionsManager.getInstance(i).sendRequest(new TL_account.getPassword(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                    this.f$0.lambda$handleIntent$7(alertDialog, i, authorizationform, getauthorizationform, str, str2, tLObject2, tL_error2);
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$handleIntent$9(alertDialog, tL_error);
                }
            });
        }
    }

    public void lambda$handleIntent$7(final AlertDialog alertDialog, final int i, final TL_account.authorizationForm authorizationform, final TL_account.getAuthorizationForm getauthorizationform, final String str, final String str2, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$handleIntent$6(alertDialog, tLObject, i, authorizationform, getauthorizationform, str, str2);
            }
        });
    }

    public void lambda$handleIntent$6(AlertDialog alertDialog, TLObject tLObject, int i, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject != null) {
            MessagesController.getInstance(i).putUsers(authorizationform.users, false);
            PassportActivity passportActivity = new PassportActivity(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, (String) null, authorizationform, (TL_account.Password) tLObject);
            passportActivity.setNeedActivityResult(true);
            if (AndroidUtilities.isTablet()) {
                this.layersActionBarLayout.addFragmentToStack(passportActivity);
            } else {
                this.actionBarLayout.addFragmentToStack(passportActivity);
            }
            if (!AndroidUtilities.isTablet()) {
                this.backgroundTablet.setVisibility(8);
            }
            this.actionBarLayout.showLastFragment();
            if (AndroidUtilities.isTablet()) {
                this.layersActionBarLayout.showLastFragment();
            }
        }
    }

    public void lambda$handleIntent$9(AlertDialog alertDialog, final TLRPC.TL_error tL_error) {
        try {
            alertDialog.dismiss();
            if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                AlertDialog alertDialogShowUpdateAppAlert = AlertsCreator.showUpdateAppAlert(this, LocaleController.getString(R.string.UpdateAppAlert), true);
                if (alertDialogShowUpdateAppAlert != null) {
                    alertDialogShowUpdateAppAlert.setOnDismissListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public final void onDismiss(DialogInterface dialogInterface) {
                            this.f$0.lambda$handleIntent$8(tL_error, dialogInterface);
                        }
                    });
                } else {
                    setResult(1, new Intent().putExtra("error", tL_error.text));
                    finish();
                }
            } else if ("BOT_INVALID".equals(tL_error.text) || "PUBLIC_KEY_REQUIRED".equals(tL_error.text) || "PUBLIC_KEY_INVALID".equals(tL_error.text) || "SCOPE_EMPTY".equals(tL_error.text) || "PAYLOAD_EMPTY".equals(tL_error.text)) {
                setResult(1, new Intent().putExtra("error", tL_error.text));
                finish();
            } else {
                setResult(0);
                finish();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$handleIntent$8(TLRPC.TL_error tL_error, DialogInterface dialogInterface) {
        setResult(1, new Intent().putExtra("error", tL_error.text));
        finish();
    }

    public void switchToAccount(int i) {
        int i2 = UserConfig.selectedAccount;
        if (i == i2) {
            return;
        }
        ConnectionsManager.getInstance(i2).setAppPaused(true, false);
        UserConfig.selectedAccount = i;
        UserConfig.getInstance(0).saveConfig(false);
        if (ApplicationLoader.mainInterfacePaused) {
            return;
        }
        ConnectionsManager.getInstance(UserConfig.selectedAccount).setAppPaused(false, false);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        handleIntent(intent, true, false, false, UserConfig.selectedAccount, 0);
    }

    private void onFinish() {
        if (this.finished) {
            return;
        }
        Runnable runnable = this.lockRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.lockRunnable = null;
        }
        this.finished = true;
    }

    public void needLayout() {
        if (AndroidUtilities.isTablet()) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.layersActionBarLayout.getView().getLayoutParams();
            layoutParams.leftMargin = (AndroidUtilities.displaySize.x - layoutParams.width) / 2;
            int i = AndroidUtilities.statusBarHeight;
            layoutParams.topMargin = i + (((AndroidUtilities.displaySize.y - layoutParams.height) - i) / 2);
            this.layersActionBarLayout.getView().setLayoutParams(layoutParams);
            if (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2) {
                int iDp = (AndroidUtilities.displaySize.x / 100) * 35;
                if (iDp < AndroidUtilities.dp(320.0f)) {
                    iDp = AndroidUtilities.dp(320.0f);
                }
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.actionBarLayout.getView().getLayoutParams();
                layoutParams2.width = iDp;
                layoutParams2.height = -1;
                this.actionBarLayout.getView().setLayoutParams(layoutParams2);
                if (AndroidUtilities.isSmallTablet() && this.actionBarLayout.getFragmentStack().size() == 2) {
                    ((BaseFragment) this.actionBarLayout.getFragmentStack().get(1)).onPause();
                    this.actionBarLayout.getFragmentStack().remove(1);
                    this.actionBarLayout.showLastFragment();
                    return;
                }
                return;
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.actionBarLayout.getView().getLayoutParams();
            layoutParams3.width = -1;
            layoutParams3.height = -1;
            this.actionBarLayout.getView().setLayoutParams(layoutParams3);
        }
    }

    public void fixLayout() {
        INavigationLayout iNavigationLayout;
        if (AndroidUtilities.isTablet() && (iNavigationLayout = this.actionBarLayout) != null) {
            iNavigationLayout.getView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                @Override
                public void onGlobalLayout() {
                    ExternalActionActivity.this.needLayout();
                    INavigationLayout iNavigationLayout2 = ExternalActionActivity.this.actionBarLayout;
                    if (iNavigationLayout2 != null) {
                        iNavigationLayout2.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                }
            });
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        this.actionBarLayout.onPause();
        if (AndroidUtilities.isTablet()) {
            this.layersActionBarLayout.onPause();
        }
        ApplicationLoader.externalInterfacePaused = true;
        onPasscodePause();
        PasscodeView passcodeView = this.passcodeView;
        if (passcodeView != null) {
            passcodeView.onPause();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        onFinish();
    }

    @Override
    protected void onResume() throws NumberFormatException {
        super.onResume();
        this.actionBarLayout.onResume();
        if (AndroidUtilities.isTablet()) {
            this.layersActionBarLayout.onResume();
        }
        ApplicationLoader.externalInterfacePaused = false;
        onPasscodeResume();
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

    private void onPasscodePause() {
        Runnable runnable = this.lockRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.lockRunnable = null;
        }
        if (!SharedConfig.passcodeHash.isEmpty()) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
            Runnable runnable2 = new Runnable() {
                @Override
                public void run() throws NumberFormatException {
                    if (ExternalActionActivity.this.lockRunnable == this) {
                        if (AndroidUtilities.needShowPasscode(true)) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("lock app");
                            }
                            ExternalActionActivity.this.showPasscodeActivity();
                        } else if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("didn't pass lock check");
                        }
                        ExternalActionActivity.this.lockRunnable = null;
                    }
                }
            };
            this.lockRunnable = runnable2;
            if (SharedConfig.appLocked) {
                AndroidUtilities.runOnUIThread(runnable2, 1000L);
            } else {
                int i = SharedConfig.autoLockIn;
                if (i != 0) {
                    AndroidUtilities.runOnUIThread(runnable2, (i * 1000) + 1000);
                }
            }
        } else {
            SharedConfig.lastPauseTime = 0;
        }
        SharedConfig.saveConfig();
    }

    private void onPasscodeResume() throws NumberFormatException {
        Runnable runnable = this.lockRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.lockRunnable = null;
        }
        if (AndroidUtilities.needShowPasscode(true)) {
            showPasscodeActivity();
        }
        if (SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            SharedConfig.saveConfig();
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        AndroidUtilities.checkDisplaySize(this, configuration);
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        super.onConfigurationChanged(configuration);
        fixLayout();
    }

    @Override
    public void onBackPressed() throws NumberFormatException {
        if (this.passcodeView.getVisibility() == 0) {
            finish();
            return;
        }
        if (PhotoViewer.getInstance().isVisible()) {
            PhotoViewer.getInstance().closePhoto(true, false);
            return;
        }
        if (AndroidUtilities.isTablet()) {
            if (this.layersActionBarLayout.getView().getVisibility() == 0) {
                this.layersActionBarLayout.onBackPressed();
                return;
            } else {
                this.actionBarLayout.onBackPressed();
                return;
            }
        }
        this.actionBarLayout.onBackPressed();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        this.actionBarLayout.onLowMemory();
        if (AndroidUtilities.isTablet()) {
            this.layersActionBarLayout.onLowMemory();
        }
    }

    @Override
    public boolean needCloseLastFragment(INavigationLayout iNavigationLayout) {
        if (AndroidUtilities.isTablet()) {
            if (iNavigationLayout == this.actionBarLayout && iNavigationLayout.getFragmentStack().size() <= 1) {
                onFinish();
                finish();
                return false;
            }
            if (iNavigationLayout == this.layersActionBarLayout && this.actionBarLayout.getFragmentStack().isEmpty() && this.layersActionBarLayout.getFragmentStack().size() == 1) {
                onFinish();
                finish();
                return false;
            }
        } else if (iNavigationLayout.getFragmentStack().size() <= 1) {
            onFinish();
            finish();
            return false;
        }
        return true;
    }

    @Override
    public void onRebuildAllFragments(INavigationLayout iNavigationLayout, boolean z) {
        if (AndroidUtilities.isTablet() && iNavigationLayout == this.layersActionBarLayout) {
            this.actionBarLayout.rebuildAllFragmentViews(z, z);
        }
    }
}
