package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ew implements Runnable {
    public final int f36097a = 1;
    public final TLObject f36098b;
    public final long f36099c;
    public final Object d;
    public final Object f36100e;
    public final Object f36101f;
    public final Object h;
    public final Object f36102n;
    public final Object f36103r;

    public ew(TLObject tLObject, Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.yc ycVar, org.telegram.messenger.video.d dVar) {
        this.f36098b = tLObject;
        this.d = context;
        this.f36100e = a1Var;
        this.f36099c = j3;
        this.f36101f = bArr;
        this.h = aVar;
        this.f36102n = ycVar;
        this.f36103r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f36097a) {
            case 0:
                uy.n0((uy) this.d, (org.telegram.ui.ActionBar.b2) this.f36100e, this.f36098b, (TLRPC.User) this.f36101f, (TLRPC.Chat) this.h, this.f36099c, (TLRPC.TL_error) this.f36102n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f36103r);
                return;
            case 1:
                Context context = (Context) this.d;
                ai.a1 a1Var = (ai.a1) this.f36100e;
                byte[] bArr = (byte[]) this.f36101f;
                org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) this.f36102n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f36103r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f36098b;
                v31 v31Var = new v31(context, a1Var, this.f36099c, bArr);
                v31Var.M(tL_channels_sponsoredMessageReportResultChooseOption);
                v31Var.f41547s = new o31((org.telegram.messenger.video.a) this.h, ycVar, context, a1Var, dVar);
                v31Var.show();
                return;
            default:
                yh.x3.C0((yh.x3) this.d, (nf.e) this.f36101f, (org.telegram.ui.ActionBar.b2) this.f36100e, this.f36098b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f36102n, this.f36099c, (CharSequence) this.f36103r);
                return;
        }
    }

    public ew(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = uyVar;
        this.f36100e = b2Var;
        this.f36098b = tLObject;
        this.f36101f = user;
        this.h = chat;
        this.f36099c = j3;
        this.f36102n = tL_error;
        this.f36103r = tL_messages_checkHistoryImportPeer;
    }

    public ew(yh.x3 x3Var, nf.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = x3Var;
        this.f36101f = eVar;
        this.f36100e = b2Var;
        this.f36098b = tLObject;
        this.h = tL_starGiftUnique;
        this.f36102n = tL_error;
        this.f36099c = j3;
        this.f36103r = charSequence;
    }
}
