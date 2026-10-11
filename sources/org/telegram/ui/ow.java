package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ow implements RequestDelegate {
    public final int f40665a = 0;
    public final org.telegram.ui.ActionBar.a2 f40666b;
    public final long f40667c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f40668e;
    public final TLObject f40669f;
    public final Object f40670g;

    public ow(sy syVar, org.telegram.ui.ActionBar.a2 a2Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = syVar;
        this.f40666b = a2Var;
        this.f40668e = user;
        this.f40669f = chat;
        this.f40667c = j3;
        this.f40670g = tL_messages_checkHistoryImportPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40665a) {
            case 0:
                AndroidUtilities.runOnUIThread(new cw((sy) this.d, this.f40666b, tLObject, (TLRPC.User) this.f40668e, (TLRPC.Chat) this.f40669f, this.f40667c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f40670g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new cw((yh.s3) this.d, (of.e) this.f40668e, this.f40666b, tLObject, (TL_stars.TL_starGiftUnique) this.f40669f, tL_error, this.f40667c, (CharSequence) this.f40670g));
                return;
        }
    }

    public ow(yh.s3 s3Var, of.e eVar, org.telegram.ui.ActionBar.a2 a2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.d = s3Var;
        this.f40668e = eVar;
        this.f40666b = a2Var;
        this.f40669f = tL_starGiftUnique;
        this.f40667c = j3;
        this.f40670g = charSequence;
    }
}
