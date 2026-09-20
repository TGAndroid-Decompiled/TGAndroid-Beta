package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class q30 extends ul0 {
    public final Context f27510c;
    public final gg.c2 d;
    public o30 e;
    public int f27511f;
    public boolean h;
    public int f27512n;
    public int f27513r;
    public int f27514s;
    public int v;
    public final r30 f27515w;

    public q30(r30 r30Var, Context context) {
        this.f27515w = r30Var;
        this.f27510c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.d = c2Var;
        c2Var.f9690a = new p30(this);
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42974a;
        if (view instanceof org.telegram.ui.Cells.c5) {
            ((org.telegram.ui.Cells.c5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        View view = c1Var.f42974a;
        if ((!(view instanceof org.telegram.ui.Cells.c5) || !this.f27515w.f27748f0.contains(Long.valueOf(((org.telegram.ui.Cells.c5) view).getUserId()))) && c1Var.f42977f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f27511f;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f27513r) {
            return 3;
        }
        if (i10 != this.v && i10 != this.f27514s) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        this.f27511f = 1;
        gg.c2 c2Var = this.d;
        int size = c2Var.f9694g.size();
        if (size != 0) {
            int i10 = this.f27511f;
            this.f27514s = i10;
            this.f27511f = size + 1 + i10;
        } else {
            this.f27514s = -1;
        }
        int size2 = c2Var.e.size();
        if (size2 != 0) {
            int i11 = this.f27511f;
            this.v = i11;
            this.f27511f = size2 + 1 + i11;
        } else {
            this.v = -1;
        }
        int i12 = this.f27511f;
        this.f27511f = i12 + 1;
        this.f27513r = i12;
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
            Context context = this.f27510c;
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                } else {
                    view = new View(context);
                    view.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
                }
            } else {
                org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(context, null);
                w3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19212jg, false));
                w3Var.setTextColor(org.telegram.ui.ActionBar.j6.Qg);
                view = w3Var;
            }
        } else {
            org.telegram.ui.Cells.c5 c5Var = new org.telegram.ui.Cells.c5(2, 2, this.f27510c, null, false);
            c5Var.setCustomRightImage(R.drawable.msg_invited);
            c5Var.setNameColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19286ng, false));
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19250lg, false);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19324pg, false);
            c5Var.H = w02;
            c5Var.I = w03;
            c5Var.setDividerColor(org.telegram.ui.ActionBar.j6.f19398tg);
            view = c5Var;
        }
        return new s4.c1(view);
    }
}
