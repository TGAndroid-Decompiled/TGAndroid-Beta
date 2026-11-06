package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pp implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.t4 {
    public final String f48898a;
    public final boolean f48899b;
    public final Object f48900c;
    public final Object d;
    public final Object f48901e;
    public final Object f48902f;
    public final Object h;

    public pp(oq oqVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z9) {
        this.f48900c = oqVar;
        this.d = user;
        this.f48901e = tLObject;
        this.f48902f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f48898a = str;
        this.f48899b = z9;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        boolean z10 = this.f48899b;
        ((org.telegram.ui.Components.pf) this.f48900c).B((View) this.d, this.f48901e, this.f48898a, this.f48902f, z9, i7, i10, (org.telegram.messenger.gf) this.h, z10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        oq oqVar = (oq) this.f48900c;
        TLObject tLObject = (TLObject) this.f48901e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f48902f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        oqVar.getClass();
        long j3 = ((TLRPC.User) this.d).f27101id;
        int i10 = 1;
        if (oqVar.f48479d1 == 1) {
            i10 = 0;
        }
        oqVar.y0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f48898a, this.f48899b, i10, false);
    }

    public pp(org.telegram.ui.Components.pf pfVar, View view, Object obj, String str, Object obj2, org.telegram.messenger.gf gfVar, boolean z9) {
        this.f48900c = pfVar;
        this.d = view;
        this.f48901e = obj;
        this.f48898a = str;
        this.f48902f = obj2;
        this.h = gfVar;
        this.f48899b = z9;
    }
}
