package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class g01 {
    public final boolean f28362a;
    public k6.c d;
    public k6.c f28365f;
    public k6.c h;
    public int[] f28368j;
    public int[] f28370l;
    public e01[] f28372n;
    public int[] f28374p;
    public boolean f28376r;
    public int[] f28378t;
    public final q01 f28381x;
    public int f28363b = Integer.MIN_VALUE;
    public int f28364c = Integer.MIN_VALUE;
    public boolean e = false;
    public boolean f28366g = false;
    public boolean f28367i = false;
    public boolean f28369k = false;
    public boolean f28371m = false;
    public boolean f28373o = false;
    public boolean f28375q = false;
    public boolean f28377s = false;
    public boolean f28379u = true;
    public final m01 v = new m01(0);
    public final m01 f28380w = new m01(-100000);

    public g01(q01 q01Var, boolean z10) {
        this.f28381x = q01Var;
        this.f28362a = z10;
    }

    public static void j(ArrayList arrayList, k01 k01Var, m01 m01Var, boolean z10) {
        if (k01Var.a() != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((e01) obj).f27681a.equals(k01Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new e01(k01Var, m01Var));
        }
    }

    public static boolean m(int[] iArr, e01 e01Var) {
        if (e01Var.f27683c) {
            k01 k01Var = e01Var.f27681a;
            int i10 = k01Var.f29767a;
            int i11 = k01Var.f29768b;
            int i12 = iArr[i10] + e01Var.f27682b.f30351a;
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
            m01Var.f30351a = Integer.MIN_VALUE;
        }
        h01[] h01VarArr = (h01[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < h01VarArr.length; i10++) {
            int d = h01VarArr[i10].d(z10);
            m01 m01Var2 = (m01) ((Object[]) cVar.d)[((int[]) cVar.f16406b)[i10]];
            int i11 = m01Var2.f30351a;
            if (!z10) {
                d = -d;
            }
            m01Var2.f30351a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        n01 n01Var;
        int i10;
        if (z10) {
            iArr = this.f28368j;
        } else {
            iArr = this.f28370l;
        }
        q01 q01Var = this.f28381x;
        int childCount = q01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            j01 d = q01Var.d(i11);
            l01 l01Var = d.f29418a;
            boolean z11 = this.f28362a;
            if (z11) {
                n01Var = l01Var.f30013b;
            } else {
                n01Var = l01Var.f30012a;
            }
            k01 k01Var = n01Var.f30792b;
            if (z10) {
                i10 = k01Var.f29767a;
            } else {
                i10 = k01Var.f29768b;
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
                k01Var = n01VarArr[i10].f30792b;
            } else {
                k01 k01Var2 = n01VarArr[i10].f30792b;
                k01Var = new k01(k01Var2.f29768b, k01Var2.f29767a);
            }
            ?? obj = new Object();
            obj.f30351a = Integer.MIN_VALUE;
            f01Var.add(Pair.create(k01Var, obj));
        }
        return f01Var.h();
    }

    public final e01[] d() {
        if (this.f28372n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f28365f == null) {
                this.f28365f = c(true);
            }
            if (!this.f28366g) {
                a(this.f28365f, true);
                this.f28366g = true;
            }
            k6.c cVar = this.f28365f;
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
            if (!this.f28367i) {
                a(this.h, false);
                this.f28367i = true;
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
            if (this.f28379u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new k01(i12, i13), new m01(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new k01(0, e), this.v, false);
            j(arrayList2, new k01(e, 0), this.f28380w, false);
            e01[] q5 = q(arrayList);
            e01[] q9 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(e01[].class.getComponentType(), q5.length + q9.length);
            System.arraycopy(q5, 0, objArr, 0, q5.length);
            System.arraycopy(q9, 0, objArr, q5.length, q9.length);
            this.f28372n = (e01[]) objArr;
        }
        if (!this.f28373o) {
            if (this.f28365f == null) {
                this.f28365f = c(true);
            }
            if (!this.f28366g) {
                a(this.f28365f, true);
                this.f28366g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f28367i) {
                a(this.h, false);
                this.f28367i = true;
            }
            this.f28373o = true;
        }
        return this.f28372n;
    }

    public final int e() {
        int max = Math.max(this.f28363b, h());
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
        boolean z10 = this.f28362a;
        q01 q01Var = this.f28381x;
        if (cVar == null) {
            f01 f01Var = new f01(n01.class, h01.class);
            int childCount = q01Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                l01 l01Var = q01Var.d(i13).f29418a;
                if (z10) {
                    n01Var2 = l01Var.f30013b;
                } else {
                    n01Var2 = l01Var.f30012a;
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
                l01 l01Var2 = d.f29418a;
                if (z10) {
                    n01Var = l01Var2.f30013b;
                } else {
                    n01Var = l01Var2.f30012a;
                }
                if (z10) {
                    i10 = d.f29425k;
                } else {
                    i10 = d.f29426l;
                }
                int e = q01Var.e(d, z10, false) + q01Var.e(d, z10, true) + i10;
                float f7 = n01Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f28378t[i14];
                }
                int i15 = e + i11;
                k6.c cVar2 = this.d;
                h01 h01Var2 = (h01) ((Object[]) cVar2.d)[((int[]) cVar2.f16406b)[i14]];
                int i16 = h01Var2.f28758c;
                if (n01Var.f30793c == q01.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                h01Var2.f28758c = i12 & i16;
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
        if (this.f28374p == null) {
            this.f28374p = new int[e() + 1];
        }
        if (!this.f28375q) {
            int[] iArr = this.f28374p;
            boolean z11 = this.f28377s;
            float f7 = 0.0f;
            boolean z12 = this.f28362a;
            q01 q01Var = this.f28381x;
            if (!z11) {
                int childCount = q01Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        l01 l01Var = q01Var.d(i10).f29418a;
                        if (z12) {
                            n01Var2 = l01Var.f30013b;
                        } else {
                            n01Var2 = l01Var.f30012a;
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
                this.f28376r = z10;
                this.f28377s = true;
            }
            if (!this.f28376r) {
                p(d(), iArr, true);
            } else {
                if (this.f28378t == null) {
                    this.f28378t = new int[q01Var.getChildCount()];
                }
                Arrays.fill(this.f28378t, 0);
                p(d(), iArr, true);
                int childCount2 = (q01Var.getChildCount() * this.v.f30351a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = q01Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        l01 l01Var2 = q01Var.d(i11).f29418a;
                        if (z12) {
                            n01Var = l01Var2.f30013b;
                        } else {
                            n01Var = l01Var2.f30012a;
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
            if (!this.f28379u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f28375q = true;
        }
        return this.f28374p;
    }

    public final int h() {
        n01 n01Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f28364c == Integer.MIN_VALUE) {
            q01 q01Var = this.f28381x;
            int childCount = q01Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                l01 l01Var = q01Var.d(i12).f29418a;
                if (this.f28362a) {
                    n01Var = l01Var.f30013b;
                } else {
                    n01Var = l01Var.f30012a;
                }
                k01 k01Var = n01Var.f30792b;
                i11 = Math.max(Math.max(Math.max(i11, k01Var.f29767a), k01Var.f29768b), k01Var.a());
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f28364c = Math.max(0, i10);
        }
        return this.f28364c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        m01 m01Var = this.f28380w;
        m01 m01Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                m01Var2.f30351a = size;
                m01Var.f30351a = -size;
                this.f28375q = false;
                return g()[e()];
            }
            m01Var2.f30351a = 0;
            m01Var.f30351a = -100000;
            this.f28375q = false;
            return g()[e()];
        }
        m01Var2.f30351a = 0;
        m01Var.f30351a = -size;
        this.f28375q = false;
        return g()[e()];
    }

    public final void k() {
        this.f28364c = Integer.MIN_VALUE;
        this.d = null;
        this.f28365f = null;
        this.h = null;
        this.f28368j = null;
        this.f28370l = null;
        this.f28372n = null;
        this.f28374p = null;
        this.f28378t = null;
        this.f28377s = false;
        l();
    }

    public final void l() {
        this.e = false;
        this.f28366g = false;
        this.f28367i = false;
        this.f28369k = false;
        this.f28371m = false;
        this.f28373o = false;
        this.f28375q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f28362a) {
                str = "column";
            } else {
                str = "row";
            }
            q01.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.f28363b = i10;
    }

    public final void o(float f7, int i10) {
        n01 n01Var;
        Arrays.fill(this.f28378t, 0);
        q01 q01Var = this.f28381x;
        int childCount = q01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            l01 l01Var = q01Var.d(i11).f29418a;
            if (this.f28362a) {
                n01Var = l01Var.f30013b;
            } else {
                n01Var = l01Var.f30012a;
            }
            float f10 = n01Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f28378t[i11] = round;
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
                    k01 k01Var = e01Var2.f27681a;
                    if (k01Var.f29767a >= k01Var.f29768b) {
                        e01Var2.f27683c = false;
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
