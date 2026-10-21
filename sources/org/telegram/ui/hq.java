package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hq implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.e5 {
    public final String f37711a;
    public final boolean f37712b;
    public final Object f37713c;
    public final Object d;
    public final Object e;
    public final Object f37714f;
    public final Object h;

    public hq(hr hrVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f37713c = hrVar;
        this.d = user;
        this.e = tLObject;
        this.f37714f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f37711a = str;
        this.f37712b = z10;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        boolean z11 = this.f37712b;
        ((org.telegram.ui.Components.gg) this.f37713c).B((View) this.d, this.e, this.f37711a, this.f37714f, z10, i10, i11, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        hr hrVar = (hr) this.f37713c;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f37714f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        hrVar.getClass();
        long j10 = ((TLRPC.User) this.d).f20423id;
        int i11 = 1;
        if (hrVar.f37728e1 == 1) {
            i11 = 0;
        }
        hrVar.t0(j10, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f37711a, this.f37712b, i11, false);
    }

    public hq(org.telegram.ui.Components.gg ggVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f37713c = ggVar;
        this.d = view;
        this.e = obj;
        this.f37711a = str;
        this.f37714f = obj2;
        this.h = photoEntry;
        this.f37712b = z10;
    }
}
