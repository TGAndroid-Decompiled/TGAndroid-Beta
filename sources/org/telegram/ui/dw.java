package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Wallet.WalletEngine2;
public final class dw implements Runnable {
    public final int f37092a = 1;
    public final Object f37093b;
    public final long f37094c;
    public final Object d;
    public final Object f37095e;
    public final Object f37096f;
    public final Object h;
    public final Object f37097n;
    public final Object f37098r;

    public dw(TLObject tLObject, Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.ad adVar, org.telegram.messenger.video.d dVar) {
        this.f37093b = tLObject;
        this.d = context;
        this.f37095e = a1Var;
        this.f37094c = j3;
        this.f37096f = bArr;
        this.h = aVar;
        this.f37097n = adVar;
        this.f37098r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f37092a) {
            case 0:
                ty.l0((ty) this.d, (org.telegram.ui.ActionBar.b2) this.f37095e, (TLObject) this.f37093b, (TLRPC.User) this.f37096f, (TLRPC.Chat) this.h, this.f37094c, (TLRPC.TL_error) this.f37097n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f37098r);
                return;
            case 1:
                Context context = (Context) this.d;
                ai.a1 a1Var = (ai.a1) this.f37095e;
                byte[] bArr = (byte[]) this.f37096f;
                org.telegram.ui.Components.ad adVar = (org.telegram.ui.Components.ad) this.f37097n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f37098r;
                c41 c41Var = new c41(context, a1Var, this.f37094c, bArr);
                c41Var.P((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f37093b));
                c41Var.f36518s = new v31((org.telegram.messenger.video.a) this.h, adVar, context, a1Var, dVar);
                c41Var.show();
                return;
            case 2:
                ((WalletEngine2) this.d).lambda$prepareSend$50((byte[]) this.f37095e, (String) this.f37093b, this.f37094c, (byte[]) this.f37096f, (byte[]) this.h, (String) this.f37097n, (Utilities.Callback3) this.f37098r);
                return;
            default:
                yh.s3.D0((yh.s3) this.d, (of.e) this.f37096f, (org.telegram.ui.ActionBar.b2) this.f37095e, (TLObject) this.f37093b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f37097n, this.f37094c, (CharSequence) this.f37098r);
                return;
        }
    }

    public dw(ty tyVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = tyVar;
        this.f37095e = b2Var;
        this.f37093b = tLObject;
        this.f37096f = user;
        this.h = chat;
        this.f37094c = j3;
        this.f37097n = tL_error;
        this.f37098r = tL_messages_checkHistoryImportPeer;
    }

    public dw(WalletEngine2 walletEngine2, byte[] bArr, String str, long j3, byte[] bArr2, byte[] bArr3, String str2, Utilities.Callback3 callback3) {
        this.d = walletEngine2;
        this.f37095e = bArr;
        this.f37093b = str;
        this.f37094c = j3;
        this.f37096f = bArr2;
        this.h = bArr3;
        this.f37097n = str2;
        this.f37098r = callback3;
    }

    public dw(yh.s3 s3Var, of.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = s3Var;
        this.f37096f = eVar;
        this.f37095e = b2Var;
        this.f37093b = tLObject;
        this.h = tL_starGiftUnique;
        this.f37097n = tL_error;
        this.f37094c = j3;
        this.f37098r = charSequence;
    }
}
