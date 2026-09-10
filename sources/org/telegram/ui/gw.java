package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class gw implements Runnable {
    public final int f33198a = 1;
    public final TLObject f33199b;
    public final long f33200c;
    public final Object d;
    public final Object e;
    public final Object f33201f;
    public final Object h;
    public final Object f33202n;
    public final Object f33203r;

    public gw(TLObject tLObject, Context context, org.telegram.ui.Components.bq0 bq0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.wc wcVar, org.telegram.messenger.video.d dVar) {
        this.f33199b = tLObject;
        this.d = context;
        this.e = bq0Var;
        this.f33200c = j3;
        this.f33201f = bArr;
        this.h = aVar;
        this.f33202n = wcVar;
        this.f33203r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f33198a) {
            case 0:
                wy.n0((wy) this.d, (org.telegram.ui.ActionBar.d2) this.e, this.f33199b, (TLRPC.User) this.f33201f, (TLRPC.Chat) this.h, this.f33200c, (TLRPC.TL_error) this.f33202n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f33203r);
                return;
            case 1:
                Context context = (Context) this.d;
                org.telegram.ui.Components.bq0 bq0Var = (org.telegram.ui.Components.bq0) this.e;
                byte[] bArr = (byte[]) this.f33201f;
                org.telegram.ui.Components.wc wcVar = (org.telegram.ui.Components.wc) this.f33202n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f33203r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f33199b;
                h41 h41Var = new h41(context, bq0Var, this.f33200c, bArr);
                h41Var.O(tL_channels_sponsoredMessageReportResultChooseOption);
                h41Var.f33274s = new a41((org.telegram.messenger.video.a) this.h, wcVar, context, bq0Var, dVar);
                h41Var.show();
                return;
            default:
                xh.x3.C0((xh.x3) this.d, (nf.e) this.f33201f, (org.telegram.ui.ActionBar.d2) this.e, this.f33199b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f33202n, this.f33200c, (CharSequence) this.f33203r);
                return;
        }
    }

    public gw(wy wyVar, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = wyVar;
        this.e = d2Var;
        this.f33199b = tLObject;
        this.f33201f = user;
        this.h = chat;
        this.f33200c = j3;
        this.f33202n = tL_error;
        this.f33203r = tL_messages_checkHistoryImportPeer;
    }

    public gw(xh.x3 x3Var, nf.e eVar, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = x3Var;
        this.f33201f = eVar;
        this.e = d2Var;
        this.f33199b = tLObject;
        this.h = tL_starGiftUnique;
        this.f33202n = tL_error;
        this.f33200c = j3;
        this.f33203r = charSequence;
    }
}
