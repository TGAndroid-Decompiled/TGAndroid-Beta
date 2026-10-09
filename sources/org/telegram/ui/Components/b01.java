package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class b01 {
    public final boolean f24818a;
    public la.h d;
    public la.h f24822f;
    public la.h h;
    public int[] f24825j;
    public int[] f24827l;
    public zz0[] f24829n;
    public int[] f24831p;
    public boolean f24833r;
    public int[] f24835t;
    public final l01 f24838x;
    public int f24819b = Integer.MIN_VALUE;
    public int f24820c = Integer.MIN_VALUE;
    public boolean f24821e = false;
    public boolean f24823g = false;
    public boolean f24824i = false;
    public boolean f24826k = false;
    public boolean f24828m = false;
    public boolean f24830o = false;
    public boolean f24832q = false;
    public boolean f24834s = false;
    public boolean f24836u = true;
    public final h01 v = new h01(0);
    public final h01 f24837w = new h01(-100000);

    public b01(l01 l01Var, boolean z10) {
        this.f24838x = l01Var;
        this.f24818a = z10;
    }

    public static void j(ArrayList arrayList, f01 f01Var, h01 h01Var, boolean z10) {
        if (f01Var.a() != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((zz0) obj).f33688a.equals(f01Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new zz0(f01Var, h01Var));
        }
    }

    public static boolean m(int[] iArr, zz0 zz0Var) {
        if (zz0Var.f33690c) {
            f01 f01Var = zz0Var.f33688a;
            int i10 = f01Var.f26205a;
            int i11 = f01Var.f26206b;
            int i12 = iArr[i10] + zz0Var.f33689b.f26920a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(la.h hVar, boolean z10) {
        for (h01 h01Var : (h01[]) ((Object[]) hVar.d)) {
            h01Var.f26920a = Integer.MIN_VALUE;
        }
        c01[] c01VarArr = (c01[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < c01VarArr.length; i10++) {
            int d = c01VarArr[i10].d(z10);
            h01 h01Var2 = (h01) ((Object[]) hVar.d)[((int[]) hVar.f15462b)[i10]];
            int i11 = h01Var2.f26920a;
            if (!z10) {
                d = -d;
            }
            h01Var2.f26920a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        i01 i01Var;
        int i10;
        if (z10) {
            iArr = this.f24825j;
        } else {
            iArr = this.f24827l;
        }
        l01 l01Var = this.f24838x;
        int childCount = l01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            e01 d = l01Var.d(i11);
            g01 g01Var = d.f25887a;
            boolean z11 = this.f24818a;
            if (z11) {
                i01Var = g01Var.f26539b;
            } else {
                i01Var = g01Var.f26538a;
            }
            f01 f01Var = i01Var.f27177b;
            if (z10) {
                i10 = f01Var.f26205a;
            } else {
                i10 = f01Var.f26206b;
            }
            iArr[i10] = Math.max(iArr[i10], l01Var.f(d, z11, z10));
        }
    }

    public final la.h c(boolean z10) {
        f01 f01Var;
        a01 a01Var = new a01(f01.class, h01.class);
        i01[] i01VarArr = (i01[]) ((Object[]) f().f15463c);
        int length = i01VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                f01Var = i01VarArr[i10].f27177b;
            } else {
                f01 f01Var2 = i01VarArr[i10].f27177b;
                f01Var = new f01(f01Var2.f26206b, f01Var2.f26205a);
            }
            ?? obj = new Object();
            obj.f26920a = Integer.MIN_VALUE;
            a01Var.add(Pair.create(f01Var, obj));
        }
        return a01Var.i();
    }

    public final zz0[] d() {
        if (this.f24829n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f24822f == null) {
                this.f24822f = c(true);
            }
            if (!this.f24823g) {
                a(this.f24822f, true);
                this.f24823g = true;
            }
            la.h hVar = this.f24822f;
            int i10 = 0;
            while (true) {
                f01[] f01VarArr = (f01[]) ((Object[]) hVar.f15463c);
                if (i10 >= f01VarArr.length) {
                    break;
                }
                j(arrayList, f01VarArr[i10], ((h01[]) ((Object[]) hVar.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f24824i) {
                a(this.h, false);
                this.f24824i = true;
            }
            la.h hVar2 = this.h;
            int i11 = 0;
            while (true) {
                f01[] f01VarArr2 = (f01[]) ((Object[]) hVar2.f15463c);
                if (i11 >= f01VarArr2.length) {
                    break;
                }
                j(arrayList2, f01VarArr2[i11], ((h01[]) ((Object[]) hVar2.d))[i11], false);
                i11++;
            }
            if (this.f24836u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new f01(i12, i13), new h01(0), true);
                    i12 = i13;
                }
            }
            int e7 = e();
            j(arrayList, new f01(0, e7), this.v, false);
            j(arrayList2, new f01(e7, 0), this.f24837w, false);
            zz0[] q6 = q(arrayList);
            zz0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(zz0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.f24829n = (zz0[]) objArr;
        }
        if (!this.f24830o) {
            if (this.f24822f == null) {
                this.f24822f = c(true);
            }
            if (!this.f24823g) {
                a(this.f24822f, true);
                this.f24823g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f24824i) {
                a(this.h, false);
                this.f24824i = true;
            }
            this.f24830o = true;
        }
        return this.f24829n;
    }

    public final int e() {
        int max = Math.max(this.f24819b, h());
        if (max <= 1024) {
            return max;
        }
        l01.g("Table grid count out of bounds");
        throw null;
    }

    public final la.h f() {
        i01 i01Var;
        int i10;
        int i11;
        int i12;
        i01 i01Var2;
        c01 c01Var;
        la.h hVar = this.d;
        boolean z10 = this.f24818a;
        l01 l01Var = this.f24838x;
        if (hVar == null) {
            a01 a01Var = new a01(i01.class, c01.class);
            int childCount = l01Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                g01 g01Var = l01Var.d(i13).f25887a;
                if (z10) {
                    i01Var2 = g01Var.f26539b;
                } else {
                    i01Var2 = g01Var.f26538a;
                }
                switch (i01.a(i01Var2, z10).f33051a) {
                    case 3:
                        c01Var = new c01();
                        break;
                    default:
                        c01Var = new c01();
                        break;
                }
                a01Var.add(Pair.create(i01Var2, c01Var));
            }
            this.d = a01Var.i();
        }
        if (!this.f24821e) {
            for (c01 c01Var2 : (c01[]) ((Object[]) this.d.d)) {
                c01Var2.c();
            }
            int childCount2 = l01Var.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                e01 d = l01Var.d(i14);
                g01 g01Var2 = d.f25887a;
                if (z10) {
                    i01Var = g01Var2.f26539b;
                } else {
                    i01Var = g01Var2.f26538a;
                }
                if (z10) {
                    i10 = d.f25895k;
                } else {
                    i10 = d.f25896l;
                }
                int e7 = l01Var.e(d, z10, false) + l01Var.e(d, z10, true) + i10;
                float f7 = i01Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f24835t[i14];
                }
                int i15 = e7 + i11;
                la.h hVar2 = this.d;
                c01 c01Var3 = (c01) ((Object[]) hVar2.d)[((int[]) hVar2.f15462b)[i14]];
                int i16 = c01Var3.f25201c;
                if (i01Var.f27178c == l01.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                c01Var3.f25201c = i12 & i16;
                int a2 = i01.a(i01Var, z10).a(d, i15);
                c01Var3.b(a2, i15 - a2);
            }
            this.f24821e = true;
        }
        return this.d;
    }

    public final int[] g() {
        i01 i01Var;
        boolean z10;
        i01 i01Var2;
        if (this.f24831p == null) {
            this.f24831p = new int[e() + 1];
        }
        if (!this.f24832q) {
            int[] iArr = this.f24831p;
            boolean z11 = this.f24834s;
            float f7 = 0.0f;
            boolean z12 = this.f24818a;
            l01 l01Var = this.f24838x;
            if (!z11) {
                int childCount = l01Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        g01 g01Var = l01Var.d(i10).f25887a;
                        if (z12) {
                            i01Var2 = g01Var.f26539b;
                        } else {
                            i01Var2 = g01Var.f26538a;
                        }
                        if (i01Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f24833r = z10;
                this.f24834s = true;
            }
            if (!this.f24833r) {
                p(d(), iArr, true);
            } else {
                if (this.f24835t == null) {
                    this.f24835t = new int[l01Var.getChildCount()];
                }
                Arrays.fill(this.f24835t, 0);
                p(d(), iArr, true);
                int childCount2 = (l01Var.getChildCount() * this.v.f26920a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = l01Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        g01 g01Var2 = l01Var.d(i11).f25887a;
                        if (z12) {
                            i01Var = g01Var2.f26539b;
                        } else {
                            i01Var = g01Var2.f26538a;
                        }
                        f7 += i01Var.d;
                    }
                    int i12 = -1;
                    boolean z13 = true;
                    int i13 = 0;
                    while (i13 < childCount2) {
                        int i14 = (int) ((i13 + childCount2) / 2);
                        l();
                        o(f7, i14);
                        boolean p5 = p(d(), iArr, false);
                        if (p5) {
                            i13 = i14 + 1;
                            i12 = i14;
                        } else {
                            childCount2 = i14;
                        }
                        z13 = p5;
                    }
                    if (i12 > 0 && !z13) {
                        l();
                        o(f7, i12);
                        p(d(), iArr, true);
                    }
                }
            }
            if (!this.f24836u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f24832q = true;
        }
        return this.f24831p;
    }

    public final int h() {
        i01 i01Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f24820c == Integer.MIN_VALUE) {
            l01 l01Var = this.f24838x;
            int childCount = l01Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                g01 g01Var = l01Var.d(i12).f25887a;
                if (this.f24818a) {
                    i01Var = g01Var.f26539b;
                } else {
                    i01Var = g01Var.f26538a;
                }
                f01 f01Var = i01Var.f27177b;
                i11 = Math.max(Math.max(Math.max(i11, f01Var.f26205a), f01Var.f26206b), f01Var.a());
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f24820c = Math.max(0, i10);
        }
        return this.f24820c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        h01 h01Var = this.f24837w;
        h01 h01Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                h01Var2.f26920a = size;
                h01Var.f26920a = -size;
                this.f24832q = false;
                return g()[e()];
            }
            h01Var2.f26920a = 0;
            h01Var.f26920a = -100000;
            this.f24832q = false;
            return g()[e()];
        }
        h01Var2.f26920a = 0;
        h01Var.f26920a = -size;
        this.f24832q = false;
        return g()[e()];
    }

    public final void k() {
        this.f24820c = Integer.MIN_VALUE;
        this.d = null;
        this.f24822f = null;
        this.h = null;
        this.f24825j = null;
        this.f24827l = null;
        this.f24829n = null;
        this.f24831p = null;
        this.f24835t = null;
        this.f24834s = false;
        l();
    }

    public final void l() {
        this.f24821e = false;
        this.f24823g = false;
        this.f24824i = false;
        this.f24826k = false;
        this.f24828m = false;
        this.f24830o = false;
        this.f24832q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f24818a) {
                str = "column";
            } else {
                str = "row";
            }
            l01.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.f24819b = i10;
    }

    public final void o(float f7, int i10) {
        i01 i01Var;
        Arrays.fill(this.f24835t, 0);
        l01 l01Var = this.f24838x;
        int childCount = l01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            g01 g01Var = l01Var.d(i11).f25887a;
            if (this.f24818a) {
                i01Var = g01Var.f26539b;
            } else {
                i01Var = g01Var.f26538a;
            }
            float f10 = i01Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f24835t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(zz0[] zz0VarArr, int[] iArr, boolean z10) {
        int e7 = e() + 1;
        loop0: for (int i10 = 0; i10 < zz0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e7; i11++) {
                boolean z11 = false;
                for (zz0 zz0Var : zz0VarArr) {
                    z11 |= m(iArr, zz0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[zz0VarArr.length];
            for (int i12 = 0; i12 < e7; i12++) {
                int length = zz0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, zz0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= zz0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    zz0 zz0Var2 = zz0VarArr[i14];
                    f01 f01Var = zz0Var2.f33688a;
                    if (f01Var.f26205a >= f01Var.f26206b) {
                        zz0Var2.f33690c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final zz0[] q(ArrayList arrayList) {
        e0.g0 g0Var = new e0.g0(this, (zz0[]) arrayList.toArray(new zz0[0]));
        int length = ((zz0[][]) g0Var.f8414c).length;
        for (int i10 = 0; i10 < length; i10++) {
            g0Var.f(i10);
        }
        return (zz0[]) g0Var.f8413b;
    }
}
