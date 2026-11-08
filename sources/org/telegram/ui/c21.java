package org.telegram.ui;

import android.view.View;
import java.util.HashMap;
public final class c21 extends org.telegram.ui.Components.na implements org.telegram.messenger.ls {
    public final org.telegram.ui.Components.ky P1;
    public final fi.d Q1;
    public final di.q6 R1;
    public final HashMap S1;
    public final int T1;
    public int U1;
    public org.telegram.ui.Components.l41 V1;

    public c21(org.telegram.ui.ActionBar.f2 r17, long r18, int r20, bi.f4 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c21.<init>(org.telegram.ui.ActionBar.f2, long, int, bi.f4):void");
    }

    @Override
    public final org.telegram.ui.Components.oj0 L0(org.telegram.ui.Components.pj0 pj0Var) {
        org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(pj0Var, getContext(), this.f28616a, 0, false, new a5(this, 26), this.I0);
        this.V1 = l41Var;
        l41Var.f35528r = false;
        return l41Var;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.id.M0(2131744801, null);
    }

    public final void d1() {
        int abs;
        org.telegram.ui.Components.ky kyVar = this.P1;
        int L0 = kyVar.L0();
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(kyVar.N0() - L0) + 1;
        }
        di.q6 q6Var = this.R1;
        if (q6Var != null) {
            int i7 = L0 + abs;
            int i10 = q6Var.i();
            int i11 = this.T1;
            if (i7 > i10 - i11) {
                q6Var.p(Math.min(100, Math.max(1, i11 / 2) * i11 * i11), false);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25109x5 && ((di.q6) objArr[0]) == this.R1) {
            this.V1.O(false);
            d1();
        }
    }

    public final boolean e1(int i7, View view) {
        org.telegram.ui.Components.x31 G;
        org.telegram.ui.Components.l41 l41Var = this.V1;
        if (l41Var == null || i7 == 0 || (G = l41Var.G(i7 - 1)) == null) {
            return false;
        }
        Object obj = G.G;
        if (obj instanceof org.telegram.messenger.ij) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
            int f12 = ijVar.f1();
            Integer valueOf = Integer.valueOf(f12);
            HashMap hashMap = this.S1;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(f12));
                G.f40174e = false;
                ((org.telegram.ui.Cells.o7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(f12), ijVar.f23266l);
                G.f40174e = true;
                ((org.telegram.ui.Cells.o7) view).i(true, true);
            }
            fi.d dVar = this.Q1;
            dVar.setEnabled(!hashMap.isEmpty());
            dVar.c(hashMap.size(), true);
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U1 = this.R1.o();
        org.telegram.messenger.qs.f(this.f28616a).c(this, org.telegram.messenger.qs.f25109x5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.R1.z(this.U1);
        org.telegram.messenger.qs.f(this.f28616a).n(this, org.telegram.messenger.qs.f25109x5);
    }
}
