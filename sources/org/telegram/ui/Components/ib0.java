package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ib0 extends org.telegram.ui.Cells.m9 {
    public final rb0 B0;

    public ib0(rb0 rb0Var) {
        this.B0 = rb0Var;
        this.f22613h0 = rb0Var.W.C;
    }

    @Override
    public final boolean A(MessageObject messageObject) {
        rb0 rb0Var = this.B0;
        if (rb0Var.f28440a == 0 && !rb0Var.W.d.isSecret && y()) {
            return true;
        }
        return false;
    }

    @Override
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.pn pnVar;
        MessageObject messageObject2;
        rb0 rb0Var = this.B0;
        ib0 ib0Var = rb0Var.e;
        int i12 = ib0Var.v - ib0Var.f22637u;
        xb0 xb0Var = rb0Var.W;
        if (i12 > MessagesController.getInstance(xb0Var.f30580w).quoteLengthMax) {
            rb0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = xb0Var.d;
        messagePreviewParams.quoteStart = ib0Var.f22637u;
        messagePreviewParams.quoteEnd = ib0Var.v;
        MessageObject c3 = rb0Var.c(messageObject);
        if (c3 != null && ((pnVar = xb0Var.d.quote) == null || (messageObject2 = pnVar.f37189a) == null || messageObject2.getId() != c3.getId())) {
            xb0Var.d.quote = org.telegram.ui.pn.b(i10, i11, c3);
        }
        xb0Var.b();
        xb0Var.a(true);
    }

    @Override
    public final boolean b() {
        MessageObject c3;
        TLRPC.Message message;
        rb0 rb0Var = this.B0;
        if (rb0Var.f28440a == 0 && (c3 = rb0Var.c(null)) != null && (message = c3.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = rb0Var.W.d;
        if (messagePreviewParams != null && messagePreviewParams.noforwards) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        MessageObject c3;
        TLRPC.Message message;
        rb0 rb0Var = this.B0;
        int i10 = rb0Var.f28440a;
        if (i10 == 0 && !rb0Var.W.d.isSecret) {
            if (i10 != 0 || (c3 = rb0Var.c(null)) == null || (message = c3.messageOwner) == null || message.rich_message == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 r() {
        return this.f22613h0;
    }

    @Override
    public final void x() {
        super.x();
        jb0 jb0Var = this.B0.f28443f;
        if (jb0Var != null) {
            jb0Var.invalidate();
        }
    }
}
