package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class dx0 {
    public final boolean f33181a;
    public h6.m d;
    public h6.m f33185f;
    public h6.m h;
    public int[] f33188j;
    public int[] f33190l;
    public bx0[] f33192n;
    public int[] f33194p;
    public boolean f33196r;
    public int[] f33198t;
    public final nx0 f33201x;
    public int f33182b = Integer.MIN_VALUE;
    public int f33183c = Integer.MIN_VALUE;
    public boolean f33184e = false;
    public boolean f33186g = false;
    public boolean f33187i = false;
    public boolean f33189k = false;
    public boolean f33191m = false;
    public boolean f33193o = false;
    public boolean f33195q = false;
    public boolean f33197s = false;
    public boolean f33199u = true;
    public final jx0 v = new jx0(0);
    public final jx0 f33200w = new jx0(-100000);

    public dx0(nx0 nx0Var, boolean z9) {
        this.f33201x = nx0Var;
        this.f33181a = z9;
    }

    public static void j(ArrayList arrayList, hx0 hx0Var, jx0 jx0Var, boolean z9) {
        if (hx0Var.a() != 0) {
            if (z9) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    if (((bx0) obj).f32443a.equals(hx0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new bx0(hx0Var, jx0Var));
        }
    }

    public static boolean m(int[] iArr, bx0 bx0Var) {
        if (bx0Var.f32445c) {
            hx0 hx0Var = bx0Var.f32443a;
            int i7 = hx0Var.f34403a;
            int i10 = hx0Var.f34404b;
            int i11 = iArr[i7] + bx0Var.f32444b.f35176a;
            if (i11 > iArr[i10]) {
                iArr[i10] = i11;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(h6.m mVar, boolean z9) {
        for (jx0 jx0Var : (jx0[]) ((Object[]) mVar.d)) {
            jx0Var.f35176a = Integer.MIN_VALUE;
        }
        ex0[] ex0VarArr = (ex0[]) ((Object[]) f().d);
        for (int i7 = 0; i7 < ex0VarArr.length; i7++) {
            int d = ex0VarArr[i7].d(z9);
            jx0 jx0Var2 = (jx0) ((Object[]) mVar.d)[((int[]) mVar.f14264b)[i7]];
            int i10 = jx0Var2.f35176a;
            if (!z9) {
                d = -d;
            }
            jx0Var2.f35176a = Math.max(i10, d);
        }
    }

    public final void b(boolean z9) {
        int[] iArr;
        kx0 kx0Var;
        int i7;
        if (z9) {
            iArr = this.f33188j;
        } else {
            iArr = this.f33190l;
        }
        nx0 nx0Var = this.f33201x;
        int childCount = nx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            gx0 d = nx0Var.d(i10);
            ix0 ix0Var = d.f34070a;
            boolean z10 = this.f33181a;
            if (z10) {
                kx0Var = ix0Var.f34878b;
            } else {
                kx0Var = ix0Var.f34877a;
            }
            hx0 hx0Var = kx0Var.f35512b;
            if (z9) {
                i7 = hx0Var.f34403a;
            } else {
                i7 = hx0Var.f34404b;
            }
            iArr[i7] = Math.max(iArr[i7], nx0Var.f(d, z10, z9));
        }
    }

    public final h6.m c(boolean z9) {
        hx0 hx0Var;
        cx0 cx0Var = new cx0(hx0.class, jx0.class);
        kx0[] kx0VarArr = (kx0[]) ((Object[]) f().f14265c);
        int length = kx0VarArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (z9) {
                hx0Var = kx0VarArr[i7].f35512b;
            } else {
                hx0 hx0Var2 = kx0VarArr[i7].f35512b;
                hx0Var = new hx0(hx0Var2.f34404b, hx0Var2.f34403a);
            }
            ?? obj = new Object();
            obj.f35176a = Integer.MIN_VALUE;
            cx0Var.add(Pair.create(hx0Var, obj));
        }
        return cx0Var.f();
    }

    public final bx0[] d() {
        if (this.f33192n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f33185f == null) {
                this.f33185f = c(true);
            }
            if (!this.f33186g) {
                a(this.f33185f, true);
                this.f33186g = true;
            }
            h6.m mVar = this.f33185f;
            int i7 = 0;
            while (true) {
                hx0[] hx0VarArr = (hx0[]) ((Object[]) mVar.f14265c);
                if (i7 >= hx0VarArr.length) {
                    break;
                }
                j(arrayList, hx0VarArr[i7], ((jx0[]) ((Object[]) mVar.d))[i7], false);
                i7++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f33187i) {
                a(this.h, false);
                this.f33187i = true;
            }
            h6.m mVar2 = this.h;
            int i10 = 0;
            while (true) {
                hx0[] hx0VarArr2 = (hx0[]) ((Object[]) mVar2.f14265c);
                if (i10 >= hx0VarArr2.length) {
                    break;
                }
                j(arrayList2, hx0VarArr2[i10], ((jx0[]) ((Object[]) mVar2.d))[i10], false);
                i10++;
            }
            if (this.f33199u) {
                int i11 = 0;
                while (i11 < e()) {
                    int i12 = i11 + 1;
                    j(arrayList, new hx0(i11, i12), new jx0(0), true);
                    i11 = i12;
                }
            }
            int e10 = e();
            j(arrayList, new hx0(0, e10), this.v, false);
            j(arrayList2, new hx0(e10, 0), this.f33200w, false);
            bx0[] q10 = q(arrayList);
            bx0[] q11 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(bx0[].class.getComponentType(), q10.length + q11.length);
            System.arraycopy(q10, 0, objArr, 0, q10.length);
            System.arraycopy(q11, 0, objArr, q10.length, q11.length);
            this.f33192n = (bx0[]) objArr;
        }
        if (!this.f33193o) {
            if (this.f33185f == null) {
                this.f33185f = c(true);
            }
            if (!this.f33186g) {
                a(this.f33185f, true);
                this.f33186g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f33187i) {
                a(this.h, false);
                this.f33187i = true;
            }
            this.f33193o = true;
        }
        return this.f33192n;
    }

    public final int e() {
        int max = Math.max(this.f33182b, h());
        if (max <= 1024) {
            return max;
        }
        nx0.g("Table grid count out of bounds");
        throw null;
    }

    public final h6.m f() {
        kx0 kx0Var;
        int i7;
        int i10;
        int i11;
        kx0 kx0Var2;
        ex0 ex0Var;
        h6.m mVar = this.d;
        boolean z9 = this.f33181a;
        nx0 nx0Var = this.f33201x;
        if (mVar == null) {
            cx0 cx0Var = new cx0(kx0.class, ex0.class);
            int childCount = nx0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                ix0 ix0Var = nx0Var.d(i12).f34070a;
                if (z9) {
                    kx0Var2 = ix0Var.f34878b;
                } else {
                    kx0Var2 = ix0Var.f34877a;
                }
                switch (kx0.a(kx0Var2, z9).f41176a) {
                    case 3:
                        ex0Var = new ex0();
                        break;
                    default:
                        ex0Var = new ex0();
                        break;
                }
                cx0Var.add(Pair.create(kx0Var2, ex0Var));
            }
            this.d = cx0Var.f();
        }
        if (!this.f33184e) {
            for (ex0 ex0Var2 : (ex0[]) ((Object[]) this.d.d)) {
                ex0Var2.c();
            }
            int childCount2 = nx0Var.getChildCount();
            for (int i13 = 0; i13 < childCount2; i13++) {
                gx0 d = nx0Var.d(i13);
                ix0 ix0Var2 = d.f34070a;
                if (z9) {
                    kx0Var = ix0Var2.f34878b;
                } else {
                    kx0Var = ix0Var2.f34877a;
                }
                if (z9) {
                    i7 = d.f34078k;
                } else {
                    i7 = d.f34079l;
                }
                int e10 = nx0Var.e(d, z9, false) + nx0Var.e(d, z9, true) + i7;
                float f10 = kx0Var.d;
                if (f10 == 0.0f) {
                    i10 = 0;
                } else {
                    i10 = this.f33198t[i13];
                }
                int i14 = e10 + i10;
                h6.m mVar2 = this.d;
                ex0 ex0Var3 = (ex0) ((Object[]) mVar2.d)[((int[]) mVar2.f14264b)[i13]];
                int i15 = ex0Var3.f33518c;
                if (kx0Var.f35513c == nx0.S && f10 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                ex0Var3.f33518c = i11 & i15;
                int a10 = kx0.a(kx0Var, z9).a(d, i14);
                ex0Var3.b(a10, i14 - a10);
            }
            this.f33184e = true;
        }
        return this.d;
    }

    public final int[] g() {
        kx0 kx0Var;
        boolean z9;
        kx0 kx0Var2;
        if (this.f33194p == null) {
            this.f33194p = new int[e() + 1];
        }
        if (!this.f33195q) {
            int[] iArr = this.f33194p;
            boolean z10 = this.f33197s;
            float f10 = 0.0f;
            boolean z11 = this.f33181a;
            nx0 nx0Var = this.f33201x;
            if (!z10) {
                int childCount = nx0Var.getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 < childCount) {
                        ix0 ix0Var = nx0Var.d(i7).f34070a;
                        if (z11) {
                            kx0Var2 = ix0Var.f34878b;
                        } else {
                            kx0Var2 = ix0Var.f34877a;
                        }
                        if (kx0Var2.d != 0.0f) {
                            z9 = true;
                            break;
                        }
                        i7++;
                    } else {
                        z9 = false;
                        break;
                    }
                }
                this.f33196r = z9;
                this.f33197s = true;
            }
            if (!this.f33196r) {
                p(d(), iArr, true);
            } else {
                if (this.f33198t == null) {
                    this.f33198t = new int[nx0Var.getChildCount()];
                }
                Arrays.fill(this.f33198t, 0);
                p(d(), iArr, true);
                int childCount2 = (nx0Var.getChildCount() * this.v.f35176a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = nx0Var.getChildCount();
                    for (int i10 = 0; i10 < childCount3; i10++) {
                        ix0 ix0Var2 = nx0Var.d(i10).f34070a;
                        if (z11) {
                            kx0Var = ix0Var2.f34878b;
                        } else {
                            kx0Var = ix0Var2.f34877a;
                        }
                        f10 += kx0Var.d;
                    }
                    int i11 = -1;
                    boolean z12 = true;
                    int i12 = 0;
                    while (i12 < childCount2) {
                        int i13 = (int) ((i12 + childCount2) / 2);
                        l();
                        o(f10, i13);
                        boolean p10 = p(d(), iArr, false);
                        if (p10) {
                            i12 = i13 + 1;
                            i11 = i13;
                        } else {
                            childCount2 = i13;
                        }
                        z12 = p10;
                    }
                    if (i11 > 0 && !z12) {
                        l();
                        o(f10, i11);
                        p(d(), iArr, true);
                    }
                }
            }
            if (!this.f33199u) {
                int i14 = iArr[0];
                int length = iArr.length;
                for (int i15 = 0; i15 < length; i15++) {
                    iArr[i15] = iArr[i15] - i14;
                }
            }
            this.f33195q = true;
        }
        return this.f33194p;
    }

    public final int h() {
        kx0 kx0Var;
        int i7 = Integer.MIN_VALUE;
        if (this.f33183c == Integer.MIN_VALUE) {
            nx0 nx0Var = this.f33201x;
            int childCount = nx0Var.getChildCount();
            int i10 = -1;
            for (int i11 = 0; i11 < childCount; i11++) {
                ix0 ix0Var = nx0Var.d(i11).f34070a;
                if (this.f33181a) {
                    kx0Var = ix0Var.f34878b;
                } else {
                    kx0Var = ix0Var.f34877a;
                }
                hx0 hx0Var = kx0Var.f35512b;
                i10 = Math.max(Math.max(Math.max(i10, hx0Var.f34403a), hx0Var.f34404b), hx0Var.a());
            }
            if (i10 != -1) {
                i7 = i10;
            }
            this.f33183c = Math.max(0, i7);
        }
        return this.f33183c;
    }

    public final int i(int i7) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        jx0 jx0Var = this.f33200w;
        jx0 jx0Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                jx0Var2.f35176a = size;
                jx0Var.f35176a = -size;
                this.f33195q = false;
                return g()[e()];
            }
            jx0Var2.f35176a = 0;
            jx0Var.f35176a = -100000;
            this.f33195q = false;
            return g()[e()];
        }
        jx0Var2.f35176a = 0;
        jx0Var.f35176a = -size;
        this.f33195q = false;
        return g()[e()];
    }

    public final void k() {
        this.f33183c = Integer.MIN_VALUE;
        this.d = null;
        this.f33185f = null;
        this.h = null;
        this.f33188j = null;
        this.f33190l = null;
        this.f33192n = null;
        this.f33194p = null;
        this.f33198t = null;
        this.f33197s = false;
        l();
    }

    public final void l() {
        this.f33184e = false;
        this.f33186g = false;
        this.f33187i = false;
        this.f33189k = false;
        this.f33191m = false;
        this.f33193o = false;
        this.f33195q = false;
    }

    public final void n(int i7) {
        String str;
        if (i7 != Integer.MIN_VALUE && i7 < h()) {
            if (this.f33181a) {
                str = "column";
            } else {
                str = "row";
            }
            nx0.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.f33182b = i7;
    }

    public final void o(float f10, int i7) {
        kx0 kx0Var;
        Arrays.fill(this.f33198t, 0);
        nx0 nx0Var = this.f33201x;
        int childCount = nx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ix0 ix0Var = nx0Var.d(i10).f34070a;
            if (this.f33181a) {
                kx0Var = ix0Var.f34878b;
            } else {
                kx0Var = ix0Var.f34877a;
            }
            float f11 = kx0Var.d;
            if (f11 != 0.0f) {
                int round = Math.round((i7 * f11) / f10);
                this.f33198t[i10] = round;
                i7 -= round;
                f10 -= f11;
            }
        }
    }

    public final boolean p(bx0[] bx0VarArr, int[] iArr, boolean z9) {
        int e10 = e() + 1;
        loop0: for (int i7 = 0; i7 < bx0VarArr.length; i7++) {
            Arrays.fill(iArr, 0);
            for (int i10 = 0; i10 < e10; i10++) {
                boolean z10 = false;
                for (bx0 bx0Var : bx0VarArr) {
                    z10 |= m(iArr, bx0Var);
                }
                if (!z10) {
                    break loop0;
                }
            }
            if (!z9) {
                return false;
            }
            boolean[] zArr = new boolean[bx0VarArr.length];
            for (int i11 = 0; i11 < e10; i11++) {
                int length = bx0VarArr.length;
                for (int i12 = 0; i12 < length; i12++) {
                    zArr[i12] = zArr[i12] | m(iArr, bx0VarArr[i12]);
                }
            }
            int i13 = 0;
            while (true) {
                if (i13 >= bx0VarArr.length) {
                    break;
                }
                if (zArr[i13]) {
                    bx0 bx0Var2 = bx0VarArr[i13];
                    hx0 hx0Var = bx0Var2.f32443a;
                    if (hx0Var.f34403a >= hx0Var.f34404b) {
                        bx0Var2.f32445c = false;
                        break;
                    }
                }
                i13++;
            }
        }
        return true;
    }

    public final bx0[] q(ArrayList arrayList) {
        a4.k kVar = new a4.k(this, (bx0[]) arrayList.toArray(new bx0[0]));
        int length = ((bx0[][]) kVar.d).length;
        for (int i7 = 0; i7 < length; i7++) {
            kVar.x(i7);
        }
        return (bx0[]) kVar.f192c;
    }
}
