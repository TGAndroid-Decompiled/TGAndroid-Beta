package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public final class ai implements org.telegram.ui.Components.sk0 {

    public final rn f36538a;

    public ai(rn rnVar) {
        this.f36538a = rnVar;
    }

    @Override
    public final boolean mo5c(float f10, float f11, int i10, View view) {
        boolean z10;
        View view2;
        boolean zI7;
        rn rnVar = this.f36538a;
        km kmVar = rnVar.Y8;
        if ((kmVar == null || !kmVar.f25899z) && !rnVar.b9() && !((org.telegram.ui.ActionBar.n2) rnVar).inPreviewMode && !rnVar.Ka) {
            rnVar.f42294z4 = true;
            if (view instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                MessageObject messageObject = v0Var.getMessageObject();
                if (messageObject != null) {
                    if ((messageObject.messageOwner.action instanceof TLRPC.TL_messageActionSetMessagesTTL) || v0Var.getMessageObject().type == 21 || v0Var.getMessageObject().isWallpaperAction() || v0Var.getMessageObject().type == 30) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            } else {
                z10 = true;
            }
            if (((org.telegram.ui.ActionBar.n2) rnVar).actionBar.t() || (rnVar.A9() && !z10)) {
                view2 = view;
                rn.b2(rnVar, view2, view2 instanceof org.telegram.ui.Cells.s1 ? !((org.telegram.ui.Cells.s1) view2).h3(f10) : false, f10, f11);
                zI7 = true;
            } else {
                view2 = view;
                zI7 = rnVar.I7(view2, false, true, f10, f11, true, true, false);
            }
            if (view2 instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view2;
                if (s1Var.getMessageObject() != null && s1Var.getMessageObject().type != 27) {
                    rn.c2(rnVar, i10);
                    return true;
                }
            }
            return zI7;
        }
        return false;
    }

    @Override
    public final void i() {
    }

    @Override
    public final void s(float f10) {
    }
}
