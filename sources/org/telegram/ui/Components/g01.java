package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class g01 {
    public final boolean f28360a;
    public k6.c d;
    public k6.c f28363f;
    public k6.c h;
    public int[] f28366j;
    public int[] f28368l;
    public e01[] f28370n;
    public int[] f28372p;
    public boolean f28374r;
    public int[] f28376t;
    public final q01 f28379x;
    public int f28361b = Integer.MIN_VALUE;
    public int f28362c = Integer.MIN_VALUE;
    public boolean e = false;
    public boolean f28364g = false;
    public boolean f28365i = false;
    public boolean f28367k = false;
    public boolean f28369m = false;
    public boolean f28371o = false;
    public boolean f28373q = false;
    public boolean f28375s = false;
    public boolean f28377u = true;
    public final m01 v = new m01(0);
    public final m01 f28378w = new m01(-100000);

    public g01(q01 q01Var, boolean z10) {
        this.f28379x = q01Var;
        this.f28360a = z10;
    }

    public static void j(ArrayList arrayList, k01 k01Var, m01 m01Var, boolean z10) {
        if (k01Var.a() != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((e01) obj).f27679a.equals(k01Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new e01(k01Var, m01Var));
        }
    }

    public static boolean m(int[] iArr, e01 e01Var) {
        if (e01Var.f27681c) {
            k01 k01Var = e01Var.f27679a;
            int i10 = k01Var.f29765a;
            int i11 = k01Var.f29766b;
            int i12 = iArr[i10] + e01Var.f27680b.f30349a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(k6.c cVar, boolean z10) {
        for (m01 m01Var : (m01[]) ((Object[]) cVar.d)) {
            m01Var.f30349a = Integer.MIN_VALUE;
        }
        h01[] h01VarArr = (h01[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < h01VarArr.length; i10++) {
            int d = h01VarArr[i10].d(z10);
            m01 m01Var2 = (m01) ((Object[]) cVar.d)[((int[]) cVar.f16406b)[i10]];
            int i11 = m01Var2.f30349a;
            if (!z10) {
                d = -d;
            }
            m01Var2.f30349a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        n01 n01Var;
        int i10;
        if (z10) {
            iArr = this.f28366j;
        } else {
            iArr = this.f28368l;
        }
        q01 q01Var = this.f28379x;
        int childCount = q01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            j01 d = q01Var.d(i11);
            l01 l01Var = d.f29416a;
            boolean z11 = this.f28360a;
            if (z11) {
                n01Var = l01Var.f30011b;
            } else {
                n01Var = l01Var.f30010a;
            }
            k01 k01Var = n01Var.f30790b;
            if (z10) {
                i10 = k01Var.f29765a;
            } else {
                i10 = k01Var.f29766b;
            }
            iArr[i10] = Math.max(iArr[i10], q01Var.f(d, z11, z10));
        }
    }

    public final k6.c c(boolean z10) {
        k01 k01Var;
        f01 f01Var = new f01(k01.class, m01.class);
        n01[] n01VarArr = (n01[]) ((Object[]) f().f16407c);
        int length = n01VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                k01Var = n01VarArr[i10].f30790b;
            } else {
                k01 k01Var2 = n01VarArr[i10].f30790b;
                k01Var = new k01(k01Var2.f29766b, k01Var2.f29765a);
            }
            ?? obj = new Object();
            obj.f30349a = Integer.MIN_VALUE;
            f01Var.add(Pair.create(k01Var, obj));
        }
        return f01Var.h();
    }

    public final e01[] d() {
        if (this.f28370n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f28363f == null) {
                this.f28363f = c(true);
            }
            if (!this.f28364g) {
                a(this.f28363f, true);
                this.f28364g = true;
            }
            k6.c cVar = this.f28363f;
            int i10 = 0;
            while (true) {
                k01[] k01VarArr = (k01[]) ((Object[]) cVar.f16407c);
                if (i10 >= k01VarArr.length) {
                    break;
                }
                j(arrayList, k01VarArr[i10], ((m01[]) ((Object[]) cVar.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f28365i) {
                a(this.h, false);
                this.f28365i = true;
            }
            k6.c cVar2 = this.h;
            int i11 = 0;
            while (true) {
                k01[] k01VarArr2 = (k01[]) ((Object[]) cVar2.f16407c);
                if (i11 >= k01VarArr2.length) {
                    break;
                }
                j(arrayList2, k01VarArr2[i11], ((m01[]) ((Object[]) cVar2.d))[i11], false);
                i11++;
            }
            if (this.f28377u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new k01(i12, i13), new m01(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new k01(0, e), this.v, false);
            j(arrayList2, new k01(e, 0), this.f28378w, false);
            e01[] q5 = q(arrayList);
            e01[] q9 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(e01[].class.getComponentType(), q5.length + q9.length);
            System.arraycopy(q5, 0, objArr, 0, q5.length);
            System.arraycopy(q9, 0, objArr, q5.length, q9.length);
            this.f28370n = (e01[]) objArr;
        }
        if (!this.f28371o) {
            if (this.f28363f == null) {
                this.f28363f = c(true);
            }
            if (!this.f28364g) {
                a(this.f28363f, true);
                this.f28364g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f28365i) {
                a(this.h, false);
                this.f28365i = true;
            }
            this.f28371o = true;
        }
        return this.f28370n;
    }

    public final int e() {
        int max = Math.max(this.f28361b, h());
        if (max <= 1024) {
            return max;
        }
        q01.g("Table grid count out of bounds");
        throw null;
    }

    public final k6.c f() {
        n01 n01Var;
        int i10;
        int i11;
        int i12;
        n01 n01Var2;
        k6.c cVar = this.d;
        boolean z10 = this.f28360a;
        q01 q01Var = this.f28379x;
        if (cVar == null) {
            f01 f01Var = new f01(n01.class, h01.class);
            int childCount = q01Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                l01 l01Var = q01Var.d(i13).f29416a;
                if (z10) {
                    n01Var2 = l01Var.f30011b;
                } else {
                    n01Var2 = l01Var.f30010a;
                }
                f01Var.add(Pair.create(n01Var2, n01.a(n01Var2, z10).G()));
            }
            this.d = f01Var.h();
        }
        if (!this.e) {
            for (h01 h01Var : (h01[]) ((Object[]) this.d.d)) {
                h01Var.c();
            }
            int childCount2 = q01Var.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                j01 d = q01Var.d(i14);
                l01 l01Var2 = d.f29416a;
                if (z10) {
                    n01Var = l01Var2.f30011b;
                } else {
                    n01Var = l01Var2.f30010a;
                }
                if (z10) {
                    i10 = d.f29423k;
                } else {
                    i10 = d.f29424l;
                }
                int e = q01Var.e(d, z10, false) + q01Var.e(d, z10, true) + i10;
                float f7 = n01Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f28376t[i14];
                }
                int i15 = e + i11;
                k6.c cVar2 = this.d;
                h01 h01Var2 = (h01) ((Object[]) cVar2.d)[((int[]) cVar2.f16406b)[i14]];
                int i16 = h01Var2.f28756c;
                if (n01Var.f30791c == q01.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                h01Var2.f28756c = i12 & i16;
                int F = n01.a(n01Var, z10).F(d, i15);
                h01Var2.b(F, i15 - F);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] g() {
        n01 n01Var;
        boolean z10;
        n01 n01Var2;
        if (this.f28372p == null) {
            this.f28372p = new int[e() + 1];
        }
        if (!this.f28373q) {
            int[] iArr = this.f28372p;
            boolean z11 = this.f28375s;
            float f7 = 0.0f;
            boolean z12 = this.f28360a;
            q01 q01Var = this.f28379x;
            if (!z11) {
                int childCount = q01Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        l01 l01Var = q01Var.d(i10).f29416a;
                        if (z12) {
                            n01Var2 = l01Var.f30011b;
                        } else {
                            n01Var2 = l01Var.f30010a;
                        }
                        if (n01Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f28374r = z10;
                this.f28375s = true;
            }
            if (!this.f28374r) {
                p(d(), iArr, true);
            } else {
                if (this.f28376t == null) {
                    this.f28376t = new int[q01Var.getChildCount()];
                }
                Arrays.fill(this.f28376t, 0);
                p(d(), iArr, true);
                int childCount2 = (q01Var.getChildCount() * this.v.f30349a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = q01Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        l01 l01Var2 = q01Var.d(i11).f29416a;
                        if (z12) {
                            n01Var = l01Var2.f30011b;
                        } else {
                            n01Var = l01Var2.f30010a;
                        }
                        f7 += n01Var.d;
                    }
                    int i12 = -1;
                    boolean z13 = true;
                    int i13 = 0;
                    while (i13 < childCount2) {
                        int i14 = (int) ((i13 + childCount2) / 2);
                        l();
                        o(f7, i14);
                        boolean p10 = p(d(), iArr, false);
                        if (p10) {
                            i13 = i14 + 1;
                            i12 = i14;
                        } else {
                            childCount2 = i14;
                        }
                        z13 = p10;
                    }
                    if (i12 > 0 && !z13) {
                        l();
                        o(f7, i12);
                        p(d(), iArr, true);
                    }
                }
            }
            if (!this.f28377u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f28373q = true;
        }
        return this.f28372p;
    }

    public final int h() {
        n01 n01Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f28362c == Integer.MIN_VALUE) {
            q01 q01Var = this.f28379x;
            int childCount = q01Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                l01 l01Var = q01Var.d(i12).f29416a;
                if (this.f28360a) {
                    n01Var = l01Var.f30011b;
                } else {
                    n01Var = l01Var.f30010a;
                }
                k01 k01Var = n01Var.f30790b;
                i11 = Math.max(Math.max(Math.max(i11, k01Var.f29765a), k01Var.f29766b), k01Var.a());
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f28362c = Math.max(0, i10);
        }
        return this.f28362c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        m01 m01Var = this.f28378w;
        m01 m01Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                m01Var2.f30349a = size;
                m01Var.f30349a = -size;
                this.f28373q = false;
                return g()[e()];
            }
            m01Var2.f30349a = 0;
            m01Var.f30349a = -100000;
            this.f28373q = false;
            return g()[e()];
        }
        m01Var2.f30349a = 0;
        m01Var.f30349a = -size;
        this.f28373q = false;
        return g()[e()];
    }

    public final void k() {
        this.f28362c = Integer.MIN_VALUE;
        this.d = null;
        this.f28363f = null;
        this.h = null;
        this.f28366j = null;
        this.f28368l = null;
        this.f28370n = null;
        this.f28372p = null;
        this.f28376t = null;
        this.f28375s = false;
        l();
    }

    public final void l() {
        this.e = false;
        this.f28364g = false;
        this.f28365i = false;
        this.f28367k = false;
        this.f28369m = false;
        this.f28371o = false;
        this.f28373q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f28360a) {
                str = "column";
            } else {
                str = "row";
            }
            q01.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.f28361b = i10;
    }

    public final void o(float f7, int i10) {
        n01 n01Var;
        Arrays.fill(this.f28376t, 0);
        q01 q01Var = this.f28379x;
        int childCount = q01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            l01 l01Var = q01Var.d(i11).f29416a;
            if (this.f28360a) {
                n01Var = l01Var.f30011b;
            } else {
                n01Var = l01Var.f30010a;
            }
            float f10 = n01Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f28376t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(e01[] e01VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < e01VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (e01 e01Var : e01VarArr) {
                    z11 |= m(iArr, e01Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[e01VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = e01VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, e01VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= e01VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    e01 e01Var2 = e01VarArr[i14];
                    k01 k01Var = e01Var2.f27679a;
                    if (k01Var.f29765a >= k01Var.f29766b) {
                        e01Var2.f27681c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final e01[] q(ArrayList arrayList) {
        e0.e0 e0Var = new e0.e0(this, (e01[]) arrayList.toArray(new e01[0]));
        int length = ((e01[][]) e0Var.d).length;
        for (int i10 = 0; i10 < length; i10++) {
            e0Var.g(i10);
        }
        return (e01[]) e0Var.f9530c;
    }
}
