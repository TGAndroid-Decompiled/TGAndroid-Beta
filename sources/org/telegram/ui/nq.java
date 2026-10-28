package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nq implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.e5 {
    public final String f41862a;
    public final boolean f41863b;
    public final Object f41864c;
    public final Object d;
    public final Object e;
    public final Object f41865f;
    public final Object h;

    public nq(mr mrVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f41864c = mrVar;
        this.d = user;
        this.e = tLObject;
        this.f41865f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f41862a = str;
        this.f41863b = z10;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        boolean z11 = this.f41863b;
        ((org.telegram.ui.Components.gg) this.f41864c).B((View) this.d, this.e, this.f41862a, this.f41865f, z10, i10, i11, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        mr mrVar = (mr) this.f41864c;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f41865f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        mrVar.getClass();
        long j10 = ((TLRPC.User) this.d).f22177id;
        int i11 = 1;
        if (mrVar.f41512d1 == 1) {
            i11 = 0;
        }
        mrVar.u0(j10, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f41862a, this.f41863b, i11, false);
    }

    public nq(org.telegram.ui.Components.gg ggVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f41864c = ggVar;
        this.d = view;
        this.e = obj;
        this.f41862a = str;
        this.f41865f = obj2;
        this.h = photoEntry;
        this.f41863b = z10;
    }
}
