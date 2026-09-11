package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class q30 extends kl0 {
    public final Context f29557c;
    public final hg.b2 d;
    public o30 f29558e;
    public int f29559f;
    public boolean h;
    public int f29560n;
    public int f29561r;
    public int f29562s;
    public int v;
    public final r30 f29563w;

    public q30(r30 r30Var, Context context) {
        this.f29563w = r30Var;
        this.f29557c = context;
        hg.b2 b2Var = new hg.b2(true);
        this.d = b2Var;
        b2Var.f10979a = new p30(this);
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f45738a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        View view = c1Var.f45738a;
        if ((!(view instanceof org.telegram.ui.Cells.a5) || !this.f29563w.f29916f0.contains(Long.valueOf(((org.telegram.ui.Cells.a5) view).getUserId()))) && c1Var.f45742f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f29559f;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f29561r) {
            return 3;
        }
        if (i10 != this.v && i10 != this.f29562s) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        this.f29559f = 1;
        hg.b2 b2Var = this.d;
        int size = b2Var.f10984g.size();
        if (size != 0) {
            int i10 = this.f29559f;
            this.f29562s = i10;
            this.f29559f = size + 1 + i10;
        } else {
            this.f29562s = -1;
        }
        int size2 = b2Var.f10982e.size();
        if (size2 != 0) {
            int i11 = this.f29559f;
            this.v = i11;
            this.f29559f = size2 + 1 + i11;
        } else {
            this.v = -1;
        }
        int i12 = this.f29559f;
        this.f29559f = i12 + 1;
        this.f29561r = i12;
        super.l();
    }

    @Override
    public final void v(s4.c1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q30.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        if (i10 != 0) {
            Context context = this.f29557c;
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                } else {
                    view = new View(context);
                    view.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
                }
            } else {
                org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, null);
                u3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20781jg, false));
                u3Var.setTextColor(org.telegram.ui.ActionBar.j6.Qg);
                view = u3Var;
            }
        } else {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(2, 2, this.f29557c, null, false);
            a5Var.setCustomRightImage(R.drawable.msg_invited);
            a5Var.setNameColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20853ng, false));
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20819lg, false);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20889pg, false);
            a5Var.H = w02;
            a5Var.I = w03;
            a5Var.setDividerColor(org.telegram.ui.ActionBar.j6.f20963tg);
            view = a5Var;
        }
        return new s4.c1(view);
    }
}
