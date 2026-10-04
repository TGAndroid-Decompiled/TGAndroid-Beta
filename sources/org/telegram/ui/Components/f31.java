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
public final class f31 implements Runnable {
    public final int f26259a = 0;
    public final boolean f26260b;
    public final long f26261c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f26262e;
    public final Object f26263f;
    public final Object h;
    public final TLObject f26264n;

    public f31(v31 v31Var, boolean z10, org.telegram.ui.ActionBar.f1 f1Var, b80 b80Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.d = v31Var;
        this.f26260b = z10;
        this.f26262e = f1Var;
        this.f26263f = b80Var;
        this.f26261c = j3;
        this.h = user;
        this.f26264n = chat;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f26259a) {
            case 0:
                final v31 v31Var = (v31) this.d;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.f26262e;
                final b80 b80Var = (b80) this.f26263f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.f26264n;
                boolean z10 = this.f26260b;
                final boolean z11 = !z10;
                f1Var.setVisibility(0);
                if (!z10) {
                    i10 = R.string.UnbanUserMonoforum;
                } else {
                    i10 = R.string.BanUserMonoforum;
                }
                f1Var.setText(LocaleController.getString(i10));
                final long j3 = this.f26261c;
                f1Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        v31 v31Var2 = v31.this;
                        int i11 = v31Var2.f31545b;
                        b80Var.u();
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
                        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_editBanned, new y1(v31Var2, 15));
                    }
                });
                return;
            default:
                yh.g.Y((yh.g) this.d, (TLRPC.TL_error) this.f26262e, (TwoStepVerificationActivity) this.f26263f, (Activity) this.h, this.f26260b, this.f26261c, this.f26264n);
                return;
        }
    }

    public f31(yh.g gVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
        this.d = gVar;
        this.f26262e = tL_error;
        this.f26263f = twoStepVerificationActivity;
        this.h = activity;
        this.f26260b = z10;
        this.f26261c = j3;
        this.f26264n = tLObject;
    }
}
