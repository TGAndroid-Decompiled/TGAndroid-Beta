package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class lw implements RequestDelegate {
    public final int f35416a = 0;
    public final org.telegram.ui.ActionBar.a2 f35417b;
    public final long f35418c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final TLObject f35419f;
    public final Object f35420g;

    public lw(qy qyVar, org.telegram.ui.ActionBar.a2 a2Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = qyVar;
        this.f35417b = a2Var;
        this.e = user;
        this.f35419f = chat;
        this.f35418c = j3;
        this.f35420g = tL_messages_checkHistoryImportPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35416a) {
            case 0:
                AndroidUtilities.runOnUIThread(new aw((qy) this.d, this.f35417b, tLObject, (TLRPC.User) this.e, (TLRPC.Chat) this.f35419f, this.f35418c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f35420g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new aw((yh.x3) this.d, (nf.e) this.e, this.f35417b, tLObject, (TL_stars.TL_starGiftUnique) this.f35419f, tL_error, this.f35418c, (CharSequence) this.f35420g));
                return;
        }
    }

    public lw(yh.x3 x3Var, nf.e eVar, org.telegram.ui.ActionBar.a2 a2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.d = x3Var;
        this.e = eVar;
        this.f35417b = a2Var;
        this.f35419f = tL_starGiftUnique;
        this.f35418c = j3;
        this.f35420g = charSequence;
    }
}
