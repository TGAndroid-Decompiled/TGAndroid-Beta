package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class h01 extends View {
    public static final tz0 R = new tz0(0);
    public static final tz0 S = new tz0(1);
    public static final tz0 T = new tz0(3);
    public static final tz0 U = new tz0(4);
    public int E;
    public int[] F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final ArrayList J;
    public final ArrayList K;
    public final Path L;
    public final RectF M;
    public final float[] N;
    public final g01 O;
    public final ArrayList P;
    public final f01 Q;
    public final org.telegram.ui.Cells.o9 f25456a;
    public int f25457b;
    public final xz0 f25458c;
    public final xz0 d;
    public int e;
    public boolean f25459f;
    public int h;
    public int f25460n;
    public int f25461r;
    public int f25462s;
    public int v;
    public int f25463w;
    public boolean f25464x;
    public int f25465y;

    public h01(Context context, g01 g01Var, org.telegram.ui.Cells.o9 o9Var) {
        super(context);
        this.f25458c = new xz0(this, true);
        this.d = new xz0(this, false);
        this.e = 0;
        this.f25459f = false;
        this.h = 1;
        this.f25460n = 0;
        this.f25461r = AndroidUtilities.dp(8.0f);
        this.f25462s = AndroidUtilities.dp(9.0f);
        this.v = AndroidUtilities.dp(12.0f);
        this.f25464x = true;
        this.F = new int[0];
        this.J = new ArrayList();
        this.K = new ArrayList();
        new Path();
        this.L = new Path();
        this.M = new RectF();
        this.N = new float[8];
        this.P = new ArrayList();
        this.f25456a = o9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.O = g01Var;
        f01 f01Var = new f01(this, this);
        this.Q = f01Var;
        r0.j0.j(this, f01Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(t8.b.u(str, ". "));
    }

    public static void j(c01 c01Var, int i10, int i11, int i12, int i13) {
        b01 b01Var = new b01(i10, i11 + i10);
        e01 e01Var = c01Var.f23898a;
        c01Var.f23898a = new e01(e01Var.f24546a, b01Var, e01Var.f24548c, e01Var.d);
        b01 b01Var2 = new b01(i12, i13 + i12);
        e01 e01Var2 = c01Var.f23899b;
        c01Var.f23899b = new e01(e01Var2.f24546a, b01Var2, e01Var2.f24548c, e01Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        a01 a01Var = new a01(this, arrayList.size());
        c01 c01Var = new c01();
        b01 b01Var = new b01(i11, i13 + i11);
        tz0 tz0Var = U;
        c01Var.f23898a = new e01(false, b01Var, tz0Var, 0.0f);
        c01Var.f23899b = new e01(false, new b01(i10, i12 + i10), tz0Var, 0.0f);
        a01Var.f23368a = c01Var;
        a01Var.f23374j = i11;
        arrayList.add(a01Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        int i13;
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        a01 a01Var = new a01(this, arrayList.size());
        a01Var.f23370c = pagetablecell;
        c01 c01Var = new c01();
        int i14 = pagetablecell.rowspan;
        if (i14 == 0) {
            i14 = 1;
        }
        b01 b01Var = new b01(i11, i14 + i11);
        tz0 tz0Var = U;
        c01Var.f23898a = new e01(false, b01Var, tz0Var, 0.0f);
        c01Var.f23899b = new e01(false, new b01(i10, i12 + i10), tz0Var, 1.0f);
        a01Var.f23368a = c01Var;
        a01Var.f23374j = i11;
        arrayList.add(a01Var);
        if (pagetablecell.rowspan > 1) {
            this.K.add(new PointF(i11, i11 + i13));
        }
        h();
    }

    public final void c() {
        boolean z10;
        xz0 xz0Var;
        e01 e01Var;
        e01 e01Var2;
        Throwable th2;
        int i10;
        int i11 = this.f25460n;
        if (i11 == 0) {
            if (this.e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                xz0Var = this.f25458c;
            } else {
                xz0Var = this.d;
            }
            int i12 = xz0Var.f31410b;
            if (i12 == Integer.MIN_VALUE) {
                i12 = 0;
            }
            if (i12 >= 0 && i12 <= 1024) {
                int[] iArr = new int[i12];
                int childCount = getChildCount();
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    c01 c01Var = d(i15).f23368a;
                    if (z10) {
                        e01Var = c01Var.f23898a;
                    } else {
                        e01Var = c01Var.f23899b;
                    }
                    b01 b01Var = e01Var.f24547b;
                    boolean z11 = e01Var.f24546a;
                    int a2 = b01Var.a();
                    if (a2 > 0 && a2 <= 1024) {
                        if (z11) {
                            i13 = b01Var.f23663a;
                        }
                        if (z10) {
                            e01Var2 = c01Var.f23899b;
                        } else {
                            e01Var2 = c01Var.f23898a;
                        }
                        b01 b01Var2 = e01Var2.f24547b;
                        int a10 = b01Var2.a();
                        int i16 = b01Var2.f23663a;
                        if (a10 > 0) {
                            th2 = null;
                            if (b01Var2.a() <= 1024) {
                                boolean z12 = e01Var2.f24546a;
                                int a11 = b01Var2.a();
                                if (i12 != 0) {
                                    if (z12) {
                                        i10 = Math.min(i16, i12);
                                    } else {
                                        i10 = 0;
                                    }
                                    a11 = Math.min(a11, i12 - i10);
                                }
                                if (z12) {
                                    i14 = i16;
                                }
                                if (i12 != 0) {
                                    if (!z11 || !z12) {
                                        while (true) {
                                            int i17 = i14 + a11;
                                            if (i17 <= i12) {
                                                for (int i18 = i14; i18 < i17; i18++) {
                                                    if (iArr[i18] <= i13) {
                                                    }
                                                }
                                                break;
                                            }
                                            if (z12) {
                                                i13++;
                                            } else if (i17 <= i12) {
                                                i14++;
                                            } else {
                                                i13++;
                                                i14 = 0;
                                            }
                                        }
                                    }
                                    Arrays.fill(iArr, Math.min(i14, i12), Math.min(i14 + a11, i12), i13 + a2);
                                }
                                if (z10) {
                                    j(c01Var, i13, a2, i14, a11);
                                } else {
                                    j(c01Var, i14, a11, i13, a2);
                                }
                                i14 += a11;
                            }
                        } else {
                            th2 = null;
                        }
                        g("Table row or column span out of bounds");
                        throw th2;
                    }
                    g("Table row or column span out of bounds");
                    throw null;
                }
                int childCount2 = getChildCount();
                int i19 = 1;
                for (int i20 = 0; i20 < childCount2; i20++) {
                    i19 = (i19 * 31) + d(i20).f23368a.hashCode();
                }
                this.f25460n = i19;
                return;
            }
            g("Table grid count out of bounds");
            throw null;
        }
        int childCount3 = getChildCount();
        int i21 = 1;
        for (int i22 = 0; i22 < childCount3; i22++) {
            i21 = (i21 * 31) + d(i22).f23368a.hashCode();
        }
        if (i11 != i21) {
            h();
            c();
        }
    }

    public final a01 d(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                return (a01) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        f01 f01Var = this.Q;
        if (f01Var != null && f01Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(a01 a01Var, boolean z10, boolean z11) {
        xz0 xz0Var;
        int[] iArr;
        e01 e01Var;
        int i10;
        if (this.h == 1) {
            return f(a01Var, z10, z11);
        }
        if (z10) {
            xz0Var = this.f25458c;
        } else {
            xz0Var = this.d;
        }
        if (z11) {
            if (xz0Var.f31415j == null) {
                xz0Var.f31415j = new int[xz0Var.e() + 1];
            }
            if (!xz0Var.f31416k) {
                xz0Var.b(true);
                xz0Var.f31416k = true;
            }
            iArr = xz0Var.f31415j;
        } else {
            if (xz0Var.f31417l == null) {
                xz0Var.f31417l = new int[xz0Var.e() + 1];
            }
            if (!xz0Var.f31418m) {
                xz0Var.b(false);
                xz0Var.f31418m = true;
            }
            iArr = xz0Var.f31417l;
        }
        c01 c01Var = a01Var.f23368a;
        if (z10) {
            e01Var = c01Var.f23899b;
        } else {
            e01Var = c01Var.f23898a;
        }
        b01 b01Var = e01Var.f24547b;
        if (z11) {
            i10 = b01Var.f23663a;
        } else {
            i10 = b01Var.f23664b;
        }
        return iArr[i10];
    }

    public final int f(a01 a01Var, boolean z10, boolean z11) {
        int i10;
        e01 e01Var;
        xz0 xz0Var;
        boolean z12;
        c01 c01Var = a01Var.f23368a;
        if (z10) {
            if (z11) {
                i10 = ((ViewGroup.MarginLayoutParams) c01Var).leftMargin;
            } else {
                i10 = ((ViewGroup.MarginLayoutParams) c01Var).rightMargin;
            }
        } else if (z11) {
            i10 = ((ViewGroup.MarginLayoutParams) c01Var).topMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) c01Var).bottomMargin;
        }
        if (i10 == Integer.MIN_VALUE) {
            if (!this.f25459f) {
                return 0;
            }
            if (z10) {
                e01Var = c01Var.f23899b;
            } else {
                e01Var = c01Var.f23898a;
            }
            if (z10) {
                xz0Var = this.f25458c;
            } else {
                xz0Var = this.d;
            }
            b01 b01Var = e01Var.f24547b;
            if (z10 && this.I) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != z11) {
                int i11 = b01Var.f23663a;
                return 0;
            }
            int i12 = b01Var.f23664b;
            xz0Var.e();
            return 0;
        }
        return i10;
    }

    public int getAlignmentMode() {
        return this.h;
    }

    public int getChildCount() {
        return this.P.size();
    }

    public int getColumnCount() {
        return this.f25458c.e();
    }

    public int getOrientation() {
        return this.e;
    }

    public int getRenderHeight() {
        return this.E;
    }

    public int getRowCount() {
        return this.d.e();
    }

    public boolean getUseDefaultMargins() {
        return this.f25459f;
    }

    public final void h() {
        this.f25460n = 0;
        xz0 xz0Var = this.f25458c;
        xz0Var.k();
        xz0 xz0Var2 = this.d;
        xz0Var2.k();
        if (xz0Var != null && xz0Var2 != null) {
            xz0Var.l();
            xz0Var2.l();
        }
    }

    public final void i(int i10, boolean z10) {
        boolean z11;
        e01 e01Var;
        xz0 xz0Var;
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            a01 d = d(i14);
            c01 c01Var = d.f23368a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                if (this.f25457b == 2) {
                    i12 = ((int) (size / 2.0f)) - (this.v * 4);
                } else {
                    i12 = (int) (size / 1.5f);
                }
                d.e(this.O.createTextLayout(d.f23370c, i12));
                if (d.f23369b != null) {
                    ((ViewGroup.MarginLayoutParams) c01Var).height = Math.max(this.f25463w, d.f23371f + this.f25461r + this.f25462s);
                    int emojiOnlyCount = d.f23369b.getEmojiOnlyCount();
                    if (emojiOnlyCount > 0) {
                        i13 = ((ViewGroup.MarginLayoutParams) c01Var).height * emojiOnlyCount;
                    } else {
                        i13 = (this.v * 2) + d.e;
                    }
                    ((ViewGroup.MarginLayoutParams) c01Var).width = i13;
                } else {
                    ((ViewGroup.MarginLayoutParams) c01Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) c01Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) c01Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) c01Var).height, true);
            } else {
                if (this.e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    e01Var = c01Var.f23899b;
                } else {
                    e01Var = c01Var.f23898a;
                }
                if (e01.a(e01Var, z11) == U) {
                    b01 b01Var = e01Var.f24547b;
                    if (z11) {
                        xz0Var = this.f25458c;
                    } else {
                        xz0Var = this.d;
                    }
                    int[] g10 = xz0Var.g();
                    int e = (g10[b01Var.f23664b] - g10[b01Var.f23663a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        zz0 zz0Var = d.f23369b;
                        if (zz0Var != null) {
                            i11 = zz0Var.getEmojiOnlyCount();
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            int max = Math.max(1, Math.round(e / i11));
                            ((ViewGroup.MarginLayoutParams) c01Var).height = max;
                            d.f23377m = max;
                        }
                        d.d(e(d, true, false) + e(d, true, true) + e, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) c01Var).height, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) c01Var).width, e(d, false, false) + e(d, false, true) + e, false);
                    }
                }
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            d(i10).a(canvas, this, true);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        boolean z10;
        int i14;
        int i15;
        int i16;
        h01 h01Var = this;
        h01Var.c();
        xz0 xz0Var = h01Var.d;
        xz0 xz0Var2 = h01Var.f25458c;
        if (xz0Var2 != null && xz0Var != null) {
            xz0Var2.l();
            xz0Var.l();
        }
        h01Var.f25457b = 0;
        int childCount = h01Var.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            h01Var.f25457b = Math.max(h01Var.f25457b, h01Var.d(i17).f23368a.f23899b.f24547b.f23664b);
        }
        h01Var.i(i10, true);
        if (h01Var.e == 0) {
            i12 = xz0Var2.i(i10);
            if (h01Var.f25464x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                xz0Var2.v.f24252a = i12;
                xz0Var2.f31427w.f24252a = -i12;
                xz0Var2.f31422q = false;
                xz0Var2.g();
            }
            h01Var.i(i10, false);
            i13 = xz0Var.i(i11);
        } else {
            int i18 = xz0Var.i(i11);
            h01Var.i(i10, false);
            i12 = xz0Var2.i(i10);
            i13 = i18;
        }
        int max = Math.max(i13, h01Var.getSuggestedMinimumHeight());
        h01Var.setMeasuredDimension(i12, max);
        xz0Var2.v.f24252a = i12;
        xz0Var2.f31427w.f24252a = -i12;
        xz0Var2.f31422q = false;
        xz0Var2.g();
        xz0Var.v.f24252a = max;
        xz0Var.f31427w.f24252a = -max;
        xz0Var.f31422q = false;
        xz0Var.g();
        int[] g10 = xz0Var2.g();
        int[] g11 = xz0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = h01Var.J;
        arrayList.clear();
        int i19 = g10[g10.length - 1];
        int childCount2 = h01Var.getChildCount();
        int i20 = 0;
        while (i20 < childCount2) {
            int i21 = i20;
            a01 d = h01Var.d(i21);
            c01 c01Var = d.f23368a;
            e01 e01Var = c01Var.f23899b;
            e01 e01Var2 = c01Var.f23898a;
            b01 b01Var = e01Var.f24547b;
            b01 b01Var2 = e01Var2.f24547b;
            int i22 = childCount2;
            int i23 = g10[b01Var.f23663a];
            int i24 = g11[b01Var2.f23663a];
            int i25 = g10[b01Var.f23664b] - i23;
            int i26 = g11[b01Var2.f23664b] - i24;
            int i27 = d.f23375k;
            xz0 xz0Var3 = xz0Var;
            int i28 = d.f23376l;
            tz0 a2 = e01.a(e01Var, true);
            tz0 a10 = e01.a(e01Var2, false);
            li.k f7 = xz0Var2.f();
            yz0 yz0Var = (yz0) ((Object[]) f7.d)[((int[]) f7.f14820b)[i21]];
            li.k f10 = xz0Var3.f();
            xz0 xz0Var4 = xz0Var2;
            yz0 yz0Var2 = (yz0) ((Object[]) f10.d)[((int[]) f10.f14820b)[i21]];
            int b10 = a2.b(d, i25 - yz0Var.d(true));
            int b11 = a10.b(d, i26 - yz0Var2.d(true));
            int e = h01Var.e(d, true, true);
            int e7 = h01Var.e(d, false, true);
            int e10 = h01Var.e(d, true, false);
            int i29 = e + e10;
            int e11 = e7 + h01Var.e(d, false, false);
            int a11 = yz0Var.a(h01Var, d, a2, i27 + i29, true);
            h01Var = this;
            int a12 = yz0Var2.a(h01Var, d, a10, i28 + e11, false);
            int c10 = a2.c(i27, i25 - i29);
            int c11 = a10.c(i28, i26 - e11);
            int i30 = i23 + b10 + a11;
            if (!h01Var.I) {
                i15 = e + i30;
            } else {
                i15 = ((i19 - c10) - e10) - i30;
            }
            int i31 = i15;
            int i32 = i24 + b11 + a12 + e7;
            if (d.f23370c != null) {
                if (c10 != d.f23375k || c11 != d.f23376l) {
                    i16 = 0;
                    d.d(c10, c11, false);
                } else {
                    i16 = 0;
                }
                int i33 = d.f23377m;
                if (i33 != 0 && i33 != c11) {
                    b01 b01Var3 = d.f23368a.f23898a.f24547b;
                    if (b01Var3.f23664b - b01Var3.f23663a <= 1) {
                        ArrayList arrayList2 = h01Var.K;
                        int size = arrayList2.size();
                        int i34 = i16;
                        while (true) {
                            if (i34 < size) {
                                PointF pointF = (PointF) arrayList2.get(i34);
                                float f11 = pointF.x;
                                float f12 = d.f23368a.f23898a.f24547b.f23663a;
                                if (f11 > f12 || pointF.y <= f12) {
                                    i34++;
                                }
                            } else {
                                arrayList.add(d);
                                break;
                            }
                        }
                    }
                }
            }
            d.f23380p = i31;
            d.f23381q = i32;
            i20 = i21 + 1;
            xz0Var = xz0Var3;
            childCount2 = i22;
            xz0Var2 = xz0Var4;
        }
        int size2 = arrayList.size();
        int i35 = 0;
        while (i35 < size2) {
            a01 a01Var = (a01) arrayList.get(i35);
            int i36 = a01Var.f23376l;
            int i37 = a01Var.d;
            int i38 = i36 - a01Var.f23377m;
            ArrayList arrayList3 = h01Var.P;
            int size3 = arrayList3.size();
            for (int i39 = i37 + 1; i39 < size3; i39++) {
                a01 a01Var2 = (a01) arrayList3.get(i39);
                if (a01Var.f23368a.f23898a.f24547b.f23663a != a01Var2.f23368a.f23898a.f24547b.f23663a) {
                    break;
                }
                int i40 = a01Var.f23377m;
                int i41 = a01Var2.f23377m;
                if (i40 < i41) {
                    z10 = true;
                    break;
                }
                int i42 = a01Var2.f23376l - i41;
                if (i42 > 0) {
                    i38 = Math.min(i38, i42);
                }
            }
            z10 = false;
            if (!z10) {
                int i43 = i37 - 1;
                while (true) {
                    if (i43 < 0) {
                        break;
                    }
                    a01 a01Var3 = (a01) arrayList3.get(i43);
                    if (a01Var.f23368a.f23898a.f24547b.f23663a != a01Var3.f23368a.f23898a.f24547b.f23663a) {
                        break;
                    }
                    int i44 = a01Var.f23377m;
                    int i45 = a01Var3.f23377m;
                    if (i44 < i45) {
                        z10 = true;
                        break;
                    }
                    int i46 = a01Var3.f23376l - i45;
                    if (i46 > 0) {
                        i38 = Math.min(i38, i46);
                    }
                    i43--;
                }
            }
            if (!z10) {
                a01Var.f23376l = a01Var.f23377m;
                a01Var.g();
                max -= i38;
                int i47 = a01Var.f23368a.f23898a.f24547b.f23663a;
                while (true) {
                    i47++;
                    if (i47 >= copyOf.length) {
                        break;
                    }
                    copyOf[i47] = copyOf[i47] - i38;
                }
                int size4 = arrayList3.size();
                int i48 = size2;
                int i49 = i35;
                int i50 = 0;
                while (i50 < size4) {
                    a01 a01Var4 = (a01) arrayList3.get(i50);
                    if (a01Var == a01Var4) {
                        i14 = i50;
                    } else {
                        int i51 = a01Var.f23368a.f23898a.f24547b.f23663a;
                        int i52 = a01Var4.f23368a.f23898a.f24547b.f23663a;
                        if (i51 == i52) {
                            if (a01Var4.f23377m != a01Var4.f23376l) {
                                arrayList.remove(a01Var4);
                                if (a01Var4.d < i37) {
                                    i49--;
                                }
                                i48--;
                            }
                            int i53 = a01Var4.f23376l - i38;
                            a01Var4.f23376l = i53;
                            i14 = i50;
                            a01Var4.d(a01Var4.f23375k, i53, true);
                        } else {
                            i14 = i50;
                            if (i51 < i52) {
                                a01Var4.f23381q -= i38;
                            }
                        }
                    }
                    i50 = i14 + 1;
                }
                i35 = i49;
                size2 = i48;
            }
            i35++;
        }
        int childCount3 = h01Var.getChildCount();
        for (int i54 = 0; i54 < childCount3; i54++) {
            a01 d10 = h01Var.d(i54);
            h01Var.O.onLayoutChild(d10.f23369b, d10.b(), d10.c());
            d10.f23378n = d10.f23380p;
            d10.f23379o = d10.f23375k;
        }
        h01Var.f25465y = i19;
        h01Var.E = max;
        h01Var.F = copyOf;
        h01Var.setMeasuredDimension(i19, max);
    }

    @Override
    public final void requestLayout() {
        xz0 xz0Var;
        super.requestLayout();
        xz0 xz0Var2 = this.f25458c;
        if (xz0Var2 != null && (xz0Var = this.d) != null) {
            xz0Var2.l();
            xz0Var.l();
        }
    }

    public void setAlignmentMode(int i10) {
        this.h = i10;
        requestLayout();
    }

    public void setColumnCount(int i10) {
        this.f25458c.n(i10);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        xz0 xz0Var = this.f25458c;
        xz0Var.f31426u = z10;
        xz0Var.k();
        h();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.G = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.f25464x == z10) {
            return;
        }
        this.f25464x = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i10) {
        this.f25463w = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        if (this.e != i10) {
            this.e = i10;
            h();
            requestLayout();
        }
    }

    public void setRenderWidth(int i10) {
        int i11;
        int i12;
        int measuredWidth = getMeasuredWidth();
        this.f25465y = Math.max(measuredWidth, i10);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            a01 d = d(i13);
            if (measuredWidth > 0 && (i12 = this.f25465y) != measuredWidth) {
                float f7 = measuredWidth;
                int round = Math.round((d.f23378n * i12) / f7);
                int round2 = Math.round(((d.f23378n + d.f23379o) * this.f25465y) / f7);
                d.f23380p = round;
                d.f23375k = Math.max(0, round2 - round);
                if (d.f23370c != null && d.f23369b != null) {
                    d.f();
                }
            } else {
                int i14 = d.f23378n;
                d.f23380p = i14;
                d.f23375k = Math.max(0, (d.f23379o + i14) - i14);
                if (d.f23370c != null && d.f23369b != null) {
                    d.f();
                }
            }
        }
        int[] iArr = this.F;
        if (iArr.length < 2) {
            this.E = getMeasuredHeight();
        } else {
            int length = iArr.length;
            int i15 = length - 1;
            int[] iArr2 = new int[i15];
            int i16 = 0;
            while (i16 < i15) {
                int[] iArr3 = this.F;
                int i17 = i16 + 1;
                iArr2[i16] = iArr3[i17] - iArr3[i16];
                i16 = i17;
            }
            for (int i18 = 0; i18 < getChildCount(); i18++) {
                a01 d10 = d(i18);
                zz0 zz0Var = d10.f23369b;
                if (zz0Var != null) {
                    i11 = zz0Var.getEmojiOnlyCount();
                } else {
                    i11 = 0;
                }
                if (i11 > 0) {
                    b01 b01Var = d10.f23368a.f23898a.f24547b;
                    int max = Math.max(0, b01Var.f23663a);
                    int min = Math.min(i15, b01Var.f23664b);
                    if (max < min) {
                        int i19 = 0;
                        for (int i20 = max; i20 < min; i20++) {
                            i19 += iArr2[i20];
                        }
                        int max2 = Math.max(1, Math.round(d10.f23375k / i11)) - i19;
                        while (max < min && max2 > 0) {
                            int i21 = min - max;
                            int i22 = ((max2 + i21) - 1) / i21;
                            iArr2[max] = iArr2[max] + i22;
                            max2 -= i22;
                            max++;
                        }
                    }
                }
            }
            int[] iArr4 = new int[length];
            int i23 = 0;
            while (i23 < i15) {
                int i24 = i23 + 1;
                iArr4[i24] = iArr4[i23] + iArr2[i23];
                i23 = i24;
            }
            this.E = iArr4[i15];
            for (int i25 = 0; i25 < getChildCount(); i25++) {
                a01 d11 = d(i25);
                b01 b01Var2 = d11.f23368a.f23898a.f24547b;
                int max3 = Math.max(0, Math.min(i15, b01Var2.f23663a));
                int max4 = Math.max(max3, Math.min(i15, b01Var2.f23664b));
                int i26 = iArr4[max3];
                int i27 = iArr4[max4];
                d11.f23381q = i26;
                d11.f23376l = Math.max(0, i27 - i26);
                if (d11.f23370c != null) {
                    d11.g();
                }
                this.O.onLayoutChild(d11.f23369b, d11.b(), d11.c());
            }
        }
        invalidate();
    }

    public void setRowCount(int i10) {
        this.d.n(i10);
        h();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z10) {
        xz0 xz0Var = this.d;
        xz0Var.f31426u = z10;
        xz0Var.k();
        h();
        requestLayout();
    }

    public void setRtl(boolean z10) {
        this.I = z10;
    }

    public void setStriped(boolean z10) {
        this.H = z10;
    }

    public void setUseDefaultMargins(boolean z10) {
        this.f25459f = z10;
        requestLayout();
    }
}
