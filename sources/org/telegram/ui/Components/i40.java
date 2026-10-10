package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class i40 extends qm0 {
    public final Context f27224c;
    public final gg.b2 d;
    public g40 f27225e;
    public int f27226f;
    public boolean h;
    public int f27227n;
    public int f27228r;
    public int f27229s;
    public int v;
    public final j40 f27230w;

    public i40(j40 j40Var, Context context) {
        this.f27230w = j40Var;
        this.f27224c = context;
        gg.b2 b2Var = new gg.b2(true);
        this.d = b2Var;
        b2Var.f10532a = new h40(this);
    }

    @Override
    public final void A(s4.d1 d1Var) {
        View view = d1Var.f47702a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        View view = d1Var.f47702a;
        if ((!(view instanceof org.telegram.ui.Cells.b5) || !this.f27230w.f27535f0.contains(Long.valueOf(((org.telegram.ui.Cells.b5) view).getUserId()))) && d1Var.f47706f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f27226f;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f27228r) {
            return 3;
        }
        if (i10 != this.v && i10 != this.f27229s) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        this.f27226f = 1;
        gg.b2 b2Var = this.d;
        int size = b2Var.f10537g.size();
        if (size != 0) {
            int i10 = this.f27226f;
            this.f27229s = i10;
            this.f27226f = size + 1 + i10;
        } else {
            this.f27229s = -1;
        }
        int size2 = b2Var.f10535e.size();
        if (size2 != 0) {
            int i11 = this.f27226f;
            this.v = i11;
            this.f27226f = size2 + 1 + i11;
        } else {
            this.v = -1;
        }
        int i12 = this.f27226f;
        this.f27226f = i12 + 1;
        this.f27228r = i12;
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
            Context context = this.f27224c;
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                } else {
                    view = new View(context);
                    view.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(56.0f)));
                }
            } else {
                org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(context, null);
                v3Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20919jg, false));
                v3Var.setTextColor(org.telegram.ui.ActionBar.i6.Qg);
                view = v3Var;
            }
        } else {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(2, 2, this.f27224c, null, false);
            b5Var.setCustomRightImage(R.drawable.msg_invited);
            b5Var.setNameColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20994ng, false));
            int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20957lg, false);
            int x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21031pg, false);
            b5Var.H = x02;
            b5Var.I = x03;
            b5Var.setDividerColor(org.telegram.ui.ActionBar.i6.f21105tg);
            view = b5Var;
        }
        return new s4.d1(view);
    }
}
