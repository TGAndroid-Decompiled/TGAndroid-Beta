package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class u30 extends yl0 {
    public final Context f31273c;
    public final gg.c2 d;
    public s30 f31274e;
    public int f31275f;
    public boolean h;
    public int f31276n;
    public int f31277r;
    public int f31278s;
    public int v;
    public final v30 f31279w;

    public u30(v30 v30Var, Context context) {
        this.f31279w = v30Var;
        this.f31273c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.d = c2Var;
        c2Var.f10532a = new t30(this);
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f46531a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        View view = c1Var.f46531a;
        if ((!(view instanceof org.telegram.ui.Cells.b5) || !this.f31279w.f31537f0.contains(Long.valueOf(((org.telegram.ui.Cells.b5) view).getUserId()))) && c1Var.f46535f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f31275f;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f31277r) {
            return 3;
        }
        if (i10 != this.v && i10 != this.f31278s) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        this.f31275f = 1;
        gg.c2 c2Var = this.d;
        int size = c2Var.f10537g.size();
        if (size != 0) {
            int i10 = this.f31275f;
            this.f31278s = i10;
            this.f31275f = size + 1 + i10;
        } else {
            this.f31278s = -1;
        }
        int size2 = c2Var.f10535e.size();
        if (size2 != 0) {
            int i11 = this.f31275f;
            this.v = i11;
            this.f31275f = size2 + 1 + i11;
        } else {
            this.v = -1;
        }
        int i12 = this.f31275f;
        this.f31275f = i12 + 1;
        this.f31277r = i12;
        super.l();
    }

    @Override
    public final void v(s4.c1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u30.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        if (i10 != 0) {
            Context context = this.f31273c;
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                } else {
                    view = new View(context);
                    view.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
                }
            } else {
                org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(context, null);
                v3Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20941jg, false));
                v3Var.setTextColor(org.telegram.ui.ActionBar.i6.Qg);
                view = v3Var;
            }
        } else {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(2, 2, this.f31273c, null, false);
            b5Var.setCustomRightImage(R.drawable.msg_invited);
            b5Var.setNameColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21015ng, false));
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20979lg, false);
            int w03 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21053pg, false);
            b5Var.H = w02;
            b5Var.I = w03;
            b5Var.setDividerColor(org.telegram.ui.ActionBar.i6.f21130tg);
            view = b5Var;
        }
        return new s4.c1(view);
    }
}
