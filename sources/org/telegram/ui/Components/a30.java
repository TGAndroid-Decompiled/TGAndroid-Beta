package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class a30 extends vk0 {
    public final Context f26650c;
    public final of.v1 d;
    public y20 f26651e;
    public int f26652f;
    public boolean h;
    public int f26653n;
    public int f26654r;
    public int f26655s;
    public int v;
    public final b30 f26656w;

    public a30(b30 b30Var, Context context) {
        this.f26656w = b30Var;
        this.f26650c = context;
        of.v1 v1Var = new of.v1(true);
        this.d = v1Var;
        v1Var.f19524a = new z20(this);
    }

    @Override
    public final void A(f2.q1 q1Var) {
        View view = q1Var.f5501a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        View view = q1Var.f5501a;
        if ((!(view instanceof org.telegram.ui.Cells.b5) || !this.f26656w.f27018b0.contains(Long.valueOf(((org.telegram.ui.Cells.b5) view).getUserId()))) && q1Var.f5505f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f26652f;
    }

    @Override
    public final int j(int i9) {
        if (i9 == 0) {
            return 2;
        }
        if (i9 == this.f26654r) {
            return 3;
        }
        if (i9 != this.v && i9 != this.f26655s) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        this.f26652f = 1;
        of.v1 v1Var = this.d;
        int size = v1Var.f19529g.size();
        if (size != 0) {
            int i9 = this.f26652f;
            this.f26655s = i9;
            this.f26652f = size + 1 + i9;
        } else {
            this.f26655s = -1;
        }
        int size2 = v1Var.f19527e.size();
        if (size2 != 0) {
            int i10 = this.f26652f;
            this.v = i10;
            this.f26652f = size2 + 1 + i10;
        } else {
            this.v = -1;
        }
        int i11 = this.f26652f;
        this.f26652f = i11 + 1;
        this.f26654r = i11;
        super.l();
    }

    @Override
    public final void v(f2.q1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a30.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        if (i9 != 0) {
            Context context = this.f26650c;
            if (i9 != 1) {
                if (i9 != 2) {
                    view = new View(context);
                } else {
                    view = new View(context);
                    view.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(56.0f)));
                }
            } else {
                org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(context, null);
                v3Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23118jg, false));
                v3Var.setTextColor(org.telegram.ui.ActionBar.f6.Qg);
                view = v3Var;
            }
        } else {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(2, 2, this.f26650c, null, false);
            b5Var.setCustomRightImage(R.drawable.msg_invited);
            b5Var.setNameColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23188ng, false));
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23154lg, false);
            int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23220pg, false);
            b5Var.D = w02;
            b5Var.E = w03;
            b5Var.setDividerColor(org.telegram.ui.ActionBar.f6.f23295tg);
            view = b5Var;
        }
        return new f2.q1(view);
    }
}
