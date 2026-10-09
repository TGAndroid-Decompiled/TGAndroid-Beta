package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ow implements RequestDelegate {
    public final int f40606a = 0;
    public final org.telegram.ui.ActionBar.b2 f40607b;
    public final long f40608c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f40609e;
    public final TLObject f40610f;
    public final Object f40611g;

    public ow(ty tyVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = tyVar;
        this.f40607b = b2Var;
        this.f40609e = user;
        this.f40610f = chat;
        this.f40608c = j3;
        this.f40611g = tL_messages_checkHistoryImportPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40606a) {
            case 0:
                AndroidUtilities.runOnUIThread(new dw((ty) this.d, this.f40607b, tLObject, (TLRPC.User) this.f40609e, (TLRPC.Chat) this.f40610f, this.f40608c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f40611g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new dw((yh.s3) this.d, (of.e) this.f40609e, this.f40607b, tLObject, (TL_stars.TL_starGiftUnique) this.f40610f, tL_error, this.f40608c, (CharSequence) this.f40611g));
                return;
        }
    }

    public ow(yh.s3 s3Var, of.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.d = s3Var;
        this.f40609e = eVar;
        this.f40607b = b2Var;
        this.f40610f = tL_starGiftUnique;
        this.f40608c = j3;
        this.f40611g = charSequence;
    }
}
