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
public final class n31 implements Runnable {
    public final int f29001a = 0;
    public final boolean f29002b;
    public final long f29003c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f29004e;
    public final Object f29005f;
    public final Object h;
    public final TLObject f29006n;

    public n31(d41 d41Var, boolean z10, org.telegram.ui.ActionBar.e1 e1Var, p80 p80Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.d = d41Var;
        this.f29002b = z10;
        this.f29004e = e1Var;
        this.f29005f = p80Var;
        this.f29003c = j3;
        this.h = user;
        this.f29006n = chat;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f29001a) {
            case 0:
                final d41 d41Var = (d41) this.d;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f29004e;
                final p80 p80Var = (p80) this.f29005f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.f29006n;
                boolean z10 = this.f29002b;
                final boolean z11 = !z10;
                e1Var.setVisibility(0);
                if (!z10) {
                    i10 = R.string.UnbanUserMonoforum;
                } else {
                    i10 = R.string.BanUserMonoforum;
                }
                e1Var.setText(LocaleController.getString(i10));
                final long j3 = this.f29003c;
                e1Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        d41 d41Var2 = d41.this;
                        int i11 = d41Var2.f25610b;
                        p80Var.u();
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
                        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_editBanned, new y1(d41Var2, 15));
                    }
                });
                return;
            default:
                yh.g.Z((yh.g) this.d, (TLRPC.TL_error) this.f29004e, (TwoStepVerificationActivity) this.f29005f, (Activity) this.h, this.f29002b, this.f29003c, this.f29006n);
                return;
        }
    }

    public n31(yh.g gVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
        this.d = gVar;
        this.f29004e = tL_error;
        this.f29005f = twoStepVerificationActivity;
        this.h = activity;
        this.f29002b = z10;
        this.f29003c = j3;
        this.f29006n = tLObject;
    }
}
