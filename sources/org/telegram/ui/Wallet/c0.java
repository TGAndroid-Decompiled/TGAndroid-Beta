package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.cv0;
public final class c0 {
    public String e;
    public boolean f34300g;
    public boolean h;
    public boolean f34301i;
    public boolean f34302j;
    public String f34303k;
    public final k0 f34305m;
    public final ArrayList f34296a = new ArrayList();
    public final ArrayList f34297b = new ArrayList();
    public final ArrayList f34298c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f34299f = "";
    public int f34304l = -1;

    public c0(k0 k0Var) {
        this.f34305m = k0Var;
        this.e = k0Var.t();
    }

    public static void a(c0 c0Var, TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = c0Var.f34298c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((TL_wallet.walletTransaction) obj) == wallettransaction) {
                if (wallettransaction.failed && !c0Var.d(wallettransaction.nft.address)) {
                    c0Var.f34297b.add(0, wallettransaction.nft);
                }
                c0Var.h();
                c0Var.g();
                return;
            }
        }
    }

    public final void b() {
        if (this.f34304l >= 0) {
            ConnectionsManager.getInstance(this.f34305m.f34776a).cancelRequest(this.f34304l, true);
            this.f34304l = -1;
        }
        if (this.f34302j) {
            this.f34300g = false;
            this.h = false;
        }
        this.f34302j = false;
        this.f34301i = false;
    }

    public final void c() {
        b();
        this.f34296a.clear();
        this.f34297b.clear();
        this.f34298c.clear();
        this.f34299f = "";
        this.f34300g = false;
        this.h = false;
        this.f34303k = null;
        g();
    }

    public final boolean d(String str) {
        ArrayList arrayList = this.f34297b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (k0.b(((TL_wallet.nftItem) obj).address, str)) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (!this.f34301i && !this.f34300g) {
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
            str = this.f34299f;
        }
        getnfts.offset = str;
        if (TextUtils.isEmpty(str)) {
            i10 = 5;
        } else {
            i10 = 20;
        }
        getnfts.limit = i10;
        this.f34301i = true;
        this.f34302j = z10;
        this.f34303k = null;
        g();
        this.f34304l = ConnectionsManager.getInstance(this.f34305m.f34776a).sendRequestTyped(getnfts, new a3.b(1), new cv0(1, this, z10));
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
        ArrayList arrayList = this.f34296a;
        arrayList.clear();
        ArrayList arrayList2 = this.f34297b;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
            ArrayList arrayList3 = this.f34298c;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (true) {
                if (i11 < size2) {
                    Object obj2 = arrayList3.get(i11);
                    i11++;
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
