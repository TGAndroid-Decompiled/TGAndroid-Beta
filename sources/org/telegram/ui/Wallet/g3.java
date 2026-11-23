package org.telegram.ui.Wallet;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import di.pb;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_wallet;
public final class g3 {
    public final int f44341a;
    public final int f44342b;
    public final boolean f44343c;
    public final int d;
    public final long f44344e;
    public final long f44345f;
    public final long f44346g;
    public final long h;
    public long f44347i;
    public final int f44348j;
    public boolean f44349k;
    public final String f44350l;
    public final int f44351m;

    public g3(int i7, int i10, boolean z10, int i11, long j3, long j10, long j11, long j12, int i12, String str, int i13) {
        this.f44341a = i7;
        this.f44342b = i10;
        this.f44343c = z10;
        this.d = i11;
        this.f44344e = j3;
        this.f44345f = j10;
        this.f44346g = j11;
        this.h = j12;
        this.f44348j = i12;
        this.f44350l = TextUtils.isEmpty(str) ? null : str;
        this.f44351m = i13;
    }

    public static String a(TL_wallet.WalletOnchainGiftAction walletOnchainGiftAction) {
        if (walletOnchainGiftAction instanceof TL_wallet.walletOnchainGiftActionOfferCreate) {
            return ((TL_wallet.walletOnchainGiftActionOfferCreate) walletOnchainGiftAction).counterparty_address;
        }
        if (walletOnchainGiftAction instanceof TL_wallet.walletOnchainGiftActionOfferAccept) {
            return ((TL_wallet.walletOnchainGiftActionOfferAccept) walletOnchainGiftAction).counterparty_address;
        }
        if (walletOnchainGiftAction instanceof TL_wallet.walletOnchainGiftActionOfferCancel) {
            return ((TL_wallet.walletOnchainGiftActionOfferCancel) walletOnchainGiftAction).counterparty_address;
        }
        if (walletOnchainGiftAction instanceof TL_wallet.walletOnchainGiftActionOfferDecline) {
            return ((TL_wallet.walletOnchainGiftActionOfferDecline) walletOnchainGiftAction).counterparty_address;
        }
        if (walletOnchainGiftAction instanceof TL_wallet.walletOnchainGiftActionOfferExpire) {
            return ((TL_wallet.walletOnchainGiftActionOfferExpire) walletOnchainGiftAction).counterparty_address;
        }
        return null;
    }

    public static org.telegram.ui.Wallet.g3 c(org.telegram.tgnet.tl.TL_wallet.walletTransaction r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.g3.c(org.telegram.tgnet.tl.TL_wallet$walletTransaction):org.telegram.ui.Wallet.g3");
    }

    public static g3 d(int i7, TL_wallet.walletTransaction wallettransaction, long j3, long j10, long j11, String str) {
        long j12;
        long j13 = wallettransaction.amount;
        if (j13 != 0) {
            j12 = Math.abs(j13);
        } else {
            j12 = j3;
        }
        return new g3(i7, 2131232847, true, 0, j12, j10, 0L, j11, 0, str, 2131742769);
    }

    public static SpannableStringBuilder f(int i7, long j3) {
        return pb.b1(true, gd.a0(null, null, i7, "⭐️ " + v0.t(j3, false)), 0.7f, null);
    }

    public final CharSequence b() {
        int i7 = this.f44341a;
        long j3 = this.f44344e;
        long j10 = this.f44345f;
        switch (i7) {
            case 0:
                if (j10 == 0) {
                    j10 = Math.abs(j3);
                }
                return f(2131742809, j10);
            case 1:
                if (j3 != 0) {
                    j10 = Math.abs(j3);
                }
                return f(2131742798, j10);
            case 2:
                return f(2131742808, Math.abs(j3));
            case 3:
                if (j10 != 0) {
                    return f(2131742802, j10);
                }
                return gd.N0(2131742803, null);
            case 4:
                return gd.N0(2131742801, null);
            case 5:
                return gd.N0(2131742804, null);
            case 6:
                return gd.N0(2131742807, null);
            case 7:
                return gd.N0(2131742806, null);
            case 8:
                return gd.N0(2131742805, null);
            case 9:
                return f(2131742800, j10);
            default:
                return "";
        }
    }

    public final String e() {
        switch (this.f44341a) {
            case 0:
                return gd.N0(2131742795, null);
            case 1:
                return gd.N0(2131742792, null);
            case 2:
                return gd.N0(2131742797, null);
            case 3:
                return gd.N0(2131742794, null);
            case 4:
                return gd.N0(2131742793, null);
            case 5:
                return gd.N0(2131742804, null);
            case 6:
                return gd.N0(2131742807, null);
            case 7:
                return gd.N0(2131742806, null);
            case 8:
                return gd.N0(2131742805, null);
            case 9:
                return gd.N0(2131742796, null);
            default:
                return "";
        }
    }
}
