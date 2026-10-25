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
public final class s80 extends lm0 {
    public final Context f32451c;
    public final t80 d;

    public s80(t80 t80Var, Context context) {
        this.d = t80Var;
        this.f32451c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.d.f32907r.size();
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        TLObject chat;
        String str;
        int i12;
        View view = e1Var.f47735a;
        t80 t80Var = this.d;
        long peerId = MessageObject.getPeerId((TLRPC.Peer) t80Var.f32907r.get(i10));
        if (peerId > 0) {
            i12 = ((org.telegram.ui.ActionBar.k3) t80Var).currentAccount;
            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i11 = ((org.telegram.ui.ActionBar.k3) t80Var).currentAccount;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
            str = null;
        }
        boolean z10 = false;
        if (t80Var.f32909w == 0) {
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            if (peerId == MessageObject.getPeerId(t80Var.f32910x)) {
                z10 = true;
            }
            k7Var.c(peerId, z10, null);
            return;
        }
        org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
        if (i10 != h() - 1) {
            z10 = true;
        }
        k4Var.e(chat, null, str, z10);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        View k4Var;
        t80 t80Var = this.d;
        if (t80Var.f32909w == 0) {
            k4Var = new org.telegram.ui.Cells.k7(this.f32451c, 2, null);
            k4Var.setLayoutParams(new s4.q0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(100.0f)));
        } else {
            if (t80Var.f32909w == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            k4Var = new org.telegram.ui.Cells.k4(2, 0, this.f32451c, null, false, z10);
        }
        return new s4.e1(k4Var);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        long j10;
        e1Var.b();
        long peerId = MessageObject.getPeerId(this.d.f32910x);
        View view = e1Var.f47735a;
        boolean z10 = true;
        if (view instanceof org.telegram.ui.Cells.k4) {
            org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
            Object object = k4Var.getObject();
            if (object != null) {
                if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f22027id;
                } else {
                    j10 = ((TLRPC.User) object).f22174id;
                }
            } else {
                j10 = 0;
            }
            if (peerId != j10) {
                z10 = false;
            }
            k4Var.c(z10, false);
            return;
        }
        org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
        if (peerId != k7Var.getCurrentDialog()) {
            z10 = false;
        }
        k7Var.b(z10, false);
    }
}
