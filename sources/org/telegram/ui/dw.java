package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Wallet.WalletEngine2;
public final class dw implements Runnable {
    public final int f37090a = 1;
    public final Object f37091b;
    public final long f37092c;
    public final Object d;
    public final Object f37093e;
    public final Object f37094f;
    public final Object h;
    public final Object f37095n;
    public final Object f37096r;

    public dw(TLObject tLObject, Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.ad adVar, org.telegram.messenger.video.d dVar) {
        this.f37091b = tLObject;
        this.d = context;
        this.f37093e = a1Var;
        this.f37092c = j3;
        this.f37094f = bArr;
        this.h = aVar;
        this.f37095n = adVar;
        this.f37096r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f37090a) {
            case 0:
                ty.l0((ty) this.d, (org.telegram.ui.ActionBar.b2) this.f37093e, (TLObject) this.f37091b, (TLRPC.User) this.f37094f, (TLRPC.Chat) this.h, this.f37092c, (TLRPC.TL_error) this.f37095n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f37096r);
                return;
            case 1:
                Context context = (Context) this.d;
                ai.a1 a1Var = (ai.a1) this.f37093e;
                byte[] bArr = (byte[]) this.f37094f;
                org.telegram.ui.Components.ad adVar = (org.telegram.ui.Components.ad) this.f37095n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f37096r;
                c41 c41Var = new c41(context, a1Var, this.f37092c, bArr);
                c41Var.P((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f37091b));
                c41Var.f36516s = new v31((org.telegram.messenger.video.a) this.h, adVar, context, a1Var, dVar);
                c41Var.show();
                return;
            case 2:
                ((WalletEngine2) this.d).lambda$prepareSend$50((byte[]) this.f37093e, (String) this.f37091b, this.f37092c, (byte[]) this.f37094f, (byte[]) this.h, (String) this.f37095n, (Utilities.Callback3) this.f37096r);
                return;
            default:
                yh.s3.D0((yh.s3) this.d, (of.e) this.f37094f, (org.telegram.ui.ActionBar.b2) this.f37093e, (TLObject) this.f37091b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f37095n, this.f37092c, (CharSequence) this.f37096r);
                return;
        }
    }

    public dw(ty tyVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = tyVar;
        this.f37093e = b2Var;
        this.f37091b = tLObject;
        this.f37094f = user;
        this.h = chat;
        this.f37092c = j3;
        this.f37095n = tL_error;
        this.f37096r = tL_messages_checkHistoryImportPeer;
    }

    public dw(WalletEngine2 walletEngine2, byte[] bArr, String str, long j3, byte[] bArr2, byte[] bArr3, String str2, Utilities.Callback3 callback3) {
        this.d = walletEngine2;
        this.f37093e = bArr;
        this.f37091b = str;
        this.f37092c = j3;
        this.f37094f = bArr2;
        this.h = bArr3;
        this.f37095n = str2;
        this.f37096r = callback3;
    }

    public dw(yh.s3 s3Var, of.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = s3Var;
        this.f37094f = eVar;
        this.f37093e = b2Var;
        this.f37091b = tLObject;
        this.h = tL_starGiftUnique;
        this.f37095n = tL_error;
        this.f37092c = j3;
        this.f37096r = charSequence;
    }
}
