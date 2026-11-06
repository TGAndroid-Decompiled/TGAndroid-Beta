package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pp implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.t4 {
    public final String f48904a;
    public final boolean f48905b;
    public final Object f48906c;
    public final Object d;
    public final Object f48907e;
    public final Object f48908f;
    public final Object h;

    public pp(oq oqVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z9) {
        this.f48906c = oqVar;
        this.d = user;
        this.f48907e = tLObject;
        this.f48908f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f48904a = str;
        this.f48905b = z9;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        boolean z10 = this.f48905b;
        ((org.telegram.ui.Components.pf) this.f48906c).B((View) this.d, this.f48907e, this.f48904a, this.f48908f, z9, i7, i10, (org.telegram.messenger.gf) this.h, z10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        oq oqVar = (oq) this.f48906c;
        TLObject tLObject = (TLObject) this.f48907e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f48908f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        oqVar.getClass();
        long j3 = ((TLRPC.User) this.d).f27101id;
        int i10 = 1;
        if (oqVar.f48451d1 == 1) {
            i10 = 0;
        }
        oqVar.y0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f48904a, this.f48905b, i10, false);
    }

    public pp(org.telegram.ui.Components.pf pfVar, View view, Object obj, String str, Object obj2, org.telegram.messenger.gf gfVar, boolean z9) {
        this.f48906c = pfVar;
        this.d = view;
        this.f48907e = obj;
        this.f48904a = str;
        this.f48908f = obj2;
        this.h = gfVar;
        this.f48905b = z9;
    }
}
