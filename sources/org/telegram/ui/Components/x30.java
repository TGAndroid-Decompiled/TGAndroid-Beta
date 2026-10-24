package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class x30 extends km0 {
    public final Context f32502c;
    public final hg.a2 d;
    public v30 e;
    public int f32503f;
    public boolean h;
    public int f32504n;
    public int f32505r;
    public int f32506s;
    public int v;
    public final y30 f32507w;

    public x30(y30 y30Var, Context context) {
        this.f32507w = y30Var;
        this.f32502c = context;
        hg.a2 a2Var = new hg.a2(true);
        this.d = a2Var;
        a2Var.f11819a = new w30(this);
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f46342a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        View view = b1Var.f46342a;
        if ((!(view instanceof org.telegram.ui.Cells.a5) || !this.f32507w.f32802f0.contains(Long.valueOf(((org.telegram.ui.Cells.a5) view).getUserId()))) && b1Var.f46345f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f32503f;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f32505r) {
            return 3;
        }
        if (i10 != this.v && i10 != this.f32506s) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        this.f32503f = 1;
        hg.a2 a2Var = this.d;
        int size = a2Var.f11823g.size();
        if (size != 0) {
            int i10 = this.f32503f;
            this.f32506s = i10;
            this.f32503f = size + 1 + i10;
        } else {
            this.f32506s = -1;
        }
        int size2 = a2Var.e.size();
        if (size2 != 0) {
            int i11 = this.f32503f;
            this.v = i11;
            this.f32503f = size2 + 1 + i11;
        } else {
            this.v = -1;
        }
        int i12 = this.f32503f;
        this.f32503f = i12 + 1;
        this.f32505r = i12;
        super.l();
    }

    @Override
    public final void v(s4.b1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x30.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.a5 a5Var;
        if (i10 != 0) {
            Context context = this.f32502c;
            if (i10 != 1) {
                if (i10 != 2) {
                    a5Var = new View(context);
                } else {
                    ?? view = new View(context);
                    view.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
                    a5Var = view;
                }
            } else {
                ?? u3Var = new org.telegram.ui.Cells.u3(context, null);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21301jg, u3Var, null);
                u3Var.setTextColor(org.telegram.ui.ActionBar.k6.Qg);
                a5Var = u3Var;
            }
        } else {
            org.telegram.ui.Cells.a5 a5Var2 = new org.telegram.ui.Cells.a5(2, 2, this.f32502c, null, false);
            a5Var2.setCustomRightImage(R.drawable.msg_invited);
            a5Var2.setNameColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21377ng, false));
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21338lg, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21412pg, false);
            a5Var2.O = true;
            a5Var2.H = x02;
            a5Var2.I = x03;
            a5Var2.setDividerColor(org.telegram.ui.ActionBar.k6.f21490tg);
            a5Var = a5Var2;
        }
        return new s4.b1(a5Var);
    }
}
