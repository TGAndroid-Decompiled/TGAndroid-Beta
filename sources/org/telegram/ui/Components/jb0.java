package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class jb0 extends org.telegram.ui.Cells.n9 {
    public final sb0 B0;

    public jb0(sb0 sb0Var) {
        this.B0 = sb0Var;
        this.f24515h0 = sb0Var.W.C;
    }

    @Override
    public final boolean A(MessageObject messageObject) {
        sb0 sb0Var = this.B0;
        if (sb0Var.f31027a == 0 && !sb0Var.W.d.isSecret && y()) {
            return true;
        }
        return false;
    }

    @Override
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.nn nnVar;
        MessageObject messageObject2;
        sb0 sb0Var = this.B0;
        jb0 jb0Var = sb0Var.f31030e;
        int i12 = jb0Var.v - jb0Var.f24539u;
        yb0 yb0Var = sb0Var.W;
        if (i12 > MessagesController.getInstance(yb0Var.f33461w).quoteLengthMax) {
            sb0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = yb0Var.d;
        messagePreviewParams.quoteStart = jb0Var.f24539u;
        messagePreviewParams.quoteEnd = jb0Var.v;
        MessageObject c3 = sb0Var.c(messageObject);
        if (c3 != null && ((nnVar = yb0Var.d.quote) == null || (messageObject2 = nnVar.f39405a) == null || messageObject2.getId() != c3.getId())) {
            yb0Var.d.quote = org.telegram.ui.nn.b(i10, i11, c3);
        }
        yb0Var.b();
        yb0Var.a(true);
    }

    @Override
    public final boolean b() {
        MessageObject c3;
        TLRPC.Message message;
        sb0 sb0Var = this.B0;
        if (sb0Var.f31027a == 0 && (c3 = sb0Var.c(null)) != null && (message = c3.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = sb0Var.W.d;
        if (messagePreviewParams != null && messagePreviewParams.noforwards) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        MessageObject c3;
        TLRPC.Message message;
        sb0 sb0Var = this.B0;
        int i10 = sb0Var.f31027a;
        if (i10 == 0 && !sb0Var.W.d.isSecret) {
            if (i10 != 0 || (c3 = sb0Var.c(null)) == null || (message = c3.messageOwner) == null || message.rich_message == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 r() {
        return this.f24515h0;
    }

    @Override
    public final void x() {
        super.x();
        kb0 kb0Var = this.B0.f31031f;
        if (kb0Var != null) {
            kb0Var.invalidate();
        }
    }
}
