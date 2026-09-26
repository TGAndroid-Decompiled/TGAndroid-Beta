package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class kz0 {
    public final boolean f25910a;
    public la.h d;
    public la.h f25913f;
    public la.h h;
    public int[] f25916j;
    public int[] f25918l;
    public iz0[] f25920n;
    public int[] f25922p;
    public boolean f25924r;
    public int[] f25926t;
    public final uz0 f25929x;
    public int f25911b = Integer.MIN_VALUE;
    public int f25912c = Integer.MIN_VALUE;
    public boolean e = false;
    public boolean f25914g = false;
    public boolean f25915i = false;
    public boolean f25917k = false;
    public boolean f25919m = false;
    public boolean f25921o = false;
    public boolean f25923q = false;
    public boolean f25925s = false;
    public boolean f25927u = true;
    public final qz0 v = new qz0(0);
    public final qz0 f25928w = new qz0(-100000);

    public kz0(uz0 uz0Var, boolean z10) {
        this.f25929x = uz0Var;
        this.f25910a = z10;
    }

    public static void j(ArrayList arrayList, oz0 oz0Var, qz0 qz0Var, boolean z10) {
        if (oz0Var.f27220b - oz0Var.f27219a != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((iz0) obj).f25200a.equals(oz0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new iz0(oz0Var, qz0Var));
        }
    }

    public static boolean m(int[] iArr, iz0 iz0Var) {
        if (iz0Var.f25202c) {
            oz0 oz0Var = iz0Var.f25200a;
            int i10 = oz0Var.f27219a;
            int i11 = oz0Var.f27220b;
            int i12 = iArr[i10] + iz0Var.f25201b.f27799a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(la.h hVar, boolean z10) {
        for (qz0 qz0Var : (qz0[]) ((Object[]) hVar.d)) {
            qz0Var.f27799a = Integer.MIN_VALUE;
        }
        lz0[] lz0VarArr = (lz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < lz0VarArr.length; i10++) {
            int d = lz0VarArr[i10].d(z10);
            qz0 qz0Var2 = (qz0) ((Object[]) hVar.d)[((int[]) hVar.f14166b)[i10]];
            int i11 = qz0Var2.f27799a;
            if (!z10) {
                d = -d;
            }
            qz0Var2.f27799a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        rz0 rz0Var;
        int i10;
        if (z10) {
            iArr = this.f25916j;
        } else {
            iArr = this.f25918l;
        }
        uz0 uz0Var = this.f25929x;
        int childCount = uz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            nz0 d = uz0Var.d(i11);
            pz0 pz0Var = d.f26838a;
            boolean z11 = this.f25910a;
            if (z11) {
                rz0Var = pz0Var.f27458b;
            } else {
                rz0Var = pz0Var.f27457a;
            }
            oz0 oz0Var = rz0Var.f28078b;
            if (z10) {
                i10 = oz0Var.f27219a;
            } else {
                i10 = oz0Var.f27220b;
            }
            iArr[i10] = Math.max(iArr[i10], uz0Var.f(d, z11, z10));
        }
    }

    public final la.h c(boolean z10) {
        oz0 oz0Var;
        jz0 jz0Var = new jz0(oz0.class, qz0.class);
        rz0[] rz0VarArr = (rz0[]) ((Object[]) f().f14167c);
        int length = rz0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                oz0Var = rz0VarArr[i10].f28078b;
            } else {
                oz0 oz0Var2 = rz0VarArr[i10].f28078b;
                oz0Var = new oz0(oz0Var2.f27220b, oz0Var2.f27219a);
            }
            ?? obj = new Object();
            obj.f27799a = Integer.MIN_VALUE;
            jz0Var.add(Pair.create(oz0Var, obj));
        }
        return jz0Var.i();
    }

    public final iz0[] d() {
        if (this.f25920n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f25913f == null) {
                this.f25913f = c(true);
            }
            if (!this.f25914g) {
                a(this.f25913f, true);
                this.f25914g = true;
            }
            la.h hVar = this.f25913f;
            int i10 = 0;
            while (true) {
                oz0[] oz0VarArr = (oz0[]) ((Object[]) hVar.f14167c);
                if (i10 >= oz0VarArr.length) {
                    break;
                }
                j(arrayList, oz0VarArr[i10], ((qz0[]) ((Object[]) hVar.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f25915i) {
                a(this.h, false);
                this.f25915i = true;
            }
            la.h hVar2 = this.h;
            int i11 = 0;
            while (true) {
                oz0[] oz0VarArr2 = (oz0[]) ((Object[]) hVar2.f14167c);
                if (i11 >= oz0VarArr2.length) {
                    break;
                }
                j(arrayList2, oz0VarArr2[i11], ((qz0[]) ((Object[]) hVar2.d))[i11], false);
                i11++;
            }
            if (this.f25927u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new oz0(i12, i13), new qz0(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new oz0(0, e), this.v, false);
            j(arrayList2, new oz0(e, 0), this.f25928w, false);
            iz0[] q6 = q(arrayList);
            iz0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(iz0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.f25920n = (iz0[]) objArr;
        }
        if (!this.f25921o) {
            if (this.f25913f == null) {
                this.f25913f = c(true);
            }
            if (!this.f25914g) {
                a(this.f25913f, true);
                this.f25914g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f25915i) {
                a(this.h, false);
                this.f25915i = true;
            }
            this.f25921o = true;
        }
        return this.f25920n;
    }

    public final int e() {
        return Math.max(this.f25911b, h());
    }

    public final la.h f() {
        rz0 rz0Var;
        int i10;
        int i11;
        int i12;
        rz0 rz0Var2;
        lz0 lz0Var;
        la.h hVar = this.d;
        boolean z10 = this.f25910a;
        uz0 uz0Var = this.f25929x;
        if (hVar == null) {
            jz0 jz0Var = new jz0(rz0.class, lz0.class);
            int childCount = uz0Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                pz0 pz0Var = uz0Var.d(i13).f26838a;
                if (z10) {
                    rz0Var2 = pz0Var.f27458b;
                } else {
                    rz0Var2 = pz0Var.f27457a;
                }
                switch (rz0.a(rz0Var2, z10).f24577a) {
                    case 3:
                        lz0Var = new lz0();
                        break;
                    default:
                        lz0Var = new lz0();
                        break;
                }
                jz0Var.add(Pair.create(rz0Var2, lz0Var));
            }
            this.d = jz0Var.i();
        }
        if (!this.e) {
            for (lz0 lz0Var2 : (lz0[]) ((Object[]) this.d.d)) {
                lz0Var2.c();
            }
            int childCount2 = uz0Var.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                nz0 d = uz0Var.d(i14);
                pz0 pz0Var2 = d.f26838a;
                if (z10) {
                    rz0Var = pz0Var2.f27458b;
                } else {
                    rz0Var = pz0Var2.f27457a;
                }
                if (z10) {
                    i10 = d.f26845k;
                } else {
                    i10 = d.f26846l;
                }
                int e = uz0Var.e(d, z10, false) + uz0Var.e(d, z10, true) + i10;
                float f7 = rz0Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f25926t[i14];
                }
                int i15 = e + i11;
                la.h hVar2 = this.d;
                lz0 lz0Var3 = (lz0) ((Object[]) hVar2.d)[((int[]) hVar2.f14166b)[i14]];
                int i16 = lz0Var3.f26314c;
                if (rz0Var.f28079c == uz0.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                lz0Var3.f26314c = i12 & i16;
                int a2 = rz0.a(rz0Var, z10).a(d, i15);
                lz0Var3.b(a2, i15 - a2);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] g() {
        rz0 rz0Var;
        boolean z10;
        rz0 rz0Var2;
        if (this.f25922p == null) {
            this.f25922p = new int[e() + 1];
        }
        if (!this.f25923q) {
            int[] iArr = this.f25922p;
            boolean z11 = this.f25925s;
            float f7 = 0.0f;
            boolean z12 = this.f25910a;
            uz0 uz0Var = this.f25929x;
            if (!z11) {
                int childCount = uz0Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        pz0 pz0Var = uz0Var.d(i10).f26838a;
                        if (z12) {
                            rz0Var2 = pz0Var.f27458b;
                        } else {
                            rz0Var2 = pz0Var.f27457a;
                        }
                        if (rz0Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f25924r = z10;
                this.f25925s = true;
            }
            if (!this.f25924r) {
                p(d(), iArr, true);
            } else {
                if (this.f25926t == null) {
                    this.f25926t = new int[uz0Var.getChildCount()];
                }
                Arrays.fill(this.f25926t, 0);
                p(d(), iArr, true);
                int childCount2 = (uz0Var.getChildCount() * this.v.f27799a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = uz0Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        pz0 pz0Var2 = uz0Var.d(i11).f26838a;
                        if (z12) {
                            rz0Var = pz0Var2.f27458b;
                        } else {
                            rz0Var = pz0Var2.f27457a;
                        }
                        f7 += rz0Var.d;
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
            if (!this.f25927u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f25923q = true;
        }
        return this.f25922p;
    }

    public final int h() {
        rz0 rz0Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f25912c == Integer.MIN_VALUE) {
            uz0 uz0Var = this.f25929x;
            int childCount = uz0Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                pz0 pz0Var = uz0Var.d(i12).f26838a;
                if (this.f25910a) {
                    rz0Var = pz0Var.f27458b;
                } else {
                    rz0Var = pz0Var.f27457a;
                }
                oz0 oz0Var = rz0Var.f28078b;
                int i13 = oz0Var.f27219a;
                int i14 = oz0Var.f27220b;
                i11 = Math.max(Math.max(Math.max(i11, i13), i14), i14 - oz0Var.f27219a);
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f25912c = Math.max(0, i10);
        }
        return this.f25912c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        qz0 qz0Var = this.f25928w;
        qz0 qz0Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                qz0Var2.f27799a = size;
                qz0Var.f27799a = -size;
                this.f25923q = false;
                return g()[e()];
            }
            qz0Var2.f27799a = 0;
            qz0Var.f27799a = -100000;
            this.f25923q = false;
            return g()[e()];
        }
        qz0Var2.f27799a = 0;
        qz0Var.f27799a = -size;
        this.f25923q = false;
        return g()[e()];
    }

    public final void k() {
        this.f25912c = Integer.MIN_VALUE;
        this.d = null;
        this.f25913f = null;
        this.h = null;
        this.f25916j = null;
        this.f25918l = null;
        this.f25920n = null;
        this.f25922p = null;
        this.f25926t = null;
        this.f25925s = false;
        l();
    }

    public final void l() {
        this.e = false;
        this.f25914g = false;
        this.f25915i = false;
        this.f25917k = false;
        this.f25919m = false;
        this.f25921o = false;
        this.f25923q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f25910a) {
                str = "column";
            } else {
                str = "row";
            }
            throw new IllegalArgumentException(v7.j.t(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"), ". "));
        }
        this.f25911b = i10;
    }

    public final void o(float f7, int i10) {
        rz0 rz0Var;
        Arrays.fill(this.f25926t, 0);
        uz0 uz0Var = this.f25929x;
        int childCount = uz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            pz0 pz0Var = uz0Var.d(i11).f26838a;
            if (this.f25910a) {
                rz0Var = pz0Var.f27458b;
            } else {
                rz0Var = pz0Var.f27457a;
            }
            float f10 = rz0Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f25926t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(iz0[] iz0VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < iz0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (iz0 iz0Var : iz0VarArr) {
                    z11 |= m(iArr, iz0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[iz0VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = iz0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, iz0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= iz0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    iz0 iz0Var2 = iz0VarArr[i14];
                    oz0 oz0Var = iz0Var2.f25200a;
                    if (oz0Var.f27219a >= oz0Var.f27220b) {
                        iz0Var2.f25202c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final iz0[] q(ArrayList arrayList) {
        e0.i0 i0Var = new e0.i0(this, (iz0[]) arrayList.toArray(new iz0[0]));
        int length = ((iz0[][]) i0Var.f7773c).length;
        for (int i10 = 0; i10 < length; i10++) {
            i0Var.f(i10);
        }
        return (iz0[]) i0Var.f7772b;
    }
}
