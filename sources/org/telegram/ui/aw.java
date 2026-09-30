package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class aw implements Runnable {
    public final int f32243a = 1;
    public final TLObject f32244b;
    public final long f32245c;
    public final Object d;
    public final Object e;
    public final Object f32246f;
    public final Object h;
    public final Object f32247n;
    public final Object f32248r;

    public aw(TLObject tLObject, Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.yc ycVar, org.telegram.messenger.video.d dVar) {
        this.f32244b = tLObject;
        this.d = context;
        this.e = a1Var;
        this.f32245c = j3;
        this.f32246f = bArr;
        this.h = aVar;
        this.f32247n = ycVar;
        this.f32248r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f32243a) {
            case 0:
                qy.n0((qy) this.d, (org.telegram.ui.ActionBar.a2) this.e, this.f32244b, (TLRPC.User) this.f32246f, (TLRPC.Chat) this.h, this.f32245c, (TLRPC.TL_error) this.f32247n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f32248r);
                return;
            case 1:
                Context context = (Context) this.d;
                ai.a1 a1Var = (ai.a1) this.e;
                byte[] bArr = (byte[]) this.f32246f;
                org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) this.f32247n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f32248r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f32244b;
                t31 t31Var = new t31(context, a1Var, this.f32245c, bArr);
                t31Var.O(tL_channels_sponsoredMessageReportResultChooseOption);
                t31Var.f37961s = new m31((org.telegram.messenger.video.a) this.h, ycVar, context, a1Var, dVar);
                t31Var.show();
                return;
            default:
                yh.x3.C0((yh.x3) this.d, (nf.e) this.f32246f, (org.telegram.ui.ActionBar.a2) this.e, this.f32244b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f32247n, this.f32245c, (CharSequence) this.f32248r);
                return;
        }
    }

    public aw(qy qyVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = qyVar;
        this.e = a2Var;
        this.f32244b = tLObject;
        this.f32246f = user;
        this.h = chat;
        this.f32245c = j3;
        this.f32247n = tL_error;
        this.f32248r = tL_messages_checkHistoryImportPeer;
    }

    public aw(yh.x3 x3Var, nf.e eVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = x3Var;
        this.f32246f = eVar;
        this.e = a2Var;
        this.f32244b = tLObject;
        this.h = tL_starGiftUnique;
        this.f32247n = tL_error;
        this.f32245c = j3;
        this.f32248r = charSequence;
    }
}
