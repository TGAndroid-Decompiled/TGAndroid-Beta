package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class gb0 extends org.telegram.ui.Cells.s9 {
    public final ob0 B0;

    public gb0(ob0 ob0Var) {
        this.B0 = ob0Var;
        this.f19989h0 = ob0Var.f26708c0.F;
    }

    @Override
    public final boolean A(MessageObject messageObject) {
        ob0 ob0Var = this.B0;
        if (ob0Var.f26703a == 0 && !ob0Var.f26708c0.d.isSecret && y()) {
            return true;
        }
        return false;
    }

    @Override
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.nn nnVar;
        MessageObject messageObject2;
        ob0 ob0Var = this.B0;
        gb0 gb0Var = ob0Var.e;
        int i12 = gb0Var.v - gb0Var.f20013u;
        ub0 ub0Var = ob0Var.f26708c0;
        if (i12 > MessagesController.getInstance(ub0Var.f28455w).quoteLengthMax) {
            ob0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = ub0Var.d;
        messagePreviewParams.quoteStart = gb0Var.f20013u;
        messagePreviewParams.quoteEnd = gb0Var.v;
        MessageObject c10 = ob0Var.c(messageObject);
        if (c10 != null && ((nnVar = ub0Var.d.quote) == null || (messageObject2 = nnVar.f35557a) == null || messageObject2.getId() != c10.getId())) {
            ub0Var.d.quote = org.telegram.ui.nn.b(i10, i11, c10);
        }
        ub0Var.b();
        ub0Var.a(true);
    }

    @Override
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        ob0 ob0Var = this.B0;
        if (ob0Var.f26703a == 0 && (c10 = ob0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = ob0Var.f26708c0.d;
        if (messagePreviewParams != null && messagePreviewParams.noforwards) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        ob0 ob0Var = this.B0;
        int i10 = ob0Var.f26703a;
        if (i10 == 0 && !ob0Var.f26708c0.d.isSecret) {
            if (i10 != 0 || (c10 = ob0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 r() {
        return this.f19989h0;
    }

    @Override
    public final void x() {
        super.x();
        hb0 hb0Var = this.B0.f26709f;
        if (hb0Var != null) {
            hb0Var.invalidate();
        }
    }
}
