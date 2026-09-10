package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class a40 extends ul0 {
    public final Context f21380c;
    public final fg.d2 d;
    public y30 e;
    public int f21381f;
    public boolean h;
    public int f21382n;
    public int f21383r;
    public int f21384s;
    public int v;
    public final b40 f21385w;

    public a40(b40 b40Var, Context context) {
        this.f21385w = b40Var;
        this.f21380c = context;
        fg.d2 d2Var = new fg.d2(true);
        this.d = d2Var;
        d2Var.f7979a = new z30(this);
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f41610a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        View view = c1Var.f41610a;
        if ((!(view instanceof org.telegram.ui.Cells.b5) || !this.f21385w.f21709f0.contains(Long.valueOf(((org.telegram.ui.Cells.b5) view).getUserId()))) && c1Var.f41613f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f21381f;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f21383r) {
            return 3;
        }
        if (i10 != this.v && i10 != this.f21384s) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        this.f21381f = 1;
        fg.d2 d2Var = this.d;
        int size = d2Var.f7983g.size();
        if (size != 0) {
            int i10 = this.f21381f;
            this.f21384s = i10;
            this.f21381f = size + 1 + i10;
        } else {
            this.f21384s = -1;
        }
        int size2 = d2Var.e.size();
        if (size2 != 0) {
            int i11 = this.f21381f;
            this.v = i11;
            this.f21381f = size2 + 1 + i11;
        } else {
            this.v = -1;
        }
        int i12 = this.f21381f;
        this.f21381f = i12 + 1;
        this.f21383r = i12;
        super.l();
    }

    @Override
    public final void v(s4.c1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a40.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        if (i10 != 0) {
            Context context = this.f21380c;
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                } else {
                    view = new View(context);
                    view.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
                }
            } else {
                org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, null);
                u3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18045jg, false));
                u3Var.setTextColor(org.telegram.ui.ActionBar.j6.Qg);
                view = u3Var;
            }
        } else {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(2, 2, this.f21380c, null, false);
            b5Var.setCustomRightImage(R.drawable.msg_invited);
            b5Var.setNameColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18117ng, false));
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18083lg, false);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18153pg, false);
            b5Var.H = w02;
            b5Var.I = w03;
            b5Var.setDividerColor(org.telegram.ui.ActionBar.j6.f18227tg);
            view = b5Var;
        }
        return new s4.c1(view);
    }
}
