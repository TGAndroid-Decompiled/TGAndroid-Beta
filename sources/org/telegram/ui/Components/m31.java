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
public final class m31 implements Runnable {
    public final int f28659a = 0;
    public final boolean f28660b;
    public final long f28661c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f28662e;
    public final Object f28663f;
    public final Object h;
    public final TLObject f28664n;

    public m31(c41 c41Var, boolean z10, org.telegram.ui.ActionBar.f1 f1Var, p80 p80Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.d = c41Var;
        this.f28660b = z10;
        this.f28662e = f1Var;
        this.f28663f = p80Var;
        this.f28661c = j3;
        this.h = user;
        this.f28664n = chat;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f28659a) {
            case 0:
                final c41 c41Var = (c41) this.d;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.f28662e;
                final p80 p80Var = (p80) this.f28663f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.f28664n;
                boolean z10 = this.f28660b;
                final boolean z11 = !z10;
                f1Var.setVisibility(0);
                if (!z10) {
                    i10 = R.string.UnbanUserMonoforum;
                } else {
                    i10 = R.string.BanUserMonoforum;
                }
                f1Var.setText(LocaleController.getString(i10));
                final long j3 = this.f28661c;
                f1Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        c41 c41Var2 = c41.this;
                        int i11 = c41Var2.f25237b;
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
                        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_editBanned, new y1(c41Var2, 15));
                    }
                });
                return;
            default:
                yh.g.Z((yh.g) this.d, (TLRPC.TL_error) this.f28662e, (TwoStepVerificationActivity) this.f28663f, (Activity) this.h, this.f28660b, this.f28661c, this.f28664n);
                return;
        }
    }

    public m31(yh.g gVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
        this.d = gVar;
        this.f28662e = tL_error;
        this.f28663f = twoStepVerificationActivity;
        this.h = activity;
        this.f28660b = z10;
        this.f28661c = j3;
        this.f28664n = tLObject;
    }
}
