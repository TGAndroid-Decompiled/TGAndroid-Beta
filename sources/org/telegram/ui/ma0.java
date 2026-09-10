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
public final class ma0 implements org.telegram.ui.Components.ae0, org.telegram.ui.ActionBar.c2 {
    public final LaunchActivity f34896a;

    public ma0(LaunchActivity launchActivity) {
        this.f34896a = launchActivity;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        Pattern pattern = LaunchActivity.B1;
        MessagesController.getInstance(this.f34896a.O).performLogout(2);
    }

    @Override
    public void g(org.telegram.ui.Components.be0 be0Var) {
        Pattern pattern = LaunchActivity.B1;
        SharedConfig.isWaitingForPasscodeEnter = false;
        LaunchActivity launchActivity = this.f34896a;
        Intent intent = launchActivity.L0;
        if (intent != null) {
            launchActivity.X(intent, launchActivity.M0, launchActivity.N0, true, null, false, true);
            launchActivity.L0 = null;
        }
        launchActivity.f29957q0.getView().setVisibility(0);
        launchActivity.f29957q0.U(true, true);
        ActionBarLayout actionBarLayout = launchActivity.f29957q0;
        org.telegram.ui.ActionBar.p2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment != null) {
            lastFragment.setTitleOverlayText(actionBarLayout.G0, actionBarLayout.H0, actionBarLayout.I0);
        }
        if (AndroidUtilities.isTablet()) {
            launchActivity.f29959r0.U(true, true);
            launchActivity.f29961s0.U(true, true);
            if (launchActivity.f29959r0.getView().getVisibility() == 4) {
                launchActivity.f29959r0.getView().setVisibility(0);
            }
            launchActivity.f29961s0.getView().setVisibility(0);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, be0Var);
        try {
            NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
