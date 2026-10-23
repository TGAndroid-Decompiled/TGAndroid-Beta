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
public final class q80 extends im0 {
    public final Context f29496c;
    public final r80 d;

    public q80(r80 r80Var, Context context) {
        this.d = r80Var;
        this.f29496c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
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
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        TLObject chat;
        String str;
        int i12;
        View view = b1Var.f45921a;
        r80 r80Var = this.d;
        long peerId = MessageObject.getPeerId((TLRPC.Peer) r80Var.h.get(i10));
        if (peerId > 0) {
            i12 = ((org.telegram.ui.ActionBar.f3) r80Var).currentAccount;
            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i11 = ((org.telegram.ui.ActionBar.f3) r80Var).currentAccount;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
            str = null;
        }
        boolean z10 = false;
        if (r80Var.f29878s == 0) {
            org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) view;
            if (peerId == MessageObject.getPeerId(r80Var.v)) {
                z10 = true;
            }
            e7Var.c(peerId, z10, null);
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
        r80 r80Var = this.d;
        if (r80Var.f29878s == 0) {
            f4Var = new org.telegram.ui.Cells.e7(this.f29496c, 2, null);
            f4Var.setLayoutParams(new s4.o0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(100.0f)));
        } else {
            if (r80Var.f29878s == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            f4Var = new org.telegram.ui.Cells.f4(2, 0, this.f29496c, null, false, z10);
        }
        return new s4.b1(f4Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        long j10;
        b1Var.b();
        long peerId = MessageObject.getPeerId(this.d.v);
        View view = b1Var.f45921a;
        boolean z10 = true;
        if (view instanceof org.telegram.ui.Cells.f4) {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            Object object = f4Var.getObject();
            if (object != null) {
                if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f20280id;
                } else {
                    j10 = ((TLRPC.User) object).f20427id;
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
        org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) view;
        if (peerId != e7Var.getCurrentDialog()) {
            z10 = false;
        }
        e7Var.b(z10, false);
    }
}
