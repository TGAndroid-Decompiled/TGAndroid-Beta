package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class vz0 {
    public final boolean f32378a;
    public la.h d;
    public la.h f32382f;
    public la.h h;
    public int[] f32385j;
    public int[] f32387l;
    public tz0[] f32389n;
    public int[] f32391p;
    public boolean f32393r;
    public int[] f32395t;
    public final f01 f32398x;
    public int f32379b = Integer.MIN_VALUE;
    public int f32380c = Integer.MIN_VALUE;
    public boolean f32381e = false;
    public boolean f32383g = false;
    public boolean f32384i = false;
    public boolean f32386k = false;
    public boolean f32388m = false;
    public boolean f32390o = false;
    public boolean f32392q = false;
    public boolean f32394s = false;
    public boolean f32396u = true;
    public final b01 v = new b01(0);
    public final b01 f32397w = new b01(-100000);

    public vz0(f01 f01Var, boolean z10) {
        this.f32398x = f01Var;
        this.f32378a = z10;
    }

    public static void j(ArrayList arrayList, zz0 zz0Var, b01 b01Var, boolean z10) {
        if (zz0Var.a() != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((tz0) obj).f31212a.equals(zz0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new tz0(zz0Var, b01Var));
        }
    }

    public static boolean m(int[] iArr, tz0 tz0Var) {
        if (tz0Var.f31214c) {
            zz0 zz0Var = tz0Var.f31212a;
            int i10 = zz0Var.f33680a;
            int i11 = zz0Var.f33681b;
            int i12 = iArr[i10] + tz0Var.f31213b.f24741a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(la.h hVar, boolean z10) {
        for (b01 b01Var : (b01[]) ((Object[]) hVar.d)) {
            b01Var.f24741a = Integer.MIN_VALUE;
        }
        wz0[] wz0VarArr = (wz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < wz0VarArr.length; i10++) {
            int d = wz0VarArr[i10].d(z10);
            b01 b01Var2 = (b01) ((Object[]) hVar.d)[((int[]) hVar.f15398b)[i10]];
            int i11 = b01Var2.f24741a;
            if (!z10) {
                d = -d;
            }
            b01Var2.f24741a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        c01 c01Var;
        int i10;
        if (z10) {
            iArr = this.f32385j;
        } else {
            iArr = this.f32387l;
        }
        f01 f01Var = this.f32398x;
        int childCount = f01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            yz0 d = f01Var.d(i11);
            a01 a01Var = d.f33306a;
            boolean z11 = this.f32378a;
            if (z11) {
                c01Var = a01Var.f24397b;
            } else {
                c01Var = a01Var.f24396a;
            }
            zz0 zz0Var = c01Var.f25155b;
            if (z10) {
                i10 = zz0Var.f33680a;
            } else {
                i10 = zz0Var.f33681b;
            }
            iArr[i10] = Math.max(iArr[i10], f01Var.f(d, z11, z10));
        }
    }

    public final la.h c(boolean z10) {
        zz0 zz0Var;
        uz0 uz0Var = new uz0(zz0.class, b01.class);
        c01[] c01VarArr = (c01[]) ((Object[]) f().f15399c);
        int length = c01VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                zz0Var = c01VarArr[i10].f25155b;
            } else {
                zz0 zz0Var2 = c01VarArr[i10].f25155b;
                zz0Var = new zz0(zz0Var2.f33681b, zz0Var2.f33680a);
            }
            ?? obj = new Object();
            obj.f24741a = Integer.MIN_VALUE;
            uz0Var.add(Pair.create(zz0Var, obj));
        }
        return uz0Var.i();
    }

    public final tz0[] d() {
        if (this.f32389n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f32382f == null) {
                this.f32382f = c(true);
            }
            if (!this.f32383g) {
                a(this.f32382f, true);
                this.f32383g = true;
            }
            la.h hVar = this.f32382f;
            int i10 = 0;
            while (true) {
                zz0[] zz0VarArr = (zz0[]) ((Object[]) hVar.f15399c);
                if (i10 >= zz0VarArr.length) {
                    break;
                }
                j(arrayList, zz0VarArr[i10], ((b01[]) ((Object[]) hVar.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f32384i) {
                a(this.h, false);
                this.f32384i = true;
            }
            la.h hVar2 = this.h;
            int i11 = 0;
            while (true) {
                zz0[] zz0VarArr2 = (zz0[]) ((Object[]) hVar2.f15399c);
                if (i11 >= zz0VarArr2.length) {
                    break;
                }
                j(arrayList2, zz0VarArr2[i11], ((b01[]) ((Object[]) hVar2.d))[i11], false);
                i11++;
            }
            if (this.f32396u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new zz0(i12, i13), new b01(0), true);
                    i12 = i13;
                }
            }
            int e7 = e();
            j(arrayList, new zz0(0, e7), this.v, false);
            j(arrayList2, new zz0(e7, 0), this.f32397w, false);
            tz0[] q6 = q(arrayList);
            tz0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(tz0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.f32389n = (tz0[]) objArr;
        }
        if (!this.f32390o) {
            if (this.f32382f == null) {
                this.f32382f = c(true);
            }
            if (!this.f32383g) {
                a(this.f32382f, true);
                this.f32383g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f32384i) {
                a(this.h, false);
                this.f32384i = true;
            }
            this.f32390o = true;
        }
        return this.f32389n;
    }

    public final int e() {
        int max = Math.max(this.f32379b, h());
        if (max <= 1024) {
            return max;
        }
        f01.g("Table grid count out of bounds");
        throw null;
    }

    public final la.h f() {
        c01 c01Var;
        int i10;
        int i11;
        int i12;
        c01 c01Var2;
        wz0 wz0Var;
        la.h hVar = this.d;
        boolean z10 = this.f32378a;
        f01 f01Var = this.f32398x;
        if (hVar == null) {
            uz0 uz0Var = new uz0(c01.class, wz0.class);
            int childCount = f01Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                a01 a01Var = f01Var.d(i13).f33306a;
                if (z10) {
                    c01Var2 = a01Var.f24397b;
                } else {
                    c01Var2 = a01Var.f24396a;
                }
                switch (c01.a(c01Var2, z10).f30548a) {
                    case 3:
                        wz0Var = new wz0();
                        break;
                    default:
                        wz0Var = new wz0();
                        break;
                }
                uz0Var.add(Pair.create(c01Var2, wz0Var));
            }
            this.d = uz0Var.i();
        }
        if (!this.f32381e) {
            for (wz0 wz0Var2 : (wz0[]) ((Object[]) this.d.d)) {
                wz0Var2.c();
            }
            int childCount2 = f01Var.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                yz0 d = f01Var.d(i14);
                a01 a01Var2 = d.f33306a;
                if (z10) {
                    c01Var = a01Var2.f24397b;
                } else {
                    c01Var = a01Var2.f24396a;
                }
                if (z10) {
                    i10 = d.f33314k;
                } else {
                    i10 = d.f33315l;
                }
                int e7 = f01Var.e(d, z10, false) + f01Var.e(d, z10, true) + i10;
                float f7 = c01Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f32395t[i14];
                }
                int i15 = e7 + i11;
                la.h hVar2 = this.d;
                wz0 wz0Var3 = (wz0) ((Object[]) hVar2.d)[((int[]) hVar2.f15398b)[i14]];
                int i16 = wz0Var3.f32678c;
                if (c01Var.f25156c == f01.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                wz0Var3.f32678c = i12 & i16;
                int a2 = c01.a(c01Var, z10).a(d, i15);
                wz0Var3.b(a2, i15 - a2);
            }
            this.f32381e = true;
        }
        return this.d;
    }

    public final int[] g() {
        c01 c01Var;
        boolean z10;
        c01 c01Var2;
        if (this.f32391p == null) {
            this.f32391p = new int[e() + 1];
        }
        if (!this.f32392q) {
            int[] iArr = this.f32391p;
            boolean z11 = this.f32394s;
            float f7 = 0.0f;
            boolean z12 = this.f32378a;
            f01 f01Var = this.f32398x;
            if (!z11) {
                int childCount = f01Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        a01 a01Var = f01Var.d(i10).f33306a;
                        if (z12) {
                            c01Var2 = a01Var.f24397b;
                        } else {
                            c01Var2 = a01Var.f24396a;
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
                this.f32393r = z10;
                this.f32394s = true;
            }
            if (!this.f32393r) {
                p(d(), iArr, true);
            } else {
                if (this.f32395t == null) {
                    this.f32395t = new int[f01Var.getChildCount()];
                }
                Arrays.fill(this.f32395t, 0);
                p(d(), iArr, true);
                int childCount2 = (f01Var.getChildCount() * this.v.f24741a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = f01Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        a01 a01Var2 = f01Var.d(i11).f33306a;
                        if (z12) {
                            c01Var = a01Var2.f24397b;
                        } else {
                            c01Var = a01Var2.f24396a;
                        }
                        f7 += c01Var.d;
                    }
                    int i12 = -1;
                    int i13 = 0;
                    boolean z13 = true;
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
            if (!this.f32396u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f32392q = true;
        }
        return this.f32391p;
    }

    public final int h() {
        c01 c01Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f32380c == Integer.MIN_VALUE) {
            f01 f01Var = this.f32398x;
            int childCount = f01Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                a01 a01Var = f01Var.d(i12).f33306a;
                if (this.f32378a) {
                    c01Var = a01Var.f24397b;
                } else {
                    c01Var = a01Var.f24396a;
                }
                zz0 zz0Var = c01Var.f25155b;
                i11 = Math.max(Math.max(Math.max(i11, zz0Var.f33680a), zz0Var.f33681b), zz0Var.a());
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f32380c = Math.max(0, i10);
        }
        return this.f32380c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        b01 b01Var = this.f32397w;
        b01 b01Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                b01Var2.f24741a = size;
                b01Var.f24741a = -size;
                this.f32392q = false;
                return g()[e()];
            }
            b01Var2.f24741a = 0;
            b01Var.f24741a = -100000;
            this.f32392q = false;
            return g()[e()];
        }
        b01Var2.f24741a = 0;
        b01Var.f24741a = -size;
        this.f32392q = false;
        return g()[e()];
    }

    public final void k() {
        this.f32380c = Integer.MIN_VALUE;
        this.d = null;
        this.f32382f = null;
        this.h = null;
        this.f32385j = null;
        this.f32387l = null;
        this.f32389n = null;
        this.f32391p = null;
        this.f32395t = null;
        this.f32394s = false;
        l();
    }

    public final void l() {
        this.f32381e = false;
        this.f32383g = false;
        this.f32384i = false;
        this.f32386k = false;
        this.f32388m = false;
        this.f32390o = false;
        this.f32392q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f32378a) {
                str = "column";
            } else {
                str = "row";
            }
            f01.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.f32379b = i10;
    }

    public final void o(float f7, int i10) {
        c01 c01Var;
        Arrays.fill(this.f32395t, 0);
        f01 f01Var = this.f32398x;
        int childCount = f01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            a01 a01Var = f01Var.d(i11).f33306a;
            if (this.f32378a) {
                c01Var = a01Var.f24397b;
            } else {
                c01Var = a01Var.f24396a;
            }
            float f10 = c01Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f32395t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(tz0[] tz0VarArr, int[] iArr, boolean z10) {
        int e7 = e() + 1;
        loop0: for (int i10 = 0; i10 < tz0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e7; i11++) {
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
            for (int i12 = 0; i12 < e7; i12++) {
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
                    zz0 zz0Var = tz0Var2.f31212a;
                    if (zz0Var.f33680a >= zz0Var.f33681b) {
                        tz0Var2.f31214c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final tz0[] q(ArrayList arrayList) {
        e0.i0 i0Var = new e0.i0(this, (tz0[]) arrayList.toArray(new tz0[0]));
        int length = ((tz0[][]) i0Var.f8427c).length;
        for (int i10 = 0; i10 < length; i10++) {
            i0Var.f(i10);
        }
        return (tz0[]) i0Var.f8426b;
    }
}
