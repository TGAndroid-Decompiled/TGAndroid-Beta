package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class gc0 extends org.telegram.ui.Cells.p9 {
    public final pc0 f24938w0;

    public gc0(pc0 pc0Var) {
        this.f24938w0 = pc0Var;
        this.f20666g0 = pc0Var.f27967c0.F;
    }

    @Override
    public final void I(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.un unVar;
        MessageObject messageObject2;
        pc0 pc0Var = this.f24938w0;
        gc0 gc0Var = pc0Var.e;
        int i12 = gc0Var.v - gc0Var.f20686u;
        vc0 vc0Var = pc0Var.f27967c0;
        if (i12 > MessagesController.getInstance(vc0Var.f29625w).quoteLengthMax) {
            pc0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = vc0Var.d;
        messagePreviewParams.quoteStart = gc0Var.f20686u;
        messagePreviewParams.quoteEnd = gc0Var.v;
        MessageObject c10 = pc0Var.c(messageObject);
        if (c10 != null && ((unVar = vc0Var.d.quote) == null || (messageObject2 = unVar.f40445a) == null || messageObject2.getId() != c10.getId())) {
            vc0Var.d.quote = org.telegram.ui.un.b(i10, i11, c10);
        }
        vc0Var.b();
        vc0Var.a(true);
    }

    @Override
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        pc0 pc0Var = this.f24938w0;
        if (pc0Var.f27962a == 0 && (c10 = pc0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = pc0Var.f27967c0.d;
        if (messagePreviewParams != null && messagePreviewParams.noforwards) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        pc0 pc0Var = this.f24938w0;
        int i10 = pc0Var.f27962a;
        if (i10 == 0 && !pc0Var.f27967c0.d.isSecret) {
            if (i10 != 0 || (c10 = pc0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 q() {
        return this.f20666g0;
    }

    @Override
    public final void w() {
        super.w();
        hc0 hc0Var = this.f24938w0.f27968f;
        if (hc0Var != null) {
            hc0Var.invalidate();
        }
    }

    @Override
    public final boolean z(MessageObject messageObject) {
        pc0 pc0Var = this.f24938w0;
        if (pc0Var.f27962a == 0 && !pc0Var.f27967c0.d.isSecret && x()) {
            return true;
        }
        return false;
    }
}
