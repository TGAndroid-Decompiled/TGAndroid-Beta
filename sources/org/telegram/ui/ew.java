package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ew implements Runnable {
    public final int f33413a = 1;
    public final TLObject f33414b;
    public final long f33415c;
    public final Object d;
    public final Object e;
    public final Object f33416f;
    public final Object h;
    public final Object f33417n;
    public final Object f33418r;

    public ew(TLObject tLObject, Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.vc vcVar, org.telegram.messenger.video.d dVar) {
        this.f33414b = tLObject;
        this.d = context;
        this.e = a1Var;
        this.f33415c = j3;
        this.f33416f = bArr;
        this.h = aVar;
        this.f33417n = vcVar;
        this.f33418r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f33413a) {
            case 0:
                uy.n0((uy) this.d, (org.telegram.ui.ActionBar.b2) this.e, this.f33414b, (TLRPC.User) this.f33416f, (TLRPC.Chat) this.h, this.f33415c, (TLRPC.TL_error) this.f33417n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f33418r);
                return;
            case 1:
                Context context = (Context) this.d;
                ai.a1 a1Var = (ai.a1) this.e;
                byte[] bArr = (byte[]) this.f33416f;
                org.telegram.ui.Components.vc vcVar = (org.telegram.ui.Components.vc) this.f33417n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f33418r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f33414b;
                b41 b41Var = new b41(context, a1Var, this.f33415c, bArr);
                b41Var.O(tL_channels_sponsoredMessageReportResultChooseOption);
                b41Var.f32049s = new u31((org.telegram.messenger.video.a) this.h, vcVar, context, a1Var, dVar);
                b41Var.show();
                return;
            default:
                yh.a4.C0((yh.a4) this.d, (nf.e) this.f33416f, (org.telegram.ui.ActionBar.b2) this.e, this.f33414b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f33417n, this.f33415c, (CharSequence) this.f33418r);
                return;
        }
    }

    public ew(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = uyVar;
        this.e = b2Var;
        this.f33414b = tLObject;
        this.f33416f = user;
        this.h = chat;
        this.f33415c = j3;
        this.f33417n = tL_error;
        this.f33418r = tL_messages_checkHistoryImportPeer;
    }

    public ew(yh.a4 a4Var, nf.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = a4Var;
        this.f33416f = eVar;
        this.e = b2Var;
        this.f33414b = tLObject;
        this.h = tL_starGiftUnique;
        this.f33417n = tL_error;
        this.f33415c = j3;
        this.f33418r = charSequence;
    }
}
