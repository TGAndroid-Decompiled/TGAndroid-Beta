package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class lc0 extends org.telegram.ui.Cells.p9 {
    public final tc0 f28161w0;

    public lc0(tc0 tc0Var) {
        this.f28161w0 = tc0Var;
        this.f21626g0 = tc0Var.f30856c0.F;
    }

    @Override
    public final void I(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.tn tnVar;
        MessageObject messageObject2;
        tc0 tc0Var = this.f28161w0;
        lc0 lc0Var = tc0Var.f30857e;
        int i12 = lc0Var.v - lc0Var.f21646u;
        zc0 zc0Var = tc0Var.f30856c0;
        if (i12 > MessagesController.getInstance(zc0Var.f33332w).quoteLengthMax) {
            tc0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = zc0Var.d;
        messagePreviewParams.quoteStart = lc0Var.f21646u;
        messagePreviewParams.quoteEnd = lc0Var.v;
        MessageObject c10 = tc0Var.c(messageObject);
        if (c10 != null && ((tnVar = zc0Var.d.quote) == null || (messageObject2 = tnVar.f42242a) == null || messageObject2.getId() != c10.getId())) {
            zc0Var.d.quote = org.telegram.ui.tn.b(i10, i11, c10);
        }
        zc0Var.b();
        zc0Var.a(true);
    }

    @Override
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        tc0 tc0Var = this.f28161w0;
        if (tc0Var.f30851a == 0 && (c10 = tc0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = tc0Var.f30856c0.d;
        if (messagePreviewParams != null && messagePreviewParams.noforwards) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        tc0 tc0Var = this.f28161w0;
        int i10 = tc0Var.f30851a;
        if (i10 == 0 && !tc0Var.f30856c0.d.isSecret) {
            if (i10 != 0 || (c10 = tc0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 q() {
        return this.f21626g0;
    }

    @Override
    public final void w() {
        super.w();
        mc0 mc0Var = this.f28161w0.f30858f;
        if (mc0Var != null) {
            mc0Var.invalidate();
        }
    }

    @Override
    public final boolean z(MessageObject messageObject) {
        tc0 tc0Var = this.f28161w0;
        if (tc0Var.f30851a == 0 && !tc0Var.f30856c0.d.isSecret && x()) {
            return true;
        }
        return false;
    }
}
