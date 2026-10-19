package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichQuote;
import org.telegram.tgnet.TLRPC;
public final class ac0 extends org.telegram.ui.Cells.o9 {
    public final ic0 f24542w0;

    public ac0(ic0 ic0Var) {
        this.f24542w0 = ic0Var;
        this.f21992g0 = ic0Var.f27202c0.F;
    }

    @Override
    public final void I(MessageObject messageObject, int i10, int i11) {
        org.telegram.ui.gn gnVar;
        MessageObject messageObject2;
        ic0 ic0Var = this.f24542w0;
        ac0 ac0Var = ic0Var.e;
        int i12 = ac0Var.v - ac0Var.f22012u;
        oc0 oc0Var = ic0Var.f27202c0;
        if (i12 > MessagesController.getInstance(oc0Var.f28956w).quoteLengthMax) {
            ic0Var.g();
            return;
        }
        MessagePreviewParams messagePreviewParams = oc0Var.d;
        messagePreviewParams.quoteStart = ac0Var.f22012u;
        messagePreviewParams.quoteEnd = ac0Var.v;
        MessageObject c10 = ic0Var.c(messageObject);
        if (c10 != null && ((gnVar = oc0Var.d.quote) == null || gnVar.f37386m || (messageObject2 = gnVar.f37377a) == null || messageObject2.getId() != c10.getId())) {
            oc0Var.d.quote = org.telegram.ui.gn.c(c10, i10, i11);
        }
        oc0Var.b();
        oc0Var.a(true);
    }

    @Override
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        ic0 ic0Var = this.f24542w0;
        if (ic0Var.f27197a == 0 && (c10 = ic0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = ic0Var.f27202c0.d;
        if (messagePreviewParams != null && messagePreviewParams.noforwards) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        ic0 ic0Var = this.f24542w0;
        int i10 = ic0Var.f27197a;
        if (i10 == 0 && !ic0Var.f27202c0.d.isSecret) {
            if (i10 != 0 || (c10 = ic0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null || RichQuote.canQuote(ic0Var.c(null))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 q() {
        return this.f21992g0;
    }

    @Override
    public final void w() {
        super.w();
        bc0 bc0Var = this.f24542w0.f27203f;
        if (bc0Var != null) {
            bc0Var.invalidate();
        }
    }

    @Override
    public final boolean z(MessageObject messageObject) {
        ic0 ic0Var = this.f24542w0;
        if (ic0Var.f27197a == 0 && !ic0Var.f27202c0.d.isSecret && x()) {
            return true;
        }
        return false;
    }
}
