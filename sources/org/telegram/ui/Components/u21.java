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
public final class u21 implements Runnable {
    public final int f28691a = 0;
    public final boolean f28692b;
    public final long f28693c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f28694f;
    public final Object h;
    public final TLObject f28695n;

    public u21(k31 k31Var, boolean z10, org.telegram.ui.ActionBar.e1 e1Var, y70 y70Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.d = k31Var;
        this.f28692b = z10;
        this.e = e1Var;
        this.f28694f = y70Var;
        this.f28693c = j3;
        this.h = user;
        this.f28695n = chat;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f28691a) {
            case 0:
                final k31 k31Var = (k31) this.d;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.e;
                final y70 y70Var = (y70) this.f28694f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.f28695n;
                boolean z10 = this.f28692b;
                final boolean z11 = !z10;
                e1Var.setVisibility(0);
                if (!z10) {
                    i10 = R.string.UnbanUserMonoforum;
                } else {
                    i10 = R.string.BanUserMonoforum;
                }
                e1Var.setText(LocaleController.getString(i10));
                final long j3 = this.f28693c;
                e1Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        k31 k31Var2 = k31.this;
                        int i11 = k31Var2.f25635b;
                        y70Var.u();
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
                        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_editBanned, new y1(k31Var2, 15));
                    }
                });
                return;
            default:
                yh.g.Z((yh.g) this.d, (TLRPC.TL_error) this.e, (TwoStepVerificationActivity) this.f28694f, (Activity) this.h, this.f28692b, this.f28693c, this.f28695n);
                return;
        }
    }

    public u21(yh.g gVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
        this.d = gVar;
        this.e = tL_error;
        this.f28694f = twoStepVerificationActivity;
        this.h = activity;
        this.f28692b = z10;
        this.f28693c = j3;
        this.f28695n = tLObject;
    }
}
