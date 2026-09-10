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
    public final int f27798a = 0;
    public final boolean f27799b;
    public final long f27800c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f27801f;
    public final Object h;
    public final TLObject f27802n;

    public v21(k31 k31Var, boolean z10, org.telegram.ui.ActionBar.g1 g1Var, w70 w70Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.d = k31Var;
        this.f27799b = z10;
        this.e = g1Var;
        this.f27801f = w70Var;
        this.f27800c = j3;
        this.h = user;
        this.f27802n = chat;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f27798a) {
            case 0:
                final k31 k31Var = (k31) this.d;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.e;
                final w70 w70Var = (w70) this.f27801f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.f27802n;
                boolean z10 = this.f27799b;
                final boolean z11 = !z10;
                g1Var.setVisibility(0);
                if (!z10) {
                    i10 = R.string.UnbanUserMonoforum;
                } else {
                    i10 = R.string.BanUserMonoforum;
                }
                g1Var.setText(LocaleController.getString(i10));
                final long j3 = this.f27800c;
                g1Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        k31 k31Var2 = k31.this;
                        int i11 = k31Var2.f24588b;
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
                        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_editBanned, new z1(k31Var2, 15));
                    }
                });
                return;
            default:
                xh.h.Z((xh.h) this.d, (TLRPC.TL_error) this.e, (TwoStepVerificationActivity) this.f27801f, (Activity) this.h, this.f27799b, this.f27800c, this.f27802n);
                return;
        }
    }

    public v21(xh.h hVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
        this.d = hVar;
        this.e = tL_error;
        this.f27801f = twoStepVerificationActivity;
        this.h = activity;
        this.f27799b = z10;
        this.f27800c = j3;
        this.f27802n = tLObject;
    }
}
