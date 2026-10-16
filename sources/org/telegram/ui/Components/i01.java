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
public final class i01 extends View {
    public static final uz0 R = new uz0(0);
    public static final uz0 S = new uz0(1);
    public static final uz0 T = new uz0(3);
    public static final uz0 U = new uz0(4);
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
    public final h01 O;
    public final ArrayList P;
    public final g01 Q;
    public final org.telegram.ui.Cells.o9 f25440a;
    public int f25441b;
    public final yz0 f25442c;
    public final yz0 d;
    public int e;
    public boolean f25443f;
    public int h;
    public int f25444n;
    public int f25445r;
    public int f25446s;
    public int v;
    public int f25447w;
    public boolean f25448x;
    public int f25449y;

    public i01(Context context, h01 h01Var, org.telegram.ui.Cells.o9 o9Var) {
        super(context);
        this.f25442c = new yz0(this, true);
        this.d = new yz0(this, false);
        this.e = 0;
        this.f25443f = false;
        this.h = 1;
        this.f25444n = 0;
        this.f25445r = AndroidUtilities.dp(8.0f);
        this.f25446s = AndroidUtilities.dp(9.0f);
        this.v = AndroidUtilities.dp(12.0f);
        this.f25448x = true;
        this.F = new int[0];
        this.J = new ArrayList();
        this.K = new ArrayList();
        new Path();
        this.L = new Path();
        this.M = new RectF();
        this.N = new float[8];
        this.P = new ArrayList();
        this.f25440a = o9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.O = h01Var;
        g01 g01Var = new g01(this, this);
        this.Q = g01Var;
        r0.i0.j(this, g01Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(t8.b.u(str, ". "));
    }

    public static void j(d01 d01Var, int i10, int i11, int i12, int i13) {
        c01 c01Var = new c01(i10, i11 + i10);
        f01 f01Var = d01Var.f23926a;
        d01Var.f23926a = new f01(f01Var.f24537a, c01Var, f01Var.f24539c, f01Var.d);
        c01 c01Var2 = new c01(i12, i13 + i12);
        f01 f01Var2 = d01Var.f23927b;
        d01Var.f23927b = new f01(f01Var2.f24537a, c01Var2, f01Var2.f24539c, f01Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        b01 b01Var = new b01(this, arrayList.size());
        d01 d01Var = new d01();
        c01 c01Var = new c01(i11, i13 + i11);
        uz0 uz0Var = U;
        d01Var.f23926a = new f01(false, c01Var, uz0Var, 0.0f);
        d01Var.f23927b = new f01(false, new c01(i10, i12 + i10), uz0Var, 0.0f);
        b01Var.f23335a = d01Var;
        b01Var.f23341j = i11;
        arrayList.add(b01Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        int i13;
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        b01 b01Var = new b01(this, arrayList.size());
        b01Var.f23337c = pagetablecell;
        d01 d01Var = new d01();
        int i14 = pagetablecell.rowspan;
        if (i14 == 0) {
            i14 = 1;
        }
        c01 c01Var = new c01(i11, i14 + i11);
        uz0 uz0Var = U;
        d01Var.f23926a = new f01(false, c01Var, uz0Var, 0.0f);
        d01Var.f23927b = new f01(false, new c01(i10, i12 + i10), uz0Var, 1.0f);
        b01Var.f23335a = d01Var;
        b01Var.f23341j = i11;
        arrayList.add(b01Var);
        if (pagetablecell.rowspan > 1) {
            this.K.add(new PointF(i11, i11 + i13));
        }
        h();
    }

    public final void c() {
        boolean z10;
        yz0 yz0Var;
        f01 f01Var;
        f01 f01Var2;
        Throwable th2;
        int i10;
        int i11 = this.f25444n;
        if (i11 == 0) {
            if (this.e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                yz0Var = this.f25442c;
            } else {
                yz0Var = this.d;
            }
            int i12 = yz0Var.f31387b;
            if (i12 == Integer.MIN_VALUE) {
                i12 = 0;
            }
            if (i12 >= 0 && i12 <= 1024) {
                int[] iArr = new int[i12];
                int childCount = getChildCount();
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    d01 d01Var = d(i15).f23335a;
                    if (z10) {
                        f01Var = d01Var.f23926a;
                    } else {
                        f01Var = d01Var.f23927b;
                    }
                    c01 c01Var = f01Var.f24538b;
                    boolean z11 = f01Var.f24537a;
                    int a2 = c01Var.a();
                    if (a2 > 0 && a2 <= 1024) {
                        if (z11) {
                            i13 = c01Var.f23601a;
                        }
                        if (z10) {
                            f01Var2 = d01Var.f23927b;
                        } else {
                            f01Var2 = d01Var.f23926a;
                        }
                        c01 c01Var2 = f01Var2.f24538b;
                        int a10 = c01Var2.a();
                        int i16 = c01Var2.f23601a;
                        if (a10 > 0) {
                            th2 = null;
                            if (c01Var2.a() <= 1024) {
                                boolean z12 = f01Var2.f24537a;
                                int a11 = c01Var2.a();
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
                                    j(d01Var, i13, a2, i14, a11);
                                } else {
                                    j(d01Var, i14, a11, i13, a2);
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
                    i19 = (i19 * 31) + d(i20).f23335a.hashCode();
                }
                this.f25444n = i19;
                return;
            }
            g("Table grid count out of bounds");
            throw null;
        }
        int childCount3 = getChildCount();
        int i21 = 1;
        for (int i22 = 0; i22 < childCount3; i22++) {
            i21 = (i21 * 31) + d(i22).f23335a.hashCode();
        }
        if (i11 != i21) {
            h();
            c();
        }
    }

    public final b01 d(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                return (b01) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        g01 g01Var = this.Q;
        if (g01Var != null && g01Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(b01 b01Var, boolean z10, boolean z11) {
        yz0 yz0Var;
        int[] iArr;
        f01 f01Var;
        int i10;
        if (this.h == 1) {
            return f(b01Var, z10, z11);
        }
        if (z10) {
            yz0Var = this.f25442c;
        } else {
            yz0Var = this.d;
        }
        if (z11) {
            if (yz0Var.f31392j == null) {
                yz0Var.f31392j = new int[yz0Var.e() + 1];
            }
            if (!yz0Var.f31393k) {
                yz0Var.b(true);
                yz0Var.f31393k = true;
            }
            iArr = yz0Var.f31392j;
        } else {
            if (yz0Var.f31394l == null) {
                yz0Var.f31394l = new int[yz0Var.e() + 1];
            }
            if (!yz0Var.f31395m) {
                yz0Var.b(false);
                yz0Var.f31395m = true;
            }
            iArr = yz0Var.f31394l;
        }
        d01 d01Var = b01Var.f23335a;
        if (z10) {
            f01Var = d01Var.f23927b;
        } else {
            f01Var = d01Var.f23926a;
        }
        c01 c01Var = f01Var.f24538b;
        if (z11) {
            i10 = c01Var.f23601a;
        } else {
            i10 = c01Var.f23602b;
        }
        return iArr[i10];
    }

    public final int f(b01 b01Var, boolean z10, boolean z11) {
        int i10;
        f01 f01Var;
        yz0 yz0Var;
        boolean z12;
        d01 d01Var = b01Var.f23335a;
        if (z10) {
            if (z11) {
                i10 = ((ViewGroup.MarginLayoutParams) d01Var).leftMargin;
            } else {
                i10 = ((ViewGroup.MarginLayoutParams) d01Var).rightMargin;
            }
        } else if (z11) {
            i10 = ((ViewGroup.MarginLayoutParams) d01Var).topMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) d01Var).bottomMargin;
        }
        if (i10 == Integer.MIN_VALUE) {
            if (!this.f25443f) {
                return 0;
            }
            if (z10) {
                f01Var = d01Var.f23927b;
            } else {
                f01Var = d01Var.f23926a;
            }
            if (z10) {
                yz0Var = this.f25442c;
            } else {
                yz0Var = this.d;
            }
            c01 c01Var = f01Var.f24538b;
            if (z10 && this.I) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != z11) {
                int i11 = c01Var.f23601a;
                return 0;
            }
            int i12 = c01Var.f23602b;
            yz0Var.e();
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
        return this.f25442c.e();
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
        return this.f25443f;
    }

    public final void h() {
        this.f25444n = 0;
        yz0 yz0Var = this.f25442c;
        yz0Var.k();
        yz0 yz0Var2 = this.d;
        yz0Var2.k();
        if (yz0Var != null && yz0Var2 != null) {
            yz0Var.l();
            yz0Var2.l();
        }
    }

    public final void i(int i10, boolean z10) {
        boolean z11;
        f01 f01Var;
        yz0 yz0Var;
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            b01 d = d(i14);
            d01 d01Var = d.f23335a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                if (this.f25441b == 2) {
                    i12 = ((int) (size / 2.0f)) - (this.v * 4);
                } else {
                    i12 = (int) (size / 1.5f);
                }
                d.e(this.O.createTextLayout(d.f23337c, i12));
                if (d.f23336b != null) {
                    ((ViewGroup.MarginLayoutParams) d01Var).height = Math.max(this.f25447w, d.f23338f + this.f25445r + this.f25446s);
                    int emojiOnlyCount = d.f23336b.getEmojiOnlyCount();
                    if (emojiOnlyCount > 0) {
                        i13 = ((ViewGroup.MarginLayoutParams) d01Var).height * emojiOnlyCount;
                    } else {
                        i13 = (this.v * 2) + d.e;
                    }
                    ((ViewGroup.MarginLayoutParams) d01Var).width = i13;
                } else {
                    ((ViewGroup.MarginLayoutParams) d01Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) d01Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) d01Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) d01Var).height, true);
            } else {
                if (this.e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    f01Var = d01Var.f23927b;
                } else {
                    f01Var = d01Var.f23926a;
                }
                if (f01.a(f01Var, z11) == U) {
                    c01 c01Var = f01Var.f24538b;
                    if (z11) {
                        yz0Var = this.f25442c;
                    } else {
                        yz0Var = this.d;
                    }
                    int[] g10 = yz0Var.g();
                    int e = (g10[c01Var.f23602b] - g10[c01Var.f23601a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        a01 a01Var = d.f23336b;
                        if (a01Var != null) {
                            i11 = a01Var.getEmojiOnlyCount();
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            int max = Math.max(1, Math.round(e / i11));
                            ((ViewGroup.MarginLayoutParams) d01Var).height = max;
                            d.f23344m = max;
                        }
                        d.d(e(d, true, false) + e(d, true, true) + e, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) d01Var).height, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) d01Var).width, e(d, false, false) + e(d, false, true) + e, false);
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
        i01 i01Var = this;
        i01Var.c();
        yz0 yz0Var = i01Var.d;
        yz0 yz0Var2 = i01Var.f25442c;
        if (yz0Var2 != null && yz0Var != null) {
            yz0Var2.l();
            yz0Var.l();
        }
        i01Var.f25441b = 0;
        int childCount = i01Var.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            i01Var.f25441b = Math.max(i01Var.f25441b, i01Var.d(i17).f23335a.f23927b.f24538b.f23602b);
        }
        i01Var.i(i10, true);
        if (i01Var.e == 0) {
            i12 = yz0Var2.i(i10);
            if (i01Var.f25448x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                yz0Var2.v.f24243a = i12;
                yz0Var2.f31404w.f24243a = -i12;
                yz0Var2.f31399q = false;
                yz0Var2.g();
            }
            i01Var.i(i10, false);
            i13 = yz0Var.i(i11);
        } else {
            int i18 = yz0Var.i(i11);
            i01Var.i(i10, false);
            i12 = yz0Var2.i(i10);
            i13 = i18;
        }
        int max = Math.max(i13, i01Var.getSuggestedMinimumHeight());
        i01Var.setMeasuredDimension(i12, max);
        yz0Var2.v.f24243a = i12;
        yz0Var2.f31404w.f24243a = -i12;
        yz0Var2.f31399q = false;
        yz0Var2.g();
        yz0Var.v.f24243a = max;
        yz0Var.f31404w.f24243a = -max;
        yz0Var.f31399q = false;
        yz0Var.g();
        int[] g10 = yz0Var2.g();
        int[] g11 = yz0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = i01Var.J;
        arrayList.clear();
        int i19 = g10[g10.length - 1];
        int childCount2 = i01Var.getChildCount();
        int i20 = 0;
        while (i20 < childCount2) {
            int i21 = i20;
            b01 d = i01Var.d(i21);
            d01 d01Var = d.f23335a;
            f01 f01Var = d01Var.f23927b;
            f01 f01Var2 = d01Var.f23926a;
            c01 c01Var = f01Var.f24538b;
            c01 c01Var2 = f01Var2.f24538b;
            int i22 = childCount2;
            int i23 = g10[c01Var.f23601a];
            int i24 = g11[c01Var2.f23601a];
            int i25 = g10[c01Var.f23602b] - i23;
            int i26 = g11[c01Var2.f23602b] - i24;
            int i27 = d.f23342k;
            yz0 yz0Var3 = yz0Var;
            int i28 = d.f23343l;
            uz0 a2 = f01.a(f01Var, true);
            uz0 a10 = f01.a(f01Var2, false);
            m.h3 f7 = yz0Var2.f();
            zz0 zz0Var = (zz0) ((Object[]) f7.d)[((int[]) f7.f14850b)[i21]];
            m.h3 f10 = yz0Var3.f();
            yz0 yz0Var4 = yz0Var2;
            zz0 zz0Var2 = (zz0) ((Object[]) f10.d)[((int[]) f10.f14850b)[i21]];
            int b10 = a2.b(d, i25 - zz0Var.d(true));
            int b11 = a10.b(d, i26 - zz0Var2.d(true));
            int e = i01Var.e(d, true, true);
            int e7 = i01Var.e(d, false, true);
            int e10 = i01Var.e(d, true, false);
            int i29 = e + e10;
            int e11 = e7 + i01Var.e(d, false, false);
            int a11 = zz0Var.a(i01Var, d, a2, i27 + i29, true);
            i01Var = this;
            int a12 = zz0Var2.a(i01Var, d, a10, i28 + e11, false);
            int c10 = a2.c(i27, i25 - i29);
            int c11 = a10.c(i28, i26 - e11);
            int i30 = i23 + b10 + a11;
            if (!i01Var.I) {
                i15 = e + i30;
            } else {
                i15 = ((i19 - c10) - e10) - i30;
            }
            int i31 = i15;
            int i32 = i24 + b11 + a12 + e7;
            if (d.f23337c != null) {
                if (c10 != d.f23342k || c11 != d.f23343l) {
                    i16 = 0;
                    d.d(c10, c11, false);
                } else {
                    i16 = 0;
                }
                int i33 = d.f23344m;
                if (i33 != 0 && i33 != c11) {
                    c01 c01Var3 = d.f23335a.f23926a.f24538b;
                    if (c01Var3.f23602b - c01Var3.f23601a <= 1) {
                        ArrayList arrayList2 = i01Var.K;
                        int size = arrayList2.size();
                        int i34 = i16;
                        while (true) {
                            if (i34 < size) {
                                PointF pointF = (PointF) arrayList2.get(i34);
                                float f11 = pointF.x;
                                float f12 = d.f23335a.f23926a.f24538b.f23601a;
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
            d.f23347p = i31;
            d.f23348q = i32;
            i20 = i21 + 1;
            yz0Var = yz0Var3;
            childCount2 = i22;
            yz0Var2 = yz0Var4;
        }
        int size2 = arrayList.size();
        int i35 = 0;
        while (i35 < size2) {
            b01 b01Var = (b01) arrayList.get(i35);
            int i36 = b01Var.f23343l;
            int i37 = b01Var.d;
            int i38 = i36 - b01Var.f23344m;
            ArrayList arrayList3 = i01Var.P;
            int size3 = arrayList3.size();
            for (int i39 = i37 + 1; i39 < size3; i39++) {
                b01 b01Var2 = (b01) arrayList3.get(i39);
                if (b01Var.f23335a.f23926a.f24538b.f23601a != b01Var2.f23335a.f23926a.f24538b.f23601a) {
                    break;
                }
                int i40 = b01Var.f23344m;
                int i41 = b01Var2.f23344m;
                if (i40 < i41) {
                    z10 = true;
                    break;
                }
                int i42 = b01Var2.f23343l - i41;
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
                    b01 b01Var3 = (b01) arrayList3.get(i43);
                    if (b01Var.f23335a.f23926a.f24538b.f23601a != b01Var3.f23335a.f23926a.f24538b.f23601a) {
                        break;
                    }
                    int i44 = b01Var.f23344m;
                    int i45 = b01Var3.f23344m;
                    if (i44 < i45) {
                        z10 = true;
                        break;
                    }
                    int i46 = b01Var3.f23343l - i45;
                    if (i46 > 0) {
                        i38 = Math.min(i38, i46);
                    }
                    i43--;
                }
            }
            if (!z10) {
                b01Var.f23343l = b01Var.f23344m;
                b01Var.g();
                max -= i38;
                int i47 = b01Var.f23335a.f23926a.f24538b.f23601a;
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
                    b01 b01Var4 = (b01) arrayList3.get(i50);
                    if (b01Var == b01Var4) {
                        i14 = i50;
                    } else {
                        int i51 = b01Var.f23335a.f23926a.f24538b.f23601a;
                        int i52 = b01Var4.f23335a.f23926a.f24538b.f23601a;
                        if (i51 == i52) {
                            if (b01Var4.f23344m != b01Var4.f23343l) {
                                arrayList.remove(b01Var4);
                                if (b01Var4.d < i37) {
                                    i49--;
                                }
                                i48--;
                            }
                            int i53 = b01Var4.f23343l - i38;
                            b01Var4.f23343l = i53;
                            i14 = i50;
                            b01Var4.d(b01Var4.f23342k, i53, true);
                        } else {
                            i14 = i50;
                            if (i51 < i52) {
                                b01Var4.f23348q -= i38;
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
        int childCount3 = i01Var.getChildCount();
        for (int i54 = 0; i54 < childCount3; i54++) {
            b01 d10 = i01Var.d(i54);
            i01Var.O.onLayoutChild(d10.f23336b, d10.b(), d10.c());
            d10.f23345n = d10.f23347p;
            d10.f23346o = d10.f23342k;
        }
        i01Var.f25449y = i19;
        i01Var.E = max;
        i01Var.F = copyOf;
        i01Var.setMeasuredDimension(i19, max);
    }

    @Override
    public final void requestLayout() {
        yz0 yz0Var;
        super.requestLayout();
        yz0 yz0Var2 = this.f25442c;
        if (yz0Var2 != null && (yz0Var = this.d) != null) {
            yz0Var2.l();
            yz0Var.l();
        }
    }

    public void setAlignmentMode(int i10) {
        this.h = i10;
        requestLayout();
    }

    public void setColumnCount(int i10) {
        this.f25442c.n(i10);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        yz0 yz0Var = this.f25442c;
        yz0Var.f31403u = z10;
        yz0Var.k();
        h();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.G = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.f25448x == z10) {
            return;
        }
        this.f25448x = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i10) {
        this.f25447w = i10;
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
        this.f25449y = Math.max(measuredWidth, i10);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            b01 d = d(i13);
            if (measuredWidth > 0 && (i12 = this.f25449y) != measuredWidth) {
                float f7 = measuredWidth;
                int round = Math.round((d.f23345n * i12) / f7);
                int round2 = Math.round(((d.f23345n + d.f23346o) * this.f25449y) / f7);
                d.f23347p = round;
                d.f23342k = Math.max(0, round2 - round);
                if (d.f23337c != null && d.f23336b != null) {
                    d.f();
                }
            } else {
                int i14 = d.f23345n;
                d.f23347p = i14;
                d.f23342k = Math.max(0, (d.f23346o + i14) - i14);
                if (d.f23337c != null && d.f23336b != null) {
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
                b01 d10 = d(i18);
                a01 a01Var = d10.f23336b;
                if (a01Var != null) {
                    i11 = a01Var.getEmojiOnlyCount();
                } else {
                    i11 = 0;
                }
                if (i11 > 0) {
                    c01 c01Var = d10.f23335a.f23926a.f24538b;
                    int max = Math.max(0, c01Var.f23601a);
                    int min = Math.min(i15, c01Var.f23602b);
                    if (max < min) {
                        int i19 = 0;
                        for (int i20 = max; i20 < min; i20++) {
                            i19 += iArr2[i20];
                        }
                        int max2 = Math.max(1, Math.round(d10.f23342k / i11)) - i19;
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
                b01 d11 = d(i25);
                c01 c01Var2 = d11.f23335a.f23926a.f24538b;
                int max3 = Math.max(0, Math.min(i15, c01Var2.f23601a));
                int max4 = Math.max(max3, Math.min(i15, c01Var2.f23602b));
                int i26 = iArr4[max3];
                int i27 = iArr4[max4];
                d11.f23348q = i26;
                d11.f23343l = Math.max(0, i27 - i26);
                if (d11.f23337c != null) {
                    d11.g();
                }
                this.O.onLayoutChild(d11.f23336b, d11.b(), d11.c());
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
        yz0 yz0Var = this.d;
        yz0Var.f31403u = z10;
        yz0Var.k();
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
        this.f25443f = z10;
        requestLayout();
    }
}
