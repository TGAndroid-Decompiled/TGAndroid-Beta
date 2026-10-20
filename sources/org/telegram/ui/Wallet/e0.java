package org.telegram.ui.Wallet;

import android.text.TextUtils;
import ei.ka;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
public final class e0 {
    public String e;
    public boolean f34136g;
    public boolean h;
    public boolean f34137i;
    public boolean f34138j;
    public String f34139k;
    public final m0 f34141m;
    public final ArrayList f34132a = new ArrayList();
    public final ArrayList f34133b = new ArrayList();
    public final ArrayList f34134c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f34135f = "";
    public int f34140l = -1;

    public e0(m0 m0Var) {
        this.f34141m = m0Var;
        this.e = m0Var.s();
    }

    public static void a(e0 e0Var, TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = e0Var.f34134c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((TL_wallet.walletTransaction) obj) == wallettransaction) {
                if (wallettransaction.failed && !e0Var.d(wallettransaction.nft.address)) {
                    e0Var.f34133b.add(0, wallettransaction.nft);
                }
                e0Var.h();
                e0Var.g();
                return;
            }
        }
    }

    public final void b() {
        if (this.f34140l >= 0) {
            ConnectionsManager.getInstance(this.f34141m.f34476a).cancelRequest(this.f34140l, true);
            this.f34140l = -1;
        }
        if (this.f34138j) {
            this.f34136g = false;
            this.h = false;
        }
        this.f34138j = false;
        this.f34137i = false;
    }

    public final void c() {
        b();
        this.f34132a.clear();
        this.f34133b.clear();
        this.f34134c.clear();
        this.f34135f = "";
        this.f34136g = false;
        this.h = false;
        this.f34139k = null;
        g();
    }

    public final boolean d(String str) {
        ArrayList arrayList = this.f34133b;
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
        if (!this.f34137i && !this.f34136g) {
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
            str = this.f34135f;
        }
        getnfts.offset = str;
        if (TextUtils.isEmpty(str)) {
            i10 = 5;
        } else {
            i10 = 20;
        }
        getnfts.limit = i10;
        this.f34137i = true;
        this.f34138j = z10;
        this.f34139k = null;
        g();
        this.f34140l = ConnectionsManager.getInstance(this.f34141m.f34476a).sendRequestTyped(getnfts, new Object(), new ka(3, this, z10));
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
        ArrayList arrayList = this.f34132a;
        arrayList.clear();
        ArrayList arrayList2 = this.f34133b;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
            ArrayList arrayList3 = this.f34134c;
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
