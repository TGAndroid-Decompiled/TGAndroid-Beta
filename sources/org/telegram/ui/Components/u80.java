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
public final class u80 extends lm0 {
    public final Context f29276c;
    public final v80 d;

    public u80(v80 v80Var, Context context) {
        this.d = v80Var;
        this.f29276c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
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
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        TLObject chat;
        String str;
        int i12;
        View view = b1Var.f44838a;
        v80 v80Var = this.d;
        long peerId = MessageObject.getPeerId((TLRPC.Peer) v80Var.h.get(i10));
        if (peerId > 0) {
            i12 = ((org.telegram.ui.ActionBar.e3) v80Var).currentAccount;
            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i11 = ((org.telegram.ui.ActionBar.e3) v80Var).currentAccount;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
            str = null;
        }
        boolean z10 = false;
        if (v80Var.f29601s == 0) {
            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
            if (peerId == MessageObject.getPeerId(v80Var.v)) {
                z10 = true;
            }
            f7Var.c(peerId, z10, null);
            return;
        }
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
        if (i10 != h() - 1) {
            z10 = true;
        }
        g4Var.e(chat, null, str, z10);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        View g4Var;
        v80 v80Var = this.d;
        if (v80Var.f29601s == 0) {
            g4Var = new org.telegram.ui.Cells.f7(this.f29276c, 2, null);
            g4Var.setLayoutParams(new s4.o0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(100.0f)));
        } else {
            if (v80Var.f29601s == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            g4Var = new org.telegram.ui.Cells.g4(2, 0, this.f29276c, null, false, z10);
        }
        return new s4.b1(g4Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        long j10;
        b1Var.b();
        long peerId = MessageObject.getPeerId(this.d.v);
        View view = b1Var.f44838a;
        boolean z10 = true;
        if (view instanceof org.telegram.ui.Cells.g4) {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            Object object = g4Var.getObject();
            if (object != null) {
                if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f18916id;
                } else {
                    j10 = ((TLRPC.User) object).f19063id;
                }
            } else {
                j10 = 0;
            }
            if (peerId != j10) {
                z10 = false;
            }
            g4Var.c(z10, false);
            return;
        }
        org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
        if (peerId != f7Var.getCurrentDialog()) {
            z10 = false;
        }
        f7Var.b(z10, false);
    }
}
