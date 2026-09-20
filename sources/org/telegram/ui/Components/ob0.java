package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ob0 extends org.telegram.ui.Cells.s9 {
    public final xb0 B0;

    public ob0(xb0 xb0Var) {
        this.B0 = xb0Var;
        this.f20215h0 = xb0Var.f30229c0.F;
    }

    @Override
    public final boolean A(MessageObject messageObject) {
        xb0 xb0Var = this.B0;
        if (xb0Var.f30224a == 0 && !xb0Var.f30229c0.d.isSecret && y()) {
            return true;
        }
        return false;
    }

    @Override
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.pn pnVar;
        MessageObject messageObject2;
        xb0 xb0Var = this.B0;
        ob0 ob0Var = xb0Var.e;
        int i12 = ob0Var.v - ob0Var.f20239u;
        dc0 dc0Var = xb0Var.f30229c0;
        if (i12 > MessagesController.getInstance(dc0Var.f23557w).quoteLengthMax) {
            xb0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = dc0Var.d;
        messagePreviewParams.quoteStart = ob0Var.f20239u;
        messagePreviewParams.quoteEnd = ob0Var.v;
        MessageObject c10 = xb0Var.c(messageObject);
        if (c10 != null && ((pnVar = dc0Var.d.quote) == null || (messageObject2 = pnVar.f36592a) == null || messageObject2.getId() != c10.getId())) {
            dc0Var.d.quote = org.telegram.ui.pn.b(i10, i11, c10);
        }
        dc0Var.b();
        dc0Var.a(true);
    }

    @Override
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        xb0 xb0Var = this.B0;
        if (xb0Var.f30224a == 0 && (c10 = xb0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = xb0Var.f30229c0.d;
        if (messagePreviewParams != null && messagePreviewParams.noforwards) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        xb0 xb0Var = this.B0;
        int i10 = xb0Var.f30224a;
        if (i10 == 0 && !xb0Var.f30229c0.d.isSecret) {
            if (i10 != 0 || (c10 = xb0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 r() {
        return this.f20215h0;
    }

    @Override
    public final void x() {
        super.x();
        pb0 pb0Var = this.B0.f30230f;
        if (pb0Var != null) {
            pb0Var.invalidate();
        }
    }
}
