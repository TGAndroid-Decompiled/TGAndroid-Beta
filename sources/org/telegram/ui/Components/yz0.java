package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class yz0 {
    public final boolean f33069a;
    public m.g3 d;
    public m.g3 f33072f;
    public m.g3 h;
    public int[] f33075j;
    public int[] f33077l;
    public wz0[] f33079n;
    public int[] f33081p;
    public boolean f33083r;
    public int[] f33085t;
    public final i01 f33088x;
    public int f33070b = Integer.MIN_VALUE;
    public int f33071c = Integer.MIN_VALUE;
    public boolean e = false;
    public boolean f33073g = false;
    public boolean f33074i = false;
    public boolean f33076k = false;
    public boolean f33078m = false;
    public boolean f33080o = false;
    public boolean f33082q = false;
    public boolean f33084s = false;
    public boolean f33086u = true;
    public final e01 v = new e01(0);
    public final e01 f33087w = new e01(-100000);

    public yz0(i01 i01Var, boolean z10) {
        this.f33088x = i01Var;
        this.f33069a = z10;
    }

    public static void j(ArrayList arrayList, c01 c01Var, e01 e01Var, boolean z10) {
        if (c01Var.a() != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((wz0) obj).f32385a.equals(c01Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new wz0(c01Var, e01Var));
        }
    }

    public static boolean m(int[] iArr, wz0 wz0Var) {
        if (wz0Var.f32387c) {
            c01 c01Var = wz0Var.f32385a;
            int i10 = c01Var.f25190a;
            int i11 = c01Var.f25191b;
            int i12 = iArr[i10] + wz0Var.f32386b.f25803a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(m.g3 g3Var, boolean z10) {
        for (e01 e01Var : (e01[]) ((Object[]) g3Var.d)) {
            e01Var.f25803a = Integer.MIN_VALUE;
        }
        zz0[] zz0VarArr = (zz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < zz0VarArr.length; i10++) {
            int d = zz0VarArr[i10].d(z10);
            e01 e01Var2 = (e01) ((Object[]) g3Var.d)[((int[]) g3Var.f16265b)[i10]];
            int i11 = e01Var2.f25803a;
            if (!z10) {
                d = -d;
            }
            e01Var2.f25803a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        f01 f01Var;
        int i10;
        if (z10) {
            iArr = this.f33075j;
        } else {
            iArr = this.f33077l;
        }
        i01 i01Var = this.f33088x;
        int childCount = i01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            b01 d = i01Var.d(i11);
            d01 d01Var = d.f24898a;
            boolean z11 = this.f33069a;
            if (z11) {
                f01Var = d01Var.f25477b;
            } else {
                f01Var = d01Var.f25476a;
            }
            c01 c01Var = f01Var.f26119b;
            if (z10) {
                i10 = c01Var.f25190a;
            } else {
                i10 = c01Var.f25191b;
            }
            iArr[i10] = Math.max(iArr[i10], i01Var.f(d, z11, z10));
        }
    }

    public final m.g3 c(boolean z10) {
        c01 c01Var;
        xz0 xz0Var = new xz0(c01.class, e01.class);
        f01[] f01VarArr = (f01[]) ((Object[]) f().f16266c);
        int length = f01VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                c01Var = f01VarArr[i10].f26119b;
            } else {
                c01 c01Var2 = f01VarArr[i10].f26119b;
                c01Var = new c01(c01Var2.f25191b, c01Var2.f25190a);
            }
            ?? obj = new Object();
            obj.f25803a = Integer.MIN_VALUE;
            xz0Var.add(Pair.create(c01Var, obj));
        }
        return xz0Var.h();
    }

    public final wz0[] d() {
        if (this.f33079n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f33072f == null) {
                this.f33072f = c(true);
            }
            if (!this.f33073g) {
                a(this.f33072f, true);
                this.f33073g = true;
            }
            m.g3 g3Var = this.f33072f;
            int i10 = 0;
            while (true) {
                c01[] c01VarArr = (c01[]) ((Object[]) g3Var.f16266c);
                if (i10 >= c01VarArr.length) {
                    break;
                }
                j(arrayList, c01VarArr[i10], ((e01[]) ((Object[]) g3Var.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f33074i) {
                a(this.h, false);
                this.f33074i = true;
            }
            m.g3 g3Var2 = this.h;
            int i11 = 0;
            while (true) {
                c01[] c01VarArr2 = (c01[]) ((Object[]) g3Var2.f16266c);
                if (i11 >= c01VarArr2.length) {
                    break;
                }
                j(arrayList2, c01VarArr2[i11], ((e01[]) ((Object[]) g3Var2.d))[i11], false);
                i11++;
            }
            if (this.f33086u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new c01(i12, i13), new e01(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new c01(0, e), this.v, false);
            j(arrayList2, new c01(e, 0), this.f33087w, false);
            wz0[] q6 = q(arrayList);
            wz0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(wz0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.f33079n = (wz0[]) objArr;
        }
        if (!this.f33080o) {
            if (this.f33072f == null) {
                this.f33072f = c(true);
            }
            if (!this.f33073g) {
                a(this.f33072f, true);
                this.f33073g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f33074i) {
                a(this.h, false);
                this.f33074i = true;
            }
            this.f33080o = true;
        }
        return this.f33079n;
    }

    public final int e() {
        int max = Math.max(this.f33070b, h());
        if (max <= 1024) {
            return max;
        }
        i01.g("Table grid count out of bounds");
        throw null;
    }

    public final m.g3 f() {
        f01 f01Var;
        int i10;
        int i11;
        int i12;
        f01 f01Var2;
        zz0 zz0Var;
        m.g3 g3Var = this.d;
        boolean z10 = this.f33069a;
        i01 i01Var = this.f33088x;
        if (g3Var == null) {
            xz0 xz0Var = new xz0(f01.class, zz0.class);
            int childCount = i01Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                d01 d01Var = i01Var.d(i13).f24898a;
                if (z10) {
                    f01Var2 = d01Var.f25477b;
                } else {
                    f01Var2 = d01Var.f25476a;
                }
                switch (f01.a(f01Var2, z10).f31257a) {
                    case 3:
                        zz0Var = new zz0();
                        break;
                    default:
                        zz0Var = new zz0();
                        break;
                }
                xz0Var.add(Pair.create(f01Var2, zz0Var));
            }
            this.d = xz0Var.h();
        }
        if (!this.e) {
            for (zz0 zz0Var2 : (zz0[]) ((Object[]) this.d.d)) {
                zz0Var2.c();
            }
            int childCount2 = i01Var.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                b01 d = i01Var.d(i14);
                d01 d01Var2 = d.f24898a;
                if (z10) {
                    f01Var = d01Var2.f25477b;
                } else {
                    f01Var = d01Var2.f25476a;
                }
                if (z10) {
                    i10 = d.f24905k;
                } else {
                    i10 = d.f24906l;
                }
                int e = i01Var.e(d, z10, false) + i01Var.e(d, z10, true) + i10;
                float f7 = f01Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f33085t[i14];
                }
                int i15 = e + i11;
                m.g3 g3Var2 = this.d;
                zz0 zz0Var3 = (zz0) ((Object[]) g3Var2.d)[((int[]) g3Var2.f16265b)[i14]];
                int i16 = zz0Var3.f33376c;
                if (f01Var.f26120c == i01.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                zz0Var3.f33376c = i12 & i16;
                int a2 = f01.a(f01Var, z10).a(d, i15);
                zz0Var3.b(a2, i15 - a2);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] g() {
        f01 f01Var;
        boolean z10;
        f01 f01Var2;
        if (this.f33081p == null) {
            this.f33081p = new int[e() + 1];
        }
        if (!this.f33082q) {
            int[] iArr = this.f33081p;
            boolean z11 = this.f33084s;
            float f7 = 0.0f;
            boolean z12 = this.f33069a;
            i01 i01Var = this.f33088x;
            if (!z11) {
                int childCount = i01Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        d01 d01Var = i01Var.d(i10).f24898a;
                        if (z12) {
                            f01Var2 = d01Var.f25477b;
                        } else {
                            f01Var2 = d01Var.f25476a;
                        }
                        if (f01Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f33083r = z10;
                this.f33084s = true;
            }
            if (!this.f33083r) {
                p(d(), iArr, true);
            } else {
                if (this.f33085t == null) {
                    this.f33085t = new int[i01Var.getChildCount()];
                }
                Arrays.fill(this.f33085t, 0);
                p(d(), iArr, true);
                int childCount2 = (i01Var.getChildCount() * this.v.f25803a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = i01Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        d01 d01Var2 = i01Var.d(i11).f24898a;
                        if (z12) {
                            f01Var = d01Var2.f25477b;
                        } else {
                            f01Var = d01Var2.f25476a;
                        }
                        f7 += f01Var.d;
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
            if (!this.f33086u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f33082q = true;
        }
        return this.f33081p;
    }

    public final int h() {
        f01 f01Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f33071c == Integer.MIN_VALUE) {
            i01 i01Var = this.f33088x;
            int childCount = i01Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                d01 d01Var = i01Var.d(i12).f24898a;
                if (this.f33069a) {
                    f01Var = d01Var.f25477b;
                } else {
                    f01Var = d01Var.f25476a;
                }
                c01 c01Var = f01Var.f26119b;
                i11 = Math.max(Math.max(Math.max(i11, c01Var.f25190a), c01Var.f25191b), c01Var.a());
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f33071c = Math.max(0, i10);
        }
        return this.f33071c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        e01 e01Var = this.f33087w;
        e01 e01Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                e01Var2.f25803a = size;
                e01Var.f25803a = -size;
                this.f33082q = false;
                return g()[e()];
            }
            e01Var2.f25803a = 0;
            e01Var.f25803a = -100000;
            this.f33082q = false;
            return g()[e()];
        }
        e01Var2.f25803a = 0;
        e01Var.f25803a = -size;
        this.f33082q = false;
        return g()[e()];
    }

    public final void k() {
        this.f33071c = Integer.MIN_VALUE;
        this.d = null;
        this.f33072f = null;
        this.h = null;
        this.f33075j = null;
        this.f33077l = null;
        this.f33079n = null;
        this.f33081p = null;
        this.f33085t = null;
        this.f33084s = false;
        l();
    }

    public final void l() {
        this.e = false;
        this.f33073g = false;
        this.f33074i = false;
        this.f33076k = false;
        this.f33078m = false;
        this.f33080o = false;
        this.f33082q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f33069a) {
                str = "column";
            } else {
                str = "row";
            }
            i01.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.f33070b = i10;
    }

    public final void o(float f7, int i10) {
        f01 f01Var;
        Arrays.fill(this.f33085t, 0);
        i01 i01Var = this.f33088x;
        int childCount = i01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            d01 d01Var = i01Var.d(i11).f24898a;
            if (this.f33069a) {
                f01Var = d01Var.f25477b;
            } else {
                f01Var = d01Var.f25476a;
            }
            float f10 = f01Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f33085t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(wz0[] wz0VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < wz0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (wz0 wz0Var : wz0VarArr) {
                    z11 |= m(iArr, wz0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[wz0VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = wz0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, wz0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= wz0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    wz0 wz0Var2 = wz0VarArr[i14];
                    c01 c01Var = wz0Var2.f32385a;
                    if (c01Var.f25190a >= c01Var.f25191b) {
                        wz0Var2.f32387c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final wz0[] q(ArrayList arrayList) {
        e0.f0 f0Var = new e0.f0(this, (wz0[]) arrayList.toArray(new wz0[0]));
        int length = ((wz0[][]) f0Var.d).length;
        for (int i10 = 0; i10 < length; i10++) {
            f0Var.f(i10);
        }
        return (wz0[]) f0Var.f8103c;
    }
}
