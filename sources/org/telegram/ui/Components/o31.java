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
public final class o31 implements Runnable {
    public final int f29246a = 0;
    public final boolean f29247b;
    public final long f29248c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f29249e;
    public final Object f29250f;
    public final Object h;
    public final TLObject f29251n;

    public o31(e41 e41Var, boolean z10, org.telegram.ui.ActionBar.e1 e1Var, q80 q80Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.d = e41Var;
        this.f29247b = z10;
        this.f29249e = e1Var;
        this.f29250f = q80Var;
        this.f29248c = j3;
        this.h = user;
        this.f29251n = chat;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f29246a) {
            case 0:
                final e41 e41Var = (e41) this.d;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f29249e;
                final q80 q80Var = (q80) this.f29250f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.f29251n;
                boolean z10 = this.f29247b;
                final boolean z11 = !z10;
                e1Var.setVisibility(0);
                if (!z10) {
                    i10 = R.string.UnbanUserMonoforum;
                } else {
                    i10 = R.string.BanUserMonoforum;
                }
                e1Var.setText(LocaleController.getString(i10));
                final long j3 = this.f29248c;
                e1Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        e41 e41Var2 = e41.this;
                        int i11 = e41Var2.f25842b;
                        q80Var.u();
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
                        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_editBanned, new y1(e41Var2, 15));
                    }
                });
                return;
            default:
                yh.g.Z((yh.g) this.d, (TLRPC.TL_error) this.f29249e, (TwoStepVerificationActivity) this.f29250f, (Activity) this.h, this.f29247b, this.f29248c, this.f29251n);
                return;
        }
    }

    public o31(yh.g gVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
        this.d = gVar;
        this.f29249e = tL_error;
        this.f29250f = twoStepVerificationActivity;
        this.h = activity;
        this.f29247b = z10;
        this.f29248c = j3;
        this.f29251n = tLObject;
    }
}
