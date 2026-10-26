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
public final class q01 extends View {
    public static final c01 R = new c01(0);
    public static final c01 S = new c01(1);
    public static final c01 T = new c01(3);
    public static final c01 U = new c01(4);
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
    public final p01 O;
    public final ArrayList P;
    public final o01 Q;
    public final org.telegram.ui.Cells.s9 f31776a;
    public int f31777b;
    public final g01 f31778c;
    public final g01 d;
    public int e;
    public boolean f31779f;
    public int h;
    public int f31780n;
    public int f31781r;
    public int f31782s;
    public int v;
    public int f31783w;
    public boolean f31784x;
    public int f31785y;

    public q01(Context context, p01 p01Var, org.telegram.ui.Cells.s9 s9Var) {
        super(context);
        this.f31778c = new g01(this, true);
        this.d = new g01(this, false);
        this.e = 0;
        this.f31779f = false;
        this.h = 1;
        this.f31780n = 0;
        this.f31781r = AndroidUtilities.dp(8.0f);
        this.f31782s = AndroidUtilities.dp(9.0f);
        this.v = AndroidUtilities.dp(12.0f);
        this.f31784x = true;
        this.F = new int[0];
        this.J = new ArrayList();
        this.K = new ArrayList();
        new Path();
        this.L = new Path();
        this.M = new RectF();
        this.N = new float[8];
        this.P = new ArrayList();
        this.f31776a = s9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.O = p01Var;
        o01 o01Var = new o01(this, this);
        this.Q = o01Var;
        r0.i0.k(this, o01Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(b10.u(str, ". "));
    }

    public static void j(l01 l01Var, int i10, int i11, int i12, int i13) {
        k01 k01Var = new k01(i10, i11 + i10);
        n01 n01Var = l01Var.f30012a;
        l01Var.f30012a = new n01(n01Var.f30791a, k01Var, n01Var.f30793c, n01Var.d);
        k01 k01Var2 = new k01(i12, i13 + i12);
        n01 n01Var2 = l01Var.f30013b;
        l01Var.f30013b = new n01(n01Var2.f30791a, k01Var2, n01Var2.f30793c, n01Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        j01 j01Var = new j01(this, arrayList.size());
        l01 l01Var = new l01();
        k01 k01Var = new k01(i11, i13 + i11);
        c01 c01Var = U;
        l01Var.f30012a = new n01(false, k01Var, c01Var, 0.0f);
        l01Var.f30013b = new n01(false, new k01(i10, i12 + i10), c01Var, 0.0f);
        j01Var.f29418a = l01Var;
        j01Var.f29424j = i11;
        arrayList.add(j01Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        int i13;
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        j01 j01Var = new j01(this, arrayList.size());
        j01Var.f29420c = pagetablecell;
        l01 l01Var = new l01();
        int i14 = pagetablecell.rowspan;
        if (i14 == 0) {
            i14 = 1;
        }
        k01 k01Var = new k01(i11, i14 + i11);
        c01 c01Var = U;
        l01Var.f30012a = new n01(false, k01Var, c01Var, 0.0f);
        l01Var.f30013b = new n01(false, new k01(i10, i12 + i10), c01Var, 1.0f);
        j01Var.f29418a = l01Var;
        j01Var.f29424j = i11;
        arrayList.add(j01Var);
        if (pagetablecell.rowspan > 1) {
            this.K.add(new PointF(i11, i11 + i13));
        }
        h();
    }

    public final void c() {
        boolean z10;
        g01 g01Var;
        n01 n01Var;
        n01 n01Var2;
        Throwable th2;
        int i10;
        int i11 = this.f31780n;
        if (i11 == 0) {
            if (this.e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                g01Var = this.f31778c;
            } else {
                g01Var = this.d;
            }
            int i12 = g01Var.f28363b;
            if (i12 == Integer.MIN_VALUE) {
                i12 = 0;
            }
            if (i12 >= 0 && i12 <= 1024) {
                int[] iArr = new int[i12];
                int childCount = getChildCount();
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    l01 l01Var = d(i15).f29418a;
                    if (z10) {
                        n01Var = l01Var.f30012a;
                    } else {
                        n01Var = l01Var.f30013b;
                    }
                    k01 k01Var = n01Var.f30792b;
                    boolean z11 = n01Var.f30791a;
                    int a2 = k01Var.a();
                    if (a2 > 0 && a2 <= 1024) {
                        if (z11) {
                            i13 = k01Var.f29767a;
                        }
                        if (z10) {
                            n01Var2 = l01Var.f30013b;
                        } else {
                            n01Var2 = l01Var.f30012a;
                        }
                        k01 k01Var2 = n01Var2.f30792b;
                        int a10 = k01Var2.a();
                        int i16 = k01Var2.f29767a;
                        if (a10 > 0) {
                            th2 = null;
                            if (k01Var2.a() <= 1024) {
                                boolean z12 = n01Var2.f30791a;
                                int a11 = k01Var2.a();
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
                                    j(l01Var, i13, a2, i14, a11);
                                } else {
                                    j(l01Var, i14, a11, i13, a2);
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
                    i19 = (i19 * 31) + d(i20).f29418a.hashCode();
                }
                this.f31780n = i19;
                return;
            }
            g("Table grid count out of bounds");
            throw null;
        }
        int childCount3 = getChildCount();
        int i21 = 1;
        for (int i22 = 0; i22 < childCount3; i22++) {
            i21 = (i21 * 31) + d(i22).f29418a.hashCode();
        }
        if (i11 != i21) {
            h();
            c();
        }
    }

    public final j01 d(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                return (j01) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        o01 o01Var = this.Q;
        if (o01Var != null && o01Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(j01 j01Var, boolean z10, boolean z11) {
        g01 g01Var;
        int[] iArr;
        n01 n01Var;
        int i10;
        if (this.h == 1) {
            return f(j01Var, z10, z11);
        }
        if (z10) {
            g01Var = this.f31778c;
        } else {
            g01Var = this.d;
        }
        if (z11) {
            if (g01Var.f28368j == null) {
                g01Var.f28368j = new int[g01Var.e() + 1];
            }
            if (!g01Var.f28369k) {
                g01Var.b(true);
                g01Var.f28369k = true;
            }
            iArr = g01Var.f28368j;
        } else {
            if (g01Var.f28370l == null) {
                g01Var.f28370l = new int[g01Var.e() + 1];
            }
            if (!g01Var.f28371m) {
                g01Var.b(false);
                g01Var.f28371m = true;
            }
            iArr = g01Var.f28370l;
        }
        l01 l01Var = j01Var.f29418a;
        if (z10) {
            n01Var = l01Var.f30013b;
        } else {
            n01Var = l01Var.f30012a;
        }
        k01 k01Var = n01Var.f30792b;
        if (z11) {
            i10 = k01Var.f29767a;
        } else {
            i10 = k01Var.f29768b;
        }
        return iArr[i10];
    }

    public final int f(j01 j01Var, boolean z10, boolean z11) {
        int i10;
        n01 n01Var;
        g01 g01Var;
        boolean z12;
        l01 l01Var = j01Var.f29418a;
        if (z10) {
            if (z11) {
                i10 = ((ViewGroup.MarginLayoutParams) l01Var).leftMargin;
            } else {
                i10 = ((ViewGroup.MarginLayoutParams) l01Var).rightMargin;
            }
        } else if (z11) {
            i10 = ((ViewGroup.MarginLayoutParams) l01Var).topMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) l01Var).bottomMargin;
        }
        if (i10 == Integer.MIN_VALUE) {
            if (!this.f31779f) {
                return 0;
            }
            if (z10) {
                n01Var = l01Var.f30013b;
            } else {
                n01Var = l01Var.f30012a;
            }
            if (z10) {
                g01Var = this.f31778c;
            } else {
                g01Var = this.d;
            }
            k01 k01Var = n01Var.f30792b;
            if (z10 && this.I) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != z11) {
                int i11 = k01Var.f29767a;
                return 0;
            }
            int i12 = k01Var.f29768b;
            g01Var.e();
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
        return this.f31778c.e();
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
        return this.f31779f;
    }

    public final void h() {
        this.f31780n = 0;
        g01 g01Var = this.f31778c;
        g01Var.k();
        g01 g01Var2 = this.d;
        g01Var2.k();
        if (g01Var != null && g01Var2 != null) {
            g01Var.l();
            g01Var2.l();
        }
    }

    public final void i(int i10, boolean z10) {
        boolean z11;
        n01 n01Var;
        g01 g01Var;
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            j01 d = d(i14);
            l01 l01Var = d.f29418a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                if (this.f31777b == 2) {
                    i12 = ((int) (size / 2.0f)) - (this.v * 4);
                } else {
                    i12 = (int) (size / 1.5f);
                }
                d.e(this.O.createTextLayout(d.f29420c, i12));
                if (d.f29419b != null) {
                    ((ViewGroup.MarginLayoutParams) l01Var).height = Math.max(this.f31783w, d.f29421f + this.f31781r + this.f31782s);
                    int emojiOnlyCount = d.f29419b.getEmojiOnlyCount();
                    if (emojiOnlyCount > 0) {
                        i13 = ((ViewGroup.MarginLayoutParams) l01Var).height * emojiOnlyCount;
                    } else {
                        i13 = (this.v * 2) + d.e;
                    }
                    ((ViewGroup.MarginLayoutParams) l01Var).width = i13;
                } else {
                    ((ViewGroup.MarginLayoutParams) l01Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) l01Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) l01Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) l01Var).height, true);
            } else {
                if (this.e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    n01Var = l01Var.f30013b;
                } else {
                    n01Var = l01Var.f30012a;
                }
                if (n01.a(n01Var, z11) == U) {
                    k01 k01Var = n01Var.f30792b;
                    if (z11) {
                        g01Var = this.f31778c;
                    } else {
                        g01Var = this.d;
                    }
                    int[] g7 = g01Var.g();
                    int e = (g7[k01Var.f29768b] - g7[k01Var.f29767a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        i01 i01Var = d.f29419b;
                        if (i01Var != null) {
                            i11 = i01Var.getEmojiOnlyCount();
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            int max = Math.max(1, Math.round(e / i11));
                            ((ViewGroup.MarginLayoutParams) l01Var).height = max;
                            d.f29427m = max;
                        }
                        d.d(e(d, true, false) + e(d, true, true) + e, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) l01Var).height, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) l01Var).width, e(d, false, false) + e(d, false, true) + e, false);
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
        q01 q01Var = this;
        q01Var.c();
        g01 g01Var = q01Var.d;
        g01 g01Var2 = q01Var.f31778c;
        if (g01Var2 != null && g01Var != null) {
            g01Var2.l();
            g01Var.l();
        }
        q01Var.f31777b = 0;
        int childCount = q01Var.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            q01Var.f31777b = Math.max(q01Var.f31777b, q01Var.d(i17).f29418a.f30013b.f30792b.f29768b);
        }
        q01Var.i(i10, true);
        if (q01Var.e == 0) {
            i12 = g01Var2.i(i10);
            if (q01Var.f31784x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                g01Var2.v.f30351a = i12;
                g01Var2.f28380w.f30351a = -i12;
                g01Var2.f28375q = false;
                g01Var2.g();
            }
            q01Var.i(i10, false);
            i13 = g01Var.i(i11);
        } else {
            int i18 = g01Var.i(i11);
            q01Var.i(i10, false);
            i12 = g01Var2.i(i10);
            i13 = i18;
        }
        int max = Math.max(i13, q01Var.getSuggestedMinimumHeight());
        q01Var.setMeasuredDimension(i12, max);
        g01Var2.v.f30351a = i12;
        g01Var2.f28380w.f30351a = -i12;
        g01Var2.f28375q = false;
        g01Var2.g();
        g01Var.v.f30351a = max;
        g01Var.f28380w.f30351a = -max;
        g01Var.f28375q = false;
        g01Var.g();
        int[] g7 = g01Var2.g();
        int[] g10 = g01Var.g();
        int[] copyOf = Arrays.copyOf(g10, g10.length);
        ArrayList arrayList = q01Var.J;
        arrayList.clear();
        int i19 = g7[g7.length - 1];
        int childCount2 = q01Var.getChildCount();
        int i20 = 0;
        while (i20 < childCount2) {
            int i21 = i20;
            j01 d = q01Var.d(i21);
            l01 l01Var = d.f29418a;
            n01 n01Var = l01Var.f30013b;
            n01 n01Var2 = l01Var.f30012a;
            k01 k01Var = n01Var.f30792b;
            k01 k01Var2 = n01Var2.f30792b;
            int i22 = childCount2;
            int i23 = g7[k01Var.f29767a];
            int i24 = g10[k01Var2.f29767a];
            int i25 = g7[k01Var.f29768b] - i23;
            int i26 = g10[k01Var2.f29768b] - i24;
            int i27 = d.f29425k;
            g01 g01Var3 = g01Var;
            int i28 = d.f29426l;
            gb1 a2 = n01.a(n01Var, true);
            gb1 a10 = n01.a(n01Var2, false);
            k6.c f7 = g01Var2.f();
            h01 h01Var = (h01) ((Object[]) f7.d)[((int[]) f7.f16406b)[i21]];
            k6.c f10 = g01Var3.f();
            g01 g01Var4 = g01Var2;
            h01 h01Var2 = (h01) ((Object[]) f10.d)[((int[]) f10.f16406b)[i21]];
            int H = a2.H(d, i25 - h01Var.d(true));
            int H2 = a10.H(d, i26 - h01Var2.d(true));
            int e = q01Var.e(d, true, true);
            int e10 = q01Var.e(d, false, true);
            int e11 = q01Var.e(d, true, false);
            int i29 = e + e11;
            int e12 = e10 + q01Var.e(d, false, false);
            int a11 = h01Var.a(q01Var, d, a2, i27 + i29, true);
            q01Var = this;
            int a12 = h01Var2.a(q01Var, d, a10, i28 + e12, false);
            int J = a2.J(i27, i25 - i29);
            int J2 = a10.J(i28, i26 - e12);
            int i30 = i23 + H + a11;
            if (!q01Var.I) {
                i15 = e + i30;
            } else {
                i15 = ((i19 - J) - e11) - i30;
            }
            int i31 = i15;
            int i32 = i24 + H2 + a12 + e10;
            if (d.f29420c != null) {
                if (J != d.f29425k || J2 != d.f29426l) {
                    i16 = 0;
                    d.d(J, J2, false);
                } else {
                    i16 = 0;
                }
                int i33 = d.f29427m;
                if (i33 != 0 && i33 != J2) {
                    k01 k01Var3 = d.f29418a.f30012a.f30792b;
                    if (k01Var3.f29768b - k01Var3.f29767a <= 1) {
                        ArrayList arrayList2 = q01Var.K;
                        int size = arrayList2.size();
                        int i34 = i16;
                        while (true) {
                            if (i34 < size) {
                                PointF pointF = (PointF) arrayList2.get(i34);
                                float f11 = pointF.x;
                                float f12 = d.f29418a.f30012a.f30792b.f29767a;
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
            d.f29430p = i31;
            d.f29431q = i32;
            i20 = i21 + 1;
            g01Var = g01Var3;
            childCount2 = i22;
            g01Var2 = g01Var4;
        }
        int size2 = arrayList.size();
        int i35 = 0;
        while (i35 < size2) {
            j01 j01Var = (j01) arrayList.get(i35);
            int i36 = j01Var.f29426l;
            int i37 = j01Var.d;
            int i38 = i36 - j01Var.f29427m;
            ArrayList arrayList3 = q01Var.P;
            int size3 = arrayList3.size();
            for (int i39 = i37 + 1; i39 < size3; i39++) {
                j01 j01Var2 = (j01) arrayList3.get(i39);
                if (j01Var.f29418a.f30012a.f30792b.f29767a != j01Var2.f29418a.f30012a.f30792b.f29767a) {
                    break;
                }
                int i40 = j01Var.f29427m;
                int i41 = j01Var2.f29427m;
                if (i40 < i41) {
                    z10 = true;
                    break;
                }
                int i42 = j01Var2.f29426l - i41;
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
                    j01 j01Var3 = (j01) arrayList3.get(i43);
                    if (j01Var.f29418a.f30012a.f30792b.f29767a != j01Var3.f29418a.f30012a.f30792b.f29767a) {
                        break;
                    }
                    int i44 = j01Var.f29427m;
                    int i45 = j01Var3.f29427m;
                    if (i44 < i45) {
                        z10 = true;
                        break;
                    }
                    int i46 = j01Var3.f29426l - i45;
                    if (i46 > 0) {
                        i38 = Math.min(i38, i46);
                    }
                    i43--;
                }
            }
            if (!z10) {
                j01Var.f29426l = j01Var.f29427m;
                j01Var.g();
                max -= i38;
                int i47 = j01Var.f29418a.f30012a.f30792b.f29767a;
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
                    j01 j01Var4 = (j01) arrayList3.get(i50);
                    if (j01Var == j01Var4) {
                        i14 = i50;
                    } else {
                        int i51 = j01Var.f29418a.f30012a.f30792b.f29767a;
                        int i52 = j01Var4.f29418a.f30012a.f30792b.f29767a;
                        if (i51 == i52) {
                            if (j01Var4.f29427m != j01Var4.f29426l) {
                                arrayList.remove(j01Var4);
                                if (j01Var4.d < i37) {
                                    i49--;
                                }
                                i48--;
                            }
                            int i53 = j01Var4.f29426l - i38;
                            j01Var4.f29426l = i53;
                            i14 = i50;
                            j01Var4.d(j01Var4.f29425k, i53, true);
                        } else {
                            i14 = i50;
                            if (i51 < i52) {
                                j01Var4.f29431q -= i38;
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
        int childCount3 = q01Var.getChildCount();
        for (int i54 = 0; i54 < childCount3; i54++) {
            j01 d10 = q01Var.d(i54);
            q01Var.O.onLayoutChild(d10.f29419b, d10.b(), d10.c());
            d10.f29428n = d10.f29430p;
            d10.f29429o = d10.f29425k;
        }
        q01Var.f31785y = i19;
        q01Var.E = max;
        q01Var.F = copyOf;
        q01Var.setMeasuredDimension(i19, max);
    }

    @Override
    public final void requestLayout() {
        g01 g01Var;
        super.requestLayout();
        g01 g01Var2 = this.f31778c;
        if (g01Var2 != null && (g01Var = this.d) != null) {
            g01Var2.l();
            g01Var.l();
        }
    }

    public void setAlignmentMode(int i10) {
        this.h = i10;
        requestLayout();
    }

    public void setColumnCount(int i10) {
        this.f31778c.n(i10);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        g01 g01Var = this.f31778c;
        g01Var.f28379u = z10;
        g01Var.k();
        h();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.G = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.f31784x == z10) {
            return;
        }
        this.f31784x = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i10) {
        this.f31783w = i10;
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
        this.f31785y = Math.max(measuredWidth, i10);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            j01 d = d(i13);
            if (measuredWidth > 0 && (i12 = this.f31785y) != measuredWidth) {
                float f7 = measuredWidth;
                int round = Math.round((d.f29428n * i12) / f7);
                int round2 = Math.round(((d.f29428n + d.f29429o) * this.f31785y) / f7);
                d.f29430p = round;
                d.f29425k = Math.max(0, round2 - round);
                if (d.f29420c != null && d.f29419b != null) {
                    d.f();
                }
            } else {
                int i14 = d.f29428n;
                d.f29430p = i14;
                d.f29425k = Math.max(0, (d.f29429o + i14) - i14);
                if (d.f29420c != null && d.f29419b != null) {
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
                j01 d10 = d(i18);
                i01 i01Var = d10.f29419b;
                if (i01Var != null) {
                    i11 = i01Var.getEmojiOnlyCount();
                } else {
                    i11 = 0;
                }
                if (i11 > 0) {
                    k01 k01Var = d10.f29418a.f30012a.f30792b;
                    int max = Math.max(0, k01Var.f29767a);
                    int min = Math.min(i15, k01Var.f29768b);
                    if (max < min) {
                        int i19 = 0;
                        for (int i20 = max; i20 < min; i20++) {
                            i19 += iArr2[i20];
                        }
                        int max2 = Math.max(1, Math.round(d10.f29425k / i11)) - i19;
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
                j01 d11 = d(i25);
                k01 k01Var2 = d11.f29418a.f30012a.f30792b;
                int max3 = Math.max(0, Math.min(i15, k01Var2.f29767a));
                int max4 = Math.max(max3, Math.min(i15, k01Var2.f29768b));
                int i26 = iArr4[max3];
                int i27 = iArr4[max4];
                d11.f29431q = i26;
                d11.f29426l = Math.max(0, i27 - i26);
                if (d11.f29420c != null) {
                    d11.g();
                }
                this.O.onLayoutChild(d11.f29419b, d11.b(), d11.c());
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
        g01 g01Var = this.d;
        g01Var.f28379u = z10;
        g01Var.k();
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
        this.f31779f = z10;
        requestLayout();
    }
}
