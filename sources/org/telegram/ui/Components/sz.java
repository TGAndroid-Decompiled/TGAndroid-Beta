package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class sz extends tj0 {
    public final zz f39456c;

    public sz(zz zzVar) {
        this.f39456c = zzVar;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f58539f == 2) {
            int b10 = e1Var.b();
            zz zzVar = this.f39456c;
            if (b10 >= zzVar.f42509n2 && e1Var.b() <= zzVar.f42510o2) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f39456c.f42506k2;
    }

    @Override
    public final int d(int i7) {
        zz zzVar = this.f39456c;
        zzVar.getClass();
        if (i7 == 0) {
            return 0;
        }
        if (i7 != zzVar.f42507l2 && i7 != zzVar.f42511p2 && i7 != zzVar.f42515t2) {
            if (i7 != zzVar.f42508m2 && i7 != zzVar.f42512q2) {
                return 2;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void t(v4.e1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sz.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        yz yzVar;
        yz yzVar2;
        boolean z10;
        zz zzVar = this.f39456c;
        if (i7 == 0) {
            Context context = zzVar.getContext();
            if (!(zzVar.V1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) && zzVar.W1 == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            yzVar = new yz(zzVar, context, z10, zzVar.f42498b2, zzVar.Z1, zzVar.f42497a2);
            zzVar.f42505j2 = yzVar;
        } else {
            yzVar = null;
            if (i7 == 1) {
                ?? y8Var = new org.telegram.ui.Cells.y8(zzVar.getContext());
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28792a7, y8Var, null);
                yzVar2 = y8Var;
            } else if (i7 == 2) {
                ?? h4Var = new org.telegram.ui.Cells.h4(zzVar.getContext(), 1, 0, false);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, h4Var, null);
                yzVar = h4Var;
            } else if (i7 == 3) {
                ?? wzVar = new wz(zzVar.getContext());
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, wzVar, null);
                yzVar2 = wzVar;
            }
            yzVar = yzVar2;
        }
        return new v4.e1(yzVar);
    }
}
