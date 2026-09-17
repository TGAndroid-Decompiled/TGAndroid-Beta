package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class gw implements Runnable {
    public final int f34051a = 1;
    public final TLObject f34052b;
    public final long f34053c;
    public final Object d;
    public final Object e;
    public final Object f34054f;
    public final Object h;
    public final Object f34055n;
    public final Object f34056r;

    public gw(TLObject tLObject, Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.vc vcVar, org.telegram.messenger.video.d dVar) {
        this.f34052b = tLObject;
        this.d = context;
        this.e = a1Var;
        this.f34053c = j3;
        this.f34054f = bArr;
        this.h = aVar;
        this.f34055n = vcVar;
        this.f34056r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f34051a) {
            case 0:
                wy.n0((wy) this.d, (org.telegram.ui.ActionBar.c2) this.e, this.f34052b, (TLRPC.User) this.f34054f, (TLRPC.Chat) this.h, this.f34053c, (TLRPC.TL_error) this.f34055n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f34056r);
                return;
            case 1:
                Context context = (Context) this.d;
                ai.a1 a1Var = (ai.a1) this.e;
                byte[] bArr = (byte[]) this.f34054f;
                org.telegram.ui.Components.vc vcVar = (org.telegram.ui.Components.vc) this.f34055n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f34056r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f34052b;
                d41 d41Var = new d41(context, a1Var, this.f34053c, bArr);
                d41Var.O(tL_channels_sponsoredMessageReportResultChooseOption);
                d41Var.f33000s = new w31((org.telegram.messenger.video.a) this.h, vcVar, context, a1Var, dVar);
                d41Var.show();
                return;
            default:
                yh.a4.C0((yh.a4) this.d, (nf.e) this.f34054f, (org.telegram.ui.ActionBar.c2) this.e, this.f34052b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f34055n, this.f34053c, (CharSequence) this.f34056r);
                return;
        }
    }

    public gw(wy wyVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = wyVar;
        this.e = c2Var;
        this.f34052b = tLObject;
        this.f34054f = user;
        this.h = chat;
        this.f34053c = j3;
        this.f34055n = tL_error;
        this.f34056r = tL_messages_checkHistoryImportPeer;
    }

    public gw(yh.a4 a4Var, nf.e eVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = a4Var;
        this.f34054f = eVar;
        this.e = c2Var;
        this.f34052b = tLObject;
        this.h = tL_starGiftUnique;
        this.f34055n = tL_error;
        this.f34053c = j3;
        this.f34056r = charSequence;
    }
}
