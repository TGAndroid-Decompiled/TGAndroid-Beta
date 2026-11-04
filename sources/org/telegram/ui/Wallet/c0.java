package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
public final class c0 {
    public String f42363e;
    public boolean f42365g;
    public boolean h;
    public boolean f42366i;
    public boolean f42367j;
    public String f42368k;
    public final k0 f42370m;
    public final ArrayList f42360a = new ArrayList();
    public final ArrayList f42361b = new ArrayList();
    public final ArrayList f42362c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f42364f = "";
    public int f42369l = -1;

    public c0(k0 k0Var) {
        this.f42370m = k0Var;
        this.f42363e = k0Var.t();
    }

    public static void a(c0 c0Var, TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = c0Var.f42362c;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            if (((TL_wallet.walletTransaction) obj) == wallettransaction) {
                if (wallettransaction.failed && !c0Var.d(wallettransaction.nft.address)) {
                    c0Var.f42361b.add(0, wallettransaction.nft);
                }
                c0Var.h();
                c0Var.g();
                return;
            }
        }
    }

    public final void b() {
        if (this.f42369l >= 0) {
            ConnectionsManager.getInstance(this.f42370m.f42718a).cancelRequest(this.f42369l, true);
            this.f42369l = -1;
        }
        if (this.f42367j) {
            this.f42365g = false;
            this.h = false;
        }
        this.f42367j = false;
        this.f42366i = false;
    }

    public final void c() {
        b();
        this.f42360a.clear();
        this.f42361b.clear();
        this.f42362c.clear();
        this.f42364f = "";
        this.f42365g = false;
        this.h = false;
        this.f42368k = null;
        g();
    }

    public final boolean d(String str) {
        ArrayList arrayList = this.f42361b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            if (k0.b(((TL_wallet.nftItem) obj).address, str)) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (!this.f42366i && !this.f42365g) {
            f(!this.h);
        }
    }

    public final void f(boolean z10) {
        String str;
        int i3;
        if (TextUtils.isEmpty(this.f42363e)) {
            return;
        }
        TL_wallet.getNfts getnfts = new TL_wallet.getNfts();
        if (z10) {
            str = "";
        } else {
            str = this.f42364f;
        }
        getnfts.offset = str;
        if (TextUtils.isEmpty(str)) {
            i3 = 5;
        } else {
            i3 = 20;
        }
        getnfts.limit = i3;
        this.f42366i = true;
        this.f42367j = z10;
        this.f42368k = null;
        g();
        this.f42369l = ConnectionsManager.getInstance(this.f42370m.f42718a).sendRequestTyped(getnfts, new c3.b(1), new gi.m9(3, this, z10));
    }

    public final void g() {
        ArrayList arrayList = new ArrayList(this.d);
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((Runnable) obj).run();
        }
    }

    public final void h() {
        ArrayList arrayList = this.f42360a;
        arrayList.clear();
        ArrayList arrayList2 = this.f42361b;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
            ArrayList arrayList3 = this.f42362c;
            int size2 = arrayList3.size();
            int i10 = 0;
            while (true) {
                if (i10 < size2) {
                    Object obj2 = arrayList3.get(i10);
                    i10++;
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
