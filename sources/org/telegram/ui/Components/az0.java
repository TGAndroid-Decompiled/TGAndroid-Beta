package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class az0 {
    public final boolean f22521a;
    public m.e3 d;
    public m.e3 f22524f;
    public m.e3 h;
    public int[] f22527j;
    public int[] f22529l;
    public yy0[] f22531n;
    public int[] f22533p;
    public boolean f22535r;
    public int[] f22537t;
    public final kz0 f22540x;
    public int f22522b = Integer.MIN_VALUE;
    public int f22523c = Integer.MIN_VALUE;
    public boolean e = false;
    public boolean f22525g = false;
    public boolean f22526i = false;
    public boolean f22528k = false;
    public boolean f22530m = false;
    public boolean f22532o = false;
    public boolean f22534q = false;
    public boolean f22536s = false;
    public boolean f22538u = true;
    public final gz0 v = new gz0(0);
    public final gz0 f22539w = new gz0(-100000);

    public az0(kz0 kz0Var, boolean z10) {
        this.f22540x = kz0Var;
        this.f22521a = z10;
    }

    public static void j(ArrayList arrayList, ez0 ez0Var, gz0 gz0Var, boolean z10) {
        if (ez0Var.f23766b - ez0Var.f23765a != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((yy0) obj).f30430a.equals(ez0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new yy0(ez0Var, gz0Var));
        }
    }

    public static boolean m(int[] iArr, yy0 yy0Var) {
        if (yy0Var.f30432c) {
            ez0 ez0Var = yy0Var.f30430a;
            int i10 = ez0Var.f23765a;
            int i11 = ez0Var.f23766b;
            int i12 = iArr[i10] + yy0Var.f30431b.f24476a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(m.e3 e3Var, boolean z10) {
        for (gz0 gz0Var : (gz0[]) ((Object[]) e3Var.d)) {
            gz0Var.f24476a = Integer.MIN_VALUE;
        }
        bz0[] bz0VarArr = (bz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < bz0VarArr.length; i10++) {
            int d = bz0VarArr[i10].d(z10);
            gz0 gz0Var2 = (gz0) ((Object[]) e3Var.d)[((int[]) e3Var.f14165b)[i10]];
            int i11 = gz0Var2.f24476a;
            if (!z10) {
                d = -d;
            }
            gz0Var2.f24476a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        hz0 hz0Var;
        int i10;
        if (z10) {
            iArr = this.f22527j;
        } else {
            iArr = this.f22529l;
        }
        kz0 kz0Var = this.f22540x;
        int childCount = kz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            dz0 d = kz0Var.d(i11);
            fz0 fz0Var = d.f23436a;
            boolean z11 = this.f22521a;
            if (z11) {
                hz0Var = fz0Var.f24131b;
            } else {
                hz0Var = fz0Var.f24130a;
            }
            ez0 ez0Var = hz0Var.f24822b;
            if (z10) {
                i10 = ez0Var.f23765a;
            } else {
                i10 = ez0Var.f23766b;
            }
            iArr[i10] = Math.max(iArr[i10], kz0Var.f(d, z11, z10));
        }
    }

    public final m.e3 c(boolean z10) {
        ez0 ez0Var;
        zy0 zy0Var = new zy0(ez0.class, gz0.class);
        hz0[] hz0VarArr = (hz0[]) ((Object[]) f().f14166c);
        int length = hz0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                ez0Var = hz0VarArr[i10].f24822b;
            } else {
                ez0 ez0Var2 = hz0VarArr[i10].f24822b;
                ez0Var = new ez0(ez0Var2.f23766b, ez0Var2.f23765a);
            }
            ?? obj = new Object();
            obj.f24476a = Integer.MIN_VALUE;
            zy0Var.add(Pair.create(ez0Var, obj));
        }
        return zy0Var.i();
    }

    public final yy0[] d() {
        if (this.f22531n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f22524f == null) {
                this.f22524f = c(true);
            }
            if (!this.f22525g) {
                a(this.f22524f, true);
                this.f22525g = true;
            }
            m.e3 e3Var = this.f22524f;
            int i10 = 0;
            while (true) {
                ez0[] ez0VarArr = (ez0[]) ((Object[]) e3Var.f14166c);
                if (i10 >= ez0VarArr.length) {
                    break;
                }
                j(arrayList, ez0VarArr[i10], ((gz0[]) ((Object[]) e3Var.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f22526i) {
                a(this.h, false);
                this.f22526i = true;
            }
            m.e3 e3Var2 = this.h;
            int i11 = 0;
            while (true) {
                ez0[] ez0VarArr2 = (ez0[]) ((Object[]) e3Var2.f14166c);
                if (i11 >= ez0VarArr2.length) {
                    break;
                }
                j(arrayList2, ez0VarArr2[i11], ((gz0[]) ((Object[]) e3Var2.d))[i11], false);
                i11++;
            }
            if (this.f22538u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new ez0(i12, i13), new gz0(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new ez0(0, e), this.v, false);
            j(arrayList2, new ez0(e, 0), this.f22539w, false);
            yy0[] q6 = q(arrayList);
            yy0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(yy0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.f22531n = (yy0[]) objArr;
        }
        if (!this.f22532o) {
            if (this.f22524f == null) {
                this.f22524f = c(true);
            }
            if (!this.f22525g) {
                a(this.f22524f, true);
                this.f22525g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f22526i) {
                a(this.h, false);
                this.f22526i = true;
            }
            this.f22532o = true;
        }
        return this.f22531n;
    }

    public final int e() {
        return Math.max(this.f22522b, h());
    }

    public final m.e3 f() {
        hz0 hz0Var;
        int i10;
        int i11;
        int i12;
        hz0 hz0Var2;
        bz0 bz0Var;
        m.e3 e3Var = this.d;
        boolean z10 = this.f22521a;
        kz0 kz0Var = this.f22540x;
        if (e3Var == null) {
            zy0 zy0Var = new zy0(hz0.class, bz0.class);
            int childCount = kz0Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                fz0 fz0Var = kz0Var.d(i13).f23436a;
                if (z10) {
                    hz0Var2 = fz0Var.f24131b;
                } else {
                    hz0Var2 = fz0Var.f24130a;
                }
                switch (hz0.a(hz0Var2, z10).f29831a) {
                    case 3:
                        bz0Var = new bz0();
                        break;
                    default:
                        bz0Var = new bz0();
                        break;
                }
                zy0Var.add(Pair.create(hz0Var2, bz0Var));
            }
            this.d = zy0Var.i();
        }
        if (!this.e) {
            for (bz0 bz0Var2 : (bz0[]) ((Object[]) this.d.d)) {
                bz0Var2.c();
            }
            int childCount2 = kz0Var.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                dz0 d = kz0Var.d(i14);
                fz0 fz0Var2 = d.f23436a;
                if (z10) {
                    hz0Var = fz0Var2.f24131b;
                } else {
                    hz0Var = fz0Var2.f24130a;
                }
                if (z10) {
                    i10 = d.f23443k;
                } else {
                    i10 = d.f23444l;
                }
                int e = kz0Var.e(d, z10, false) + kz0Var.e(d, z10, true) + i10;
                float f7 = hz0Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f22537t[i14];
                }
                int i15 = e + i11;
                m.e3 e3Var2 = this.d;
                bz0 bz0Var3 = (bz0) ((Object[]) e3Var2.d)[((int[]) e3Var2.f14165b)[i14]];
                int i16 = bz0Var3.f22894c;
                if (hz0Var.f24823c == kz0.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                bz0Var3.f22894c = i12 & i16;
                int a2 = hz0.a(hz0Var, z10).a(d, i15);
                bz0Var3.b(a2, i15 - a2);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] g() {
        hz0 hz0Var;
        boolean z10;
        hz0 hz0Var2;
        if (this.f22533p == null) {
            this.f22533p = new int[e() + 1];
        }
        if (!this.f22534q) {
            int[] iArr = this.f22533p;
            boolean z11 = this.f22536s;
            float f7 = 0.0f;
            boolean z12 = this.f22521a;
            kz0 kz0Var = this.f22540x;
            if (!z11) {
                int childCount = kz0Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        fz0 fz0Var = kz0Var.d(i10).f23436a;
                        if (z12) {
                            hz0Var2 = fz0Var.f24131b;
                        } else {
                            hz0Var2 = fz0Var.f24130a;
                        }
                        if (hz0Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f22535r = z10;
                this.f22536s = true;
            }
            if (!this.f22535r) {
                p(d(), iArr, true);
            } else {
                if (this.f22537t == null) {
                    this.f22537t = new int[kz0Var.getChildCount()];
                }
                Arrays.fill(this.f22537t, 0);
                p(d(), iArr, true);
                int childCount2 = (kz0Var.getChildCount() * this.v.f24476a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = kz0Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        fz0 fz0Var2 = kz0Var.d(i11).f23436a;
                        if (z12) {
                            hz0Var = fz0Var2.f24131b;
                        } else {
                            hz0Var = fz0Var2.f24130a;
                        }
                        f7 += hz0Var.d;
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
            if (!this.f22538u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f22534q = true;
        }
        return this.f22533p;
    }

    public final int h() {
        hz0 hz0Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f22523c == Integer.MIN_VALUE) {
            kz0 kz0Var = this.f22540x;
            int childCount = kz0Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                fz0 fz0Var = kz0Var.d(i12).f23436a;
                if (this.f22521a) {
                    hz0Var = fz0Var.f24131b;
                } else {
                    hz0Var = fz0Var.f24130a;
                }
                ez0 ez0Var = hz0Var.f24822b;
                int i13 = ez0Var.f23765a;
                int i14 = ez0Var.f23766b;
                i11 = Math.max(Math.max(Math.max(i11, i13), i14), i14 - ez0Var.f23765a);
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f22523c = Math.max(0, i10);
        }
        return this.f22523c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        gz0 gz0Var = this.f22539w;
        gz0 gz0Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                gz0Var2.f24476a = size;
                gz0Var.f24476a = -size;
                this.f22534q = false;
                return g()[e()];
            }
            gz0Var2.f24476a = 0;
            gz0Var.f24476a = -100000;
            this.f22534q = false;
            return g()[e()];
        }
        gz0Var2.f24476a = 0;
        gz0Var.f24476a = -size;
        this.f22534q = false;
        return g()[e()];
    }

    public final void k() {
        this.f22523c = Integer.MIN_VALUE;
        this.d = null;
        this.f22524f = null;
        this.h = null;
        this.f22527j = null;
        this.f22529l = null;
        this.f22531n = null;
        this.f22533p = null;
        this.f22537t = null;
        this.f22536s = false;
        l();
    }

    public final void l() {
        this.e = false;
        this.f22525g = false;
        this.f22526i = false;
        this.f22528k = false;
        this.f22530m = false;
        this.f22532o = false;
        this.f22534q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f22521a) {
                str = "column";
            } else {
                str = "row";
            }
            throw new IllegalArgumentException(org.telegram.ui.Cells.p6.t(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"), ". "));
        }
        this.f22522b = i10;
    }

    public final void o(float f7, int i10) {
        hz0 hz0Var;
        Arrays.fill(this.f22537t, 0);
        kz0 kz0Var = this.f22540x;
        int childCount = kz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            fz0 fz0Var = kz0Var.d(i11).f23436a;
            if (this.f22521a) {
                hz0Var = fz0Var.f24131b;
            } else {
                hz0Var = fz0Var.f24130a;
            }
            float f10 = hz0Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f22537t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(yy0[] yy0VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < yy0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (yy0 yy0Var : yy0VarArr) {
                    z11 |= m(iArr, yy0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[yy0VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = yy0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, yy0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= yy0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    yy0 yy0Var2 = yy0VarArr[i14];
                    ez0 ez0Var = yy0Var2.f30430a;
                    if (ez0Var.f23765a >= ez0Var.f23766b) {
                        yy0Var2.f30432c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final yy0[] q(ArrayList arrayList) {
        e0.i0 i0Var = new e0.i0(this, (yy0[]) arrayList.toArray(new yy0[0]));
        int length = ((yy0[][]) i0Var.f7786c).length;
        for (int i10 = 0; i10 < length; i10++) {
            i0Var.f(i10);
        }
        return (yy0[]) i0Var.f7785b;
    }
}
