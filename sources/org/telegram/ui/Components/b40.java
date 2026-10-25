package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class b40 extends lm0 {
    public final Context f26746c;
    public final ig.a2 d;
    public z30 e;
    public int f26747f;
    public boolean h;
    public int f26748n;
    public int f26749r;
    public int f26750s;
    public int v;
    public final c40 f26751w;

    public b40(c40 c40Var, Context context) {
        this.f26751w = c40Var;
        this.f26746c = context;
        ig.a2 a2Var = new ig.a2(true);
        this.d = a2Var;
        a2Var.f13988a = new a40(this);
    }

    @Override
    public final void A(s4.e1 e1Var) {
        View view = e1Var.f47735a;
        if (view instanceof org.telegram.ui.Cells.f5) {
            ((org.telegram.ui.Cells.f5) view).a();
        }
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        View view = e1Var.f47735a;
        if ((!(view instanceof org.telegram.ui.Cells.f5) || !this.f26751w.f27060f0.contains(Long.valueOf(((org.telegram.ui.Cells.f5) view).getUserId()))) && e1Var.f47738f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f26747f;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f26749r) {
            return 3;
        }
        if (i10 != this.v && i10 != this.f26750s) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        this.f26747f = 1;
        ig.a2 a2Var = this.d;
        int size = a2Var.f13992g.size();
        if (size != 0) {
            int i10 = this.f26747f;
            this.f26750s = i10;
            this.f26747f = size + 1 + i10;
        } else {
            this.f26750s = -1;
        }
        int size2 = a2Var.e.size();
        if (size2 != 0) {
            int i11 = this.f26747f;
            this.v = i11;
            this.f26747f = size2 + 1 + i11;
        } else {
            this.v = -1;
        }
        int i12 = this.f26747f;
        this.f26747f = i12 + 1;
        this.f26749r = i12;
        super.l();
    }

    @Override
    public final void v(s4.e1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b40.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.f5 f5Var;
        if (i10 != 0) {
            Context context = this.f26746c;
            if (i10 != 1) {
                if (i10 != 2) {
                    f5Var = new View(context);
                } else {
                    ?? view = new View(context);
                    view.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(56.0f)));
                    f5Var = view;
                }
            } else {
                ?? z3Var = new org.telegram.ui.Cells.z3(context, null);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23472jg, z3Var, null);
                z3Var.setTextColor(org.telegram.ui.ActionBar.y6.Qg);
                f5Var = z3Var;
            }
        } else {
            org.telegram.ui.Cells.f5 f5Var2 = new org.telegram.ui.Cells.f5(2, 2, this.f26746c, null, false);
            f5Var2.setCustomRightImage(R.drawable.msg_invited);
            f5Var2.setNameColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23548ng, false));
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23509lg, false);
            int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23586pg, false);
            f5Var2.O = true;
            f5Var2.H = x02;
            f5Var2.I = x03;
            f5Var2.setDividerColor(org.telegram.ui.ActionBar.y6.f23661tg);
            f5Var = f5Var2;
        }
        return new s4.e1(f5Var);
    }
}
