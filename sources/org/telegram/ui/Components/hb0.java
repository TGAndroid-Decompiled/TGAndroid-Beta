package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class hb0 extends org.telegram.ui.Cells.r9 {
    public final qb0 B0;

    public hb0(qb0 qb0Var) {
        this.B0 = qb0Var;
        this.f21775h0 = qb0Var.f29662c0.F;
    }

    @Override
    public final boolean A(MessageObject messageObject) {
        qb0 qb0Var = this.B0;
        if (qb0Var.f29657a == 0 && !qb0Var.f29662c0.d.isSecret && y()) {
            return true;
        }
        return false;
    }

    @Override
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.sn snVar;
        MessageObject messageObject2;
        qb0 qb0Var = this.B0;
        hb0 hb0Var = qb0Var.f29663e;
        int i12 = hb0Var.v - hb0Var.f21799u;
        wb0 wb0Var = qb0Var.f29662c0;
        if (i12 > MessagesController.getInstance(wb0Var.f32232w).quoteLengthMax) {
            qb0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = wb0Var.d;
        messagePreviewParams.quoteStart = hb0Var.f21799u;
        messagePreviewParams.quoteEnd = hb0Var.v;
        MessageObject c10 = qb0Var.c(messageObject);
        if (c10 != null && ((snVar = wb0Var.d.quote) == null || (messageObject2 = snVar.f40477a) == null || messageObject2.getId() != c10.getId())) {
            wb0Var.d.quote = org.telegram.ui.sn.b(i10, i11, c10);
        }
        wb0Var.b();
        wb0Var.a(true);
    }

    @Override
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        qb0 qb0Var = this.B0;
        if (qb0Var.f29657a == 0 && (c10 = qb0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = qb0Var.f29662c0.d;
        if (messagePreviewParams != null && messagePreviewParams.noforwards) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        qb0 qb0Var = this.B0;
        int i10 = qb0Var.f29657a;
        if (i10 == 0 && !qb0Var.f29662c0.d.isSecret) {
            if (i10 != 0 || (c10 = qb0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 r() {
        return this.f21775h0;
    }

    @Override
    public final void x() {
        super.x();
        ib0 ib0Var = this.B0.f29664f;
        if (ib0Var != null) {
            ib0Var.invalidate();
        }
    }
}
