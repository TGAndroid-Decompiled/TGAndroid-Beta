package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichQuote;
import org.telegram.tgnet.TLRPC;
public final class bc0 extends org.telegram.ui.Cells.p9 {
    public final jc0 f24964w0;

    public bc0(jc0 jc0Var) {
        this.f24964w0 = jc0Var;
        this.f22165g0 = jc0Var.f27674c0.F;
    }

    @Override
    public final void I(MessageObject messageObject, int i10, int i11) {
        org.telegram.ui.in inVar;
        MessageObject messageObject2;
        jc0 jc0Var = this.f24964w0;
        bc0 bc0Var = jc0Var.e;
        int i12 = bc0Var.v - bc0Var.f22185u;
        pc0 pc0Var = jc0Var.f27674c0;
        if (i12 > MessagesController.getInstance(pc0Var.f29544w).quoteLengthMax) {
            jc0Var.g();
            return;
        }
        MessagePreviewParams messagePreviewParams = pc0Var.d;
        messagePreviewParams.quoteStart = bc0Var.f22185u;
        messagePreviewParams.quoteEnd = bc0Var.v;
        MessageObject c10 = jc0Var.c(messageObject);
        if (c10 != null && ((inVar = pc0Var.d.quote) == null || inVar.f38341m || (messageObject2 = inVar.f38332a) == null || messageObject2.getId() != c10.getId())) {
            pc0Var.d.quote = org.telegram.ui.in.c(c10, i10, i11);
        }
        pc0Var.b();
        pc0Var.a(true);
    }

    @Override
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        jc0 jc0Var = this.f24964w0;
        if (jc0Var.f27669a == 0 && (c10 = jc0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = jc0Var.f27674c0.d;
        if (messagePreviewParams != null && messagePreviewParams.noforwards) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        jc0 jc0Var = this.f24964w0;
        int i10 = jc0Var.f27669a;
        if (i10 == 0 && !jc0Var.f27674c0.d.isSecret) {
            if (i10 != 0 || (c10 = jc0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null || RichQuote.canQuote(jc0Var.c(null))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 q() {
        return this.f22165g0;
    }

    @Override
    public final void w() {
        super.w();
        cc0 cc0Var = this.f24964w0.f27675f;
        if (cc0Var != null) {
            cc0Var.invalidate();
        }
    }

    @Override
    public final boolean z(MessageObject messageObject) {
        jc0 jc0Var = this.f24964w0;
        if (jc0Var.f27669a == 0 && !jc0Var.f27674c0.d.isSecret && x()) {
            return true;
        }
        return false;
    }
}
