package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.TLRPC;

public final class q01 extends org.telegram.ui.ActionBar.j {

    public final String f41482a;

    public final t01 f41483b;

    public q01(t01 t01Var, String str) {
        this.f41483b = t01Var;
        this.f41482a = str;
    }

    @Override
    public final void b(int i10) {
        t01 t01Var = this.f41483b;
        long j10 = t01Var.f42743f;
        long j11 = t01Var.f42742e;
        String str = this.f41482a;
        if (i10 == -1) {
            if (!t01Var.h && t01Var.f42744n) {
                MessagesController.getNotificationsSettings(((org.telegram.ui.ActionBar.n2) t01Var).currentAccount).edit().putInt("notify2_" + str, 0).apply();
            }
        } else if (i10 == 1) {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(((org.telegram.ui.ActionBar.n2) t01Var).currentAccount);
            SharedPreferences.Editor editorEdit = notificationsSettings.edit();
            editorEdit.putBoolean("custom_" + str, true);
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) t01Var).currentAccount).dialogs_dict.f(j11);
            if (t01Var.f42744n) {
                editorEdit.putInt("notify2_" + str, 0);
                if (j10 == 0) {
                    MessagesStorage.getInstance(((org.telegram.ui.ActionBar.n2) t01Var).currentAccount).setDialogFlags(j11, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                editorEdit.putInt("notify2_" + str, 2);
                if (j10 == 0) {
                    NotificationsController.getInstance(((org.telegram.ui.ActionBar.n2) t01Var).currentAccount).removeNotificationsForDialog(j11);
                    MessagesStorage.getInstance(((org.telegram.ui.ActionBar.n2) t01Var).currentAccount).setDialogFlags(j11, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                    }
                }
            }
            editorEdit.apply();
            NotificationsController.getInstance(((org.telegram.ui.ActionBar.n2) t01Var).currentAccount).updateServerNotificationsSettings(j11, j10);
            if (t01Var.f42745r != null) {
                fk0 fk0Var = new fk0();
                fk0Var.d = j11;
                fk0Var.f38152b = true;
                int iC = org.telegram.messenger.y1.c("notify2_", str, notificationsSettings, 0);
                fk0Var.f38153c = iC;
                if (iC != 0) {
                    fk0Var.f38151a = org.telegram.messenger.y1.c("notifyuntil_", str, notificationsSettings, 0);
                }
                t01Var.f42745r.l(fk0Var);
            }
        }
        t01Var.finishFragment();
    }
}
