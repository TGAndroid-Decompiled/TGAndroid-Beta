package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
public final class e0 {
    public String f42413e;
    public boolean f42415g;
    public boolean h;
    public boolean f42416i;
    public boolean f42417j;
    public String f42418k;
    public final m0 f42420m;
    public final ArrayList f42410a = new ArrayList();
    public final ArrayList f42411b = new ArrayList();
    public final ArrayList f42412c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f42414f = "";
    public int f42419l = -1;

    public e0(m0 m0Var) {
        this.f42420m = m0Var;
        this.f42413e = m0Var.t();
    }

    public static void a(e0 e0Var, TL_wallet.walletTransaction wallettransaction) {
        ArrayList arrayList = e0Var.f42412c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((TL_wallet.walletTransaction) obj) == wallettransaction) {
                if (wallettransaction.failed && !e0Var.d(wallettransaction.nft.address)) {
                    e0Var.f42411b.add(0, wallettransaction.nft);
                }
                e0Var.h();
                e0Var.g();
                return;
            }
        }
    }

    public final void b() {
        if (this.f42419l >= 0) {
            ConnectionsManager.getInstance(this.f42420m.f42762a).cancelRequest(this.f42419l, true);
            this.f42419l = -1;
        }
        if (this.f42417j) {
            this.f42415g = false;
            this.h = false;
        }
        this.f42417j = false;
        this.f42416i = false;
    }

    public final void c() {
        b();
        this.f42410a.clear();
        this.f42411b.clear();
        this.f42412c.clear();
        this.f42414f = "";
        this.f42415g = false;
        this.h = false;
        this.f42418k = null;
        g();
    }

    public final boolean d(String str) {
        ArrayList arrayList = this.f42411b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (m0.b(((TL_wallet.nftItem) obj).address, str)) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (!this.f42416i && !this.f42415g) {
            f(!this.h);
        }
    }

    public final void f(boolean z9) {
        String str;
        int i7;
        if (TextUtils.isEmpty(this.f42413e)) {
            return;
        }
        TL_wallet.getNfts getnfts = new TL_wallet.getNfts();
        if (z9) {
            str = "";
        } else {
            str = this.f42414f;
        }
        getnfts.offset = str;
        if (TextUtils.isEmpty(str)) {
            i7 = 5;
        } else {
            i7 = 20;
        }
        getnfts.limit = i7;
        this.f42416i = true;
        this.f42417j = z9;
        this.f42418k = null;
        g();
        this.f42419l = ConnectionsManager.getInstance(this.f42420m.f42762a).sendRequestTyped(getnfts, new d3.b(1), new fi.m9(3, this, z9));
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
        ArrayList arrayList = this.f42410a;
        arrayList.clear();
        ArrayList arrayList2 = this.f42411b;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
            ArrayList arrayList3 = this.f42412c;
            int size2 = arrayList3.size();
            int i10 = 0;
            while (true) {
                if (i10 < size2) {
                    Object obj2 = arrayList3.get(i10);
                    i10++;
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                    if (wallettransaction.failed || !m0.b(wallettransaction.nft.address, nftitem.address)) {
                    }
                } else {
                    arrayList.add(nftitem);
                    break;
                }
            }
        }
    }
}
