package org.telegram.ui.Wallet;

import android.text.TextUtils;
import ei.ka;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
public final class e0 {
    public String e;
    public boolean f34108g;
    public boolean h;
    public boolean f34109i;
    public boolean f34110j;
    public String f34111k;
    public final m0 f34113m;
    public final ArrayList f34104a = new ArrayList();
    public final ArrayList f34105b = new ArrayList();
    public final ArrayList f34106c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f34107f = "";
    public int f34112l = -1;

    public e0(m0 m0Var) {
        this.f34113m = m0Var;
        this.e = m0Var.s();
    }

    public static void a(e0 e0Var, TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = e0Var.f34106c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((TL_wallet.walletTransaction) obj) == wallettransaction) {
                if (wallettransaction.failed && !e0Var.d(wallettransaction.nft.address)) {
                    e0Var.f34105b.add(0, wallettransaction.nft);
                }
                e0Var.h();
                e0Var.g();
                return;
            }
        }
    }

    public final void b() {
        if (this.f34112l >= 0) {
            ConnectionsManager.getInstance(this.f34113m.f34451a).cancelRequest(this.f34112l, true);
            this.f34112l = -1;
        }
        if (this.f34110j) {
            this.f34108g = false;
            this.h = false;
        }
        this.f34110j = false;
        this.f34109i = false;
    }

    public final void c() {
        b();
        this.f34104a.clear();
        this.f34105b.clear();
        this.f34106c.clear();
        this.f34107f = "";
        this.f34108g = false;
        this.h = false;
        this.f34111k = null;
        g();
    }

    public final boolean d(String str) {
        ArrayList arrayList = this.f34105b;
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
        if (!this.f34109i && !this.f34108g) {
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
            str = this.f34107f;
        }
        getnfts.offset = str;
        if (TextUtils.isEmpty(str)) {
            i10 = 5;
        } else {
            i10 = 20;
        }
        getnfts.limit = i10;
        this.f34109i = true;
        this.f34110j = z10;
        this.f34111k = null;
        g();
        this.f34112l = ConnectionsManager.getInstance(this.f34113m.f34451a).sendRequestTyped(getnfts, new Object(), new ka(3, this, z10));
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
        ArrayList arrayList = this.f34104a;
        arrayList.clear();
        ArrayList arrayList2 = this.f34105b;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
            ArrayList arrayList3 = this.f34106c;
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
