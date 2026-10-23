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
public final class r80 extends lm0 {
    public final Context f30116c;
    public final s80 d;

    public r80(s80 s80Var, Context context) {
        this.d = s80Var;
        this.f30116c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.d.f30416r.size();
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
        View view = b1Var.f46343a;
        s80 s80Var = this.d;
        long peerId = MessageObject.getPeerId((TLRPC.Peer) s80Var.f30416r.get(i10));
        if (peerId > 0) {
            i12 = ((org.telegram.ui.ActionBar.h3) s80Var).currentAccount;
            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i11 = ((org.telegram.ui.ActionBar.h3) s80Var).currentAccount;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
            str = null;
        }
        boolean z10 = false;
        if (s80Var.f30418w == 0) {
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
            if (peerId == MessageObject.getPeerId(s80Var.f30419x)) {
                z10 = true;
            }
            g7Var.c(peerId, z10, null);
            return;
        }
        org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
        if (i10 != h() - 1) {
            z10 = true;
        }
        f4Var.e(chat, null, str, z10);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        View f4Var;
        s80 s80Var = this.d;
        if (s80Var.f30418w == 0) {
            f4Var = new org.telegram.ui.Cells.g7(this.f30116c, 2, null);
            f4Var.setLayoutParams(new s4.o0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(100.0f)));
        } else {
            if (s80Var.f30418w == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            f4Var = new org.telegram.ui.Cells.f4(2, 0, this.f30116c, null, false, z10);
        }
        return new s4.b1(f4Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        long j10;
        b1Var.b();
        long peerId = MessageObject.getPeerId(this.d.f30419x);
        View view = b1Var.f46343a;
        boolean z10 = true;
        if (view instanceof org.telegram.ui.Cells.f4) {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            Object object = f4Var.getObject();
            if (object != null) {
                if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f20343id;
                } else {
                    j10 = ((TLRPC.User) object).f20490id;
                }
            } else {
                j10 = 0;
            }
            if (peerId != j10) {
                z10 = false;
            }
            f4Var.c(z10, false);
            return;
        }
        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
        if (peerId != g7Var.getCurrentDialog()) {
            z10 = false;
        }
        g7Var.b(z10, false);
    }
}
