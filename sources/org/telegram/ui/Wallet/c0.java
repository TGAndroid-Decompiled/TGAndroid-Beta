package org.telegram.ui.Wallet;

import android.text.TextUtils;
import ci.za;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
public final class c0 {
    public String f34761e;
    public boolean f34763g;
    public boolean h;
    public boolean f34764i;
    public boolean f34765j;
    public String f34766k;
    public final k0 f34768m;
    public final ArrayList f34758a = new ArrayList();
    public final ArrayList f34759b = new ArrayList();
    public final ArrayList f34760c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f34762f = "";
    public int f34767l = -1;

    public c0(k0 k0Var) {
        this.f34768m = k0Var;
        this.f34761e = k0Var.r();
    }

    public static void a(c0 c0Var, TL_wallet.walletTransaction wallettransaction) {
        boolean z10;
        ArrayList arrayList = c0Var.f34760c;
        ArrayList arrayList2 = c0Var.f34759b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((TL_wallet.walletTransaction) obj) == wallettransaction) {
                if (wallettransaction.failed) {
                    String str = wallettransaction.nft.address;
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size2) {
                            Object obj2 = arrayList2.get(i11);
                            i11++;
                            if (k0.b(((TL_wallet.nftItem) obj2).address, str)) {
                                z10 = true;
                                break;
                            }
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                    if (!z10) {
                        arrayList2.add(0, wallettransaction.nft);
                    }
                }
                c0Var.g();
                c0Var.f();
                return;
            }
        }
    }

    public final void b() {
        if (this.f34767l >= 0) {
            ConnectionsManager.getInstance(this.f34768m.f35155a).cancelRequest(this.f34767l, true);
            this.f34767l = -1;
        }
        if (this.f34765j) {
            this.f34763g = false;
            this.h = false;
        }
        this.f34765j = false;
        this.f34764i = false;
    }

    public final void c() {
        b();
        this.f34758a.clear();
        this.f34759b.clear();
        this.f34760c.clear();
        this.f34762f = "";
        this.f34763g = false;
        this.h = false;
        this.f34766k = null;
        f();
    }

    public final void d() {
        if (!this.f34764i && !this.f34763g) {
            e(!this.h);
        }
    }

    public final void e(boolean z10) {
        String str;
        int i10;
        if (TextUtils.isEmpty(this.f34761e)) {
            return;
        }
        TL_wallet.getNfts getnfts = new TL_wallet.getNfts();
        if (z10) {
            str = "";
        } else {
            str = this.f34762f;
        }
        getnfts.offset = str;
        if (TextUtils.isEmpty(str)) {
            i10 = 5;
        } else {
            i10 = 20;
        }
        getnfts.limit = i10;
        this.f34764i = true;
        this.f34765j = z10;
        this.f34766k = null;
        f();
        this.f34767l = ConnectionsManager.getInstance(this.f34768m.f35155a).sendRequestTyped(getnfts, new Object(), new za(3, this, z10));
    }

    public final void f() {
        ArrayList arrayList = new ArrayList(this.d);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void g() {
        ArrayList arrayList = this.f34758a;
        arrayList.clear();
        ArrayList arrayList2 = this.f34759b;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
            ArrayList arrayList3 = this.f34760c;
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
