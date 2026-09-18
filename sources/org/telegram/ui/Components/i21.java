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
    public final int f24803a = 0;
    public final boolean f24804b;
    public final long f24805c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f24806f;
    public final Object h;
    public final TLObject f24807n;

    public i21(y21 y21Var, boolean z10, org.telegram.ui.ActionBar.g1 g1Var, n70 n70Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.d = y21Var;
        this.f24804b = z10;
        this.e = g1Var;
        this.f24806f = n70Var;
        this.f24805c = j3;
        this.h = user;
        this.f24807n = chat;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f24803a) {
            case 0:
                final y21 y21Var = (y21) this.d;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.e;
                final n70 n70Var = (n70) this.f24806f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.f24807n;
                boolean z10 = this.f24804b;
                final boolean z11 = !z10;
                g1Var.setVisibility(0);
                if (!z10) {
                    i10 = R.string.UnbanUserMonoforum;
                } else {
                    i10 = R.string.BanUserMonoforum;
                }
                g1Var.setText(LocaleController.getString(i10));
                final long j3 = this.f24805c;
                g1Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        y21 y21Var2 = y21.this;
                        int i11 = y21Var2.f30101b;
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
                yh.g.Z((yh.g) this.d, (TLRPC.TL_error) this.e, (TwoStepVerificationActivity) this.f24806f, (Activity) this.h, this.f24804b, this.f24805c, this.f24807n);
                return;
        }
    }

    public i21(yh.g gVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
        this.d = gVar;
        this.e = tL_error;
        this.f24806f = twoStepVerificationActivity;
        this.h = activity;
        this.f24804b = z10;
        this.f24805c = j3;
        this.f24807n = tLObject;
    }
}
