package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class gw implements Runnable {
    public final int f34055a = 1;
    public final TLObject f34056b;
    public final long f34057c;
    public final Object d;
    public final Object e;
    public final Object f34058f;
    public final Object h;
    public final Object f34059n;
    public final Object f34060r;

    public gw(TLObject tLObject, Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.vc vcVar, org.telegram.messenger.video.d dVar) {
        this.f34056b = tLObject;
        this.d = context;
        this.e = a1Var;
        this.f34057c = j3;
        this.f34058f = bArr;
        this.h = aVar;
        this.f34059n = vcVar;
        this.f34060r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f34055a) {
            case 0:
                wy.n0((wy) this.d, (org.telegram.ui.ActionBar.c2) this.e, this.f34056b, (TLRPC.User) this.f34058f, (TLRPC.Chat) this.h, this.f34057c, (TLRPC.TL_error) this.f34059n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f34060r);
                return;
            case 1:
                Context context = (Context) this.d;
                ai.a1 a1Var = (ai.a1) this.e;
                byte[] bArr = (byte[]) this.f34058f;
                org.telegram.ui.Components.vc vcVar = (org.telegram.ui.Components.vc) this.f34059n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f34060r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f34056b;
                d41 d41Var = new d41(context, a1Var, this.f34057c, bArr);
                d41Var.O(tL_channels_sponsoredMessageReportResultChooseOption);
                d41Var.f33004s = new w31((org.telegram.messenger.video.a) this.h, vcVar, context, a1Var, dVar);
                d41Var.show();
                return;
            default:
                yh.a4.C0((yh.a4) this.d, (nf.e) this.f34058f, (org.telegram.ui.ActionBar.c2) this.e, this.f34056b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f34059n, this.f34057c, (CharSequence) this.f34060r);
                return;
        }
    }

    public gw(wy wyVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = wyVar;
        this.e = c2Var;
        this.f34056b = tLObject;
        this.f34058f = user;
        this.h = chat;
        this.f34057c = j3;
        this.f34059n = tL_error;
        this.f34060r = tL_messages_checkHistoryImportPeer;
    }

    public gw(yh.a4 a4Var, nf.e eVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = a4Var;
        this.f34058f = eVar;
        this.e = c2Var;
        this.f34056b = tLObject;
        this.h = tL_starGiftUnique;
        this.f34059n = tL_error;
        this.f34057c = j3;
        this.f34060r = charSequence;
    }
}
