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
public final class i31 implements Runnable {
    public final int f25808a = 0;
    public final boolean f25809b;
    public final long f25810c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f25811f;
    public final Object h;
    public final TLObject f25812n;

    public i31(y31 y31Var, boolean z10, org.telegram.ui.ActionBar.e1 e1Var, m80 m80Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.d = y31Var;
        this.f25809b = z10;
        this.e = e1Var;
        this.f25811f = m80Var;
        this.f25810c = j10;
        this.h = user;
        this.f25812n = chat;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f25808a) {
            case 0:
                final y31 y31Var = (y31) this.d;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.e;
                final m80 m80Var = (m80) this.f25811f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.f25812n;
                boolean z10 = this.f25809b;
                final boolean z11 = !z10;
                e1Var.setVisibility(0);
                if (!z10) {
                    i10 = R.string.UnbanUserMonoforum;
                } else {
                    i10 = R.string.BanUserMonoforum;
                }
                e1Var.setText(LocaleController.getString(i10));
                final long j10 = this.f25810c;
                e1Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        y31 y31Var2 = y31.this;
                        int i11 = y31Var2.f31472b;
                        m80Var.u();
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
                zh.g.Z((zh.g) this.d, (TLRPC.TL_error) this.e, (TwoStepVerificationActivity) this.f25811f, (Activity) this.h, this.f25809b, this.f25810c, this.f25812n);
                return;
        }
    }

    public i31(zh.g gVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10, TLObject tLObject) {
        this.d = gVar;
        this.e = tL_error;
        this.f25811f = twoStepVerificationActivity;
        this.h = activity;
        this.f25809b = z10;
        this.f25810c = j10;
        this.f25812n = tLObject;
    }
}
