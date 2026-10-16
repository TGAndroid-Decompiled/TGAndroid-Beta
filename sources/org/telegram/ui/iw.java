package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Wallet.WalletEngine2;
public final class iw implements Runnable {
    public final int f36875a = 1;
    public final Object f36876b;
    public final long f36877c;
    public final Object d;
    public final Object e;
    public final Object f36878f;
    public final Object h;
    public final Object f36879n;
    public final Object f36880r;

    public iw(TLObject tLObject, Context context, bi.s0 s0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.zc zcVar, org.telegram.messenger.video.d dVar) {
        this.f36876b = tLObject;
        this.d = context;
        this.e = s0Var;
        this.f36877c = j10;
        this.f36878f = bArr;
        this.h = aVar;
        this.f36879n = zcVar;
        this.f36880r = dVar;
    }

    @Override
    public final void run() {
        switch (this.f36875a) {
            case 0:
                yy.m0((yy) this.d, (org.telegram.ui.ActionBar.a2) this.e, (TLObject) this.f36876b, (TLRPC.User) this.f36878f, (TLRPC.Chat) this.h, this.f36877c, (TLRPC.TL_error) this.f36879n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f36880r);
                return;
            case 1:
                Context context = (Context) this.d;
                bi.s0 s0Var = (bi.s0) this.e;
                byte[] bArr = (byte[]) this.f36878f;
                org.telegram.ui.Components.zc zcVar = (org.telegram.ui.Components.zc) this.f36879n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f36880r;
                i41 i41Var = new i41(context, s0Var, this.f36877c, bArr);
                i41Var.P((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f36876b));
                i41Var.f36723s = new b41((org.telegram.messenger.video.a) this.h, zcVar, context, s0Var, dVar);
                i41Var.show();
                return;
            case 2:
                ((WalletEngine2) this.d).lambda$prepareSend$50((byte[]) this.e, (String) this.f36876b, this.f36877c, (byte[]) this.f36878f, (byte[]) this.h, (String) this.f36879n, (Utilities.Callback3) this.f36880r);
                return;
            default:
                zh.r3.D0((zh.r3) this.d, (pf.c) this.f36878f, (org.telegram.ui.ActionBar.a2) this.e, (TLObject) this.f36876b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.f36879n, this.f36877c, (CharSequence) this.f36880r);
                return;
        }
    }

    public iw(yy yyVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = yyVar;
        this.e = a2Var;
        this.f36876b = tLObject;
        this.f36878f = user;
        this.h = chat;
        this.f36877c = j10;
        this.f36879n = tL_error;
        this.f36880r = tL_messages_checkHistoryImportPeer;
    }

    public iw(WalletEngine2 walletEngine2, byte[] bArr, String str, long j10, byte[] bArr2, byte[] bArr3, String str2, Utilities.Callback3 callback3) {
        this.d = walletEngine2;
        this.e = bArr;
        this.f36876b = str;
        this.f36877c = j10;
        this.f36878f = bArr2;
        this.h = bArr3;
        this.f36879n = str2;
        this.f36880r = callback3;
    }

    public iw(zh.r3 r3Var, pf.c cVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        this.d = r3Var;
        this.f36878f = cVar;
        this.e = a2Var;
        this.f36876b = tLObject;
        this.h = tL_starGiftUnique;
        this.f36879n = tL_error;
        this.f36877c = j10;
        this.f36880r = charSequence;
    }
}
