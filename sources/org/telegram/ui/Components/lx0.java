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
    public static final xw0 S = new xw0(0);
    public static final xw0 T = new xw0(1);
    public static final xw0 U = new xw0(3);
    public static final xw0 V = new xw0(4);
    public int E;
    public int F;
    public int[] G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final ArrayList K;
    public final ArrayList L;
    public final Path M;
    public final RectF N;
    public final float[] O;
    public final kx0 P;
    public final ArrayList Q;
    public final jx0 R;
    public final org.telegram.ui.Cells.h9 f35902a;
    public int f35903b;
    public final bx0 f35904c;
    public final bx0 d;
    public int f35905e;
    public boolean f35906f;
    public int h;
    public int f35907n;
    public int f35908r;
    public int f35909s;
    public int f35910w;
    public int f35911x;
    public boolean f35912y;

    public lx0(Context context, kx0 kx0Var, org.telegram.ui.Cells.h9 h9Var) {
        super(context);
        this.f35904c = new bx0(this, true);
        this.d = new bx0(this, false);
        this.f35905e = 0;
        this.f35906f = false;
        this.h = 1;
        this.f35907n = 0;
        this.f35908r = org.telegram.messenger.g0.L(8.0f);
        this.f35909s = org.telegram.messenger.g0.L(9.0f);
        this.f35910w = org.telegram.messenger.g0.L(12.0f);
        this.f35912y = true;
        this.G = new int[0];
        this.K = new ArrayList();
        this.L = new ArrayList();
        new Path();
        this.M = new Path();
        this.N = new RectF();
        this.O = new float[8];
        this.Q = new ArrayList();
        this.f35902a = h9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.P = kx0Var;
        jx0 jx0Var = new jx0(this, this);
        this.R = jx0Var;
        r0.i0.j(this, jx0Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(t4.c.q(str, ". "));
    }

    public static void j(gx0 gx0Var, int i3, int i10, int i11, int i12) {
        fx0 fx0Var = new fx0(i3, i10 + i3);
        ix0 ix0Var = gx0Var.f34223a;
        gx0Var.f34223a = new ix0(ix0Var.f34855a, fx0Var, ix0Var.f34857c, ix0Var.d);
        fx0 fx0Var2 = new fx0(i11, i12 + i11);
        ix0 ix0Var2 = gx0Var.f34224b;
        gx0Var.f34224b = new ix0(ix0Var2.f34855a, fx0Var2, ix0Var2.f34857c, ix0Var2.d);
    }

    public final void a(int i3, int i10, int i11, int i12) {
        ArrayList arrayList = this.Q;
        ex0 ex0Var = new ex0(this, arrayList.size());
        gx0 gx0Var = new gx0();
        fx0 fx0Var = new fx0(i10, i12 + i10);
        xw0 xw0Var = V;
        gx0Var.f34223a = new ix0(false, fx0Var, xw0Var, 0.0f);
        gx0Var.f34224b = new ix0(false, new fx0(i3, i11 + i3), xw0Var, 0.0f);
        ex0Var.f33500a = gx0Var;
        ex0Var.f33507j = i10;
        arrayList.add(ex0Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i3, int i10, int i11) {
        int i12;
        if (i11 == 0) {
            i11 = 1;
        }
        ArrayList arrayList = this.Q;
        ex0 ex0Var = new ex0(this, arrayList.size());
        ex0Var.f33502c = pagetablecell;
        gx0 gx0Var = new gx0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        fx0 fx0Var = new fx0(i10, i13 + i10);
        xw0 xw0Var = V;
        gx0Var.f34223a = new ix0(false, fx0Var, xw0Var, 0.0f);
        gx0Var.f34224b = new ix0(false, new fx0(i3, i11 + i3), xw0Var, 1.0f);
        ex0Var.f33500a = gx0Var;
        ex0Var.f33507j = i10;
        arrayList.add(ex0Var);
        if (pagetablecell.rowspan > 1) {
            this.L.add(new PointF(i10, i10 + i12));
        }
        h();
    }

    public final void c() {
        boolean z10;
        bx0 bx0Var;
        ix0 ix0Var;
        ix0 ix0Var2;
        Throwable th2;
        int i3;
        int i10 = this.f35907n;
        if (i10 == 0) {
            if (this.f35905e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                bx0Var = this.f35904c;
            } else {
                bx0Var = this.d;
            }
            int i11 = bx0Var.f32419b;
            if (i11 == Integer.MIN_VALUE) {
                i11 = 0;
            }
            if (i11 >= 0 && i11 <= 1024) {
                int[] iArr = new int[i11];
                int childCount = getChildCount();
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < childCount; i14++) {
                    gx0 gx0Var = d(i14).f33500a;
                    if (z10) {
                        ix0Var = gx0Var.f34223a;
                    } else {
                        ix0Var = gx0Var.f34224b;
                    }
                    fx0 fx0Var = ix0Var.f34856b;
                    boolean z11 = ix0Var.f34855a;
                    int a10 = fx0Var.a();
                    if (a10 > 0 && a10 <= 1024) {
                        if (z11) {
                            i12 = fx0Var.f33880a;
                        }
                        if (z10) {
                            ix0Var2 = gx0Var.f34224b;
                        } else {
                            ix0Var2 = gx0Var.f34223a;
                        }
                        fx0 fx0Var2 = ix0Var2.f34856b;
                        int a11 = fx0Var2.a();
                        int i15 = fx0Var2.f33880a;
                        if (a11 > 0) {
                            th2 = null;
                            if (fx0Var2.a() <= 1024) {
                                boolean z12 = ix0Var2.f34855a;
                                int a12 = fx0Var2.a();
                                if (i11 != 0) {
                                    if (z12) {
                                        i3 = Math.min(i15, i11);
                                    } else {
                                        i3 = 0;
                                    }
                                    a12 = Math.min(a12, i11 - i3);
                                }
                                if (z12) {
                                    i13 = i15;
                                }
                                if (i11 != 0) {
                                    if (!z11 || !z12) {
                                        while (true) {
                                            int i16 = i13 + a12;
                                            if (i16 <= i11) {
                                                for (int i17 = i13; i17 < i16; i17++) {
                                                    if (iArr[i17] <= i12) {
                                                    }
                                                }
                                                break;
                                            }
                                            if (z12) {
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
                                if (z10) {
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
                    i18 = (i18 * 31) + d(i19).f33500a.hashCode();
                }
                this.f35907n = i18;
                return;
            }
            g("Table grid count out of bounds");
            throw null;
        }
        int childCount3 = getChildCount();
        int i20 = 1;
        for (int i21 = 0; i21 < childCount3; i21++) {
            i20 = (i20 * 31) + d(i21).f33500a.hashCode();
        }
        if (i10 != i20) {
            h();
            c();
        }
    }

    public final ex0 d(int i3) {
        if (i3 >= 0) {
            ArrayList arrayList = this.Q;
            if (i3 < arrayList.size()) {
                return (ex0) arrayList.get(i3);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        jx0 jx0Var = this.R;
        if (jx0Var != null && jx0Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(ex0 ex0Var, boolean z10, boolean z11) {
        bx0 bx0Var;
        int[] iArr;
        ix0 ix0Var;
        int i3;
        if (this.h == 1) {
            return f(ex0Var, z10, z11);
        }
        if (z10) {
            bx0Var = this.f35904c;
        } else {
            bx0Var = this.d;
        }
        if (z11) {
            if (bx0Var.f32425j == null) {
                bx0Var.f32425j = new int[bx0Var.e() + 1];
            }
            if (!bx0Var.f32426k) {
                bx0Var.b(true);
                bx0Var.f32426k = true;
            }
            iArr = bx0Var.f32425j;
        } else {
            if (bx0Var.f32427l == null) {
                bx0Var.f32427l = new int[bx0Var.e() + 1];
            }
            if (!bx0Var.f32428m) {
                bx0Var.b(false);
                bx0Var.f32428m = true;
            }
            iArr = bx0Var.f32427l;
        }
        gx0 gx0Var = ex0Var.f33500a;
        if (z10) {
            ix0Var = gx0Var.f34224b;
        } else {
            ix0Var = gx0Var.f34223a;
        }
        fx0 fx0Var = ix0Var.f34856b;
        if (z11) {
            i3 = fx0Var.f33880a;
        } else {
            i3 = fx0Var.f33881b;
        }
        return iArr[i3];
    }

    public final int f(ex0 ex0Var, boolean z10, boolean z11) {
        int i3;
        ix0 ix0Var;
        bx0 bx0Var;
        boolean z12;
        gx0 gx0Var = ex0Var.f33500a;
        if (z10) {
            if (z11) {
                i3 = ((ViewGroup.MarginLayoutParams) gx0Var).leftMargin;
            } else {
                i3 = ((ViewGroup.MarginLayoutParams) gx0Var).rightMargin;
            }
        } else if (z11) {
            i3 = ((ViewGroup.MarginLayoutParams) gx0Var).topMargin;
        } else {
            i3 = ((ViewGroup.MarginLayoutParams) gx0Var).bottomMargin;
        }
        if (i3 == Integer.MIN_VALUE) {
            if (!this.f35906f) {
                return 0;
            }
            if (z10) {
                ix0Var = gx0Var.f34224b;
            } else {
                ix0Var = gx0Var.f34223a;
            }
            if (z10) {
                bx0Var = this.f35904c;
            } else {
                bx0Var = this.d;
            }
            fx0 fx0Var = ix0Var.f34856b;
            if (z10 && this.J) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != z11) {
                int i10 = fx0Var.f33880a;
                return 0;
            }
            int i11 = fx0Var.f33881b;
            bx0Var.e();
            return 0;
        }
        return i3;
    }

    public int getAlignmentMode() {
        return this.h;
    }

    public int getChildCount() {
        return this.Q.size();
    }

    public int getColumnCount() {
        return this.f35904c.e();
    }

    public int getOrientation() {
        return this.f35905e;
    }

    public int getRenderHeight() {
        return this.F;
    }

    public int getRowCount() {
        return this.d.e();
    }

    public boolean getUseDefaultMargins() {
        return this.f35906f;
    }

    public final void h() {
        this.f35907n = 0;
        bx0 bx0Var = this.f35904c;
        bx0Var.k();
        bx0 bx0Var2 = this.d;
        bx0Var2.k();
        if (bx0Var != null && bx0Var2 != null) {
            bx0Var.l();
            bx0Var2.l();
        }
    }

    public final void i(int i3, boolean z10) {
        boolean z11;
        ix0 ix0Var;
        bx0 bx0Var;
        int i10;
        int i11;
        int i12;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            ex0 d = d(i13);
            gx0 gx0Var = d.f33500a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i3);
                if (this.f35903b == 2) {
                    i11 = ((int) (size / 2.0f)) - (this.f35910w * 4);
                } else {
                    i11 = (int) (size / 1.5f);
                }
                d.e(this.P.c(d.f33502c, i11));
                if (d.f33501b != null) {
                    ((ViewGroup.MarginLayoutParams) gx0Var).height = Math.max(this.f35911x, d.f33504f + this.f35908r + this.f35909s);
                    int b10 = d.f33501b.b();
                    if (b10 > 0) {
                        i12 = ((ViewGroup.MarginLayoutParams) gx0Var).height * b10;
                    } else {
                        i12 = (this.f35910w * 2) + d.f33503e;
                    }
                    ((ViewGroup.MarginLayoutParams) gx0Var).width = i12;
                } else {
                    ((ViewGroup.MarginLayoutParams) gx0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) gx0Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) gx0Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) gx0Var).height, true);
            } else {
                if (this.f35905e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    ix0Var = gx0Var.f34224b;
                } else {
                    ix0Var = gx0Var.f34223a;
                }
                if (ix0.a(ix0Var, z11) == V) {
                    fx0 fx0Var = ix0Var.f34856b;
                    if (z11) {
                        bx0Var = this.f35904c;
                    } else {
                        bx0Var = this.d;
                    }
                    int[] g7 = bx0Var.g();
                    int e10 = (g7[fx0Var.f33881b] - g7[fx0Var.f33880a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        dx0 dx0Var = d.f33501b;
                        if (dx0Var != null) {
                            i10 = dx0Var.b();
                        } else {
                            i10 = 0;
                        }
                        if (i10 > 0) {
                            int max = Math.max(1, Math.round(e10 / i10));
                            ((ViewGroup.MarginLayoutParams) gx0Var).height = max;
                            d.f33510m = max;
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
        for (int i3 = 0; i3 < childCount; i3++) {
            d(i3).a(canvas, this, true);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        c();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        lx0 lx0Var = this;
        lx0Var.c();
        bx0 bx0Var = lx0Var.d;
        bx0 bx0Var2 = lx0Var.f35904c;
        if (bx0Var2 != null && bx0Var != null) {
            bx0Var2.l();
            bx0Var.l();
        }
        lx0Var.f35903b = 0;
        int childCount = lx0Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            lx0Var.f35903b = Math.max(lx0Var.f35903b, lx0Var.d(i16).f33500a.f34224b.f34856b.f33881b);
        }
        lx0Var.i(i3, true);
        if (lx0Var.f35905e == 0) {
            i11 = bx0Var2.i(i3);
            if (lx0Var.f35912y) {
                i11 = Math.max(i11, View.MeasureSpec.getSize(i3));
                bx0Var2.v.f34536a = i11;
                bx0Var2.f32437w.f34536a = -i11;
                bx0Var2.f32432q = false;
                bx0Var2.g();
            }
            lx0Var.i(i3, false);
            i12 = bx0Var.i(i10);
        } else {
            int i17 = bx0Var.i(i10);
            lx0Var.i(i3, false);
            i11 = bx0Var2.i(i3);
            i12 = i17;
        }
        int max = Math.max(i12, lx0Var.getSuggestedMinimumHeight());
        lx0Var.setMeasuredDimension(i11, max);
        bx0Var2.v.f34536a = i11;
        bx0Var2.f32437w.f34536a = -i11;
        bx0Var2.f32432q = false;
        bx0Var2.g();
        bx0Var.v.f34536a = max;
        bx0Var.f32437w.f34536a = -max;
        bx0Var.f32432q = false;
        bx0Var.g();
        int[] g7 = bx0Var2.g();
        int[] g10 = bx0Var.g();
        int[] copyOf = Arrays.copyOf(g10, g10.length);
        ArrayList arrayList = lx0Var.K;
        arrayList.clear();
        int i18 = g7[g7.length - 1];
        int childCount2 = lx0Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            ex0 d = lx0Var.d(i20);
            gx0 gx0Var = d.f33500a;
            ix0 ix0Var = gx0Var.f34224b;
            ix0 ix0Var2 = gx0Var.f34223a;
            fx0 fx0Var = ix0Var.f34856b;
            fx0 fx0Var2 = ix0Var2.f34856b;
            int i21 = childCount2;
            int i22 = g7[fx0Var.f33880a];
            int i23 = g10[fx0Var2.f33880a];
            int i24 = g7[fx0Var.f33881b] - i22;
            int i25 = g10[fx0Var2.f33881b] - i23;
            int i26 = d.f33508k;
            bx0 bx0Var3 = bx0Var;
            int i27 = d.f33509l;
            xw0 a10 = ix0.a(ix0Var, true);
            xw0 a11 = ix0.a(ix0Var2, false);
            k4.j f10 = bx0Var2.f();
            cx0 cx0Var = (cx0) ((Object[]) f10.f16871c)[((int[]) f10.f16869a)[i20]];
            k4.j f11 = bx0Var3.f();
            bx0 bx0Var4 = bx0Var2;
            cx0 cx0Var2 = (cx0) ((Object[]) f11.f16871c)[((int[]) f11.f16869a)[i20]];
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
            int c2 = a10.c(i26, i24 - i28);
            int c10 = a11.c(i27, i25 - e13);
            int i29 = i22 + b10 + a12;
            if (!lx0Var.J) {
                i14 = e10 + i29;
            } else {
                i14 = ((i18 - c2) - e12) - i29;
            }
            int i30 = i14;
            int i31 = i23 + b11 + a13 + e11;
            if (d.f33502c != null) {
                if (c2 != d.f33508k || c10 != d.f33509l) {
                    i15 = 0;
                    d.d(c2, c10, false);
                } else {
                    i15 = 0;
                }
                int i32 = d.f33510m;
                if (i32 != 0 && i32 != c10) {
                    fx0 fx0Var3 = d.f33500a.f34223a.f34856b;
                    if (fx0Var3.f33881b - fx0Var3.f33880a <= 1) {
                        ArrayList arrayList2 = lx0Var.L;
                        int size = arrayList2.size();
                        int i33 = i15;
                        while (true) {
                            if (i33 < size) {
                                PointF pointF = (PointF) arrayList2.get(i33);
                                float f12 = pointF.x;
                                float f13 = d.f33500a.f34223a.f34856b.f33880a;
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
            d.f33513p = i30;
            d.f33514q = i31;
            i19 = i20 + 1;
            bx0Var = bx0Var3;
            childCount2 = i21;
            bx0Var2 = bx0Var4;
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            ex0 ex0Var = (ex0) arrayList.get(i34);
            int i35 = ex0Var.f33509l;
            int i36 = ex0Var.d;
            int i37 = i35 - ex0Var.f33510m;
            ArrayList arrayList3 = lx0Var.Q;
            int size3 = arrayList3.size();
            for (int i38 = i36 + 1; i38 < size3; i38++) {
                ex0 ex0Var2 = (ex0) arrayList3.get(i38);
                if (ex0Var.f33500a.f34223a.f34856b.f33880a != ex0Var2.f33500a.f34223a.f34856b.f33880a) {
                    break;
                }
                int i39 = ex0Var.f33510m;
                int i40 = ex0Var2.f33510m;
                if (i39 < i40) {
                    z10 = true;
                    break;
                }
                int i41 = ex0Var2.f33509l - i40;
                if (i41 > 0) {
                    i37 = Math.min(i37, i41);
                }
            }
            z10 = false;
            if (!z10) {
                int i42 = i36 - 1;
                while (true) {
                    if (i42 < 0) {
                        break;
                    }
                    ex0 ex0Var3 = (ex0) arrayList3.get(i42);
                    if (ex0Var.f33500a.f34223a.f34856b.f33880a != ex0Var3.f33500a.f34223a.f34856b.f33880a) {
                        break;
                    }
                    int i43 = ex0Var.f33510m;
                    int i44 = ex0Var3.f33510m;
                    if (i43 < i44) {
                        z10 = true;
                        break;
                    }
                    int i45 = ex0Var3.f33509l - i44;
                    if (i45 > 0) {
                        i37 = Math.min(i37, i45);
                    }
                    i42--;
                }
            }
            if (!z10) {
                ex0Var.f33509l = ex0Var.f33510m;
                ex0Var.g();
                max -= i37;
                int i46 = ex0Var.f33500a.f34223a.f34856b.f33880a;
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
                        int i50 = ex0Var.f33500a.f34223a.f34856b.f33880a;
                        int i51 = ex0Var4.f33500a.f34223a.f34856b.f33880a;
                        if (i50 == i51) {
                            if (ex0Var4.f33510m != ex0Var4.f33509l) {
                                arrayList.remove(ex0Var4);
                                if (ex0Var4.d < i36) {
                                    i48--;
                                }
                                i47--;
                            }
                            int i52 = ex0Var4.f33509l - i37;
                            ex0Var4.f33509l = i52;
                            i13 = i49;
                            ex0Var4.d(ex0Var4.f33508k, i52, true);
                        } else {
                            i13 = i49;
                            if (i50 < i51) {
                                ex0Var4.f33514q -= i37;
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
            ex0 d10 = lx0Var.d(i53);
            lx0Var.P.g(d10.f33501b, d10.c());
            d10.f33511n = d10.f33513p;
            d10.f33512o = d10.f33508k;
        }
        lx0Var.E = i18;
        lx0Var.F = max;
        lx0Var.G = copyOf;
        lx0Var.setMeasuredDimension(i18, max);
    }

    @Override
    public final void requestLayout() {
        bx0 bx0Var;
        super.requestLayout();
        bx0 bx0Var2 = this.f35904c;
        if (bx0Var2 != null && (bx0Var = this.d) != null) {
            bx0Var2.l();
            bx0Var.l();
        }
    }

    public void setAlignmentMode(int i3) {
        this.h = i3;
        requestLayout();
    }

    public void setColumnCount(int i3) {
        this.f35904c.n(i3);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        bx0 bx0Var = this.f35904c;
        bx0Var.f32436u = z10;
        bx0Var.k();
        h();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.H = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.f35912y == z10) {
            return;
        }
        this.f35912y = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i3) {
        this.f35911x = i3;
        requestLayout();
    }

    public void setOrientation(int i3) {
        if (this.f35905e != i3) {
            this.f35905e = i3;
            h();
            requestLayout();
        }
    }

    public void setRenderWidth(int i3) {
        int i10;
        int i11;
        int measuredWidth = getMeasuredWidth();
        this.E = Math.max(measuredWidth, i3);
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            ex0 d = d(i12);
            if (measuredWidth > 0 && (i11 = this.E) != measuredWidth) {
                float f10 = measuredWidth;
                int round = Math.round((d.f33511n * i11) / f10);
                int round2 = Math.round(((d.f33511n + d.f33512o) * this.E) / f10);
                d.f33513p = round;
                d.f33508k = Math.max(0, round2 - round);
                if (d.f33502c != null && d.f33501b != null) {
                    d.f();
                }
            } else {
                int i13 = d.f33511n;
                d.f33513p = i13;
                d.f33508k = Math.max(0, (d.f33512o + i13) - i13);
                if (d.f33502c != null && d.f33501b != null) {
                    d.f();
                }
            }
        }
        int[] iArr = this.G;
        if (iArr.length < 2) {
            this.F = getMeasuredHeight();
        } else {
            int length = iArr.length;
            int i14 = length - 1;
            int[] iArr2 = new int[i14];
            int i15 = 0;
            while (i15 < i14) {
                int[] iArr3 = this.G;
                int i16 = i15 + 1;
                iArr2[i15] = iArr3[i16] - iArr3[i15];
                i15 = i16;
            }
            for (int i17 = 0; i17 < getChildCount(); i17++) {
                ex0 d10 = d(i17);
                dx0 dx0Var = d10.f33501b;
                if (dx0Var != null) {
                    i10 = dx0Var.b();
                } else {
                    i10 = 0;
                }
                if (i10 > 0) {
                    fx0 fx0Var = d10.f33500a.f34223a.f34856b;
                    int max = Math.max(0, fx0Var.f33880a);
                    int min = Math.min(i14, fx0Var.f33881b);
                    if (max < min) {
                        int i18 = 0;
                        for (int i19 = max; i19 < min; i19++) {
                            i18 += iArr2[i19];
                        }
                        int max2 = Math.max(1, Math.round(d10.f33508k / i10)) - i18;
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
            this.F = iArr4[i14];
            for (int i24 = 0; i24 < getChildCount(); i24++) {
                ex0 d11 = d(i24);
                fx0 fx0Var2 = d11.f33500a.f34223a.f34856b;
                int max3 = Math.max(0, Math.min(i14, fx0Var2.f33880a));
                int max4 = Math.max(max3, Math.min(i14, fx0Var2.f33881b));
                int i25 = iArr4[max3];
                int i26 = iArr4[max4];
                d11.f33514q = i25;
                d11.f33509l = Math.max(0, i26 - i25);
                if (d11.f33502c != null) {
                    d11.g();
                }
                this.P.g(d11.f33501b, d11.c());
            }
        }
        invalidate();
    }

    public void setRowCount(int i3) {
        this.d.n(i3);
        h();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z10) {
        bx0 bx0Var = this.d;
        bx0Var.f32436u = z10;
        bx0Var.k();
        h();
        requestLayout();
    }

    public void setRtl(boolean z10) {
        this.J = z10;
    }

    public void setStriped(boolean z10) {
        this.I = z10;
    }

    public void setUseDefaultMargins(boolean z10) {
        this.f35906f = z10;
        requestLayout();
    }
}
