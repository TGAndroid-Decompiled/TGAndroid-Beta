package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pp implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.t4 {
    public final String f48900a;
    public final boolean f48901b;
    public final Object f48902c;
    public final Object d;
    public final Object f48903e;
    public final Object f48904f;
    public final Object h;

    public pp(oq oqVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z9) {
        this.f48902c = oqVar;
        this.d = user;
        this.f48903e = tLObject;
        this.f48904f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f48900a = str;
        this.f48901b = z9;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        boolean z10 = this.f48901b;
        ((org.telegram.ui.Components.pf) this.f48902c).B((View) this.d, this.f48903e, this.f48900a, this.f48904f, z9, i7, i10, (org.telegram.messenger.gf) this.h, z10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        oq oqVar = (oq) this.f48902c;
        TLObject tLObject = (TLObject) this.f48903e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f48904f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        oqVar.getClass();
        long j3 = ((TLRPC.User) this.d).f27105id;
        int i10 = 1;
        if (oqVar.f48472d1 == 1) {
            i10 = 0;
        }
        oqVar.y0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f48900a, this.f48901b, i10, false);
    }

    public pp(org.telegram.ui.Components.pf pfVar, View view, Object obj, String str, Object obj2, org.telegram.messenger.gf gfVar, boolean z9) {
        this.f48902c = pfVar;
        this.d = view;
        this.f48903e = obj;
        this.f48900a = str;
        this.f48904f = obj2;
        this.h = gfVar;
        this.f48901b = z9;
    }
}
