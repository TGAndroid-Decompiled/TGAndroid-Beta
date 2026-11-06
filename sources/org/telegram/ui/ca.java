package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ca implements org.telegram.ui.Components.bj0 {
    public final la f44708a;

    public ca(la laVar) {
        this.f44708a = laVar;
    }

    @Override
    public final void c(int i7, View view) {
        int i10;
        int i11;
        int i12;
        boolean z9 = view instanceof ia;
        la laVar = this.f44708a;
        if (z9) {
            ia iaVar = (ia) view;
            TLRPC.TL_username tL_username = iaVar.f46616w;
            if (tL_username != null && !iaVar.f46614r) {
                if (tL_username.editable && laVar.f47465y == 0) {
                    laVar.f47456b.y0(0);
                    laVar.j0(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, laVar.getParentActivity(), laVar.getResourceProvider());
                if (tL_username.active) {
                    i10 = 2131743665;
                } else {
                    i10 = 2131743672;
                }
                String M0 = org.telegram.messenger.hd.M0(i10, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                u1Var.R = M0;
                if (tL_username.active) {
                    i11 = 2131743663;
                } else {
                    i11 = 2131743670;
                }
                u1Var.T = org.telegram.messenger.hd.M0(i11, null);
                if (tL_username.active) {
                    i12 = 2131749324;
                } else {
                    i12 = 2131745354;
                }
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(i12, null), new bg.f0(this, tL_username, i7, view, 1));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new org.telegram.messenger.ch(18));
                alertDialog$Builder.p();
            }
        } else if (view instanceof ga) {
            laVar.j0(true);
        }
    }
}
