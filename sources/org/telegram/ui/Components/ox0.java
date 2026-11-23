package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class ox0 {
    public final boolean f38382a;
    public h6.m d;
    public h6.m f38386f;
    public h6.m h;
    public int[] f38389j;
    public int[] f38391l;
    public mx0[] f38393n;
    public int[] f38395p;
    public boolean f38397r;
    public int[] f38399t;
    public final yx0 f38402x;
    public int f38383b = Integer.MIN_VALUE;
    public int f38384c = Integer.MIN_VALUE;
    public boolean f38385e = false;
    public boolean f38387g = false;
    public boolean f38388i = false;
    public boolean f38390k = false;
    public boolean f38392m = false;
    public boolean f38394o = false;
    public boolean f38396q = false;
    public boolean f38398s = false;
    public boolean f38400u = true;
    public final ux0 v = new ux0(0);
    public final ux0 f38401w = new ux0(-100000);

    public ox0(yx0 yx0Var, boolean z10) {
        this.f38402x = yx0Var;
        this.f38382a = z10;
    }

    public static void j(ArrayList arrayList, sx0 sx0Var, ux0 ux0Var, boolean z10) {
        if (sx0Var.a() != 0) {
            if (z10) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    if (((mx0) obj).f37658a.equals(sx0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new mx0(sx0Var, ux0Var));
        }
    }

    public static boolean m(int[] iArr, mx0 mx0Var) {
        if (mx0Var.f37660c) {
            sx0 sx0Var = mx0Var.f37658a;
            int i7 = sx0Var.f39718a;
            int i10 = sx0Var.f39719b;
            int i11 = iArr[i7] + mx0Var.f37659b.f40604a;
            if (i11 > iArr[i10]) {
                iArr[i10] = i11;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(h6.m mVar, boolean z10) {
        for (ux0 ux0Var : (ux0[]) ((Object[]) mVar.d)) {
            ux0Var.f40604a = Integer.MIN_VALUE;
        }
        px0[] px0VarArr = (px0[]) ((Object[]) f().d);
        for (int i7 = 0; i7 < px0VarArr.length; i7++) {
            int d = px0VarArr[i7].d(z10);
            ux0 ux0Var2 = (ux0) ((Object[]) mVar.d)[((int[]) mVar.f13968b)[i7]];
            int i10 = ux0Var2.f40604a;
            if (!z10) {
                d = -d;
            }
            ux0Var2.f40604a = Math.max(i10, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        vx0 vx0Var;
        int i7;
        if (z10) {
            iArr = this.f38389j;
        } else {
            iArr = this.f38391l;
        }
        yx0 yx0Var = this.f38402x;
        int childCount = yx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            rx0 d = yx0Var.d(i10);
            tx0 tx0Var = d.f39368a;
            boolean z11 = this.f38382a;
            if (z11) {
                vx0Var = tx0Var.f40077b;
            } else {
                vx0Var = tx0Var.f40076a;
            }
            sx0 sx0Var = vx0Var.f41585b;
            if (z10) {
                i7 = sx0Var.f39718a;
            } else {
                i7 = sx0Var.f39719b;
            }
            iArr[i7] = Math.max(iArr[i7], yx0Var.f(d, z11, z10));
        }
    }

    public final h6.m c(boolean z10) {
        sx0 sx0Var;
        nx0 nx0Var = new nx0(sx0.class, ux0.class);
        vx0[] vx0VarArr = (vx0[]) ((Object[]) f().f13969c);
        int length = vx0VarArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (z10) {
                sx0Var = vx0VarArr[i7].f41585b;
            } else {
                sx0 sx0Var2 = vx0VarArr[i7].f41585b;
                sx0Var = new sx0(sx0Var2.f39719b, sx0Var2.f39718a);
            }
            ?? obj = new Object();
            obj.f40604a = Integer.MIN_VALUE;
            nx0Var.add(Pair.create(sx0Var, obj));
        }
        return nx0Var.f();
    }

    public final mx0[] d() {
        if (this.f38393n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f38386f == null) {
                this.f38386f = c(true);
            }
            if (!this.f38387g) {
                a(this.f38386f, true);
                this.f38387g = true;
            }
            h6.m mVar = this.f38386f;
            int i7 = 0;
            while (true) {
                sx0[] sx0VarArr = (sx0[]) ((Object[]) mVar.f13969c);
                if (i7 >= sx0VarArr.length) {
                    break;
                }
                j(arrayList, sx0VarArr[i7], ((ux0[]) ((Object[]) mVar.d))[i7], false);
                i7++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f38388i) {
                a(this.h, false);
                this.f38388i = true;
            }
            h6.m mVar2 = this.h;
            int i10 = 0;
            while (true) {
                sx0[] sx0VarArr2 = (sx0[]) ((Object[]) mVar2.f13969c);
                if (i10 >= sx0VarArr2.length) {
                    break;
                }
                j(arrayList2, sx0VarArr2[i10], ((ux0[]) ((Object[]) mVar2.d))[i10], false);
                i10++;
            }
            if (this.f38400u) {
                int i11 = 0;
                while (i11 < e()) {
                    int i12 = i11 + 1;
                    j(arrayList, new sx0(i11, i12), new ux0(0), true);
                    i11 = i12;
                }
            }
            int e10 = e();
            j(arrayList, new sx0(0, e10), this.v, false);
            j(arrayList2, new sx0(e10, 0), this.f38401w, false);
            mx0[] q10 = q(arrayList);
            mx0[] q11 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(mx0[].class.getComponentType(), q10.length + q11.length);
            System.arraycopy(q10, 0, objArr, 0, q10.length);
            System.arraycopy(q11, 0, objArr, q10.length, q11.length);
            this.f38393n = (mx0[]) objArr;
        }
        if (!this.f38394o) {
            if (this.f38386f == null) {
                this.f38386f = c(true);
            }
            if (!this.f38387g) {
                a(this.f38386f, true);
                this.f38387g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f38388i) {
                a(this.h, false);
                this.f38388i = true;
            }
            this.f38394o = true;
        }
        return this.f38393n;
    }

    public final int e() {
        int max = Math.max(this.f38383b, h());
        if (max <= 1024) {
            return max;
        }
        yx0.g("Table grid count out of bounds");
        throw null;
    }

    public final h6.m f() {
        vx0 vx0Var;
        int i7;
        int i10;
        int i11;
        vx0 vx0Var2;
        px0 px0Var;
        h6.m mVar = this.d;
        boolean z10 = this.f38382a;
        yx0 yx0Var = this.f38402x;
        if (mVar == null) {
            nx0 nx0Var = new nx0(vx0.class, px0.class);
            int childCount = yx0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                tx0 tx0Var = yx0Var.d(i12).f39368a;
                if (z10) {
                    vx0Var2 = tx0Var.f40077b;
                } else {
                    vx0Var2 = tx0Var.f40076a;
                }
                switch (vx0.a(vx0Var2, z10).f37035a) {
                    case 3:
                        px0Var = new px0();
                        break;
                    default:
                        px0Var = new px0();
                        break;
                }
                nx0Var.add(Pair.create(vx0Var2, px0Var));
            }
            this.d = nx0Var.f();
        }
        if (!this.f38385e) {
            for (px0 px0Var2 : (px0[]) ((Object[]) this.d.d)) {
                px0Var2.c();
            }
            int childCount2 = yx0Var.getChildCount();
            for (int i13 = 0; i13 < childCount2; i13++) {
                rx0 d = yx0Var.d(i13);
                tx0 tx0Var2 = d.f39368a;
                if (z10) {
                    vx0Var = tx0Var2.f40077b;
                } else {
                    vx0Var = tx0Var2.f40076a;
                }
                if (z10) {
                    i7 = d.f39376k;
                } else {
                    i7 = d.f39377l;
                }
                int e10 = yx0Var.e(d, z10, false) + yx0Var.e(d, z10, true) + i7;
                float f10 = vx0Var.d;
                if (f10 == 0.0f) {
                    i10 = 0;
                } else {
                    i10 = this.f38399t[i13];
                }
                int i14 = e10 + i10;
                h6.m mVar2 = this.d;
                px0 px0Var3 = (px0) ((Object[]) mVar2.d)[((int[]) mVar2.f13968b)[i13]];
                int i15 = px0Var3.f38675c;
                if (vx0Var.f41586c == yx0.T && f10 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                px0Var3.f38675c = i11 & i15;
                int a10 = vx0.a(vx0Var, z10).a(d, i14);
                px0Var3.b(a10, i14 - a10);
            }
            this.f38385e = true;
        }
        return this.d;
    }

    public final int[] g() {
        vx0 vx0Var;
        boolean z10;
        vx0 vx0Var2;
        if (this.f38395p == null) {
            this.f38395p = new int[e() + 1];
        }
        if (!this.f38396q) {
            int[] iArr = this.f38395p;
            boolean z11 = this.f38398s;
            float f10 = 0.0f;
            boolean z12 = this.f38382a;
            yx0 yx0Var = this.f38402x;
            if (!z11) {
                int childCount = yx0Var.getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 < childCount) {
                        tx0 tx0Var = yx0Var.d(i7).f39368a;
                        if (z12) {
                            vx0Var2 = tx0Var.f40077b;
                        } else {
                            vx0Var2 = tx0Var.f40076a;
                        }
                        if (vx0Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i7++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f38397r = z10;
                this.f38398s = true;
            }
            if (!this.f38397r) {
                p(d(), iArr, true);
            } else {
                if (this.f38399t == null) {
                    this.f38399t = new int[yx0Var.getChildCount()];
                }
                Arrays.fill(this.f38399t, 0);
                p(d(), iArr, true);
                int childCount2 = (yx0Var.getChildCount() * this.v.f40604a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = yx0Var.getChildCount();
                    for (int i10 = 0; i10 < childCount3; i10++) {
                        tx0 tx0Var2 = yx0Var.d(i10).f39368a;
                        if (z12) {
                            vx0Var = tx0Var2.f40077b;
                        } else {
                            vx0Var = tx0Var2.f40076a;
                        }
                        f10 += vx0Var.d;
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
            if (!this.f38400u) {
                int i14 = iArr[0];
                int length = iArr.length;
                for (int i15 = 0; i15 < length; i15++) {
                    iArr[i15] = iArr[i15] - i14;
                }
            }
            this.f38396q = true;
        }
        return this.f38395p;
    }

    public final int h() {
        vx0 vx0Var;
        int i7 = Integer.MIN_VALUE;
        if (this.f38384c == Integer.MIN_VALUE) {
            yx0 yx0Var = this.f38402x;
            int childCount = yx0Var.getChildCount();
            int i10 = -1;
            for (int i11 = 0; i11 < childCount; i11++) {
                tx0 tx0Var = yx0Var.d(i11).f39368a;
                if (this.f38382a) {
                    vx0Var = tx0Var.f40077b;
                } else {
                    vx0Var = tx0Var.f40076a;
                }
                sx0 sx0Var = vx0Var.f41585b;
                i10 = Math.max(Math.max(Math.max(i10, sx0Var.f39718a), sx0Var.f39719b), sx0Var.a());
            }
            if (i10 != -1) {
                i7 = i10;
            }
            this.f38384c = Math.max(0, i7);
        }
        return this.f38384c;
    }

    public final int i(int i7) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        ux0 ux0Var = this.f38401w;
        ux0 ux0Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                ux0Var2.f40604a = size;
                ux0Var.f40604a = -size;
                this.f38396q = false;
                return g()[e()];
            }
            ux0Var2.f40604a = 0;
            ux0Var.f40604a = -100000;
            this.f38396q = false;
            return g()[e()];
        }
        ux0Var2.f40604a = 0;
        ux0Var.f40604a = -size;
        this.f38396q = false;
        return g()[e()];
    }

    public final void k() {
        this.f38384c = Integer.MIN_VALUE;
        this.d = null;
        this.f38386f = null;
        this.h = null;
        this.f38389j = null;
        this.f38391l = null;
        this.f38393n = null;
        this.f38395p = null;
        this.f38399t = null;
        this.f38398s = false;
        l();
    }

    public final void l() {
        this.f38385e = false;
        this.f38387g = false;
        this.f38388i = false;
        this.f38390k = false;
        this.f38392m = false;
        this.f38394o = false;
        this.f38396q = false;
    }

    public final void n(int i7) {
        String str;
        if (i7 != Integer.MIN_VALUE && i7 < h()) {
            if (this.f38382a) {
                str = "column";
            } else {
                str = "row";
            }
            yx0.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.f38383b = i7;
    }

    public final void o(float f10, int i7) {
        vx0 vx0Var;
        Arrays.fill(this.f38399t, 0);
        yx0 yx0Var = this.f38402x;
        int childCount = yx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            tx0 tx0Var = yx0Var.d(i10).f39368a;
            if (this.f38382a) {
                vx0Var = tx0Var.f40077b;
            } else {
                vx0Var = tx0Var.f40076a;
            }
            float f11 = vx0Var.d;
            if (f11 != 0.0f) {
                int round = Math.round((i7 * f11) / f10);
                this.f38399t[i10] = round;
                i7 -= round;
                f10 -= f11;
            }
        }
    }

    public final boolean p(mx0[] mx0VarArr, int[] iArr, boolean z10) {
        int e10 = e() + 1;
        loop0: for (int i7 = 0; i7 < mx0VarArr.length; i7++) {
            Arrays.fill(iArr, 0);
            for (int i10 = 0; i10 < e10; i10++) {
                boolean z11 = false;
                for (mx0 mx0Var : mx0VarArr) {
                    z11 |= m(iArr, mx0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[mx0VarArr.length];
            for (int i11 = 0; i11 < e10; i11++) {
                int length = mx0VarArr.length;
                for (int i12 = 0; i12 < length; i12++) {
                    zArr[i12] = zArr[i12] | m(iArr, mx0VarArr[i12]);
                }
            }
            int i13 = 0;
            while (true) {
                if (i13 >= mx0VarArr.length) {
                    break;
                }
                if (zArr[i13]) {
                    mx0 mx0Var2 = mx0VarArr[i13];
                    sx0 sx0Var = mx0Var2.f37658a;
                    if (sx0Var.f39718a >= sx0Var.f39719b) {
                        mx0Var2.f37660c = false;
                        break;
                    }
                }
                i13++;
            }
        }
        return true;
    }

    public final mx0[] q(ArrayList arrayList) {
        a4.k kVar = new a4.k(this, (mx0[]) arrayList.toArray(new mx0[0]));
        int length = ((mx0[][]) kVar.d).length;
        for (int i7 = 0; i7 < length; i7++) {
            kVar.w(i7);
        }
        return (mx0[]) kVar.f192c;
    }
}
