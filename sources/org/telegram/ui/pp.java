package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pp implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.t4 {
    public final String f48897a;
    public final boolean f48898b;
    public final Object f48899c;
    public final Object d;
    public final Object f48900e;
    public final Object f48901f;
    public final Object h;

    public pp(oq oqVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z9) {
        this.f48899c = oqVar;
        this.d = user;
        this.f48900e = tLObject;
        this.f48901f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f48897a = str;
        this.f48898b = z9;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        boolean z10 = this.f48898b;
        ((org.telegram.ui.Components.pf) this.f48899c).B((View) this.d, this.f48900e, this.f48897a, this.f48901f, z9, i7, i10, (org.telegram.messenger.gf) this.h, z10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        oq oqVar = (oq) this.f48899c;
        TLObject tLObject = (TLObject) this.f48900e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f48901f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        oqVar.getClass();
        long j3 = ((TLRPC.User) this.d).f27102id;
        int i10 = 1;
        if (oqVar.f48478d1 == 1) {
            i10 = 0;
        }
        oqVar.y0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f48897a, this.f48898b, i10, false);
    }

    public pp(org.telegram.ui.Components.pf pfVar, View view, Object obj, String str, Object obj2, org.telegram.messenger.gf gfVar, boolean z9) {
        this.f48899c = pfVar;
        this.d = view;
        this.f48900e = obj;
        this.f48897a = str;
        this.f48901f = obj2;
        this.h = gfVar;
        this.f48898b = z9;
    }
}
