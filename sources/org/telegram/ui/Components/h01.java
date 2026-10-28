package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class h01 {
    public final boolean f28788a;
    public k6.c d;
    public k6.c f28791f;
    public k6.c h;
    public int[] f28794j;
    public int[] f28796l;
    public f01[] f28798n;
    public int[] f28800p;
    public boolean f28802r;
    public int[] f28804t;
    public final r01 f28807x;
    public int f28789b = Integer.MIN_VALUE;
    public int f28790c = Integer.MIN_VALUE;
    public boolean e = false;
    public boolean f28792g = false;
    public boolean f28793i = false;
    public boolean f28795k = false;
    public boolean f28797m = false;
    public boolean f28799o = false;
    public boolean f28801q = false;
    public boolean f28803s = false;
    public boolean f28805u = true;
    public final n01 v = new n01(0);
    public final n01 f28806w = new n01(-100000);

    public h01(r01 r01Var, boolean z10) {
        this.f28807x = r01Var;
        this.f28788a = z10;
    }

    public static void j(ArrayList arrayList, l01 l01Var, n01 n01Var, boolean z10) {
        if (l01Var.a() != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((f01) obj).f27973a.equals(l01Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new f01(l01Var, n01Var));
        }
    }

    public static boolean m(int[] iArr, f01 f01Var) {
        if (f01Var.f27975c) {
            l01 l01Var = f01Var.f27973a;
            int i10 = l01Var.f30077a;
            int i11 = l01Var.f30078b;
            int i12 = iArr[i10] + f01Var.f27974b.f30691a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(k6.c cVar, boolean z10) {
        for (n01 n01Var : (n01[]) ((Object[]) cVar.d)) {
            n01Var.f30691a = Integer.MIN_VALUE;
        }
        i01[] i01VarArr = (i01[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < i01VarArr.length; i10++) {
            int d = i01VarArr[i10].d(z10);
            n01 n01Var2 = (n01) ((Object[]) cVar.d)[((int[]) cVar.f16405b)[i10]];
            int i11 = n01Var2.f30691a;
            if (!z10) {
                d = -d;
            }
            n01Var2.f30691a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        o01 o01Var;
        int i10;
        if (z10) {
            iArr = this.f28794j;
        } else {
            iArr = this.f28796l;
        }
        r01 r01Var = this.f28807x;
        int childCount = r01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            k01 d = r01Var.d(i11);
            m01 m01Var = d.f29799a;
            boolean z11 = this.f28788a;
            if (z11) {
                o01Var = m01Var.f30330b;
            } else {
                o01Var = m01Var.f30329a;
            }
            l01 l01Var = o01Var.f31120b;
            if (z10) {
                i10 = l01Var.f30077a;
            } else {
                i10 = l01Var.f30078b;
            }
            iArr[i10] = Math.max(iArr[i10], r01Var.f(d, z11, z10));
        }
    }

    public final k6.c c(boolean z10) {
        l01 l01Var;
        g01 g01Var = new g01(l01.class, n01.class);
        o01[] o01VarArr = (o01[]) ((Object[]) f().f16406c);
        int length = o01VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                l01Var = o01VarArr[i10].f31120b;
            } else {
                l01 l01Var2 = o01VarArr[i10].f31120b;
                l01Var = new l01(l01Var2.f30078b, l01Var2.f30077a);
            }
            ?? obj = new Object();
            obj.f30691a = Integer.MIN_VALUE;
            g01Var.add(Pair.create(l01Var, obj));
        }
        return g01Var.h();
    }

    public final f01[] d() {
        if (this.f28798n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f28791f == null) {
                this.f28791f = c(true);
            }
            if (!this.f28792g) {
                a(this.f28791f, true);
                this.f28792g = true;
            }
            k6.c cVar = this.f28791f;
            int i10 = 0;
            while (true) {
                l01[] l01VarArr = (l01[]) ((Object[]) cVar.f16406c);
                if (i10 >= l01VarArr.length) {
                    break;
                }
                j(arrayList, l01VarArr[i10], ((n01[]) ((Object[]) cVar.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f28793i) {
                a(this.h, false);
                this.f28793i = true;
            }
            k6.c cVar2 = this.h;
            int i11 = 0;
            while (true) {
                l01[] l01VarArr2 = (l01[]) ((Object[]) cVar2.f16406c);
                if (i11 >= l01VarArr2.length) {
                    break;
                }
                j(arrayList2, l01VarArr2[i11], ((n01[]) ((Object[]) cVar2.d))[i11], false);
                i11++;
            }
            if (this.f28805u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new l01(i12, i13), new n01(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new l01(0, e), this.v, false);
            j(arrayList2, new l01(e, 0), this.f28806w, false);
            f01[] q5 = q(arrayList);
            f01[] q9 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(f01[].class.getComponentType(), q5.length + q9.length);
            System.arraycopy(q5, 0, objArr, 0, q5.length);
            System.arraycopy(q9, 0, objArr, q5.length, q9.length);
            this.f28798n = (f01[]) objArr;
        }
        if (!this.f28799o) {
            if (this.f28791f == null) {
                this.f28791f = c(true);
            }
            if (!this.f28792g) {
                a(this.f28791f, true);
                this.f28792g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f28793i) {
                a(this.h, false);
                this.f28793i = true;
            }
            this.f28799o = true;
        }
        return this.f28798n;
    }

    public final int e() {
        int max = Math.max(this.f28789b, h());
        if (max <= 1024) {
            return max;
        }
        r01.g("Table grid count out of bounds");
        throw null;
    }

    public final k6.c f() {
        o01 o01Var;
        int i10;
        int i11;
        int i12;
        o01 o01Var2;
        k6.c cVar = this.d;
        boolean z10 = this.f28788a;
        r01 r01Var = this.f28807x;
        if (cVar == null) {
            g01 g01Var = new g01(o01.class, i01.class);
            int childCount = r01Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                m01 m01Var = r01Var.d(i13).f29799a;
                if (z10) {
                    o01Var2 = m01Var.f30330b;
                } else {
                    o01Var2 = m01Var.f30329a;
                }
                g01Var.add(Pair.create(o01Var2, o01.a(o01Var2, z10).G()));
            }
            this.d = g01Var.h();
        }
        if (!this.e) {
            for (i01 i01Var : (i01[]) ((Object[]) this.d.d)) {
                i01Var.c();
            }
            int childCount2 = r01Var.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                k01 d = r01Var.d(i14);
                m01 m01Var2 = d.f29799a;
                if (z10) {
                    o01Var = m01Var2.f30330b;
                } else {
                    o01Var = m01Var2.f30329a;
                }
                if (z10) {
                    i10 = d.f29806k;
                } else {
                    i10 = d.f29807l;
                }
                int e = r01Var.e(d, z10, false) + r01Var.e(d, z10, true) + i10;
                float f7 = o01Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f28804t[i14];
                }
                int i15 = e + i11;
                k6.c cVar2 = this.d;
                i01 i01Var2 = (i01) ((Object[]) cVar2.d)[((int[]) cVar2.f16405b)[i14]];
                int i16 = i01Var2.f29170c;
                if (o01Var.f31121c == r01.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                i01Var2.f29170c = i12 & i16;
                int F = o01.a(o01Var, z10).F(d, i15);
                i01Var2.b(F, i15 - F);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] g() {
        o01 o01Var;
        boolean z10;
        o01 o01Var2;
        if (this.f28800p == null) {
            this.f28800p = new int[e() + 1];
        }
        if (!this.f28801q) {
            int[] iArr = this.f28800p;
            boolean z11 = this.f28803s;
            float f7 = 0.0f;
            boolean z12 = this.f28788a;
            r01 r01Var = this.f28807x;
            if (!z11) {
                int childCount = r01Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        m01 m01Var = r01Var.d(i10).f29799a;
                        if (z12) {
                            o01Var2 = m01Var.f30330b;
                        } else {
                            o01Var2 = m01Var.f30329a;
                        }
                        if (o01Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f28802r = z10;
                this.f28803s = true;
            }
            if (!this.f28802r) {
                p(d(), iArr, true);
            } else {
                if (this.f28804t == null) {
                    this.f28804t = new int[r01Var.getChildCount()];
                }
                Arrays.fill(this.f28804t, 0);
                p(d(), iArr, true);
                int childCount2 = (r01Var.getChildCount() * this.v.f30691a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = r01Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        m01 m01Var2 = r01Var.d(i11).f29799a;
                        if (z12) {
                            o01Var = m01Var2.f30330b;
                        } else {
                            o01Var = m01Var2.f30329a;
                        }
                        f7 += o01Var.d;
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
            if (!this.f28805u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f28801q = true;
        }
        return this.f28800p;
    }

    public final int h() {
        o01 o01Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f28790c == Integer.MIN_VALUE) {
            r01 r01Var = this.f28807x;
            int childCount = r01Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                m01 m01Var = r01Var.d(i12).f29799a;
                if (this.f28788a) {
                    o01Var = m01Var.f30330b;
                } else {
                    o01Var = m01Var.f30329a;
                }
                l01 l01Var = o01Var.f31120b;
                i11 = Math.max(Math.max(Math.max(i11, l01Var.f30077a), l01Var.f30078b), l01Var.a());
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f28790c = Math.max(0, i10);
        }
        return this.f28790c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        n01 n01Var = this.f28806w;
        n01 n01Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                n01Var2.f30691a = size;
                n01Var.f30691a = -size;
                this.f28801q = false;
                return g()[e()];
            }
            n01Var2.f30691a = 0;
            n01Var.f30691a = -100000;
            this.f28801q = false;
            return g()[e()];
        }
        n01Var2.f30691a = 0;
        n01Var.f30691a = -size;
        this.f28801q = false;
        return g()[e()];
    }

    public final void k() {
        this.f28790c = Integer.MIN_VALUE;
        this.d = null;
        this.f28791f = null;
        this.h = null;
        this.f28794j = null;
        this.f28796l = null;
        this.f28798n = null;
        this.f28800p = null;
        this.f28804t = null;
        this.f28803s = false;
        l();
    }

    public final void l() {
        this.e = false;
        this.f28792g = false;
        this.f28793i = false;
        this.f28795k = false;
        this.f28797m = false;
        this.f28799o = false;
        this.f28801q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f28788a) {
                str = "column";
            } else {
                str = "row";
            }
            r01.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.f28789b = i10;
    }

    public final void o(float f7, int i10) {
        o01 o01Var;
        Arrays.fill(this.f28804t, 0);
        r01 r01Var = this.f28807x;
        int childCount = r01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            m01 m01Var = r01Var.d(i11).f29799a;
            if (this.f28788a) {
                o01Var = m01Var.f30330b;
            } else {
                o01Var = m01Var.f30329a;
            }
            float f10 = o01Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f28804t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(f01[] f01VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < f01VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (f01 f01Var : f01VarArr) {
                    z11 |= m(iArr, f01Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[f01VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = f01VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, f01VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= f01VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    f01 f01Var2 = f01VarArr[i14];
                    l01 l01Var = f01Var2.f27973a;
                    if (l01Var.f30077a >= l01Var.f30078b) {
                        f01Var2.f27975c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final f01[] q(ArrayList arrayList) {
        e0.e0 e0Var = new e0.e0(this, (f01[]) arrayList.toArray(new f01[0]));
        int length = ((f01[][]) e0Var.d).length;
        for (int i10 = 0; i10 < length; i10++) {
            e0Var.g(i10);
        }
        return (f01[]) e0Var.f9529c;
    }
}
