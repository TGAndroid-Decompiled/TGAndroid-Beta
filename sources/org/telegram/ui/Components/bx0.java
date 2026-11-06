package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class bx0 {
    public final boolean f32303a;
    public h6.m d;
    public h6.m f32307f;
    public h6.m h;
    public int[] f32310j;
    public int[] f32312l;
    public zw0[] f32314n;
    public int[] f32316p;
    public boolean f32318r;
    public int[] f32320t;
    public final lx0 f32323x;
    public int f32304b = Integer.MIN_VALUE;
    public int f32305c = Integer.MIN_VALUE;
    public boolean f32306e = false;
    public boolean f32308g = false;
    public boolean f32309i = false;
    public boolean f32311k = false;
    public boolean f32313m = false;
    public boolean f32315o = false;
    public boolean f32317q = false;
    public boolean f32319s = false;
    public boolean f32321u = true;
    public final hx0 v = new hx0(0);
    public final hx0 f32322w = new hx0(-100000);

    public bx0(lx0 lx0Var, boolean z9) {
        this.f32323x = lx0Var;
        this.f32303a = z9;
    }

    public static void j(ArrayList arrayList, fx0 fx0Var, hx0 hx0Var, boolean z9) {
        if (fx0Var.a() != 0) {
            if (z9) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    if (((zw0) obj).f41123a.equals(fx0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new zw0(fx0Var, hx0Var));
        }
    }

    public static boolean m(int[] iArr, zw0 zw0Var) {
        if (zw0Var.f41125c) {
            fx0 fx0Var = zw0Var.f41123a;
            int i7 = fx0Var.f33653a;
            int i10 = fx0Var.f33654b;
            int i11 = iArr[i7] + zw0Var.f41124b.f34399a;
            if (i11 > iArr[i10]) {
                iArr[i10] = i11;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(h6.m mVar, boolean z9) {
        for (hx0 hx0Var : (hx0[]) ((Object[]) mVar.d)) {
            hx0Var.f34399a = Integer.MIN_VALUE;
        }
        cx0[] cx0VarArr = (cx0[]) ((Object[]) f().d);
        for (int i7 = 0; i7 < cx0VarArr.length; i7++) {
            int d = cx0VarArr[i7].d(z9);
            hx0 hx0Var2 = (hx0) ((Object[]) mVar.d)[((int[]) mVar.f14264b)[i7]];
            int i10 = hx0Var2.f34399a;
            if (!z9) {
                d = -d;
            }
            hx0Var2.f34399a = Math.max(i10, d);
        }
    }

    public final void b(boolean z9) {
        int[] iArr;
        ix0 ix0Var;
        int i7;
        if (z9) {
            iArr = this.f32310j;
        } else {
            iArr = this.f32312l;
        }
        lx0 lx0Var = this.f32323x;
        int childCount = lx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ex0 d = lx0Var.d(i10);
            gx0 gx0Var = d.f33346a;
            boolean z10 = this.f32303a;
            if (z10) {
                ix0Var = gx0Var.f34013b;
            } else {
                ix0Var = gx0Var.f34012a;
            }
            fx0 fx0Var = ix0Var.f34781b;
            if (z9) {
                i7 = fx0Var.f33653a;
            } else {
                i7 = fx0Var.f33654b;
            }
            iArr[i7] = Math.max(iArr[i7], lx0Var.f(d, z10, z9));
        }
    }

    public final h6.m c(boolean z9) {
        fx0 fx0Var;
        ax0 ax0Var = new ax0(fx0.class, hx0.class);
        ix0[] ix0VarArr = (ix0[]) ((Object[]) f().f14265c);
        int length = ix0VarArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (z9) {
                fx0Var = ix0VarArr[i7].f34781b;
            } else {
                fx0 fx0Var2 = ix0VarArr[i7].f34781b;
                fx0Var = new fx0(fx0Var2.f33654b, fx0Var2.f33653a);
            }
            ?? obj = new Object();
            obj.f34399a = Integer.MIN_VALUE;
            ax0Var.add(Pair.create(fx0Var, obj));
        }
        return ax0Var.f();
    }

    public final zw0[] d() {
        if (this.f32314n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f32307f == null) {
                this.f32307f = c(true);
            }
            if (!this.f32308g) {
                a(this.f32307f, true);
                this.f32308g = true;
            }
            h6.m mVar = this.f32307f;
            int i7 = 0;
            while (true) {
                fx0[] fx0VarArr = (fx0[]) ((Object[]) mVar.f14265c);
                if (i7 >= fx0VarArr.length) {
                    break;
                }
                j(arrayList, fx0VarArr[i7], ((hx0[]) ((Object[]) mVar.d))[i7], false);
                i7++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f32309i) {
                a(this.h, false);
                this.f32309i = true;
            }
            h6.m mVar2 = this.h;
            int i10 = 0;
            while (true) {
                fx0[] fx0VarArr2 = (fx0[]) ((Object[]) mVar2.f14265c);
                if (i10 >= fx0VarArr2.length) {
                    break;
                }
                j(arrayList2, fx0VarArr2[i10], ((hx0[]) ((Object[]) mVar2.d))[i10], false);
                i10++;
            }
            if (this.f32321u) {
                int i11 = 0;
                while (i11 < e()) {
                    int i12 = i11 + 1;
                    j(arrayList, new fx0(i11, i12), new hx0(0), true);
                    i11 = i12;
                }
            }
            int e10 = e();
            j(arrayList, new fx0(0, e10), this.v, false);
            j(arrayList2, new fx0(e10, 0), this.f32322w, false);
            zw0[] q10 = q(arrayList);
            zw0[] q11 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(zw0[].class.getComponentType(), q10.length + q11.length);
            System.arraycopy(q10, 0, objArr, 0, q10.length);
            System.arraycopy(q11, 0, objArr, q10.length, q11.length);
            this.f32314n = (zw0[]) objArr;
        }
        if (!this.f32315o) {
            if (this.f32307f == null) {
                this.f32307f = c(true);
            }
            if (!this.f32308g) {
                a(this.f32307f, true);
                this.f32308g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f32309i) {
                a(this.h, false);
                this.f32309i = true;
            }
            this.f32315o = true;
        }
        return this.f32314n;
    }

    public final int e() {
        int max = Math.max(this.f32304b, h());
        if (max <= 1024) {
            return max;
        }
        lx0.g("Table grid count out of bounds");
        throw null;
    }

    public final h6.m f() {
        ix0 ix0Var;
        int i7;
        int i10;
        int i11;
        ix0 ix0Var2;
        cx0 cx0Var;
        h6.m mVar = this.d;
        boolean z9 = this.f32303a;
        lx0 lx0Var = this.f32323x;
        if (mVar == null) {
            ax0 ax0Var = new ax0(ix0.class, cx0.class);
            int childCount = lx0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                gx0 gx0Var = lx0Var.d(i12).f33346a;
                if (z9) {
                    ix0Var2 = gx0Var.f34013b;
                } else {
                    ix0Var2 = gx0Var.f34012a;
                }
                switch (ix0.a(ix0Var2, z9).f40452a) {
                    case 3:
                        cx0Var = new cx0();
                        break;
                    default:
                        cx0Var = new cx0();
                        break;
                }
                ax0Var.add(Pair.create(ix0Var2, cx0Var));
            }
            this.d = ax0Var.f();
        }
        if (!this.f32306e) {
            for (cx0 cx0Var2 : (cx0[]) ((Object[]) this.d.d)) {
                cx0Var2.c();
            }
            int childCount2 = lx0Var.getChildCount();
            for (int i13 = 0; i13 < childCount2; i13++) {
                ex0 d = lx0Var.d(i13);
                gx0 gx0Var2 = d.f33346a;
                if (z9) {
                    ix0Var = gx0Var2.f34013b;
                } else {
                    ix0Var = gx0Var2.f34012a;
                }
                if (z9) {
                    i7 = d.f33354k;
                } else {
                    i7 = d.f33355l;
                }
                int e10 = lx0Var.e(d, z9, false) + lx0Var.e(d, z9, true) + i7;
                float f10 = ix0Var.d;
                if (f10 == 0.0f) {
                    i10 = 0;
                } else {
                    i10 = this.f32320t[i13];
                }
                int i14 = e10 + i10;
                h6.m mVar2 = this.d;
                cx0 cx0Var3 = (cx0) ((Object[]) mVar2.d)[((int[]) mVar2.f14264b)[i13]];
                int i15 = cx0Var3.f32696c;
                if (ix0Var.f34782c == lx0.R && f10 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                cx0Var3.f32696c = i11 & i15;
                int a10 = ix0.a(ix0Var, z9).a(d, i14);
                cx0Var3.b(a10, i14 - a10);
            }
            this.f32306e = true;
        }
        return this.d;
    }

    public final int[] g() {
        ix0 ix0Var;
        boolean z9;
        ix0 ix0Var2;
        if (this.f32316p == null) {
            this.f32316p = new int[e() + 1];
        }
        if (!this.f32317q) {
            int[] iArr = this.f32316p;
            boolean z10 = this.f32319s;
            float f10 = 0.0f;
            boolean z11 = this.f32303a;
            lx0 lx0Var = this.f32323x;
            if (!z10) {
                int childCount = lx0Var.getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 < childCount) {
                        gx0 gx0Var = lx0Var.d(i7).f33346a;
                        if (z11) {
                            ix0Var2 = gx0Var.f34013b;
                        } else {
                            ix0Var2 = gx0Var.f34012a;
                        }
                        if (ix0Var2.d != 0.0f) {
                            z9 = true;
                            break;
                        }
                        i7++;
                    } else {
                        z9 = false;
                        break;
                    }
                }
                this.f32318r = z9;
                this.f32319s = true;
            }
            if (!this.f32318r) {
                p(d(), iArr, true);
            } else {
                if (this.f32320t == null) {
                    this.f32320t = new int[lx0Var.getChildCount()];
                }
                Arrays.fill(this.f32320t, 0);
                p(d(), iArr, true);
                int childCount2 = (lx0Var.getChildCount() * this.v.f34399a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = lx0Var.getChildCount();
                    for (int i10 = 0; i10 < childCount3; i10++) {
                        gx0 gx0Var2 = lx0Var.d(i10).f33346a;
                        if (z11) {
                            ix0Var = gx0Var2.f34013b;
                        } else {
                            ix0Var = gx0Var2.f34012a;
                        }
                        f10 += ix0Var.d;
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
            if (!this.f32321u) {
                int i14 = iArr[0];
                int length = iArr.length;
                for (int i15 = 0; i15 < length; i15++) {
                    iArr[i15] = iArr[i15] - i14;
                }
            }
            this.f32317q = true;
        }
        return this.f32316p;
    }

    public final int h() {
        ix0 ix0Var;
        int i7 = Integer.MIN_VALUE;
        if (this.f32305c == Integer.MIN_VALUE) {
            lx0 lx0Var = this.f32323x;
            int childCount = lx0Var.getChildCount();
            int i10 = -1;
            for (int i11 = 0; i11 < childCount; i11++) {
                gx0 gx0Var = lx0Var.d(i11).f33346a;
                if (this.f32303a) {
                    ix0Var = gx0Var.f34013b;
                } else {
                    ix0Var = gx0Var.f34012a;
                }
                fx0 fx0Var = ix0Var.f34781b;
                i10 = Math.max(Math.max(Math.max(i10, fx0Var.f33653a), fx0Var.f33654b), fx0Var.a());
            }
            if (i10 != -1) {
                i7 = i10;
            }
            this.f32305c = Math.max(0, i7);
        }
        return this.f32305c;
    }

    public final int i(int i7) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        hx0 hx0Var = this.f32322w;
        hx0 hx0Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                hx0Var2.f34399a = size;
                hx0Var.f34399a = -size;
                this.f32317q = false;
                return g()[e()];
            }
            hx0Var2.f34399a = 0;
            hx0Var.f34399a = -100000;
            this.f32317q = false;
            return g()[e()];
        }
        hx0Var2.f34399a = 0;
        hx0Var.f34399a = -size;
        this.f32317q = false;
        return g()[e()];
    }

    public final void k() {
        this.f32305c = Integer.MIN_VALUE;
        this.d = null;
        this.f32307f = null;
        this.h = null;
        this.f32310j = null;
        this.f32312l = null;
        this.f32314n = null;
        this.f32316p = null;
        this.f32320t = null;
        this.f32319s = false;
        l();
    }

    public final void l() {
        this.f32306e = false;
        this.f32308g = false;
        this.f32309i = false;
        this.f32311k = false;
        this.f32313m = false;
        this.f32315o = false;
        this.f32317q = false;
    }

    public final void n(int i7) {
        String str;
        if (i7 != Integer.MIN_VALUE && i7 < h()) {
            if (this.f32303a) {
                str = "column";
            } else {
                str = "row";
            }
            lx0.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.f32304b = i7;
    }

    public final void o(float f10, int i7) {
        ix0 ix0Var;
        Arrays.fill(this.f32320t, 0);
        lx0 lx0Var = this.f32323x;
        int childCount = lx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            gx0 gx0Var = lx0Var.d(i10).f33346a;
            if (this.f32303a) {
                ix0Var = gx0Var.f34013b;
            } else {
                ix0Var = gx0Var.f34012a;
            }
            float f11 = ix0Var.d;
            if (f11 != 0.0f) {
                int round = Math.round((i7 * f11) / f10);
                this.f32320t[i10] = round;
                i7 -= round;
                f10 -= f11;
            }
        }
    }

    public final boolean p(zw0[] zw0VarArr, int[] iArr, boolean z9) {
        int e10 = e() + 1;
        loop0: for (int i7 = 0; i7 < zw0VarArr.length; i7++) {
            Arrays.fill(iArr, 0);
            for (int i10 = 0; i10 < e10; i10++) {
                boolean z10 = false;
                for (zw0 zw0Var : zw0VarArr) {
                    z10 |= m(iArr, zw0Var);
                }
                if (!z10) {
                    break loop0;
                }
            }
            if (!z9) {
                return false;
            }
            boolean[] zArr = new boolean[zw0VarArr.length];
            for (int i11 = 0; i11 < e10; i11++) {
                int length = zw0VarArr.length;
                for (int i12 = 0; i12 < length; i12++) {
                    zArr[i12] = zArr[i12] | m(iArr, zw0VarArr[i12]);
                }
            }
            int i13 = 0;
            while (true) {
                if (i13 >= zw0VarArr.length) {
                    break;
                }
                if (zArr[i13]) {
                    zw0 zw0Var2 = zw0VarArr[i13];
                    fx0 fx0Var = zw0Var2.f41123a;
                    if (fx0Var.f33653a >= fx0Var.f33654b) {
                        zw0Var2.f41125c = false;
                        break;
                    }
                }
                i13++;
            }
        }
        return true;
    }

    public final zw0[] q(ArrayList arrayList) {
        a4.k kVar = new a4.k(this, (zw0[]) arrayList.toArray(new zw0[0]));
        int length = ((zw0[][]) kVar.d).length;
        for (int i7 = 0; i7 < length; i7++) {
            kVar.x(i7);
        }
        return (zw0[]) kVar.f192c;
    }
}
