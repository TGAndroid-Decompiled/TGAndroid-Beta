package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class cx0 {
    public final boolean f32681a;
    public h6.m d;
    public h6.m f32685f;
    public h6.m h;
    public int[] f32688j;
    public int[] f32690l;
    public ax0[] f32692n;
    public int[] f32694p;
    public boolean f32696r;
    public int[] f32698t;
    public final mx0 f32701x;
    public int f32682b = Integer.MIN_VALUE;
    public int f32683c = Integer.MIN_VALUE;
    public boolean f32684e = false;
    public boolean f32686g = false;
    public boolean f32687i = false;
    public boolean f32689k = false;
    public boolean f32691m = false;
    public boolean f32693o = false;
    public boolean f32695q = false;
    public boolean f32697s = false;
    public boolean f32699u = true;
    public final ix0 v = new ix0(0);
    public final ix0 f32700w = new ix0(-100000);

    public cx0(mx0 mx0Var, boolean z9) {
        this.f32701x = mx0Var;
        this.f32681a = z9;
    }

    public static void j(ArrayList arrayList, gx0 gx0Var, ix0 ix0Var, boolean z9) {
        if (gx0Var.a() != 0) {
            if (z9) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    if (((ax0) obj).f31938a.equals(gx0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new ax0(gx0Var, ix0Var));
        }
    }

    public static boolean m(int[] iArr, ax0 ax0Var) {
        if (ax0Var.f31940c) {
            gx0 gx0Var = ax0Var.f31938a;
            int i7 = gx0Var.f34020a;
            int i10 = gx0Var.f34021b;
            int i11 = iArr[i7] + ax0Var.f31939b.f34809a;
            if (i11 > iArr[i10]) {
                iArr[i10] = i11;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(h6.m mVar, boolean z9) {
        for (ix0 ix0Var : (ix0[]) ((Object[]) mVar.d)) {
            ix0Var.f34809a = Integer.MIN_VALUE;
        }
        dx0[] dx0VarArr = (dx0[]) ((Object[]) f().d);
        for (int i7 = 0; i7 < dx0VarArr.length; i7++) {
            int d = dx0VarArr[i7].d(z9);
            ix0 ix0Var2 = (ix0) ((Object[]) mVar.d)[((int[]) mVar.f14264b)[i7]];
            int i10 = ix0Var2.f34809a;
            if (!z9) {
                d = -d;
            }
            ix0Var2.f34809a = Math.max(i10, d);
        }
    }

    public final void b(boolean z9) {
        int[] iArr;
        jx0 jx0Var;
        int i7;
        if (z9) {
            iArr = this.f32688j;
        } else {
            iArr = this.f32690l;
        }
        mx0 mx0Var = this.f32701x;
        int childCount = mx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            fx0 d = mx0Var.d(i10);
            hx0 hx0Var = d.f33663a;
            boolean z10 = this.f32681a;
            if (z10) {
                jx0Var = hx0Var.f34438b;
            } else {
                jx0Var = hx0Var.f34437a;
            }
            gx0 gx0Var = jx0Var.f35103b;
            if (z9) {
                i7 = gx0Var.f34020a;
            } else {
                i7 = gx0Var.f34021b;
            }
            iArr[i7] = Math.max(iArr[i7], mx0Var.f(d, z10, z9));
        }
    }

    public final h6.m c(boolean z9) {
        gx0 gx0Var;
        bx0 bx0Var = new bx0(gx0.class, ix0.class);
        jx0[] jx0VarArr = (jx0[]) ((Object[]) f().f14265c);
        int length = jx0VarArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (z9) {
                gx0Var = jx0VarArr[i7].f35103b;
            } else {
                gx0 gx0Var2 = jx0VarArr[i7].f35103b;
                gx0Var = new gx0(gx0Var2.f34021b, gx0Var2.f34020a);
            }
            ?? obj = new Object();
            obj.f34809a = Integer.MIN_VALUE;
            bx0Var.add(Pair.create(gx0Var, obj));
        }
        return bx0Var.f();
    }

    public final ax0[] d() {
        if (this.f32692n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f32685f == null) {
                this.f32685f = c(true);
            }
            if (!this.f32686g) {
                a(this.f32685f, true);
                this.f32686g = true;
            }
            h6.m mVar = this.f32685f;
            int i7 = 0;
            while (true) {
                gx0[] gx0VarArr = (gx0[]) ((Object[]) mVar.f14265c);
                if (i7 >= gx0VarArr.length) {
                    break;
                }
                j(arrayList, gx0VarArr[i7], ((ix0[]) ((Object[]) mVar.d))[i7], false);
                i7++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f32687i) {
                a(this.h, false);
                this.f32687i = true;
            }
            h6.m mVar2 = this.h;
            int i10 = 0;
            while (true) {
                gx0[] gx0VarArr2 = (gx0[]) ((Object[]) mVar2.f14265c);
                if (i10 >= gx0VarArr2.length) {
                    break;
                }
                j(arrayList2, gx0VarArr2[i10], ((ix0[]) ((Object[]) mVar2.d))[i10], false);
                i10++;
            }
            if (this.f32699u) {
                int i11 = 0;
                while (i11 < e()) {
                    int i12 = i11 + 1;
                    j(arrayList, new gx0(i11, i12), new ix0(0), true);
                    i11 = i12;
                }
            }
            int e10 = e();
            j(arrayList, new gx0(0, e10), this.v, false);
            j(arrayList2, new gx0(e10, 0), this.f32700w, false);
            ax0[] q10 = q(arrayList);
            ax0[] q11 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(ax0[].class.getComponentType(), q10.length + q11.length);
            System.arraycopy(q10, 0, objArr, 0, q10.length);
            System.arraycopy(q11, 0, objArr, q10.length, q11.length);
            this.f32692n = (ax0[]) objArr;
        }
        if (!this.f32693o) {
            if (this.f32685f == null) {
                this.f32685f = c(true);
            }
            if (!this.f32686g) {
                a(this.f32685f, true);
                this.f32686g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f32687i) {
                a(this.h, false);
                this.f32687i = true;
            }
            this.f32693o = true;
        }
        return this.f32692n;
    }

    public final int e() {
        int max = Math.max(this.f32682b, h());
        if (max <= 1024) {
            return max;
        }
        mx0.g("Table grid count out of bounds");
        throw null;
    }

    public final h6.m f() {
        jx0 jx0Var;
        int i7;
        int i10;
        int i11;
        jx0 jx0Var2;
        dx0 dx0Var;
        h6.m mVar = this.d;
        boolean z9 = this.f32681a;
        mx0 mx0Var = this.f32701x;
        if (mVar == null) {
            bx0 bx0Var = new bx0(jx0.class, dx0.class);
            int childCount = mx0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                hx0 hx0Var = mx0Var.d(i12).f33663a;
                if (z9) {
                    jx0Var2 = hx0Var.f34438b;
                } else {
                    jx0Var2 = hx0Var.f34437a;
                }
                switch (jx0.a(jx0Var2, z9).f40784a) {
                    case 3:
                        dx0Var = new dx0();
                        break;
                    default:
                        dx0Var = new dx0();
                        break;
                }
                bx0Var.add(Pair.create(jx0Var2, dx0Var));
            }
            this.d = bx0Var.f();
        }
        if (!this.f32684e) {
            for (dx0 dx0Var2 : (dx0[]) ((Object[]) this.d.d)) {
                dx0Var2.c();
            }
            int childCount2 = mx0Var.getChildCount();
            for (int i13 = 0; i13 < childCount2; i13++) {
                fx0 d = mx0Var.d(i13);
                hx0 hx0Var2 = d.f33663a;
                if (z9) {
                    jx0Var = hx0Var2.f34438b;
                } else {
                    jx0Var = hx0Var2.f34437a;
                }
                if (z9) {
                    i7 = d.f33671k;
                } else {
                    i7 = d.f33672l;
                }
                int e10 = mx0Var.e(d, z9, false) + mx0Var.e(d, z9, true) + i7;
                float f10 = jx0Var.d;
                if (f10 == 0.0f) {
                    i10 = 0;
                } else {
                    i10 = this.f32698t[i13];
                }
                int i14 = e10 + i10;
                h6.m mVar2 = this.d;
                dx0 dx0Var3 = (dx0) ((Object[]) mVar2.d)[((int[]) mVar2.f14264b)[i13]];
                int i15 = dx0Var3.f33091c;
                if (jx0Var.f35104c == mx0.S && f10 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                dx0Var3.f33091c = i11 & i15;
                int a10 = jx0.a(jx0Var, z9).a(d, i14);
                dx0Var3.b(a10, i14 - a10);
            }
            this.f32684e = true;
        }
        return this.d;
    }

    public final int[] g() {
        jx0 jx0Var;
        boolean z9;
        jx0 jx0Var2;
        if (this.f32694p == null) {
            this.f32694p = new int[e() + 1];
        }
        if (!this.f32695q) {
            int[] iArr = this.f32694p;
            boolean z10 = this.f32697s;
            float f10 = 0.0f;
            boolean z11 = this.f32681a;
            mx0 mx0Var = this.f32701x;
            if (!z10) {
                int childCount = mx0Var.getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 < childCount) {
                        hx0 hx0Var = mx0Var.d(i7).f33663a;
                        if (z11) {
                            jx0Var2 = hx0Var.f34438b;
                        } else {
                            jx0Var2 = hx0Var.f34437a;
                        }
                        if (jx0Var2.d != 0.0f) {
                            z9 = true;
                            break;
                        }
                        i7++;
                    } else {
                        z9 = false;
                        break;
                    }
                }
                this.f32696r = z9;
                this.f32697s = true;
            }
            if (!this.f32696r) {
                p(d(), iArr, true);
            } else {
                if (this.f32698t == null) {
                    this.f32698t = new int[mx0Var.getChildCount()];
                }
                Arrays.fill(this.f32698t, 0);
                p(d(), iArr, true);
                int childCount2 = (mx0Var.getChildCount() * this.v.f34809a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = mx0Var.getChildCount();
                    for (int i10 = 0; i10 < childCount3; i10++) {
                        hx0 hx0Var2 = mx0Var.d(i10).f33663a;
                        if (z11) {
                            jx0Var = hx0Var2.f34438b;
                        } else {
                            jx0Var = hx0Var2.f34437a;
                        }
                        f10 += jx0Var.d;
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
            if (!this.f32699u) {
                int i14 = iArr[0];
                int length = iArr.length;
                for (int i15 = 0; i15 < length; i15++) {
                    iArr[i15] = iArr[i15] - i14;
                }
            }
            this.f32695q = true;
        }
        return this.f32694p;
    }

    public final int h() {
        jx0 jx0Var;
        int i7 = Integer.MIN_VALUE;
        if (this.f32683c == Integer.MIN_VALUE) {
            mx0 mx0Var = this.f32701x;
            int childCount = mx0Var.getChildCount();
            int i10 = -1;
            for (int i11 = 0; i11 < childCount; i11++) {
                hx0 hx0Var = mx0Var.d(i11).f33663a;
                if (this.f32681a) {
                    jx0Var = hx0Var.f34438b;
                } else {
                    jx0Var = hx0Var.f34437a;
                }
                gx0 gx0Var = jx0Var.f35103b;
                i10 = Math.max(Math.max(Math.max(i10, gx0Var.f34020a), gx0Var.f34021b), gx0Var.a());
            }
            if (i10 != -1) {
                i7 = i10;
            }
            this.f32683c = Math.max(0, i7);
        }
        return this.f32683c;
    }

    public final int i(int i7) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        ix0 ix0Var = this.f32700w;
        ix0 ix0Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                ix0Var2.f34809a = size;
                ix0Var.f34809a = -size;
                this.f32695q = false;
                return g()[e()];
            }
            ix0Var2.f34809a = 0;
            ix0Var.f34809a = -100000;
            this.f32695q = false;
            return g()[e()];
        }
        ix0Var2.f34809a = 0;
        ix0Var.f34809a = -size;
        this.f32695q = false;
        return g()[e()];
    }

    public final void k() {
        this.f32683c = Integer.MIN_VALUE;
        this.d = null;
        this.f32685f = null;
        this.h = null;
        this.f32688j = null;
        this.f32690l = null;
        this.f32692n = null;
        this.f32694p = null;
        this.f32698t = null;
        this.f32697s = false;
        l();
    }

    public final void l() {
        this.f32684e = false;
        this.f32686g = false;
        this.f32687i = false;
        this.f32689k = false;
        this.f32691m = false;
        this.f32693o = false;
        this.f32695q = false;
    }

    public final void n(int i7) {
        String str;
        if (i7 != Integer.MIN_VALUE && i7 < h()) {
            if (this.f32681a) {
                str = "column";
            } else {
                str = "row";
            }
            mx0.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.f32682b = i7;
    }

    public final void o(float f10, int i7) {
        jx0 jx0Var;
        Arrays.fill(this.f32698t, 0);
        mx0 mx0Var = this.f32701x;
        int childCount = mx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            hx0 hx0Var = mx0Var.d(i10).f33663a;
            if (this.f32681a) {
                jx0Var = hx0Var.f34438b;
            } else {
                jx0Var = hx0Var.f34437a;
            }
            float f11 = jx0Var.d;
            if (f11 != 0.0f) {
                int round = Math.round((i7 * f11) / f10);
                this.f32698t[i10] = round;
                i7 -= round;
                f10 -= f11;
            }
        }
    }

    public final boolean p(ax0[] ax0VarArr, int[] iArr, boolean z9) {
        int e10 = e() + 1;
        loop0: for (int i7 = 0; i7 < ax0VarArr.length; i7++) {
            Arrays.fill(iArr, 0);
            for (int i10 = 0; i10 < e10; i10++) {
                boolean z10 = false;
                for (ax0 ax0Var : ax0VarArr) {
                    z10 |= m(iArr, ax0Var);
                }
                if (!z10) {
                    break loop0;
                }
            }
            if (!z9) {
                return false;
            }
            boolean[] zArr = new boolean[ax0VarArr.length];
            for (int i11 = 0; i11 < e10; i11++) {
                int length = ax0VarArr.length;
                for (int i12 = 0; i12 < length; i12++) {
                    zArr[i12] = zArr[i12] | m(iArr, ax0VarArr[i12]);
                }
            }
            int i13 = 0;
            while (true) {
                if (i13 >= ax0VarArr.length) {
                    break;
                }
                if (zArr[i13]) {
                    ax0 ax0Var2 = ax0VarArr[i13];
                    gx0 gx0Var = ax0Var2.f31938a;
                    if (gx0Var.f34020a >= gx0Var.f34021b) {
                        ax0Var2.f31940c = false;
                        break;
                    }
                }
                i13++;
            }
        }
        return true;
    }

    public final ax0[] q(ArrayList arrayList) {
        a4.k kVar = new a4.k(this, (ax0[]) arrayList.toArray(new ax0[0]));
        int length = ((ax0[][]) kVar.d).length;
        for (int i7 = 0; i7 < length; i7++) {
            kVar.x(i7);
        }
        return (ax0[]) kVar.f192c;
    }
}
