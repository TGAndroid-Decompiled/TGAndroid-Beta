package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class xz0 {
    public final boolean f31409a;
    public li.k d;
    public li.k f31412f;
    public li.k h;
    public int[] f31415j;
    public int[] f31417l;
    public vz0[] f31419n;
    public int[] f31421p;
    public boolean f31423r;
    public int[] f31425t;
    public final h01 f31428x;
    public int f31410b = Integer.MIN_VALUE;
    public int f31411c = Integer.MIN_VALUE;
    public boolean e = false;
    public boolean f31413g = false;
    public boolean f31414i = false;
    public boolean f31416k = false;
    public boolean f31418m = false;
    public boolean f31420o = false;
    public boolean f31422q = false;
    public boolean f31424s = false;
    public boolean f31426u = true;
    public final d01 v = new d01(0);
    public final d01 f31427w = new d01(-100000);

    public xz0(h01 h01Var, boolean z10) {
        this.f31428x = h01Var;
        this.f31409a = z10;
    }

    public static void j(ArrayList arrayList, b01 b01Var, d01 d01Var, boolean z10) {
        if (b01Var.a() != 0) {
            if (z10) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((vz0) obj).f30683a.equals(b01Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new vz0(b01Var, d01Var));
        }
    }

    public static boolean m(int[] iArr, vz0 vz0Var) {
        if (vz0Var.f30685c) {
            b01 b01Var = vz0Var.f30683a;
            int i10 = b01Var.f23663a;
            int i11 = b01Var.f23664b;
            int i12 = iArr[i10] + vz0Var.f30684b.f24252a;
            if (i12 > iArr[i11]) {
                iArr[i11] = i12;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(li.k kVar, boolean z10) {
        for (d01 d01Var : (d01[]) ((Object[]) kVar.d)) {
            d01Var.f24252a = Integer.MIN_VALUE;
        }
        yz0[] yz0VarArr = (yz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < yz0VarArr.length; i10++) {
            int d = yz0VarArr[i10].d(z10);
            d01 d01Var2 = (d01) ((Object[]) kVar.d)[((int[]) kVar.f14820b)[i10]];
            int i11 = d01Var2.f24252a;
            if (!z10) {
                d = -d;
            }
            d01Var2.f24252a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        e01 e01Var;
        int i10;
        if (z10) {
            iArr = this.f31415j;
        } else {
            iArr = this.f31417l;
        }
        h01 h01Var = this.f31428x;
        int childCount = h01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            a01 d = h01Var.d(i11);
            c01 c01Var = d.f23368a;
            boolean z11 = this.f31409a;
            if (z11) {
                e01Var = c01Var.f23899b;
            } else {
                e01Var = c01Var.f23898a;
            }
            b01 b01Var = e01Var.f24547b;
            if (z10) {
                i10 = b01Var.f23663a;
            } else {
                i10 = b01Var.f23664b;
            }
            iArr[i10] = Math.max(iArr[i10], h01Var.f(d, z11, z10));
        }
    }

    public final li.k c(boolean z10) {
        b01 b01Var;
        wz0 wz0Var = new wz0(b01.class, d01.class);
        e01[] e01VarArr = (e01[]) ((Object[]) f().f14821c);
        int length = e01VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                b01Var = e01VarArr[i10].f24547b;
            } else {
                b01 b01Var2 = e01VarArr[i10].f24547b;
                b01Var = new b01(b01Var2.f23664b, b01Var2.f23663a);
            }
            ?? obj = new Object();
            obj.f24252a = Integer.MIN_VALUE;
            wz0Var.add(Pair.create(b01Var, obj));
        }
        return wz0Var.h();
    }

    public final vz0[] d() {
        if (this.f31419n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f31412f == null) {
                this.f31412f = c(true);
            }
            if (!this.f31413g) {
                a(this.f31412f, true);
                this.f31413g = true;
            }
            li.k kVar = this.f31412f;
            int i10 = 0;
            while (true) {
                b01[] b01VarArr = (b01[]) ((Object[]) kVar.f14821c);
                if (i10 >= b01VarArr.length) {
                    break;
                }
                j(arrayList, b01VarArr[i10], ((d01[]) ((Object[]) kVar.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f31414i) {
                a(this.h, false);
                this.f31414i = true;
            }
            li.k kVar2 = this.h;
            int i11 = 0;
            while (true) {
                b01[] b01VarArr2 = (b01[]) ((Object[]) kVar2.f14821c);
                if (i11 >= b01VarArr2.length) {
                    break;
                }
                j(arrayList2, b01VarArr2[i11], ((d01[]) ((Object[]) kVar2.d))[i11], false);
                i11++;
            }
            if (this.f31426u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new b01(i12, i13), new d01(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new b01(0, e), this.v, false);
            j(arrayList2, new b01(e, 0), this.f31427w, false);
            vz0[] q6 = q(arrayList);
            vz0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(vz0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.f31419n = (vz0[]) objArr;
        }
        if (!this.f31420o) {
            if (this.f31412f == null) {
                this.f31412f = c(true);
            }
            if (!this.f31413g) {
                a(this.f31412f, true);
                this.f31413g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f31414i) {
                a(this.h, false);
                this.f31414i = true;
            }
            this.f31420o = true;
        }
        return this.f31419n;
    }

    public final int e() {
        int max = Math.max(this.f31410b, h());
        if (max <= 1024) {
            return max;
        }
        h01.g("Table grid count out of bounds");
        throw null;
    }

    public final li.k f() {
        e01 e01Var;
        int i10;
        int i11;
        int i12;
        e01 e01Var2;
        yz0 yz0Var;
        li.k kVar = this.d;
        boolean z10 = this.f31409a;
        h01 h01Var = this.f31428x;
        if (kVar == null) {
            wz0 wz0Var = new wz0(e01.class, yz0.class);
            int childCount = h01Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                c01 c01Var = h01Var.d(i13).f23368a;
                if (z10) {
                    e01Var2 = c01Var.f23899b;
                } else {
                    e01Var2 = c01Var.f23898a;
                }
                switch (e01.a(e01Var2, z10).f29529a) {
                    case 3:
                        yz0Var = new yz0();
                        break;
                    default:
                        yz0Var = new yz0();
                        break;
                }
                wz0Var.add(Pair.create(e01Var2, yz0Var));
            }
            this.d = wz0Var.h();
        }
        if (!this.e) {
            for (yz0 yz0Var2 : (yz0[]) ((Object[]) this.d.d)) {
                yz0Var2.c();
            }
            int childCount2 = h01Var.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                a01 d = h01Var.d(i14);
                c01 c01Var2 = d.f23368a;
                if (z10) {
                    e01Var = c01Var2.f23899b;
                } else {
                    e01Var = c01Var2.f23898a;
                }
                if (z10) {
                    i10 = d.f23375k;
                } else {
                    i10 = d.f23376l;
                }
                int e = h01Var.e(d, z10, false) + h01Var.e(d, z10, true) + i10;
                float f7 = e01Var.d;
                if (f7 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = this.f31425t[i14];
                }
                int i15 = e + i11;
                li.k kVar2 = this.d;
                yz0 yz0Var3 = (yz0) ((Object[]) kVar2.d)[((int[]) kVar2.f14820b)[i14]];
                int i16 = yz0Var3.f31708c;
                if (e01Var.f24548c == h01.R && f7 == 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
                yz0Var3.f31708c = i12 & i16;
                int a2 = e01.a(e01Var, z10).a(d, i15);
                yz0Var3.b(a2, i15 - a2);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] g() {
        e01 e01Var;
        boolean z10;
        e01 e01Var2;
        if (this.f31421p == null) {
            this.f31421p = new int[e() + 1];
        }
        if (!this.f31422q) {
            int[] iArr = this.f31421p;
            boolean z11 = this.f31424s;
            float f7 = 0.0f;
            boolean z12 = this.f31409a;
            h01 h01Var = this.f31428x;
            if (!z11) {
                int childCount = h01Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 < childCount) {
                        c01 c01Var = h01Var.d(i10).f23368a;
                        if (z12) {
                            e01Var2 = c01Var.f23899b;
                        } else {
                            e01Var2 = c01Var.f23898a;
                        }
                        if (e01Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f31423r = z10;
                this.f31424s = true;
            }
            if (!this.f31423r) {
                p(d(), iArr, true);
            } else {
                if (this.f31425t == null) {
                    this.f31425t = new int[h01Var.getChildCount()];
                }
                Arrays.fill(this.f31425t, 0);
                p(d(), iArr, true);
                int childCount2 = (h01Var.getChildCount() * this.v.f24252a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = h01Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        c01 c01Var2 = h01Var.d(i11).f23368a;
                        if (z12) {
                            e01Var = c01Var2.f23899b;
                        } else {
                            e01Var = c01Var2.f23898a;
                        }
                        f7 += e01Var.d;
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
            if (!this.f31426u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f31422q = true;
        }
        return this.f31421p;
    }

    public final int h() {
        e01 e01Var;
        int i10 = Integer.MIN_VALUE;
        if (this.f31411c == Integer.MIN_VALUE) {
            h01 h01Var = this.f31428x;
            int childCount = h01Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                c01 c01Var = h01Var.d(i12).f23368a;
                if (this.f31409a) {
                    e01Var = c01Var.f23899b;
                } else {
                    e01Var = c01Var.f23898a;
                }
                b01 b01Var = e01Var.f24547b;
                i11 = Math.max(Math.max(Math.max(i11, b01Var.f23663a), b01Var.f23664b), b01Var.a());
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.f31411c = Math.max(0, i10);
        }
        return this.f31411c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        d01 d01Var = this.f31427w;
        d01 d01Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                d01Var2.f24252a = size;
                d01Var.f24252a = -size;
                this.f31422q = false;
                return g()[e()];
            }
            d01Var2.f24252a = 0;
            d01Var.f24252a = -100000;
            this.f31422q = false;
            return g()[e()];
        }
        d01Var2.f24252a = 0;
        d01Var.f24252a = -size;
        this.f31422q = false;
        return g()[e()];
    }

    public final void k() {
        this.f31411c = Integer.MIN_VALUE;
        this.d = null;
        this.f31412f = null;
        this.h = null;
        this.f31415j = null;
        this.f31417l = null;
        this.f31419n = null;
        this.f31421p = null;
        this.f31425t = null;
        this.f31424s = false;
        l();
    }

    public final void l() {
        this.e = false;
        this.f31413g = false;
        this.f31414i = false;
        this.f31416k = false;
        this.f31418m = false;
        this.f31420o = false;
        this.f31422q = false;
    }

    public final void n(int i10) {
        String str;
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            if (this.f31409a) {
                str = "column";
            } else {
                str = "row";
            }
            h01.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.f31410b = i10;
    }

    public final void o(float f7, int i10) {
        e01 e01Var;
        Arrays.fill(this.f31425t, 0);
        h01 h01Var = this.f31428x;
        int childCount = h01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            c01 c01Var = h01Var.d(i11).f23368a;
            if (this.f31409a) {
                e01Var = c01Var.f23899b;
            } else {
                e01Var = c01Var.f23898a;
            }
            float f10 = e01Var.d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.f31425t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(vz0[] vz0VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < vz0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (vz0 vz0Var : vz0VarArr) {
                    z11 |= m(iArr, vz0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[vz0VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = vz0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, vz0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= vz0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    vz0 vz0Var2 = vz0VarArr[i14];
                    b01 b01Var = vz0Var2.f30683a;
                    if (b01Var.f23663a >= b01Var.f23664b) {
                        vz0Var2.f30685c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final vz0[] q(ArrayList arrayList) {
        e0.g0 g0Var = new e0.g0(this, (vz0[]) arrayList.toArray(new vz0[0]));
        int length = ((vz0[][]) g0Var.f8219c).length;
        for (int i10 = 0; i10 < length; i10++) {
            g0Var.f(i10);
        }
        return (vz0[]) g0Var.f8218b;
    }
}
