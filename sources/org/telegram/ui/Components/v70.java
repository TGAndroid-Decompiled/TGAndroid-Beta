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
public final class v70 extends kl0 {
    public final Context f31143c;
    public final w70 d;

    public v70(w70 w70Var, Context context) {
        this.d = w70Var;
        this.f31143c = context;
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
        View view = c1Var.f45738a;
        w70 w70Var = this.d;
        long peerId = MessageObject.getPeerId((TLRPC.Peer) w70Var.h.get(i10));
        if (peerId > 0) {
            i12 = ((org.telegram.ui.ActionBar.f3) w70Var).currentAccount;
            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i11 = ((org.telegram.ui.ActionBar.f3) w70Var).currentAccount;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
            str = null;
        }
        boolean z10 = false;
        if (w70Var.f32191s == 0) {
            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
            if (peerId == MessageObject.getPeerId(w70Var.v)) {
                z10 = true;
            }
            f7Var.c(peerId, z10, null);
            return;
        }
        org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
        if (i10 != h() - 1) {
            z10 = true;
        }
        f4Var.e(chat, null, str, z10);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        View f4Var;
        w70 w70Var = this.d;
        if (w70Var.f32191s == 0) {
            f4Var = new org.telegram.ui.Cells.f7(this.f31143c, 2, null);
            f4Var.setLayoutParams(new s4.p0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(100.0f)));
        } else {
            if (w70Var.f32191s == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            f4Var = new org.telegram.ui.Cells.f4(2, 0, this.f31143c, null, false, z10);
        }
        return new s4.c1(f4Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        long j3;
        c1Var.b();
        long peerId = MessageObject.getPeerId(this.d.v);
        View view = c1Var.f45738a;
        boolean z10 = true;
        if (view instanceof org.telegram.ui.Cells.f4) {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            Object object = f4Var.getObject();
            if (object != null) {
                if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f19869id;
                } else {
                    j3 = ((TLRPC.User) object).f20016id;
                }
            } else {
                j3 = 0;
            }
            if (peerId != j3) {
                z10 = false;
            }
            f4Var.c(z10, false);
            return;
        }
        org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
        if (peerId != f7Var.getCurrentDialog()) {
            z10 = false;
        }
        f7Var.b(z10, false);
    }
}
