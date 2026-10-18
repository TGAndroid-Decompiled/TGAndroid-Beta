package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichQuote;
import org.telegram.tgnet.TLRPC;
public final class ac0 extends org.telegram.ui.Cells.o9 {
    public final ic0 f24567w0;

    public ac0(ic0 ic0Var) {
        this.f24567w0 = ic0Var;
        this.f21996g0 = ic0Var.f27192c0.F;
    }

    @Override
    public final void I(MessageObject messageObject, int i10, int i11) {
        org.telegram.ui.in inVar;
        MessageObject messageObject2;
        ic0 ic0Var = this.f24567w0;
        ac0 ac0Var = ic0Var.e;
        int i12 = ac0Var.v - ac0Var.f22016u;
        oc0 oc0Var = ic0Var.f27192c0;
        if (i12 > MessagesController.getInstance(oc0Var.f28935w).quoteLengthMax) {
            ic0Var.g();
            return;
        }
        MessagePreviewParams messagePreviewParams = oc0Var.d;
        messagePreviewParams.quoteStart = ac0Var.f22016u;
        messagePreviewParams.quoteEnd = ac0Var.v;
        MessageObject c10 = ic0Var.c(messageObject);
        if (c10 != null && ((inVar = oc0Var.d.quote) == null || inVar.f37946m || (messageObject2 = inVar.f37937a) == null || messageObject2.getId() != c10.getId())) {
            oc0Var.d.quote = org.telegram.ui.in.c(c10, i10, i11);
        }
        oc0Var.b();
        oc0Var.a(true);
    }

    @Override
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        ic0 ic0Var = this.f24567w0;
        if (ic0Var.f27187a == 0 && (c10 = ic0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = ic0Var.f27192c0.d;
        if (messagePreviewParams != null && messagePreviewParams.noforwards) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        ic0 ic0Var = this.f24567w0;
        int i10 = ic0Var.f27187a;
        if (i10 == 0 && !ic0Var.f27192c0.d.isSecret) {
            if (i10 != 0 || (c10 = ic0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null || RichQuote.canQuote(ic0Var.c(null))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 q() {
        return this.f21996g0;
    }

    @Override
    public final void w() {
        super.w();
        bc0 bc0Var = this.f24567w0.f27193f;
        if (bc0Var != null) {
            bc0Var.invalidate();
        }
    }

    @Override
    public final boolean z(MessageObject messageObject) {
        ic0 ic0Var = this.f24567w0;
        if (ic0Var.f27187a == 0 && !ic0Var.f27192c0.d.isSecret && x()) {
            return true;
        }
        return false;
    }
}
