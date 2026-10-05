package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class wz0 {
    public final boolean f32753a;
    public la.h d;
    public la.h f32757f;
    public la.h h;
    public int[] f32760j;
    public int[] f32762l;
    public uz0[] f32764n;
    public int[] f32766p;
    public boolean f32768r;
    public int[] f32770t;
    public final g01 f32773x;
    public int f32754b = Integer.MIN_VALUE;
    public int f32755c = Integer.MIN_VALUE;
    public boolean f32756e = false;
    public boolean f32758g = false;
    public boolean f32759i = false;
    public boolean f32761k = false;
    public boolean f32763m = false;
    public boolean f32765o = false;
    public boolean f32767q = false;
    public boolean f32769s = false;
    public boolean f32771u = true;
    public final c01 v = new c01(0);
    public final c01 f32772w = new c01(-100000);

    public wz0(g01 g01Var, boolean z10) {
        this.f32773x = g01Var;
        this.f32753a = z10;
    }

    public static void j(ArrayList arrayList, a01 a01Var, c01 c01Var, boolean z10) {
        if (a01Var.a() != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((uz0) obj).f31567a.equals(a01Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new uz0(a01Var, c01Var));
        }
    }

    public static boolean m(int[] iArr, uz0 uz0Var) {
        if (uz0Var.f31569c) {
            a01 a01Var = uz0Var.f31567a;
            int i10 = a01Var.f24403a;
            int i11 = a01Var.f24404b;
            int i12 = iArr[i10] + uz0Var.f31568b.f25219a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(la.h hVar, boolean z10) {
        for (c01 c01Var : (c01[]) ((Object[]) hVar.d)) {
            c01Var.f25219a = Integer.MIN_VALUE;
        }
        xz0[] xz0VarArr = (xz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < xz0VarArr.length; i10++) {
            int d = xz0VarArr[i10].d(z10);
            c01 c01Var2 = (c01) ((Object[]) hVar.d)[((int[]) hVar.f15399b)[i10]];
            int i11 = c01Var2.f25219a;
            if (!z10) {
                d = -d;
            }
            c01Var2.f25219a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        d01 d01Var;
        int i10;
        if (z10) {
            iArr = this.f32760j;
        } else {
            iArr = this.f32762l;
        }
        g01 g01Var = this.f32773x;
        int childCount = g01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            zz0 d = g01Var.d(i11);
            b01 b01Var = d.f33684a;
            boolean z11 = this.f32753a;
            if (z11) {
                d01Var = b01Var.f24790b;
            } else {
                d01Var = b01Var.f24789a;
            }
            a01 a01Var = d01Var.f25570b;
            if (z10) {
                i10 = a01Var.f24403a;
            } else {
                i10 = a01Var.f24404b;
            }
            iArr[i10] = Math.max(iArr[i10], g01Var.f(d, z11, z10));
        }
    }

    public final la.h c(boolean z10) {
        a01 a01Var;
        vz0 vz0Var = new vz0(a01.class, c01.class);
        d01[] d01VarArr = (d01[]) ((Object[]) f().f15400c);
        int length = d01VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                a01Var = d01VarArr[i10].f25570b;
            } else {
                a01 a01Var2 = d01VarArr[i10].f25570b;
                a01Var = new a01(a01Var2.f24404b, a01Var2.f24403a);
            }
            ?? obj = new Object();
            obj.f25219a = Integer.MIN_VALUE;
            vz0Var.add(Pair.create(a01Var, obj));
        }
        return vz0Var.i();
    }

    public final uz0[] d() {
        if (this.f32764n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f32757f == null) {
                this.f32757f = c(true);
            }
            if (!this.f32758g) {
                a(this.f32757f, true);
                this.f32758g = true;
            }
            la.h hVar = this.f32757f;
            int i10 = 0;
            while (true) {
                a01[] a01VarArr = (a01[]) ((Object[]) hVar.f15400c);
                if (i10 >= a01VarArr.length) {
                    break;
                }
                j(arrayList, a01VarArr[i10], ((c01[]) ((Object[]) hVar.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f32759i) {
                a(this.h, false);
                this.f32759i = true;
            }
            la.h hVar2 = this.h;
            int i11 = 0;
            while (true) {
                a01[] a01VarArr2 = (a01[]) ((Object[]) hVar2.f15400c);
                if (i11 >= a01VarArr2.length) {
                    break;
                }
                j(arrayList2, a01VarArr2[i11], ((c01[]) ((Object[]) hVar2.d))[i11], false);
                i11++;
            }
            if (this.f32771u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new a01(i12, i13), new c01(0), true);
                    i12 = i13;
                }
            }
            int e7 = e();
            j(arrayList, new a01(0, e7), this.v, false);
            j(arrayList2, new a01(e7, 0), this.f32772w, false);
            uz0[] q6 = q(arrayList);
            uz0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(uz0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.f32764n = (uz0[]) objArr;
        }
        if (!this.f32765o) {
            if (this.f32757f == null) {
                this.f32757f = c(true);
            }
            if (!this.f32758g) {
                a(this.f32757f, true);
                this.f32758g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f32759i) {
                a(this.h, false);
                this.f32759i = true;
            }
            this.f32765o = true;
        }
        return this.f32764n;
    }

    public final int e() {
        int max = Math.max(this.f32754b, h());
        if (max <= 1024) {
            return max;
        }
        g01.g("Table grid count out of bounds");
        throw null;
    }

    public final la.h f() {
        d01 d01Var;
        int i10;
        int i11;
        int i12;
        d01 d01Var2;
        xz0 xz0Var;
        la.h hVar = this.d;
        boolean z10 = this.f32753a;
        g01 g01Var = this.f32773x;
        if (hVar == null) {
            vz0 vz0Var = new vz0(d01.class, xz0.class);
            int childCount = g01Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                b01 b01Var = g01Var.d(i13).f33684a;
                if (z10) {
                    d01Var2 = b01Var.f24790b;
                } else {
                    d01Var2 = b01Var.f24789a;
                }
                switch (d01.a(d01Var2, z10).f30988a) {
                    case 3:
                        xz0Var = new xz0();
                        break;
                    default:
                        xz0Var = new xz0();
                        break;
                }
                vz0Var.add(Pair.create(d01Var2, xz0Var));
            }
            this.d = vz0Var.i();
        }
        if (!this.f32756e) {
            for (xz0 xz0Var2 : (xz0[]) ((Object[]) this.d.d)) {
                xz0Var2.c();
            }
            int childCount2 = g01Var.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                zz0 d = g01Var.d(i14);
                b01 b01Var2 = d.f33684a;
                if (z10) {
                    d01Var = b01Var2.f24790b;
                } else {
                    d01Var = b01Var2.f24789a;
                }
                if (z10) {
                    i10 = d.f33692k;
                } else {
                    i10 = d.f33693l;
                }
                int e7 = g01Var.e(d, z10, false) + g01Var.e(d, z10, true) + i10;
                float f7 = d01Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f32770t[i14];
                }
                int i15 = e7 + i11;
                la.h hVar2 = this.d;
                xz0 xz0Var3 = (xz0) ((Object[]) hVar2.d)[((int[]) hVar2.f15399b)[i14]];
                int i16 = xz0Var3.f33125c;
                if (d01Var.f25571c == g01.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                xz0Var3.f33125c = i12 & i16;
                int a2 = d01.a(d01Var, z10).a(d, i15);
                xz0Var3.b(a2, i15 - a2);
            }
            this.f32756e = true;
        }
        return this.d;
    }

    public final int[] g() {
        d01 d01Var;
        boolean z10;
        d01 d01Var2;
        if (this.f32766p == null) {
            this.f32766p = new int[e() + 1];
        }
        if (!this.f32767q) {
            int[] iArr = this.f32766p;
            boolean z11 = this.f32769s;
            float f7 = 0.0f;
            boolean z12 = this.f32753a;
            g01 g01Var = this.f32773x;
            if (!z11) {
                int childCount = g01Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        b01 b01Var = g01Var.d(i10).f33684a;
                        if (z12) {
                            d01Var2 = b01Var.f24790b;
                        } else {
                            d01Var2 = b01Var.f24789a;
                        }
                        if (d01Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f32768r = z10;
                this.f32769s = true;
            }
            if (!this.f32768r) {
                p(d(), iArr, true);
            } else {
                if (this.f32770t == null) {
                    this.f32770t = new int[g01Var.getChildCount()];
                }
                Arrays.fill(this.f32770t, 0);
                p(d(), iArr, true);
                int childCount2 = (g01Var.getChildCount() * this.v.f25219a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = g01Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        b01 b01Var2 = g01Var.d(i11).f33684a;
                        if (z12) {
                            d01Var = b01Var2.f24790b;
                        } else {
                            d01Var = b01Var2.f24789a;
                        }
                        f7 += d01Var.d;
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
            if (!this.f32771u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f32767q = true;
        }
        return this.f32766p;
    }

    public final int h() {
        d01 d01Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f32755c == Integer.MIN_VALUE) {
            g01 g01Var = this.f32773x;
            int childCount = g01Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                b01 b01Var = g01Var.d(i12).f33684a;
                if (this.f32753a) {
                    d01Var = b01Var.f24790b;
                } else {
                    d01Var = b01Var.f24789a;
                }
                a01 a01Var = d01Var.f25570b;
                i11 = Math.max(Math.max(Math.max(i11, a01Var.f24403a), a01Var.f24404b), a01Var.a());
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f32755c = Math.max(0, i10);
        }
        return this.f32755c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        c01 c01Var = this.f32772w;
        c01 c01Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                c01Var2.f25219a = size;
                c01Var.f25219a = -size;
                this.f32767q = false;
                return g()[e()];
            }
            c01Var2.f25219a = 0;
            c01Var.f25219a = -100000;
            this.f32767q = false;
            return g()[e()];
        }
        c01Var2.f25219a = 0;
        c01Var.f25219a = -size;
        this.f32767q = false;
        return g()[e()];
    }

    public final void k() {
        this.f32755c = Integer.MIN_VALUE;
        this.d = null;
        this.f32757f = null;
        this.h = null;
        this.f32760j = null;
        this.f32762l = null;
        this.f32764n = null;
        this.f32766p = null;
        this.f32770t = null;
        this.f32769s = false;
        l();
    }

    public final void l() {
        this.f32756e = false;
        this.f32758g = false;
        this.f32759i = false;
        this.f32761k = false;
        this.f32763m = false;
        this.f32765o = false;
        this.f32767q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f32753a) {
                str = "column";
            } else {
                str = "row";
            }
            g01.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.f32754b = i10;
    }

    public final void o(float f7, int i10) {
        d01 d01Var;
        Arrays.fill(this.f32770t, 0);
        g01 g01Var = this.f32773x;
        int childCount = g01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            b01 b01Var = g01Var.d(i11).f33684a;
            if (this.f32753a) {
                d01Var = b01Var.f24790b;
            } else {
                d01Var = b01Var.f24789a;
            }
            float f10 = d01Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f32770t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(uz0[] uz0VarArr, int[] iArr, boolean z10) {
        int e7 = e() + 1;
        loop0: for (int i10 = 0; i10 < uz0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e7; i11++) {
                boolean z11 = false;
                for (uz0 uz0Var : uz0VarArr) {
                    z11 |= m(iArr, uz0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[uz0VarArr.length];
            for (int i12 = 0; i12 < e7; i12++) {
                int length = uz0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, uz0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= uz0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    uz0 uz0Var2 = uz0VarArr[i14];
                    a01 a01Var = uz0Var2.f31567a;
                    if (a01Var.f24403a >= a01Var.f24404b) {
                        uz0Var2.f31569c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final uz0[] q(ArrayList arrayList) {
        e0.i0 i0Var = new e0.i0(this, (uz0[]) arrayList.toArray(new uz0[0]));
        int length = ((uz0[][]) i0Var.f8428c).length;
        for (int i10 = 0; i10 < length; i10++) {
            i0Var.f(i10);
        }
        return (uz0[]) i0Var.f8427b;
    }
}
