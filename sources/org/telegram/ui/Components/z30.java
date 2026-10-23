package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class z30 extends im0 {
    public final Context f32826c;
    public final hg.a2 d;
    public x30 e;
    public int f32827f;
    public boolean h;
    public int f32828n;
    public int f32829r;
    public int f32830s;
    public int v;
    public final a40 f32831w;

    public z30(a40 a40Var, Context context) {
        this.f32831w = a40Var;
        this.f32826c = context;
        hg.a2 a2Var = new hg.a2(true);
        this.d = a2Var;
        a2Var.f11792a = new y30(this);
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f45921a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        View view = b1Var.f45921a;
        if ((!(view instanceof org.telegram.ui.Cells.a5) || !this.f32831w.f24493f0.contains(Long.valueOf(((org.telegram.ui.Cells.a5) view).getUserId()))) && b1Var.f45924f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f32827f;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f32829r) {
            return 3;
        }
        if (i10 != this.v && i10 != this.f32830s) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        this.f32827f = 1;
        hg.a2 a2Var = this.d;
        int size = a2Var.f11796g.size();
        if (size != 0) {
            int i10 = this.f32827f;
            this.f32830s = i10;
            this.f32827f = size + 1 + i10;
        } else {
            this.f32830s = -1;
        }
        int size2 = a2Var.e.size();
        if (size2 != 0) {
            int i11 = this.f32827f;
            this.v = i11;
            this.f32827f = size2 + 1 + i11;
        } else {
            this.v = -1;
        }
        int i12 = this.f32827f;
        this.f32827f = i12 + 1;
        this.f32829r = i12;
        super.l();
    }

    @Override
    public final void v(s4.b1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z30.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        if (i10 != 0) {
            Context context = this.f32826c;
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                } else {
                    view = new View(context);
                    view.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
                }
            } else {
                org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, null);
                u3Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21111jg, false));
                u3Var.setTextColor(org.telegram.ui.ActionBar.h6.Qg);
                view = u3Var;
            }
        } else {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(2, 2, this.f32826c, null, false);
            a5Var.setCustomRightImage(R.drawable.msg_invited);
            a5Var.setNameColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21187ng, false));
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21148lg, false);
            int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21222pg, false);
            a5Var.H = x02;
            a5Var.I = x03;
            a5Var.setDividerColor(org.telegram.ui.ActionBar.h6.f21300tg);
            view = a5Var;
        }
        return new s4.b1(view);
    }
}
