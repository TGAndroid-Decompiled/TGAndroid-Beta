package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ea implements org.telegram.ui.Components.hk0 {
    public final oa f36783a;

    public ea(oa oaVar) {
        this.f36783a = oaVar;
    }

    @Override
    public final void f(int i10, View view) {
        int i11;
        int i12;
        int i13;
        boolean z10 = view instanceof la;
        oa oaVar = this.f36783a;
        if (z10) {
            la laVar = (la) view;
            TLRPC.TL_username tL_username = laVar.f39164w;
            if (tL_username != null && !laVar.f39162r) {
                if (tL_username.editable && oaVar.f40119y == 0) {
                    oaVar.f40111b.y0(0);
                    oaVar.j0(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, oaVar.getParentActivity(), oaVar.getResourceProvider());
                if (tL_username.active) {
                    i11 = 2131743690;
                } else {
                    i11 = 2131743697;
                }
                String L0 = org.telegram.messenger.dd.L0(i11, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.R = L0;
                if (tL_username.active) {
                    i12 = 2131743688;
                } else {
                    i12 = 2131743695;
                }
                x1Var.T = org.telegram.messenger.dd.L0(i12, null);
                if (tL_username.active) {
                    i13 = 2131749334;
                } else {
                    i13 = 2131745371;
                }
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(i13, null), new mg.i0(this, tL_username, i10, view, 1));
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), new org.telegram.ui.Cells.m5(2));
                alertDialog$Builder.p();
            }
        } else if (view instanceof ia) {
            oaVar.j0(true);
        }
    }
}
