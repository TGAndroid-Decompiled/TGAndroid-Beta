package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fj;
import org.telegram.messenger.i10;
import org.telegram.messenger.p10;
import org.telegram.messenger.w10;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
public final class n implements Runnable {
    public final w10 E;
    public final l2 F;
    public final int f44676a;
    public final v0 f44677b;
    public final String f44678c;
    public final w10 d;
    public final TL_wallet.nftItem f44679e;
    public final String f44680f;
    public final String h;
    public final byte[] f44681n;
    public final long f44682r;
    public final q0 f44683s;
    public final l2 f44684w;
    public final TLRPC.User f44685x;
    public final String f44686y;

    public n(v0 v0Var, String str, w10 w10Var, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j3, q0 q0Var, l2 l2Var, TLRPC.User user, String str4, w10 w10Var2, l2 l2Var2, int i7) {
        this.f44676a = i7;
        this.f44677b = v0Var;
        this.f44678c = str;
        this.d = w10Var;
        this.f44679e = nftitem;
        this.f44680f = str2;
        this.h = str3;
        this.f44681n = bArr;
        this.f44682r = j3;
        this.f44683s = q0Var;
        this.f44684w = l2Var;
        this.f44685x = user;
        this.f44686y = str4;
        this.E = w10Var2;
        this.F = l2Var2;
    }

    @Override
    public final void run() {
        switch (this.f44676a) {
            case 0:
                v0 v0Var = this.f44677b;
                String str = this.f44678c;
                w10 w10Var = this.d;
                n nVar = new n(v0Var, str, w10Var, this.f44679e, this.f44680f, this.h, this.f44681n, this.f44682r, this.f44683s, this.f44684w, this.f44685x, this.f44686y, this.E, this.F, 1);
                if (v0Var.S() && !v0Var.R()) {
                    v0.P("send " + str + ": asking passcode");
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                    if (T == 0) {
                        w10Var.a("PASSCODE_FAILED");
                        return;
                    }
                    ?? obj = new Object();
                    obj.f28948a = true;
                    boolean[] zArr = {false};
                    g0 g0Var = new g0(zArr, w10Var);
                    g0Var.W = new r(1, zArr, nVar);
                    T.showAsSheet(g0Var, obj);
                    return;
                }
                nVar.run();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("send ");
                final String str2 = this.f44678c;
                sb2.append(str2);
                sb2.append(": ready, get secret phrase");
                v0.P(sb2.toString());
                final v0 v0Var2 = this.f44677b;
                final w10 w10Var2 = this.d;
                final TL_wallet.nftItem nftitem = this.f44679e;
                final String str3 = this.f44680f;
                final String str4 = this.h;
                final byte[] bArr = this.f44681n;
                final long j3 = this.f44682r;
                final q0 q0Var = this.f44683s;
                final l2 l2Var = this.f44684w;
                final TLRPC.User user = this.f44685x;
                final String str5 = this.f44686y;
                final w10 w10Var3 = this.E;
                final l2 l2Var2 = this.F;
                v0Var2.F(false, true, true, new p10() {
                    @Override
                    public final void a(Object obj2, Object obj3) {
                        boolean z10;
                        v0 v0Var3;
                        TL_wallet.nftItem nftitem2;
                        boolean z11;
                        TLRPC.User user2;
                        long j10;
                        long j11;
                        fj fjVar;
                        int e12;
                        l2 l2Var3;
                        TL_wallet.nftItem nftitem3;
                        long j12;
                        s0 s0Var = (s0) obj2;
                        String str6 = (String) obj3;
                        v0 v0Var4 = v0.this;
                        int i7 = v0Var4.f45255a;
                        w10 w10Var4 = w10Var2;
                        if (str6 != null) {
                            w10Var4.a(str6);
                        } else if (s0Var == null) {
                            w10Var4.a("NULL_ERROR");
                        } else if (v0Var4.f45256b == null) {
                            w10Var4.a("NULL_ENGINE");
                        } else {
                            TL_wallet.nftItem nftitem4 = nftitem;
                            if (nftitem4 != null) {
                                if (!v0.c(str3, v0Var4.y())) {
                                    w10Var4.a("WALLET_CHANGED");
                                    return;
                                }
                            }
                            u0 H = v0Var4.H();
                            TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                            wallettransaction.incoming = false;
                            wallettransaction.pending = true;
                            String str7 = str4;
                            wallettransaction.comment = str7;
                            wallettransaction.comment_encrypted = false;
                            byte[] bArr2 = bArr;
                            if (nftitem4 == null && bArr2 != null && !TextUtils.isEmpty(str7)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            wallettransaction.comment_encrypted_preparing = z10;
                            wallettransaction.date = ConnectionsManager.getInstance(i7).getCurrentTime();
                            long j13 = j3;
                            wallettransaction.amount = j13;
                            wallettransaction.nft = nftitem4;
                            q0 q0Var2 = q0Var;
                            l2 l2Var4 = l2Var;
                            TLRPC.User user3 = user;
                            String str8 = str2;
                            if (q0Var2 != null && q0Var2.h != null) {
                                TL_wallet.walletTransactionPeerOnchainGift wallettransactionpeeronchaingift = new TL_wallet.walletTransactionPeerOnchainGift();
                                TL_wallet.WalletOnchainGiftAction walletOnchainGiftAction = q0Var2.h;
                                wallettransactionpeeronchaingift.action = walletOnchainGiftAction;
                                wallettransactionpeeronchaingift.address = g3.a(walletOnchainGiftAction);
                                wallettransaction.peer = wallettransactionpeeronchaingift;
                                TL_stars.StarGift starGift = q0Var2.f44909i;
                                if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                                    v0Var3 = v0Var4;
                                    nftitem2 = nftitem4;
                                    nftitem3 = null;
                                } else {
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                    ArrayList arrayList = v0Var4.B().f44630b;
                                    v0Var3 = v0Var4;
                                    int size = arrayList.size();
                                    nftitem2 = nftitem4;
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 < size) {
                                            Object obj4 = arrayList.get(i10);
                                            int i11 = i10 + 1;
                                            int i12 = size;
                                            TL_wallet.nftItem nftitem5 = (TL_wallet.nftItem) obj4;
                                            if ((nftitem5.gift instanceof TL_stars.TL_starGiftUnique) && v0.c(nftitem5.address, tL_starGiftUnique.gift_address)) {
                                                nftitem3 = nftitem5;
                                                break;
                                            } else {
                                                size = i12;
                                                i10 = i11;
                                            }
                                        } else {
                                            nftitem3 = new TL_wallet.nftItem();
                                            String str9 = tL_starGiftUnique.gift_address;
                                            if (str9 == null) {
                                                str9 = "";
                                            }
                                            nftitem3.address = str9;
                                            nftitem3.owner_address = "";
                                            nftitem3.index = "";
                                            nftitem3.name = tL_starGiftUnique.title + " #" + tL_starGiftUnique.num;
                                            nftitem3.gift = tL_starGiftUnique;
                                        }
                                    }
                                }
                                wallettransaction.nft = nftitem3;
                                TL_wallet.WalletOnchainGiftAction walletOnchainGiftAction2 = wallettransactionpeeronchaingift.action;
                                if (!(walletOnchainGiftAction2 instanceof TL_wallet.walletOnchainGiftActionOfferAccept) && !(walletOnchainGiftAction2 instanceof TL_wallet.walletOnchainGiftActionOfferCancel)) {
                                    j12 = -Math.abs(j13);
                                } else {
                                    j12 = 0;
                                }
                                wallettransaction.amount = j12;
                            } else {
                                v0Var3 = v0Var4;
                                nftitem2 = nftitem4;
                                if (l2Var4 != null && nftitem2 != null) {
                                    TL_wallet.walletTransactionPeerTelegramGift wallettransactionpeertelegramgift = new TL_wallet.walletTransactionPeerTelegramGift();
                                    if (user3 != null && user3.f28641id == i10.i(i7).e()) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    wallettransactionpeertelegramgift.own_profile = z11;
                                    wallettransaction.peer = wallettransactionpeertelegramgift;
                                } else {
                                    wallettransaction.peer = v0.i(user3, str8, str5);
                                }
                            }
                            v0 v0Var5 = v0Var3;
                            TL_wallet.nftItem nftitem6 = nftitem2;
                            w7 w7Var = new w7(v0Var5, wallettransaction, nftitem6, H, 4);
                            long nextLong = Utilities.f22875b.nextLong();
                            wallettransaction.random_id = nextLong;
                            v0Var5.f45268p.add(0, wallettransaction);
                            if (nftitem6 != null) {
                                m0 B = v0Var5.B();
                                B.f44631c.add(wallettransaction);
                                B.j();
                                B.h();
                            }
                            H.k();
                            H.i();
                            v0Var5.a0();
                            zy C = zy.C(i7);
                            if (user3 != null && user3.f28641id != i10.i(i7).e() && nftitem6 == null) {
                                user2 = user3;
                                j10 = nextLong;
                                j11 = j13;
                                fjVar = C.q(user2, str8, j11, wallettransaction.comment, wallettransaction.comment_encrypted, wallettransaction.comment_encrypted_preparing, j10);
                            } else {
                                user2 = user3;
                                j10 = nextLong;
                                j11 = j13;
                                fjVar = null;
                            }
                            if (fjVar == null) {
                                e12 = 0;
                            } else {
                                e12 = fjVar.e1();
                            }
                            wallettransaction.localMessageId = e12;
                            w10 w10Var5 = w10Var3;
                            if (w10Var5 != null) {
                                w10Var5.a(wallettransaction);
                            }
                            String str10 = null;
                            w10Var4.a(null);
                            TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = v0Var5.f45259f;
                            if (tL_updateWalletGaslessInfo != null && !TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address)) {
                                TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo2 = v0Var5.f45259f;
                                if (tL_updateWalletGaslessInfo2.available) {
                                    str10 = tL_updateWalletGaslessInfo2.relayer_address;
                                }
                            }
                            v0.P("prepare sending");
                            long j14 = j10;
                            final b0 b0Var = new b0(v0Var5, w7Var, C, fjVar, wallettransaction, str8, H, j14, user2);
                            if (l2Var4 != null && (l2Var3 = l2Var2) != null) {
                                v0Var5.f45256b.prepareTonConnectTransferPair(s0Var, l2Var4, l2Var3, a8.p0.o(j14, "prepared:"), new p10() {
                                    @Override
                                    public final void a(Object obj5, Object obj6) {
                                        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj5;
                                        String str11 = (String) obj6;
                                        switch (r2) {
                                            case 0:
                                                b0Var.a(sendtransfer, null, str11);
                                                return;
                                            case 1:
                                                b0Var.a(sendtransfer, null, str11);
                                                return;
                                            default:
                                                b0Var.a(sendtransfer, null, str11);
                                                return;
                                        }
                                    }
                                });
                                return;
                            }
                            String str11 = str10;
                            if (l2Var4 != null) {
                                v0Var5.f45256b.prepareTonConnectTransfer(s0Var, l2Var4, a8.p0.o(j14, "deposit:"), new p10() {
                                    @Override
                                    public final void a(Object obj5, Object obj6) {
                                        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj5;
                                        String str112 = (String) obj6;
                                        switch (r2) {
                                            case 0:
                                                b0Var.a(sendtransfer, null, str112);
                                                return;
                                            case 1:
                                                b0Var.a(sendtransfer, null, str112);
                                                return;
                                            default:
                                                b0Var.a(sendtransfer, null, str112);
                                                return;
                                        }
                                    }
                                });
                            } else if (nftitem6 != null) {
                                v0Var5.f45256b.prepareSendNFT(s0Var, str8, nftitem6.address, str7, new p10() {
                                    @Override
                                    public final void a(Object obj5, Object obj6) {
                                        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj5;
                                        String str112 = (String) obj6;
                                        switch (r2) {
                                            case 0:
                                                b0Var.a(sendtransfer, null, str112);
                                                return;
                                            case 1:
                                                b0Var.a(sendtransfer, null, str112);
                                                return;
                                            default:
                                                b0Var.a(sendtransfer, null, str112);
                                                return;
                                        }
                                    }
                                });
                            } else {
                                v0Var5.f45256b.prepareSend(s0Var, str8, j11, str7, bArr2, str11, b0Var);
                            }
                        }
                    }
                });
                return;
        }
    }
}
