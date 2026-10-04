package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class vz0 {
    public final boolean f32377a;
    public la.h d;
    public la.h f32381f;
    public la.h h;
    public int[] f32384j;
    public int[] f32386l;
    public tz0[] f32388n;
    public int[] f32390p;
    public boolean f32392r;
    public int[] f32394t;
    public final f01 f32397x;
    public int f32378b = Integer.MIN_VALUE;
    public int f32379c = Integer.MIN_VALUE;
    public boolean f32380e = false;
    public boolean f32382g = false;
    public boolean f32383i = false;
    public boolean f32385k = false;
    public boolean f32387m = false;
    public boolean f32389o = false;
    public boolean f32391q = false;
    public boolean f32393s = false;
    public boolean f32395u = true;
    public final b01 v = new b01(0);
    public final b01 f32396w = new b01(-100000);

    public vz0(f01 f01Var, boolean z10) {
        this.f32397x = f01Var;
        this.f32377a = z10;
    }

    public static void j(ArrayList arrayList, zz0 zz0Var, b01 b01Var, boolean z10) {
        if (zz0Var.a() != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((tz0) obj).f31211a.equals(zz0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new tz0(zz0Var, b01Var));
        }
    }

    public static boolean m(int[] iArr, tz0 tz0Var) {
        if (tz0Var.f31213c) {
            zz0 zz0Var = tz0Var.f31211a;
            int i10 = zz0Var.f33679a;
            int i11 = zz0Var.f33680b;
            int i12 = iArr[i10] + tz0Var.f31212b.f24740a;
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
            b01Var.f24740a = Integer.MIN_VALUE;
        }
        wz0[] wz0VarArr = (wz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < wz0VarArr.length; i10++) {
            int d = wz0VarArr[i10].d(z10);
            b01 b01Var2 = (b01) ((Object[]) hVar.d)[((int[]) hVar.f15397b)[i10]];
            int i11 = b01Var2.f24740a;
            if (!z10) {
                d = -d;
            }
            b01Var2.f24740a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        c01 c01Var;
        int i10;
        if (z10) {
            iArr = this.f32384j;
        } else {
            iArr = this.f32386l;
        }
        f01 f01Var = this.f32397x;
        int childCount = f01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            yz0 d = f01Var.d(i11);
            a01 a01Var = d.f33305a;
            boolean z11 = this.f32377a;
            if (z11) {
                c01Var = a01Var.f24396b;
            } else {
                c01Var = a01Var.f24395a;
            }
            zz0 zz0Var = c01Var.f25154b;
            if (z10) {
                i10 = zz0Var.f33679a;
            } else {
                i10 = zz0Var.f33680b;
            }
            iArr[i10] = Math.max(iArr[i10], f01Var.f(d, z11, z10));
        }
    }

    public final la.h c(boolean z10) {
        zz0 zz0Var;
        uz0 uz0Var = new uz0(zz0.class, b01.class);
        c01[] c01VarArr = (c01[]) ((Object[]) f().f15398c);
        int length = c01VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                zz0Var = c01VarArr[i10].f25154b;
            } else {
                zz0 zz0Var2 = c01VarArr[i10].f25154b;
                zz0Var = new zz0(zz0Var2.f33680b, zz0Var2.f33679a);
            }
            ?? obj = new Object();
            obj.f24740a = Integer.MIN_VALUE;
            uz0Var.add(Pair.create(zz0Var, obj));
        }
        return uz0Var.i();
    }

    public final tz0[] d() {
        if (this.f32388n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f32381f == null) {
                this.f32381f = c(true);
            }
            if (!this.f32382g) {
                a(this.f32381f, true);
                this.f32382g = true;
            }
            la.h hVar = this.f32381f;
            int i10 = 0;
            while (true) {
                zz0[] zz0VarArr = (zz0[]) ((Object[]) hVar.f15398c);
                if (i10 >= zz0VarArr.length) {
                    break;
                }
                j(arrayList, zz0VarArr[i10], ((b01[]) ((Object[]) hVar.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f32383i) {
                a(this.h, false);
                this.f32383i = true;
            }
            la.h hVar2 = this.h;
            int i11 = 0;
            while (true) {
                zz0[] zz0VarArr2 = (zz0[]) ((Object[]) hVar2.f15398c);
                if (i11 >= zz0VarArr2.length) {
                    break;
                }
                j(arrayList2, zz0VarArr2[i11], ((b01[]) ((Object[]) hVar2.d))[i11], false);
                i11++;
            }
            if (this.f32395u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new zz0(i12, i13), new b01(0), true);
                    i12 = i13;
                }
            }
            int e7 = e();
            j(arrayList, new zz0(0, e7), this.v, false);
            j(arrayList2, new zz0(e7, 0), this.f32396w, false);
            tz0[] q6 = q(arrayList);
            tz0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(tz0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.f32388n = (tz0[]) objArr;
        }
        if (!this.f32389o) {
            if (this.f32381f == null) {
                this.f32381f = c(true);
            }
            if (!this.f32382g) {
                a(this.f32381f, true);
                this.f32382g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f32383i) {
                a(this.h, false);
                this.f32383i = true;
            }
            this.f32389o = true;
        }
        return this.f32388n;
    }

    public final int e() {
        int max = Math.max(this.f32378b, h());
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
        boolean z10 = this.f32377a;
        f01 f01Var = this.f32397x;
        if (hVar == null) {
            uz0 uz0Var = new uz0(c01.class, wz0.class);
            int childCount = f01Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                a01 a01Var = f01Var.d(i13).f33305a;
                if (z10) {
                    c01Var2 = a01Var.f24396b;
                } else {
                    c01Var2 = a01Var.f24395a;
                }
                switch (c01.a(c01Var2, z10).f30547a) {
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
        if (!this.f32380e) {
            for (wz0 wz0Var2 : (wz0[]) ((Object[]) this.d.d)) {
                wz0Var2.c();
            }
            int childCount2 = f01Var.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                yz0 d = f01Var.d(i14);
                a01 a01Var2 = d.f33305a;
                if (z10) {
                    c01Var = a01Var2.f24396b;
                } else {
                    c01Var = a01Var2.f24395a;
                }
                if (z10) {
                    i10 = d.f33313k;
                } else {
                    i10 = d.f33314l;
                }
                int e7 = f01Var.e(d, z10, false) + f01Var.e(d, z10, true) + i10;
                float f7 = c01Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f32394t[i14];
                }
                int i15 = e7 + i11;
                la.h hVar2 = this.d;
                wz0 wz0Var3 = (wz0) ((Object[]) hVar2.d)[((int[]) hVar2.f15397b)[i14]];
                int i16 = wz0Var3.f32677c;
                if (c01Var.f25155c == f01.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                wz0Var3.f32677c = i12 & i16;
                int a2 = c01.a(c01Var, z10).a(d, i15);
                wz0Var3.b(a2, i15 - a2);
            }
            this.f32380e = true;
        }
        return this.d;
    }

    public final int[] g() {
        c01 c01Var;
        boolean z10;
        c01 c01Var2;
        if (this.f32390p == null) {
            this.f32390p = new int[e() + 1];
        }
        if (!this.f32391q) {
            int[] iArr = this.f32390p;
            boolean z11 = this.f32393s;
            float f7 = 0.0f;
            boolean z12 = this.f32377a;
            f01 f01Var = this.f32397x;
            if (!z11) {
                int childCount = f01Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        a01 a01Var = f01Var.d(i10).f33305a;
                        if (z12) {
                            c01Var2 = a01Var.f24396b;
                        } else {
                            c01Var2 = a01Var.f24395a;
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
                this.f32392r = z10;
                this.f32393s = true;
            }
            if (!this.f32392r) {
                p(d(), iArr, true);
            } else {
                if (this.f32394t == null) {
                    this.f32394t = new int[f01Var.getChildCount()];
                }
                Arrays.fill(this.f32394t, 0);
                p(d(), iArr, true);
                int childCount2 = (f01Var.getChildCount() * this.v.f24740a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = f01Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        a01 a01Var2 = f01Var.d(i11).f33305a;
                        if (z12) {
                            c01Var = a01Var2.f24396b;
                        } else {
                            c01Var = a01Var2.f24395a;
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
            if (!this.f32395u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f32391q = true;
        }
        return this.f32390p;
    }

    public final int h() {
        c01 c01Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f32379c == Integer.MIN_VALUE) {
            f01 f01Var = this.f32397x;
            int childCount = f01Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                a01 a01Var = f01Var.d(i12).f33305a;
                if (this.f32377a) {
                    c01Var = a01Var.f24396b;
                } else {
                    c01Var = a01Var.f24395a;
                }
                zz0 zz0Var = c01Var.f25154b;
                i11 = Math.max(Math.max(Math.max(i11, zz0Var.f33679a), zz0Var.f33680b), zz0Var.a());
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f32379c = Math.max(0, i10);
        }
        return this.f32379c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        b01 b01Var = this.f32396w;
        b01 b01Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                b01Var2.f24740a = size;
                b01Var.f24740a = -size;
                this.f32391q = false;
                return g()[e()];
            }
            b01Var2.f24740a = 0;
            b01Var.f24740a = -100000;
            this.f32391q = false;
            return g()[e()];
        }
        b01Var2.f24740a = 0;
        b01Var.f24740a = -size;
        this.f32391q = false;
        return g()[e()];
    }

    public final void k() {
        this.f32379c = Integer.MIN_VALUE;
        this.d = null;
        this.f32381f = null;
        this.h = null;
        this.f32384j = null;
        this.f32386l = null;
        this.f32388n = null;
        this.f32390p = null;
        this.f32394t = null;
        this.f32393s = false;
        l();
    }

    public final void l() {
        this.f32380e = false;
        this.f32382g = false;
        this.f32383i = false;
        this.f32385k = false;
        this.f32387m = false;
        this.f32389o = false;
        this.f32391q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f32377a) {
                str = "column";
            } else {
                str = "row";
            }
            f01.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.f32378b = i10;
    }

    public final void o(float f7, int i10) {
        c01 c01Var;
        Arrays.fill(this.f32394t, 0);
        f01 f01Var = this.f32397x;
        int childCount = f01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            a01 a01Var = f01Var.d(i11).f33305a;
            if (this.f32377a) {
                c01Var = a01Var.f24396b;
            } else {
                c01Var = a01Var.f24395a;
            }
            float f10 = c01Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f32394t[i11] = round;
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
                    zz0 zz0Var = tz0Var2.f31211a;
                    if (zz0Var.f33679a >= zz0Var.f33680b) {
                        tz0Var2.f31213c = false;
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
