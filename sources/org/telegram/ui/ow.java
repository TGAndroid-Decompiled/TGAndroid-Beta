package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ow implements RequestDelegate {
    public final int f40650a = 0;
    public final org.telegram.ui.ActionBar.b2 f40651b;
    public final long f40652c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f40653e;
    public final TLObject f40654f;
    public final Object f40655g;

    public ow(ty tyVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = tyVar;
        this.f40651b = b2Var;
        this.f40653e = user;
        this.f40654f = chat;
        this.f40652c = j3;
        this.f40655g = tL_messages_checkHistoryImportPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40650a) {
            case 0:
                AndroidUtilities.runOnUIThread(new dw((ty) this.d, this.f40651b, tLObject, (TLRPC.User) this.f40653e, (TLRPC.Chat) this.f40654f, this.f40652c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f40655g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new dw((yh.s3) this.d, (of.e) this.f40653e, this.f40651b, tLObject, (TL_stars.TL_starGiftUnique) this.f40654f, tL_error, this.f40652c, (CharSequence) this.f40655g));
                return;
        }
    }

    public ow(yh.s3 s3Var, of.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.d = s3Var;
        this.f40653e = eVar;
        this.f40651b = b2Var;
        this.f40654f = tL_starGiftUnique;
        this.f40652c = j3;
        this.f40655g = charSequence;
    }
}
