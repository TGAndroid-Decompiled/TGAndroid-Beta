package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class nx0 {
    public final boolean f37934a;
    public h6.m d;
    public h6.m f37938f;
    public h6.m h;
    public int[] f37941j;
    public int[] f37943l;
    public lx0[] f37945n;
    public int[] f37947p;
    public boolean f37949r;
    public int[] f37951t;
    public final xx0 f37954x;
    public int f37935b = Integer.MIN_VALUE;
    public int f37936c = Integer.MIN_VALUE;
    public boolean f37937e = false;
    public boolean f37939g = false;
    public boolean f37940i = false;
    public boolean f37942k = false;
    public boolean f37944m = false;
    public boolean f37946o = false;
    public boolean f37948q = false;
    public boolean f37950s = false;
    public boolean f37952u = true;
    public final tx0 v = new tx0(0);
    public final tx0 f37953w = new tx0(-100000);

    public nx0(xx0 xx0Var, boolean z10) {
        this.f37954x = xx0Var;
        this.f37934a = z10;
    }

    public static void j(ArrayList arrayList, rx0 rx0Var, tx0 tx0Var, boolean z10) {
        if (rx0Var.a() != 0) {
            if (z10) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    if (((lx0) obj).f37247a.equals(rx0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new lx0(rx0Var, tx0Var));
        }
    }

    public static boolean m(int[] iArr, lx0 lx0Var) {
        if (lx0Var.f37249c) {
            rx0 rx0Var = lx0Var.f37247a;
            int i7 = rx0Var.f39431a;
            int i10 = rx0Var.f39432b;
            int i11 = iArr[i7] + lx0Var.f37248b.f40187a;
            if (i11 > iArr[i10]) {
                iArr[i10] = i11;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(h6.m mVar, boolean z10) {
        for (tx0 tx0Var : (tx0[]) ((Object[]) mVar.d)) {
            tx0Var.f40187a = Integer.MIN_VALUE;
        }
        ox0[] ox0VarArr = (ox0[]) ((Object[]) f().d);
        for (int i7 = 0; i7 < ox0VarArr.length; i7++) {
            int d = ox0VarArr[i7].d(z10);
            tx0 tx0Var2 = (tx0) ((Object[]) mVar.d)[((int[]) mVar.f13931b)[i7]];
            int i10 = tx0Var2.f40187a;
            if (!z10) {
                d = -d;
            }
            tx0Var2.f40187a = Math.max(i10, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        ux0 ux0Var;
        int i7;
        if (z10) {
            iArr = this.f37941j;
        } else {
            iArr = this.f37943l;
        }
        xx0 xx0Var = this.f37954x;
        int childCount = xx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            qx0 d = xx0Var.d(i10);
            sx0 sx0Var = d.f39017a;
            boolean z11 = this.f37934a;
            if (z11) {
                ux0Var = sx0Var.f39741b;
            } else {
                ux0Var = sx0Var.f39740a;
            }
            rx0 rx0Var = ux0Var.f40502b;
            if (z10) {
                i7 = rx0Var.f39431a;
            } else {
                i7 = rx0Var.f39432b;
            }
            iArr[i7] = Math.max(iArr[i7], xx0Var.f(d, z11, z10));
        }
    }

    public final h6.m c(boolean z10) {
        rx0 rx0Var;
        mx0 mx0Var = new mx0(rx0.class, tx0.class);
        ux0[] ux0VarArr = (ux0[]) ((Object[]) f().f13932c);
        int length = ux0VarArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (z10) {
                rx0Var = ux0VarArr[i7].f40502b;
            } else {
                rx0 rx0Var2 = ux0VarArr[i7].f40502b;
                rx0Var = new rx0(rx0Var2.f39432b, rx0Var2.f39431a);
            }
            ?? obj = new Object();
            obj.f40187a = Integer.MIN_VALUE;
            mx0Var.add(Pair.create(rx0Var, obj));
        }
        return mx0Var.f();
    }

    public final lx0[] d() {
        if (this.f37945n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f37938f == null) {
                this.f37938f = c(true);
            }
            if (!this.f37939g) {
                a(this.f37938f, true);
                this.f37939g = true;
            }
            h6.m mVar = this.f37938f;
            int i7 = 0;
            while (true) {
                rx0[] rx0VarArr = (rx0[]) ((Object[]) mVar.f13932c);
                if (i7 >= rx0VarArr.length) {
                    break;
                }
                j(arrayList, rx0VarArr[i7], ((tx0[]) ((Object[]) mVar.d))[i7], false);
                i7++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f37940i) {
                a(this.h, false);
                this.f37940i = true;
            }
            h6.m mVar2 = this.h;
            int i10 = 0;
            while (true) {
                rx0[] rx0VarArr2 = (rx0[]) ((Object[]) mVar2.f13932c);
                if (i10 >= rx0VarArr2.length) {
                    break;
                }
                j(arrayList2, rx0VarArr2[i10], ((tx0[]) ((Object[]) mVar2.d))[i10], false);
                i10++;
            }
            if (this.f37952u) {
                int i11 = 0;
                while (i11 < e()) {
                    int i12 = i11 + 1;
                    j(arrayList, new rx0(i11, i12), new tx0(0), true);
                    i11 = i12;
                }
            }
            int e10 = e();
            j(arrayList, new rx0(0, e10), this.v, false);
            j(arrayList2, new rx0(e10, 0), this.f37953w, false);
            lx0[] q10 = q(arrayList);
            lx0[] q11 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(lx0[].class.getComponentType(), q10.length + q11.length);
            System.arraycopy(q10, 0, objArr, 0, q10.length);
            System.arraycopy(q11, 0, objArr, q10.length, q11.length);
            this.f37945n = (lx0[]) objArr;
        }
        if (!this.f37946o) {
            if (this.f37938f == null) {
                this.f37938f = c(true);
            }
            if (!this.f37939g) {
                a(this.f37938f, true);
                this.f37939g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f37940i) {
                a(this.h, false);
                this.f37940i = true;
            }
            this.f37946o = true;
        }
        return this.f37945n;
    }

    public final int e() {
        int max = Math.max(this.f37935b, h());
        if (max <= 1024) {
            return max;
        }
        xx0.g("Table grid count out of bounds");
        throw null;
    }

    public final h6.m f() {
        ux0 ux0Var;
        int i7;
        int i10;
        int i11;
        ux0 ux0Var2;
        ox0 ox0Var;
        h6.m mVar = this.d;
        boolean z10 = this.f37934a;
        xx0 xx0Var = this.f37954x;
        if (mVar == null) {
            mx0 mx0Var = new mx0(ux0.class, ox0.class);
            int childCount = xx0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                sx0 sx0Var = xx0Var.d(i12).f39017a;
                if (z10) {
                    ux0Var2 = sx0Var.f39741b;
                } else {
                    ux0Var2 = sx0Var.f39740a;
                }
                switch (ux0.a(ux0Var2, z10).f36560a) {
                    case 3:
                        ox0Var = new ox0();
                        break;
                    default:
                        ox0Var = new ox0();
                        break;
                }
                mx0Var.add(Pair.create(ux0Var2, ox0Var));
            }
            this.d = mx0Var.f();
        }
        if (!this.f37937e) {
            for (ox0 ox0Var2 : (ox0[]) ((Object[]) this.d.d)) {
                ox0Var2.c();
            }
            int childCount2 = xx0Var.getChildCount();
            for (int i13 = 0; i13 < childCount2; i13++) {
                qx0 d = xx0Var.d(i13);
                sx0 sx0Var2 = d.f39017a;
                if (z10) {
                    ux0Var = sx0Var2.f39741b;
                } else {
                    ux0Var = sx0Var2.f39740a;
                }
                if (z10) {
                    i7 = d.f39025k;
                } else {
                    i7 = d.f39026l;
                }
                int e10 = xx0Var.e(d, z10, false) + xx0Var.e(d, z10, true) + i7;
                float f10 = ux0Var.d;
                if (f10 == 0.0f) {
                    i10 = 0;
                } else {
                    i10 = this.f37951t[i13];
                }
                int i14 = e10 + i10;
                h6.m mVar2 = this.d;
                ox0 ox0Var3 = (ox0) ((Object[]) mVar2.d)[((int[]) mVar2.f13931b)[i13]];
                int i15 = ox0Var3.f38276c;
                if (ux0Var.f40503c == xx0.T && f10 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                ox0Var3.f38276c = i11 & i15;
                int a10 = ux0.a(ux0Var, z10).a(d, i14);
                ox0Var3.b(a10, i14 - a10);
            }
            this.f37937e = true;
        }
        return this.d;
    }

    public final int[] g() {
        ux0 ux0Var;
        boolean z10;
        ux0 ux0Var2;
        if (this.f37947p == null) {
            this.f37947p = new int[e() + 1];
        }
        if (!this.f37948q) {
            int[] iArr = this.f37947p;
            boolean z11 = this.f37950s;
            float f10 = 0.0f;
            boolean z12 = this.f37934a;
            xx0 xx0Var = this.f37954x;
            if (!z11) {
                int childCount = xx0Var.getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 < childCount) {
                        sx0 sx0Var = xx0Var.d(i7).f39017a;
                        if (z12) {
                            ux0Var2 = sx0Var.f39741b;
                        } else {
                            ux0Var2 = sx0Var.f39740a;
                        }
                        if (ux0Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i7++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f37949r = z10;
                this.f37950s = true;
            }
            if (!this.f37949r) {
                p(d(), iArr, true);
            } else {
                if (this.f37951t == null) {
                    this.f37951t = new int[xx0Var.getChildCount()];
                }
                Arrays.fill(this.f37951t, 0);
                p(d(), iArr, true);
                int childCount2 = (xx0Var.getChildCount() * this.v.f40187a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = xx0Var.getChildCount();
                    for (int i10 = 0; i10 < childCount3; i10++) {
                        sx0 sx0Var2 = xx0Var.d(i10).f39017a;
                        if (z12) {
                            ux0Var = sx0Var2.f39741b;
                        } else {
                            ux0Var = sx0Var2.f39740a;
                        }
                        f10 += ux0Var.d;
                    }
                    int i11 = -1;
                    boolean z13 = true;
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
                        z13 = p10;
                    }
                    if (i11 > 0 && !z13) {
                        l();
                        o(f10, i11);
                        p(d(), iArr, true);
                    }
                }
            }
            if (!this.f37952u) {
                int i14 = iArr[0];
                int length = iArr.length;
                for (int i15 = 0; i15 < length; i15++) {
                    iArr[i15] = iArr[i15] - i14;
                }
            }
            this.f37948q = true;
        }
        return this.f37947p;
    }

    public final int h() {
        ux0 ux0Var;
        int i7 = Integer.MIN_VALUE;
        if (this.f37936c == Integer.MIN_VALUE) {
            xx0 xx0Var = this.f37954x;
            int childCount = xx0Var.getChildCount();
            int i10 = -1;
            for (int i11 = 0; i11 < childCount; i11++) {
                sx0 sx0Var = xx0Var.d(i11).f39017a;
                if (this.f37934a) {
                    ux0Var = sx0Var.f39741b;
                } else {
                    ux0Var = sx0Var.f39740a;
                }
                rx0 rx0Var = ux0Var.f40502b;
                i10 = Math.max(Math.max(Math.max(i10, rx0Var.f39431a), rx0Var.f39432b), rx0Var.a());
            }
            if (i10 != -1) {
                i7 = i10;
            }
            this.f37936c = Math.max(0, i7);
        }
        return this.f37936c;
    }

    public final int i(int i7) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        tx0 tx0Var = this.f37953w;
        tx0 tx0Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                tx0Var2.f40187a = size;
                tx0Var.f40187a = -size;
                this.f37948q = false;
                return g()[e()];
            }
            tx0Var2.f40187a = 0;
            tx0Var.f40187a = -100000;
            this.f37948q = false;
            return g()[e()];
        }
        tx0Var2.f40187a = 0;
        tx0Var.f40187a = -size;
        this.f37948q = false;
        return g()[e()];
    }

    public final void k() {
        this.f37936c = Integer.MIN_VALUE;
        this.d = null;
        this.f37938f = null;
        this.h = null;
        this.f37941j = null;
        this.f37943l = null;
        this.f37945n = null;
        this.f37947p = null;
        this.f37951t = null;
        this.f37950s = false;
        l();
    }

    public final void l() {
        this.f37937e = false;
        this.f37939g = false;
        this.f37940i = false;
        this.f37942k = false;
        this.f37944m = false;
        this.f37946o = false;
        this.f37948q = false;
    }

    public final void n(int i7) {
        String str;
        if (i7 != Integer.MIN_VALUE && i7 < h()) {
            if (this.f37934a) {
                str = "column";
            } else {
                str = "row";
            }
            xx0.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.f37935b = i7;
    }

    public final void o(float f10, int i7) {
        ux0 ux0Var;
        Arrays.fill(this.f37951t, 0);
        xx0 xx0Var = this.f37954x;
        int childCount = xx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            sx0 sx0Var = xx0Var.d(i10).f39017a;
            if (this.f37934a) {
                ux0Var = sx0Var.f39741b;
            } else {
                ux0Var = sx0Var.f39740a;
            }
            float f11 = ux0Var.d;
            if (f11 != 0.0f) {
                int round = Math.round((i7 * f11) / f10);
                this.f37951t[i10] = round;
                i7 -= round;
                f10 -= f11;
            }
        }
    }

    public final boolean p(lx0[] lx0VarArr, int[] iArr, boolean z10) {
        int e10 = e() + 1;
        loop0: for (int i7 = 0; i7 < lx0VarArr.length; i7++) {
            Arrays.fill(iArr, 0);
            for (int i10 = 0; i10 < e10; i10++) {
                boolean z11 = false;
                for (lx0 lx0Var : lx0VarArr) {
                    z11 |= m(iArr, lx0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[lx0VarArr.length];
            for (int i11 = 0; i11 < e10; i11++) {
                int length = lx0VarArr.length;
                for (int i12 = 0; i12 < length; i12++) {
                    zArr[i12] = zArr[i12] | m(iArr, lx0VarArr[i12]);
                }
            }
            int i13 = 0;
            while (true) {
                if (i13 >= lx0VarArr.length) {
                    break;
                }
                if (zArr[i13]) {
                    lx0 lx0Var2 = lx0VarArr[i13];
                    rx0 rx0Var = lx0Var2.f37247a;
                    if (rx0Var.f39431a >= rx0Var.f39432b) {
                        lx0Var2.f37249c = false;
                        break;
                    }
                }
                i13++;
            }
        }
        return true;
    }

    public final lx0[] q(ArrayList arrayList) {
        a4.k kVar = new a4.k(this, (lx0[]) arrayList.toArray(new lx0[0]));
        int length = ((lx0[][]) kVar.d).length;
        for (int i7 = 0; i7 < length; i7++) {
            kVar.w(i7);
        }
        return (lx0[]) kVar.f192c;
    }
}
