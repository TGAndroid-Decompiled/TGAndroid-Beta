package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kr {
    public final int f35462a;
    public String f35463b;
    public final ArrayList f35464c;
    public final boolean[] d;
    public boolean[] f35465e;
    public boolean f35466f;
    public final int f35467g;
    public int h;
    public int f35468i;
    public final lr f35469j;

    public kr(lr lrVar, int i3, ArrayList arrayList) {
        this.f35469j = lrVar;
        this.f35462a = i3;
        int size = arrayList.size();
        this.f35467g = size;
        this.f35468i = 0;
        if (size > 0) {
            this.f35464c = arrayList;
            this.d = new boolean[size];
            this.f35466f = true;
            i();
        }
    }

    public final boolean a() {
        boolean[] zArr;
        for (int i3 = 0; i3 < this.f35467g; i3++) {
            if (!this.d[i3] || ((zArr = this.f35465e) != null && !zArr[i3])) {
                return false;
            }
        }
        return true;
    }

    public final void b(org.telegram.messenger.x10 x10Var) {
        for (int i3 = 0; i3 < this.f35467g; i3++) {
            boolean[] zArr = this.f35465e;
            if (zArr == null || zArr[i3]) {
                x10Var.a(i3, (TLObject) this.f35464c.get(i3));
            }
        }
    }

    public final void c(org.telegram.messenger.x10 x10Var) {
        boolean[] zArr;
        for (int i3 = 0; i3 < this.f35467g; i3++) {
            if (this.d[i3] && ((zArr = this.f35465e) == null || zArr[i3])) {
                x10Var.a(i3, (TLObject) this.f35464c.get(i3));
            }
        }
    }

    public final boolean d() {
        int i3;
        if (this.f35465e != null) {
            i3 = this.h;
        } else {
            i3 = this.f35467g;
        }
        if (i3 > 1) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        int i3;
        if (this.f35465e != null) {
            i3 = this.h;
        } else {
            i3 = this.f35467g;
        }
        if (i3 > 0) {
            return true;
        }
        return false;
    }

    public final void f() {
        boolean[] zArr;
        boolean[] zArr2;
        boolean z10 = false;
        int i3 = 0;
        while (true) {
            int i10 = this.f35467g;
            zArr = this.d;
            if (i3 >= i10) {
                break;
            } else if (!zArr[i3] || ((zArr2 = this.f35465e) != null && !zArr2[i3])) {
                i3++;
            }
        }
        z10 = true;
        Arrays.fill(zArr, !z10);
        h();
        this.f35469j.Q1.O(true);
    }

    public final void g(int i3) {
        boolean[] zArr = this.f35465e;
        if (zArr != null && !zArr[i3]) {
            return;
        }
        boolean[] zArr2 = this.d;
        boolean z10 = zArr2[i3];
        zArr2[i3] = !z10;
        if (!z10) {
            this.f35468i++;
        } else {
            this.f35468i--;
        }
        this.f35469j.Q1.O(true);
    }

    public final void h() {
        this.f35468i = 0;
        this.h = 0;
        for (int i3 = 0; i3 < this.f35467g; i3++) {
            boolean[] zArr = this.f35465e;
            boolean[] zArr2 = this.d;
            if (zArr == null) {
                if (zArr2[i3]) {
                    this.f35468i++;
                }
            } else if (zArr[i3]) {
                this.h++;
                if (zArr2[i3]) {
                    this.f35468i++;
                }
            }
        }
    }

    public final void i() {
        TLObject tLObject;
        String o10;
        String a02;
        String a03;
        String a04;
        String a05;
        int i3 = this.f35467g;
        if (i3 != 0) {
            for (int i10 = 0; i10 < i3; i10++) {
                boolean[] zArr = this.f35465e;
                if (zArr == null || zArr[i10]) {
                    tLObject = (TLObject) this.f35464c.get(i10);
                    break;
                }
            }
            tLObject = null;
            if (tLObject instanceof TLRPC.User) {
                o10 = org.telegram.messenger.l10.k((TLRPC.User) tLObject);
            } else {
                o10 = org.telegram.messenger.g5.o(tLObject);
            }
            int i11 = this.f35462a;
            if (i11 == 0) {
                this.f35463b = org.telegram.messenger.bd.M0(2131751503, null);
            } else if (i11 == 1) {
                if (d()) {
                    a05 = org.telegram.messenger.bd.M0(2131751583, null);
                } else {
                    a05 = org.telegram.messenger.bd.a0(null, null, 2131751588, o10);
                }
                this.f35463b = a05;
            } else if (i11 == 3) {
                if (d()) {
                    a04 = org.telegram.messenger.bd.M0(2131751578, null);
                } else {
                    a04 = org.telegram.messenger.bd.a0(null, null, 2131751579, o10);
                }
                this.f35463b = a04;
            } else if (i11 == 2) {
                if (this.f35469j.Z1) {
                    if (d()) {
                        a03 = org.telegram.messenger.bd.M0(2131751501, null);
                    } else {
                        a03 = org.telegram.messenger.bd.a0(null, null, 2131751502, o10);
                    }
                    this.f35463b = a03;
                    return;
                }
                if (d()) {
                    a02 = org.telegram.messenger.bd.M0(2131751568, null);
                } else {
                    a02 = org.telegram.messenger.bd.a0(null, null, 2131751569, o10);
                }
                this.f35463b = a02;
            }
        }
    }
}
