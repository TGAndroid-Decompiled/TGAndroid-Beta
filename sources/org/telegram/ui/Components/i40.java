package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class i40 extends rm0 {
    public final Context f27172c;
    public final gg.b2 d;
    public g40 f27173e;
    public int f27174f;
    public boolean h;
    public int f27175n;
    public int f27176r;
    public int f27177s;
    public int v;
    public final j40 f27178w;

    public i40(j40 j40Var, Context context) {
        this.f27178w = j40Var;
        this.f27172c = context;
        gg.b2 b2Var = new gg.b2(true);
        this.d = b2Var;
        b2Var.f10531a = new h40(this);
    }

    @Override
    public final void A(s4.d1 d1Var) {
        View view = d1Var.f47748a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        View view = d1Var.f47748a;
        if ((!(view instanceof org.telegram.ui.Cells.b5) || !this.f27178w.f27547f0.contains(Long.valueOf(((org.telegram.ui.Cells.b5) view).getUserId()))) && d1Var.f47752f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f27174f;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f27176r) {
            return 3;
        }
        if (i10 != this.v && i10 != this.f27177s) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        this.f27174f = 1;
        gg.b2 b2Var = this.d;
        int size = b2Var.f10536g.size();
        if (size != 0) {
            int i10 = this.f27174f;
            this.f27177s = i10;
            this.f27174f = size + 1 + i10;
        } else {
            this.f27177s = -1;
        }
        int size2 = b2Var.f10534e.size();
        if (size2 != 0) {
            int i11 = this.f27174f;
            this.v = i11;
            this.f27174f = size2 + 1 + i11;
        } else {
            this.v = -1;
        }
        int i12 = this.f27174f;
        this.f27174f = i12 + 1;
        this.f27176r = i12;
        super.l();
    }

    @Override
    public final void v(s4.d1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i40.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        if (i10 != 0) {
            Context context = this.f27172c;
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                } else {
                    view = new View(context);
                    view.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(56.0f)));
                }
            } else {
                org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(context, null);
                v3Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20904jg, false));
                v3Var.setTextColor(org.telegram.ui.ActionBar.h6.Qg);
                view = v3Var;
            }
        } else {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(2, 2, this.f27172c, null, false);
            b5Var.setCustomRightImage(R.drawable.msg_invited);
            b5Var.setNameColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20979ng, false));
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20942lg, false);
            int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21016pg, false);
            b5Var.H = x02;
            b5Var.I = x03;
            b5Var.setDividerColor(org.telegram.ui.ActionBar.h6.f21091tg);
            view = b5Var;
        }
        return new s4.d1(view);
    }
}
