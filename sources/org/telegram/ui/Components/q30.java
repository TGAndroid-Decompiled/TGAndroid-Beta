package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class q30 extends kl0 {
    public final Context f27238c;
    public final gg.c2 d;
    public o30 e;
    public int f27239f;
    public boolean h;
    public int f27240n;
    public int f27241r;
    public int f27242s;
    public int v;
    public final r30 f27243w;

    public q30(r30 r30Var, Context context) {
        this.f27243w = r30Var;
        this.f27238c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.d = c2Var;
        c2Var.f9685a = new p30(this);
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42675a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        View view = c1Var.f42675a;
        if ((!(view instanceof org.telegram.ui.Cells.a5) || !this.f27243w.f27534f0.contains(Long.valueOf(((org.telegram.ui.Cells.a5) view).getUserId()))) && c1Var.f42678f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f27239f;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f27241r) {
            return 3;
        }
        if (i10 != this.v && i10 != this.f27242s) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        this.f27239f = 1;
        gg.c2 c2Var = this.d;
        int size = c2Var.f9689g.size();
        if (size != 0) {
            int i10 = this.f27239f;
            this.f27242s = i10;
            this.f27239f = size + 1 + i10;
        } else {
            this.f27242s = -1;
        }
        int size2 = c2Var.e.size();
        if (size2 != 0) {
            int i11 = this.f27239f;
            this.v = i11;
            this.f27239f = size2 + 1 + i11;
        } else {
            this.v = -1;
        }
        int i12 = this.f27239f;
        this.f27239f = i12 + 1;
        this.f27241r = i12;
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
            Context context = this.f27238c;
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                } else {
                    view = new View(context);
                    view.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
                }
            } else {
                org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, null);
                u3Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18954jg, false));
                u3Var.setTextColor(org.telegram.ui.ActionBar.i6.Qg);
                view = u3Var;
            }
        } else {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(2, 2, this.f27238c, null, false);
            a5Var.setCustomRightImage(R.drawable.msg_invited);
            a5Var.setNameColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19028ng, false));
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18992lg, false);
            int w03 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19065pg, false);
            a5Var.H = w02;
            a5Var.I = w03;
            a5Var.setDividerColor(org.telegram.ui.ActionBar.i6.f19139tg);
            view = a5Var;
        }
        return new s4.c1(view);
    }
}
