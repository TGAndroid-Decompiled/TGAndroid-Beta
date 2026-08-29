package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class db0 extends org.telegram.ui.Cells.l9 {
    public final lb0 B0;

    public db0(lb0 lb0Var) {
        this.B0 = lb0Var;
        this.f25945h0 = lb0Var.V.B;
    }

    @Override
    public final boolean A(MessageObject messageObject) {
        lb0 lb0Var = this.B0;
        if (lb0Var.f30273a == 0 && !lb0Var.V.d.isSecret && y()) {
            return true;
        }
        return false;
    }

    @Override
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.jn jnVar;
        MessageObject messageObject2;
        lb0 lb0Var = this.B0;
        db0 db0Var = lb0Var.f30276e;
        int i12 = db0Var.v - db0Var.f25969u;
        rb0 rb0Var = lb0Var.V;
        if (i12 > MessagesController.getInstance(rb0Var.f32257w).quoteLengthMax) {
            lb0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = rb0Var.d;
        messagePreviewParams.quoteStart = db0Var.f25969u;
        messagePreviewParams.quoteEnd = db0Var.v;
        MessageObject c3 = lb0Var.c(messageObject);
        if (c3 != null && ((jnVar = rb0Var.d.quote) == null || (messageObject2 = jnVar.f39590a) == null || messageObject2.getId() != c3.getId())) {
            rb0Var.d.quote = org.telegram.ui.jn.b(i10, i11, c3);
        }
        rb0Var.b();
        rb0Var.a(true);
    }

    @Override
    public final boolean b() {
        MessageObject c3;
        TLRPC.Message message;
        lb0 lb0Var = this.B0;
        if (lb0Var.f30273a == 0 && (c3 = lb0Var.c(null)) != null && (message = c3.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = lb0Var.V.d;
        if (messagePreviewParams != null && messagePreviewParams.noforwards) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        MessageObject c3;
        TLRPC.Message message;
        lb0 lb0Var = this.B0;
        int i10 = lb0Var.f30273a;
        if (i10 == 0 && !lb0Var.V.d.isSecret) {
            if (i10 != 0 || (c3 = lb0Var.c(null)) == null || (message = c3.messageOwner) == null || message.rich_message == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 r() {
        return this.f25945h0;
    }

    @Override
    public final void x() {
        super.x();
        eb0 eb0Var = this.B0.f30277f;
        if (eb0Var != null) {
            eb0Var.invalidate();
        }
    }
}
