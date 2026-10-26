package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lq implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.e5 {
    public final String f41339a;
    public final boolean f41340b;
    public final Object f41341c;
    public final Object d;
    public final Object e;
    public final Object f41342f;
    public final Object h;

    public lq(kr krVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f41341c = krVar;
        this.d = user;
        this.e = tLObject;
        this.f41342f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f41339a = str;
        this.f41340b = z10;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        boolean z11 = this.f41340b;
        ((org.telegram.ui.Components.gg) this.f41341c).B((View) this.d, this.e, this.f41339a, this.f41342f, z10, i10, i11, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        kr krVar = (kr) this.f41341c;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f41342f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        krVar.getClass();
        long j10 = ((TLRPC.User) this.d).f22176id;
        int i11 = 1;
        if (krVar.f41014d1 == 1) {
            i11 = 0;
        }
        krVar.u0(j10, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f41339a, this.f41340b, i11, false);
    }

    public lq(org.telegram.ui.Components.gg ggVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f41341c = ggVar;
        this.d = view;
        this.e = obj;
        this.f41339a = str;
        this.f41342f = obj2;
        this.h = photoEntry;
        this.f41340b = z10;
    }
}
