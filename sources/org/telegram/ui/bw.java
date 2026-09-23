package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class bw implements Runnable {
    public final int f32184a = 1;
    public final TLObject f32185b;
    public final long f32186c;
    public final Object d;
    public final Object e;
    public final Object f32187f;
    public final Object h;
    public final Object f32188n;
    public final Object f32189r;

    public bw(TLObject tLObject, Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, org.telegram.messenger.video.d dVar) {
        this.f32185b = tLObject;
        this.d = context;
        this.e = a1Var;
        this.f32186c = j3;
        this.f32187f = bArr;
        this.h = aVar;
        this.f32188n = xcVar;
        this.f32189r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f32184a) {
            case 0:
                ry.n0((ry) this.d, (org.telegram.ui.ActionBar.b2) this.e, this.f32185b, (TLRPC.User) this.f32187f, (TLRPC.Chat) this.h, this.f32186c, (TLRPC.TL_error) this.f32188n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f32189r);
                return;
            case 1:
                Context context = (Context) this.d;
                ai.a1 a1Var = (ai.a1) this.e;
                byte[] bArr = (byte[]) this.f32187f;
                org.telegram.ui.Components.xc xcVar = (org.telegram.ui.Components.xc) this.f32188n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f32189r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f32185b;
                u31 u31Var = new u31(context, a1Var, this.f32186c, bArr);
                u31Var.O(tL_channels_sponsoredMessageReportResultChooseOption);
                u31Var.f37897s = new n31((org.telegram.messenger.video.a) this.h, xcVar, context, a1Var, dVar);
                u31Var.show();
                return;
            default:
                yh.y3.C0((yh.y3) this.d, (nf.e) this.f32187f, (org.telegram.ui.ActionBar.b2) this.e, this.f32185b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f32188n, this.f32186c, (CharSequence) this.f32189r);
                return;
        }
    }

    public bw(ry ryVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = ryVar;
        this.e = b2Var;
        this.f32185b = tLObject;
        this.f32187f = user;
        this.h = chat;
        this.f32186c = j3;
        this.f32188n = tL_error;
        this.f32189r = tL_messages_checkHistoryImportPeer;
    }

    public bw(yh.y3 y3Var, nf.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = y3Var;
        this.f32187f = eVar;
        this.e = b2Var;
        this.f32185b = tLObject;
        this.h = tL_starGiftUnique;
        this.f32188n = tL_error;
        this.f32186c = j3;
        this.f32189r = charSequence;
    }
}
