package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
public final class d0 {
    public String f42272e;
    public boolean f42274g;
    public boolean h;
    public boolean f42275i;
    public boolean f42276j;
    public String f42277k;
    public final l0 f42279m;
    public final ArrayList f42269a = new ArrayList();
    public final ArrayList f42270b = new ArrayList();
    public final ArrayList f42271c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f42273f = "";
    public int f42278l = -1;

    public d0(l0 l0Var) {
        this.f42279m = l0Var;
        this.f42272e = l0Var.t();
    }

    public static void a(d0 d0Var, TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = d0Var.f42271c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((TL_wallet.walletTransaction) obj) == wallettransaction) {
                if (wallettransaction.failed && !d0Var.d(wallettransaction.nft.address)) {
                    d0Var.f42270b.add(0, wallettransaction.nft);
                }
                d0Var.h();
                d0Var.g();
                return;
            }
        }
    }

    public final void b() {
        if (this.f42278l >= 0) {
            ConnectionsManager.getInstance(this.f42279m.f42749a).cancelRequest(this.f42278l, true);
            this.f42278l = -1;
        }
        if (this.f42276j) {
            this.f42274g = false;
            this.h = false;
        }
        this.f42276j = false;
        this.f42275i = false;
    }

    public final void c() {
        b();
        this.f42269a.clear();
        this.f42270b.clear();
        this.f42271c.clear();
        this.f42273f = "";
        this.f42274g = false;
        this.h = false;
        this.f42277k = null;
        g();
    }

    public final boolean d(String str) {
        ArrayList arrayList = this.f42270b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (l0.b(((TL_wallet.nftItem) obj).address, str)) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (!this.f42275i && !this.f42274g) {
            f(!this.h);
        }
    }

    public final void f(boolean z9) {
        String str;
        int i7;
        if (TextUtils.isEmpty(this.f42272e)) {
            return;
        }
        TL_wallet.getNfts getnfts = new TL_wallet.getNfts();
        if (z9) {
            str = "";
        } else {
            str = this.f42273f;
        }
        getnfts.offset = str;
        if (TextUtils.isEmpty(str)) {
            i7 = 5;
        } else {
            i7 = 20;
        }
        getnfts.limit = i7;
        this.f42275i = true;
        this.f42276j = z9;
        this.f42277k = null;
        g();
        this.f42278l = ConnectionsManager.getInstance(this.f42279m.f42749a).sendRequestTyped(getnfts, new d3.b(1), new fi.l9(3, this, z9));
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
        ArrayList arrayList = this.f42269a;
        arrayList.clear();
        ArrayList arrayList2 = this.f42270b;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
            ArrayList arrayList3 = this.f42271c;
            int size2 = arrayList3.size();
            int i10 = 0;
            while (true) {
                if (i10 < size2) {
                    Object obj2 = arrayList3.get(i10);
                    i10++;
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
