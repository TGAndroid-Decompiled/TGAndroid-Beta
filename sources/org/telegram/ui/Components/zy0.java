package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class zy0 {
    public final boolean f30682a;
    public lf.i d;
    public lf.i f30685f;
    public lf.i h;
    public int[] f30688j;
    public int[] f30690l;
    public xy0[] f30692n;
    public int[] f30694p;
    public boolean f30696r;
    public int[] f30698t;
    public final jz0 f30701x;
    public int f30683b = Integer.MIN_VALUE;
    public int f30684c = Integer.MIN_VALUE;
    public boolean e = false;
    public boolean f30686g = false;
    public boolean f30687i = false;
    public boolean f30689k = false;
    public boolean f30691m = false;
    public boolean f30693o = false;
    public boolean f30695q = false;
    public boolean f30697s = false;
    public boolean f30699u = true;
    public final fz0 v = new fz0(0);
    public final fz0 f30700w = new fz0(-100000);

    public zy0(jz0 jz0Var, boolean z10) {
        this.f30701x = jz0Var;
        this.f30682a = z10;
    }

    public static void j(ArrayList arrayList, dz0 dz0Var, fz0 fz0Var, boolean z10) {
        if (dz0Var.f23492b - dz0Var.f23491a != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((xy0) obj).f30096a.equals(dz0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new xy0(dz0Var, fz0Var));
        }
    }

    public static boolean m(int[] iArr, xy0 xy0Var) {
        if (xy0Var.f30098c) {
            dz0 dz0Var = xy0Var.f30096a;
            int i10 = dz0Var.f23491a;
            int i11 = dz0Var.f23492b;
            int i12 = iArr[i10] + xy0Var.f30097b.f24113a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(lf.i iVar, boolean z10) {
        for (fz0 fz0Var : (fz0[]) ((Object[]) iVar.d)) {
            fz0Var.f24113a = Integer.MIN_VALUE;
        }
        az0[] az0VarArr = (az0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < az0VarArr.length; i10++) {
            int d = az0VarArr[i10].d(z10);
            fz0 fz0Var2 = (fz0) ((Object[]) iVar.d)[((int[]) iVar.f14011b)[i10]];
            int i11 = fz0Var2.f24113a;
            if (!z10) {
                d = -d;
            }
            fz0Var2.f24113a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        gz0 gz0Var;
        int i10;
        if (z10) {
            iArr = this.f30688j;
        } else {
            iArr = this.f30690l;
        }
        jz0 jz0Var = this.f30701x;
        int childCount = jz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            cz0 d = jz0Var.d(i11);
            ez0 ez0Var = d.f23152a;
            boolean z11 = this.f30682a;
            if (z11) {
                gz0Var = ez0Var.f23777b;
            } else {
                gz0Var = ez0Var.f23776a;
            }
            dz0 dz0Var = gz0Var.f24461b;
            if (z10) {
                i10 = dz0Var.f23491a;
            } else {
                i10 = dz0Var.f23492b;
            }
            iArr[i10] = Math.max(iArr[i10], jz0Var.f(d, z11, z10));
        }
    }

    public final lf.i c(boolean z10) {
        dz0 dz0Var;
        yy0 yy0Var = new yy0(dz0.class, fz0.class);
        gz0[] gz0VarArr = (gz0[]) ((Object[]) f().f14012c);
        int length = gz0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                dz0Var = gz0VarArr[i10].f24461b;
            } else {
                dz0 dz0Var2 = gz0VarArr[i10].f24461b;
                dz0Var = new dz0(dz0Var2.f23492b, dz0Var2.f23491a);
            }
            ?? obj = new Object();
            obj.f24113a = Integer.MIN_VALUE;
            yy0Var.add(Pair.create(dz0Var, obj));
        }
        return yy0Var.i();
    }

    public final xy0[] d() {
        if (this.f30692n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f30685f == null) {
                this.f30685f = c(true);
            }
            if (!this.f30686g) {
                a(this.f30685f, true);
                this.f30686g = true;
            }
            lf.i iVar = this.f30685f;
            int i10 = 0;
            while (true) {
                dz0[] dz0VarArr = (dz0[]) ((Object[]) iVar.f14012c);
                if (i10 >= dz0VarArr.length) {
                    break;
                }
                j(arrayList, dz0VarArr[i10], ((fz0[]) ((Object[]) iVar.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f30687i) {
                a(this.h, false);
                this.f30687i = true;
            }
            lf.i iVar2 = this.h;
            int i11 = 0;
            while (true) {
                dz0[] dz0VarArr2 = (dz0[]) ((Object[]) iVar2.f14012c);
                if (i11 >= dz0VarArr2.length) {
                    break;
                }
                j(arrayList2, dz0VarArr2[i11], ((fz0[]) ((Object[]) iVar2.d))[i11], false);
                i11++;
            }
            if (this.f30699u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new dz0(i12, i13), new fz0(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new dz0(0, e), this.v, false);
            j(arrayList2, new dz0(e, 0), this.f30700w, false);
            xy0[] q6 = q(arrayList);
            xy0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(xy0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.f30692n = (xy0[]) objArr;
        }
        if (!this.f30693o) {
            if (this.f30685f == null) {
                this.f30685f = c(true);
            }
            if (!this.f30686g) {
                a(this.f30685f, true);
                this.f30686g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f30687i) {
                a(this.h, false);
                this.f30687i = true;
            }
            this.f30693o = true;
        }
        return this.f30692n;
    }

    public final int e() {
        return Math.max(this.f30683b, h());
    }

    public final lf.i f() {
        gz0 gz0Var;
        int i10;
        int i11;
        int i12;
        gz0 gz0Var2;
        az0 az0Var;
        lf.i iVar = this.d;
        boolean z10 = this.f30682a;
        jz0 jz0Var = this.f30701x;
        if (iVar == null) {
            yy0 yy0Var = new yy0(gz0.class, az0.class);
            int childCount = jz0Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                ez0 ez0Var = jz0Var.d(i13).f23152a;
                if (z10) {
                    gz0Var2 = ez0Var.f23777b;
                } else {
                    gz0Var2 = ez0Var.f23776a;
                }
                switch (gz0.a(gz0Var2, z10).f29436a) {
                    case 3:
                        az0Var = new az0();
                        break;
                    default:
                        az0Var = new az0();
                        break;
                }
                yy0Var.add(Pair.create(gz0Var2, az0Var));
            }
            this.d = yy0Var.i();
        }
        if (!this.e) {
            for (az0 az0Var2 : (az0[]) ((Object[]) this.d.d)) {
                az0Var2.c();
            }
            int childCount2 = jz0Var.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                cz0 d = jz0Var.d(i14);
                ez0 ez0Var2 = d.f23152a;
                if (z10) {
                    gz0Var = ez0Var2.f23777b;
                } else {
                    gz0Var = ez0Var2.f23776a;
                }
                if (z10) {
                    i10 = d.f23159k;
                } else {
                    i10 = d.f23160l;
                }
                int e = jz0Var.e(d, z10, false) + jz0Var.e(d, z10, true) + i10;
                float f7 = gz0Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f30698t[i14];
                }
                int i15 = e + i11;
                lf.i iVar2 = this.d;
                az0 az0Var3 = (az0) ((Object[]) iVar2.d)[((int[]) iVar2.f14011b)[i14]];
                int i16 = az0Var3.f22536c;
                if (gz0Var.f24462c == jz0.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                az0Var3.f22536c = i12 & i16;
                int a2 = gz0.a(gz0Var, z10).a(d, i15);
                az0Var3.b(a2, i15 - a2);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] g() {
        gz0 gz0Var;
        boolean z10;
        gz0 gz0Var2;
        if (this.f30694p == null) {
            this.f30694p = new int[e() + 1];
        }
        if (!this.f30695q) {
            int[] iArr = this.f30694p;
            boolean z11 = this.f30697s;
            float f7 = 0.0f;
            boolean z12 = this.f30682a;
            jz0 jz0Var = this.f30701x;
            if (!z11) {
                int childCount = jz0Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        ez0 ez0Var = jz0Var.d(i10).f23152a;
                        if (z12) {
                            gz0Var2 = ez0Var.f23777b;
                        } else {
                            gz0Var2 = ez0Var.f23776a;
                        }
                        if (gz0Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f30696r = z10;
                this.f30697s = true;
            }
            if (!this.f30696r) {
                p(d(), iArr, true);
            } else {
                if (this.f30698t == null) {
                    this.f30698t = new int[jz0Var.getChildCount()];
                }
                Arrays.fill(this.f30698t, 0);
                p(d(), iArr, true);
                int childCount2 = (jz0Var.getChildCount() * this.v.f24113a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = jz0Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        ez0 ez0Var2 = jz0Var.d(i11).f23152a;
                        if (z12) {
                            gz0Var = ez0Var2.f23777b;
                        } else {
                            gz0Var = ez0Var2.f23776a;
                        }
                        f7 += gz0Var.d;
                    }
                    int i12 = -1;
                    int i13 = 0;
                    boolean z13 = true;
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
            if (!this.f30699u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f30695q = true;
        }
        return this.f30694p;
    }

    public final int h() {
        gz0 gz0Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f30684c == Integer.MIN_VALUE) {
            jz0 jz0Var = this.f30701x;
            int childCount = jz0Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                ez0 ez0Var = jz0Var.d(i12).f23152a;
                if (this.f30682a) {
                    gz0Var = ez0Var.f23777b;
                } else {
                    gz0Var = ez0Var.f23776a;
                }
                dz0 dz0Var = gz0Var.f24461b;
                int i13 = dz0Var.f23491a;
                int i14 = dz0Var.f23492b;
                i11 = Math.max(Math.max(Math.max(i11, i13), i14), i14 - dz0Var.f23491a);
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f30684c = Math.max(0, i10);
        }
        return this.f30684c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        fz0 fz0Var = this.f30700w;
        fz0 fz0Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                fz0Var2.f24113a = size;
                fz0Var.f24113a = -size;
                this.f30695q = false;
                return g()[e()];
            }
            fz0Var2.f24113a = 0;
            fz0Var.f24113a = -100000;
            this.f30695q = false;
            return g()[e()];
        }
        fz0Var2.f24113a = 0;
        fz0Var.f24113a = -size;
        this.f30695q = false;
        return g()[e()];
    }

    public final void k() {
        this.f30684c = Integer.MIN_VALUE;
        this.d = null;
        this.f30685f = null;
        this.h = null;
        this.f30688j = null;
        this.f30690l = null;
        this.f30692n = null;
        this.f30694p = null;
        this.f30698t = null;
        this.f30697s = false;
        l();
    }

    public final void l() {
        this.e = false;
        this.f30686g = false;
        this.f30687i = false;
        this.f30689k = false;
        this.f30691m = false;
        this.f30693o = false;
        this.f30695q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f30682a) {
                str = "column";
            } else {
                str = "row";
            }
            throw new IllegalArgumentException(w.c.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"), ". "));
        }
        this.f30683b = i10;
    }

    public final void o(float f7, int i10) {
        gz0 gz0Var;
        Arrays.fill(this.f30698t, 0);
        jz0 jz0Var = this.f30701x;
        int childCount = jz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ez0 ez0Var = jz0Var.d(i11).f23152a;
            if (this.f30682a) {
                gz0Var = ez0Var.f23777b;
            } else {
                gz0Var = ez0Var.f23776a;
            }
            float f10 = gz0Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f30698t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(xy0[] xy0VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < xy0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (xy0 xy0Var : xy0VarArr) {
                    z11 |= m(iArr, xy0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[xy0VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = xy0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, xy0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= xy0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    xy0 xy0Var2 = xy0VarArr[i14];
                    dz0 dz0Var = xy0Var2.f30096a;
                    if (dz0Var.f23491a >= dz0Var.f23492b) {
                        xy0Var2.f30098c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final xy0[] q(ArrayList arrayList) {
        e0.i0 i0Var = new e0.i0(this, (xy0[]) arrayList.toArray(new xy0[0]));
        int length = ((xy0[][]) i0Var.f7774c).length;
        for (int i10 = 0; i10 < length; i10++) {
            i0Var.f(i10);
        }
        return (xy0[]) i0Var.f7773b;
    }
}
