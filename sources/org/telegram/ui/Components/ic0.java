package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ic0 extends org.telegram.ui.Cells.p9 {
    public final qc0 f27275w0;

    public ic0(qc0 qc0Var) {
        this.f27275w0 = qc0Var;
        this.f21856g0 = qc0Var.f30132c0.F;
    }

    @Override
    public final void I(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.pn pnVar;
        MessageObject messageObject2;
        qc0 qc0Var = this.f27275w0;
        ic0 ic0Var = qc0Var.f30133e;
        int i12 = ic0Var.v - ic0Var.f21876u;
        wc0 wc0Var = qc0Var.f30132c0;
        if (i12 > MessagesController.getInstance(wc0Var.f32620w).quoteLengthMax) {
            qc0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = wc0Var.d;
        messagePreviewParams.quoteStart = ic0Var.f21876u;
        messagePreviewParams.quoteEnd = ic0Var.v;
        MessageObject c10 = qc0Var.c(messageObject);
        if (c10 != null && ((pnVar = wc0Var.d.quote) == null || (messageObject2 = pnVar.f40912a) == null || messageObject2.getId() != c10.getId())) {
            wc0Var.d.quote = org.telegram.ui.pn.b(i10, i11, c10);
        }
        wc0Var.b();
        wc0Var.a(true);
    }

    @Override
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        qc0 qc0Var = this.f27275w0;
        if (qc0Var.f30127a == 0 && (c10 = qc0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = qc0Var.f30132c0.d;
        if (messagePreviewParams != null && messagePreviewParams.noforwards) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        qc0 qc0Var = this.f27275w0;
        int i10 = qc0Var.f30127a;
        if (i10 == 0 && !qc0Var.f30132c0.d.isSecret) {
            if (i10 != 0 || (c10 = qc0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 q() {
        return this.f21856g0;
    }

    @Override
    public final void w() {
        super.w();
        jc0 jc0Var = this.f27275w0.f30134f;
        if (jc0Var != null) {
            jc0Var.invalidate();
        }
    }

    @Override
    public final boolean z(MessageObject messageObject) {
        qc0 qc0Var = this.f27275w0;
        if (qc0Var.f30127a == 0 && !qc0Var.f30132c0.d.isSecret && x()) {
            return true;
        }
        return false;
    }
}
