package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class s30 extends rl0 {
    public final Context f28620c;
    public final tf.k1 d;
    public q30 e;
    public int f28621f;
    public boolean h;
    public int f28622n;
    public int f28623r;
    public int f28624s;
    public int v;
    public final t30 f28625w;

    public s30(t30 t30Var, Context context) {
        this.f28625w = t30Var;
        this.f28620c = context;
        tf.k1 k1Var = new tf.k1(true);
        this.d = k1Var;
        k1Var.f44769a = new r30(this);
    }

    @Override
    public final void A(f2.l1 l1Var) {
        View view = l1Var.f5785a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        View view = l1Var.f5785a;
        if ((!(view instanceof org.telegram.ui.Cells.b5) || !this.f28625w.f28880c0.contains(Long.valueOf(((org.telegram.ui.Cells.b5) view).getUserId()))) && l1Var.f5788f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f28621f;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f28623r) {
            return 3;
        }
        if (i10 != this.v && i10 != this.f28624s) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        this.f28621f = 1;
        tf.k1 k1Var = this.d;
        int size = k1Var.f44773g.size();
        if (size != 0) {
            int i10 = this.f28621f;
            this.f28624s = i10;
            this.f28621f = size + 1 + i10;
        } else {
            this.f28624s = -1;
        }
        int size2 = k1Var.e.size();
        if (size2 != 0) {
            int i11 = this.f28621f;
            this.v = i11;
            this.f28621f = size2 + 1 + i11;
        } else {
            this.v = -1;
        }
        int i12 = this.f28621f;
        this.f28621f = i12 + 1;
        this.f28623r = i12;
        super.l();
    }

    @Override
    public final void v(f2.l1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s30.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        if (i10 != 0) {
            Context context = this.f28620c;
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                } else {
                    view = new View(context);
                    view.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(56.0f)));
                }
            } else {
                org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, null);
                u3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20022jg, false));
                u3Var.setTextColor(org.telegram.ui.ActionBar.j6.Qg);
                view = u3Var;
            }
        } else {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(2, 2, this.f28620c, null, false);
            b5Var.setCustomRightImage(R.drawable.msg_invited);
            b5Var.setNameColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20094ng, false));
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20059lg, false);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20131pg, false);
            b5Var.E = w02;
            b5Var.F = w03;
            b5Var.setDividerColor(org.telegram.ui.ActionBar.j6.f20198tg);
            view = b5Var;
        }
        return new f2.l1(view);
    }
}
