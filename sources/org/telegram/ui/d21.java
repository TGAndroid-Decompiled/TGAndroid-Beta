package org.telegram.ui;

import android.view.View;
import java.util.HashMap;
public final class d21 extends org.telegram.ui.Components.sa implements org.telegram.messenger.fs {
    public final org.telegram.ui.Components.uy T1;
    public final hi.d U1;
    public final fi.h6 V1;
    public final HashMap W1;
    public final int X1;
    public int Y1;
    public org.telegram.ui.Components.z41 Z1;

    public d21(org.telegram.ui.ActionBar.h2 r17, long r18, int r20, bi.x4 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d21.<init>(org.telegram.ui.ActionBar.h2, long, int, bi.x4):void");
    }

    @Override
    public final org.telegram.ui.Components.bk0 M0(org.telegram.ui.Components.ck0 ck0Var) {
        org.telegram.ui.Components.z41 z41Var = new org.telegram.ui.Components.z41(ck0Var, getContext(), this.f30187a, 0, false, new a5(this, 26), this.J0);
        this.Z1 = z41Var;
        z41Var.f42809r = false;
        return z41Var;
    }

    @Override
    public final CharSequence P0() {
        return org.telegram.messenger.gd.M0(2131744563, null);
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
        org.telegram.ui.Components.uy uyVar = this.T1;
        int L0 = uyVar.L0();
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(uyVar.N0() - L0) + 1;
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
        org.telegram.ui.Components.l41 G;
        org.telegram.ui.Components.z41 z41Var = this.Z1;
        if (z41Var == null || i7 == 0 || (G = z41Var.G(i7 - 1)) == null) {
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
                G.f37011e = false;
                ((org.telegram.ui.Cells.p7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(e12), fjVar.f23970l);
                G.f37011e = true;
                ((org.telegram.ui.Cells.p7) view).i(true, true);
            }
            hi.d dVar = this.U1;
            dVar.setEnabled(!hashMap.isEmpty());
            dVar.c(hashMap.size(), true);
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Y1 = this.V1.o();
        org.telegram.messenger.ks.f(this.f30187a).c(this, org.telegram.messenger.ks.A5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.V1.z(this.Y1);
        org.telegram.messenger.ks.f(this.f30187a).n(this, org.telegram.messenger.ks.A5);
    }
}
