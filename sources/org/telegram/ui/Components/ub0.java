package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ub0 extends org.telegram.ui.Cells.r9 {
    public final cc0 B0;

    public ub0(cc0 cc0Var) {
        this.B0 = cc0Var;
        this.f20184h0 = cc0Var.f23264c0.F;
    }

    @Override
    public final boolean A(MessageObject messageObject) {
        cc0 cc0Var = this.B0;
        if (cc0Var.f23259a == 0 && !cc0Var.f23264c0.d.isSecret && y()) {
            return true;
        }
        return false;
    }

    @Override
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.mn mnVar;
        MessageObject messageObject2;
        cc0 cc0Var = this.B0;
        ub0 ub0Var = cc0Var.e;
        int i12 = ub0Var.v - ub0Var.f20208u;
        ic0 ic0Var = cc0Var.f23264c0;
        if (i12 > MessagesController.getInstance(ic0Var.f25078w).quoteLengthMax) {
            cc0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = ic0Var.d;
        messagePreviewParams.quoteStart = ub0Var.f20208u;
        messagePreviewParams.quoteEnd = ub0Var.v;
        MessageObject c10 = cc0Var.c(messageObject);
        if (c10 != null && ((mnVar = ic0Var.d.quote) == null || (messageObject2 = mnVar.f35714a) == null || messageObject2.getId() != c10.getId())) {
            ic0Var.d.quote = org.telegram.ui.mn.b(i10, i11, c10);
        }
        ic0Var.b();
        ic0Var.a(true);
    }

    @Override
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        cc0 cc0Var = this.B0;
        if (cc0Var.f23259a == 0 && (c10 = cc0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = cc0Var.f23264c0.d;
        if (messagePreviewParams != null && messagePreviewParams.noforwards) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        cc0 cc0Var = this.B0;
        int i10 = cc0Var.f23259a;
        if (i10 == 0 && !cc0Var.f23264c0.d.isSecret) {
            if (i10 != 0 || (c10 = cc0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 r() {
        return this.f20184h0;
    }

    @Override
    public final void x() {
        super.x();
        vb0 vb0Var = this.B0.f23265f;
        if (vb0Var != null) {
            vb0Var.invalidate();
        }
    }
}
