package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ca implements org.telegram.ui.Components.qj0 {
    public final la f46498a;

    public ca(la laVar) {
        this.f46498a = laVar;
    }

    @Override
    public final void c(int i7, View view) {
        int i10;
        int i11;
        int i12;
        boolean z10 = view instanceof ia;
        la laVar = this.f46498a;
        if (z10) {
            ia iaVar = (ia) view;
            TLRPC.TL_username tL_username = iaVar.f48703w;
            if (tL_username != null && !iaVar.f48701r) {
                if (tL_username.editable && laVar.f49537y == 0) {
                    laVar.f49528b.y0(0);
                    laVar.j0(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, laVar.getParentActivity(), laVar.getResourceProvider());
                if (tL_username.active) {
                    i10 = 2131743421;
                } else {
                    i10 = 2131743428;
                }
                String N0 = org.telegram.messenger.gd.N0(i10, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
                t1Var.S = N0;
                if (tL_username.active) {
                    i11 = 2131743419;
                } else {
                    i11 = 2131743426;
                }
                t1Var.U = org.telegram.messenger.gd.N0(i11, null);
                if (tL_username.active) {
                    i12 = 2131749132;
                } else {
                    i12 = 2131745157;
                }
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(i12, null), new bg.g0(this, tL_username, i7, view, 1));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new org.telegram.messenger.ed(23));
                alertDialog$Builder.p();
            }
        } else if (view instanceof ga) {
            laVar.j0(true);
        }
    }
}
