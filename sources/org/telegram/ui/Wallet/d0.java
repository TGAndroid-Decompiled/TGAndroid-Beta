package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
public final class d0 {
    public String f43715e;
    public boolean f43717g;
    public boolean h;
    public boolean f43718i;
    public boolean f43719j;
    public String f43720k;
    public final l0 f43722m;
    public final ArrayList f43712a = new ArrayList();
    public final ArrayList f43713b = new ArrayList();
    public final ArrayList f43714c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f43716f = "";
    public int f43721l = -1;

    public d0(l0 l0Var) {
        this.f43722m = l0Var;
        this.f43715e = l0Var.t();
    }

    public static void a(d0 d0Var, TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = d0Var.f43714c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((TL_wallet.walletTransaction) obj) == wallettransaction) {
                if (wallettransaction.failed && !d0Var.d(wallettransaction.nft.address)) {
                    d0Var.f43713b.add(0, wallettransaction.nft);
                }
                d0Var.h();
                d0Var.g();
                return;
            }
        }
    }

    public final void b() {
        if (this.f43721l >= 0) {
            ConnectionsManager.getInstance(this.f43722m.f44078a).cancelRequest(this.f43721l, true);
            this.f43721l = -1;
        }
        if (this.f43719j) {
            this.f43717g = false;
            this.h = false;
        }
        this.f43719j = false;
        this.f43718i = false;
    }

    public final void c() {
        b();
        this.f43712a.clear();
        this.f43713b.clear();
        this.f43714c.clear();
        this.f43716f = "";
        this.f43717g = false;
        this.h = false;
        this.f43720k = null;
        g();
    }

    public final boolean d(String str) {
        ArrayList arrayList = this.f43713b;
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
        if (!this.f43718i && !this.f43717g) {
            f(!this.h);
        }
    }

    public final void f(boolean z10) {
        String str;
        int i7;
        if (TextUtils.isEmpty(this.f43715e)) {
            return;
        }
        TL_wallet.getNfts getnfts = new TL_wallet.getNfts();
        if (z10) {
            str = "";
        } else {
            str = this.f43716f;
        }
        getnfts.offset = str;
        if (TextUtils.isEmpty(str)) {
            i7 = 5;
        } else {
            i7 = 20;
        }
        getnfts.limit = i7;
        this.f43718i = true;
        this.f43719j = z10;
        this.f43720k = null;
        g();
        this.f43721l = ConnectionsManager.getInstance(this.f43722m.f44078a).sendRequestTyped(getnfts, new d3.b(1), new hi.j9(3, this, z10));
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
        ArrayList arrayList = this.f43712a;
        arrayList.clear();
        ArrayList arrayList2 = this.f43713b;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
            ArrayList arrayList3 = this.f43714c;
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
