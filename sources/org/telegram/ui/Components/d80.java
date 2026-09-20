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
public final class d80 extends ul0 {
    public final Context f23515c;
    public final e80 d;

    public d80(e80 e80Var, Context context) {
        this.d = e80Var;
        this.f23515c = context;
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
        View view = c1Var.f42974a;
        e80 e80Var = this.d;
        long peerId = MessageObject.getPeerId((TLRPC.Peer) e80Var.h.get(i10));
        if (peerId > 0) {
            i12 = ((org.telegram.ui.ActionBar.f3) e80Var).currentAccount;
            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i11 = ((org.telegram.ui.ActionBar.f3) e80Var).currentAccount;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
            str = null;
        }
        boolean z10 = false;
        if (e80Var.f23773s == 0) {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            if (peerId == MessageObject.getPeerId(e80Var.v)) {
                z10 = true;
            }
            h7Var.c(peerId, z10, null);
            return;
        }
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
        if (i10 != h() - 1) {
            z10 = true;
        }
        h4Var.e(chat, null, str, z10);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        View h4Var;
        e80 e80Var = this.d;
        if (e80Var.f23773s == 0) {
            h4Var = new org.telegram.ui.Cells.h7(this.f23515c, 2, null);
            h4Var.setLayoutParams(new s4.p0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(100.0f)));
        } else {
            if (e80Var.f23773s == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            h4Var = new org.telegram.ui.Cells.h4(2, 0, this.f23515c, null, false, z10);
        }
        return new s4.c1(h4Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        long j3;
        c1Var.b();
        long peerId = MessageObject.getPeerId(this.d.v);
        View view = c1Var.f42974a;
        boolean z10 = true;
        if (view instanceof org.telegram.ui.Cells.h4) {
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            Object object = h4Var.getObject();
            if (object != null) {
                if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f18328id;
                } else {
                    j3 = ((TLRPC.User) object).f18475id;
                }
            } else {
                j3 = 0;
            }
            if (peerId != j3) {
                z10 = false;
            }
            h4Var.c(z10, false);
            return;
        }
        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
        if (peerId != h7Var.getCurrentDialog()) {
            z10 = false;
        }
        h7Var.b(z10, false);
    }
}
