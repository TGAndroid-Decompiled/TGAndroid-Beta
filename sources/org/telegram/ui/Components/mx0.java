package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class mx0 {
    public final boolean f37635a;
    public h6.m d;
    public h6.m f37639f;
    public h6.m h;
    public int[] f37642j;
    public int[] f37644l;
    public kx0[] f37646n;
    public int[] f37648p;
    public boolean f37650r;
    public int[] f37652t;
    public final wx0 f37655x;
    public int f37636b = Integer.MIN_VALUE;
    public int f37637c = Integer.MIN_VALUE;
    public boolean f37638e = false;
    public boolean f37640g = false;
    public boolean f37641i = false;
    public boolean f37643k = false;
    public boolean f37645m = false;
    public boolean f37647o = false;
    public boolean f37649q = false;
    public boolean f37651s = false;
    public boolean f37653u = true;
    public final sx0 v = new sx0(0);
    public final sx0 f37654w = new sx0(-100000);

    public mx0(wx0 wx0Var, boolean z10) {
        this.f37655x = wx0Var;
        this.f37635a = z10;
    }

    public static void j(ArrayList arrayList, qx0 qx0Var, sx0 sx0Var, boolean z10) {
        if (qx0Var.a() != 0) {
            if (z10) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    if (((kx0) obj).f36912a.equals(qx0Var)) {
                        return;
                    }
                }
            }
            arrayList.add(new kx0(qx0Var, sx0Var));
        }
    }

    public static boolean m(int[] iArr, kx0 kx0Var) {
        if (kx0Var.f36914c) {
            qx0 qx0Var = kx0Var.f36912a;
            int i7 = qx0Var.f38934a;
            int i10 = qx0Var.f38935b;
            int i11 = iArr[i7] + kx0Var.f36913b.f39862a;
            if (i11 > iArr[i10]) {
                iArr[i10] = i11;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(h6.m mVar, boolean z10) {
        for (sx0 sx0Var : (sx0[]) ((Object[]) mVar.d)) {
            sx0Var.f39862a = Integer.MIN_VALUE;
        }
        nx0[] nx0VarArr = (nx0[]) ((Object[]) f().d);
        for (int i7 = 0; i7 < nx0VarArr.length; i7++) {
            int d = nx0VarArr[i7].d(z10);
            sx0 sx0Var2 = (sx0) ((Object[]) mVar.d)[((int[]) mVar.f13936b)[i7]];
            int i10 = sx0Var2.f39862a;
            if (!z10) {
                d = -d;
            }
            sx0Var2.f39862a = Math.max(i10, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr;
        tx0 tx0Var;
        int i7;
        if (z10) {
            iArr = this.f37642j;
        } else {
            iArr = this.f37644l;
        }
        wx0 wx0Var = this.f37655x;
        int childCount = wx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            px0 d = wx0Var.d(i10);
            rx0 rx0Var = d.f38592a;
            boolean z11 = this.f37635a;
            if (z11) {
                tx0Var = rx0Var.f39331b;
            } else {
                tx0Var = rx0Var.f39330a;
            }
            qx0 qx0Var = tx0Var.f40132b;
            if (z10) {
                i7 = qx0Var.f38934a;
            } else {
                i7 = qx0Var.f38935b;
            }
            iArr[i7] = Math.max(iArr[i7], wx0Var.f(d, z11, z10));
        }
    }

    public final h6.m c(boolean z10) {
        qx0 qx0Var;
        lx0 lx0Var = new lx0(qx0.class, sx0.class);
        tx0[] tx0VarArr = (tx0[]) ((Object[]) f().f13937c);
        int length = tx0VarArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (z10) {
                qx0Var = tx0VarArr[i7].f40132b;
            } else {
                qx0 qx0Var2 = tx0VarArr[i7].f40132b;
                qx0Var = new qx0(qx0Var2.f38935b, qx0Var2.f38934a);
            }
            ?? obj = new Object();
            obj.f39862a = Integer.MIN_VALUE;
            lx0Var.add(Pair.create(qx0Var, obj));
        }
        return lx0Var.f();
    }

    public final kx0[] d() {
        if (this.f37646n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f37639f == null) {
                this.f37639f = c(true);
            }
            if (!this.f37640g) {
                a(this.f37639f, true);
                this.f37640g = true;
            }
            h6.m mVar = this.f37639f;
            int i7 = 0;
            while (true) {
                qx0[] qx0VarArr = (qx0[]) ((Object[]) mVar.f13937c);
                if (i7 >= qx0VarArr.length) {
                    break;
                }
                j(arrayList, qx0VarArr[i7], ((sx0[]) ((Object[]) mVar.d))[i7], false);
                i7++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f37641i) {
                a(this.h, false);
                this.f37641i = true;
            }
            h6.m mVar2 = this.h;
            int i10 = 0;
            while (true) {
                qx0[] qx0VarArr2 = (qx0[]) ((Object[]) mVar2.f13937c);
                if (i10 >= qx0VarArr2.length) {
                    break;
                }
                j(arrayList2, qx0VarArr2[i10], ((sx0[]) ((Object[]) mVar2.d))[i10], false);
                i10++;
            }
            if (this.f37653u) {
                int i11 = 0;
                while (i11 < e()) {
                    int i12 = i11 + 1;
                    j(arrayList, new qx0(i11, i12), new sx0(0), true);
                    i11 = i12;
                }
            }
            int e10 = e();
            j(arrayList, new qx0(0, e10), this.v, false);
            j(arrayList2, new qx0(e10, 0), this.f37654w, false);
            kx0[] q10 = q(arrayList);
            kx0[] q11 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(kx0[].class.getComponentType(), q10.length + q11.length);
            System.arraycopy(q10, 0, objArr, 0, q10.length);
            System.arraycopy(q11, 0, objArr, q10.length, q11.length);
            this.f37646n = (kx0[]) objArr;
        }
        if (!this.f37647o) {
            if (this.f37639f == null) {
                this.f37639f = c(true);
            }
            if (!this.f37640g) {
                a(this.f37639f, true);
                this.f37640g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.f37641i) {
                a(this.h, false);
                this.f37641i = true;
            }
            this.f37647o = true;
        }
        return this.f37646n;
    }

    public final int e() {
        int max = Math.max(this.f37636b, h());
        if (max <= 1024) {
            return max;
        }
        wx0.g("Table grid count out of bounds");
        throw null;
    }

    public final h6.m f() {
        tx0 tx0Var;
        int i7;
        int i10;
        int i11;
        tx0 tx0Var2;
        nx0 nx0Var;
        h6.m mVar = this.d;
        boolean z10 = this.f37635a;
        wx0 wx0Var = this.f37655x;
        if (mVar == null) {
            lx0 lx0Var = new lx0(tx0.class, nx0.class);
            int childCount = wx0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                rx0 rx0Var = wx0Var.d(i12).f38592a;
                if (z10) {
                    tx0Var2 = rx0Var.f39331b;
                } else {
                    tx0Var2 = rx0Var.f39330a;
                }
                switch (tx0.a(tx0Var2, z10).f36264a) {
                    case 3:
                        nx0Var = new nx0();
                        break;
                    default:
                        nx0Var = new nx0();
                        break;
                }
                lx0Var.add(Pair.create(tx0Var2, nx0Var));
            }
            this.d = lx0Var.f();
        }
        if (!this.f37638e) {
            for (nx0 nx0Var2 : (nx0[]) ((Object[]) this.d.d)) {
                nx0Var2.c();
            }
            int childCount2 = wx0Var.getChildCount();
            for (int i13 = 0; i13 < childCount2; i13++) {
                px0 d = wx0Var.d(i13);
                rx0 rx0Var2 = d.f38592a;
                if (z10) {
                    tx0Var = rx0Var2.f39331b;
                } else {
                    tx0Var = rx0Var2.f39330a;
                }
                if (z10) {
                    i7 = d.f38600k;
                } else {
                    i7 = d.f38601l;
                }
                int e10 = wx0Var.e(d, z10, false) + wx0Var.e(d, z10, true) + i7;
                float f10 = tx0Var.d;
                if (f10 == 0.0f) {
                    i10 = 0;
                } else {
                    i10 = this.f37652t[i13];
                }
                int i14 = e10 + i10;
                h6.m mVar2 = this.d;
                nx0 nx0Var3 = (nx0) ((Object[]) mVar2.d)[((int[]) mVar2.f13936b)[i13]];
                int i15 = nx0Var3.f37872c;
                if (tx0Var.f40133c == wx0.T && f10 == 0.0f) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                nx0Var3.f37872c = i11 & i15;
                int a10 = tx0.a(tx0Var, z10).a(d, i14);
                nx0Var3.b(a10, i14 - a10);
            }
            this.f37638e = true;
        }
        return this.d;
    }

    public final int[] g() {
        tx0 tx0Var;
        boolean z10;
        tx0 tx0Var2;
        if (this.f37648p == null) {
            this.f37648p = new int[e() + 1];
        }
        if (!this.f37649q) {
            int[] iArr = this.f37648p;
            boolean z11 = this.f37651s;
            float f10 = 0.0f;
            boolean z12 = this.f37635a;
            wx0 wx0Var = this.f37655x;
            if (!z11) {
                int childCount = wx0Var.getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 < childCount) {
                        rx0 rx0Var = wx0Var.d(i7).f38592a;
                        if (z12) {
                            tx0Var2 = rx0Var.f39331b;
                        } else {
                            tx0Var2 = rx0Var.f39330a;
                        }
                        if (tx0Var2.d != 0.0f) {
                            z10 = true;
                            break;
                        }
                        i7++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                this.f37650r = z10;
                this.f37651s = true;
            }
            if (!this.f37650r) {
                p(d(), iArr, true);
            } else {
                if (this.f37652t == null) {
                    this.f37652t = new int[wx0Var.getChildCount()];
                }
                Arrays.fill(this.f37652t, 0);
                p(d(), iArr, true);
                int childCount2 = (wx0Var.getChildCount() * this.v.f39862a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = wx0Var.getChildCount();
                    for (int i10 = 0; i10 < childCount3; i10++) {
                        rx0 rx0Var2 = wx0Var.d(i10).f38592a;
                        if (z12) {
                            tx0Var = rx0Var2.f39331b;
                        } else {
                            tx0Var = rx0Var2.f39330a;
                        }
                        f10 += tx0Var.d;
                    }
                    int i11 = -1;
                    boolean z13 = true;
                    int i12 = 0;
                    while (i12 < childCount2) {
                        int i13 = (int) ((i12 + childCount2) / 2);
                        l();
                        o(f10, i13);
                        boolean p10 = p(d(), iArr, false);
                        if (p10) {
                            i12 = i13 + 1;
                            i11 = i13;
                        } else {
                            childCount2 = i13;
                        }
                        z13 = p10;
                    }
                    if (i11 > 0 && !z13) {
                        l();
                        o(f10, i11);
                        p(d(), iArr, true);
                    }
                }
            }
            if (!this.f37653u) {
                int i14 = iArr[0];
                int length = iArr.length;
                for (int i15 = 0; i15 < length; i15++) {
                    iArr[i15] = iArr[i15] - i14;
                }
            }
            this.f37649q = true;
        }
        return this.f37648p;
    }

    public final int h() {
        tx0 tx0Var;
        int i7 = Integer.MIN_VALUE;
        if (this.f37637c == Integer.MIN_VALUE) {
            wx0 wx0Var = this.f37655x;
            int childCount = wx0Var.getChildCount();
            int i10 = -1;
            for (int i11 = 0; i11 < childCount; i11++) {
                rx0 rx0Var = wx0Var.d(i11).f38592a;
                if (this.f37635a) {
                    tx0Var = rx0Var.f39331b;
                } else {
                    tx0Var = rx0Var.f39330a;
                }
                qx0 qx0Var = tx0Var.f40132b;
                i10 = Math.max(Math.max(Math.max(i10, qx0Var.f38934a), qx0Var.f38935b), qx0Var.a());
            }
            if (i10 != -1) {
                i7 = i10;
            }
            this.f37637c = Math.max(0, i7);
        }
        return this.f37637c;
    }

    public final int i(int i7) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        sx0 sx0Var = this.f37654w;
        sx0 sx0Var2 = this.v;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                sx0Var2.f39862a = size;
                sx0Var.f39862a = -size;
                this.f37649q = false;
                return g()[e()];
            }
            sx0Var2.f39862a = 0;
            sx0Var.f39862a = -100000;
            this.f37649q = false;
            return g()[e()];
        }
        sx0Var2.f39862a = 0;
        sx0Var.f39862a = -size;
        this.f37649q = false;
        return g()[e()];
    }

    public final void k() {
        this.f37637c = Integer.MIN_VALUE;
        this.d = null;
        this.f37639f = null;
        this.h = null;
        this.f37642j = null;
        this.f37644l = null;
        this.f37646n = null;
        this.f37648p = null;
        this.f37652t = null;
        this.f37651s = false;
        l();
    }

    public final void l() {
        this.f37638e = false;
        this.f37640g = false;
        this.f37641i = false;
        this.f37643k = false;
        this.f37645m = false;
        this.f37647o = false;
        this.f37649q = false;
    }

    public final void n(int i7) {
        String str;
        if (i7 != Integer.MIN_VALUE && i7 < h()) {
            if (this.f37635a) {
                str = "column";
            } else {
                str = "row";
            }
            wx0.g(str.concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
        this.f37636b = i7;
    }

    public final void o(float f10, int i7) {
        tx0 tx0Var;
        Arrays.fill(this.f37652t, 0);
        wx0 wx0Var = this.f37655x;
        int childCount = wx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            rx0 rx0Var = wx0Var.d(i10).f38592a;
            if (this.f37635a) {
                tx0Var = rx0Var.f39331b;
            } else {
                tx0Var = rx0Var.f39330a;
            }
            float f11 = tx0Var.d;
            if (f11 != 0.0f) {
                int round = Math.round((i7 * f11) / f10);
                this.f37652t[i10] = round;
                i7 -= round;
                f10 -= f11;
            }
        }
    }

    public final boolean p(kx0[] kx0VarArr, int[] iArr, boolean z10) {
        int e10 = e() + 1;
        loop0: for (int i7 = 0; i7 < kx0VarArr.length; i7++) {
            Arrays.fill(iArr, 0);
            for (int i10 = 0; i10 < e10; i10++) {
                boolean z11 = false;
                for (kx0 kx0Var : kx0VarArr) {
                    z11 |= m(iArr, kx0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[kx0VarArr.length];
            for (int i11 = 0; i11 < e10; i11++) {
                int length = kx0VarArr.length;
                for (int i12 = 0; i12 < length; i12++) {
                    zArr[i12] = zArr[i12] | m(iArr, kx0VarArr[i12]);
                }
            }
            int i13 = 0;
            while (true) {
                if (i13 >= kx0VarArr.length) {
                    break;
                }
                if (zArr[i13]) {
                    kx0 kx0Var2 = kx0VarArr[i13];
                    qx0 qx0Var = kx0Var2.f36912a;
                    if (qx0Var.f38934a >= qx0Var.f38935b) {
                        kx0Var2.f36914c = false;
                        break;
                    }
                }
                i13++;
            }
        }
        return true;
    }

    public final kx0[] q(ArrayList arrayList) {
        a4.k kVar = new a4.k(this, (kx0[]) arrayList.toArray(new kx0[0]));
        int length = ((kx0[][]) kVar.d).length;
        for (int i7 = 0; i7 < length; i7++) {
            kVar.w(i7);
        }
        return (kx0[]) kVar.f192c;
    }
}
