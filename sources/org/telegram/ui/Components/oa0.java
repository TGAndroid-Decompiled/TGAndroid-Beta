package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class oa0 extends org.telegram.ui.Cells.o9 {
    public final wa0 B0;

    public oa0(wa0 wa0Var) {
        this.B0 = wa0Var;
        this.f24084h0 = wa0Var.V.B;
    }

    @Override
    public final boolean A(MessageObject messageObject) {
        wa0 wa0Var = this.B0;
        if (wa0Var.f34168a == 0 && !wa0Var.V.d.isSecret && y()) {
            return true;
        }
        return false;
    }

    @Override
    public final void J(int i9, int i10, MessageObject messageObject) {
        org.telegram.ui.gn gnVar;
        MessageObject messageObject2;
        wa0 wa0Var = this.B0;
        oa0 oa0Var = wa0Var.f34171e;
        int i11 = oa0Var.v - oa0Var.f24108u;
        cb0 cb0Var = wa0Var.V;
        if (i11 > MessagesController.getInstance(cb0Var.f27462w).quoteLengthMax) {
            wa0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = cb0Var.d;
        messagePreviewParams.quoteStart = oa0Var.f24108u;
        messagePreviewParams.quoteEnd = oa0Var.v;
        MessageObject c10 = wa0Var.c(messageObject);
        if (c10 != null && ((gnVar = cb0Var.d.quote) == null || (messageObject2 = gnVar.f38572a) == null || messageObject2.getId() != c10.getId())) {
            cb0Var.d.quote = org.telegram.ui.gn.b(i9, i10, c10);
        }
        cb0Var.b();
        cb0Var.a(true);
    }

    @Override
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        wa0 wa0Var = this.B0;
        if (wa0Var.f34168a == 0 && (c10 = wa0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = wa0Var.V.d;
        if (messagePreviewParams != null && messagePreviewParams.noforwards) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        wa0 wa0Var = this.B0;
        int i9 = wa0Var.f34168a;
        if (i9 == 0 && !wa0Var.V.d.isSecret) {
            if (i9 != 0 || (c10 = wa0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.b6 r() {
        return this.f24084h0;
    }

    @Override
    public final void x() {
        super.x();
        pa0 pa0Var = this.B0.f34172f;
        if (pa0Var != null) {
            pa0Var.invalidate();
        }
    }
}
