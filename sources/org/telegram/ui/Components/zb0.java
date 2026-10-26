package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichQuote;
import org.telegram.tgnet.TLRPC;
public final class zb0 extends org.telegram.ui.Cells.t9 {
    public final hc0 f35289w0;

    public zb0(hc0 hc0Var) {
        this.f35289w0 = hc0Var;
        this.f24098g0 = hc0Var.f28919c0.F;
    }

    @Override
    public final void I(MessageObject messageObject, int i10, int i11) {
        org.telegram.ui.kn knVar;
        MessageObject messageObject2;
        hc0 hc0Var = this.f35289w0;
        zb0 zb0Var = hc0Var.e;
        int i12 = zb0Var.v - zb0Var.f24118u;
        nc0 nc0Var = hc0Var.f28919c0;
        if (i12 > MessagesController.getInstance(nc0Var.f30963w).quoteLengthMax) {
            hc0Var.g();
            return;
        }
        MessagePreviewParams messagePreviewParams = nc0Var.d;
        messagePreviewParams.quoteStart = zb0Var.f24118u;
        messagePreviewParams.quoteEnd = zb0Var.v;
        MessageObject c10 = hc0Var.c(messageObject);
        if (c10 != null && ((knVar = nc0Var.d.quote) == null || knVar.f40988m || (messageObject2 = knVar.f40979a) == null || messageObject2.getId() != c10.getId())) {
            nc0Var.d.quote = org.telegram.ui.kn.c(c10, i10, i11);
        }
        nc0Var.b();
        nc0Var.a(true);
    }

    @Override
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        hc0 hc0Var = this.f35289w0;
        if (hc0Var.f28914a == 0 && (c10 = hc0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = hc0Var.f28919c0.d;
        if (messagePreviewParams != null && messagePreviewParams.noforwards) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        hc0 hc0Var = this.f35289w0;
        int i10 = hc0Var.f28914a;
        if (i10 == 0 && !hc0Var.f28919c0.d.isSecret) {
            if (i10 != 0 || (c10 = hc0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null || RichQuote.canQuote(hc0Var.c(null))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.u6 q() {
        return this.f24098g0;
    }

    @Override
    public final void w() {
        super.w();
        ac0 ac0Var = this.f35289w0.f28920f;
        if (ac0Var != null) {
            ac0Var.invalidate();
        }
    }

    @Override
    public final boolean z(MessageObject messageObject) {
        hc0 hc0Var = this.f35289w0;
        if (hc0Var.f28914a == 0 && !hc0Var.f28919c0.d.isSecret && x()) {
            return true;
        }
        return false;
    }
}
