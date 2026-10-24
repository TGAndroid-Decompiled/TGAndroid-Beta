package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jq implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.b5 {
    public final String f38611a;
    public final boolean f38612b;
    public final Object f38613c;
    public final Object d;
    public final Object e;
    public final Object f38614f;
    public final Object h;

    public jq(jr jrVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f38613c = jrVar;
        this.d = user;
        this.e = tLObject;
        this.f38614f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f38611a = str;
        this.f38612b = z10;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        boolean z11 = this.f38612b;
        ((org.telegram.ui.Components.eg) this.f38613c).B((View) this.d, this.e, this.f38611a, this.f38614f, z10, i10, i11, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        jr jrVar = (jr) this.f38613c;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f38614f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        jrVar.getClass();
        long j10 = ((TLRPC.User) this.d).f20491id;
        int i11 = 1;
        if (jrVar.f38628e1 == 1) {
            i11 = 0;
        }
        jrVar.t0(j10, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f38611a, this.f38612b, i11, false);
    }

    public jq(org.telegram.ui.Components.eg egVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f38613c = egVar;
        this.d = view;
        this.e = obj;
        this.f38611a = str;
        this.f38614f = obj2;
        this.h = photoEntry;
        this.f38612b = z10;
    }
}
