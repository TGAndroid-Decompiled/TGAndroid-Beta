package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class x21 implements Runnable {
    public final int f30112a = 0;
    public final boolean f30113b;
    public final long f30114c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f30115f;
    public final Object h;
    public final TLObject f30116n;

    public x21(n31 n31Var, boolean z10, org.telegram.ui.ActionBar.e1 e1Var, b80 b80Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.d = n31Var;
        this.f30113b = z10;
        this.e = e1Var;
        this.f30115f = b80Var;
        this.f30114c = j3;
        this.h = user;
        this.f30116n = chat;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f30112a) {
            case 0:
                final n31 n31Var = (n31) this.d;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.e;
                final b80 b80Var = (b80) this.f30115f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.f30116n;
                boolean z10 = this.f30113b;
                final boolean z11 = !z10;
                e1Var.setVisibility(0);
                if (!z10) {
                    i10 = R.string.UnbanUserMonoforum;
                } else {
                    i10 = R.string.BanUserMonoforum;
                }
                e1Var.setText(LocaleController.getString(i10));
                final long j3 = this.f30114c;
                e1Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        n31 n31Var2 = n31.this;
                        int i11 = n31Var2.f26561b;
                        b80Var.u();
                        boolean z12 = z11;
                        TLRPC.User user2 = user;
                        if (!z12) {
                            MessagesController.getInstance(i11).deleteParticipantFromChat(j3, user2, (TLRPC.Chat) null, false, false);
                            return;
                        }
                        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                        tL_channels_editBanned.participant = MessagesController.getInputPeer(user2);
                        tL_channels_editBanned.channel = MessagesController.getInputChannel(chat);
                        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
                        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_editBanned, new y1(n31Var2, 15));
                    }
                });
                return;
            default:
                yh.g.Z((yh.g) this.d, (TLRPC.TL_error) this.e, (TwoStepVerificationActivity) this.f30115f, (Activity) this.h, this.f30113b, this.f30114c, this.f30116n);
                return;
        }
    }

    public x21(yh.g gVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
        this.d = gVar;
        this.e = tL_error;
        this.f30115f = twoStepVerificationActivity;
        this.h = activity;
        this.f30113b = z10;
        this.f30114c = j3;
        this.f30116n = tLObject;
    }
}
