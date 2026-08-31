package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class ez0 {
    public final boolean f26664a;
    public l7.w0 d;
    public l7.w0 f26668f;
    public l7.w0 h;
    public int[] f26671j;
    public int[] f26673l;
    public cz0[] f26675n;
    public int[] f26677p;
    public boolean f26679r;
    public int[] f26681t;
    public final oz0 f26684x;
    public int f26665b = Integer.MIN_VALUE;
    public int f26666c = Integer.MIN_VALUE;
    public boolean f26667e = false;
    public boolean f26669g = false;
    public boolean f26670i = false;
    public boolean f26672k = false;
    public boolean f26674m = false;
    public boolean f26676o = false;
    public boolean f26678q = false;
    public boolean f26680s = false;
    public boolean f26682u = true;
    public final kz0 v = new kz0(0);
    public final kz0 f26683w = new kz0(-100000);

    public ez0(oz0 oz0Var, boolean z4) {
        this.f26684x = oz0Var;
        this.f26664a = z4;
    }

    public static void j(ArrayList arrayList, iz0 iz0Var, kz0 kz0Var, boolean z4) {
        if (iz0Var.f27935b - iz0Var.f27934a != 0) {
            if (z4) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((cz0) obj).f26116a.equals(iz0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new cz0(iz0Var, kz0Var));
        }
    }

    public static boolean m(int[] iArr, cz0 cz0Var) {
        if (cz0Var.f26118c) {
            iz0 iz0Var = cz0Var.f26116a;
            int i10 = iz0Var.f27934a;
            int i11 = iz0Var.f27935b;
            int i12 = iArr[i10] + cz0Var.f26117b.f28480a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(l7.w0 w0Var, boolean z4) {
        for (kz0 kz0Var : (kz0[]) ((Object[]) w0Var.d)) {
            kz0Var.f28480a = Integer.MIN_VALUE;
        }
        fz0[] fz0VarArr = (fz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < fz0VarArr.length; i10++) {
            int d = fz0VarArr[i10].d(z4);
            kz0 kz0Var2 = (kz0) ((Object[]) w0Var.d)[((int[]) w0Var.f12080b)[i10]];
            int i11 = kz0Var2.f28480a;
            if (!z4) {
                d = -d;
            }
            kz0Var2.f28480a = Math.max(i11, d);
        }
    }

    public final void b(boolean z4) {
        int[] iArr;
        lz0 lz0Var;
        int i10;
        if (z4) {
            iArr = this.f26671j;
        } else {
            iArr = this.f26673l;
        }
        oz0 oz0Var = this.f26684x;
        int childCount = oz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            hz0 d = oz0Var.d(i11);
            jz0 jz0Var = d.f27612a;
            boolean z10 = this.f26664a;
            if (z10) {
                lz0Var = jz0Var.f28235b;
            } else {
                lz0Var = jz0Var.f28234a;
            }
            iz0 iz0Var = lz0Var.f28867b;
            if (z4) {
                i10 = iz0Var.f27934a;
            } else {
                i10 = iz0Var.f27935b;
            }
            iArr[i10] = Math.max(iArr[i10], oz0Var.f(d, z10, z4));
        }
    }

    public final l7.w0 c(boolean z4) {
        iz0 iz0Var;
        dz0 dz0Var = new dz0(iz0.class, kz0.class);
        lz0[] lz0VarArr = (lz0[]) ((Object[]) f().f12081c);
        int length = lz0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z4) {
                iz0Var = lz0VarArr[i10].f28867b;
            } else {
                iz0 iz0Var2 = lz0VarArr[i10].f28867b;
                iz0Var = new iz0(iz0Var2.f27935b, iz0Var2.f27934a);
            }
            ?? obj = new Object();
            obj.f28480a = Integer.MIN_VALUE;
            dz0Var.add(Pair.create(iz0Var, obj));
        }
        return dz0Var.i();
    }

    public final cz0[] d() {
        if (this.f26675n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f26668f == null) {
                this.f26668f = c(true);
            }
            if (!this.f26669g) {
                a(this.f26668f, true);
                this.f26669g = true;
            }
            l7.w0 w0Var = this.f26668f;
            int i10 = 0;
            while (true) {
                iz0[] iz0VarArr = (iz0[]) ((Object[]) w0Var.f12081c);
                if (i10 >= iz0VarArr.length) {
                    break;
                }
                j(arrayList, iz0VarArr[i10], ((kz0[]) ((Object[]) w0Var.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f26670i) {
                a(this.h, false);
                this.f26670i = true;
            }
            l7.w0 w0Var2 = this.h;
            int i11 = 0;
            while (true) {
                iz0[] iz0VarArr2 = (iz0[]) ((Object[]) w0Var2.f12081c);
                if (i11 >= iz0VarArr2.length) {
                    break;
                }
                j(arrayList2, iz0VarArr2[i11], ((kz0[]) ((Object[]) w0Var2.d))[i11], false);
                i11++;
            }
            if (this.f26682u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new iz0(i12, i13), new kz0(0), true);
                    i12 = i13;
                }
            }
            int e6 = e();
            j(arrayList, new iz0(0, e6), this.v, false);
            j(arrayList2, new iz0(e6, 0), this.f26683w, false);
            cz0[] q10 = q(arrayList);
            cz0[] q11 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(cz0[].class.getComponentType(), q10.length + q11.length);
            System.arraycopy(q10, 0, objArr, 0, q10.length);
            System.arraycopy(q11, 0, objArr, q10.length, q11.length);
            this.f26675n = (cz0[]) objArr;
        }
        if (!this.f26676o) {
            if (this.f26668f == null) {
                this.f26668f = c(true);
            }
            if (!this.f26669g) {
                a(this.f26668f, true);
                this.f26669g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f26670i) {
                a(this.h, false);
                this.f26670i = true;
            }
            this.f26676o = true;
        }
        return this.f26675n;
    }

    public final int e() {
        return Math.max(this.f26665b, h());
    }

    public final l7.w0 f() {
        lz0 lz0Var;
        int i10;
        int i11;
        int i12;
        lz0 lz0Var2;
        fz0 fz0Var;
        l7.w0 w0Var = this.d;
        boolean z4 = this.f26664a;
        oz0 oz0Var = this.f26684x;
        if (w0Var == null) {
            dz0 dz0Var = new dz0(lz0.class, fz0.class);
            int childCount = oz0Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                jz0 jz0Var = oz0Var.d(i13).f27612a;
                if (z4) {
                    lz0Var2 = jz0Var.f28235b;
                } else {
                    lz0Var2 = jz0Var.f28234a;
                }
                switch (lz0.a(lz0Var2, z4).f25378a) {
                    case 3:
                        fz0Var = new fz0();
                        break;
                    default:
                        fz0Var = new fz0();
                        break;
                }
                dz0Var.add(Pair.create(lz0Var2, fz0Var));
            }
            this.d = dz0Var.i();
        }
        if (!this.f26667e) {
            for (fz0 fz0Var2 : (fz0[]) ((Object[]) this.d.d)) {
                fz0Var2.c();
            }
            int childCount2 = oz0Var.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                hz0 d = oz0Var.d(i14);
                jz0 jz0Var2 = d.f27612a;
                if (z4) {
                    lz0Var = jz0Var2.f28235b;
                } else {
                    lz0Var = jz0Var2.f28234a;
                }
                if (z4) {
                    i10 = d.f27620k;
                } else {
                    i10 = d.f27621l;
                }
                int e6 = oz0Var.e(d, z4, false) + oz0Var.e(d, z4, true) + i10;
                float f10 = lz0Var.d;
                if (f10 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f26681t[i14];
                }
                int i15 = e6 + i11;
                l7.w0 w0Var2 = this.d;
                fz0 fz0Var3 = (fz0) ((Object[]) w0Var2.d)[((int[]) w0Var2.f12080b)[i14]];
                int i16 = fz0Var3.f27051c;
                if (lz0Var.f28868c == oz0.O && f10 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                fz0Var3.f27051c = i12 & i16;
                int a2 = lz0.a(lz0Var, z4).a(d, i15);
                fz0Var3.b(a2, i15 - a2);
            }
            this.f26667e = true;
        }
        return this.d;
    }

    public final int[] g() {
        lz0 lz0Var;
        boolean z4;
        lz0 lz0Var2;
        if (this.f26677p == null) {
            this.f26677p = new int[e() + 1];
        }
        if (!this.f26678q) {
            int[] iArr = this.f26677p;
            boolean z10 = this.f26680s;
            float f10 = 0.0f;
            boolean z11 = this.f26664a;
            oz0 oz0Var = this.f26684x;
            if (!z10) {
                int childCount = oz0Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        jz0 jz0Var = oz0Var.d(i10).f27612a;
                        if (z11) {
                            lz0Var2 = jz0Var.f28235b;
                        } else {
                            lz0Var2 = jz0Var.f28234a;
                        }
                        if (lz0Var2.d != 0.0f) {
                            z4 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z4 = false;
                        break;
                    }
                }
                this.f26679r = z4;
                this.f26680s = true;
            }
            if (!this.f26679r) {
                p(d(), iArr, true);
            } else {
                if (this.f26681t == null) {
                    this.f26681t = new int[oz0Var.getChildCount()];
                }
                Arrays.fill(this.f26681t, 0);
                p(d(), iArr, true);
                int childCount2 = (oz0Var.getChildCount() * this.v.f28480a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = oz0Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        jz0 jz0Var2 = oz0Var.d(i11).f27612a;
                        if (z11) {
                            lz0Var = jz0Var2.f28235b;
                        } else {
                            lz0Var = jz0Var2.f28234a;
                        }
                        f10 += lz0Var.d;
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
            if (!this.f26682u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f26678q = true;
        }
        return this.f26677p;
    }

    public final int h() {
        lz0 lz0Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f26666c == Integer.MIN_VALUE) {
            oz0 oz0Var = this.f26684x;
            int childCount = oz0Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                jz0 jz0Var = oz0Var.d(i12).f27612a;
                if (this.f26664a) {
                    lz0Var = jz0Var.f28235b;
                } else {
                    lz0Var = jz0Var.f28234a;
                }
                iz0 iz0Var = lz0Var.f28867b;
                int i13 = iz0Var.f27934a;
                int i14 = iz0Var.f27935b;
                i11 = Math.max(Math.max(Math.max(i11, i13), i14), i14 - iz0Var.f27934a);
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f26666c = Math.max(0, i10);
        }
        return this.f26666c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        kz0 kz0Var = this.f26683w;
        kz0 kz0Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                kz0Var2.f28480a = size;
                kz0Var.f28480a = -size;
                this.f26678q = false;
                return g()[e()];
            }
            kz0Var2.f28480a = 0;
            kz0Var.f28480a = -100000;
            this.f26678q = false;
            return g()[e()];
        }
        kz0Var2.f28480a = 0;
        kz0Var.f28480a = -size;
        this.f26678q = false;
        return g()[e()];
    }

    public final void k() {
        this.f26666c = Integer.MIN_VALUE;
        this.d = null;
        this.f26668f = null;
        this.h = null;
        this.f26671j = null;
        this.f26673l = null;
        this.f26675n = null;
        this.f26677p = null;
        this.f26681t = null;
        this.f26680s = false;
        l();
    }

    public final void l() {
        this.f26667e = false;
        this.f26669g = false;
        this.f26670i = false;
        this.f26672k = false;
        this.f26674m = false;
        this.f26676o = false;
        this.f26678q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f26664a) {
                str = "column";
            } else {
                str = "row";
            }
            throw new IllegalArgumentException(w.c.e(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"), ". "));
        }
        this.f26665b = i10;
    }

    public final void o(float f10, int i10) {
        lz0 lz0Var;
        Arrays.fill(this.f26681t, 0);
        oz0 oz0Var = this.f26684x;
        int childCount = oz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            jz0 jz0Var = oz0Var.d(i11).f27612a;
            if (this.f26664a) {
                lz0Var = jz0Var.f28235b;
            } else {
                lz0Var = jz0Var.f28234a;
            }
            float f11 = lz0Var.d;
            if (f11 != 0.0f) {
                int round = Math.round((i10 * f11) / f10);
                this.f26681t[i11] = round;
                i10 -= round;
                f10 -= f11;
            }
        }
    }

    public final boolean p(cz0[] cz0VarArr, int[] iArr, boolean z4) {
        int e6 = e() + 1;
        loop0: for (int i10 = 0; i10 < cz0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e6; i11++) {
                boolean z10 = false;
                for (cz0 cz0Var : cz0VarArr) {
                    z10 |= m(iArr, cz0Var);
                }
                if (!z10) {
                    break loop0;
                }
            }
            if (!z4) {
                return false;
            }
            boolean[] zArr = new boolean[cz0VarArr.length];
            for (int i12 = 0; i12 < e6; i12++) {
                int length = cz0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, cz0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= cz0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    cz0 cz0Var2 = cz0VarArr[i14];
                    iz0 iz0Var = cz0Var2.f26116a;
                    if (iz0Var.f27934a >= iz0Var.f27935b) {
                        cz0Var2.f26118c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final cz0[] q(ArrayList arrayList) {
        a4.k kVar = new a4.k(this, (cz0[]) arrayList.toArray(new cz0[0]));
        int length = ((cz0[][]) kVar.f94c).length;
        for (int i10 = 0; i10 < length; i10++) {
            kVar.f(i10);
        }
        return (cz0[]) kVar.f93b;
    }
}
