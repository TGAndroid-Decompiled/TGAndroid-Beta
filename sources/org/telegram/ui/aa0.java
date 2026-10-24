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
public final class aa0 implements org.telegram.ui.Components.le0, org.telegram.ui.ActionBar.z1 {
    public final LaunchActivity f35717a;

    public aa0(LaunchActivity launchActivity) {
        this.f35717a = launchActivity;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        Pattern pattern = LaunchActivity.D1;
        MessagesController.getInstance(this.f35717a.O).performLogout(2);
    }

    @Override
    public void h(org.telegram.ui.Components.ne0 ne0Var) {
        Pattern pattern = LaunchActivity.D1;
        SharedConfig.isWaitingForPasscodeEnter = false;
        LaunchActivity launchActivity = this.f35717a;
        Intent intent = launchActivity.L0;
        if (intent != null) {
            launchActivity.X(intent, launchActivity.M0, launchActivity.N0, true, null, false, true);
            launchActivity.L0 = null;
        }
        launchActivity.f33489q0.getView().setVisibility(0);
        launchActivity.f33489q0.V(true, true);
        ActionBarLayout actionBarLayout = launchActivity.f33489q0;
        org.telegram.ui.ActionBar.o2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment != null) {
            lastFragment.setTitleOverlayText(actionBarLayout.M0, actionBarLayout.N0, actionBarLayout.O0);
        }
        if (AndroidUtilities.isTablet()) {
            launchActivity.f33491r0.V(true, true);
            launchActivity.f33493s0.V(true, true);
            if (launchActivity.f33491r0.getView().getVisibility() == 4) {
                launchActivity.f33491r0.getView().setVisibility(0);
            }
            launchActivity.f33493s0.getView().setVisibility(0);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, ne0Var);
        try {
            NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
