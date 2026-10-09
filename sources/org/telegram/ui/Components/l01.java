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
public final class l01 extends View {
    public static final xz0 R = new xz0(0);
    public static final xz0 S = new xz0(1);
    public static final xz0 T = new xz0(3);
    public static final xz0 U = new xz0(4);
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
    public final k01 O;
    public final ArrayList P;
    public final j01 Q;
    public final org.telegram.ui.Cells.o9 f28203a;
    public int f28204b;
    public final b01 f28205c;
    public final b01 d;
    public int f28206e;
    public boolean f28207f;
    public int h;
    public int f28208n;
    public int f28209r;
    public int f28210s;
    public int v;
    public int f28211w;
    public boolean f28212x;
    public int f28213y;

    public l01(Context context, k01 k01Var, org.telegram.ui.Cells.o9 o9Var) {
        super(context);
        this.f28205c = new b01(this, true);
        this.d = new b01(this, false);
        this.f28206e = 0;
        this.f28207f = false;
        this.h = 1;
        this.f28208n = 0;
        this.f28209r = AndroidUtilities.dp(8.0f);
        this.f28210s = AndroidUtilities.dp(9.0f);
        this.v = AndroidUtilities.dp(12.0f);
        this.f28212x = true;
        this.F = new int[0];
        this.J = new ArrayList();
        this.K = new ArrayList();
        new Path();
        this.L = new Path();
        this.M = new RectF();
        this.N = new float[8];
        this.P = new ArrayList();
        this.f28203a = o9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.O = k01Var;
        j01 j01Var = new j01(this, this);
        this.Q = j01Var;
        r0.i0.j(this, j01Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(sc.v.v(str, ". "));
    }

    public static void j(g01 g01Var, int i10, int i11, int i12, int i13) {
        f01 f01Var = new f01(i10, i11 + i10);
        i01 i01Var = g01Var.f26538a;
        g01Var.f26538a = new i01(i01Var.f27176a, f01Var, i01Var.f27178c, i01Var.d);
        f01 f01Var2 = new f01(i12, i13 + i12);
        i01 i01Var2 = g01Var.f26539b;
        g01Var.f26539b = new i01(i01Var2.f27176a, f01Var2, i01Var2.f27178c, i01Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        e01 e01Var = new e01(this, arrayList.size());
        g01 g01Var = new g01();
        f01 f01Var = new f01(i11, i13 + i11);
        xz0 xz0Var = U;
        g01Var.f26538a = new i01(false, f01Var, xz0Var, 0.0f);
        g01Var.f26539b = new i01(false, new f01(i10, i12 + i10), xz0Var, 0.0f);
        e01Var.f25887a = g01Var;
        e01Var.f25894j = i11;
        arrayList.add(e01Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        int i13;
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        e01 e01Var = new e01(this, arrayList.size());
        e01Var.f25889c = pagetablecell;
        g01 g01Var = new g01();
        int i14 = pagetablecell.rowspan;
        if (i14 == 0) {
            i14 = 1;
        }
        f01 f01Var = new f01(i11, i14 + i11);
        xz0 xz0Var = U;
        g01Var.f26538a = new i01(false, f01Var, xz0Var, 0.0f);
        g01Var.f26539b = new i01(false, new f01(i10, i12 + i10), xz0Var, 1.0f);
        e01Var.f25887a = g01Var;
        e01Var.f25894j = i11;
        arrayList.add(e01Var);
        if (pagetablecell.rowspan > 1) {
            this.K.add(new PointF(i11, i11 + i13));
        }
        h();
    }

    public final void c() {
        boolean z10;
        b01 b01Var;
        i01 i01Var;
        i01 i01Var2;
        Throwable th2;
        int i10;
        int i11 = this.f28208n;
        if (i11 == 0) {
            if (this.f28206e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                b01Var = this.f28205c;
            } else {
                b01Var = this.d;
            }
            int i12 = b01Var.f24819b;
            if (i12 == Integer.MIN_VALUE) {
                i12 = 0;
            }
            if (i12 >= 0 && i12 <= 1024) {
                int[] iArr = new int[i12];
                int childCount = getChildCount();
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    g01 g01Var = d(i15).f25887a;
                    if (z10) {
                        i01Var = g01Var.f26538a;
                    } else {
                        i01Var = g01Var.f26539b;
                    }
                    f01 f01Var = i01Var.f27177b;
                    boolean z11 = i01Var.f27176a;
                    int a2 = f01Var.a();
                    if (a2 > 0 && a2 <= 1024) {
                        if (z11) {
                            i13 = f01Var.f26205a;
                        }
                        if (z10) {
                            i01Var2 = g01Var.f26539b;
                        } else {
                            i01Var2 = g01Var.f26538a;
                        }
                        f01 f01Var2 = i01Var2.f27177b;
                        int a10 = f01Var2.a();
                        int i16 = f01Var2.f26205a;
                        if (a10 > 0) {
                            th2 = null;
                            if (f01Var2.a() <= 1024) {
                                boolean z12 = i01Var2.f27176a;
                                int a11 = f01Var2.a();
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
                                    j(g01Var, i13, a2, i14, a11);
                                } else {
                                    j(g01Var, i14, a11, i13, a2);
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
                    i19 = (i19 * 31) + d(i20).f25887a.hashCode();
                }
                this.f28208n = i19;
                return;
            }
            g("Table grid count out of bounds");
            throw null;
        }
        int childCount3 = getChildCount();
        int i21 = 1;
        for (int i22 = 0; i22 < childCount3; i22++) {
            i21 = (i21 * 31) + d(i22).f25887a.hashCode();
        }
        if (i11 != i21) {
            h();
            c();
        }
    }

    public final e01 d(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                return (e01) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        j01 j01Var = this.Q;
        if (j01Var != null && j01Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(e01 e01Var, boolean z10, boolean z11) {
        b01 b01Var;
        int[] iArr;
        i01 i01Var;
        int i10;
        if (this.h == 1) {
            return f(e01Var, z10, z11);
        }
        if (z10) {
            b01Var = this.f28205c;
        } else {
            b01Var = this.d;
        }
        if (z11) {
            if (b01Var.f24825j == null) {
                b01Var.f24825j = new int[b01Var.e() + 1];
            }
            if (!b01Var.f24826k) {
                b01Var.b(true);
                b01Var.f24826k = true;
            }
            iArr = b01Var.f24825j;
        } else {
            if (b01Var.f24827l == null) {
                b01Var.f24827l = new int[b01Var.e() + 1];
            }
            if (!b01Var.f24828m) {
                b01Var.b(false);
                b01Var.f24828m = true;
            }
            iArr = b01Var.f24827l;
        }
        g01 g01Var = e01Var.f25887a;
        if (z10) {
            i01Var = g01Var.f26539b;
        } else {
            i01Var = g01Var.f26538a;
        }
        f01 f01Var = i01Var.f27177b;
        if (z11) {
            i10 = f01Var.f26205a;
        } else {
            i10 = f01Var.f26206b;
        }
        return iArr[i10];
    }

    public final int f(e01 e01Var, boolean z10, boolean z11) {
        int i10;
        i01 i01Var;
        b01 b01Var;
        boolean z12;
        g01 g01Var = e01Var.f25887a;
        if (z10) {
            if (z11) {
                i10 = ((ViewGroup.MarginLayoutParams) g01Var).leftMargin;
            } else {
                i10 = ((ViewGroup.MarginLayoutParams) g01Var).rightMargin;
            }
        } else if (z11) {
            i10 = ((ViewGroup.MarginLayoutParams) g01Var).topMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) g01Var).bottomMargin;
        }
        if (i10 == Integer.MIN_VALUE) {
            if (!this.f28207f) {
                return 0;
            }
            if (z10) {
                i01Var = g01Var.f26539b;
            } else {
                i01Var = g01Var.f26538a;
            }
            if (z10) {
                b01Var = this.f28205c;
            } else {
                b01Var = this.d;
            }
            f01 f01Var = i01Var.f27177b;
            if (z10 && this.I) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != z11) {
                int i11 = f01Var.f26205a;
                return 0;
            }
            int i12 = f01Var.f26206b;
            b01Var.e();
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
        return this.f28205c.e();
    }

    public int getOrientation() {
        return this.f28206e;
    }

    public int getRenderHeight() {
        return this.E;
    }

    public int getRowCount() {
        return this.d.e();
    }

    public boolean getUseDefaultMargins() {
        return this.f28207f;
    }

    public final void h() {
        this.f28208n = 0;
        b01 b01Var = this.f28205c;
        b01Var.k();
        b01 b01Var2 = this.d;
        b01Var2.k();
        if (b01Var != null && b01Var2 != null) {
            b01Var.l();
            b01Var2.l();
        }
    }

    public final void i(int i10, boolean z10) {
        boolean z11;
        i01 i01Var;
        b01 b01Var;
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            e01 d = d(i14);
            g01 g01Var = d.f25887a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                if (this.f28204b == 2) {
                    i12 = ((int) (size / 2.0f)) - (this.v * 4);
                } else {
                    i12 = (int) (size / 1.5f);
                }
                d.e(this.O.createTextLayout(d.f25889c, i12));
                if (d.f25888b != null) {
                    ((ViewGroup.MarginLayoutParams) g01Var).height = Math.max(this.f28211w, d.f25891f + this.f28209r + this.f28210s);
                    int emojiOnlyCount = d.f25888b.getEmojiOnlyCount();
                    if (emojiOnlyCount > 0) {
                        i13 = ((ViewGroup.MarginLayoutParams) g01Var).height * emojiOnlyCount;
                    } else {
                        i13 = (this.v * 2) + d.f25890e;
                    }
                    ((ViewGroup.MarginLayoutParams) g01Var).width = i13;
                } else {
                    ((ViewGroup.MarginLayoutParams) g01Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) g01Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) g01Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) g01Var).height, true);
            } else {
                if (this.f28206e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    i01Var = g01Var.f26539b;
                } else {
                    i01Var = g01Var.f26538a;
                }
                if (i01.a(i01Var, z11) == U) {
                    f01 f01Var = i01Var.f27177b;
                    if (z11) {
                        b01Var = this.f28205c;
                    } else {
                        b01Var = this.d;
                    }
                    int[] g10 = b01Var.g();
                    int e7 = (g10[f01Var.f26206b] - g10[f01Var.f26205a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        d01 d01Var = d.f25888b;
                        if (d01Var != null) {
                            i11 = d01Var.getEmojiOnlyCount();
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            int max = Math.max(1, Math.round(e7 / i11));
                            ((ViewGroup.MarginLayoutParams) g01Var).height = max;
                            d.f25897m = max;
                        }
                        d.d(e(d, true, false) + e(d, true, true) + e7, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) g01Var).height, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) g01Var).width, e(d, false, false) + e(d, false, true) + e7, false);
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
        l01 l01Var = this;
        l01Var.c();
        b01 b01Var = l01Var.d;
        b01 b01Var2 = l01Var.f28205c;
        if (b01Var2 != null && b01Var != null) {
            b01Var2.l();
            b01Var.l();
        }
        l01Var.f28204b = 0;
        int childCount = l01Var.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            l01Var.f28204b = Math.max(l01Var.f28204b, l01Var.d(i17).f25887a.f26539b.f27177b.f26206b);
        }
        l01Var.i(i10, true);
        if (l01Var.f28206e == 0) {
            i12 = b01Var2.i(i10);
            if (l01Var.f28212x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                b01Var2.v.f26920a = i12;
                b01Var2.f24837w.f26920a = -i12;
                b01Var2.f24832q = false;
                b01Var2.g();
            }
            l01Var.i(i10, false);
            i13 = b01Var.i(i11);
        } else {
            int i18 = b01Var.i(i11);
            l01Var.i(i10, false);
            i12 = b01Var2.i(i10);
            i13 = i18;
        }
        int max = Math.max(i13, l01Var.getSuggestedMinimumHeight());
        l01Var.setMeasuredDimension(i12, max);
        b01Var2.v.f26920a = i12;
        b01Var2.f24837w.f26920a = -i12;
        b01Var2.f24832q = false;
        b01Var2.g();
        b01Var.v.f26920a = max;
        b01Var.f24837w.f26920a = -max;
        b01Var.f24832q = false;
        b01Var.g();
        int[] g10 = b01Var2.g();
        int[] g11 = b01Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = l01Var.J;
        arrayList.clear();
        int i19 = g10[g10.length - 1];
        int childCount2 = l01Var.getChildCount();
        int i20 = 0;
        while (i20 < childCount2) {
            int i21 = i20;
            e01 d = l01Var.d(i21);
            g01 g01Var = d.f25887a;
            i01 i01Var = g01Var.f26539b;
            i01 i01Var2 = g01Var.f26538a;
            f01 f01Var = i01Var.f27177b;
            f01 f01Var2 = i01Var2.f27177b;
            int i22 = childCount2;
            int i23 = g10[f01Var.f26205a];
            int i24 = g11[f01Var2.f26205a];
            int i25 = g10[f01Var.f26206b] - i23;
            int i26 = g11[f01Var2.f26206b] - i24;
            int i27 = d.f25895k;
            b01 b01Var3 = b01Var;
            int i28 = d.f25896l;
            xz0 a2 = i01.a(i01Var, true);
            xz0 a10 = i01.a(i01Var2, false);
            la.h f7 = b01Var2.f();
            c01 c01Var = (c01) ((Object[]) f7.d)[((int[]) f7.f15462b)[i21]];
            la.h f10 = b01Var3.f();
            b01 b01Var4 = b01Var2;
            c01 c01Var2 = (c01) ((Object[]) f10.d)[((int[]) f10.f15462b)[i21]];
            int b10 = a2.b(d, i25 - c01Var.d(true));
            int b11 = a10.b(d, i26 - c01Var2.d(true));
            int e7 = l01Var.e(d, true, true);
            int e10 = l01Var.e(d, false, true);
            int e11 = l01Var.e(d, true, false);
            int i29 = e7 + e11;
            int e12 = e10 + l01Var.e(d, false, false);
            int a11 = c01Var.a(l01Var, d, a2, i27 + i29, true);
            l01Var = this;
            int a12 = c01Var2.a(l01Var, d, a10, i28 + e12, false);
            int c10 = a2.c(i27, i25 - i29);
            int c11 = a10.c(i28, i26 - e12);
            int i30 = i23 + b10 + a11;
            if (!l01Var.I) {
                i15 = e7 + i30;
            } else {
                i15 = ((i19 - c10) - e11) - i30;
            }
            int i31 = i15;
            int i32 = i24 + b11 + a12 + e10;
            if (d.f25889c != null) {
                if (c10 != d.f25895k || c11 != d.f25896l) {
                    i16 = 0;
                    d.d(c10, c11, false);
                } else {
                    i16 = 0;
                }
                int i33 = d.f25897m;
                if (i33 != 0 && i33 != c11) {
                    f01 f01Var3 = d.f25887a.f26538a.f27177b;
                    if (f01Var3.f26206b - f01Var3.f26205a <= 1) {
                        ArrayList arrayList2 = l01Var.K;
                        int size = arrayList2.size();
                        int i34 = i16;
                        while (true) {
                            if (i34 < size) {
                                PointF pointF = (PointF) arrayList2.get(i34);
                                float f11 = pointF.x;
                                float f12 = d.f25887a.f26538a.f27177b.f26205a;
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
            d.f25900p = i31;
            d.f25901q = i32;
            i20 = i21 + 1;
            b01Var = b01Var3;
            childCount2 = i22;
            b01Var2 = b01Var4;
        }
        int size2 = arrayList.size();
        int i35 = 0;
        while (i35 < size2) {
            e01 e01Var = (e01) arrayList.get(i35);
            int i36 = e01Var.f25896l;
            int i37 = e01Var.d;
            int i38 = i36 - e01Var.f25897m;
            ArrayList arrayList3 = l01Var.P;
            int size3 = arrayList3.size();
            for (int i39 = i37 + 1; i39 < size3; i39++) {
                e01 e01Var2 = (e01) arrayList3.get(i39);
                if (e01Var.f25887a.f26538a.f27177b.f26205a != e01Var2.f25887a.f26538a.f27177b.f26205a) {
                    break;
                }
                int i40 = e01Var.f25897m;
                int i41 = e01Var2.f25897m;
                if (i40 < i41) {
                    z10 = true;
                    break;
                }
                int i42 = e01Var2.f25896l - i41;
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
                    e01 e01Var3 = (e01) arrayList3.get(i43);
                    if (e01Var.f25887a.f26538a.f27177b.f26205a != e01Var3.f25887a.f26538a.f27177b.f26205a) {
                        break;
                    }
                    int i44 = e01Var.f25897m;
                    int i45 = e01Var3.f25897m;
                    if (i44 < i45) {
                        z10 = true;
                        break;
                    }
                    int i46 = e01Var3.f25896l - i45;
                    if (i46 > 0) {
                        i38 = Math.min(i38, i46);
                    }
                    i43--;
                }
            }
            if (!z10) {
                e01Var.f25896l = e01Var.f25897m;
                e01Var.g();
                max -= i38;
                int i47 = e01Var.f25887a.f26538a.f27177b.f26205a;
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
                    e01 e01Var4 = (e01) arrayList3.get(i50);
                    if (e01Var == e01Var4) {
                        i14 = i50;
                    } else {
                        int i51 = e01Var.f25887a.f26538a.f27177b.f26205a;
                        int i52 = e01Var4.f25887a.f26538a.f27177b.f26205a;
                        if (i51 == i52) {
                            if (e01Var4.f25897m != e01Var4.f25896l) {
                                arrayList.remove(e01Var4);
                                if (e01Var4.d < i37) {
                                    i49--;
                                }
                                i48--;
                            }
                            int i53 = e01Var4.f25896l - i38;
                            e01Var4.f25896l = i53;
                            i14 = i50;
                            e01Var4.d(e01Var4.f25895k, i53, true);
                        } else {
                            i14 = i50;
                            if (i51 < i52) {
                                e01Var4.f25901q -= i38;
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
        int childCount3 = l01Var.getChildCount();
        for (int i54 = 0; i54 < childCount3; i54++) {
            e01 d10 = l01Var.d(i54);
            l01Var.O.onLayoutChild(d10.f25888b, d10.b(), d10.c());
            d10.f25898n = d10.f25900p;
            d10.f25899o = d10.f25895k;
        }
        l01Var.f28213y = i19;
        l01Var.E = max;
        l01Var.F = copyOf;
        l01Var.setMeasuredDimension(i19, max);
    }

    @Override
    public final void requestLayout() {
        b01 b01Var;
        super.requestLayout();
        b01 b01Var2 = this.f28205c;
        if (b01Var2 != null && (b01Var = this.d) != null) {
            b01Var2.l();
            b01Var.l();
        }
    }

    public void setAlignmentMode(int i10) {
        this.h = i10;
        requestLayout();
    }

    public void setColumnCount(int i10) {
        this.f28205c.n(i10);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        b01 b01Var = this.f28205c;
        b01Var.f24836u = z10;
        b01Var.k();
        h();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.G = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.f28212x == z10) {
            return;
        }
        this.f28212x = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i10) {
        this.f28211w = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        if (this.f28206e != i10) {
            this.f28206e = i10;
            h();
            requestLayout();
        }
    }

    public void setRenderWidth(int i10) {
        int i11;
        int i12;
        int measuredWidth = getMeasuredWidth();
        this.f28213y = Math.max(measuredWidth, i10);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            e01 d = d(i13);
            if (measuredWidth > 0 && (i12 = this.f28213y) != measuredWidth) {
                float f7 = measuredWidth;
                int round = Math.round((d.f25898n * i12) / f7);
                int round2 = Math.round(((d.f25898n + d.f25899o) * this.f28213y) / f7);
                d.f25900p = round;
                d.f25895k = Math.max(0, round2 - round);
                if (d.f25889c != null && d.f25888b != null) {
                    d.f();
                }
            } else {
                int i14 = d.f25898n;
                d.f25900p = i14;
                d.f25895k = Math.max(0, (d.f25899o + i14) - i14);
                if (d.f25889c != null && d.f25888b != null) {
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
                e01 d10 = d(i18);
                d01 d01Var = d10.f25888b;
                if (d01Var != null) {
                    i11 = d01Var.getEmojiOnlyCount();
                } else {
                    i11 = 0;
                }
                if (i11 > 0) {
                    f01 f01Var = d10.f25887a.f26538a.f27177b;
                    int max = Math.max(0, f01Var.f26205a);
                    int min = Math.min(i15, f01Var.f26206b);
                    if (max < min) {
                        int i19 = 0;
                        for (int i20 = max; i20 < min; i20++) {
                            i19 += iArr2[i20];
                        }
                        int max2 = Math.max(1, Math.round(d10.f25895k / i11)) - i19;
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
                e01 d11 = d(i25);
                f01 f01Var2 = d11.f25887a.f26538a.f27177b;
                int max3 = Math.max(0, Math.min(i15, f01Var2.f26205a));
                int max4 = Math.max(max3, Math.min(i15, f01Var2.f26206b));
                int i26 = iArr4[max3];
                int i27 = iArr4[max4];
                d11.f25901q = i26;
                d11.f25896l = Math.max(0, i27 - i26);
                if (d11.f25889c != null) {
                    d11.g();
                }
                this.O.onLayoutChild(d11.f25888b, d11.b(), d11.c());
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
        b01 b01Var = this.d;
        b01Var.f24836u = z10;
        b01Var.k();
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
        this.f28207f = z10;
        requestLayout();
    }
}
