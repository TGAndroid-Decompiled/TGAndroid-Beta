package org.telegram.ui;

import android.view.View;
import java.util.HashMap;
public final class c21 extends org.telegram.ui.Components.ra implements org.telegram.messenger.fs {
    public final org.telegram.ui.Components.ty T1;
    public final hi.e U1;
    public final fi.h6 V1;
    public final HashMap W1;
    public final int X1;
    public int Y1;
    public org.telegram.ui.Components.b51 Z1;

    public c21(org.telegram.ui.ActionBar.g2 r17, long r18, int r20, bi.d5 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c21.<init>(org.telegram.ui.ActionBar.g2, long, int, bi.d5):void");
    }

    @Override
    public final org.telegram.ui.Components.dk0 M0(org.telegram.ui.Components.ek0 ek0Var) {
        org.telegram.ui.Components.b51 b51Var = new org.telegram.ui.Components.b51(ek0Var, getContext(), this.f30223a, 0, false, new a5(this, 26), this.J0);
        this.Z1 = b51Var;
        b51Var.f33631r = false;
        return b51Var;
    }

    @Override
    public final CharSequence P0() {
        return org.telegram.messenger.gd.N0(2131744557, null);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.A5 && ((fi.h6) objArr[0]) == this.V1) {
            this.Z1.O(false);
            e1();
        }
    }

    public final void e1() {
        int abs;
        org.telegram.ui.Components.ty tyVar = this.T1;
        int L0 = tyVar.L0();
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(tyVar.N0() - L0) + 1;
        }
        fi.h6 h6Var = this.V1;
        if (h6Var != null) {
            int i7 = L0 + abs;
            int i10 = h6Var.i();
            int i11 = this.X1;
            if (i7 > i10 - i11) {
                h6Var.p(Math.min(100, Math.max(1, i11 / 2) * i11 * i11), false);
            }
        }
    }

    public final boolean f1(int i7, View view) {
        org.telegram.ui.Components.n41 G;
        org.telegram.ui.Components.b51 b51Var = this.Z1;
        if (b51Var == null || i7 == 0 || (G = b51Var.G(i7 - 1)) == null) {
            return false;
        }
        Object obj = G.H;
        if (obj instanceof org.telegram.messenger.fj) {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
            int e12 = fjVar.e1();
            Integer valueOf = Integer.valueOf(e12);
            HashMap hashMap = this.W1;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(e12));
                G.f37648e = false;
                ((org.telegram.ui.Cells.o7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(e12), fjVar.f24078l);
                G.f37648e = true;
                ((org.telegram.ui.Cells.o7) view).i(true, true);
            }
            hi.e eVar = this.U1;
            eVar.setEnabled(!hashMap.isEmpty());
            eVar.c(hashMap.size(), true);
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Y1 = this.V1.o();
        org.telegram.messenger.ks.f(this.f30223a).c(this, org.telegram.messenger.ks.A5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.V1.z(this.Y1);
        org.telegram.messenger.ks.f(this.f30223a).n(this, org.telegram.messenger.ks.A5);
    }
}
