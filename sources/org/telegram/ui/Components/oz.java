package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class oz extends oj0 {
    public final vz f36691c;

    public oz(vz vzVar) {
        this.f36691c = vzVar;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f56956f == 2) {
            int b10 = d1Var.b();
            vz vzVar = this.f36691c;
            if (b10 >= vzVar.f39773j2 && d1Var.b() <= vzVar.f39774k2) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f36691c.f39770g2;
    }

    @Override
    public final int d(int i7) {
        vz vzVar = this.f36691c;
        vzVar.getClass();
        if (i7 == 0) {
            return 0;
        }
        if (i7 != vzVar.f39771h2 && i7 != vzVar.f39775l2 && i7 != vzVar.f39779p2) {
            if (i7 != vzVar.f39772i2 && i7 != vzVar.f39776m2) {
                return 2;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void t(v4.d1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oz.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        uz uzVar;
        uz uzVar2;
        boolean z9;
        vz vzVar = this.f36691c;
        if (i7 == 0) {
            Context context = vzVar.getContext();
            if (!(vzVar.R1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) && vzVar.S1 == null) {
                z9 = false;
            } else {
                z9 = true;
            }
            uzVar = new uz(vzVar, context, z9, vzVar.X1, vzVar.V1, vzVar.W1);
            vzVar.f39769f2 = uzVar;
        } else {
            uzVar = null;
            if (i7 == 1) {
                ?? z8Var = new org.telegram.ui.Cells.z8(vzVar.getContext());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27792a7, z8Var, null);
                uzVar2 = z8Var;
            } else if (i7 == 2) {
                ?? h4Var = new org.telegram.ui.Cells.h4(vzVar.getContext(), 1, 0, false);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27848d6, h4Var, null);
                uzVar = h4Var;
            } else if (i7 == 3) {
                ?? szVar = new sz(vzVar.getContext());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27848d6, szVar, null);
                uzVar2 = szVar;
            }
            uzVar = uzVar2;
        }
        return new v4.d1(uzVar);
    }
}
