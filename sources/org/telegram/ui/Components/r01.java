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
public final class r01 extends View {
    public static final d01 R = new d01(0);
    public static final d01 S = new d01(1);
    public static final d01 T = new d01(3);
    public static final d01 U = new d01(4);
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
    public final q01 O;
    public final ArrayList P;
    public final p01 Q;
    public final org.telegram.ui.Cells.o9 f29963a;
    public int f29964b;
    public final h01 f29965c;
    public final h01 d;
    public int f29966e;
    public boolean f29967f;
    public int h;
    public int f29968n;
    public int f29969r;
    public int f29970s;
    public int v;
    public int f29971w;
    public boolean f29972x;
    public int f29973y;

    public r01(Context context, q01 q01Var, org.telegram.ui.Cells.o9 o9Var) {
        super(context);
        this.f29965c = new h01(this, true);
        this.d = new h01(this, false);
        this.f29966e = 0;
        this.f29967f = false;
        this.h = 1;
        this.f29968n = 0;
        this.f29969r = AndroidUtilities.dp(8.0f);
        this.f29970s = AndroidUtilities.dp(9.0f);
        this.v = AndroidUtilities.dp(12.0f);
        this.f29972x = true;
        this.F = new int[0];
        this.J = new ArrayList();
        this.K = new ArrayList();
        new Path();
        this.L = new Path();
        this.M = new RectF();
        this.N = new float[8];
        this.P = new ArrayList();
        this.f29963a = o9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.O = q01Var;
        p01 p01Var = new p01(this, this);
        this.Q = p01Var;
        r0.i0.j(this, p01Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(sc.v.v(str, ". "));
    }

    public static void j(m01 m01Var, int i10, int i11, int i12, int i13) {
        l01 l01Var = new l01(i10, i11 + i10);
        o01 o01Var = m01Var.f28334a;
        m01Var.f28334a = new o01(o01Var.f29017a, l01Var, o01Var.f29019c, o01Var.d);
        l01 l01Var2 = new l01(i12, i13 + i12);
        o01 o01Var2 = m01Var.f28335b;
        m01Var.f28335b = new o01(o01Var2.f29017a, l01Var2, o01Var2.f29019c, o01Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        k01 k01Var = new k01(this, arrayList.size());
        m01 m01Var = new m01();
        l01 l01Var = new l01(i11, i13 + i11);
        d01 d01Var = U;
        m01Var.f28334a = new o01(false, l01Var, d01Var, 0.0f);
        m01Var.f28335b = new o01(false, new l01(i10, i12 + i10), d01Var, 0.0f);
        k01Var.f27694a = m01Var;
        k01Var.f27701j = i11;
        arrayList.add(k01Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        int i13;
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        k01 k01Var = new k01(this, arrayList.size());
        k01Var.f27696c = pagetablecell;
        m01 m01Var = new m01();
        int i14 = pagetablecell.rowspan;
        if (i14 == 0) {
            i14 = 1;
        }
        l01 l01Var = new l01(i11, i14 + i11);
        d01 d01Var = U;
        m01Var.f28334a = new o01(false, l01Var, d01Var, 0.0f);
        m01Var.f28335b = new o01(false, new l01(i10, i12 + i10), d01Var, 1.0f);
        k01Var.f27694a = m01Var;
        k01Var.f27701j = i11;
        arrayList.add(k01Var);
        if (pagetablecell.rowspan > 1) {
            this.K.add(new PointF(i11, i11 + i13));
        }
        h();
    }

    public final void c() {
        boolean z10;
        h01 h01Var;
        o01 o01Var;
        o01 o01Var2;
        Throwable th2;
        int i10;
        int i11 = this.f29968n;
        if (i11 == 0) {
            if (this.f29966e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                h01Var = this.f29965c;
            } else {
                h01Var = this.d;
            }
            int i12 = h01Var.f26581b;
            if (i12 == Integer.MIN_VALUE) {
                i12 = 0;
            }
            if (i12 >= 0 && i12 <= 1024) {
                int[] iArr = new int[i12];
                int childCount = getChildCount();
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    m01 m01Var = d(i15).f27694a;
                    if (z10) {
                        o01Var = m01Var.f28334a;
                    } else {
                        o01Var = m01Var.f28335b;
                    }
                    l01 l01Var = o01Var.f29018b;
                    boolean z11 = o01Var.f29017a;
                    int a2 = l01Var.a();
                    if (a2 > 0 && a2 <= 1024) {
                        if (z11) {
                            i13 = l01Var.f27969a;
                        }
                        if (z10) {
                            o01Var2 = m01Var.f28335b;
                        } else {
                            o01Var2 = m01Var.f28334a;
                        }
                        l01 l01Var2 = o01Var2.f29018b;
                        int a10 = l01Var2.a();
                        int i16 = l01Var2.f27969a;
                        if (a10 > 0) {
                            th2 = null;
                            if (l01Var2.a() <= 1024) {
                                boolean z12 = o01Var2.f29017a;
                                int a11 = l01Var2.a();
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
                                    j(m01Var, i13, a2, i14, a11);
                                } else {
                                    j(m01Var, i14, a11, i13, a2);
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
                    i19 = (i19 * 31) + d(i20).f27694a.hashCode();
                }
                this.f29968n = i19;
                return;
            }
            g("Table grid count out of bounds");
            throw null;
        }
        int childCount3 = getChildCount();
        int i21 = 1;
        for (int i22 = 0; i22 < childCount3; i22++) {
            i21 = (i21 * 31) + d(i22).f27694a.hashCode();
        }
        if (i11 != i21) {
            h();
            c();
        }
    }

    public final k01 d(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                return (k01) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        p01 p01Var = this.Q;
        if (p01Var != null && p01Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(k01 k01Var, boolean z10, boolean z11) {
        h01 h01Var;
        int[] iArr;
        o01 o01Var;
        int i10;
        if (this.h == 1) {
            return f(k01Var, z10, z11);
        }
        if (z10) {
            h01Var = this.f29965c;
        } else {
            h01Var = this.d;
        }
        if (z11) {
            if (h01Var.f26587j == null) {
                h01Var.f26587j = new int[h01Var.e() + 1];
            }
            if (!h01Var.f26588k) {
                h01Var.b(true);
                h01Var.f26588k = true;
            }
            iArr = h01Var.f26587j;
        } else {
            if (h01Var.f26589l == null) {
                h01Var.f26589l = new int[h01Var.e() + 1];
            }
            if (!h01Var.f26590m) {
                h01Var.b(false);
                h01Var.f26590m = true;
            }
            iArr = h01Var.f26589l;
        }
        m01 m01Var = k01Var.f27694a;
        if (z10) {
            o01Var = m01Var.f28335b;
        } else {
            o01Var = m01Var.f28334a;
        }
        l01 l01Var = o01Var.f29018b;
        if (z11) {
            i10 = l01Var.f27969a;
        } else {
            i10 = l01Var.f27970b;
        }
        return iArr[i10];
    }

    public final int f(k01 k01Var, boolean z10, boolean z11) {
        int i10;
        o01 o01Var;
        h01 h01Var;
        boolean z12;
        m01 m01Var = k01Var.f27694a;
        if (z10) {
            if (z11) {
                i10 = ((ViewGroup.MarginLayoutParams) m01Var).leftMargin;
            } else {
                i10 = ((ViewGroup.MarginLayoutParams) m01Var).rightMargin;
            }
        } else if (z11) {
            i10 = ((ViewGroup.MarginLayoutParams) m01Var).topMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) m01Var).bottomMargin;
        }
        if (i10 == Integer.MIN_VALUE) {
            if (!this.f29967f) {
                return 0;
            }
            if (z10) {
                o01Var = m01Var.f28335b;
            } else {
                o01Var = m01Var.f28334a;
            }
            if (z10) {
                h01Var = this.f29965c;
            } else {
                h01Var = this.d;
            }
            l01 l01Var = o01Var.f29018b;
            if (z10 && this.I) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != z11) {
                int i11 = l01Var.f27969a;
                return 0;
            }
            int i12 = l01Var.f27970b;
            h01Var.e();
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
        return this.f29965c.e();
    }

    public int getOrientation() {
        return this.f29966e;
    }

    public int getRenderHeight() {
        return this.E;
    }

    public int getRowCount() {
        return this.d.e();
    }

    public boolean getUseDefaultMargins() {
        return this.f29967f;
    }

    public final void h() {
        this.f29968n = 0;
        h01 h01Var = this.f29965c;
        h01Var.k();
        h01 h01Var2 = this.d;
        h01Var2.k();
        if (h01Var != null && h01Var2 != null) {
            h01Var.l();
            h01Var2.l();
        }
    }

    public final void i(int i10, boolean z10) {
        boolean z11;
        o01 o01Var;
        h01 h01Var;
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            k01 d = d(i14);
            m01 m01Var = d.f27694a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                if (this.f29964b == 2) {
                    i12 = ((int) (size / 2.0f)) - (this.v * 4);
                } else {
                    i12 = (int) (size / 1.5f);
                }
                d.e(this.O.createTextLayout(d.f27696c, i12));
                if (d.f27695b != null) {
                    ((ViewGroup.MarginLayoutParams) m01Var).height = Math.max(this.f29971w, d.f27698f + this.f29969r + this.f29970s);
                    int emojiOnlyCount = d.f27695b.getEmojiOnlyCount();
                    if (emojiOnlyCount > 0) {
                        i13 = ((ViewGroup.MarginLayoutParams) m01Var).height * emojiOnlyCount;
                    } else {
                        i13 = (this.v * 2) + d.f27697e;
                    }
                    ((ViewGroup.MarginLayoutParams) m01Var).width = i13;
                } else {
                    ((ViewGroup.MarginLayoutParams) m01Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) m01Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) m01Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) m01Var).height, true);
            } else {
                if (this.f29966e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    o01Var = m01Var.f28335b;
                } else {
                    o01Var = m01Var.f28334a;
                }
                if (o01.a(o01Var, z11) == U) {
                    l01 l01Var = o01Var.f29018b;
                    if (z11) {
                        h01Var = this.f29965c;
                    } else {
                        h01Var = this.d;
                    }
                    int[] g10 = h01Var.g();
                    int e7 = (g10[l01Var.f27970b] - g10[l01Var.f27969a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        j01 j01Var = d.f27695b;
                        if (j01Var != null) {
                            i11 = j01Var.getEmojiOnlyCount();
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            int max = Math.max(1, Math.round(e7 / i11));
                            ((ViewGroup.MarginLayoutParams) m01Var).height = max;
                            d.f27704m = max;
                        }
                        d.d(e(d, true, false) + e(d, true, true) + e7, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) m01Var).height, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) m01Var).width, e(d, false, false) + e(d, false, true) + e7, false);
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
        r01 r01Var = this;
        r01Var.c();
        h01 h01Var = r01Var.d;
        h01 h01Var2 = r01Var.f29965c;
        if (h01Var2 != null && h01Var != null) {
            h01Var2.l();
            h01Var.l();
        }
        r01Var.f29964b = 0;
        int childCount = r01Var.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            r01Var.f29964b = Math.max(r01Var.f29964b, r01Var.d(i17).f27694a.f28335b.f29018b.f27970b);
        }
        r01Var.i(i10, true);
        if (r01Var.f29966e == 0) {
            i12 = h01Var2.i(i10);
            if (r01Var.f29972x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                h01Var2.v.f28696a = i12;
                h01Var2.f26599w.f28696a = -i12;
                h01Var2.f26594q = false;
                h01Var2.g();
            }
            r01Var.i(i10, false);
            i13 = h01Var.i(i11);
        } else {
            int i18 = h01Var.i(i11);
            r01Var.i(i10, false);
            i12 = h01Var2.i(i10);
            i13 = i18;
        }
        int max = Math.max(i13, r01Var.getSuggestedMinimumHeight());
        r01Var.setMeasuredDimension(i12, max);
        h01Var2.v.f28696a = i12;
        h01Var2.f26599w.f28696a = -i12;
        h01Var2.f26594q = false;
        h01Var2.g();
        h01Var.v.f28696a = max;
        h01Var.f26599w.f28696a = -max;
        h01Var.f26594q = false;
        h01Var.g();
        int[] g10 = h01Var2.g();
        int[] g11 = h01Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = r01Var.J;
        arrayList.clear();
        int i19 = g10[g10.length - 1];
        int childCount2 = r01Var.getChildCount();
        int i20 = 0;
        while (i20 < childCount2) {
            int i21 = i20;
            k01 d = r01Var.d(i21);
            m01 m01Var = d.f27694a;
            o01 o01Var = m01Var.f28335b;
            o01 o01Var2 = m01Var.f28334a;
            l01 l01Var = o01Var.f29018b;
            l01 l01Var2 = o01Var2.f29018b;
            int i22 = childCount2;
            int i23 = g10[l01Var.f27969a];
            int i24 = g11[l01Var2.f27969a];
            int i25 = g10[l01Var.f27970b] - i23;
            int i26 = g11[l01Var2.f27970b] - i24;
            int i27 = d.f27702k;
            h01 h01Var3 = h01Var;
            int i28 = d.f27703l;
            d01 a2 = o01.a(o01Var, true);
            d01 a10 = o01.a(o01Var2, false);
            m.f3 f7 = h01Var2.f();
            i01 i01Var = (i01) ((Object[]) f7.d)[((int[]) f7.f15424b)[i21]];
            m.f3 f10 = h01Var3.f();
            h01 h01Var4 = h01Var2;
            i01 i01Var2 = (i01) ((Object[]) f10.d)[((int[]) f10.f15424b)[i21]];
            int b10 = a2.b(d, i25 - i01Var.d(true));
            int b11 = a10.b(d, i26 - i01Var2.d(true));
            int e7 = r01Var.e(d, true, true);
            int e10 = r01Var.e(d, false, true);
            int e11 = r01Var.e(d, true, false);
            int i29 = e7 + e11;
            int e12 = e10 + r01Var.e(d, false, false);
            int a11 = i01Var.a(r01Var, d, a2, i27 + i29, true);
            r01Var = this;
            int a12 = i01Var2.a(r01Var, d, a10, i28 + e12, false);
            int c10 = a2.c(i27, i25 - i29);
            int c11 = a10.c(i28, i26 - e12);
            int i30 = i23 + b10 + a11;
            if (!r01Var.I) {
                i15 = e7 + i30;
            } else {
                i15 = ((i19 - c10) - e11) - i30;
            }
            int i31 = i15;
            int i32 = i24 + b11 + a12 + e10;
            if (d.f27696c != null) {
                if (c10 != d.f27702k || c11 != d.f27703l) {
                    i16 = 0;
                    d.d(c10, c11, false);
                } else {
                    i16 = 0;
                }
                int i33 = d.f27704m;
                if (i33 != 0 && i33 != c11) {
                    l01 l01Var3 = d.f27694a.f28334a.f29018b;
                    if (l01Var3.f27970b - l01Var3.f27969a <= 1) {
                        ArrayList arrayList2 = r01Var.K;
                        int size = arrayList2.size();
                        int i34 = i16;
                        while (true) {
                            if (i34 < size) {
                                PointF pointF = (PointF) arrayList2.get(i34);
                                float f11 = pointF.x;
                                float f12 = d.f27694a.f28334a.f29018b.f27969a;
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
            d.f27707p = i31;
            d.f27708q = i32;
            i20 = i21 + 1;
            h01Var = h01Var3;
            childCount2 = i22;
            h01Var2 = h01Var4;
        }
        int size2 = arrayList.size();
        int i35 = 0;
        while (i35 < size2) {
            k01 k01Var = (k01) arrayList.get(i35);
            int i36 = k01Var.f27703l;
            int i37 = k01Var.d;
            int i38 = i36 - k01Var.f27704m;
            ArrayList arrayList3 = r01Var.P;
            int size3 = arrayList3.size();
            for (int i39 = i37 + 1; i39 < size3; i39++) {
                k01 k01Var2 = (k01) arrayList3.get(i39);
                if (k01Var.f27694a.f28334a.f29018b.f27969a != k01Var2.f27694a.f28334a.f29018b.f27969a) {
                    break;
                }
                int i40 = k01Var.f27704m;
                int i41 = k01Var2.f27704m;
                if (i40 < i41) {
                    z10 = true;
                    break;
                }
                int i42 = k01Var2.f27703l - i41;
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
                    k01 k01Var3 = (k01) arrayList3.get(i43);
                    if (k01Var.f27694a.f28334a.f29018b.f27969a != k01Var3.f27694a.f28334a.f29018b.f27969a) {
                        break;
                    }
                    int i44 = k01Var.f27704m;
                    int i45 = k01Var3.f27704m;
                    if (i44 < i45) {
                        z10 = true;
                        break;
                    }
                    int i46 = k01Var3.f27703l - i45;
                    if (i46 > 0) {
                        i38 = Math.min(i38, i46);
                    }
                    i43--;
                }
            }
            if (!z10) {
                k01Var.f27703l = k01Var.f27704m;
                k01Var.g();
                max -= i38;
                int i47 = k01Var.f27694a.f28334a.f29018b.f27969a;
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
                    k01 k01Var4 = (k01) arrayList3.get(i50);
                    if (k01Var == k01Var4) {
                        i14 = i50;
                    } else {
                        int i51 = k01Var.f27694a.f28334a.f29018b.f27969a;
                        int i52 = k01Var4.f27694a.f28334a.f29018b.f27969a;
                        if (i51 == i52) {
                            if (k01Var4.f27704m != k01Var4.f27703l) {
                                arrayList.remove(k01Var4);
                                if (k01Var4.d < i37) {
                                    i49--;
                                }
                                i48--;
                            }
                            int i53 = k01Var4.f27703l - i38;
                            k01Var4.f27703l = i53;
                            i14 = i50;
                            k01Var4.d(k01Var4.f27702k, i53, true);
                        } else {
                            i14 = i50;
                            if (i51 < i52) {
                                k01Var4.f27708q -= i38;
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
        int childCount3 = r01Var.getChildCount();
        for (int i54 = 0; i54 < childCount3; i54++) {
            k01 d10 = r01Var.d(i54);
            r01Var.O.onLayoutChild(d10.f27695b, d10.b(), d10.c());
            d10.f27705n = d10.f27707p;
            d10.f27706o = d10.f27702k;
        }
        r01Var.f29973y = i19;
        r01Var.E = max;
        r01Var.F = copyOf;
        r01Var.setMeasuredDimension(i19, max);
    }

    @Override
    public final void requestLayout() {
        h01 h01Var;
        super.requestLayout();
        h01 h01Var2 = this.f29965c;
        if (h01Var2 != null && (h01Var = this.d) != null) {
            h01Var2.l();
            h01Var.l();
        }
    }

    public void setAlignmentMode(int i10) {
        this.h = i10;
        requestLayout();
    }

    public void setColumnCount(int i10) {
        this.f29965c.n(i10);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        h01 h01Var = this.f29965c;
        h01Var.f26598u = z10;
        h01Var.k();
        h();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.G = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.f29972x == z10) {
            return;
        }
        this.f29972x = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i10) {
        this.f29971w = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        if (this.f29966e != i10) {
            this.f29966e = i10;
            h();
            requestLayout();
        }
    }

    public void setRenderWidth(int i10) {
        int i11;
        int i12;
        int measuredWidth = getMeasuredWidth();
        this.f29973y = Math.max(measuredWidth, i10);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            k01 d = d(i13);
            if (measuredWidth > 0 && (i12 = this.f29973y) != measuredWidth) {
                float f7 = measuredWidth;
                int round = Math.round((d.f27705n * i12) / f7);
                int round2 = Math.round(((d.f27705n + d.f27706o) * this.f29973y) / f7);
                d.f27707p = round;
                d.f27702k = Math.max(0, round2 - round);
                if (d.f27696c != null && d.f27695b != null) {
                    d.f();
                }
            } else {
                int i14 = d.f27705n;
                d.f27707p = i14;
                d.f27702k = Math.max(0, (d.f27706o + i14) - i14);
                if (d.f27696c != null && d.f27695b != null) {
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
                k01 d10 = d(i18);
                j01 j01Var = d10.f27695b;
                if (j01Var != null) {
                    i11 = j01Var.getEmojiOnlyCount();
                } else {
                    i11 = 0;
                }
                if (i11 > 0) {
                    l01 l01Var = d10.f27694a.f28334a.f29018b;
                    int max = Math.max(0, l01Var.f27969a);
                    int min = Math.min(i15, l01Var.f27970b);
                    if (max < min) {
                        int i19 = 0;
                        for (int i20 = max; i20 < min; i20++) {
                            i19 += iArr2[i20];
                        }
                        int max2 = Math.max(1, Math.round(d10.f27702k / i11)) - i19;
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
                k01 d11 = d(i25);
                l01 l01Var2 = d11.f27694a.f28334a.f29018b;
                int max3 = Math.max(0, Math.min(i15, l01Var2.f27969a));
                int max4 = Math.max(max3, Math.min(i15, l01Var2.f27970b));
                int i26 = iArr4[max3];
                int i27 = iArr4[max4];
                d11.f27708q = i26;
                d11.f27703l = Math.max(0, i27 - i26);
                if (d11.f27696c != null) {
                    d11.g();
                }
                this.O.onLayoutChild(d11.f27695b, d11.b(), d11.c());
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
        h01 h01Var = this.d;
        h01Var.f26598u = z10;
        h01Var.k();
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
        this.f29967f = z10;
        requestLayout();
    }
}
