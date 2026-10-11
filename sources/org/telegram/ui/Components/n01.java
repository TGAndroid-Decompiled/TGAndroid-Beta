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
public final class n01 extends View {
    public static final zz0 R = new zz0(0);
    public static final zz0 S = new zz0(1);
    public static final zz0 T = new zz0(3);
    public static final zz0 U = new zz0(4);
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
    public final m01 O;
    public final ArrayList P;
    public final l01 Q;
    public final org.telegram.ui.Cells.o9 f28886a;
    public int f28887b;
    public final d01 f28888c;
    public final d01 d;
    public int f28889e;
    public boolean f28890f;
    public int h;
    public int f28891n;
    public int f28892r;
    public int f28893s;
    public int v;
    public int f28894w;
    public boolean f28895x;
    public int f28896y;

    public n01(Context context, m01 m01Var, org.telegram.ui.Cells.o9 o9Var) {
        super(context);
        this.f28888c = new d01(this, true);
        this.d = new d01(this, false);
        this.f28889e = 0;
        this.f28890f = false;
        this.h = 1;
        this.f28891n = 0;
        this.f28892r = AndroidUtilities.dp(8.0f);
        this.f28893s = AndroidUtilities.dp(9.0f);
        this.v = AndroidUtilities.dp(12.0f);
        this.f28895x = true;
        this.F = new int[0];
        this.J = new ArrayList();
        this.K = new ArrayList();
        new Path();
        this.L = new Path();
        this.M = new RectF();
        this.N = new float[8];
        this.P = new ArrayList();
        this.f28886a = o9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.O = m01Var;
        l01 l01Var = new l01(this, this);
        this.Q = l01Var;
        r0.i0.j(this, l01Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(sc.v.v(str, ". "));
    }

    public static void j(i01 i01Var, int i10, int i11, int i12, int i13) {
        h01 h01Var = new h01(i10, i11 + i10);
        k01 k01Var = i01Var.f27120a;
        i01Var.f27120a = new k01(k01Var.f27798a, h01Var, k01Var.f27800c, k01Var.d);
        h01 h01Var2 = new h01(i12, i13 + i12);
        k01 k01Var2 = i01Var.f27121b;
        i01Var.f27121b = new k01(k01Var2.f27798a, h01Var2, k01Var2.f27800c, k01Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        g01 g01Var = new g01(this, arrayList.size());
        i01 i01Var = new i01();
        h01 h01Var = new h01(i11, i13 + i11);
        zz0 zz0Var = U;
        i01Var.f27120a = new k01(false, h01Var, zz0Var, 0.0f);
        i01Var.f27121b = new k01(false, new h01(i10, i12 + i10), zz0Var, 0.0f);
        g01Var.f26543a = i01Var;
        g01Var.f26550j = i11;
        arrayList.add(g01Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        int i13;
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        g01 g01Var = new g01(this, arrayList.size());
        g01Var.f26545c = pagetablecell;
        i01 i01Var = new i01();
        int i14 = pagetablecell.rowspan;
        if (i14 == 0) {
            i14 = 1;
        }
        h01 h01Var = new h01(i11, i14 + i11);
        zz0 zz0Var = U;
        i01Var.f27120a = new k01(false, h01Var, zz0Var, 0.0f);
        i01Var.f27121b = new k01(false, new h01(i10, i12 + i10), zz0Var, 1.0f);
        g01Var.f26543a = i01Var;
        g01Var.f26550j = i11;
        arrayList.add(g01Var);
        if (pagetablecell.rowspan > 1) {
            this.K.add(new PointF(i11, i11 + i13));
        }
        h();
    }

    public final void c() {
        boolean z10;
        d01 d01Var;
        k01 k01Var;
        k01 k01Var2;
        Throwable th2;
        int i10;
        int i11 = this.f28891n;
        if (i11 == 0) {
            if (this.f28889e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                d01Var = this.f28888c;
            } else {
                d01Var = this.d;
            }
            int i12 = d01Var.f25374b;
            if (i12 == Integer.MIN_VALUE) {
                i12 = 0;
            }
            if (i12 >= 0 && i12 <= 1024) {
                int[] iArr = new int[i12];
                int childCount = getChildCount();
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    i01 i01Var = d(i15).f26543a;
                    if (z10) {
                        k01Var = i01Var.f27120a;
                    } else {
                        k01Var = i01Var.f27121b;
                    }
                    h01 h01Var = k01Var.f27799b;
                    boolean z11 = k01Var.f27798a;
                    int a2 = h01Var.a();
                    if (a2 > 0 && a2 <= 1024) {
                        if (z11) {
                            i13 = h01Var.f26868a;
                        }
                        if (z10) {
                            k01Var2 = i01Var.f27121b;
                        } else {
                            k01Var2 = i01Var.f27120a;
                        }
                        h01 h01Var2 = k01Var2.f27799b;
                        int a10 = h01Var2.a();
                        int i16 = h01Var2.f26868a;
                        if (a10 > 0) {
                            th2 = null;
                            if (h01Var2.a() <= 1024) {
                                boolean z12 = k01Var2.f27798a;
                                int a11 = h01Var2.a();
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
                                    j(i01Var, i13, a2, i14, a11);
                                } else {
                                    j(i01Var, i14, a11, i13, a2);
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
                    i19 = (i19 * 31) + d(i20).f26543a.hashCode();
                }
                this.f28891n = i19;
                return;
            }
            g("Table grid count out of bounds");
            throw null;
        }
        int childCount3 = getChildCount();
        int i21 = 1;
        for (int i22 = 0; i22 < childCount3; i22++) {
            i21 = (i21 * 31) + d(i22).f26543a.hashCode();
        }
        if (i11 != i21) {
            h();
            c();
        }
    }

    public final g01 d(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                return (g01) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        l01 l01Var = this.Q;
        if (l01Var != null && l01Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(g01 g01Var, boolean z10, boolean z11) {
        d01 d01Var;
        int[] iArr;
        k01 k01Var;
        int i10;
        if (this.h == 1) {
            return f(g01Var, z10, z11);
        }
        if (z10) {
            d01Var = this.f28888c;
        } else {
            d01Var = this.d;
        }
        if (z11) {
            if (d01Var.f25380j == null) {
                d01Var.f25380j = new int[d01Var.e() + 1];
            }
            if (!d01Var.f25381k) {
                d01Var.b(true);
                d01Var.f25381k = true;
            }
            iArr = d01Var.f25380j;
        } else {
            if (d01Var.f25382l == null) {
                d01Var.f25382l = new int[d01Var.e() + 1];
            }
            if (!d01Var.f25383m) {
                d01Var.b(false);
                d01Var.f25383m = true;
            }
            iArr = d01Var.f25382l;
        }
        i01 i01Var = g01Var.f26543a;
        if (z10) {
            k01Var = i01Var.f27121b;
        } else {
            k01Var = i01Var.f27120a;
        }
        h01 h01Var = k01Var.f27799b;
        if (z11) {
            i10 = h01Var.f26868a;
        } else {
            i10 = h01Var.f26869b;
        }
        return iArr[i10];
    }

    public final int f(g01 g01Var, boolean z10, boolean z11) {
        int i10;
        k01 k01Var;
        d01 d01Var;
        boolean z12;
        i01 i01Var = g01Var.f26543a;
        if (z10) {
            if (z11) {
                i10 = ((ViewGroup.MarginLayoutParams) i01Var).leftMargin;
            } else {
                i10 = ((ViewGroup.MarginLayoutParams) i01Var).rightMargin;
            }
        } else if (z11) {
            i10 = ((ViewGroup.MarginLayoutParams) i01Var).topMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) i01Var).bottomMargin;
        }
        if (i10 == Integer.MIN_VALUE) {
            if (!this.f28890f) {
                return 0;
            }
            if (z10) {
                k01Var = i01Var.f27121b;
            } else {
                k01Var = i01Var.f27120a;
            }
            if (z10) {
                d01Var = this.f28888c;
            } else {
                d01Var = this.d;
            }
            h01 h01Var = k01Var.f27799b;
            if (z10 && this.I) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != z11) {
                int i11 = h01Var.f26868a;
                return 0;
            }
            int i12 = h01Var.f26869b;
            d01Var.e();
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
        return this.f28888c.e();
    }

    public int getOrientation() {
        return this.f28889e;
    }

    public int getRenderHeight() {
        return this.E;
    }

    public int getRowCount() {
        return this.d.e();
    }

    public boolean getUseDefaultMargins() {
        return this.f28890f;
    }

    public final void h() {
        this.f28891n = 0;
        d01 d01Var = this.f28888c;
        d01Var.k();
        d01 d01Var2 = this.d;
        d01Var2.k();
        if (d01Var != null && d01Var2 != null) {
            d01Var.l();
            d01Var2.l();
        }
    }

    public final void i(int i10, boolean z10) {
        boolean z11;
        k01 k01Var;
        d01 d01Var;
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            g01 d = d(i14);
            i01 i01Var = d.f26543a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                if (this.f28887b == 2) {
                    i12 = ((int) (size / 2.0f)) - (this.v * 4);
                } else {
                    i12 = (int) (size / 1.5f);
                }
                d.e(this.O.createTextLayout(d.f26545c, i12));
                if (d.f26544b != null) {
                    ((ViewGroup.MarginLayoutParams) i01Var).height = Math.max(this.f28894w, d.f26547f + this.f28892r + this.f28893s);
                    int emojiOnlyCount = d.f26544b.getEmojiOnlyCount();
                    if (emojiOnlyCount > 0) {
                        i13 = ((ViewGroup.MarginLayoutParams) i01Var).height * emojiOnlyCount;
                    } else {
                        i13 = (this.v * 2) + d.f26546e;
                    }
                    ((ViewGroup.MarginLayoutParams) i01Var).width = i13;
                } else {
                    ((ViewGroup.MarginLayoutParams) i01Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) i01Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) i01Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) i01Var).height, true);
            } else {
                if (this.f28889e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    k01Var = i01Var.f27121b;
                } else {
                    k01Var = i01Var.f27120a;
                }
                if (k01.a(k01Var, z11) == U) {
                    h01 h01Var = k01Var.f27799b;
                    if (z11) {
                        d01Var = this.f28888c;
                    } else {
                        d01Var = this.d;
                    }
                    int[] g10 = d01Var.g();
                    int e7 = (g10[h01Var.f26869b] - g10[h01Var.f26868a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        f01 f01Var = d.f26544b;
                        if (f01Var != null) {
                            i11 = f01Var.getEmojiOnlyCount();
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            int max = Math.max(1, Math.round(e7 / i11));
                            ((ViewGroup.MarginLayoutParams) i01Var).height = max;
                            d.f26553m = max;
                        }
                        d.d(e(d, true, false) + e(d, true, true) + e7, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) i01Var).height, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) i01Var).width, e(d, false, false) + e(d, false, true) + e7, false);
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
        n01 n01Var = this;
        n01Var.c();
        d01 d01Var = n01Var.d;
        d01 d01Var2 = n01Var.f28888c;
        if (d01Var2 != null && d01Var != null) {
            d01Var2.l();
            d01Var.l();
        }
        n01Var.f28887b = 0;
        int childCount = n01Var.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            n01Var.f28887b = Math.max(n01Var.f28887b, n01Var.d(i17).f26543a.f27121b.f27799b.f26869b);
        }
        n01Var.i(i10, true);
        if (n01Var.f28889e == 0) {
            i12 = d01Var2.i(i10);
            if (n01Var.f28895x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                d01Var2.v.f27506a = i12;
                d01Var2.f25392w.f27506a = -i12;
                d01Var2.f25387q = false;
                d01Var2.g();
            }
            n01Var.i(i10, false);
            i13 = d01Var.i(i11);
        } else {
            int i18 = d01Var.i(i11);
            n01Var.i(i10, false);
            i12 = d01Var2.i(i10);
            i13 = i18;
        }
        int max = Math.max(i13, n01Var.getSuggestedMinimumHeight());
        n01Var.setMeasuredDimension(i12, max);
        d01Var2.v.f27506a = i12;
        d01Var2.f25392w.f27506a = -i12;
        d01Var2.f25387q = false;
        d01Var2.g();
        d01Var.v.f27506a = max;
        d01Var.f25392w.f27506a = -max;
        d01Var.f25387q = false;
        d01Var.g();
        int[] g10 = d01Var2.g();
        int[] g11 = d01Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = n01Var.J;
        arrayList.clear();
        int i19 = g10[g10.length - 1];
        int childCount2 = n01Var.getChildCount();
        int i20 = 0;
        while (i20 < childCount2) {
            int i21 = i20;
            g01 d = n01Var.d(i21);
            i01 i01Var = d.f26543a;
            k01 k01Var = i01Var.f27121b;
            k01 k01Var2 = i01Var.f27120a;
            h01 h01Var = k01Var.f27799b;
            h01 h01Var2 = k01Var2.f27799b;
            int i22 = childCount2;
            int i23 = g10[h01Var.f26868a];
            int i24 = g11[h01Var2.f26868a];
            int i25 = g10[h01Var.f26869b] - i23;
            int i26 = g11[h01Var2.f26869b] - i24;
            int i27 = d.f26551k;
            d01 d01Var3 = d01Var;
            int i28 = d.f26552l;
            zz0 a2 = k01.a(k01Var, true);
            zz0 a10 = k01.a(k01Var2, false);
            la.h f7 = d01Var2.f();
            e01 e01Var = (e01) ((Object[]) f7.d)[((int[]) f7.f15465b)[i21]];
            la.h f10 = d01Var3.f();
            d01 d01Var4 = d01Var2;
            e01 e01Var2 = (e01) ((Object[]) f10.d)[((int[]) f10.f15465b)[i21]];
            int b10 = a2.b(d, i25 - e01Var.d(true));
            int b11 = a10.b(d, i26 - e01Var2.d(true));
            int e7 = n01Var.e(d, true, true);
            int e10 = n01Var.e(d, false, true);
            int e11 = n01Var.e(d, true, false);
            int i29 = e7 + e11;
            int e12 = e10 + n01Var.e(d, false, false);
            int a11 = e01Var.a(n01Var, d, a2, i27 + i29, true);
            n01Var = this;
            int a12 = e01Var2.a(n01Var, d, a10, i28 + e12, false);
            int c10 = a2.c(i27, i25 - i29);
            int c11 = a10.c(i28, i26 - e12);
            int i30 = i23 + b10 + a11;
            if (!n01Var.I) {
                i15 = e7 + i30;
            } else {
                i15 = ((i19 - c10) - e11) - i30;
            }
            int i31 = i15;
            int i32 = i24 + b11 + a12 + e10;
            if (d.f26545c != null) {
                if (c10 != d.f26551k || c11 != d.f26552l) {
                    i16 = 0;
                    d.d(c10, c11, false);
                } else {
                    i16 = 0;
                }
                int i33 = d.f26553m;
                if (i33 != 0 && i33 != c11) {
                    h01 h01Var3 = d.f26543a.f27120a.f27799b;
                    if (h01Var3.f26869b - h01Var3.f26868a <= 1) {
                        ArrayList arrayList2 = n01Var.K;
                        int size = arrayList2.size();
                        int i34 = i16;
                        while (true) {
                            if (i34 < size) {
                                PointF pointF = (PointF) arrayList2.get(i34);
                                float f11 = pointF.x;
                                float f12 = d.f26543a.f27120a.f27799b.f26868a;
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
            d.f26556p = i31;
            d.f26557q = i32;
            i20 = i21 + 1;
            d01Var = d01Var3;
            childCount2 = i22;
            d01Var2 = d01Var4;
        }
        int size2 = arrayList.size();
        int i35 = 0;
        while (i35 < size2) {
            g01 g01Var = (g01) arrayList.get(i35);
            int i36 = g01Var.f26552l;
            int i37 = g01Var.d;
            int i38 = i36 - g01Var.f26553m;
            ArrayList arrayList3 = n01Var.P;
            int size3 = arrayList3.size();
            for (int i39 = i37 + 1; i39 < size3; i39++) {
                g01 g01Var2 = (g01) arrayList3.get(i39);
                if (g01Var.f26543a.f27120a.f27799b.f26868a != g01Var2.f26543a.f27120a.f27799b.f26868a) {
                    break;
                }
                int i40 = g01Var.f26553m;
                int i41 = g01Var2.f26553m;
                if (i40 < i41) {
                    z10 = true;
                    break;
                }
                int i42 = g01Var2.f26552l - i41;
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
                    g01 g01Var3 = (g01) arrayList3.get(i43);
                    if (g01Var.f26543a.f27120a.f27799b.f26868a != g01Var3.f26543a.f27120a.f27799b.f26868a) {
                        break;
                    }
                    int i44 = g01Var.f26553m;
                    int i45 = g01Var3.f26553m;
                    if (i44 < i45) {
                        z10 = true;
                        break;
                    }
                    int i46 = g01Var3.f26552l - i45;
                    if (i46 > 0) {
                        i38 = Math.min(i38, i46);
                    }
                    i43--;
                }
            }
            if (!z10) {
                g01Var.f26552l = g01Var.f26553m;
                g01Var.g();
                max -= i38;
                int i47 = g01Var.f26543a.f27120a.f27799b.f26868a;
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
                    g01 g01Var4 = (g01) arrayList3.get(i50);
                    if (g01Var == g01Var4) {
                        i14 = i50;
                    } else {
                        int i51 = g01Var.f26543a.f27120a.f27799b.f26868a;
                        int i52 = g01Var4.f26543a.f27120a.f27799b.f26868a;
                        if (i51 == i52) {
                            if (g01Var4.f26553m != g01Var4.f26552l) {
                                arrayList.remove(g01Var4);
                                if (g01Var4.d < i37) {
                                    i49--;
                                }
                                i48--;
                            }
                            int i53 = g01Var4.f26552l - i38;
                            g01Var4.f26552l = i53;
                            i14 = i50;
                            g01Var4.d(g01Var4.f26551k, i53, true);
                        } else {
                            i14 = i50;
                            if (i51 < i52) {
                                g01Var4.f26557q -= i38;
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
        int childCount3 = n01Var.getChildCount();
        for (int i54 = 0; i54 < childCount3; i54++) {
            g01 d10 = n01Var.d(i54);
            n01Var.O.onLayoutChild(d10.f26544b, d10.b(), d10.c());
            d10.f26554n = d10.f26556p;
            d10.f26555o = d10.f26551k;
        }
        n01Var.f28896y = i19;
        n01Var.E = max;
        n01Var.F = copyOf;
        n01Var.setMeasuredDimension(i19, max);
    }

    @Override
    public final void requestLayout() {
        d01 d01Var;
        super.requestLayout();
        d01 d01Var2 = this.f28888c;
        if (d01Var2 != null && (d01Var = this.d) != null) {
            d01Var2.l();
            d01Var.l();
        }
    }

    public void setAlignmentMode(int i10) {
        this.h = i10;
        requestLayout();
    }

    public void setColumnCount(int i10) {
        this.f28888c.n(i10);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        d01 d01Var = this.f28888c;
        d01Var.f25391u = z10;
        d01Var.k();
        h();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.G = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.f28895x == z10) {
            return;
        }
        this.f28895x = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i10) {
        this.f28894w = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        if (this.f28889e != i10) {
            this.f28889e = i10;
            h();
            requestLayout();
        }
    }

    public void setRenderWidth(int i10) {
        int i11;
        int i12;
        int measuredWidth = getMeasuredWidth();
        this.f28896y = Math.max(measuredWidth, i10);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            g01 d = d(i13);
            if (measuredWidth > 0 && (i12 = this.f28896y) != measuredWidth) {
                float f7 = measuredWidth;
                int round = Math.round((d.f26554n * i12) / f7);
                int round2 = Math.round(((d.f26554n + d.f26555o) * this.f28896y) / f7);
                d.f26556p = round;
                d.f26551k = Math.max(0, round2 - round);
                if (d.f26545c != null && d.f26544b != null) {
                    d.f();
                }
            } else {
                int i14 = d.f26554n;
                d.f26556p = i14;
                d.f26551k = Math.max(0, (d.f26555o + i14) - i14);
                if (d.f26545c != null && d.f26544b != null) {
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
                g01 d10 = d(i18);
                f01 f01Var = d10.f26544b;
                if (f01Var != null) {
                    i11 = f01Var.getEmojiOnlyCount();
                } else {
                    i11 = 0;
                }
                if (i11 > 0) {
                    h01 h01Var = d10.f26543a.f27120a.f27799b;
                    int max = Math.max(0, h01Var.f26868a);
                    int min = Math.min(i15, h01Var.f26869b);
                    if (max < min) {
                        int i19 = 0;
                        for (int i20 = max; i20 < min; i20++) {
                            i19 += iArr2[i20];
                        }
                        int max2 = Math.max(1, Math.round(d10.f26551k / i11)) - i19;
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
                g01 d11 = d(i25);
                h01 h01Var2 = d11.f26543a.f27120a.f27799b;
                int max3 = Math.max(0, Math.min(i15, h01Var2.f26868a));
                int max4 = Math.max(max3, Math.min(i15, h01Var2.f26869b));
                int i26 = iArr4[max3];
                int i27 = iArr4[max4];
                d11.f26557q = i26;
                d11.f26552l = Math.max(0, i27 - i26);
                if (d11.f26545c != null) {
                    d11.g();
                }
                this.O.onLayoutChild(d11.f26544b, d11.b(), d11.c());
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
        d01 d01Var = this.d;
        d01Var.f25391u = z10;
        d01Var.k();
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
        this.f28890f = z10;
        requestLayout();
    }
}
