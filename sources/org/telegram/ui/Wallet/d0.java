package org.telegram.ui.Wallet;

import android.text.TextUtils;
import ci.za;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
public final class d0 {
    public String f34824e;
    public boolean f34826g;
    public boolean h;
    public boolean f34827i;
    public boolean f34828j;
    public String f34829k;
    public final l0 f34831m;
    public final ArrayList f34821a = new ArrayList();
    public final ArrayList f34822b = new ArrayList();
    public final ArrayList f34823c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f34825f = "";
    public int f34830l = -1;

    public d0(l0 l0Var) {
        this.f34831m = l0Var;
        this.f34824e = l0Var.r();
    }

    public static void a(d0 d0Var, TL_wallet.walletTransaction wallettransaction) {
        boolean z10;
        ArrayList arrayList = d0Var.f34823c;
        ArrayList arrayList2 = d0Var.f34822b;
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
        if (this.f34830l >= 0) {
            ConnectionsManager.getInstance(this.f34831m.f35219a).cancelRequest(this.f34830l, true);
            this.f34830l = -1;
        }
        if (this.f34828j) {
            this.f34826g = false;
            this.h = false;
        }
        this.f34828j = false;
        this.f34827i = false;
    }

    public final void c() {
        b();
        this.f34821a.clear();
        this.f34822b.clear();
        this.f34823c.clear();
        this.f34825f = "";
        this.f34826g = false;
        this.h = false;
        this.f34829k = null;
        f();
    }

    public final void d() {
        if (!this.f34827i && !this.f34826g) {
            e(!this.h);
        }
    }

    public final void e(boolean z10) {
        String str;
        int i10;
        if (TextUtils.isEmpty(this.f34824e)) {
            return;
        }
        TL_wallet.getNfts getnfts = new TL_wallet.getNfts();
        if (z10) {
            str = "";
        } else {
            str = this.f34825f;
        }
        getnfts.offset = str;
        if (TextUtils.isEmpty(str)) {
            i10 = 5;
        } else {
            i10 = 20;
        }
        getnfts.limit = i10;
        this.f34827i = true;
        this.f34828j = z10;
        this.f34829k = null;
        f();
        this.f34830l = ConnectionsManager.getInstance(this.f34831m.f35219a).sendRequestTyped(getnfts, new Object(), new za(3, this, z10));
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
        ArrayList arrayList = this.f34821a;
        arrayList.clear();
        ArrayList arrayList2 = this.f34822b;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
            ArrayList arrayList3 = this.f34823c;
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
