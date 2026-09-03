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
public final class y70 extends ql0 {
    public final Context f30931c;
    public final z70 d;

    public y70(z70 z70Var, Context context) {
        this.d = z70Var;
        this.f30931c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
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
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        TLObject chat;
        String str;
        int i12;
        View view = l1Var.f5774a;
        z70 z70Var = this.d;
        long peerId = MessageObject.getPeerId((TLRPC.Peer) z70Var.h.get(i10));
        if (peerId > 0) {
            i12 = ((org.telegram.ui.ActionBar.g3) z70Var).currentAccount;
            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i11 = ((org.telegram.ui.ActionBar.g3) z70Var).currentAccount;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
            str = null;
        }
        boolean z4 = false;
        if (z70Var.f31275s == 0) {
            org.telegram.ui.Cells.d7 d7Var = (org.telegram.ui.Cells.d7) view;
            if (peerId == MessageObject.getPeerId(z70Var.v)) {
                z4 = true;
            }
            d7Var.c(peerId, z4, null);
            return;
        }
        org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
        if (i10 != h() - 1) {
            z4 = true;
        }
        f4Var.e(chat, null, str, z4);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        boolean z4;
        View f4Var;
        z70 z70Var = this.d;
        if (z70Var.f31275s == 0) {
            f4Var = new org.telegram.ui.Cells.d7(this.f30931c, 2, null);
            f4Var.setLayoutParams(new f2.w0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(100.0f)));
        } else {
            if (z70Var.f31275s == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            f4Var = new org.telegram.ui.Cells.f4(2, 0, this.f30931c, null, false, z4);
        }
        return new f2.l1(f4Var);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        long j10;
        l1Var.b();
        long peerId = MessageObject.getPeerId(this.d.v);
        View view = l1Var.f5774a;
        boolean z4 = true;
        if (view instanceof org.telegram.ui.Cells.f4) {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            Object object = f4Var.getObject();
            if (object != null) {
                if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f19159id;
                } else {
                    j10 = ((TLRPC.User) object).f19306id;
                }
            } else {
                j10 = 0;
            }
            if (peerId != j10) {
                z4 = false;
            }
            f4Var.c(z4, false);
            return;
        }
        org.telegram.ui.Cells.d7 d7Var = (org.telegram.ui.Cells.d7) view;
        if (peerId != d7Var.getCurrentDialog()) {
            z4 = false;
        }
        d7Var.b(z4, false);
    }
}
