package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class fx0 {
    public final boolean f34714a;
    public h6.m d;
    public h6.m f34718f;
    public h6.m h;
    public int[] f34721j;
    public int[] f34723l;
    public dx0[] f34725n;
    public int[] f34727p;
    public boolean f34729r;
    public int[] f34731t;
    public final px0 f34734x;
    public int f34715b = Integer.MIN_VALUE;
    public int f34716c = Integer.MIN_VALUE;
    public boolean f34717e = false;
    public boolean f34719g = false;
    public boolean f34720i = false;
    public boolean f34722k = false;
    public boolean f34724m = false;
    public boolean f34726o = false;
    public boolean f34728q = false;
    public boolean f34730s = false;
    public boolean f34732u = true;
    public final lx0 v = new lx0(0);
    public final lx0 f34733w = new lx0(-100000);

    public fx0(px0 px0Var, boolean z10) {
        this.f34734x = px0Var;
        this.f34714a = z10;
    }

    public static void j(ArrayList arrayList, jx0 jx0Var, lx0 lx0Var, boolean z10) {
        if (jx0Var.a() != 0) {
            if (z10) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    if (((dx0) obj).f34096a.equals(jx0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new dx0(jx0Var, lx0Var));
        }
    }

    public static boolean m(int[] iArr, dx0 dx0Var) {
        if (dx0Var.f34098c) {
            jx0 jx0Var = dx0Var.f34096a;
            int i7 = jx0Var.f36198a;
            int i10 = jx0Var.f36199b;
            int i11 = iArr[i7] + dx0Var.f34097b.f36927a;
            if (i11 > iArr[i10]) {
                iArr[i10] = i11;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(h6.m mVar, boolean z10) {
        for (lx0 lx0Var : (lx0[]) ((Object[]) mVar.d)) {
            lx0Var.f36927a = Integer.MIN_VALUE;
        }
        gx0[] gx0VarArr = (gx0[]) ((Object[]) f().d);
        for (int i7 = 0; i7 < gx0VarArr.length; i7++) {
            int d = gx0VarArr[i7].d(z10);
            lx0 lx0Var2 = (lx0) ((Object[]) mVar.d)[((int[]) mVar.f13624b)[i7]];
            int i10 = lx0Var2.f36927a;
            if (!z10) {
                d = -d;
            }
            lx0Var2.f36927a = Math.max(i10, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        mx0 mx0Var;
        int i7;
        if (z10) {
            iArr = this.f34721j;
        } else {
            iArr = this.f34723l;
        }
        px0 px0Var = this.f34734x;
        int childCount = px0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ix0 d = px0Var.d(i10);
            kx0 kx0Var = d.f35760a;
            boolean z11 = this.f34714a;
            if (z11) {
                mx0Var = kx0Var.f36649b;
            } else {
                mx0Var = kx0Var.f36648a;
            }
            jx0 jx0Var = mx0Var.f37403b;
            if (z10) {
                i7 = jx0Var.f36198a;
            } else {
                i7 = jx0Var.f36199b;
            }
            iArr[i7] = Math.max(iArr[i7], px0Var.f(d, z11, z10));
        }
    }

    public final h6.m c(boolean z10) {
        jx0 jx0Var;
        ex0 ex0Var = new ex0(jx0.class, lx0.class);
        mx0[] mx0VarArr = (mx0[]) ((Object[]) f().f13625c);
        int length = mx0VarArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (z10) {
                jx0Var = mx0VarArr[i7].f37403b;
            } else {
                jx0 jx0Var2 = mx0VarArr[i7].f37403b;
                jx0Var = new jx0(jx0Var2.f36199b, jx0Var2.f36198a);
            }
            ?? obj = new Object();
            obj.f36927a = Integer.MIN_VALUE;
            ex0Var.add(Pair.create(jx0Var, obj));
        }
        return ex0Var.f();
    }

    public final dx0[] d() {
        if (this.f34725n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f34718f == null) {
                this.f34718f = c(true);
            }
            if (!this.f34719g) {
                a(this.f34718f, true);
                this.f34719g = true;
            }
            h6.m mVar = this.f34718f;
            int i7 = 0;
            while (true) {
                jx0[] jx0VarArr = (jx0[]) ((Object[]) mVar.f13625c);
                if (i7 >= jx0VarArr.length) {
                    break;
                }
                j(arrayList, jx0VarArr[i7], ((lx0[]) ((Object[]) mVar.d))[i7], false);
                i7++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f34720i) {
                a(this.h, false);
                this.f34720i = true;
            }
            h6.m mVar2 = this.h;
            int i10 = 0;
            while (true) {
                jx0[] jx0VarArr2 = (jx0[]) ((Object[]) mVar2.f13625c);
                if (i10 >= jx0VarArr2.length) {
                    break;
                }
                j(arrayList2, jx0VarArr2[i10], ((lx0[]) ((Object[]) mVar2.d))[i10], false);
                i10++;
            }
            if (this.f34732u) {
                int i11 = 0;
                while (i11 < e()) {
                    int i12 = i11 + 1;
                    j(arrayList, new jx0(i11, i12), new lx0(0), true);
                    i11 = i12;
                }
            }
            int e10 = e();
            j(arrayList, new jx0(0, e10), this.v, false);
            j(arrayList2, new jx0(e10, 0), this.f34733w, false);
            dx0[] q10 = q(arrayList);
            dx0[] q11 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(dx0[].class.getComponentType(), q10.length + q11.length);
            System.arraycopy(q10, 0, objArr, 0, q10.length);
            System.arraycopy(q11, 0, objArr, q10.length, q11.length);
            this.f34725n = (dx0[]) objArr;
        }
        if (!this.f34726o) {
            if (this.f34718f == null) {
                this.f34718f = c(true);
            }
            if (!this.f34719g) {
                a(this.f34718f, true);
                this.f34719g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f34720i) {
                a(this.h, false);
                this.f34720i = true;
            }
            this.f34726o = true;
        }
        return this.f34725n;
    }

    public final int e() {
        int max = Math.max(this.f34715b, h());
        if (max <= 1024) {
            return max;
        }
        px0.g("Table grid count out of bounds");
        throw null;
    }

    public final h6.m f() {
        mx0 mx0Var;
        int i7;
        int i10;
        int i11;
        mx0 mx0Var2;
        gx0 gx0Var;
        h6.m mVar = this.d;
        boolean z10 = this.f34714a;
        px0 px0Var = this.f34734x;
        if (mVar == null) {
            ex0 ex0Var = new ex0(mx0.class, gx0.class);
            int childCount = px0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                kx0 kx0Var = px0Var.d(i12).f35760a;
                if (z10) {
                    mx0Var2 = kx0Var.f36649b;
                } else {
                    mx0Var2 = kx0Var.f36648a;
                }
                switch (mx0.a(mx0Var2, z10).f33426a) {
                    case 3:
                        gx0Var = new gx0();
                        break;
                    default:
                        gx0Var = new gx0();
                        break;
                }
                ex0Var.add(Pair.create(mx0Var2, gx0Var));
            }
            this.d = ex0Var.f();
        }
        if (!this.f34717e) {
            for (gx0 gx0Var2 : (gx0[]) ((Object[]) this.d.d)) {
                gx0Var2.c();
            }
            int childCount2 = px0Var.getChildCount();
            for (int i13 = 0; i13 < childCount2; i13++) {
                ix0 d = px0Var.d(i13);
                kx0 kx0Var2 = d.f35760a;
                if (z10) {
                    mx0Var = kx0Var2.f36649b;
                } else {
                    mx0Var = kx0Var2.f36648a;
                }
                if (z10) {
                    i7 = d.f35768k;
                } else {
                    i7 = d.f35769l;
                }
                int e10 = px0Var.e(d, z10, false) + px0Var.e(d, z10, true) + i7;
                float f10 = mx0Var.d;
                if (f10 == 0.0f) {
                    i10 = 0;
                } else {
                    i10 = this.f34731t[i13];
                }
                int i14 = e10 + i10;
                h6.m mVar2 = this.d;
                gx0 gx0Var3 = (gx0) ((Object[]) mVar2.d)[((int[]) mVar2.f13624b)[i13]];
                int i15 = gx0Var3.f35082c;
                if (mx0Var.f37404c == px0.T && f10 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                gx0Var3.f35082c = i11 & i15;
                int a10 = mx0.a(mx0Var, z10).a(d, i14);
                gx0Var3.b(a10, i14 - a10);
            }
            this.f34717e = true;
        }
        return this.d;
    }

    public final int[] g() {
        mx0 mx0Var;
        boolean z10;
        mx0 mx0Var2;
        if (this.f34727p == null) {
            this.f34727p = new int[e() + 1];
        }
        if (!this.f34728q) {
            int[] iArr = this.f34727p;
            boolean z11 = this.f34730s;
            float f10 = 0.0f;
            boolean z12 = this.f34714a;
            px0 px0Var = this.f34734x;
            if (!z11) {
                int childCount = px0Var.getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 < childCount) {
                        kx0 kx0Var = px0Var.d(i7).f35760a;
                        if (z12) {
                            mx0Var2 = kx0Var.f36649b;
                        } else {
                            mx0Var2 = kx0Var.f36648a;
                        }
                        if (mx0Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i7++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f34729r = z10;
                this.f34730s = true;
            }
            if (!this.f34729r) {
                p(d(), iArr, true);
            } else {
                if (this.f34731t == null) {
                    this.f34731t = new int[px0Var.getChildCount()];
                }
                Arrays.fill(this.f34731t, 0);
                p(d(), iArr, true);
                int childCount2 = (px0Var.getChildCount() * this.v.f36927a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = px0Var.getChildCount();
                    for (int i10 = 0; i10 < childCount3; i10++) {
                        kx0 kx0Var2 = px0Var.d(i10).f35760a;
                        if (z12) {
                            mx0Var = kx0Var2.f36649b;
                        } else {
                            mx0Var = kx0Var2.f36648a;
                        }
                        f10 += mx0Var.d;
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
            if (!this.f34732u) {
                int i14 = iArr[0];
                int length = iArr.length;
                for (int i15 = 0; i15 < length; i15++) {
                    iArr[i15] = iArr[i15] - i14;
                }
            }
            this.f34728q = true;
        }
        return this.f34727p;
    }

    public final int h() {
        mx0 mx0Var;
        int i7 = Integer.MIN_VALUE;
        if (this.f34716c == Integer.MIN_VALUE) {
            px0 px0Var = this.f34734x;
            int childCount = px0Var.getChildCount();
            int i10 = -1;
            for (int i11 = 0; i11 < childCount; i11++) {
                kx0 kx0Var = px0Var.d(i11).f35760a;
                if (this.f34714a) {
                    mx0Var = kx0Var.f36649b;
                } else {
                    mx0Var = kx0Var.f36648a;
                }
                jx0 jx0Var = mx0Var.f37403b;
                i10 = Math.max(Math.max(Math.max(i10, jx0Var.f36198a), jx0Var.f36199b), jx0Var.a());
            }
            if (i10 != -1) {
                i7 = i10;
            }
            this.f34716c = Math.max(0, i7);
        }
        return this.f34716c;
    }

    public final int i(int i7) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        lx0 lx0Var = this.f34733w;
        lx0 lx0Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                lx0Var2.f36927a = size;
                lx0Var.f36927a = -size;
                this.f34728q = false;
                return g()[e()];
            }
            lx0Var2.f36927a = 0;
            lx0Var.f36927a = -100000;
            this.f34728q = false;
            return g()[e()];
        }
        lx0Var2.f36927a = 0;
        lx0Var.f36927a = -size;
        this.f34728q = false;
        return g()[e()];
    }

    public final void k() {
        this.f34716c = Integer.MIN_VALUE;
        this.d = null;
        this.f34718f = null;
        this.h = null;
        this.f34721j = null;
        this.f34723l = null;
        this.f34725n = null;
        this.f34727p = null;
        this.f34731t = null;
        this.f34730s = false;
        l();
    }

    public final void l() {
        this.f34717e = false;
        this.f34719g = false;
        this.f34720i = false;
        this.f34722k = false;
        this.f34724m = false;
        this.f34726o = false;
        this.f34728q = false;
    }

    public final void n(int i7) {
        String str;
        if (i7 != Integer.MIN_VALUE && i7 < h()) {
            if (this.f34714a) {
                str = "column";
            } else {
                str = "row";
            }
            px0.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.f34715b = i7;
    }

    public final void o(float f10, int i7) {
        mx0 mx0Var;
        Arrays.fill(this.f34731t, 0);
        px0 px0Var = this.f34734x;
        int childCount = px0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            kx0 kx0Var = px0Var.d(i10).f35760a;
            if (this.f34714a) {
                mx0Var = kx0Var.f36649b;
            } else {
                mx0Var = kx0Var.f36648a;
            }
            float f11 = mx0Var.d;
            if (f11 != 0.0f) {
                int round = Math.round((i7 * f11) / f10);
                this.f34731t[i10] = round;
                i7 -= round;
                f10 -= f11;
            }
        }
    }

    public final boolean p(dx0[] dx0VarArr, int[] iArr, boolean z10) {
        int e10 = e() + 1;
        loop0: for (int i7 = 0; i7 < dx0VarArr.length; i7++) {
            Arrays.fill(iArr, 0);
            for (int i10 = 0; i10 < e10; i10++) {
                boolean z11 = false;
                for (dx0 dx0Var : dx0VarArr) {
                    z11 |= m(iArr, dx0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[dx0VarArr.length];
            for (int i11 = 0; i11 < e10; i11++) {
                int length = dx0VarArr.length;
                for (int i12 = 0; i12 < length; i12++) {
                    zArr[i12] = zArr[i12] | m(iArr, dx0VarArr[i12]);
                }
            }
            int i13 = 0;
            while (true) {
                if (i13 >= dx0VarArr.length) {
                    break;
                }
                if (zArr[i13]) {
                    dx0 dx0Var2 = dx0VarArr[i13];
                    jx0 jx0Var = dx0Var2.f34096a;
                    if (jx0Var.f36198a >= jx0Var.f36199b) {
                        dx0Var2.f34098c = false;
                        break;
                    }
                }
                i13++;
            }
        }
        return true;
    }

    public final dx0[] q(ArrayList arrayList) {
        a4.k kVar = new a4.k(this, (dx0[]) arrayList.toArray(new dx0[0]));
        int length = ((dx0[][]) kVar.d).length;
        for (int i7 = 0; i7 < length; i7++) {
            kVar.w(i7);
        }
        return (dx0[]) kVar.f192c;
    }
}
