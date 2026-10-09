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
public final class x80 extends pm0 {
    public final Context f32771c;
    public final y80 d;

    public x80(y80 y80Var, Context context) {
        this.d = y80Var;
        this.f32771c = context;
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
        View view = d1Var.f47658a;
        y80 y80Var = this.d;
        long peerId = MessageObject.getPeerId((TLRPC.Peer) y80Var.h.get(i10));
        if (peerId > 0) {
            i12 = ((org.telegram.ui.ActionBar.f3) y80Var).currentAccount;
            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i11 = ((org.telegram.ui.ActionBar.f3) y80Var).currentAccount;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
            str = null;
        }
        boolean z10 = false;
        if (y80Var.f33146s == 0) {
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
            if (peerId == MessageObject.getPeerId(y80Var.v)) {
                z10 = true;
            }
            g7Var.c(peerId, z10, null);
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
        y80 y80Var = this.d;
        if (y80Var.f33146s == 0) {
            g4Var = new org.telegram.ui.Cells.g7(this.f32771c, 2, null);
            g4Var.setLayoutParams(new s4.q0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(100.0f)));
        } else {
            if (y80Var.f33146s == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            g4Var = new org.telegram.ui.Cells.g4(2, 0, this.f32771c, null, false, z10);
        }
        return new s4.d1(g4Var);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        long j3;
        d1Var.b();
        long peerId = MessageObject.getPeerId(this.d.v);
        View view = d1Var.f47658a;
        boolean z10 = true;
        if (view instanceof org.telegram.ui.Cells.g4) {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            Object object = g4Var.getObject();
            if (object != null) {
                if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f20038id;
                } else {
                    j3 = ((TLRPC.User) object).f20185id;
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
        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
        if (peerId != g7Var.getCurrentDialog()) {
            z10 = false;
        }
        g7Var.b(z10, false);
    }
}
