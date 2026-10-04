package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ew implements Runnable {
    public final int f36098a = 1;
    public final TLObject f36099b;
    public final long f36100c;
    public final Object d;
    public final Object f36101e;
    public final Object f36102f;
    public final Object h;
    public final Object f36103n;
    public final Object f36104r;

    public ew(TLObject tLObject, Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.yc ycVar, org.telegram.messenger.video.d dVar) {
        this.f36099b = tLObject;
        this.d = context;
        this.f36101e = a1Var;
        this.f36100c = j3;
        this.f36102f = bArr;
        this.h = aVar;
        this.f36103n = ycVar;
        this.f36104r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f36098a) {
            case 0:
                uy.n0((uy) this.d, (org.telegram.ui.ActionBar.b2) this.f36101e, this.f36099b, (TLRPC.User) this.f36102f, (TLRPC.Chat) this.h, this.f36100c, (TLRPC.TL_error) this.f36103n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f36104r);
                return;
            case 1:
                Context context = (Context) this.d;
                ai.a1 a1Var = (ai.a1) this.f36101e;
                byte[] bArr = (byte[]) this.f36102f;
                org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) this.f36103n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f36104r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f36099b;
                v31 v31Var = new v31(context, a1Var, this.f36100c, bArr);
                v31Var.M(tL_channels_sponsoredMessageReportResultChooseOption);
                v31Var.f41548s = new o31((org.telegram.messenger.video.a) this.h, ycVar, context, a1Var, dVar);
                v31Var.show();
                return;
            default:
                yh.x3.C0((yh.x3) this.d, (nf.e) this.f36102f, (org.telegram.ui.ActionBar.b2) this.f36101e, this.f36099b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f36103n, this.f36100c, (CharSequence) this.f36104r);
                return;
        }
    }

    public ew(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = uyVar;
        this.f36101e = b2Var;
        this.f36099b = tLObject;
        this.f36102f = user;
        this.h = chat;
        this.f36100c = j3;
        this.f36103n = tL_error;
        this.f36104r = tL_messages_checkHistoryImportPeer;
    }

    public ew(yh.x3 x3Var, nf.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = x3Var;
        this.f36102f = eVar;
        this.f36101e = b2Var;
        this.f36099b = tLObject;
        this.h = tL_starGiftUnique;
        this.f36103n = tL_error;
        this.f36100c = j3;
        this.f36104r = charSequence;
    }
}
