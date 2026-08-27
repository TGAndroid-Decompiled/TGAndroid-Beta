package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

public final class sa0 extends org.telegram.ui.Cells.k9 {
    public final ab0 B0;

    public sa0(ab0 ab0Var) {
        this.B0 = ab0Var;
        this.f25871h0 = ab0Var.V.B;
    }

    @Override
    public final boolean A(MessageObject messageObject) {
        ab0 ab0Var = this.B0;
        return ab0Var.f26712a == 0 && !ab0Var.V.d.isSecret && y();
    }

    @Override
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.hn hnVar;
        MessageObject messageObject2;
        ab0 ab0Var = this.B0;
        sa0 sa0Var = ab0Var.f26715e;
        int i12 = sa0Var.v - sa0Var.f25895u;
        gb0 gb0Var = ab0Var.V;
        if (i12 > MessagesController.getInstance(gb0Var.f28588w).quoteLengthMax) {
            ab0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = gb0Var.d;
        messagePreviewParams.quoteStart = sa0Var.f25895u;
        messagePreviewParams.quoteEnd = sa0Var.v;
        MessageObject messageObjectC = ab0Var.c(messageObject);
        if (messageObjectC != null && ((hnVar = gb0Var.d.quote) == null || (messageObject2 = hnVar.f38861a) == null || messageObject2.getId() != messageObjectC.getId())) {
            gb0Var.d.quote = org.telegram.ui.hn.b(i10, i11, messageObjectC);
        }
        gb0Var.b();
        gb0Var.a(true);
    }

    @Override
    public final boolean b() {
        MessageObject messageObjectC;
        TLRPC.Message message;
        ab0 ab0Var = this.B0;
        if (ab0Var.f26712a == 0 && (messageObjectC = ab0Var.c(null)) != null && (message = messageObjectC.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = ab0Var.V.d;
        return messagePreviewParams == null || !messagePreviewParams.noforwards;
    }

    @Override
    public final boolean e() {
        MessageObject messageObjectC;
        TLRPC.Message message;
        ab0 ab0Var = this.B0;
        int i10 = ab0Var.f26712a;
        if (i10 != 0 || ab0Var.V.d.isSecret) {
            return false;
        }
        return i10 != 0 || (messageObjectC = ab0Var.c(null)) == null || (message = messageObjectC.messageOwner) == null || message.rich_message == null;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 r() {
        return this.f25871h0;
    }

    @Override
    public final void x() {
        super.x();
        ta0 ta0Var = this.B0.f26716f;
        if (ta0Var != null) {
            ta0Var.invalidate();
        }
    }
}
