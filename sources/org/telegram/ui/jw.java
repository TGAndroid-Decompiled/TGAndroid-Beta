package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Wallet.WalletEngine2;
public final class jw implements Runnable {
    public final int f37442a = 1;
    public final Object f37443b;
    public final long f37444c;
    public final Object d;
    public final Object e;
    public final Object f37445f;
    public final Object h;
    public final Object f37446n;
    public final Object f37447r;

    public jw(TLObject tLObject, Context context, bi.s0 s0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.zc zcVar, org.telegram.messenger.video.d dVar) {
        this.f37443b = tLObject;
        this.d = context;
        this.e = s0Var;
        this.f37444c = j10;
        this.f37445f = bArr;
        this.h = aVar;
        this.f37446n = zcVar;
        this.f37447r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f37442a) {
            case 0:
                yy.l0((yy) this.d, (org.telegram.ui.ActionBar.a2) this.e, (TLObject) this.f37443b, (TLRPC.User) this.f37445f, (TLRPC.Chat) this.h, this.f37444c, (TLRPC.TL_error) this.f37446n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f37447r);
                return;
            case 1:
                Context context = (Context) this.d;
                bi.s0 s0Var = (bi.s0) this.e;
                byte[] bArr = (byte[]) this.f37445f;
                org.telegram.ui.Components.zc zcVar = (org.telegram.ui.Components.zc) this.f37446n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f37447r;
                i41 i41Var = new i41(context, s0Var, this.f37444c, bArr);
                i41Var.P((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f37443b));
                i41Var.f37035s = new b41((org.telegram.messenger.video.a) this.h, zcVar, context, s0Var, dVar);
                i41Var.show();
                return;
            case 2:
                ((WalletEngine2) this.d).lambda$prepareSend$50((byte[]) this.e, (String) this.f37443b, this.f37444c, (byte[]) this.f37445f, (byte[]) this.h, (String) this.f37446n, (Utilities.Callback3) this.f37447r);
                return;
            default:
                zh.r3.D0((zh.r3) this.d, (pf.c) this.f37445f, (org.telegram.ui.ActionBar.a2) this.e, (TLObject) this.f37443b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f37446n, this.f37444c, (CharSequence) this.f37447r);
                return;
        }
    }

    public jw(yy yyVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = yyVar;
        this.e = a2Var;
        this.f37443b = tLObject;
        this.f37445f = user;
        this.h = chat;
        this.f37444c = j10;
        this.f37446n = tL_error;
        this.f37447r = tL_messages_checkHistoryImportPeer;
    }

    public jw(WalletEngine2 walletEngine2, byte[] bArr, String str, long j10, byte[] bArr2, byte[] bArr3, String str2, Utilities.Callback3 callback3) {
        this.d = walletEngine2;
        this.e = bArr;
        this.f37443b = str;
        this.f37444c = j10;
        this.f37445f = bArr2;
        this.h = bArr3;
        this.f37446n = str2;
        this.f37447r = callback3;
    }

    public jw(zh.r3 r3Var, pf.c cVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        this.d = r3Var;
        this.f37445f = cVar;
        this.e = a2Var;
        this.f37443b = tLObject;
        this.h = tL_starGiftUnique;
        this.f37446n = tL_error;
        this.f37444c = j10;
        this.f37447r = charSequence;
    }
}
