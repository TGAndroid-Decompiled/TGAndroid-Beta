package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class nz0 {
    public final boolean f26909a;
    public lf.h d;
    public lf.h f26912f;
    public lf.h h;
    public int[] f26915j;
    public int[] f26917l;
    public lz0[] f26919n;
    public int[] f26921p;
    public boolean f26923r;
    public int[] f26925t;
    public final xz0 f26928x;
    public int f26910b = Integer.MIN_VALUE;
    public int f26911c = Integer.MIN_VALUE;
    public boolean e = false;
    public boolean f26913g = false;
    public boolean f26914i = false;
    public boolean f26916k = false;
    public boolean f26918m = false;
    public boolean f26920o = false;
    public boolean f26922q = false;
    public boolean f26924s = false;
    public boolean f26926u = true;
    public final tz0 v = new tz0(0);
    public final tz0 f26927w = new tz0(-100000);

    public nz0(xz0 xz0Var, boolean z10) {
        this.f26928x = xz0Var;
        this.f26909a = z10;
    }

    public static void j(ArrayList arrayList, rz0 rz0Var, tz0 tz0Var, boolean z10) {
        if (rz0Var.f28077b - rz0Var.f28076a != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((lz0) obj).f26263a.equals(rz0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new lz0(rz0Var, tz0Var));
        }
    }

    public static boolean m(int[] iArr, lz0 lz0Var) {
        if (lz0Var.f26265c) {
            rz0 rz0Var = lz0Var.f26263a;
            int i10 = rz0Var.f28076a;
            int i11 = rz0Var.f28077b;
            int i12 = iArr[i10] + lz0Var.f26264b.f28571a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(lf.h hVar, boolean z10) {
        for (tz0 tz0Var : (tz0[]) ((Object[]) hVar.d)) {
            tz0Var.f28571a = Integer.MIN_VALUE;
        }
        oz0[] oz0VarArr = (oz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < oz0VarArr.length; i10++) {
            int d = oz0VarArr[i10].d(z10);
            tz0 tz0Var2 = (tz0) ((Object[]) hVar.d)[((int[]) hVar.f14230b)[i10]];
            int i11 = tz0Var2.f28571a;
            if (!z10) {
                d = -d;
            }
            tz0Var2.f28571a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        uz0 uz0Var;
        int i10;
        if (z10) {
            iArr = this.f26915j;
        } else {
            iArr = this.f26917l;
        }
        xz0 xz0Var = this.f26928x;
        int childCount = xz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            qz0 d = xz0Var.d(i11);
            sz0 sz0Var = d.f27714a;
            boolean z11 = this.f26909a;
            if (z11) {
                uz0Var = sz0Var.f28349b;
            } else {
                uz0Var = sz0Var.f28348a;
            }
            rz0 rz0Var = uz0Var.f28922b;
            if (z10) {
                i10 = rz0Var.f28076a;
            } else {
                i10 = rz0Var.f28077b;
            }
            iArr[i10] = Math.max(iArr[i10], xz0Var.f(d, z11, z10));
        }
    }

    public final lf.h c(boolean z10) {
        rz0 rz0Var;
        mz0 mz0Var = new mz0(rz0.class, tz0.class);
        uz0[] uz0VarArr = (uz0[]) ((Object[]) f().f14231c);
        int length = uz0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                rz0Var = uz0VarArr[i10].f28922b;
            } else {
                rz0 rz0Var2 = uz0VarArr[i10].f28922b;
                rz0Var = new rz0(rz0Var2.f28077b, rz0Var2.f28076a);
            }
            ?? obj = new Object();
            obj.f28571a = Integer.MIN_VALUE;
            mz0Var.add(Pair.create(rz0Var, obj));
        }
        return mz0Var.i();
    }

    public final lz0[] d() {
        if (this.f26919n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f26912f == null) {
                this.f26912f = c(true);
            }
            if (!this.f26913g) {
                a(this.f26912f, true);
                this.f26913g = true;
            }
            lf.h hVar = this.f26912f;
            int i10 = 0;
            while (true) {
                rz0[] rz0VarArr = (rz0[]) ((Object[]) hVar.f14231c);
                if (i10 >= rz0VarArr.length) {
                    break;
                }
                j(arrayList, rz0VarArr[i10], ((tz0[]) ((Object[]) hVar.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f26914i) {
                a(this.h, false);
                this.f26914i = true;
            }
            lf.h hVar2 = this.h;
            int i11 = 0;
            while (true) {
                rz0[] rz0VarArr2 = (rz0[]) ((Object[]) hVar2.f14231c);
                if (i11 >= rz0VarArr2.length) {
                    break;
                }
                j(arrayList2, rz0VarArr2[i11], ((tz0[]) ((Object[]) hVar2.d))[i11], false);
                i11++;
            }
            if (this.f26926u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new rz0(i12, i13), new tz0(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new rz0(0, e), this.v, false);
            j(arrayList2, new rz0(e, 0), this.f26927w, false);
            lz0[] q6 = q(arrayList);
            lz0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(lz0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.f26919n = (lz0[]) objArr;
        }
        if (!this.f26920o) {
            if (this.f26912f == null) {
                this.f26912f = c(true);
            }
            if (!this.f26913g) {
                a(this.f26912f, true);
                this.f26913g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f26914i) {
                a(this.h, false);
                this.f26914i = true;
            }
            this.f26920o = true;
        }
        return this.f26919n;
    }

    public final int e() {
        return Math.max(this.f26910b, h());
    }

    public final lf.h f() {
        uz0 uz0Var;
        int i10;
        int i11;
        int i12;
        uz0 uz0Var2;
        oz0 oz0Var;
        lf.h hVar = this.d;
        boolean z10 = this.f26909a;
        xz0 xz0Var = this.f26928x;
        if (hVar == null) {
            mz0 mz0Var = new mz0(uz0.class, oz0.class);
            int childCount = xz0Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                sz0 sz0Var = xz0Var.d(i13).f27714a;
                if (z10) {
                    uz0Var2 = sz0Var.f28349b;
                } else {
                    uz0Var2 = sz0Var.f28348a;
                }
                switch (uz0.a(uz0Var2, z10).f25518a) {
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
                sz0 sz0Var2 = d.f27714a;
                if (z10) {
                    uz0Var = sz0Var2.f28349b;
                } else {
                    uz0Var = sz0Var2.f28348a;
                }
                if (z10) {
                    i10 = d.f27721k;
                } else {
                    i10 = d.f27722l;
                }
                int e = xz0Var.e(d, z10, false) + xz0Var.e(d, z10, true) + i10;
                float f7 = uz0Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f26925t[i14];
                }
                int i15 = e + i11;
                lf.h hVar2 = this.d;
                oz0 oz0Var3 = (oz0) ((Object[]) hVar2.d)[((int[]) hVar2.f14230b)[i14]];
                int i16 = oz0Var3.f27210c;
                if (uz0Var.f28923c == xz0.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                oz0Var3.f27210c = i12 & i16;
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
        if (this.f26921p == null) {
            this.f26921p = new int[e() + 1];
        }
        if (!this.f26922q) {
            int[] iArr = this.f26921p;
            boolean z11 = this.f26924s;
            float f7 = 0.0f;
            boolean z12 = this.f26909a;
            xz0 xz0Var = this.f26928x;
            if (!z11) {
                int childCount = xz0Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        sz0 sz0Var = xz0Var.d(i10).f27714a;
                        if (z12) {
                            uz0Var2 = sz0Var.f28349b;
                        } else {
                            uz0Var2 = sz0Var.f28348a;
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
                this.f26923r = z10;
                this.f26924s = true;
            }
            if (!this.f26923r) {
                p(d(), iArr, true);
            } else {
                if (this.f26925t == null) {
                    this.f26925t = new int[xz0Var.getChildCount()];
                }
                Arrays.fill(this.f26925t, 0);
                p(d(), iArr, true);
                int childCount2 = (xz0Var.getChildCount() * this.v.f28571a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = xz0Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        sz0 sz0Var2 = xz0Var.d(i11).f27714a;
                        if (z12) {
                            uz0Var = sz0Var2.f28349b;
                        } else {
                            uz0Var = sz0Var2.f28348a;
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
            if (!this.f26926u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f26922q = true;
        }
        return this.f26921p;
    }

    public final int h() {
        uz0 uz0Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f26911c == Integer.MIN_VALUE) {
            xz0 xz0Var = this.f26928x;
            int childCount = xz0Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                sz0 sz0Var = xz0Var.d(i12).f27714a;
                if (this.f26909a) {
                    uz0Var = sz0Var.f28349b;
                } else {
                    uz0Var = sz0Var.f28348a;
                }
                rz0 rz0Var = uz0Var.f28922b;
                int i13 = rz0Var.f28076a;
                int i14 = rz0Var.f28077b;
                i11 = Math.max(Math.max(Math.max(i11, i13), i14), i14 - rz0Var.f28076a);
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f26911c = Math.max(0, i10);
        }
        return this.f26911c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        tz0 tz0Var = this.f26927w;
        tz0 tz0Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                tz0Var2.f28571a = size;
                tz0Var.f28571a = -size;
                this.f26922q = false;
                return g()[e()];
            }
            tz0Var2.f28571a = 0;
            tz0Var.f28571a = -100000;
            this.f26922q = false;
            return g()[e()];
        }
        tz0Var2.f28571a = 0;
        tz0Var.f28571a = -size;
        this.f26922q = false;
        return g()[e()];
    }

    public final void k() {
        this.f26911c = Integer.MIN_VALUE;
        this.d = null;
        this.f26912f = null;
        this.h = null;
        this.f26915j = null;
        this.f26917l = null;
        this.f26919n = null;
        this.f26921p = null;
        this.f26925t = null;
        this.f26924s = false;
        l();
    }

    public final void l() {
        this.e = false;
        this.f26913g = false;
        this.f26914i = false;
        this.f26916k = false;
        this.f26918m = false;
        this.f26920o = false;
        this.f26922q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f26909a) {
                str = "column";
            } else {
                str = "row";
            }
            throw new IllegalArgumentException(v7.j0.s(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"), ". "));
        }
        this.f26910b = i10;
    }

    public final void o(float f7, int i10) {
        uz0 uz0Var;
        Arrays.fill(this.f26925t, 0);
        xz0 xz0Var = this.f26928x;
        int childCount = xz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            sz0 sz0Var = xz0Var.d(i11).f27714a;
            if (this.f26909a) {
                uz0Var = sz0Var.f28349b;
            } else {
                uz0Var = sz0Var.f28348a;
            }
            float f10 = uz0Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f26925t[i11] = round;
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
                    rz0 rz0Var = lz0Var2.f26263a;
                    if (rz0Var.f28076a >= rz0Var.f28077b) {
                        lz0Var2.f26265c = false;
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
        int length = ((lz0[][]) i0Var.f7790c).length;
        for (int i10 = 0; i10 < length; i10++) {
            i0Var.f(i10);
        }
        return (lz0[]) i0Var.f7789b;
    }
}
