package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
public final class f0 {
    public String f42446e;
    public boolean f42448g;
    public boolean h;
    public boolean f42449i;
    public boolean f42450j;
    public String f42451k;
    public final n0 f42453m;
    public final ArrayList f42443a = new ArrayList();
    public final ArrayList f42444b = new ArrayList();
    public final ArrayList f42445c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f42447f = "";
    public int f42452l = -1;

    public f0(n0 n0Var) {
        this.f42453m = n0Var;
        this.f42446e = n0Var.t();
    }

    public static void a(f0 f0Var, TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = f0Var.f42445c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((TL_wallet.walletTransaction) obj) == wallettransaction) {
                if (wallettransaction.failed && !f0Var.d(wallettransaction.nft.address)) {
                    f0Var.f42444b.add(0, wallettransaction.nft);
                }
                f0Var.h();
                f0Var.g();
                return;
            }
        }
    }

    public final void b() {
        if (this.f42452l >= 0) {
            ConnectionsManager.getInstance(this.f42453m.f42793a).cancelRequest(this.f42452l, true);
            this.f42452l = -1;
        }
        if (this.f42450j) {
            this.f42448g = false;
            this.h = false;
        }
        this.f42450j = false;
        this.f42449i = false;
    }

    public final void c() {
        b();
        this.f42443a.clear();
        this.f42444b.clear();
        this.f42445c.clear();
        this.f42447f = "";
        this.f42448g = false;
        this.h = false;
        this.f42451k = null;
        g();
    }

    public final boolean d(String str) {
        ArrayList arrayList = this.f42444b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (n0.b(((TL_wallet.nftItem) obj).address, str)) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (!this.f42449i && !this.f42448g) {
            f(!this.h);
        }
    }

    public final void f(boolean z9) {
        String str;
        int i7;
        if (TextUtils.isEmpty(this.f42446e)) {
            return;
        }
        TL_wallet.getNfts getnfts = new TL_wallet.getNfts();
        if (z9) {
            str = "";
        } else {
            str = this.f42447f;
        }
        getnfts.offset = str;
        if (TextUtils.isEmpty(str)) {
            i7 = 5;
        } else {
            i7 = 20;
        }
        getnfts.limit = i7;
        this.f42449i = true;
        this.f42450j = z9;
        this.f42451k = null;
        g();
        this.f42452l = ConnectionsManager.getInstance(this.f42453m.f42793a).sendRequestTyped(getnfts, new d3.b(1), new fi.m9(3, this, z9));
    }

    public final void g() {
        ArrayList arrayList = new ArrayList(this.d);
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Runnable) obj).run();
        }
    }

    public final void h() {
        ArrayList arrayList = this.f42443a;
        arrayList.clear();
        ArrayList arrayList2 = this.f42444b;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
            ArrayList arrayList3 = this.f42445c;
            int size2 = arrayList3.size();
            int i10 = 0;
            while (true) {
                if (i10 < size2) {
                    Object obj2 = arrayList3.get(i10);
                    i10++;
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                    if (wallettransaction.failed || !n0.b(wallettransaction.nft.address, nftitem.address)) {
                    }
                } else {
                    arrayList.add(nftitem);
                    break;
                }
            }
        }
    }
}
