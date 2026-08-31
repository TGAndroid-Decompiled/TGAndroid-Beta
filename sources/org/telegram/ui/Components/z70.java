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
public final class z70 extends sl0 {
    public final Context f33778c;
    public final a80 d;

    public z70(a80 a80Var, Context context) {
        this.d = a80Var;
        this.f33778c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
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
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        TLObject chat;
        String str;
        int i12;
        View view = m1Var.f5875a;
        a80 a80Var = this.d;
        long peerId = MessageObject.getPeerId((TLRPC.Peer) a80Var.h.get(i10));
        if (peerId > 0) {
            i12 = ((org.telegram.ui.ActionBar.h3) a80Var).currentAccount;
            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i11 = ((org.telegram.ui.ActionBar.h3) a80Var).currentAccount;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
            str = null;
        }
        boolean z4 = false;
        if (a80Var.f25201s == 0) {
            org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) view;
            if (peerId == MessageObject.getPeerId(a80Var.v)) {
                z4 = true;
            }
            e7Var.c(peerId, z4, null);
            return;
        }
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
        if (i10 != h() - 1) {
            z4 = true;
        }
        g4Var.e(chat, null, str, z4);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        boolean z4;
        View g4Var;
        a80 a80Var = this.d;
        if (a80Var.f25201s == 0) {
            g4Var = new org.telegram.ui.Cells.e7(this.f33778c, 2, null);
            g4Var.setLayoutParams(new f2.x0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(100.0f)));
        } else {
            if (a80Var.f25201s == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            g4Var = new org.telegram.ui.Cells.g4(2, 0, this.f33778c, null, false, z4);
        }
        return new f2.m1(g4Var);
    }

    @Override
    public final void y(f2.m1 m1Var) {
        long j10;
        m1Var.b();
        long peerId = MessageObject.getPeerId(this.d.v);
        View view = m1Var.f5875a;
        boolean z4 = true;
        if (view instanceof org.telegram.ui.Cells.g4) {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            Object object = g4Var.getObject();
            if (object != null) {
                if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f20843id;
                } else {
                    j10 = ((TLRPC.User) object).f20990id;
                }
            } else {
                j10 = 0;
            }
            if (peerId != j10) {
                z4 = false;
            }
            g4Var.c(z4, false);
            return;
        }
        org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) view;
        if (peerId != e7Var.getCurrentDialog()) {
            z4 = false;
        }
        e7Var.b(z4, false);
    }
}
