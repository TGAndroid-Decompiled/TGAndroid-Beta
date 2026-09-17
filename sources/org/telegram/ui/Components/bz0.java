package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class bz0 {
    public final boolean f22829a;
    public lf.i d;
    public lf.i f22832f;
    public lf.i h;
    public int[] f22835j;
    public int[] f22837l;
    public zy0[] f22839n;
    public int[] f22841p;
    public boolean f22843r;
    public int[] f22845t;
    public final lz0 f22848x;
    public int f22830b = Integer.MIN_VALUE;
    public int f22831c = Integer.MIN_VALUE;
    public boolean e = false;
    public boolean f22833g = false;
    public boolean f22834i = false;
    public boolean f22836k = false;
    public boolean f22838m = false;
    public boolean f22840o = false;
    public boolean f22842q = false;
    public boolean f22844s = false;
    public boolean f22846u = true;
    public final hz0 v = new hz0(0);
    public final hz0 f22847w = new hz0(-100000);

    public bz0(lz0 lz0Var, boolean z10) {
        this.f22848x = lz0Var;
        this.f22829a = z10;
    }

    public static void j(ArrayList arrayList, fz0 fz0Var, hz0 hz0Var, boolean z10) {
        if (fz0Var.f24040b - fz0Var.f24039a != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((zy0) obj).f30687a.equals(fz0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new zy0(fz0Var, hz0Var));
        }
    }

    public static boolean m(int[] iArr, zy0 zy0Var) {
        if (zy0Var.f30689c) {
            fz0 fz0Var = zy0Var.f30687a;
            int i10 = fz0Var.f24039a;
            int i11 = fz0Var.f24040b;
            int i12 = iArr[i10] + zy0Var.f30688b.f24756a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(lf.i iVar, boolean z10) {
        for (hz0 hz0Var : (hz0[]) ((Object[]) iVar.d)) {
            hz0Var.f24756a = Integer.MIN_VALUE;
        }
        cz0[] cz0VarArr = (cz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < cz0VarArr.length; i10++) {
            int d = cz0VarArr[i10].d(z10);
            hz0 hz0Var2 = (hz0) ((Object[]) iVar.d)[((int[]) iVar.f14033b)[i10]];
            int i11 = hz0Var2.f24756a;
            if (!z10) {
                d = -d;
            }
            hz0Var2.f24756a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        iz0 iz0Var;
        int i10;
        if (z10) {
            iArr = this.f22835j;
        } else {
            iArr = this.f22837l;
        }
        lz0 lz0Var = this.f22848x;
        int childCount = lz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ez0 d = lz0Var.d(i11);
            gz0 gz0Var = d.f23701a;
            boolean z11 = this.f22829a;
            if (z11) {
                iz0Var = gz0Var.f24428b;
            } else {
                iz0Var = gz0Var.f24427a;
            }
            fz0 fz0Var = iz0Var.f25060b;
            if (z10) {
                i10 = fz0Var.f24039a;
            } else {
                i10 = fz0Var.f24040b;
            }
            iArr[i10] = Math.max(iArr[i10], lz0Var.f(d, z11, z10));
        }
    }

    public final lf.i c(boolean z10) {
        fz0 fz0Var;
        az0 az0Var = new az0(fz0.class, hz0.class);
        iz0[] iz0VarArr = (iz0[]) ((Object[]) f().f14034c);
        int length = iz0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                fz0Var = iz0VarArr[i10].f25060b;
            } else {
                fz0 fz0Var2 = iz0VarArr[i10].f25060b;
                fz0Var = new fz0(fz0Var2.f24040b, fz0Var2.f24039a);
            }
            ?? obj = new Object();
            obj.f24756a = Integer.MIN_VALUE;
            az0Var.add(Pair.create(fz0Var, obj));
        }
        return az0Var.i();
    }

    public final zy0[] d() {
        if (this.f22839n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f22832f == null) {
                this.f22832f = c(true);
            }
            if (!this.f22833g) {
                a(this.f22832f, true);
                this.f22833g = true;
            }
            lf.i iVar = this.f22832f;
            int i10 = 0;
            while (true) {
                fz0[] fz0VarArr = (fz0[]) ((Object[]) iVar.f14034c);
                if (i10 >= fz0VarArr.length) {
                    break;
                }
                j(arrayList, fz0VarArr[i10], ((hz0[]) ((Object[]) iVar.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f22834i) {
                a(this.h, false);
                this.f22834i = true;
            }
            lf.i iVar2 = this.h;
            int i11 = 0;
            while (true) {
                fz0[] fz0VarArr2 = (fz0[]) ((Object[]) iVar2.f14034c);
                if (i11 >= fz0VarArr2.length) {
                    break;
                }
                j(arrayList2, fz0VarArr2[i11], ((hz0[]) ((Object[]) iVar2.d))[i11], false);
                i11++;
            }
            if (this.f22846u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new fz0(i12, i13), new hz0(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new fz0(0, e), this.v, false);
            j(arrayList2, new fz0(e, 0), this.f22847w, false);
            zy0[] q6 = q(arrayList);
            zy0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(zy0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.f22839n = (zy0[]) objArr;
        }
        if (!this.f22840o) {
            if (this.f22832f == null) {
                this.f22832f = c(true);
            }
            if (!this.f22833g) {
                a(this.f22832f, true);
                this.f22833g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f22834i) {
                a(this.h, false);
                this.f22834i = true;
            }
            this.f22840o = true;
        }
        return this.f22839n;
    }

    public final int e() {
        return Math.max(this.f22830b, h());
    }

    public final lf.i f() {
        iz0 iz0Var;
        int i10;
        int i11;
        int i12;
        iz0 iz0Var2;
        cz0 cz0Var;
        lf.i iVar = this.d;
        boolean z10 = this.f22829a;
        lz0 lz0Var = this.f22848x;
        if (iVar == null) {
            az0 az0Var = new az0(iz0.class, cz0.class);
            int childCount = lz0Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                gz0 gz0Var = lz0Var.d(i13).f23701a;
                if (z10) {
                    iz0Var2 = gz0Var.f24428b;
                } else {
                    iz0Var2 = gz0Var.f24427a;
                }
                switch (iz0.a(iz0Var2, z10).f30034a) {
                    case 3:
                        cz0Var = new cz0();
                        break;
                    default:
                        cz0Var = new cz0();
                        break;
                }
                az0Var.add(Pair.create(iz0Var2, cz0Var));
            }
            this.d = az0Var.i();
        }
        if (!this.e) {
            for (cz0 cz0Var2 : (cz0[]) ((Object[]) this.d.d)) {
                cz0Var2.c();
            }
            int childCount2 = lz0Var.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                ez0 d = lz0Var.d(i14);
                gz0 gz0Var2 = d.f23701a;
                if (z10) {
                    iz0Var = gz0Var2.f24428b;
                } else {
                    iz0Var = gz0Var2.f24427a;
                }
                if (z10) {
                    i10 = d.f23708k;
                } else {
                    i10 = d.f23709l;
                }
                int e = lz0Var.e(d, z10, false) + lz0Var.e(d, z10, true) + i10;
                float f7 = iz0Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f22845t[i14];
                }
                int i15 = e + i11;
                lf.i iVar2 = this.d;
                cz0 cz0Var3 = (cz0) ((Object[]) iVar2.d)[((int[]) iVar2.f14033b)[i14]];
                int i16 = cz0Var3.f23160c;
                if (iz0Var.f25061c == lz0.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                cz0Var3.f23160c = i12 & i16;
                int a2 = iz0.a(iz0Var, z10).a(d, i15);
                cz0Var3.b(a2, i15 - a2);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] g() {
        iz0 iz0Var;
        boolean z10;
        iz0 iz0Var2;
        if (this.f22841p == null) {
            this.f22841p = new int[e() + 1];
        }
        if (!this.f22842q) {
            int[] iArr = this.f22841p;
            boolean z11 = this.f22844s;
            float f7 = 0.0f;
            boolean z12 = this.f22829a;
            lz0 lz0Var = this.f22848x;
            if (!z11) {
                int childCount = lz0Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        gz0 gz0Var = lz0Var.d(i10).f23701a;
                        if (z12) {
                            iz0Var2 = gz0Var.f24428b;
                        } else {
                            iz0Var2 = gz0Var.f24427a;
                        }
                        if (iz0Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f22843r = z10;
                this.f22844s = true;
            }
            if (!this.f22843r) {
                p(d(), iArr, true);
            } else {
                if (this.f22845t == null) {
                    this.f22845t = new int[lz0Var.getChildCount()];
                }
                Arrays.fill(this.f22845t, 0);
                p(d(), iArr, true);
                int childCount2 = (lz0Var.getChildCount() * this.v.f24756a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = lz0Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        gz0 gz0Var2 = lz0Var.d(i11).f23701a;
                        if (z12) {
                            iz0Var = gz0Var2.f24428b;
                        } else {
                            iz0Var = gz0Var2.f24427a;
                        }
                        f7 += iz0Var.d;
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
            if (!this.f22846u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f22842q = true;
        }
        return this.f22841p;
    }

    public final int h() {
        iz0 iz0Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f22831c == Integer.MIN_VALUE) {
            lz0 lz0Var = this.f22848x;
            int childCount = lz0Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                gz0 gz0Var = lz0Var.d(i12).f23701a;
                if (this.f22829a) {
                    iz0Var = gz0Var.f24428b;
                } else {
                    iz0Var = gz0Var.f24427a;
                }
                fz0 fz0Var = iz0Var.f25060b;
                int i13 = fz0Var.f24039a;
                int i14 = fz0Var.f24040b;
                i11 = Math.max(Math.max(Math.max(i11, i13), i14), i14 - fz0Var.f24039a);
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f22831c = Math.max(0, i10);
        }
        return this.f22831c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        hz0 hz0Var = this.f22847w;
        hz0 hz0Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                hz0Var2.f24756a = size;
                hz0Var.f24756a = -size;
                this.f22842q = false;
                return g()[e()];
            }
            hz0Var2.f24756a = 0;
            hz0Var.f24756a = -100000;
            this.f22842q = false;
            return g()[e()];
        }
        hz0Var2.f24756a = 0;
        hz0Var.f24756a = -size;
        this.f22842q = false;
        return g()[e()];
    }

    public final void k() {
        this.f22831c = Integer.MIN_VALUE;
        this.d = null;
        this.f22832f = null;
        this.h = null;
        this.f22835j = null;
        this.f22837l = null;
        this.f22839n = null;
        this.f22841p = null;
        this.f22845t = null;
        this.f22844s = false;
        l();
    }

    public final void l() {
        this.e = false;
        this.f22833g = false;
        this.f22834i = false;
        this.f22836k = false;
        this.f22838m = false;
        this.f22840o = false;
        this.f22842q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f22829a) {
                str = "column";
            } else {
                str = "row";
            }
            throw new IllegalArgumentException(org.telegram.ui.Cells.p6.t(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"), ". "));
        }
        this.f22830b = i10;
    }

    public final void o(float f7, int i10) {
        iz0 iz0Var;
        Arrays.fill(this.f22845t, 0);
        lz0 lz0Var = this.f22848x;
        int childCount = lz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            gz0 gz0Var = lz0Var.d(i11).f23701a;
            if (this.f22829a) {
                iz0Var = gz0Var.f24428b;
            } else {
                iz0Var = gz0Var.f24427a;
            }
            float f10 = iz0Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f22845t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(zy0[] zy0VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < zy0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (zy0 zy0Var : zy0VarArr) {
                    z11 |= m(iArr, zy0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[zy0VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = zy0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, zy0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= zy0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    zy0 zy0Var2 = zy0VarArr[i14];
                    fz0 fz0Var = zy0Var2.f30687a;
                    if (fz0Var.f24039a >= fz0Var.f24040b) {
                        zy0Var2.f30689c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final zy0[] q(ArrayList arrayList) {
        e0.i0 i0Var = new e0.i0(this, (zy0[]) arrayList.toArray(new zy0[0]));
        int length = ((zy0[][]) i0Var.f7791c).length;
        for (int i10 = 0; i10 < length; i10++) {
            i0Var.f(i10);
        }
        return (zy0[]) i0Var.f7790b;
    }
}
