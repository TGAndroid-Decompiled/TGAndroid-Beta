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
    public final int f28677a = 0;
    public final boolean f28678b;
    public final long f28679c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f28680f;
    public final Object h;
    public final TLObject f28681n;

    public u21(k31 k31Var, boolean z10, org.telegram.ui.ActionBar.e1 e1Var, y70 y70Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.d = k31Var;
        this.f28678b = z10;
        this.e = e1Var;
        this.f28680f = y70Var;
        this.f28679c = j3;
        this.h = user;
        this.f28681n = chat;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f28677a) {
            case 0:
                final k31 k31Var = (k31) this.d;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.e;
                final y70 y70Var = (y70) this.f28680f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.f28681n;
                boolean z10 = this.f28678b;
                final boolean z11 = !z10;
                e1Var.setVisibility(0);
                if (!z10) {
                    i10 = R.string.UnbanUserMonoforum;
                } else {
                    i10 = R.string.BanUserMonoforum;
                }
                e1Var.setText(LocaleController.getString(i10));
                final long j3 = this.f28679c;
                e1Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        k31 k31Var2 = k31.this;
                        int i11 = k31Var2.f25616b;
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
                yh.g.Z((yh.g) this.d, (TLRPC.TL_error) this.e, (TwoStepVerificationActivity) this.f28680f, (Activity) this.h, this.f28678b, this.f28679c, this.f28681n);
                return;
        }
    }

    public u21(yh.g gVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
        this.d = gVar;
        this.e = tL_error;
        this.f28680f = twoStepVerificationActivity;
        this.h = activity;
        this.f28678b = z10;
        this.f28679c = j3;
        this.f28681n = tLObject;
    }
}
