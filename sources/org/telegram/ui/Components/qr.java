package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qr {
    public final int f38743a;
    public String f38744b;
    public final ArrayList f38745c;
    public final boolean[] d;
    public boolean[] f38746e;
    public boolean f38747f;
    public final int f38748g;
    public int h;
    public int f38749i;
    public final rr f38750j;

    public qr(rr rrVar, int i7, ArrayList arrayList) {
        this.f38750j = rrVar;
        this.f38743a = i7;
        int size = arrayList.size();
        this.f38748g = size;
        this.f38749i = 0;
        if (size > 0) {
            this.f38745c = arrayList;
            this.d = new boolean[size];
            this.f38747f = true;
            i();
        }
    }

    public final boolean a() {
        boolean[] zArr;
        for (int i7 = 0; i7 < this.f38748g; i7++) {
            if (!this.d[i7] || ((zArr = this.f38746e) != null && !zArr[i7])) {
                return false;
            }
        }
        return true;
    }

    public final void b(org.telegram.messenger.c20 c20Var) {
        for (int i7 = 0; i7 < this.f38748g; i7++) {
            boolean[] zArr = this.f38746e;
            if (zArr == null || zArr[i7]) {
                c20Var.a(i7, (TLObject) this.f38745c.get(i7));
            }
        }
    }

    public final void c(org.telegram.messenger.c20 c20Var) {
        boolean[] zArr;
        for (int i7 = 0; i7 < this.f38748g; i7++) {
            if (this.d[i7] && ((zArr = this.f38746e) == null || zArr[i7])) {
                c20Var.a(i7, (TLObject) this.f38745c.get(i7));
            }
        }
    }

    public final boolean d() {
        int i7;
        if (this.f38746e != null) {
            i7 = this.h;
        } else {
            i7 = this.f38748g;
        }
        if (i7 > 1) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        int i7;
        if (this.f38746e != null) {
            i7 = this.h;
        } else {
            i7 = this.f38748g;
        }
        if (i7 > 0) {
            return true;
        }
        return false;
    }

    public final void f() {
        boolean[] zArr;
        boolean[] zArr2;
        boolean z10 = false;
        int i7 = 0;
        while (true) {
            int i10 = this.f38748g;
            zArr = this.d;
            if (i7 >= i10) {
                break;
            } else if (!zArr[i7] || ((zArr2 = this.f38746e) != null && !zArr2[i7])) {
                i7++;
            }
        }
        z10 = true;
        Arrays.fill(zArr, !z10);
        h();
        this.f38750j.T1.O(true);
    }

    public final void g(int i7) {
        boolean[] zArr = this.f38746e;
        if (zArr != null && !zArr[i7]) {
            return;
        }
        boolean[] zArr2 = this.d;
        boolean z10 = zArr2[i7];
        zArr2[i7] = !z10;
        if (!z10) {
            this.f38749i++;
        } else {
            this.f38749i--;
        }
        this.f38750j.T1.O(true);
    }

    public final void h() {
        this.f38749i = 0;
        this.h = 0;
        for (int i7 = 0; i7 < this.f38748g; i7++) {
            boolean[] zArr = this.f38746e;
            boolean[] zArr2 = this.d;
            if (zArr == null) {
                if (zArr2[i7]) {
                    this.f38749i++;
                }
            } else if (zArr[i7]) {
                this.h++;
                if (zArr2[i7]) {
                    this.f38749i++;
                }
            }
        }
    }

    public final void i() {
        TLObject tLObject;
        String o4;
        String a02;
        String a03;
        String a04;
        String a05;
        int i7 = this.f38748g;
        if (i7 != 0) {
            for (int i10 = 0; i10 < i7; i10++) {
                boolean[] zArr = this.f38746e;
                if (zArr == null || zArr[i10]) {
                    tLObject = (TLObject) this.f38745c.get(i10);
                    break;
                }
            }
            tLObject = null;
            if (tLObject instanceof TLRPC.User) {
                o4 = org.telegram.messenger.q10.k((TLRPC.User) tLObject);
            } else {
                o4 = org.telegram.messenger.g5.o(tLObject);
            }
            int i11 = this.f38743a;
            if (i11 == 0) {
                this.f38744b = org.telegram.messenger.hd.M0(2131751502, null);
            } else if (i11 == 1) {
                if (d()) {
                    a05 = org.telegram.messenger.hd.M0(2131751582, null);
                } else {
                    a05 = org.telegram.messenger.hd.a0(null, null, 2131751587, o4);
                }
                this.f38744b = a05;
            } else if (i11 == 3) {
                if (d()) {
                    a04 = org.telegram.messenger.hd.M0(2131751577, null);
                } else {
                    a04 = org.telegram.messenger.hd.a0(null, null, 2131751578, o4);
                }
                this.f38744b = a04;
            } else if (i11 == 2) {
                if (this.f38750j.f39022c2) {
                    if (d()) {
                        a03 = org.telegram.messenger.hd.M0(2131751500, null);
                    } else {
                        a03 = org.telegram.messenger.hd.a0(null, null, 2131751501, o4);
                    }
                    this.f38744b = a03;
                    return;
                }
                if (d()) {
                    a02 = org.telegram.messenger.hd.M0(2131751567, null);
                } else {
                    a02 = org.telegram.messenger.hd.a0(null, null, 2131751568, o4);
                }
                this.f38744b = a02;
            }
        }
    }
}
