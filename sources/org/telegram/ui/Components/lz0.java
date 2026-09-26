package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class lz0 {
    public final boolean f26202a;
    public la.h d;
    public la.h f26205f;
    public la.h h;
    public int[] f26208j;
    public int[] f26210l;
    public jz0[] f26212n;
    public int[] f26214p;
    public boolean f26216r;
    public int[] f26218t;
    public final vz0 f26221x;
    public int f26203b = Integer.MIN_VALUE;
    public int f26204c = Integer.MIN_VALUE;
    public boolean e = false;
    public boolean f26206g = false;
    public boolean f26207i = false;
    public boolean f26209k = false;
    public boolean f26211m = false;
    public boolean f26213o = false;
    public boolean f26215q = false;
    public boolean f26217s = false;
    public boolean f26219u = true;
    public final rz0 v = new rz0(0);
    public final rz0 f26220w = new rz0(-100000);

    public lz0(vz0 vz0Var, boolean z10) {
        this.f26221x = vz0Var;
        this.f26202a = z10;
    }

    public static void j(ArrayList arrayList, pz0 pz0Var, rz0 rz0Var, boolean z10) {
        if (pz0Var.f27525b - pz0Var.f27524a != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((jz0) obj).f25556a.equals(pz0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new jz0(pz0Var, rz0Var));
        }
    }

    public static boolean m(int[] iArr, jz0 jz0Var) {
        if (jz0Var.f25558c) {
            pz0 pz0Var = jz0Var.f25556a;
            int i10 = pz0Var.f27524a;
            int i11 = pz0Var.f27525b;
            int i12 = iArr[i10] + jz0Var.f25557b.f28095a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(la.h hVar, boolean z10) {
        for (rz0 rz0Var : (rz0[]) ((Object[]) hVar.d)) {
            rz0Var.f28095a = Integer.MIN_VALUE;
        }
        mz0[] mz0VarArr = (mz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < mz0VarArr.length; i10++) {
            int d = mz0VarArr[i10].d(z10);
            rz0 rz0Var2 = (rz0) ((Object[]) hVar.d)[((int[]) hVar.f14166b)[i10]];
            int i11 = rz0Var2.f28095a;
            if (!z10) {
                d = -d;
            }
            rz0Var2.f28095a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        sz0 sz0Var;
        int i10;
        if (z10) {
            iArr = this.f26208j;
        } else {
            iArr = this.f26210l;
        }
        vz0 vz0Var = this.f26221x;
        int childCount = vz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            oz0 d = vz0Var.d(i11);
            qz0 qz0Var = d.f27153a;
            boolean z11 = this.f26202a;
            if (z11) {
                sz0Var = qz0Var.f27790b;
            } else {
                sz0Var = qz0Var.f27789a;
            }
            pz0 pz0Var = sz0Var.f28387b;
            if (z10) {
                i10 = pz0Var.f27524a;
            } else {
                i10 = pz0Var.f27525b;
            }
            iArr[i10] = Math.max(iArr[i10], vz0Var.f(d, z11, z10));
        }
    }

    public final la.h c(boolean z10) {
        pz0 pz0Var;
        kz0 kz0Var = new kz0(pz0.class, rz0.class);
        sz0[] sz0VarArr = (sz0[]) ((Object[]) f().f14167c);
        int length = sz0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                pz0Var = sz0VarArr[i10].f28387b;
            } else {
                pz0 pz0Var2 = sz0VarArr[i10].f28387b;
                pz0Var = new pz0(pz0Var2.f27525b, pz0Var2.f27524a);
            }
            ?? obj = new Object();
            obj.f28095a = Integer.MIN_VALUE;
            kz0Var.add(Pair.create(pz0Var, obj));
        }
        return kz0Var.i();
    }

    public final jz0[] d() {
        if (this.f26212n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f26205f == null) {
                this.f26205f = c(true);
            }
            if (!this.f26206g) {
                a(this.f26205f, true);
                this.f26206g = true;
            }
            la.h hVar = this.f26205f;
            int i10 = 0;
            while (true) {
                pz0[] pz0VarArr = (pz0[]) ((Object[]) hVar.f14167c);
                if (i10 >= pz0VarArr.length) {
                    break;
                }
                j(arrayList, pz0VarArr[i10], ((rz0[]) ((Object[]) hVar.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f26207i) {
                a(this.h, false);
                this.f26207i = true;
            }
            la.h hVar2 = this.h;
            int i11 = 0;
            while (true) {
                pz0[] pz0VarArr2 = (pz0[]) ((Object[]) hVar2.f14167c);
                if (i11 >= pz0VarArr2.length) {
                    break;
                }
                j(arrayList2, pz0VarArr2[i11], ((rz0[]) ((Object[]) hVar2.d))[i11], false);
                i11++;
            }
            if (this.f26219u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new pz0(i12, i13), new rz0(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new pz0(0, e), this.v, false);
            j(arrayList2, new pz0(e, 0), this.f26220w, false);
            jz0[] q6 = q(arrayList);
            jz0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(jz0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.f26212n = (jz0[]) objArr;
        }
        if (!this.f26213o) {
            if (this.f26205f == null) {
                this.f26205f = c(true);
            }
            if (!this.f26206g) {
                a(this.f26205f, true);
                this.f26206g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f26207i) {
                a(this.h, false);
                this.f26207i = true;
            }
            this.f26213o = true;
        }
        return this.f26212n;
    }

    public final int e() {
        return Math.max(this.f26203b, h());
    }

    public final la.h f() {
        sz0 sz0Var;
        int i10;
        int i11;
        int i12;
        sz0 sz0Var2;
        mz0 mz0Var;
        la.h hVar = this.d;
        boolean z10 = this.f26202a;
        vz0 vz0Var = this.f26221x;
        if (hVar == null) {
            kz0 kz0Var = new kz0(sz0.class, mz0.class);
            int childCount = vz0Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                qz0 qz0Var = vz0Var.d(i13).f27153a;
                if (z10) {
                    sz0Var2 = qz0Var.f27790b;
                } else {
                    sz0Var2 = qz0Var.f27789a;
                }
                switch (sz0.a(sz0Var2, z10).f24916a) {
                    case 3:
                        mz0Var = new mz0();
                        break;
                    default:
                        mz0Var = new mz0();
                        break;
                }
                kz0Var.add(Pair.create(sz0Var2, mz0Var));
            }
            this.d = kz0Var.i();
        }
        if (!this.e) {
            for (mz0 mz0Var2 : (mz0[]) ((Object[]) this.d.d)) {
                mz0Var2.c();
            }
            int childCount2 = vz0Var.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                oz0 d = vz0Var.d(i14);
                qz0 qz0Var2 = d.f27153a;
                if (z10) {
                    sz0Var = qz0Var2.f27790b;
                } else {
                    sz0Var = qz0Var2.f27789a;
                }
                if (z10) {
                    i10 = d.f27160k;
                } else {
                    i10 = d.f27161l;
                }
                int e = vz0Var.e(d, z10, false) + vz0Var.e(d, z10, true) + i10;
                float f7 = sz0Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f26218t[i14];
                }
                int i15 = e + i11;
                la.h hVar2 = this.d;
                mz0 mz0Var3 = (mz0) ((Object[]) hVar2.d)[((int[]) hVar2.f14166b)[i14]];
                int i16 = mz0Var3.f26626c;
                if (sz0Var.f28388c == vz0.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                mz0Var3.f26626c = i12 & i16;
                int a2 = sz0.a(sz0Var, z10).a(d, i15);
                mz0Var3.b(a2, i15 - a2);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] g() {
        sz0 sz0Var;
        boolean z10;
        sz0 sz0Var2;
        if (this.f26214p == null) {
            this.f26214p = new int[e() + 1];
        }
        if (!this.f26215q) {
            int[] iArr = this.f26214p;
            boolean z11 = this.f26217s;
            float f7 = 0.0f;
            boolean z12 = this.f26202a;
            vz0 vz0Var = this.f26221x;
            if (!z11) {
                int childCount = vz0Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        qz0 qz0Var = vz0Var.d(i10).f27153a;
                        if (z12) {
                            sz0Var2 = qz0Var.f27790b;
                        } else {
                            sz0Var2 = qz0Var.f27789a;
                        }
                        if (sz0Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f26216r = z10;
                this.f26217s = true;
            }
            if (!this.f26216r) {
                p(d(), iArr, true);
            } else {
                if (this.f26218t == null) {
                    this.f26218t = new int[vz0Var.getChildCount()];
                }
                Arrays.fill(this.f26218t, 0);
                p(d(), iArr, true);
                int childCount2 = (vz0Var.getChildCount() * this.v.f28095a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = vz0Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        qz0 qz0Var2 = vz0Var.d(i11).f27153a;
                        if (z12) {
                            sz0Var = qz0Var2.f27790b;
                        } else {
                            sz0Var = qz0Var2.f27789a;
                        }
                        f7 += sz0Var.d;
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
            if (!this.f26219u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f26215q = true;
        }
        return this.f26214p;
    }

    public final int h() {
        sz0 sz0Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f26204c == Integer.MIN_VALUE) {
            vz0 vz0Var = this.f26221x;
            int childCount = vz0Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                qz0 qz0Var = vz0Var.d(i12).f27153a;
                if (this.f26202a) {
                    sz0Var = qz0Var.f27790b;
                } else {
                    sz0Var = qz0Var.f27789a;
                }
                pz0 pz0Var = sz0Var.f28387b;
                int i13 = pz0Var.f27524a;
                int i14 = pz0Var.f27525b;
                i11 = Math.max(Math.max(Math.max(i11, i13), i14), i14 - pz0Var.f27524a);
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f26204c = Math.max(0, i10);
        }
        return this.f26204c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        rz0 rz0Var = this.f26220w;
        rz0 rz0Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                rz0Var2.f28095a = size;
                rz0Var.f28095a = -size;
                this.f26215q = false;
                return g()[e()];
            }
            rz0Var2.f28095a = 0;
            rz0Var.f28095a = -100000;
            this.f26215q = false;
            return g()[e()];
        }
        rz0Var2.f28095a = 0;
        rz0Var.f28095a = -size;
        this.f26215q = false;
        return g()[e()];
    }

    public final void k() {
        this.f26204c = Integer.MIN_VALUE;
        this.d = null;
        this.f26205f = null;
        this.h = null;
        this.f26208j = null;
        this.f26210l = null;
        this.f26212n = null;
        this.f26214p = null;
        this.f26218t = null;
        this.f26217s = false;
        l();
    }

    public final void l() {
        this.e = false;
        this.f26206g = false;
        this.f26207i = false;
        this.f26209k = false;
        this.f26211m = false;
        this.f26213o = false;
        this.f26215q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f26202a) {
                str = "column";
            } else {
                str = "row";
            }
            throw new IllegalArgumentException(v7.j.t(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"), ". "));
        }
        this.f26203b = i10;
    }

    public final void o(float f7, int i10) {
        sz0 sz0Var;
        Arrays.fill(this.f26218t, 0);
        vz0 vz0Var = this.f26221x;
        int childCount = vz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            qz0 qz0Var = vz0Var.d(i11).f27153a;
            if (this.f26202a) {
                sz0Var = qz0Var.f27790b;
            } else {
                sz0Var = qz0Var.f27789a;
            }
            float f10 = sz0Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f26218t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(jz0[] jz0VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < jz0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (jz0 jz0Var : jz0VarArr) {
                    z11 |= m(iArr, jz0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[jz0VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = jz0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, jz0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= jz0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    jz0 jz0Var2 = jz0VarArr[i14];
                    pz0 pz0Var = jz0Var2.f25556a;
                    if (pz0Var.f27524a >= pz0Var.f27525b) {
                        jz0Var2.f25558c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final jz0[] q(ArrayList arrayList) {
        e0.i0 i0Var = new e0.i0(this, (jz0[]) arrayList.toArray(new jz0[0]));
        int length = ((jz0[][]) i0Var.f7773c).length;
        for (int i10 = 0; i10 < length; i10++) {
            i0Var.f(i10);
        }
        return (jz0[]) i0Var.f7772b;
    }
}
