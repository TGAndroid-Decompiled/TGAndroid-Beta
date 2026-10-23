package org.telegram.ui.Wallet;

import android.text.TextUtils;
import ei.ka;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
public final class e0 {
    public String e;
    public boolean f34141g;
    public boolean h;
    public boolean f34142i;
    public boolean f34143j;
    public String f34144k;
    public final m0 f34146m;
    public final ArrayList f34137a = new ArrayList();
    public final ArrayList f34138b = new ArrayList();
    public final ArrayList f34139c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f34140f = "";
    public int f34145l = -1;

    public e0(m0 m0Var) {
        this.f34146m = m0Var;
        this.e = m0Var.s();
    }

    public static void a(e0 e0Var, TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = e0Var.f34139c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((TL_wallet.walletTransaction) obj) == wallettransaction) {
                if (wallettransaction.failed && !e0Var.d(wallettransaction.nft.address)) {
                    e0Var.f34138b.add(0, wallettransaction.nft);
                }
                e0Var.h();
                e0Var.g();
                return;
            }
        }
    }

    public final void b() {
        if (this.f34145l >= 0) {
            ConnectionsManager.getInstance(this.f34146m.f34481a).cancelRequest(this.f34145l, true);
            this.f34145l = -1;
        }
        if (this.f34143j) {
            this.f34141g = false;
            this.h = false;
        }
        this.f34143j = false;
        this.f34142i = false;
    }

    public final void c() {
        b();
        this.f34137a.clear();
        this.f34138b.clear();
        this.f34139c.clear();
        this.f34140f = "";
        this.f34141g = false;
        this.h = false;
        this.f34144k = null;
        g();
    }

    public final boolean d(String str) {
        ArrayList arrayList = this.f34138b;
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
        if (!this.f34142i && !this.f34141g) {
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
            str = this.f34140f;
        }
        getnfts.offset = str;
        if (TextUtils.isEmpty(str)) {
            i10 = 5;
        } else {
            i10 = 20;
        }
        getnfts.limit = i10;
        this.f34142i = true;
        this.f34143j = z10;
        this.f34144k = null;
        g();
        this.f34145l = ConnectionsManager.getInstance(this.f34146m.f34481a).sendRequestTyped(getnfts, new Object(), new ka(3, this, z10));
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
        ArrayList arrayList = this.f34137a;
        arrayList.clear();
        ArrayList arrayList2 = this.f34138b;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
            ArrayList arrayList3 = this.f34139c;
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
