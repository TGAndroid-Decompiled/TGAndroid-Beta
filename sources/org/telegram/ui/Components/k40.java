package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class k40 extends vm0 {
    public final Context f27748c;
    public final gg.b2 d;
    public i40 f27749e;
    public int f27750f;
    public boolean h;
    public int f27751n;
    public int f27752r;
    public int f27753s;
    public int v;
    public final l40 f27754w;

    public k40(l40 l40Var, Context context) {
        this.f27754w = l40Var;
        this.f27748c = context;
        gg.b2 b2Var = new gg.b2(true);
        this.d = b2Var;
        b2Var.f10530a = new j40(this);
    }

    @Override
    public final void A(s4.d1 d1Var) {
        View view = d1Var.f47889a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        View view = d1Var.f47889a;
        if ((!(view instanceof org.telegram.ui.Cells.b5) || !this.f27754w.f28032f0.contains(Long.valueOf(((org.telegram.ui.Cells.b5) view).getUserId()))) && d1Var.f47893f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f27750f;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f27752r) {
            return 3;
        }
        if (i10 != this.v && i10 != this.f27753s) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        this.f27750f = 1;
        gg.b2 b2Var = this.d;
        int size = b2Var.f10535g.size();
        if (size != 0) {
            int i10 = this.f27750f;
            this.f27753s = i10;
            this.f27750f = size + 1 + i10;
        } else {
            this.f27753s = -1;
        }
        int size2 = b2Var.f10533e.size();
        if (size2 != 0) {
            int i11 = this.f27750f;
            this.v = i11;
            this.f27750f = size2 + 1 + i11;
        } else {
            this.v = -1;
        }
        int i12 = this.f27750f;
        this.f27750f = i12 + 1;
        this.f27752r = i12;
        super.l();
    }

    @Override
    public final void v(s4.d1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k40.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        if (i10 != 0) {
            Context context = this.f27748c;
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                } else {
                    view = new View(context);
                    view.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(56.0f)));
                }
            } else {
                org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(context, null);
                v3Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20677jg, false));
                v3Var.setTextColor(org.telegram.ui.ActionBar.h6.Qg);
                view = v3Var;
            }
        } else {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(2, 2, this.f27748c, null, false);
            b5Var.setCustomRightImage(R.drawable.msg_invited);
            b5Var.setNameColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20752ng, false));
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20715lg, false);
            int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20789pg, false);
            b5Var.H = x02;
            b5Var.I = x03;
            b5Var.setDividerColor(org.telegram.ui.ActionBar.h6.f20865tg);
            view = b5Var;
        }
        return new s4.d1(view);
    }
}
