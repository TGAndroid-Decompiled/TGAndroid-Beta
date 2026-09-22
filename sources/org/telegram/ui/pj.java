package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class pj extends org.telegram.ui.Components.eo {
    public final bo f36589v0;

    public pj(bo boVar, Context context, bo boVar2, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, boVar2, z10, e6Var);
        this.f36589v0 = boVar;
    }

    @Override
    public final boolean a() {
        boolean z10;
        bo boVar = this.f36589v0;
        if (!boVar.Oa && !boVar.isInPreviewMode()) {
            z10 = ((org.telegram.ui.ActionBar.n2) boVar).inBubbleMode;
            if (!z10 && boVar.f32344j0 != null && !boVar.f32458s3) {
                if (!boVar.F9() || boVar.f32323h4) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean d() {
        bo boVar = this.f36589v0;
        TLRPC.User user = boVar.f32295f;
        if (user != null && user.linked_community_id != 0) {
            boVar.showDialog(new fi.k0(boVar, boVar.f32295f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = boVar.e;
        if (chat != null && chat.linked_community_id != 0) {
            boVar.showDialog(new fi.k0(boVar, boVar.e.linked_community_id, null, null));
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        String str;
        bo boVar = this.f36589v0;
        if (boVar.E9()) {
            str = "";
        } else {
            str = null;
        }
        boVar.la(str);
    }

    @Override
    public final boolean o() {
        if (this.f36589v0.R3 == 3) {
            return true;
        }
        return false;
    }
}
