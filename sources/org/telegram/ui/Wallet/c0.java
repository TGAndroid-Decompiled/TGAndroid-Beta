package org.telegram.ui.Wallet;

import android.text.TextUtils;
import ci.za;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
public final class c0 {
    public String f34694e;
    public boolean f34696g;
    public boolean h;
    public boolean f34697i;
    public boolean f34698j;
    public String f34699k;
    public final k0 f34701m;
    public final ArrayList f34691a = new ArrayList();
    public final ArrayList f34692b = new ArrayList();
    public final ArrayList f34693c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f34695f = "";
    public int f34700l = -1;

    public c0(k0 k0Var) {
        this.f34701m = k0Var;
        this.f34694e = k0Var.r();
    }

    public static void a(c0 c0Var, TL_wallet.walletTransaction wallettransaction) {
        boolean z10;
        ArrayList arrayList = c0Var.f34693c;
        ArrayList arrayList2 = c0Var.f34692b;
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
        if (this.f34700l >= 0) {
            ConnectionsManager.getInstance(this.f34701m.f35093a).cancelRequest(this.f34700l, true);
            this.f34700l = -1;
        }
        if (this.f34698j) {
            this.f34696g = false;
            this.h = false;
        }
        this.f34698j = false;
        this.f34697i = false;
    }

    public final void c() {
        b();
        this.f34691a.clear();
        this.f34692b.clear();
        this.f34693c.clear();
        this.f34695f = "";
        this.f34696g = false;
        this.h = false;
        this.f34699k = null;
        f();
    }

    public final void d() {
        if (!this.f34697i && !this.f34696g) {
            e(!this.h);
        }
    }

    public final void e(boolean z10) {
        String str;
        int i10;
        if (TextUtils.isEmpty(this.f34694e)) {
            return;
        }
        TL_wallet.getNfts getnfts = new TL_wallet.getNfts();
        if (z10) {
            str = "";
        } else {
            str = this.f34695f;
        }
        getnfts.offset = str;
        if (TextUtils.isEmpty(str)) {
            i10 = 5;
        } else {
            i10 = 20;
        }
        getnfts.limit = i10;
        this.f34697i = true;
        this.f34698j = z10;
        this.f34699k = null;
        f();
        this.f34700l = ConnectionsManager.getInstance(this.f34701m.f35093a).sendRequestTyped(getnfts, new Object(), new za(3, this, z10));
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
        ArrayList arrayList = this.f34691a;
        arrayList.clear();
        ArrayList arrayList2 = this.f34692b;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
            ArrayList arrayList3 = this.f34693c;
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
