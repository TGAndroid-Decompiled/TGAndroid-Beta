package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class aw implements Runnable {
    public final int f32241a = 1;
    public final TLObject f32242b;
    public final long f32243c;
    public final Object d;
    public final Object e;
    public final Object f32244f;
    public final Object h;
    public final Object f32245n;
    public final Object f32246r;

    public aw(TLObject tLObject, Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, org.telegram.messenger.video.d dVar) {
        this.f32242b = tLObject;
        this.d = context;
        this.e = a1Var;
        this.f32243c = j3;
        this.f32244f = bArr;
        this.h = aVar;
        this.f32245n = xcVar;
        this.f32246r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f32241a) {
            case 0:
                qy.n0((qy) this.d, (org.telegram.ui.ActionBar.a2) this.e, this.f32242b, (TLRPC.User) this.f32244f, (TLRPC.Chat) this.h, this.f32243c, (TLRPC.TL_error) this.f32245n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f32246r);
                return;
            case 1:
                Context context = (Context) this.d;
                ai.a1 a1Var = (ai.a1) this.e;
                byte[] bArr = (byte[]) this.f32244f;
                org.telegram.ui.Components.xc xcVar = (org.telegram.ui.Components.xc) this.f32245n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f32246r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f32242b;
                t31 t31Var = new t31(context, a1Var, this.f32243c, bArr);
                t31Var.O(tL_channels_sponsoredMessageReportResultChooseOption);
                t31Var.f37962s = new m31((org.telegram.messenger.video.a) this.h, xcVar, context, a1Var, dVar);
                t31Var.show();
                return;
            default:
                yh.x3.C0((yh.x3) this.d, (nf.e) this.f32244f, (org.telegram.ui.ActionBar.a2) this.e, this.f32242b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f32245n, this.f32243c, (CharSequence) this.f32246r);
                return;
        }
    }

    public aw(qy qyVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = qyVar;
        this.e = a2Var;
        this.f32242b = tLObject;
        this.f32244f = user;
        this.h = chat;
        this.f32243c = j3;
        this.f32245n = tL_error;
        this.f32246r = tL_messages_checkHistoryImportPeer;
    }

    public aw(yh.x3 x3Var, nf.e eVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = x3Var;
        this.f32244f = eVar;
        this.e = a2Var;
        this.f32242b = tLObject;
        this.h = tL_starGiftUnique;
        this.f32245n = tL_error;
        this.f32243c = j3;
        this.f32246r = charSequence;
    }
}
