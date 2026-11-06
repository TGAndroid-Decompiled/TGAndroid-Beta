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
public final class lx0 extends View {
    public static final xw0 R = new xw0(0);
    public static final xw0 S = new xw0(1);
    public static final xw0 T = new xw0(3);
    public static final xw0 U = new xw0(4);
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
    public final kx0 O;
    public final ArrayList P;
    public final jx0 Q;
    public final org.telegram.ui.Cells.i9 f35764a;
    public int f35765b;
    public final bx0 f35766c;
    public final bx0 d;
    public int f35767e;
    public boolean f35768f;
    public int h;
    public int f35769n;
    public int f35770r;
    public int f35771s;
    public int f35772w;
    public int f35773x;
    public boolean f35774y;

    public lx0(Context context, kx0 kx0Var, org.telegram.ui.Cells.i9 i9Var) {
        super(context);
        this.f35766c = new bx0(this, true);
        this.d = new bx0(this, false);
        this.f35767e = 0;
        this.f35768f = false;
        this.h = 1;
        this.f35769n = 0;
        this.f35770r = org.telegram.messenger.g0.L(8.0f);
        this.f35771s = org.telegram.messenger.g0.L(9.0f);
        this.f35772w = org.telegram.messenger.g0.L(12.0f);
        this.f35774y = true;
        this.F = new int[0];
        this.J = new ArrayList();
        this.K = new ArrayList();
        new Path();
        this.L = new Path();
        this.M = new RectF();
        this.N = new float[8];
        this.P = new ArrayList();
        this.f35764a = i9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.O = kx0Var;
        jx0 jx0Var = new jx0(this, this);
        this.Q = jx0Var;
        r0.i0.j(this, jx0Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(rf.b.q(str, ". "));
    }

    public static void j(gx0 gx0Var, int i7, int i10, int i11, int i12) {
        fx0 fx0Var = new fx0(i7, i10 + i7);
        ix0 ix0Var = gx0Var.f34064a;
        gx0Var.f34064a = new ix0(ix0Var.f34817a, fx0Var, ix0Var.f34819c, ix0Var.d);
        fx0 fx0Var2 = new fx0(i11, i12 + i11);
        ix0 ix0Var2 = gx0Var.f34065b;
        gx0Var.f34065b = new ix0(ix0Var2.f34817a, fx0Var2, ix0Var2.f34819c, ix0Var2.d);
    }

    public final void a(int i7, int i10, int i11, int i12) {
        ArrayList arrayList = this.P;
        ex0 ex0Var = new ex0(this, arrayList.size());
        gx0 gx0Var = new gx0();
        fx0 fx0Var = new fx0(i10, i12 + i10);
        xw0 xw0Var = U;
        gx0Var.f34064a = new ix0(false, fx0Var, xw0Var, 0.0f);
        gx0Var.f34065b = new ix0(false, new fx0(i7, i11 + i7), xw0Var, 0.0f);
        ex0Var.f33350a = gx0Var;
        ex0Var.f33357j = i10;
        arrayList.add(ex0Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i7, int i10, int i11) {
        int i12;
        if (i11 == 0) {
            i11 = 1;
        }
        ArrayList arrayList = this.P;
        ex0 ex0Var = new ex0(this, arrayList.size());
        ex0Var.f33352c = pagetablecell;
        gx0 gx0Var = new gx0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        fx0 fx0Var = new fx0(i10, i13 + i10);
        xw0 xw0Var = U;
        gx0Var.f34064a = new ix0(false, fx0Var, xw0Var, 0.0f);
        gx0Var.f34065b = new ix0(false, new fx0(i7, i11 + i7), xw0Var, 1.0f);
        ex0Var.f33350a = gx0Var;
        ex0Var.f33357j = i10;
        arrayList.add(ex0Var);
        if (pagetablecell.rowspan > 1) {
            this.K.add(new PointF(i10, i10 + i12));
        }
        h();
    }

    public final void c() {
        boolean z9;
        bx0 bx0Var;
        ix0 ix0Var;
        ix0 ix0Var2;
        Throwable th2;
        int i7;
        int i10 = this.f35769n;
        if (i10 == 0) {
            if (this.f35767e == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                bx0Var = this.f35766c;
            } else {
                bx0Var = this.d;
            }
            int i11 = bx0Var.f32310b;
            if (i11 == Integer.MIN_VALUE) {
                i11 = 0;
            }
            if (i11 >= 0 && i11 <= 1024) {
                int[] iArr = new int[i11];
                int childCount = getChildCount();
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < childCount; i14++) {
                    gx0 gx0Var = d(i14).f33350a;
                    if (z9) {
                        ix0Var = gx0Var.f34064a;
                    } else {
                        ix0Var = gx0Var.f34065b;
                    }
                    fx0 fx0Var = ix0Var.f34818b;
                    boolean z10 = ix0Var.f34817a;
                    int a10 = fx0Var.a();
                    if (a10 > 0 && a10 <= 1024) {
                        if (z10) {
                            i12 = fx0Var.f33709a;
                        }
                        if (z9) {
                            ix0Var2 = gx0Var.f34065b;
                        } else {
                            ix0Var2 = gx0Var.f34064a;
                        }
                        fx0 fx0Var2 = ix0Var2.f34818b;
                        int a11 = fx0Var2.a();
                        int i15 = fx0Var2.f33709a;
                        if (a11 > 0) {
                            th2 = null;
                            if (fx0Var2.a() <= 1024) {
                                boolean z11 = ix0Var2.f34817a;
                                int a12 = fx0Var2.a();
                                if (i11 != 0) {
                                    if (z11) {
                                        i7 = Math.min(i15, i11);
                                    } else {
                                        i7 = 0;
                                    }
                                    a12 = Math.min(a12, i11 - i7);
                                }
                                if (z11) {
                                    i13 = i15;
                                }
                                if (i11 != 0) {
                                    if (!z10 || !z11) {
                                        while (true) {
                                            int i16 = i13 + a12;
                                            if (i16 <= i11) {
                                                for (int i17 = i13; i17 < i16; i17++) {
                                                    if (iArr[i17] <= i12) {
                                                    }
                                                }
                                                break;
                                            }
                                            if (z11) {
                                                i12++;
                                            } else if (i16 <= i11) {
                                                i13++;
                                            } else {
                                                i12++;
                                                i13 = 0;
                                            }
                                        }
                                    }
                                    Arrays.fill(iArr, Math.min(i13, i11), Math.min(i13 + a12, i11), i12 + a10);
                                }
                                if (z9) {
                                    j(gx0Var, i12, a10, i13, a12);
                                } else {
                                    j(gx0Var, i13, a12, i12, a10);
                                }
                                i13 += a12;
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
                int i18 = 1;
                for (int i19 = 0; i19 < childCount2; i19++) {
                    i18 = (i18 * 31) + d(i19).f33350a.hashCode();
                }
                this.f35769n = i18;
                return;
            }
            g("Table grid count out of bounds");
            throw null;
        }
        int childCount3 = getChildCount();
        int i20 = 1;
        for (int i21 = 0; i21 < childCount3; i21++) {
            i20 = (i20 * 31) + d(i21).f33350a.hashCode();
        }
        if (i10 != i20) {
            h();
            c();
        }
    }

    public final ex0 d(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.P;
            if (i7 < arrayList.size()) {
                return (ex0) arrayList.get(i7);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        jx0 jx0Var = this.Q;
        if (jx0Var != null && jx0Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(ex0 ex0Var, boolean z9, boolean z10) {
        bx0 bx0Var;
        int[] iArr;
        ix0 ix0Var;
        int i7;
        if (this.h == 1) {
            return f(ex0Var, z9, z10);
        }
        if (z9) {
            bx0Var = this.f35766c;
        } else {
            bx0Var = this.d;
        }
        if (z10) {
            if (bx0Var.f32316j == null) {
                bx0Var.f32316j = new int[bx0Var.e() + 1];
            }
            if (!bx0Var.f32317k) {
                bx0Var.b(true);
                bx0Var.f32317k = true;
            }
            iArr = bx0Var.f32316j;
        } else {
            if (bx0Var.f32318l == null) {
                bx0Var.f32318l = new int[bx0Var.e() + 1];
            }
            if (!bx0Var.f32319m) {
                bx0Var.b(false);
                bx0Var.f32319m = true;
            }
            iArr = bx0Var.f32318l;
        }
        gx0 gx0Var = ex0Var.f33350a;
        if (z9) {
            ix0Var = gx0Var.f34065b;
        } else {
            ix0Var = gx0Var.f34064a;
        }
        fx0 fx0Var = ix0Var.f34818b;
        if (z10) {
            i7 = fx0Var.f33709a;
        } else {
            i7 = fx0Var.f33710b;
        }
        return iArr[i7];
    }

    public final int f(ex0 ex0Var, boolean z9, boolean z10) {
        int i7;
        ix0 ix0Var;
        bx0 bx0Var;
        boolean z11;
        gx0 gx0Var = ex0Var.f33350a;
        if (z9) {
            if (z10) {
                i7 = ((ViewGroup.MarginLayoutParams) gx0Var).leftMargin;
            } else {
                i7 = ((ViewGroup.MarginLayoutParams) gx0Var).rightMargin;
            }
        } else if (z10) {
            i7 = ((ViewGroup.MarginLayoutParams) gx0Var).topMargin;
        } else {
            i7 = ((ViewGroup.MarginLayoutParams) gx0Var).bottomMargin;
        }
        if (i7 == Integer.MIN_VALUE) {
            if (!this.f35768f) {
                return 0;
            }
            if (z9) {
                ix0Var = gx0Var.f34065b;
            } else {
                ix0Var = gx0Var.f34064a;
            }
            if (z9) {
                bx0Var = this.f35766c;
            } else {
                bx0Var = this.d;
            }
            fx0 fx0Var = ix0Var.f34818b;
            if (z9 && this.I) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 != z10) {
                int i10 = fx0Var.f33709a;
                return 0;
            }
            int i11 = fx0Var.f33710b;
            bx0Var.e();
            return 0;
        }
        return i7;
    }

    public int getAlignmentMode() {
        return this.h;
    }

    public int getChildCount() {
        return this.P.size();
    }

    public int getColumnCount() {
        return this.f35766c.e();
    }

    public int getOrientation() {
        return this.f35767e;
    }

    public int getRenderHeight() {
        return this.E;
    }

    public int getRowCount() {
        return this.d.e();
    }

    public boolean getUseDefaultMargins() {
        return this.f35768f;
    }

    public final void h() {
        this.f35769n = 0;
        bx0 bx0Var = this.f35766c;
        bx0Var.k();
        bx0 bx0Var2 = this.d;
        bx0Var2.k();
        if (bx0Var != null && bx0Var2 != null) {
            bx0Var.l();
            bx0Var2.l();
        }
    }

    public final void i(int i7, boolean z9) {
        boolean z10;
        ix0 ix0Var;
        bx0 bx0Var;
        int i10;
        int i11;
        int i12;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            ex0 d = d(i13);
            gx0 gx0Var = d.f33350a;
            if (z9) {
                int size = View.MeasureSpec.getSize(i7);
                if (this.f35765b == 2) {
                    i11 = ((int) (size / 2.0f)) - (this.f35772w * 4);
                } else {
                    i11 = (int) (size / 1.5f);
                }
                d.e(this.O.c(d.f33352c, i11));
                if (d.f33351b != null) {
                    ((ViewGroup.MarginLayoutParams) gx0Var).height = Math.max(this.f35773x, d.f33354f + this.f35770r + this.f35771s);
                    int b10 = d.f33351b.b();
                    if (b10 > 0) {
                        i12 = ((ViewGroup.MarginLayoutParams) gx0Var).height * b10;
                    } else {
                        i12 = (this.f35772w * 2) + d.f33353e;
                    }
                    ((ViewGroup.MarginLayoutParams) gx0Var).width = i12;
                } else {
                    ((ViewGroup.MarginLayoutParams) gx0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) gx0Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) gx0Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) gx0Var).height, true);
            } else {
                if (this.f35767e == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ix0Var = gx0Var.f34065b;
                } else {
                    ix0Var = gx0Var.f34064a;
                }
                if (ix0.a(ix0Var, z10) == U) {
                    fx0 fx0Var = ix0Var.f34818b;
                    if (z10) {
                        bx0Var = this.f35766c;
                    } else {
                        bx0Var = this.d;
                    }
                    int[] g10 = bx0Var.g();
                    int e10 = (g10[fx0Var.f33710b] - g10[fx0Var.f33709a]) - (e(d, z10, false) + e(d, z10, true));
                    if (z10) {
                        dx0 dx0Var = d.f33351b;
                        if (dx0Var != null) {
                            i10 = dx0Var.b();
                        } else {
                            i10 = 0;
                        }
                        if (i10 > 0) {
                            int max = Math.max(1, Math.round(e10 / i10));
                            ((ViewGroup.MarginLayoutParams) gx0Var).height = max;
                            d.f33360m = max;
                        }
                        d.d(e(d, true, false) + e(d, true, true) + e10, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) gx0Var).height, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) gx0Var).width, e(d, false, false) + e(d, false, true) + e10, false);
                    }
                }
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            d(i7).a(canvas, this, true);
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        c();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        boolean z9;
        int i13;
        int i14;
        int i15;
        lx0 lx0Var = this;
        lx0Var.c();
        bx0 bx0Var = lx0Var.d;
        bx0 bx0Var2 = lx0Var.f35766c;
        if (bx0Var2 != null && bx0Var != null) {
            bx0Var2.l();
            bx0Var.l();
        }
        lx0Var.f35765b = 0;
        int childCount = lx0Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            lx0Var.f35765b = Math.max(lx0Var.f35765b, lx0Var.d(i16).f33350a.f34065b.f34818b.f33710b);
        }
        lx0Var.i(i7, true);
        if (lx0Var.f35767e == 0) {
            i11 = bx0Var2.i(i7);
            if (lx0Var.f35774y) {
                i11 = Math.max(i11, View.MeasureSpec.getSize(i7));
                bx0Var2.v.f34449a = i11;
                bx0Var2.f32328w.f34449a = -i11;
                bx0Var2.f32323q = false;
                bx0Var2.g();
            }
            lx0Var.i(i7, false);
            i12 = bx0Var.i(i10);
        } else {
            int i17 = bx0Var.i(i10);
            lx0Var.i(i7, false);
            i11 = bx0Var2.i(i7);
            i12 = i17;
        }
        int max = Math.max(i12, lx0Var.getSuggestedMinimumHeight());
        lx0Var.setMeasuredDimension(i11, max);
        bx0Var2.v.f34449a = i11;
        bx0Var2.f32328w.f34449a = -i11;
        bx0Var2.f32323q = false;
        bx0Var2.g();
        bx0Var.v.f34449a = max;
        bx0Var.f32328w.f34449a = -max;
        bx0Var.f32323q = false;
        bx0Var.g();
        int[] g10 = bx0Var2.g();
        int[] g11 = bx0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = lx0Var.J;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = lx0Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            ex0 d = lx0Var.d(i20);
            gx0 gx0Var = d.f33350a;
            ix0 ix0Var = gx0Var.f34065b;
            ix0 ix0Var2 = gx0Var.f34064a;
            fx0 fx0Var = ix0Var.f34818b;
            fx0 fx0Var2 = ix0Var2.f34818b;
            int i21 = childCount2;
            int i22 = g10[fx0Var.f33709a];
            int i23 = g11[fx0Var2.f33709a];
            int i24 = g10[fx0Var.f33710b] - i22;
            int i25 = g11[fx0Var2.f33710b] - i23;
            int i26 = d.f33358k;
            bx0 bx0Var3 = bx0Var;
            int i27 = d.f33359l;
            xw0 a10 = ix0.a(ix0Var, true);
            xw0 a11 = ix0.a(ix0Var2, false);
            h6.m f10 = bx0Var2.f();
            cx0 cx0Var = (cx0) ((Object[]) f10.d)[((int[]) f10.f14264b)[i20]];
            h6.m f11 = bx0Var3.f();
            bx0 bx0Var4 = bx0Var2;
            cx0 cx0Var2 = (cx0) ((Object[]) f11.d)[((int[]) f11.f14264b)[i20]];
            int b10 = a10.b(d, i24 - cx0Var.d(true));
            int b11 = a11.b(d, i25 - cx0Var2.d(true));
            int e10 = lx0Var.e(d, true, true);
            int e11 = lx0Var.e(d, false, true);
            int e12 = lx0Var.e(d, true, false);
            int i28 = e10 + e12;
            int e13 = e11 + lx0Var.e(d, false, false);
            int a12 = cx0Var.a(lx0Var, d, a10, i26 + i28, true);
            lx0Var = this;
            int a13 = cx0Var2.a(lx0Var, d, a11, i27 + e13, false);
            int c10 = a10.c(i26, i24 - i28);
            int c11 = a11.c(i27, i25 - e13);
            int i29 = i22 + b10 + a12;
            if (!lx0Var.I) {
                i14 = e10 + i29;
            } else {
                i14 = ((i18 - c10) - e12) - i29;
            }
            int i30 = i14;
            int i31 = i23 + b11 + a13 + e11;
            if (d.f33352c != null) {
                if (c10 != d.f33358k || c11 != d.f33359l) {
                    i15 = 0;
                    d.d(c10, c11, false);
                } else {
                    i15 = 0;
                }
                int i32 = d.f33360m;
                if (i32 != 0 && i32 != c11) {
                    fx0 fx0Var3 = d.f33350a.f34064a.f34818b;
                    if (fx0Var3.f33710b - fx0Var3.f33709a <= 1) {
                        ArrayList arrayList2 = lx0Var.K;
                        int size = arrayList2.size();
                        int i33 = i15;
                        while (true) {
                            if (i33 < size) {
                                PointF pointF = (PointF) arrayList2.get(i33);
                                float f12 = pointF.x;
                                float f13 = d.f33350a.f34064a.f34818b.f33709a;
                                if (f12 > f13 || pointF.y <= f13) {
                                    i33++;
                                }
                            } else {
                                arrayList.add(d);
                                break;
                            }
                        }
                    }
                }
            }
            d.f33363p = i30;
            d.f33364q = i31;
            i19 = i20 + 1;
            bx0Var = bx0Var3;
            childCount2 = i21;
            bx0Var2 = bx0Var4;
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            ex0 ex0Var = (ex0) arrayList.get(i34);
            int i35 = ex0Var.f33359l;
            int i36 = ex0Var.d;
            int i37 = i35 - ex0Var.f33360m;
            ArrayList arrayList3 = lx0Var.P;
            int size3 = arrayList3.size();
            for (int i38 = i36 + 1; i38 < size3; i38++) {
                ex0 ex0Var2 = (ex0) arrayList3.get(i38);
                if (ex0Var.f33350a.f34064a.f34818b.f33709a != ex0Var2.f33350a.f34064a.f34818b.f33709a) {
                    break;
                }
                int i39 = ex0Var.f33360m;
                int i40 = ex0Var2.f33360m;
                if (i39 < i40) {
                    z9 = true;
                    break;
                }
                int i41 = ex0Var2.f33359l - i40;
                if (i41 > 0) {
                    i37 = Math.min(i37, i41);
                }
            }
            z9 = false;
            if (!z9) {
                int i42 = i36 - 1;
                while (true) {
                    if (i42 < 0) {
                        break;
                    }
                    ex0 ex0Var3 = (ex0) arrayList3.get(i42);
                    if (ex0Var.f33350a.f34064a.f34818b.f33709a != ex0Var3.f33350a.f34064a.f34818b.f33709a) {
                        break;
                    }
                    int i43 = ex0Var.f33360m;
                    int i44 = ex0Var3.f33360m;
                    if (i43 < i44) {
                        z9 = true;
                        break;
                    }
                    int i45 = ex0Var3.f33359l - i44;
                    if (i45 > 0) {
                        i37 = Math.min(i37, i45);
                    }
                    i42--;
                }
            }
            if (!z9) {
                ex0Var.f33359l = ex0Var.f33360m;
                ex0Var.g();
                max -= i37;
                int i46 = ex0Var.f33350a.f34064a.f34818b.f33709a;
                while (true) {
                    i46++;
                    if (i46 >= copyOf.length) {
                        break;
                    }
                    copyOf[i46] = copyOf[i46] - i37;
                }
                int size4 = arrayList3.size();
                int i47 = size2;
                int i48 = i34;
                int i49 = 0;
                while (i49 < size4) {
                    ex0 ex0Var4 = (ex0) arrayList3.get(i49);
                    if (ex0Var == ex0Var4) {
                        i13 = i49;
                    } else {
                        int i50 = ex0Var.f33350a.f34064a.f34818b.f33709a;
                        int i51 = ex0Var4.f33350a.f34064a.f34818b.f33709a;
                        if (i50 == i51) {
                            if (ex0Var4.f33360m != ex0Var4.f33359l) {
                                arrayList.remove(ex0Var4);
                                if (ex0Var4.d < i36) {
                                    i48--;
                                }
                                i47--;
                            }
                            int i52 = ex0Var4.f33359l - i37;
                            ex0Var4.f33359l = i52;
                            i13 = i49;
                            ex0Var4.d(ex0Var4.f33358k, i52, true);
                        } else {
                            i13 = i49;
                            if (i50 < i51) {
                                ex0Var4.f33364q -= i37;
                            }
                        }
                    }
                    i49 = i13 + 1;
                }
                i34 = i48;
                size2 = i47;
            }
            i34++;
        }
        int childCount3 = lx0Var.getChildCount();
        for (int i53 = 0; i53 < childCount3; i53++) {
            ex0 d2 = lx0Var.d(i53);
            lx0Var.O.g(d2.f33351b, d2.c());
            d2.f33361n = d2.f33363p;
            d2.f33362o = d2.f33358k;
        }
        lx0Var.D = i18;
        lx0Var.E = max;
        lx0Var.F = copyOf;
        lx0Var.setMeasuredDimension(i18, max);
    }

    @Override
    public final void requestLayout() {
        bx0 bx0Var;
        super.requestLayout();
        bx0 bx0Var2 = this.f35766c;
        if (bx0Var2 != null && (bx0Var = this.d) != null) {
            bx0Var2.l();
            bx0Var.l();
        }
    }

    public void setAlignmentMode(int i7) {
        this.h = i7;
        requestLayout();
    }

    public void setColumnCount(int i7) {
        this.f35766c.n(i7);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z9) {
        bx0 bx0Var = this.f35766c;
        bx0Var.f32327u = z9;
        bx0Var.k();
        h();
        requestLayout();
    }

    public void setDrawLines(boolean z9) {
        this.G = z9;
    }

    public void setFillWidth(boolean z9) {
        if (this.f35774y == z9) {
            return;
        }
        this.f35774y = z9;
        requestLayout();
    }

    public void setMinimumCellHeight(int i7) {
        this.f35773x = i7;
        requestLayout();
    }

    public void setOrientation(int i7) {
        if (this.f35767e != i7) {
            this.f35767e = i7;
            h();
            requestLayout();
        }
    }

    public void setRenderWidth(int i7) {
        int i10;
        int i11;
        int measuredWidth = getMeasuredWidth();
        this.D = Math.max(measuredWidth, i7);
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            ex0 d = d(i12);
            if (measuredWidth > 0 && (i11 = this.D) != measuredWidth) {
                float f10 = measuredWidth;
                int round = Math.round((d.f33361n * i11) / f10);
                int round2 = Math.round(((d.f33361n + d.f33362o) * this.D) / f10);
                d.f33363p = round;
                d.f33358k = Math.max(0, round2 - round);
                if (d.f33352c != null && d.f33351b != null) {
                    d.f();
                }
            } else {
                int i13 = d.f33361n;
                d.f33363p = i13;
                d.f33358k = Math.max(0, (d.f33362o + i13) - i13);
                if (d.f33352c != null && d.f33351b != null) {
                    d.f();
                }
            }
        }
        int[] iArr = this.F;
        if (iArr.length < 2) {
            this.E = getMeasuredHeight();
        } else {
            int length = iArr.length;
            int i14 = length - 1;
            int[] iArr2 = new int[i14];
            int i15 = 0;
            while (i15 < i14) {
                int[] iArr3 = this.F;
                int i16 = i15 + 1;
                iArr2[i15] = iArr3[i16] - iArr3[i15];
                i15 = i16;
            }
            for (int i17 = 0; i17 < getChildCount(); i17++) {
                ex0 d2 = d(i17);
                dx0 dx0Var = d2.f33351b;
                if (dx0Var != null) {
                    i10 = dx0Var.b();
                } else {
                    i10 = 0;
                }
                if (i10 > 0) {
                    fx0 fx0Var = d2.f33350a.f34064a.f34818b;
                    int max = Math.max(0, fx0Var.f33709a);
                    int min = Math.min(i14, fx0Var.f33710b);
                    if (max < min) {
                        int i18 = 0;
                        for (int i19 = max; i19 < min; i19++) {
                            i18 += iArr2[i19];
                        }
                        int max2 = Math.max(1, Math.round(d2.f33358k / i10)) - i18;
                        while (max < min && max2 > 0) {
                            int i20 = min - max;
                            int i21 = ((max2 + i20) - 1) / i20;
                            iArr2[max] = iArr2[max] + i21;
                            max2 -= i21;
                            max++;
                        }
                    }
                }
            }
            int[] iArr4 = new int[length];
            int i22 = 0;
            while (i22 < i14) {
                int i23 = i22 + 1;
                iArr4[i23] = iArr4[i22] + iArr2[i22];
                i22 = i23;
            }
            this.E = iArr4[i14];
            for (int i24 = 0; i24 < getChildCount(); i24++) {
                ex0 d10 = d(i24);
                fx0 fx0Var2 = d10.f33350a.f34064a.f34818b;
                int max3 = Math.max(0, Math.min(i14, fx0Var2.f33709a));
                int max4 = Math.max(max3, Math.min(i14, fx0Var2.f33710b));
                int i25 = iArr4[max3];
                int i26 = iArr4[max4];
                d10.f33364q = i25;
                d10.f33359l = Math.max(0, i26 - i25);
                if (d10.f33352c != null) {
                    d10.g();
                }
                this.O.g(d10.f33351b, d10.c());
            }
        }
        invalidate();
    }

    public void setRowCount(int i7) {
        this.d.n(i7);
        h();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z9) {
        bx0 bx0Var = this.d;
        bx0Var.f32327u = z9;
        bx0Var.k();
        h();
        requestLayout();
    }

    public void setRtl(boolean z9) {
        this.I = z9;
    }

    public void setStriped(boolean z9) {
        this.H = z9;
    }

    public void setUseDefaultMargins(boolean z9) {
        this.f35768f = z9;
        requestLayout();
    }
}
