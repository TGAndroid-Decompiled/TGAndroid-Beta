package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class yz0 {
    public final boolean f31386a;
    public m.h3 d;
    public m.h3 f31389f;
    public m.h3 h;
    public int[] f31392j;
    public int[] f31394l;
    public wz0[] f31396n;
    public int[] f31398p;
    public boolean f31400r;
    public int[] f31402t;
    public final i01 f31405x;
    public int f31387b = Integer.MIN_VALUE;
    public int f31388c = Integer.MIN_VALUE;
    public boolean e = false;
    public boolean f31390g = false;
    public boolean f31391i = false;
    public boolean f31393k = false;
    public boolean f31395m = false;
    public boolean f31397o = false;
    public boolean f31399q = false;
    public boolean f31401s = false;
    public boolean f31403u = true;
    public final e01 v = new e01(0);
    public final e01 f31404w = new e01(-100000);

    public yz0(i01 i01Var, boolean z10) {
        this.f31405x = i01Var;
        this.f31386a = z10;
    }

    public static void j(ArrayList arrayList, c01 c01Var, e01 e01Var, boolean z10) {
        if (c01Var.a() != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((wz0) obj).f30783a.equals(c01Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new wz0(c01Var, e01Var));
        }
    }

    public static boolean m(int[] iArr, wz0 wz0Var) {
        if (wz0Var.f30785c) {
            c01 c01Var = wz0Var.f30783a;
            int i10 = c01Var.f23601a;
            int i11 = c01Var.f23602b;
            int i12 = iArr[i10] + wz0Var.f30784b.f24243a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(m.h3 h3Var, boolean z10) {
        for (e01 e01Var : (e01[]) ((Object[]) h3Var.d)) {
            e01Var.f24243a = Integer.MIN_VALUE;
        }
        zz0[] zz0VarArr = (zz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < zz0VarArr.length; i10++) {
            int d = zz0VarArr[i10].d(z10);
            e01 e01Var2 = (e01) ((Object[]) h3Var.d)[((int[]) h3Var.f14850b)[i10]];
            int i11 = e01Var2.f24243a;
            if (!z10) {
                d = -d;
            }
            e01Var2.f24243a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        f01 f01Var;
        int i10;
        if (z10) {
            iArr = this.f31392j;
        } else {
            iArr = this.f31394l;
        }
        i01 i01Var = this.f31405x;
        int childCount = i01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            b01 d = i01Var.d(i11);
            d01 d01Var = d.f23335a;
            boolean z11 = this.f31386a;
            if (z11) {
                f01Var = d01Var.f23927b;
            } else {
                f01Var = d01Var.f23926a;
            }
            c01 c01Var = f01Var.f24538b;
            if (z10) {
                i10 = c01Var.f23601a;
            } else {
                i10 = c01Var.f23602b;
            }
            iArr[i10] = Math.max(iArr[i10], i01Var.f(d, z11, z10));
        }
    }

    public final m.h3 c(boolean z10) {
        c01 c01Var;
        xz0 xz0Var = new xz0(c01.class, e01.class);
        f01[] f01VarArr = (f01[]) ((Object[]) f().f14851c);
        int length = f01VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                c01Var = f01VarArr[i10].f24538b;
            } else {
                c01 c01Var2 = f01VarArr[i10].f24538b;
                c01Var = new c01(c01Var2.f23602b, c01Var2.f23601a);
            }
            ?? obj = new Object();
            obj.f24243a = Integer.MIN_VALUE;
            xz0Var.add(Pair.create(c01Var, obj));
        }
        return xz0Var.h();
    }

    public final wz0[] d() {
        if (this.f31396n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f31389f == null) {
                this.f31389f = c(true);
            }
            if (!this.f31390g) {
                a(this.f31389f, true);
                this.f31390g = true;
            }
            m.h3 h3Var = this.f31389f;
            int i10 = 0;
            while (true) {
                c01[] c01VarArr = (c01[]) ((Object[]) h3Var.f14851c);
                if (i10 >= c01VarArr.length) {
                    break;
                }
                j(arrayList, c01VarArr[i10], ((e01[]) ((Object[]) h3Var.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f31391i) {
                a(this.h, false);
                this.f31391i = true;
            }
            m.h3 h3Var2 = this.h;
            int i11 = 0;
            while (true) {
                c01[] c01VarArr2 = (c01[]) ((Object[]) h3Var2.f14851c);
                if (i11 >= c01VarArr2.length) {
                    break;
                }
                j(arrayList2, c01VarArr2[i11], ((e01[]) ((Object[]) h3Var2.d))[i11], false);
                i11++;
            }
            if (this.f31403u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new c01(i12, i13), new e01(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new c01(0, e), this.v, false);
            j(arrayList2, new c01(e, 0), this.f31404w, false);
            wz0[] q6 = q(arrayList);
            wz0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(wz0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.f31396n = (wz0[]) objArr;
        }
        if (!this.f31397o) {
            if (this.f31389f == null) {
                this.f31389f = c(true);
            }
            if (!this.f31390g) {
                a(this.f31389f, true);
                this.f31390g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f31391i) {
                a(this.h, false);
                this.f31391i = true;
            }
            this.f31397o = true;
        }
        return this.f31396n;
    }

    public final int e() {
        int max = Math.max(this.f31387b, h());
        if (max <= 1024) {
            return max;
        }
        i01.g("Table grid count out of bounds");
        throw null;
    }

    public final m.h3 f() {
        f01 f01Var;
        int i10;
        int i11;
        int i12;
        f01 f01Var2;
        zz0 zz0Var;
        m.h3 h3Var = this.d;
        boolean z10 = this.f31386a;
        i01 i01Var = this.f31405x;
        if (h3Var == null) {
            xz0 xz0Var = new xz0(f01.class, zz0.class);
            int childCount = i01Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                d01 d01Var = i01Var.d(i13).f23335a;
                if (z10) {
                    f01Var2 = d01Var.f23927b;
                } else {
                    f01Var2 = d01Var.f23926a;
                }
                switch (f01.a(f01Var2, z10).f29517a) {
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
                d01 d01Var2 = d.f23335a;
                if (z10) {
                    f01Var = d01Var2.f23927b;
                } else {
                    f01Var = d01Var2.f23926a;
                }
                if (z10) {
                    i10 = d.f23342k;
                } else {
                    i10 = d.f23343l;
                }
                int e = i01Var.e(d, z10, false) + i01Var.e(d, z10, true) + i10;
                float f7 = f01Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f31402t[i14];
                }
                int i15 = e + i11;
                m.h3 h3Var2 = this.d;
                zz0 zz0Var3 = (zz0) ((Object[]) h3Var2.d)[((int[]) h3Var2.f14850b)[i14]];
                int i16 = zz0Var3.f31724c;
                if (f01Var.f24539c == i01.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                zz0Var3.f31724c = i12 & i16;
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
        if (this.f31398p == null) {
            this.f31398p = new int[e() + 1];
        }
        if (!this.f31399q) {
            int[] iArr = this.f31398p;
            boolean z11 = this.f31401s;
            float f7 = 0.0f;
            boolean z12 = this.f31386a;
            i01 i01Var = this.f31405x;
            if (!z11) {
                int childCount = i01Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        d01 d01Var = i01Var.d(i10).f23335a;
                        if (z12) {
                            f01Var2 = d01Var.f23927b;
                        } else {
                            f01Var2 = d01Var.f23926a;
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
                this.f31400r = z10;
                this.f31401s = true;
            }
            if (!this.f31400r) {
                p(d(), iArr, true);
            } else {
                if (this.f31402t == null) {
                    this.f31402t = new int[i01Var.getChildCount()];
                }
                Arrays.fill(this.f31402t, 0);
                p(d(), iArr, true);
                int childCount2 = (i01Var.getChildCount() * this.v.f24243a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = i01Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        d01 d01Var2 = i01Var.d(i11).f23335a;
                        if (z12) {
                            f01Var = d01Var2.f23927b;
                        } else {
                            f01Var = d01Var2.f23926a;
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
            if (!this.f31403u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f31399q = true;
        }
        return this.f31398p;
    }

    public final int h() {
        f01 f01Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f31388c == Integer.MIN_VALUE) {
            i01 i01Var = this.f31405x;
            int childCount = i01Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                d01 d01Var = i01Var.d(i12).f23335a;
                if (this.f31386a) {
                    f01Var = d01Var.f23927b;
                } else {
                    f01Var = d01Var.f23926a;
                }
                c01 c01Var = f01Var.f24538b;
                i11 = Math.max(Math.max(Math.max(i11, c01Var.f23601a), c01Var.f23602b), c01Var.a());
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f31388c = Math.max(0, i10);
        }
        return this.f31388c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        e01 e01Var = this.f31404w;
        e01 e01Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                e01Var2.f24243a = size;
                e01Var.f24243a = -size;
                this.f31399q = false;
                return g()[e()];
            }
            e01Var2.f24243a = 0;
            e01Var.f24243a = -100000;
            this.f31399q = false;
            return g()[e()];
        }
        e01Var2.f24243a = 0;
        e01Var.f24243a = -size;
        this.f31399q = false;
        return g()[e()];
    }

    public final void k() {
        this.f31388c = Integer.MIN_VALUE;
        this.d = null;
        this.f31389f = null;
        this.h = null;
        this.f31392j = null;
        this.f31394l = null;
        this.f31396n = null;
        this.f31398p = null;
        this.f31402t = null;
        this.f31401s = false;
        l();
    }

    public final void l() {
        this.e = false;
        this.f31390g = false;
        this.f31391i = false;
        this.f31393k = false;
        this.f31395m = false;
        this.f31397o = false;
        this.f31399q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f31386a) {
                str = "column";
            } else {
                str = "row";
            }
            i01.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.f31387b = i10;
    }

    public final void o(float f7, int i10) {
        f01 f01Var;
        Arrays.fill(this.f31402t, 0);
        i01 i01Var = this.f31405x;
        int childCount = i01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            d01 d01Var = i01Var.d(i11).f23335a;
            if (this.f31386a) {
                f01Var = d01Var.f23927b;
            } else {
                f01Var = d01Var.f23926a;
            }
            float f10 = f01Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f31402t[i11] = round;
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
                    c01 c01Var = wz0Var2.f30783a;
                    if (c01Var.f23601a >= c01Var.f23602b) {
                        wz0Var2.f30785c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final wz0[] q(ArrayList arrayList) {
        e0.g0 g0Var = new e0.g0(this, (wz0[]) arrayList.toArray(new wz0[0]));
        int length = ((wz0[][]) g0Var.f8222c).length;
        for (int i10 = 0; i10 < length; i10++) {
            g0Var.f(i10);
        }
        return (wz0[]) g0Var.f8221b;
    }
}
