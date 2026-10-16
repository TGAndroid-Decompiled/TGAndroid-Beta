package org.telegram.ui.Wallet;

import android.text.TextUtils;
import di.ya;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
public final class c0 {
    public String e;
    public boolean f32720g;
    public boolean h;
    public boolean f32721i;
    public boolean f32722j;
    public String f32723k;
    public final k0 f32725m;
    public final ArrayList f32716a = new ArrayList();
    public final ArrayList f32717b = new ArrayList();
    public final ArrayList f32718c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f32719f = "";
    public int f32724l = -1;

    public c0(k0 k0Var) {
        this.f32725m = k0Var;
        this.e = k0Var.r();
    }

    public static void a(c0 c0Var, TL_wallet.walletTransaction wallettransaction) {
        boolean z10;
        ArrayList arrayList = c0Var.f32718c;
        ArrayList arrayList2 = c0Var.f32717b;
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
        if (this.f32724l >= 0) {
            ConnectionsManager.getInstance(this.f32725m.f33092a).cancelRequest(this.f32724l, true);
            this.f32724l = -1;
        }
        if (this.f32722j) {
            this.f32720g = false;
            this.h = false;
        }
        this.f32722j = false;
        this.f32721i = false;
    }

    public final void c() {
        b();
        this.f32716a.clear();
        this.f32717b.clear();
        this.f32718c.clear();
        this.f32719f = "";
        this.f32720g = false;
        this.h = false;
        this.f32723k = null;
        f();
    }

    public final void d() {
        if (!this.f32721i && !this.f32720g) {
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
            str = this.f32719f;
        }
        getnfts.offset = str;
        if (TextUtils.isEmpty(str)) {
            i10 = 5;
        } else {
            i10 = 20;
        }
        getnfts.limit = i10;
        this.f32721i = true;
        this.f32722j = z10;
        this.f32723k = null;
        f();
        this.f32724l = ConnectionsManager.getInstance(this.f32725m.f33092a).sendRequestTyped(getnfts, new Object(), new ya(3, this, z10));
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
        ArrayList arrayList = this.f32716a;
        arrayList.clear();
        ArrayList arrayList2 = this.f32717b;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
            ArrayList arrayList3 = this.f32718c;
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
