package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichQuote;
import org.telegram.tgnet.TLRPC;
public final class dc0 extends org.telegram.ui.Cells.p9 {
    public final lc0 f25590w0;

    public dc0(lc0 lc0Var) {
        this.f25590w0 = lc0Var;
        this.f22164g0 = lc0Var.f28340c0.F;
    }

    @Override
    public final void I(MessageObject messageObject, int i10, int i11) {
        org.telegram.ui.in inVar;
        MessageObject messageObject2;
        lc0 lc0Var = this.f25590w0;
        dc0 dc0Var = lc0Var.e;
        int i12 = dc0Var.v - dc0Var.f22184u;
        rc0 rc0Var = lc0Var.f28340c0;
        if (i12 > MessagesController.getInstance(rc0Var.f30150w).quoteLengthMax) {
            lc0Var.g();
            return;
        }
        MessagePreviewParams messagePreviewParams = rc0Var.d;
        messagePreviewParams.quoteStart = dc0Var.f22184u;
        messagePreviewParams.quoteEnd = dc0Var.v;
        MessageObject c10 = lc0Var.c(messageObject);
        if (c10 != null && ((inVar = rc0Var.d.quote) == null || inVar.f38279m || (messageObject2 = inVar.f38270a) == null || messageObject2.getId() != c10.getId())) {
            rc0Var.d.quote = org.telegram.ui.in.c(c10, i10, i11);
        }
        rc0Var.b();
        rc0Var.a(true);
    }

    @Override
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        lc0 lc0Var = this.f25590w0;
        if (lc0Var.f28335a == 0 && (c10 = lc0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = lc0Var.f28340c0.d;
        if (messagePreviewParams != null && messagePreviewParams.noforwards) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        lc0 lc0Var = this.f25590w0;
        int i10 = lc0Var.f28335a;
        if (i10 == 0 && !lc0Var.f28340c0.d.isSecret) {
            if (i10 != 0 || (c10 = lc0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null || RichQuote.canQuote(lc0Var.c(null))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 q() {
        return this.f22164g0;
    }

    @Override
    public final void w() {
        super.w();
        ec0 ec0Var = this.f25590w0.f28341f;
        if (ec0Var != null) {
            ec0Var.invalidate();
        }
    }

    @Override
    public final boolean z(MessageObject messageObject) {
        lc0 lc0Var = this.f25590w0;
        if (lc0Var.f28335a == 0 && !lc0Var.f28340c0.d.isSecret && x()) {
            return true;
        }
        return false;
    }
}
