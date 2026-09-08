package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class fw implements Runnable {
    public final int f36506a = 1;
    public final TLObject f36507b;
    public final long f36508c;
    public final Object d;
    public final Object f36509e;
    public final Object f36510f;
    public final Object h;
    public final Object f36511n;
    public final Object f36512r;

    public fw(TLObject tLObject, Context context, bi.s0 s0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.yc ycVar, org.telegram.messenger.video.d dVar) {
        this.f36507b = tLObject;
        this.d = context;
        this.f36509e = s0Var;
        this.f36508c = j3;
        this.f36510f = bArr;
        this.h = aVar;
        this.f36511n = ycVar;
        this.f36512r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f36506a) {
            case 0:
                uy.n0((uy) this.d, (org.telegram.ui.ActionBar.b2) this.f36509e, this.f36507b, (TLRPC.User) this.f36510f, (TLRPC.Chat) this.h, this.f36508c, (TLRPC.TL_error) this.f36511n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f36512r);
                return;
            case 1:
                Context context = (Context) this.d;
                bi.s0 s0Var = (bi.s0) this.f36509e;
                byte[] bArr = (byte[]) this.f36510f;
                org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) this.f36511n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f36512r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f36507b;
                e41 e41Var = new e41(context, s0Var, this.f36508c, bArr);
                e41Var.O(tL_channels_sponsoredMessageReportResultChooseOption);
                e41Var.f35957s = new x31((org.telegram.messenger.video.a) this.h, ycVar, context, s0Var, dVar);
                e41Var.show();
                return;
            default:
                zh.w3.C0((zh.w3) this.d, (of.e) this.f36510f, (org.telegram.ui.ActionBar.b2) this.f36509e, this.f36507b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f36511n, this.f36508c, (CharSequence) this.f36512r);
                return;
        }
    }

    public fw(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = uyVar;
        this.f36509e = b2Var;
        this.f36507b = tLObject;
        this.f36510f = user;
        this.h = chat;
        this.f36508c = j3;
        this.f36511n = tL_error;
        this.f36512r = tL_messages_checkHistoryImportPeer;
    }

    public fw(zh.w3 w3Var, of.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = w3Var;
        this.f36510f = eVar;
        this.f36509e = b2Var;
        this.f36507b = tLObject;
        this.h = tL_starGiftUnique;
        this.f36511n = tL_error;
        this.f36508c = j3;
        this.f36512r = charSequence;
    }
}
