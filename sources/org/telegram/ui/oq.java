package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oq implements org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.q4 {
    public final String f40365a;
    public final boolean f40366b;
    public final Object f40367c;
    public final Object d;
    public final Object e;
    public final Object f40368f;
    public final Object h;

    public oq(pr prVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f40367c = prVar;
        this.d = user;
        this.e = tLObject;
        this.f40368f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f40365a = str;
        this.f40366b = z10;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        boolean z11 = this.f40366b;
        ((org.telegram.ui.Components.lf) this.f40367c).B((View) this.d, this.e, this.f40365a, this.f40368f, z10, i10, i11, (org.telegram.messenger.ef) this.h, z11);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        pr prVar = (pr) this.f40367c;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f40368f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        prVar.getClass();
        long j10 = ((TLRPC.User) this.d).f19942id;
        int i11 = 1;
        if (prVar.f40728d1 == 1) {
            i11 = 0;
        }
        prVar.x0(j10, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f40365a, this.f40366b, i11, false);
    }

    public oq(org.telegram.ui.Components.lf lfVar, View view, Object obj, String str, Object obj2, org.telegram.messenger.ef efVar, boolean z10) {
        this.f40367c = lfVar;
        this.d = view;
        this.e = obj;
        this.f40365a = str;
        this.f40368f = obj2;
        this.h = efVar;
        this.f40366b = z10;
    }
}
