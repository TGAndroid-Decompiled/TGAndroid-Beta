package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lq implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.e5 {
    public final String f41336a;
    public final boolean f41337b;
    public final Object f41338c;
    public final Object d;
    public final Object e;
    public final Object f41339f;
    public final Object h;

    public lq(kr krVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f41338c = krVar;
        this.d = user;
        this.e = tLObject;
        this.f41339f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f41336a = str;
        this.f41337b = z10;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        boolean z11 = this.f41337b;
        ((org.telegram.ui.Components.gg) this.f41338c).B((View) this.d, this.e, this.f41336a, this.f41339f, z10, i10, i11, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        kr krVar = (kr) this.f41338c;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f41339f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        krVar.getClass();
        long j10 = ((TLRPC.User) this.d).f22174id;
        int i11 = 1;
        if (krVar.f41011d1 == 1) {
            i11 = 0;
        }
        krVar.u0(j10, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f41336a, this.f41337b, i11, false);
    }

    public lq(org.telegram.ui.Components.gg ggVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f41338c = ggVar;
        this.d = view;
        this.e = obj;
        this.f41336a = str;
        this.f41339f = obj2;
        this.h = photoEntry;
        this.f41337b = z10;
    }
}
