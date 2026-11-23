package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wr {
    public final int f41705a;
    public String f41706b;
    public final ArrayList f41707c;
    public final boolean[] d;
    public boolean[] f41708e;
    public boolean f41709f;
    public final int f41710g;
    public int h;
    public int f41711i;
    public final xr f41712j;

    public wr(xr xrVar, int i7, ArrayList arrayList) {
        this.f41712j = xrVar;
        this.f41705a = i7;
        int size = arrayList.size();
        this.f41710g = size;
        this.f41711i = 0;
        if (size > 0) {
            this.f41707c = arrayList;
            this.d = new boolean[size];
            this.f41709f = true;
            i();
        }
    }

    public final boolean a() {
        boolean[] zArr;
        for (int i7 = 0; i7 < this.f41710g; i7++) {
            if (!this.d[i7] || ((zArr = this.f41708e) != null && !zArr[i7])) {
                return false;
            }
        }
        return true;
    }

    public final void b(org.telegram.messenger.z10 z10Var) {
        for (int i7 = 0; i7 < this.f41710g; i7++) {
            boolean[] zArr = this.f41708e;
            if (zArr == null || zArr[i7]) {
                z10Var.a(i7, (TLObject) this.f41707c.get(i7));
            }
        }
    }

    public final void c(org.telegram.messenger.z10 z10Var) {
        boolean[] zArr;
        for (int i7 = 0; i7 < this.f41710g; i7++) {
            if (this.d[i7] && ((zArr = this.f41708e) == null || zArr[i7])) {
                z10Var.a(i7, (TLObject) this.f41707c.get(i7));
            }
        }
    }

    public final boolean d() {
        int i7;
        if (this.f41708e != null) {
            i7 = this.h;
        } else {
            i7 = this.f41710g;
        }
        if (i7 > 1) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        int i7;
        if (this.f41708e != null) {
            i7 = this.h;
        } else {
            i7 = this.f41710g;
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
            int i10 = this.f41710g;
            zArr = this.d;
            if (i7 >= i10) {
                break;
            } else if (!zArr[i7] || ((zArr2 = this.f41708e) != null && !zArr2[i7])) {
                i7++;
            }
        }
        z10 = true;
        Arrays.fill(zArr, !z10);
        h();
        this.f41712j.T1.O(true);
    }

    public final void g(int i7) {
        boolean[] zArr = this.f41708e;
        if (zArr != null && !zArr[i7]) {
            return;
        }
        boolean[] zArr2 = this.d;
        boolean z10 = zArr2[i7];
        zArr2[i7] = !z10;
        if (!z10) {
            this.f41711i++;
        } else {
            this.f41711i--;
        }
        this.f41712j.T1.O(true);
    }

    public final void h() {
        this.f41711i = 0;
        this.h = 0;
        for (int i7 = 0; i7 < this.f41710g; i7++) {
            boolean[] zArr = this.f41708e;
            boolean[] zArr2 = this.d;
            if (zArr == null) {
                if (zArr2[i7]) {
                    this.f41711i++;
                }
            } else if (zArr[i7]) {
                this.h++;
                if (zArr2[i7]) {
                    this.f41711i++;
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
        int i7 = this.f41710g;
        if (i7 != 0) {
            for (int i10 = 0; i10 < i7; i10++) {
                boolean[] zArr = this.f41708e;
                if (zArr == null || zArr[i10]) {
                    tLObject = (TLObject) this.f41707c.get(i10);
                    break;
                }
            }
            tLObject = null;
            if (tLObject instanceof TLRPC.User) {
                o4 = org.telegram.messenger.n10.l((TLRPC.User) tLObject);
            } else {
                o4 = org.telegram.messenger.i5.o(tLObject);
            }
            int i11 = this.f41705a;
            if (i11 == 0) {
                this.f41706b = org.telegram.messenger.gd.N0(2131751490, null);
            } else if (i11 == 1) {
                if (d()) {
                    a05 = org.telegram.messenger.gd.N0(2131751570, null);
                } else {
                    a05 = org.telegram.messenger.gd.a0(null, null, 2131751575, o4);
                }
                this.f41706b = a05;
            } else if (i11 == 3) {
                if (d()) {
                    a04 = org.telegram.messenger.gd.N0(2131751565, null);
                } else {
                    a04 = org.telegram.messenger.gd.a0(null, null, 2131751566, o4);
                }
                this.f41706b = a04;
            } else if (i11 == 2) {
                if (this.f41712j.f42139c2) {
                    if (d()) {
                        a03 = org.telegram.messenger.gd.N0(2131751488, null);
                    } else {
                        a03 = org.telegram.messenger.gd.a0(null, null, 2131751489, o4);
                    }
                    this.f41706b = a03;
                    return;
                }
                if (d()) {
                    a02 = org.telegram.messenger.gd.N0(2131751555, null);
                } else {
                    a02 = org.telegram.messenger.gd.a0(null, null, 2131751556, o4);
                }
                this.f41706b = a02;
            }
        }
    }
}
