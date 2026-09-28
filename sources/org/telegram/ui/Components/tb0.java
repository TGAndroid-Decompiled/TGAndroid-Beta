package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class tb0 extends org.telegram.ui.Cells.r9 {
    public final bc0 B0;

    public tb0(bc0 bc0Var) {
        this.B0 = bc0Var;
        this.f20168h0 = bc0Var.f22951c0.F;
    }

    @Override
    public final boolean A(MessageObject messageObject) {
        bc0 bc0Var = this.B0;
        if (bc0Var.f22946a == 0 && !bc0Var.f22951c0.d.isSecret && y()) {
            return true;
        }
        return false;
    }

    @Override
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.mn mnVar;
        MessageObject messageObject2;
        bc0 bc0Var = this.B0;
        tb0 tb0Var = bc0Var.e;
        int i12 = tb0Var.v - tb0Var.f20192u;
        hc0 hc0Var = bc0Var.f22951c0;
        if (i12 > MessagesController.getInstance(hc0Var.f24779w).quoteLengthMax) {
            bc0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = hc0Var.d;
        messagePreviewParams.quoteStart = tb0Var.f20192u;
        messagePreviewParams.quoteEnd = tb0Var.v;
        MessageObject c10 = bc0Var.c(messageObject);
        if (c10 != null && ((mnVar = hc0Var.d.quote) == null || (messageObject2 = mnVar.f35625a) == null || messageObject2.getId() != c10.getId())) {
            hc0Var.d.quote = org.telegram.ui.mn.b(i10, i11, c10);
        }
        hc0Var.b();
        hc0Var.a(true);
    }

    @Override
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        bc0 bc0Var = this.B0;
        if (bc0Var.f22946a == 0 && (c10 = bc0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = bc0Var.f22951c0.d;
        if (messagePreviewParams != null && messagePreviewParams.noforwards) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        bc0 bc0Var = this.B0;
        int i10 = bc0Var.f22946a;
        if (i10 == 0 && !bc0Var.f22951c0.d.isSecret) {
            if (i10 != 0 || (c10 = bc0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 r() {
        return this.f20168h0;
    }

    @Override
    public final void x() {
        super.x();
        ub0 ub0Var = this.B0.f22952f;
        if (ub0Var != null) {
            ub0Var.invalidate();
        }
    }
}
