package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class cx0 extends org.telegram.ui.ActionBar.j {
    public final String f46266a;
    public final fx0 f46267b;

    public cx0(fx0 fx0Var, String str) {
        this.f46267b = fx0Var;
        this.f46266a = str;
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
        fx0 fx0Var = this.f46267b;
        long j3 = fx0Var.h;
        long j10 = fx0Var.f47225f;
        String str = this.f46266a;
        if (i7 == -1) {
            if (!fx0Var.f47226n && fx0Var.f47227r) {
                i16 = ((org.telegram.ui.ActionBar.e2) fx0Var).currentAccount;
                SharedPreferences.Editor edit = org.telegram.messenger.np.s1(i16).f25270e7.edit();
                edit.putInt("notify2_" + str, 0).apply();
            }
        } else if (i7 == 1) {
            i10 = ((org.telegram.ui.ActionBar.e2) fx0Var).currentAccount;
            SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(i10).f25270e7;
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            edit2.putBoolean("custom_" + str, true);
            i11 = ((org.telegram.ui.ActionBar.e2) fx0Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) org.telegram.messenger.np.s1(i11).R.f(j10);
            if (fx0Var.f47227r) {
                edit2.putInt("notify2_" + str, 0);
                if (j3 == 0) {
                    i15 = ((org.telegram.ui.ActionBar.e2) fx0Var).currentAccount;
                    org.telegram.messenger.vr.a0(i15).E1(j10, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit2.putInt("notify2_" + str, 2);
                if (j3 == 0) {
                    i12 = ((org.telegram.ui.ActionBar.e2) fx0Var).currentAccount;
                    org.telegram.messenger.at.t(i12).N(j10);
                    i13 = ((org.telegram.ui.ActionBar.e2) fx0Var).currentAccount;
                    org.telegram.messenger.vr.a0(i13).E1(j10, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                    }
                }
            }
            edit2.apply();
            i14 = ((org.telegram.ui.ActionBar.e2) fx0Var).currentAccount;
            org.telegram.messenger.at.t(i14).c0(fx0Var.f47225f, fx0Var.h, true);
            if (fx0Var.f47228s != null) {
                ?? obj = new Object();
                obj.d = j10;
                obj.f50623b = true;
                int c10 = org.telegram.messenger.k5.c("notify2_", str, sharedPreferences, 0);
                obj.f50624c = c10;
                if (c10 != 0) {
                    obj.f50622a = org.telegram.messenger.k5.c("notifyuntil_", str, sharedPreferences, 0);
                }
                fx0Var.f47228s.d(obj);
            }
        }
        fx0Var.finishFragment();
    }
}
