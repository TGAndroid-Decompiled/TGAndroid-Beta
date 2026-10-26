package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
public final class d0 {
    public String e;
    public boolean f36446g;
    public boolean h;
    public boolean f36447i;
    public boolean f36448j;
    public String f36449k;
    public final l0 f36451m;
    public final ArrayList f36442a = new ArrayList();
    public final ArrayList f36443b = new ArrayList();
    public final ArrayList f36444c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f36445f = "";
    public int f36450l = -1;

    public d0(l0 l0Var) {
        this.f36451m = l0Var;
        this.e = l0Var.s();
    }

    public static void a(d0 d0Var, TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = d0Var.f36444c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((TL_wallet.walletTransaction) obj) == wallettransaction) {
                if (wallettransaction.failed && !d0Var.d(wallettransaction.nft.address)) {
                    d0Var.f36443b.add(0, wallettransaction.nft);
                }
                d0Var.h();
                d0Var.g();
                return;
            }
        }
    }

    public final void b() {
        if (this.f36450l >= 0) {
            ConnectionsManager.getInstance(this.f36451m.f36807a).cancelRequest(this.f36450l, true);
            this.f36450l = -1;
        }
        if (this.f36448j) {
            this.f36446g = false;
            this.h = false;
        }
        this.f36448j = false;
        this.f36447i = false;
    }

    public final void c() {
        b();
        this.f36442a.clear();
        this.f36443b.clear();
        this.f36444c.clear();
        this.f36445f = "";
        this.f36446g = false;
        this.h = false;
        this.f36449k = null;
        g();
    }

    public final boolean d(String str) {
        ArrayList arrayList = this.f36443b;
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
        if (!this.f36447i && !this.f36446g) {
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
            str = this.f36445f;
        }
        getnfts.offset = str;
        if (TextUtils.isEmpty(str)) {
            i10 = 5;
        } else {
            i10 = 20;
        }
        getnfts.limit = i10;
        this.f36447i = true;
        this.f36448j = z10;
        this.f36449k = null;
        g();
        this.f36450l = ConnectionsManager.getInstance(this.f36451m.f36807a).sendRequestTyped(getnfts, new Object(), new fi.ga(3, this, z10));
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
        ArrayList arrayList = this.f36442a;
        arrayList.clear();
        ArrayList arrayList2 = this.f36443b;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
            ArrayList arrayList3 = this.f36444c;
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
