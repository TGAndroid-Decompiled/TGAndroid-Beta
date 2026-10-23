package org.telegram.ui.Wallet;

import android.text.TextUtils;
import ei.ka;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
public final class d0 {
    public String e;
    public boolean f34389g;
    public boolean h;
    public boolean f34390i;
    public boolean f34391j;
    public String f34392k;
    public final l0 f34394m;
    public final ArrayList f34385a = new ArrayList();
    public final ArrayList f34386b = new ArrayList();
    public final ArrayList f34387c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f34388f = "";
    public int f34393l = -1;

    public d0(l0 l0Var) {
        this.f34394m = l0Var;
        this.e = l0Var.s();
    }

    public static void a(d0 d0Var, TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = d0Var.f34387c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((TL_wallet.walletTransaction) obj) == wallettransaction) {
                if (wallettransaction.failed && !d0Var.d(wallettransaction.nft.address)) {
                    d0Var.f34386b.add(0, wallettransaction.nft);
                }
                d0Var.h();
                d0Var.g();
                return;
            }
        }
    }

    public final void b() {
        if (this.f34393l >= 0) {
            ConnectionsManager.getInstance(this.f34394m.f34741a).cancelRequest(this.f34393l, true);
            this.f34393l = -1;
        }
        if (this.f34391j) {
            this.f34389g = false;
            this.h = false;
        }
        this.f34391j = false;
        this.f34390i = false;
    }

    public final void c() {
        b();
        this.f34385a.clear();
        this.f34386b.clear();
        this.f34387c.clear();
        this.f34388f = "";
        this.f34389g = false;
        this.h = false;
        this.f34392k = null;
        g();
    }

    public final boolean d(String str) {
        ArrayList arrayList = this.f34386b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (l0.a(((TL_wallet.nftItem) obj).address, str)) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (!this.f34390i && !this.f34389g) {
            f(!this.h);
        }
    }

    public final void f(boolean z10) {
        String str;
        int i10;
        if (TextUtils.isEmpty(this.e)) {
            return;
        }
        TL_wallet.getNfts getnfts = new TL_wallet.getNfts();
        if (z10) {
            str = "";
        } else {
            str = this.f34388f;
        }
        getnfts.offset = str;
        if (TextUtils.isEmpty(str)) {
            i10 = 5;
        } else {
            i10 = 20;
        }
        getnfts.limit = i10;
        this.f34390i = true;
        this.f34391j = z10;
        this.f34392k = null;
        g();
        this.f34393l = ConnectionsManager.getInstance(this.f34394m.f34741a).sendRequestTyped(getnfts, new Object(), new ka(3, this, z10));
    }

    public final void g() {
        ArrayList arrayList = new ArrayList(this.d);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void h() {
        ArrayList arrayList = this.f34385a;
        arrayList.clear();
        ArrayList arrayList2 = this.f34386b;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
            ArrayList arrayList3 = this.f34387c;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (true) {
                if (i11 < size2) {
                    Object obj2 = arrayList3.get(i11);
                    i11++;
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                    if (wallettransaction.failed || !l0.a(wallettransaction.nft.address, nftitem.address)) {
                    }
                } else {
                    arrayList.add(nftitem);
                    break;
                }
            }
        }
    }
}
