package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Wallet.WalletEngine2;
public final class cw implements Runnable {
    public final int f36835a = 1;
    public final Object f36836b;
    public final long f36837c;
    public final Object d;
    public final Object f36838e;
    public final Object f36839f;
    public final Object h;
    public final Object f36840n;
    public final Object f36841r;

    public cw(TLObject tLObject, Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.ad adVar, org.telegram.messenger.video.d dVar) {
        this.f36836b = tLObject;
        this.d = context;
        this.f36838e = a1Var;
        this.f36837c = j3;
        this.f36839f = bArr;
        this.h = aVar;
        this.f36840n = adVar;
        this.f36841r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f36835a) {
            case 0:
                sy.l0((sy) this.d, (org.telegram.ui.ActionBar.a2) this.f36838e, (TLObject) this.f36836b, (TLRPC.User) this.f36839f, (TLRPC.Chat) this.h, this.f36837c, (TLRPC.TL_error) this.f36840n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f36841r);
                return;
            case 1:
                Context context = (Context) this.d;
                ai.a1 a1Var = (ai.a1) this.f36838e;
                byte[] bArr = (byte[]) this.f36839f;
                org.telegram.ui.Components.ad adVar = (org.telegram.ui.Components.ad) this.f36840n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f36841r;
                b41 b41Var = new b41(context, a1Var, this.f36837c, bArr);
                b41Var.P((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f36836b));
                b41Var.f36264s = new u31((org.telegram.messenger.video.a) this.h, adVar, context, a1Var, dVar);
                b41Var.show();
                return;
            case 2:
                ((WalletEngine2) this.d).lambda$prepareSend$50((byte[]) this.f36838e, (String) this.f36836b, this.f36837c, (byte[]) this.f36839f, (byte[]) this.h, (String) this.f36840n, (Utilities.Callback3) this.f36841r);
                return;
            default:
                yh.s3.D0((yh.s3) this.d, (of.e) this.f36839f, (org.telegram.ui.ActionBar.a2) this.f36838e, (TLObject) this.f36836b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f36840n, this.f36837c, (CharSequence) this.f36841r);
                return;
        }
    }

    public cw(sy syVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = syVar;
        this.f36838e = a2Var;
        this.f36836b = tLObject;
        this.f36839f = user;
        this.h = chat;
        this.f36837c = j3;
        this.f36840n = tL_error;
        this.f36841r = tL_messages_checkHistoryImportPeer;
    }

    public cw(WalletEngine2 walletEngine2, byte[] bArr, String str, long j3, byte[] bArr2, byte[] bArr3, String str2, Utilities.Callback3 callback3) {
        this.d = walletEngine2;
        this.f36838e = bArr;
        this.f36836b = str;
        this.f36837c = j3;
        this.f36839f = bArr2;
        this.h = bArr3;
        this.f36840n = str2;
        this.f36841r = callback3;
    }

    public cw(yh.s3 s3Var, of.e eVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = s3Var;
        this.f36839f = eVar;
        this.f36838e = a2Var;
        this.f36836b = tLObject;
        this.h = tL_starGiftUnique;
        this.f36840n = tL_error;
        this.f36837c = j3;
        this.f36841r = charSequence;
    }
}
