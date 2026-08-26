package org.telegram.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.io.FileNotFoundException;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.DrawerLayoutContainer;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ActivityWindowEmptyBackgroundDrawable;
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
    private static final ArrayList<BaseFragment> mainFragmentsStack = new ArrayList<>();
    private static final ArrayList<BaseFragment> layerFragmentsStack = new ArrayList<>();

    public void lambda$handleIntent$10(int[] iArr, int i, AlertDialog alertDialog, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
        if (authorizationform == null) {
            AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda30((Activity) this, (Object) alertDialog, tL_error, 18));
        } else {
            iArr[0] = ConnectionsManager.getInstance(i).sendRequest(new TL_account.getPassword(), new CallLogActivity$$ExternalSyntheticLambda18(this, alertDialog, i, authorizationform, getauthorizationform, str, str2, 2));
        }
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
                INavigationLayout iNavigationLayout = this.layersActionBarLayout;
                iNavigationLayout.getClass();
                ((ActionBarLayout) iNavigationLayout).addFragmentToStack(-1, passportActivity);
            } else {
                INavigationLayout iNavigationLayout2 = this.actionBarLayout;
                iNavigationLayout2.getClass();
                ((ActionBarLayout) iNavigationLayout2).addFragmentToStack(-1, passportActivity);
            }
            if (!AndroidUtilities.isTablet()) {
                this.backgroundTablet.setVisibility(8);
            }
            ((ActionBarLayout) this.actionBarLayout).showLastFragment();
            if (AndroidUtilities.isTablet()) {
                ((ActionBarLayout) this.layersActionBarLayout).showLastFragment();
            }
        }
    }

    public void lambda$handleIntent$7(AlertDialog alertDialog, int i, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ExternalActionActivity$$ExternalSyntheticLambda3(this, alertDialog, tLObject, i, authorizationform, getauthorizationform, str, str2));
    }

    public void lambda$handleIntent$8(TLRPC.TL_error tL_error, DialogInterface dialogInterface) {
        setResult(1, new Intent().putExtra("error", tL_error.text));
        finish();
    }

    public void lambda$handleIntent$9(AlertDialog alertDialog, TLRPC.TL_error tL_error) {
        try {
            alertDialog.dismiss();
            if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                AlertDialog alertDialogShowUpdateAppAlert = AlertsCreator.showUpdateAppAlert(this, LocaleController.getString(R.string.UpdateAppAlert), true);
                if (alertDialogShowUpdateAppAlert != null) {
                    alertDialogShowUpdateAppAlert.setOnDismissListener(new VoIPFragment$$ExternalSyntheticLambda23(2, this, tL_error));
                    return;
                } else {
                    setResult(1, new Intent().putExtra("error", tL_error.text));
                    finish();
                    return;
                }
            }
            if (!"BOT_INVALID".equals(tL_error.text) && !"PUBLIC_KEY_REQUIRED".equals(tL_error.text) && !"PUBLIC_KEY_INVALID".equals(tL_error.text) && !"SCOPE_EMPTY".equals(tL_error.text) && !"PAYLOAD_EMPTY".equals(tL_error.text)) {
                setResult(0);
                finish();
                return;
            }
            setResult(1, new Intent().putExtra("error", tL_error.text));
            finish();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public boolean lambda$onCreate$0(View view, MotionEvent motionEvent) {
        if (!((ActionBarLayout) this.actionBarLayout).getFragmentStack().isEmpty() && motionEvent.getAction() == 1) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int[] iArr = new int[2];
            ((ActionBarLayout) this.layersActionBarLayout).getView().getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            if (!((ActionBarLayout) this.layersActionBarLayout).checkTransitionAnimation() && (x <= i || x >= ((ActionBarLayout) this.layersActionBarLayout).getView().getWidth() + i || y <= i2 || y >= ((ActionBarLayout) this.layersActionBarLayout).getView().getHeight() + i2)) {
                if (!((ActionBarLayout) this.layersActionBarLayout).getFragmentStack().isEmpty()) {
                    while (Theme.ResourcesProvider.CC.m((ActionBarLayout) this.layersActionBarLayout, 1) > 0) {
                        ActionBarLayout actionBarLayout = (ActionBarLayout) this.layersActionBarLayout;
                        actionBarLayout.removeFragmentFromStack(actionBarLayout.getFragmentStack().get(0), false);
                    }
                    ((ActionBarLayout) this.layersActionBarLayout).closeLastFragment(true, false);
                }
                return true;
            }
        }
        return false;
    }

    public static void lambda$onCreate$1(View view) {
    }

    public void lambda$showPasscodeActivity$2(PasscodeView passcodeView) {
        ExternalActionActivity externalActionActivity;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = this.passcodeSaveIntent;
        if (intent != null) {
            externalActionActivity = this;
            externalActionActivity.handleIntent(intent, this.passcodeSaveIntentIsNew, this.passcodeSaveIntentIsRestore, true, this.passcodeSaveIntentAccount, this.passcodeSaveIntentState);
            externalActionActivity.passcodeSaveIntent = null;
        } else {
            externalActionActivity = this;
        }
        ((ActionBarLayout) externalActionActivity.actionBarLayout).showLastFragment();
        if (AndroidUtilities.isTablet()) {
            ((ActionBarLayout) externalActionActivity.layersActionBarLayout).showLastFragment();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, passcodeView);
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

    private void onPasscodePause() {
        Runnable runnable = this.lockRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.lockRunnable = null;
        }
        if (SharedConfig.passcodeHash.isEmpty()) {
            SharedConfig.lastPauseTime = 0;
        } else {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
            Runnable runnable2 = new Runnable() {
                @Override
                public void run() throws FileNotFoundException {
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
                    AndroidUtilities.runOnUIThread(runnable2, (((long) i) * 1000) + 1000);
                }
            }
        }
        SharedConfig.saveConfig();
    }

    private void onPasscodeResume() throws FileNotFoundException {
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

    public void showPasscodeActivity() throws FileNotFoundException {
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
        this.passcodeView.setDelegate(new BoostsActivity$$ExternalSyntheticLambda4(this, 21));
    }

    public boolean checkPasscode(Intent intent, boolean z, boolean z2, boolean z3, int i, int i2) throws FileNotFoundException {
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

    public void fixLayout() {
        INavigationLayout iNavigationLayout;
        if (AndroidUtilities.isTablet() && (iNavigationLayout = this.actionBarLayout) != null) {
            ((ActionBarLayout) iNavigationLayout).getView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                @Override
                public void onGlobalLayout() {
                    ExternalActionActivity.this.needLayout();
                    INavigationLayout iNavigationLayout2 = ExternalActionActivity.this.actionBarLayout;
                    if (iNavigationLayout2 != null) {
                        ((ActionBarLayout) iNavigationLayout2).getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                }
            });
        }
    }

    public boolean handleIntent(final Intent intent, final boolean z, final boolean z2, final boolean z3, final int i, int i2) {
        if (!checkPasscode(intent, z, z2, z3, i, i2)) {
            return false;
        }
        if (!"org.telegram.passport.AUTHORIZE".equals(intent.getAction())) {
            if (AndroidUtilities.isTablet()) {
                if (((ActionBarLayout) this.layersActionBarLayout).getFragmentStack().isEmpty()) {
                    INavigationLayout iNavigationLayout = this.layersActionBarLayout;
                    CacheControlActivity cacheControlActivity = new CacheControlActivity();
                    iNavigationLayout.getClass();
                    ((ActionBarLayout) iNavigationLayout).addFragmentToStack(-1, cacheControlActivity);
                }
            } else if (((ActionBarLayout) this.actionBarLayout).getFragmentStack().isEmpty()) {
                INavigationLayout iNavigationLayout2 = this.actionBarLayout;
                CacheControlActivity cacheControlActivity2 = new CacheControlActivity();
                iNavigationLayout2.getClass();
                ((ActionBarLayout) iNavigationLayout2).addFragmentToStack(-1, cacheControlActivity2);
            }
            if (!AndroidUtilities.isTablet()) {
                this.backgroundTablet.setVisibility(8);
            }
            ((ActionBarLayout) this.actionBarLayout).showLastFragment();
            if (AndroidUtilities.isTablet()) {
                ((ActionBarLayout) this.layersActionBarLayout).showLastFragment();
            }
            intent.setAction(null);
            return false;
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
                    INavigationLayout iNavigationLayout3 = this.layersActionBarLayout;
                    iNavigationLayout3.getClass();
                    ((ActionBarLayout) iNavigationLayout3).addFragmentToStack(-1, loginActivity);
                } else {
                    INavigationLayout iNavigationLayout4 = this.actionBarLayout;
                    iNavigationLayout4.getClass();
                    ((ActionBarLayout) iNavigationLayout4).addFragmentToStack(-1, loginActivity);
                }
                if (!AndroidUtilities.isTablet()) {
                    this.backgroundTablet.setVisibility(8);
                }
                ((ActionBarLayout) this.actionBarLayout).showLastFragment();
                if (AndroidUtilities.isTablet()) {
                    ((ActionBarLayout) this.layersActionBarLayout).showLastFragment();
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(this, 0, null);
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
                alertDialogCreateAccountSelectDialog.setOnDismissListener(new OAuthSheet$$ExternalSyntheticLambda18(this, 7));
                return true;
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
            return false;
        }
        int[] iArr = {0};
        AlertDialog alertDialog = new AlertDialog(this, 3, null);
        alertDialog.setOnCancelListener(new LaunchActivity$$ExternalSyntheticLambda98(i, 1, iArr));
        alertDialog.show();
        iArr[0] = ConnectionsManager.getInstance(i).sendRequest(getauthorizationform, new CallLogActivity$$ExternalSyntheticLambda18(this, iArr, i, alertDialog, getauthorizationform, stringExtra2, stringExtra, 1), 10);
        return false;
    }

    @Override
    public boolean needAddFragmentToStack(BaseFragment baseFragment, INavigationLayout iNavigationLayout) {
        return true;
    }

    @Override
    public boolean needCloseLastFragment(INavigationLayout iNavigationLayout) {
        if (AndroidUtilities.isTablet()) {
            if (iNavigationLayout == this.actionBarLayout && ((ActionBarLayout) iNavigationLayout).getFragmentStack().size() <= 1) {
                onFinish();
                finish();
                return false;
            }
            if (iNavigationLayout == this.layersActionBarLayout && ((ActionBarLayout) this.actionBarLayout).getFragmentStack().isEmpty() && ((ActionBarLayout) this.layersActionBarLayout).getFragmentStack().size() == 1) {
                onFinish();
                finish();
                return false;
            }
        } else if (((ActionBarLayout) iNavigationLayout).getFragmentStack().size() <= 1) {
            onFinish();
            finish();
            return false;
        }
        return true;
    }

    public void needLayout() {
        if (AndroidUtilities.isTablet()) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((ActionBarLayout) this.layersActionBarLayout).getView().getLayoutParams();
            layoutParams.leftMargin = (AndroidUtilities.displaySize.x - layoutParams.width) / 2;
            int i = AndroidUtilities.statusBarHeight;
            layoutParams.topMargin = (((AndroidUtilities.displaySize.y - layoutParams.height) - i) / 2) + i;
            ((ActionBarLayout) this.layersActionBarLayout).getView().setLayoutParams(layoutParams);
            if (AndroidUtilities.isSmallTablet() && getResources().getConfiguration().orientation != 2) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) ((ActionBarLayout) this.actionBarLayout).getView().getLayoutParams();
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                ((ActionBarLayout) this.actionBarLayout).getView().setLayoutParams(layoutParams2);
                return;
            }
            int iDp = (AndroidUtilities.displaySize.x / 100) * 35;
            if (iDp < AndroidUtilities.dp(320.0f)) {
                iDp = AndroidUtilities.dp(320.0f);
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) ((ActionBarLayout) this.actionBarLayout).getView().getLayoutParams();
            layoutParams3.width = iDp;
            layoutParams3.height = -1;
            ((ActionBarLayout) this.actionBarLayout).getView().setLayoutParams(layoutParams3);
            if (AndroidUtilities.isSmallTablet() && ((ActionBarLayout) this.actionBarLayout).getFragmentStack().size() == 2) {
                ((ActionBarLayout) this.actionBarLayout).getFragmentStack().get(1).onPause();
                ((ActionBarLayout) this.actionBarLayout).getFragmentStack().remove(1);
                ((ActionBarLayout) this.actionBarLayout).showLastFragment();
            }
        }
    }

    @Override
    public boolean needPresentFragment(BaseFragment baseFragment, boolean z, boolean z2, INavigationLayout iNavigationLayout) {
        return true;
    }

    @Override
    public void onBackPressed() throws FileNotFoundException {
        if (this.passcodeView.getVisibility() == 0) {
            finish();
            return;
        }
        if (PhotoViewer.getInstance().isVisible()) {
            PhotoViewer.getInstance().closePhoto(true, false);
            return;
        }
        if (!AndroidUtilities.isTablet()) {
            ((ActionBarLayout) this.actionBarLayout).onBackPressed();
        } else if (((ActionBarLayout) this.layersActionBarLayout).getView().getVisibility() == 0) {
            ((ActionBarLayout) this.layersActionBarLayout).onBackPressed();
        } else {
            ((ActionBarLayout) this.actionBarLayout).onBackPressed();
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
    public void onCreate(Bundle bundle) {
        ApplicationLoader.postInitApplication();
        requestWindowFeature(1);
        setTheme(R.style.Theme_TMessages);
        getWindow().setBackgroundDrawable(new ActivityWindowEmptyBackgroundDrawable());
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
                public boolean isActionBarVisible() {
                    return false;
                }
            };
            this.backgroundTablet = sizeNotifierFrameLayout;
            sizeNotifierFrameLayout.setOccupyStatusBar(false);
            this.backgroundTablet.setBackgroundImage(Theme.getCachedWallpaper(), Theme.isWallpaperMotion);
            relativeLayout.addView(this.backgroundTablet, LayoutHelper.createRelative(-1, -1));
            relativeLayout.addView(((ActionBarLayout) this.actionBarLayout).getView(), LayoutHelper.createRelative(-1, -1));
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(2130706432);
            relativeLayout.addView(frameLayout, LayoutHelper.createRelative(-1, -1));
            frameLayout.setOnTouchListener(new TodoItemMenu$$ExternalSyntheticLambda4(this, 4));
            frameLayout.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda464(2));
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.layersActionBarLayout = actionBarLayout;
            actionBarLayout.setRemoveActionBarExtraHeight(true);
            ((ActionBarLayout) this.layersActionBarLayout).setBackgroundView(frameLayout);
            ((ActionBarLayout) this.layersActionBarLayout).setUseAlphaAnimations(true);
            ((ActionBarLayout) this.layersActionBarLayout).getView().setBackgroundResource(R.drawable.boxshadow);
            relativeLayout.addView(((ActionBarLayout) this.layersActionBarLayout).getView(), LayoutHelper.createRelative(530, AndroidUtilities.isSmallTablet() ? 528 : 700));
            ((ActionBarLayout) this.layersActionBarLayout).setFragmentStack(layerFragmentsStack);
            ((ActionBarLayout) this.layersActionBarLayout).setDelegate(this);
            ((ActionBarLayout) this.layersActionBarLayout).setDrawerLayoutContainer(this.drawerLayoutContainer);
        } else {
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            this.drawerLayoutContainer.addView(relativeLayout2, LayoutHelper.createFrame(-1, -1.0f));
            SizeNotifierFrameLayout sizeNotifierFrameLayout2 = new SizeNotifierFrameLayout(this) {
                @Override
                public boolean isActionBarVisible() {
                    return false;
                }
            };
            this.backgroundTablet = sizeNotifierFrameLayout2;
            sizeNotifierFrameLayout2.setOccupyStatusBar(false);
            this.backgroundTablet.setBackgroundImage(Theme.getCachedWallpaper(), Theme.isWallpaperMotion);
            relativeLayout2.addView(this.backgroundTablet, LayoutHelper.createRelative(-1, -1));
            relativeLayout2.addView(((ActionBarLayout) this.actionBarLayout).getView(), LayoutHelper.createRelative(-1, -1));
        }
        this.drawerLayoutContainer.setParentActionBarLayout(this.actionBarLayout);
        ((ActionBarLayout) this.actionBarLayout).setDrawerLayoutContainer(this.drawerLayoutContainer);
        ((ActionBarLayout) this.actionBarLayout).setFragmentStack(mainFragmentsStack);
        ((ActionBarLayout) this.actionBarLayout).setDelegate(this);
        PasscodeView passcodeView = new PasscodeView(this);
        this.passcodeView = passcodeView;
        this.drawerLayoutContainer.addView(passcodeView, LayoutHelper.createFrame(-1, -1.0f));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeOtherAppActivities, this);
        ((ActionBarLayout) this.actionBarLayout).removeAllFragments();
        INavigationLayout iNavigationLayout = this.layersActionBarLayout;
        if (iNavigationLayout != null) {
            ((ActionBarLayout) iNavigationLayout).removeAllFragments();
        }
        handleIntent(getIntent(), false, bundle != null, false, UserConfig.selectedAccount, 0);
        needLayout();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        onFinish();
    }

    public void onFinishLogin() {
        handleIntent(this.passcodeSaveIntent, this.passcodeSaveIntentIsNew, this.passcodeSaveIntentIsRestore, true, this.passcodeSaveIntentAccount, this.passcodeSaveIntentState);
        ((ActionBarLayout) this.actionBarLayout).removeAllFragments();
        INavigationLayout iNavigationLayout = this.layersActionBarLayout;
        if (iNavigationLayout != null) {
            ((ActionBarLayout) iNavigationLayout).removeAllFragments();
        }
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.backgroundTablet;
        if (sizeNotifierFrameLayout != null) {
            sizeNotifierFrameLayout.setVisibility(0);
        }
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        ((ActionBarLayout) this.actionBarLayout).onLowMemory();
        if (AndroidUtilities.isTablet()) {
            ((ActionBarLayout) this.layersActionBarLayout).onLowMemory();
        }
    }

    @Override
    public void onMeasureOverride(int[] iArr) {
    }

    @Override
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        handleIntent(intent, true, false, false, UserConfig.selectedAccount, 0);
    }

    @Override
    public void onPause() {
        super.onPause();
        ((ActionBarLayout) this.actionBarLayout).onPause();
        if (AndroidUtilities.isTablet()) {
            ((ActionBarLayout) this.layersActionBarLayout).onPause();
        }
        ApplicationLoader.externalInterfacePaused = true;
        onPasscodePause();
        PasscodeView passcodeView = this.passcodeView;
        if (passcodeView != null) {
            passcodeView.onPause();
        }
    }

    @Override
    public boolean onPreIme() {
        return false;
    }

    @Override
    public void onRebuildAllFragments(INavigationLayout iNavigationLayout, boolean z) {
        if (AndroidUtilities.isTablet() && iNavigationLayout == this.layersActionBarLayout) {
            ((ActionBarLayout) this.actionBarLayout).rebuildAllFragmentViews(z, z);
        }
    }

    @Override
    public void onResume() throws FileNotFoundException {
        super.onResume();
        ((ActionBarLayout) this.actionBarLayout).onResume();
        if (AndroidUtilities.isTablet()) {
            ((ActionBarLayout) this.layersActionBarLayout).onResume();
        }
        ApplicationLoader.externalInterfacePaused = false;
        onPasscodeResume();
        if (this.passcodeView.getVisibility() != 0) {
            ((ActionBarLayout) this.actionBarLayout).onResume();
            if (AndroidUtilities.isTablet()) {
                ((ActionBarLayout) this.layersActionBarLayout).onResume();
                return;
            }
            return;
        }
        ((ActionBarLayout) this.actionBarLayout).dismissDialogs();
        if (AndroidUtilities.isTablet()) {
            ((ActionBarLayout) this.layersActionBarLayout).dismissDialogs();
        }
        this.passcodeView.onResume();
    }

    @Override
    public void onThemeProgress(float f) {
    }

    public void presentFragment(BaseFragment baseFragment) {
        INavigationLayout iNavigationLayout = this.actionBarLayout;
        iNavigationLayout.getClass();
        ((ActionBarLayout) iNavigationLayout).presentFragment(new INavigationLayout.NavigationParams(baseFragment));
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
    public boolean needPresentFragment(INavigationLayout iNavigationLayout, INavigationLayout.NavigationParams navigationParams) {
        return needPresentFragment(navigationParams.fragment, navigationParams.removeLast, navigationParams.noAnimation, iNavigationLayout);
    }

    public boolean presentFragment(BaseFragment baseFragment, boolean z, boolean z2) {
        return ((ActionBarLayout) this.actionBarLayout).presentFragment$1(baseFragment, z, z2);
    }
}
