package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zr {
    public final int f42965a;
    public String f42966b;
    public final ArrayList f42967c;
    public final boolean[] d;
    public boolean[] f42968e;
    public boolean f42969f;
    public final int f42970g;
    public int h;
    public int f42971i;
    public final as f42972j;

    public zr(as asVar, int i7, ArrayList arrayList) {
        this.f42972j = asVar;
        this.f42965a = i7;
        int size = arrayList.size();
        this.f42970g = size;
        this.f42971i = 0;
        if (size > 0) {
            this.f42967c = arrayList;
            this.d = new boolean[size];
            this.f42969f = true;
            i();
        }
    }

    public final boolean a() {
        boolean[] zArr;
        for (int i7 = 0; i7 < this.f42970g; i7++) {
            if (!this.d[i7] || ((zArr = this.f42968e) != null && !zArr[i7])) {
                return false;
            }
        }
        return true;
    }

    public final void b(org.telegram.messenger.b20 b20Var) {
        for (int i7 = 0; i7 < this.f42970g; i7++) {
            boolean[] zArr = this.f42968e;
            if (zArr == null || zArr[i7]) {
                b20Var.a(i7, (TLObject) this.f42967c.get(i7));
            }
        }
    }

    public final void c(org.telegram.messenger.b20 b20Var) {
        boolean[] zArr;
        for (int i7 = 0; i7 < this.f42970g; i7++) {
            if (this.d[i7] && ((zArr = this.f42968e) == null || zArr[i7])) {
                b20Var.a(i7, (TLObject) this.f42967c.get(i7));
            }
        }
    }

    public final boolean d() {
        int i7;
        if (this.f42968e != null) {
            i7 = this.h;
        } else {
            i7 = this.f42970g;
        }
        if (i7 > 1) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        int i7;
        if (this.f42968e != null) {
            i7 = this.h;
        } else {
            i7 = this.f42970g;
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
            int i10 = this.f42970g;
            zArr = this.d;
            if (i7 >= i10) {
                break;
            } else if (!zArr[i7] || ((zArr2 = this.f42968e) != null && !zArr2[i7])) {
                i7++;
            }
        }
        z10 = true;
        Arrays.fill(zArr, !z10);
        h();
        this.f42972j.T1.O(true);
    }

    public final void g(int i7) {
        boolean[] zArr = this.f42968e;
        if (zArr != null && !zArr[i7]) {
            return;
        }
        boolean[] zArr2 = this.d;
        boolean z10 = zArr2[i7];
        zArr2[i7] = !z10;
        if (!z10) {
            this.f42971i++;
        } else {
            this.f42971i--;
        }
        this.f42972j.T1.O(true);
    }

    public final void h() {
        this.f42971i = 0;
        this.h = 0;
        for (int i7 = 0; i7 < this.f42970g; i7++) {
            boolean[] zArr = this.f42968e;
            boolean[] zArr2 = this.d;
            if (zArr == null) {
                if (zArr2[i7]) {
                    this.f42971i++;
                }
            } else if (zArr[i7]) {
                this.h++;
                if (zArr2[i7]) {
                    this.f42971i++;
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
        int i7 = this.f42970g;
        if (i7 != 0) {
            for (int i10 = 0; i10 < i7; i10++) {
                boolean[] zArr = this.f42968e;
                if (zArr == null || zArr[i10]) {
                    tLObject = (TLObject) this.f42967c.get(i10);
                    break;
                }
            }
            tLObject = null;
            if (tLObject instanceof TLRPC.User) {
                o4 = org.telegram.messenger.p10.l((TLRPC.User) tLObject);
            } else {
                o4 = org.telegram.messenger.i5.o(tLObject);
            }
            int i11 = this.f42965a;
            if (i11 == 0) {
                this.f42966b = org.telegram.messenger.hd.N0(2131751490, null);
            } else if (i11 == 1) {
                if (d()) {
                    a05 = org.telegram.messenger.hd.N0(2131751570, null);
                } else {
                    a05 = org.telegram.messenger.hd.a0(null, null, 2131751575, o4);
                }
                this.f42966b = a05;
            } else if (i11 == 3) {
                if (d()) {
                    a04 = org.telegram.messenger.hd.N0(2131751565, null);
                } else {
                    a04 = org.telegram.messenger.hd.a0(null, null, 2131751566, o4);
                }
                this.f42966b = a04;
            } else if (i11 == 2) {
                if (this.f42972j.f33607c2) {
                    if (d()) {
                        a03 = org.telegram.messenger.hd.N0(2131751488, null);
                    } else {
                        a03 = org.telegram.messenger.hd.a0(null, null, 2131751489, o4);
                    }
                    this.f42966b = a03;
                    return;
                }
                if (d()) {
                    a02 = org.telegram.messenger.hd.N0(2131751555, null);
                } else {
                    a02 = org.telegram.messenger.hd.a0(null, null, 2131751556, o4);
                }
                this.f42966b = a02;
            }
        }
    }
}
