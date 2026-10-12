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
public final class b90 extends vm0 {
    public final Context f24579c;
    public final c90 d;

    public b90(c90 c90Var, Context context) {
        this.d = c90Var;
        this.f24579c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
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
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        TLObject chat;
        String str;
        int i12;
        View view = d1Var.f47897a;
        c90 c90Var = this.d;
        long peerId = MessageObject.getPeerId((TLRPC.Peer) c90Var.h.get(i10));
        if (peerId > 0) {
            i12 = ((org.telegram.ui.ActionBar.e3) c90Var).currentAccount;
            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i11 = ((org.telegram.ui.ActionBar.e3) c90Var).currentAccount;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
            str = null;
        }
        boolean z10 = false;
        if (c90Var.f24865s == 0) {
            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
            if (peerId == MessageObject.getPeerId(c90Var.v)) {
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
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        View g4Var;
        c90 c90Var = this.d;
        if (c90Var.f24865s == 0) {
            g4Var = new org.telegram.ui.Cells.f7(this.f24579c, 2, null);
            g4Var.setLayoutParams(new s4.q0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(100.0f)));
        } else {
            if (c90Var.f24865s == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            g4Var = new org.telegram.ui.Cells.g4(2, 0, this.f24579c, null, false, z10);
        }
        return new s4.d1(g4Var);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        long j3;
        d1Var.b();
        long peerId = MessageObject.getPeerId(this.d.v);
        View view = d1Var.f47897a;
        boolean z10 = true;
        if (view instanceof org.telegram.ui.Cells.g4) {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            Object object = g4Var.getObject();
            if (object != null) {
                if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f19803id;
                } else {
                    j3 = ((TLRPC.User) object).f19950id;
                }
            } else {
                j3 = 0;
            }
            if (peerId != j3) {
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
