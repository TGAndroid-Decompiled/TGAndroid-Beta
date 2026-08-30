package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pq implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.y4 {
    public final String f37437a;
    public final boolean f37438b;
    public final Object f37439c;
    public final Object d;
    public final Object e;
    public final Object f37440f;
    public final Object h;

    public pq(pr prVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z4) {
        this.f37439c = prVar;
        this.d = user;
        this.e = tLObject;
        this.f37440f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f37437a = str;
        this.f37438b = z4;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        boolean z10 = this.f37438b;
        ((org.telegram.ui.Components.xf) this.f37439c).B((View) this.d, this.e, this.f37437a, this.f37440f, z4, i10, i11, (MediaController.PhotoEntry) this.h, z10);
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        pr prVar = (pr) this.f37439c;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f37440f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        prVar.getClass();
        long j10 = ((TLRPC.User) this.d).f19331id;
        if (prVar.f37449b1 == 1) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        prVar.t0(j10, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f37437a, this.f37438b, i11, false);
    }

    public pq(org.telegram.ui.Components.xf xfVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z4) {
        this.f37439c = xfVar;
        this.d = view;
        this.e = obj;
        this.f37437a = str;
        this.f37440f = obj2;
        this.h = photoEntry;
        this.f37438b = z4;
    }
}
