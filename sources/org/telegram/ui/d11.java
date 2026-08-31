package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.TLRPC;
public final class d11 extends org.telegram.ui.ActionBar.j {
    public final String f35970a;
    public final g11 f35971b;

    public d11(g11 g11Var, String str) {
        this.f35971b = g11Var;
        this.f35970a = str;
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
        g11 g11Var = this.f35971b;
        long j10 = g11Var.f37060f;
        long j11 = g11Var.f37059e;
        String str = this.f35970a;
        if (i10 == -1) {
            if (!g11Var.h && g11Var.f37061n) {
                i17 = ((org.telegram.ui.ActionBar.p2) g11Var).currentAccount;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i17).edit();
                edit.putInt("notify2_" + str, 0).apply();
            }
        } else if (i10 == 1) {
            i11 = ((org.telegram.ui.ActionBar.p2) g11Var).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
            SharedPreferences.Editor edit2 = notificationsSettings.edit();
            edit2.putBoolean("custom_" + str, true);
            i12 = ((org.telegram.ui.ActionBar.p2) g11Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i12).dialogs_dict.f(j11);
            if (g11Var.f37061n) {
                edit2.putInt("notify2_" + str, 0);
                if (j10 == 0) {
                    i16 = ((org.telegram.ui.ActionBar.p2) g11Var).currentAccount;
                    MessagesStorage.getInstance(i16).setDialogFlags(j11, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit2.putInt("notify2_" + str, 2);
                if (j10 == 0) {
                    i13 = ((org.telegram.ui.ActionBar.p2) g11Var).currentAccount;
                    NotificationsController.getInstance(i13).removeNotificationsForDialog(j11);
                    i14 = ((org.telegram.ui.ActionBar.p2) g11Var).currentAccount;
                    MessagesStorage.getInstance(i14).setDialogFlags(j11, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                    }
                }
            }
            edit2.apply();
            i15 = ((org.telegram.ui.ActionBar.p2) g11Var).currentAccount;
            NotificationsController.getInstance(i15).updateServerNotificationsSettings(j11, j10);
            if (g11Var.f37062r != null) {
                ?? obj = new Object();
                obj.d = j11;
                obj.f38775b = true;
                int c3 = org.telegram.messenger.y3.c("notify2_", str, notificationsSettings, 0);
                obj.f38776c = c3;
                if (c3 != 0) {
                    obj.f38774a = org.telegram.messenger.y3.c("notifyuntil_", str, notificationsSettings, 0);
                }
                g11Var.f37062r.u(obj);
            }
        }
        g11Var.finishFragment();
    }
}
