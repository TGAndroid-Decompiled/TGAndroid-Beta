package org.telegram.ui.Wallet;

import android.text.TextUtils;
import ei.ka;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
public final class d0 {
    public String e;
    public boolean f34391g;
    public boolean h;
    public boolean f34392i;
    public boolean f34393j;
    public String f34394k;
    public final l0 f34396m;
    public final ArrayList f34387a = new ArrayList();
    public final ArrayList f34388b = new ArrayList();
    public final ArrayList f34389c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f34390f = "";
    public int f34395l = -1;

    public d0(l0 l0Var) {
        this.f34396m = l0Var;
        this.e = l0Var.s();
    }

    public static void a(d0 d0Var, TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = d0Var.f34389c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((TL_wallet.walletTransaction) obj) == wallettransaction) {
                if (wallettransaction.failed && !d0Var.d(wallettransaction.nft.address)) {
                    d0Var.f34388b.add(0, wallettransaction.nft);
                }
                d0Var.h();
                d0Var.g();
                return;
            }
        }
    }

    public final void b() {
        if (this.f34395l >= 0) {
            ConnectionsManager.getInstance(this.f34396m.f34743a).cancelRequest(this.f34395l, true);
            this.f34395l = -1;
        }
        if (this.f34393j) {
            this.f34391g = false;
            this.h = false;
        }
        this.f34393j = false;
        this.f34392i = false;
    }

    public final void c() {
        b();
        this.f34387a.clear();
        this.f34388b.clear();
        this.f34389c.clear();
        this.f34390f = "";
        this.f34391g = false;
        this.h = false;
        this.f34394k = null;
        g();
    }

    public final boolean d(String str) {
        ArrayList arrayList = this.f34388b;
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
        if (!this.f34392i && !this.f34391g) {
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
            str = this.f34390f;
        }
        getnfts.offset = str;
        if (TextUtils.isEmpty(str)) {
            i10 = 5;
        } else {
            i10 = 20;
        }
        getnfts.limit = i10;
        this.f34392i = true;
        this.f34393j = z10;
        this.f34394k = null;
        g();
        this.f34395l = ConnectionsManager.getInstance(this.f34396m.f34743a).sendRequestTyped(getnfts, new Object(), new ka(3, this, z10));
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
        ArrayList arrayList = this.f34387a;
        arrayList.clear();
        ArrayList arrayList2 = this.f34388b;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
            ArrayList arrayList3 = this.f34389c;
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
