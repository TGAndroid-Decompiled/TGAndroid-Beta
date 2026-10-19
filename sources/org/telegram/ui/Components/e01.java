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
public final class e01 extends View {
    public static final qz0 R = new qz0(0);
    public static final qz0 S = new qz0(1);
    public static final qz0 T = new qz0(3);
    public static final qz0 U = new qz0(4);
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
    public final d01 O;
    public final ArrayList P;
    public final c01 Q;
    public final org.telegram.ui.Cells.n9 f25715a;
    public int f25716b;
    public final uz0 f25717c;
    public final uz0 d;
    public int e;
    public boolean f25718f;
    public int h;
    public int f25719n;
    public int f25720r;
    public int f25721s;
    public int v;
    public int f25722w;
    public boolean f25723x;
    public int f25724y;

    public e01(Context context, d01 d01Var, org.telegram.ui.Cells.n9 n9Var) {
        super(context);
        this.f25717c = new uz0(this, true);
        this.d = new uz0(this, false);
        this.e = 0;
        this.f25718f = false;
        this.h = 1;
        this.f25719n = 0;
        this.f25720r = AndroidUtilities.dp(8.0f);
        this.f25721s = AndroidUtilities.dp(9.0f);
        this.v = AndroidUtilities.dp(12.0f);
        this.f25723x = true;
        this.F = new int[0];
        this.J = new ArrayList();
        this.K = new ArrayList();
        new Path();
        this.L = new Path();
        this.M = new RectF();
        this.N = new float[8];
        this.P = new ArrayList();
        this.f25715a = n9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.O = d01Var;
        c01 c01Var = new c01(this, this);
        this.Q = c01Var;
        r0.i0.j(this, c01Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(r4.c.u(str, ". "));
    }

    public static void j(zz0 zz0Var, int i10, int i11, int i12, int i13) {
        yz0 yz0Var = new yz0(i10, i11 + i10);
        b01 b01Var = zz0Var.f33067a;
        zz0Var.f33067a = new b01(b01Var.f24760a, yz0Var, b01Var.f24762c, b01Var.d);
        yz0 yz0Var2 = new yz0(i12, i13 + i12);
        b01 b01Var2 = zz0Var.f33068b;
        zz0Var.f33068b = new b01(b01Var2.f24760a, yz0Var2, b01Var2.f24762c, b01Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        xz0 xz0Var = new xz0(this, arrayList.size());
        zz0 zz0Var = new zz0();
        yz0 yz0Var = new yz0(i11, i13 + i11);
        qz0 qz0Var = U;
        zz0Var.f33067a = new b01(false, yz0Var, qz0Var, 0.0f);
        zz0Var.f33068b = new b01(false, new yz0(i10, i12 + i10), qz0Var, 0.0f);
        xz0Var.f32486a = zz0Var;
        xz0Var.f32492j = i11;
        arrayList.add(xz0Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        int i13;
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        xz0 xz0Var = new xz0(this, arrayList.size());
        xz0Var.f32488c = pagetablecell;
        zz0 zz0Var = new zz0();
        int i14 = pagetablecell.rowspan;
        if (i14 == 0) {
            i14 = 1;
        }
        yz0 yz0Var = new yz0(i11, i14 + i11);
        qz0 qz0Var = U;
        zz0Var.f33067a = new b01(false, yz0Var, qz0Var, 0.0f);
        zz0Var.f33068b = new b01(false, new yz0(i10, i12 + i10), qz0Var, 1.0f);
        xz0Var.f32486a = zz0Var;
        xz0Var.f32492j = i11;
        arrayList.add(xz0Var);
        if (pagetablecell.rowspan > 1) {
            this.K.add(new PointF(i11, i11 + i13));
        }
        h();
    }

    public final void c() {
        boolean z10;
        uz0 uz0Var;
        b01 b01Var;
        b01 b01Var2;
        Throwable th2;
        int i10;
        int i11 = this.f25719n;
        if (i11 == 0) {
            if (this.e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                uz0Var = this.f25717c;
            } else {
                uz0Var = this.d;
            }
            int i12 = uz0Var.f31075b;
            if (i12 == Integer.MIN_VALUE) {
                i12 = 0;
            }
            if (i12 >= 0 && i12 <= 1024) {
                int[] iArr = new int[i12];
                int childCount = getChildCount();
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    zz0 zz0Var = d(i15).f32486a;
                    if (z10) {
                        b01Var = zz0Var.f33067a;
                    } else {
                        b01Var = zz0Var.f33068b;
                    }
                    yz0 yz0Var = b01Var.f24761b;
                    boolean z11 = b01Var.f24760a;
                    int a2 = yz0Var.a();
                    if (a2 > 0 && a2 <= 1024) {
                        if (z11) {
                            i13 = yz0Var.f32787a;
                        }
                        if (z10) {
                            b01Var2 = zz0Var.f33068b;
                        } else {
                            b01Var2 = zz0Var.f33067a;
                        }
                        yz0 yz0Var2 = b01Var2.f24761b;
                        int a10 = yz0Var2.a();
                        int i16 = yz0Var2.f32787a;
                        if (a10 > 0) {
                            th2 = null;
                            if (yz0Var2.a() <= 1024) {
                                boolean z12 = b01Var2.f24760a;
                                int a11 = yz0Var2.a();
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
                                    j(zz0Var, i13, a2, i14, a11);
                                } else {
                                    j(zz0Var, i14, a11, i13, a2);
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
                    i19 = (i19 * 31) + d(i20).f32486a.hashCode();
                }
                this.f25719n = i19;
                return;
            }
            g("Table grid count out of bounds");
            throw null;
        }
        int childCount3 = getChildCount();
        int i21 = 1;
        for (int i22 = 0; i22 < childCount3; i22++) {
            i21 = (i21 * 31) + d(i22).f32486a.hashCode();
        }
        if (i11 != i21) {
            h();
            c();
        }
    }

    public final xz0 d(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                return (xz0) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        c01 c01Var = this.Q;
        if (c01Var != null && c01Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(xz0 xz0Var, boolean z10, boolean z11) {
        uz0 uz0Var;
        int[] iArr;
        b01 b01Var;
        int i10;
        if (this.h == 1) {
            return f(xz0Var, z10, z11);
        }
        if (z10) {
            uz0Var = this.f25717c;
        } else {
            uz0Var = this.d;
        }
        if (z11) {
            if (uz0Var.f31080j == null) {
                uz0Var.f31080j = new int[uz0Var.e() + 1];
            }
            if (!uz0Var.f31081k) {
                uz0Var.b(true);
                uz0Var.f31081k = true;
            }
            iArr = uz0Var.f31080j;
        } else {
            if (uz0Var.f31082l == null) {
                uz0Var.f31082l = new int[uz0Var.e() + 1];
            }
            if (!uz0Var.f31083m) {
                uz0Var.b(false);
                uz0Var.f31083m = true;
            }
            iArr = uz0Var.f31082l;
        }
        zz0 zz0Var = xz0Var.f32486a;
        if (z10) {
            b01Var = zz0Var.f33068b;
        } else {
            b01Var = zz0Var.f33067a;
        }
        yz0 yz0Var = b01Var.f24761b;
        if (z11) {
            i10 = yz0Var.f32787a;
        } else {
            i10 = yz0Var.f32788b;
        }
        return iArr[i10];
    }

    public final int f(xz0 xz0Var, boolean z10, boolean z11) {
        int i10;
        b01 b01Var;
        uz0 uz0Var;
        boolean z12;
        zz0 zz0Var = xz0Var.f32486a;
        if (z10) {
            if (z11) {
                i10 = ((ViewGroup.MarginLayoutParams) zz0Var).leftMargin;
            } else {
                i10 = ((ViewGroup.MarginLayoutParams) zz0Var).rightMargin;
            }
        } else if (z11) {
            i10 = ((ViewGroup.MarginLayoutParams) zz0Var).topMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) zz0Var).bottomMargin;
        }
        if (i10 == Integer.MIN_VALUE) {
            if (!this.f25718f) {
                return 0;
            }
            if (z10) {
                b01Var = zz0Var.f33068b;
            } else {
                b01Var = zz0Var.f33067a;
            }
            if (z10) {
                uz0Var = this.f25717c;
            } else {
                uz0Var = this.d;
            }
            yz0 yz0Var = b01Var.f24761b;
            if (z10 && this.I) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != z11) {
                int i11 = yz0Var.f32787a;
                return 0;
            }
            int i12 = yz0Var.f32788b;
            uz0Var.e();
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
        return this.f25717c.e();
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
        return this.f25718f;
    }

    public final void h() {
        this.f25719n = 0;
        uz0 uz0Var = this.f25717c;
        uz0Var.k();
        uz0 uz0Var2 = this.d;
        uz0Var2.k();
        if (uz0Var != null && uz0Var2 != null) {
            uz0Var.l();
            uz0Var2.l();
        }
    }

    public final void i(int i10, boolean z10) {
        boolean z11;
        b01 b01Var;
        uz0 uz0Var;
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            xz0 d = d(i14);
            zz0 zz0Var = d.f32486a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                if (this.f25716b == 2) {
                    i12 = ((int) (size / 2.0f)) - (this.v * 4);
                } else {
                    i12 = (int) (size / 1.5f);
                }
                d.e(this.O.createTextLayout(d.f32488c, i12));
                if (d.f32487b != null) {
                    ((ViewGroup.MarginLayoutParams) zz0Var).height = Math.max(this.f25722w, d.f32489f + this.f25720r + this.f25721s);
                    int emojiOnlyCount = d.f32487b.getEmojiOnlyCount();
                    if (emojiOnlyCount > 0) {
                        i13 = ((ViewGroup.MarginLayoutParams) zz0Var).height * emojiOnlyCount;
                    } else {
                        i13 = (this.v * 2) + d.e;
                    }
                    ((ViewGroup.MarginLayoutParams) zz0Var).width = i13;
                } else {
                    ((ViewGroup.MarginLayoutParams) zz0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) zz0Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) zz0Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) zz0Var).height, true);
            } else {
                if (this.e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    b01Var = zz0Var.f33068b;
                } else {
                    b01Var = zz0Var.f33067a;
                }
                if (b01.a(b01Var, z11) == U) {
                    yz0 yz0Var = b01Var.f24761b;
                    if (z11) {
                        uz0Var = this.f25717c;
                    } else {
                        uz0Var = this.d;
                    }
                    int[] g10 = uz0Var.g();
                    int e = (g10[yz0Var.f32788b] - g10[yz0Var.f32787a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        wz0 wz0Var = d.f32487b;
                        if (wz0Var != null) {
                            i11 = wz0Var.getEmojiOnlyCount();
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            int max = Math.max(1, Math.round(e / i11));
                            ((ViewGroup.MarginLayoutParams) zz0Var).height = max;
                            d.f32495m = max;
                        }
                        d.d(e(d, true, false) + e(d, true, true) + e, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) zz0Var).height, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) zz0Var).width, e(d, false, false) + e(d, false, true) + e, false);
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
        e01 e01Var = this;
        e01Var.c();
        uz0 uz0Var = e01Var.d;
        uz0 uz0Var2 = e01Var.f25717c;
        if (uz0Var2 != null && uz0Var != null) {
            uz0Var2.l();
            uz0Var.l();
        }
        e01Var.f25716b = 0;
        int childCount = e01Var.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            e01Var.f25716b = Math.max(e01Var.f25716b, e01Var.d(i17).f32486a.f33068b.f24761b.f32788b);
        }
        e01Var.i(i10, true);
        if (e01Var.e == 0) {
            i12 = uz0Var2.i(i10);
            if (e01Var.f25723x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                uz0Var2.v.f24429a = i12;
                uz0Var2.f31092w.f24429a = -i12;
                uz0Var2.f31087q = false;
                uz0Var2.g();
            }
            e01Var.i(i10, false);
            i13 = uz0Var.i(i11);
        } else {
            int i18 = uz0Var.i(i11);
            e01Var.i(i10, false);
            i12 = uz0Var2.i(i10);
            i13 = i18;
        }
        int max = Math.max(i13, e01Var.getSuggestedMinimumHeight());
        e01Var.setMeasuredDimension(i12, max);
        uz0Var2.v.f24429a = i12;
        uz0Var2.f31092w.f24429a = -i12;
        uz0Var2.f31087q = false;
        uz0Var2.g();
        uz0Var.v.f24429a = max;
        uz0Var.f31092w.f24429a = -max;
        uz0Var.f31087q = false;
        uz0Var.g();
        int[] g10 = uz0Var2.g();
        int[] g11 = uz0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = e01Var.J;
        arrayList.clear();
        int i19 = g10[g10.length - 1];
        int childCount2 = e01Var.getChildCount();
        int i20 = 0;
        while (i20 < childCount2) {
            int i21 = i20;
            xz0 d = e01Var.d(i21);
            zz0 zz0Var = d.f32486a;
            b01 b01Var = zz0Var.f33068b;
            b01 b01Var2 = zz0Var.f33067a;
            yz0 yz0Var = b01Var.f24761b;
            yz0 yz0Var2 = b01Var2.f24761b;
            int i22 = childCount2;
            int i23 = g10[yz0Var.f32787a];
            int i24 = g11[yz0Var2.f32787a];
            int i25 = g10[yz0Var.f32788b] - i23;
            int i26 = g11[yz0Var2.f32788b] - i24;
            int i27 = d.f32493k;
            uz0 uz0Var3 = uz0Var;
            int i28 = d.f32494l;
            qz0 a2 = b01.a(b01Var, true);
            qz0 a10 = b01.a(b01Var2, false);
            m.g3 f7 = uz0Var2.f();
            vz0 vz0Var = (vz0) ((Object[]) f7.d)[((int[]) f7.f16204b)[i21]];
            m.g3 f10 = uz0Var3.f();
            uz0 uz0Var4 = uz0Var2;
            vz0 vz0Var2 = (vz0) ((Object[]) f10.d)[((int[]) f10.f16204b)[i21]];
            int b10 = a2.b(d, i25 - vz0Var.d(true));
            int b11 = a10.b(d, i26 - vz0Var2.d(true));
            int e = e01Var.e(d, true, true);
            int e7 = e01Var.e(d, false, true);
            int e10 = e01Var.e(d, true, false);
            int i29 = e + e10;
            int e11 = e7 + e01Var.e(d, false, false);
            int a11 = vz0Var.a(e01Var, d, a2, i27 + i29, true);
            e01Var = this;
            int a12 = vz0Var2.a(e01Var, d, a10, i28 + e11, false);
            int c10 = a2.c(i27, i25 - i29);
            int c11 = a10.c(i28, i26 - e11);
            int i30 = i23 + b10 + a11;
            if (!e01Var.I) {
                i15 = e + i30;
            } else {
                i15 = ((i19 - c10) - e10) - i30;
            }
            int i31 = i15;
            int i32 = i24 + b11 + a12 + e7;
            if (d.f32488c != null) {
                if (c10 != d.f32493k || c11 != d.f32494l) {
                    i16 = 0;
                    d.d(c10, c11, false);
                } else {
                    i16 = 0;
                }
                int i33 = d.f32495m;
                if (i33 != 0 && i33 != c11) {
                    yz0 yz0Var3 = d.f32486a.f33067a.f24761b;
                    if (yz0Var3.f32788b - yz0Var3.f32787a <= 1) {
                        ArrayList arrayList2 = e01Var.K;
                        int size = arrayList2.size();
                        int i34 = i16;
                        while (true) {
                            if (i34 < size) {
                                PointF pointF = (PointF) arrayList2.get(i34);
                                float f11 = pointF.x;
                                float f12 = d.f32486a.f33067a.f24761b.f32787a;
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
            d.f32498p = i31;
            d.f32499q = i32;
            i20 = i21 + 1;
            uz0Var = uz0Var3;
            childCount2 = i22;
            uz0Var2 = uz0Var4;
        }
        int size2 = arrayList.size();
        int i35 = 0;
        while (i35 < size2) {
            xz0 xz0Var = (xz0) arrayList.get(i35);
            int i36 = xz0Var.f32494l;
            int i37 = xz0Var.d;
            int i38 = i36 - xz0Var.f32495m;
            ArrayList arrayList3 = e01Var.P;
            int size3 = arrayList3.size();
            for (int i39 = i37 + 1; i39 < size3; i39++) {
                xz0 xz0Var2 = (xz0) arrayList3.get(i39);
                if (xz0Var.f32486a.f33067a.f24761b.f32787a != xz0Var2.f32486a.f33067a.f24761b.f32787a) {
                    break;
                }
                int i40 = xz0Var.f32495m;
                int i41 = xz0Var2.f32495m;
                if (i40 < i41) {
                    z10 = true;
                    break;
                }
                int i42 = xz0Var2.f32494l - i41;
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
                    xz0 xz0Var3 = (xz0) arrayList3.get(i43);
                    if (xz0Var.f32486a.f33067a.f24761b.f32787a != xz0Var3.f32486a.f33067a.f24761b.f32787a) {
                        break;
                    }
                    int i44 = xz0Var.f32495m;
                    int i45 = xz0Var3.f32495m;
                    if (i44 < i45) {
                        z10 = true;
                        break;
                    }
                    int i46 = xz0Var3.f32494l - i45;
                    if (i46 > 0) {
                        i38 = Math.min(i38, i46);
                    }
                    i43--;
                }
            }
            if (!z10) {
                xz0Var.f32494l = xz0Var.f32495m;
                xz0Var.g();
                max -= i38;
                int i47 = xz0Var.f32486a.f33067a.f24761b.f32787a;
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
                    xz0 xz0Var4 = (xz0) arrayList3.get(i50);
                    if (xz0Var == xz0Var4) {
                        i14 = i50;
                    } else {
                        int i51 = xz0Var.f32486a.f33067a.f24761b.f32787a;
                        int i52 = xz0Var4.f32486a.f33067a.f24761b.f32787a;
                        if (i51 == i52) {
                            if (xz0Var4.f32495m != xz0Var4.f32494l) {
                                arrayList.remove(xz0Var4);
                                if (xz0Var4.d < i37) {
                                    i49--;
                                }
                                i48--;
                            }
                            int i53 = xz0Var4.f32494l - i38;
                            xz0Var4.f32494l = i53;
                            i14 = i50;
                            xz0Var4.d(xz0Var4.f32493k, i53, true);
                        } else {
                            i14 = i50;
                            if (i51 < i52) {
                                xz0Var4.f32499q -= i38;
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
        int childCount3 = e01Var.getChildCount();
        for (int i54 = 0; i54 < childCount3; i54++) {
            xz0 d10 = e01Var.d(i54);
            e01Var.O.onLayoutChild(d10.f32487b, d10.b(), d10.c());
            d10.f32496n = d10.f32498p;
            d10.f32497o = d10.f32493k;
        }
        e01Var.f25724y = i19;
        e01Var.E = max;
        e01Var.F = copyOf;
        e01Var.setMeasuredDimension(i19, max);
    }

    @Override
    public final void requestLayout() {
        uz0 uz0Var;
        super.requestLayout();
        uz0 uz0Var2 = this.f25717c;
        if (uz0Var2 != null && (uz0Var = this.d) != null) {
            uz0Var2.l();
            uz0Var.l();
        }
    }

    public void setAlignmentMode(int i10) {
        this.h = i10;
        requestLayout();
    }

    public void setColumnCount(int i10) {
        this.f25717c.n(i10);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        uz0 uz0Var = this.f25717c;
        uz0Var.f31091u = z10;
        uz0Var.k();
        h();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.G = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.f25723x == z10) {
            return;
        }
        this.f25723x = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i10) {
        this.f25722w = i10;
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
        this.f25724y = Math.max(measuredWidth, i10);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            xz0 d = d(i13);
            if (measuredWidth > 0 && (i12 = this.f25724y) != measuredWidth) {
                float f7 = measuredWidth;
                int round = Math.round((d.f32496n * i12) / f7);
                int round2 = Math.round(((d.f32496n + d.f32497o) * this.f25724y) / f7);
                d.f32498p = round;
                d.f32493k = Math.max(0, round2 - round);
                if (d.f32488c != null && d.f32487b != null) {
                    d.f();
                }
            } else {
                int i14 = d.f32496n;
                d.f32498p = i14;
                d.f32493k = Math.max(0, (d.f32497o + i14) - i14);
                if (d.f32488c != null && d.f32487b != null) {
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
                xz0 d10 = d(i18);
                wz0 wz0Var = d10.f32487b;
                if (wz0Var != null) {
                    i11 = wz0Var.getEmojiOnlyCount();
                } else {
                    i11 = 0;
                }
                if (i11 > 0) {
                    yz0 yz0Var = d10.f32486a.f33067a.f24761b;
                    int max = Math.max(0, yz0Var.f32787a);
                    int min = Math.min(i15, yz0Var.f32788b);
                    if (max < min) {
                        int i19 = 0;
                        for (int i20 = max; i20 < min; i20++) {
                            i19 += iArr2[i20];
                        }
                        int max2 = Math.max(1, Math.round(d10.f32493k / i11)) - i19;
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
                xz0 d11 = d(i25);
                yz0 yz0Var2 = d11.f32486a.f33067a.f24761b;
                int max3 = Math.max(0, Math.min(i15, yz0Var2.f32787a));
                int max4 = Math.max(max3, Math.min(i15, yz0Var2.f32788b));
                int i26 = iArr4[max3];
                int i27 = iArr4[max4];
                d11.f32499q = i26;
                d11.f32494l = Math.max(0, i27 - i26);
                if (d11.f32488c != null) {
                    d11.g();
                }
                this.O.onLayoutChild(d11.f32487b, d11.b(), d11.c());
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
        uz0 uz0Var = this.d;
        uz0Var.f31091u = z10;
        uz0Var.k();
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
        this.f25718f = z10;
        requestLayout();
    }
}
