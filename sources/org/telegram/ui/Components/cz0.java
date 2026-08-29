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
public final class cz0 extends View {
    public static final oy0 N = new oy0(0);
    public static final oy0 O = new oy0(1);
    public static final oy0 P = new oy0(3);
    public static final oy0 Q = new oy0(4);
    public int A;
    public int[] B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final ArrayList F;
    public final ArrayList G;
    public final Path H;
    public final RectF I;
    public final float[] J;
    public final bz0 K;
    public final ArrayList L;
    public final az0 M;
    public final org.telegram.ui.Cells.k9 f27588a;
    public int f27589b;
    public final sy0 f27590c;
    public final sy0 d;
    public int f27591e;
    public boolean f27592f;
    public int h;
    public int f27593n;
    public int f27594r;
    public int f27595s;
    public int v;
    public int f27596w;
    public boolean f27597x;
    public int f27598y;

    public cz0(Context context, bz0 bz0Var, org.telegram.ui.Cells.k9 k9Var) {
        super(context);
        this.f27590c = new sy0(this, true);
        this.d = new sy0(this, false);
        this.f27591e = 0;
        this.f27592f = false;
        this.h = 1;
        this.f27593n = 0;
        this.f27594r = AndroidUtilities.dp(8.0f);
        this.f27595s = AndroidUtilities.dp(9.0f);
        this.v = AndroidUtilities.dp(12.0f);
        this.f27597x = true;
        this.B = new int[0];
        this.F = new ArrayList();
        this.G = new ArrayList();
        new Path();
        this.H = new Path();
        this.I = new RectF();
        this.J = new float[8];
        this.L = new ArrayList();
        this.f27588a = k9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.K = bz0Var;
        az0 az0Var = new az0(this, this);
        this.M = az0Var;
        r0.j0.k(this, az0Var);
    }

    public static void i(xy0 xy0Var, int i10, int i11, int i12, int i13) {
        wy0 wy0Var = new wy0(i10, i11 + i10);
        zy0 zy0Var = xy0Var.f34854a;
        xy0Var.f34854a = new zy0(zy0Var.f35455a, wy0Var, zy0Var.f35457c, zy0Var.d);
        wy0 wy0Var2 = new wy0(i12, i13 + i12);
        zy0 zy0Var2 = xy0Var.f34855b;
        xy0Var.f34855b = new zy0(zy0Var2.f35455a, wy0Var2, zy0Var2.f35457c, zy0Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.L;
        vy0 vy0Var = new vy0(this, arrayList.size());
        xy0 xy0Var = new xy0();
        wy0 wy0Var = new wy0(i11, i13 + i11);
        oy0 oy0Var = Q;
        xy0Var.f34854a = new zy0(false, wy0Var, oy0Var, 0.0f);
        xy0Var.f34855b = new zy0(false, new wy0(i10, i12 + i10), oy0Var, 0.0f);
        vy0Var.f34227a = xy0Var;
        vy0Var.f34234j = i11;
        arrayList.add(vy0Var);
        g();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.L;
        vy0 vy0Var = new vy0(this, arrayList.size());
        vy0Var.f34229c = pagetablecell;
        xy0 xy0Var = new xy0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        wy0 wy0Var = new wy0(i11, i13 + i11);
        oy0 oy0Var = Q;
        xy0Var.f34854a = new zy0(false, wy0Var, oy0Var, 0.0f);
        xy0Var.f34855b = new zy0(false, new wy0(i10, i12 + i10), oy0Var, 1.0f);
        vy0Var.f34227a = xy0Var;
        vy0Var.f34234j = i11;
        arrayList.add(vy0Var);
        int i14 = pagetablecell.rowspan;
        if (i14 > 1) {
            this.G.add(new PointF(i11, i11 + i14));
        }
        g();
    }

    public final void c() {
        boolean z10;
        sy0 sy0Var;
        zy0 zy0Var;
        zy0 zy0Var2;
        int i10;
        int i11 = this.f27593n;
        int i12 = 1;
        if (i11 == 0) {
            if (this.f27591e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                sy0Var = this.f27590c;
            } else {
                sy0Var = this.d;
            }
            int i13 = sy0Var.f32740b;
            if (i13 == Integer.MIN_VALUE) {
                i13 = 0;
            }
            int[] iArr = new int[i13];
            int childCount = getChildCount();
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < childCount; i16++) {
                xy0 xy0Var = d(i16).f34227a;
                if (z10) {
                    zy0Var = xy0Var.f34854a;
                } else {
                    zy0Var = xy0Var.f34855b;
                }
                wy0 wy0Var = zy0Var.f35456b;
                boolean z11 = zy0Var.f35455a;
                int i17 = wy0Var.f34516b;
                int i18 = wy0Var.f34515a;
                int i19 = i17 - i18;
                if (z11) {
                    i14 = i18;
                }
                if (z10) {
                    zy0Var2 = xy0Var.f34855b;
                } else {
                    zy0Var2 = xy0Var.f34854a;
                }
                wy0 wy0Var2 = zy0Var2.f35456b;
                boolean z12 = zy0Var2.f35455a;
                int i20 = wy0Var2.f34516b;
                int i21 = wy0Var2.f34515a;
                int i22 = i20 - i21;
                if (i13 != 0) {
                    if (z12) {
                        i10 = Math.min(i21, i13);
                    } else {
                        i10 = 0;
                    }
                    i22 = Math.min(i22, i13 - i10);
                }
                if (z12) {
                    i15 = i21;
                }
                if (i13 != 0) {
                    if (!z11 || !z12) {
                        while (true) {
                            int i23 = i15 + i22;
                            if (i23 <= i13) {
                                for (int i24 = i15; i24 < i23; i24++) {
                                    if (iArr[i24] <= i14) {
                                    }
                                }
                                break;
                            }
                            if (z12) {
                                i14++;
                            } else if (i23 <= i13) {
                                i15++;
                            } else {
                                i14++;
                                i15 = 0;
                            }
                        }
                    }
                    Arrays.fill(iArr, Math.min(i15, i13), Math.min(i15 + i22, i13), i14 + i19);
                }
                if (z10) {
                    i(xy0Var, i14, i19, i15, i22);
                } else {
                    i(xy0Var, i15, i22, i14, i19);
                }
                i15 += i22;
            }
            int childCount2 = getChildCount();
            for (int i25 = 0; i25 < childCount2; i25++) {
                i12 = (i12 * 31) + d(i25).f34227a.hashCode();
            }
            this.f27593n = i12;
            return;
        }
        int childCount3 = getChildCount();
        int i26 = 1;
        for (int i27 = 0; i27 < childCount3; i27++) {
            i26 = (i26 * 31) + d(i27).f34227a.hashCode();
        }
        if (i11 != i26) {
            g();
            c();
        }
    }

    public final vy0 d(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.L;
            if (i10 < arrayList.size()) {
                return (vy0) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        az0 az0Var = this.M;
        if (az0Var != null && az0Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(vy0 vy0Var, boolean z10, boolean z11) {
        sy0 sy0Var;
        int[] iArr;
        zy0 zy0Var;
        int i10;
        if (this.h == 1) {
            return f(vy0Var, z10, z11);
        }
        if (z10) {
            sy0Var = this.f27590c;
        } else {
            sy0Var = this.d;
        }
        if (z11) {
            if (sy0Var.f32746j == null) {
                sy0Var.f32746j = new int[sy0Var.e() + 1];
            }
            if (!sy0Var.f32747k) {
                sy0Var.b(true);
                sy0Var.f32747k = true;
            }
            iArr = sy0Var.f32746j;
        } else {
            if (sy0Var.f32748l == null) {
                sy0Var.f32748l = new int[sy0Var.e() + 1];
            }
            if (!sy0Var.f32749m) {
                sy0Var.b(false);
                sy0Var.f32749m = true;
            }
            iArr = sy0Var.f32748l;
        }
        xy0 xy0Var = vy0Var.f34227a;
        if (z10) {
            zy0Var = xy0Var.f34855b;
        } else {
            zy0Var = xy0Var.f34854a;
        }
        wy0 wy0Var = zy0Var.f35456b;
        if (z11) {
            i10 = wy0Var.f34515a;
        } else {
            i10 = wy0Var.f34516b;
        }
        return iArr[i10];
    }

    public final int f(vy0 vy0Var, boolean z10, boolean z11) {
        int i10;
        zy0 zy0Var;
        sy0 sy0Var;
        boolean z12;
        xy0 xy0Var = vy0Var.f34227a;
        if (z10) {
            if (z11) {
                i10 = ((ViewGroup.MarginLayoutParams) xy0Var).leftMargin;
            } else {
                i10 = ((ViewGroup.MarginLayoutParams) xy0Var).rightMargin;
            }
        } else if (z11) {
            i10 = ((ViewGroup.MarginLayoutParams) xy0Var).topMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) xy0Var).bottomMargin;
        }
        if (i10 == Integer.MIN_VALUE) {
            if (!this.f27592f) {
                return 0;
            }
            if (z10) {
                zy0Var = xy0Var.f34855b;
            } else {
                zy0Var = xy0Var.f34854a;
            }
            if (z10) {
                sy0Var = this.f27590c;
            } else {
                sy0Var = this.d;
            }
            wy0 wy0Var = zy0Var.f35456b;
            if (z10 && this.E) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != z11) {
                int i11 = wy0Var.f34515a;
                return 0;
            }
            int i12 = wy0Var.f34516b;
            sy0Var.e();
            return 0;
        }
        return i10;
    }

    public final void g() {
        this.f27593n = 0;
        sy0 sy0Var = this.f27590c;
        sy0Var.k();
        sy0 sy0Var2 = this.d;
        sy0Var2.k();
        if (sy0Var != null && sy0Var2 != null) {
            sy0Var.l();
            sy0Var2.l();
        }
    }

    public int getAlignmentMode() {
        return this.h;
    }

    public int getChildCount() {
        return this.L.size();
    }

    public int getColumnCount() {
        return this.f27590c.e();
    }

    public int getOrientation() {
        return this.f27591e;
    }

    public int getRenderHeight() {
        return this.A;
    }

    public int getRowCount() {
        return this.d.e();
    }

    public boolean getUseDefaultMargins() {
        return this.f27592f;
    }

    public final void h(int i10, boolean z10) {
        boolean z11;
        zy0 zy0Var;
        sy0 sy0Var;
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            vy0 d = d(i14);
            xy0 xy0Var = d.f34227a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                if (this.f27589b == 2) {
                    i12 = ((int) (size / 2.0f)) - (this.v * 4);
                } else {
                    i12 = (int) (size / 1.5f);
                }
                d.e(this.K.createTextLayout(d.f34229c, i12));
                if (d.f34228b != null) {
                    ((ViewGroup.MarginLayoutParams) xy0Var).height = Math.max(this.f27596w, d.f34231f + this.f27594r + this.f27595s);
                    int emojiOnlyCount = d.f34228b.getEmojiOnlyCount();
                    if (emojiOnlyCount > 0) {
                        i13 = ((ViewGroup.MarginLayoutParams) xy0Var).height * emojiOnlyCount;
                    } else {
                        i13 = (this.v * 2) + d.f34230e;
                    }
                    ((ViewGroup.MarginLayoutParams) xy0Var).width = i13;
                } else {
                    ((ViewGroup.MarginLayoutParams) xy0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) xy0Var).height = 0;
                }
                int i15 = ((ViewGroup.MarginLayoutParams) xy0Var).width;
                int i16 = ((ViewGroup.MarginLayoutParams) xy0Var).height;
                d.d(e(d, true, false) + e(d, true, true) + i15, e(d, false, false) + e(d, false, true) + i16, true);
            } else {
                if (this.f27591e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    zy0Var = xy0Var.f34855b;
                } else {
                    zy0Var = xy0Var.f34854a;
                }
                if (zy0.a(zy0Var, z11) == Q) {
                    wy0 wy0Var = zy0Var.f35456b;
                    if (z11) {
                        sy0Var = this.f27590c;
                    } else {
                        sy0Var = this.d;
                    }
                    int[] g10 = sy0Var.g();
                    int e10 = (g10[wy0Var.f34516b] - g10[wy0Var.f34515a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        uy0 uy0Var = d.f34228b;
                        if (uy0Var != null) {
                            i11 = uy0Var.getEmojiOnlyCount();
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            int max = Math.max(1, Math.round(e10 / i11));
                            ((ViewGroup.MarginLayoutParams) xy0Var).height = max;
                            d.f34237m = max;
                        }
                        int i17 = ((ViewGroup.MarginLayoutParams) xy0Var).height;
                        d.d(e(d, true, false) + e(d, true, true) + e10, e(d, false, false) + e(d, false, true) + i17, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) xy0Var).width, e(d, false, false) + e(d, false, true) + e10, false);
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
        cz0 cz0Var = this;
        cz0Var.c();
        sy0 sy0Var = cz0Var.d;
        sy0 sy0Var2 = cz0Var.f27590c;
        if (sy0Var2 != null && sy0Var != null) {
            sy0Var2.l();
            sy0Var.l();
        }
        cz0Var.f27589b = 0;
        int childCount = cz0Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            cz0Var.f27589b = Math.max(cz0Var.f27589b, cz0Var.d(i16).f34227a.f34855b.f35456b.f34516b);
        }
        cz0Var.h(i10, true);
        if (cz0Var.f27591e == 0) {
            i12 = sy0Var2.i(i10);
            if (cz0Var.f27597x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                sy0Var2.v.f35158a = i12;
                sy0Var2.f32758w.f35158a = -i12;
                sy0Var2.f32753q = false;
                sy0Var2.g();
            }
            cz0Var.h(i10, false);
            i13 = sy0Var.i(i11);
        } else {
            int i17 = sy0Var.i(i11);
            cz0Var.h(i10, false);
            i12 = sy0Var2.i(i10);
            i13 = i17;
        }
        int max = Math.max(i13, cz0Var.getSuggestedMinimumHeight());
        cz0Var.setMeasuredDimension(i12, max);
        sy0Var2.v.f35158a = i12;
        sy0Var2.f32758w.f35158a = -i12;
        sy0Var2.f32753q = false;
        sy0Var2.g();
        sy0Var.v.f35158a = max;
        sy0Var.f32758w.f35158a = -max;
        sy0Var.f32753q = false;
        sy0Var.g();
        int[] g10 = sy0Var2.g();
        int[] g11 = sy0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = cz0Var.F;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = cz0Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            vy0 d = cz0Var.d(i20);
            xy0 xy0Var = d.f34227a;
            zy0 zy0Var = xy0Var.f34855b;
            zy0 zy0Var2 = xy0Var.f34854a;
            wy0 wy0Var = zy0Var.f35456b;
            wy0 wy0Var2 = zy0Var2.f35456b;
            int i21 = childCount2;
            int i22 = g10[wy0Var.f34515a];
            int i23 = g11[wy0Var2.f34515a];
            int i24 = g10[wy0Var.f34516b] - i22;
            int i25 = g11[wy0Var2.f34516b] - i23;
            int i26 = d.f34235k;
            sy0 sy0Var3 = sy0Var;
            int i27 = d.f34236l;
            oy0 a2 = zy0.a(zy0Var, true);
            oy0 a10 = zy0.a(zy0Var2, false);
            l3.g0 f9 = sy0Var2.f();
            ty0 ty0Var = (ty0) ((Object[]) f9.d)[((int[]) f9.f14096b)[i20]];
            l3.g0 f10 = sy0Var3.f();
            sy0 sy0Var4 = sy0Var2;
            ty0 ty0Var2 = (ty0) ((Object[]) f10.d)[((int[]) f10.f14096b)[i20]];
            int b10 = a2.b(d, i24 - ty0Var.d(true));
            int b11 = a10.b(d, i25 - ty0Var2.d(true));
            int e10 = cz0Var.e(d, true, true);
            int e11 = cz0Var.e(d, false, true);
            int e12 = cz0Var.e(d, true, false);
            int i28 = e10 + e12;
            int e13 = e11 + cz0Var.e(d, false, false);
            int a11 = ty0Var.a(cz0Var, d, a2, i26 + i28, true);
            cz0Var = this;
            int a12 = ty0Var2.a(cz0Var, d, a10, i27 + e13, false);
            int c3 = a2.c(i26, i24 - i28);
            int c6 = a10.c(i27, i25 - e13);
            int i29 = i22 + b10 + a11;
            if (!cz0Var.E) {
                i15 = e10 + i29;
            } else {
                i15 = ((i18 - c3) - e12) - i29;
            }
            int i30 = i15;
            int i31 = i23 + b11 + a12 + e11;
            if (d.f34229c != null) {
                if (c3 != d.f34235k || c6 != d.f34236l) {
                    d.d(c3, c6, false);
                }
                int i32 = d.f34237m;
                if (i32 != 0 && i32 != c6) {
                    wy0 wy0Var3 = d.f34227a.f34854a.f35456b;
                    if (wy0Var3.f34516b - wy0Var3.f34515a <= 1) {
                        ArrayList arrayList2 = cz0Var.G;
                        int size = arrayList2.size();
                        int i33 = 0;
                        while (true) {
                            if (i33 < size) {
                                PointF pointF = (PointF) arrayList2.get(i33);
                                float f11 = pointF.x;
                                float f12 = d.f34227a.f34854a.f35456b.f34515a;
                                if (f11 > f12 || pointF.y <= f12) {
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
            d.f34240p = i30;
            d.f34241q = i31;
            i19 = i20 + 1;
            sy0Var = sy0Var3;
            childCount2 = i21;
            sy0Var2 = sy0Var4;
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            vy0 vy0Var = (vy0) arrayList.get(i34);
            int i35 = vy0Var.f34236l;
            int i36 = vy0Var.d;
            int i37 = i35 - vy0Var.f34237m;
            ArrayList arrayList3 = cz0Var.L;
            int size3 = arrayList3.size();
            for (int i38 = i36 + 1; i38 < size3; i38++) {
                vy0 vy0Var2 = (vy0) arrayList3.get(i38);
                if (vy0Var.f34227a.f34854a.f35456b.f34515a != vy0Var2.f34227a.f34854a.f35456b.f34515a) {
                    break;
                }
                int i39 = vy0Var.f34237m;
                int i40 = vy0Var2.f34237m;
                if (i39 < i40) {
                    z10 = true;
                    break;
                }
                int i41 = vy0Var2.f34236l - i40;
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
                    vy0 vy0Var3 = (vy0) arrayList3.get(i42);
                    if (vy0Var.f34227a.f34854a.f35456b.f34515a != vy0Var3.f34227a.f34854a.f35456b.f34515a) {
                        break;
                    }
                    int i43 = vy0Var.f34237m;
                    int i44 = vy0Var3.f34237m;
                    if (i43 < i44) {
                        z10 = true;
                        break;
                    }
                    int i45 = vy0Var3.f34236l - i44;
                    if (i45 > 0) {
                        i37 = Math.min(i37, i45);
                    }
                    i42--;
                }
            }
            if (!z10) {
                vy0Var.f34236l = vy0Var.f34237m;
                vy0Var.g();
                max -= i37;
                int i46 = vy0Var.f34227a.f34854a.f35456b.f34515a;
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
                    vy0 vy0Var4 = (vy0) arrayList3.get(i49);
                    if (vy0Var == vy0Var4) {
                        i14 = i49;
                    } else {
                        int i50 = vy0Var.f34227a.f34854a.f35456b.f34515a;
                        int i51 = vy0Var4.f34227a.f34854a.f35456b.f34515a;
                        if (i50 == i51) {
                            if (vy0Var4.f34237m != vy0Var4.f34236l) {
                                arrayList.remove(vy0Var4);
                                if (vy0Var4.d < i36) {
                                    i48--;
                                }
                                i47--;
                            }
                            int i52 = vy0Var4.f34236l - i37;
                            vy0Var4.f34236l = i52;
                            i14 = i49;
                            vy0Var4.d(vy0Var4.f34235k, i52, true);
                        } else {
                            i14 = i49;
                            if (i50 < i51) {
                                vy0Var4.f34241q -= i37;
                            }
                        }
                    }
                    i49 = i14 + 1;
                }
                i34 = i48;
                size2 = i47;
            }
            i34++;
        }
        int childCount3 = cz0Var.getChildCount();
        for (int i53 = 0; i53 < childCount3; i53++) {
            vy0 d10 = cz0Var.d(i53);
            cz0Var.K.onLayoutChild(d10.f34228b, d10.b(), d10.c());
            d10.f34238n = d10.f34240p;
            d10.f34239o = d10.f34235k;
        }
        cz0Var.f27598y = i18;
        cz0Var.A = max;
        cz0Var.B = copyOf;
        cz0Var.setMeasuredDimension(i18, max);
    }

    @Override
    public final void requestLayout() {
        sy0 sy0Var;
        super.requestLayout();
        sy0 sy0Var2 = this.f27590c;
        if (sy0Var2 != null && (sy0Var = this.d) != null) {
            sy0Var2.l();
            sy0Var.l();
        }
    }

    public void setAlignmentMode(int i10) {
        this.h = i10;
        requestLayout();
    }

    public void setColumnCount(int i10) {
        this.f27590c.n(i10);
        g();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        sy0 sy0Var = this.f27590c;
        sy0Var.f32757u = z10;
        sy0Var.k();
        g();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.C = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.f27597x == z10) {
            return;
        }
        this.f27597x = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i10) {
        this.f27596w = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        if (this.f27591e != i10) {
            this.f27591e = i10;
            g();
            requestLayout();
        }
    }

    public void setRenderWidth(int i10) {
        int i11;
        int i12;
        int measuredWidth = getMeasuredWidth();
        this.f27598y = Math.max(measuredWidth, i10);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            vy0 d = d(i13);
            if (measuredWidth > 0 && (i12 = this.f27598y) != measuredWidth) {
                float f9 = measuredWidth;
                int round = Math.round((d.f34238n * i12) / f9);
                int round2 = Math.round(((d.f34238n + d.f34239o) * this.f27598y) / f9);
                d.f34240p = round;
                d.f34235k = Math.max(0, round2 - round);
                if (d.f34229c != null && d.f34228b != null) {
                    d.f();
                }
            } else {
                int i14 = d.f34238n;
                d.f34240p = i14;
                d.f34235k = Math.max(0, (d.f34239o + i14) - i14);
                if (d.f34229c != null && d.f34228b != null) {
                    d.f();
                }
            }
        }
        int[] iArr = this.B;
        if (iArr.length < 2) {
            this.A = getMeasuredHeight();
        } else {
            int length = iArr.length;
            int i15 = length - 1;
            int[] iArr2 = new int[i15];
            int i16 = 0;
            while (i16 < i15) {
                int[] iArr3 = this.B;
                int i17 = i16 + 1;
                iArr2[i16] = iArr3[i17] - iArr3[i16];
                i16 = i17;
            }
            for (int i18 = 0; i18 < getChildCount(); i18++) {
                vy0 d10 = d(i18);
                uy0 uy0Var = d10.f34228b;
                if (uy0Var != null) {
                    i11 = uy0Var.getEmojiOnlyCount();
                } else {
                    i11 = 0;
                }
                if (i11 > 0) {
                    wy0 wy0Var = d10.f34227a.f34854a.f35456b;
                    int max = Math.max(0, wy0Var.f34515a);
                    int min = Math.min(i15, wy0Var.f34516b);
                    if (max < min) {
                        int i19 = 0;
                        for (int i20 = max; i20 < min; i20++) {
                            i19 += iArr2[i20];
                        }
                        int max2 = Math.max(1, Math.round(d10.f34235k / i11)) - i19;
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
            this.A = iArr4[i15];
            for (int i25 = 0; i25 < getChildCount(); i25++) {
                vy0 d11 = d(i25);
                wy0 wy0Var2 = d11.f34227a.f34854a.f35456b;
                int max3 = Math.max(0, Math.min(i15, wy0Var2.f34515a));
                int max4 = Math.max(max3, Math.min(i15, wy0Var2.f34516b));
                int i26 = iArr4[max3];
                int i27 = iArr4[max4];
                d11.f34241q = i26;
                d11.f34236l = Math.max(0, i27 - i26);
                if (d11.f34229c != null) {
                    d11.g();
                }
                this.K.onLayoutChild(d11.f34228b, d11.b(), d11.c());
            }
        }
        invalidate();
    }

    public void setRowCount(int i10) {
        this.d.n(i10);
        g();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z10) {
        sy0 sy0Var = this.d;
        sy0Var.f32757u = z10;
        sy0Var.k();
        g();
        requestLayout();
    }

    public void setRtl(boolean z10) {
        this.E = z10;
    }

    public void setStriped(boolean z10) {
        this.D = z10;
    }

    public void setUseDefaultMargins(boolean z10) {
        this.f27592f = z10;
        requestLayout();
    }
}
