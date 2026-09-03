package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.TLRPC;
public final class h11 extends org.telegram.ui.ActionBar.j {
    public final String f37198a;
    public final k11 f37199b;

    public h11(k11 k11Var, String str) {
        this.f37199b = k11Var;
        this.f37198a = str;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        k11 k11Var = this.f37199b;
        long j10 = k11Var.f38163f;
        long j11 = k11Var.f38162e;
        String str = this.f37198a;
        if (i10 == -1) {
            if (!k11Var.h && k11Var.f38164n) {
                i17 = ((org.telegram.ui.ActionBar.p2) k11Var).currentAccount;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i17).edit();
                edit.putInt("notify2_" + str, 0).apply();
            }
        } else if (i10 == 1) {
            i11 = ((org.telegram.ui.ActionBar.p2) k11Var).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
            SharedPreferences.Editor edit2 = notificationsSettings.edit();
            edit2.putBoolean("custom_" + str, true);
            i12 = ((org.telegram.ui.ActionBar.p2) k11Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i12).dialogs_dict.f(j11);
            if (k11Var.f38164n) {
                edit2.putInt("notify2_" + str, 0);
                if (j10 == 0) {
                    i16 = ((org.telegram.ui.ActionBar.p2) k11Var).currentAccount;
                    MessagesStorage.getInstance(i16).setDialogFlags(j11, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit2.putInt("notify2_" + str, 2);
                if (j10 == 0) {
                    i13 = ((org.telegram.ui.ActionBar.p2) k11Var).currentAccount;
                    NotificationsController.getInstance(i13).removeNotificationsForDialog(j11);
                    i14 = ((org.telegram.ui.ActionBar.p2) k11Var).currentAccount;
                    MessagesStorage.getInstance(i14).setDialogFlags(j11, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                    }
                }
            }
            edit2.apply();
            i15 = ((org.telegram.ui.ActionBar.p2) k11Var).currentAccount;
            NotificationsController.getInstance(i15).updateServerNotificationsSettings(j11, j10);
            if (k11Var.f38165r != null) {
                ?? obj = new Object();
                obj.d = j11;
                obj.f38687b = true;
                int c3 = org.telegram.messenger.y3.c("notify2_", str, notificationsSettings, 0);
                obj.f38688c = c3;
                if (c3 != 0) {
                    obj.f38686a = org.telegram.messenger.y3.c("notifyuntil_", str, notificationsSettings, 0);
                }
                k11Var.f38165r.u(obj);
            }
        }
        k11Var.finishFragment();
    }
}
