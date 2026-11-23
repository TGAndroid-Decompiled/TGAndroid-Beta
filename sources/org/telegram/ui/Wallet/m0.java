package org.telegram.ui.Wallet;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
public final class m0 {
    public String f44632e;
    public boolean f44634g;
    public boolean h;
    public boolean f44635i;
    public boolean f44636j;
    public boolean f44637k;
    public long f44638l;
    public String f44639m;
    public final v0 f44641o;
    public final ArrayList f44629a = new ArrayList();
    public final ArrayList f44630b = new ArrayList();
    public final ArrayList f44631c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f44633f = "";
    public int f44640n = -1;

    public m0(v0 v0Var) {
        this.f44641o = v0Var;
        this.f44632e = v0Var.y();
    }

    public static void a(m0 m0Var, TL_wallet.walletTransaction wallettransaction) {
        boolean z10;
        ArrayList arrayList = m0Var.f44631c;
        ArrayList arrayList2 = m0Var.f44630b;
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
                            if (v0.c(((TL_wallet.nftItem) obj2).address, str)) {
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
                m0Var.j();
                m0Var.h();
                return;
            }
        }
    }

    public final void b() {
        if (this.f44640n >= 0) {
            ConnectionsManager.getInstance(this.f44641o.f45255a).cancelRequest(this.f44640n, true);
            this.f44640n = -1;
        }
        if (this.f44636j) {
            this.f44634g = false;
            this.h = false;
        }
        this.f44636j = false;
        this.f44635i = false;
        this.f44637k = false;
    }

    public final void c() {
        b();
        this.f44629a.clear();
        this.f44630b.clear();
        this.f44631c.clear();
        this.f44633f = "";
        this.f44634g = false;
        this.h = false;
        this.f44639m = null;
        h();
    }

    public final boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        ArrayList arrayList = this.f44629a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (v0.c(((TL_wallet.nftItem) obj).address, str)) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f44636j) {
            this.f44637k = true;
            return;
        }
        b();
        g(true);
    }

    public final void f() {
        if (!this.f44635i && !this.f44634g) {
            g(!this.h);
        }
    }

    public final void g(final boolean z10) {
        String str;
        int i7;
        if (TextUtils.isEmpty(this.f44632e)) {
            return;
        }
        TL_wallet.getNfts getnfts = new TL_wallet.getNfts();
        if (z10) {
            str = "";
        } else {
            str = this.f44633f;
        }
        getnfts.offset = str;
        if (TextUtils.isEmpty(str)) {
            i7 = 5;
        } else {
            i7 = 20;
        }
        getnfts.limit = i7;
        this.f44635i = true;
        this.f44636j = z10;
        this.f44639m = null;
        h();
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f44640n = ConnectionsManager.getInstance(this.f44641o.f45255a).sendRequestTyped(getnfts, new d3.b(1), new p10() {
            @Override
            public final void a(Object obj, Object obj2) {
                String str2;
                TL_wallet.nftItems nftitems = (TL_wallet.nftItems) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                m0 m0Var = m0.this;
                ArrayList arrayList = m0Var.f44630b;
                ArrayList arrayList2 = m0Var.f44631c;
                m0Var.f44640n = -1;
                m0Var.f44636j = false;
                m0Var.f44635i = false;
                boolean z11 = z10;
                if (nftitems != null) {
                    if (z11) {
                        arrayList.clear();
                        m0Var.f44638l = elapsedRealtime;
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
                                if (v0.c(((TL_wallet.nftItem) arrayList.get(i11)).address, nftitem2.address)) {
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
                    m0Var.f44633f = str3;
                    boolean isEmpty = TextUtils.isEmpty(str3);
                    m0Var.f44634g = isEmpty;
                    m0Var.h = true;
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
                                        if (v0.c(((TL_wallet.nftItem) obj3).address, str4)) {
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
                    m0Var.j();
                } else {
                    if (z11) {
                        m0Var.f44634g = false;
                        m0Var.h = false;
                    }
                    if (tL_error == null) {
                        str2 = "Could not load collectibles";
                    } else {
                        str2 = tL_error.text;
                    }
                    m0Var.f44639m = str2;
                }
                if (m0Var.f44637k) {
                    m0Var.f44637k = false;
                    m0Var.e();
                    if (m0Var.f44635i) {
                        return;
                    }
                }
                m0Var.h();
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
            ArrayList arrayList = this.f44630b;
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
        ArrayList arrayList = this.f44629a;
        arrayList.clear();
        ArrayList arrayList2 = this.f44630b;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
            ArrayList arrayList3 = this.f44631c;
            int size2 = arrayList3.size();
            int i10 = 0;
            while (true) {
                if (i10 < size2) {
                    Object obj2 = arrayList3.get(i10);
                    i10++;
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                    if (wallettransaction.failed || !v0.c(wallettransaction.nft.address, nftitem.address)) {
                    }
                } else {
                    arrayList.add(nftitem);
                    break;
                }
            }
        }
    }
}
