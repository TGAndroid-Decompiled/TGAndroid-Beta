package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class m10 extends pm0 {
    public final s10 f28647c;

    public m10(s10 s10Var) {
        this.f28647c = s10Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47662f == 2) {
            int b10 = d1Var.b();
            s10 s10Var = this.f28647c;
            if (b10 >= s10Var.f30586r0 && d1Var.b() <= s10Var.f30587s0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f28647c.f30583o0;
    }

    @Override
    public final int j(int i10) {
        s10 s10Var = this.f28647c;
        s10Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != s10Var.f30584p0 && i10 != s10Var.f30588t0 && i10 != s10Var.f30592x0) {
            if (i10 != s10Var.f30585q0 && i10 != s10Var.f30589u0) {
                return 2;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void v(s4.d1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m10.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        r10 r10Var;
        r10 r10Var2;
        s10 s10Var = this.f28647c;
        if (i10 == 0) {
            boolean z10 = false;
            Context context = s10Var.getContext();
            if ((s10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || s10Var.f30570a0 != null) {
                z10 = true;
            }
            r10Var = new r10(s10Var, context, z10, s10Var.f30575f0, s10Var.f30573d0, s10Var.f30574e0);
            s10Var.f30582n0 = r10Var;
        } else {
            r10Var = null;
            if (i10 == 1) {
                ?? e9Var = new org.telegram.ui.Cells.e9(s10Var.getContext());
                e9Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20741a7, false));
                r10Var2 = e9Var;
            } else if (i10 == 2) {
                ?? g4Var = new org.telegram.ui.Cells.g4(1, 0, s10Var.getContext(), false);
                g4Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false));
                r10Var = g4Var;
            } else if (i10 == 3) {
                ?? p10Var = new p10(s10Var.getContext());
                p10Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false));
                r10Var2 = p10Var;
            }
            r10Var = r10Var2;
        }
        return new s4.d1(r10Var);
    }
}
