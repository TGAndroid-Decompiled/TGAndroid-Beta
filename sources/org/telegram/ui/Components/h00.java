package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class h00 extends vk0 {
    public final n00 f28907c;

    public h00(n00 n00Var) {
        this.f28907c = n00Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f == 2) {
            int b10 = q1Var.b();
            n00 n00Var = this.f28907c;
            if (b10 >= n00Var.f30970n0 && q1Var.b() <= n00Var.f30971o0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f28907c.f30968k0;
    }

    @Override
    public final int j(int i9) {
        n00 n00Var = this.f28907c;
        n00Var.getClass();
        if (i9 == 0) {
            return 0;
        }
        if (i9 != n00Var.f30969l0 && i9 != n00Var.f30972p0 && i9 != n00Var.f30976t0) {
            if (i9 != n00Var.m0 && i9 != n00Var.f30973q0) {
                return 2;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void v(f2.q1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h00.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        m00 m00Var;
        m00 m00Var2;
        n00 n00Var = this.f28907c;
        if (i9 == 0) {
            boolean z10 = false;
            m00Var = new m00(n00Var, n00Var.getContext(), ((n00Var.V instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || n00Var.W != null) ? true : true, n00Var.f30959b0, n00Var.Z, n00Var.f30958a0);
            n00Var.f30967j0 = m00Var;
        } else {
            m00Var = null;
            if (i9 == 1) {
                ?? b9Var = new org.telegram.ui.Cells.b9(n00Var.getContext());
                b9Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
                m00Var2 = b9Var;
            } else if (i9 == 2) {
                ?? g4Var = new org.telegram.ui.Cells.g4(n00Var.getContext(), 1, 0, false);
                g4Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                m00Var = g4Var;
            } else if (i9 == 3) {
                ?? k00Var = new k00(n00Var.getContext());
                k00Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                m00Var2 = k00Var;
            }
            m00Var = m00Var2;
        }
        return new f2.q1(m00Var);
    }
}
