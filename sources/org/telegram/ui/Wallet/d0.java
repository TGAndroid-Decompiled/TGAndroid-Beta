package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
public final class d0 {
    public String e;
    public boolean f36470g;
    public boolean h;
    public boolean f36471i;
    public boolean f36472j;
    public String f36473k;
    public final l0 f36475m;
    public final ArrayList f36466a = new ArrayList();
    public final ArrayList f36467b = new ArrayList();
    public final ArrayList f36468c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f36469f = "";
    public int f36474l = -1;

    public d0(l0 l0Var) {
        this.f36475m = l0Var;
        this.e = l0Var.t();
    }

    public static void a(d0 d0Var, TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = d0Var.f36468c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((TL_wallet.walletTransaction) obj) == wallettransaction) {
                if (wallettransaction.failed && !d0Var.d(wallettransaction.nft.address)) {
                    d0Var.f36467b.add(0, wallettransaction.nft);
                }
                d0Var.h();
                d0Var.g();
                return;
            }
        }
    }

    public final void b() {
        if (this.f36474l >= 0) {
            ConnectionsManager.getInstance(this.f36475m.f36834a).cancelRequest(this.f36474l, true);
            this.f36474l = -1;
        }
        if (this.f36472j) {
            this.f36470g = false;
            this.h = false;
        }
        this.f36472j = false;
        this.f36471i = false;
    }

    public final void c() {
        b();
        this.f36466a.clear();
        this.f36467b.clear();
        this.f36468c.clear();
        this.f36469f = "";
        this.f36470g = false;
        this.h = false;
        this.f36473k = null;
        g();
    }

    public final boolean d(String str) {
        ArrayList arrayList = this.f36467b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (l0.b(((TL_wallet.nftItem) obj).address, str)) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (!this.f36471i && !this.f36470g) {
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
            str = this.f36469f;
        }
        getnfts.offset = str;
        if (TextUtils.isEmpty(str)) {
            i10 = 5;
        } else {
            i10 = 20;
        }
        getnfts.limit = i10;
        this.f36471i = true;
        this.f36472j = z10;
        this.f36473k = null;
        g();
        this.f36474l = ConnectionsManager.getInstance(this.f36475m.f36834a).sendRequestTyped(getnfts, new Object(), new fi.ga(3, this, z10));
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
        ArrayList arrayList = this.f36466a;
        arrayList.clear();
        ArrayList arrayList2 = this.f36467b;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
            ArrayList arrayList3 = this.f36468c;
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
