package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class u30 extends rl0 {
    public final Context f31489c;
    public final uf.k1 d;
    public s30 f31490e;
    public int f31491f;
    public boolean h;
    public int f31492n;
    public int f31493r;
    public int f31494s;
    public int v;
    public final v30 f31495w;

    public u30(v30 v30Var, Context context) {
        this.f31495w = v30Var;
        this.f31489c = context;
        uf.k1 k1Var = new uf.k1(true);
        this.d = k1Var;
        k1Var.f48654a = new t30(this);
    }

    @Override
    public final void A(f2.m1 m1Var) {
        View view = m1Var.f5875a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        View view = m1Var.f5875a;
        if ((!(view instanceof org.telegram.ui.Cells.b5) || !this.f31495w.f31766c0.contains(Long.valueOf(((org.telegram.ui.Cells.b5) view).getUserId()))) && m1Var.f5879f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f31491f;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f31493r) {
            return 3;
        }
        if (i10 != this.v && i10 != this.f31494s) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        this.f31491f = 1;
        uf.k1 k1Var = this.d;
        int size = k1Var.f48659g.size();
        if (size != 0) {
            int i10 = this.f31491f;
            this.f31494s = i10;
            this.f31491f = size + 1 + i10;
        } else {
            this.f31494s = -1;
        }
        int size2 = k1Var.f48657e.size();
        if (size2 != 0) {
            int i11 = this.f31491f;
            this.v = i11;
            this.f31491f = size2 + 1 + i11;
        } else {
            this.v = -1;
        }
        int i12 = this.f31491f;
        this.f31491f = i12 + 1;
        this.f31493r = i12;
        super.l();
    }

    @Override
    public final void v(f2.m1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u30.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        if (i10 != 0) {
            Context context = this.f31489c;
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                } else {
                    view = new View(context);
                    view.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(56.0f)));
                }
            } else {
                org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, null);
                u3Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21778jg, false));
                u3Var.setTextColor(org.telegram.ui.ActionBar.k6.Qg);
                view = u3Var;
            }
        } else {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(2, 2, this.f31489c, null, false);
            b5Var.setCustomRightImage(R.drawable.msg_invited);
            b5Var.setNameColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21850ng, false));
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21815lg, false);
            int w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21887pg, false);
            b5Var.E = w02;
            b5Var.F = w03;
            b5Var.setDividerColor(org.telegram.ui.ActionBar.k6.f21954tg);
            view = b5Var;
        }
        return new f2.m1(view);
    }
}
