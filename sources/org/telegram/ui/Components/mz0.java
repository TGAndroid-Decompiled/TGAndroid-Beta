package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class mz0 {
    public final boolean f26547a;
    public lf.i d;
    public lf.i f26550f;
    public lf.i h;
    public int[] f26553j;
    public int[] f26555l;
    public kz0[] f26557n;
    public int[] f26559p;
    public boolean f26561r;
    public int[] f26563t;
    public final wz0 f26566x;
    public int f26548b = Integer.MIN_VALUE;
    public int f26549c = Integer.MIN_VALUE;
    public boolean e = false;
    public boolean f26551g = false;
    public boolean f26552i = false;
    public boolean f26554k = false;
    public boolean f26556m = false;
    public boolean f26558o = false;
    public boolean f26560q = false;
    public boolean f26562s = false;
    public boolean f26564u = true;
    public final sz0 v = new sz0(0);
    public final sz0 f26565w = new sz0(-100000);

    public mz0(wz0 wz0Var, boolean z10) {
        this.f26566x = wz0Var;
        this.f26547a = z10;
    }

    public static void j(ArrayList arrayList, qz0 qz0Var, sz0 sz0Var, boolean z10) {
        if (qz0Var.f27760b - qz0Var.f27759a != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((kz0) obj).f25968a.equals(qz0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new kz0(qz0Var, sz0Var));
        }
    }

    public static boolean m(int[] iArr, kz0 kz0Var) {
        if (kz0Var.f25970c) {
            qz0 qz0Var = kz0Var.f25968a;
            int i10 = qz0Var.f27759a;
            int i11 = qz0Var.f27760b;
            int i12 = iArr[i10] + kz0Var.f25969b.f28259a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(lf.i iVar, boolean z10) {
        for (sz0 sz0Var : (sz0[]) ((Object[]) iVar.d)) {
            sz0Var.f28259a = Integer.MIN_VALUE;
        }
        nz0[] nz0VarArr = (nz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < nz0VarArr.length; i10++) {
            int d = nz0VarArr[i10].d(z10);
            sz0 sz0Var2 = (sz0) ((Object[]) iVar.d)[((int[]) iVar.f14179b)[i10]];
            int i11 = sz0Var2.f28259a;
            if (!z10) {
                d = -d;
            }
            sz0Var2.f28259a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        tz0 tz0Var;
        int i10;
        if (z10) {
            iArr = this.f26553j;
        } else {
            iArr = this.f26555l;
        }
        wz0 wz0Var = this.f26566x;
        int childCount = wz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            pz0 d = wz0Var.d(i11);
            rz0 rz0Var = d.f27363a;
            boolean z11 = this.f26547a;
            if (z11) {
                tz0Var = rz0Var.f28007b;
            } else {
                tz0Var = rz0Var.f28006a;
            }
            qz0 qz0Var = tz0Var.f28518b;
            if (z10) {
                i10 = qz0Var.f27759a;
            } else {
                i10 = qz0Var.f27760b;
            }
            iArr[i10] = Math.max(iArr[i10], wz0Var.f(d, z11, z10));
        }
    }

    public final lf.i c(boolean z10) {
        qz0 qz0Var;
        lz0 lz0Var = new lz0(qz0.class, sz0.class);
        tz0[] tz0VarArr = (tz0[]) ((Object[]) f().f14180c);
        int length = tz0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                qz0Var = tz0VarArr[i10].f28518b;
            } else {
                qz0 qz0Var2 = tz0VarArr[i10].f28518b;
                qz0Var = new qz0(qz0Var2.f27760b, qz0Var2.f27759a);
            }
            ?? obj = new Object();
            obj.f28259a = Integer.MIN_VALUE;
            lz0Var.add(Pair.create(qz0Var, obj));
        }
        return lz0Var.i();
    }

    public final kz0[] d() {
        if (this.f26557n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f26550f == null) {
                this.f26550f = c(true);
            }
            if (!this.f26551g) {
                a(this.f26550f, true);
                this.f26551g = true;
            }
            lf.i iVar = this.f26550f;
            int i10 = 0;
            while (true) {
                qz0[] qz0VarArr = (qz0[]) ((Object[]) iVar.f14180c);
                if (i10 >= qz0VarArr.length) {
                    break;
                }
                j(arrayList, qz0VarArr[i10], ((sz0[]) ((Object[]) iVar.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f26552i) {
                a(this.h, false);
                this.f26552i = true;
            }
            lf.i iVar2 = this.h;
            int i11 = 0;
            while (true) {
                qz0[] qz0VarArr2 = (qz0[]) ((Object[]) iVar2.f14180c);
                if (i11 >= qz0VarArr2.length) {
                    break;
                }
                j(arrayList2, qz0VarArr2[i11], ((sz0[]) ((Object[]) iVar2.d))[i11], false);
                i11++;
            }
            if (this.f26564u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new qz0(i12, i13), new sz0(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new qz0(0, e), this.v, false);
            j(arrayList2, new qz0(e, 0), this.f26565w, false);
            kz0[] q6 = q(arrayList);
            kz0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(kz0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.f26557n = (kz0[]) objArr;
        }
        if (!this.f26558o) {
            if (this.f26550f == null) {
                this.f26550f = c(true);
            }
            if (!this.f26551g) {
                a(this.f26550f, true);
                this.f26551g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f26552i) {
                a(this.h, false);
                this.f26552i = true;
            }
            this.f26558o = true;
        }
        return this.f26557n;
    }

    public final int e() {
        return Math.max(this.f26548b, h());
    }

    public final lf.i f() {
        tz0 tz0Var;
        int i10;
        int i11;
        int i12;
        tz0 tz0Var2;
        nz0 nz0Var;
        lf.i iVar = this.d;
        boolean z10 = this.f26547a;
        wz0 wz0Var = this.f26566x;
        if (iVar == null) {
            lz0 lz0Var = new lz0(tz0.class, nz0.class);
            int childCount = wz0Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                rz0 rz0Var = wz0Var.d(i13).f27363a;
                if (z10) {
                    tz0Var2 = rz0Var.f28007b;
                } else {
                    tz0Var2 = rz0Var.f28006a;
                }
                switch (tz0.a(tz0Var2, z10).f25092a) {
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
                rz0 rz0Var2 = d.f27363a;
                if (z10) {
                    tz0Var = rz0Var2.f28007b;
                } else {
                    tz0Var = rz0Var2.f28006a;
                }
                if (z10) {
                    i10 = d.f27370k;
                } else {
                    i10 = d.f27371l;
                }
                int e = wz0Var.e(d, z10, false) + wz0Var.e(d, z10, true) + i10;
                float f7 = tz0Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f26563t[i14];
                }
                int i15 = e + i11;
                lf.i iVar2 = this.d;
                nz0 nz0Var3 = (nz0) ((Object[]) iVar2.d)[((int[]) iVar2.f14179b)[i14]];
                int i16 = nz0Var3.f26792c;
                if (tz0Var.f28519c == wz0.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                nz0Var3.f26792c = i12 & i16;
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
        if (this.f26559p == null) {
            this.f26559p = new int[e() + 1];
        }
        if (!this.f26560q) {
            int[] iArr = this.f26559p;
            boolean z11 = this.f26562s;
            float f7 = 0.0f;
            boolean z12 = this.f26547a;
            wz0 wz0Var = this.f26566x;
            if (!z11) {
                int childCount = wz0Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        rz0 rz0Var = wz0Var.d(i10).f27363a;
                        if (z12) {
                            tz0Var2 = rz0Var.f28007b;
                        } else {
                            tz0Var2 = rz0Var.f28006a;
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
                this.f26561r = z10;
                this.f26562s = true;
            }
            if (!this.f26561r) {
                p(d(), iArr, true);
            } else {
                if (this.f26563t == null) {
                    this.f26563t = new int[wz0Var.getChildCount()];
                }
                Arrays.fill(this.f26563t, 0);
                p(d(), iArr, true);
                int childCount2 = (wz0Var.getChildCount() * this.v.f28259a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = wz0Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        rz0 rz0Var2 = wz0Var.d(i11).f27363a;
                        if (z12) {
                            tz0Var = rz0Var2.f28007b;
                        } else {
                            tz0Var = rz0Var2.f28006a;
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
            if (!this.f26564u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f26560q = true;
        }
        return this.f26559p;
    }

    public final int h() {
        tz0 tz0Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f26549c == Integer.MIN_VALUE) {
            wz0 wz0Var = this.f26566x;
            int childCount = wz0Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                rz0 rz0Var = wz0Var.d(i12).f27363a;
                if (this.f26547a) {
                    tz0Var = rz0Var.f28007b;
                } else {
                    tz0Var = rz0Var.f28006a;
                }
                qz0 qz0Var = tz0Var.f28518b;
                int i13 = qz0Var.f27759a;
                int i14 = qz0Var.f27760b;
                i11 = Math.max(Math.max(Math.max(i11, i13), i14), i14 - qz0Var.f27759a);
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f26549c = Math.max(0, i10);
        }
        return this.f26549c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        sz0 sz0Var = this.f26565w;
        sz0 sz0Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                sz0Var2.f28259a = size;
                sz0Var.f28259a = -size;
                this.f26560q = false;
                return g()[e()];
            }
            sz0Var2.f28259a = 0;
            sz0Var.f28259a = -100000;
            this.f26560q = false;
            return g()[e()];
        }
        sz0Var2.f28259a = 0;
        sz0Var.f28259a = -size;
        this.f26560q = false;
        return g()[e()];
    }

    public final void k() {
        this.f26549c = Integer.MIN_VALUE;
        this.d = null;
        this.f26550f = null;
        this.h = null;
        this.f26553j = null;
        this.f26555l = null;
        this.f26557n = null;
        this.f26559p = null;
        this.f26563t = null;
        this.f26562s = false;
        l();
    }

    public final void l() {
        this.e = false;
        this.f26551g = false;
        this.f26552i = false;
        this.f26554k = false;
        this.f26556m = false;
        this.f26558o = false;
        this.f26560q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f26547a) {
                str = "column";
            } else {
                str = "row";
            }
            throw new IllegalArgumentException(t8.b.v(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"), ". "));
        }
        this.f26548b = i10;
    }

    public final void o(float f7, int i10) {
        tz0 tz0Var;
        Arrays.fill(this.f26563t, 0);
        wz0 wz0Var = this.f26566x;
        int childCount = wz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            rz0 rz0Var = wz0Var.d(i11).f27363a;
            if (this.f26547a) {
                tz0Var = rz0Var.f28007b;
            } else {
                tz0Var = rz0Var.f28006a;
            }
            float f10 = tz0Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f26563t[i11] = round;
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
                    qz0 qz0Var = kz0Var2.f25968a;
                    if (qz0Var.f27759a >= qz0Var.f27760b) {
                        kz0Var2.f25970c = false;
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
        int length = ((kz0[][]) i0Var.f7790c).length;
        for (int i10 = 0; i10 < length; i10++) {
            i0Var.f(i10);
        }
        return (kz0[]) i0Var.f7789b;
    }
}
