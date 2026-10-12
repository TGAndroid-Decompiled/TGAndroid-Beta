package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class lc0 extends org.telegram.ui.Cells.p9 {
    public final tc0 f28146w0;

    public lc0(tc0 tc0Var) {
        this.f28146w0 = tc0Var;
        this.f21627g0 = tc0Var.f30859c0.F;
    }

    @Override
    public final void I(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.tn tnVar;
        MessageObject messageObject2;
        tc0 tc0Var = this.f28146w0;
        lc0 lc0Var = tc0Var.f30860e;
        int i12 = lc0Var.v - lc0Var.f21647u;
        zc0 zc0Var = tc0Var.f30859c0;
        if (i12 > MessagesController.getInstance(zc0Var.f33338w).quoteLengthMax) {
            tc0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = zc0Var.d;
        messagePreviewParams.quoteStart = lc0Var.f21647u;
        messagePreviewParams.quoteEnd = lc0Var.v;
        MessageObject c10 = tc0Var.c(messageObject);
        if (c10 != null && ((tnVar = zc0Var.d.quote) == null || (messageObject2 = tnVar.f42244a) == null || messageObject2.getId() != c10.getId())) {
            zc0Var.d.quote = org.telegram.ui.tn.b(i10, i11, c10);
        }
        zc0Var.b();
        zc0Var.a(true);
    }

    @Override
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        tc0 tc0Var = this.f28146w0;
        if (tc0Var.f30854a == 0 && (c10 = tc0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = tc0Var.f30859c0.d;
        if (messagePreviewParams != null && messagePreviewParams.noforwards) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        tc0 tc0Var = this.f28146w0;
        int i10 = tc0Var.f30854a;
        if (i10 == 0 && !tc0Var.f30859c0.d.isSecret) {
            if (i10 != 0 || (c10 = tc0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 q() {
        return this.f21627g0;
    }

    @Override
    public final void w() {
        super.w();
        mc0 mc0Var = this.f28146w0.f30861f;
        if (mc0Var != null) {
            mc0Var.invalidate();
        }
    }

    @Override
    public final boolean z(MessageObject messageObject) {
        tc0 tc0Var = this.f28146w0;
        if (tc0Var.f30854a == 0 && !tc0Var.f30859c0.d.isSecret && x()) {
            return true;
        }
        return false;
    }
}
