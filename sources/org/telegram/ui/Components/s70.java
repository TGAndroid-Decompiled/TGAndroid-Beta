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
public final class s70 extends il0 {
    public final Context f32535c;
    public final t70 d;

    public s70(t70 t70Var, Context context) {
        this.d = t70Var;
        this.f32535c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
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
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        TLObject chat;
        String str;
        int i12;
        View view = n1Var.f6432a;
        t70 t70Var = this.d;
        long peerId = MessageObject.getPeerId((TLRPC.Peer) t70Var.h.get(i10));
        if (peerId > 0) {
            i12 = ((org.telegram.ui.ActionBar.f3) t70Var).currentAccount;
            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i11 = ((org.telegram.ui.ActionBar.f3) t70Var).currentAccount;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
            str = null;
        }
        boolean z10 = false;
        if (t70Var.f32892s == 0) {
            org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) view;
            if (peerId == MessageObject.getPeerId(t70Var.v)) {
                z10 = true;
            }
            c7Var.c(peerId, z10, null);
            return;
        }
        org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
        if (i10 != h() - 1) {
            z10 = true;
        }
        e4Var.e(chat, null, str, z10);
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        View e4Var;
        t70 t70Var = this.d;
        if (t70Var.f32892s == 0) {
            e4Var = new org.telegram.ui.Cells.c7(this.f32535c, 2, null);
            e4Var.setLayoutParams(new f2.x0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(100.0f)));
        } else {
            if (t70Var.f32892s == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            e4Var = new org.telegram.ui.Cells.e4(2, 0, this.f32535c, null, false, z10);
        }
        return new f2.n1(e4Var);
    }

    @Override
    public final void y(f2.n1 n1Var) {
        long j10;
        n1Var.b();
        long peerId = MessageObject.getPeerId(this.d.v);
        View view = n1Var.f6432a;
        boolean z10 = true;
        if (view instanceof org.telegram.ui.Cells.e4) {
            org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
            Object object = e4Var.getObject();
            if (object != null) {
                if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f22392id;
                } else {
                    j10 = ((TLRPC.User) object).f22539id;
                }
            } else {
                j10 = 0;
            }
            if (peerId != j10) {
                z10 = false;
            }
            e4Var.c(z10, false);
            return;
        }
        org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) view;
        if (peerId != c7Var.getCurrentDialog()) {
            z10 = false;
        }
        c7Var.b(z10, false);
    }
}
