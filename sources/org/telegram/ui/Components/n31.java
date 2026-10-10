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
public final class n31 implements Runnable {
    public final int f28961a = 0;
    public final boolean f28962b;
    public final long f28963c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f28964e;
    public final Object f28965f;
    public final Object h;
    public final TLObject f28966n;

    public n31(d41 d41Var, boolean z10, org.telegram.ui.ActionBar.f1 f1Var, q80 q80Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.d = d41Var;
        this.f28962b = z10;
        this.f28964e = f1Var;
        this.f28965f = q80Var;
        this.f28963c = j3;
        this.h = user;
        this.f28966n = chat;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f28961a) {
            case 0:
                final d41 d41Var = (d41) this.d;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.f28964e;
                final q80 q80Var = (q80) this.f28965f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.f28966n;
                boolean z10 = this.f28962b;
                final boolean z11 = !z10;
                f1Var.setVisibility(0);
                if (!z10) {
                    i10 = R.string.UnbanUserMonoforum;
                } else {
                    i10 = R.string.BanUserMonoforum;
                }
                f1Var.setText(LocaleController.getString(i10));
                final long j3 = this.f28963c;
                f1Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        d41 d41Var2 = d41.this;
                        int i11 = d41Var2.f25548b;
                        q80Var.u();
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
                        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_editBanned, new y1(d41Var2, 15));
                    }
                });
                return;
            default:
                yh.g.Z((yh.g) this.d, (TLRPC.TL_error) this.f28964e, (TwoStepVerificationActivity) this.f28965f, (Activity) this.h, this.f28962b, this.f28963c, this.f28966n);
                return;
        }
    }

    public n31(yh.g gVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
        this.d = gVar;
        this.f28964e = tL_error;
        this.f28965f = twoStepVerificationActivity;
        this.h = activity;
        this.f28962b = z10;
        this.f28963c = j3;
        this.f28966n = tLObject;
    }
}
