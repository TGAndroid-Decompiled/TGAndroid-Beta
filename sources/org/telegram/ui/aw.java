package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class aw implements Runnable {
    public final int f32240a = 1;
    public final TLObject f32241b;
    public final long f32242c;
    public final Object d;
    public final Object e;
    public final Object f32243f;
    public final Object h;
    public final Object f32244n;
    public final Object f32245r;

    public aw(TLObject tLObject, Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, org.telegram.messenger.video.d dVar) {
        this.f32241b = tLObject;
        this.d = context;
        this.e = a1Var;
        this.f32242c = j3;
        this.f32243f = bArr;
        this.h = aVar;
        this.f32244n = xcVar;
        this.f32245r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f32240a) {
            case 0:
                qy.n0((qy) this.d, (org.telegram.ui.ActionBar.a2) this.e, this.f32241b, (TLRPC.User) this.f32243f, (TLRPC.Chat) this.h, this.f32242c, (TLRPC.TL_error) this.f32244n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f32245r);
                return;
            case 1:
                Context context = (Context) this.d;
                ai.a1 a1Var = (ai.a1) this.e;
                byte[] bArr = (byte[]) this.f32243f;
                org.telegram.ui.Components.xc xcVar = (org.telegram.ui.Components.xc) this.f32244n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f32245r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f32241b;
                t31 t31Var = new t31(context, a1Var, this.f32242c, bArr);
                t31Var.O(tL_channels_sponsoredMessageReportResultChooseOption);
                t31Var.f37961s = new m31((org.telegram.messenger.video.a) this.h, xcVar, context, a1Var, dVar);
                t31Var.show();
                return;
            default:
                yh.x3.C0((yh.x3) this.d, (nf.e) this.f32243f, (org.telegram.ui.ActionBar.a2) this.e, this.f32241b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f32244n, this.f32242c, (CharSequence) this.f32245r);
                return;
        }
    }

    public aw(qy qyVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = qyVar;
        this.e = a2Var;
        this.f32241b = tLObject;
        this.f32243f = user;
        this.h = chat;
        this.f32242c = j3;
        this.f32244n = tL_error;
        this.f32245r = tL_messages_checkHistoryImportPeer;
    }

    public aw(yh.x3 x3Var, nf.e eVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = x3Var;
        this.f32243f = eVar;
        this.e = a2Var;
        this.f32241b = tLObject;
        this.h = tL_starGiftUnique;
        this.f32244n = tL_error;
        this.f32242c = j3;
        this.f32245r = charSequence;
    }
}
