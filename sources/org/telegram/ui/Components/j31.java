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
public final class j31 implements Runnable {
    public final int f25874a = 0;
    public final boolean f25875b;
    public final long f25876c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f25877f;
    public final Object h;
    public final TLObject f25878n;

    public j31(y31 y31Var, boolean z10, org.telegram.ui.ActionBar.e1 e1Var, l80 l80Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.d = y31Var;
        this.f25875b = z10;
        this.e = e1Var;
        this.f25877f = l80Var;
        this.f25876c = j10;
        this.h = user;
        this.f25878n = chat;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f25874a) {
            case 0:
                final y31 y31Var = (y31) this.d;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.e;
                final l80 l80Var = (l80) this.f25877f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.f25878n;
                boolean z10 = this.f25875b;
                final boolean z11 = !z10;
                e1Var.setVisibility(0);
                if (!z10) {
                    i10 = R.string.UnbanUserMonoforum;
                } else {
                    i10 = R.string.BanUserMonoforum;
                }
                e1Var.setText(LocaleController.getString(i10));
                final long j10 = this.f25876c;
                e1Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        y31 y31Var2 = y31.this;
                        int i11 = y31Var2.f31134b;
                        l80Var.u();
                        boolean z12 = z11;
                        TLRPC.User user2 = user;
                        if (!z12) {
                            MessagesController.getInstance(i11).deleteParticipantFromChat(j10, user2, (TLRPC.Chat) null, false, false);
                            return;
                        }
                        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                        tL_channels_editBanned.participant = MessagesController.getInputPeer(user2);
                        tL_channels_editBanned.channel = MessagesController.getInputChannel(chat);
                        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
                        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_editBanned, new y1(y31Var2, 15));
                    }
                });
                return;
            default:
                zh.g.Z((zh.g) this.d, (TLRPC.TL_error) this.e, (TwoStepVerificationActivity) this.f25877f, (Activity) this.h, this.f25875b, this.f25876c, this.f25878n);
                return;
        }
    }

    public j31(zh.g gVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10, TLObject tLObject) {
        this.d = gVar;
        this.e = tL_error;
        this.f25877f = twoStepVerificationActivity;
        this.h = activity;
        this.f25875b = z10;
        this.f25876c = j10;
        this.f25878n = tLObject;
    }
}
