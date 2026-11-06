package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
public final class f0 {
    public String f42445e;
    public boolean f42447g;
    public boolean h;
    public boolean f42448i;
    public boolean f42449j;
    public String f42450k;
    public final n0 f42452m;
    public final ArrayList f42442a = new ArrayList();
    public final ArrayList f42443b = new ArrayList();
    public final ArrayList f42444c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f42446f = "";
    public int f42451l = -1;

    public f0(n0 n0Var) {
        this.f42452m = n0Var;
        this.f42445e = n0Var.t();
    }

    public static void a(f0 f0Var, TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = f0Var.f42444c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((TL_wallet.walletTransaction) obj) == wallettransaction) {
                if (wallettransaction.failed && !f0Var.d(wallettransaction.nft.address)) {
                    f0Var.f42443b.add(0, wallettransaction.nft);
                }
                f0Var.h();
                f0Var.g();
                return;
            }
        }
    }

    public final void b() {
        if (this.f42451l >= 0) {
            ConnectionsManager.getInstance(this.f42452m.f42792a).cancelRequest(this.f42451l, true);
            this.f42451l = -1;
        }
        if (this.f42449j) {
            this.f42447g = false;
            this.h = false;
        }
        this.f42449j = false;
        this.f42448i = false;
    }

    public final void c() {
        b();
        this.f42442a.clear();
        this.f42443b.clear();
        this.f42444c.clear();
        this.f42446f = "";
        this.f42447g = false;
        this.h = false;
        this.f42450k = null;
        g();
    }

    public final boolean d(String str) {
        ArrayList arrayList = this.f42443b;
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
        if (!this.f42448i && !this.f42447g) {
            f(!this.h);
        }
    }

    public final void f(boolean z9) {
        String str;
        int i7;
        if (TextUtils.isEmpty(this.f42445e)) {
            return;
        }
        TL_wallet.getNfts getnfts = new TL_wallet.getNfts();
        if (z9) {
            str = "";
        } else {
            str = this.f42446f;
        }
        getnfts.offset = str;
        if (TextUtils.isEmpty(str)) {
            i7 = 5;
        } else {
            i7 = 20;
        }
        getnfts.limit = i7;
        this.f42448i = true;
        this.f42449j = z9;
        this.f42450k = null;
        g();
        this.f42451l = ConnectionsManager.getInstance(this.f42452m.f42792a).sendRequestTyped(getnfts, new d3.b(1), new fi.m9(3, this, z9));
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
        ArrayList arrayList = this.f42442a;
        arrayList.clear();
        ArrayList arrayList2 = this.f42443b;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
            ArrayList arrayList3 = this.f42444c;
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
