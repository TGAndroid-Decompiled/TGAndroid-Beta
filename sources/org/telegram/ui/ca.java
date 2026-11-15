package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ca implements org.telegram.ui.Components.gj0 {
    public final la f46050a;

    public ca(la laVar) {
        this.f46050a = laVar;
    }

    @Override
    public final void b(int i7, View view) {
        int i10;
        int i11;
        int i12;
        boolean z10 = view instanceof ia;
        la laVar = this.f46050a;
        if (z10) {
            ia iaVar = (ia) view;
            TLRPC.TL_username tL_username = iaVar.f47995w;
            if (tL_username != null && !iaVar.f47993r) {
                if (tL_username.editable && laVar.f48916y == 0) {
                    laVar.f48907b.y0(0);
                    laVar.j0(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, laVar.getParentActivity(), laVar.getResourceProvider());
                if (tL_username.active) {
                    i10 = 2131743664;
                } else {
                    i10 = 2131743671;
                }
                String M0 = org.telegram.messenger.hd.M0(i10, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                if (tL_username.active) {
                    i11 = 2131743662;
                } else {
                    i11 = 2131743669;
                }
                t1Var.U = org.telegram.messenger.hd.M0(i11, null);
                if (tL_username.active) {
                    i12 = 2131749325;
                } else {
                    i12 = 2131745353;
                }
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(i12, null), new bg.f0(this, tL_username, i7, view, 1));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new org.telegram.messenger.fd(22));
                alertDialog$Builder.p();
            }
        } else if (view instanceof ga) {
            laVar.j0(true);
        }
    }
}
