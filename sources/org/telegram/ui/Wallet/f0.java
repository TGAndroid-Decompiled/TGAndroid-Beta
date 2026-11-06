package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
public final class f0 {
    public String f42421e;
    public boolean f42423g;
    public boolean h;
    public boolean f42424i;
    public boolean f42425j;
    public String f42426k;
    public final n0 f42428m;
    public final ArrayList f42418a = new ArrayList();
    public final ArrayList f42419b = new ArrayList();
    public final ArrayList f42420c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f42422f = "";
    public int f42427l = -1;

    public f0(n0 n0Var) {
        this.f42428m = n0Var;
        this.f42421e = n0Var.t();
    }

    public static void a(f0 f0Var, TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = f0Var.f42420c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((TL_wallet.walletTransaction) obj) == wallettransaction) {
                if (wallettransaction.failed && !f0Var.d(wallettransaction.nft.address)) {
                    f0Var.f42419b.add(0, wallettransaction.nft);
                }
                f0Var.h();
                f0Var.g();
                return;
            }
        }
    }

    public final void b() {
        if (this.f42427l >= 0) {
            ConnectionsManager.getInstance(this.f42428m.f42768a).cancelRequest(this.f42427l, true);
            this.f42427l = -1;
        }
        if (this.f42425j) {
            this.f42423g = false;
            this.h = false;
        }
        this.f42425j = false;
        this.f42424i = false;
    }

    public final void c() {
        b();
        this.f42418a.clear();
        this.f42419b.clear();
        this.f42420c.clear();
        this.f42422f = "";
        this.f42423g = false;
        this.h = false;
        this.f42426k = null;
        g();
    }

    public final boolean d(String str) {
        ArrayList arrayList = this.f42419b;
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
        if (!this.f42424i && !this.f42423g) {
            f(!this.h);
        }
    }

    public final void f(boolean z9) {
        String str;
        int i7;
        if (TextUtils.isEmpty(this.f42421e)) {
            return;
        }
        TL_wallet.getNfts getnfts = new TL_wallet.getNfts();
        if (z9) {
            str = "";
        } else {
            str = this.f42422f;
        }
        getnfts.offset = str;
        if (TextUtils.isEmpty(str)) {
            i7 = 5;
        } else {
            i7 = 20;
        }
        getnfts.limit = i7;
        this.f42424i = true;
        this.f42425j = z9;
        this.f42426k = null;
        g();
        this.f42427l = ConnectionsManager.getInstance(this.f42428m.f42768a).sendRequestTyped(getnfts, new d3.b(1), new fi.m9(3, this, z9));
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
        ArrayList arrayList = this.f42418a;
        arrayList.clear();
        ArrayList arrayList2 = this.f42419b;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
            ArrayList arrayList3 = this.f42420c;
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
