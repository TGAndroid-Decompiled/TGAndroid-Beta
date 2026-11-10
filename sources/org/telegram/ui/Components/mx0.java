package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.tl.TL_iv;
public final class mx0 extends View {
    public static final yw0 S = new yw0(0);
    public static final yw0 T = new yw0(1);
    public static final yw0 U = new yw0(3);
    public static final yw0 V = new yw0(4);
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
    public final lx0 O;
    public final ArrayList P;
    public boolean Q;
    public final kx0 R;
    public final org.telegram.ui.Cells.i9 f36112a;
    public int f36113b;
    public final cx0 f36114c;
    public final cx0 d;
    public int f36115e;
    public boolean f36116f;
    public int h;
    public int f36117n;
    public int f36118r;
    public int f36119s;
    public int f36120w;
    public int f36121x;
    public boolean f36122y;

    public mx0(Context context, lx0 lx0Var, org.telegram.ui.Cells.i9 i9Var) {
        super(context);
        this.f36114c = new cx0(this, true);
        this.d = new cx0(this, false);
        this.f36115e = 0;
        this.f36116f = false;
        this.h = 1;
        this.f36117n = 0;
        this.f36118r = org.telegram.messenger.g0.L(8.0f);
        this.f36119s = org.telegram.messenger.g0.L(9.0f);
        this.f36120w = org.telegram.messenger.g0.L(12.0f);
        this.f36122y = true;
        this.F = new int[0];
        this.J = new ArrayList();
        this.K = new ArrayList();
        new Path();
        this.L = new Path();
        this.M = new RectF();
        this.N = new float[8];
        this.P = new ArrayList();
        this.f36112a = i9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.O = lx0Var;
        kx0 kx0Var = new kx0(this, this);
        this.R = kx0Var;
        r0.i0.j(this, kx0Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(rf.b.r(str, ". "));
    }

    public static void k(hx0 hx0Var, int i7, int i10, int i11, int i12) {
        gx0 gx0Var = new gx0(i7, i10 + i7);
        jx0 jx0Var = hx0Var.f34478a;
        hx0Var.f34478a = new jx0(jx0Var.f35102a, gx0Var, jx0Var.f35104c, jx0Var.d);
        gx0 gx0Var2 = new gx0(i11, i12 + i11);
        jx0 jx0Var2 = hx0Var.f34479b;
        hx0Var.f34479b = new jx0(jx0Var2.f35102a, gx0Var2, jx0Var2.f35104c, jx0Var2.d);
    }

    public final void a(int i7, int i10, int i11, int i12) {
        ArrayList arrayList = this.P;
        fx0 fx0Var = new fx0(this, arrayList.size());
        hx0 hx0Var = new hx0();
        gx0 gx0Var = new gx0(i10, i12 + i10);
        yw0 yw0Var = V;
        hx0Var.f34478a = new jx0(false, gx0Var, yw0Var, 0.0f);
        hx0Var.f34479b = new jx0(false, new gx0(i7, i11 + i7), yw0Var, 0.0f);
        fx0Var.f33664a = hx0Var;
        fx0Var.f33671j = i10;
        arrayList.add(fx0Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i7, int i10, int i11) {
        int i12;
        if (i11 == 0) {
            i11 = 1;
        }
        ArrayList arrayList = this.P;
        fx0 fx0Var = new fx0(this, arrayList.size());
        fx0Var.f33666c = pagetablecell;
        hx0 hx0Var = new hx0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        gx0 gx0Var = new gx0(i10, i13 + i10);
        yw0 yw0Var = V;
        hx0Var.f34478a = new jx0(false, gx0Var, yw0Var, 0.0f);
        hx0Var.f34479b = new jx0(false, new gx0(i7, i11 + i7), yw0Var, 1.0f);
        fx0Var.f33664a = hx0Var;
        fx0Var.f33671j = i10;
        arrayList.add(fx0Var);
        if (pagetablecell.rowspan > 1) {
            this.K.add(new PointF(i10, i10 + i12));
        }
        h();
    }

    public final void c() {
        boolean z9;
        cx0 cx0Var;
        jx0 jx0Var;
        jx0 jx0Var2;
        Throwable th2;
        int i7;
        int i10 = this.f36117n;
        if (i10 == 0) {
            if (this.f36115e == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                cx0Var = this.f36114c;
            } else {
                cx0Var = this.d;
            }
            int i11 = cx0Var.f32779b;
            if (i11 == Integer.MIN_VALUE) {
                i11 = 0;
            }
            if (i11 >= 0 && i11 <= 1024) {
                int[] iArr = new int[i11];
                int childCount = getChildCount();
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < childCount; i14++) {
                    hx0 hx0Var = d(i14).f33664a;
                    if (z9) {
                        jx0Var = hx0Var.f34478a;
                    } else {
                        jx0Var = hx0Var.f34479b;
                    }
                    gx0 gx0Var = jx0Var.f35103b;
                    boolean z10 = jx0Var.f35102a;
                    int a10 = gx0Var.a();
                    if (a10 > 0 && a10 <= 1024) {
                        if (z10) {
                            i12 = gx0Var.f34004a;
                        }
                        if (z9) {
                            jx0Var2 = hx0Var.f34479b;
                        } else {
                            jx0Var2 = hx0Var.f34478a;
                        }
                        gx0 gx0Var2 = jx0Var2.f35103b;
                        int a11 = gx0Var2.a();
                        int i15 = gx0Var2.f34004a;
                        if (a11 > 0) {
                            th2 = null;
                            if (gx0Var2.a() <= 1024) {
                                boolean z11 = jx0Var2.f35102a;
                                int a12 = gx0Var2.a();
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
                                    k(hx0Var, i12, a10, i13, a12);
                                } else {
                                    k(hx0Var, i13, a12, i12, a10);
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
                    i18 = (i18 * 31) + d(i19).f33664a.hashCode();
                }
                this.f36117n = i18;
                return;
            }
            g("Table grid count out of bounds");
            throw null;
        }
        int childCount3 = getChildCount();
        int i20 = 1;
        for (int i21 = 0; i21 < childCount3; i21++) {
            i20 = (i20 * 31) + d(i21).f33664a.hashCode();
        }
        if (i10 != i20) {
            h();
            c();
        }
    }

    public final fx0 d(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.P;
            if (i7 < arrayList.size()) {
                return (fx0) arrayList.get(i7);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        kx0 kx0Var = this.R;
        if (kx0Var != null && kx0Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(fx0 fx0Var, boolean z9, boolean z10) {
        cx0 cx0Var;
        int[] iArr;
        jx0 jx0Var;
        int i7;
        if (this.h == 1) {
            return f(fx0Var, z9, z10);
        }
        if (z9) {
            cx0Var = this.f36114c;
        } else {
            cx0Var = this.d;
        }
        if (z10) {
            if (cx0Var.f32785j == null) {
                cx0Var.f32785j = new int[cx0Var.e() + 1];
            }
            if (!cx0Var.f32786k) {
                cx0Var.b(true);
                cx0Var.f32786k = true;
            }
            iArr = cx0Var.f32785j;
        } else {
            if (cx0Var.f32787l == null) {
                cx0Var.f32787l = new int[cx0Var.e() + 1];
            }
            if (!cx0Var.f32788m) {
                cx0Var.b(false);
                cx0Var.f32788m = true;
            }
            iArr = cx0Var.f32787l;
        }
        hx0 hx0Var = fx0Var.f33664a;
        if (z9) {
            jx0Var = hx0Var.f34479b;
        } else {
            jx0Var = hx0Var.f34478a;
        }
        gx0 gx0Var = jx0Var.f35103b;
        if (z10) {
            i7 = gx0Var.f34004a;
        } else {
            i7 = gx0Var.f34005b;
        }
        return iArr[i7];
    }

    public final int f(fx0 fx0Var, boolean z9, boolean z10) {
        int i7;
        jx0 jx0Var;
        cx0 cx0Var;
        boolean z11;
        hx0 hx0Var = fx0Var.f33664a;
        if (z9) {
            if (z10) {
                i7 = ((ViewGroup.MarginLayoutParams) hx0Var).leftMargin;
            } else {
                i7 = ((ViewGroup.MarginLayoutParams) hx0Var).rightMargin;
            }
        } else if (z10) {
            i7 = ((ViewGroup.MarginLayoutParams) hx0Var).topMargin;
        } else {
            i7 = ((ViewGroup.MarginLayoutParams) hx0Var).bottomMargin;
        }
        if (i7 == Integer.MIN_VALUE) {
            if (!this.f36116f) {
                return 0;
            }
            if (z9) {
                jx0Var = hx0Var.f34479b;
            } else {
                jx0Var = hx0Var.f34478a;
            }
            if (z9) {
                cx0Var = this.f36114c;
            } else {
                cx0Var = this.d;
            }
            gx0 gx0Var = jx0Var.f35103b;
            if (z9 && this.I) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 != z10) {
                int i10 = gx0Var.f34004a;
                return 0;
            }
            int i11 = gx0Var.f34005b;
            cx0Var.e();
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
        return this.f36114c.e();
    }

    public int getOrientation() {
        return this.f36115e;
    }

    public int getRenderHeight() {
        return this.E;
    }

    public int getRowCount() {
        return this.d.e();
    }

    public boolean getUseDefaultMargins() {
        return this.f36116f;
    }

    public final void h() {
        this.f36117n = 0;
        cx0 cx0Var = this.f36114c;
        cx0Var.k();
        cx0 cx0Var2 = this.d;
        cx0Var2.k();
        if (cx0Var != null && cx0Var2 != null) {
            cx0Var.l();
            cx0Var2.l();
        }
    }

    public final void i(fx0 fx0Var, int i7, int i10, boolean z9) {
        fx0Var.d(e(fx0Var, true, false) + e(fx0Var, true, true) + i7, e(fx0Var, false, false) + e(fx0Var, false, true) + i10, z9);
    }

    public final void j(int i7, boolean z9) {
        boolean z10;
        jx0 jx0Var;
        cx0 cx0Var;
        int i10;
        int i11;
        int i12;
        int i13;
        CharSequence charSequence;
        xw0 xw0Var;
        lx0 lx0Var = this.O;
        int i14 = 0;
        if (z9 && this.Q && this.f36115e == 0) {
            int childCount = getChildCount();
            int size = View.MeasureSpec.getSize(i7);
            int i15 = this.f36120w * 2;
            if (this.f36113b > 1) {
                i13 = Math.round(size * 0.8f);
            } else {
                i13 = size;
            }
            int max = Math.max(1, i13 - i15);
            ArrayList arrayList = new ArrayList(childCount);
            xw0[] xw0VarArr = new xw0[childCount];
            int i16 = 0;
            while (i16 < childCount) {
                fx0 d = d(i16);
                hx0 hx0Var = d.f33664a;
                gx0 gx0Var = hx0Var.f34479b.f35103b;
                d.e(lx0Var.c(d.f33666c, max));
                if (d.f33665b == null) {
                    ((ViewGroup.MarginLayoutParams) hx0Var).width = i14;
                    ((ViewGroup.MarginLayoutParams) hx0Var).height = i14;
                    i(d, i14, i14, true);
                } else {
                    ((ViewGroup.MarginLayoutParams) hx0Var).height = Math.max(this.f36121x, d.f33668f + this.f36118r + this.f36119s);
                    int b10 = d.f33665b.b();
                    if (b10 > 0) {
                        int i17 = gx0Var.f34004a;
                        int a10 = gx0Var.a();
                        int i18 = ((ViewGroup.MarginLayoutParams) hx0Var).height * b10;
                        ?? obj = new Object();
                        obj.f40419a = i17;
                        obj.f40420b = Math.max(1, a10);
                        obj.f40424g = true;
                        int max2 = Math.max(0, i18);
                        obj.f40422e = max2;
                        obj.d = max2;
                        xw0Var = obj;
                    } else {
                        Layout a11 = d.f33665b.a();
                        TextPaint textPaint = null;
                        if (a11 != null) {
                            charSequence = a11.getText();
                        } else {
                            charSequence = null;
                        }
                        if (a11 != null) {
                            textPaint = a11.getPaint();
                        }
                        xw0Var = c8.na.b(charSequence, textPaint, gx0Var.f34004a, gx0Var.a(), i15, max, d.f33667e);
                    }
                    xw0VarArr[i16] = xw0Var;
                    arrayList.add(xw0Var);
                }
                i16++;
                i14 = 0;
            }
            int[] a12 = c8.na.a(this.f36113b, size, 0, arrayList);
            for (int i19 = 0; i19 < childCount; i19++) {
                fx0 d2 = d(i19);
                xw0 xw0Var2 = xw0VarArr[i19];
                if (xw0Var2 != null) {
                    hx0 hx0Var2 = d2.f33664a;
                    if (d2.f33665b.b() > 0) {
                        ((ViewGroup.MarginLayoutParams) hx0Var2).width = xw0Var2.f40422e;
                    } else {
                        gx0 gx0Var2 = hx0Var2.f34479b.f35103b;
                        int i20 = 0;
                        for (int max3 = Math.max(0, gx0Var2.f34004a); max3 < Math.min(this.f36113b, gx0Var2.f34005b); max3++) {
                            i20 += a12[max3];
                        }
                        int max4 = Math.max(1, i20 - i15);
                        if (d2.f33667e > max4) {
                            d2.e(lx0Var.c(d2.f33666c, max4));
                            ((ViewGroup.MarginLayoutParams) hx0Var2).height = Math.max(this.f36121x, d2.f33668f + this.f36118r + this.f36119s);
                        }
                        ((ViewGroup.MarginLayoutParams) hx0Var2).width = d2.f33667e + i15;
                    }
                    i(d2, ((ViewGroup.MarginLayoutParams) hx0Var2).width, ((ViewGroup.MarginLayoutParams) hx0Var2).height, true);
                }
            }
            return;
        }
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            fx0 d10 = d(i21);
            hx0 hx0Var3 = d10.f33664a;
            if (z9) {
                int size2 = View.MeasureSpec.getSize(i7);
                if (this.f36113b == 2) {
                    i11 = ((int) (size2 / 2.0f)) - (this.f36120w * 4);
                } else {
                    i11 = (int) (size2 / 1.5f);
                }
                d10.e(lx0Var.c(d10.f33666c, i11));
                if (d10.f33665b != null) {
                    ((ViewGroup.MarginLayoutParams) hx0Var3).height = Math.max(this.f36121x, d10.f33668f + this.f36118r + this.f36119s);
                    int b11 = d10.f33665b.b();
                    if (b11 > 0) {
                        i12 = ((ViewGroup.MarginLayoutParams) hx0Var3).height * b11;
                    } else {
                        i12 = (this.f36120w * 2) + d10.f33667e;
                    }
                    ((ViewGroup.MarginLayoutParams) hx0Var3).width = i12;
                } else {
                    ((ViewGroup.MarginLayoutParams) hx0Var3).width = 0;
                    ((ViewGroup.MarginLayoutParams) hx0Var3).height = 0;
                }
                i(d10, ((ViewGroup.MarginLayoutParams) hx0Var3).width, ((ViewGroup.MarginLayoutParams) hx0Var3).height, true);
            } else {
                if (this.f36115e == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    jx0Var = hx0Var3.f34479b;
                } else {
                    jx0Var = hx0Var3.f34478a;
                }
                if (jx0.a(jx0Var, z10) == V) {
                    gx0 gx0Var3 = jx0Var.f35103b;
                    if (z10) {
                        cx0Var = this.f36114c;
                    } else {
                        cx0Var = this.d;
                    }
                    int[] g10 = cx0Var.g();
                    int e10 = (g10[gx0Var3.f34005b] - g10[gx0Var3.f34004a]) - (e(d10, z10, false) + e(d10, z10, true));
                    if (z10) {
                        ex0 ex0Var = d10.f33665b;
                        if (ex0Var != null) {
                            i10 = ex0Var.b();
                        } else {
                            i10 = 0;
                        }
                        if (i10 > 0) {
                            int max5 = Math.max(1, Math.round(e10 / i10));
                            ((ViewGroup.MarginLayoutParams) hx0Var3).height = max5;
                            d10.f33674m = max5;
                        }
                        i(d10, e10, ((ViewGroup.MarginLayoutParams) hx0Var3).height, false);
                    } else {
                        i(d10, ((ViewGroup.MarginLayoutParams) hx0Var3).width, e10, false);
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
        mx0 mx0Var = this;
        mx0Var.c();
        cx0 cx0Var = mx0Var.d;
        cx0 cx0Var2 = mx0Var.f36114c;
        if (cx0Var2 != null && cx0Var != null) {
            cx0Var2.l();
            cx0Var.l();
        }
        mx0Var.f36113b = 0;
        int childCount = mx0Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            mx0Var.f36113b = Math.max(mx0Var.f36113b, mx0Var.d(i16).f33664a.f34479b.f35103b.f34005b);
        }
        mx0Var.j(i7, true);
        if (mx0Var.f36115e == 0) {
            i11 = cx0Var2.i(i7);
            if (mx0Var.f36122y) {
                i11 = Math.max(i11, View.MeasureSpec.getSize(i7));
                cx0Var2.v.f34783a = i11;
                cx0Var2.f32797w.f34783a = -i11;
                cx0Var2.f32792q = false;
                cx0Var2.g();
            }
            mx0Var.j(i7, false);
            i12 = cx0Var.i(i10);
        } else {
            int i17 = cx0Var.i(i10);
            mx0Var.j(i7, false);
            i11 = cx0Var2.i(i7);
            i12 = i17;
        }
        int max = Math.max(i12, mx0Var.getSuggestedMinimumHeight());
        mx0Var.setMeasuredDimension(i11, max);
        cx0Var2.v.f34783a = i11;
        cx0Var2.f32797w.f34783a = -i11;
        cx0Var2.f32792q = false;
        cx0Var2.g();
        cx0Var.v.f34783a = max;
        cx0Var.f32797w.f34783a = -max;
        cx0Var.f32792q = false;
        cx0Var.g();
        int[] g10 = cx0Var2.g();
        int[] g11 = cx0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = mx0Var.J;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = mx0Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            fx0 d = mx0Var.d(i20);
            hx0 hx0Var = d.f33664a;
            jx0 jx0Var = hx0Var.f34479b;
            jx0 jx0Var2 = hx0Var.f34478a;
            gx0 gx0Var = jx0Var.f35103b;
            gx0 gx0Var2 = jx0Var2.f35103b;
            int i21 = childCount2;
            int i22 = g10[gx0Var.f34004a];
            int i23 = g11[gx0Var2.f34004a];
            int i24 = g10[gx0Var.f34005b] - i22;
            int i25 = g11[gx0Var2.f34005b] - i23;
            int i26 = d.f33672k;
            cx0 cx0Var3 = cx0Var;
            int i27 = d.f33673l;
            yw0 a10 = jx0.a(jx0Var, true);
            yw0 a11 = jx0.a(jx0Var2, false);
            h6.m f10 = cx0Var2.f();
            dx0 dx0Var = (dx0) ((Object[]) f10.d)[((int[]) f10.f14266b)[i20]];
            h6.m f11 = cx0Var3.f();
            cx0 cx0Var4 = cx0Var2;
            dx0 dx0Var2 = (dx0) ((Object[]) f11.d)[((int[]) f11.f14266b)[i20]];
            int b10 = a10.b(d, i24 - dx0Var.d(true));
            int b11 = a11.b(d, i25 - dx0Var2.d(true));
            int e10 = mx0Var.e(d, true, true);
            int e11 = mx0Var.e(d, false, true);
            int e12 = mx0Var.e(d, true, false);
            int i28 = e10 + e12;
            int e13 = e11 + mx0Var.e(d, false, false);
            int a12 = dx0Var.a(mx0Var, d, a10, i26 + i28, true);
            mx0Var = this;
            int a13 = dx0Var2.a(mx0Var, d, a11, i27 + e13, false);
            int c10 = a10.c(i26, i24 - i28);
            int c11 = a11.c(i27, i25 - e13);
            int i29 = i22 + b10 + a12;
            if (!mx0Var.I) {
                i14 = e10 + i29;
            } else {
                i14 = ((i18 - c10) - e12) - i29;
            }
            int i30 = i14;
            int i31 = i23 + b11 + a13 + e11;
            if (d.f33666c != null) {
                if (c10 != d.f33672k || c11 != d.f33673l) {
                    i15 = 0;
                    d.d(c10, c11, false);
                } else {
                    i15 = 0;
                }
                int i32 = d.f33674m;
                if (i32 != 0 && i32 != c11) {
                    gx0 gx0Var3 = d.f33664a.f34478a.f35103b;
                    if (gx0Var3.f34005b - gx0Var3.f34004a <= 1) {
                        ArrayList arrayList2 = mx0Var.K;
                        int size = arrayList2.size();
                        int i33 = i15;
                        while (true) {
                            if (i33 < size) {
                                PointF pointF = (PointF) arrayList2.get(i33);
                                float f12 = pointF.x;
                                float f13 = d.f33664a.f34478a.f35103b.f34004a;
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
            d.f33677p = i30;
            d.f33678q = i31;
            i19 = i20 + 1;
            cx0Var = cx0Var3;
            childCount2 = i21;
            cx0Var2 = cx0Var4;
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            fx0 fx0Var = (fx0) arrayList.get(i34);
            int i35 = fx0Var.f33673l;
            int i36 = fx0Var.d;
            int i37 = i35 - fx0Var.f33674m;
            ArrayList arrayList3 = mx0Var.P;
            int size3 = arrayList3.size();
            for (int i38 = i36 + 1; i38 < size3; i38++) {
                fx0 fx0Var2 = (fx0) arrayList3.get(i38);
                if (fx0Var.f33664a.f34478a.f35103b.f34004a != fx0Var2.f33664a.f34478a.f35103b.f34004a) {
                    break;
                }
                int i39 = fx0Var.f33674m;
                int i40 = fx0Var2.f33674m;
                if (i39 < i40) {
                    z9 = true;
                    break;
                }
                int i41 = fx0Var2.f33673l - i40;
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
                    fx0 fx0Var3 = (fx0) arrayList3.get(i42);
                    if (fx0Var.f33664a.f34478a.f35103b.f34004a != fx0Var3.f33664a.f34478a.f35103b.f34004a) {
                        break;
                    }
                    int i43 = fx0Var.f33674m;
                    int i44 = fx0Var3.f33674m;
                    if (i43 < i44) {
                        z9 = true;
                        break;
                    }
                    int i45 = fx0Var3.f33673l - i44;
                    if (i45 > 0) {
                        i37 = Math.min(i37, i45);
                    }
                    i42--;
                }
            }
            if (!z9) {
                fx0Var.f33673l = fx0Var.f33674m;
                fx0Var.g();
                max -= i37;
                int i46 = fx0Var.f33664a.f34478a.f35103b.f34004a;
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
                    fx0 fx0Var4 = (fx0) arrayList3.get(i49);
                    if (fx0Var == fx0Var4) {
                        i13 = i49;
                    } else {
                        int i50 = fx0Var.f33664a.f34478a.f35103b.f34004a;
                        int i51 = fx0Var4.f33664a.f34478a.f35103b.f34004a;
                        if (i50 == i51) {
                            if (fx0Var4.f33674m != fx0Var4.f33673l) {
                                arrayList.remove(fx0Var4);
                                if (fx0Var4.d < i36) {
                                    i48--;
                                }
                                i47--;
                            }
                            int i52 = fx0Var4.f33673l - i37;
                            fx0Var4.f33673l = i52;
                            i13 = i49;
                            fx0Var4.d(fx0Var4.f33672k, i52, true);
                        } else {
                            i13 = i49;
                            if (i50 < i51) {
                                fx0Var4.f33678q -= i37;
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
        int childCount3 = mx0Var.getChildCount();
        for (int i53 = 0; i53 < childCount3; i53++) {
            fx0 d2 = mx0Var.d(i53);
            mx0Var.O.g(d2.f33665b, d2.c());
            d2.f33675n = d2.f33677p;
            d2.f33676o = d2.f33672k;
        }
        mx0Var.D = i18;
        mx0Var.E = max;
        mx0Var.F = copyOf;
        mx0Var.setMeasuredDimension(i18, max);
    }

    @Override
    public final void requestLayout() {
        cx0 cx0Var;
        super.requestLayout();
        cx0 cx0Var2 = this.f36114c;
        if (cx0Var2 != null && (cx0Var = this.d) != null) {
            cx0Var2.l();
            cx0Var.l();
        }
    }

    public void setAlignmentMode(int i7) {
        this.h = i7;
        requestLayout();
    }

    public void setBalancedColumns(boolean z9) {
        if (this.Q == z9) {
            return;
        }
        this.Q = z9;
        requestLayout();
    }

    public void setColumnCount(int i7) {
        this.f36114c.n(i7);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z9) {
        cx0 cx0Var = this.f36114c;
        cx0Var.f32796u = z9;
        cx0Var.k();
        h();
        requestLayout();
    }

    public void setDrawLines(boolean z9) {
        this.G = z9;
    }

    public void setFillWidth(boolean z9) {
        if (this.f36122y == z9) {
            return;
        }
        this.f36122y = z9;
        requestLayout();
    }

    public void setMinimumCellHeight(int i7) {
        this.f36121x = i7;
        requestLayout();
    }

    public void setOrientation(int i7) {
        if (this.f36115e != i7) {
            this.f36115e = i7;
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
            fx0 d = d(i12);
            if (measuredWidth > 0 && (i11 = this.D) != measuredWidth) {
                float f10 = measuredWidth;
                int round = Math.round((d.f33675n * i11) / f10);
                int round2 = Math.round(((d.f33675n + d.f33676o) * this.D) / f10);
                d.f33677p = round;
                d.f33672k = Math.max(0, round2 - round);
                if (d.f33666c != null && d.f33665b != null) {
                    d.f();
                }
            } else {
                int i13 = d.f33675n;
                d.f33677p = i13;
                d.f33672k = Math.max(0, (d.f33676o + i13) - i13);
                if (d.f33666c != null && d.f33665b != null) {
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
                fx0 d2 = d(i17);
                ex0 ex0Var = d2.f33665b;
                if (ex0Var != null) {
                    i10 = ex0Var.b();
                } else {
                    i10 = 0;
                }
                if (i10 > 0) {
                    gx0 gx0Var = d2.f33664a.f34478a.f35103b;
                    int max = Math.max(0, gx0Var.f34004a);
                    int min = Math.min(i14, gx0Var.f34005b);
                    if (max < min) {
                        int i18 = 0;
                        for (int i19 = max; i19 < min; i19++) {
                            i18 += iArr2[i19];
                        }
                        int max2 = Math.max(1, Math.round(d2.f33672k / i10)) - i18;
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
                fx0 d10 = d(i24);
                gx0 gx0Var2 = d10.f33664a.f34478a.f35103b;
                int max3 = Math.max(0, Math.min(i14, gx0Var2.f34004a));
                int max4 = Math.max(max3, Math.min(i14, gx0Var2.f34005b));
                int i25 = iArr4[max3];
                int i26 = iArr4[max4];
                d10.f33678q = i25;
                d10.f33673l = Math.max(0, i26 - i25);
                if (d10.f33666c != null) {
                    d10.g();
                }
                this.O.g(d10.f33665b, d10.c());
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
        cx0 cx0Var = this.d;
        cx0Var.f32796u = z9;
        cx0Var.k();
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
        this.f36116f = z9;
        requestLayout();
    }
}
