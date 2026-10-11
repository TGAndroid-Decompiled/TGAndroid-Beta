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
public final class m01 extends View {
    public static final yz0 R = new yz0(0);
    public static final yz0 S = new yz0(1);
    public static final yz0 T = new yz0(3);
    public static final yz0 U = new yz0(4);
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
    public final l01 O;
    public final ArrayList P;
    public final k01 Q;
    public final org.telegram.ui.Cells.o9 f28656a;
    public int f28657b;
    public final c01 f28658c;
    public final c01 d;
    public int f28659e;
    public boolean f28660f;
    public int h;
    public int f28661n;
    public int f28662r;
    public int f28663s;
    public int v;
    public int f28664w;
    public boolean f28665x;
    public int f28666y;

    public m01(Context context, l01 l01Var, org.telegram.ui.Cells.o9 o9Var) {
        super(context);
        this.f28658c = new c01(this, true);
        this.d = new c01(this, false);
        this.f28659e = 0;
        this.f28660f = false;
        this.h = 1;
        this.f28661n = 0;
        this.f28662r = AndroidUtilities.dp(8.0f);
        this.f28663s = AndroidUtilities.dp(9.0f);
        this.v = AndroidUtilities.dp(12.0f);
        this.f28665x = true;
        this.F = new int[0];
        this.J = new ArrayList();
        this.K = new ArrayList();
        new Path();
        this.L = new Path();
        this.M = new RectF();
        this.N = new float[8];
        this.P = new ArrayList();
        this.f28656a = o9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.O = l01Var;
        k01 k01Var = new k01(this, this);
        this.Q = k01Var;
        r0.i0.j(this, k01Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(sc.v.v(str, ". "));
    }

    public static void j(h01 h01Var, int i10, int i11, int i12, int i13) {
        g01 g01Var = new g01(i10, i11 + i10);
        j01 j01Var = h01Var.f26921a;
        h01Var.f26921a = new j01(j01Var.f27548a, g01Var, j01Var.f27550c, j01Var.d);
        g01 g01Var2 = new g01(i12, i13 + i12);
        j01 j01Var2 = h01Var.f26922b;
        h01Var.f26922b = new j01(j01Var2.f27548a, g01Var2, j01Var2.f27550c, j01Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        f01 f01Var = new f01(this, arrayList.size());
        h01 h01Var = new h01();
        g01 g01Var = new g01(i11, i13 + i11);
        yz0 yz0Var = U;
        h01Var.f26921a = new j01(false, g01Var, yz0Var, 0.0f);
        h01Var.f26922b = new j01(false, new g01(i10, i12 + i10), yz0Var, 0.0f);
        f01Var.f26261a = h01Var;
        f01Var.f26268j = i11;
        arrayList.add(f01Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        int i13;
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        f01 f01Var = new f01(this, arrayList.size());
        f01Var.f26263c = pagetablecell;
        h01 h01Var = new h01();
        int i14 = pagetablecell.rowspan;
        if (i14 == 0) {
            i14 = 1;
        }
        g01 g01Var = new g01(i11, i14 + i11);
        yz0 yz0Var = U;
        h01Var.f26921a = new j01(false, g01Var, yz0Var, 0.0f);
        h01Var.f26922b = new j01(false, new g01(i10, i12 + i10), yz0Var, 1.0f);
        f01Var.f26261a = h01Var;
        f01Var.f26268j = i11;
        arrayList.add(f01Var);
        if (pagetablecell.rowspan > 1) {
            this.K.add(new PointF(i11, i11 + i13));
        }
        h();
    }

    public final void c() {
        boolean z10;
        c01 c01Var;
        j01 j01Var;
        j01 j01Var2;
        Throwable th2;
        int i10;
        int i11 = this.f28661n;
        if (i11 == 0) {
            if (this.f28659e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                c01Var = this.f28658c;
            } else {
                c01Var = this.d;
            }
            int i12 = c01Var.f25142b;
            if (i12 == Integer.MIN_VALUE) {
                i12 = 0;
            }
            if (i12 >= 0 && i12 <= 1024) {
                int[] iArr = new int[i12];
                int childCount = getChildCount();
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    h01 h01Var = d(i15).f26261a;
                    if (z10) {
                        j01Var = h01Var.f26921a;
                    } else {
                        j01Var = h01Var.f26922b;
                    }
                    g01 g01Var = j01Var.f27549b;
                    boolean z11 = j01Var.f27548a;
                    int a2 = g01Var.a();
                    if (a2 > 0 && a2 <= 1024) {
                        if (z11) {
                            i13 = g01Var.f26615a;
                        }
                        if (z10) {
                            j01Var2 = h01Var.f26922b;
                        } else {
                            j01Var2 = h01Var.f26921a;
                        }
                        g01 g01Var2 = j01Var2.f27549b;
                        int a10 = g01Var2.a();
                        int i16 = g01Var2.f26615a;
                        if (a10 > 0) {
                            th2 = null;
                            if (g01Var2.a() <= 1024) {
                                boolean z12 = j01Var2.f27548a;
                                int a11 = g01Var2.a();
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
                                    j(h01Var, i13, a2, i14, a11);
                                } else {
                                    j(h01Var, i14, a11, i13, a2);
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
                    i19 = (i19 * 31) + d(i20).f26261a.hashCode();
                }
                this.f28661n = i19;
                return;
            }
            g("Table grid count out of bounds");
            throw null;
        }
        int childCount3 = getChildCount();
        int i21 = 1;
        for (int i22 = 0; i22 < childCount3; i22++) {
            i21 = (i21 * 31) + d(i22).f26261a.hashCode();
        }
        if (i11 != i21) {
            h();
            c();
        }
    }

    public final f01 d(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                return (f01) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        k01 k01Var = this.Q;
        if (k01Var != null && k01Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(f01 f01Var, boolean z10, boolean z11) {
        c01 c01Var;
        int[] iArr;
        j01 j01Var;
        int i10;
        if (this.h == 1) {
            return f(f01Var, z10, z11);
        }
        if (z10) {
            c01Var = this.f28658c;
        } else {
            c01Var = this.d;
        }
        if (z11) {
            if (c01Var.f25148j == null) {
                c01Var.f25148j = new int[c01Var.e() + 1];
            }
            if (!c01Var.f25149k) {
                c01Var.b(true);
                c01Var.f25149k = true;
            }
            iArr = c01Var.f25148j;
        } else {
            if (c01Var.f25150l == null) {
                c01Var.f25150l = new int[c01Var.e() + 1];
            }
            if (!c01Var.f25151m) {
                c01Var.b(false);
                c01Var.f25151m = true;
            }
            iArr = c01Var.f25150l;
        }
        h01 h01Var = f01Var.f26261a;
        if (z10) {
            j01Var = h01Var.f26922b;
        } else {
            j01Var = h01Var.f26921a;
        }
        g01 g01Var = j01Var.f27549b;
        if (z11) {
            i10 = g01Var.f26615a;
        } else {
            i10 = g01Var.f26616b;
        }
        return iArr[i10];
    }

    public final int f(f01 f01Var, boolean z10, boolean z11) {
        int i10;
        j01 j01Var;
        c01 c01Var;
        boolean z12;
        h01 h01Var = f01Var.f26261a;
        if (z10) {
            if (z11) {
                i10 = ((ViewGroup.MarginLayoutParams) h01Var).leftMargin;
            } else {
                i10 = ((ViewGroup.MarginLayoutParams) h01Var).rightMargin;
            }
        } else if (z11) {
            i10 = ((ViewGroup.MarginLayoutParams) h01Var).topMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) h01Var).bottomMargin;
        }
        if (i10 == Integer.MIN_VALUE) {
            if (!this.f28660f) {
                return 0;
            }
            if (z10) {
                j01Var = h01Var.f26922b;
            } else {
                j01Var = h01Var.f26921a;
            }
            if (z10) {
                c01Var = this.f28658c;
            } else {
                c01Var = this.d;
            }
            g01 g01Var = j01Var.f27549b;
            if (z10 && this.I) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != z11) {
                int i11 = g01Var.f26615a;
                return 0;
            }
            int i12 = g01Var.f26616b;
            c01Var.e();
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
        return this.f28658c.e();
    }

    public int getOrientation() {
        return this.f28659e;
    }

    public int getRenderHeight() {
        return this.E;
    }

    public int getRowCount() {
        return this.d.e();
    }

    public boolean getUseDefaultMargins() {
        return this.f28660f;
    }

    public final void h() {
        this.f28661n = 0;
        c01 c01Var = this.f28658c;
        c01Var.k();
        c01 c01Var2 = this.d;
        c01Var2.k();
        if (c01Var != null && c01Var2 != null) {
            c01Var.l();
            c01Var2.l();
        }
    }

    public final void i(int i10, boolean z10) {
        boolean z11;
        j01 j01Var;
        c01 c01Var;
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            f01 d = d(i14);
            h01 h01Var = d.f26261a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                if (this.f28657b == 2) {
                    i12 = ((int) (size / 2.0f)) - (this.v * 4);
                } else {
                    i12 = (int) (size / 1.5f);
                }
                d.e(this.O.createTextLayout(d.f26263c, i12));
                if (d.f26262b != null) {
                    ((ViewGroup.MarginLayoutParams) h01Var).height = Math.max(this.f28664w, d.f26265f + this.f28662r + this.f28663s);
                    int emojiOnlyCount = d.f26262b.getEmojiOnlyCount();
                    if (emojiOnlyCount > 0) {
                        i13 = ((ViewGroup.MarginLayoutParams) h01Var).height * emojiOnlyCount;
                    } else {
                        i13 = (this.v * 2) + d.f26264e;
                    }
                    ((ViewGroup.MarginLayoutParams) h01Var).width = i13;
                } else {
                    ((ViewGroup.MarginLayoutParams) h01Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) h01Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) h01Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) h01Var).height, true);
            } else {
                if (this.f28659e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    j01Var = h01Var.f26922b;
                } else {
                    j01Var = h01Var.f26921a;
                }
                if (j01.a(j01Var, z11) == U) {
                    g01 g01Var = j01Var.f27549b;
                    if (z11) {
                        c01Var = this.f28658c;
                    } else {
                        c01Var = this.d;
                    }
                    int[] g10 = c01Var.g();
                    int e7 = (g10[g01Var.f26616b] - g10[g01Var.f26615a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        e01 e01Var = d.f26262b;
                        if (e01Var != null) {
                            i11 = e01Var.getEmojiOnlyCount();
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            int max = Math.max(1, Math.round(e7 / i11));
                            ((ViewGroup.MarginLayoutParams) h01Var).height = max;
                            d.f26271m = max;
                        }
                        d.d(e(d, true, false) + e(d, true, true) + e7, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) h01Var).height, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) h01Var).width, e(d, false, false) + e(d, false, true) + e7, false);
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
        m01 m01Var = this;
        m01Var.c();
        c01 c01Var = m01Var.d;
        c01 c01Var2 = m01Var.f28658c;
        if (c01Var2 != null && c01Var != null) {
            c01Var2.l();
            c01Var.l();
        }
        m01Var.f28657b = 0;
        int childCount = m01Var.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            m01Var.f28657b = Math.max(m01Var.f28657b, m01Var.d(i17).f26261a.f26922b.f27549b.f26616b);
        }
        m01Var.i(i10, true);
        if (m01Var.f28659e == 0) {
            i12 = c01Var2.i(i10);
            if (m01Var.f28665x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                c01Var2.v.f27279a = i12;
                c01Var2.f25160w.f27279a = -i12;
                c01Var2.f25155q = false;
                c01Var2.g();
            }
            m01Var.i(i10, false);
            i13 = c01Var.i(i11);
        } else {
            int i18 = c01Var.i(i11);
            m01Var.i(i10, false);
            i12 = c01Var2.i(i10);
            i13 = i18;
        }
        int max = Math.max(i13, m01Var.getSuggestedMinimumHeight());
        m01Var.setMeasuredDimension(i12, max);
        c01Var2.v.f27279a = i12;
        c01Var2.f25160w.f27279a = -i12;
        c01Var2.f25155q = false;
        c01Var2.g();
        c01Var.v.f27279a = max;
        c01Var.f25160w.f27279a = -max;
        c01Var.f25155q = false;
        c01Var.g();
        int[] g10 = c01Var2.g();
        int[] g11 = c01Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = m01Var.J;
        arrayList.clear();
        int i19 = g10[g10.length - 1];
        int childCount2 = m01Var.getChildCount();
        int i20 = 0;
        while (i20 < childCount2) {
            int i21 = i20;
            f01 d = m01Var.d(i21);
            h01 h01Var = d.f26261a;
            j01 j01Var = h01Var.f26922b;
            j01 j01Var2 = h01Var.f26921a;
            g01 g01Var = j01Var.f27549b;
            g01 g01Var2 = j01Var2.f27549b;
            int i22 = childCount2;
            int i23 = g10[g01Var.f26615a];
            int i24 = g11[g01Var2.f26615a];
            int i25 = g10[g01Var.f26616b] - i23;
            int i26 = g11[g01Var2.f26616b] - i24;
            int i27 = d.f26269k;
            c01 c01Var3 = c01Var;
            int i28 = d.f26270l;
            yz0 a2 = j01.a(j01Var, true);
            yz0 a10 = j01.a(j01Var2, false);
            la.h f7 = c01Var2.f();
            d01 d01Var = (d01) ((Object[]) f7.d)[((int[]) f7.f15501b)[i21]];
            la.h f10 = c01Var3.f();
            c01 c01Var4 = c01Var2;
            d01 d01Var2 = (d01) ((Object[]) f10.d)[((int[]) f10.f15501b)[i21]];
            int b10 = a2.b(d, i25 - d01Var.d(true));
            int b11 = a10.b(d, i26 - d01Var2.d(true));
            int e7 = m01Var.e(d, true, true);
            int e10 = m01Var.e(d, false, true);
            int e11 = m01Var.e(d, true, false);
            int i29 = e7 + e11;
            int e12 = e10 + m01Var.e(d, false, false);
            int a11 = d01Var.a(m01Var, d, a2, i27 + i29, true);
            m01Var = this;
            int a12 = d01Var2.a(m01Var, d, a10, i28 + e12, false);
            int c10 = a2.c(i27, i25 - i29);
            int c11 = a10.c(i28, i26 - e12);
            int i30 = i23 + b10 + a11;
            if (!m01Var.I) {
                i15 = e7 + i30;
            } else {
                i15 = ((i19 - c10) - e11) - i30;
            }
            int i31 = i15;
            int i32 = i24 + b11 + a12 + e10;
            if (d.f26263c != null) {
                if (c10 != d.f26269k || c11 != d.f26270l) {
                    i16 = 0;
                    d.d(c10, c11, false);
                } else {
                    i16 = 0;
                }
                int i33 = d.f26271m;
                if (i33 != 0 && i33 != c11) {
                    g01 g01Var3 = d.f26261a.f26921a.f27549b;
                    if (g01Var3.f26616b - g01Var3.f26615a <= 1) {
                        ArrayList arrayList2 = m01Var.K;
                        int size = arrayList2.size();
                        int i34 = i16;
                        while (true) {
                            if (i34 < size) {
                                PointF pointF = (PointF) arrayList2.get(i34);
                                float f11 = pointF.x;
                                float f12 = d.f26261a.f26921a.f27549b.f26615a;
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
            d.f26274p = i31;
            d.f26275q = i32;
            i20 = i21 + 1;
            c01Var = c01Var3;
            childCount2 = i22;
            c01Var2 = c01Var4;
        }
        int size2 = arrayList.size();
        int i35 = 0;
        while (i35 < size2) {
            f01 f01Var = (f01) arrayList.get(i35);
            int i36 = f01Var.f26270l;
            int i37 = f01Var.d;
            int i38 = i36 - f01Var.f26271m;
            ArrayList arrayList3 = m01Var.P;
            int size3 = arrayList3.size();
            for (int i39 = i37 + 1; i39 < size3; i39++) {
                f01 f01Var2 = (f01) arrayList3.get(i39);
                if (f01Var.f26261a.f26921a.f27549b.f26615a != f01Var2.f26261a.f26921a.f27549b.f26615a) {
                    break;
                }
                int i40 = f01Var.f26271m;
                int i41 = f01Var2.f26271m;
                if (i40 < i41) {
                    z10 = true;
                    break;
                }
                int i42 = f01Var2.f26270l - i41;
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
                    f01 f01Var3 = (f01) arrayList3.get(i43);
                    if (f01Var.f26261a.f26921a.f27549b.f26615a != f01Var3.f26261a.f26921a.f27549b.f26615a) {
                        break;
                    }
                    int i44 = f01Var.f26271m;
                    int i45 = f01Var3.f26271m;
                    if (i44 < i45) {
                        z10 = true;
                        break;
                    }
                    int i46 = f01Var3.f26270l - i45;
                    if (i46 > 0) {
                        i38 = Math.min(i38, i46);
                    }
                    i43--;
                }
            }
            if (!z10) {
                f01Var.f26270l = f01Var.f26271m;
                f01Var.g();
                max -= i38;
                int i47 = f01Var.f26261a.f26921a.f27549b.f26615a;
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
                    f01 f01Var4 = (f01) arrayList3.get(i50);
                    if (f01Var == f01Var4) {
                        i14 = i50;
                    } else {
                        int i51 = f01Var.f26261a.f26921a.f27549b.f26615a;
                        int i52 = f01Var4.f26261a.f26921a.f27549b.f26615a;
                        if (i51 == i52) {
                            if (f01Var4.f26271m != f01Var4.f26270l) {
                                arrayList.remove(f01Var4);
                                if (f01Var4.d < i37) {
                                    i49--;
                                }
                                i48--;
                            }
                            int i53 = f01Var4.f26270l - i38;
                            f01Var4.f26270l = i53;
                            i14 = i50;
                            f01Var4.d(f01Var4.f26269k, i53, true);
                        } else {
                            i14 = i50;
                            if (i51 < i52) {
                                f01Var4.f26275q -= i38;
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
        int childCount3 = m01Var.getChildCount();
        for (int i54 = 0; i54 < childCount3; i54++) {
            f01 d10 = m01Var.d(i54);
            m01Var.O.onLayoutChild(d10.f26262b, d10.b(), d10.c());
            d10.f26272n = d10.f26274p;
            d10.f26273o = d10.f26269k;
        }
        m01Var.f28666y = i19;
        m01Var.E = max;
        m01Var.F = copyOf;
        m01Var.setMeasuredDimension(i19, max);
    }

    @Override
    public final void requestLayout() {
        c01 c01Var;
        super.requestLayout();
        c01 c01Var2 = this.f28658c;
        if (c01Var2 != null && (c01Var = this.d) != null) {
            c01Var2.l();
            c01Var.l();
        }
    }

    public void setAlignmentMode(int i10) {
        this.h = i10;
        requestLayout();
    }

    public void setColumnCount(int i10) {
        this.f28658c.n(i10);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        c01 c01Var = this.f28658c;
        c01Var.f25159u = z10;
        c01Var.k();
        h();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.G = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.f28665x == z10) {
            return;
        }
        this.f28665x = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i10) {
        this.f28664w = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        if (this.f28659e != i10) {
            this.f28659e = i10;
            h();
            requestLayout();
        }
    }

    public void setRenderWidth(int i10) {
        int i11;
        int i12;
        int measuredWidth = getMeasuredWidth();
        this.f28666y = Math.max(measuredWidth, i10);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            f01 d = d(i13);
            if (measuredWidth > 0 && (i12 = this.f28666y) != measuredWidth) {
                float f7 = measuredWidth;
                int round = Math.round((d.f26272n * i12) / f7);
                int round2 = Math.round(((d.f26272n + d.f26273o) * this.f28666y) / f7);
                d.f26274p = round;
                d.f26269k = Math.max(0, round2 - round);
                if (d.f26263c != null && d.f26262b != null) {
                    d.f();
                }
            } else {
                int i14 = d.f26272n;
                d.f26274p = i14;
                d.f26269k = Math.max(0, (d.f26273o + i14) - i14);
                if (d.f26263c != null && d.f26262b != null) {
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
                f01 d10 = d(i18);
                e01 e01Var = d10.f26262b;
                if (e01Var != null) {
                    i11 = e01Var.getEmojiOnlyCount();
                } else {
                    i11 = 0;
                }
                if (i11 > 0) {
                    g01 g01Var = d10.f26261a.f26921a.f27549b;
                    int max = Math.max(0, g01Var.f26615a);
                    int min = Math.min(i15, g01Var.f26616b);
                    if (max < min) {
                        int i19 = 0;
                        for (int i20 = max; i20 < min; i20++) {
                            i19 += iArr2[i20];
                        }
                        int max2 = Math.max(1, Math.round(d10.f26269k / i11)) - i19;
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
                f01 d11 = d(i25);
                g01 g01Var2 = d11.f26261a.f26921a.f27549b;
                int max3 = Math.max(0, Math.min(i15, g01Var2.f26615a));
                int max4 = Math.max(max3, Math.min(i15, g01Var2.f26616b));
                int i26 = iArr4[max3];
                int i27 = iArr4[max4];
                d11.f26275q = i26;
                d11.f26270l = Math.max(0, i27 - i26);
                if (d11.f26263c != null) {
                    d11.g();
                }
                this.O.onLayoutChild(d11.f26262b, d11.b(), d11.c());
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
        c01 c01Var = this.d;
        c01Var.f25159u = z10;
        c01Var.k();
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
        this.f28660f = z10;
        requestLayout();
    }
}
