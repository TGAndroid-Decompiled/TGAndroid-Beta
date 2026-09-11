package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class fw implements Runnable {
    public final int f36479a = 1;
    public final TLObject f36480b;
    public final long f36481c;
    public final Object d;
    public final Object f36482e;
    public final Object f36483f;
    public final Object h;
    public final Object f36484n;
    public final Object f36485r;

    public fw(TLObject tLObject, Context context, bi.s0 s0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.yc ycVar, org.telegram.messenger.video.d dVar) {
        this.f36480b = tLObject;
        this.d = context;
        this.f36482e = s0Var;
        this.f36481c = j3;
        this.f36483f = bArr;
        this.h = aVar;
        this.f36484n = ycVar;
        this.f36485r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f36479a) {
            case 0:
                uy.n0((uy) this.d, (org.telegram.ui.ActionBar.b2) this.f36482e, this.f36480b, (TLRPC.User) this.f36483f, (TLRPC.Chat) this.h, this.f36481c, (TLRPC.TL_error) this.f36484n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f36485r);
                return;
            case 1:
                Context context = (Context) this.d;
                bi.s0 s0Var = (bi.s0) this.f36482e;
                byte[] bArr = (byte[]) this.f36483f;
                org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) this.f36484n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f36485r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f36480b;
                e41 e41Var = new e41(context, s0Var, this.f36481c, bArr);
                e41Var.O(tL_channels_sponsoredMessageReportResultChooseOption);
                e41Var.f35930s = new x31((org.telegram.messenger.video.a) this.h, ycVar, context, s0Var, dVar);
                e41Var.show();
                return;
            default:
                zh.w3.C0((zh.w3) this.d, (of.e) this.f36483f, (org.telegram.ui.ActionBar.b2) this.f36482e, this.f36480b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f36484n, this.f36481c, (CharSequence) this.f36485r);
                return;
        }
    }

    public fw(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = uyVar;
        this.f36482e = b2Var;
        this.f36480b = tLObject;
        this.f36483f = user;
        this.h = chat;
        this.f36481c = j3;
        this.f36484n = tL_error;
        this.f36485r = tL_messages_checkHistoryImportPeer;
    }

    public fw(zh.w3 w3Var, of.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = w3Var;
        this.f36483f = eVar;
        this.f36482e = b2Var;
        this.f36480b = tLObject;
        this.h = tL_starGiftUnique;
        this.f36484n = tL_error;
        this.f36481c = j3;
        this.f36485r = charSequence;
    }
}
