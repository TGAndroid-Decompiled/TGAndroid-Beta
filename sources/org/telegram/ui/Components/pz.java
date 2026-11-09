package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class pz extends pj0 {
    public final wz f37129c;

    public pz(wz wzVar) {
        this.f37129c = wzVar;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57060f == 2) {
            int b10 = d1Var.b();
            wz wzVar = this.f37129c;
            if (b10 >= wzVar.f40248j2 && d1Var.b() <= wzVar.f40249k2) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f37129c.f40245g2;
    }

    @Override
    public final int d(int i7) {
        wz wzVar = this.f37129c;
        wzVar.getClass();
        if (i7 == 0) {
            return 0;
        }
        if (i7 != wzVar.f40246h2 && i7 != wzVar.f40250l2 && i7 != wzVar.f40254p2) {
            if (i7 != wzVar.f40247i2 && i7 != wzVar.f40251m2) {
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
        wz wzVar = this.f37129c;
        if (i7 == 0) {
            Context context = wzVar.getContext();
            if (!(wzVar.R1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) && wzVar.S1 == null) {
                z9 = false;
            } else {
                z9 = true;
            }
            vzVar = new vz(wzVar, context, z9, wzVar.X1, wzVar.V1, wzVar.W1);
            wzVar.f40244f2 = vzVar;
        } else {
            vzVar = null;
            if (i7 == 1) {
                ?? z8Var = new org.telegram.ui.Cells.z8(wzVar.getContext());
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27809a7, z8Var, null);
                vzVar2 = z8Var;
            } else if (i7 == 2) {
                ?? h4Var = new org.telegram.ui.Cells.h4(wzVar.getContext(), 1, 0, false);
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, h4Var, null);
                vzVar = h4Var;
            } else if (i7 == 3) {
                ?? tzVar = new tz(wzVar.getContext());
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, tzVar, null);
                vzVar2 = tzVar;
            }
            vzVar = vzVar2;
        }
        return new v4.d1(vzVar);
    }
}
