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
public final class h80 extends wl0 {
    public final Context f24698c;
    public final i80 d;

    public h80(i80 i80Var, Context context) {
        this.d = i80Var;
        this.f24698c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
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
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        TLObject chat;
        String str;
        int i12;
        View view = c1Var.f42959a;
        i80 i80Var = this.d;
        long peerId = MessageObject.getPeerId((TLRPC.Peer) i80Var.h.get(i10));
        if (peerId > 0) {
            i12 = ((org.telegram.ui.ActionBar.e3) i80Var).currentAccount;
            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i11 = ((org.telegram.ui.ActionBar.e3) i80Var).currentAccount;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
            str = null;
        }
        boolean z10 = false;
        if (i80Var.f25002s == 0) {
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
            if (peerId == MessageObject.getPeerId(i80Var.v)) {
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
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        View g4Var;
        i80 i80Var = this.d;
        if (i80Var.f25002s == 0) {
            g4Var = new org.telegram.ui.Cells.g7(this.f24698c, 2, null);
            g4Var.setLayoutParams(new s4.p0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(100.0f)));
        } else {
            if (i80Var.f25002s == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            g4Var = new org.telegram.ui.Cells.g4(2, 0, this.f24698c, null, false, z10);
        }
        return new s4.c1(g4Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        long j3;
        c1Var.b();
        long peerId = MessageObject.getPeerId(this.d.v);
        View view = c1Var.f42959a;
        boolean z10 = true;
        if (view instanceof org.telegram.ui.Cells.g4) {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            Object object = g4Var.getObject();
            if (object != null) {
                if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f18335id;
                } else {
                    j3 = ((TLRPC.User) object).f18482id;
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
