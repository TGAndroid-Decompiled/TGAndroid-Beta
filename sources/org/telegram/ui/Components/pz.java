package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class pz extends oj0 {
    public final wz f37121c;

    public pz(wz wzVar) {
        this.f37121c = wzVar;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57048f == 2) {
            int b10 = d1Var.b();
            wz wzVar = this.f37121c;
            if (b10 >= wzVar.f40135j2 && d1Var.b() <= wzVar.f40136k2) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f37121c.f40132g2;
    }

    @Override
    public final int d(int i7) {
        wz wzVar = this.f37121c;
        wzVar.getClass();
        if (i7 == 0) {
            return 0;
        }
        if (i7 != wzVar.f40133h2 && i7 != wzVar.f40137l2 && i7 != wzVar.f40141p2) {
            if (i7 != wzVar.f40134i2 && i7 != wzVar.f40138m2) {
                return 2;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void t(v4.d1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pz.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        vz vzVar;
        vz vzVar2;
        boolean z9;
        wz wzVar = this.f37121c;
        if (i7 == 0) {
            Context context = wzVar.getContext();
            if (!(wzVar.R1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) && wzVar.S1 == null) {
                z9 = false;
            } else {
                z9 = true;
            }
            vzVar = new vz(wzVar, context, z9, wzVar.X1, wzVar.V1, wzVar.W1);
            wzVar.f40131f2 = vzVar;
        } else {
            vzVar = null;
            if (i7 == 1) {
                ?? z8Var = new org.telegram.ui.Cells.z8(wzVar.getContext());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27796a7, z8Var, null);
                vzVar2 = z8Var;
            } else if (i7 == 2) {
                ?? h4Var = new org.telegram.ui.Cells.h4(wzVar.getContext(), 1, 0, false);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, h4Var, null);
                vzVar = h4Var;
            } else if (i7 == 3) {
                ?? tzVar = new tz(wzVar.getContext());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, tzVar, null);
                vzVar2 = tzVar;
            }
            vzVar = vzVar2;
        }
        return new v4.d1(vzVar);
    }
}
