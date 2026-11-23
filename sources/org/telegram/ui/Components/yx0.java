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
public final class yx0 extends View {
    public static final kx0 T = new kx0(0);
    public static final kx0 U = new kx0(1);
    public static final kx0 V = new kx0(3);
    public static final kx0 W = new kx0(4);
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
    public final xx0 P;
    public final ArrayList Q;
    public boolean R;
    public final wx0 S;
    public final org.telegram.ui.Cells.j9 f42581a;
    public int f42582b;
    public final ox0 f42583c;
    public final ox0 d;
    public int f42584e;
    public boolean f42585f;
    public int h;
    public int f42586n;
    public int f42587r;
    public int f42588s;
    public int f42589w;
    public int f42590x;
    public boolean f42591y;

    public yx0(Context context, xx0 xx0Var, org.telegram.ui.Cells.j9 j9Var) {
        super(context);
        this.f42583c = new ox0(this, true);
        this.d = new ox0(this, false);
        this.f42584e = 0;
        this.f42585f = false;
        this.h = 1;
        this.f42586n = 0;
        this.f42587r = org.telegram.messenger.g0.L(8.0f);
        this.f42588s = org.telegram.messenger.g0.L(9.0f);
        this.f42589w = org.telegram.messenger.g0.L(12.0f);
        this.f42591y = true;
        this.G = new int[0];
        this.K = new ArrayList();
        this.L = new ArrayList();
        new Path();
        this.M = new Path();
        this.N = new RectF();
        this.O = new float[8];
        this.Q = new ArrayList();
        this.f42581a = j9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.P = xx0Var;
        wx0 wx0Var = new wx0(this, this);
        this.S = wx0Var;
        r0.i0.j(this, wx0Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(p5.c.v(str, ". "));
    }

    public static void k(tx0 tx0Var, int i7, int i10, int i11, int i12) {
        sx0 sx0Var = new sx0(i7, i10 + i7);
        vx0 vx0Var = tx0Var.f40077a;
        tx0Var.f40077a = new vx0(vx0Var.f41585a, sx0Var, vx0Var.f41587c, vx0Var.d);
        sx0 sx0Var2 = new sx0(i11, i12 + i11);
        vx0 vx0Var2 = tx0Var.f40078b;
        tx0Var.f40078b = new vx0(vx0Var2.f41585a, sx0Var2, vx0Var2.f41587c, vx0Var2.d);
    }

    public final void a(int i7, int i10, int i11, int i12) {
        ArrayList arrayList = this.Q;
        rx0 rx0Var = new rx0(this, arrayList.size());
        tx0 tx0Var = new tx0();
        sx0 sx0Var = new sx0(i10, i12 + i10);
        kx0 kx0Var = W;
        tx0Var.f40077a = new vx0(false, sx0Var, kx0Var, 0.0f);
        tx0Var.f40078b = new vx0(false, new sx0(i7, i11 + i7), kx0Var, 0.0f);
        rx0Var.f39369a = tx0Var;
        rx0Var.f39376j = i10;
        arrayList.add(rx0Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i7, int i10, int i11) {
        int i12;
        if (i11 == 0) {
            i11 = 1;
        }
        ArrayList arrayList = this.Q;
        rx0 rx0Var = new rx0(this, arrayList.size());
        rx0Var.f39371c = pagetablecell;
        tx0 tx0Var = new tx0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        sx0 sx0Var = new sx0(i10, i13 + i10);
        kx0 kx0Var = W;
        tx0Var.f40077a = new vx0(false, sx0Var, kx0Var, 0.0f);
        tx0Var.f40078b = new vx0(false, new sx0(i7, i11 + i7), kx0Var, 1.0f);
        rx0Var.f39369a = tx0Var;
        rx0Var.f39376j = i10;
        arrayList.add(rx0Var);
        if (pagetablecell.rowspan > 1) {
            this.L.add(new PointF(i10, i10 + i12));
        }
        h();
    }

    public final void c() {
        boolean z10;
        ox0 ox0Var;
        vx0 vx0Var;
        vx0 vx0Var2;
        Throwable th2;
        int i7;
        int i10 = this.f42586n;
        if (i10 == 0) {
            if (this.f42584e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ox0Var = this.f42583c;
            } else {
                ox0Var = this.d;
            }
            int i11 = ox0Var.f38384b;
            if (i11 == Integer.MIN_VALUE) {
                i11 = 0;
            }
            if (i11 >= 0 && i11 <= 1024) {
                int[] iArr = new int[i11];
                int childCount = getChildCount();
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < childCount; i14++) {
                    tx0 tx0Var = d(i14).f39369a;
                    if (z10) {
                        vx0Var = tx0Var.f40077a;
                    } else {
                        vx0Var = tx0Var.f40078b;
                    }
                    sx0 sx0Var = vx0Var.f41586b;
                    boolean z11 = vx0Var.f41585a;
                    int a10 = sx0Var.a();
                    if (a10 > 0 && a10 <= 1024) {
                        if (z11) {
                            i12 = sx0Var.f39719a;
                        }
                        if (z10) {
                            vx0Var2 = tx0Var.f40078b;
                        } else {
                            vx0Var2 = tx0Var.f40077a;
                        }
                        sx0 sx0Var2 = vx0Var2.f41586b;
                        int a11 = sx0Var2.a();
                        int i15 = sx0Var2.f39719a;
                        if (a11 > 0) {
                            th2 = null;
                            if (sx0Var2.a() <= 1024) {
                                boolean z12 = vx0Var2.f41585a;
                                int a12 = sx0Var2.a();
                                if (i11 != 0) {
                                    if (z12) {
                                        i7 = Math.min(i15, i11);
                                    } else {
                                        i7 = 0;
                                    }
                                    a12 = Math.min(a12, i11 - i7);
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
                                    k(tx0Var, i12, a10, i13, a12);
                                } else {
                                    k(tx0Var, i13, a12, i12, a10);
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
                    i18 = (i18 * 31) + d(i19).f39369a.hashCode();
                }
                this.f42586n = i18;
                return;
            }
            g("Table grid count out of bounds");
            throw null;
        }
        int childCount3 = getChildCount();
        int i20 = 1;
        for (int i21 = 0; i21 < childCount3; i21++) {
            i20 = (i20 * 31) + d(i21).f39369a.hashCode();
        }
        if (i10 != i20) {
            h();
            c();
        }
    }

    public final rx0 d(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.Q;
            if (i7 < arrayList.size()) {
                return (rx0) arrayList.get(i7);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        wx0 wx0Var = this.S;
        if (wx0Var != null && wx0Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(rx0 rx0Var, boolean z10, boolean z11) {
        ox0 ox0Var;
        int[] iArr;
        vx0 vx0Var;
        int i7;
        if (this.h == 1) {
            return f(rx0Var, z10, z11);
        }
        if (z10) {
            ox0Var = this.f42583c;
        } else {
            ox0Var = this.d;
        }
        if (z11) {
            if (ox0Var.f38390j == null) {
                ox0Var.f38390j = new int[ox0Var.e() + 1];
            }
            if (!ox0Var.f38391k) {
                ox0Var.b(true);
                ox0Var.f38391k = true;
            }
            iArr = ox0Var.f38390j;
        } else {
            if (ox0Var.f38392l == null) {
                ox0Var.f38392l = new int[ox0Var.e() + 1];
            }
            if (!ox0Var.f38393m) {
                ox0Var.b(false);
                ox0Var.f38393m = true;
            }
            iArr = ox0Var.f38392l;
        }
        tx0 tx0Var = rx0Var.f39369a;
        if (z10) {
            vx0Var = tx0Var.f40078b;
        } else {
            vx0Var = tx0Var.f40077a;
        }
        sx0 sx0Var = vx0Var.f41586b;
        if (z11) {
            i7 = sx0Var.f39719a;
        } else {
            i7 = sx0Var.f39720b;
        }
        return iArr[i7];
    }

    public final int f(rx0 rx0Var, boolean z10, boolean z11) {
        int i7;
        vx0 vx0Var;
        ox0 ox0Var;
        boolean z12;
        tx0 tx0Var = rx0Var.f39369a;
        if (z10) {
            if (z11) {
                i7 = ((ViewGroup.MarginLayoutParams) tx0Var).leftMargin;
            } else {
                i7 = ((ViewGroup.MarginLayoutParams) tx0Var).rightMargin;
            }
        } else if (z11) {
            i7 = ((ViewGroup.MarginLayoutParams) tx0Var).topMargin;
        } else {
            i7 = ((ViewGroup.MarginLayoutParams) tx0Var).bottomMargin;
        }
        if (i7 == Integer.MIN_VALUE) {
            if (!this.f42585f) {
                return 0;
            }
            if (z10) {
                vx0Var = tx0Var.f40078b;
            } else {
                vx0Var = tx0Var.f40077a;
            }
            if (z10) {
                ox0Var = this.f42583c;
            } else {
                ox0Var = this.d;
            }
            sx0 sx0Var = vx0Var.f41586b;
            if (z10 && this.J) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != z11) {
                int i10 = sx0Var.f39719a;
                return 0;
            }
            int i11 = sx0Var.f39720b;
            ox0Var.e();
            return 0;
        }
        return i7;
    }

    public int getAlignmentMode() {
        return this.h;
    }

    public int getChildCount() {
        return this.Q.size();
    }

    public int getColumnCount() {
        return this.f42583c.e();
    }

    public int getOrientation() {
        return this.f42584e;
    }

    public int getRenderHeight() {
        return this.F;
    }

    public int getRowCount() {
        return this.d.e();
    }

    public boolean getUseDefaultMargins() {
        return this.f42585f;
    }

    public final void h() {
        this.f42586n = 0;
        ox0 ox0Var = this.f42583c;
        ox0Var.k();
        ox0 ox0Var2 = this.d;
        ox0Var2.k();
        if (ox0Var != null && ox0Var2 != null) {
            ox0Var.l();
            ox0Var2.l();
        }
    }

    public final void i(rx0 rx0Var, int i7, int i10, boolean z10) {
        rx0Var.d(e(rx0Var, true, false) + e(rx0Var, true, true) + i7, e(rx0Var, false, false) + e(rx0Var, false, true) + i10, z10);
    }

    public final void j(int i7, boolean z10) {
        boolean z11;
        vx0 vx0Var;
        ox0 ox0Var;
        int i10;
        int i11;
        int i12;
        int i13;
        CharSequence charSequence;
        jx0 jx0Var;
        xx0 xx0Var = this.P;
        int i14 = 0;
        if (z10 && this.R && this.f42584e == 0) {
            int childCount = getChildCount();
            int size = View.MeasureSpec.getSize(i7);
            int i15 = this.f42589w * 2;
            if (this.f42582b > 1) {
                i13 = Math.round(size * 0.8f);
            } else {
                i13 = size;
            }
            int max = Math.max(1, i13 - i15);
            ArrayList arrayList = new ArrayList(childCount);
            jx0[] jx0VarArr = new jx0[childCount];
            int i16 = 0;
            while (i16 < childCount) {
                rx0 d = d(i16);
                tx0 tx0Var = d.f39369a;
                sx0 sx0Var = tx0Var.f40078b.f41586b;
                d.e(xx0Var.c(d.f39371c, max));
                if (d.f39370b == null) {
                    ((ViewGroup.MarginLayoutParams) tx0Var).width = i14;
                    ((ViewGroup.MarginLayoutParams) tx0Var).height = i14;
                    i(d, i14, i14, true);
                } else {
                    ((ViewGroup.MarginLayoutParams) tx0Var).height = Math.max(this.f42590x, d.f39373f + this.f42587r + this.f42588s);
                    int b10 = d.f39370b.b();
                    if (b10 > 0) {
                        int i17 = sx0Var.f39719a;
                        int a10 = sx0Var.a();
                        int i18 = ((ViewGroup.MarginLayoutParams) tx0Var).height * b10;
                        ?? obj = new Object();
                        obj.f36705a = i17;
                        obj.f36706b = Math.max(1, a10);
                        obj.f36710g = true;
                        int max2 = Math.max(0, i18);
                        obj.f36708e = max2;
                        obj.d = max2;
                        jx0Var = obj;
                    } else {
                        Layout a11 = d.f39370b.a();
                        TextPaint textPaint = null;
                        if (a11 != null) {
                            charSequence = a11.getText();
                        } else {
                            charSequence = null;
                        }
                        if (a11 != null) {
                            textPaint = a11.getPaint();
                        }
                        jx0Var = c8.ta.b(charSequence, textPaint, sx0Var.f39719a, sx0Var.a(), i15, max, d.f39372e);
                    }
                    jx0VarArr[i16] = jx0Var;
                    arrayList.add(jx0Var);
                }
                i16++;
                i14 = 0;
            }
            int[] a12 = c8.ta.a(this.f42582b, size, 0, arrayList);
            for (int i19 = 0; i19 < childCount; i19++) {
                rx0 d2 = d(i19);
                jx0 jx0Var2 = jx0VarArr[i19];
                if (jx0Var2 != null) {
                    tx0 tx0Var2 = d2.f39369a;
                    if (d2.f39370b.b() > 0) {
                        ((ViewGroup.MarginLayoutParams) tx0Var2).width = jx0Var2.f36708e;
                    } else {
                        sx0 sx0Var2 = tx0Var2.f40078b.f41586b;
                        int i20 = 0;
                        for (int max3 = Math.max(0, sx0Var2.f39719a); max3 < Math.min(this.f42582b, sx0Var2.f39720b); max3++) {
                            i20 += a12[max3];
                        }
                        int max4 = Math.max(1, i20 - i15);
                        if (d2.f39372e > max4) {
                            d2.e(xx0Var.c(d2.f39371c, max4));
                            ((ViewGroup.MarginLayoutParams) tx0Var2).height = Math.max(this.f42590x, d2.f39373f + this.f42587r + this.f42588s);
                        }
                        ((ViewGroup.MarginLayoutParams) tx0Var2).width = d2.f39372e + i15;
                    }
                    i(d2, ((ViewGroup.MarginLayoutParams) tx0Var2).width, ((ViewGroup.MarginLayoutParams) tx0Var2).height, true);
                }
            }
            return;
        }
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            rx0 d10 = d(i21);
            tx0 tx0Var3 = d10.f39369a;
            if (z10) {
                int size2 = View.MeasureSpec.getSize(i7);
                if (this.f42582b == 2) {
                    i11 = ((int) (size2 / 2.0f)) - (this.f42589w * 4);
                } else {
                    i11 = (int) (size2 / 1.5f);
                }
                d10.e(xx0Var.c(d10.f39371c, i11));
                if (d10.f39370b != null) {
                    ((ViewGroup.MarginLayoutParams) tx0Var3).height = Math.max(this.f42590x, d10.f39373f + this.f42587r + this.f42588s);
                    int b11 = d10.f39370b.b();
                    if (b11 > 0) {
                        i12 = ((ViewGroup.MarginLayoutParams) tx0Var3).height * b11;
                    } else {
                        i12 = (this.f42589w * 2) + d10.f39372e;
                    }
                    ((ViewGroup.MarginLayoutParams) tx0Var3).width = i12;
                } else {
                    ((ViewGroup.MarginLayoutParams) tx0Var3).width = 0;
                    ((ViewGroup.MarginLayoutParams) tx0Var3).height = 0;
                }
                i(d10, ((ViewGroup.MarginLayoutParams) tx0Var3).width, ((ViewGroup.MarginLayoutParams) tx0Var3).height, true);
            } else {
                if (this.f42584e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    vx0Var = tx0Var3.f40078b;
                } else {
                    vx0Var = tx0Var3.f40077a;
                }
                if (vx0.a(vx0Var, z11) == W) {
                    sx0 sx0Var3 = vx0Var.f41586b;
                    if (z11) {
                        ox0Var = this.f42583c;
                    } else {
                        ox0Var = this.d;
                    }
                    int[] g10 = ox0Var.g();
                    int e10 = (g10[sx0Var3.f39720b] - g10[sx0Var3.f39719a]) - (e(d10, z11, false) + e(d10, z11, true));
                    if (z11) {
                        qx0 qx0Var = d10.f39370b;
                        if (qx0Var != null) {
                            i10 = qx0Var.b();
                        } else {
                            i10 = 0;
                        }
                        if (i10 > 0) {
                            int max5 = Math.max(1, Math.round(e10 / i10));
                            ((ViewGroup.MarginLayoutParams) tx0Var3).height = max5;
                            d10.f39379m = max5;
                        }
                        i(d10, e10, ((ViewGroup.MarginLayoutParams) tx0Var3).height, false);
                    } else {
                        i(d10, ((ViewGroup.MarginLayoutParams) tx0Var3).width, e10, false);
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        c();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        yx0 yx0Var = this;
        yx0Var.c();
        ox0 ox0Var = yx0Var.d;
        ox0 ox0Var2 = yx0Var.f42583c;
        if (ox0Var2 != null && ox0Var != null) {
            ox0Var2.l();
            ox0Var.l();
        }
        yx0Var.f42582b = 0;
        int childCount = yx0Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            yx0Var.f42582b = Math.max(yx0Var.f42582b, yx0Var.d(i16).f39369a.f40078b.f41586b.f39720b);
        }
        yx0Var.j(i7, true);
        if (yx0Var.f42584e == 0) {
            i11 = ox0Var2.i(i7);
            if (yx0Var.f42591y) {
                i11 = Math.max(i11, View.MeasureSpec.getSize(i7));
                ox0Var2.v.f40605a = i11;
                ox0Var2.f38402w.f40605a = -i11;
                ox0Var2.f38397q = false;
                ox0Var2.g();
            }
            yx0Var.j(i7, false);
            i12 = ox0Var.i(i10);
        } else {
            int i17 = ox0Var.i(i10);
            yx0Var.j(i7, false);
            i11 = ox0Var2.i(i7);
            i12 = i17;
        }
        int max = Math.max(i12, yx0Var.getSuggestedMinimumHeight());
        yx0Var.setMeasuredDimension(i11, max);
        ox0Var2.v.f40605a = i11;
        ox0Var2.f38402w.f40605a = -i11;
        ox0Var2.f38397q = false;
        ox0Var2.g();
        ox0Var.v.f40605a = max;
        ox0Var.f38402w.f40605a = -max;
        ox0Var.f38397q = false;
        ox0Var.g();
        int[] g10 = ox0Var2.g();
        int[] g11 = ox0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = yx0Var.K;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = yx0Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            rx0 d = yx0Var.d(i20);
            tx0 tx0Var = d.f39369a;
            vx0 vx0Var = tx0Var.f40078b;
            vx0 vx0Var2 = tx0Var.f40077a;
            sx0 sx0Var = vx0Var.f41586b;
            sx0 sx0Var2 = vx0Var2.f41586b;
            int i21 = childCount2;
            int i22 = g10[sx0Var.f39719a];
            int i23 = g11[sx0Var2.f39719a];
            int i24 = g10[sx0Var.f39720b] - i22;
            int i25 = g11[sx0Var2.f39720b] - i23;
            int i26 = d.f39377k;
            ox0 ox0Var3 = ox0Var;
            int i27 = d.f39378l;
            kx0 a10 = vx0.a(vx0Var, true);
            kx0 a11 = vx0.a(vx0Var2, false);
            h6.m f10 = ox0Var2.f();
            px0 px0Var = (px0) ((Object[]) f10.d)[((int[]) f10.f13968b)[i20]];
            h6.m f11 = ox0Var3.f();
            ox0 ox0Var4 = ox0Var2;
            px0 px0Var2 = (px0) ((Object[]) f11.d)[((int[]) f11.f13968b)[i20]];
            int b10 = a10.b(d, i24 - px0Var.d(true));
            int b11 = a11.b(d, i25 - px0Var2.d(true));
            int e10 = yx0Var.e(d, true, true);
            int e11 = yx0Var.e(d, false, true);
            int e12 = yx0Var.e(d, true, false);
            int i28 = e10 + e12;
            int e13 = e11 + yx0Var.e(d, false, false);
            int a12 = px0Var.a(yx0Var, d, a10, i26 + i28, true);
            yx0Var = this;
            int a13 = px0Var2.a(yx0Var, d, a11, i27 + e13, false);
            int c10 = a10.c(i26, i24 - i28);
            int c11 = a11.c(i27, i25 - e13);
            int i29 = i22 + b10 + a12;
            if (!yx0Var.J) {
                i14 = e10 + i29;
            } else {
                i14 = ((i18 - c10) - e12) - i29;
            }
            int i30 = i14;
            int i31 = i23 + b11 + a13 + e11;
            if (d.f39371c != null) {
                if (c10 != d.f39377k || c11 != d.f39378l) {
                    i15 = 0;
                    d.d(c10, c11, false);
                } else {
                    i15 = 0;
                }
                int i32 = d.f39379m;
                if (i32 != 0 && i32 != c11) {
                    sx0 sx0Var3 = d.f39369a.f40077a.f41586b;
                    if (sx0Var3.f39720b - sx0Var3.f39719a <= 1) {
                        ArrayList arrayList2 = yx0Var.L;
                        int size = arrayList2.size();
                        int i33 = i15;
                        while (true) {
                            if (i33 < size) {
                                PointF pointF = (PointF) arrayList2.get(i33);
                                float f12 = pointF.x;
                                float f13 = d.f39369a.f40077a.f41586b.f39719a;
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
            d.f39382p = i30;
            d.f39383q = i31;
            i19 = i20 + 1;
            ox0Var = ox0Var3;
            childCount2 = i21;
            ox0Var2 = ox0Var4;
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            rx0 rx0Var = (rx0) arrayList.get(i34);
            int i35 = rx0Var.f39378l;
            int i36 = rx0Var.d;
            int i37 = i35 - rx0Var.f39379m;
            ArrayList arrayList3 = yx0Var.Q;
            int size3 = arrayList3.size();
            for (int i38 = i36 + 1; i38 < size3; i38++) {
                rx0 rx0Var2 = (rx0) arrayList3.get(i38);
                if (rx0Var.f39369a.f40077a.f41586b.f39719a != rx0Var2.f39369a.f40077a.f41586b.f39719a) {
                    break;
                }
                int i39 = rx0Var.f39379m;
                int i40 = rx0Var2.f39379m;
                if (i39 < i40) {
                    z10 = true;
                    break;
                }
                int i41 = rx0Var2.f39378l - i40;
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
                    rx0 rx0Var3 = (rx0) arrayList3.get(i42);
                    if (rx0Var.f39369a.f40077a.f41586b.f39719a != rx0Var3.f39369a.f40077a.f41586b.f39719a) {
                        break;
                    }
                    int i43 = rx0Var.f39379m;
                    int i44 = rx0Var3.f39379m;
                    if (i43 < i44) {
                        z10 = true;
                        break;
                    }
                    int i45 = rx0Var3.f39378l - i44;
                    if (i45 > 0) {
                        i37 = Math.min(i37, i45);
                    }
                    i42--;
                }
            }
            if (!z10) {
                rx0Var.f39378l = rx0Var.f39379m;
                rx0Var.g();
                max -= i37;
                int i46 = rx0Var.f39369a.f40077a.f41586b.f39719a;
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
                    rx0 rx0Var4 = (rx0) arrayList3.get(i49);
                    if (rx0Var == rx0Var4) {
                        i13 = i49;
                    } else {
                        int i50 = rx0Var.f39369a.f40077a.f41586b.f39719a;
                        int i51 = rx0Var4.f39369a.f40077a.f41586b.f39719a;
                        if (i50 == i51) {
                            if (rx0Var4.f39379m != rx0Var4.f39378l) {
                                arrayList.remove(rx0Var4);
                                if (rx0Var4.d < i36) {
                                    i48--;
                                }
                                i47--;
                            }
                            int i52 = rx0Var4.f39378l - i37;
                            rx0Var4.f39378l = i52;
                            i13 = i49;
                            rx0Var4.d(rx0Var4.f39377k, i52, true);
                        } else {
                            i13 = i49;
                            if (i50 < i51) {
                                rx0Var4.f39383q -= i37;
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
        int childCount3 = yx0Var.getChildCount();
        for (int i53 = 0; i53 < childCount3; i53++) {
            rx0 d2 = yx0Var.d(i53);
            yx0Var.P.g(d2.f39370b, d2.c());
            d2.f39380n = d2.f39382p;
            d2.f39381o = d2.f39377k;
        }
        yx0Var.E = i18;
        yx0Var.F = max;
        yx0Var.G = copyOf;
        yx0Var.setMeasuredDimension(i18, max);
    }

    @Override
    public final void requestLayout() {
        ox0 ox0Var;
        super.requestLayout();
        ox0 ox0Var2 = this.f42583c;
        if (ox0Var2 != null && (ox0Var = this.d) != null) {
            ox0Var2.l();
            ox0Var.l();
        }
    }

    public void setAlignmentMode(int i7) {
        this.h = i7;
        requestLayout();
    }

    public void setBalancedColumns(boolean z10) {
        if (this.R == z10) {
            return;
        }
        this.R = z10;
        requestLayout();
    }

    public void setColumnCount(int i7) {
        this.f42583c.n(i7);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        ox0 ox0Var = this.f42583c;
        ox0Var.f38401u = z10;
        ox0Var.k();
        h();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.H = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.f42591y == z10) {
            return;
        }
        this.f42591y = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i7) {
        this.f42590x = i7;
        requestLayout();
    }

    public void setOrientation(int i7) {
        if (this.f42584e != i7) {
            this.f42584e = i7;
            h();
            requestLayout();
        }
    }

    public void setRenderWidth(int i7) {
        int i10;
        int i11;
        int measuredWidth = getMeasuredWidth();
        this.E = Math.max(measuredWidth, i7);
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            rx0 d = d(i12);
            if (measuredWidth > 0 && (i11 = this.E) != measuredWidth) {
                float f10 = measuredWidth;
                int round = Math.round((d.f39380n * i11) / f10);
                int round2 = Math.round(((d.f39380n + d.f39381o) * this.E) / f10);
                d.f39382p = round;
                d.f39377k = Math.max(0, round2 - round);
                if (d.f39371c != null && d.f39370b != null) {
                    d.f();
                }
            } else {
                int i13 = d.f39380n;
                d.f39382p = i13;
                d.f39377k = Math.max(0, (d.f39381o + i13) - i13);
                if (d.f39371c != null && d.f39370b != null) {
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
                rx0 d2 = d(i17);
                qx0 qx0Var = d2.f39370b;
                if (qx0Var != null) {
                    i10 = qx0Var.b();
                } else {
                    i10 = 0;
                }
                if (i10 > 0) {
                    sx0 sx0Var = d2.f39369a.f40077a.f41586b;
                    int max = Math.max(0, sx0Var.f39719a);
                    int min = Math.min(i14, sx0Var.f39720b);
                    if (max < min) {
                        int i18 = 0;
                        for (int i19 = max; i19 < min; i19++) {
                            i18 += iArr2[i19];
                        }
                        int max2 = Math.max(1, Math.round(d2.f39377k / i10)) - i18;
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
                rx0 d10 = d(i24);
                sx0 sx0Var2 = d10.f39369a.f40077a.f41586b;
                int max3 = Math.max(0, Math.min(i14, sx0Var2.f39719a));
                int max4 = Math.max(max3, Math.min(i14, sx0Var2.f39720b));
                int i25 = iArr4[max3];
                int i26 = iArr4[max4];
                d10.f39383q = i25;
                d10.f39378l = Math.max(0, i26 - i25);
                if (d10.f39371c != null) {
                    d10.g();
                }
                this.P.g(d10.f39370b, d10.c());
            }
        }
        invalidate();
    }

    public void setRowCount(int i7) {
        this.d.n(i7);
        h();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z10) {
        ox0 ox0Var = this.d;
        ox0Var.f38401u = z10;
        ox0Var.k();
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
        this.f42585f = z10;
        requestLayout();
    }
}
