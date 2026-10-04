package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class tb0 extends org.telegram.ui.Cells.r9 {
    public final cc0 B0;

    public tb0(cc0 cc0Var) {
        this.B0 = cc0Var;
        this.f21955h0 = cc0Var.f25320c0.F;
    }

    @Override
    public final boolean A(MessageObject messageObject) {
        cc0 cc0Var = this.B0;
        if (cc0Var.f25315a == 0 && !cc0Var.f25320c0.d.isSecret && y()) {
            return true;
        }
        return false;
    }

    @Override
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.on onVar;
        MessageObject messageObject2;
        cc0 cc0Var = this.B0;
        tb0 tb0Var = cc0Var.f25321e;
        int i12 = tb0Var.v - tb0Var.f21979u;
        ic0 ic0Var = cc0Var.f25320c0;
        if (i12 > MessagesController.getInstance(ic0Var.f27363w).quoteLengthMax) {
            cc0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = ic0Var.d;
        messagePreviewParams.quoteStart = tb0Var.f21979u;
        messagePreviewParams.quoteEnd = tb0Var.v;
        MessageObject c10 = cc0Var.c(messageObject);
        if (c10 != null && ((onVar = ic0Var.d.quote) == null || (messageObject2 = onVar.f39235a) == null || messageObject2.getId() != c10.getId())) {
            ic0Var.d.quote = org.telegram.ui.on.b(i10, i11, c10);
        }
        ic0Var.b();
        ic0Var.a(true);
    }

    @Override
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        cc0 cc0Var = this.B0;
        if (cc0Var.f25315a == 0 && (c10 = cc0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = cc0Var.f25320c0.d;
        if (messagePreviewParams != null && messagePreviewParams.noforwards) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        cc0 cc0Var = this.B0;
        int i10 = cc0Var.f25315a;
        if (i10 == 0 && !cc0Var.f25320c0.d.isSecret) {
            if (i10 != 0 || (c10 = cc0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 r() {
        return this.f21955h0;
    }

    @Override
    public final void x() {
        super.x();
        ub0 ub0Var = this.B0.f25322f;
        if (ub0Var != null) {
            ub0Var.invalidate();
        }
    }
}
