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
public final class i21 implements Runnable {
    public final int f24800a = 0;
    public final boolean f24801b;
    public final long f24802c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f24803f;
    public final Object h;
    public final TLObject f24804n;

    public i21(y21 y21Var, boolean z10, org.telegram.ui.ActionBar.g1 g1Var, n70 n70Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.d = y21Var;
        this.f24801b = z10;
        this.e = g1Var;
        this.f24803f = n70Var;
        this.f24802c = j3;
        this.h = user;
        this.f24804n = chat;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f24800a) {
            case 0:
                final y21 y21Var = (y21) this.d;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.e;
                final n70 n70Var = (n70) this.f24803f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.f24804n;
                boolean z10 = this.f24801b;
                final boolean z11 = !z10;
                g1Var.setVisibility(0);
                if (!z10) {
                    i10 = R.string.UnbanUserMonoforum;
                } else {
                    i10 = R.string.BanUserMonoforum;
                }
                g1Var.setText(LocaleController.getString(i10));
                final long j3 = this.f24802c;
                g1Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        y21 y21Var2 = y21.this;
                        int i11 = y21Var2.f30098b;
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
                        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_editBanned, new x1(y21Var2, 15));
                    }
                });
                return;
            default:
                yh.g.Z((yh.g) this.d, (TLRPC.TL_error) this.e, (TwoStepVerificationActivity) this.f24803f, (Activity) this.h, this.f24801b, this.f24802c, this.f24804n);
                return;
        }
    }

    public i21(yh.g gVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
        this.d = gVar;
        this.e = tL_error;
        this.f24803f = twoStepVerificationActivity;
        this.h = activity;
        this.f24801b = z10;
        this.f24802c = j3;
        this.f24804n = tLObject;
    }
}
