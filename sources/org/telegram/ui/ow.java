package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ow implements RequestDelegate {
    public final int f40631a = 0;
    public final org.telegram.ui.ActionBar.a2 f40632b;
    public final long f40633c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f40634e;
    public final TLObject f40635f;
    public final Object f40636g;

    public ow(sy syVar, org.telegram.ui.ActionBar.a2 a2Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = syVar;
        this.f40632b = a2Var;
        this.f40634e = user;
        this.f40635f = chat;
        this.f40633c = j3;
        this.f40636g = tL_messages_checkHistoryImportPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40631a) {
            case 0:
                AndroidUtilities.runOnUIThread(new cw((sy) this.d, this.f40632b, tLObject, (TLRPC.User) this.f40634e, (TLRPC.Chat) this.f40635f, this.f40633c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f40636g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new cw((yh.s3) this.d, (of.e) this.f40634e, this.f40632b, tLObject, (TL_stars.TL_starGiftUnique) this.f40635f, tL_error, this.f40633c, (CharSequence) this.f40636g));
                return;
        }
    }

    public ow(yh.s3 s3Var, of.e eVar, org.telegram.ui.ActionBar.a2 a2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.d = s3Var;
        this.f40634e = eVar;
        this.f40632b = a2Var;
        this.f40635f = tL_starGiftUnique;
        this.f40633c = j3;
        this.f40636g = charSequence;
    }
}
