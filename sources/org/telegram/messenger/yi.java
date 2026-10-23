package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.qn;
public final class yi implements Runnable {
    public final int f20187a = 0;
    public final int f20188b;
    public final int f20189c;
    public final boolean d;
    public final Object e;
    public final Object f20190f;

    public yi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11, boolean z10) {
        this.e = sendMessagesHelper;
        this.f20190f = message;
        this.f20188b = i10;
        this.f20189c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        TLRPC.Document f7;
        hg.n nVar;
        int i10;
        switch (this.f20187a) {
            case 0:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$101((TLRPC.Message) this.f20190f, this.f20188b, this.f20189c, this.d);
                return;
            case 1:
                qn qnVar = (qn) this.e;
                dl0 dl0Var = (dl0) this.f20190f;
                org.telegram.ui.ActionBar.m1 m1Var = qnVar.Q8;
                if (m1Var != null && qnVar.fragmentView != null && !m1Var.isShowing() && AndroidUtilities.isActivityRunning(qnVar.getParentActivity())) {
                    qnVar.Q8.showAtLocation(qnVar.f40905x0, 51, this.f20188b, this.f20189c);
                    if (this.d && dl0Var != null) {
                        dl0Var.r(true);
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.kf(qnVar, 22), 420L);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.ac acVar = (org.telegram.ui.Components.ac) this.e;
                ah.i1 i1Var = (ah.i1) this.f20190f;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                long j10 = i1Var.f784g;
                if (j10 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(i1Var.f783f);
                    if (tL_availableReaction != null) {
                        f7 = tL_availableReaction.activate_animation;
                    } else {
                        return;
                    }
                } else {
                    f7 = org.telegram.ui.Components.r5.f(UserConfig.selectedAccount, j10);
                }
                if (f7 != null && R != null) {
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(R);
                    int i11 = acVar.f24571a.h;
                    if (this.d) {
                        nVar = new hg.n(this.f20188b, this.f20189c, R, 7);
                    } else {
                        nVar = null;
                    }
                    a02.y(i11, f7, nVar).k(true);
                    return;
                }
                return;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) this.f20190f;
                int i12 = this.f20188b;
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
                notificationsSettingsActivity.f33222c.m(this.f20189c);
                return;
        }
    }

    public yi(qn qnVar, int i10, int i11, boolean z10, dl0 dl0Var) {
        this.e = qnVar;
        this.f20188b = i10;
        this.f20189c = i11;
        this.d = z10;
        this.f20190f = dl0Var;
    }

    public yi(org.telegram.ui.Components.ac acVar, ah.i1 i1Var, boolean z10, int i10, int i11) {
        this.e = acVar;
        this.f20190f = i1Var;
        this.d = z10;
        this.f20188b = i10;
        this.f20189c = i11;
    }

    public yi(NotificationsSettingsActivity notificationsSettingsActivity, int i10, boolean z10, org.telegram.ui.Cells.i5 i5Var, int i11) {
        this.e = notificationsSettingsActivity;
        this.f20188b = i10;
        this.d = z10;
        this.f20190f = i5Var;
        this.f20189c = i11;
    }
}
