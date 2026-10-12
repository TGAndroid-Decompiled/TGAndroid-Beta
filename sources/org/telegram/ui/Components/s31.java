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
public final class s31 implements Runnable {
    public final int f30381a = 0;
    public final boolean f30382b;
    public final long f30383c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f30384e;
    public final Object f30385f;
    public final Object h;
    public final TLObject f30386n;

    public s31(h41 h41Var, boolean z10, org.telegram.ui.ActionBar.e1 e1Var, s80 s80Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.d = h41Var;
        this.f30382b = z10;
        this.f30384e = e1Var;
        this.f30385f = s80Var;
        this.f30383c = j3;
        this.h = user;
        this.f30386n = chat;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f30381a) {
            case 0:
                final h41 h41Var = (h41) this.d;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f30384e;
                final s80 s80Var = (s80) this.f30385f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.f30386n;
                boolean z10 = this.f30382b;
                final boolean z11 = !z10;
                e1Var.setVisibility(0);
                if (!z10) {
                    i10 = R.string.UnbanUserMonoforum;
                } else {
                    i10 = R.string.BanUserMonoforum;
                }
                e1Var.setText(LocaleController.getString(i10));
                final long j3 = this.f30383c;
                e1Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        h41 h41Var2 = h41.this;
                        int i11 = h41Var2.f26640b;
                        s80Var.u();
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
                        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_editBanned, new y1(h41Var2, 15));
                    }
                });
                return;
            default:
                yh.g.Z((yh.g) this.d, (TLRPC.TL_error) this.f30384e, (TwoStepVerificationActivity) this.f30385f, (Activity) this.h, this.f30382b, this.f30383c, this.f30386n);
                return;
        }
    }

    public s31(yh.g gVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
        this.d = gVar;
        this.f30384e = tL_error;
        this.f30385f = twoStepVerificationActivity;
        this.h = activity;
        this.f30382b = z10;
        this.f30383c = j3;
        this.f30386n = tLObject;
    }
}
