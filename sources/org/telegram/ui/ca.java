package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ca implements org.telegram.ui.Components.oj0 {
    public final la f46468a;

    public ca(la laVar) {
        this.f46468a = laVar;
    }

    @Override
    public final void c(int i7, View view) {
        int i10;
        int i11;
        int i12;
        boolean z10 = view instanceof ia;
        la laVar = this.f46468a;
        if (z10) {
            ia iaVar = (ia) view;
            TLRPC.TL_username tL_username = iaVar.f48673w;
            if (tL_username != null && !iaVar.f48671r) {
                if (tL_username.editable && laVar.f49497y == 0) {
                    laVar.f49488b.y0(0);
                    laVar.j0(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, laVar.getParentActivity(), laVar.getResourceProvider());
                if (tL_username.active) {
                    i10 = 2131743427;
                } else {
                    i10 = 2131743434;
                }
                String M0 = org.telegram.messenger.gd.M0(i10, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                u1Var.S = M0;
                if (tL_username.active) {
                    i11 = 2131743425;
                } else {
                    i11 = 2131743432;
                }
                u1Var.U = org.telegram.messenger.gd.M0(i11, null);
                if (tL_username.active) {
                    i12 = 2131749133;
                } else {
                    i12 = 2131745158;
                }
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(i12, null), new bg.g0(this, tL_username, i7, view, 1));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new org.telegram.messenger.ed(23));
                alertDialog$Builder.p();
            }
        } else if (view instanceof ga) {
            laVar.j0(true);
        }
    }
}
