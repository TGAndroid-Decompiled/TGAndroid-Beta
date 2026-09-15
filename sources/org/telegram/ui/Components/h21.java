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
public final class h21 implements Runnable {
    public final int f24500a = 0;
    public final boolean f24501b;
    public final long f24502c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f24503f;
    public final Object h;
    public final TLObject f24504n;

    public h21(x21 x21Var, boolean z10, org.telegram.ui.ActionBar.f1 f1Var, n70 n70Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.d = x21Var;
        this.f24501b = z10;
        this.e = f1Var;
        this.f24503f = n70Var;
        this.f24502c = j3;
        this.h = user;
        this.f24504n = chat;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f24500a) {
            case 0:
                final x21 x21Var = (x21) this.d;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.e;
                final n70 n70Var = (n70) this.f24503f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.f24504n;
                boolean z10 = this.f24501b;
                final boolean z11 = !z10;
                f1Var.setVisibility(0);
                if (!z10) {
                    i10 = R.string.UnbanUserMonoforum;
                } else {
                    i10 = R.string.BanUserMonoforum;
                }
                f1Var.setText(LocaleController.getString(i10));
                final long j3 = this.f24502c;
                f1Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        x21 x21Var2 = x21.this;
                        int i11 = x21Var2.f29871b;
                        n70Var.u();
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
                        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_editBanned, new x1(x21Var2, 15));
                    }
                });
                return;
            default:
                yh.g.Z((yh.g) this.d, (TLRPC.TL_error) this.e, (TwoStepVerificationActivity) this.f24503f, (Activity) this.h, this.f24501b, this.f24502c, this.f24504n);
                return;
        }
    }

    public h21(yh.g gVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
        this.d = gVar;
        this.e = tL_error;
        this.f24503f = twoStepVerificationActivity;
        this.h = activity;
        this.f24501b = z10;
        this.f24502c = j3;
        this.f24504n = tLObject;
    }
}
