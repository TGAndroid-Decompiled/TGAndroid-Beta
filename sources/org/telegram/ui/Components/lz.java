package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class lz extends sj0 {
    public final rz f35934c;

    public lz(rz rzVar) {
        this.f35934c = rzVar;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f == 2) {
            int b10 = d1Var.b();
            rz rzVar = this.f35934c;
            if (b10 >= rzVar.f37855k2 && d1Var.b() <= rzVar.f37856l2) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f35934c.f37852h2;
    }

    @Override
    public final int d(int i3) {
        rz rzVar = this.f35934c;
        rzVar.getClass();
        if (i3 == 0) {
            return 0;
        }
        if (i3 != rzVar.f37853i2 && i3 != rzVar.f37857m2 && i3 != rzVar.f37861q2) {
            if (i3 != rzVar.f37854j2 && i3 != rzVar.f37858n2) {
                return 2;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void t(u4.d1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lz.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        qz qzVar;
        qz qzVar2;
        boolean z10;
        rz rzVar = this.f35934c;
        if (i3 == 0) {
            Context context = rzVar.getContext();
            if (!(rzVar.S1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) && rzVar.T1 == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            qzVar = new qz(rzVar, context, z10, rzVar.Y1, rzVar.W1, rzVar.X1);
            rzVar.f37851g2 = qzVar;
        } else {
            qzVar = null;
            if (i3 == 1) {
                ?? y8Var = new org.telegram.ui.Cells.y8(rzVar.getContext());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27824a7, y8Var, null);
                qzVar2 = y8Var;
            } else if (i3 == 2) {
                ?? h4Var = new org.telegram.ui.Cells.h4(rzVar.getContext(), 1, 0, false);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, h4Var, null);
                qzVar = h4Var;
            } else if (i3 == 3) {
                ?? ozVar = new oz(rzVar.getContext());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, ozVar, null);
                qzVar2 = ozVar;
            }
            qzVar = qzVar2;
        }
        return new u4.d1(qzVar);
    }
}
