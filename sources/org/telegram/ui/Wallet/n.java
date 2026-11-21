package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fj;
import org.telegram.messenger.j10;
import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.mz0;
public final class n implements Runnable {
    public final x10 E;
    public final k2 F;
    public final int f44635a;
    public final u0 f44636b;
    public final String f44637c;
    public final x10 d;
    public final TL_wallet.nftItem f44638e;
    public final String f44639f;
    public final String h;
    public final byte[] f44640n;
    public final long f44641r;
    public final p0 f44642s;
    public final k2 f44643w;
    public final TLRPC.User f44644x;
    public final String f44645y;

    public n(u0 u0Var, String str, x10 x10Var, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j3, p0 p0Var, k2 k2Var, TLRPC.User user, String str4, x10 x10Var2, k2 k2Var2, int i7) {
        this.f44635a = i7;
        this.f44636b = u0Var;
        this.f44637c = str;
        this.d = x10Var;
        this.f44638e = nftitem;
        this.f44639f = str2;
        this.h = str3;
        this.f44640n = bArr;
        this.f44641r = j3;
        this.f44642s = p0Var;
        this.f44643w = k2Var;
        this.f44644x = user;
        this.f44645y = str4;
        this.E = x10Var2;
        this.F = k2Var2;
    }

    @Override
    public final void run() {
        switch (this.f44635a) {
            case 0:
                u0 u0Var = this.f44636b;
                String str = this.f44637c;
                x10 x10Var = this.d;
                n nVar = new n(u0Var, str, x10Var, this.f44638e, this.f44639f, this.h, this.f44640n, this.f44641r, this.f44642s, this.f44643w, this.f44644x, this.f44645y, this.E, this.F, 1);
                if (u0Var.S() && !u0Var.R()) {
                    u0.P("send " + str + ": asking passcode");
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                    if (T == 0) {
                        x10Var.a("PASSCODE_FAILED");
                        return;
                    }
                    ?? obj = new Object();
                    obj.f28902a = true;
                    boolean[] zArr = {false};
                    f0 f0Var = new f0(zArr, x10Var);
                    f0Var.W = new mz0(27, zArr, nVar);
                    T.showAsSheet(f0Var, obj);
                    return;
                }
                nVar.run();
                return;
            default:
                StringBuilder sb2 = new StringBuilder("send ");
                final String str2 = this.f44637c;
                sb2.append(str2);
                sb2.append(": ready, get secret phrase");
                u0.P(sb2.toString());
                final u0 u0Var2 = this.f44636b;
                final x10 x10Var2 = this.d;
                final TL_wallet.nftItem nftitem = this.f44638e;
                final String str3 = this.f44639f;
                final String str4 = this.h;
                final byte[] bArr = this.f44640n;
                final long j3 = this.f44641r;
                final p0 p0Var = this.f44642s;
                final k2 k2Var = this.f44643w;
                final TLRPC.User user = this.f44644x;
                final String str5 = this.f44645y;
                final x10 x10Var3 = this.E;
                final k2 k2Var2 = this.F;
                u0Var2.F(false, true, true, new q10() {
                    @Override
                    public final void a(Object obj2, Object obj3) {
                        boolean z10;
                        u0 u0Var3;
                        TL_wallet.nftItem nftitem2;
                        boolean z11;
                        TLRPC.User user2;
                        long j10;
                        long j11;
                        fj fjVar;
                        int e12;
                        k2 k2Var3;
                        TL_wallet.nftItem nftitem3;
                        long j12;
                        r0 r0Var = (r0) obj2;
                        String str6 = (String) obj3;
                        u0 u0Var4 = u0.this;
                        int i7 = u0Var4.f45123a;
                        x10 x10Var4 = x10Var2;
                        if (str6 != null) {
                            x10Var4.a(str6);
                        } else if (r0Var == null) {
                            x10Var4.a("NULL_ERROR");
                        } else if (u0Var4.f45124b == null) {
                            x10Var4.a("NULL_ENGINE");
                        } else {
                            TL_wallet.nftItem nftitem4 = nftitem;
                            if (nftitem4 != null) {
                                if (!u0.c(str3, u0Var4.y())) {
                                    x10Var4.a("WALLET_CHANGED");
                                    return;
                                }
                            }
                            t0 H = u0Var4.H();
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
                            p0 p0Var2 = p0Var;
                            k2 k2Var4 = k2Var;
                            TLRPC.User user3 = user;
                            String str8 = str2;
                            if (p0Var2 != null && p0Var2.h != null) {
                                TL_wallet.walletTransactionPeerOnchainGift wallettransactionpeeronchaingift = new TL_wallet.walletTransactionPeerOnchainGift();
                                TL_wallet.WalletOnchainGiftAction walletOnchainGiftAction = p0Var2.h;
                                wallettransactionpeeronchaingift.action = walletOnchainGiftAction;
                                wallettransactionpeeronchaingift.address = f3.a(walletOnchainGiftAction);
                                wallettransaction.peer = wallettransactionpeeronchaingift;
                                TL_stars.StarGift starGift = p0Var2.f44777i;
                                if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                                    u0Var3 = u0Var4;
                                    nftitem2 = nftitem4;
                                    nftitem3 = null;
                                } else {
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                    ArrayList arrayList = u0Var4.B().f44501b;
                                    u0Var3 = u0Var4;
                                    int size = arrayList.size();
                                    nftitem2 = nftitem4;
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 < size) {
                                            Object obj4 = arrayList.get(i10);
                                            int i11 = i10 + 1;
                                            int i12 = size;
                                            TL_wallet.nftItem nftitem5 = (TL_wallet.nftItem) obj4;
                                            if ((nftitem5.gift instanceof TL_stars.TL_starGiftUnique) && u0.c(nftitem5.address, tL_starGiftUnique.gift_address)) {
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
                                u0Var3 = u0Var4;
                                nftitem2 = nftitem4;
                                if (k2Var4 != null && nftitem2 != null) {
                                    TL_wallet.walletTransactionPeerTelegramGift wallettransactionpeertelegramgift = new TL_wallet.walletTransactionPeerTelegramGift();
                                    if (user3 != null && user3.f28580id == j10.i(i7).e()) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    wallettransactionpeertelegramgift.own_profile = z11;
                                    wallettransaction.peer = wallettransactionpeertelegramgift;
                                } else {
                                    wallettransaction.peer = u0.i(user3, str8, str5);
                                }
                            }
                            u0 u0Var5 = u0Var3;
                            TL_wallet.nftItem nftitem6 = nftitem2;
                            v7 v7Var = new v7(u0Var5, wallettransaction, nftitem6, H, 4);
                            long nextLong = Utilities.f22805b.nextLong();
                            wallettransaction.random_id = nextLong;
                            u0Var5.f45136p.add(0, wallettransaction);
                            if (nftitem6 != null) {
                                l0 B = u0Var5.B();
                                B.f44502c.add(wallettransaction);
                                B.j();
                                B.h();
                            }
                            H.k();
                            H.i();
                            u0Var5.a0();
                            zy C = zy.C(i7);
                            if (user3 != null && user3.f28580id != j10.i(i7).e() && nftitem6 == null) {
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
                            x10 x10Var5 = x10Var3;
                            if (x10Var5 != null) {
                                x10Var5.a(wallettransaction);
                            }
                            String str10 = null;
                            x10Var4.a(null);
                            TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = u0Var5.f45127f;
                            if (tL_updateWalletGaslessInfo != null && !TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address)) {
                                TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo2 = u0Var5.f45127f;
                                if (tL_updateWalletGaslessInfo2.available) {
                                    str10 = tL_updateWalletGaslessInfo2.relayer_address;
                                }
                            }
                            u0.P("prepare sending");
                            long j14 = j10;
                            final a0 a0Var = new a0(u0Var5, v7Var, C, fjVar, wallettransaction, str8, H, j14, user2);
                            if (k2Var4 != null && (k2Var3 = k2Var2) != null) {
                                u0Var5.f45124b.prepareTonConnectTransferPair(r0Var, k2Var4, k2Var3, a8.p0.o(j14, "prepared:"), new q10() {
                                    @Override
                                    public final void a(Object obj5, Object obj6) {
                                        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj5;
                                        String str11 = (String) obj6;
                                        switch (r2) {
                                            case 0:
                                                a0Var.a(sendtransfer, null, str11);
                                                return;
                                            case 1:
                                                a0Var.a(sendtransfer, null, str11);
                                                return;
                                            default:
                                                a0Var.a(sendtransfer, null, str11);
                                                return;
                                        }
                                    }
                                });
                                return;
                            }
                            String str11 = str10;
                            if (k2Var4 != null) {
                                u0Var5.f45124b.prepareTonConnectTransfer(r0Var, k2Var4, a8.p0.o(j14, "deposit:"), new q10() {
                                    @Override
                                    public final void a(Object obj5, Object obj6) {
                                        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj5;
                                        String str112 = (String) obj6;
                                        switch (r2) {
                                            case 0:
                                                a0Var.a(sendtransfer, null, str112);
                                                return;
                                            case 1:
                                                a0Var.a(sendtransfer, null, str112);
                                                return;
                                            default:
                                                a0Var.a(sendtransfer, null, str112);
                                                return;
                                        }
                                    }
                                });
                            } else if (nftitem6 != null) {
                                u0Var5.f45124b.prepareSendNFT(r0Var, str8, nftitem6.address, str7, new q10() {
                                    @Override
                                    public final void a(Object obj5, Object obj6) {
                                        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj5;
                                        String str112 = (String) obj6;
                                        switch (r2) {
                                            case 0:
                                                a0Var.a(sendtransfer, null, str112);
                                                return;
                                            case 1:
                                                a0Var.a(sendtransfer, null, str112);
                                                return;
                                            default:
                                                a0Var.a(sendtransfer, null, str112);
                                                return;
                                        }
                                    }
                                });
                            } else {
                                u0Var5.f45124b.prepareSend(r0Var, str8, j11, str7, bArr2, str11, a0Var);
                            }
                        }
                    }
                });
                return;
        }
    }
}
