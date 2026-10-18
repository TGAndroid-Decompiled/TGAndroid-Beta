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
public final class d01 extends View {
    public static final pz0 R = new pz0(0);
    public static final pz0 S = new pz0(1);
    public static final pz0 T = new pz0(3);
    public static final pz0 U = new pz0(4);
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
    public final c01 O;
    public final ArrayList P;
    public final b01 Q;
    public final org.telegram.ui.Cells.n9 f25418a;
    public int f25419b;
    public final tz0 f25420c;
    public final tz0 d;
    public int e;
    public boolean f25421f;
    public int h;
    public int f25422n;
    public int f25423r;
    public int f25424s;
    public int v;
    public int f25425w;
    public boolean f25426x;
    public int f25427y;

    public d01(Context context, c01 c01Var, org.telegram.ui.Cells.n9 n9Var) {
        super(context);
        this.f25420c = new tz0(this, true);
        this.d = new tz0(this, false);
        this.e = 0;
        this.f25421f = false;
        this.h = 1;
        this.f25422n = 0;
        this.f25423r = AndroidUtilities.dp(8.0f);
        this.f25424s = AndroidUtilities.dp(9.0f);
        this.v = AndroidUtilities.dp(12.0f);
        this.f25426x = true;
        this.F = new int[0];
        this.J = new ArrayList();
        this.K = new ArrayList();
        new Path();
        this.L = new Path();
        this.M = new RectF();
        this.N = new float[8];
        this.P = new ArrayList();
        this.f25418a = n9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.O = c01Var;
        b01 b01Var = new b01(this, this);
        this.Q = b01Var;
        r0.i0.j(this, b01Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(r4.c.u(str, ". "));
    }

    public static void j(yz0 yz0Var, int i10, int i11, int i12, int i13) {
        xz0 xz0Var = new xz0(i10, i11 + i10);
        a01 a01Var = yz0Var.f32787a;
        yz0Var.f32787a = new a01(a01Var.f24426a, xz0Var, a01Var.f24428c, a01Var.d);
        xz0 xz0Var2 = new xz0(i12, i13 + i12);
        a01 a01Var2 = yz0Var.f32788b;
        yz0Var.f32788b = new a01(a01Var2.f24426a, xz0Var2, a01Var2.f24428c, a01Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        wz0 wz0Var = new wz0(this, arrayList.size());
        yz0 yz0Var = new yz0();
        xz0 xz0Var = new xz0(i11, i13 + i11);
        pz0 pz0Var = U;
        yz0Var.f32787a = new a01(false, xz0Var, pz0Var, 0.0f);
        yz0Var.f32788b = new a01(false, new xz0(i10, i12 + i10), pz0Var, 0.0f);
        wz0Var.f32246a = yz0Var;
        wz0Var.f32252j = i11;
        arrayList.add(wz0Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        int i13;
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        wz0 wz0Var = new wz0(this, arrayList.size());
        wz0Var.f32248c = pagetablecell;
        yz0 yz0Var = new yz0();
        int i14 = pagetablecell.rowspan;
        if (i14 == 0) {
            i14 = 1;
        }
        xz0 xz0Var = new xz0(i11, i14 + i11);
        pz0 pz0Var = U;
        yz0Var.f32787a = new a01(false, xz0Var, pz0Var, 0.0f);
        yz0Var.f32788b = new a01(false, new xz0(i10, i12 + i10), pz0Var, 1.0f);
        wz0Var.f32246a = yz0Var;
        wz0Var.f32252j = i11;
        arrayList.add(wz0Var);
        if (pagetablecell.rowspan > 1) {
            this.K.add(new PointF(i11, i11 + i13));
        }
        h();
    }

    public final void c() {
        boolean z10;
        tz0 tz0Var;
        a01 a01Var;
        a01 a01Var2;
        Throwable th2;
        int i10;
        int i11 = this.f25422n;
        if (i11 == 0) {
            if (this.e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                tz0Var = this.f25420c;
            } else {
                tz0Var = this.d;
            }
            int i12 = tz0Var.f30824b;
            if (i12 == Integer.MIN_VALUE) {
                i12 = 0;
            }
            if (i12 >= 0 && i12 <= 1024) {
                int[] iArr = new int[i12];
                int childCount = getChildCount();
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    yz0 yz0Var = d(i15).f32246a;
                    if (z10) {
                        a01Var = yz0Var.f32787a;
                    } else {
                        a01Var = yz0Var.f32788b;
                    }
                    xz0 xz0Var = a01Var.f24427b;
                    boolean z11 = a01Var.f24426a;
                    int a2 = xz0Var.a();
                    if (a2 > 0 && a2 <= 1024) {
                        if (z11) {
                            i13 = xz0Var.f32480a;
                        }
                        if (z10) {
                            a01Var2 = yz0Var.f32788b;
                        } else {
                            a01Var2 = yz0Var.f32787a;
                        }
                        xz0 xz0Var2 = a01Var2.f24427b;
                        int a10 = xz0Var2.a();
                        int i16 = xz0Var2.f32480a;
                        if (a10 > 0) {
                            th2 = null;
                            if (xz0Var2.a() <= 1024) {
                                boolean z12 = a01Var2.f24426a;
                                int a11 = xz0Var2.a();
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
                                    j(yz0Var, i13, a2, i14, a11);
                                } else {
                                    j(yz0Var, i14, a11, i13, a2);
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
                    i19 = (i19 * 31) + d(i20).f32246a.hashCode();
                }
                this.f25422n = i19;
                return;
            }
            g("Table grid count out of bounds");
            throw null;
        }
        int childCount3 = getChildCount();
        int i21 = 1;
        for (int i22 = 0; i22 < childCount3; i22++) {
            i21 = (i21 * 31) + d(i22).f32246a.hashCode();
        }
        if (i11 != i21) {
            h();
            c();
        }
    }

    public final wz0 d(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                return (wz0) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        b01 b01Var = this.Q;
        if (b01Var != null && b01Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(wz0 wz0Var, boolean z10, boolean z11) {
        tz0 tz0Var;
        int[] iArr;
        a01 a01Var;
        int i10;
        if (this.h == 1) {
            return f(wz0Var, z10, z11);
        }
        if (z10) {
            tz0Var = this.f25420c;
        } else {
            tz0Var = this.d;
        }
        if (z11) {
            if (tz0Var.f30829j == null) {
                tz0Var.f30829j = new int[tz0Var.e() + 1];
            }
            if (!tz0Var.f30830k) {
                tz0Var.b(true);
                tz0Var.f30830k = true;
            }
            iArr = tz0Var.f30829j;
        } else {
            if (tz0Var.f30831l == null) {
                tz0Var.f30831l = new int[tz0Var.e() + 1];
            }
            if (!tz0Var.f30832m) {
                tz0Var.b(false);
                tz0Var.f30832m = true;
            }
            iArr = tz0Var.f30831l;
        }
        yz0 yz0Var = wz0Var.f32246a;
        if (z10) {
            a01Var = yz0Var.f32788b;
        } else {
            a01Var = yz0Var.f32787a;
        }
        xz0 xz0Var = a01Var.f24427b;
        if (z11) {
            i10 = xz0Var.f32480a;
        } else {
            i10 = xz0Var.f32481b;
        }
        return iArr[i10];
    }

    public final int f(wz0 wz0Var, boolean z10, boolean z11) {
        int i10;
        a01 a01Var;
        tz0 tz0Var;
        boolean z12;
        yz0 yz0Var = wz0Var.f32246a;
        if (z10) {
            if (z11) {
                i10 = ((ViewGroup.MarginLayoutParams) yz0Var).leftMargin;
            } else {
                i10 = ((ViewGroup.MarginLayoutParams) yz0Var).rightMargin;
            }
        } else if (z11) {
            i10 = ((ViewGroup.MarginLayoutParams) yz0Var).topMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) yz0Var).bottomMargin;
        }
        if (i10 == Integer.MIN_VALUE) {
            if (!this.f25421f) {
                return 0;
            }
            if (z10) {
                a01Var = yz0Var.f32788b;
            } else {
                a01Var = yz0Var.f32787a;
            }
            if (z10) {
                tz0Var = this.f25420c;
            } else {
                tz0Var = this.d;
            }
            xz0 xz0Var = a01Var.f24427b;
            if (z10 && this.I) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != z11) {
                int i11 = xz0Var.f32480a;
                return 0;
            }
            int i12 = xz0Var.f32481b;
            tz0Var.e();
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
        return this.f25420c.e();
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
        return this.f25421f;
    }

    public final void h() {
        this.f25422n = 0;
        tz0 tz0Var = this.f25420c;
        tz0Var.k();
        tz0 tz0Var2 = this.d;
        tz0Var2.k();
        if (tz0Var != null && tz0Var2 != null) {
            tz0Var.l();
            tz0Var2.l();
        }
    }

    public final void i(int i10, boolean z10) {
        boolean z11;
        a01 a01Var;
        tz0 tz0Var;
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            wz0 d = d(i14);
            yz0 yz0Var = d.f32246a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                if (this.f25419b == 2) {
                    i12 = ((int) (size / 2.0f)) - (this.v * 4);
                } else {
                    i12 = (int) (size / 1.5f);
                }
                d.e(this.O.createTextLayout(d.f32248c, i12));
                if (d.f32247b != null) {
                    ((ViewGroup.MarginLayoutParams) yz0Var).height = Math.max(this.f25425w, d.f32249f + this.f25423r + this.f25424s);
                    int emojiOnlyCount = d.f32247b.getEmojiOnlyCount();
                    if (emojiOnlyCount > 0) {
                        i13 = ((ViewGroup.MarginLayoutParams) yz0Var).height * emojiOnlyCount;
                    } else {
                        i13 = (this.v * 2) + d.e;
                    }
                    ((ViewGroup.MarginLayoutParams) yz0Var).width = i13;
                } else {
                    ((ViewGroup.MarginLayoutParams) yz0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) yz0Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) yz0Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) yz0Var).height, true);
            } else {
                if (this.e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    a01Var = yz0Var.f32788b;
                } else {
                    a01Var = yz0Var.f32787a;
                }
                if (a01.a(a01Var, z11) == U) {
                    xz0 xz0Var = a01Var.f24427b;
                    if (z11) {
                        tz0Var = this.f25420c;
                    } else {
                        tz0Var = this.d;
                    }
                    int[] g10 = tz0Var.g();
                    int e = (g10[xz0Var.f32481b] - g10[xz0Var.f32480a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        vz0 vz0Var = d.f32247b;
                        if (vz0Var != null) {
                            i11 = vz0Var.getEmojiOnlyCount();
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            int max = Math.max(1, Math.round(e / i11));
                            ((ViewGroup.MarginLayoutParams) yz0Var).height = max;
                            d.f32255m = max;
                        }
                        d.d(e(d, true, false) + e(d, true, true) + e, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) yz0Var).height, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) yz0Var).width, e(d, false, false) + e(d, false, true) + e, false);
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
        d01 d01Var = this;
        d01Var.c();
        tz0 tz0Var = d01Var.d;
        tz0 tz0Var2 = d01Var.f25420c;
        if (tz0Var2 != null && tz0Var != null) {
            tz0Var2.l();
            tz0Var.l();
        }
        d01Var.f25419b = 0;
        int childCount = d01Var.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            d01Var.f25419b = Math.max(d01Var.f25419b, d01Var.d(i17).f32246a.f32788b.f24427b.f32481b);
        }
        d01Var.i(i10, true);
        if (d01Var.e == 0) {
            i12 = tz0Var2.i(i10);
            if (d01Var.f25426x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                tz0Var2.v.f33062a = i12;
                tz0Var2.f30841w.f33062a = -i12;
                tz0Var2.f30836q = false;
                tz0Var2.g();
            }
            d01Var.i(i10, false);
            i13 = tz0Var.i(i11);
        } else {
            int i18 = tz0Var.i(i11);
            d01Var.i(i10, false);
            i12 = tz0Var2.i(i10);
            i13 = i18;
        }
        int max = Math.max(i13, d01Var.getSuggestedMinimumHeight());
        d01Var.setMeasuredDimension(i12, max);
        tz0Var2.v.f33062a = i12;
        tz0Var2.f30841w.f33062a = -i12;
        tz0Var2.f30836q = false;
        tz0Var2.g();
        tz0Var.v.f33062a = max;
        tz0Var.f30841w.f33062a = -max;
        tz0Var.f30836q = false;
        tz0Var.g();
        int[] g10 = tz0Var2.g();
        int[] g11 = tz0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = d01Var.J;
        arrayList.clear();
        int i19 = g10[g10.length - 1];
        int childCount2 = d01Var.getChildCount();
        int i20 = 0;
        while (i20 < childCount2) {
            int i21 = i20;
            wz0 d = d01Var.d(i21);
            yz0 yz0Var = d.f32246a;
            a01 a01Var = yz0Var.f32788b;
            a01 a01Var2 = yz0Var.f32787a;
            xz0 xz0Var = a01Var.f24427b;
            xz0 xz0Var2 = a01Var2.f24427b;
            int i22 = childCount2;
            int i23 = g10[xz0Var.f32480a];
            int i24 = g11[xz0Var2.f32480a];
            int i25 = g10[xz0Var.f32481b] - i23;
            int i26 = g11[xz0Var2.f32481b] - i24;
            int i27 = d.f32253k;
            tz0 tz0Var3 = tz0Var;
            int i28 = d.f32254l;
            pz0 a2 = a01.a(a01Var, true);
            pz0 a10 = a01.a(a01Var2, false);
            m.g3 f7 = tz0Var2.f();
            uz0 uz0Var = (uz0) ((Object[]) f7.d)[((int[]) f7.f16201b)[i21]];
            m.g3 f10 = tz0Var3.f();
            tz0 tz0Var4 = tz0Var2;
            uz0 uz0Var2 = (uz0) ((Object[]) f10.d)[((int[]) f10.f16201b)[i21]];
            int b10 = a2.b(d, i25 - uz0Var.d(true));
            int b11 = a10.b(d, i26 - uz0Var2.d(true));
            int e = d01Var.e(d, true, true);
            int e7 = d01Var.e(d, false, true);
            int e10 = d01Var.e(d, true, false);
            int i29 = e + e10;
            int e11 = e7 + d01Var.e(d, false, false);
            int a11 = uz0Var.a(d01Var, d, a2, i27 + i29, true);
            d01Var = this;
            int a12 = uz0Var2.a(d01Var, d, a10, i28 + e11, false);
            int c10 = a2.c(i27, i25 - i29);
            int c11 = a10.c(i28, i26 - e11);
            int i30 = i23 + b10 + a11;
            if (!d01Var.I) {
                i15 = e + i30;
            } else {
                i15 = ((i19 - c10) - e10) - i30;
            }
            int i31 = i15;
            int i32 = i24 + b11 + a12 + e7;
            if (d.f32248c != null) {
                if (c10 != d.f32253k || c11 != d.f32254l) {
                    i16 = 0;
                    d.d(c10, c11, false);
                } else {
                    i16 = 0;
                }
                int i33 = d.f32255m;
                if (i33 != 0 && i33 != c11) {
                    xz0 xz0Var3 = d.f32246a.f32787a.f24427b;
                    if (xz0Var3.f32481b - xz0Var3.f32480a <= 1) {
                        ArrayList arrayList2 = d01Var.K;
                        int size = arrayList2.size();
                        int i34 = i16;
                        while (true) {
                            if (i34 < size) {
                                PointF pointF = (PointF) arrayList2.get(i34);
                                float f11 = pointF.x;
                                float f12 = d.f32246a.f32787a.f24427b.f32480a;
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
            d.f32258p = i31;
            d.f32259q = i32;
            i20 = i21 + 1;
            tz0Var = tz0Var3;
            childCount2 = i22;
            tz0Var2 = tz0Var4;
        }
        int size2 = arrayList.size();
        int i35 = 0;
        while (i35 < size2) {
            wz0 wz0Var = (wz0) arrayList.get(i35);
            int i36 = wz0Var.f32254l;
            int i37 = wz0Var.d;
            int i38 = i36 - wz0Var.f32255m;
            ArrayList arrayList3 = d01Var.P;
            int size3 = arrayList3.size();
            for (int i39 = i37 + 1; i39 < size3; i39++) {
                wz0 wz0Var2 = (wz0) arrayList3.get(i39);
                if (wz0Var.f32246a.f32787a.f24427b.f32480a != wz0Var2.f32246a.f32787a.f24427b.f32480a) {
                    break;
                }
                int i40 = wz0Var.f32255m;
                int i41 = wz0Var2.f32255m;
                if (i40 < i41) {
                    z10 = true;
                    break;
                }
                int i42 = wz0Var2.f32254l - i41;
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
                    wz0 wz0Var3 = (wz0) arrayList3.get(i43);
                    if (wz0Var.f32246a.f32787a.f24427b.f32480a != wz0Var3.f32246a.f32787a.f24427b.f32480a) {
                        break;
                    }
                    int i44 = wz0Var.f32255m;
                    int i45 = wz0Var3.f32255m;
                    if (i44 < i45) {
                        z10 = true;
                        break;
                    }
                    int i46 = wz0Var3.f32254l - i45;
                    if (i46 > 0) {
                        i38 = Math.min(i38, i46);
                    }
                    i43--;
                }
            }
            if (!z10) {
                wz0Var.f32254l = wz0Var.f32255m;
                wz0Var.g();
                max -= i38;
                int i47 = wz0Var.f32246a.f32787a.f24427b.f32480a;
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
                    wz0 wz0Var4 = (wz0) arrayList3.get(i50);
                    if (wz0Var == wz0Var4) {
                        i14 = i50;
                    } else {
                        int i51 = wz0Var.f32246a.f32787a.f24427b.f32480a;
                        int i52 = wz0Var4.f32246a.f32787a.f24427b.f32480a;
                        if (i51 == i52) {
                            if (wz0Var4.f32255m != wz0Var4.f32254l) {
                                arrayList.remove(wz0Var4);
                                if (wz0Var4.d < i37) {
                                    i49--;
                                }
                                i48--;
                            }
                            int i53 = wz0Var4.f32254l - i38;
                            wz0Var4.f32254l = i53;
                            i14 = i50;
                            wz0Var4.d(wz0Var4.f32253k, i53, true);
                        } else {
                            i14 = i50;
                            if (i51 < i52) {
                                wz0Var4.f32259q -= i38;
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
        int childCount3 = d01Var.getChildCount();
        for (int i54 = 0; i54 < childCount3; i54++) {
            wz0 d10 = d01Var.d(i54);
            d01Var.O.onLayoutChild(d10.f32247b, d10.b(), d10.c());
            d10.f32256n = d10.f32258p;
            d10.f32257o = d10.f32253k;
        }
        d01Var.f25427y = i19;
        d01Var.E = max;
        d01Var.F = copyOf;
        d01Var.setMeasuredDimension(i19, max);
    }

    @Override
    public final void requestLayout() {
        tz0 tz0Var;
        super.requestLayout();
        tz0 tz0Var2 = this.f25420c;
        if (tz0Var2 != null && (tz0Var = this.d) != null) {
            tz0Var2.l();
            tz0Var.l();
        }
    }

    public void setAlignmentMode(int i10) {
        this.h = i10;
        requestLayout();
    }

    public void setColumnCount(int i10) {
        this.f25420c.n(i10);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        tz0 tz0Var = this.f25420c;
        tz0Var.f30840u = z10;
        tz0Var.k();
        h();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.G = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.f25426x == z10) {
            return;
        }
        this.f25426x = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i10) {
        this.f25425w = i10;
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
        this.f25427y = Math.max(measuredWidth, i10);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            wz0 d = d(i13);
            if (measuredWidth > 0 && (i12 = this.f25427y) != measuredWidth) {
                float f7 = measuredWidth;
                int round = Math.round((d.f32256n * i12) / f7);
                int round2 = Math.round(((d.f32256n + d.f32257o) * this.f25427y) / f7);
                d.f32258p = round;
                d.f32253k = Math.max(0, round2 - round);
                if (d.f32248c != null && d.f32247b != null) {
                    d.f();
                }
            } else {
                int i14 = d.f32256n;
                d.f32258p = i14;
                d.f32253k = Math.max(0, (d.f32257o + i14) - i14);
                if (d.f32248c != null && d.f32247b != null) {
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
                wz0 d10 = d(i18);
                vz0 vz0Var = d10.f32247b;
                if (vz0Var != null) {
                    i11 = vz0Var.getEmojiOnlyCount();
                } else {
                    i11 = 0;
                }
                if (i11 > 0) {
                    xz0 xz0Var = d10.f32246a.f32787a.f24427b;
                    int max = Math.max(0, xz0Var.f32480a);
                    int min = Math.min(i15, xz0Var.f32481b);
                    if (max < min) {
                        int i19 = 0;
                        for (int i20 = max; i20 < min; i20++) {
                            i19 += iArr2[i20];
                        }
                        int max2 = Math.max(1, Math.round(d10.f32253k / i11)) - i19;
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
                wz0 d11 = d(i25);
                xz0 xz0Var2 = d11.f32246a.f32787a.f24427b;
                int max3 = Math.max(0, Math.min(i15, xz0Var2.f32480a));
                int max4 = Math.max(max3, Math.min(i15, xz0Var2.f32481b));
                int i26 = iArr4[max3];
                int i27 = iArr4[max4];
                d11.f32259q = i26;
                d11.f32254l = Math.max(0, i27 - i26);
                if (d11.f32248c != null) {
                    d11.g();
                }
                this.O.onLayoutChild(d11.f32247b, d11.b(), d11.c());
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
        tz0 tz0Var = this.d;
        tz0Var.f30840u = z10;
        tz0Var.k();
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
        this.f25421f = z10;
        requestLayout();
    }
}
