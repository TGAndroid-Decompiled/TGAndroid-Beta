package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ew implements Runnable {
    public final int f33416a = 1;
    public final TLObject f33417b;
    public final long f33418c;
    public final Object d;
    public final Object e;
    public final Object f33419f;
    public final Object h;
    public final Object f33420n;
    public final Object f33421r;

    public ew(TLObject tLObject, Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.vc vcVar, org.telegram.messenger.video.d dVar) {
        this.f33417b = tLObject;
        this.d = context;
        this.e = a1Var;
        this.f33418c = j3;
        this.f33419f = bArr;
        this.h = aVar;
        this.f33420n = vcVar;
        this.f33421r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f33416a) {
            case 0:
                uy.n0((uy) this.d, (org.telegram.ui.ActionBar.b2) this.e, this.f33417b, (TLRPC.User) this.f33419f, (TLRPC.Chat) this.h, this.f33418c, (TLRPC.TL_error) this.f33420n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f33421r);
                return;
            case 1:
                Context context = (Context) this.d;
                ai.a1 a1Var = (ai.a1) this.e;
                byte[] bArr = (byte[]) this.f33419f;
                org.telegram.ui.Components.vc vcVar = (org.telegram.ui.Components.vc) this.f33420n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f33421r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f33417b;
                c41 c41Var = new c41(context, a1Var, this.f33418c, bArr);
                c41Var.O(tL_channels_sponsoredMessageReportResultChooseOption);
                c41Var.f32658s = new v31((org.telegram.messenger.video.a) this.h, vcVar, context, a1Var, dVar);
                c41Var.show();
                return;
            default:
                yh.z3.C0((yh.z3) this.d, (nf.e) this.f33419f, (org.telegram.ui.ActionBar.b2) this.e, this.f33417b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f33420n, this.f33418c, (CharSequence) this.f33421r);
                return;
        }
    }

    public ew(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = uyVar;
        this.e = b2Var;
        this.f33417b = tLObject;
        this.f33419f = user;
        this.h = chat;
        this.f33418c = j3;
        this.f33420n = tL_error;
        this.f33421r = tL_messages_checkHistoryImportPeer;
    }

    public ew(yh.z3 z3Var, nf.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = z3Var;
        this.f33419f = eVar;
        this.e = b2Var;
        this.f33417b = tLObject;
        this.h = tL_starGiftUnique;
        this.f33420n = tL_error;
        this.f33418c = j3;
        this.f33421r = charSequence;
    }
}
