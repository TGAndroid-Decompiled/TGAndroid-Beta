package org.telegram.ui;

import android.view.View;
import java.util.HashMap;
public final class f21 extends org.telegram.ui.Components.ma implements org.telegram.messenger.ls {
    public final org.telegram.ui.Components.jy S1;
    public final fi.d T1;
    public final di.r6 U1;
    public final HashMap V1;
    public final int W1;
    public int X1;
    public org.telegram.ui.Components.m41 Y1;

    public f21(org.telegram.ui.ActionBar.f2 r17, long r18, int r20, bi.f4 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f21.<init>(org.telegram.ui.ActionBar.f2, long, int, bi.f4):void");
    }

    @Override
    public final org.telegram.ui.Components.oj0 L0(org.telegram.ui.Components.pj0 pj0Var) {
        org.telegram.ui.Components.m41 m41Var = new org.telegram.ui.Components.m41(pj0Var, getContext(), this.f28669a, 0, false, new a5(this, 26), this.I0);
        this.Y1 = m41Var;
        m41Var.f35845r = false;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.id.M0(2131744798, null);
    }

    public final void d1() {
        int abs;
        org.telegram.ui.Components.jy jyVar = this.S1;
        int L0 = jyVar.L0();
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(jyVar.N0() - L0) + 1;
        }
        di.r6 r6Var = this.U1;
        if (r6Var != null) {
            int i7 = L0 + abs;
            int i10 = r6Var.i();
            int i11 = this.W1;
            if (i7 > i10 - i11) {
                r6Var.p(Math.min(100, Math.max(1, i11 / 2) * i11 * i11), false);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25113x5 && ((di.r6) objArr[0]) == this.U1) {
            this.Y1.O(false);
            d1();
        }
    }

    public final boolean e1(int i7, View view) {
        org.telegram.ui.Components.x31 G;
        org.telegram.ui.Components.m41 m41Var = this.Y1;
        if (m41Var == null || i7 == 0 || (G = m41Var.G(i7 - 1)) == null) {
            return false;
        }
        Object obj = G.G;
        if (obj instanceof org.telegram.messenger.ij) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
            int e12 = ijVar.e1();
            Integer valueOf = Integer.valueOf(e12);
            HashMap hashMap = this.V1;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(e12));
                G.f40150e = false;
                ((org.telegram.ui.Cells.o7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(e12), ijVar.f23270l);
                G.f40150e = true;
                ((org.telegram.ui.Cells.o7) view).i(true, true);
            }
            fi.d dVar = this.T1;
            dVar.setEnabled(!hashMap.isEmpty());
            dVar.c(hashMap.size(), true);
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.X1 = this.U1.o();
        org.telegram.messenger.qs.f(this.f28669a).c(this, org.telegram.messenger.qs.f25113x5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U1.z(this.X1);
        org.telegram.messenger.qs.f(this.f28669a).n(this, org.telegram.messenger.qs.f25113x5);
    }
}
