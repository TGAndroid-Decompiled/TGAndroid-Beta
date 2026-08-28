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
public final class ry0 extends View {
    public static final dy0 N = new dy0(0);
    public static final dy0 O = new dy0(1);
    public static final dy0 P = new dy0(3);
    public static final dy0 Q = new dy0(4);
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
    public final qy0 K;
    public final ArrayList L;
    public final py0 M;
    public final org.telegram.ui.Cells.n9 f32310a;
    public int f32311b;
    public final hy0 f32312c;
    public final hy0 d;
    public int f32313e;
    public boolean f32314f;
    public int h;
    public int f32315n;
    public int f32316r;
    public int f32317s;
    public int v;
    public int f32318w;
    public boolean f32319x;
    public int f32320y;

    public ry0(Context context, qy0 qy0Var, org.telegram.ui.Cells.n9 n9Var) {
        super(context);
        this.f32312c = new hy0(this, true);
        this.d = new hy0(this, false);
        this.f32313e = 0;
        this.f32314f = false;
        this.h = 1;
        this.f32315n = 0;
        this.f32316r = AndroidUtilities.dp(8.0f);
        this.f32317s = AndroidUtilities.dp(9.0f);
        this.v = AndroidUtilities.dp(12.0f);
        this.f32319x = true;
        this.B = new int[0];
        this.F = new ArrayList();
        this.G = new ArrayList();
        new Path();
        this.H = new Path();
        this.I = new RectF();
        this.J = new float[8];
        this.L = new ArrayList();
        this.f32310a = n9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.K = qy0Var;
        py0 py0Var = new py0(this, this);
        this.M = py0Var;
        r0.j0.k(this, py0Var);
    }

    public static void i(my0 my0Var, int i9, int i10, int i11, int i12) {
        ly0 ly0Var = new ly0(i9, i10 + i9);
        oy0 oy0Var = my0Var.f30947a;
        my0Var.f30947a = new oy0(oy0Var.f31475a, ly0Var, oy0Var.f31477c, oy0Var.d);
        ly0 ly0Var2 = new ly0(i11, i12 + i11);
        oy0 oy0Var2 = my0Var.f30948b;
        my0Var.f30948b = new oy0(oy0Var2.f31475a, ly0Var2, oy0Var2.f31477c, oy0Var2.d);
    }

    public final void a(int i9, int i10, int i11, int i12) {
        ArrayList arrayList = this.L;
        ky0 ky0Var = new ky0(this, arrayList.size());
        my0 my0Var = new my0();
        ly0 ly0Var = new ly0(i10, i12 + i10);
        dy0 dy0Var = Q;
        my0Var.f30947a = new oy0(false, ly0Var, dy0Var, 0.0f);
        my0Var.f30948b = new oy0(false, new ly0(i9, i11 + i9), dy0Var, 0.0f);
        ky0Var.f30264a = my0Var;
        ky0Var.f30271j = i10;
        arrayList.add(ky0Var);
        g();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i9, int i10, int i11) {
        if (i11 == 0) {
            i11 = 1;
        }
        ArrayList arrayList = this.L;
        ky0 ky0Var = new ky0(this, arrayList.size());
        ky0Var.f30266c = pagetablecell;
        my0 my0Var = new my0();
        int i12 = pagetablecell.rowspan;
        if (i12 == 0) {
            i12 = 1;
        }
        ly0 ly0Var = new ly0(i10, i12 + i10);
        dy0 dy0Var = Q;
        my0Var.f30947a = new oy0(false, ly0Var, dy0Var, 0.0f);
        my0Var.f30948b = new oy0(false, new ly0(i9, i11 + i9), dy0Var, 1.0f);
        ky0Var.f30264a = my0Var;
        ky0Var.f30271j = i10;
        arrayList.add(ky0Var);
        int i13 = pagetablecell.rowspan;
        if (i13 > 1) {
            this.G.add(new PointF(i10, i10 + i13));
        }
        g();
    }

    public final void c() {
        boolean z10;
        hy0 hy0Var;
        oy0 oy0Var;
        oy0 oy0Var2;
        int i9;
        int i10 = this.f32315n;
        int i11 = 1;
        if (i10 == 0) {
            if (this.f32313e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                hy0Var = this.f32312c;
            } else {
                hy0Var = this.d;
            }
            int i12 = hy0Var.f29214b;
            if (i12 == Integer.MIN_VALUE) {
                i12 = 0;
            }
            int[] iArr = new int[i12];
            int childCount = getChildCount();
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                my0 my0Var = d(i15).f30264a;
                if (z10) {
                    oy0Var = my0Var.f30947a;
                } else {
                    oy0Var = my0Var.f30948b;
                }
                ly0 ly0Var = oy0Var.f31476b;
                boolean z11 = oy0Var.f31475a;
                int i16 = ly0Var.f30585b;
                int i17 = ly0Var.f30584a;
                int i18 = i16 - i17;
                if (z11) {
                    i13 = i17;
                }
                if (z10) {
                    oy0Var2 = my0Var.f30948b;
                } else {
                    oy0Var2 = my0Var.f30947a;
                }
                ly0 ly0Var2 = oy0Var2.f31476b;
                boolean z12 = oy0Var2.f31475a;
                int i19 = ly0Var2.f30585b;
                int i20 = ly0Var2.f30584a;
                int i21 = i19 - i20;
                if (i12 != 0) {
                    if (z12) {
                        i9 = Math.min(i20, i12);
                    } else {
                        i9 = 0;
                    }
                    i21 = Math.min(i21, i12 - i9);
                }
                if (z12) {
                    i14 = i20;
                }
                if (i12 != 0) {
                    if (!z11 || !z12) {
                        while (true) {
                            int i22 = i14 + i21;
                            if (i22 <= i12) {
                                for (int i23 = i14; i23 < i22; i23++) {
                                    if (iArr[i23] <= i13) {
                                    }
                                }
                                break;
                            }
                            if (z12) {
                                i13++;
                            } else if (i22 <= i12) {
                                i14++;
                            } else {
                                i13++;
                                i14 = 0;
                            }
                        }
                    }
                    Arrays.fill(iArr, Math.min(i14, i12), Math.min(i14 + i21, i12), i13 + i18);
                }
                if (z10) {
                    i(my0Var, i13, i18, i14, i21);
                } else {
                    i(my0Var, i14, i21, i13, i18);
                }
                i14 += i21;
            }
            int childCount2 = getChildCount();
            for (int i24 = 0; i24 < childCount2; i24++) {
                i11 = (i11 * 31) + d(i24).f30264a.hashCode();
            }
            this.f32315n = i11;
            return;
        }
        int childCount3 = getChildCount();
        int i25 = 1;
        for (int i26 = 0; i26 < childCount3; i26++) {
            i25 = (i25 * 31) + d(i26).f30264a.hashCode();
        }
        if (i10 != i25) {
            g();
            c();
        }
    }

    public final ky0 d(int i9) {
        if (i9 >= 0) {
            ArrayList arrayList = this.L;
            if (i9 < arrayList.size()) {
                return (ky0) arrayList.get(i9);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        py0 py0Var = this.M;
        if (py0Var != null && py0Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(ky0 ky0Var, boolean z10, boolean z11) {
        hy0 hy0Var;
        int[] iArr;
        oy0 oy0Var;
        int i9;
        if (this.h == 1) {
            return f(ky0Var, z10, z11);
        }
        if (z10) {
            hy0Var = this.f32312c;
        } else {
            hy0Var = this.d;
        }
        if (z11) {
            if (hy0Var.f29220j == null) {
                hy0Var.f29220j = new int[hy0Var.e() + 1];
            }
            if (!hy0Var.f29221k) {
                hy0Var.b(true);
                hy0Var.f29221k = true;
            }
            iArr = hy0Var.f29220j;
        } else {
            if (hy0Var.f29222l == null) {
                hy0Var.f29222l = new int[hy0Var.e() + 1];
            }
            if (!hy0Var.f29223m) {
                hy0Var.b(false);
                hy0Var.f29223m = true;
            }
            iArr = hy0Var.f29222l;
        }
        my0 my0Var = ky0Var.f30264a;
        if (z10) {
            oy0Var = my0Var.f30948b;
        } else {
            oy0Var = my0Var.f30947a;
        }
        ly0 ly0Var = oy0Var.f31476b;
        if (z11) {
            i9 = ly0Var.f30584a;
        } else {
            i9 = ly0Var.f30585b;
        }
        return iArr[i9];
    }

    public final int f(ky0 ky0Var, boolean z10, boolean z11) {
        int i9;
        oy0 oy0Var;
        hy0 hy0Var;
        boolean z12;
        my0 my0Var = ky0Var.f30264a;
        if (z10) {
            if (z11) {
                i9 = ((ViewGroup.MarginLayoutParams) my0Var).leftMargin;
            } else {
                i9 = ((ViewGroup.MarginLayoutParams) my0Var).rightMargin;
            }
        } else if (z11) {
            i9 = ((ViewGroup.MarginLayoutParams) my0Var).topMargin;
        } else {
            i9 = ((ViewGroup.MarginLayoutParams) my0Var).bottomMargin;
        }
        if (i9 == Integer.MIN_VALUE) {
            if (!this.f32314f) {
                return 0;
            }
            if (z10) {
                oy0Var = my0Var.f30948b;
            } else {
                oy0Var = my0Var.f30947a;
            }
            if (z10) {
                hy0Var = this.f32312c;
            } else {
                hy0Var = this.d;
            }
            ly0 ly0Var = oy0Var.f31476b;
            if (z10 && this.E) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != z11) {
                int i10 = ly0Var.f30584a;
                return 0;
            }
            int i11 = ly0Var.f30585b;
            hy0Var.e();
            return 0;
        }
        return i9;
    }

    public final void g() {
        this.f32315n = 0;
        hy0 hy0Var = this.f32312c;
        hy0Var.k();
        hy0 hy0Var2 = this.d;
        hy0Var2.k();
        if (hy0Var != null && hy0Var2 != null) {
            hy0Var.l();
            hy0Var2.l();
        }
    }

    public int getAlignmentMode() {
        return this.h;
    }

    public int getChildCount() {
        return this.L.size();
    }

    public int getColumnCount() {
        return this.f32312c.e();
    }

    public int getOrientation() {
        return this.f32313e;
    }

    public int getRenderHeight() {
        return this.A;
    }

    public int getRowCount() {
        return this.d.e();
    }

    public boolean getUseDefaultMargins() {
        return this.f32314f;
    }

    public final void h(int i9, boolean z10) {
        boolean z11;
        oy0 oy0Var;
        hy0 hy0Var;
        int i10;
        int i11;
        int i12;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            ky0 d = d(i13);
            my0 my0Var = d.f30264a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i9);
                if (this.f32311b == 2) {
                    i11 = ((int) (size / 2.0f)) - (this.v * 4);
                } else {
                    i11 = (int) (size / 1.5f);
                }
                d.e(this.K.createTextLayout(d.f30266c, i11));
                if (d.f30265b != null) {
                    ((ViewGroup.MarginLayoutParams) my0Var).height = Math.max(this.f32318w, d.f30268f + this.f32316r + this.f32317s);
                    int emojiOnlyCount = d.f30265b.getEmojiOnlyCount();
                    if (emojiOnlyCount > 0) {
                        i12 = ((ViewGroup.MarginLayoutParams) my0Var).height * emojiOnlyCount;
                    } else {
                        i12 = (this.v * 2) + d.f30267e;
                    }
                    ((ViewGroup.MarginLayoutParams) my0Var).width = i12;
                } else {
                    ((ViewGroup.MarginLayoutParams) my0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) my0Var).height = 0;
                }
                int i14 = ((ViewGroup.MarginLayoutParams) my0Var).width;
                int i15 = ((ViewGroup.MarginLayoutParams) my0Var).height;
                d.d(e(d, true, false) + e(d, true, true) + i14, e(d, false, false) + e(d, false, true) + i15, true);
            } else {
                if (this.f32313e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    oy0Var = my0Var.f30948b;
                } else {
                    oy0Var = my0Var.f30947a;
                }
                if (oy0.a(oy0Var, z11) == Q) {
                    ly0 ly0Var = oy0Var.f31476b;
                    if (z11) {
                        hy0Var = this.f32312c;
                    } else {
                        hy0Var = this.d;
                    }
                    int[] g10 = hy0Var.g();
                    int e10 = (g10[ly0Var.f30585b] - g10[ly0Var.f30584a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        jy0 jy0Var = d.f30265b;
                        if (jy0Var != null) {
                            i10 = jy0Var.getEmojiOnlyCount();
                        } else {
                            i10 = 0;
                        }
                        if (i10 > 0) {
                            int max = Math.max(1, Math.round(e10 / i10));
                            ((ViewGroup.MarginLayoutParams) my0Var).height = max;
                            d.f30274m = max;
                        }
                        int i16 = ((ViewGroup.MarginLayoutParams) my0Var).height;
                        d.d(e(d, true, false) + e(d, true, true) + e10, e(d, false, false) + e(d, false, true) + i16, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) my0Var).width, e(d, false, false) + e(d, false, true) + e10, false);
                    }
                }
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            d(i9).a(canvas, this, true);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        c();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        ry0 ry0Var = this;
        ry0Var.c();
        hy0 hy0Var = ry0Var.d;
        hy0 hy0Var2 = ry0Var.f32312c;
        if (hy0Var2 != null && hy0Var != null) {
            hy0Var2.l();
            hy0Var.l();
        }
        ry0Var.f32311b = 0;
        int childCount = ry0Var.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            ry0Var.f32311b = Math.max(ry0Var.f32311b, ry0Var.d(i15).f30264a.f30948b.f31476b.f30585b);
        }
        ry0Var.h(i9, true);
        if (ry0Var.f32313e == 0) {
            i11 = hy0Var2.i(i9);
            if (ry0Var.f32319x) {
                i11 = Math.max(i11, View.MeasureSpec.getSize(i9));
                hy0Var2.v.f31218a = i11;
                hy0Var2.f29232w.f31218a = -i11;
                hy0Var2.f29227q = false;
                hy0Var2.g();
            }
            ry0Var.h(i9, false);
            i12 = hy0Var.i(i10);
        } else {
            int i16 = hy0Var.i(i10);
            ry0Var.h(i9, false);
            i11 = hy0Var2.i(i9);
            i12 = i16;
        }
        int max = Math.max(i12, ry0Var.getSuggestedMinimumHeight());
        ry0Var.setMeasuredDimension(i11, max);
        hy0Var2.v.f31218a = i11;
        hy0Var2.f29232w.f31218a = -i11;
        hy0Var2.f29227q = false;
        hy0Var2.g();
        hy0Var.v.f31218a = max;
        hy0Var.f29232w.f31218a = -max;
        hy0Var.f29227q = false;
        hy0Var.g();
        int[] g10 = hy0Var2.g();
        int[] g11 = hy0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = ry0Var.F;
        arrayList.clear();
        int i17 = g10[g10.length - 1];
        int childCount2 = ry0Var.getChildCount();
        int i18 = 0;
        while (i18 < childCount2) {
            int i19 = i18;
            ky0 d = ry0Var.d(i19);
            my0 my0Var = d.f30264a;
            oy0 oy0Var = my0Var.f30948b;
            oy0 oy0Var2 = my0Var.f30947a;
            ly0 ly0Var = oy0Var.f31476b;
            ly0 ly0Var2 = oy0Var2.f31476b;
            int i20 = childCount2;
            int i21 = g10[ly0Var.f30584a];
            int i22 = g11[ly0Var2.f30584a];
            int i23 = g10[ly0Var.f30585b] - i21;
            int i24 = g11[ly0Var2.f30585b] - i22;
            int i25 = d.f30272k;
            hy0 hy0Var3 = hy0Var;
            int i26 = d.f30273l;
            dy0 a2 = oy0.a(oy0Var, true);
            dy0 a3 = oy0.a(oy0Var2, false);
            j4.c f10 = hy0Var2.f();
            iy0 iy0Var = (iy0) ((Object[]) f10.d)[((int[]) f10.f13431b)[i19]];
            j4.c f11 = hy0Var3.f();
            hy0 hy0Var4 = hy0Var2;
            iy0 iy0Var2 = (iy0) ((Object[]) f11.d)[((int[]) f11.f13431b)[i19]];
            int b10 = a2.b(d, i23 - iy0Var.d(true));
            int b11 = a3.b(d, i24 - iy0Var2.d(true));
            int e10 = ry0Var.e(d, true, true);
            int e11 = ry0Var.e(d, false, true);
            int e12 = ry0Var.e(d, true, false);
            int i27 = e10 + e12;
            int e13 = e11 + ry0Var.e(d, false, false);
            int a10 = iy0Var.a(ry0Var, d, a2, i25 + i27, true);
            ry0Var = this;
            int a11 = iy0Var2.a(ry0Var, d, a3, i26 + e13, false);
            int c10 = a2.c(i25, i23 - i27);
            int c11 = a3.c(i26, i24 - e13);
            int i28 = i21 + b10 + a10;
            if (!ry0Var.E) {
                i14 = e10 + i28;
            } else {
                i14 = ((i17 - c10) - e12) - i28;
            }
            int i29 = i14;
            int i30 = i22 + b11 + a11 + e11;
            if (d.f30266c != null) {
                if (c10 != d.f30272k || c11 != d.f30273l) {
                    d.d(c10, c11, false);
                }
                int i31 = d.f30274m;
                if (i31 != 0 && i31 != c11) {
                    ly0 ly0Var3 = d.f30264a.f30947a.f31476b;
                    if (ly0Var3.f30585b - ly0Var3.f30584a <= 1) {
                        ArrayList arrayList2 = ry0Var.G;
                        int size = arrayList2.size();
                        int i32 = 0;
                        while (true) {
                            if (i32 < size) {
                                PointF pointF = (PointF) arrayList2.get(i32);
                                float f12 = pointF.x;
                                float f13 = d.f30264a.f30947a.f31476b.f30584a;
                                if (f12 > f13 || pointF.y <= f13) {
                                    i32++;
                                }
                            } else {
                                arrayList.add(d);
                                break;
                            }
                        }
                    }
                }
            }
            d.f30277p = i29;
            d.f30278q = i30;
            i18 = i19 + 1;
            hy0Var = hy0Var3;
            childCount2 = i20;
            hy0Var2 = hy0Var4;
        }
        int size2 = arrayList.size();
        int i33 = 0;
        while (i33 < size2) {
            ky0 ky0Var = (ky0) arrayList.get(i33);
            int i34 = ky0Var.f30273l;
            int i35 = ky0Var.d;
            int i36 = i34 - ky0Var.f30274m;
            ArrayList arrayList3 = ry0Var.L;
            int size3 = arrayList3.size();
            for (int i37 = i35 + 1; i37 < size3; i37++) {
                ky0 ky0Var2 = (ky0) arrayList3.get(i37);
                if (ky0Var.f30264a.f30947a.f31476b.f30584a != ky0Var2.f30264a.f30947a.f31476b.f30584a) {
                    break;
                }
                int i38 = ky0Var.f30274m;
                int i39 = ky0Var2.f30274m;
                if (i38 < i39) {
                    z10 = true;
                    break;
                }
                int i40 = ky0Var2.f30273l - i39;
                if (i40 > 0) {
                    i36 = Math.min(i36, i40);
                }
            }
            z10 = false;
            if (!z10) {
                int i41 = i35 - 1;
                while (true) {
                    if (i41 < 0) {
                        break;
                    }
                    ky0 ky0Var3 = (ky0) arrayList3.get(i41);
                    if (ky0Var.f30264a.f30947a.f31476b.f30584a != ky0Var3.f30264a.f30947a.f31476b.f30584a) {
                        break;
                    }
                    int i42 = ky0Var.f30274m;
                    int i43 = ky0Var3.f30274m;
                    if (i42 < i43) {
                        z10 = true;
                        break;
                    }
                    int i44 = ky0Var3.f30273l - i43;
                    if (i44 > 0) {
                        i36 = Math.min(i36, i44);
                    }
                    i41--;
                }
            }
            if (!z10) {
                ky0Var.f30273l = ky0Var.f30274m;
                ky0Var.g();
                max -= i36;
                int i45 = ky0Var.f30264a.f30947a.f31476b.f30584a;
                while (true) {
                    i45++;
                    if (i45 >= copyOf.length) {
                        break;
                    }
                    copyOf[i45] = copyOf[i45] - i36;
                }
                int size4 = arrayList3.size();
                int i46 = size2;
                int i47 = i33;
                int i48 = 0;
                while (i48 < size4) {
                    ky0 ky0Var4 = (ky0) arrayList3.get(i48);
                    if (ky0Var == ky0Var4) {
                        i13 = i48;
                    } else {
                        int i49 = ky0Var.f30264a.f30947a.f31476b.f30584a;
                        int i50 = ky0Var4.f30264a.f30947a.f31476b.f30584a;
                        if (i49 == i50) {
                            if (ky0Var4.f30274m != ky0Var4.f30273l) {
                                arrayList.remove(ky0Var4);
                                if (ky0Var4.d < i35) {
                                    i47--;
                                }
                                i46--;
                            }
                            int i51 = ky0Var4.f30273l - i36;
                            ky0Var4.f30273l = i51;
                            i13 = i48;
                            ky0Var4.d(ky0Var4.f30272k, i51, true);
                        } else {
                            i13 = i48;
                            if (i49 < i50) {
                                ky0Var4.f30278q -= i36;
                            }
                        }
                    }
                    i48 = i13 + 1;
                }
                i33 = i47;
                size2 = i46;
            }
            i33++;
        }
        int childCount3 = ry0Var.getChildCount();
        for (int i52 = 0; i52 < childCount3; i52++) {
            ky0 d9 = ry0Var.d(i52);
            ry0Var.K.onLayoutChild(d9.f30265b, d9.b(), d9.c());
            d9.f30275n = d9.f30277p;
            d9.f30276o = d9.f30272k;
        }
        ry0Var.f32320y = i17;
        ry0Var.A = max;
        ry0Var.B = copyOf;
        ry0Var.setMeasuredDimension(i17, max);
    }

    @Override
    public final void requestLayout() {
        hy0 hy0Var;
        super.requestLayout();
        hy0 hy0Var2 = this.f32312c;
        if (hy0Var2 != null && (hy0Var = this.d) != null) {
            hy0Var2.l();
            hy0Var.l();
        }
    }

    public void setAlignmentMode(int i9) {
        this.h = i9;
        requestLayout();
    }

    public void setColumnCount(int i9) {
        this.f32312c.n(i9);
        g();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        hy0 hy0Var = this.f32312c;
        hy0Var.f29231u = z10;
        hy0Var.k();
        g();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.C = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.f32319x == z10) {
            return;
        }
        this.f32319x = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i9) {
        this.f32318w = i9;
        requestLayout();
    }

    public void setOrientation(int i9) {
        if (this.f32313e != i9) {
            this.f32313e = i9;
            g();
            requestLayout();
        }
    }

    public void setRenderWidth(int i9) {
        int i10;
        int i11;
        int measuredWidth = getMeasuredWidth();
        this.f32320y = Math.max(measuredWidth, i9);
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            ky0 d = d(i12);
            if (measuredWidth > 0 && (i11 = this.f32320y) != measuredWidth) {
                float f10 = measuredWidth;
                int round = Math.round((d.f30275n * i11) / f10);
                int round2 = Math.round(((d.f30275n + d.f30276o) * this.f32320y) / f10);
                d.f30277p = round;
                d.f30272k = Math.max(0, round2 - round);
                if (d.f30266c != null && d.f30265b != null) {
                    d.f();
                }
            } else {
                int i13 = d.f30275n;
                d.f30277p = i13;
                d.f30272k = Math.max(0, (d.f30276o + i13) - i13);
                if (d.f30266c != null && d.f30265b != null) {
                    d.f();
                }
            }
        }
        int[] iArr = this.B;
        if (iArr.length < 2) {
            this.A = getMeasuredHeight();
        } else {
            int length = iArr.length;
            int i14 = length - 1;
            int[] iArr2 = new int[i14];
            int i15 = 0;
            while (i15 < i14) {
                int[] iArr3 = this.B;
                int i16 = i15 + 1;
                iArr2[i15] = iArr3[i16] - iArr3[i15];
                i15 = i16;
            }
            for (int i17 = 0; i17 < getChildCount(); i17++) {
                ky0 d9 = d(i17);
                jy0 jy0Var = d9.f30265b;
                if (jy0Var != null) {
                    i10 = jy0Var.getEmojiOnlyCount();
                } else {
                    i10 = 0;
                }
                if (i10 > 0) {
                    ly0 ly0Var = d9.f30264a.f30947a.f31476b;
                    int max = Math.max(0, ly0Var.f30584a);
                    int min = Math.min(i14, ly0Var.f30585b);
                    if (max < min) {
                        int i18 = 0;
                        for (int i19 = max; i19 < min; i19++) {
                            i18 += iArr2[i19];
                        }
                        int max2 = Math.max(1, Math.round(d9.f30272k / i10)) - i18;
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
            this.A = iArr4[i14];
            for (int i24 = 0; i24 < getChildCount(); i24++) {
                ky0 d10 = d(i24);
                ly0 ly0Var2 = d10.f30264a.f30947a.f31476b;
                int max3 = Math.max(0, Math.min(i14, ly0Var2.f30584a));
                int max4 = Math.max(max3, Math.min(i14, ly0Var2.f30585b));
                int i25 = iArr4[max3];
                int i26 = iArr4[max4];
                d10.f30278q = i25;
                d10.f30273l = Math.max(0, i26 - i25);
                if (d10.f30266c != null) {
                    d10.g();
                }
                this.K.onLayoutChild(d10.f30265b, d10.b(), d10.c());
            }
        }
        invalidate();
    }

    public void setRowCount(int i9) {
        this.d.n(i9);
        g();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z10) {
        hy0 hy0Var = this.d;
        hy0Var.f29231u = z10;
        hy0Var.k();
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
        this.f32314f = z10;
        requestLayout();
    }
}
