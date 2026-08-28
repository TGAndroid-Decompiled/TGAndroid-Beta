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
public final class f70 extends vk0 {
    public final Context f28321c;
    public final g70 d;

    public f70(g70 g70Var, Context context) {
        this.d = g70Var;
        this.f28321c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.d.h.size();
    }

    @Override
    public final int j(int i9) {
        return 0;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        TLObject chat;
        String str;
        int i11;
        View view = q1Var.f5501a;
        g70 g70Var = this.d;
        long peerId = MessageObject.getPeerId((TLRPC.Peer) g70Var.h.get(i9));
        if (peerId > 0) {
            i11 = ((org.telegram.ui.ActionBar.f3) g70Var).currentAccount;
            chat = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i10 = ((org.telegram.ui.ActionBar.f3) g70Var).currentAccount;
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerId));
            str = null;
        }
        boolean z10 = false;
        if (g70Var.f28672s == 0) {
            org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) view;
            if (peerId == MessageObject.getPeerId(g70Var.v)) {
                z10 = true;
            }
            e7Var.c(peerId, z10, null);
            return;
        }
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
        if (i9 != h() - 1) {
            z10 = true;
        }
        g4Var.e(chat, null, str, z10);
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        boolean z10;
        View g4Var;
        g70 g70Var = this.d;
        if (g70Var.f28672s == 0) {
            g4Var = new org.telegram.ui.Cells.e7(this.f28321c, 2, null);
            g4Var.setLayoutParams(new f2.a1(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(100.0f)));
        } else {
            if (g70Var.f28672s == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            g4Var = new org.telegram.ui.Cells.g4(2, 0, this.f28321c, null, false, z10);
        }
        return new f2.q1(g4Var);
    }

    @Override
    public final void y(f2.q1 q1Var) {
        long j10;
        q1Var.b();
        long peerId = MessageObject.getPeerId(this.d.v);
        View view = q1Var.f5501a;
        boolean z10 = true;
        if (view instanceof org.telegram.ui.Cells.g4) {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            Object object = g4Var.getObject();
            if (object != null) {
                if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f22380id;
                } else {
                    j10 = ((TLRPC.User) object).f22527id;
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
        org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) view;
        if (peerId != e7Var.getCurrentDialog()) {
            z10 = false;
        }
        e7Var.b(z10, false);
    }
}
