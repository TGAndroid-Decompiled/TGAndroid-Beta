package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class fw implements Runnable {
    public final int f33737a = 1;
    public final TLObject f33738b;
    public final long f33739c;
    public final Object d;
    public final Object e;
    public final Object f33740f;
    public final Object h;
    public final Object f33741n;
    public final Object f33742r;

    public fw(TLObject tLObject, Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, org.telegram.messenger.video.d dVar) {
        this.f33738b = tLObject;
        this.d = context;
        this.e = a1Var;
        this.f33739c = j3;
        this.f33740f = bArr;
        this.h = aVar;
        this.f33741n = xcVar;
        this.f33742r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f33737a) {
            case 0:
                uy.n0((uy) this.d, (org.telegram.ui.ActionBar.b2) this.e, this.f33738b, (TLRPC.User) this.f33740f, (TLRPC.Chat) this.h, this.f33739c, (TLRPC.TL_error) this.f33741n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f33742r);
                return;
            case 1:
                Context context = (Context) this.d;
                ai.a1 a1Var = (ai.a1) this.e;
                byte[] bArr = (byte[]) this.f33740f;
                org.telegram.ui.Components.xc xcVar = (org.telegram.ui.Components.xc) this.f33741n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f33742r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f33738b;
                c41 c41Var = new c41(context, a1Var, this.f33739c, bArr);
                c41Var.O(tL_channels_sponsoredMessageReportResultChooseOption);
                c41Var.f32621s = new v31((org.telegram.messenger.video.a) this.h, xcVar, context, a1Var, dVar);
                c41Var.show();
                return;
            default:
                yh.y3.C0((yh.y3) this.d, (nf.e) this.f33740f, (org.telegram.ui.ActionBar.b2) this.e, this.f33738b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f33741n, this.f33739c, (CharSequence) this.f33742r);
                return;
        }
    }

    public fw(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = uyVar;
        this.e = b2Var;
        this.f33738b = tLObject;
        this.f33740f = user;
        this.h = chat;
        this.f33739c = j3;
        this.f33741n = tL_error;
        this.f33742r = tL_messages_checkHistoryImportPeer;
    }

    public fw(yh.y3 y3Var, nf.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = y3Var;
        this.f33740f = eVar;
        this.e = b2Var;
        this.f33738b = tLObject;
        this.h = tL_starGiftUnique;
        this.f33741n = tL_error;
        this.f33739c = j3;
        this.f33742r = charSequence;
    }
}
