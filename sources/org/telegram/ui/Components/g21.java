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
public final class g21 implements Runnable {
    public final int f26263a = 0;
    public final boolean f26264b;
    public final long f26265c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f26266e;
    public final Object f26267f;
    public final Object h;
    public final TLObject f26268n;

    public g21(w21 w21Var, boolean z10, org.telegram.ui.ActionBar.f1 f1Var, n70 n70Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.d = w21Var;
        this.f26264b = z10;
        this.f26266e = f1Var;
        this.f26267f = n70Var;
        this.f26265c = j3;
        this.h = user;
        this.f26268n = chat;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f26263a) {
            case 0:
                final w21 w21Var = (w21) this.d;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.f26266e;
                final n70 n70Var = (n70) this.f26267f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.f26268n;
                boolean z10 = this.f26264b;
                final boolean z11 = !z10;
                f1Var.setVisibility(0);
                if (!z10) {
                    i10 = R.string.UnbanUserMonoforum;
                } else {
                    i10 = R.string.BanUserMonoforum;
                }
                f1Var.setText(LocaleController.getString(i10));
                final long j3 = this.f26265c;
                f1Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        w21 w21Var2 = w21.this;
                        int i11 = w21Var2.f32120b;
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
                        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_editBanned, new y1(w21Var2, 15));
                    }
                });
                return;
            default:
                zh.g.Z((zh.g) this.d, (TLRPC.TL_error) this.f26266e, (TwoStepVerificationActivity) this.f26267f, (Activity) this.h, this.f26264b, this.f26265c, this.f26268n);
                return;
        }
    }

    public g21(zh.g gVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
        this.d = gVar;
        this.f26266e = tL_error;
        this.f26267f = twoStepVerificationActivity;
        this.h = activity;
        this.f26264b = z10;
        this.f26265c = j3;
        this.f26268n = tLObject;
    }
}
