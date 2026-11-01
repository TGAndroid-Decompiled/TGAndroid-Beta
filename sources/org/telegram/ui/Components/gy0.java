package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class gy0 {
    public final boolean f26568a;
    public li.k d;
    public li.k f26571f;
    public li.k h;
    public int[] f26574j;
    public int[] f26576l;
    public ey0[] f26578n;
    public int[] f26580p;
    public boolean f26582r;
    public int[] f26584t;
    public final qy0 f26587x;
    public int f26569b = Integer.MIN_VALUE;
    public int f26570c = Integer.MIN_VALUE;
    public boolean e = false;
    public boolean f26572g = false;
    public boolean f26573i = false;
    public boolean f26575k = false;
    public boolean f26577m = false;
    public boolean f26579o = false;
    public boolean f26581q = false;
    public boolean f26583s = false;
    public boolean f26585u = true;
    public final my0 v = new my0(0);
    public final my0 f26586w = new my0(-100000);

    public gy0(qy0 qy0Var, boolean z10) {
        this.f26587x = qy0Var;
        this.f26568a = z10;
    }

    public static void j(ArrayList arrayList, ky0 ky0Var, my0 my0Var, boolean z10) {
        if (ky0Var.a() != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((ey0) obj).f25970a.equals(ky0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new ey0(ky0Var, my0Var));
        }
    }

    public static boolean m(int[] iArr, ey0 ey0Var) {
        if (ey0Var.f25972c) {
            ky0 ky0Var = ey0Var.f25970a;
            int i10 = ky0Var.f27987a;
            int i11 = ky0Var.f27988b;
            int i12 = iArr[i10] + ey0Var.f25971b.f28614a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(li.k kVar, boolean z10) {
        for (my0 my0Var : (my0[]) ((Object[]) kVar.d)) {
            my0Var.f28614a = Integer.MIN_VALUE;
        }
        hy0[] hy0VarArr = (hy0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < hy0VarArr.length; i10++) {
            int d = hy0VarArr[i10].d(z10);
            my0 my0Var2 = (my0) ((Object[]) kVar.d)[((int[]) kVar.f12101b)[i10]];
            int i11 = my0Var2.f28614a;
            if (!z10) {
                d = -d;
            }
            my0Var2.f28614a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        ny0 ny0Var;
        int i10;
        if (z10) {
            iArr = this.f26574j;
        } else {
            iArr = this.f26576l;
        }
        qy0 qy0Var = this.f26587x;
        int childCount = qy0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            jy0 d = qy0Var.d(i11);
            ly0 ly0Var = d.f27591a;
            boolean z11 = this.f26568a;
            if (z11) {
                ny0Var = ly0Var.f28307b;
            } else {
                ny0Var = ly0Var.f28306a;
            }
            ky0 ky0Var = ny0Var.f28987b;
            if (z10) {
                i10 = ky0Var.f27987a;
            } else {
                i10 = ky0Var.f27988b;
            }
            iArr[i10] = Math.max(iArr[i10], qy0Var.f(d, z11, z10));
        }
    }

    public final li.k c(boolean z10) {
        ky0 ky0Var;
        fy0 fy0Var = new fy0(ky0.class, my0.class);
        ny0[] ny0VarArr = (ny0[]) ((Object[]) f().f12102c);
        int length = ny0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                ky0Var = ny0VarArr[i10].f28987b;
            } else {
                ky0 ky0Var2 = ny0VarArr[i10].f28987b;
                ky0Var = new ky0(ky0Var2.f27988b, ky0Var2.f27987a);
            }
            ?? obj = new Object();
            obj.f28614a = Integer.MIN_VALUE;
            fy0Var.add(Pair.create(ky0Var, obj));
        }
        return fy0Var.l();
    }

    public final ey0[] d() {
        if (this.f26578n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f26571f == null) {
                this.f26571f = c(true);
            }
            if (!this.f26572g) {
                a(this.f26571f, true);
                this.f26572g = true;
            }
            li.k kVar = this.f26571f;
            int i10 = 0;
            while (true) {
                ky0[] ky0VarArr = (ky0[]) ((Object[]) kVar.f12102c);
                if (i10 >= ky0VarArr.length) {
                    break;
                }
                j(arrayList, ky0VarArr[i10], ((my0[]) ((Object[]) kVar.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f26573i) {
                a(this.h, false);
                this.f26573i = true;
            }
            li.k kVar2 = this.h;
            int i11 = 0;
            while (true) {
                ky0[] ky0VarArr2 = (ky0[]) ((Object[]) kVar2.f12102c);
                if (i11 >= ky0VarArr2.length) {
                    break;
                }
                j(arrayList2, ky0VarArr2[i11], ((my0[]) ((Object[]) kVar2.d))[i11], false);
                i11++;
            }
            if (this.f26585u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new ky0(i12, i13), new my0(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new ky0(0, e), this.v, false);
            j(arrayList2, new ky0(e, 0), this.f26586w, false);
            ey0[] q6 = q(arrayList);
            ey0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(ey0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.f26578n = (ey0[]) objArr;
        }
        if (!this.f26579o) {
            if (this.f26571f == null) {
                this.f26571f = c(true);
            }
            if (!this.f26572g) {
                a(this.f26571f, true);
                this.f26572g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f26573i) {
                a(this.h, false);
                this.f26573i = true;
            }
            this.f26579o = true;
        }
        return this.f26578n;
    }

    public final int e() {
        int max = Math.max(this.f26569b, h());
        if (max <= 1024) {
            return max;
        }
        qy0.g("Table grid count out of bounds");
        throw null;
    }

    public final li.k f() {
        ny0 ny0Var;
        int i10;
        int i11;
        int i12;
        ny0 ny0Var2;
        hy0 hy0Var;
        li.k kVar = this.d;
        boolean z10 = this.f26568a;
        qy0 qy0Var = this.f26587x;
        if (kVar == null) {
            fy0 fy0Var = new fy0(ny0.class, hy0.class);
            int childCount = qy0Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                ly0 ly0Var = qy0Var.d(i13).f27591a;
                if (z10) {
                    ny0Var2 = ly0Var.f28307b;
                } else {
                    ny0Var2 = ly0Var.f28306a;
                }
                switch (ny0.a(ny0Var2, z10).f25296a) {
                    case 3:
                        hy0Var = new hy0();
                        break;
                    default:
                        hy0Var = new hy0();
                        break;
                }
                fy0Var.add(Pair.create(ny0Var2, hy0Var));
            }
            this.d = fy0Var.l();
        }
        if (!this.e) {
            for (hy0 hy0Var2 : (hy0[]) ((Object[]) this.d.d)) {
                hy0Var2.c();
            }
            int childCount2 = qy0Var.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                jy0 d = qy0Var.d(i14);
                ly0 ly0Var2 = d.f27591a;
                if (z10) {
                    ny0Var = ly0Var2.f28307b;
                } else {
                    ny0Var = ly0Var2.f28306a;
                }
                if (z10) {
                    i10 = d.f27598k;
                } else {
                    i10 = d.f27599l;
                }
                int e = qy0Var.e(d, z10, false) + qy0Var.e(d, z10, true) + i10;
                float f7 = ny0Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f26584t[i14];
                }
                int i15 = e + i11;
                li.k kVar2 = this.d;
                hy0 hy0Var3 = (hy0) ((Object[]) kVar2.d)[((int[]) kVar2.f12101b)[i14]];
                int i16 = hy0Var3.f26959c;
                if (ny0Var.f28988c == qy0.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                hy0Var3.f26959c = i12 & i16;
                int a2 = ny0.a(ny0Var, z10).a(d, i15);
                hy0Var3.b(a2, i15 - a2);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] g() {
        ny0 ny0Var;
        boolean z10;
        ny0 ny0Var2;
        if (this.f26580p == null) {
            this.f26580p = new int[e() + 1];
        }
        if (!this.f26581q) {
            int[] iArr = this.f26580p;
            boolean z11 = this.f26583s;
            float f7 = 0.0f;
            boolean z12 = this.f26568a;
            qy0 qy0Var = this.f26587x;
            if (!z11) {
                int childCount = qy0Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        ly0 ly0Var = qy0Var.d(i10).f27591a;
                        if (z12) {
                            ny0Var2 = ly0Var.f28307b;
                        } else {
                            ny0Var2 = ly0Var.f28306a;
                        }
                        if (ny0Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f26582r = z10;
                this.f26583s = true;
            }
            if (!this.f26582r) {
                p(d(), iArr, true);
            } else {
                if (this.f26584t == null) {
                    this.f26584t = new int[qy0Var.getChildCount()];
                }
                Arrays.fill(this.f26584t, 0);
                p(d(), iArr, true);
                int childCount2 = (qy0Var.getChildCount() * this.v.f28614a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = qy0Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        ly0 ly0Var2 = qy0Var.d(i11).f27591a;
                        if (z12) {
                            ny0Var = ly0Var2.f28307b;
                        } else {
                            ny0Var = ly0Var2.f28306a;
                        }
                        f7 += ny0Var.d;
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
            if (!this.f26585u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f26581q = true;
        }
        return this.f26580p;
    }

    public final int h() {
        ny0 ny0Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f26570c == Integer.MIN_VALUE) {
            qy0 qy0Var = this.f26587x;
            int childCount = qy0Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                ly0 ly0Var = qy0Var.d(i12).f27591a;
                if (this.f26568a) {
                    ny0Var = ly0Var.f28307b;
                } else {
                    ny0Var = ly0Var.f28306a;
                }
                ky0 ky0Var = ny0Var.f28987b;
                i11 = Math.max(Math.max(Math.max(i11, ky0Var.f27987a), ky0Var.f27988b), ky0Var.a());
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f26570c = Math.max(0, i10);
        }
        return this.f26570c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        my0 my0Var = this.f26586w;
        my0 my0Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                my0Var2.f28614a = size;
                my0Var.f28614a = -size;
                this.f26581q = false;
                return g()[e()];
            }
            my0Var2.f28614a = 0;
            my0Var.f28614a = -100000;
            this.f26581q = false;
            return g()[e()];
        }
        my0Var2.f28614a = 0;
        my0Var.f28614a = -size;
        this.f26581q = false;
        return g()[e()];
    }

    public final void k() {
        this.f26570c = Integer.MIN_VALUE;
        this.d = null;
        this.f26571f = null;
        this.h = null;
        this.f26574j = null;
        this.f26576l = null;
        this.f26578n = null;
        this.f26580p = null;
        this.f26584t = null;
        this.f26583s = false;
        l();
    }

    public final void l() {
        this.e = false;
        this.f26572g = false;
        this.f26573i = false;
        this.f26575k = false;
        this.f26577m = false;
        this.f26579o = false;
        this.f26581q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f26568a) {
                str = "column";
            } else {
                str = "row";
            }
            qy0.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.f26569b = i10;
    }

    public final void o(float f7, int i10) {
        ny0 ny0Var;
        Arrays.fill(this.f26584t, 0);
        qy0 qy0Var = this.f26587x;
        int childCount = qy0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ly0 ly0Var = qy0Var.d(i11).f27591a;
            if (this.f26568a) {
                ny0Var = ly0Var.f28307b;
            } else {
                ny0Var = ly0Var.f28306a;
            }
            float f10 = ny0Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f26584t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(ey0[] ey0VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < ey0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (ey0 ey0Var : ey0VarArr) {
                    z11 |= m(iArr, ey0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[ey0VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = ey0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, ey0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= ey0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    ey0 ey0Var2 = ey0VarArr[i14];
                    ky0 ky0Var = ey0Var2.f25970a;
                    if (ky0Var.f27987a >= ky0Var.f27988b) {
                        ey0Var2.f25972c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final ey0[] q(ArrayList arrayList) {
        cc.f fVar = new cc.f(this, (ey0[]) arrayList.toArray(new ey0[0]));
        int length = ((ey0[][]) fVar.d).length;
        for (int i10 = 0; i10 < length; i10++) {
            fVar.g(i10);
        }
        return (ey0[]) fVar.f4117c;
    }
}
