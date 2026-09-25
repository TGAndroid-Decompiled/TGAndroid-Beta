package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class rb0 extends org.telegram.ui.Cells.r9 {
    public final zb0 B0;

    public rb0(zb0 zb0Var) {
        this.B0 = zb0Var;
        this.f20168h0 = zb0Var.f30840c0.F;
    }

    @Override
    public final boolean A(MessageObject messageObject) {
        zb0 zb0Var = this.B0;
        if (zb0Var.f30835a == 0 && !zb0Var.f30840c0.d.isSecret && y()) {
            return true;
        }
        return false;
    }

    @Override
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.mn mnVar;
        MessageObject messageObject2;
        zb0 zb0Var = this.B0;
        rb0 rb0Var = zb0Var.e;
        int i12 = rb0Var.v - rb0Var.f20192u;
        fc0 fc0Var = zb0Var.f30840c0;
        if (i12 > MessagesController.getInstance(fc0Var.f24147w).quoteLengthMax) {
            zb0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = fc0Var.d;
        messagePreviewParams.quoteStart = rb0Var.f20192u;
        messagePreviewParams.quoteEnd = rb0Var.v;
        MessageObject c10 = zb0Var.c(messageObject);
        if (c10 != null && ((mnVar = fc0Var.d.quote) == null || (messageObject2 = mnVar.f35625a) == null || messageObject2.getId() != c10.getId())) {
            fc0Var.d.quote = org.telegram.ui.mn.b(i10, i11, c10);
        }
        fc0Var.b();
        fc0Var.a(true);
    }

    @Override
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        zb0 zb0Var = this.B0;
        if (zb0Var.f30835a == 0 && (c10 = zb0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = zb0Var.f30840c0.d;
        if (messagePreviewParams != null && messagePreviewParams.noforwards) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        zb0 zb0Var = this.B0;
        int i10 = zb0Var.f30835a;
        if (i10 == 0 && !zb0Var.f30840c0.d.isSecret) {
            if (i10 != 0 || (c10 = zb0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null) {
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
        sb0 sb0Var = this.B0.f30841f;
        if (sb0Var != null) {
            sb0Var.invalidate();
        }
    }
}
