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
public final class la0 implements org.telegram.ui.Components.be0, org.telegram.ui.ActionBar.b2 {
    public final LaunchActivity f35303a;

    public la0(LaunchActivity launchActivity) {
        this.f35303a = launchActivity;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        Pattern pattern = LaunchActivity.B1;
        MessagesController.getInstance(this.f35303a.O).performLogout(2);
    }

    @Override
    public void j(org.telegram.ui.Components.ce0 ce0Var) {
        Pattern pattern = LaunchActivity.B1;
        SharedConfig.isWaitingForPasscodeEnter = false;
        LaunchActivity launchActivity = this.f35303a;
        Intent intent = launchActivity.L0;
        if (intent != null) {
            launchActivity.X(intent, launchActivity.M0, launchActivity.N0, true, null, false, true);
            launchActivity.L0 = null;
        }
        launchActivity.f31132q0.getView().setVisibility(0);
        launchActivity.f31132q0.U(true, true);
        ActionBarLayout actionBarLayout = launchActivity.f31132q0;
        org.telegram.ui.ActionBar.o2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment != null) {
            lastFragment.setTitleOverlayText(actionBarLayout.G0, actionBarLayout.H0, actionBarLayout.I0);
        }
        if (AndroidUtilities.isTablet()) {
            launchActivity.f31134r0.U(true, true);
            launchActivity.f31136s0.U(true, true);
            if (launchActivity.f31134r0.getView().getVisibility() == 4) {
                launchActivity.f31134r0.getView().setVisibility(0);
            }
            launchActivity.f31136s0.getView().setVisibility(0);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, ce0Var);
        try {
            NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
