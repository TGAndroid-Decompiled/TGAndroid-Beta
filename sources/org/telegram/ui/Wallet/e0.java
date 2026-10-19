package org.telegram.ui.Wallet;

import android.text.TextUtils;
import ei.ka;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
public final class e0 {
    public String e;
    public boolean f34130g;
    public boolean h;
    public boolean f34131i;
    public boolean f34132j;
    public String f34133k;
    public final m0 f34135m;
    public final ArrayList f34126a = new ArrayList();
    public final ArrayList f34127b = new ArrayList();
    public final ArrayList f34128c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f34129f = "";
    public int f34134l = -1;

    public e0(m0 m0Var) {
        this.f34135m = m0Var;
        this.e = m0Var.s();
    }

    public static void a(e0 e0Var, TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = e0Var.f34128c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((TL_wallet.walletTransaction) obj) == wallettransaction) {
                if (wallettransaction.failed && !e0Var.d(wallettransaction.nft.address)) {
                    e0Var.f34127b.add(0, wallettransaction.nft);
                }
                e0Var.h();
                e0Var.g();
                return;
            }
        }
    }

    public final void b() {
        if (this.f34134l >= 0) {
            ConnectionsManager.getInstance(this.f34135m.f34470a).cancelRequest(this.f34134l, true);
            this.f34134l = -1;
        }
        if (this.f34132j) {
            this.f34130g = false;
            this.h = false;
        }
        this.f34132j = false;
        this.f34131i = false;
    }

    public final void c() {
        b();
        this.f34126a.clear();
        this.f34127b.clear();
        this.f34128c.clear();
        this.f34129f = "";
        this.f34130g = false;
        this.h = false;
        this.f34133k = null;
        g();
    }

    public final boolean d(String str) {
        ArrayList arrayList = this.f34127b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (m0.a(((TL_wallet.nftItem) obj).address, str)) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (!this.f34131i && !this.f34130g) {
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
            str = this.f34129f;
        }
        getnfts.offset = str;
        if (TextUtils.isEmpty(str)) {
            i10 = 5;
        } else {
            i10 = 20;
        }
        getnfts.limit = i10;
        this.f34131i = true;
        this.f34132j = z10;
        this.f34133k = null;
        g();
        this.f34134l = ConnectionsManager.getInstance(this.f34135m.f34470a).sendRequestTyped(getnfts, new Object(), new ka(3, this, z10));
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
        ArrayList arrayList = this.f34126a;
        arrayList.clear();
        ArrayList arrayList2 = this.f34127b;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
            ArrayList arrayList3 = this.f34128c;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (true) {
                if (i11 < size2) {
                    Object obj2 = arrayList3.get(i11);
                    i11++;
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                    if (wallettransaction.failed || !m0.a(wallettransaction.nft.address, nftitem.address)) {
                    }
                } else {
                    arrayList.add(nftitem);
                    break;
                }
            }
        }
    }
}
