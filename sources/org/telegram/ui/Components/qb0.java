package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class qb0 extends org.telegram.ui.Cells.t9 {
    public final yb0 B0;

    public qb0(yb0 yb0Var) {
        this.B0 = yb0Var;
        this.f19140h0 = yb0Var.f29295c0.F;
    }

    @Override
    public final boolean A(MessageObject messageObject) {
        yb0 yb0Var = this.B0;
        if (yb0Var.f29290a == 0 && !yb0Var.f29295c0.d.isSecret && y()) {
            return true;
        }
        return false;
    }

    @Override
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.tn tnVar;
        MessageObject messageObject2;
        yb0 yb0Var = this.B0;
        qb0 qb0Var = yb0Var.e;
        int i12 = qb0Var.v - qb0Var.f19164u;
        ec0 ec0Var = yb0Var.f29295c0;
        if (i12 > MessagesController.getInstance(ec0Var.f22668w).quoteLengthMax) {
            yb0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = ec0Var.d;
        messagePreviewParams.quoteStart = qb0Var.f19164u;
        messagePreviewParams.quoteEnd = qb0Var.v;
        MessageObject c10 = yb0Var.c(messageObject);
        if (c10 != null && ((tnVar = ec0Var.d.quote) == null || (messageObject2 = tnVar.f36967a) == null || messageObject2.getId() != c10.getId())) {
            ec0Var.d.quote = org.telegram.ui.tn.b(i10, i11, c10);
        }
        ec0Var.b();
        ec0Var.a(true);
    }

    @Override
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        yb0 yb0Var = this.B0;
        if (yb0Var.f29290a == 0 && (c10 = yb0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = yb0Var.f29295c0.d;
        if (messagePreviewParams != null && messagePreviewParams.noforwards) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        yb0 yb0Var = this.B0;
        int i10 = yb0Var.f29290a;
        if (i10 == 0 && !yb0Var.f29295c0.d.isSecret) {
            if (i10 != 0 || (c10 = yb0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 r() {
        return this.f19140h0;
    }

    @Override
    public final void x() {
        super.x();
        rb0 rb0Var = this.B0.f29296f;
        if (rb0Var != null) {
            rb0Var.invalidate();
        }
    }
}
