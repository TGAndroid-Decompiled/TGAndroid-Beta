package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class bx0 {
    public final boolean f32418a;
    public k4.j d;
    public k4.j f32422f;
    public k4.j h;
    public int[] f32425j;
    public int[] f32427l;
    public zw0[] f32429n;
    public int[] f32431p;
    public boolean f32433r;
    public int[] f32435t;
    public final lx0 f32438x;
    public int f32419b = Integer.MIN_VALUE;
    public int f32420c = Integer.MIN_VALUE;
    public boolean f32421e = false;
    public boolean f32423g = false;
    public boolean f32424i = false;
    public boolean f32426k = false;
    public boolean f32428m = false;
    public boolean f32430o = false;
    public boolean f32432q = false;
    public boolean f32434s = false;
    public boolean f32436u = true;
    public final hx0 v = new hx0(0);
    public final hx0 f32437w = new hx0(-100000);

    public bx0(lx0 lx0Var, boolean z10) {
        this.f32438x = lx0Var;
        this.f32418a = z10;
    }

    public static void j(ArrayList arrayList, fx0 fx0Var, hx0 hx0Var, boolean z10) {
        if (fx0Var.a() != 0) {
            if (z10) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    if (((zw0) obj).f41141a.equals(fx0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new zw0(fx0Var, hx0Var));
        }
    }

    public static boolean m(int[] iArr, zw0 zw0Var) {
        if (zw0Var.f41143c) {
            fx0 fx0Var = zw0Var.f41141a;
            int i3 = fx0Var.f33880a;
            int i10 = fx0Var.f33881b;
            int i11 = iArr[i3] + zw0Var.f41142b.f34536a;
            if (i11 > iArr[i10]) {
                iArr[i10] = i11;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(k4.j jVar, boolean z10) {
        for (hx0 hx0Var : (hx0[]) ((Object[]) jVar.f16871c)) {
            hx0Var.f34536a = Integer.MIN_VALUE;
        }
        cx0[] cx0VarArr = (cx0[]) ((Object[]) f().f16871c);
        for (int i3 = 0; i3 < cx0VarArr.length; i3++) {
            int d = cx0VarArr[i3].d(z10);
            hx0 hx0Var2 = (hx0) ((Object[]) jVar.f16871c)[((int[]) jVar.f16869a)[i3]];
            int i10 = hx0Var2.f34536a;
            if (!z10) {
                d = -d;
            }
            hx0Var2.f34536a = Math.max(i10, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        ix0 ix0Var;
        int i3;
        if (z10) {
            iArr = this.f32425j;
        } else {
            iArr = this.f32427l;
        }
        lx0 lx0Var = this.f32438x;
        int childCount = lx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ex0 d = lx0Var.d(i10);
            gx0 gx0Var = d.f33500a;
            boolean z11 = this.f32418a;
            if (z11) {
                ix0Var = gx0Var.f34224b;
            } else {
                ix0Var = gx0Var.f34223a;
            }
            fx0 fx0Var = ix0Var.f34856b;
            if (z10) {
                i3 = fx0Var.f33880a;
            } else {
                i3 = fx0Var.f33881b;
            }
            iArr[i3] = Math.max(iArr[i3], lx0Var.f(d, z11, z10));
        }
    }

    public final k4.j c(boolean z10) {
        fx0 fx0Var;
        ax0 ax0Var = new ax0(fx0.class, hx0.class);
        ix0[] ix0VarArr = (ix0[]) ((Object[]) f().f16870b);
        int length = ix0VarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (z10) {
                fx0Var = ix0VarArr[i3].f34856b;
            } else {
                fx0 fx0Var2 = ix0VarArr[i3].f34856b;
                fx0Var = new fx0(fx0Var2.f33881b, fx0Var2.f33880a);
            }
            ?? obj = new Object();
            obj.f34536a = Integer.MIN_VALUE;
            ax0Var.add(Pair.create(fx0Var, obj));
        }
        return ax0Var.h();
    }

    public final zw0[] d() {
        if (this.f32429n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f32422f == null) {
                this.f32422f = c(true);
            }
            if (!this.f32423g) {
                a(this.f32422f, true);
                this.f32423g = true;
            }
            k4.j jVar = this.f32422f;
            int i3 = 0;
            while (true) {
                fx0[] fx0VarArr = (fx0[]) ((Object[]) jVar.f16870b);
                if (i3 >= fx0VarArr.length) {
                    break;
                }
                j(arrayList, fx0VarArr[i3], ((hx0[]) ((Object[]) jVar.f16871c))[i3], false);
                i3++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f32424i) {
                a(this.h, false);
                this.f32424i = true;
            }
            k4.j jVar2 = this.h;
            int i10 = 0;
            while (true) {
                fx0[] fx0VarArr2 = (fx0[]) ((Object[]) jVar2.f16870b);
                if (i10 >= fx0VarArr2.length) {
                    break;
                }
                j(arrayList2, fx0VarArr2[i10], ((hx0[]) ((Object[]) jVar2.f16871c))[i10], false);
                i10++;
            }
            if (this.f32436u) {
                int i11 = 0;
                while (i11 < e()) {
                    int i12 = i11 + 1;
                    j(arrayList, new fx0(i11, i12), new hx0(0), true);
                    i11 = i12;
                }
            }
            int e10 = e();
            j(arrayList, new fx0(0, e10), this.v, false);
            j(arrayList2, new fx0(e10, 0), this.f32437w, false);
            zw0[] q10 = q(arrayList);
            zw0[] q11 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(zw0[].class.getComponentType(), q10.length + q11.length);
            System.arraycopy(q10, 0, objArr, 0, q10.length);
            System.arraycopy(q11, 0, objArr, q10.length, q11.length);
            this.f32429n = (zw0[]) objArr;
        }
        if (!this.f32430o) {
            if (this.f32422f == null) {
                this.f32422f = c(true);
            }
            if (!this.f32423g) {
                a(this.f32422f, true);
                this.f32423g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f32424i) {
                a(this.h, false);
                this.f32424i = true;
            }
            this.f32430o = true;
        }
        return this.f32429n;
    }

    public final int e() {
        int max = Math.max(this.f32419b, h());
        if (max <= 1024) {
            return max;
        }
        lx0.g("Table grid count out of bounds");
        throw null;
    }

    public final k4.j f() {
        ix0 ix0Var;
        int i3;
        int i10;
        int i11;
        ix0 ix0Var2;
        cx0 cx0Var;
        k4.j jVar = this.d;
        boolean z10 = this.f32418a;
        lx0 lx0Var = this.f32438x;
        if (jVar == null) {
            ax0 ax0Var = new ax0(ix0.class, cx0.class);
            int childCount = lx0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                gx0 gx0Var = lx0Var.d(i12).f33500a;
                if (z10) {
                    ix0Var2 = gx0Var.f34224b;
                } else {
                    ix0Var2 = gx0Var.f34223a;
                }
                switch (ix0.a(ix0Var2, z10).f40538a) {
                    case 3:
                        cx0Var = new cx0();
                        break;
                    default:
                        cx0Var = new cx0();
                        break;
                }
                ax0Var.add(Pair.create(ix0Var2, cx0Var));
            }
            this.d = ax0Var.h();
        }
        if (!this.f32421e) {
            for (cx0 cx0Var2 : (cx0[]) ((Object[]) this.d.f16871c)) {
                cx0Var2.c();
            }
            int childCount2 = lx0Var.getChildCount();
            for (int i13 = 0; i13 < childCount2; i13++) {
                ex0 d = lx0Var.d(i13);
                gx0 gx0Var2 = d.f33500a;
                if (z10) {
                    ix0Var = gx0Var2.f34224b;
                } else {
                    ix0Var = gx0Var2.f34223a;
                }
                if (z10) {
                    i3 = d.f33508k;
                } else {
                    i3 = d.f33509l;
                }
                int e10 = lx0Var.e(d, z10, false) + lx0Var.e(d, z10, true) + i3;
                float f10 = ix0Var.d;
                if (f10 == 0.0f) {
                    i10 = 0;
                } else {
                    i10 = this.f32435t[i13];
                }
                int i14 = e10 + i10;
                k4.j jVar2 = this.d;
                cx0 cx0Var3 = (cx0) ((Object[]) jVar2.f16871c)[((int[]) jVar2.f16869a)[i13]];
                int i15 = cx0Var3.f32852c;
                if (ix0Var.f34857c == lx0.S && f10 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                cx0Var3.f32852c = i11 & i15;
                int a10 = ix0.a(ix0Var, z10).a(d, i14);
                cx0Var3.b(a10, i14 - a10);
            }
            this.f32421e = true;
        }
        return this.d;
    }

    public final int[] g() {
        ix0 ix0Var;
        boolean z10;
        ix0 ix0Var2;
        if (this.f32431p == null) {
            this.f32431p = new int[e() + 1];
        }
        if (!this.f32432q) {
            int[] iArr = this.f32431p;
            boolean z11 = this.f32434s;
            float f10 = 0.0f;
            boolean z12 = this.f32418a;
            lx0 lx0Var = this.f32438x;
            if (!z11) {
                int childCount = lx0Var.getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 < childCount) {
                        gx0 gx0Var = lx0Var.d(i3).f33500a;
                        if (z12) {
                            ix0Var2 = gx0Var.f34224b;
                        } else {
                            ix0Var2 = gx0Var.f34223a;
                        }
                        if (ix0Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i3++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f32433r = z10;
                this.f32434s = true;
            }
            if (!this.f32433r) {
                p(d(), iArr, true);
            } else {
                if (this.f32435t == null) {
                    this.f32435t = new int[lx0Var.getChildCount()];
                }
                Arrays.fill(this.f32435t, 0);
                p(d(), iArr, true);
                int childCount2 = (lx0Var.getChildCount() * this.v.f34536a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = lx0Var.getChildCount();
                    for (int i10 = 0; i10 < childCount3; i10++) {
                        gx0 gx0Var2 = lx0Var.d(i10).f33500a;
                        if (z12) {
                            ix0Var = gx0Var2.f34224b;
                        } else {
                            ix0Var = gx0Var2.f34223a;
                        }
                        f10 += ix0Var.d;
                    }
                    int i11 = -1;
                    boolean z13 = true;
                    int i12 = 0;
                    while (i12 < childCount2) {
                        int i13 = (int) ((i12 + childCount2) / 2);
                        l();
                        o(f10, i13);
                        boolean p10 = p(d(), iArr, false);
                        if (p10) {
                            i12 = i13 + 1;
                            i11 = i13;
                        } else {
                            childCount2 = i13;
                        }
                        z13 = p10;
                    }
                    if (i11 > 0 && !z13) {
                        l();
                        o(f10, i11);
                        p(d(), iArr, true);
                    }
                }
            }
            if (!this.f32436u) {
                int i14 = iArr[0];
                int length = iArr.length;
                for (int i15 = 0; i15 < length; i15++) {
                    iArr[i15] = iArr[i15] - i14;
                }
            }
            this.f32432q = true;
        }
        return this.f32431p;
    }

    public final int h() {
        ix0 ix0Var;
        int i3 = Integer.MIN_VALUE;
        if (this.f32420c == Integer.MIN_VALUE) {
            lx0 lx0Var = this.f32438x;
            int childCount = lx0Var.getChildCount();
            int i10 = -1;
            for (int i11 = 0; i11 < childCount; i11++) {
                gx0 gx0Var = lx0Var.d(i11).f33500a;
                if (this.f32418a) {
                    ix0Var = gx0Var.f34224b;
                } else {
                    ix0Var = gx0Var.f34223a;
                }
                fx0 fx0Var = ix0Var.f34856b;
                i10 = Math.max(Math.max(Math.max(i10, fx0Var.f33880a), fx0Var.f33881b), fx0Var.a());
            }
            if (i10 != -1) {
                i3 = i10;
            }
            this.f32420c = Math.max(0, i3);
        }
        return this.f32420c;
    }

    public final int i(int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        hx0 hx0Var = this.f32437w;
        hx0 hx0Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                hx0Var2.f34536a = size;
                hx0Var.f34536a = -size;
                this.f32432q = false;
                return g()[e()];
            }
            hx0Var2.f34536a = 0;
            hx0Var.f34536a = -100000;
            this.f32432q = false;
            return g()[e()];
        }
        hx0Var2.f34536a = 0;
        hx0Var.f34536a = -size;
        this.f32432q = false;
        return g()[e()];
    }

    public final void k() {
        this.f32420c = Integer.MIN_VALUE;
        this.d = null;
        this.f32422f = null;
        this.h = null;
        this.f32425j = null;
        this.f32427l = null;
        this.f32429n = null;
        this.f32431p = null;
        this.f32435t = null;
        this.f32434s = false;
        l();
    }

    public final void l() {
        this.f32421e = false;
        this.f32423g = false;
        this.f32424i = false;
        this.f32426k = false;
        this.f32428m = false;
        this.f32430o = false;
        this.f32432q = false;
    }

    public final void n(int i3) {
        String str;
        if (i3 != Integer.MIN_VALUE && i3 < h()) {
            if (this.f32418a) {
                str = "column";
            } else {
                str = "row";
            }
            lx0.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.f32419b = i3;
    }

    public final void o(float f10, int i3) {
        ix0 ix0Var;
        Arrays.fill(this.f32435t, 0);
        lx0 lx0Var = this.f32438x;
        int childCount = lx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            gx0 gx0Var = lx0Var.d(i10).f33500a;
            if (this.f32418a) {
                ix0Var = gx0Var.f34224b;
            } else {
                ix0Var = gx0Var.f34223a;
            }
            float f11 = ix0Var.d;
            if (f11 != 0.0f) {
                int round = Math.round((i3 * f11) / f10);
                this.f32435t[i10] = round;
                i3 -= round;
                f10 -= f11;
            }
        }
    }

    public final boolean p(zw0[] zw0VarArr, int[] iArr, boolean z10) {
        int e10 = e() + 1;
        loop0: for (int i3 = 0; i3 < zw0VarArr.length; i3++) {
            Arrays.fill(iArr, 0);
            for (int i10 = 0; i10 < e10; i10++) {
                boolean z11 = false;
                for (zw0 zw0Var : zw0VarArr) {
                    z11 |= m(iArr, zw0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[zw0VarArr.length];
            for (int i11 = 0; i11 < e10; i11++) {
                int length = zw0VarArr.length;
                for (int i12 = 0; i12 < length; i12++) {
                    zArr[i12] = zArr[i12] | m(iArr, zw0VarArr[i12]);
                }
            }
            int i13 = 0;
            while (true) {
                if (i13 >= zw0VarArr.length) {
                    break;
                }
                if (zArr[i13]) {
                    zw0 zw0Var2 = zw0VarArr[i13];
                    fx0 fx0Var = zw0Var2.f41141a;
                    if (fx0Var.f33880a >= fx0Var.f33881b) {
                        zw0Var2.f41143c = false;
                        break;
                    }
                }
                i13++;
            }
        }
        return true;
    }

    public final zw0[] q(ArrayList arrayList) {
        e0.e0 e0Var = new e0.e0(this, (zw0[]) arrayList.toArray(new zw0[0]));
        int length = ((zw0[][]) e0Var.d).length;
        for (int i3 = 0; i3 < length; i3++) {
            e0Var.x(i3);
        }
        return (zw0[]) e0Var.f9226c;
    }
}
