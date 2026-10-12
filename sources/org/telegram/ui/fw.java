package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Wallet.WalletEngine2;
public final class fw implements Runnable {
    public final int f37856a = 1;
    public final Object f37857b;
    public final long f37858c;
    public final Object d;
    public final Object f37859e;
    public final Object f37860f;
    public final Object h;
    public final Object f37861n;
    public final Object f37862r;

    public fw(TLObject tLObject, Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.zc zcVar, org.telegram.messenger.video.d dVar) {
        this.f37857b = tLObject;
        this.d = context;
        this.f37859e = a1Var;
        this.f37858c = j3;
        this.f37860f = bArr;
        this.h = aVar;
        this.f37861n = zcVar;
        this.f37862r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f37856a) {
            case 0:
                vy.l0((vy) this.d, (org.telegram.ui.ActionBar.a2) this.f37859e, (TLObject) this.f37857b, (TLRPC.User) this.f37860f, (TLRPC.Chat) this.h, this.f37858c, (TLRPC.TL_error) this.f37861n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f37862r);
                return;
            case 1:
                Context context = (Context) this.d;
                ai.a1 a1Var = (ai.a1) this.f37859e;
                byte[] bArr = (byte[]) this.f37860f;
                org.telegram.ui.Components.zc zcVar = (org.telegram.ui.Components.zc) this.f37861n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f37862r;
                e41 e41Var = new e41(context, a1Var, this.f37858c, bArr);
                e41Var.P((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f37857b));
                e41Var.f36978s = new x31((org.telegram.messenger.video.a) this.h, zcVar, context, a1Var, dVar);
                e41Var.show();
                return;
            case 2:
                ((WalletEngine2) this.d).lambda$prepareSend$50((byte[]) this.f37859e, (String) this.f37857b, this.f37858c, (byte[]) this.f37860f, (byte[]) this.h, (String) this.f37861n, (Utilities.Callback3) this.f37862r);
                return;
            default:
                yh.s3.D0((yh.s3) this.d, (of.e) this.f37860f, (org.telegram.ui.ActionBar.a2) this.f37859e, (TLObject) this.f37857b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f37861n, this.f37858c, (CharSequence) this.f37862r);
                return;
        }
    }

    public fw(vy vyVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = vyVar;
        this.f37859e = a2Var;
        this.f37857b = tLObject;
        this.f37860f = user;
        this.h = chat;
        this.f37858c = j3;
        this.f37861n = tL_error;
        this.f37862r = tL_messages_checkHistoryImportPeer;
    }

    public fw(WalletEngine2 walletEngine2, byte[] bArr, String str, long j3, byte[] bArr2, byte[] bArr3, String str2, Utilities.Callback3 callback3) {
        this.d = walletEngine2;
        this.f37859e = bArr;
        this.f37857b = str;
        this.f37858c = j3;
        this.f37860f = bArr2;
        this.h = bArr3;
        this.f37861n = str2;
        this.f37862r = callback3;
    }

    public fw(yh.s3 s3Var, of.e eVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = s3Var;
        this.f37860f = eVar;
        this.f37859e = a2Var;
        this.f37857b = tLObject;
        this.h = tL_starGiftUnique;
        this.f37861n = tL_error;
        this.f37858c = j3;
        this.f37862r = charSequence;
    }
}
