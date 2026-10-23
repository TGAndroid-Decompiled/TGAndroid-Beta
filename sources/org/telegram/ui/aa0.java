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
public final class aa0 implements org.telegram.ui.Components.ne0, org.telegram.ui.ActionBar.z1 {
    public final LaunchActivity f35633a;

    public aa0(LaunchActivity launchActivity) {
        this.f35633a = launchActivity;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        Pattern pattern = LaunchActivity.E1;
        MessagesController.getInstance(this.f35633a.O).performLogout(2);
    }

    @Override
    public void h(org.telegram.ui.Components.pe0 pe0Var) {
        Pattern pattern = LaunchActivity.E1;
        SharedConfig.isWaitingForPasscodeEnter = false;
        LaunchActivity launchActivity = this.f35633a;
        Intent intent = launchActivity.L0;
        if (intent != null) {
            launchActivity.X(intent, launchActivity.M0, launchActivity.N0, true, null, false, true);
            launchActivity.L0 = null;
        }
        launchActivity.f33487q0.getView().setVisibility(0);
        launchActivity.f33487q0.V(true, true);
        ActionBarLayout actionBarLayout = launchActivity.f33487q0;
        org.telegram.ui.ActionBar.o2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment != null) {
            lastFragment.setTitleOverlayText(actionBarLayout.M0, actionBarLayout.N0, actionBarLayout.O0);
        }
        if (AndroidUtilities.isTablet()) {
            launchActivity.f33489r0.V(true, true);
            launchActivity.f33491s0.V(true, true);
            if (launchActivity.f33489r0.getView().getVisibility() == 4) {
                launchActivity.f33489r0.getView().setVisibility(0);
            }
            launchActivity.f33491s0.getView().setVisibility(0);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, pe0Var);
        try {
            NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
