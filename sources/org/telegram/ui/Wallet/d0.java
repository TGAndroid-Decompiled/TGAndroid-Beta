package org.telegram.ui.Wallet;

import android.text.TextUtils;
import ci.za;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
public final class d0 {
    public String f34599e;
    public boolean f34601g;
    public boolean h;
    public boolean f34602i;
    public boolean f34603j;
    public String f34604k;
    public final l0 f34606m;
    public final ArrayList f34596a = new ArrayList();
    public final ArrayList f34597b = new ArrayList();
    public final ArrayList f34598c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f34600f = "";
    public int f34605l = -1;

    public d0(l0 l0Var) {
        this.f34606m = l0Var;
        this.f34599e = l0Var.r();
    }

    public static void a(d0 d0Var, TL_wallet.walletTransaction wallettransaction) {
        boolean z10;
        ArrayList arrayList = d0Var.f34598c;
        ArrayList arrayList2 = d0Var.f34597b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((TL_wallet.walletTransaction) obj) == wallettransaction) {
                if (wallettransaction.failed) {
                    String str = wallettransaction.nft.address;
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size2) {
                            Object obj2 = arrayList2.get(i11);
                            i11++;
                            if (l0.b(((TL_wallet.nftItem) obj2).address, str)) {
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
                d0Var.g();
                d0Var.f();
                return;
            }
        }
    }

    public final void b() {
        if (this.f34605l >= 0) {
            ConnectionsManager.getInstance(this.f34606m.f34994a).cancelRequest(this.f34605l, true);
            this.f34605l = -1;
        }
        if (this.f34603j) {
            this.f34601g = false;
            this.h = false;
        }
        this.f34603j = false;
        this.f34602i = false;
    }

    public final void c() {
        b();
        this.f34596a.clear();
        this.f34597b.clear();
        this.f34598c.clear();
        this.f34600f = "";
        this.f34601g = false;
        this.h = false;
        this.f34604k = null;
        f();
    }

    public final void d() {
        if (!this.f34602i && !this.f34601g) {
            e(!this.h);
        }
    }

    public final void e(boolean z10) {
        String str;
        int i10;
        if (TextUtils.isEmpty(this.f34599e)) {
            return;
        }
        TL_wallet.getNfts getnfts = new TL_wallet.getNfts();
        if (z10) {
            str = "";
        } else {
            str = this.f34600f;
        }
        getnfts.offset = str;
        if (TextUtils.isEmpty(str)) {
            i10 = 5;
        } else {
            i10 = 20;
        }
        getnfts.limit = i10;
        this.f34602i = true;
        this.f34603j = z10;
        this.f34604k = null;
        f();
        this.f34605l = ConnectionsManager.getInstance(this.f34606m.f34994a).sendRequestTyped(getnfts, new Object(), new za(3, this, z10));
    }

    public final void f() {
        ArrayList arrayList = new ArrayList(this.d);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void g() {
        ArrayList arrayList = this.f34596a;
        arrayList.clear();
        ArrayList arrayList2 = this.f34597b;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
            ArrayList arrayList3 = this.f34598c;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (true) {
                if (i11 < size2) {
                    Object obj2 = arrayList3.get(i11);
                    i11++;
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                    if (wallettransaction.failed || !l0.b(wallettransaction.nft.address, nftitem.address)) {
                    }
                } else {
                    arrayList.add(nftitem);
                    break;
                }
            }
        }
    }
}
