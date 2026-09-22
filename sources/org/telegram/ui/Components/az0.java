package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class az0 {
    public final boolean f22517a;
    public lf.i d;
    public lf.i f22520f;
    public lf.i h;
    public int[] f22523j;
    public int[] f22525l;
    public yy0[] f22527n;
    public int[] f22529p;
    public boolean f22531r;
    public int[] f22533t;
    public final kz0 f22536x;
    public int f22518b = Integer.MIN_VALUE;
    public int f22519c = Integer.MIN_VALUE;
    public boolean e = false;
    public boolean f22521g = false;
    public boolean f22522i = false;
    public boolean f22524k = false;
    public boolean f22526m = false;
    public boolean f22528o = false;
    public boolean f22530q = false;
    public boolean f22532s = false;
    public boolean f22534u = true;
    public final gz0 v = new gz0(0);
    public final gz0 f22535w = new gz0(-100000);

    public az0(kz0 kz0Var, boolean z10) {
        this.f22536x = kz0Var;
        this.f22517a = z10;
    }

    public static void j(ArrayList arrayList, ez0 ez0Var, gz0 gz0Var, boolean z10) {
        if (ez0Var.f23765b - ez0Var.f23764a != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((yy0) obj).f30427a.equals(ez0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new yy0(ez0Var, gz0Var));
        }
    }

    public static boolean m(int[] iArr, yy0 yy0Var) {
        if (yy0Var.f30429c) {
            ez0 ez0Var = yy0Var.f30427a;
            int i10 = ez0Var.f23764a;
            int i11 = ez0Var.f23765b;
            int i12 = iArr[i10] + yy0Var.f30428b.f24479a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(lf.i iVar, boolean z10) {
        for (gz0 gz0Var : (gz0[]) ((Object[]) iVar.d)) {
            gz0Var.f24479a = Integer.MIN_VALUE;
        }
        bz0[] bz0VarArr = (bz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < bz0VarArr.length; i10++) {
            int d = bz0VarArr[i10].d(z10);
            gz0 gz0Var2 = (gz0) ((Object[]) iVar.d)[((int[]) iVar.f14021b)[i10]];
            int i11 = gz0Var2.f24479a;
            if (!z10) {
                d = -d;
            }
            gz0Var2.f24479a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        hz0 hz0Var;
        int i10;
        if (z10) {
            iArr = this.f22523j;
        } else {
            iArr = this.f22525l;
        }
        kz0 kz0Var = this.f22536x;
        int childCount = kz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            dz0 d = kz0Var.d(i11);
            fz0 fz0Var = d.f23433a;
            boolean z11 = this.f22517a;
            if (z11) {
                hz0Var = fz0Var.f24128b;
            } else {
                hz0Var = fz0Var.f24127a;
            }
            ez0 ez0Var = hz0Var.f24828b;
            if (z10) {
                i10 = ez0Var.f23764a;
            } else {
                i10 = ez0Var.f23765b;
            }
            iArr[i10] = Math.max(iArr[i10], kz0Var.f(d, z11, z10));
        }
    }

    public final lf.i c(boolean z10) {
        ez0 ez0Var;
        zy0 zy0Var = new zy0(ez0.class, gz0.class);
        hz0[] hz0VarArr = (hz0[]) ((Object[]) f().f14022c);
        int length = hz0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                ez0Var = hz0VarArr[i10].f24828b;
            } else {
                ez0 ez0Var2 = hz0VarArr[i10].f24828b;
                ez0Var = new ez0(ez0Var2.f23765b, ez0Var2.f23764a);
            }
            ?? obj = new Object();
            obj.f24479a = Integer.MIN_VALUE;
            zy0Var.add(Pair.create(ez0Var, obj));
        }
        return zy0Var.i();
    }

    public final yy0[] d() {
        if (this.f22527n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f22520f == null) {
                this.f22520f = c(true);
            }
            if (!this.f22521g) {
                a(this.f22520f, true);
                this.f22521g = true;
            }
            lf.i iVar = this.f22520f;
            int i10 = 0;
            while (true) {
                ez0[] ez0VarArr = (ez0[]) ((Object[]) iVar.f14022c);
                if (i10 >= ez0VarArr.length) {
                    break;
                }
                j(arrayList, ez0VarArr[i10], ((gz0[]) ((Object[]) iVar.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f22522i) {
                a(this.h, false);
                this.f22522i = true;
            }
            lf.i iVar2 = this.h;
            int i11 = 0;
            while (true) {
                ez0[] ez0VarArr2 = (ez0[]) ((Object[]) iVar2.f14022c);
                if (i11 >= ez0VarArr2.length) {
                    break;
                }
                j(arrayList2, ez0VarArr2[i11], ((gz0[]) ((Object[]) iVar2.d))[i11], false);
                i11++;
            }
            if (this.f22534u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new ez0(i12, i13), new gz0(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new ez0(0, e), this.v, false);
            j(arrayList2, new ez0(e, 0), this.f22535w, false);
            yy0[] q6 = q(arrayList);
            yy0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(yy0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.f22527n = (yy0[]) objArr;
        }
        if (!this.f22528o) {
            if (this.f22520f == null) {
                this.f22520f = c(true);
            }
            if (!this.f22521g) {
                a(this.f22520f, true);
                this.f22521g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f22522i) {
                a(this.h, false);
                this.f22522i = true;
            }
            this.f22528o = true;
        }
        return this.f22527n;
    }

    public final int e() {
        return Math.max(this.f22518b, h());
    }

    public final lf.i f() {
        hz0 hz0Var;
        int i10;
        int i11;
        int i12;
        hz0 hz0Var2;
        bz0 bz0Var;
        lf.i iVar = this.d;
        boolean z10 = this.f22517a;
        kz0 kz0Var = this.f22536x;
        if (iVar == null) {
            zy0 zy0Var = new zy0(hz0.class, bz0.class);
            int childCount = kz0Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                fz0 fz0Var = kz0Var.d(i13).f23433a;
                if (z10) {
                    hz0Var2 = fz0Var.f24128b;
                } else {
                    hz0Var2 = fz0Var.f24127a;
                }
                switch (hz0.a(hz0Var2, z10).f29828a) {
                    case 3:
                        bz0Var = new bz0();
                        break;
                    default:
                        bz0Var = new bz0();
                        break;
                }
                zy0Var.add(Pair.create(hz0Var2, bz0Var));
            }
            this.d = zy0Var.i();
        }
        if (!this.e) {
            for (bz0 bz0Var2 : (bz0[]) ((Object[]) this.d.d)) {
                bz0Var2.c();
            }
            int childCount2 = kz0Var.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                dz0 d = kz0Var.d(i14);
                fz0 fz0Var2 = d.f23433a;
                if (z10) {
                    hz0Var = fz0Var2.f24128b;
                } else {
                    hz0Var = fz0Var2.f24127a;
                }
                if (z10) {
                    i10 = d.f23440k;
                } else {
                    i10 = d.f23441l;
                }
                int e = kz0Var.e(d, z10, false) + kz0Var.e(d, z10, true) + i10;
                float f7 = hz0Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f22533t[i14];
                }
                int i15 = e + i11;
                lf.i iVar2 = this.d;
                bz0 bz0Var3 = (bz0) ((Object[]) iVar2.d)[((int[]) iVar2.f14021b)[i14]];
                int i16 = bz0Var3.f22892c;
                if (hz0Var.f24829c == kz0.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                bz0Var3.f22892c = i12 & i16;
                int a2 = hz0.a(hz0Var, z10).a(d, i15);
                bz0Var3.b(a2, i15 - a2);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] g() {
        hz0 hz0Var;
        boolean z10;
        hz0 hz0Var2;
        if (this.f22529p == null) {
            this.f22529p = new int[e() + 1];
        }
        if (!this.f22530q) {
            int[] iArr = this.f22529p;
            boolean z11 = this.f22532s;
            float f7 = 0.0f;
            boolean z12 = this.f22517a;
            kz0 kz0Var = this.f22536x;
            if (!z11) {
                int childCount = kz0Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        fz0 fz0Var = kz0Var.d(i10).f23433a;
                        if (z12) {
                            hz0Var2 = fz0Var.f24128b;
                        } else {
                            hz0Var2 = fz0Var.f24127a;
                        }
                        if (hz0Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f22531r = z10;
                this.f22532s = true;
            }
            if (!this.f22531r) {
                p(d(), iArr, true);
            } else {
                if (this.f22533t == null) {
                    this.f22533t = new int[kz0Var.getChildCount()];
                }
                Arrays.fill(this.f22533t, 0);
                p(d(), iArr, true);
                int childCount2 = (kz0Var.getChildCount() * this.v.f24479a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = kz0Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        fz0 fz0Var2 = kz0Var.d(i11).f23433a;
                        if (z12) {
                            hz0Var = fz0Var2.f24128b;
                        } else {
                            hz0Var = fz0Var2.f24127a;
                        }
                        f7 += hz0Var.d;
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
            if (!this.f22534u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f22530q = true;
        }
        return this.f22529p;
    }

    public final int h() {
        hz0 hz0Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f22519c == Integer.MIN_VALUE) {
            kz0 kz0Var = this.f22536x;
            int childCount = kz0Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                fz0 fz0Var = kz0Var.d(i12).f23433a;
                if (this.f22517a) {
                    hz0Var = fz0Var.f24128b;
                } else {
                    hz0Var = fz0Var.f24127a;
                }
                ez0 ez0Var = hz0Var.f24828b;
                int i13 = ez0Var.f23764a;
                int i14 = ez0Var.f23765b;
                i11 = Math.max(Math.max(Math.max(i11, i13), i14), i14 - ez0Var.f23764a);
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f22519c = Math.max(0, i10);
        }
        return this.f22519c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        gz0 gz0Var = this.f22535w;
        gz0 gz0Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                gz0Var2.f24479a = size;
                gz0Var.f24479a = -size;
                this.f22530q = false;
                return g()[e()];
            }
            gz0Var2.f24479a = 0;
            gz0Var.f24479a = -100000;
            this.f22530q = false;
            return g()[e()];
        }
        gz0Var2.f24479a = 0;
        gz0Var.f24479a = -size;
        this.f22530q = false;
        return g()[e()];
    }

    public final void k() {
        this.f22519c = Integer.MIN_VALUE;
        this.d = null;
        this.f22520f = null;
        this.h = null;
        this.f22523j = null;
        this.f22525l = null;
        this.f22527n = null;
        this.f22529p = null;
        this.f22533t = null;
        this.f22532s = false;
        l();
    }

    public final void l() {
        this.e = false;
        this.f22521g = false;
        this.f22522i = false;
        this.f22524k = false;
        this.f22526m = false;
        this.f22528o = false;
        this.f22530q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f22517a) {
                str = "column";
            } else {
                str = "row";
            }
            throw new IllegalArgumentException(w.c.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"), ". "));
        }
        this.f22518b = i10;
    }

    public final void o(float f7, int i10) {
        hz0 hz0Var;
        Arrays.fill(this.f22533t, 0);
        kz0 kz0Var = this.f22536x;
        int childCount = kz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            fz0 fz0Var = kz0Var.d(i11).f23433a;
            if (this.f22517a) {
                hz0Var = fz0Var.f24128b;
            } else {
                hz0Var = fz0Var.f24127a;
            }
            float f10 = hz0Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f22533t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(yy0[] yy0VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < yy0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (yy0 yy0Var : yy0VarArr) {
                    z11 |= m(iArr, yy0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[yy0VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = yy0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, yy0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= yy0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    yy0 yy0Var2 = yy0VarArr[i14];
                    ez0 ez0Var = yy0Var2.f30427a;
                    if (ez0Var.f23764a >= ez0Var.f23765b) {
                        yy0Var2.f30429c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final yy0[] q(ArrayList arrayList) {
        e0.i0 i0Var = new e0.i0(this, (yy0[]) arrayList.toArray(new yy0[0]));
        int length = ((yy0[][]) i0Var.f7788c).length;
        for (int i10 = 0; i10 < length; i10++) {
            i0Var.f(i10);
        }
        return (yy0[]) i0Var.f7787b;
    }
}
