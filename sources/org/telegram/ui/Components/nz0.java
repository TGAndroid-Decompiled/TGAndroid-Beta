package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class nz0 {
    public final boolean f26894a;
    public la.h d;
    public la.h f26897f;
    public la.h h;
    public int[] f26900j;
    public int[] f26902l;
    public lz0[] f26904n;
    public int[] f26906p;
    public boolean f26908r;
    public int[] f26910t;
    public final xz0 f26913x;
    public int f26895b = Integer.MIN_VALUE;
    public int f26896c = Integer.MIN_VALUE;
    public boolean e = false;
    public boolean f26898g = false;
    public boolean f26899i = false;
    public boolean f26901k = false;
    public boolean f26903m = false;
    public boolean f26905o = false;
    public boolean f26907q = false;
    public boolean f26909s = false;
    public boolean f26911u = true;
    public final tz0 v = new tz0(0);
    public final tz0 f26912w = new tz0(-100000);

    public nz0(xz0 xz0Var, boolean z10) {
        this.f26913x = xz0Var;
        this.f26894a = z10;
    }

    public static void j(ArrayList arrayList, rz0 rz0Var, tz0 tz0Var, boolean z10) {
        if (rz0Var.f28151b - rz0Var.f28150a != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((lz0) obj).f26158a.equals(rz0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new lz0(rz0Var, tz0Var));
        }
    }

    public static boolean m(int[] iArr, lz0 lz0Var) {
        if (lz0Var.f26160c) {
            rz0 rz0Var = lz0Var.f26158a;
            int i10 = rz0Var.f28150a;
            int i11 = rz0Var.f28151b;
            int i12 = iArr[i10] + lz0Var.f26159b.f28688a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(la.h hVar, boolean z10) {
        for (tz0 tz0Var : (tz0[]) ((Object[]) hVar.d)) {
            tz0Var.f28688a = Integer.MIN_VALUE;
        }
        oz0[] oz0VarArr = (oz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < oz0VarArr.length; i10++) {
            int d = oz0VarArr[i10].d(z10);
            tz0 tz0Var2 = (tz0) ((Object[]) hVar.d)[((int[]) hVar.f14182b)[i10]];
            int i11 = tz0Var2.f28688a;
            if (!z10) {
                d = -d;
            }
            tz0Var2.f28688a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        uz0 uz0Var;
        int i10;
        if (z10) {
            iArr = this.f26900j;
        } else {
            iArr = this.f26902l;
        }
        xz0 xz0Var = this.f26913x;
        int childCount = xz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            qz0 d = xz0Var.d(i11);
            sz0 sz0Var = d.f27768a;
            boolean z11 = this.f26894a;
            if (z11) {
                uz0Var = sz0Var.f28381b;
            } else {
                uz0Var = sz0Var.f28380a;
            }
            rz0 rz0Var = uz0Var.f28959b;
            if (z10) {
                i10 = rz0Var.f28150a;
            } else {
                i10 = rz0Var.f28151b;
            }
            iArr[i10] = Math.max(iArr[i10], xz0Var.f(d, z11, z10));
        }
    }

    public final la.h c(boolean z10) {
        rz0 rz0Var;
        mz0 mz0Var = new mz0(rz0.class, tz0.class);
        uz0[] uz0VarArr = (uz0[]) ((Object[]) f().f14183c);
        int length = uz0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                rz0Var = uz0VarArr[i10].f28959b;
            } else {
                rz0 rz0Var2 = uz0VarArr[i10].f28959b;
                rz0Var = new rz0(rz0Var2.f28151b, rz0Var2.f28150a);
            }
            ?? obj = new Object();
            obj.f28688a = Integer.MIN_VALUE;
            mz0Var.add(Pair.create(rz0Var, obj));
        }
        return mz0Var.i();
    }

    public final lz0[] d() {
        if (this.f26904n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f26897f == null) {
                this.f26897f = c(true);
            }
            if (!this.f26898g) {
                a(this.f26897f, true);
                this.f26898g = true;
            }
            la.h hVar = this.f26897f;
            int i10 = 0;
            while (true) {
                rz0[] rz0VarArr = (rz0[]) ((Object[]) hVar.f14183c);
                if (i10 >= rz0VarArr.length) {
                    break;
                }
                j(arrayList, rz0VarArr[i10], ((tz0[]) ((Object[]) hVar.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f26899i) {
                a(this.h, false);
                this.f26899i = true;
            }
            la.h hVar2 = this.h;
            int i11 = 0;
            while (true) {
                rz0[] rz0VarArr2 = (rz0[]) ((Object[]) hVar2.f14183c);
                if (i11 >= rz0VarArr2.length) {
                    break;
                }
                j(arrayList2, rz0VarArr2[i11], ((tz0[]) ((Object[]) hVar2.d))[i11], false);
                i11++;
            }
            if (this.f26911u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new rz0(i12, i13), new tz0(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new rz0(0, e), this.v, false);
            j(arrayList2, new rz0(e, 0), this.f26912w, false);
            lz0[] q6 = q(arrayList);
            lz0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(lz0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.f26904n = (lz0[]) objArr;
        }
        if (!this.f26905o) {
            if (this.f26897f == null) {
                this.f26897f = c(true);
            }
            if (!this.f26898g) {
                a(this.f26897f, true);
                this.f26898g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f26899i) {
                a(this.h, false);
                this.f26899i = true;
            }
            this.f26905o = true;
        }
        return this.f26904n;
    }

    public final int e() {
        return Math.max(this.f26895b, h());
    }

    public final la.h f() {
        uz0 uz0Var;
        int i10;
        int i11;
        int i12;
        uz0 uz0Var2;
        oz0 oz0Var;
        la.h hVar = this.d;
        boolean z10 = this.f26894a;
        xz0 xz0Var = this.f26913x;
        if (hVar == null) {
            mz0 mz0Var = new mz0(uz0.class, oz0.class);
            int childCount = xz0Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                sz0 sz0Var = xz0Var.d(i13).f27768a;
                if (z10) {
                    uz0Var2 = sz0Var.f28381b;
                } else {
                    uz0Var2 = sz0Var.f28380a;
                }
                switch (uz0.a(uz0Var2, z10).f25590a) {
                    case 3:
                        oz0Var = new oz0();
                        break;
                    default:
                        oz0Var = new oz0();
                        break;
                }
                mz0Var.add(Pair.create(uz0Var2, oz0Var));
            }
            this.d = mz0Var.i();
        }
        if (!this.e) {
            for (oz0 oz0Var2 : (oz0[]) ((Object[]) this.d.d)) {
                oz0Var2.c();
            }
            int childCount2 = xz0Var.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                qz0 d = xz0Var.d(i14);
                sz0 sz0Var2 = d.f27768a;
                if (z10) {
                    uz0Var = sz0Var2.f28381b;
                } else {
                    uz0Var = sz0Var2.f28380a;
                }
                if (z10) {
                    i10 = d.f27775k;
                } else {
                    i10 = d.f27776l;
                }
                int e = xz0Var.e(d, z10, false) + xz0Var.e(d, z10, true) + i10;
                float f7 = uz0Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f26910t[i14];
                }
                int i15 = e + i11;
                la.h hVar2 = this.d;
                oz0 oz0Var3 = (oz0) ((Object[]) hVar2.d)[((int[]) hVar2.f14182b)[i14]];
                int i16 = oz0Var3.f27203c;
                if (uz0Var.f28960c == xz0.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                oz0Var3.f27203c = i12 & i16;
                int a2 = uz0.a(uz0Var, z10).a(d, i15);
                oz0Var3.b(a2, i15 - a2);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] g() {
        uz0 uz0Var;
        boolean z10;
        uz0 uz0Var2;
        if (this.f26906p == null) {
            this.f26906p = new int[e() + 1];
        }
        if (!this.f26907q) {
            int[] iArr = this.f26906p;
            boolean z11 = this.f26909s;
            float f7 = 0.0f;
            boolean z12 = this.f26894a;
            xz0 xz0Var = this.f26913x;
            if (!z11) {
                int childCount = xz0Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        sz0 sz0Var = xz0Var.d(i10).f27768a;
                        if (z12) {
                            uz0Var2 = sz0Var.f28381b;
                        } else {
                            uz0Var2 = sz0Var.f28380a;
                        }
                        if (uz0Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f26908r = z10;
                this.f26909s = true;
            }
            if (!this.f26908r) {
                p(d(), iArr, true);
            } else {
                if (this.f26910t == null) {
                    this.f26910t = new int[xz0Var.getChildCount()];
                }
                Arrays.fill(this.f26910t, 0);
                p(d(), iArr, true);
                int childCount2 = (xz0Var.getChildCount() * this.v.f28688a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = xz0Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        sz0 sz0Var2 = xz0Var.d(i11).f27768a;
                        if (z12) {
                            uz0Var = sz0Var2.f28381b;
                        } else {
                            uz0Var = sz0Var2.f28380a;
                        }
                        f7 += uz0Var.d;
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
            if (!this.f26911u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f26907q = true;
        }
        return this.f26906p;
    }

    public final int h() {
        uz0 uz0Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f26896c == Integer.MIN_VALUE) {
            xz0 xz0Var = this.f26913x;
            int childCount = xz0Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                sz0 sz0Var = xz0Var.d(i12).f27768a;
                if (this.f26894a) {
                    uz0Var = sz0Var.f28381b;
                } else {
                    uz0Var = sz0Var.f28380a;
                }
                rz0 rz0Var = uz0Var.f28959b;
                int i13 = rz0Var.f28150a;
                int i14 = rz0Var.f28151b;
                i11 = Math.max(Math.max(Math.max(i11, i13), i14), i14 - rz0Var.f28150a);
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f26896c = Math.max(0, i10);
        }
        return this.f26896c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        tz0 tz0Var = this.f26912w;
        tz0 tz0Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                tz0Var2.f28688a = size;
                tz0Var.f28688a = -size;
                this.f26907q = false;
                return g()[e()];
            }
            tz0Var2.f28688a = 0;
            tz0Var.f28688a = -100000;
            this.f26907q = false;
            return g()[e()];
        }
        tz0Var2.f28688a = 0;
        tz0Var.f28688a = -size;
        this.f26907q = false;
        return g()[e()];
    }

    public final void k() {
        this.f26896c = Integer.MIN_VALUE;
        this.d = null;
        this.f26897f = null;
        this.h = null;
        this.f26900j = null;
        this.f26902l = null;
        this.f26904n = null;
        this.f26906p = null;
        this.f26910t = null;
        this.f26909s = false;
        l();
    }

    public final void l() {
        this.e = false;
        this.f26898g = false;
        this.f26899i = false;
        this.f26901k = false;
        this.f26903m = false;
        this.f26905o = false;
        this.f26907q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f26894a) {
                str = "column";
            } else {
                str = "row";
            }
            throw new IllegalArgumentException(v7.j.t(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"), ". "));
        }
        this.f26895b = i10;
    }

    public final void o(float f7, int i10) {
        uz0 uz0Var;
        Arrays.fill(this.f26910t, 0);
        xz0 xz0Var = this.f26913x;
        int childCount = xz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            sz0 sz0Var = xz0Var.d(i11).f27768a;
            if (this.f26894a) {
                uz0Var = sz0Var.f28381b;
            } else {
                uz0Var = sz0Var.f28380a;
            }
            float f10 = uz0Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f26910t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(lz0[] lz0VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < lz0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (lz0 lz0Var : lz0VarArr) {
                    z11 |= m(iArr, lz0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[lz0VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = lz0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, lz0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= lz0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    lz0 lz0Var2 = lz0VarArr[i14];
                    rz0 rz0Var = lz0Var2.f26158a;
                    if (rz0Var.f28150a >= rz0Var.f28151b) {
                        lz0Var2.f26160c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final lz0[] q(ArrayList arrayList) {
        e0.i0 i0Var = new e0.i0(this, (lz0[]) arrayList.toArray(new lz0[0]));
        int length = ((lz0[][]) i0Var.f7785c).length;
        for (int i10 = 0; i10 < length; i10++) {
            i0Var.f(i10);
        }
        return (lz0[]) i0Var.f7784b;
    }
}
