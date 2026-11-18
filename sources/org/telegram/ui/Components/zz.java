package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class zz extends bk0 {
    public final g00 f42974c;

    public zz(g00 g00Var) {
        this.f42974c = g00Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59126f == 2) {
            int b10 = f1Var.b();
            g00 g00Var = this.f42974c;
            if (b10 >= g00Var.f35261n2 && f1Var.b() <= g00Var.f35262o2) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f42974c.f35258k2;
    }

    @Override
    public final int d(int i7) {
        g00 g00Var = this.f42974c;
        g00Var.getClass();
        if (i7 == 0) {
            return 0;
        }
        if (i7 != g00Var.f35259l2 && i7 != g00Var.f35263p2 && i7 != g00Var.f35267t2) {
            if (i7 != g00Var.f35260m2 && i7 != g00Var.f35264q2) {
                return 2;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void t(v4.f1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zz.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        f00 f00Var;
        f00 f00Var2;
        boolean z10;
        g00 g00Var = this.f42974c;
        if (i7 == 0) {
            Context context = g00Var.getContext();
            if (!(g00Var.V1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) && g00Var.W1 == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            f00Var = new f00(g00Var, context, z10, g00Var.f35250b2, g00Var.Z1, g00Var.f35249a2);
            g00Var.f35257j2 = f00Var;
        } else {
            f00Var = null;
            if (i7 == 1) {
                ?? z8Var = new org.telegram.ui.Cells.z8(g00Var.getContext());
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29339a7, z8Var, null);
                f00Var2 = z8Var;
            } else if (i7 == 2) {
                ?? h4Var = new org.telegram.ui.Cells.h4(g00Var.getContext(), 1, 0, false);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, h4Var, null);
                f00Var = h4Var;
            } else if (i7 == 3) {
                ?? d00Var = new d00(g00Var.getContext());
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, d00Var, null);
                f00Var2 = d00Var;
            }
            f00Var = f00Var2;
        }
        return new v4.f1(f00Var);
    }
}
