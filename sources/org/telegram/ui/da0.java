package org.telegram.ui;

import android.content.Intent;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class da0 implements org.telegram.ui.Components.ud0, org.telegram.ui.ActionBar.c2 {
    public final LaunchActivity f33567a;

    public da0(LaunchActivity launchActivity) {
        this.f33567a = launchActivity;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        Pattern pattern = LaunchActivity.f31612y1;
        MessagesController.getInstance(this.f33567a.L).performLogout(2);
    }

    @Override
    public void j(org.telegram.ui.Components.vd0 vd0Var) {
        Pattern pattern = LaunchActivity.f31612y1;
        SharedConfig.isWaitingForPasscodeEnter = false;
        LaunchActivity launchActivity = this.f33567a;
        Intent intent = launchActivity.I0;
        if (intent != null) {
            launchActivity.X(intent, launchActivity.J0, launchActivity.K0, true, null, false, true);
            launchActivity.I0 = null;
        }
        launchActivity.f31638n0.getView().setVisibility(0);
        launchActivity.f31638n0.U(true, true);
        ActionBarLayout actionBarLayout = launchActivity.f31638n0;
        org.telegram.ui.ActionBar.p2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment != null) {
            lastFragment.setTitleOverlayText(actionBarLayout.D0, actionBarLayout.E0, actionBarLayout.F0);
        }
        if (AndroidUtilities.isTablet()) {
            launchActivity.f31640o0.U(true, true);
            launchActivity.f31642p0.U(true, true);
            if (launchActivity.f31640o0.getView().getVisibility() == 4) {
                launchActivity.f31640o0.getView().setVisibility(0);
            }
            launchActivity.f31642p0.getView().setVisibility(0);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, vd0Var);
        try {
            NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
