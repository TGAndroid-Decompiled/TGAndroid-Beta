package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class vz0 {
    public final boolean f31896a;
    public m.g3 d;
    public m.g3 f31899f;
    public m.g3 h;
    public int[] f31902j;
    public int[] f31904l;
    public tz0[] f31906n;
    public int[] f31908p;
    public boolean f31910r;
    public int[] f31912t;
    public final f01 f31915x;
    public int f31897b = Integer.MIN_VALUE;
    public int f31898c = Integer.MIN_VALUE;
    public boolean e = false;
    public boolean f31900g = false;
    public boolean f31901i = false;
    public boolean f31903k = false;
    public boolean f31905m = false;
    public boolean f31907o = false;
    public boolean f31909q = false;
    public boolean f31911s = false;
    public boolean f31913u = true;
    public final b01 v = new b01(0);
    public final b01 f31914w = new b01(-100000);

    public vz0(f01 f01Var, boolean z10) {
        this.f31915x = f01Var;
        this.f31896a = z10;
    }

    public static void j(ArrayList arrayList, zz0 zz0Var, b01 b01Var, boolean z10) {
        if (zz0Var.a() != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((tz0) obj).f30799a.equals(zz0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new tz0(zz0Var, b01Var));
        }
    }

    public static boolean m(int[] iArr, tz0 tz0Var) {
        if (tz0Var.f30801c) {
            zz0 zz0Var = tz0Var.f30799a;
            int i10 = zz0Var.f33074a;
            int i11 = zz0Var.f33075b;
            int i12 = iArr[i10] + tz0Var.f30800b.f24764a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(m.g3 g3Var, boolean z10) {
        for (b01 b01Var : (b01[]) ((Object[]) g3Var.d)) {
            b01Var.f24764a = Integer.MIN_VALUE;
        }
        wz0[] wz0VarArr = (wz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < wz0VarArr.length; i10++) {
            int d = wz0VarArr[i10].d(z10);
            b01 b01Var2 = (b01) ((Object[]) g3Var.d)[((int[]) g3Var.f16202b)[i10]];
            int i11 = b01Var2.f24764a;
            if (!z10) {
                d = -d;
            }
            b01Var2.f24764a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        c01 c01Var;
        int i10;
        if (z10) {
            iArr = this.f31902j;
        } else {
            iArr = this.f31904l;
        }
        f01 f01Var = this.f31915x;
        int childCount = f01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            yz0 d = f01Var.d(i11);
            a01 a01Var = d.f32769a;
            boolean z11 = this.f31896a;
            if (z11) {
                c01Var = a01Var.f24431b;
            } else {
                c01Var = a01Var.f24430a;
            }
            zz0 zz0Var = c01Var.f25081b;
            if (z10) {
                i10 = zz0Var.f33074a;
            } else {
                i10 = zz0Var.f33075b;
            }
            iArr[i10] = Math.max(iArr[i10], f01Var.f(d, z11, z10));
        }
    }

    public final m.g3 c(boolean z10) {
        zz0 zz0Var;
        uz0 uz0Var = new uz0(zz0.class, b01.class);
        c01[] c01VarArr = (c01[]) ((Object[]) f().f16203c);
        int length = c01VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                zz0Var = c01VarArr[i10].f25081b;
            } else {
                zz0 zz0Var2 = c01VarArr[i10].f25081b;
                zz0Var = new zz0(zz0Var2.f33075b, zz0Var2.f33074a);
            }
            ?? obj = new Object();
            obj.f24764a = Integer.MIN_VALUE;
            uz0Var.add(Pair.create(zz0Var, obj));
        }
        return uz0Var.h();
    }

    public final tz0[] d() {
        if (this.f31906n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f31899f == null) {
                this.f31899f = c(true);
            }
            if (!this.f31900g) {
                a(this.f31899f, true);
                this.f31900g = true;
            }
            m.g3 g3Var = this.f31899f;
            int i10 = 0;
            while (true) {
                zz0[] zz0VarArr = (zz0[]) ((Object[]) g3Var.f16203c);
                if (i10 >= zz0VarArr.length) {
                    break;
                }
                j(arrayList, zz0VarArr[i10], ((b01[]) ((Object[]) g3Var.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f31901i) {
                a(this.h, false);
                this.f31901i = true;
            }
            m.g3 g3Var2 = this.h;
            int i11 = 0;
            while (true) {
                zz0[] zz0VarArr2 = (zz0[]) ((Object[]) g3Var2.f16203c);
                if (i11 >= zz0VarArr2.length) {
                    break;
                }
                j(arrayList2, zz0VarArr2[i11], ((b01[]) ((Object[]) g3Var2.d))[i11], false);
                i11++;
            }
            if (this.f31913u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new zz0(i12, i13), new b01(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new zz0(0, e), this.v, false);
            j(arrayList2, new zz0(e, 0), this.f31914w, false);
            tz0[] q6 = q(arrayList);
            tz0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(tz0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.f31906n = (tz0[]) objArr;
        }
        if (!this.f31907o) {
            if (this.f31899f == null) {
                this.f31899f = c(true);
            }
            if (!this.f31900g) {
                a(this.f31899f, true);
                this.f31900g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f31901i) {
                a(this.h, false);
                this.f31901i = true;
            }
            this.f31907o = true;
        }
        return this.f31906n;
    }

    public final int e() {
        int max = Math.max(this.f31897b, h());
        if (max <= 1024) {
            return max;
        }
        f01.g("Table grid count out of bounds");
        throw null;
    }

    public final m.g3 f() {
        c01 c01Var;
        int i10;
        int i11;
        int i12;
        c01 c01Var2;
        wz0 wz0Var;
        m.g3 g3Var = this.d;
        boolean z10 = this.f31896a;
        f01 f01Var = this.f31915x;
        if (g3Var == null) {
            uz0 uz0Var = new uz0(c01.class, wz0.class);
            int childCount = f01Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                a01 a01Var = f01Var.d(i13).f32769a;
                if (z10) {
                    c01Var2 = a01Var.f24431b;
                } else {
                    c01Var2 = a01Var.f24430a;
                }
                switch (c01.a(c01Var2, z10).f30060a) {
                    case 3:
                        wz0Var = new wz0();
                        break;
                    default:
                        wz0Var = new wz0();
                        break;
                }
                uz0Var.add(Pair.create(c01Var2, wz0Var));
            }
            this.d = uz0Var.h();
        }
        if (!this.e) {
            for (wz0 wz0Var2 : (wz0[]) ((Object[]) this.d.d)) {
                wz0Var2.c();
            }
            int childCount2 = f01Var.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                yz0 d = f01Var.d(i14);
                a01 a01Var2 = d.f32769a;
                if (z10) {
                    c01Var = a01Var2.f24431b;
                } else {
                    c01Var = a01Var2.f24430a;
                }
                if (z10) {
                    i10 = d.f32776k;
                } else {
                    i10 = d.f32777l;
                }
                int e = f01Var.e(d, z10, false) + f01Var.e(d, z10, true) + i10;
                float f7 = c01Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f31912t[i14];
                }
                int i15 = e + i11;
                m.g3 g3Var2 = this.d;
                wz0 wz0Var3 = (wz0) ((Object[]) g3Var2.d)[((int[]) g3Var2.f16202b)[i14]];
                int i16 = wz0Var3.f32284c;
                if (c01Var.f25082c == f01.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                wz0Var3.f32284c = i12 & i16;
                int a2 = c01.a(c01Var, z10).a(d, i15);
                wz0Var3.b(a2, i15 - a2);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] g() {
        c01 c01Var;
        boolean z10;
        c01 c01Var2;
        if (this.f31908p == null) {
            this.f31908p = new int[e() + 1];
        }
        if (!this.f31909q) {
            int[] iArr = this.f31908p;
            boolean z11 = this.f31911s;
            float f7 = 0.0f;
            boolean z12 = this.f31896a;
            f01 f01Var = this.f31915x;
            if (!z11) {
                int childCount = f01Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        a01 a01Var = f01Var.d(i10).f32769a;
                        if (z12) {
                            c01Var2 = a01Var.f24431b;
                        } else {
                            c01Var2 = a01Var.f24430a;
                        }
                        if (c01Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f31910r = z10;
                this.f31911s = true;
            }
            if (!this.f31910r) {
                p(d(), iArr, true);
            } else {
                if (this.f31912t == null) {
                    this.f31912t = new int[f01Var.getChildCount()];
                }
                Arrays.fill(this.f31912t, 0);
                p(d(), iArr, true);
                int childCount2 = (f01Var.getChildCount() * this.v.f24764a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = f01Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        a01 a01Var2 = f01Var.d(i11).f32769a;
                        if (z12) {
                            c01Var = a01Var2.f24431b;
                        } else {
                            c01Var = a01Var2.f24430a;
                        }
                        f7 += c01Var.d;
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
            if (!this.f31913u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f31909q = true;
        }
        return this.f31908p;
    }

    public final int h() {
        c01 c01Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f31898c == Integer.MIN_VALUE) {
            f01 f01Var = this.f31915x;
            int childCount = f01Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                a01 a01Var = f01Var.d(i12).f32769a;
                if (this.f31896a) {
                    c01Var = a01Var.f24431b;
                } else {
                    c01Var = a01Var.f24430a;
                }
                zz0 zz0Var = c01Var.f25081b;
                i11 = Math.max(Math.max(Math.max(i11, zz0Var.f33074a), zz0Var.f33075b), zz0Var.a());
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f31898c = Math.max(0, i10);
        }
        return this.f31898c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        b01 b01Var = this.f31914w;
        b01 b01Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                b01Var2.f24764a = size;
                b01Var.f24764a = -size;
                this.f31909q = false;
                return g()[e()];
            }
            b01Var2.f24764a = 0;
            b01Var.f24764a = -100000;
            this.f31909q = false;
            return g()[e()];
        }
        b01Var2.f24764a = 0;
        b01Var.f24764a = -size;
        this.f31909q = false;
        return g()[e()];
    }

    public final void k() {
        this.f31898c = Integer.MIN_VALUE;
        this.d = null;
        this.f31899f = null;
        this.h = null;
        this.f31902j = null;
        this.f31904l = null;
        this.f31906n = null;
        this.f31908p = null;
        this.f31912t = null;
        this.f31911s = false;
        l();
    }

    public final void l() {
        this.e = false;
        this.f31900g = false;
        this.f31901i = false;
        this.f31903k = false;
        this.f31905m = false;
        this.f31907o = false;
        this.f31909q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f31896a) {
                str = "column";
            } else {
                str = "row";
            }
            f01.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.f31897b = i10;
    }

    public final void o(float f7, int i10) {
        c01 c01Var;
        Arrays.fill(this.f31912t, 0);
        f01 f01Var = this.f31915x;
        int childCount = f01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            a01 a01Var = f01Var.d(i11).f32769a;
            if (this.f31896a) {
                c01Var = a01Var.f24431b;
            } else {
                c01Var = a01Var.f24430a;
            }
            float f10 = c01Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f31912t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(tz0[] tz0VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < tz0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (tz0 tz0Var : tz0VarArr) {
                    z11 |= m(iArr, tz0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[tz0VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = tz0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, tz0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= tz0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    tz0 tz0Var2 = tz0VarArr[i14];
                    zz0 zz0Var = tz0Var2.f30799a;
                    if (zz0Var.f33074a >= zz0Var.f33075b) {
                        tz0Var2.f30801c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final tz0[] q(ArrayList arrayList) {
        e0.f0 f0Var = new e0.f0(this, (tz0[]) arrayList.toArray(new tz0[0]));
        int length = ((tz0[][]) f0Var.d).length;
        for (int i10 = 0; i10 < length; i10++) {
            f0Var.f(i10);
        }
        return (tz0[]) f0Var.f8096c;
    }
}
