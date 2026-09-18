package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class q30 extends vl0 {
    public final Context f27430c;
    public final gg.c2 d;
    public o30 e;
    public int f27431f;
    public boolean h;
    public int f27432n;
    public int f27433r;
    public int f27434s;
    public int v;
    public final r30 f27435w;

    public q30(r30 r30Var, Context context) {
        this.f27435w = r30Var;
        this.f27430c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.d = c2Var;
        c2Var.f9689a = new p30(this);
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42929a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        View view = c1Var.f42929a;
        if ((!(view instanceof org.telegram.ui.Cells.b5) || !this.f27435w.f27813f0.contains(Long.valueOf(((org.telegram.ui.Cells.b5) view).getUserId()))) && c1Var.f42932f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f27431f;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f27433r) {
            return 3;
        }
        if (i10 != this.v && i10 != this.f27434s) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        this.f27431f = 1;
        gg.c2 c2Var = this.d;
        int size = c2Var.f9693g.size();
        if (size != 0) {
            int i10 = this.f27431f;
            this.f27434s = i10;
            this.f27431f = size + 1 + i10;
        } else {
            this.f27434s = -1;
        }
        int size2 = c2Var.e.size();
        if (size2 != 0) {
            int i11 = this.f27431f;
            this.v = i11;
            this.f27431f = size2 + 1 + i11;
        } else {
            this.v = -1;
        }
        int i12 = this.f27431f;
        this.f27431f = i12 + 1;
        this.f27433r = i12;
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
            Context context = this.f27430c;
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                } else {
                    view = new View(context);
                    view.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
                }
            } else {
                org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(context, null);
                v3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19180jg, false));
                v3Var.setTextColor(org.telegram.ui.ActionBar.j6.Qg);
                view = v3Var;
            }
        } else {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(2, 2, this.f27430c, null, false);
            b5Var.setCustomRightImage(R.drawable.msg_invited);
            b5Var.setNameColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19254ng, false));
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19218lg, false);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19292pg, false);
            b5Var.H = w02;
            b5Var.I = w03;
            b5Var.setDividerColor(org.telegram.ui.ActionBar.j6.f19366tg);
            view = b5Var;
        }
        return new s4.c1(view);
    }
}
