package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class dz0 {
    public final boolean f24405a;
    public l7.w0 d;
    public l7.w0 f24408f;
    public l7.w0 h;
    public int[] f24411j;
    public int[] f24413l;
    public bz0[] f24415n;
    public int[] f24417p;
    public boolean f24419r;
    public int[] f24421t;
    public final nz0 f24424x;
    public int f24406b = Integer.MIN_VALUE;
    public int f24407c = Integer.MIN_VALUE;
    public boolean e = false;
    public boolean f24409g = false;
    public boolean f24410i = false;
    public boolean f24412k = false;
    public boolean f24414m = false;
    public boolean f24416o = false;
    public boolean f24418q = false;
    public boolean f24420s = false;
    public boolean f24422u = true;
    public final jz0 v = new jz0(0);
    public final jz0 f24423w = new jz0(-100000);

    public dz0(nz0 nz0Var, boolean z4) {
        this.f24424x = nz0Var;
        this.f24405a = z4;
    }

    public static void j(ArrayList arrayList, hz0 hz0Var, jz0 jz0Var, boolean z4) {
        if (hz0Var.f25526b - hz0Var.f25525a != 0) {
            if (z4) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((bz0) obj).f23776a.equals(hz0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new bz0(hz0Var, jz0Var));
        }
    }

    public static boolean m(int[] iArr, bz0 bz0Var) {
        if (bz0Var.f23778c) {
            hz0 hz0Var = bz0Var.f23776a;
            int i10 = hz0Var.f25525a;
            int i11 = hz0Var.f25526b;
            int i12 = iArr[i10] + bz0Var.f23777b.f26084a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(l7.w0 w0Var, boolean z4) {
        for (jz0 jz0Var : (jz0[]) ((Object[]) w0Var.d)) {
            jz0Var.f26084a = Integer.MIN_VALUE;
        }
        ez0[] ez0VarArr = (ez0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < ez0VarArr.length; i10++) {
            int d = ez0VarArr[i10].d(z4);
            jz0 jz0Var2 = (jz0) ((Object[]) w0Var.d)[((int[]) w0Var.f11786b)[i10]];
            int i11 = jz0Var2.f26084a;
            if (!z4) {
                d = -d;
            }
            jz0Var2.f26084a = Math.max(i11, d);
        }
    }

    public final void b(boolean z4) {
        int[] iArr;
        kz0 kz0Var;
        int i10;
        if (z4) {
            iArr = this.f24411j;
        } else {
            iArr = this.f24413l;
        }
        nz0 nz0Var = this.f24424x;
        int childCount = nz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            gz0 d = nz0Var.d(i11);
            iz0 iz0Var = d.f25257a;
            boolean z10 = this.f24405a;
            if (z10) {
                kz0Var = iz0Var.f25795b;
            } else {
                kz0Var = iz0Var.f25794a;
            }
            hz0 hz0Var = kz0Var.f26507b;
            if (z4) {
                i10 = hz0Var.f25525a;
            } else {
                i10 = hz0Var.f25526b;
            }
            iArr[i10] = Math.max(iArr[i10], nz0Var.f(d, z10, z4));
        }
    }

    public final l7.w0 c(boolean z4) {
        hz0 hz0Var;
        cz0 cz0Var = new cz0(hz0.class, jz0.class);
        kz0[] kz0VarArr = (kz0[]) ((Object[]) f().f11787c);
        int length = kz0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z4) {
                hz0Var = kz0VarArr[i10].f26507b;
            } else {
                hz0 hz0Var2 = kz0VarArr[i10].f26507b;
                hz0Var = new hz0(hz0Var2.f25526b, hz0Var2.f25525a);
            }
            ?? obj = new Object();
            obj.f26084a = Integer.MIN_VALUE;
            cz0Var.add(Pair.create(hz0Var, obj));
        }
        return cz0Var.i();
    }

    public final bz0[] d() {
        if (this.f24415n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f24408f == null) {
                this.f24408f = c(true);
            }
            if (!this.f24409g) {
                a(this.f24408f, true);
                this.f24409g = true;
            }
            l7.w0 w0Var = this.f24408f;
            int i10 = 0;
            while (true) {
                hz0[] hz0VarArr = (hz0[]) ((Object[]) w0Var.f11787c);
                if (i10 >= hz0VarArr.length) {
                    break;
                }
                j(arrayList, hz0VarArr[i10], ((jz0[]) ((Object[]) w0Var.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f24410i) {
                a(this.h, false);
                this.f24410i = true;
            }
            l7.w0 w0Var2 = this.h;
            int i11 = 0;
            while (true) {
                hz0[] hz0VarArr2 = (hz0[]) ((Object[]) w0Var2.f11787c);
                if (i11 >= hz0VarArr2.length) {
                    break;
                }
                j(arrayList2, hz0VarArr2[i11], ((jz0[]) ((Object[]) w0Var2.d))[i11], false);
                i11++;
            }
            if (this.f24422u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new hz0(i12, i13), new jz0(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new hz0(0, e), this.v, false);
            j(arrayList2, new hz0(e, 0), this.f24423w, false);
            bz0[] q10 = q(arrayList);
            bz0[] q11 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(bz0[].class.getComponentType(), q10.length + q11.length);
            System.arraycopy(q10, 0, objArr, 0, q10.length);
            System.arraycopy(q11, 0, objArr, q10.length, q11.length);
            this.f24415n = (bz0[]) objArr;
        }
        if (!this.f24416o) {
            if (this.f24408f == null) {
                this.f24408f = c(true);
            }
            if (!this.f24409g) {
                a(this.f24408f, true);
                this.f24409g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f24410i) {
                a(this.h, false);
                this.f24410i = true;
            }
            this.f24416o = true;
        }
        return this.f24415n;
    }

    public final int e() {
        return Math.max(this.f24406b, h());
    }

    public final l7.w0 f() {
        kz0 kz0Var;
        int i10;
        int i11;
        int i12;
        kz0 kz0Var2;
        ez0 ez0Var;
        l7.w0 w0Var = this.d;
        boolean z4 = this.f24405a;
        nz0 nz0Var = this.f24424x;
        if (w0Var == null) {
            cz0 cz0Var = new cz0(kz0.class, ez0.class);
            int childCount = nz0Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                iz0 iz0Var = nz0Var.d(i13).f25257a;
                if (z4) {
                    kz0Var2 = iz0Var.f25795b;
                } else {
                    kz0Var2 = iz0Var.f25794a;
                }
                switch (kz0.a(kz0Var2, z4).f31506a) {
                    case 3:
                        ez0Var = new ez0();
                        break;
                    default:
                        ez0Var = new ez0();
                        break;
                }
                cz0Var.add(Pair.create(kz0Var2, ez0Var));
            }
            this.d = cz0Var.i();
        }
        if (!this.e) {
            for (ez0 ez0Var2 : (ez0[]) ((Object[]) this.d.d)) {
                ez0Var2.c();
            }
            int childCount2 = nz0Var.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                gz0 d = nz0Var.d(i14);
                iz0 iz0Var2 = d.f25257a;
                if (z4) {
                    kz0Var = iz0Var2.f25795b;
                } else {
                    kz0Var = iz0Var2.f25794a;
                }
                if (z4) {
                    i10 = d.f25264k;
                } else {
                    i10 = d.f25265l;
                }
                int e = nz0Var.e(d, z4, false) + nz0Var.e(d, z4, true) + i10;
                float f10 = kz0Var.d;
                if (f10 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f24421t[i14];
                }
                int i15 = e + i11;
                l7.w0 w0Var2 = this.d;
                ez0 ez0Var3 = (ez0) ((Object[]) w0Var2.d)[((int[]) w0Var2.f11786b)[i14]];
                int i16 = ez0Var3.f24725c;
                if (kz0Var.f26508c == nz0.O && f10 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                ez0Var3.f24725c = i12 & i16;
                int a2 = kz0.a(kz0Var, z4).a(d, i15);
                ez0Var3.b(a2, i15 - a2);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] g() {
        kz0 kz0Var;
        boolean z4;
        kz0 kz0Var2;
        if (this.f24417p == null) {
            this.f24417p = new int[e() + 1];
        }
        if (!this.f24418q) {
            int[] iArr = this.f24417p;
            boolean z10 = this.f24420s;
            float f10 = 0.0f;
            boolean z11 = this.f24405a;
            nz0 nz0Var = this.f24424x;
            if (!z10) {
                int childCount = nz0Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        iz0 iz0Var = nz0Var.d(i10).f25257a;
                        if (z11) {
                            kz0Var2 = iz0Var.f25795b;
                        } else {
                            kz0Var2 = iz0Var.f25794a;
                        }
                        if (kz0Var2.d != 0.0f) {
                            z4 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z4 = false;
                        break;
                    }
                }
                this.f24419r = z4;
                this.f24420s = true;
            }
            if (!this.f24419r) {
                p(d(), iArr, true);
            } else {
                if (this.f24421t == null) {
                    this.f24421t = new int[nz0Var.getChildCount()];
                }
                Arrays.fill(this.f24421t, 0);
                p(d(), iArr, true);
                int childCount2 = (nz0Var.getChildCount() * this.v.f26084a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = nz0Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        iz0 iz0Var2 = nz0Var.d(i11).f25257a;
                        if (z11) {
                            kz0Var = iz0Var2.f25795b;
                        } else {
                            kz0Var = iz0Var2.f25794a;
                        }
                        f10 += kz0Var.d;
                    }
                    int i12 = -1;
                    int i13 = 0;
                    boolean z12 = true;
                    while (i13 < childCount2) {
                        int i14 = (int) ((i13 + childCount2) / 2);
                        l();
                        o(f10, i14);
                        boolean p10 = p(d(), iArr, false);
                        if (p10) {
                            i13 = i14 + 1;
                            i12 = i14;
                        } else {
                            childCount2 = i14;
                        }
                        z12 = p10;
                    }
                    if (i12 > 0 && !z12) {
                        l();
                        o(f10, i12);
                        p(d(), iArr, true);
                    }
                }
            }
            if (!this.f24422u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f24418q = true;
        }
        return this.f24417p;
    }

    public final int h() {
        kz0 kz0Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f24407c == Integer.MIN_VALUE) {
            nz0 nz0Var = this.f24424x;
            int childCount = nz0Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                iz0 iz0Var = nz0Var.d(i12).f25257a;
                if (this.f24405a) {
                    kz0Var = iz0Var.f25795b;
                } else {
                    kz0Var = iz0Var.f25794a;
                }
                hz0 hz0Var = kz0Var.f26507b;
                int i13 = hz0Var.f25525a;
                int i14 = hz0Var.f25526b;
                i11 = Math.max(Math.max(Math.max(i11, i13), i14), i14 - hz0Var.f25525a);
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f24407c = Math.max(0, i10);
        }
        return this.f24407c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        jz0 jz0Var = this.f24423w;
        jz0 jz0Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                jz0Var2.f26084a = size;
                jz0Var.f26084a = -size;
                this.f24418q = false;
                return g()[e()];
            }
            jz0Var2.f26084a = 0;
            jz0Var.f26084a = -100000;
            this.f24418q = false;
            return g()[e()];
        }
        jz0Var2.f26084a = 0;
        jz0Var.f26084a = -size;
        this.f24418q = false;
        return g()[e()];
    }

    public final void k() {
        this.f24407c = Integer.MIN_VALUE;
        this.d = null;
        this.f24408f = null;
        this.h = null;
        this.f24411j = null;
        this.f24413l = null;
        this.f24415n = null;
        this.f24417p = null;
        this.f24421t = null;
        this.f24420s = false;
        l();
    }

    public final void l() {
        this.e = false;
        this.f24409g = false;
        this.f24410i = false;
        this.f24412k = false;
        this.f24414m = false;
        this.f24416o = false;
        this.f24418q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f24405a) {
                str = "column";
            } else {
                str = "row";
            }
            throw new IllegalArgumentException(vh.w2.k(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"), ". "));
        }
        this.f24406b = i10;
    }

    public final void o(float f10, int i10) {
        kz0 kz0Var;
        Arrays.fill(this.f24421t, 0);
        nz0 nz0Var = this.f24424x;
        int childCount = nz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            iz0 iz0Var = nz0Var.d(i11).f25257a;
            if (this.f24405a) {
                kz0Var = iz0Var.f25795b;
            } else {
                kz0Var = iz0Var.f25794a;
            }
            float f11 = kz0Var.d;
            if (f11 != 0.0f) {
                int round = Math.round((i10 * f11) / f10);
                this.f24421t[i11] = round;
                i10 -= round;
                f10 -= f11;
            }
        }
    }

    public final boolean p(bz0[] bz0VarArr, int[] iArr, boolean z4) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < bz0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z10 = false;
                for (bz0 bz0Var : bz0VarArr) {
                    z10 |= m(iArr, bz0Var);
                }
                if (!z10) {
                    break loop0;
                }
            }
            if (!z4) {
                return false;
            }
            boolean[] zArr = new boolean[bz0VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = bz0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, bz0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= bz0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    bz0 bz0Var2 = bz0VarArr[i14];
                    hz0 hz0Var = bz0Var2.f23776a;
                    if (hz0Var.f25525a >= hz0Var.f25526b) {
                        bz0Var2.f23778c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final bz0[] q(ArrayList arrayList) {
        a4.k kVar = new a4.k(this, (bz0[]) arrayList.toArray(new bz0[0]));
        int length = ((bz0[][]) kVar.f86c).length;
        for (int i10 = 0; i10 < length; i10++) {
            kVar.f(i10);
        }
        return (bz0[]) kVar.f85b;
    }
}
