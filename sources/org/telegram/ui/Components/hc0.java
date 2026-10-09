package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class hc0 extends org.telegram.ui.Cells.p9 {
    public final pc0 f27036w0;

    public hc0(pc0 pc0Var) {
        this.f27036w0 = pc0Var;
        this.f21864g0 = pc0Var.f29845c0.F;
    }

    @Override
    public final void I(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.pn pnVar;
        MessageObject messageObject2;
        pc0 pc0Var = this.f27036w0;
        hc0 hc0Var = pc0Var.f29846e;
        int i12 = hc0Var.v - hc0Var.f21884u;
        vc0 vc0Var = pc0Var.f29845c0;
        if (i12 > MessagesController.getInstance(vc0Var.f31755w).quoteLengthMax) {
            pc0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = vc0Var.d;
        messagePreviewParams.quoteStart = hc0Var.f21884u;
        messagePreviewParams.quoteEnd = hc0Var.v;
        MessageObject c10 = pc0Var.c(messageObject);
        if (c10 != null && ((pnVar = vc0Var.d.quote) == null || (messageObject2 = pnVar.f40843a) == null || messageObject2.getId() != c10.getId())) {
            vc0Var.d.quote = org.telegram.ui.pn.b(i10, i11, c10);
        }
        vc0Var.b();
        vc0Var.a(true);
    }

    @Override
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        pc0 pc0Var = this.f27036w0;
        if (pc0Var.f29840a == 0 && (c10 = pc0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = pc0Var.f29845c0.d;
        if (messagePreviewParams != null && messagePreviewParams.noforwards) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        pc0 pc0Var = this.f27036w0;
        int i10 = pc0Var.f29840a;
        if (i10 == 0 && !pc0Var.f29845c0.d.isSecret) {
            if (i10 != 0 || (c10 = pc0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 q() {
        return this.f21864g0;
    }

    @Override
    public final void w() {
        super.w();
        ic0 ic0Var = this.f27036w0.f29847f;
        if (ic0Var != null) {
            ic0Var.invalidate();
        }
    }

    @Override
    public final boolean z(MessageObject messageObject) {
        pc0 pc0Var = this.f27036w0;
        if (pc0Var.f29840a == 0 && !pc0Var.f29845c0.d.isSecret && x()) {
            return true;
        }
        return false;
    }
}
