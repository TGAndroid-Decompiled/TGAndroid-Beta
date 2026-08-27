package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class j70 extends yk0 {

    public final Context f29640c;
    public final k70 d;

    public j70(k70 k70Var, Context context) {
        this.d = k70Var;
        this.f29640c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.d.h.size();
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        TLObject chat;
        String string;
        View view = o1Var.f5789a;
        k70 k70Var = this.d;
        long peerId = MessageObject.getPeerId((TLRPC.Peer) k70Var.h.get(i10));
        if (peerId > 0) {
            chat = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) k70Var).currentAccount).getUser(Long.valueOf(peerId));
            string = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            chat = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) k70Var).currentAccount).getChat(Long.valueOf(-peerId));
            string = null;
        }
        if (k70Var.f30029s == 0) {
            ((org.telegram.ui.Cells.b7) view).c(peerId, peerId == MessageObject.getPeerId(k70Var.v), null);
        } else {
            ((org.telegram.ui.Cells.d4) view).e(chat, null, string, i10 != h() - 1);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View d4Var;
        k70 k70Var = this.d;
        if (k70Var.f30029s == 0) {
            d4Var = new org.telegram.ui.Cells.b7(this.f29640c, 2, null);
            d4Var.setLayoutParams(new f2.y0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(100.0f)));
        } else {
            d4Var = new org.telegram.ui.Cells.d4(2, 0, this.f29640c, null, false, k70Var.f30029s == 2);
        }
        return new lk0(d4Var);
    }

    @Override
    public final void y(f2.o1 o1Var) {
        long j10;
        o1Var.b();
        long peerId = MessageObject.getPeerId(this.d.v);
        View view = o1Var.f5789a;
        if (!(view instanceof org.telegram.ui.Cells.d4)) {
            org.telegram.ui.Cells.b7 b7Var = (org.telegram.ui.Cells.b7) view;
            b7Var.b(peerId == b7Var.getCurrentDialog(), false);
            return;
        }
        org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) view;
        Object object = d4Var.getObject();
        if (object != null) {
            j10 = object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).f22380id : ((TLRPC.User) object).f22527id;
        } else {
            j10 = 0;
        }
        d4Var.c(peerId == j10, false);
    }
}
