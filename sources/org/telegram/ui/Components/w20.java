package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class w20 implements Runnable {
    public final int f32055a;
    public final y20 f32056b;
    public final String f32057c;
    public final int d;

    public w20(y20 y20Var, String str, int i10, int i11) {
        this.f32055a = i11;
        this.f32056b = y20Var;
        this.f32057c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f32055a) {
            case 0:
                y20 y20Var = this.f32056b;
                String str = this.f32057c;
                int i10 = this.d;
                if (y20Var.e != null) {
                    y20Var.e = null;
                    org.telegram.messenger.i0.g3(new w20(y20Var, str, i10, 1));
                    return;
                }
                return;
            default:
                y20 y20Var2 = this.f32056b;
                String str2 = this.f32057c;
                int i11 = this.d;
                ArrayList arrayList = null;
                y20Var2.e = null;
                if (!org.telegram.messenger.w3.T(y20Var2.f32707x.M1) && y20Var2.f32707x.N1 != null) {
                    arrayList = new ArrayList(y20Var2.f32707x.N1.participants.participants);
                }
                if (arrayList != null) {
                    Utilities.f14523g.c(new ag.g3(y20Var2, str2, i11, arrayList));
                } else {
                    y20Var2.h = false;
                }
                zf.m1 m1Var = y20Var2.d;
                boolean w9 = org.telegram.messenger.w3.w(3, y20Var2.f32707x.M1);
                if (org.telegram.messenger.w3.T(y20Var2.f32707x.M1)) {
                    j10 = y20Var2.f32707x.M1.f19794id;
                } else {
                    j10 = 0;
                }
                m1Var.g(str2, w9, false, true, false, j10, false, 2, i11);
                return;
        }
    }
}
