package org.telegram.ui.Wallet;

import android.text.TextUtils;
import di.ya;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
public final class b0 {
    public String e;
    public boolean f32944g;
    public boolean h;
    public boolean f32945i;
    public boolean f32946j;
    public String f32947k;
    public final j0 f32949m;
    public final ArrayList f32940a = new ArrayList();
    public final ArrayList f32941b = new ArrayList();
    public final ArrayList f32942c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f32943f = "";
    public int f32948l = -1;

    public b0(j0 j0Var) {
        this.f32949m = j0Var;
        this.e = j0Var.r();
    }

    public static void a(b0 b0Var, TL_wallet.walletTransaction wallettransaction) {
        boolean z10;
        ArrayList arrayList = b0Var.f32942c;
        ArrayList arrayList2 = b0Var.f32941b;
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
                            if (j0.b(((TL_wallet.nftItem) obj2).address, str)) {
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
                b0Var.g();
                b0Var.f();
                return;
            }
        }
    }

    public final void b() {
        if (this.f32948l >= 0) {
            ConnectionsManager.getInstance(this.f32949m.f33319a).cancelRequest(this.f32948l, true);
            this.f32948l = -1;
        }
        if (this.f32946j) {
            this.f32944g = false;
            this.h = false;
        }
        this.f32946j = false;
        this.f32945i = false;
    }

    public final void c() {
        b();
        this.f32940a.clear();
        this.f32941b.clear();
        this.f32942c.clear();
        this.f32943f = "";
        this.f32944g = false;
        this.h = false;
        this.f32947k = null;
        f();
    }

    public final void d() {
        if (!this.f32945i && !this.f32944g) {
            e(!this.h);
        }
    }

    public final void e(boolean z10) {
        String str;
        int i10;
        if (TextUtils.isEmpty(this.e)) {
            return;
        }
        TL_wallet.getNfts getnfts = new TL_wallet.getNfts();
        if (z10) {
            str = "";
        } else {
            str = this.f32943f;
        }
        getnfts.offset = str;
        if (TextUtils.isEmpty(str)) {
            i10 = 5;
        } else {
            i10 = 20;
        }
        getnfts.limit = i10;
        this.f32945i = true;
        this.f32946j = z10;
        this.f32947k = null;
        f();
        this.f32948l = ConnectionsManager.getInstance(this.f32949m.f33319a).sendRequestTyped(getnfts, new Object(), new ya(3, this, z10));
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
        ArrayList arrayList = this.f32940a;
        arrayList.clear();
        ArrayList arrayList2 = this.f32941b;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
            ArrayList arrayList3 = this.f32942c;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (true) {
                if (i11 < size2) {
                    Object obj2 = arrayList3.get(i11);
                    i11++;
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                    if (wallettransaction.failed || !j0.b(wallettransaction.nft.address, nftitem.address)) {
                    }
                } else {
                    arrayList.add(nftitem);
                    break;
                }
            }
        }
    }
}
