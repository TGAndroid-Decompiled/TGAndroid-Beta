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
public final class g31 implements Runnable {
    public final int f26687a = 0;
    public final boolean f26688b;
    public final long f26689c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f26690e;
    public final Object f26691f;
    public final Object h;
    public final TLObject f26692n;

    public g31(w31 w31Var, boolean z10, org.telegram.ui.ActionBar.f1 f1Var, b80 b80Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.d = w31Var;
        this.f26688b = z10;
        this.f26690e = f1Var;
        this.f26691f = b80Var;
        this.f26689c = j3;
        this.h = user;
        this.f26692n = chat;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f26687a) {
            case 0:
                final w31 w31Var = (w31) this.d;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.f26690e;
                final b80 b80Var = (b80) this.f26691f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.f26692n;
                boolean z10 = this.f26688b;
                final boolean z11 = !z10;
                f1Var.setVisibility(0);
                if (!z10) {
                    i10 = R.string.UnbanUserMonoforum;
                } else {
                    i10 = R.string.BanUserMonoforum;
                }
                f1Var.setText(LocaleController.getString(i10));
                final long j3 = this.f26689c;
                f1Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        w31 w31Var2 = w31.this;
                        int i11 = w31Var2.f32500b;
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
                        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_editBanned, new y1(w31Var2, 15));
                    }
                });
                return;
            default:
                yh.h.X((yh.h) this.d, (TLRPC.TL_error) this.f26690e, (TwoStepVerificationActivity) this.f26691f, (Activity) this.h, this.f26688b, this.f26689c, this.f26692n);
                return;
        }
    }

    public g31(yh.h hVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
        this.d = hVar;
        this.f26690e = tL_error;
        this.f26691f = twoStepVerificationActivity;
        this.h = activity;
        this.f26688b = z10;
        this.f26689c = j3;
        this.f26692n = tLObject;
    }
}
