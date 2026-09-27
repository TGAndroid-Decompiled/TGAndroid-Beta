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
public final class w21 implements Runnable {
    public final int f29838a = 0;
    public final boolean f29839b;
    public final long f29840c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f29841f;
    public final Object h;
    public final TLObject f29842n;

    public w21(m31 m31Var, boolean z10, org.telegram.ui.ActionBar.g1 g1Var, a80 a80Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.d = m31Var;
        this.f29839b = z10;
        this.e = g1Var;
        this.f29841f = a80Var;
        this.f29840c = j3;
        this.h = user;
        this.f29842n = chat;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f29838a) {
            case 0:
                final m31 m31Var = (m31) this.d;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.e;
                final a80 a80Var = (a80) this.f29841f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.f29842n;
                boolean z10 = this.f29839b;
                final boolean z11 = !z10;
                g1Var.setVisibility(0);
                if (!z10) {
                    i10 = R.string.UnbanUserMonoforum;
                } else {
                    i10 = R.string.BanUserMonoforum;
                }
                g1Var.setText(LocaleController.getString(i10));
                final long j3 = this.f29840c;
                g1Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        m31 m31Var2 = m31.this;
                        int i11 = m31Var2.f26327b;
                        a80Var.u();
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
                        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_editBanned, new y1(m31Var2, 15));
                    }
                });
                return;
            default:
                yh.g.Z((yh.g) this.d, (TLRPC.TL_error) this.e, (TwoStepVerificationActivity) this.f29841f, (Activity) this.h, this.f29839b, this.f29840c, this.f29842n);
                return;
        }
    }

    public w21(yh.g gVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
        this.d = gVar;
        this.e = tL_error;
        this.f29841f = twoStepVerificationActivity;
        this.h = activity;
        this.f29839b = z10;
        this.f29840c = j3;
        this.f29842n = tLObject;
    }
}
