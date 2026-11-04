package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class np implements org.telegram.ui.ActionBar.p1, org.telegram.ui.Components.r4 {
    public final String f48038a;
    public final boolean f48039b;
    public final Object f48040c;
    public final Object d;
    public final Object f48041e;
    public final Object f48042f;
    public final Object h;

    public np(nq nqVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f48040c = nqVar;
        this.d = user;
        this.f48041e = tLObject;
        this.f48042f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f48038a = str;
        this.f48039b = z10;
    }

    @Override
    public void L(int i3, int i10, boolean z10) {
        boolean z11 = this.f48039b;
        ((org.telegram.ui.Components.nf) this.f48040c).B((View) this.d, this.f48041e, this.f48038a, this.f48042f, z10, i3, i10, (org.telegram.messenger.ye) this.h, z11);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        nq nqVar = (nq) this.f48040c;
        TLObject tLObject = (TLObject) this.f48041e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f48042f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        nqVar.getClass();
        long j10 = ((TLRPC.User) this.d).f27150id;
        int i10 = 1;
        if (nqVar.f48059e1 == 1) {
            i10 = 0;
        }
        nqVar.y0(j10, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f48038a, this.f48039b, i10, false);
    }

    public np(org.telegram.ui.Components.nf nfVar, View view, Object obj, String str, Object obj2, org.telegram.messenger.ye yeVar, boolean z10) {
        this.f48040c = nfVar;
        this.d = view;
        this.f48041e = obj;
        this.f48038a = str;
        this.f48042f = obj2;
        this.h = yeVar;
        this.f48039b = z10;
    }
}
