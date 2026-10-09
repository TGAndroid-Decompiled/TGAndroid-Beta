package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ow implements RequestDelegate {
    public final int f40604a = 0;
    public final org.telegram.ui.ActionBar.b2 f40605b;
    public final long f40606c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f40607e;
    public final TLObject f40608f;
    public final Object f40609g;

    public ow(ty tyVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = tyVar;
        this.f40605b = b2Var;
        this.f40607e = user;
        this.f40608f = chat;
        this.f40606c = j3;
        this.f40609g = tL_messages_checkHistoryImportPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40604a) {
            case 0:
                AndroidUtilities.runOnUIThread(new dw((ty) this.d, this.f40605b, tLObject, (TLRPC.User) this.f40607e, (TLRPC.Chat) this.f40608f, this.f40606c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f40609g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new dw((yh.s3) this.d, (of.e) this.f40607e, this.f40605b, tLObject, (TL_stars.TL_starGiftUnique) this.f40608f, tL_error, this.f40606c, (CharSequence) this.f40609g));
                return;
        }
    }

    public ow(yh.s3 s3Var, of.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.d = s3Var;
        this.f40607e = eVar;
        this.f40605b = b2Var;
        this.f40608f = tL_starGiftUnique;
        this.f40606c = j3;
        this.f40609g = charSequence;
    }
}
