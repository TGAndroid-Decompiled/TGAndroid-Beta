package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class mz0 {
    public final boolean f25326a;
    public m.e3 d;
    public m.e3 f25329f;
    public m.e3 h;
    public int[] f25332j;
    public int[] f25334l;
    public kz0[] f25336n;
    public int[] f25338p;
    public boolean f25340r;
    public int[] f25342t;
    public final wz0 f25345x;
    public int f25327b = Integer.MIN_VALUE;
    public int f25328c = Integer.MIN_VALUE;
    public boolean e = false;
    public boolean f25330g = false;
    public boolean f25331i = false;
    public boolean f25333k = false;
    public boolean f25335m = false;
    public boolean f25337o = false;
    public boolean f25339q = false;
    public boolean f25341s = false;
    public boolean f25343u = true;
    public final sz0 v = new sz0(0);
    public final sz0 f25344w = new sz0(-100000);

    public mz0(wz0 wz0Var, boolean z10) {
        this.f25345x = wz0Var;
        this.f25326a = z10;
    }

    public static void j(ArrayList arrayList, qz0 qz0Var, sz0 sz0Var, boolean z10) {
        if (qz0Var.f26500b - qz0Var.f26499a != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((kz0) obj).f24836a.equals(qz0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new kz0(qz0Var, sz0Var));
        }
    }

    public static boolean m(int[] iArr, kz0 kz0Var) {
        if (kz0Var.f24838c) {
            qz0 qz0Var = kz0Var.f24836a;
            int i10 = qz0Var.f26499a;
            int i11 = qz0Var.f26500b;
            int i12 = iArr[i10] + kz0Var.f24837b.f27237a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(m.e3 e3Var, boolean z10) {
        for (sz0 sz0Var : (sz0[]) ((Object[]) e3Var.d)) {
            sz0Var.f27237a = Integer.MIN_VALUE;
        }
        nz0[] nz0VarArr = (nz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < nz0VarArr.length; i10++) {
            int d = nz0VarArr[i10].d(z10);
            sz0 sz0Var2 = (sz0) ((Object[]) e3Var.d)[((int[]) e3Var.f13001b)[i10]];
            int i11 = sz0Var2.f27237a;
            if (!z10) {
                d = -d;
            }
            sz0Var2.f27237a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        tz0 tz0Var;
        int i10;
        if (z10) {
            iArr = this.f25332j;
        } else {
            iArr = this.f25334l;
        }
        wz0 wz0Var = this.f25345x;
        int childCount = wz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            pz0 d = wz0Var.d(i11);
            rz0 rz0Var = d.f26274a;
            boolean z11 = this.f25326a;
            if (z11) {
                tz0Var = rz0Var.f26882b;
            } else {
                tz0Var = rz0Var.f26881a;
            }
            qz0 qz0Var = tz0Var.f27526b;
            if (z10) {
                i10 = qz0Var.f26499a;
            } else {
                i10 = qz0Var.f26500b;
            }
            iArr[i10] = Math.max(iArr[i10], wz0Var.f(d, z11, z10));
        }
    }

    public final m.e3 c(boolean z10) {
        qz0 qz0Var;
        lz0 lz0Var = new lz0(qz0.class, sz0.class);
        tz0[] tz0VarArr = (tz0[]) ((Object[]) f().f13002c);
        int length = tz0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                qz0Var = tz0VarArr[i10].f27526b;
            } else {
                qz0 qz0Var2 = tz0VarArr[i10].f27526b;
                qz0Var = new qz0(qz0Var2.f26500b, qz0Var2.f26499a);
            }
            ?? obj = new Object();
            obj.f27237a = Integer.MIN_VALUE;
            lz0Var.add(Pair.create(qz0Var, obj));
        }
        return lz0Var.i();
    }

    public final kz0[] d() {
        if (this.f25336n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f25329f == null) {
                this.f25329f = c(true);
            }
            if (!this.f25330g) {
                a(this.f25329f, true);
                this.f25330g = true;
            }
            m.e3 e3Var = this.f25329f;
            int i10 = 0;
            while (true) {
                qz0[] qz0VarArr = (qz0[]) ((Object[]) e3Var.f13002c);
                if (i10 >= qz0VarArr.length) {
                    break;
                }
                j(arrayList, qz0VarArr[i10], ((sz0[]) ((Object[]) e3Var.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f25331i) {
                a(this.h, false);
                this.f25331i = true;
            }
            m.e3 e3Var2 = this.h;
            int i11 = 0;
            while (true) {
                qz0[] qz0VarArr2 = (qz0[]) ((Object[]) e3Var2.f13002c);
                if (i11 >= qz0VarArr2.length) {
                    break;
                }
                j(arrayList2, qz0VarArr2[i11], ((sz0[]) ((Object[]) e3Var2.d))[i11], false);
                i11++;
            }
            if (this.f25343u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new qz0(i12, i13), new sz0(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new qz0(0, e), this.v, false);
            j(arrayList2, new qz0(e, 0), this.f25344w, false);
            kz0[] q6 = q(arrayList);
            kz0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(kz0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.f25336n = (kz0[]) objArr;
        }
        if (!this.f25337o) {
            if (this.f25329f == null) {
                this.f25329f = c(true);
            }
            if (!this.f25330g) {
                a(this.f25329f, true);
                this.f25330g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f25331i) {
                a(this.h, false);
                this.f25331i = true;
            }
            this.f25337o = true;
        }
        return this.f25336n;
    }

    public final int e() {
        return Math.max(this.f25327b, h());
    }

    public final m.e3 f() {
        tz0 tz0Var;
        int i10;
        int i11;
        int i12;
        tz0 tz0Var2;
        nz0 nz0Var;
        m.e3 e3Var = this.d;
        boolean z10 = this.f25326a;
        wz0 wz0Var = this.f25345x;
        if (e3Var == null) {
            lz0 lz0Var = new lz0(tz0.class, nz0.class);
            int childCount = wz0Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                rz0 rz0Var = wz0Var.d(i13).f26274a;
                if (z10) {
                    tz0Var2 = rz0Var.f26882b;
                } else {
                    tz0Var2 = rz0Var.f26881a;
                }
                switch (tz0.a(tz0Var2, z10).f24174a) {
                    case 3:
                        nz0Var = new nz0();
                        break;
                    default:
                        nz0Var = new nz0();
                        break;
                }
                lz0Var.add(Pair.create(tz0Var2, nz0Var));
            }
            this.d = lz0Var.i();
        }
        if (!this.e) {
            for (nz0 nz0Var2 : (nz0[]) ((Object[]) this.d.d)) {
                nz0Var2.c();
            }
            int childCount2 = wz0Var.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                pz0 d = wz0Var.d(i14);
                rz0 rz0Var2 = d.f26274a;
                if (z10) {
                    tz0Var = rz0Var2.f26882b;
                } else {
                    tz0Var = rz0Var2.f26881a;
                }
                if (z10) {
                    i10 = d.f26281k;
                } else {
                    i10 = d.f26282l;
                }
                int e = wz0Var.e(d, z10, false) + wz0Var.e(d, z10, true) + i10;
                float f7 = tz0Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f25342t[i14];
                }
                int i15 = e + i11;
                m.e3 e3Var2 = this.d;
                nz0 nz0Var3 = (nz0) ((Object[]) e3Var2.d)[((int[]) e3Var2.f13001b)[i14]];
                int i16 = nz0Var3.f25623c;
                if (tz0Var.f27527c == wz0.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                nz0Var3.f25623c = i12 & i16;
                int a2 = tz0.a(tz0Var, z10).a(d, i15);
                nz0Var3.b(a2, i15 - a2);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] g() {
        tz0 tz0Var;
        boolean z10;
        tz0 tz0Var2;
        if (this.f25338p == null) {
            this.f25338p = new int[e() + 1];
        }
        if (!this.f25339q) {
            int[] iArr = this.f25338p;
            boolean z11 = this.f25341s;
            float f7 = 0.0f;
            boolean z12 = this.f25326a;
            wz0 wz0Var = this.f25345x;
            if (!z11) {
                int childCount = wz0Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        rz0 rz0Var = wz0Var.d(i10).f26274a;
                        if (z12) {
                            tz0Var2 = rz0Var.f26882b;
                        } else {
                            tz0Var2 = rz0Var.f26881a;
                        }
                        if (tz0Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f25340r = z10;
                this.f25341s = true;
            }
            if (!this.f25340r) {
                p(d(), iArr, true);
            } else {
                if (this.f25342t == null) {
                    this.f25342t = new int[wz0Var.getChildCount()];
                }
                Arrays.fill(this.f25342t, 0);
                p(d(), iArr, true);
                int childCount2 = (wz0Var.getChildCount() * this.v.f27237a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = wz0Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        rz0 rz0Var2 = wz0Var.d(i11).f26274a;
                        if (z12) {
                            tz0Var = rz0Var2.f26882b;
                        } else {
                            tz0Var = rz0Var2.f26881a;
                        }
                        f7 += tz0Var.d;
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
            if (!this.f25343u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f25339q = true;
        }
        return this.f25338p;
    }

    public final int h() {
        tz0 tz0Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f25328c == Integer.MIN_VALUE) {
            wz0 wz0Var = this.f25345x;
            int childCount = wz0Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                rz0 rz0Var = wz0Var.d(i12).f26274a;
                if (this.f25326a) {
                    tz0Var = rz0Var.f26882b;
                } else {
                    tz0Var = rz0Var.f26881a;
                }
                qz0 qz0Var = tz0Var.f27526b;
                int i13 = qz0Var.f26499a;
                int i14 = qz0Var.f26500b;
                i11 = Math.max(Math.max(Math.max(i11, i13), i14), i14 - qz0Var.f26499a);
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f25328c = Math.max(0, i10);
        }
        return this.f25328c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        sz0 sz0Var = this.f25344w;
        sz0 sz0Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                sz0Var2.f27237a = size;
                sz0Var.f27237a = -size;
                this.f25339q = false;
                return g()[e()];
            }
            sz0Var2.f27237a = 0;
            sz0Var.f27237a = -100000;
            this.f25339q = false;
            return g()[e()];
        }
        sz0Var2.f27237a = 0;
        sz0Var.f27237a = -size;
        this.f25339q = false;
        return g()[e()];
    }

    public final void k() {
        this.f25328c = Integer.MIN_VALUE;
        this.d = null;
        this.f25329f = null;
        this.h = null;
        this.f25332j = null;
        this.f25334l = null;
        this.f25336n = null;
        this.f25338p = null;
        this.f25342t = null;
        this.f25341s = false;
        l();
    }

    public final void l() {
        this.e = false;
        this.f25330g = false;
        this.f25331i = false;
        this.f25333k = false;
        this.f25335m = false;
        this.f25337o = false;
        this.f25339q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f25326a) {
                str = "column";
            } else {
                str = "row";
            }
            throw new IllegalArgumentException(org.telegram.ui.Cells.r6.t(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"), ". "));
        }
        this.f25327b = i10;
    }

    public final void o(float f7, int i10) {
        tz0 tz0Var;
        Arrays.fill(this.f25342t, 0);
        wz0 wz0Var = this.f25345x;
        int childCount = wz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            rz0 rz0Var = wz0Var.d(i11).f26274a;
            if (this.f25326a) {
                tz0Var = rz0Var.f26882b;
            } else {
                tz0Var = rz0Var.f26881a;
            }
            float f10 = tz0Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f25342t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(kz0[] kz0VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < kz0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (kz0 kz0Var : kz0VarArr) {
                    z11 |= m(iArr, kz0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[kz0VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = kz0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, kz0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= kz0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    kz0 kz0Var2 = kz0VarArr[i14];
                    qz0 qz0Var = kz0Var2.f24836a;
                    if (qz0Var.f26499a >= qz0Var.f26500b) {
                        kz0Var2.f24838c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final kz0[] q(ArrayList arrayList) {
        e0.i0 i0Var = new e0.i0(this, (kz0[]) arrayList.toArray(new kz0[0]));
        int length = ((kz0[][]) i0Var.f7091c).length;
        for (int i10 = 0; i10 < length; i10++) {
            i0Var.f(i10);
        }
        return (kz0[]) i0Var.f7090b;
    }
}
