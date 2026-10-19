package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class uz0 {
    public final boolean f31074a;
    public m.g3 d;
    public m.g3 f31077f;
    public m.g3 h;
    public int[] f31080j;
    public int[] f31082l;
    public sz0[] f31084n;
    public int[] f31086p;
    public boolean f31088r;
    public int[] f31090t;
    public final e01 f31093x;
    public int f31075b = Integer.MIN_VALUE;
    public int f31076c = Integer.MIN_VALUE;
    public boolean e = false;
    public boolean f31078g = false;
    public boolean f31079i = false;
    public boolean f31081k = false;
    public boolean f31083m = false;
    public boolean f31085o = false;
    public boolean f31087q = false;
    public boolean f31089s = false;
    public boolean f31091u = true;
    public final a01 v = new a01(0);
    public final a01 f31092w = new a01(-100000);

    public uz0(e01 e01Var, boolean z10) {
        this.f31093x = e01Var;
        this.f31074a = z10;
    }

    public static void j(ArrayList arrayList, yz0 yz0Var, a01 a01Var, boolean z10) {
        if (yz0Var.a() != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((sz0) obj).f30366a.equals(yz0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new sz0(yz0Var, a01Var));
        }
    }

    public static boolean m(int[] iArr, sz0 sz0Var) {
        if (sz0Var.f30368c) {
            yz0 yz0Var = sz0Var.f30366a;
            int i10 = yz0Var.f32787a;
            int i11 = yz0Var.f32788b;
            int i12 = iArr[i10] + sz0Var.f30367b.f24429a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(m.g3 g3Var, boolean z10) {
        for (a01 a01Var : (a01[]) ((Object[]) g3Var.d)) {
            a01Var.f24429a = Integer.MIN_VALUE;
        }
        vz0[] vz0VarArr = (vz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < vz0VarArr.length; i10++) {
            int d = vz0VarArr[i10].d(z10);
            a01 a01Var2 = (a01) ((Object[]) g3Var.d)[((int[]) g3Var.f16204b)[i10]];
            int i11 = a01Var2.f24429a;
            if (!z10) {
                d = -d;
            }
            a01Var2.f24429a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        b01 b01Var;
        int i10;
        if (z10) {
            iArr = this.f31080j;
        } else {
            iArr = this.f31082l;
        }
        e01 e01Var = this.f31093x;
        int childCount = e01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            xz0 d = e01Var.d(i11);
            zz0 zz0Var = d.f32486a;
            boolean z11 = this.f31074a;
            if (z11) {
                b01Var = zz0Var.f33068b;
            } else {
                b01Var = zz0Var.f33067a;
            }
            yz0 yz0Var = b01Var.f24761b;
            if (z10) {
                i10 = yz0Var.f32787a;
            } else {
                i10 = yz0Var.f32788b;
            }
            iArr[i10] = Math.max(iArr[i10], e01Var.f(d, z11, z10));
        }
    }

    public final m.g3 c(boolean z10) {
        yz0 yz0Var;
        tz0 tz0Var = new tz0(yz0.class, a01.class);
        b01[] b01VarArr = (b01[]) ((Object[]) f().f16205c);
        int length = b01VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                yz0Var = b01VarArr[i10].f24761b;
            } else {
                yz0 yz0Var2 = b01VarArr[i10].f24761b;
                yz0Var = new yz0(yz0Var2.f32788b, yz0Var2.f32787a);
            }
            ?? obj = new Object();
            obj.f24429a = Integer.MIN_VALUE;
            tz0Var.add(Pair.create(yz0Var, obj));
        }
        return tz0Var.h();
    }

    public final sz0[] d() {
        if (this.f31084n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f31077f == null) {
                this.f31077f = c(true);
            }
            if (!this.f31078g) {
                a(this.f31077f, true);
                this.f31078g = true;
            }
            m.g3 g3Var = this.f31077f;
            int i10 = 0;
            while (true) {
                yz0[] yz0VarArr = (yz0[]) ((Object[]) g3Var.f16205c);
                if (i10 >= yz0VarArr.length) {
                    break;
                }
                j(arrayList, yz0VarArr[i10], ((a01[]) ((Object[]) g3Var.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f31079i) {
                a(this.h, false);
                this.f31079i = true;
            }
            m.g3 g3Var2 = this.h;
            int i11 = 0;
            while (true) {
                yz0[] yz0VarArr2 = (yz0[]) ((Object[]) g3Var2.f16205c);
                if (i11 >= yz0VarArr2.length) {
                    break;
                }
                j(arrayList2, yz0VarArr2[i11], ((a01[]) ((Object[]) g3Var2.d))[i11], false);
                i11++;
            }
            if (this.f31091u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new yz0(i12, i13), new a01(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new yz0(0, e), this.v, false);
            j(arrayList2, new yz0(e, 0), this.f31092w, false);
            sz0[] q6 = q(arrayList);
            sz0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(sz0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.f31084n = (sz0[]) objArr;
        }
        if (!this.f31085o) {
            if (this.f31077f == null) {
                this.f31077f = c(true);
            }
            if (!this.f31078g) {
                a(this.f31077f, true);
                this.f31078g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f31079i) {
                a(this.h, false);
                this.f31079i = true;
            }
            this.f31085o = true;
        }
        return this.f31084n;
    }

    public final int e() {
        int max = Math.max(this.f31075b, h());
        if (max <= 1024) {
            return max;
        }
        e01.g("Table grid count out of bounds");
        throw null;
    }

    public final m.g3 f() {
        b01 b01Var;
        int i10;
        int i11;
        int i12;
        b01 b01Var2;
        vz0 vz0Var;
        m.g3 g3Var = this.d;
        boolean z10 = this.f31074a;
        e01 e01Var = this.f31093x;
        if (g3Var == null) {
            tz0 tz0Var = new tz0(b01.class, vz0.class);
            int childCount = e01Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                zz0 zz0Var = e01Var.d(i13).f32486a;
                if (z10) {
                    b01Var2 = zz0Var.f33068b;
                } else {
                    b01Var2 = zz0Var.f33067a;
                }
                switch (b01.a(b01Var2, z10).f29761a) {
                    case 3:
                        vz0Var = new vz0();
                        break;
                    default:
                        vz0Var = new vz0();
                        break;
                }
                tz0Var.add(Pair.create(b01Var2, vz0Var));
            }
            this.d = tz0Var.h();
        }
        if (!this.e) {
            for (vz0 vz0Var2 : (vz0[]) ((Object[]) this.d.d)) {
                vz0Var2.c();
            }
            int childCount2 = e01Var.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                xz0 d = e01Var.d(i14);
                zz0 zz0Var2 = d.f32486a;
                if (z10) {
                    b01Var = zz0Var2.f33068b;
                } else {
                    b01Var = zz0Var2.f33067a;
                }
                if (z10) {
                    i10 = d.f32493k;
                } else {
                    i10 = d.f32494l;
                }
                int e = e01Var.e(d, z10, false) + e01Var.e(d, z10, true) + i10;
                float f7 = b01Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f31090t[i14];
                }
                int i15 = e + i11;
                m.g3 g3Var2 = this.d;
                vz0 vz0Var3 = (vz0) ((Object[]) g3Var2.d)[((int[]) g3Var2.f16204b)[i14]];
                int i16 = vz0Var3.f31958c;
                if (b01Var.f24762c == e01.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                vz0Var3.f31958c = i12 & i16;
                int a2 = b01.a(b01Var, z10).a(d, i15);
                vz0Var3.b(a2, i15 - a2);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] g() {
        b01 b01Var;
        boolean z10;
        b01 b01Var2;
        if (this.f31086p == null) {
            this.f31086p = new int[e() + 1];
        }
        if (!this.f31087q) {
            int[] iArr = this.f31086p;
            boolean z11 = this.f31089s;
            float f7 = 0.0f;
            boolean z12 = this.f31074a;
            e01 e01Var = this.f31093x;
            if (!z11) {
                int childCount = e01Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        zz0 zz0Var = e01Var.d(i10).f32486a;
                        if (z12) {
                            b01Var2 = zz0Var.f33068b;
                        } else {
                            b01Var2 = zz0Var.f33067a;
                        }
                        if (b01Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f31088r = z10;
                this.f31089s = true;
            }
            if (!this.f31088r) {
                p(d(), iArr, true);
            } else {
                if (this.f31090t == null) {
                    this.f31090t = new int[e01Var.getChildCount()];
                }
                Arrays.fill(this.f31090t, 0);
                p(d(), iArr, true);
                int childCount2 = (e01Var.getChildCount() * this.v.f24429a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = e01Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        zz0 zz0Var2 = e01Var.d(i11).f32486a;
                        if (z12) {
                            b01Var = zz0Var2.f33068b;
                        } else {
                            b01Var = zz0Var2.f33067a;
                        }
                        f7 += b01Var.d;
                    }
                    int i12 = -1;
                    boolean z13 = true;
                    int i13 = 0;
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
            if (!this.f31091u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f31087q = true;
        }
        return this.f31086p;
    }

    public final int h() {
        b01 b01Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f31076c == Integer.MIN_VALUE) {
            e01 e01Var = this.f31093x;
            int childCount = e01Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                zz0 zz0Var = e01Var.d(i12).f32486a;
                if (this.f31074a) {
                    b01Var = zz0Var.f33068b;
                } else {
                    b01Var = zz0Var.f33067a;
                }
                yz0 yz0Var = b01Var.f24761b;
                i11 = Math.max(Math.max(Math.max(i11, yz0Var.f32787a), yz0Var.f32788b), yz0Var.a());
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f31076c = Math.max(0, i10);
        }
        return this.f31076c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        a01 a01Var = this.f31092w;
        a01 a01Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                a01Var2.f24429a = size;
                a01Var.f24429a = -size;
                this.f31087q = false;
                return g()[e()];
            }
            a01Var2.f24429a = 0;
            a01Var.f24429a = -100000;
            this.f31087q = false;
            return g()[e()];
        }
        a01Var2.f24429a = 0;
        a01Var.f24429a = -size;
        this.f31087q = false;
        return g()[e()];
    }

    public final void k() {
        this.f31076c = Integer.MIN_VALUE;
        this.d = null;
        this.f31077f = null;
        this.h = null;
        this.f31080j = null;
        this.f31082l = null;
        this.f31084n = null;
        this.f31086p = null;
        this.f31090t = null;
        this.f31089s = false;
        l();
    }

    public final void l() {
        this.e = false;
        this.f31078g = false;
        this.f31079i = false;
        this.f31081k = false;
        this.f31083m = false;
        this.f31085o = false;
        this.f31087q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f31074a) {
                str = "column";
            } else {
                str = "row";
            }
            e01.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.f31075b = i10;
    }

    public final void o(float f7, int i10) {
        b01 b01Var;
        Arrays.fill(this.f31090t, 0);
        e01 e01Var = this.f31093x;
        int childCount = e01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            zz0 zz0Var = e01Var.d(i11).f32486a;
            if (this.f31074a) {
                b01Var = zz0Var.f33068b;
            } else {
                b01Var = zz0Var.f33067a;
            }
            float f10 = b01Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f31090t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(sz0[] sz0VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < sz0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (sz0 sz0Var : sz0VarArr) {
                    z11 |= m(iArr, sz0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[sz0VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = sz0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, sz0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= sz0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    sz0 sz0Var2 = sz0VarArr[i14];
                    yz0 yz0Var = sz0Var2.f30366a;
                    if (yz0Var.f32787a >= yz0Var.f32788b) {
                        sz0Var2.f30368c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final sz0[] q(ArrayList arrayList) {
        e0.f0 f0Var = new e0.f0(this, (sz0[]) arrayList.toArray(new sz0[0]));
        int length = ((sz0[][]) f0Var.d).length;
        for (int i10 = 0; i10 < length; i10++) {
            f0Var.f(i10);
        }
        return (sz0[]) f0Var.f8098c;
    }
}
