package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.bv0;
public final class c0 {
    public String e;
    public boolean f34302g;
    public boolean h;
    public boolean f34303i;
    public boolean f34304j;
    public String f34305k;
    public final k0 f34307m;
    public final ArrayList f34298a = new ArrayList();
    public final ArrayList f34299b = new ArrayList();
    public final ArrayList f34300c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f34301f = "";
    public int f34306l = -1;

    public c0(k0 k0Var) {
        this.f34307m = k0Var;
        this.e = k0Var.t();
    }

    public static void a(c0 c0Var, TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = c0Var.f34300c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((TL_wallet.walletTransaction) obj) == wallettransaction) {
                if (wallettransaction.failed && !c0Var.d(wallettransaction.nft.address)) {
                    c0Var.f34299b.add(0, wallettransaction.nft);
                }
                c0Var.h();
                c0Var.g();
                return;
            }
        }
    }

    public final void b() {
        if (this.f34306l >= 0) {
            ConnectionsManager.getInstance(this.f34307m.f34781a).cancelRequest(this.f34306l, true);
            this.f34306l = -1;
        }
        if (this.f34304j) {
            this.f34302g = false;
            this.h = false;
        }
        this.f34304j = false;
        this.f34303i = false;
    }

    public final void c() {
        b();
        this.f34298a.clear();
        this.f34299b.clear();
        this.f34300c.clear();
        this.f34301f = "";
        this.f34302g = false;
        this.h = false;
        this.f34305k = null;
        g();
    }

    public final boolean d(String str) {
        ArrayList arrayList = this.f34299b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (k0.b(((TL_wallet.nftItem) obj).address, str)) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (!this.f34303i && !this.f34302g) {
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
            str = this.f34301f;
        }
        getnfts.offset = str;
        if (TextUtils.isEmpty(str)) {
            i10 = 5;
        } else {
            i10 = 20;
        }
        getnfts.limit = i10;
        this.f34303i = true;
        this.f34304j = z10;
        this.f34305k = null;
        g();
        this.f34306l = ConnectionsManager.getInstance(this.f34307m.f34781a).sendRequestTyped(getnfts, new a3.b(1), new bv0(1, this, z10));
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
        ArrayList arrayList = this.f34298a;
        arrayList.clear();
        ArrayList arrayList2 = this.f34299b;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
            ArrayList arrayList3 = this.f34300c;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (true) {
                if (i11 < size2) {
                    Object obj2 = arrayList3.get(i11);
                    i11++;
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                    if (wallettransaction.failed || !k0.b(wallettransaction.nft.address, nftitem.address)) {
                    }
                } else {
                    arrayList.add(nftitem);
                    break;
                }
            }
        }
    }
}
