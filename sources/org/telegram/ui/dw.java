package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Wallet.WalletEngine2;
public final class dw implements Runnable {
    public final int f37136a = 1;
    public final Object f37137b;
    public final long f37138c;
    public final Object d;
    public final Object f37139e;
    public final Object f37140f;
    public final Object h;
    public final Object f37141n;
    public final Object f37142r;

    public dw(TLObject tLObject, Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.ad adVar, org.telegram.messenger.video.d dVar) {
        this.f37137b = tLObject;
        this.d = context;
        this.f37139e = a1Var;
        this.f37138c = j3;
        this.f37140f = bArr;
        this.h = aVar;
        this.f37141n = adVar;
        this.f37142r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f37136a) {
            case 0:
                ty.l0((ty) this.d, (org.telegram.ui.ActionBar.b2) this.f37139e, (TLObject) this.f37137b, (TLRPC.User) this.f37140f, (TLRPC.Chat) this.h, this.f37138c, (TLRPC.TL_error) this.f37141n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f37142r);
                return;
            case 1:
                Context context = (Context) this.d;
                ai.a1 a1Var = (ai.a1) this.f37139e;
                byte[] bArr = (byte[]) this.f37140f;
                org.telegram.ui.Components.ad adVar = (org.telegram.ui.Components.ad) this.f37141n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f37142r;
                c41 c41Var = new c41(context, a1Var, this.f37138c, bArr);
                c41Var.P((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f37137b));
                c41Var.f36562s = new v31((org.telegram.messenger.video.a) this.h, adVar, context, a1Var, dVar);
                c41Var.show();
                return;
            case 2:
                ((WalletEngine2) this.d).lambda$prepareSend$50((byte[]) this.f37139e, (String) this.f37137b, this.f37138c, (byte[]) this.f37140f, (byte[]) this.h, (String) this.f37141n, (Utilities.Callback3) this.f37142r);
                return;
            default:
                yh.s3.D0((yh.s3) this.d, (of.e) this.f37140f, (org.telegram.ui.ActionBar.b2) this.f37139e, (TLObject) this.f37137b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f37141n, this.f37138c, (CharSequence) this.f37142r);
                return;
        }
    }

    public dw(ty tyVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = tyVar;
        this.f37139e = b2Var;
        this.f37137b = tLObject;
        this.f37140f = user;
        this.h = chat;
        this.f37138c = j3;
        this.f37141n = tL_error;
        this.f37142r = tL_messages_checkHistoryImportPeer;
    }

    public dw(WalletEngine2 walletEngine2, byte[] bArr, String str, long j3, byte[] bArr2, byte[] bArr3, String str2, Utilities.Callback3 callback3) {
        this.d = walletEngine2;
        this.f37139e = bArr;
        this.f37137b = str;
        this.f37138c = j3;
        this.f37140f = bArr2;
        this.h = bArr3;
        this.f37141n = str2;
        this.f37142r = callback3;
    }

    public dw(yh.s3 s3Var, of.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = s3Var;
        this.f37140f = eVar;
        this.f37139e = b2Var;
        this.f37137b = tLObject;
        this.h = tL_starGiftUnique;
        this.f37141n = tL_error;
        this.f37138c = j3;
        this.f37142r = charSequence;
    }
}
