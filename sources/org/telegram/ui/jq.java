package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jq implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.b5 {
    public final String f39610a;
    public final boolean f39611b;
    public final Object f39612c;
    public final Object d;
    public final Object f39613e;
    public final Object f39614f;
    public final Object h;

    public jq(jr jrVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f39612c = jrVar;
        this.d = user;
        this.f39613e = tLObject;
        this.f39614f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f39610a = str;
        this.f39611b = z10;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        boolean z11 = this.f39611b;
        ((org.telegram.ui.Components.ag) this.f39612c).B((View) this.d, this.f39613e, this.f39610a, this.f39614f, z10, i10, i11, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        jr jrVar = (jr) this.f39612c;
        TLObject tLObject = (TLObject) this.f39613e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f39614f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        jrVar.getClass();
        long j10 = ((TLRPC.User) this.d).f22539id;
        if (jrVar.f39620a1 == 1) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        jrVar.t0(j10, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f39610a, this.f39611b, i11, false);
    }

    public jq(org.telegram.ui.Components.ag agVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f39612c = agVar;
        this.d = view;
        this.f39613e = obj;
        this.f39610a = str;
        this.f39614f = obj2;
        this.h = photoEntry;
        this.f39611b = z10;
    }
}
