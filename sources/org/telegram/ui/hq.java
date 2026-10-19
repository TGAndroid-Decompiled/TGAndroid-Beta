package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hq implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.e5 {
    public final String f37704a;
    public final boolean f37705b;
    public final Object f37706c;
    public final Object d;
    public final Object e;
    public final Object f37707f;
    public final Object h;

    public hq(hr hrVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f37706c = hrVar;
        this.d = user;
        this.e = tLObject;
        this.f37707f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f37704a = str;
        this.f37705b = z10;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        boolean z11 = this.f37705b;
        ((org.telegram.ui.Components.gg) this.f37706c).B((View) this.d, this.e, this.f37704a, this.f37707f, z10, i10, i11, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        hr hrVar = (hr) this.f37706c;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f37707f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        hrVar.getClass();
        long j10 = ((TLRPC.User) this.d).f20420id;
        int i11 = 1;
        if (hrVar.f37721e1 == 1) {
            i11 = 0;
        }
        hrVar.t0(j10, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f37704a, this.f37705b, i11, false);
    }

    public hq(org.telegram.ui.Components.gg ggVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f37706c = ggVar;
        this.d = view;
        this.e = obj;
        this.f37704a = str;
        this.f37707f = obj2;
        this.h = photoEntry;
        this.f37705b = z10;
    }
}
