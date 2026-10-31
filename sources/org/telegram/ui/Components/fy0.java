package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class fy0 {
    public final boolean f26152a;
    public li.k d;
    public li.k f26155f;
    public li.k h;
    public int[] f26158j;
    public int[] f26160l;
    public dy0[] f26162n;
    public int[] f26164p;
    public boolean f26166r;
    public int[] f26168t;
    public final py0 f26171x;
    public int f26153b = Integer.MIN_VALUE;
    public int f26154c = Integer.MIN_VALUE;
    public boolean e = false;
    public boolean f26156g = false;
    public boolean f26157i = false;
    public boolean f26159k = false;
    public boolean f26161m = false;
    public boolean f26163o = false;
    public boolean f26165q = false;
    public boolean f26167s = false;
    public boolean f26169u = true;
    public final ly0 v = new ly0(0);
    public final ly0 f26170w = new ly0(-100000);

    public fy0(py0 py0Var, boolean z10) {
        this.f26171x = py0Var;
        this.f26152a = z10;
    }

    public static void j(ArrayList arrayList, jy0 jy0Var, ly0 ly0Var, boolean z10) {
        if (jy0Var.a() != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((dy0) obj).f25565a.equals(jy0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new dy0(jy0Var, ly0Var));
        }
    }

    public static boolean m(int[] iArr, dy0 dy0Var) {
        if (dy0Var.f25567c) {
            jy0 jy0Var = dy0Var.f25565a;
            int i10 = jy0Var.f27520a;
            int i11 = jy0Var.f27521b;
            int i12 = iArr[i10] + dy0Var.f25566b.f28225a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(li.k kVar, boolean z10) {
        for (ly0 ly0Var : (ly0[]) ((Object[]) kVar.d)) {
            ly0Var.f28225a = Integer.MIN_VALUE;
        }
        gy0[] gy0VarArr = (gy0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < gy0VarArr.length; i10++) {
            int d = gy0VarArr[i10].d(z10);
            ly0 ly0Var2 = (ly0) ((Object[]) kVar.d)[((int[]) kVar.f12100b)[i10]];
            int i11 = ly0Var2.f28225a;
            if (!z10) {
                d = -d;
            }
            ly0Var2.f28225a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        my0 my0Var;
        int i10;
        if (z10) {
            iArr = this.f26158j;
        } else {
            iArr = this.f26160l;
        }
        py0 py0Var = this.f26171x;
        int childCount = py0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            iy0 d = py0Var.d(i11);
            ky0 ky0Var = d.f27132a;
            boolean z11 = this.f26152a;
            if (z11) {
                my0Var = ky0Var.f27941b;
            } else {
                my0Var = ky0Var.f27940a;
            }
            jy0 jy0Var = my0Var.f28635b;
            if (z10) {
                i10 = jy0Var.f27520a;
            } else {
                i10 = jy0Var.f27521b;
            }
            iArr[i10] = Math.max(iArr[i10], py0Var.f(d, z11, z10));
        }
    }

    public final li.k c(boolean z10) {
        jy0 jy0Var;
        ey0 ey0Var = new ey0(jy0.class, ly0.class);
        my0[] my0VarArr = (my0[]) ((Object[]) f().f12101c);
        int length = my0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                jy0Var = my0VarArr[i10].f28635b;
            } else {
                jy0 jy0Var2 = my0VarArr[i10].f28635b;
                jy0Var = new jy0(jy0Var2.f27521b, jy0Var2.f27520a);
            }
            ?? obj = new Object();
            obj.f28225a = Integer.MIN_VALUE;
            ey0Var.add(Pair.create(jy0Var, obj));
        }
        return ey0Var.l();
    }

    public final dy0[] d() {
        if (this.f26162n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f26155f == null) {
                this.f26155f = c(true);
            }
            if (!this.f26156g) {
                a(this.f26155f, true);
                this.f26156g = true;
            }
            li.k kVar = this.f26155f;
            int i10 = 0;
            while (true) {
                jy0[] jy0VarArr = (jy0[]) ((Object[]) kVar.f12101c);
                if (i10 >= jy0VarArr.length) {
                    break;
                }
                j(arrayList, jy0VarArr[i10], ((ly0[]) ((Object[]) kVar.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f26157i) {
                a(this.h, false);
                this.f26157i = true;
            }
            li.k kVar2 = this.h;
            int i11 = 0;
            while (true) {
                jy0[] jy0VarArr2 = (jy0[]) ((Object[]) kVar2.f12101c);
                if (i11 >= jy0VarArr2.length) {
                    break;
                }
                j(arrayList2, jy0VarArr2[i11], ((ly0[]) ((Object[]) kVar2.d))[i11], false);
                i11++;
            }
            if (this.f26169u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new jy0(i12, i13), new ly0(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new jy0(0, e), this.v, false);
            j(arrayList2, new jy0(e, 0), this.f26170w, false);
            dy0[] q6 = q(arrayList);
            dy0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(dy0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.f26162n = (dy0[]) objArr;
        }
        if (!this.f26163o) {
            if (this.f26155f == null) {
                this.f26155f = c(true);
            }
            if (!this.f26156g) {
                a(this.f26155f, true);
                this.f26156g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f26157i) {
                a(this.h, false);
                this.f26157i = true;
            }
            this.f26163o = true;
        }
        return this.f26162n;
    }

    public final int e() {
        int max = Math.max(this.f26153b, h());
        if (max <= 1024) {
            return max;
        }
        py0.g("Table grid count out of bounds");
        throw null;
    }

    public final li.k f() {
        my0 my0Var;
        int i10;
        int i11;
        int i12;
        my0 my0Var2;
        gy0 gy0Var;
        li.k kVar = this.d;
        boolean z10 = this.f26152a;
        py0 py0Var = this.f26171x;
        if (kVar == null) {
            ey0 ey0Var = new ey0(my0.class, gy0.class);
            int childCount = py0Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                ky0 ky0Var = py0Var.d(i13).f27132a;
                if (z10) {
                    my0Var2 = ky0Var.f27941b;
                } else {
                    my0Var2 = ky0Var.f27940a;
                }
                switch (my0.a(my0Var2, z10).f24912a) {
                    case 3:
                        gy0Var = new gy0();
                        break;
                    default:
                        gy0Var = new gy0();
                        break;
                }
                ey0Var.add(Pair.create(my0Var2, gy0Var));
            }
            this.d = ey0Var.l();
        }
        if (!this.e) {
            for (gy0 gy0Var2 : (gy0[]) ((Object[]) this.d.d)) {
                gy0Var2.c();
            }
            int childCount2 = py0Var.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                iy0 d = py0Var.d(i14);
                ky0 ky0Var2 = d.f27132a;
                if (z10) {
                    my0Var = ky0Var2.f27941b;
                } else {
                    my0Var = ky0Var2.f27940a;
                }
                if (z10) {
                    i10 = d.f27139k;
                } else {
                    i10 = d.f27140l;
                }
                int e = py0Var.e(d, z10, false) + py0Var.e(d, z10, true) + i10;
                float f7 = my0Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f26168t[i14];
                }
                int i15 = e + i11;
                li.k kVar2 = this.d;
                gy0 gy0Var3 = (gy0) ((Object[]) kVar2.d)[((int[]) kVar2.f12100b)[i14]];
                int i16 = gy0Var3.f26540c;
                if (my0Var.f28636c == py0.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                gy0Var3.f26540c = i12 & i16;
                int a2 = my0.a(my0Var, z10).a(d, i15);
                gy0Var3.b(a2, i15 - a2);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] g() {
        my0 my0Var;
        boolean z10;
        my0 my0Var2;
        if (this.f26164p == null) {
            this.f26164p = new int[e() + 1];
        }
        if (!this.f26165q) {
            int[] iArr = this.f26164p;
            boolean z11 = this.f26167s;
            float f7 = 0.0f;
            boolean z12 = this.f26152a;
            py0 py0Var = this.f26171x;
            if (!z11) {
                int childCount = py0Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        ky0 ky0Var = py0Var.d(i10).f27132a;
                        if (z12) {
                            my0Var2 = ky0Var.f27941b;
                        } else {
                            my0Var2 = ky0Var.f27940a;
                        }
                        if (my0Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f26166r = z10;
                this.f26167s = true;
            }
            if (!this.f26166r) {
                p(d(), iArr, true);
            } else {
                if (this.f26168t == null) {
                    this.f26168t = new int[py0Var.getChildCount()];
                }
                Arrays.fill(this.f26168t, 0);
                p(d(), iArr, true);
                int childCount2 = (py0Var.getChildCount() * this.v.f28225a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = py0Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        ky0 ky0Var2 = py0Var.d(i11).f27132a;
                        if (z12) {
                            my0Var = ky0Var2.f27941b;
                        } else {
                            my0Var = ky0Var2.f27940a;
                        }
                        f7 += my0Var.d;
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
            if (!this.f26169u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f26165q = true;
        }
        return this.f26164p;
    }

    public final int h() {
        my0 my0Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f26154c == Integer.MIN_VALUE) {
            py0 py0Var = this.f26171x;
            int childCount = py0Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                ky0 ky0Var = py0Var.d(i12).f27132a;
                if (this.f26152a) {
                    my0Var = ky0Var.f27941b;
                } else {
                    my0Var = ky0Var.f27940a;
                }
                jy0 jy0Var = my0Var.f28635b;
                i11 = Math.max(Math.max(Math.max(i11, jy0Var.f27520a), jy0Var.f27521b), jy0Var.a());
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f26154c = Math.max(0, i10);
        }
        return this.f26154c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        ly0 ly0Var = this.f26170w;
        ly0 ly0Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                ly0Var2.f28225a = size;
                ly0Var.f28225a = -size;
                this.f26165q = false;
                return g()[e()];
            }
            ly0Var2.f28225a = 0;
            ly0Var.f28225a = -100000;
            this.f26165q = false;
            return g()[e()];
        }
        ly0Var2.f28225a = 0;
        ly0Var.f28225a = -size;
        this.f26165q = false;
        return g()[e()];
    }

    public final void k() {
        this.f26154c = Integer.MIN_VALUE;
        this.d = null;
        this.f26155f = null;
        this.h = null;
        this.f26158j = null;
        this.f26160l = null;
        this.f26162n = null;
        this.f26164p = null;
        this.f26168t = null;
        this.f26167s = false;
        l();
    }

    public final void l() {
        this.e = false;
        this.f26156g = false;
        this.f26157i = false;
        this.f26159k = false;
        this.f26161m = false;
        this.f26163o = false;
        this.f26165q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f26152a) {
                str = "column";
            } else {
                str = "row";
            }
            py0.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.f26153b = i10;
    }

    public final void o(float f7, int i10) {
        my0 my0Var;
        Arrays.fill(this.f26168t, 0);
        py0 py0Var = this.f26171x;
        int childCount = py0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ky0 ky0Var = py0Var.d(i11).f27132a;
            if (this.f26152a) {
                my0Var = ky0Var.f27941b;
            } else {
                my0Var = ky0Var.f27940a;
            }
            float f10 = my0Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f26168t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(dy0[] dy0VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < dy0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (dy0 dy0Var : dy0VarArr) {
                    z11 |= m(iArr, dy0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[dy0VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = dy0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, dy0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= dy0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    dy0 dy0Var2 = dy0VarArr[i14];
                    jy0 jy0Var = dy0Var2.f25565a;
                    if (jy0Var.f27520a >= jy0Var.f27521b) {
                        dy0Var2.f25567c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final dy0[] q(ArrayList arrayList) {
        cc.f fVar = new cc.f(this, (dy0[]) arrayList.toArray(new dy0[0]));
        int length = ((dy0[][]) fVar.d).length;
        for (int i10 = 0; i10 < length; i10++) {
            fVar.g(i10);
        }
        return (dy0[]) fVar.f4117c;
    }
}
