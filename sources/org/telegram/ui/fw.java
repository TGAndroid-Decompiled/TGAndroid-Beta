package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class fw implements Runnable {
    public final int f36507a = 1;
    public final TLObject f36508b;
    public final long f36509c;
    public final Object d;
    public final Object f36510e;
    public final Object f36511f;
    public final Object h;
    public final Object f36512n;
    public final Object f36513r;

    public fw(TLObject tLObject, Context context, bi.s0 s0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.yc ycVar, org.telegram.messenger.video.d dVar) {
        this.f36508b = tLObject;
        this.d = context;
        this.f36510e = s0Var;
        this.f36509c = j3;
        this.f36511f = bArr;
        this.h = aVar;
        this.f36512n = ycVar;
        this.f36513r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f36507a) {
            case 0:
                uy.n0((uy) this.d, (org.telegram.ui.ActionBar.b2) this.f36510e, this.f36508b, (TLRPC.User) this.f36511f, (TLRPC.Chat) this.h, this.f36509c, (TLRPC.TL_error) this.f36512n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f36513r);
                return;
            case 1:
                Context context = (Context) this.d;
                bi.s0 s0Var = (bi.s0) this.f36510e;
                byte[] bArr = (byte[]) this.f36511f;
                org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) this.f36512n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f36513r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f36508b;
                e41 e41Var = new e41(context, s0Var, this.f36509c, bArr);
                e41Var.O(tL_channels_sponsoredMessageReportResultChooseOption);
                e41Var.f35958s = new x31((org.telegram.messenger.video.a) this.h, ycVar, context, s0Var, dVar);
                e41Var.show();
                return;
            default:
                zh.w3.C0((zh.w3) this.d, (of.e) this.f36511f, (org.telegram.ui.ActionBar.b2) this.f36510e, this.f36508b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f36512n, this.f36509c, (CharSequence) this.f36513r);
                return;
        }
    }

    public fw(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = uyVar;
        this.f36510e = b2Var;
        this.f36508b = tLObject;
        this.f36511f = user;
        this.h = chat;
        this.f36509c = j3;
        this.f36512n = tL_error;
        this.f36513r = tL_messages_checkHistoryImportPeer;
    }

    public fw(zh.w3 w3Var, of.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = w3Var;
        this.f36511f = eVar;
        this.f36510e = b2Var;
        this.f36508b = tLObject;
        this.h = tL_starGiftUnique;
        this.f36512n = tL_error;
        this.f36509c = j3;
        this.f36513r = charSequence;
    }
}
