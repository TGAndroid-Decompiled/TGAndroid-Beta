package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class tz0 {
    public final boolean f30823a;
    public m.g3 d;
    public m.g3 f30826f;
    public m.g3 h;
    public int[] f30829j;
    public int[] f30831l;
    public rz0[] f30833n;
    public int[] f30835p;
    public boolean f30837r;
    public int[] f30839t;
    public final d01 f30842x;
    public int f30824b = Integer.MIN_VALUE;
    public int f30825c = Integer.MIN_VALUE;
    public boolean e = false;
    public boolean f30827g = false;
    public boolean f30828i = false;
    public boolean f30830k = false;
    public boolean f30832m = false;
    public boolean f30834o = false;
    public boolean f30836q = false;
    public boolean f30838s = false;
    public boolean f30840u = true;
    public final zz0 v = new zz0(0);
    public final zz0 f30841w = new zz0(-100000);

    public tz0(d01 d01Var, boolean z10) {
        this.f30842x = d01Var;
        this.f30823a = z10;
    }

    public static void j(ArrayList arrayList, xz0 xz0Var, zz0 zz0Var, boolean z10) {
        if (xz0Var.a() != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((rz0) obj).f30086a.equals(xz0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new rz0(xz0Var, zz0Var));
        }
    }

    public static boolean m(int[] iArr, rz0 rz0Var) {
        if (rz0Var.f30088c) {
            xz0 xz0Var = rz0Var.f30086a;
            int i10 = xz0Var.f32480a;
            int i11 = xz0Var.f32481b;
            int i12 = iArr[i10] + rz0Var.f30087b.f33062a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(m.g3 g3Var, boolean z10) {
        for (zz0 zz0Var : (zz0[]) ((Object[]) g3Var.d)) {
            zz0Var.f33062a = Integer.MIN_VALUE;
        }
        uz0[] uz0VarArr = (uz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < uz0VarArr.length; i10++) {
            int d = uz0VarArr[i10].d(z10);
            zz0 zz0Var2 = (zz0) ((Object[]) g3Var.d)[((int[]) g3Var.f16201b)[i10]];
            int i11 = zz0Var2.f33062a;
            if (!z10) {
                d = -d;
            }
            zz0Var2.f33062a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        a01 a01Var;
        int i10;
        if (z10) {
            iArr = this.f30829j;
        } else {
            iArr = this.f30831l;
        }
        d01 d01Var = this.f30842x;
        int childCount = d01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            wz0 d = d01Var.d(i11);
            yz0 yz0Var = d.f32246a;
            boolean z11 = this.f30823a;
            if (z11) {
                a01Var = yz0Var.f32788b;
            } else {
                a01Var = yz0Var.f32787a;
            }
            xz0 xz0Var = a01Var.f24427b;
            if (z10) {
                i10 = xz0Var.f32480a;
            } else {
                i10 = xz0Var.f32481b;
            }
            iArr[i10] = Math.max(iArr[i10], d01Var.f(d, z11, z10));
        }
    }

    public final m.g3 c(boolean z10) {
        xz0 xz0Var;
        sz0 sz0Var = new sz0(xz0.class, zz0.class);
        a01[] a01VarArr = (a01[]) ((Object[]) f().f16202c);
        int length = a01VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                xz0Var = a01VarArr[i10].f24427b;
            } else {
                xz0 xz0Var2 = a01VarArr[i10].f24427b;
                xz0Var = new xz0(xz0Var2.f32481b, xz0Var2.f32480a);
            }
            ?? obj = new Object();
            obj.f33062a = Integer.MIN_VALUE;
            sz0Var.add(Pair.create(xz0Var, obj));
        }
        return sz0Var.h();
    }

    public final rz0[] d() {
        if (this.f30833n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f30826f == null) {
                this.f30826f = c(true);
            }
            if (!this.f30827g) {
                a(this.f30826f, true);
                this.f30827g = true;
            }
            m.g3 g3Var = this.f30826f;
            int i10 = 0;
            while (true) {
                xz0[] xz0VarArr = (xz0[]) ((Object[]) g3Var.f16202c);
                if (i10 >= xz0VarArr.length) {
                    break;
                }
                j(arrayList, xz0VarArr[i10], ((zz0[]) ((Object[]) g3Var.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f30828i) {
                a(this.h, false);
                this.f30828i = true;
            }
            m.g3 g3Var2 = this.h;
            int i11 = 0;
            while (true) {
                xz0[] xz0VarArr2 = (xz0[]) ((Object[]) g3Var2.f16202c);
                if (i11 >= xz0VarArr2.length) {
                    break;
                }
                j(arrayList2, xz0VarArr2[i11], ((zz0[]) ((Object[]) g3Var2.d))[i11], false);
                i11++;
            }
            if (this.f30840u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new xz0(i12, i13), new zz0(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new xz0(0, e), this.v, false);
            j(arrayList2, new xz0(e, 0), this.f30841w, false);
            rz0[] q6 = q(arrayList);
            rz0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(rz0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.f30833n = (rz0[]) objArr;
        }
        if (!this.f30834o) {
            if (this.f30826f == null) {
                this.f30826f = c(true);
            }
            if (!this.f30827g) {
                a(this.f30826f, true);
                this.f30827g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f30828i) {
                a(this.h, false);
                this.f30828i = true;
            }
            this.f30834o = true;
        }
        return this.f30833n;
    }

    public final int e() {
        int max = Math.max(this.f30824b, h());
        if (max <= 1024) {
            return max;
        }
        d01.g("Table grid count out of bounds");
        throw null;
    }

    public final m.g3 f() {
        a01 a01Var;
        int i10;
        int i11;
        int i12;
        a01 a01Var2;
        uz0 uz0Var;
        m.g3 g3Var = this.d;
        boolean z10 = this.f30823a;
        d01 d01Var = this.f30842x;
        if (g3Var == null) {
            sz0 sz0Var = new sz0(a01.class, uz0.class);
            int childCount = d01Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                yz0 yz0Var = d01Var.d(i13).f32246a;
                if (z10) {
                    a01Var2 = yz0Var.f32788b;
                } else {
                    a01Var2 = yz0Var.f32787a;
                }
                switch (a01.a(a01Var2, z10).f29472a) {
                    case 3:
                        uz0Var = new uz0();
                        break;
                    default:
                        uz0Var = new uz0();
                        break;
                }
                sz0Var.add(Pair.create(a01Var2, uz0Var));
            }
            this.d = sz0Var.h();
        }
        if (!this.e) {
            for (uz0 uz0Var2 : (uz0[]) ((Object[]) this.d.d)) {
                uz0Var2.c();
            }
            int childCount2 = d01Var.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                wz0 d = d01Var.d(i14);
                yz0 yz0Var2 = d.f32246a;
                if (z10) {
                    a01Var = yz0Var2.f32788b;
                } else {
                    a01Var = yz0Var2.f32787a;
                }
                if (z10) {
                    i10 = d.f32253k;
                } else {
                    i10 = d.f32254l;
                }
                int e = d01Var.e(d, z10, false) + d01Var.e(d, z10, true) + i10;
                float f7 = a01Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f30839t[i14];
                }
                int i15 = e + i11;
                m.g3 g3Var2 = this.d;
                uz0 uz0Var3 = (uz0) ((Object[]) g3Var2.d)[((int[]) g3Var2.f16201b)[i14]];
                int i16 = uz0Var3.f31111c;
                if (a01Var.f24428c == d01.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                uz0Var3.f31111c = i12 & i16;
                int a2 = a01.a(a01Var, z10).a(d, i15);
                uz0Var3.b(a2, i15 - a2);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] g() {
        a01 a01Var;
        boolean z10;
        a01 a01Var2;
        if (this.f30835p == null) {
            this.f30835p = new int[e() + 1];
        }
        if (!this.f30836q) {
            int[] iArr = this.f30835p;
            boolean z11 = this.f30838s;
            float f7 = 0.0f;
            boolean z12 = this.f30823a;
            d01 d01Var = this.f30842x;
            if (!z11) {
                int childCount = d01Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        yz0 yz0Var = d01Var.d(i10).f32246a;
                        if (z12) {
                            a01Var2 = yz0Var.f32788b;
                        } else {
                            a01Var2 = yz0Var.f32787a;
                        }
                        if (a01Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f30837r = z10;
                this.f30838s = true;
            }
            if (!this.f30837r) {
                p(d(), iArr, true);
            } else {
                if (this.f30839t == null) {
                    this.f30839t = new int[d01Var.getChildCount()];
                }
                Arrays.fill(this.f30839t, 0);
                p(d(), iArr, true);
                int childCount2 = (d01Var.getChildCount() * this.v.f33062a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = d01Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        yz0 yz0Var2 = d01Var.d(i11).f32246a;
                        if (z12) {
                            a01Var = yz0Var2.f32788b;
                        } else {
                            a01Var = yz0Var2.f32787a;
                        }
                        f7 += a01Var.d;
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
            if (!this.f30840u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f30836q = true;
        }
        return this.f30835p;
    }

    public final int h() {
        a01 a01Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f30825c == Integer.MIN_VALUE) {
            d01 d01Var = this.f30842x;
            int childCount = d01Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                yz0 yz0Var = d01Var.d(i12).f32246a;
                if (this.f30823a) {
                    a01Var = yz0Var.f32788b;
                } else {
                    a01Var = yz0Var.f32787a;
                }
                xz0 xz0Var = a01Var.f24427b;
                i11 = Math.max(Math.max(Math.max(i11, xz0Var.f32480a), xz0Var.f32481b), xz0Var.a());
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f30825c = Math.max(0, i10);
        }
        return this.f30825c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        zz0 zz0Var = this.f30841w;
        zz0 zz0Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                zz0Var2.f33062a = size;
                zz0Var.f33062a = -size;
                this.f30836q = false;
                return g()[e()];
            }
            zz0Var2.f33062a = 0;
            zz0Var.f33062a = -100000;
            this.f30836q = false;
            return g()[e()];
        }
        zz0Var2.f33062a = 0;
        zz0Var.f33062a = -size;
        this.f30836q = false;
        return g()[e()];
    }

    public final void k() {
        this.f30825c = Integer.MIN_VALUE;
        this.d = null;
        this.f30826f = null;
        this.h = null;
        this.f30829j = null;
        this.f30831l = null;
        this.f30833n = null;
        this.f30835p = null;
        this.f30839t = null;
        this.f30838s = false;
        l();
    }

    public final void l() {
        this.e = false;
        this.f30827g = false;
        this.f30828i = false;
        this.f30830k = false;
        this.f30832m = false;
        this.f30834o = false;
        this.f30836q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f30823a) {
                str = "column";
            } else {
                str = "row";
            }
            d01.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.f30824b = i10;
    }

    public final void o(float f7, int i10) {
        a01 a01Var;
        Arrays.fill(this.f30839t, 0);
        d01 d01Var = this.f30842x;
        int childCount = d01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            yz0 yz0Var = d01Var.d(i11).f32246a;
            if (this.f30823a) {
                a01Var = yz0Var.f32788b;
            } else {
                a01Var = yz0Var.f32787a;
            }
            float f10 = a01Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f30839t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(rz0[] rz0VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < rz0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (rz0 rz0Var : rz0VarArr) {
                    z11 |= m(iArr, rz0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[rz0VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = rz0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, rz0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= rz0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    rz0 rz0Var2 = rz0VarArr[i14];
                    xz0 xz0Var = rz0Var2.f30086a;
                    if (xz0Var.f32480a >= xz0Var.f32481b) {
                        rz0Var2.f30088c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final rz0[] q(ArrayList arrayList) {
        e0.f0 f0Var = new e0.f0(this, (rz0[]) arrayList.toArray(new rz0[0]));
        int length = ((rz0[][]) f0Var.d).length;
        for (int i10 = 0; i10 < length; i10++) {
            f0Var.f(i10);
        }
        return (rz0[]) f0Var.f8097c;
    }
}
