package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class b00 extends dk0 {
    public final i00 f33685c;

    public b00(i00 i00Var) {
        this.f33685c = i00Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59169f == 2) {
            int b10 = f1Var.b();
            i00 i00Var = this.f33685c;
            if (b10 >= i00Var.f36080n2 && f1Var.b() <= i00Var.f36081o2) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f33685c.f36077k2;
    }

    @Override
    public final int d(int i7) {
        i00 i00Var = this.f33685c;
        i00Var.getClass();
        if (i7 == 0) {
            return 0;
        }
        if (i7 != i00Var.f36078l2 && i7 != i00Var.f36082p2 && i7 != i00Var.f36086t2) {
            if (i7 != i00Var.f36079m2 && i7 != i00Var.f36083q2) {
                return 2;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void t(v4.f1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b00.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        h00 h00Var;
        h00 h00Var2;
        boolean z10;
        i00 i00Var = this.f33685c;
        if (i7 == 0) {
            Context context = i00Var.getContext();
            if (!(i00Var.V1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) && i00Var.W1 == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            h00Var = new h00(i00Var, context, z10, i00Var.f36069b2, i00Var.Z1, i00Var.f36068a2);
            i00Var.f36076j2 = h00Var;
        } else {
            h00Var = null;
            if (i7 == 1) {
                ?? a9Var = new org.telegram.ui.Cells.a9(i00Var.getContext());
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29324a7, a9Var, null);
                h00Var2 = a9Var;
            } else if (i7 == 2) {
                ?? i4Var = new org.telegram.ui.Cells.i4(i00Var.getContext(), 1, 0, false);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, i4Var, null);
                h00Var = i4Var;
            } else if (i7 == 3) {
                ?? f00Var = new f00(i00Var.getContext());
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, f00Var, null);
                h00Var2 = f00Var;
            }
            h00Var = h00Var2;
        }
        return new v4.f1(h00Var);
    }
}
