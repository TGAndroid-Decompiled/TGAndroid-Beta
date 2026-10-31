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
import org.telegram.tgnet.tl.TL_iv;
public final class py0 extends View {
    public static final by0 R = new by0(0);
    public static final by0 S = new by0(1);
    public static final by0 T = new by0(3);
    public static final by0 U = new by0(4);
    public int D;
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
    public final oy0 O;
    public final ArrayList P;
    public final ny0 Q;
    public final org.telegram.ui.Cells.k9 f29461a;
    public int f29462b;
    public final fy0 f29463c;
    public final fy0 d;
    public int e;
    public boolean f29464f;
    public int h;
    public int f29465n;
    public int f29466r;
    public int f29467s;
    public int f29468w;
    public int f29469x;
    public boolean f29470y;

    public py0(Context context, oy0 oy0Var, org.telegram.ui.Cells.k9 k9Var) {
        super(context);
        this.f29463c = new fy0(this, true);
        this.d = new fy0(this, false);
        this.e = 0;
        this.f29464f = false;
        this.h = 1;
        this.f29465n = 0;
        this.f29466r = org.telegram.messenger.i0.L(8.0f);
        this.f29467s = org.telegram.messenger.i0.L(9.0f);
        this.f29468w = org.telegram.messenger.i0.L(12.0f);
        this.f29470y = true;
        this.F = new int[0];
        this.J = new ArrayList();
        this.K = new ArrayList();
        new Path();
        this.L = new Path();
        this.M = new RectF();
        this.N = new float[8];
        this.P = new ArrayList();
        this.f29461a = k9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.O = oy0Var;
        ny0 ny0Var = new ny0(this, this);
        this.Q = ny0Var;
        r0.h0.j(this, ny0Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(sc.e.A(str, ". "));
    }

    public static void j(ky0 ky0Var, int i10, int i11, int i12, int i13) {
        jy0 jy0Var = new jy0(i10, i11 + i10);
        my0 my0Var = ky0Var.f27940a;
        ky0Var.f27940a = new my0(my0Var.f28634a, jy0Var, my0Var.f28636c, my0Var.d);
        jy0 jy0Var2 = new jy0(i12, i13 + i12);
        my0 my0Var2 = ky0Var.f27941b;
        ky0Var.f27941b = new my0(my0Var2.f28634a, jy0Var2, my0Var2.f28636c, my0Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        iy0 iy0Var = new iy0(this, arrayList.size());
        ky0 ky0Var = new ky0();
        jy0 jy0Var = new jy0(i11, i13 + i11);
        by0 by0Var = U;
        ky0Var.f27940a = new my0(false, jy0Var, by0Var, 0.0f);
        ky0Var.f27941b = new my0(false, new jy0(i10, i12 + i10), by0Var, 0.0f);
        iy0Var.f27132a = ky0Var;
        iy0Var.f27138j = i11;
        arrayList.add(iy0Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        int i13;
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        iy0 iy0Var = new iy0(this, arrayList.size());
        iy0Var.f27134c = pagetablecell;
        ky0 ky0Var = new ky0();
        int i14 = pagetablecell.rowspan;
        if (i14 == 0) {
            i14 = 1;
        }
        jy0 jy0Var = new jy0(i11, i14 + i11);
        by0 by0Var = U;
        ky0Var.f27940a = new my0(false, jy0Var, by0Var, 0.0f);
        ky0Var.f27941b = new my0(false, new jy0(i10, i12 + i10), by0Var, 1.0f);
        iy0Var.f27132a = ky0Var;
        iy0Var.f27138j = i11;
        arrayList.add(iy0Var);
        if (pagetablecell.rowspan > 1) {
            this.K.add(new PointF(i11, i11 + i13));
        }
        h();
    }

    public final void c() {
        boolean z10;
        fy0 fy0Var;
        my0 my0Var;
        my0 my0Var2;
        Throwable th2;
        int i10;
        int i11 = this.f29465n;
        if (i11 == 0) {
            if (this.e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                fy0Var = this.f29463c;
            } else {
                fy0Var = this.d;
            }
            int i12 = fy0Var.f26153b;
            if (i12 == Integer.MIN_VALUE) {
                i12 = 0;
            }
            if (i12 >= 0 && i12 <= 1024) {
                int[] iArr = new int[i12];
                int childCount = getChildCount();
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    ky0 ky0Var = d(i15).f27132a;
                    if (z10) {
                        my0Var = ky0Var.f27940a;
                    } else {
                        my0Var = ky0Var.f27941b;
                    }
                    jy0 jy0Var = my0Var.f28635b;
                    boolean z11 = my0Var.f28634a;
                    int a2 = jy0Var.a();
                    if (a2 > 0 && a2 <= 1024) {
                        if (z11) {
                            i13 = jy0Var.f27520a;
                        }
                        if (z10) {
                            my0Var2 = ky0Var.f27941b;
                        } else {
                            my0Var2 = ky0Var.f27940a;
                        }
                        jy0 jy0Var2 = my0Var2.f28635b;
                        int a10 = jy0Var2.a();
                        int i16 = jy0Var2.f27520a;
                        if (a10 > 0) {
                            th2 = null;
                            if (jy0Var2.a() <= 1024) {
                                boolean z12 = my0Var2.f28634a;
                                int a11 = jy0Var2.a();
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
                                    j(ky0Var, i13, a2, i14, a11);
                                } else {
                                    j(ky0Var, i14, a11, i13, a2);
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
                    i19 = (i19 * 31) + d(i20).f27132a.hashCode();
                }
                this.f29465n = i19;
                return;
            }
            g("Table grid count out of bounds");
            throw null;
        }
        int childCount3 = getChildCount();
        int i21 = 1;
        for (int i22 = 0; i22 < childCount3; i22++) {
            i21 = (i21 * 31) + d(i22).f27132a.hashCode();
        }
        if (i11 != i21) {
            h();
            c();
        }
    }

    public final iy0 d(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                return (iy0) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        ny0 ny0Var = this.Q;
        if (ny0Var != null && ny0Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(iy0 iy0Var, boolean z10, boolean z11) {
        fy0 fy0Var;
        int[] iArr;
        my0 my0Var;
        int i10;
        if (this.h == 1) {
            return f(iy0Var, z10, z11);
        }
        if (z10) {
            fy0Var = this.f29463c;
        } else {
            fy0Var = this.d;
        }
        if (z11) {
            if (fy0Var.f26158j == null) {
                fy0Var.f26158j = new int[fy0Var.e() + 1];
            }
            if (!fy0Var.f26159k) {
                fy0Var.b(true);
                fy0Var.f26159k = true;
            }
            iArr = fy0Var.f26158j;
        } else {
            if (fy0Var.f26160l == null) {
                fy0Var.f26160l = new int[fy0Var.e() + 1];
            }
            if (!fy0Var.f26161m) {
                fy0Var.b(false);
                fy0Var.f26161m = true;
            }
            iArr = fy0Var.f26160l;
        }
        ky0 ky0Var = iy0Var.f27132a;
        if (z10) {
            my0Var = ky0Var.f27941b;
        } else {
            my0Var = ky0Var.f27940a;
        }
        jy0 jy0Var = my0Var.f28635b;
        if (z11) {
            i10 = jy0Var.f27520a;
        } else {
            i10 = jy0Var.f27521b;
        }
        return iArr[i10];
    }

    public final int f(iy0 iy0Var, boolean z10, boolean z11) {
        int i10;
        my0 my0Var;
        fy0 fy0Var;
        boolean z12;
        ky0 ky0Var = iy0Var.f27132a;
        if (z10) {
            if (z11) {
                i10 = ((ViewGroup.MarginLayoutParams) ky0Var).leftMargin;
            } else {
                i10 = ((ViewGroup.MarginLayoutParams) ky0Var).rightMargin;
            }
        } else if (z11) {
            i10 = ((ViewGroup.MarginLayoutParams) ky0Var).topMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) ky0Var).bottomMargin;
        }
        if (i10 == Integer.MIN_VALUE) {
            if (!this.f29464f) {
                return 0;
            }
            if (z10) {
                my0Var = ky0Var.f27941b;
            } else {
                my0Var = ky0Var.f27940a;
            }
            if (z10) {
                fy0Var = this.f29463c;
            } else {
                fy0Var = this.d;
            }
            jy0 jy0Var = my0Var.f28635b;
            if (z10 && this.I) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != z11) {
                int i11 = jy0Var.f27520a;
                return 0;
            }
            int i12 = jy0Var.f27521b;
            fy0Var.e();
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
        return this.f29463c.e();
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
        return this.f29464f;
    }

    public final void h() {
        this.f29465n = 0;
        fy0 fy0Var = this.f29463c;
        fy0Var.k();
        fy0 fy0Var2 = this.d;
        fy0Var2.k();
        if (fy0Var != null && fy0Var2 != null) {
            fy0Var.l();
            fy0Var2.l();
        }
    }

    public final void i(int i10, boolean z10) {
        boolean z11;
        my0 my0Var;
        fy0 fy0Var;
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            iy0 d = d(i14);
            ky0 ky0Var = d.f27132a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                if (this.f29462b == 2) {
                    i12 = ((int) (size / 2.0f)) - (this.f29468w * 4);
                } else {
                    i12 = (int) (size / 1.5f);
                }
                d.e(this.O.c(d.f27134c, i12));
                if (d.f27133b != null) {
                    ((ViewGroup.MarginLayoutParams) ky0Var).height = Math.max(this.f29469x, d.f27135f + this.f29466r + this.f29467s);
                    int b10 = d.f27133b.b();
                    if (b10 > 0) {
                        i13 = ((ViewGroup.MarginLayoutParams) ky0Var).height * b10;
                    } else {
                        i13 = (this.f29468w * 2) + d.e;
                    }
                    ((ViewGroup.MarginLayoutParams) ky0Var).width = i13;
                } else {
                    ((ViewGroup.MarginLayoutParams) ky0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) ky0Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) ky0Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) ky0Var).height, true);
            } else {
                if (this.e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    my0Var = ky0Var.f27941b;
                } else {
                    my0Var = ky0Var.f27940a;
                }
                if (my0.a(my0Var, z11) == U) {
                    jy0 jy0Var = my0Var.f28635b;
                    if (z11) {
                        fy0Var = this.f29463c;
                    } else {
                        fy0Var = this.d;
                    }
                    int[] g10 = fy0Var.g();
                    int e = (g10[jy0Var.f27521b] - g10[jy0Var.f27520a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        hy0 hy0Var = d.f27133b;
                        if (hy0Var != null) {
                            i11 = hy0Var.b();
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            int max = Math.max(1, Math.round(e / i11));
                            ((ViewGroup.MarginLayoutParams) ky0Var).height = max;
                            d.f27141m = max;
                        }
                        d.d(e(d, true, false) + e(d, true, true) + e, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) ky0Var).height, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) ky0Var).width, e(d, false, false) + e(d, false, true) + e, false);
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
        py0 py0Var = this;
        py0Var.c();
        fy0 fy0Var = py0Var.d;
        fy0 fy0Var2 = py0Var.f29463c;
        if (fy0Var2 != null && fy0Var != null) {
            fy0Var2.l();
            fy0Var.l();
        }
        py0Var.f29462b = 0;
        int childCount = py0Var.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            py0Var.f29462b = Math.max(py0Var.f29462b, py0Var.d(i17).f27132a.f27941b.f28635b.f27521b);
        }
        py0Var.i(i10, true);
        if (py0Var.e == 0) {
            i12 = fy0Var2.i(i10);
            if (py0Var.f29470y) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                fy0Var2.v.f28225a = i12;
                fy0Var2.f26170w.f28225a = -i12;
                fy0Var2.f26165q = false;
                fy0Var2.g();
            }
            py0Var.i(i10, false);
            i13 = fy0Var.i(i11);
        } else {
            int i18 = fy0Var.i(i11);
            py0Var.i(i10, false);
            i12 = fy0Var2.i(i10);
            i13 = i18;
        }
        int max = Math.max(i13, py0Var.getSuggestedMinimumHeight());
        py0Var.setMeasuredDimension(i12, max);
        fy0Var2.v.f28225a = i12;
        fy0Var2.f26170w.f28225a = -i12;
        fy0Var2.f26165q = false;
        fy0Var2.g();
        fy0Var.v.f28225a = max;
        fy0Var.f26170w.f28225a = -max;
        fy0Var.f26165q = false;
        fy0Var.g();
        int[] g10 = fy0Var2.g();
        int[] g11 = fy0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = py0Var.J;
        arrayList.clear();
        int i19 = g10[g10.length - 1];
        int childCount2 = py0Var.getChildCount();
        int i20 = 0;
        while (i20 < childCount2) {
            int i21 = i20;
            iy0 d = py0Var.d(i21);
            ky0 ky0Var = d.f27132a;
            my0 my0Var = ky0Var.f27941b;
            my0 my0Var2 = ky0Var.f27940a;
            jy0 jy0Var = my0Var.f28635b;
            jy0 jy0Var2 = my0Var2.f28635b;
            int i22 = childCount2;
            int i23 = g10[jy0Var.f27520a];
            int i24 = g11[jy0Var2.f27520a];
            int i25 = g10[jy0Var.f27521b] - i23;
            int i26 = g11[jy0Var2.f27521b] - i24;
            int i27 = d.f27139k;
            fy0 fy0Var3 = fy0Var;
            int i28 = d.f27140l;
            by0 a2 = my0.a(my0Var, true);
            by0 a10 = my0.a(my0Var2, false);
            li.k f7 = fy0Var2.f();
            gy0 gy0Var = (gy0) ((Object[]) f7.d)[((int[]) f7.f12100b)[i21]];
            li.k f10 = fy0Var3.f();
            fy0 fy0Var4 = fy0Var2;
            gy0 gy0Var2 = (gy0) ((Object[]) f10.d)[((int[]) f10.f12100b)[i21]];
            int b10 = a2.b(d, i25 - gy0Var.d(true));
            int b11 = a10.b(d, i26 - gy0Var2.d(true));
            int e = py0Var.e(d, true, true);
            int e7 = py0Var.e(d, false, true);
            int e10 = py0Var.e(d, true, false);
            int i29 = e + e10;
            int e11 = e7 + py0Var.e(d, false, false);
            int a11 = gy0Var.a(py0Var, d, a2, i27 + i29, true);
            py0Var = this;
            int a12 = gy0Var2.a(py0Var, d, a10, i28 + e11, false);
            int c10 = a2.c(i27, i25 - i29);
            int c11 = a10.c(i28, i26 - e11);
            int i30 = i23 + b10 + a11;
            if (!py0Var.I) {
                i15 = e + i30;
            } else {
                i15 = ((i19 - c10) - e10) - i30;
            }
            int i31 = i15;
            int i32 = i24 + b11 + a12 + e7;
            if (d.f27134c != null) {
                if (c10 != d.f27139k || c11 != d.f27140l) {
                    i16 = 0;
                    d.d(c10, c11, false);
                } else {
                    i16 = 0;
                }
                int i33 = d.f27141m;
                if (i33 != 0 && i33 != c11) {
                    jy0 jy0Var3 = d.f27132a.f27940a.f28635b;
                    if (jy0Var3.f27521b - jy0Var3.f27520a <= 1) {
                        ArrayList arrayList2 = py0Var.K;
                        int size = arrayList2.size();
                        int i34 = i16;
                        while (true) {
                            if (i34 < size) {
                                PointF pointF = (PointF) arrayList2.get(i34);
                                float f11 = pointF.x;
                                float f12 = d.f27132a.f27940a.f28635b.f27520a;
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
            d.f27144p = i31;
            d.f27145q = i32;
            i20 = i21 + 1;
            fy0Var = fy0Var3;
            childCount2 = i22;
            fy0Var2 = fy0Var4;
        }
        int size2 = arrayList.size();
        int i35 = 0;
        while (i35 < size2) {
            iy0 iy0Var = (iy0) arrayList.get(i35);
            int i36 = iy0Var.f27140l;
            int i37 = iy0Var.d;
            int i38 = i36 - iy0Var.f27141m;
            ArrayList arrayList3 = py0Var.P;
            int size3 = arrayList3.size();
            for (int i39 = i37 + 1; i39 < size3; i39++) {
                iy0 iy0Var2 = (iy0) arrayList3.get(i39);
                if (iy0Var.f27132a.f27940a.f28635b.f27520a != iy0Var2.f27132a.f27940a.f28635b.f27520a) {
                    break;
                }
                int i40 = iy0Var.f27141m;
                int i41 = iy0Var2.f27141m;
                if (i40 < i41) {
                    z10 = true;
                    break;
                }
                int i42 = iy0Var2.f27140l - i41;
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
                    iy0 iy0Var3 = (iy0) arrayList3.get(i43);
                    if (iy0Var.f27132a.f27940a.f28635b.f27520a != iy0Var3.f27132a.f27940a.f28635b.f27520a) {
                        break;
                    }
                    int i44 = iy0Var.f27141m;
                    int i45 = iy0Var3.f27141m;
                    if (i44 < i45) {
                        z10 = true;
                        break;
                    }
                    int i46 = iy0Var3.f27140l - i45;
                    if (i46 > 0) {
                        i38 = Math.min(i38, i46);
                    }
                    i43--;
                }
            }
            if (!z10) {
                iy0Var.f27140l = iy0Var.f27141m;
                iy0Var.g();
                max -= i38;
                int i47 = iy0Var.f27132a.f27940a.f28635b.f27520a;
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
                    iy0 iy0Var4 = (iy0) arrayList3.get(i50);
                    if (iy0Var == iy0Var4) {
                        i14 = i50;
                    } else {
                        int i51 = iy0Var.f27132a.f27940a.f28635b.f27520a;
                        int i52 = iy0Var4.f27132a.f27940a.f28635b.f27520a;
                        if (i51 == i52) {
                            if (iy0Var4.f27141m != iy0Var4.f27140l) {
                                arrayList.remove(iy0Var4);
                                if (iy0Var4.d < i37) {
                                    i49--;
                                }
                                i48--;
                            }
                            int i53 = iy0Var4.f27140l - i38;
                            iy0Var4.f27140l = i53;
                            i14 = i50;
                            iy0Var4.d(iy0Var4.f27139k, i53, true);
                        } else {
                            i14 = i50;
                            if (i51 < i52) {
                                iy0Var4.f27145q -= i38;
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
        int childCount3 = py0Var.getChildCount();
        for (int i54 = 0; i54 < childCount3; i54++) {
            iy0 d10 = py0Var.d(i54);
            py0Var.O.g(d10.f27133b, d10.c());
            d10.f27142n = d10.f27144p;
            d10.f27143o = d10.f27139k;
        }
        py0Var.D = i19;
        py0Var.E = max;
        py0Var.F = copyOf;
        py0Var.setMeasuredDimension(i19, max);
    }

    @Override
    public final void requestLayout() {
        fy0 fy0Var;
        super.requestLayout();
        fy0 fy0Var2 = this.f29463c;
        if (fy0Var2 != null && (fy0Var = this.d) != null) {
            fy0Var2.l();
            fy0Var.l();
        }
    }

    public void setAlignmentMode(int i10) {
        this.h = i10;
        requestLayout();
    }

    public void setColumnCount(int i10) {
        this.f29463c.n(i10);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        fy0 fy0Var = this.f29463c;
        fy0Var.f26169u = z10;
        fy0Var.k();
        h();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.G = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.f29470y == z10) {
            return;
        }
        this.f29470y = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i10) {
        this.f29469x = i10;
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
        this.D = Math.max(measuredWidth, i10);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            iy0 d = d(i13);
            if (measuredWidth > 0 && (i12 = this.D) != measuredWidth) {
                float f7 = measuredWidth;
                int round = Math.round((d.f27142n * i12) / f7);
                int round2 = Math.round(((d.f27142n + d.f27143o) * this.D) / f7);
                d.f27144p = round;
                d.f27139k = Math.max(0, round2 - round);
                if (d.f27134c != null && d.f27133b != null) {
                    d.f();
                }
            } else {
                int i14 = d.f27142n;
                d.f27144p = i14;
                d.f27139k = Math.max(0, (d.f27143o + i14) - i14);
                if (d.f27134c != null && d.f27133b != null) {
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
                iy0 d10 = d(i18);
                hy0 hy0Var = d10.f27133b;
                if (hy0Var != null) {
                    i11 = hy0Var.b();
                } else {
                    i11 = 0;
                }
                if (i11 > 0) {
                    jy0 jy0Var = d10.f27132a.f27940a.f28635b;
                    int max = Math.max(0, jy0Var.f27520a);
                    int min = Math.min(i15, jy0Var.f27521b);
                    if (max < min) {
                        int i19 = 0;
                        for (int i20 = max; i20 < min; i20++) {
                            i19 += iArr2[i20];
                        }
                        int max2 = Math.max(1, Math.round(d10.f27139k / i11)) - i19;
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
                iy0 d11 = d(i25);
                jy0 jy0Var2 = d11.f27132a.f27940a.f28635b;
                int max3 = Math.max(0, Math.min(i15, jy0Var2.f27520a));
                int max4 = Math.max(max3, Math.min(i15, jy0Var2.f27521b));
                int i26 = iArr4[max3];
                int i27 = iArr4[max4];
                d11.f27145q = i26;
                d11.f27140l = Math.max(0, i27 - i26);
                if (d11.f27134c != null) {
                    d11.g();
                }
                this.O.g(d11.f27133b, d11.c());
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
        fy0 fy0Var = this.d;
        fy0Var.f26169u = z10;
        fy0Var.k();
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
        this.f29464f = z10;
        requestLayout();
    }
}
