package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class zy0 {
    public final boolean f33284a;
    public m2.t d;
    public m2.t f33288f;
    public m2.t h;
    public int[] f33291j;
    public int[] f33293l;
    public xy0[] f33295n;
    public int[] f33297p;
    public boolean f33299r;
    public int[] f33301t;
    public final jz0 f33304x;
    public int f33285b = Integer.MIN_VALUE;
    public int f33286c = Integer.MIN_VALUE;
    public boolean f33287e = false;
    public boolean f33289g = false;
    public boolean f33290i = false;
    public boolean f33292k = false;
    public boolean f33294m = false;
    public boolean f33296o = false;
    public boolean f33298q = false;
    public boolean f33300s = false;
    public boolean f33302u = true;
    public final fz0 v = new fz0(0);
    public final fz0 f33303w = new fz0(-100000);

    public zy0(jz0 jz0Var, boolean z10) {
        this.f33304x = jz0Var;
        this.f33284a = z10;
    }

    public static void j(ArrayList arrayList, dz0 dz0Var, fz0 fz0Var, boolean z10) {
        if (dz0Var.f25520b - dz0Var.f25519a != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((xy0) obj).f32811a.equals(dz0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new xy0(dz0Var, fz0Var));
        }
    }

    public static boolean m(int[] iArr, xy0 xy0Var) {
        if (xy0Var.f32813c) {
            dz0 dz0Var = xy0Var.f32811a;
            int i10 = dz0Var.f25519a;
            int i11 = dz0Var.f25520b;
            int i12 = iArr[i10] + xy0Var.f32812b.f26239a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(m2.t tVar, boolean z10) {
        for (fz0 fz0Var : (fz0[]) ((Object[]) tVar.d)) {
            fz0Var.f26239a = Integer.MIN_VALUE;
        }
        az0[] az0VarArr = (az0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < az0VarArr.length; i10++) {
            int d = az0VarArr[i10].d(z10);
            fz0 fz0Var2 = (fz0) ((Object[]) tVar.d)[((int[]) tVar.f15844b)[i10]];
            int i11 = fz0Var2.f26239a;
            if (!z10) {
                d = -d;
            }
            fz0Var2.f26239a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        gz0 gz0Var;
        int i10;
        if (z10) {
            iArr = this.f33291j;
        } else {
            iArr = this.f33293l;
        }
        jz0 jz0Var = this.f33304x;
        int childCount = jz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            cz0 d = jz0Var.d(i11);
            ez0 ez0Var = d.f25169a;
            boolean z11 = this.f33284a;
            if (z11) {
                gz0Var = ez0Var.f25845b;
            } else {
                gz0Var = ez0Var.f25844a;
            }
            dz0 dz0Var = gz0Var.f26567b;
            if (z10) {
                i10 = dz0Var.f25519a;
            } else {
                i10 = dz0Var.f25520b;
            }
            iArr[i10] = Math.max(iArr[i10], jz0Var.f(d, z11, z10));
        }
    }

    public final m2.t c(boolean z10) {
        dz0 dz0Var;
        yy0 yy0Var = new yy0(dz0.class, fz0.class);
        gz0[] gz0VarArr = (gz0[]) ((Object[]) f().f15845c);
        int length = gz0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                dz0Var = gz0VarArr[i10].f26567b;
            } else {
                dz0 dz0Var2 = gz0VarArr[i10].f26567b;
                dz0Var = new dz0(dz0Var2.f25520b, dz0Var2.f25519a);
            }
            ?? obj = new Object();
            obj.f26239a = Integer.MIN_VALUE;
            yy0Var.add(Pair.create(dz0Var, obj));
        }
        return yy0Var.i();
    }

    public final xy0[] d() {
        if (this.f33295n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f33288f == null) {
                this.f33288f = c(true);
            }
            if (!this.f33289g) {
                a(this.f33288f, true);
                this.f33289g = true;
            }
            m2.t tVar = this.f33288f;
            int i10 = 0;
            while (true) {
                dz0[] dz0VarArr = (dz0[]) ((Object[]) tVar.f15845c);
                if (i10 >= dz0VarArr.length) {
                    break;
                }
                j(arrayList, dz0VarArr[i10], ((fz0[]) ((Object[]) tVar.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f33290i) {
                a(this.h, false);
                this.f33290i = true;
            }
            m2.t tVar2 = this.h;
            int i11 = 0;
            while (true) {
                dz0[] dz0VarArr2 = (dz0[]) ((Object[]) tVar2.f15845c);
                if (i11 >= dz0VarArr2.length) {
                    break;
                }
                j(arrayList2, dz0VarArr2[i11], ((fz0[]) ((Object[]) tVar2.d))[i11], false);
                i11++;
            }
            if (this.f33302u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new dz0(i12, i13), new fz0(0), true);
                    i12 = i13;
                }
            }
            int e7 = e();
            j(arrayList, new dz0(0, e7), this.v, false);
            j(arrayList2, new dz0(e7, 0), this.f33303w, false);
            xy0[] q6 = q(arrayList);
            xy0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(xy0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.f33295n = (xy0[]) objArr;
        }
        if (!this.f33296o) {
            if (this.f33288f == null) {
                this.f33288f = c(true);
            }
            if (!this.f33289g) {
                a(this.f33288f, true);
                this.f33289g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f33290i) {
                a(this.h, false);
                this.f33290i = true;
            }
            this.f33296o = true;
        }
        return this.f33295n;
    }

    public final int e() {
        return Math.max(this.f33285b, h());
    }

    public final m2.t f() {
        gz0 gz0Var;
        int i10;
        int i11;
        int i12;
        gz0 gz0Var2;
        az0 az0Var;
        m2.t tVar = this.d;
        boolean z10 = this.f33284a;
        jz0 jz0Var = this.f33304x;
        if (tVar == null) {
            yy0 yy0Var = new yy0(gz0.class, az0.class);
            int childCount = jz0Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                ez0 ez0Var = jz0Var.d(i13).f25169a;
                if (z10) {
                    gz0Var2 = ez0Var.f25845b;
                } else {
                    gz0Var2 = ez0Var.f25844a;
                }
                switch (gz0.a(gz0Var2, z10).f32050a) {
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
        if (!this.f33287e) {
            for (az0 az0Var2 : (az0[]) ((Object[]) this.d.d)) {
                az0Var2.c();
            }
            int childCount2 = jz0Var.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                cz0 d = jz0Var.d(i14);
                ez0 ez0Var2 = d.f25169a;
                if (z10) {
                    gz0Var = ez0Var2.f25845b;
                } else {
                    gz0Var = ez0Var2.f25844a;
                }
                if (z10) {
                    i10 = d.f25177k;
                } else {
                    i10 = d.f25178l;
                }
                int e7 = jz0Var.e(d, z10, false) + jz0Var.e(d, z10, true) + i10;
                float f7 = gz0Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f33301t[i14];
                }
                int i15 = e7 + i11;
                m2.t tVar2 = this.d;
                az0 az0Var3 = (az0) ((Object[]) tVar2.d)[((int[]) tVar2.f15844b)[i14]];
                int i16 = az0Var3.f24506c;
                if (gz0Var.f26568c == jz0.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                az0Var3.f24506c = i12 & i16;
                int a2 = gz0.a(gz0Var, z10).a(d, i15);
                az0Var3.b(a2, i15 - a2);
            }
            this.f33287e = true;
        }
        return this.d;
    }

    public final int[] g() {
        gz0 gz0Var;
        boolean z10;
        gz0 gz0Var2;
        if (this.f33297p == null) {
            this.f33297p = new int[e() + 1];
        }
        if (!this.f33298q) {
            int[] iArr = this.f33297p;
            boolean z11 = this.f33300s;
            float f7 = 0.0f;
            boolean z12 = this.f33284a;
            jz0 jz0Var = this.f33304x;
            if (!z11) {
                int childCount = jz0Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        ez0 ez0Var = jz0Var.d(i10).f25169a;
                        if (z12) {
                            gz0Var2 = ez0Var.f25845b;
                        } else {
                            gz0Var2 = ez0Var.f25844a;
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
                this.f33299r = z10;
                this.f33300s = true;
            }
            if (!this.f33299r) {
                p(d(), iArr, true);
            } else {
                if (this.f33301t == null) {
                    this.f33301t = new int[jz0Var.getChildCount()];
                }
                Arrays.fill(this.f33301t, 0);
                p(d(), iArr, true);
                int childCount2 = (jz0Var.getChildCount() * this.v.f26239a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = jz0Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        ez0 ez0Var2 = jz0Var.d(i11).f25169a;
                        if (z12) {
                            gz0Var = ez0Var2.f25845b;
                        } else {
                            gz0Var = ez0Var2.f25844a;
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
            if (!this.f33302u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f33298q = true;
        }
        return this.f33297p;
    }

    public final int h() {
        gz0 gz0Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f33286c == Integer.MIN_VALUE) {
            jz0 jz0Var = this.f33304x;
            int childCount = jz0Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                ez0 ez0Var = jz0Var.d(i12).f25169a;
                if (this.f33284a) {
                    gz0Var = ez0Var.f25845b;
                } else {
                    gz0Var = ez0Var.f25844a;
                }
                dz0 dz0Var = gz0Var.f26567b;
                int i13 = dz0Var.f25519a;
                int i14 = dz0Var.f25520b;
                i11 = Math.max(Math.max(Math.max(i11, i13), i14), i14 - dz0Var.f25519a);
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f33286c = Math.max(0, i10);
        }
        return this.f33286c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        fz0 fz0Var = this.f33303w;
        fz0 fz0Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                fz0Var2.f26239a = size;
                fz0Var.f26239a = -size;
                this.f33298q = false;
                return g()[e()];
            }
            fz0Var2.f26239a = 0;
            fz0Var.f26239a = -100000;
            this.f33298q = false;
            return g()[e()];
        }
        fz0Var2.f26239a = 0;
        fz0Var.f26239a = -size;
        this.f33298q = false;
        return g()[e()];
    }

    public final void k() {
        this.f33286c = Integer.MIN_VALUE;
        this.d = null;
        this.f33288f = null;
        this.h = null;
        this.f33291j = null;
        this.f33293l = null;
        this.f33295n = null;
        this.f33297p = null;
        this.f33301t = null;
        this.f33300s = false;
        l();
    }

    public final void l() {
        this.f33287e = false;
        this.f33289g = false;
        this.f33290i = false;
        this.f33292k = false;
        this.f33294m = false;
        this.f33296o = false;
        this.f33298q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f33284a) {
                str = "column";
            } else {
                str = "row";
            }
            throw new IllegalArgumentException(org.telegram.ui.Cells.p6.t(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"), ". "));
        }
        this.f33285b = i10;
    }

    public final void o(float f7, int i10) {
        gz0 gz0Var;
        Arrays.fill(this.f33301t, 0);
        jz0 jz0Var = this.f33304x;
        int childCount = jz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ez0 ez0Var = jz0Var.d(i11).f25169a;
            if (this.f33284a) {
                gz0Var = ez0Var.f25845b;
            } else {
                gz0Var = ez0Var.f25844a;
            }
            float f10 = gz0Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f33301t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(xy0[] xy0VarArr, int[] iArr, boolean z10) {
        int e7 = e() + 1;
        loop0: for (int i10 = 0; i10 < xy0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e7; i11++) {
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
            for (int i12 = 0; i12 < e7; i12++) {
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
                    dz0 dz0Var = xy0Var2.f32811a;
                    if (dz0Var.f25519a >= dz0Var.f25520b) {
                        xy0Var2.f32813c = false;
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
        int length = ((xy0[][]) i0Var.f8655c).length;
        for (int i10 = 0; i10 < length; i10++) {
            i0Var.f(i10);
        }
        return (xy0[]) i0Var.f8654b;
    }
}
