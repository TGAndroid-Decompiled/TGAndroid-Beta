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
    public final int f29846a = 0;
    public final boolean f29847b;
    public final long f29848c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f29849f;
    public final Object h;
    public final TLObject f29850n;

    public w21(m31 m31Var, boolean z10, org.telegram.ui.ActionBar.f1 f1Var, w70 w70Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.d = m31Var;
        this.f29847b = z10;
        this.e = f1Var;
        this.f29849f = w70Var;
        this.f29848c = j3;
        this.h = user;
        this.f29850n = chat;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f29846a) {
            case 0:
                final m31 m31Var = (m31) this.d;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.e;
                final w70 w70Var = (w70) this.f29849f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.f29850n;
                boolean z10 = this.f29847b;
                final boolean z11 = !z10;
                f1Var.setVisibility(0);
                if (!z10) {
                    i10 = R.string.UnbanUserMonoforum;
                } else {
                    i10 = R.string.BanUserMonoforum;
                }
                f1Var.setText(LocaleController.getString(i10));
                final long j3 = this.f29848c;
                f1Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        m31 m31Var2 = m31.this;
                        int i11 = m31Var2.f26309b;
                        w70Var.u();
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
                        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_editBanned, new x1(m31Var2, 15));
                    }
                });
                return;
            default:
                yh.g.Z((yh.g) this.d, (TLRPC.TL_error) this.e, (TwoStepVerificationActivity) this.f29849f, (Activity) this.h, this.f29847b, this.f29848c, this.f29850n);
                return;
        }
    }

    public w21(yh.g gVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
        this.d = gVar;
        this.e = tL_error;
        this.f29849f = twoStepVerificationActivity;
        this.h = activity;
        this.f29847b = z10;
        this.f29848c = j3;
        this.f29850n = tLObject;
    }
}
