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
public final class qy0 extends View {
    public static final cy0 R = new cy0(0);
    public static final cy0 S = new cy0(1);
    public static final cy0 T = new cy0(3);
    public static final cy0 U = new cy0(4);
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
    public final py0 O;
    public final ArrayList P;
    public final oy0 Q;
    public final org.telegram.ui.Cells.k9 f29831a;
    public int f29832b;
    public final gy0 f29833c;
    public final gy0 d;
    public int e;
    public boolean f29834f;
    public int h;
    public int f29835n;
    public int f29836r;
    public int f29837s;
    public int f29838w;
    public int f29839x;
    public boolean f29840y;

    public qy0(Context context, py0 py0Var, org.telegram.ui.Cells.k9 k9Var) {
        super(context);
        this.f29833c = new gy0(this, true);
        this.d = new gy0(this, false);
        this.e = 0;
        this.f29834f = false;
        this.h = 1;
        this.f29835n = 0;
        this.f29836r = org.telegram.messenger.i0.L(8.0f);
        this.f29837s = org.telegram.messenger.i0.L(9.0f);
        this.f29838w = org.telegram.messenger.i0.L(12.0f);
        this.f29840y = true;
        this.F = new int[0];
        this.J = new ArrayList();
        this.K = new ArrayList();
        new Path();
        this.L = new Path();
        this.M = new RectF();
        this.N = new float[8];
        this.P = new ArrayList();
        this.f29831a = k9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.O = py0Var;
        oy0 oy0Var = new oy0(this, this);
        this.Q = oy0Var;
        r0.h0.j(this, oy0Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(sc.e.A(str, ". "));
    }

    public static void j(ly0 ly0Var, int i10, int i11, int i12, int i13) {
        ky0 ky0Var = new ky0(i10, i11 + i10);
        ny0 ny0Var = ly0Var.f28306a;
        ly0Var.f28306a = new ny0(ny0Var.f28986a, ky0Var, ny0Var.f28988c, ny0Var.d);
        ky0 ky0Var2 = new ky0(i12, i13 + i12);
        ny0 ny0Var2 = ly0Var.f28307b;
        ly0Var.f28307b = new ny0(ny0Var2.f28986a, ky0Var2, ny0Var2.f28988c, ny0Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        jy0 jy0Var = new jy0(this, arrayList.size());
        ly0 ly0Var = new ly0();
        ky0 ky0Var = new ky0(i11, i13 + i11);
        cy0 cy0Var = U;
        ly0Var.f28306a = new ny0(false, ky0Var, cy0Var, 0.0f);
        ly0Var.f28307b = new ny0(false, new ky0(i10, i12 + i10), cy0Var, 0.0f);
        jy0Var.f27591a = ly0Var;
        jy0Var.f27597j = i11;
        arrayList.add(jy0Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        int i13;
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        jy0 jy0Var = new jy0(this, arrayList.size());
        jy0Var.f27593c = pagetablecell;
        ly0 ly0Var = new ly0();
        int i14 = pagetablecell.rowspan;
        if (i14 == 0) {
            i14 = 1;
        }
        ky0 ky0Var = new ky0(i11, i14 + i11);
        cy0 cy0Var = U;
        ly0Var.f28306a = new ny0(false, ky0Var, cy0Var, 0.0f);
        ly0Var.f28307b = new ny0(false, new ky0(i10, i12 + i10), cy0Var, 1.0f);
        jy0Var.f27591a = ly0Var;
        jy0Var.f27597j = i11;
        arrayList.add(jy0Var);
        if (pagetablecell.rowspan > 1) {
            this.K.add(new PointF(i11, i11 + i13));
        }
        h();
    }

    public final void c() {
        boolean z10;
        gy0 gy0Var;
        ny0 ny0Var;
        ny0 ny0Var2;
        Throwable th2;
        int i10;
        int i11 = this.f29835n;
        if (i11 == 0) {
            if (this.e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                gy0Var = this.f29833c;
            } else {
                gy0Var = this.d;
            }
            int i12 = gy0Var.f26569b;
            if (i12 == Integer.MIN_VALUE) {
                i12 = 0;
            }
            if (i12 >= 0 && i12 <= 1024) {
                int[] iArr = new int[i12];
                int childCount = getChildCount();
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    ly0 ly0Var = d(i15).f27591a;
                    if (z10) {
                        ny0Var = ly0Var.f28306a;
                    } else {
                        ny0Var = ly0Var.f28307b;
                    }
                    ky0 ky0Var = ny0Var.f28987b;
                    boolean z11 = ny0Var.f28986a;
                    int a2 = ky0Var.a();
                    if (a2 > 0 && a2 <= 1024) {
                        if (z11) {
                            i13 = ky0Var.f27987a;
                        }
                        if (z10) {
                            ny0Var2 = ly0Var.f28307b;
                        } else {
                            ny0Var2 = ly0Var.f28306a;
                        }
                        ky0 ky0Var2 = ny0Var2.f28987b;
                        int a10 = ky0Var2.a();
                        int i16 = ky0Var2.f27987a;
                        if (a10 > 0) {
                            th2 = null;
                            if (ky0Var2.a() <= 1024) {
                                boolean z12 = ny0Var2.f28986a;
                                int a11 = ky0Var2.a();
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
                                    j(ly0Var, i13, a2, i14, a11);
                                } else {
                                    j(ly0Var, i14, a11, i13, a2);
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
                    i19 = (i19 * 31) + d(i20).f27591a.hashCode();
                }
                this.f29835n = i19;
                return;
            }
            g("Table grid count out of bounds");
            throw null;
        }
        int childCount3 = getChildCount();
        int i21 = 1;
        for (int i22 = 0; i22 < childCount3; i22++) {
            i21 = (i21 * 31) + d(i22).f27591a.hashCode();
        }
        if (i11 != i21) {
            h();
            c();
        }
    }

    public final jy0 d(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                return (jy0) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        oy0 oy0Var = this.Q;
        if (oy0Var != null && oy0Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(jy0 jy0Var, boolean z10, boolean z11) {
        gy0 gy0Var;
        int[] iArr;
        ny0 ny0Var;
        int i10;
        if (this.h == 1) {
            return f(jy0Var, z10, z11);
        }
        if (z10) {
            gy0Var = this.f29833c;
        } else {
            gy0Var = this.d;
        }
        if (z11) {
            if (gy0Var.f26574j == null) {
                gy0Var.f26574j = new int[gy0Var.e() + 1];
            }
            if (!gy0Var.f26575k) {
                gy0Var.b(true);
                gy0Var.f26575k = true;
            }
            iArr = gy0Var.f26574j;
        } else {
            if (gy0Var.f26576l == null) {
                gy0Var.f26576l = new int[gy0Var.e() + 1];
            }
            if (!gy0Var.f26577m) {
                gy0Var.b(false);
                gy0Var.f26577m = true;
            }
            iArr = gy0Var.f26576l;
        }
        ly0 ly0Var = jy0Var.f27591a;
        if (z10) {
            ny0Var = ly0Var.f28307b;
        } else {
            ny0Var = ly0Var.f28306a;
        }
        ky0 ky0Var = ny0Var.f28987b;
        if (z11) {
            i10 = ky0Var.f27987a;
        } else {
            i10 = ky0Var.f27988b;
        }
        return iArr[i10];
    }

    public final int f(jy0 jy0Var, boolean z10, boolean z11) {
        int i10;
        ny0 ny0Var;
        gy0 gy0Var;
        boolean z12;
        ly0 ly0Var = jy0Var.f27591a;
        if (z10) {
            if (z11) {
                i10 = ((ViewGroup.MarginLayoutParams) ly0Var).leftMargin;
            } else {
                i10 = ((ViewGroup.MarginLayoutParams) ly0Var).rightMargin;
            }
        } else if (z11) {
            i10 = ((ViewGroup.MarginLayoutParams) ly0Var).topMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) ly0Var).bottomMargin;
        }
        if (i10 == Integer.MIN_VALUE) {
            if (!this.f29834f) {
                return 0;
            }
            if (z10) {
                ny0Var = ly0Var.f28307b;
            } else {
                ny0Var = ly0Var.f28306a;
            }
            if (z10) {
                gy0Var = this.f29833c;
            } else {
                gy0Var = this.d;
            }
            ky0 ky0Var = ny0Var.f28987b;
            if (z10 && this.I) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != z11) {
                int i11 = ky0Var.f27987a;
                return 0;
            }
            int i12 = ky0Var.f27988b;
            gy0Var.e();
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
        return this.f29833c.e();
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
        return this.f29834f;
    }

    public final void h() {
        this.f29835n = 0;
        gy0 gy0Var = this.f29833c;
        gy0Var.k();
        gy0 gy0Var2 = this.d;
        gy0Var2.k();
        if (gy0Var != null && gy0Var2 != null) {
            gy0Var.l();
            gy0Var2.l();
        }
    }

    public final void i(int i10, boolean z10) {
        boolean z11;
        ny0 ny0Var;
        gy0 gy0Var;
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            jy0 d = d(i14);
            ly0 ly0Var = d.f27591a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                if (this.f29832b == 2) {
                    i12 = ((int) (size / 2.0f)) - (this.f29838w * 4);
                } else {
                    i12 = (int) (size / 1.5f);
                }
                d.e(this.O.c(d.f27593c, i12));
                if (d.f27592b != null) {
                    ((ViewGroup.MarginLayoutParams) ly0Var).height = Math.max(this.f29839x, d.f27594f + this.f29836r + this.f29837s);
                    int b10 = d.f27592b.b();
                    if (b10 > 0) {
                        i13 = ((ViewGroup.MarginLayoutParams) ly0Var).height * b10;
                    } else {
                        i13 = (this.f29838w * 2) + d.e;
                    }
                    ((ViewGroup.MarginLayoutParams) ly0Var).width = i13;
                } else {
                    ((ViewGroup.MarginLayoutParams) ly0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) ly0Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) ly0Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) ly0Var).height, true);
            } else {
                if (this.e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    ny0Var = ly0Var.f28307b;
                } else {
                    ny0Var = ly0Var.f28306a;
                }
                if (ny0.a(ny0Var, z11) == U) {
                    ky0 ky0Var = ny0Var.f28987b;
                    if (z11) {
                        gy0Var = this.f29833c;
                    } else {
                        gy0Var = this.d;
                    }
                    int[] g10 = gy0Var.g();
                    int e = (g10[ky0Var.f27988b] - g10[ky0Var.f27987a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        iy0 iy0Var = d.f27592b;
                        if (iy0Var != null) {
                            i11 = iy0Var.b();
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            int max = Math.max(1, Math.round(e / i11));
                            ((ViewGroup.MarginLayoutParams) ly0Var).height = max;
                            d.f27600m = max;
                        }
                        d.d(e(d, true, false) + e(d, true, true) + e, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) ly0Var).height, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) ly0Var).width, e(d, false, false) + e(d, false, true) + e, false);
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
        qy0 qy0Var = this;
        qy0Var.c();
        gy0 gy0Var = qy0Var.d;
        gy0 gy0Var2 = qy0Var.f29833c;
        if (gy0Var2 != null && gy0Var != null) {
            gy0Var2.l();
            gy0Var.l();
        }
        qy0Var.f29832b = 0;
        int childCount = qy0Var.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            qy0Var.f29832b = Math.max(qy0Var.f29832b, qy0Var.d(i17).f27591a.f28307b.f28987b.f27988b);
        }
        qy0Var.i(i10, true);
        if (qy0Var.e == 0) {
            i12 = gy0Var2.i(i10);
            if (qy0Var.f29840y) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                gy0Var2.v.f28614a = i12;
                gy0Var2.f26586w.f28614a = -i12;
                gy0Var2.f26581q = false;
                gy0Var2.g();
            }
            qy0Var.i(i10, false);
            i13 = gy0Var.i(i11);
        } else {
            int i18 = gy0Var.i(i11);
            qy0Var.i(i10, false);
            i12 = gy0Var2.i(i10);
            i13 = i18;
        }
        int max = Math.max(i13, qy0Var.getSuggestedMinimumHeight());
        qy0Var.setMeasuredDimension(i12, max);
        gy0Var2.v.f28614a = i12;
        gy0Var2.f26586w.f28614a = -i12;
        gy0Var2.f26581q = false;
        gy0Var2.g();
        gy0Var.v.f28614a = max;
        gy0Var.f26586w.f28614a = -max;
        gy0Var.f26581q = false;
        gy0Var.g();
        int[] g10 = gy0Var2.g();
        int[] g11 = gy0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = qy0Var.J;
        arrayList.clear();
        int i19 = g10[g10.length - 1];
        int childCount2 = qy0Var.getChildCount();
        int i20 = 0;
        while (i20 < childCount2) {
            int i21 = i20;
            jy0 d = qy0Var.d(i21);
            ly0 ly0Var = d.f27591a;
            ny0 ny0Var = ly0Var.f28307b;
            ny0 ny0Var2 = ly0Var.f28306a;
            ky0 ky0Var = ny0Var.f28987b;
            ky0 ky0Var2 = ny0Var2.f28987b;
            int i22 = childCount2;
            int i23 = g10[ky0Var.f27987a];
            int i24 = g11[ky0Var2.f27987a];
            int i25 = g10[ky0Var.f27988b] - i23;
            int i26 = g11[ky0Var2.f27988b] - i24;
            int i27 = d.f27598k;
            gy0 gy0Var3 = gy0Var;
            int i28 = d.f27599l;
            cy0 a2 = ny0.a(ny0Var, true);
            cy0 a10 = ny0.a(ny0Var2, false);
            li.k f7 = gy0Var2.f();
            hy0 hy0Var = (hy0) ((Object[]) f7.d)[((int[]) f7.f12101b)[i21]];
            li.k f10 = gy0Var3.f();
            gy0 gy0Var4 = gy0Var2;
            hy0 hy0Var2 = (hy0) ((Object[]) f10.d)[((int[]) f10.f12101b)[i21]];
            int b10 = a2.b(d, i25 - hy0Var.d(true));
            int b11 = a10.b(d, i26 - hy0Var2.d(true));
            int e = qy0Var.e(d, true, true);
            int e7 = qy0Var.e(d, false, true);
            int e10 = qy0Var.e(d, true, false);
            int i29 = e + e10;
            int e11 = e7 + qy0Var.e(d, false, false);
            int a11 = hy0Var.a(qy0Var, d, a2, i27 + i29, true);
            qy0Var = this;
            int a12 = hy0Var2.a(qy0Var, d, a10, i28 + e11, false);
            int c10 = a2.c(i27, i25 - i29);
            int c11 = a10.c(i28, i26 - e11);
            int i30 = i23 + b10 + a11;
            if (!qy0Var.I) {
                i15 = e + i30;
            } else {
                i15 = ((i19 - c10) - e10) - i30;
            }
            int i31 = i15;
            int i32 = i24 + b11 + a12 + e7;
            if (d.f27593c != null) {
                if (c10 != d.f27598k || c11 != d.f27599l) {
                    i16 = 0;
                    d.d(c10, c11, false);
                } else {
                    i16 = 0;
                }
                int i33 = d.f27600m;
                if (i33 != 0 && i33 != c11) {
                    ky0 ky0Var3 = d.f27591a.f28306a.f28987b;
                    if (ky0Var3.f27988b - ky0Var3.f27987a <= 1) {
                        ArrayList arrayList2 = qy0Var.K;
                        int size = arrayList2.size();
                        int i34 = i16;
                        while (true) {
                            if (i34 < size) {
                                PointF pointF = (PointF) arrayList2.get(i34);
                                float f11 = pointF.x;
                                float f12 = d.f27591a.f28306a.f28987b.f27987a;
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
            d.f27603p = i31;
            d.f27604q = i32;
            i20 = i21 + 1;
            gy0Var = gy0Var3;
            childCount2 = i22;
            gy0Var2 = gy0Var4;
        }
        int size2 = arrayList.size();
        int i35 = 0;
        while (i35 < size2) {
            jy0 jy0Var = (jy0) arrayList.get(i35);
            int i36 = jy0Var.f27599l;
            int i37 = jy0Var.d;
            int i38 = i36 - jy0Var.f27600m;
            ArrayList arrayList3 = qy0Var.P;
            int size3 = arrayList3.size();
            for (int i39 = i37 + 1; i39 < size3; i39++) {
                jy0 jy0Var2 = (jy0) arrayList3.get(i39);
                if (jy0Var.f27591a.f28306a.f28987b.f27987a != jy0Var2.f27591a.f28306a.f28987b.f27987a) {
                    break;
                }
                int i40 = jy0Var.f27600m;
                int i41 = jy0Var2.f27600m;
                if (i40 < i41) {
                    z10 = true;
                    break;
                }
                int i42 = jy0Var2.f27599l - i41;
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
                    jy0 jy0Var3 = (jy0) arrayList3.get(i43);
                    if (jy0Var.f27591a.f28306a.f28987b.f27987a != jy0Var3.f27591a.f28306a.f28987b.f27987a) {
                        break;
                    }
                    int i44 = jy0Var.f27600m;
                    int i45 = jy0Var3.f27600m;
                    if (i44 < i45) {
                        z10 = true;
                        break;
                    }
                    int i46 = jy0Var3.f27599l - i45;
                    if (i46 > 0) {
                        i38 = Math.min(i38, i46);
                    }
                    i43--;
                }
            }
            if (!z10) {
                jy0Var.f27599l = jy0Var.f27600m;
                jy0Var.g();
                max -= i38;
                int i47 = jy0Var.f27591a.f28306a.f28987b.f27987a;
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
                    jy0 jy0Var4 = (jy0) arrayList3.get(i50);
                    if (jy0Var == jy0Var4) {
                        i14 = i50;
                    } else {
                        int i51 = jy0Var.f27591a.f28306a.f28987b.f27987a;
                        int i52 = jy0Var4.f27591a.f28306a.f28987b.f27987a;
                        if (i51 == i52) {
                            if (jy0Var4.f27600m != jy0Var4.f27599l) {
                                arrayList.remove(jy0Var4);
                                if (jy0Var4.d < i37) {
                                    i49--;
                                }
                                i48--;
                            }
                            int i53 = jy0Var4.f27599l - i38;
                            jy0Var4.f27599l = i53;
                            i14 = i50;
                            jy0Var4.d(jy0Var4.f27598k, i53, true);
                        } else {
                            i14 = i50;
                            if (i51 < i52) {
                                jy0Var4.f27604q -= i38;
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
        int childCount3 = qy0Var.getChildCount();
        for (int i54 = 0; i54 < childCount3; i54++) {
            jy0 d10 = qy0Var.d(i54);
            qy0Var.O.g(d10.f27592b, d10.c());
            d10.f27601n = d10.f27603p;
            d10.f27602o = d10.f27598k;
        }
        qy0Var.D = i19;
        qy0Var.E = max;
        qy0Var.F = copyOf;
        qy0Var.setMeasuredDimension(i19, max);
    }

    @Override
    public final void requestLayout() {
        gy0 gy0Var;
        super.requestLayout();
        gy0 gy0Var2 = this.f29833c;
        if (gy0Var2 != null && (gy0Var = this.d) != null) {
            gy0Var2.l();
            gy0Var.l();
        }
    }

    public void setAlignmentMode(int i10) {
        this.h = i10;
        requestLayout();
    }

    public void setColumnCount(int i10) {
        this.f29833c.n(i10);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        gy0 gy0Var = this.f29833c;
        gy0Var.f26585u = z10;
        gy0Var.k();
        h();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.G = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.f29840y == z10) {
            return;
        }
        this.f29840y = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i10) {
        this.f29839x = i10;
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
            jy0 d = d(i13);
            if (measuredWidth > 0 && (i12 = this.D) != measuredWidth) {
                float f7 = measuredWidth;
                int round = Math.round((d.f27601n * i12) / f7);
                int round2 = Math.round(((d.f27601n + d.f27602o) * this.D) / f7);
                d.f27603p = round;
                d.f27598k = Math.max(0, round2 - round);
                if (d.f27593c != null && d.f27592b != null) {
                    d.f();
                }
            } else {
                int i14 = d.f27601n;
                d.f27603p = i14;
                d.f27598k = Math.max(0, (d.f27602o + i14) - i14);
                if (d.f27593c != null && d.f27592b != null) {
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
                jy0 d10 = d(i18);
                iy0 iy0Var = d10.f27592b;
                if (iy0Var != null) {
                    i11 = iy0Var.b();
                } else {
                    i11 = 0;
                }
                if (i11 > 0) {
                    ky0 ky0Var = d10.f27591a.f28306a.f28987b;
                    int max = Math.max(0, ky0Var.f27987a);
                    int min = Math.min(i15, ky0Var.f27988b);
                    if (max < min) {
                        int i19 = 0;
                        for (int i20 = max; i20 < min; i20++) {
                            i19 += iArr2[i20];
                        }
                        int max2 = Math.max(1, Math.round(d10.f27598k / i11)) - i19;
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
                jy0 d11 = d(i25);
                ky0 ky0Var2 = d11.f27591a.f28306a.f28987b;
                int max3 = Math.max(0, Math.min(i15, ky0Var2.f27987a));
                int max4 = Math.max(max3, Math.min(i15, ky0Var2.f27988b));
                int i26 = iArr4[max3];
                int i27 = iArr4[max4];
                d11.f27604q = i26;
                d11.f27599l = Math.max(0, i27 - i26);
                if (d11.f27593c != null) {
                    d11.g();
                }
                this.O.g(d11.f27592b, d11.c());
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
        gy0 gy0Var = this.d;
        gy0Var.f26585u = z10;
        gy0Var.k();
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
        this.f29834f = z10;
        requestLayout();
    }
}
