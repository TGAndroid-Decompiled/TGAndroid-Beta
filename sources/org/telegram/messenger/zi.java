package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.sn;
public final class zi implements Runnable {
    public final int f20322a = 0;
    public final int f20323b;
    public final int f20324c;
    public final boolean d;
    public final Object e;
    public final Object f20325f;

    public zi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11, boolean z10) {
        this.e = sendMessagesHelper;
        this.f20325f = message;
        this.f20323b = i10;
        this.f20324c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        TLRPC.Document f7;
        hg.n nVar;
        int i10;
        switch (this.f20322a) {
            case 0:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$101((TLRPC.Message) this.f20325f, this.f20323b, this.f20324c, this.d);
                return;
            case 1:
                sn snVar = (sn) this.e;
                fl0 fl0Var = (fl0) this.f20325f;
                org.telegram.ui.ActionBar.m1 m1Var = snVar.f41481c9;
                if (m1Var != null && snVar.fragmentView != null && !m1Var.isShowing() && AndroidUtilities.isActivityRunning(snVar.getParentActivity())) {
                    snVar.f41481c9.showAtLocation(snVar.f41734x0, 51, this.f20323b, this.f20324c);
                    if (this.d && fl0Var != null) {
                        fl0Var.r(true);
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.kf(snVar, 23), 420L);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.yb ybVar = (org.telegram.ui.Components.yb) this.e;
                ah.i1 i1Var = (ah.i1) this.f20325f;
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                long j10 = i1Var.f785g;
                if (j10 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(i1Var.f784f);
                    if (tL_availableReaction != null) {
                        f7 = tL_availableReaction.activate_animation;
                    } else {
                        return;
                    }
                } else {
                    f7 = org.telegram.ui.Components.p5.f(UserConfig.selectedAccount, j10);
                }
                if (f7 != null && R != null) {
                    org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(R);
                    int i11 = ybVar.f32875a.h;
                    if (this.d) {
                        nVar = new hg.n(this.f20323b, this.f20324c, R, 7);
                    } else {
                        nVar = null;
                    }
                    a02.y(i11, f7, nVar).k(true);
                    return;
                }
                return;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) this.f20325f;
                int i12 = this.f20323b;
                boolean z10 = this.d;
                if (i12 == 3) {
                    SharedPreferences.Editor edit = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z10) {
                        edit.remove("EnableAllStories");
                    } else {
                        edit.putBoolean("EnableAllStories", true);
                    }
                    edit.apply();
                    notificationsSettingsActivity.getNotificationsController().updateServerNotificationsSettings(i12);
                } else if (i12 != 4 && i12 != 5) {
                    NotificationsController notificationsController = notificationsSettingsActivity.getNotificationsController();
                    if (!z10) {
                        i10 = 0;
                    } else {
                        i10 = Integer.MAX_VALUE;
                    }
                    notificationsController.setGlobalNotificationsEnabled(i12, i10);
                } else {
                    SharedPreferences.Editor edit2 = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z10) {
                        edit2.putBoolean("EnableReactionsMessages", false);
                        edit2.putBoolean("EnableReactionsStories", false);
                    } else {
                        edit2.putBoolean("EnableReactionsMessages", true);
                        edit2.putBoolean("EnableReactionsStories", true);
                    }
                    edit2.apply();
                    notificationsSettingsActivity.getNotificationsController().updateServerNotificationsSettings(i12);
                    notificationsSettingsActivity.getNotificationsController().deleteNotificationChannelGlobal(i12);
                }
                i5Var.e.b(0, !z10, true);
                notificationsSettingsActivity.f33521c.m(this.f20324c);
                return;
        }
    }

    public zi(sn snVar, int i10, int i11, boolean z10, fl0 fl0Var) {
        this.e = snVar;
        this.f20323b = i10;
        this.f20324c = i11;
        this.d = z10;
        this.f20325f = fl0Var;
    }

    public zi(org.telegram.ui.Components.yb ybVar, ah.i1 i1Var, boolean z10, int i10, int i11) {
        this.e = ybVar;
        this.f20325f = i1Var;
        this.d = z10;
        this.f20323b = i10;
        this.f20324c = i11;
    }

    public zi(NotificationsSettingsActivity notificationsSettingsActivity, int i10, boolean z10, org.telegram.ui.Cells.i5 i5Var, int i11) {
        this.e = notificationsSettingsActivity;
        this.f20323b = i10;
        this.d = z10;
        this.f20325f = i5Var;
        this.f20324c = i11;
    }
}
