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
public final class px0 extends View {
    public static final bx0 T = new bx0(0);
    public static final bx0 U = new bx0(1);
    public static final bx0 V = new bx0(3);
    public static final bx0 W = new bx0(4);
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
    public final ox0 P;
    public final ArrayList Q;
    public boolean R;
    public final nx0 S;
    public final org.telegram.ui.Cells.h9 f38423a;
    public int f38424b;
    public final fx0 f38425c;
    public final fx0 d;
    public int f38426e;
    public boolean f38427f;
    public int h;
    public int f38428n;
    public int f38429r;
    public int f38430s;
    public int f38431w;
    public int f38432x;
    public boolean f38433y;

    public px0(Context context, ox0 ox0Var, org.telegram.ui.Cells.h9 h9Var) {
        super(context);
        this.f38425c = new fx0(this, true);
        this.d = new fx0(this, false);
        this.f38426e = 0;
        this.f38427f = false;
        this.h = 1;
        this.f38428n = 0;
        this.f38429r = org.telegram.messenger.g0.L(8.0f);
        this.f38430s = org.telegram.messenger.g0.L(9.0f);
        this.f38431w = org.telegram.messenger.g0.L(12.0f);
        this.f38433y = true;
        this.G = new int[0];
        this.K = new ArrayList();
        this.L = new ArrayList();
        new Path();
        this.M = new Path();
        this.N = new RectF();
        this.O = new float[8];
        this.Q = new ArrayList();
        this.f38423a = h9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.P = ox0Var;
        nx0 nx0Var = new nx0(this, this);
        this.S = nx0Var;
        r0.i0.j(this, nx0Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(r.b.v(str, ". "));
    }

    public static void k(kx0 kx0Var, int i7, int i10, int i11, int i12) {
        jx0 jx0Var = new jx0(i7, i10 + i7);
        mx0 mx0Var = kx0Var.f36636a;
        kx0Var.f36636a = new mx0(mx0Var.f37401a, jx0Var, mx0Var.f37403c, mx0Var.d);
        jx0 jx0Var2 = new jx0(i11, i12 + i11);
        mx0 mx0Var2 = kx0Var.f36637b;
        kx0Var.f36637b = new mx0(mx0Var2.f37401a, jx0Var2, mx0Var2.f37403c, mx0Var2.d);
    }

    public final void a(int i7, int i10, int i11, int i12) {
        ArrayList arrayList = this.Q;
        ix0 ix0Var = new ix0(this, arrayList.size());
        kx0 kx0Var = new kx0();
        jx0 jx0Var = new jx0(i10, i12 + i10);
        bx0 bx0Var = W;
        kx0Var.f36636a = new mx0(false, jx0Var, bx0Var, 0.0f);
        kx0Var.f36637b = new mx0(false, new jx0(i7, i11 + i7), bx0Var, 0.0f);
        ix0Var.f35747a = kx0Var;
        ix0Var.f35754j = i10;
        arrayList.add(ix0Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i7, int i10, int i11) {
        int i12;
        if (i11 == 0) {
            i11 = 1;
        }
        ArrayList arrayList = this.Q;
        ix0 ix0Var = new ix0(this, arrayList.size());
        ix0Var.f35749c = pagetablecell;
        kx0 kx0Var = new kx0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        jx0 jx0Var = new jx0(i10, i13 + i10);
        bx0 bx0Var = W;
        kx0Var.f36636a = new mx0(false, jx0Var, bx0Var, 0.0f);
        kx0Var.f36637b = new mx0(false, new jx0(i7, i11 + i7), bx0Var, 1.0f);
        ix0Var.f35747a = kx0Var;
        ix0Var.f35754j = i10;
        arrayList.add(ix0Var);
        if (pagetablecell.rowspan > 1) {
            this.L.add(new PointF(i10, i10 + i12));
        }
        h();
    }

    public final void c() {
        boolean z10;
        fx0 fx0Var;
        mx0 mx0Var;
        mx0 mx0Var2;
        Throwable th2;
        int i7;
        int i10 = this.f38428n;
        if (i10 == 0) {
            if (this.f38426e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                fx0Var = this.f38425c;
            } else {
                fx0Var = this.d;
            }
            int i11 = fx0Var.f34719b;
            if (i11 == Integer.MIN_VALUE) {
                i11 = 0;
            }
            if (i11 >= 0 && i11 <= 1024) {
                int[] iArr = new int[i11];
                int childCount = getChildCount();
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < childCount; i14++) {
                    kx0 kx0Var = d(i14).f35747a;
                    if (z10) {
                        mx0Var = kx0Var.f36636a;
                    } else {
                        mx0Var = kx0Var.f36637b;
                    }
                    jx0 jx0Var = mx0Var.f37402b;
                    boolean z11 = mx0Var.f37401a;
                    int a10 = jx0Var.a();
                    if (a10 > 0 && a10 <= 1024) {
                        if (z11) {
                            i12 = jx0Var.f36188a;
                        }
                        if (z10) {
                            mx0Var2 = kx0Var.f36637b;
                        } else {
                            mx0Var2 = kx0Var.f36636a;
                        }
                        jx0 jx0Var2 = mx0Var2.f37402b;
                        int a11 = jx0Var2.a();
                        int i15 = jx0Var2.f36188a;
                        if (a11 > 0) {
                            th2 = null;
                            if (jx0Var2.a() <= 1024) {
                                boolean z12 = mx0Var2.f37401a;
                                int a12 = jx0Var2.a();
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
                                    k(kx0Var, i12, a10, i13, a12);
                                } else {
                                    k(kx0Var, i13, a12, i12, a10);
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
                    i18 = (i18 * 31) + d(i19).f35747a.hashCode();
                }
                this.f38428n = i18;
                return;
            }
            g("Table grid count out of bounds");
            throw null;
        }
        int childCount3 = getChildCount();
        int i20 = 1;
        for (int i21 = 0; i21 < childCount3; i21++) {
            i20 = (i20 * 31) + d(i21).f35747a.hashCode();
        }
        if (i10 != i20) {
            h();
            c();
        }
    }

    public final ix0 d(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.Q;
            if (i7 < arrayList.size()) {
                return (ix0) arrayList.get(i7);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        nx0 nx0Var = this.S;
        if (nx0Var != null && nx0Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(ix0 ix0Var, boolean z10, boolean z11) {
        fx0 fx0Var;
        int[] iArr;
        mx0 mx0Var;
        int i7;
        if (this.h == 1) {
            return f(ix0Var, z10, z11);
        }
        if (z10) {
            fx0Var = this.f38425c;
        } else {
            fx0Var = this.d;
        }
        if (z11) {
            if (fx0Var.f34725j == null) {
                fx0Var.f34725j = new int[fx0Var.e() + 1];
            }
            if (!fx0Var.f34726k) {
                fx0Var.b(true);
                fx0Var.f34726k = true;
            }
            iArr = fx0Var.f34725j;
        } else {
            if (fx0Var.f34727l == null) {
                fx0Var.f34727l = new int[fx0Var.e() + 1];
            }
            if (!fx0Var.f34728m) {
                fx0Var.b(false);
                fx0Var.f34728m = true;
            }
            iArr = fx0Var.f34727l;
        }
        kx0 kx0Var = ix0Var.f35747a;
        if (z10) {
            mx0Var = kx0Var.f36637b;
        } else {
            mx0Var = kx0Var.f36636a;
        }
        jx0 jx0Var = mx0Var.f37402b;
        if (z11) {
            i7 = jx0Var.f36188a;
        } else {
            i7 = jx0Var.f36189b;
        }
        return iArr[i7];
    }

    public final int f(ix0 ix0Var, boolean z10, boolean z11) {
        int i7;
        mx0 mx0Var;
        fx0 fx0Var;
        boolean z12;
        kx0 kx0Var = ix0Var.f35747a;
        if (z10) {
            if (z11) {
                i7 = ((ViewGroup.MarginLayoutParams) kx0Var).leftMargin;
            } else {
                i7 = ((ViewGroup.MarginLayoutParams) kx0Var).rightMargin;
            }
        } else if (z11) {
            i7 = ((ViewGroup.MarginLayoutParams) kx0Var).topMargin;
        } else {
            i7 = ((ViewGroup.MarginLayoutParams) kx0Var).bottomMargin;
        }
        if (i7 == Integer.MIN_VALUE) {
            if (!this.f38427f) {
                return 0;
            }
            if (z10) {
                mx0Var = kx0Var.f36637b;
            } else {
                mx0Var = kx0Var.f36636a;
            }
            if (z10) {
                fx0Var = this.f38425c;
            } else {
                fx0Var = this.d;
            }
            jx0 jx0Var = mx0Var.f37402b;
            if (z10 && this.J) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != z11) {
                int i10 = jx0Var.f36188a;
                return 0;
            }
            int i11 = jx0Var.f36189b;
            fx0Var.e();
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
        return this.f38425c.e();
    }

    public int getOrientation() {
        return this.f38426e;
    }

    public int getRenderHeight() {
        return this.F;
    }

    public int getRowCount() {
        return this.d.e();
    }

    public boolean getUseDefaultMargins() {
        return this.f38427f;
    }

    public final void h() {
        this.f38428n = 0;
        fx0 fx0Var = this.f38425c;
        fx0Var.k();
        fx0 fx0Var2 = this.d;
        fx0Var2.k();
        if (fx0Var != null && fx0Var2 != null) {
            fx0Var.l();
            fx0Var2.l();
        }
    }

    public final void i(ix0 ix0Var, int i7, int i10, boolean z10) {
        ix0Var.d(e(ix0Var, true, false) + e(ix0Var, true, true) + i7, e(ix0Var, false, false) + e(ix0Var, false, true) + i10, z10);
    }

    public final void j(int i7, boolean z10) {
        boolean z11;
        mx0 mx0Var;
        fx0 fx0Var;
        int i10;
        int i11;
        int i12;
        int i13;
        CharSequence charSequence;
        ax0 ax0Var;
        ox0 ox0Var = this.P;
        int i14 = 0;
        if (z10 && this.R && this.f38426e == 0) {
            int childCount = getChildCount();
            int size = View.MeasureSpec.getSize(i7);
            int i15 = this.f38431w * 2;
            if (this.f38424b > 1) {
                i13 = Math.round(size * 0.8f);
            } else {
                i13 = size;
            }
            int max = Math.max(1, i13 - i15);
            ArrayList arrayList = new ArrayList(childCount);
            ax0[] ax0VarArr = new ax0[childCount];
            int i16 = 0;
            while (i16 < childCount) {
                ix0 d = d(i16);
                kx0 kx0Var = d.f35747a;
                jx0 jx0Var = kx0Var.f36637b.f37402b;
                d.e(ox0Var.c(d.f35749c, max));
                if (d.f35748b == null) {
                    ((ViewGroup.MarginLayoutParams) kx0Var).width = i14;
                    ((ViewGroup.MarginLayoutParams) kx0Var).height = i14;
                    i(d, i14, i14, true);
                } else {
                    ((ViewGroup.MarginLayoutParams) kx0Var).height = Math.max(this.f38432x, d.f35751f + this.f38429r + this.f38430s);
                    int b10 = d.f35748b.b();
                    if (b10 > 0) {
                        int i17 = jx0Var.f36188a;
                        int a10 = jx0Var.a();
                        int i18 = ((ViewGroup.MarginLayoutParams) kx0Var).height * b10;
                        ?? obj = new Object();
                        obj.f33103a = i17;
                        obj.f33104b = Math.max(1, a10);
                        obj.f33108g = true;
                        int max2 = Math.max(0, i18);
                        obj.f33106e = max2;
                        obj.d = max2;
                        ax0Var = obj;
                    } else {
                        Layout a11 = d.f35748b.a();
                        TextPaint textPaint = null;
                        if (a11 != null) {
                            charSequence = a11.getText();
                        } else {
                            charSequence = null;
                        }
                        if (a11 != null) {
                            textPaint = a11.getPaint();
                        }
                        ax0Var = c8.ra.b(charSequence, textPaint, jx0Var.f36188a, jx0Var.a(), i15, max, d.f35750e);
                    }
                    ax0VarArr[i16] = ax0Var;
                    arrayList.add(ax0Var);
                }
                i16++;
                i14 = 0;
            }
            int[] a12 = c8.ra.a(this.f38424b, size, 0, arrayList);
            for (int i19 = 0; i19 < childCount; i19++) {
                ix0 d2 = d(i19);
                ax0 ax0Var2 = ax0VarArr[i19];
                if (ax0Var2 != null) {
                    kx0 kx0Var2 = d2.f35747a;
                    if (d2.f35748b.b() > 0) {
                        ((ViewGroup.MarginLayoutParams) kx0Var2).width = ax0Var2.f33106e;
                    } else {
                        jx0 jx0Var2 = kx0Var2.f36637b.f37402b;
                        int i20 = 0;
                        for (int max3 = Math.max(0, jx0Var2.f36188a); max3 < Math.min(this.f38424b, jx0Var2.f36189b); max3++) {
                            i20 += a12[max3];
                        }
                        int max4 = Math.max(1, i20 - i15);
                        if (d2.f35750e > max4) {
                            d2.e(ox0Var.c(d2.f35749c, max4));
                            ((ViewGroup.MarginLayoutParams) kx0Var2).height = Math.max(this.f38432x, d2.f35751f + this.f38429r + this.f38430s);
                        }
                        ((ViewGroup.MarginLayoutParams) kx0Var2).width = d2.f35750e + i15;
                    }
                    i(d2, ((ViewGroup.MarginLayoutParams) kx0Var2).width, ((ViewGroup.MarginLayoutParams) kx0Var2).height, true);
                }
            }
            return;
        }
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            ix0 d10 = d(i21);
            kx0 kx0Var3 = d10.f35747a;
            if (z10) {
                int size2 = View.MeasureSpec.getSize(i7);
                if (this.f38424b == 2) {
                    i11 = ((int) (size2 / 2.0f)) - (this.f38431w * 4);
                } else {
                    i11 = (int) (size2 / 1.5f);
                }
                d10.e(ox0Var.c(d10.f35749c, i11));
                if (d10.f35748b != null) {
                    ((ViewGroup.MarginLayoutParams) kx0Var3).height = Math.max(this.f38432x, d10.f35751f + this.f38429r + this.f38430s);
                    int b11 = d10.f35748b.b();
                    if (b11 > 0) {
                        i12 = ((ViewGroup.MarginLayoutParams) kx0Var3).height * b11;
                    } else {
                        i12 = (this.f38431w * 2) + d10.f35750e;
                    }
                    ((ViewGroup.MarginLayoutParams) kx0Var3).width = i12;
                } else {
                    ((ViewGroup.MarginLayoutParams) kx0Var3).width = 0;
                    ((ViewGroup.MarginLayoutParams) kx0Var3).height = 0;
                }
                i(d10, ((ViewGroup.MarginLayoutParams) kx0Var3).width, ((ViewGroup.MarginLayoutParams) kx0Var3).height, true);
            } else {
                if (this.f38426e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    mx0Var = kx0Var3.f36637b;
                } else {
                    mx0Var = kx0Var3.f36636a;
                }
                if (mx0.a(mx0Var, z11) == W) {
                    jx0 jx0Var3 = mx0Var.f37402b;
                    if (z11) {
                        fx0Var = this.f38425c;
                    } else {
                        fx0Var = this.d;
                    }
                    int[] g10 = fx0Var.g();
                    int e10 = (g10[jx0Var3.f36189b] - g10[jx0Var3.f36188a]) - (e(d10, z11, false) + e(d10, z11, true));
                    if (z11) {
                        hx0 hx0Var = d10.f35748b;
                        if (hx0Var != null) {
                            i10 = hx0Var.b();
                        } else {
                            i10 = 0;
                        }
                        if (i10 > 0) {
                            int max5 = Math.max(1, Math.round(e10 / i10));
                            ((ViewGroup.MarginLayoutParams) kx0Var3).height = max5;
                            d10.f35757m = max5;
                        }
                        i(d10, e10, ((ViewGroup.MarginLayoutParams) kx0Var3).height, false);
                    } else {
                        i(d10, ((ViewGroup.MarginLayoutParams) kx0Var3).width, e10, false);
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
        px0 px0Var = this;
        px0Var.c();
        fx0 fx0Var = px0Var.d;
        fx0 fx0Var2 = px0Var.f38425c;
        if (fx0Var2 != null && fx0Var != null) {
            fx0Var2.l();
            fx0Var.l();
        }
        px0Var.f38424b = 0;
        int childCount = px0Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            px0Var.f38424b = Math.max(px0Var.f38424b, px0Var.d(i16).f35747a.f36637b.f37402b.f36189b);
        }
        px0Var.j(i7, true);
        if (px0Var.f38426e == 0) {
            i11 = fx0Var2.i(i7);
            if (px0Var.f38433y) {
                i11 = Math.max(i11, View.MeasureSpec.getSize(i7));
                fx0Var2.v.f36927a = i11;
                fx0Var2.f34737w.f36927a = -i11;
                fx0Var2.f34732q = false;
                fx0Var2.g();
            }
            px0Var.j(i7, false);
            i12 = fx0Var.i(i10);
        } else {
            int i17 = fx0Var.i(i10);
            px0Var.j(i7, false);
            i11 = fx0Var2.i(i7);
            i12 = i17;
        }
        int max = Math.max(i12, px0Var.getSuggestedMinimumHeight());
        px0Var.setMeasuredDimension(i11, max);
        fx0Var2.v.f36927a = i11;
        fx0Var2.f34737w.f36927a = -i11;
        fx0Var2.f34732q = false;
        fx0Var2.g();
        fx0Var.v.f36927a = max;
        fx0Var.f34737w.f36927a = -max;
        fx0Var.f34732q = false;
        fx0Var.g();
        int[] g10 = fx0Var2.g();
        int[] g11 = fx0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = px0Var.K;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = px0Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            ix0 d = px0Var.d(i20);
            kx0 kx0Var = d.f35747a;
            mx0 mx0Var = kx0Var.f36637b;
            mx0 mx0Var2 = kx0Var.f36636a;
            jx0 jx0Var = mx0Var.f37402b;
            jx0 jx0Var2 = mx0Var2.f37402b;
            int i21 = childCount2;
            int i22 = g10[jx0Var.f36188a];
            int i23 = g11[jx0Var2.f36188a];
            int i24 = g10[jx0Var.f36189b] - i22;
            int i25 = g11[jx0Var2.f36189b] - i23;
            int i26 = d.f35755k;
            fx0 fx0Var3 = fx0Var;
            int i27 = d.f35756l;
            bx0 a10 = mx0.a(mx0Var, true);
            bx0 a11 = mx0.a(mx0Var2, false);
            h6.m f10 = fx0Var2.f();
            gx0 gx0Var = (gx0) ((Object[]) f10.d)[((int[]) f10.f13624b)[i20]];
            h6.m f11 = fx0Var3.f();
            fx0 fx0Var4 = fx0Var2;
            gx0 gx0Var2 = (gx0) ((Object[]) f11.d)[((int[]) f11.f13624b)[i20]];
            int b10 = a10.b(d, i24 - gx0Var.d(true));
            int b11 = a11.b(d, i25 - gx0Var2.d(true));
            int e10 = px0Var.e(d, true, true);
            int e11 = px0Var.e(d, false, true);
            int e12 = px0Var.e(d, true, false);
            int i28 = e10 + e12;
            int e13 = e11 + px0Var.e(d, false, false);
            int a12 = gx0Var.a(px0Var, d, a10, i26 + i28, true);
            px0Var = this;
            int a13 = gx0Var2.a(px0Var, d, a11, i27 + e13, false);
            int c10 = a10.c(i26, i24 - i28);
            int c11 = a11.c(i27, i25 - e13);
            int i29 = i22 + b10 + a12;
            if (!px0Var.J) {
                i14 = e10 + i29;
            } else {
                i14 = ((i18 - c10) - e12) - i29;
            }
            int i30 = i14;
            int i31 = i23 + b11 + a13 + e11;
            if (d.f35749c != null) {
                if (c10 != d.f35755k || c11 != d.f35756l) {
                    i15 = 0;
                    d.d(c10, c11, false);
                } else {
                    i15 = 0;
                }
                int i32 = d.f35757m;
                if (i32 != 0 && i32 != c11) {
                    jx0 jx0Var3 = d.f35747a.f36636a.f37402b;
                    if (jx0Var3.f36189b - jx0Var3.f36188a <= 1) {
                        ArrayList arrayList2 = px0Var.L;
                        int size = arrayList2.size();
                        int i33 = i15;
                        while (true) {
                            if (i33 < size) {
                                PointF pointF = (PointF) arrayList2.get(i33);
                                float f12 = pointF.x;
                                float f13 = d.f35747a.f36636a.f37402b.f36188a;
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
            d.f35760p = i30;
            d.f35761q = i31;
            i19 = i20 + 1;
            fx0Var = fx0Var3;
            childCount2 = i21;
            fx0Var2 = fx0Var4;
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            ix0 ix0Var = (ix0) arrayList.get(i34);
            int i35 = ix0Var.f35756l;
            int i36 = ix0Var.d;
            int i37 = i35 - ix0Var.f35757m;
            ArrayList arrayList3 = px0Var.Q;
            int size3 = arrayList3.size();
            for (int i38 = i36 + 1; i38 < size3; i38++) {
                ix0 ix0Var2 = (ix0) arrayList3.get(i38);
                if (ix0Var.f35747a.f36636a.f37402b.f36188a != ix0Var2.f35747a.f36636a.f37402b.f36188a) {
                    break;
                }
                int i39 = ix0Var.f35757m;
                int i40 = ix0Var2.f35757m;
                if (i39 < i40) {
                    z10 = true;
                    break;
                }
                int i41 = ix0Var2.f35756l - i40;
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
                    ix0 ix0Var3 = (ix0) arrayList3.get(i42);
                    if (ix0Var.f35747a.f36636a.f37402b.f36188a != ix0Var3.f35747a.f36636a.f37402b.f36188a) {
                        break;
                    }
                    int i43 = ix0Var.f35757m;
                    int i44 = ix0Var3.f35757m;
                    if (i43 < i44) {
                        z10 = true;
                        break;
                    }
                    int i45 = ix0Var3.f35756l - i44;
                    if (i45 > 0) {
                        i37 = Math.min(i37, i45);
                    }
                    i42--;
                }
            }
            if (!z10) {
                ix0Var.f35756l = ix0Var.f35757m;
                ix0Var.g();
                max -= i37;
                int i46 = ix0Var.f35747a.f36636a.f37402b.f36188a;
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
                    ix0 ix0Var4 = (ix0) arrayList3.get(i49);
                    if (ix0Var == ix0Var4) {
                        i13 = i49;
                    } else {
                        int i50 = ix0Var.f35747a.f36636a.f37402b.f36188a;
                        int i51 = ix0Var4.f35747a.f36636a.f37402b.f36188a;
                        if (i50 == i51) {
                            if (ix0Var4.f35757m != ix0Var4.f35756l) {
                                arrayList.remove(ix0Var4);
                                if (ix0Var4.d < i36) {
                                    i48--;
                                }
                                i47--;
                            }
                            int i52 = ix0Var4.f35756l - i37;
                            ix0Var4.f35756l = i52;
                            i13 = i49;
                            ix0Var4.d(ix0Var4.f35755k, i52, true);
                        } else {
                            i13 = i49;
                            if (i50 < i51) {
                                ix0Var4.f35761q -= i37;
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
        int childCount3 = px0Var.getChildCount();
        for (int i53 = 0; i53 < childCount3; i53++) {
            ix0 d2 = px0Var.d(i53);
            px0Var.P.g(d2.f35748b, d2.c());
            d2.f35758n = d2.f35760p;
            d2.f35759o = d2.f35755k;
        }
        px0Var.E = i18;
        px0Var.F = max;
        px0Var.G = copyOf;
        px0Var.setMeasuredDimension(i18, max);
    }

    @Override
    public final void requestLayout() {
        fx0 fx0Var;
        super.requestLayout();
        fx0 fx0Var2 = this.f38425c;
        if (fx0Var2 != null && (fx0Var = this.d) != null) {
            fx0Var2.l();
            fx0Var.l();
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
        this.f38425c.n(i7);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        fx0 fx0Var = this.f38425c;
        fx0Var.f34736u = z10;
        fx0Var.k();
        h();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.H = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.f38433y == z10) {
            return;
        }
        this.f38433y = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i7) {
        this.f38432x = i7;
        requestLayout();
    }

    public void setOrientation(int i7) {
        if (this.f38426e != i7) {
            this.f38426e = i7;
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
            ix0 d = d(i12);
            if (measuredWidth > 0 && (i11 = this.E) != measuredWidth) {
                float f10 = measuredWidth;
                int round = Math.round((d.f35758n * i11) / f10);
                int round2 = Math.round(((d.f35758n + d.f35759o) * this.E) / f10);
                d.f35760p = round;
                d.f35755k = Math.max(0, round2 - round);
                if (d.f35749c != null && d.f35748b != null) {
                    d.f();
                }
            } else {
                int i13 = d.f35758n;
                d.f35760p = i13;
                d.f35755k = Math.max(0, (d.f35759o + i13) - i13);
                if (d.f35749c != null && d.f35748b != null) {
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
                ix0 d2 = d(i17);
                hx0 hx0Var = d2.f35748b;
                if (hx0Var != null) {
                    i10 = hx0Var.b();
                } else {
                    i10 = 0;
                }
                if (i10 > 0) {
                    jx0 jx0Var = d2.f35747a.f36636a.f37402b;
                    int max = Math.max(0, jx0Var.f36188a);
                    int min = Math.min(i14, jx0Var.f36189b);
                    if (max < min) {
                        int i18 = 0;
                        for (int i19 = max; i19 < min; i19++) {
                            i18 += iArr2[i19];
                        }
                        int max2 = Math.max(1, Math.round(d2.f35755k / i10)) - i18;
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
                ix0 d10 = d(i24);
                jx0 jx0Var2 = d10.f35747a.f36636a.f37402b;
                int max3 = Math.max(0, Math.min(i14, jx0Var2.f36188a));
                int max4 = Math.max(max3, Math.min(i14, jx0Var2.f36189b));
                int i25 = iArr4[max3];
                int i26 = iArr4[max4];
                d10.f35761q = i25;
                d10.f35756l = Math.max(0, i26 - i25);
                if (d10.f35749c != null) {
                    d10.g();
                }
                this.P.g(d10.f35748b, d10.c());
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
        fx0 fx0Var = this.d;
        fx0Var.f34736u = z10;
        fx0Var.k();
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
        this.f38427f = z10;
        requestLayout();
    }
}
