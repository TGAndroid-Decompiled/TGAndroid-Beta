package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class fw implements Runnable {
    public final int f36480a = 1;
    public final TLObject f36481b;
    public final long f36482c;
    public final Object d;
    public final Object f36483e;
    public final Object f36484f;
    public final Object h;
    public final Object f36485n;
    public final Object f36486r;

    public fw(TLObject tLObject, Context context, bi.s0 s0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.yc ycVar, org.telegram.messenger.video.d dVar) {
        this.f36481b = tLObject;
        this.d = context;
        this.f36483e = s0Var;
        this.f36482c = j3;
        this.f36484f = bArr;
        this.h = aVar;
        this.f36485n = ycVar;
        this.f36486r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f36480a) {
            case 0:
                uy.n0((uy) this.d, (org.telegram.ui.ActionBar.b2) this.f36483e, this.f36481b, (TLRPC.User) this.f36484f, (TLRPC.Chat) this.h, this.f36482c, (TLRPC.TL_error) this.f36485n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f36486r);
                return;
            case 1:
                Context context = (Context) this.d;
                bi.s0 s0Var = (bi.s0) this.f36483e;
                byte[] bArr = (byte[]) this.f36484f;
                org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) this.f36485n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f36486r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f36481b;
                e41 e41Var = new e41(context, s0Var, this.f36482c, bArr);
                e41Var.O(tL_channels_sponsoredMessageReportResultChooseOption);
                e41Var.f35931s = new x31((org.telegram.messenger.video.a) this.h, ycVar, context, s0Var, dVar);
                e41Var.show();
                return;
            default:
                zh.w3.C0((zh.w3) this.d, (of.e) this.f36484f, (org.telegram.ui.ActionBar.b2) this.f36483e, this.f36481b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f36485n, this.f36482c, (CharSequence) this.f36486r);
                return;
        }
    }

    public fw(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = uyVar;
        this.f36483e = b2Var;
        this.f36481b = tLObject;
        this.f36484f = user;
        this.h = chat;
        this.f36482c = j3;
        this.f36485n = tL_error;
        this.f36486r = tL_messages_checkHistoryImportPeer;
    }

    public fw(zh.w3 w3Var, of.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = w3Var;
        this.f36484f = eVar;
        this.f36483e = b2Var;
        this.f36481b = tLObject;
        this.h = tL_starGiftUnique;
        this.f36485n = tL_error;
        this.f36482c = j3;
        this.f36486r = charSequence;
    }
}
