package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class dx0 extends org.telegram.ui.ActionBar.j {
    public final String f45157a;
    public final gx0 f45158b;

    public dx0(gx0 gx0Var, String str) {
        this.f45158b = gx0Var;
        this.f45157a = str;
    }

    @Override
    public final void b(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        gx0 gx0Var = this.f45158b;
        long j3 = gx0Var.h;
        long j10 = gx0Var.f46135f;
        String str = this.f45157a;
        if (i7 == -1) {
            if (!gx0Var.f46136n && gx0Var.f46137r) {
                i16 = ((org.telegram.ui.ActionBar.f2) gx0Var).currentAccount;
                SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(i16).f24749d7.edit();
                edit.putInt("notify2_" + str, 0).apply();
            }
        } else if (i7 == 1) {
            i10 = ((org.telegram.ui.ActionBar.f2) gx0Var).currentAccount;
            SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i10).f24749d7;
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            edit2.putBoolean("custom_" + str, true);
            i11 = ((org.telegram.ui.ActionBar.f2) gx0Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) org.telegram.messenger.qp.s1(i11).Q.f(j10);
            if (gx0Var.f46137r) {
                edit2.putInt("notify2_" + str, 0);
                if (j3 == 0) {
                    i15 = ((org.telegram.ui.ActionBar.f2) gx0Var).currentAccount;
                    org.telegram.messenger.yr.a0(i15).E1(j10, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit2.putInt("notify2_" + str, 2);
                if (j3 == 0) {
                    i12 = ((org.telegram.ui.ActionBar.f2) gx0Var).currentAccount;
                    org.telegram.messenger.dt.t(i12).N(j10);
                    i13 = ((org.telegram.ui.ActionBar.f2) gx0Var).currentAccount;
                    org.telegram.messenger.yr.a0(i13).E1(j10, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                    }
                }
            }
            edit2.apply();
            i14 = ((org.telegram.ui.ActionBar.f2) gx0Var).currentAccount;
            org.telegram.messenger.dt.t(i14).c0(gx0Var.f46135f, gx0Var.h, true);
            if (gx0Var.f46138s != null) {
                ?? obj = new Object();
                obj.d = j10;
                obj.f48414b = true;
                int c10 = org.telegram.messenger.k5.c("notify2_", str, sharedPreferences, 0);
                obj.f48415c = c10;
                if (c10 != 0) {
                    obj.f48413a = org.telegram.messenger.k5.c("notifyuntil_", str, sharedPreferences, 0);
                }
                gx0Var.f46138s.t(obj);
            }
        }
        gx0Var.finishFragment();
    }
}
