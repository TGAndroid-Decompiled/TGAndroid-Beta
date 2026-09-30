package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class lw implements RequestDelegate {
    public final int f35420a = 0;
    public final org.telegram.ui.ActionBar.a2 f35421b;
    public final long f35422c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final TLObject f35423f;
    public final Object f35424g;

    public lw(qy qyVar, org.telegram.ui.ActionBar.a2 a2Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = qyVar;
        this.f35421b = a2Var;
        this.e = user;
        this.f35423f = chat;
        this.f35422c = j3;
        this.f35424g = tL_messages_checkHistoryImportPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35420a) {
            case 0:
                AndroidUtilities.runOnUIThread(new aw((qy) this.d, this.f35421b, tLObject, (TLRPC.User) this.e, (TLRPC.Chat) this.f35423f, this.f35422c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f35424g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new aw((yh.x3) this.d, (nf.e) this.e, this.f35421b, tLObject, (TL_stars.TL_starGiftUnique) this.f35423f, tL_error, this.f35422c, (CharSequence) this.f35424g));
                return;
        }
    }

    public lw(yh.x3 x3Var, nf.e eVar, org.telegram.ui.ActionBar.a2 a2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.d = x3Var;
        this.e = eVar;
        this.f35421b = a2Var;
        this.f35423f = tL_starGiftUnique;
        this.f35422c = j3;
        this.f35424g = charSequence;
    }
}
