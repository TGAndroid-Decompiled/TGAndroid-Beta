package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class rb0 extends org.telegram.ui.Cells.s9 {
    public final ac0 B0;

    public rb0(ac0 ac0Var) {
        this.B0 = ac0Var;
        this.f20230h0 = ac0Var.f22625c0.F;
    }

    @Override
    public final boolean A(MessageObject messageObject) {
        ac0 ac0Var = this.B0;
        if (ac0Var.f22620a == 0 && !ac0Var.f22625c0.d.isSecret && y()) {
            return true;
        }
        return false;
    }

    @Override
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.pn pnVar;
        MessageObject messageObject2;
        ac0 ac0Var = this.B0;
        rb0 rb0Var = ac0Var.e;
        int i12 = rb0Var.v - rb0Var.f20254u;
        gc0 gc0Var = ac0Var.f22625c0;
        if (i12 > MessagesController.getInstance(gc0Var.f24501w).quoteLengthMax) {
            ac0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = gc0Var.d;
        messagePreviewParams.quoteStart = rb0Var.f20254u;
        messagePreviewParams.quoteEnd = rb0Var.v;
        MessageObject c10 = ac0Var.c(messageObject);
        if (c10 != null && ((pnVar = gc0Var.d.quote) == null || (messageObject2 = pnVar.f36615a) == null || messageObject2.getId() != c10.getId())) {
            gc0Var.d.quote = org.telegram.ui.pn.b(i10, i11, c10);
        }
        gc0Var.b();
        gc0Var.a(true);
    }

    @Override
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        ac0 ac0Var = this.B0;
        if (ac0Var.f22620a == 0 && (c10 = ac0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = ac0Var.f22625c0.d;
        if (messagePreviewParams != null && messagePreviewParams.noforwards) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        ac0 ac0Var = this.B0;
        int i10 = ac0Var.f22620a;
        if (i10 == 0 && !ac0Var.f22625c0.d.isSecret) {
            if (i10 != 0 || (c10 = ac0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 r() {
        return this.f20230h0;
    }

    @Override
    public final void x() {
        super.x();
        sb0 sb0Var = this.B0.f22626f;
        if (sb0Var != null) {
            sb0Var.invalidate();
        }
    }
}
