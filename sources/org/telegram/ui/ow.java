package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ow implements RequestDelegate {
    public final int f36259a = 0;
    public final org.telegram.ui.ActionBar.c2 f36260b;
    public final long f36261c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final TLObject f36262f;
    public final Object f36263g;

    public ow(ty tyVar, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = tyVar;
        this.f36260b = c2Var;
        this.e = user;
        this.f36262f = chat;
        this.f36261c = j3;
        this.f36263g = tL_messages_checkHistoryImportPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36259a) {
            case 0:
                AndroidUtilities.runOnUIThread(new dw((ty) this.d, this.f36260b, tLObject, (TLRPC.User) this.e, (TLRPC.Chat) this.f36262f, this.f36261c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f36263g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new dw((yh.x3) this.d, (nf.e) this.e, this.f36260b, tLObject, (TL_stars.TL_starGiftUnique) this.f36262f, tL_error, this.f36261c, (CharSequence) this.f36263g));
                return;
        }
    }

    public ow(yh.x3 x3Var, nf.e eVar, org.telegram.ui.ActionBar.c2 c2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.d = x3Var;
        this.e = eVar;
        this.f36260b = c2Var;
        this.f36262f = tL_starGiftUnique;
        this.f36261c = j3;
        this.f36263g = charSequence;
    }
}
