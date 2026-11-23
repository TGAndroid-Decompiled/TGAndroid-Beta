package org.telegram.ui.Wallet;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import di.pb;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_wallet;
public final class f3 {
    public final int f44210a;
    public final int f44211b;
    public final boolean f44212c;
    public final int d;
    public final long f44213e;
    public final long f44214f;
    public final long f44215g;
    public final long h;
    public long f44216i;
    public final int f44217j;
    public boolean f44218k;
    public final String f44219l;
    public final int f44220m;

    public f3(int i7, int i10, boolean z10, int i11, long j3, long j10, long j11, long j12, int i12, String str, int i13) {
        this.f44210a = i7;
        this.f44211b = i10;
        this.f44212c = z10;
        this.d = i11;
        this.f44213e = j3;
        this.f44214f = j10;
        this.f44215g = j11;
        this.h = j12;
        this.f44217j = i12;
        this.f44219l = TextUtils.isEmpty(str) ? null : str;
        this.f44220m = i13;
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

    public static org.telegram.ui.Wallet.f3 c(org.telegram.tgnet.tl.TL_wallet.walletTransaction r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.f3.c(org.telegram.tgnet.tl.TL_wallet$walletTransaction):org.telegram.ui.Wallet.f3");
    }

    public static f3 d(int i7, TL_wallet.walletTransaction wallettransaction, long j3, long j10, long j11, String str) {
        long j12;
        long j13 = wallettransaction.amount;
        if (j13 != 0) {
            j12 = Math.abs(j13);
        } else {
            j12 = j3;
        }
        return new f3(i7, 2131232844, true, 0, j12, j10, 0L, j11, 0, str, 2131742774);
    }

    public static SpannableStringBuilder f(int i7, long j3) {
        return pb.b1(true, hd.a0(null, null, i7, "⭐️ " + u0.t(j3, false)), 0.7f, null);
    }

    public final CharSequence b() {
        int i7 = this.f44210a;
        long j3 = this.f44213e;
        long j10 = this.f44214f;
        switch (i7) {
            case 0:
                if (j10 == 0) {
                    j10 = Math.abs(j3);
                }
                return f(2131742814, j10);
            case 1:
                if (j3 != 0) {
                    j10 = Math.abs(j3);
                }
                return f(2131742803, j10);
            case 2:
                return f(2131742813, Math.abs(j3));
            case 3:
                if (j10 != 0) {
                    return f(2131742807, j10);
                }
                return hd.N0(2131742808, null);
            case 4:
                return hd.N0(2131742806, null);
            case 5:
                return hd.N0(2131742809, null);
            case 6:
                return hd.N0(2131742812, null);
            case 7:
                return hd.N0(2131742811, null);
            case 8:
                return hd.N0(2131742810, null);
            case 9:
                return f(2131742805, j10);
            default:
                return "";
        }
    }

    public final String e() {
        switch (this.f44210a) {
            case 0:
                return hd.N0(2131742800, null);
            case 1:
                return hd.N0(2131742797, null);
            case 2:
                return hd.N0(2131742802, null);
            case 3:
                return hd.N0(2131742799, null);
            case 4:
                return hd.N0(2131742798, null);
            case 5:
                return hd.N0(2131742809, null);
            case 6:
                return hd.N0(2131742812, null);
            case 7:
                return hd.N0(2131742811, null);
            case 8:
                return hd.N0(2131742810, null);
            case 9:
                return hd.N0(2131742801, null);
            default:
                return "";
        }
    }
}
