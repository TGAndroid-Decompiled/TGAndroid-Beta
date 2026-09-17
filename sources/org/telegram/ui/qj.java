package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class qj extends org.telegram.ui.Components.eo {
    public final bo f36928v0;

    public qj(bo boVar, Context context, bo boVar2, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, boVar2, z10, f6Var);
        this.f36928v0 = boVar;
    }

    @Override
    public final boolean a() {
        boolean z10;
        bo boVar = this.f36928v0;
        if (!boVar.Oa && !boVar.isInPreviewMode()) {
            z10 = ((org.telegram.ui.ActionBar.o2) boVar).inBubbleMode;
            if (!z10 && boVar.f32327j0 != null && !boVar.f32441s3) {
                if (!boVar.F9() || boVar.f32306h4) {
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
        bo boVar = this.f36928v0;
        TLRPC.User user = boVar.f32277f;
        if (user != null && user.linked_community_id != 0) {
            boVar.showDialog(new fi.k0(boVar, boVar.f32277f.linked_community_id, null, null));
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
        bo boVar = this.f36928v0;
        if (boVar.E9()) {
            str = "";
        } else {
            str = null;
        }
        boVar.la(str);
    }

    @Override
    public final boolean o() {
        if (this.f36928v0.R3 == 3) {
            return true;
        }
        return false;
    }
}
