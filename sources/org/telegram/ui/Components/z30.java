package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class z30 extends hm0 {
    public final Context f32832c;
    public final hg.a2 d;
    public x30 e;
    public int f32833f;
    public boolean h;
    public int f32834n;
    public int f32835r;
    public int f32836s;
    public int v;
    public final a40 f32837w;

    public z30(a40 a40Var, Context context) {
        this.f32837w = a40Var;
        this.f32832c = context;
        hg.a2 a2Var = new hg.a2(true);
        this.d = a2Var;
        a2Var.f11795a = new y30(this);
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f45958a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        View view = b1Var.f45958a;
        if ((!(view instanceof org.telegram.ui.Cells.a5) || !this.f32837w.f24490f0.contains(Long.valueOf(((org.telegram.ui.Cells.a5) view).getUserId()))) && b1Var.f45961f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f32833f;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f32835r) {
            return 3;
        }
        if (i10 != this.v && i10 != this.f32836s) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        this.f32833f = 1;
        hg.a2 a2Var = this.d;
        int size = a2Var.f11799g.size();
        if (size != 0) {
            int i10 = this.f32833f;
            this.f32836s = i10;
            this.f32833f = size + 1 + i10;
        } else {
            this.f32836s = -1;
        }
        int size2 = a2Var.e.size();
        if (size2 != 0) {
            int i11 = this.f32833f;
            this.v = i11;
            this.f32833f = size2 + 1 + i11;
        } else {
            this.v = -1;
        }
        int i12 = this.f32833f;
        this.f32833f = i12 + 1;
        this.f32835r = i12;
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
            Context context = this.f32832c;
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                } else {
                    view = new View(context);
                    view.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
                }
            } else {
                org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, null);
                u3Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21110jg, false));
                u3Var.setTextColor(org.telegram.ui.ActionBar.h6.Qg);
                view = u3Var;
            }
        } else {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(2, 2, this.f32832c, null, false);
            a5Var.setCustomRightImage(R.drawable.msg_invited);
            a5Var.setNameColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21186ng, false));
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21147lg, false);
            int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21221pg, false);
            a5Var.H = x02;
            a5Var.I = x03;
            a5Var.setDividerColor(org.telegram.ui.ActionBar.h6.f21299tg);
            view = a5Var;
        }
        return new s4.b1(view);
    }
}
