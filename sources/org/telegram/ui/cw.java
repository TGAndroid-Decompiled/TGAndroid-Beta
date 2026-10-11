package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Wallet.WalletEngine2;
public final class cw implements Runnable {
    public final int f36869a = 1;
    public final Object f36870b;
    public final long f36871c;
    public final Object d;
    public final Object f36872e;
    public final Object f36873f;
    public final Object h;
    public final Object f36874n;
    public final Object f36875r;

    public cw(TLObject tLObject, Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.ad adVar, org.telegram.messenger.video.d dVar) {
        this.f36870b = tLObject;
        this.d = context;
        this.f36872e = a1Var;
        this.f36871c = j3;
        this.f36873f = bArr;
        this.h = aVar;
        this.f36874n = adVar;
        this.f36875r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f36869a) {
            case 0:
                sy.l0((sy) this.d, (org.telegram.ui.ActionBar.a2) this.f36872e, (TLObject) this.f36870b, (TLRPC.User) this.f36873f, (TLRPC.Chat) this.h, this.f36871c, (TLRPC.TL_error) this.f36874n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f36875r);
                return;
            case 1:
                Context context = (Context) this.d;
                ai.a1 a1Var = (ai.a1) this.f36872e;
                byte[] bArr = (byte[]) this.f36873f;
                org.telegram.ui.Components.ad adVar = (org.telegram.ui.Components.ad) this.f36874n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f36875r;
                b41 b41Var = new b41(context, a1Var, this.f36871c, bArr);
                b41Var.P((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f36870b));
                b41Var.f36298s = new u31((org.telegram.messenger.video.a) this.h, adVar, context, a1Var, dVar);
                b41Var.show();
                return;
            case 2:
                ((WalletEngine2) this.d).lambda$prepareSend$50((byte[]) this.f36872e, (String) this.f36870b, this.f36871c, (byte[]) this.f36873f, (byte[]) this.h, (String) this.f36874n, (Utilities.Callback3) this.f36875r);
                return;
            default:
                yh.s3.D0((yh.s3) this.d, (of.e) this.f36873f, (org.telegram.ui.ActionBar.a2) this.f36872e, (TLObject) this.f36870b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f36874n, this.f36871c, (CharSequence) this.f36875r);
                return;
        }
    }

    public cw(sy syVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = syVar;
        this.f36872e = a2Var;
        this.f36870b = tLObject;
        this.f36873f = user;
        this.h = chat;
        this.f36871c = j3;
        this.f36874n = tL_error;
        this.f36875r = tL_messages_checkHistoryImportPeer;
    }

    public cw(WalletEngine2 walletEngine2, byte[] bArr, String str, long j3, byte[] bArr2, byte[] bArr3, String str2, Utilities.Callback3 callback3) {
        this.d = walletEngine2;
        this.f36872e = bArr;
        this.f36870b = str;
        this.f36871c = j3;
        this.f36873f = bArr2;
        this.h = bArr3;
        this.f36874n = str2;
        this.f36875r = callback3;
    }

    public cw(yh.s3 s3Var, of.e eVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = s3Var;
        this.f36873f = eVar;
        this.f36872e = a2Var;
        this.f36870b = tLObject;
        this.h = tL_starGiftUnique;
        this.f36874n = tL_error;
        this.f36871c = j3;
        this.f36875r = charSequence;
    }
}
