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
public final class ea0 implements org.telegram.ui.Components.wd0, org.telegram.ui.ActionBar.c2 {
    public final LaunchActivity f36454a;

    public ea0(LaunchActivity launchActivity) {
        this.f36454a = launchActivity;
    }

    @Override
    public void h(org.telegram.ui.Components.xd0 xd0Var) {
        Pattern pattern = LaunchActivity.f34134y1;
        SharedConfig.isWaitingForPasscodeEnter = false;
        LaunchActivity launchActivity = this.f36454a;
        Intent intent = launchActivity.I0;
        if (intent != null) {
            launchActivity.X(intent, launchActivity.J0, launchActivity.K0, true, null, false, true);
            launchActivity.I0 = null;
        }
        launchActivity.f34160n0.getView().setVisibility(0);
        launchActivity.f34160n0.U(true, true);
        ActionBarLayout actionBarLayout = launchActivity.f34160n0;
        org.telegram.ui.ActionBar.p2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment != null) {
            lastFragment.setTitleOverlayText(actionBarLayout.D0, actionBarLayout.E0, actionBarLayout.F0);
        }
        if (AndroidUtilities.isTablet()) {
            launchActivity.f34162o0.U(true, true);
            launchActivity.f34164p0.U(true, true);
            if (launchActivity.f34162o0.getView().getVisibility() == 4) {
                launchActivity.f34162o0.getView().setVisibility(0);
            }
            launchActivity.f34164p0.getView().setVisibility(0);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, xd0Var);
        try {
            NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        Pattern pattern = LaunchActivity.f34134y1;
        MessagesController.getInstance(this.f36454a.L).performLogout(2);
    }
}
