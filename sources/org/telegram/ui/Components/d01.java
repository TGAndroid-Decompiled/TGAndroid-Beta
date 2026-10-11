package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class d01 {
    public final boolean f25373a;
    public la.h d;
    public la.h f25377f;
    public la.h h;
    public int[] f25380j;
    public int[] f25382l;
    public b01[] f25384n;
    public int[] f25386p;
    public boolean f25388r;
    public int[] f25390t;
    public final n01 f25393x;
    public int f25374b = Integer.MIN_VALUE;
    public int f25375c = Integer.MIN_VALUE;
    public boolean f25376e = false;
    public boolean f25378g = false;
    public boolean f25379i = false;
    public boolean f25381k = false;
    public boolean f25383m = false;
    public boolean f25385o = false;
    public boolean f25387q = false;
    public boolean f25389s = false;
    public boolean f25391u = true;
    public final j01 v = new j01(0);
    public final j01 f25392w = new j01(-100000);

    public d01(n01 n01Var, boolean z10) {
        this.f25393x = n01Var;
        this.f25373a = z10;
    }

    public static void j(ArrayList arrayList, h01 h01Var, j01 j01Var, boolean z10) {
        if (h01Var.a() != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((b01) obj).f24739a.equals(h01Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new b01(h01Var, j01Var));
        }
    }

    public static boolean m(int[] iArr, b01 b01Var) {
        if (b01Var.f24741c) {
            h01 h01Var = b01Var.f24739a;
            int i10 = h01Var.f26868a;
            int i11 = h01Var.f26869b;
            int i12 = iArr[i10] + b01Var.f24740b.f27506a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(la.h hVar, boolean z10) {
        for (j01 j01Var : (j01[]) ((Object[]) hVar.d)) {
            j01Var.f27506a = Integer.MIN_VALUE;
        }
        e01[] e01VarArr = (e01[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < e01VarArr.length; i10++) {
            int d = e01VarArr[i10].d(z10);
            j01 j01Var2 = (j01) ((Object[]) hVar.d)[((int[]) hVar.f15465b)[i10]];
            int i11 = j01Var2.f27506a;
            if (!z10) {
                d = -d;
            }
            j01Var2.f27506a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        k01 k01Var;
        int i10;
        if (z10) {
            iArr = this.f25380j;
        } else {
            iArr = this.f25382l;
        }
        n01 n01Var = this.f25393x;
        int childCount = n01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            g01 d = n01Var.d(i11);
            i01 i01Var = d.f26543a;
            boolean z11 = this.f25373a;
            if (z11) {
                k01Var = i01Var.f27121b;
            } else {
                k01Var = i01Var.f27120a;
            }
            h01 h01Var = k01Var.f27799b;
            if (z10) {
                i10 = h01Var.f26868a;
            } else {
                i10 = h01Var.f26869b;
            }
            iArr[i10] = Math.max(iArr[i10], n01Var.f(d, z11, z10));
        }
    }

    public final la.h c(boolean z10) {
        h01 h01Var;
        c01 c01Var = new c01(h01.class, j01.class);
        k01[] k01VarArr = (k01[]) ((Object[]) f().f15466c);
        int length = k01VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                h01Var = k01VarArr[i10].f27799b;
            } else {
                h01 h01Var2 = k01VarArr[i10].f27799b;
                h01Var = new h01(h01Var2.f26869b, h01Var2.f26868a);
            }
            ?? obj = new Object();
            obj.f27506a = Integer.MIN_VALUE;
            c01Var.add(Pair.create(h01Var, obj));
        }
        return c01Var.i();
    }

    public final b01[] d() {
        if (this.f25384n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f25377f == null) {
                this.f25377f = c(true);
            }
            if (!this.f25378g) {
                a(this.f25377f, true);
                this.f25378g = true;
            }
            la.h hVar = this.f25377f;
            int i10 = 0;
            while (true) {
                h01[] h01VarArr = (h01[]) ((Object[]) hVar.f15466c);
                if (i10 >= h01VarArr.length) {
                    break;
                }
                j(arrayList, h01VarArr[i10], ((j01[]) ((Object[]) hVar.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f25379i) {
                a(this.h, false);
                this.f25379i = true;
            }
            la.h hVar2 = this.h;
            int i11 = 0;
            while (true) {
                h01[] h01VarArr2 = (h01[]) ((Object[]) hVar2.f15466c);
                if (i11 >= h01VarArr2.length) {
                    break;
                }
                j(arrayList2, h01VarArr2[i11], ((j01[]) ((Object[]) hVar2.d))[i11], false);
                i11++;
            }
            if (this.f25391u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new h01(i12, i13), new j01(0), true);
                    i12 = i13;
                }
            }
            int e7 = e();
            j(arrayList, new h01(0, e7), this.v, false);
            j(arrayList2, new h01(e7, 0), this.f25392w, false);
            b01[] q6 = q(arrayList);
            b01[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(b01[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.f25384n = (b01[]) objArr;
        }
        if (!this.f25385o) {
            if (this.f25377f == null) {
                this.f25377f = c(true);
            }
            if (!this.f25378g) {
                a(this.f25377f, true);
                this.f25378g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f25379i) {
                a(this.h, false);
                this.f25379i = true;
            }
            this.f25385o = true;
        }
        return this.f25384n;
    }

    public final int e() {
        int max = Math.max(this.f25374b, h());
        if (max <= 1024) {
            return max;
        }
        n01.g("Table grid count out of bounds");
        throw null;
    }

    public final la.h f() {
        k01 k01Var;
        int i10;
        int i11;
        int i12;
        k01 k01Var2;
        e01 e01Var;
        la.h hVar = this.d;
        boolean z10 = this.f25373a;
        n01 n01Var = this.f25393x;
        if (hVar == null) {
            c01 c01Var = new c01(k01.class, e01.class);
            int childCount = n01Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                i01 i01Var = n01Var.d(i13).f26543a;
                if (z10) {
                    k01Var2 = i01Var.f27121b;
                } else {
                    k01Var2 = i01Var.f27120a;
                }
                switch (k01.a(k01Var2, z10).f33718a) {
                    case 3:
                        e01Var = new e01();
                        break;
                    default:
                        e01Var = new e01();
                        break;
                }
                c01Var.add(Pair.create(k01Var2, e01Var));
            }
            this.d = c01Var.i();
        }
        if (!this.f25376e) {
            for (e01 e01Var2 : (e01[]) ((Object[]) this.d.d)) {
                e01Var2.c();
            }
            int childCount2 = n01Var.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                g01 d = n01Var.d(i14);
                i01 i01Var2 = d.f26543a;
                if (z10) {
                    k01Var = i01Var2.f27121b;
                } else {
                    k01Var = i01Var2.f27120a;
                }
                if (z10) {
                    i10 = d.f26551k;
                } else {
                    i10 = d.f26552l;
                }
                int e7 = n01Var.e(d, z10, false) + n01Var.e(d, z10, true) + i10;
                float f7 = k01Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f25390t[i14];
                }
                int i15 = e7 + i11;
                la.h hVar2 = this.d;
                e01 e01Var3 = (e01) ((Object[]) hVar2.d)[((int[]) hVar2.f15465b)[i14]];
                int i16 = e01Var3.f25788c;
                if (k01Var.f27800c == n01.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                e01Var3.f25788c = i12 & i16;
                int a2 = k01.a(k01Var, z10).a(d, i15);
                e01Var3.b(a2, i15 - a2);
            }
            this.f25376e = true;
        }
        return this.d;
    }

    public final int[] g() {
        k01 k01Var;
        boolean z10;
        k01 k01Var2;
        if (this.f25386p == null) {
            this.f25386p = new int[e() + 1];
        }
        if (!this.f25387q) {
            int[] iArr = this.f25386p;
            boolean z11 = this.f25389s;
            float f7 = 0.0f;
            boolean z12 = this.f25373a;
            n01 n01Var = this.f25393x;
            if (!z11) {
                int childCount = n01Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        i01 i01Var = n01Var.d(i10).f26543a;
                        if (z12) {
                            k01Var2 = i01Var.f27121b;
                        } else {
                            k01Var2 = i01Var.f27120a;
                        }
                        if (k01Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f25388r = z10;
                this.f25389s = true;
            }
            if (!this.f25388r) {
                p(d(), iArr, true);
            } else {
                if (this.f25390t == null) {
                    this.f25390t = new int[n01Var.getChildCount()];
                }
                Arrays.fill(this.f25390t, 0);
                p(d(), iArr, true);
                int childCount2 = (n01Var.getChildCount() * this.v.f27506a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = n01Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        i01 i01Var2 = n01Var.d(i11).f26543a;
                        if (z12) {
                            k01Var = i01Var2.f27121b;
                        } else {
                            k01Var = i01Var2.f27120a;
                        }
                        f7 += k01Var.d;
                    }
                    int i12 = -1;
                    boolean z13 = true;
                    int i13 = 0;
                    while (i13 < childCount2) {
                        int i14 = (int) ((i13 + childCount2) / 2);
                        l();
                        o(f7, i14);
                        boolean p5 = p(d(), iArr, false);
                        if (p5) {
                            i13 = i14 + 1;
                            i12 = i14;
                        } else {
                            childCount2 = i14;
                        }
                        z13 = p5;
                    }
                    if (i12 > 0 && !z13) {
                        l();
                        o(f7, i12);
                        p(d(), iArr, true);
                    }
                }
            }
            if (!this.f25391u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f25387q = true;
        }
        return this.f25386p;
    }

    public final int h() {
        k01 k01Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f25375c == Integer.MIN_VALUE) {
            n01 n01Var = this.f25393x;
            int childCount = n01Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                i01 i01Var = n01Var.d(i12).f26543a;
                if (this.f25373a) {
                    k01Var = i01Var.f27121b;
                } else {
                    k01Var = i01Var.f27120a;
                }
                h01 h01Var = k01Var.f27799b;
                i11 = Math.max(Math.max(Math.max(i11, h01Var.f26868a), h01Var.f26869b), h01Var.a());
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f25375c = Math.max(0, i10);
        }
        return this.f25375c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        j01 j01Var = this.f25392w;
        j01 j01Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                j01Var2.f27506a = size;
                j01Var.f27506a = -size;
                this.f25387q = false;
                return g()[e()];
            }
            j01Var2.f27506a = 0;
            j01Var.f27506a = -100000;
            this.f25387q = false;
            return g()[e()];
        }
        j01Var2.f27506a = 0;
        j01Var.f27506a = -size;
        this.f25387q = false;
        return g()[e()];
    }

    public final void k() {
        this.f25375c = Integer.MIN_VALUE;
        this.d = null;
        this.f25377f = null;
        this.h = null;
        this.f25380j = null;
        this.f25382l = null;
        this.f25384n = null;
        this.f25386p = null;
        this.f25390t = null;
        this.f25389s = false;
        l();
    }

    public final void l() {
        this.f25376e = false;
        this.f25378g = false;
        this.f25379i = false;
        this.f25381k = false;
        this.f25383m = false;
        this.f25385o = false;
        this.f25387q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f25373a) {
                str = "column";
            } else {
                str = "row";
            }
            n01.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.f25374b = i10;
    }

    public final void o(float f7, int i10) {
        k01 k01Var;
        Arrays.fill(this.f25390t, 0);
        n01 n01Var = this.f25393x;
        int childCount = n01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            i01 i01Var = n01Var.d(i11).f26543a;
            if (this.f25373a) {
                k01Var = i01Var.f27121b;
            } else {
                k01Var = i01Var.f27120a;
            }
            float f10 = k01Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f25390t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(b01[] b01VarArr, int[] iArr, boolean z10) {
        int e7 = e() + 1;
        loop0: for (int i10 = 0; i10 < b01VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e7; i11++) {
                boolean z11 = false;
                for (b01 b01Var : b01VarArr) {
                    z11 |= m(iArr, b01Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[b01VarArr.length];
            for (int i12 = 0; i12 < e7; i12++) {
                int length = b01VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, b01VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= b01VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    b01 b01Var2 = b01VarArr[i14];
                    h01 h01Var = b01Var2.f24739a;
                    if (h01Var.f26868a >= h01Var.f26869b) {
                        b01Var2.f24741c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final b01[] q(ArrayList arrayList) {
        e0.g0 g0Var = new e0.g0(this, (b01[]) arrayList.toArray(new b01[0]));
        int length = ((b01[][]) g0Var.f8413c).length;
        for (int i10 = 0; i10 < length; i10++) {
            g0Var.f(i10);
        }
        return (b01[]) g0Var.f8412b;
    }
}
