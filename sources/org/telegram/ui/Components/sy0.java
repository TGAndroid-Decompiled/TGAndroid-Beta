package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class sy0 {
    public final boolean f32739a;
    public l3.g0 d;
    public l3.g0 f32743f;
    public l3.g0 h;
    public int[] f32746j;
    public int[] f32748l;
    public qy0[] f32750n;
    public int[] f32752p;
    public boolean f32754r;
    public int[] f32756t;
    public final cz0 f32759x;
    public int f32740b = Integer.MIN_VALUE;
    public int f32741c = Integer.MIN_VALUE;
    public boolean f32742e = false;
    public boolean f32744g = false;
    public boolean f32745i = false;
    public boolean f32747k = false;
    public boolean f32749m = false;
    public boolean f32751o = false;
    public boolean f32753q = false;
    public boolean f32755s = false;
    public boolean f32757u = true;
    public final yy0 v = new yy0(0);
    public final yy0 f32758w = new yy0(-100000);

    public sy0(cz0 cz0Var, boolean z10) {
        this.f32759x = cz0Var;
        this.f32739a = z10;
    }

    public static void j(ArrayList arrayList, wy0 wy0Var, yy0 yy0Var, boolean z10) {
        if (wy0Var.f34516b - wy0Var.f34515a != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((qy0) obj).f32135a.equals(wy0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new qy0(wy0Var, yy0Var));
        }
    }

    public static boolean m(int[] iArr, qy0 qy0Var) {
        if (qy0Var.f32137c) {
            wy0 wy0Var = qy0Var.f32135a;
            int i10 = wy0Var.f34515a;
            int i11 = wy0Var.f34516b;
            int i12 = iArr[i10] + qy0Var.f32136b.f35158a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(l3.g0 g0Var, boolean z10) {
        for (yy0 yy0Var : (yy0[]) ((Object[]) g0Var.d)) {
            yy0Var.f35158a = Integer.MIN_VALUE;
        }
        ty0[] ty0VarArr = (ty0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < ty0VarArr.length; i10++) {
            int d = ty0VarArr[i10].d(z10);
            yy0 yy0Var2 = (yy0) ((Object[]) g0Var.d)[((int[]) g0Var.f14096b)[i10]];
            int i11 = yy0Var2.f35158a;
            if (!z10) {
                d = -d;
            }
            yy0Var2.f35158a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        zy0 zy0Var;
        int i10;
        if (z10) {
            iArr = this.f32746j;
        } else {
            iArr = this.f32748l;
        }
        cz0 cz0Var = this.f32759x;
        int childCount = cz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            vy0 d = cz0Var.d(i11);
            xy0 xy0Var = d.f34227a;
            boolean z11 = this.f32739a;
            if (z11) {
                zy0Var = xy0Var.f34855b;
            } else {
                zy0Var = xy0Var.f34854a;
            }
            wy0 wy0Var = zy0Var.f35456b;
            if (z10) {
                i10 = wy0Var.f34515a;
            } else {
                i10 = wy0Var.f34516b;
            }
            iArr[i10] = Math.max(iArr[i10], cz0Var.f(d, z11, z10));
        }
    }

    public final l3.g0 c(boolean z10) {
        wy0 wy0Var;
        ry0 ry0Var = new ry0(wy0.class, yy0.class);
        zy0[] zy0VarArr = (zy0[]) ((Object[]) f().f14097c);
        int length = zy0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                wy0Var = zy0VarArr[i10].f35456b;
            } else {
                wy0 wy0Var2 = zy0VarArr[i10].f35456b;
                wy0Var = new wy0(wy0Var2.f34516b, wy0Var2.f34515a);
            }
            ?? obj = new Object();
            obj.f35158a = Integer.MIN_VALUE;
            ry0Var.add(Pair.create(wy0Var, obj));
        }
        return ry0Var.i();
    }

    public final qy0[] d() {
        if (this.f32750n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f32743f == null) {
                this.f32743f = c(true);
            }
            if (!this.f32744g) {
                a(this.f32743f, true);
                this.f32744g = true;
            }
            l3.g0 g0Var = this.f32743f;
            int i10 = 0;
            while (true) {
                wy0[] wy0VarArr = (wy0[]) ((Object[]) g0Var.f14097c);
                if (i10 >= wy0VarArr.length) {
                    break;
                }
                j(arrayList, wy0VarArr[i10], ((yy0[]) ((Object[]) g0Var.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f32745i) {
                a(this.h, false);
                this.f32745i = true;
            }
            l3.g0 g0Var2 = this.h;
            int i11 = 0;
            while (true) {
                wy0[] wy0VarArr2 = (wy0[]) ((Object[]) g0Var2.f14097c);
                if (i11 >= wy0VarArr2.length) {
                    break;
                }
                j(arrayList2, wy0VarArr2[i11], ((yy0[]) ((Object[]) g0Var2.d))[i11], false);
                i11++;
            }
            if (this.f32757u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new wy0(i12, i13), new yy0(0), true);
                    i12 = i13;
                }
            }
            int e10 = e();
            j(arrayList, new wy0(0, e10), this.v, false);
            j(arrayList2, new wy0(e10, 0), this.f32758w, false);
            qy0[] q6 = q(arrayList);
            qy0[] q9 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(qy0[].class.getComponentType(), q6.length + q9.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q9, 0, objArr, q6.length, q9.length);
            this.f32750n = (qy0[]) objArr;
        }
        if (!this.f32751o) {
            if (this.f32743f == null) {
                this.f32743f = c(true);
            }
            if (!this.f32744g) {
                a(this.f32743f, true);
                this.f32744g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f32745i) {
                a(this.h, false);
                this.f32745i = true;
            }
            this.f32751o = true;
        }
        return this.f32750n;
    }

    public final int e() {
        return Math.max(this.f32740b, h());
    }

    public final l3.g0 f() {
        zy0 zy0Var;
        int i10;
        int i11;
        int i12;
        zy0 zy0Var2;
        ty0 ty0Var;
        l3.g0 g0Var = this.d;
        boolean z10 = this.f32739a;
        cz0 cz0Var = this.f32759x;
        if (g0Var == null) {
            ry0 ry0Var = new ry0(zy0.class, ty0.class);
            int childCount = cz0Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                xy0 xy0Var = cz0Var.d(i13).f34227a;
                if (z10) {
                    zy0Var2 = xy0Var.f34855b;
                } else {
                    zy0Var2 = xy0Var.f34854a;
                }
                switch (zy0.a(zy0Var2, z10).f31511a) {
                    case 3:
                        ty0Var = new ty0();
                        break;
                    default:
                        ty0Var = new ty0();
                        break;
                }
                ry0Var.add(Pair.create(zy0Var2, ty0Var));
            }
            this.d = ry0Var.i();
        }
        if (!this.f32742e) {
            for (ty0 ty0Var2 : (ty0[]) ((Object[]) this.d.d)) {
                ty0Var2.c();
            }
            int childCount2 = cz0Var.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                vy0 d = cz0Var.d(i14);
                xy0 xy0Var2 = d.f34227a;
                if (z10) {
                    zy0Var = xy0Var2.f34855b;
                } else {
                    zy0Var = xy0Var2.f34854a;
                }
                if (z10) {
                    i10 = d.f34235k;
                } else {
                    i10 = d.f34236l;
                }
                int e10 = cz0Var.e(d, z10, false) + cz0Var.e(d, z10, true) + i10;
                float f9 = zy0Var.d;
                if (f9 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f32756t[i14];
                }
                int i15 = e10 + i11;
                l3.g0 g0Var2 = this.d;
                ty0 ty0Var3 = (ty0) ((Object[]) g0Var2.d)[((int[]) g0Var2.f14096b)[i14]];
                int i16 = ty0Var3.f33062c;
                if (zy0Var.f35457c == cz0.N && f9 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                ty0Var3.f33062c = i12 & i16;
                int a2 = zy0.a(zy0Var, z10).a(d, i15);
                ty0Var3.b(a2, i15 - a2);
            }
            this.f32742e = true;
        }
        return this.d;
    }

    public final int[] g() {
        zy0 zy0Var;
        boolean z10;
        zy0 zy0Var2;
        if (this.f32752p == null) {
            this.f32752p = new int[e() + 1];
        }
        if (!this.f32753q) {
            int[] iArr = this.f32752p;
            boolean z11 = this.f32755s;
            float f9 = 0.0f;
            boolean z12 = this.f32739a;
            cz0 cz0Var = this.f32759x;
            if (!z11) {
                int childCount = cz0Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        xy0 xy0Var = cz0Var.d(i10).f34227a;
                        if (z12) {
                            zy0Var2 = xy0Var.f34855b;
                        } else {
                            zy0Var2 = xy0Var.f34854a;
                        }
                        if (zy0Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f32754r = z10;
                this.f32755s = true;
            }
            if (!this.f32754r) {
                p(d(), iArr, true);
            } else {
                if (this.f32756t == null) {
                    this.f32756t = new int[cz0Var.getChildCount()];
                }
                Arrays.fill(this.f32756t, 0);
                p(d(), iArr, true);
                int childCount2 = (cz0Var.getChildCount() * this.v.f35158a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = cz0Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        xy0 xy0Var2 = cz0Var.d(i11).f34227a;
                        if (z12) {
                            zy0Var = xy0Var2.f34855b;
                        } else {
                            zy0Var = xy0Var2.f34854a;
                        }
                        f9 += zy0Var.d;
                    }
                    int i12 = -1;
                    int i13 = 0;
                    boolean z13 = true;
                    while (i13 < childCount2) {
                        int i14 = (int) ((i13 + childCount2) / 2);
                        l();
                        o(f9, i14);
                        boolean p10 = p(d(), iArr, false);
                        if (p10) {
                            i13 = i14 + 1;
                            i12 = i14;
                        } else {
                            childCount2 = i14;
                        }
                        z13 = p10;
                    }
                    if (i12 > 0 && !z13) {
                        l();
                        o(f9, i12);
                        p(d(), iArr, true);
                    }
                }
            }
            if (!this.f32757u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f32753q = true;
        }
        return this.f32752p;
    }

    public final int h() {
        zy0 zy0Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f32741c == Integer.MIN_VALUE) {
            cz0 cz0Var = this.f32759x;
            int childCount = cz0Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                xy0 xy0Var = cz0Var.d(i12).f34227a;
                if (this.f32739a) {
                    zy0Var = xy0Var.f34855b;
                } else {
                    zy0Var = xy0Var.f34854a;
                }
                wy0 wy0Var = zy0Var.f35456b;
                int i13 = wy0Var.f34515a;
                int i14 = wy0Var.f34516b;
                i11 = Math.max(Math.max(Math.max(i11, i13), i14), i14 - wy0Var.f34515a);
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f32741c = Math.max(0, i10);
        }
        return this.f32741c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        yy0 yy0Var = this.f32758w;
        yy0 yy0Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                yy0Var2.f35158a = size;
                yy0Var.f35158a = -size;
                this.f32753q = false;
                return g()[e()];
            }
            yy0Var2.f35158a = 0;
            yy0Var.f35158a = -100000;
            this.f32753q = false;
            return g()[e()];
        }
        yy0Var2.f35158a = 0;
        yy0Var.f35158a = -size;
        this.f32753q = false;
        return g()[e()];
    }

    public final void k() {
        this.f32741c = Integer.MIN_VALUE;
        this.d = null;
        this.f32743f = null;
        this.h = null;
        this.f32746j = null;
        this.f32748l = null;
        this.f32750n = null;
        this.f32752p = null;
        this.f32756t = null;
        this.f32755s = false;
        l();
    }

    public final void l() {
        this.f32742e = false;
        this.f32744g = false;
        this.f32745i = false;
        this.f32747k = false;
        this.f32749m = false;
        this.f32751o = false;
        this.f32753q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f32739a) {
                str = "column";
            } else {
                str = "row";
            }
            throw new IllegalArgumentException(u3.c.k(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"), ". "));
        }
        this.f32740b = i10;
    }

    public final void o(float f9, int i10) {
        zy0 zy0Var;
        Arrays.fill(this.f32756t, 0);
        cz0 cz0Var = this.f32759x;
        int childCount = cz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            xy0 xy0Var = cz0Var.d(i11).f34227a;
            if (this.f32739a) {
                zy0Var = xy0Var.f34855b;
            } else {
                zy0Var = xy0Var.f34854a;
            }
            float f10 = zy0Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f9);
                this.f32756t[i11] = round;
                i10 -= round;
                f9 -= f10;
            }
        }
    }

    public final boolean p(qy0[] qy0VarArr, int[] iArr, boolean z10) {
        int e10 = e() + 1;
        loop0: for (int i10 = 0; i10 < qy0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e10; i11++) {
                boolean z11 = false;
                for (qy0 qy0Var : qy0VarArr) {
                    z11 |= m(iArr, qy0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[qy0VarArr.length];
            for (int i12 = 0; i12 < e10; i12++) {
                int length = qy0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, qy0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= qy0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    qy0 qy0Var2 = qy0VarArr[i14];
                    wy0 wy0Var = qy0Var2.f32135a;
                    if (wy0Var.f34515a >= wy0Var.f34516b) {
                        qy0Var2.f32137c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final qy0[] q(ArrayList arrayList) {
        e0.i0 i0Var = new e0.i0(this, (qy0[]) arrayList.toArray(new qy0[0]));
        int length = ((qy0[][]) i0Var.f5679c).length;
        for (int i10 = 0; i10 < length; i10++) {
            i0Var.f(i10);
        }
        return (qy0[]) i0Var.f5678b;
    }
}
