package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class fw implements Runnable {
    public final int f33765a = 1;
    public final TLObject f33766b;
    public final long f33767c;
    public final Object d;
    public final Object e;
    public final Object f33768f;
    public final Object h;
    public final Object f33769n;
    public final Object f33770r;

    public fw(TLObject tLObject, Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, org.telegram.messenger.video.d dVar) {
        this.f33766b = tLObject;
        this.d = context;
        this.e = a1Var;
        this.f33767c = j3;
        this.f33768f = bArr;
        this.h = aVar;
        this.f33769n = xcVar;
        this.f33770r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f33765a) {
            case 0:
                uy.n0((uy) this.d, (org.telegram.ui.ActionBar.b2) this.e, this.f33766b, (TLRPC.User) this.f33768f, (TLRPC.Chat) this.h, this.f33767c, (TLRPC.TL_error) this.f33769n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f33770r);
                return;
            case 1:
                Context context = (Context) this.d;
                ai.a1 a1Var = (ai.a1) this.e;
                byte[] bArr = (byte[]) this.f33768f;
                org.telegram.ui.Components.xc xcVar = (org.telegram.ui.Components.xc) this.f33769n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f33770r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f33766b;
                c41 c41Var = new c41(context, a1Var, this.f33767c, bArr);
                c41Var.O(tL_channels_sponsoredMessageReportResultChooseOption);
                c41Var.f32641s = new v31((org.telegram.messenger.video.a) this.h, xcVar, context, a1Var, dVar);
                c41Var.show();
                return;
            default:
                yh.y3.C0((yh.y3) this.d, (nf.e) this.f33768f, (org.telegram.ui.ActionBar.b2) this.e, this.f33766b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f33769n, this.f33767c, (CharSequence) this.f33770r);
                return;
        }
    }

    public fw(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = uyVar;
        this.e = b2Var;
        this.f33766b = tLObject;
        this.f33768f = user;
        this.h = chat;
        this.f33767c = j3;
        this.f33769n = tL_error;
        this.f33770r = tL_messages_checkHistoryImportPeer;
    }

    public fw(yh.y3 y3Var, nf.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = y3Var;
        this.f33768f = eVar;
        this.e = b2Var;
        this.f33766b = tLObject;
        this.h = tL_starGiftUnique;
        this.f33769n = tL_error;
        this.f33767c = j3;
        this.f33770r = charSequence;
    }
}
