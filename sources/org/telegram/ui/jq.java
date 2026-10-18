package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jq implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.e5 {
    public final String f38268a;
    public final boolean f38269b;
    public final Object f38270c;
    public final Object d;
    public final Object e;
    public final Object f38271f;
    public final Object h;

    public jq(jr jrVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f38270c = jrVar;
        this.d = user;
        this.e = tLObject;
        this.f38271f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f38268a = str;
        this.f38269b = z10;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        boolean z11 = this.f38269b;
        ((org.telegram.ui.Components.gg) this.f38270c).B((View) this.d, this.e, this.f38268a, this.f38271f, z10, i10, i11, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        jr jrVar = (jr) this.f38270c;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f38271f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        jrVar.getClass();
        long j10 = ((TLRPC.User) this.d).f20426id;
        int i11 = 1;
        if (jrVar.f38285e1 == 1) {
            i11 = 0;
        }
        jrVar.t0(j10, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f38268a, this.f38269b, i11, false);
    }

    public jq(org.telegram.ui.Components.gg ggVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f38270c = ggVar;
        this.d = view;
        this.e = obj;
        this.f38268a = str;
        this.f38271f = obj2;
        this.h = photoEntry;
        this.f38269b = z10;
    }
}
