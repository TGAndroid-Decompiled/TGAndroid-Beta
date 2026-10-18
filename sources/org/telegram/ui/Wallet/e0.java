package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
public final class e0 {
    public String e;
    public boolean f34164g;
    public boolean h;
    public boolean f34165i;
    public boolean f34166j;
    public String f34167k;
    public final m0 f34169m;
    public final ArrayList f34160a = new ArrayList();
    public final ArrayList f34161b = new ArrayList();
    public final ArrayList f34162c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f34163f = "";
    public int f34168l = -1;

    public e0(m0 m0Var) {
        this.f34169m = m0Var;
        this.e = m0Var.s();
    }

    public static void a(e0 e0Var, TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = e0Var.f34162c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((TL_wallet.walletTransaction) obj) == wallettransaction) {
                if (wallettransaction.failed && !e0Var.d(wallettransaction.nft.address)) {
                    e0Var.f34161b.add(0, wallettransaction.nft);
                }
                e0Var.h();
                e0Var.g();
                return;
            }
        }
    }

    public final void b() {
        if (this.f34168l >= 0) {
            ConnectionsManager.getInstance(this.f34169m.f34530a).cancelRequest(this.f34168l, true);
            this.f34168l = -1;
        }
        if (this.f34166j) {
            this.f34164g = false;
            this.h = false;
        }
        this.f34166j = false;
        this.f34165i = false;
    }

    public final void c() {
        b();
        this.f34160a.clear();
        this.f34161b.clear();
        this.f34162c.clear();
        this.f34163f = "";
        this.f34164g = false;
        this.h = false;
        this.f34167k = null;
        g();
    }

    public final boolean d(String str) {
        ArrayList arrayList = this.f34161b;
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
        if (!this.f34165i && !this.f34164g) {
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
            str = this.f34163f;
        }
        getnfts.offset = str;
        if (TextUtils.isEmpty(str)) {
            i10 = 5;
        } else {
            i10 = 20;
        }
        getnfts.limit = i10;
        this.f34165i = true;
        this.f34166j = z10;
        this.f34167k = null;
        g();
        this.f34168l = ConnectionsManager.getInstance(this.f34169m.f34530a).sendRequestTyped(getnfts, new Object(), new ei.ka(3, this, z10));
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
        ArrayList arrayList = this.f34160a;
        arrayList.clear();
        ArrayList arrayList2 = this.f34161b;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
            ArrayList arrayList3 = this.f34162c;
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
