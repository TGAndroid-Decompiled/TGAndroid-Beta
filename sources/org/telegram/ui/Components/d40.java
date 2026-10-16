package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class d40 extends lm0 {
    public final Context f23976c;
    public final hg.a2 d;
    public b40 e;
    public int f23977f;
    public boolean h;
    public int f23978n;
    public int f23979r;
    public int f23980s;
    public int v;
    public final e40 f23981w;

    public d40(e40 e40Var, Context context) {
        this.f23981w = e40Var;
        this.f23976c = context;
        hg.a2 a2Var = new hg.a2(true);
        this.d = a2Var;
        a2Var.f10488a = new c40(this);
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f44838a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        View view = b1Var.f44838a;
        if ((!(view instanceof org.telegram.ui.Cells.b5) || !this.f23981w.f24291f0.contains(Long.valueOf(((org.telegram.ui.Cells.b5) view).getUserId()))) && b1Var.f44841f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f23977f;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f23979r) {
            return 3;
        }
        if (i10 != this.v && i10 != this.f23980s) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        this.f23977f = 1;
        hg.a2 a2Var = this.d;
        int size = a2Var.f10492g.size();
        if (size != 0) {
            int i10 = this.f23977f;
            this.f23980s = i10;
            this.f23977f = size + 1 + i10;
        } else {
            this.f23980s = -1;
        }
        int size2 = a2Var.e.size();
        if (size2 != 0) {
            int i11 = this.f23977f;
            this.v = i11;
            this.f23977f = size2 + 1 + i11;
        } else {
            this.v = -1;
        }
        int i12 = this.f23977f;
        this.f23977f = i12 + 1;
        this.f23979r = i12;
        super.l();
    }

    @Override
    public final void v(s4.b1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d40.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        if (i10 != 0) {
            Context context = this.f23976c;
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                } else {
                    view = new View(context);
                    view.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
                }
            } else {
                org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(context, null);
                v3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19718jg, false));
                v3Var.setTextColor(org.telegram.ui.ActionBar.g6.Qg);
                view = v3Var;
            }
        } else {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(2, 2, this.f23976c, null, false);
            b5Var.setCustomRightImage(R.drawable.msg_invited);
            b5Var.setNameColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19794ng, false));
            int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19755lg, false);
            int x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19829pg, false);
            b5Var.H = x02;
            b5Var.I = x03;
            b5Var.setDividerColor(org.telegram.ui.ActionBar.g6.f19907tg);
            view = b5Var;
        }
        return new s4.b1(view);
    }
}
