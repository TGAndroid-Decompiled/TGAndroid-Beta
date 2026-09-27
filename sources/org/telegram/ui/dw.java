package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class dw implements Runnable {
    public final int f33047a = 1;
    public final TLObject f33048b;
    public final long f33049c;
    public final Object d;
    public final Object e;
    public final Object f33050f;
    public final Object h;
    public final Object f33051n;
    public final Object f33052r;

    public dw(TLObject tLObject, Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, org.telegram.messenger.video.d dVar) {
        this.f33048b = tLObject;
        this.d = context;
        this.e = a1Var;
        this.f33049c = j3;
        this.f33050f = bArr;
        this.h = aVar;
        this.f33051n = xcVar;
        this.f33052r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f33047a) {
            case 0:
                ty.n0((ty) this.d, (org.telegram.ui.ActionBar.c2) this.e, this.f33048b, (TLRPC.User) this.f33050f, (TLRPC.Chat) this.h, this.f33049c, (TLRPC.TL_error) this.f33051n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f33052r);
                return;
            case 1:
                Context context = (Context) this.d;
                ai.a1 a1Var = (ai.a1) this.e;
                byte[] bArr = (byte[]) this.f33050f;
                org.telegram.ui.Components.xc xcVar = (org.telegram.ui.Components.xc) this.f33051n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f33052r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f33048b;
                v31 v31Var = new v31(context, a1Var, this.f33049c, bArr);
                v31Var.O(tL_channels_sponsoredMessageReportResultChooseOption);
                v31Var.f38441s = new o31((org.telegram.messenger.video.a) this.h, xcVar, context, a1Var, dVar);
                v31Var.show();
                return;
            default:
                yh.x3.C0((yh.x3) this.d, (nf.e) this.f33050f, (org.telegram.ui.ActionBar.c2) this.e, this.f33048b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f33051n, this.f33049c, (CharSequence) this.f33052r);
                return;
        }
    }

    public dw(ty tyVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = tyVar;
        this.e = c2Var;
        this.f33048b = tLObject;
        this.f33050f = user;
        this.h = chat;
        this.f33049c = j3;
        this.f33051n = tL_error;
        this.f33052r = tL_messages_checkHistoryImportPeer;
    }

    public dw(yh.x3 x3Var, nf.e eVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = x3Var;
        this.f33050f = eVar;
        this.e = c2Var;
        this.f33048b = tLObject;
        this.h = tL_starGiftUnique;
        this.f33051n = tL_error;
        this.f33049c = j3;
        this.f33052r = charSequence;
    }
}
