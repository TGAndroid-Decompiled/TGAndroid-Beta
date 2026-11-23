package org.telegram.ui.Wallet;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.r10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
public final class l0 {
    public String f44473e;
    public boolean f44475g;
    public boolean h;
    public boolean f44476i;
    public boolean f44477j;
    public boolean f44478k;
    public long f44479l;
    public String f44480m;
    public final u0 f44482o;
    public final ArrayList f44470a = new ArrayList();
    public final ArrayList f44471b = new ArrayList();
    public final ArrayList f44472c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f44474f = "";
    public int f44481n = -1;

    public l0(u0 u0Var) {
        this.f44482o = u0Var;
        this.f44473e = u0Var.y();
    }

    public static void a(l0 l0Var, TL_wallet.walletTransaction wallettransaction) {
        boolean z10;
        ArrayList arrayList = l0Var.f44472c;
        ArrayList arrayList2 = l0Var.f44471b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((TL_wallet.walletTransaction) obj) == wallettransaction) {
                if (wallettransaction.failed) {
                    String str = wallettransaction.nft.address;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size2) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            if (u0.c(((TL_wallet.nftItem) obj2).address, str)) {
                                z10 = true;
                                break;
                            }
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                    if (!z10) {
                        arrayList2.add(0, wallettransaction.nft);
                    }
                }
                l0Var.j();
                l0Var.h();
                return;
            }
        }
    }

    public final void b() {
        if (this.f44481n >= 0) {
            ConnectionsManager.getInstance(this.f44482o.f45093a).cancelRequest(this.f44481n, true);
            this.f44481n = -1;
        }
        if (this.f44477j) {
            this.f44475g = false;
            this.h = false;
        }
        this.f44477j = false;
        this.f44476i = false;
        this.f44478k = false;
    }

    public final void c() {
        b();
        this.f44470a.clear();
        this.f44471b.clear();
        this.f44472c.clear();
        this.f44474f = "";
        this.f44475g = false;
        this.h = false;
        this.f44480m = null;
        h();
    }

    public final boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        ArrayList arrayList = this.f44470a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (u0.c(((TL_wallet.nftItem) obj).address, str)) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f44477j) {
            this.f44478k = true;
            return;
        }
        b();
        g(true);
    }

    public final void f() {
        if (!this.f44476i && !this.f44475g) {
            g(!this.h);
        }
    }

    public final void g(final boolean z10) {
        String str;
        int i7;
        if (TextUtils.isEmpty(this.f44473e)) {
            return;
        }
        TL_wallet.getNfts getnfts = new TL_wallet.getNfts();
        if (z10) {
            str = "";
        } else {
            str = this.f44474f;
        }
        getnfts.offset = str;
        if (TextUtils.isEmpty(str)) {
            i7 = 5;
        } else {
            i7 = 20;
        }
        getnfts.limit = i7;
        this.f44476i = true;
        this.f44477j = z10;
        this.f44480m = null;
        h();
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f44481n = ConnectionsManager.getInstance(this.f44482o.f45093a).sendRequestTyped(getnfts, new d3.b(1), new r10() {
            @Override
            public final void a(Object obj, Object obj2) {
                String str2;
                TL_wallet.nftItems nftitems = (TL_wallet.nftItems) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                l0 l0Var = l0.this;
                ArrayList arrayList = l0Var.f44471b;
                ArrayList arrayList2 = l0Var.f44472c;
                l0Var.f44481n = -1;
                l0Var.f44477j = false;
                l0Var.f44476i = false;
                boolean z11 = z10;
                if (nftitems != null) {
                    if (z11) {
                        arrayList.clear();
                        l0Var.f44479l = elapsedRealtime;
                    }
                    ArrayList<TL_wallet.nftItem> arrayList3 = nftitems.items;
                    int size = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size) {
                        TL_wallet.nftItem nftitem = arrayList3.get(i10);
                        i10++;
                        TL_wallet.nftItem nftitem2 = nftitem;
                        int i11 = 0;
                        while (true) {
                            if (i11 < arrayList.size()) {
                                if (u0.c(((TL_wallet.nftItem) arrayList.get(i11)).address, nftitem2.address)) {
                                    arrayList.set(i11, nftitem2);
                                    break;
                                }
                                i11++;
                            } else {
                                arrayList.add(nftitem2);
                                break;
                            }
                        }
                    }
                    String str3 = nftitems.next_offset;
                    l0Var.f44474f = str3;
                    boolean isEmpty = TextUtils.isEmpty(str3);
                    l0Var.f44475g = isEmpty;
                    l0Var.h = true;
                    if (isEmpty) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) arrayList2.get(size2);
                            if (!wallettransaction.pending && !wallettransaction.failed) {
                                String str4 = wallettransaction.nft.address;
                                int size3 = arrayList.size();
                                int i12 = 0;
                                while (true) {
                                    if (i12 < size3) {
                                        Object obj3 = arrayList.get(i12);
                                        i12++;
                                        if (u0.c(((TL_wallet.nftItem) obj3).address, str4)) {
                                            break;
                                        }
                                    } else {
                                        arrayList2.remove(size2);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    l0Var.j();
                } else {
                    if (z11) {
                        l0Var.f44475g = false;
                        l0Var.h = false;
                    }
                    if (tL_error == null) {
                        str2 = "Could not load collectibles";
                    } else {
                        str2 = tL_error.text;
                    }
                    l0Var.f44480m = str2;
                }
                if (l0Var.f44478k) {
                    l0Var.f44478k = false;
                    l0Var.e();
                    if (l0Var.f44476i) {
                        return;
                    }
                }
                l0Var.h();
            }
        });
    }

    public final void h() {
        ArrayList arrayList = new ArrayList(this.d);
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Runnable) obj).run();
        }
    }

    public final void i(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique != null && !TextUtils.isEmpty(tL_starGiftUnique.slug)) {
            ArrayList arrayList = this.f44471b;
            int size = arrayList.size();
            boolean z10 = false;
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
                TL_stars.StarGift starGift = nftitem.gift;
                if ((starGift instanceof TL_stars.TL_starGiftUnique) && starGift != tL_starGiftUnique && TextUtils.equals(((TL_stars.TL_starGiftUnique) starGift).slug, tL_starGiftUnique.slug)) {
                    nftitem.gift = tL_starGiftUnique;
                    z10 = true;
                }
            }
            if (z10) {
                h();
            }
        }
    }

    public final void j() {
        ArrayList arrayList = this.f44470a;
        arrayList.clear();
        ArrayList arrayList2 = this.f44471b;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
            ArrayList arrayList3 = this.f44472c;
            int size2 = arrayList3.size();
            int i10 = 0;
            while (true) {
                if (i10 < size2) {
                    Object obj2 = arrayList3.get(i10);
                    i10++;
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                    if (wallettransaction.failed || !u0.c(wallettransaction.nft.address, nftitem.address)) {
                    }
                } else {
                    arrayList.add(nftitem);
                    break;
                }
            }
        }
    }
}
