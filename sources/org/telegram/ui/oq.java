package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oq implements org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.q4 {
    public final String f40245a;
    public final boolean f40246b;
    public final Object f40247c;
    public final Object d;
    public final Object e;
    public final Object f40248f;
    public final Object h;

    public oq(pr prVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f40247c = prVar;
        this.d = user;
        this.e = tLObject;
        this.f40248f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f40245a = str;
        this.f40246b = z10;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        boolean z11 = this.f40246b;
        ((org.telegram.ui.Components.lf) this.f40247c).B((View) this.d, this.e, this.f40245a, this.f40248f, z10, i10, i11, (org.telegram.messenger.ff) this.h, z11);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        pr prVar = (pr) this.f40247c;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f40248f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        prVar.getClass();
        long j10 = ((TLRPC.User) this.d).f19943id;
        int i11 = 1;
        if (prVar.f40535d1 == 1) {
            i11 = 0;
        }
        prVar.y0(j10, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f40245a, this.f40246b, i11, false);
    }

    public oq(org.telegram.ui.Components.lf lfVar, View view, Object obj, String str, Object obj2, org.telegram.messenger.ff ffVar, boolean z10) {
        this.f40247c = lfVar;
        this.d = view;
        this.e = obj;
        this.f40245a = str;
        this.f40248f = obj2;
        this.h = ffVar;
        this.f40246b = z10;
    }
}
