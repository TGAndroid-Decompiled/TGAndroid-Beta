package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class lw implements RequestDelegate {
    public final int f35417a = 0;
    public final org.telegram.ui.ActionBar.a2 f35418b;
    public final long f35419c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final TLObject f35420f;
    public final Object f35421g;

    public lw(qy qyVar, org.telegram.ui.ActionBar.a2 a2Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = qyVar;
        this.f35418b = a2Var;
        this.e = user;
        this.f35420f = chat;
        this.f35419c = j3;
        this.f35421g = tL_messages_checkHistoryImportPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35417a) {
            case 0:
                AndroidUtilities.runOnUIThread(new aw((qy) this.d, this.f35418b, tLObject, (TLRPC.User) this.e, (TLRPC.Chat) this.f35420f, this.f35419c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f35421g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new aw((yh.x3) this.d, (nf.e) this.e, this.f35418b, tLObject, (TL_stars.TL_starGiftUnique) this.f35420f, tL_error, this.f35419c, (CharSequence) this.f35421g));
                return;
        }
    }

    public lw(yh.x3 x3Var, nf.e eVar, org.telegram.ui.ActionBar.a2 a2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.d = x3Var;
        this.e = eVar;
        this.f35418b = a2Var;
        this.f35420f = tL_starGiftUnique;
        this.f35419c = j3;
        this.f35421g = charSequence;
    }
}
