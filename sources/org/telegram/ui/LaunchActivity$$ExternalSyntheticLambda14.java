package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.PasscodeView;

public final class LaunchActivity$$ExternalSyntheticLambda14 implements AlertDialog.OnButtonClickListener, PasscodeView.PasscodeViewDelegate {
    public final int $r8$classId;
    public final LaunchActivity f$0;

    public LaunchActivity$$ExternalSyntheticLambda14(LaunchActivity launchActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = launchActivity;
    }

    @Override
    public void didAcceptedPassword(PasscodeView passcodeView) throws Throwable {
        LaunchActivity launchActivity = this.f$0;
        launchActivity.getClass();
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = launchActivity.passcodeSaveIntent;
        if (intent != null) {
            launchActivity.handleIntent(intent, launchActivity.passcodeSaveIntentIsNew, launchActivity.passcodeSaveIntentIsRestore, true, null, false, true);
            launchActivity.passcodeSaveIntent = null;
        }
        launchActivity.actionBarLayout.getView().setVisibility(0);
        ActionBarLayout actionBarLayout = launchActivity.actionBarLayout;
        actionBarLayout.getClass();
        actionBarLayout.rebuildAllFragmentViews(true, true);
        ActionBarLayout actionBarLayout2 = launchActivity.actionBarLayout;
        BaseFragment lastFragment = actionBarLayout2.getLastFragment();
        if (lastFragment != null) {
            lastFragment.setTitleOverlayText(actionBarLayout2.titleOverlayText, actionBarLayout2.titleOverlayTextId, actionBarLayout2.overlayAction);
        }
        if (AndroidUtilities.isTablet()) {
            ActionBarLayout actionBarLayout3 = launchActivity.layersActionBarLayout;
            actionBarLayout3.getClass();
            actionBarLayout3.rebuildAllFragmentViews(true, true);
            ActionBarLayout actionBarLayout4 = launchActivity.rightActionBarLayout;
            actionBarLayout4.getClass();
            actionBarLayout4.rebuildAllFragmentViews(true, true);
            if (launchActivity.layersActionBarLayout.getView().getVisibility() == 4) {
                launchActivity.layersActionBarLayout.getView().setVisibility(0);
            }
            launchActivity.rightActionBarLayout.getView().setVisibility(0);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, passcodeView);
        try {
            NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                MessagesController.getInstance(this.f$0.currentAccount).performLogout(2);
                break;
            case 1:
                this.f$0.presentFragment(new LanguageSelectActivity());
                break;
            case 2:
                this.f$0.presentFragment(new CacheControlActivity());
                break;
            default:
                LaunchActivity launchActivity = this.f$0;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    launchActivity.startActivity(intent);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                break;
        }
    }
}
