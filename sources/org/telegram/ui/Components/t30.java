package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class t30 extends ql0 {
    public final Context f28884c;
    public final tf.j1 d;
    public r30 e;
    public int f28885f;
    public boolean h;
    public int f28886n;
    public int f28887r;
    public int f28888s;
    public int v;
    public final u30 f28889w;

    public t30(u30 u30Var, Context context) {
        this.f28889w = u30Var;
        this.f28884c = context;
        tf.j1 j1Var = new tf.j1(true);
        this.d = j1Var;
        j1Var.f44819a = new s30(this);
    }

    @Override
    public final void A(f2.l1 l1Var) {
        View view = l1Var.f5774a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        View view = l1Var.f5774a;
        if ((!(view instanceof org.telegram.ui.Cells.a5) || !this.f28889w.f29095c0.contains(Long.valueOf(((org.telegram.ui.Cells.a5) view).getUserId()))) && l1Var.f5777f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f28885f;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f28887r) {
            return 3;
        }
        if (i10 != this.v && i10 != this.f28888s) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        this.f28885f = 1;
        tf.j1 j1Var = this.d;
        int size = j1Var.f44823g.size();
        if (size != 0) {
            int i10 = this.f28885f;
            this.f28888s = i10;
            this.f28885f = size + 1 + i10;
        } else {
            this.f28888s = -1;
        }
        int size2 = j1Var.e.size();
        if (size2 != 0) {
            int i11 = this.f28885f;
            this.v = i11;
            this.f28885f = size2 + 1 + i11;
        } else {
            this.v = -1;
        }
        int i12 = this.f28885f;
        this.f28885f = i12 + 1;
        this.f28887r = i12;
        super.l();
    }

    @Override
    public final void v(f2.l1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t30.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        if (i10 != 0) {
            Context context = this.f28884c;
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                } else {
                    view = new View(context);
                    view.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(56.0f)));
                }
            } else {
                org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(context, null);
                t3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19997jg, false));
                t3Var.setTextColor(org.telegram.ui.ActionBar.j6.Qg);
                view = t3Var;
            }
        } else {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(2, 2, this.f28884c, null, false);
            a5Var.setCustomRightImage(R.drawable.msg_invited);
            a5Var.setNameColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20069ng, false));
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20034lg, false);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20106pg, false);
            a5Var.E = w02;
            a5Var.F = w03;
            a5Var.setDividerColor(org.telegram.ui.ActionBar.j6.f20173tg);
            view = a5Var;
        }
        return new f2.l1(view);
    }
}
