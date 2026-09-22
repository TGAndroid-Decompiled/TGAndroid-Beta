package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class q30 extends xl0 {
    public final Context f27492c;
    public final gg.c2 d;
    public o30 e;
    public int f27493f;
    public boolean h;
    public int f27494n;
    public int f27495r;
    public int f27496s;
    public int v;
    public final r30 f27497w;

    public q30(r30 r30Var, Context context) {
        this.f27497w = r30Var;
        this.f27492c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.d = c2Var;
        c2Var.f9690a = new p30(this);
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42995a;
        if (view instanceof org.telegram.ui.Cells.c5) {
            ((org.telegram.ui.Cells.c5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        View view = c1Var.f42995a;
        if ((!(view instanceof org.telegram.ui.Cells.c5) || !this.f27497w.f27794f0.contains(Long.valueOf(((org.telegram.ui.Cells.c5) view).getUserId()))) && c1Var.f42998f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f27493f;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f27495r) {
            return 3;
        }
        if (i10 != this.v && i10 != this.f27496s) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        this.f27493f = 1;
        gg.c2 c2Var = this.d;
        int size = c2Var.f9694g.size();
        if (size != 0) {
            int i10 = this.f27493f;
            this.f27496s = i10;
            this.f27493f = size + 1 + i10;
        } else {
            this.f27496s = -1;
        }
        int size2 = c2Var.e.size();
        if (size2 != 0) {
            int i11 = this.f27493f;
            this.v = i11;
            this.f27493f = size2 + 1 + i11;
        } else {
            this.v = -1;
        }
        int i12 = this.f27493f;
        this.f27493f = i12 + 1;
        this.f27495r = i12;
        super.l();
    }

    @Override
    public final void v(s4.c1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q30.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        if (i10 != 0) {
            Context context = this.f27492c;
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                } else {
                    view = new View(context);
                    view.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
                }
            } else {
                org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(context, null);
                w3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19227jg, false));
                w3Var.setTextColor(org.telegram.ui.ActionBar.j6.Qg);
                view = w3Var;
            }
        } else {
            org.telegram.ui.Cells.c5 c5Var = new org.telegram.ui.Cells.c5(2, 2, this.f27492c, null, false);
            c5Var.setCustomRightImage(R.drawable.msg_invited);
            c5Var.setNameColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19301ng, false));
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19265lg, false);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19339pg, false);
            c5Var.H = w02;
            c5Var.I = w03;
            c5Var.setDividerColor(org.telegram.ui.ActionBar.j6.f19413tg);
            view = c5Var;
        }
        return new s4.c1(view);
    }
}
