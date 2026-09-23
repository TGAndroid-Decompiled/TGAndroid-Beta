package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class nw implements RequestDelegate {
    public final int f35610a = 0;
    public final org.telegram.ui.ActionBar.b2 f35611b;
    public final long f35612c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final TLObject f35613f;
    public final Object f35614g;

    public nw(ry ryVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = ryVar;
        this.f35611b = b2Var;
        this.e = user;
        this.f35613f = chat;
        this.f35612c = j3;
        this.f35614g = tL_messages_checkHistoryImportPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35610a) {
            case 0:
                AndroidUtilities.runOnUIThread(new bw((ry) this.d, this.f35611b, tLObject, (TLRPC.User) this.e, (TLRPC.Chat) this.f35613f, this.f35612c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f35614g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new bw((yh.y3) this.d, (nf.e) this.e, this.f35611b, tLObject, (TL_stars.TL_starGiftUnique) this.f35613f, tL_error, this.f35612c, (CharSequence) this.f35614g));
                return;
        }
    }

    public nw(yh.y3 y3Var, nf.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.d = y3Var;
        this.e = eVar;
        this.f35611b = b2Var;
        this.f35613f = tL_starGiftUnique;
        this.f35612c = j3;
        this.f35614g = charSequence;
    }
}
