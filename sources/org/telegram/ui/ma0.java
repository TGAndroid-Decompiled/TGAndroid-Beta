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
public final class ma0 implements org.telegram.ui.Components.te0, org.telegram.ui.ActionBar.a2 {
    public final LaunchActivity f39864a;

    public ma0(LaunchActivity launchActivity) {
        this.f39864a = launchActivity;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        Pattern pattern = LaunchActivity.B1;
        MessagesController.getInstance(this.f39864a.O).performLogout(2);
    }

    @Override
    public void i(org.telegram.ui.Components.ue0 ue0Var) {
        Pattern pattern = LaunchActivity.B1;
        SharedConfig.isWaitingForPasscodeEnter = false;
        LaunchActivity launchActivity = this.f39864a;
        Intent intent = launchActivity.L0;
        if (intent != null) {
            launchActivity.X(intent, launchActivity.M0, launchActivity.N0, true, null, false, true);
            launchActivity.L0 = null;
        }
        launchActivity.f33845q0.getView().setVisibility(0);
        launchActivity.f33845q0.U(true, true);
        ActionBarLayout actionBarLayout = launchActivity.f33845q0;
        org.telegram.ui.ActionBar.n2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment != null) {
            lastFragment.setTitleOverlayText(actionBarLayout.G0, actionBarLayout.H0, actionBarLayout.I0);
        }
        if (AndroidUtilities.isTablet()) {
            launchActivity.f33847r0.U(true, true);
            launchActivity.f33849s0.U(true, true);
            if (launchActivity.f33847r0.getView().getVisibility() == 4) {
                launchActivity.f33847r0.getView().setVisibility(0);
            }
            launchActivity.f33849s0.getView().setVisibility(0);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, ue0Var);
        try {
            NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
