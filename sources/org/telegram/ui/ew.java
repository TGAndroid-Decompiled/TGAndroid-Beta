package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ew implements Runnable {
    public final int f36124a = 1;
    public final TLObject f36125b;
    public final long f36126c;
    public final Object d;
    public final Object f36127e;
    public final Object f36128f;
    public final Object h;
    public final Object f36129n;
    public final Object f36130r;

    public ew(TLObject tLObject, Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.yc ycVar, org.telegram.messenger.video.d dVar) {
        this.f36125b = tLObject;
        this.d = context;
        this.f36127e = a1Var;
        this.f36126c = j3;
        this.f36128f = bArr;
        this.h = aVar;
        this.f36129n = ycVar;
        this.f36130r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f36124a) {
            case 0:
                uy.n0((uy) this.d, (org.telegram.ui.ActionBar.b2) this.f36127e, this.f36125b, (TLRPC.User) this.f36128f, (TLRPC.Chat) this.h, this.f36126c, (TLRPC.TL_error) this.f36129n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f36130r);
                return;
            case 1:
                Context context = (Context) this.d;
                ai.a1 a1Var = (ai.a1) this.f36127e;
                byte[] bArr = (byte[]) this.f36128f;
                org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) this.f36129n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f36130r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f36125b;
                t31 t31Var = new t31(context, a1Var, this.f36126c, bArr);
                t31Var.M(tL_channels_sponsoredMessageReportResultChooseOption);
                t31Var.f40706s = new m31((org.telegram.messenger.video.a) this.h, ycVar, context, a1Var, dVar);
                t31Var.show();
                return;
            default:
                yh.y3.C0((yh.y3) this.d, (nf.e) this.f36128f, (org.telegram.ui.ActionBar.b2) this.f36127e, this.f36125b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f36129n, this.f36126c, (CharSequence) this.f36130r);
                return;
        }
    }

    public ew(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = uyVar;
        this.f36127e = b2Var;
        this.f36125b = tLObject;
        this.f36128f = user;
        this.h = chat;
        this.f36126c = j3;
        this.f36129n = tL_error;
        this.f36130r = tL_messages_checkHistoryImportPeer;
    }

    public ew(yh.y3 y3Var, nf.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = y3Var;
        this.f36128f = eVar;
        this.f36127e = b2Var;
        this.f36125b = tLObject;
        this.h = tL_starGiftUnique;
        this.f36129n = tL_error;
        this.f36126c = j3;
        this.f36130r = charSequence;
    }
}
