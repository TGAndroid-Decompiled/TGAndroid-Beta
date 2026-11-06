package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class bx0 {
    public final boolean f32309a;
    public h6.m d;
    public h6.m f32313f;
    public h6.m h;
    public int[] f32316j;
    public int[] f32318l;
    public zw0[] f32320n;
    public int[] f32322p;
    public boolean f32324r;
    public int[] f32326t;
    public final lx0 f32329x;
    public int f32310b = Integer.MIN_VALUE;
    public int f32311c = Integer.MIN_VALUE;
    public boolean f32312e = false;
    public boolean f32314g = false;
    public boolean f32315i = false;
    public boolean f32317k = false;
    public boolean f32319m = false;
    public boolean f32321o = false;
    public boolean f32323q = false;
    public boolean f32325s = false;
    public boolean f32327u = true;
    public final hx0 v = new hx0(0);
    public final hx0 f32328w = new hx0(-100000);

    public bx0(lx0 lx0Var, boolean z9) {
        this.f32329x = lx0Var;
        this.f32309a = z9;
    }

    public static void j(ArrayList arrayList, fx0 fx0Var, hx0 hx0Var, boolean z9) {
        if (fx0Var.a() != 0) {
            if (z9) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    if (((zw0) obj).f41098a.equals(fx0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new zw0(fx0Var, hx0Var));
        }
    }

    public static boolean m(int[] iArr, zw0 zw0Var) {
        if (zw0Var.f41100c) {
            fx0 fx0Var = zw0Var.f41098a;
            int i7 = fx0Var.f33709a;
            int i10 = fx0Var.f33710b;
            int i11 = iArr[i7] + zw0Var.f41099b.f34449a;
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
            hx0Var.f34449a = Integer.MIN_VALUE;
        }
        cx0[] cx0VarArr = (cx0[]) ((Object[]) f().d);
        for (int i7 = 0; i7 < cx0VarArr.length; i7++) {
            int d = cx0VarArr[i7].d(z9);
            hx0 hx0Var2 = (hx0) ((Object[]) mVar.d)[((int[]) mVar.f14264b)[i7]];
            int i10 = hx0Var2.f34449a;
            if (!z9) {
                d = -d;
            }
            hx0Var2.f34449a = Math.max(i10, d);
        }
    }

    public final void b(boolean z9) {
        int[] iArr;
        ix0 ix0Var;
        int i7;
        if (z9) {
            iArr = this.f32316j;
        } else {
            iArr = this.f32318l;
        }
        lx0 lx0Var = this.f32329x;
        int childCount = lx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ex0 d = lx0Var.d(i10);
            gx0 gx0Var = d.f33350a;
            boolean z10 = this.f32309a;
            if (z10) {
                ix0Var = gx0Var.f34065b;
            } else {
                ix0Var = gx0Var.f34064a;
            }
            fx0 fx0Var = ix0Var.f34818b;
            if (z9) {
                i7 = fx0Var.f33709a;
            } else {
                i7 = fx0Var.f33710b;
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
                fx0Var = ix0VarArr[i7].f34818b;
            } else {
                fx0 fx0Var2 = ix0VarArr[i7].f34818b;
                fx0Var = new fx0(fx0Var2.f33710b, fx0Var2.f33709a);
            }
            ?? obj = new Object();
            obj.f34449a = Integer.MIN_VALUE;
            ax0Var.add(Pair.create(fx0Var, obj));
        }
        return ax0Var.f();
    }

    public final zw0[] d() {
        if (this.f32320n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f32313f == null) {
                this.f32313f = c(true);
            }
            if (!this.f32314g) {
                a(this.f32313f, true);
                this.f32314g = true;
            }
            h6.m mVar = this.f32313f;
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
            if (!this.f32315i) {
                a(this.h, false);
                this.f32315i = true;
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
            if (this.f32327u) {
                int i11 = 0;
                while (i11 < e()) {
                    int i12 = i11 + 1;
                    j(arrayList, new fx0(i11, i12), new hx0(0), true);
                    i11 = i12;
                }
            }
            int e10 = e();
            j(arrayList, new fx0(0, e10), this.v, false);
            j(arrayList2, new fx0(e10, 0), this.f32328w, false);
            zw0[] q10 = q(arrayList);
            zw0[] q11 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(zw0[].class.getComponentType(), q10.length + q11.length);
            System.arraycopy(q10, 0, objArr, 0, q10.length);
            System.arraycopy(q11, 0, objArr, q10.length, q11.length);
            this.f32320n = (zw0[]) objArr;
        }
        if (!this.f32321o) {
            if (this.f32313f == null) {
                this.f32313f = c(true);
            }
            if (!this.f32314g) {
                a(this.f32313f, true);
                this.f32314g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f32315i) {
                a(this.h, false);
                this.f32315i = true;
            }
            this.f32321o = true;
        }
        return this.f32320n;
    }

    public final int e() {
        int max = Math.max(this.f32310b, h());
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
        boolean z9 = this.f32309a;
        lx0 lx0Var = this.f32329x;
        if (mVar == null) {
            ax0 ax0Var = new ax0(ix0.class, cx0.class);
            int childCount = lx0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                gx0 gx0Var = lx0Var.d(i12).f33350a;
                if (z9) {
                    ix0Var2 = gx0Var.f34065b;
                } else {
                    ix0Var2 = gx0Var.f34064a;
                }
                switch (ix0.a(ix0Var2, z9).f40433a) {
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
        if (!this.f32312e) {
            for (cx0 cx0Var2 : (cx0[]) ((Object[]) this.d.d)) {
                cx0Var2.c();
            }
            int childCount2 = lx0Var.getChildCount();
            for (int i13 = 0; i13 < childCount2; i13++) {
                ex0 d = lx0Var.d(i13);
                gx0 gx0Var2 = d.f33350a;
                if (z9) {
                    ix0Var = gx0Var2.f34065b;
                } else {
                    ix0Var = gx0Var2.f34064a;
                }
                if (z9) {
                    i7 = d.f33358k;
                } else {
                    i7 = d.f33359l;
                }
                int e10 = lx0Var.e(d, z9, false) + lx0Var.e(d, z9, true) + i7;
                float f10 = ix0Var.d;
                if (f10 == 0.0f) {
                    i10 = 0;
                } else {
                    i10 = this.f32326t[i13];
                }
                int i14 = e10 + i10;
                h6.m mVar2 = this.d;
                cx0 cx0Var3 = (cx0) ((Object[]) mVar2.d)[((int[]) mVar2.f14264b)[i13]];
                int i15 = cx0Var3.f32692c;
                if (ix0Var.f34819c == lx0.R && f10 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                cx0Var3.f32692c = i11 & i15;
                int a10 = ix0.a(ix0Var, z9).a(d, i14);
                cx0Var3.b(a10, i14 - a10);
            }
            this.f32312e = true;
        }
        return this.d;
    }

    public final int[] g() {
        ix0 ix0Var;
        boolean z9;
        ix0 ix0Var2;
        if (this.f32322p == null) {
            this.f32322p = new int[e() + 1];
        }
        if (!this.f32323q) {
            int[] iArr = this.f32322p;
            boolean z10 = this.f32325s;
            float f10 = 0.0f;
            boolean z11 = this.f32309a;
            lx0 lx0Var = this.f32329x;
            if (!z10) {
                int childCount = lx0Var.getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 < childCount) {
                        gx0 gx0Var = lx0Var.d(i7).f33350a;
                        if (z11) {
                            ix0Var2 = gx0Var.f34065b;
                        } else {
                            ix0Var2 = gx0Var.f34064a;
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
                this.f32324r = z9;
                this.f32325s = true;
            }
            if (!this.f32324r) {
                p(d(), iArr, true);
            } else {
                if (this.f32326t == null) {
                    this.f32326t = new int[lx0Var.getChildCount()];
                }
                Arrays.fill(this.f32326t, 0);
                p(d(), iArr, true);
                int childCount2 = (lx0Var.getChildCount() * this.v.f34449a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = lx0Var.getChildCount();
                    for (int i10 = 0; i10 < childCount3; i10++) {
                        gx0 gx0Var2 = lx0Var.d(i10).f33350a;
                        if (z11) {
                            ix0Var = gx0Var2.f34065b;
                        } else {
                            ix0Var = gx0Var2.f34064a;
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
            if (!this.f32327u) {
                int i14 = iArr[0];
                int length = iArr.length;
                for (int i15 = 0; i15 < length; i15++) {
                    iArr[i15] = iArr[i15] - i14;
                }
            }
            this.f32323q = true;
        }
        return this.f32322p;
    }

    public final int h() {
        ix0 ix0Var;
        int i7 = Integer.MIN_VALUE;
        if (this.f32311c == Integer.MIN_VALUE) {
            lx0 lx0Var = this.f32329x;
            int childCount = lx0Var.getChildCount();
            int i10 = -1;
            for (int i11 = 0; i11 < childCount; i11++) {
                gx0 gx0Var = lx0Var.d(i11).f33350a;
                if (this.f32309a) {
                    ix0Var = gx0Var.f34065b;
                } else {
                    ix0Var = gx0Var.f34064a;
                }
                fx0 fx0Var = ix0Var.f34818b;
                i10 = Math.max(Math.max(Math.max(i10, fx0Var.f33709a), fx0Var.f33710b), fx0Var.a());
            }
            if (i10 != -1) {
                i7 = i10;
            }
            this.f32311c = Math.max(0, i7);
        }
        return this.f32311c;
    }

    public final int i(int i7) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        hx0 hx0Var = this.f32328w;
        hx0 hx0Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                hx0Var2.f34449a = size;
                hx0Var.f34449a = -size;
                this.f32323q = false;
                return g()[e()];
            }
            hx0Var2.f34449a = 0;
            hx0Var.f34449a = -100000;
            this.f32323q = false;
            return g()[e()];
        }
        hx0Var2.f34449a = 0;
        hx0Var.f34449a = -size;
        this.f32323q = false;
        return g()[e()];
    }

    public final void k() {
        this.f32311c = Integer.MIN_VALUE;
        this.d = null;
        this.f32313f = null;
        this.h = null;
        this.f32316j = null;
        this.f32318l = null;
        this.f32320n = null;
        this.f32322p = null;
        this.f32326t = null;
        this.f32325s = false;
        l();
    }

    public final void l() {
        this.f32312e = false;
        this.f32314g = false;
        this.f32315i = false;
        this.f32317k = false;
        this.f32319m = false;
        this.f32321o = false;
        this.f32323q = false;
    }

    public final void n(int i7) {
        String str;
        if (i7 != Integer.MIN_VALUE && i7 < h()) {
            if (this.f32309a) {
                str = "column";
            } else {
                str = "row";
            }
            lx0.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.f32310b = i7;
    }

    public final void o(float f10, int i7) {
        ix0 ix0Var;
        Arrays.fill(this.f32326t, 0);
        lx0 lx0Var = this.f32329x;
        int childCount = lx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            gx0 gx0Var = lx0Var.d(i10).f33350a;
            if (this.f32309a) {
                ix0Var = gx0Var.f34065b;
            } else {
                ix0Var = gx0Var.f34064a;
            }
            float f11 = ix0Var.d;
            if (f11 != 0.0f) {
                int round = Math.round((i7 * f11) / f10);
                this.f32326t[i10] = round;
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
                    fx0 fx0Var = zw0Var2.f41098a;
                    if (fx0Var.f33709a >= fx0Var.f33710b) {
                        zw0Var2.f41100c = false;
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
