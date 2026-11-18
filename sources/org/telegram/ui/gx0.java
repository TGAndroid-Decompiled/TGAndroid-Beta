package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class gx0 extends org.telegram.ui.ActionBar.j {
    public final String f48171a;
    public final jx0 f48172b;

    public gx0(jx0 jx0Var, String str) {
        this.f48172b = jx0Var;
        this.f48171a = str;
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
        jx0 jx0Var = this.f48172b;
        long j3 = jx0Var.h;
        long j10 = jx0Var.f49114f;
        String str = this.f48171a;
        if (i7 == -1) {
            if (!jx0Var.f49115n && jx0Var.f49116r) {
                i16 = ((org.telegram.ui.ActionBar.h2) jx0Var).currentAccount;
                SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(i16).f25660g7.edit();
                edit.putInt("notify2_" + str, 0).apply();
            }
        } else if (i7 == 1) {
            i10 = ((org.telegram.ui.ActionBar.h2) jx0Var).currentAccount;
            SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i10).f25660g7;
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            edit2.putBoolean("custom_" + str, true);
            i11 = ((org.telegram.ui.ActionBar.h2) jx0Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) org.telegram.messenger.mp.u1(i11).R.f(j10);
            if (jx0Var.f49116r) {
                edit2.putInt("notify2_" + str, 0);
                if (j3 == 0) {
                    i15 = ((org.telegram.ui.ActionBar.h2) jx0Var).currentAccount;
                    org.telegram.messenger.tr.a0(i15).E1(j10, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit2.putInt("notify2_" + str, 2);
                if (j3 == 0) {
                    i12 = ((org.telegram.ui.ActionBar.h2) jx0Var).currentAccount;
                    org.telegram.messenger.xs.t(i12).N(j10);
                    i13 = ((org.telegram.ui.ActionBar.h2) jx0Var).currentAccount;
                    org.telegram.messenger.tr.a0(i13).E1(j10, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                    }
                }
            }
            edit2.apply();
            i14 = ((org.telegram.ui.ActionBar.h2) jx0Var).currentAccount;
            org.telegram.messenger.xs.t(i14).c0(jx0Var.f49114f, jx0Var.h, true);
            if (jx0Var.f49117s != null) {
                ?? obj = new Object();
                obj.d = j10;
                obj.f52288b = true;
                int c10 = org.telegram.messenger.f3.c("notify2_", str, sharedPreferences, 0);
                obj.f52289c = c10;
                if (c10 != 0) {
                    obj.f52287a = org.telegram.messenger.f3.c("notifyuntil_", str, sharedPreferences, 0);
                }
                jx0Var.f49117s.k(obj);
            }
        }
        jx0Var.finishFragment();
    }
}
