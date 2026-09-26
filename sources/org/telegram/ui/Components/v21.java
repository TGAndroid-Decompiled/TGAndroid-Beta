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
public final class v21 implements Runnable {
    public final int f28976a = 0;
    public final boolean f28977b;
    public final long f28978c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f28979f;
    public final Object h;
    public final TLObject f28980n;

    public v21(l31 l31Var, boolean z10, org.telegram.ui.ActionBar.e1 e1Var, z70 z70Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.d = l31Var;
        this.f28977b = z10;
        this.e = e1Var;
        this.f28979f = z70Var;
        this.f28978c = j3;
        this.h = user;
        this.f28980n = chat;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f28976a) {
            case 0:
                final l31 l31Var = (l31) this.d;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.e;
                final z70 z70Var = (z70) this.f28979f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.f28980n;
                boolean z10 = this.f28977b;
                final boolean z11 = !z10;
                e1Var.setVisibility(0);
                if (!z10) {
                    i10 = R.string.UnbanUserMonoforum;
                } else {
                    i10 = R.string.BanUserMonoforum;
                }
                e1Var.setText(LocaleController.getString(i10));
                final long j3 = this.f28978c;
                e1Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        l31 l31Var2 = l31.this;
                        int i11 = l31Var2.f25943b;
                        z70Var.u();
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
                        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_editBanned, new y1(l31Var2, 15));
                    }
                });
                return;
            default:
                yh.g.Z((yh.g) this.d, (TLRPC.TL_error) this.e, (TwoStepVerificationActivity) this.f28979f, (Activity) this.h, this.f28977b, this.f28978c, this.f28980n);
                return;
        }
    }

    public v21(yh.g gVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
        this.d = gVar;
        this.e = tL_error;
        this.f28979f = twoStepVerificationActivity;
        this.h = activity;
        this.f28977b = z10;
        this.f28978c = j3;
        this.f28980n = tLObject;
    }
}
