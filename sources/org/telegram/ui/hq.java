package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hq implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.x4 {
    public final String f38892a;
    public final boolean f38893b;
    public final Object f38894c;
    public final Object d;
    public final Object f38895e;
    public final Object f38896f;
    public final Object h;

    public hq(jr jrVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f38894c = jrVar;
        this.d = user;
        this.f38895e = tLObject;
        this.f38896f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f38892a = str;
        this.f38893b = z10;
    }

    @Override
    public void B(int i9, int i10, boolean z10) {
        boolean z11 = this.f38893b;
        ((org.telegram.ui.Components.xf) this.f38894c).B((View) this.d, this.f38895e, this.f38892a, this.f38896f, z10, i9, i10, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        int i10;
        jr jrVar = (jr) this.f38894c;
        TLObject tLObject = (TLObject) this.f38895e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f38896f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        jrVar.getClass();
        long j10 = ((TLRPC.User) this.d).f22527id;
        if (jrVar.f39559a1 == 1) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        jrVar.s0(j10, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f38892a, this.f38893b, i10, false);
    }

    public hq(org.telegram.ui.Components.xf xfVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f38894c = xfVar;
        this.d = view;
        this.f38895e = obj;
        this.f38892a = str;
        this.f38896f = obj2;
        this.h = photoEntry;
        this.f38893b = z10;
    }
}
