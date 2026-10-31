package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ur {
    public final int f31013a;
    public String f31014b;
    public final ArrayList f31015c;
    public final boolean[] d;
    public boolean[] e;
    public boolean f31016f;
    public final int f31017g;
    public int h;
    public int f31018i;
    public final vr f31019j;

    public ur(vr vrVar, int i10, ArrayList arrayList) {
        this.f31019j = vrVar;
        this.f31013a = i10;
        int size = arrayList.size();
        this.f31017g = size;
        this.f31018i = 0;
        if (size > 0) {
            this.f31015c = arrayList;
            this.d = new boolean[size];
            this.f31016f = true;
            i();
        }
    }

    public final boolean a() {
        boolean[] zArr;
        for (int i10 = 0; i10 < this.f31017g; i10++) {
            if (!this.d[i10] || ((zArr = this.e) != null && !zArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final void b(org.telegram.messenger.t20 t20Var) {
        for (int i10 = 0; i10 < this.f31017g; i10++) {
            boolean[] zArr = this.e;
            if (zArr == null || zArr[i10]) {
                t20Var.a(i10, (TLObject) this.f31015c.get(i10));
            }
        }
    }

    public final void c(org.telegram.messenger.t20 t20Var) {
        boolean[] zArr;
        for (int i10 = 0; i10 < this.f31017g; i10++) {
            if (this.d[i10] && ((zArr = this.e) == null || zArr[i10])) {
                t20Var.a(i10, (TLObject) this.f31015c.get(i10));
            }
        }
    }

    public final boolean d() {
        int i10;
        if (this.e != null) {
            i10 = this.h;
        } else {
            i10 = this.f31017g;
        }
        if (i10 > 1) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        int i10;
        if (this.e != null) {
            i10 = this.h;
        } else {
            i10 = this.f31017g;
        }
        if (i10 > 0) {
            return true;
        }
        return false;
    }

    public final void f() {
        boolean[] zArr;
        boolean[] zArr2;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            int i11 = this.f31017g;
            zArr = this.d;
            if (i10 >= i11) {
                break;
            } else if (!zArr[i10] || ((zArr2 = this.e) != null && !zArr2[i10])) {
                i10++;
            }
        }
        z10 = true;
        Arrays.fill(zArr, !z10);
        h();
        this.f31019j.P1.O(true);
    }

    public final void g(int i10) {
        boolean[] zArr = this.e;
        if (zArr != null && !zArr[i10]) {
            return;
        }
        boolean[] zArr2 = this.d;
        boolean z10 = zArr2[i10];
        zArr2[i10] = !z10;
        if (!z10) {
            this.f31018i++;
        } else {
            this.f31018i--;
        }
        this.f31019j.P1.O(true);
    }

    public final void h() {
        this.f31018i = 0;
        this.h = 0;
        for (int i10 = 0; i10 < this.f31017g; i10++) {
            boolean[] zArr = this.e;
            boolean[] zArr2 = this.d;
            if (zArr == null) {
                if (zArr2[i10]) {
                    this.f31018i++;
                }
            } else if (zArr[i10]) {
                this.h++;
                if (zArr2[i10]) {
                    this.f31018i++;
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
        int i10 = this.f31017g;
        if (i10 != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                boolean[] zArr = this.e;
                if (zArr == null || zArr[i11]) {
                    tLObject = (TLObject) this.f31015c.get(i11);
                    break;
                }
            }
            tLObject = null;
            if (tLObject instanceof TLRPC.User) {
                o10 = org.telegram.messenger.h20.k((TLRPC.User) tLObject);
            } else {
                o10 = org.telegram.messenger.i5.o(tLObject);
            }
            int i12 = this.f31013a;
            if (i12 == 0) {
                this.f31014b = org.telegram.messenger.cd.L0(2131751503, null);
            } else if (i12 == 1) {
                if (d()) {
                    a05 = org.telegram.messenger.cd.L0(2131751583, null);
                } else {
                    a05 = org.telegram.messenger.cd.a0(null, null, 2131751588, o10);
                }
                this.f31014b = a05;
            } else if (i12 == 3) {
                if (d()) {
                    a04 = org.telegram.messenger.cd.L0(2131751578, null);
                } else {
                    a04 = org.telegram.messenger.cd.a0(null, null, 2131751579, o10);
                }
                this.f31014b = a04;
            } else if (i12 == 2) {
                if (this.f31019j.Y1) {
                    if (d()) {
                        a03 = org.telegram.messenger.cd.L0(2131751501, null);
                    } else {
                        a03 = org.telegram.messenger.cd.a0(null, null, 2131751502, o10);
                    }
                    this.f31014b = a03;
                    return;
                }
                if (d()) {
                    a02 = org.telegram.messenger.cd.L0(2131751568, null);
                } else {
                    a02 = org.telegram.messenger.cd.a0(null, null, 2131751569, o10);
                }
                this.f31014b = a02;
            }
        }
    }
}
