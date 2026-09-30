package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class aw implements Runnable {
    public final int f32315a = 1;
    public final TLObject f32316b;
    public final long f32317c;
    public final Object d;
    public final Object e;
    public final Object f32318f;
    public final Object h;
    public final Object f32319n;
    public final Object f32320r;

    public aw(TLObject tLObject, Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.yc ycVar, org.telegram.messenger.video.d dVar) {
        this.f32316b = tLObject;
        this.d = context;
        this.e = a1Var;
        this.f32317c = j3;
        this.f32318f = bArr;
        this.h = aVar;
        this.f32319n = ycVar;
        this.f32320r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f32315a) {
            case 0:
                qy.n0((qy) this.d, (org.telegram.ui.ActionBar.a2) this.e, this.f32316b, (TLRPC.User) this.f32318f, (TLRPC.Chat) this.h, this.f32317c, (TLRPC.TL_error) this.f32319n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f32320r);
                return;
            case 1:
                Context context = (Context) this.d;
                ai.a1 a1Var = (ai.a1) this.e;
                byte[] bArr = (byte[]) this.f32318f;
                org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) this.f32319n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f32320r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f32316b;
                t31 t31Var = new t31(context, a1Var, this.f32317c, bArr);
                t31Var.O(tL_channels_sponsoredMessageReportResultChooseOption);
                t31Var.f38069s = new m31((org.telegram.messenger.video.a) this.h, ycVar, context, a1Var, dVar);
                t31Var.show();
                return;
            default:
                yh.x3.C0((yh.x3) this.d, (nf.e) this.f32318f, (org.telegram.ui.ActionBar.a2) this.e, this.f32316b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f32319n, this.f32317c, (CharSequence) this.f32320r);
                return;
        }
    }

    public aw(qy qyVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = qyVar;
        this.e = a2Var;
        this.f32316b = tLObject;
        this.f32318f = user;
        this.h = chat;
        this.f32317c = j3;
        this.f32319n = tL_error;
        this.f32320r = tL_messages_checkHistoryImportPeer;
    }

    public aw(yh.x3 x3Var, nf.e eVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = x3Var;
        this.f32318f = eVar;
        this.e = a2Var;
        this.f32316b = tLObject;
        this.h = tL_starGiftUnique;
        this.f32319n = tL_error;
        this.f32317c = j3;
        this.f32320r = charSequence;
    }
}
