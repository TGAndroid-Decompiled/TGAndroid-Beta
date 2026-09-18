package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class fw implements Runnable {
    public final int f33626a = 1;
    public final TLObject f33627b;
    public final long f33628c;
    public final Object d;
    public final Object e;
    public final Object f33629f;
    public final Object h;
    public final Object f33630n;
    public final Object f33631r;

    public fw(TLObject tLObject, Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, org.telegram.messenger.video.d dVar) {
        this.f33627b = tLObject;
        this.d = context;
        this.e = a1Var;
        this.f33628c = j3;
        this.f33629f = bArr;
        this.h = aVar;
        this.f33630n = xcVar;
        this.f33631r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f33626a) {
            case 0:
                uy.n0((uy) this.d, (org.telegram.ui.ActionBar.b2) this.e, this.f33627b, (TLRPC.User) this.f33629f, (TLRPC.Chat) this.h, this.f33628c, (TLRPC.TL_error) this.f33630n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f33631r);
                return;
            case 1:
                Context context = (Context) this.d;
                ai.a1 a1Var = (ai.a1) this.e;
                byte[] bArr = (byte[]) this.f33629f;
                org.telegram.ui.Components.xc xcVar = (org.telegram.ui.Components.xc) this.f33630n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f33631r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f33627b;
                b41 b41Var = new b41(context, a1Var, this.f33628c, bArr);
                b41Var.O(tL_channels_sponsoredMessageReportResultChooseOption);
                b41Var.f32238s = new u31((org.telegram.messenger.video.a) this.h, xcVar, context, a1Var, dVar);
                b41Var.show();
                return;
            default:
                yh.y3.C0((yh.y3) this.d, (nf.e) this.f33629f, (org.telegram.ui.ActionBar.b2) this.e, this.f33627b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f33630n, this.f33628c, (CharSequence) this.f33631r);
                return;
        }
    }

    public fw(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = uyVar;
        this.e = b2Var;
        this.f33627b = tLObject;
        this.f33629f = user;
        this.h = chat;
        this.f33628c = j3;
        this.f33630n = tL_error;
        this.f33631r = tL_messages_checkHistoryImportPeer;
    }

    public fw(yh.y3 y3Var, nf.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = y3Var;
        this.f33629f = eVar;
        this.e = b2Var;
        this.f33627b = tLObject;
        this.h = tL_starGiftUnique;
        this.f33630n = tL_error;
        this.f33628c = j3;
        this.f33631r = charSequence;
    }
}
