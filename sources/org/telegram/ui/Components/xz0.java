package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class xz0 {
    public final boolean f32728a;
    public m.g3 d;
    public m.g3 f32731f;
    public m.g3 h;
    public int[] f32734j;
    public int[] f32736l;
    public vz0[] f32738n;
    public int[] f32740p;
    public boolean f32742r;
    public int[] f32744t;
    public final h01 f32747x;
    public int f32729b = Integer.MIN_VALUE;
    public int f32730c = Integer.MIN_VALUE;
    public boolean e = false;
    public boolean f32732g = false;
    public boolean f32733i = false;
    public boolean f32735k = false;
    public boolean f32737m = false;
    public boolean f32739o = false;
    public boolean f32741q = false;
    public boolean f32743s = false;
    public boolean f32745u = true;
    public final d01 v = new d01(0);
    public final d01 f32746w = new d01(-100000);

    public xz0(h01 h01Var, boolean z10) {
        this.f32747x = h01Var;
        this.f32728a = z10;
    }

    public static void j(ArrayList arrayList, b01 b01Var, d01 d01Var, boolean z10) {
        if (b01Var.a() != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((vz0) obj).f32081a.equals(b01Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new vz0(b01Var, d01Var));
        }
    }

    public static boolean m(int[] iArr, vz0 vz0Var) {
        if (vz0Var.f32083c) {
            b01 b01Var = vz0Var.f32081a;
            int i10 = b01Var.f24861a;
            int i11 = b01Var.f24862b;
            int i12 = iArr[i10] + vz0Var.f32082b.f25507a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(m.g3 g3Var, boolean z10) {
        for (d01 d01Var : (d01[]) ((Object[]) g3Var.d)) {
            d01Var.f25507a = Integer.MIN_VALUE;
        }
        yz0[] yz0VarArr = (yz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < yz0VarArr.length; i10++) {
            int d = yz0VarArr[i10].d(z10);
            d01 d01Var2 = (d01) ((Object[]) g3Var.d)[((int[]) g3Var.f16265b)[i10]];
            int i11 = d01Var2.f25507a;
            if (!z10) {
                d = -d;
            }
            d01Var2.f25507a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        e01 e01Var;
        int i10;
        if (z10) {
            iArr = this.f32734j;
        } else {
            iArr = this.f32736l;
        }
        h01 h01Var = this.f32747x;
        int childCount = h01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            a01 d = h01Var.d(i11);
            c01 c01Var = d.f24583a;
            boolean z11 = this.f32728a;
            if (z11) {
                e01Var = c01Var.f25149b;
            } else {
                e01Var = c01Var.f25148a;
            }
            b01 b01Var = e01Var.f25907b;
            if (z10) {
                i10 = b01Var.f24861a;
            } else {
                i10 = b01Var.f24862b;
            }
            iArr[i10] = Math.max(iArr[i10], h01Var.f(d, z11, z10));
        }
    }

    public final m.g3 c(boolean z10) {
        b01 b01Var;
        wz0 wz0Var = new wz0(b01.class, d01.class);
        e01[] e01VarArr = (e01[]) ((Object[]) f().f16266c);
        int length = e01VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                b01Var = e01VarArr[i10].f25907b;
            } else {
                b01 b01Var2 = e01VarArr[i10].f25907b;
                b01Var = new b01(b01Var2.f24862b, b01Var2.f24861a);
            }
            ?? obj = new Object();
            obj.f25507a = Integer.MIN_VALUE;
            wz0Var.add(Pair.create(b01Var, obj));
        }
        return wz0Var.h();
    }

    public final vz0[] d() {
        if (this.f32738n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f32731f == null) {
                this.f32731f = c(true);
            }
            if (!this.f32732g) {
                a(this.f32731f, true);
                this.f32732g = true;
            }
            m.g3 g3Var = this.f32731f;
            int i10 = 0;
            while (true) {
                b01[] b01VarArr = (b01[]) ((Object[]) g3Var.f16266c);
                if (i10 >= b01VarArr.length) {
                    break;
                }
                j(arrayList, b01VarArr[i10], ((d01[]) ((Object[]) g3Var.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f32733i) {
                a(this.h, false);
                this.f32733i = true;
            }
            m.g3 g3Var2 = this.h;
            int i11 = 0;
            while (true) {
                b01[] b01VarArr2 = (b01[]) ((Object[]) g3Var2.f16266c);
                if (i11 >= b01VarArr2.length) {
                    break;
                }
                j(arrayList2, b01VarArr2[i11], ((d01[]) ((Object[]) g3Var2.d))[i11], false);
                i11++;
            }
            if (this.f32745u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new b01(i12, i13), new d01(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new b01(0, e), this.v, false);
            j(arrayList2, new b01(e, 0), this.f32746w, false);
            vz0[] q6 = q(arrayList);
            vz0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(vz0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.f32738n = (vz0[]) objArr;
        }
        if (!this.f32739o) {
            if (this.f32731f == null) {
                this.f32731f = c(true);
            }
            if (!this.f32732g) {
                a(this.f32731f, true);
                this.f32732g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f32733i) {
                a(this.h, false);
                this.f32733i = true;
            }
            this.f32739o = true;
        }
        return this.f32738n;
    }

    public final int e() {
        int max = Math.max(this.f32729b, h());
        if (max <= 1024) {
            return max;
        }
        h01.g("Table grid count out of bounds");
        throw null;
    }

    public final m.g3 f() {
        e01 e01Var;
        int i10;
        int i11;
        int i12;
        e01 e01Var2;
        yz0 yz0Var;
        m.g3 g3Var = this.d;
        boolean z10 = this.f32728a;
        h01 h01Var = this.f32747x;
        if (g3Var == null) {
            wz0 wz0Var = new wz0(e01.class, yz0.class);
            int childCount = h01Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                c01 c01Var = h01Var.d(i13).f24583a;
                if (z10) {
                    e01Var2 = c01Var.f25149b;
                } else {
                    e01Var2 = c01Var.f25148a;
                }
                switch (e01.a(e01Var2, z10).f30941a) {
                    case 3:
                        yz0Var = new yz0();
                        break;
                    default:
                        yz0Var = new yz0();
                        break;
                }
                wz0Var.add(Pair.create(e01Var2, yz0Var));
            }
            this.d = wz0Var.h();
        }
        if (!this.e) {
            for (yz0 yz0Var2 : (yz0[]) ((Object[]) this.d.d)) {
                yz0Var2.c();
            }
            int childCount2 = h01Var.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                a01 d = h01Var.d(i14);
                c01 c01Var2 = d.f24583a;
                if (z10) {
                    e01Var = c01Var2.f25149b;
                } else {
                    e01Var = c01Var2.f25148a;
                }
                if (z10) {
                    i10 = d.f24590k;
                } else {
                    i10 = d.f24591l;
                }
                int e = h01Var.e(d, z10, false) + h01Var.e(d, z10, true) + i10;
                float f7 = e01Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f32744t[i14];
                }
                int i15 = e + i11;
                m.g3 g3Var2 = this.d;
                yz0 yz0Var3 = (yz0) ((Object[]) g3Var2.d)[((int[]) g3Var2.f16265b)[i14]];
                int i16 = yz0Var3.f33094c;
                if (e01Var.f25908c == h01.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                yz0Var3.f33094c = i12 & i16;
                int a2 = e01.a(e01Var, z10).a(d, i15);
                yz0Var3.b(a2, i15 - a2);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] g() {
        e01 e01Var;
        boolean z10;
        e01 e01Var2;
        if (this.f32740p == null) {
            this.f32740p = new int[e() + 1];
        }
        if (!this.f32741q) {
            int[] iArr = this.f32740p;
            boolean z11 = this.f32743s;
            float f7 = 0.0f;
            boolean z12 = this.f32728a;
            h01 h01Var = this.f32747x;
            if (!z11) {
                int childCount = h01Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        c01 c01Var = h01Var.d(i10).f24583a;
                        if (z12) {
                            e01Var2 = c01Var.f25149b;
                        } else {
                            e01Var2 = c01Var.f25148a;
                        }
                        if (e01Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f32742r = z10;
                this.f32743s = true;
            }
            if (!this.f32742r) {
                p(d(), iArr, true);
            } else {
                if (this.f32744t == null) {
                    this.f32744t = new int[h01Var.getChildCount()];
                }
                Arrays.fill(this.f32744t, 0);
                p(d(), iArr, true);
                int childCount2 = (h01Var.getChildCount() * this.v.f25507a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = h01Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        c01 c01Var2 = h01Var.d(i11).f24583a;
                        if (z12) {
                            e01Var = c01Var2.f25149b;
                        } else {
                            e01Var = c01Var2.f25148a;
                        }
                        f7 += e01Var.d;
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
            if (!this.f32745u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f32741q = true;
        }
        return this.f32740p;
    }

    public final int h() {
        e01 e01Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f32730c == Integer.MIN_VALUE) {
            h01 h01Var = this.f32747x;
            int childCount = h01Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                c01 c01Var = h01Var.d(i12).f24583a;
                if (this.f32728a) {
                    e01Var = c01Var.f25149b;
                } else {
                    e01Var = c01Var.f25148a;
                }
                b01 b01Var = e01Var.f25907b;
                i11 = Math.max(Math.max(Math.max(i11, b01Var.f24861a), b01Var.f24862b), b01Var.a());
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f32730c = Math.max(0, i10);
        }
        return this.f32730c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        d01 d01Var = this.f32746w;
        d01 d01Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                d01Var2.f25507a = size;
                d01Var.f25507a = -size;
                this.f32741q = false;
                return g()[e()];
            }
            d01Var2.f25507a = 0;
            d01Var.f25507a = -100000;
            this.f32741q = false;
            return g()[e()];
        }
        d01Var2.f25507a = 0;
        d01Var.f25507a = -size;
        this.f32741q = false;
        return g()[e()];
    }

    public final void k() {
        this.f32730c = Integer.MIN_VALUE;
        this.d = null;
        this.f32731f = null;
        this.h = null;
        this.f32734j = null;
        this.f32736l = null;
        this.f32738n = null;
        this.f32740p = null;
        this.f32744t = null;
        this.f32743s = false;
        l();
    }

    public final void l() {
        this.e = false;
        this.f32732g = false;
        this.f32733i = false;
        this.f32735k = false;
        this.f32737m = false;
        this.f32739o = false;
        this.f32741q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f32728a) {
                str = "column";
            } else {
                str = "row";
            }
            h01.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.f32729b = i10;
    }

    public final void o(float f7, int i10) {
        e01 e01Var;
        Arrays.fill(this.f32744t, 0);
        h01 h01Var = this.f32747x;
        int childCount = h01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            c01 c01Var = h01Var.d(i11).f24583a;
            if (this.f32728a) {
                e01Var = c01Var.f25149b;
            } else {
                e01Var = c01Var.f25148a;
            }
            float f10 = e01Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f32744t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(vz0[] vz0VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < vz0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (vz0 vz0Var : vz0VarArr) {
                    z11 |= m(iArr, vz0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[vz0VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = vz0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, vz0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= vz0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    vz0 vz0Var2 = vz0VarArr[i14];
                    b01 b01Var = vz0Var2.f32081a;
                    if (b01Var.f24861a >= b01Var.f24862b) {
                        vz0Var2.f32083c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final vz0[] q(ArrayList arrayList) {
        e0.f0 f0Var = new e0.f0(this, (vz0[]) arrayList.toArray(new vz0[0]));
        int length = ((vz0[][]) f0Var.d).length;
        for (int i10 = 0; i10 < length; i10++) {
            f0Var.f(i10);
        }
        return (vz0[]) f0Var.f8103c;
    }
}
