package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class jq implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.x4 {

    public final String f39472a;

    public final boolean f39473b;

    public final Object f39474c;
    public final Object d;

    public final Object f39475e;

    public final Object f39476f;
    public final Object h;

    public jq(lr lrVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f39474c = lrVar;
        this.d = user;
        this.f39475e = tLObject;
        this.f39476f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f39472a = str;
        this.f39473b = z10;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        ((org.telegram.ui.Components.tf) this.f39474c).B((View) this.d, this.f39475e, this.f39472a, this.f39476f, z10, i10, i11, (MediaController.PhotoEntry) this.h, this.f39473b);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        lr lrVar = (lr) this.f39474c;
        TLRPC.User user = (TLRPC.User) this.d;
        TLObject tLObject = (TLObject) this.f39475e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f39476f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        lrVar.getClass();
        lrVar.t0(user.f22527id, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f39472a, this.f39473b, lrVar.f40181a1 == 1 ? 0 : 1, false);
    }

    public jq(org.telegram.ui.Components.tf tfVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f39474c = tfVar;
        this.d = view;
        this.f39475e = obj;
        this.f39472a = str;
        this.f39476f = obj2;
        this.h = photoEntry;
        this.f39473b = z10;
    }
}
