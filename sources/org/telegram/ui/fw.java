package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Wallet.WalletEngine2;
public final class fw implements Runnable {
    public final int f37854a = 1;
    public final Object f37855b;
    public final long f37856c;
    public final Object d;
    public final Object f37857e;
    public final Object f37858f;
    public final Object h;
    public final Object f37859n;
    public final Object f37860r;

    public fw(TLObject tLObject, Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.zc zcVar, org.telegram.messenger.video.d dVar) {
        this.f37855b = tLObject;
        this.d = context;
        this.f37857e = a1Var;
        this.f37856c = j3;
        this.f37858f = bArr;
        this.h = aVar;
        this.f37859n = zcVar;
        this.f37860r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f37854a) {
            case 0:
                vy.l0((vy) this.d, (org.telegram.ui.ActionBar.a2) this.f37857e, (TLObject) this.f37855b, (TLRPC.User) this.f37858f, (TLRPC.Chat) this.h, this.f37856c, (TLRPC.TL_error) this.f37859n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f37860r);
                return;
            case 1:
                Context context = (Context) this.d;
                ai.a1 a1Var = (ai.a1) this.f37857e;
                byte[] bArr = (byte[]) this.f37858f;
                org.telegram.ui.Components.zc zcVar = (org.telegram.ui.Components.zc) this.f37859n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f37860r;
                e41 e41Var = new e41(context, a1Var, this.f37856c, bArr);
                e41Var.P((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f37855b));
                e41Var.f36982s = new x31((org.telegram.messenger.video.a) this.h, zcVar, context, a1Var, dVar);
                e41Var.show();
                return;
            case 2:
                ((WalletEngine2) this.d).lambda$prepareSend$50((byte[]) this.f37857e, (String) this.f37855b, this.f37856c, (byte[]) this.f37858f, (byte[]) this.h, (String) this.f37859n, (Utilities.Callback3) this.f37860r);
                return;
            default:
                yh.s3.D0((yh.s3) this.d, (of.e) this.f37858f, (org.telegram.ui.ActionBar.a2) this.f37857e, (TLObject) this.f37855b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f37859n, this.f37856c, (CharSequence) this.f37860r);
                return;
        }
    }

    public fw(vy vyVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = vyVar;
        this.f37857e = a2Var;
        this.f37855b = tLObject;
        this.f37858f = user;
        this.h = chat;
        this.f37856c = j3;
        this.f37859n = tL_error;
        this.f37860r = tL_messages_checkHistoryImportPeer;
    }

    public fw(WalletEngine2 walletEngine2, byte[] bArr, String str, long j3, byte[] bArr2, byte[] bArr3, String str2, Utilities.Callback3 callback3) {
        this.d = walletEngine2;
        this.f37857e = bArr;
        this.f37855b = str;
        this.f37856c = j3;
        this.f37858f = bArr2;
        this.h = bArr3;
        this.f37859n = str2;
        this.f37860r = callback3;
    }

    public fw(yh.s3 s3Var, of.e eVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = s3Var;
        this.f37858f = eVar;
        this.f37857e = a2Var;
        this.f37855b = tLObject;
        this.h = tL_starGiftUnique;
        this.f37859n = tL_error;
        this.f37856c = j3;
        this.f37860r = charSequence;
    }
}
