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
public final class nx0 extends View {
    public static final zw0 S = new zw0(0);
    public static final zw0 T = new zw0(1);
    public static final zw0 U = new zw0(3);
    public static final zw0 V = new zw0(4);
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
    public final mx0 O;
    public final ArrayList P;
    public boolean Q;
    public final lx0 R;
    public final org.telegram.ui.Cells.i9 f36520a;
    public int f36521b;
    public final dx0 f36522c;
    public final dx0 d;
    public int f36523e;
    public boolean f36524f;
    public int h;
    public int f36525n;
    public int f36526r;
    public int f36527s;
    public int f36528w;
    public int f36529x;
    public boolean f36530y;

    public nx0(Context context, mx0 mx0Var, org.telegram.ui.Cells.i9 i9Var) {
        super(context);
        this.f36522c = new dx0(this, true);
        this.d = new dx0(this, false);
        this.f36523e = 0;
        this.f36524f = false;
        this.h = 1;
        this.f36525n = 0;
        this.f36526r = org.telegram.messenger.g0.L(8.0f);
        this.f36527s = org.telegram.messenger.g0.L(9.0f);
        this.f36528w = org.telegram.messenger.g0.L(12.0f);
        this.f36530y = true;
        this.F = new int[0];
        this.J = new ArrayList();
        this.K = new ArrayList();
        new Path();
        this.L = new Path();
        this.M = new RectF();
        this.N = new float[8];
        this.P = new ArrayList();
        this.f36520a = i9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.O = mx0Var;
        lx0 lx0Var = new lx0(this, this);
        this.R = lx0Var;
        r0.i0.j(this, lx0Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(rf.b.r(str, ". "));
    }

    public static void k(ix0 ix0Var, int i7, int i10, int i11, int i12) {
        hx0 hx0Var = new hx0(i7, i10 + i7);
        kx0 kx0Var = ix0Var.f34877a;
        ix0Var.f34877a = new kx0(kx0Var.f35511a, hx0Var, kx0Var.f35513c, kx0Var.d);
        hx0 hx0Var2 = new hx0(i11, i12 + i11);
        kx0 kx0Var2 = ix0Var.f34878b;
        ix0Var.f34878b = new kx0(kx0Var2.f35511a, hx0Var2, kx0Var2.f35513c, kx0Var2.d);
    }

    public final void a(int i7, int i10, int i11, int i12) {
        ArrayList arrayList = this.P;
        gx0 gx0Var = new gx0(this, arrayList.size());
        ix0 ix0Var = new ix0();
        hx0 hx0Var = new hx0(i10, i12 + i10);
        zw0 zw0Var = V;
        ix0Var.f34877a = new kx0(false, hx0Var, zw0Var, 0.0f);
        ix0Var.f34878b = new kx0(false, new hx0(i7, i11 + i7), zw0Var, 0.0f);
        gx0Var.f34070a = ix0Var;
        gx0Var.f34077j = i10;
        arrayList.add(gx0Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i7, int i10, int i11) {
        int i12;
        if (i11 == 0) {
            i11 = 1;
        }
        ArrayList arrayList = this.P;
        gx0 gx0Var = new gx0(this, arrayList.size());
        gx0Var.f34072c = pagetablecell;
        ix0 ix0Var = new ix0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        hx0 hx0Var = new hx0(i10, i13 + i10);
        zw0 zw0Var = V;
        ix0Var.f34877a = new kx0(false, hx0Var, zw0Var, 0.0f);
        ix0Var.f34878b = new kx0(false, new hx0(i7, i11 + i7), zw0Var, 1.0f);
        gx0Var.f34070a = ix0Var;
        gx0Var.f34077j = i10;
        arrayList.add(gx0Var);
        if (pagetablecell.rowspan > 1) {
            this.K.add(new PointF(i10, i10 + i12));
        }
        h();
    }

    public final void c() {
        boolean z9;
        dx0 dx0Var;
        kx0 kx0Var;
        kx0 kx0Var2;
        Throwable th2;
        int i7;
        int i10 = this.f36525n;
        if (i10 == 0) {
            if (this.f36523e == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                dx0Var = this.f36522c;
            } else {
                dx0Var = this.d;
            }
            int i11 = dx0Var.f33182b;
            if (i11 == Integer.MIN_VALUE) {
                i11 = 0;
            }
            if (i11 >= 0 && i11 <= 1024) {
                int[] iArr = new int[i11];
                int childCount = getChildCount();
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < childCount; i14++) {
                    ix0 ix0Var = d(i14).f34070a;
                    if (z9) {
                        kx0Var = ix0Var.f34877a;
                    } else {
                        kx0Var = ix0Var.f34878b;
                    }
                    hx0 hx0Var = kx0Var.f35512b;
                    boolean z10 = kx0Var.f35511a;
                    int a10 = hx0Var.a();
                    if (a10 > 0 && a10 <= 1024) {
                        if (z10) {
                            i12 = hx0Var.f34403a;
                        }
                        if (z9) {
                            kx0Var2 = ix0Var.f34878b;
                        } else {
                            kx0Var2 = ix0Var.f34877a;
                        }
                        hx0 hx0Var2 = kx0Var2.f35512b;
                        int a11 = hx0Var2.a();
                        int i15 = hx0Var2.f34403a;
                        if (a11 > 0) {
                            th2 = null;
                            if (hx0Var2.a() <= 1024) {
                                boolean z11 = kx0Var2.f35511a;
                                int a12 = hx0Var2.a();
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
                                    k(ix0Var, i12, a10, i13, a12);
                                } else {
                                    k(ix0Var, i13, a12, i12, a10);
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
                    i18 = (i18 * 31) + d(i19).f34070a.hashCode();
                }
                this.f36525n = i18;
                return;
            }
            g("Table grid count out of bounds");
            throw null;
        }
        int childCount3 = getChildCount();
        int i20 = 1;
        for (int i21 = 0; i21 < childCount3; i21++) {
            i20 = (i20 * 31) + d(i21).f34070a.hashCode();
        }
        if (i10 != i20) {
            h();
            c();
        }
    }

    public final gx0 d(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.P;
            if (i7 < arrayList.size()) {
                return (gx0) arrayList.get(i7);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        lx0 lx0Var = this.R;
        if (lx0Var != null && lx0Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(gx0 gx0Var, boolean z9, boolean z10) {
        dx0 dx0Var;
        int[] iArr;
        kx0 kx0Var;
        int i7;
        if (this.h == 1) {
            return f(gx0Var, z9, z10);
        }
        if (z9) {
            dx0Var = this.f36522c;
        } else {
            dx0Var = this.d;
        }
        if (z10) {
            if (dx0Var.f33188j == null) {
                dx0Var.f33188j = new int[dx0Var.e() + 1];
            }
            if (!dx0Var.f33189k) {
                dx0Var.b(true);
                dx0Var.f33189k = true;
            }
            iArr = dx0Var.f33188j;
        } else {
            if (dx0Var.f33190l == null) {
                dx0Var.f33190l = new int[dx0Var.e() + 1];
            }
            if (!dx0Var.f33191m) {
                dx0Var.b(false);
                dx0Var.f33191m = true;
            }
            iArr = dx0Var.f33190l;
        }
        ix0 ix0Var = gx0Var.f34070a;
        if (z9) {
            kx0Var = ix0Var.f34878b;
        } else {
            kx0Var = ix0Var.f34877a;
        }
        hx0 hx0Var = kx0Var.f35512b;
        if (z10) {
            i7 = hx0Var.f34403a;
        } else {
            i7 = hx0Var.f34404b;
        }
        return iArr[i7];
    }

    public final int f(gx0 gx0Var, boolean z9, boolean z10) {
        int i7;
        kx0 kx0Var;
        dx0 dx0Var;
        boolean z11;
        ix0 ix0Var = gx0Var.f34070a;
        if (z9) {
            if (z10) {
                i7 = ((ViewGroup.MarginLayoutParams) ix0Var).leftMargin;
            } else {
                i7 = ((ViewGroup.MarginLayoutParams) ix0Var).rightMargin;
            }
        } else if (z10) {
            i7 = ((ViewGroup.MarginLayoutParams) ix0Var).topMargin;
        } else {
            i7 = ((ViewGroup.MarginLayoutParams) ix0Var).bottomMargin;
        }
        if (i7 == Integer.MIN_VALUE) {
            if (!this.f36524f) {
                return 0;
            }
            if (z9) {
                kx0Var = ix0Var.f34878b;
            } else {
                kx0Var = ix0Var.f34877a;
            }
            if (z9) {
                dx0Var = this.f36522c;
            } else {
                dx0Var = this.d;
            }
            hx0 hx0Var = kx0Var.f35512b;
            if (z9 && this.I) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 != z10) {
                int i10 = hx0Var.f34403a;
                return 0;
            }
            int i11 = hx0Var.f34404b;
            dx0Var.e();
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
        return this.f36522c.e();
    }

    public int getOrientation() {
        return this.f36523e;
    }

    public int getRenderHeight() {
        return this.E;
    }

    public int getRowCount() {
        return this.d.e();
    }

    public boolean getUseDefaultMargins() {
        return this.f36524f;
    }

    public final void h() {
        this.f36525n = 0;
        dx0 dx0Var = this.f36522c;
        dx0Var.k();
        dx0 dx0Var2 = this.d;
        dx0Var2.k();
        if (dx0Var != null && dx0Var2 != null) {
            dx0Var.l();
            dx0Var2.l();
        }
    }

    public final void i(gx0 gx0Var, int i7, int i10, boolean z9) {
        gx0Var.d(e(gx0Var, true, false) + e(gx0Var, true, true) + i7, e(gx0Var, false, false) + e(gx0Var, false, true) + i10, z9);
    }

    public final void j(int i7, boolean z9) {
        boolean z10;
        kx0 kx0Var;
        dx0 dx0Var;
        int i10;
        int i11;
        int i12;
        int i13;
        CharSequence charSequence;
        yw0 yw0Var;
        mx0 mx0Var = this.O;
        int i14 = 0;
        if (z9 && this.Q && this.f36523e == 0) {
            int childCount = getChildCount();
            int size = View.MeasureSpec.getSize(i7);
            int i15 = this.f36528w * 2;
            if (this.f36521b > 1) {
                i13 = Math.round(size * 0.8f);
            } else {
                i13 = size;
            }
            int max = Math.max(1, i13 - i15);
            ArrayList arrayList = new ArrayList(childCount);
            yw0[] yw0VarArr = new yw0[childCount];
            int i16 = 0;
            while (i16 < childCount) {
                gx0 d = d(i16);
                ix0 ix0Var = d.f34070a;
                hx0 hx0Var = ix0Var.f34878b.f35512b;
                d.e(mx0Var.c(d.f34072c, max));
                if (d.f34071b == null) {
                    ((ViewGroup.MarginLayoutParams) ix0Var).width = i14;
                    ((ViewGroup.MarginLayoutParams) ix0Var).height = i14;
                    i(d, i14, i14, true);
                } else {
                    ((ViewGroup.MarginLayoutParams) ix0Var).height = Math.max(this.f36529x, d.f34074f + this.f36526r + this.f36527s);
                    int b10 = d.f34071b.b();
                    if (b10 > 0) {
                        int i17 = hx0Var.f34403a;
                        int a10 = hx0Var.a();
                        int i18 = ((ViewGroup.MarginLayoutParams) ix0Var).height * b10;
                        ?? obj = new Object();
                        obj.f40824a = i17;
                        obj.f40825b = Math.max(1, a10);
                        obj.f40829g = true;
                        int max2 = Math.max(0, i18);
                        obj.f40827e = max2;
                        obj.d = max2;
                        yw0Var = obj;
                    } else {
                        Layout a11 = d.f34071b.a();
                        TextPaint textPaint = null;
                        if (a11 != null) {
                            charSequence = a11.getText();
                        } else {
                            charSequence = null;
                        }
                        if (a11 != null) {
                            textPaint = a11.getPaint();
                        }
                        yw0Var = c8.na.b(charSequence, textPaint, hx0Var.f34403a, hx0Var.a(), i15, max, d.f34073e);
                    }
                    yw0VarArr[i16] = yw0Var;
                    arrayList.add(yw0Var);
                }
                i16++;
                i14 = 0;
            }
            int[] a12 = c8.na.a(this.f36521b, size, 0, arrayList);
            for (int i19 = 0; i19 < childCount; i19++) {
                gx0 d2 = d(i19);
                yw0 yw0Var2 = yw0VarArr[i19];
                if (yw0Var2 != null) {
                    ix0 ix0Var2 = d2.f34070a;
                    if (d2.f34071b.b() > 0) {
                        ((ViewGroup.MarginLayoutParams) ix0Var2).width = yw0Var2.f40827e;
                    } else {
                        hx0 hx0Var2 = ix0Var2.f34878b.f35512b;
                        int i20 = 0;
                        for (int max3 = Math.max(0, hx0Var2.f34403a); max3 < Math.min(this.f36521b, hx0Var2.f34404b); max3++) {
                            i20 += a12[max3];
                        }
                        int max4 = Math.max(1, i20 - i15);
                        if (d2.f34073e > max4) {
                            d2.e(mx0Var.c(d2.f34072c, max4));
                            ((ViewGroup.MarginLayoutParams) ix0Var2).height = Math.max(this.f36529x, d2.f34074f + this.f36526r + this.f36527s);
                        }
                        ((ViewGroup.MarginLayoutParams) ix0Var2).width = d2.f34073e + i15;
                    }
                    i(d2, ((ViewGroup.MarginLayoutParams) ix0Var2).width, ((ViewGroup.MarginLayoutParams) ix0Var2).height, true);
                }
            }
            return;
        }
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            gx0 d10 = d(i21);
            ix0 ix0Var3 = d10.f34070a;
            if (z9) {
                int size2 = View.MeasureSpec.getSize(i7);
                if (this.f36521b == 2) {
                    i11 = ((int) (size2 / 2.0f)) - (this.f36528w * 4);
                } else {
                    i11 = (int) (size2 / 1.5f);
                }
                d10.e(mx0Var.c(d10.f34072c, i11));
                if (d10.f34071b != null) {
                    ((ViewGroup.MarginLayoutParams) ix0Var3).height = Math.max(this.f36529x, d10.f34074f + this.f36526r + this.f36527s);
                    int b11 = d10.f34071b.b();
                    if (b11 > 0) {
                        i12 = ((ViewGroup.MarginLayoutParams) ix0Var3).height * b11;
                    } else {
                        i12 = (this.f36528w * 2) + d10.f34073e;
                    }
                    ((ViewGroup.MarginLayoutParams) ix0Var3).width = i12;
                } else {
                    ((ViewGroup.MarginLayoutParams) ix0Var3).width = 0;
                    ((ViewGroup.MarginLayoutParams) ix0Var3).height = 0;
                }
                i(d10, ((ViewGroup.MarginLayoutParams) ix0Var3).width, ((ViewGroup.MarginLayoutParams) ix0Var3).height, true);
            } else {
                if (this.f36523e == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    kx0Var = ix0Var3.f34878b;
                } else {
                    kx0Var = ix0Var3.f34877a;
                }
                if (kx0.a(kx0Var, z10) == V) {
                    hx0 hx0Var3 = kx0Var.f35512b;
                    if (z10) {
                        dx0Var = this.f36522c;
                    } else {
                        dx0Var = this.d;
                    }
                    int[] g10 = dx0Var.g();
                    int e10 = (g10[hx0Var3.f34404b] - g10[hx0Var3.f34403a]) - (e(d10, z10, false) + e(d10, z10, true));
                    if (z10) {
                        fx0 fx0Var = d10.f34071b;
                        if (fx0Var != null) {
                            i10 = fx0Var.b();
                        } else {
                            i10 = 0;
                        }
                        if (i10 > 0) {
                            int max5 = Math.max(1, Math.round(e10 / i10));
                            ((ViewGroup.MarginLayoutParams) ix0Var3).height = max5;
                            d10.f34080m = max5;
                        }
                        i(d10, e10, ((ViewGroup.MarginLayoutParams) ix0Var3).height, false);
                    } else {
                        i(d10, ((ViewGroup.MarginLayoutParams) ix0Var3).width, e10, false);
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
        nx0 nx0Var = this;
        nx0Var.c();
        dx0 dx0Var = nx0Var.d;
        dx0 dx0Var2 = nx0Var.f36522c;
        if (dx0Var2 != null && dx0Var != null) {
            dx0Var2.l();
            dx0Var.l();
        }
        nx0Var.f36521b = 0;
        int childCount = nx0Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            nx0Var.f36521b = Math.max(nx0Var.f36521b, nx0Var.d(i16).f34070a.f34878b.f35512b.f34404b);
        }
        nx0Var.j(i7, true);
        if (nx0Var.f36523e == 0) {
            i11 = dx0Var2.i(i7);
            if (nx0Var.f36530y) {
                i11 = Math.max(i11, View.MeasureSpec.getSize(i7));
                dx0Var2.v.f35176a = i11;
                dx0Var2.f33200w.f35176a = -i11;
                dx0Var2.f33195q = false;
                dx0Var2.g();
            }
            nx0Var.j(i7, false);
            i12 = dx0Var.i(i10);
        } else {
            int i17 = dx0Var.i(i10);
            nx0Var.j(i7, false);
            i11 = dx0Var2.i(i7);
            i12 = i17;
        }
        int max = Math.max(i12, nx0Var.getSuggestedMinimumHeight());
        nx0Var.setMeasuredDimension(i11, max);
        dx0Var2.v.f35176a = i11;
        dx0Var2.f33200w.f35176a = -i11;
        dx0Var2.f33195q = false;
        dx0Var2.g();
        dx0Var.v.f35176a = max;
        dx0Var.f33200w.f35176a = -max;
        dx0Var.f33195q = false;
        dx0Var.g();
        int[] g10 = dx0Var2.g();
        int[] g11 = dx0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = nx0Var.J;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = nx0Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            gx0 d = nx0Var.d(i20);
            ix0 ix0Var = d.f34070a;
            kx0 kx0Var = ix0Var.f34878b;
            kx0 kx0Var2 = ix0Var.f34877a;
            hx0 hx0Var = kx0Var.f35512b;
            hx0 hx0Var2 = kx0Var2.f35512b;
            int i21 = childCount2;
            int i22 = g10[hx0Var.f34403a];
            int i23 = g11[hx0Var2.f34403a];
            int i24 = g10[hx0Var.f34404b] - i22;
            int i25 = g11[hx0Var2.f34404b] - i23;
            int i26 = d.f34078k;
            dx0 dx0Var3 = dx0Var;
            int i27 = d.f34079l;
            zw0 a10 = kx0.a(kx0Var, true);
            zw0 a11 = kx0.a(kx0Var2, false);
            h6.m f10 = dx0Var2.f();
            ex0 ex0Var = (ex0) ((Object[]) f10.d)[((int[]) f10.f14264b)[i20]];
            h6.m f11 = dx0Var3.f();
            dx0 dx0Var4 = dx0Var2;
            ex0 ex0Var2 = (ex0) ((Object[]) f11.d)[((int[]) f11.f14264b)[i20]];
            int b10 = a10.b(d, i24 - ex0Var.d(true));
            int b11 = a11.b(d, i25 - ex0Var2.d(true));
            int e10 = nx0Var.e(d, true, true);
            int e11 = nx0Var.e(d, false, true);
            int e12 = nx0Var.e(d, true, false);
            int i28 = e10 + e12;
            int e13 = e11 + nx0Var.e(d, false, false);
            int a12 = ex0Var.a(nx0Var, d, a10, i26 + i28, true);
            nx0Var = this;
            int a13 = ex0Var2.a(nx0Var, d, a11, i27 + e13, false);
            int c10 = a10.c(i26, i24 - i28);
            int c11 = a11.c(i27, i25 - e13);
            int i29 = i22 + b10 + a12;
            if (!nx0Var.I) {
                i14 = e10 + i29;
            } else {
                i14 = ((i18 - c10) - e12) - i29;
            }
            int i30 = i14;
            int i31 = i23 + b11 + a13 + e11;
            if (d.f34072c != null) {
                if (c10 != d.f34078k || c11 != d.f34079l) {
                    i15 = 0;
                    d.d(c10, c11, false);
                } else {
                    i15 = 0;
                }
                int i32 = d.f34080m;
                if (i32 != 0 && i32 != c11) {
                    hx0 hx0Var3 = d.f34070a.f34877a.f35512b;
                    if (hx0Var3.f34404b - hx0Var3.f34403a <= 1) {
                        ArrayList arrayList2 = nx0Var.K;
                        int size = arrayList2.size();
                        int i33 = i15;
                        while (true) {
                            if (i33 < size) {
                                PointF pointF = (PointF) arrayList2.get(i33);
                                float f12 = pointF.x;
                                float f13 = d.f34070a.f34877a.f35512b.f34403a;
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
            d.f34083p = i30;
            d.f34084q = i31;
            i19 = i20 + 1;
            dx0Var = dx0Var3;
            childCount2 = i21;
            dx0Var2 = dx0Var4;
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            gx0 gx0Var = (gx0) arrayList.get(i34);
            int i35 = gx0Var.f34079l;
            int i36 = gx0Var.d;
            int i37 = i35 - gx0Var.f34080m;
            ArrayList arrayList3 = nx0Var.P;
            int size3 = arrayList3.size();
            for (int i38 = i36 + 1; i38 < size3; i38++) {
                gx0 gx0Var2 = (gx0) arrayList3.get(i38);
                if (gx0Var.f34070a.f34877a.f35512b.f34403a != gx0Var2.f34070a.f34877a.f35512b.f34403a) {
                    break;
                }
                int i39 = gx0Var.f34080m;
                int i40 = gx0Var2.f34080m;
                if (i39 < i40) {
                    z9 = true;
                    break;
                }
                int i41 = gx0Var2.f34079l - i40;
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
                    gx0 gx0Var3 = (gx0) arrayList3.get(i42);
                    if (gx0Var.f34070a.f34877a.f35512b.f34403a != gx0Var3.f34070a.f34877a.f35512b.f34403a) {
                        break;
                    }
                    int i43 = gx0Var.f34080m;
                    int i44 = gx0Var3.f34080m;
                    if (i43 < i44) {
                        z9 = true;
                        break;
                    }
                    int i45 = gx0Var3.f34079l - i44;
                    if (i45 > 0) {
                        i37 = Math.min(i37, i45);
                    }
                    i42--;
                }
            }
            if (!z9) {
                gx0Var.f34079l = gx0Var.f34080m;
                gx0Var.g();
                max -= i37;
                int i46 = gx0Var.f34070a.f34877a.f35512b.f34403a;
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
                    gx0 gx0Var4 = (gx0) arrayList3.get(i49);
                    if (gx0Var == gx0Var4) {
                        i13 = i49;
                    } else {
                        int i50 = gx0Var.f34070a.f34877a.f35512b.f34403a;
                        int i51 = gx0Var4.f34070a.f34877a.f35512b.f34403a;
                        if (i50 == i51) {
                            if (gx0Var4.f34080m != gx0Var4.f34079l) {
                                arrayList.remove(gx0Var4);
                                if (gx0Var4.d < i36) {
                                    i48--;
                                }
                                i47--;
                            }
                            int i52 = gx0Var4.f34079l - i37;
                            gx0Var4.f34079l = i52;
                            i13 = i49;
                            gx0Var4.d(gx0Var4.f34078k, i52, true);
                        } else {
                            i13 = i49;
                            if (i50 < i51) {
                                gx0Var4.f34084q -= i37;
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
        int childCount3 = nx0Var.getChildCount();
        for (int i53 = 0; i53 < childCount3; i53++) {
            gx0 d2 = nx0Var.d(i53);
            nx0Var.O.g(d2.f34071b, d2.c());
            d2.f34081n = d2.f34083p;
            d2.f34082o = d2.f34078k;
        }
        nx0Var.D = i18;
        nx0Var.E = max;
        nx0Var.F = copyOf;
        nx0Var.setMeasuredDimension(i18, max);
    }

    @Override
    public final void requestLayout() {
        dx0 dx0Var;
        super.requestLayout();
        dx0 dx0Var2 = this.f36522c;
        if (dx0Var2 != null && (dx0Var = this.d) != null) {
            dx0Var2.l();
            dx0Var.l();
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
        this.f36522c.n(i7);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z9) {
        dx0 dx0Var = this.f36522c;
        dx0Var.f33199u = z9;
        dx0Var.k();
        h();
        requestLayout();
    }

    public void setDrawLines(boolean z9) {
        this.G = z9;
    }

    public void setFillWidth(boolean z9) {
        if (this.f36530y == z9) {
            return;
        }
        this.f36530y = z9;
        requestLayout();
    }

    public void setMinimumCellHeight(int i7) {
        this.f36529x = i7;
        requestLayout();
    }

    public void setOrientation(int i7) {
        if (this.f36523e != i7) {
            this.f36523e = i7;
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
            gx0 d = d(i12);
            if (measuredWidth > 0 && (i11 = this.D) != measuredWidth) {
                float f10 = measuredWidth;
                int round = Math.round((d.f34081n * i11) / f10);
                int round2 = Math.round(((d.f34081n + d.f34082o) * this.D) / f10);
                d.f34083p = round;
                d.f34078k = Math.max(0, round2 - round);
                if (d.f34072c != null && d.f34071b != null) {
                    d.f();
                }
            } else {
                int i13 = d.f34081n;
                d.f34083p = i13;
                d.f34078k = Math.max(0, (d.f34082o + i13) - i13);
                if (d.f34072c != null && d.f34071b != null) {
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
                gx0 d2 = d(i17);
                fx0 fx0Var = d2.f34071b;
                if (fx0Var != null) {
                    i10 = fx0Var.b();
                } else {
                    i10 = 0;
                }
                if (i10 > 0) {
                    hx0 hx0Var = d2.f34070a.f34877a.f35512b;
                    int max = Math.max(0, hx0Var.f34403a);
                    int min = Math.min(i14, hx0Var.f34404b);
                    if (max < min) {
                        int i18 = 0;
                        for (int i19 = max; i19 < min; i19++) {
                            i18 += iArr2[i19];
                        }
                        int max2 = Math.max(1, Math.round(d2.f34078k / i10)) - i18;
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
                gx0 d10 = d(i24);
                hx0 hx0Var2 = d10.f34070a.f34877a.f35512b;
                int max3 = Math.max(0, Math.min(i14, hx0Var2.f34403a));
                int max4 = Math.max(max3, Math.min(i14, hx0Var2.f34404b));
                int i25 = iArr4[max3];
                int i26 = iArr4[max4];
                d10.f34084q = i25;
                d10.f34079l = Math.max(0, i26 - i25);
                if (d10.f34072c != null) {
                    d10.g();
                }
                this.O.g(d10.f34071b, d10.c());
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
        dx0 dx0Var = this.d;
        dx0Var.f33199u = z9;
        dx0Var.k();
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
        this.f36524f = z9;
        requestLayout();
    }
}
