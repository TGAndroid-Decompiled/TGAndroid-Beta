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
public final class wx0 extends View {
    public static final ix0 T = new ix0(0);
    public static final ix0 U = new ix0(1);
    public static final ix0 V = new ix0(3);
    public static final ix0 W = new ix0(4);
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
    public final vx0 P;
    public final ArrayList Q;
    public boolean R;
    public final ux0 S;
    public final org.telegram.ui.Cells.j9 f41804a;
    public int f41805b;
    public final mx0 f41806c;
    public final mx0 d;
    public int f41807e;
    public boolean f41808f;
    public int h;
    public int f41809n;
    public int f41810r;
    public int f41811s;
    public int f41812w;
    public int f41813x;
    public boolean f41814y;

    public wx0(Context context, vx0 vx0Var, org.telegram.ui.Cells.j9 j9Var) {
        super(context);
        this.f41806c = new mx0(this, true);
        this.d = new mx0(this, false);
        this.f41807e = 0;
        this.f41808f = false;
        this.h = 1;
        this.f41809n = 0;
        this.f41810r = org.telegram.messenger.g0.L(8.0f);
        this.f41811s = org.telegram.messenger.g0.L(9.0f);
        this.f41812w = org.telegram.messenger.g0.L(12.0f);
        this.f41814y = true;
        this.G = new int[0];
        this.K = new ArrayList();
        this.L = new ArrayList();
        new Path();
        this.M = new Path();
        this.N = new RectF();
        this.O = new float[8];
        this.Q = new ArrayList();
        this.f41804a = j9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.P = vx0Var;
        ux0 ux0Var = new ux0(this, this);
        this.S = ux0Var;
        r0.i0.j(this, ux0Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(p5.c.v(str, ". "));
    }

    public static void k(rx0 rx0Var, int i7, int i10, int i11, int i12) {
        qx0 qx0Var = new qx0(i7, i10 + i7);
        tx0 tx0Var = rx0Var.f39330a;
        rx0Var.f39330a = new tx0(tx0Var.f40131a, qx0Var, tx0Var.f40133c, tx0Var.d);
        qx0 qx0Var2 = new qx0(i11, i12 + i11);
        tx0 tx0Var2 = rx0Var.f39331b;
        rx0Var.f39331b = new tx0(tx0Var2.f40131a, qx0Var2, tx0Var2.f40133c, tx0Var2.d);
    }

    public final void a(int i7, int i10, int i11, int i12) {
        ArrayList arrayList = this.Q;
        px0 px0Var = new px0(this, arrayList.size());
        rx0 rx0Var = new rx0();
        qx0 qx0Var = new qx0(i10, i12 + i10);
        ix0 ix0Var = W;
        rx0Var.f39330a = new tx0(false, qx0Var, ix0Var, 0.0f);
        rx0Var.f39331b = new tx0(false, new qx0(i7, i11 + i7), ix0Var, 0.0f);
        px0Var.f38592a = rx0Var;
        px0Var.f38599j = i10;
        arrayList.add(px0Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i7, int i10, int i11) {
        int i12;
        if (i11 == 0) {
            i11 = 1;
        }
        ArrayList arrayList = this.Q;
        px0 px0Var = new px0(this, arrayList.size());
        px0Var.f38594c = pagetablecell;
        rx0 rx0Var = new rx0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        qx0 qx0Var = new qx0(i10, i13 + i10);
        ix0 ix0Var = W;
        rx0Var.f39330a = new tx0(false, qx0Var, ix0Var, 0.0f);
        rx0Var.f39331b = new tx0(false, new qx0(i7, i11 + i7), ix0Var, 1.0f);
        px0Var.f38592a = rx0Var;
        px0Var.f38599j = i10;
        arrayList.add(px0Var);
        if (pagetablecell.rowspan > 1) {
            this.L.add(new PointF(i10, i10 + i12));
        }
        h();
    }

    public final void c() {
        boolean z10;
        mx0 mx0Var;
        tx0 tx0Var;
        tx0 tx0Var2;
        Throwable th2;
        int i7;
        int i10 = this.f41809n;
        if (i10 == 0) {
            if (this.f41807e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                mx0Var = this.f41806c;
            } else {
                mx0Var = this.d;
            }
            int i11 = mx0Var.f37636b;
            if (i11 == Integer.MIN_VALUE) {
                i11 = 0;
            }
            if (i11 >= 0 && i11 <= 1024) {
                int[] iArr = new int[i11];
                int childCount = getChildCount();
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < childCount; i14++) {
                    rx0 rx0Var = d(i14).f38592a;
                    if (z10) {
                        tx0Var = rx0Var.f39330a;
                    } else {
                        tx0Var = rx0Var.f39331b;
                    }
                    qx0 qx0Var = tx0Var.f40132b;
                    boolean z11 = tx0Var.f40131a;
                    int a10 = qx0Var.a();
                    if (a10 > 0 && a10 <= 1024) {
                        if (z11) {
                            i12 = qx0Var.f38934a;
                        }
                        if (z10) {
                            tx0Var2 = rx0Var.f39331b;
                        } else {
                            tx0Var2 = rx0Var.f39330a;
                        }
                        qx0 qx0Var2 = tx0Var2.f40132b;
                        int a11 = qx0Var2.a();
                        int i15 = qx0Var2.f38934a;
                        if (a11 > 0) {
                            th2 = null;
                            if (qx0Var2.a() <= 1024) {
                                boolean z12 = tx0Var2.f40131a;
                                int a12 = qx0Var2.a();
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
                                    k(rx0Var, i12, a10, i13, a12);
                                } else {
                                    k(rx0Var, i13, a12, i12, a10);
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
                    i18 = (i18 * 31) + d(i19).f38592a.hashCode();
                }
                this.f41809n = i18;
                return;
            }
            g("Table grid count out of bounds");
            throw null;
        }
        int childCount3 = getChildCount();
        int i20 = 1;
        for (int i21 = 0; i21 < childCount3; i21++) {
            i20 = (i20 * 31) + d(i21).f38592a.hashCode();
        }
        if (i10 != i20) {
            h();
            c();
        }
    }

    public final px0 d(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.Q;
            if (i7 < arrayList.size()) {
                return (px0) arrayList.get(i7);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        ux0 ux0Var = this.S;
        if (ux0Var != null && ux0Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(px0 px0Var, boolean z10, boolean z11) {
        mx0 mx0Var;
        int[] iArr;
        tx0 tx0Var;
        int i7;
        if (this.h == 1) {
            return f(px0Var, z10, z11);
        }
        if (z10) {
            mx0Var = this.f41806c;
        } else {
            mx0Var = this.d;
        }
        if (z11) {
            if (mx0Var.f37642j == null) {
                mx0Var.f37642j = new int[mx0Var.e() + 1];
            }
            if (!mx0Var.f37643k) {
                mx0Var.b(true);
                mx0Var.f37643k = true;
            }
            iArr = mx0Var.f37642j;
        } else {
            if (mx0Var.f37644l == null) {
                mx0Var.f37644l = new int[mx0Var.e() + 1];
            }
            if (!mx0Var.f37645m) {
                mx0Var.b(false);
                mx0Var.f37645m = true;
            }
            iArr = mx0Var.f37644l;
        }
        rx0 rx0Var = px0Var.f38592a;
        if (z10) {
            tx0Var = rx0Var.f39331b;
        } else {
            tx0Var = rx0Var.f39330a;
        }
        qx0 qx0Var = tx0Var.f40132b;
        if (z11) {
            i7 = qx0Var.f38934a;
        } else {
            i7 = qx0Var.f38935b;
        }
        return iArr[i7];
    }

    public final int f(px0 px0Var, boolean z10, boolean z11) {
        int i7;
        tx0 tx0Var;
        mx0 mx0Var;
        boolean z12;
        rx0 rx0Var = px0Var.f38592a;
        if (z10) {
            if (z11) {
                i7 = ((ViewGroup.MarginLayoutParams) rx0Var).leftMargin;
            } else {
                i7 = ((ViewGroup.MarginLayoutParams) rx0Var).rightMargin;
            }
        } else if (z11) {
            i7 = ((ViewGroup.MarginLayoutParams) rx0Var).topMargin;
        } else {
            i7 = ((ViewGroup.MarginLayoutParams) rx0Var).bottomMargin;
        }
        if (i7 == Integer.MIN_VALUE) {
            if (!this.f41808f) {
                return 0;
            }
            if (z10) {
                tx0Var = rx0Var.f39331b;
            } else {
                tx0Var = rx0Var.f39330a;
            }
            if (z10) {
                mx0Var = this.f41806c;
            } else {
                mx0Var = this.d;
            }
            qx0 qx0Var = tx0Var.f40132b;
            if (z10 && this.J) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != z11) {
                int i10 = qx0Var.f38934a;
                return 0;
            }
            int i11 = qx0Var.f38935b;
            mx0Var.e();
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
        return this.f41806c.e();
    }

    public int getOrientation() {
        return this.f41807e;
    }

    public int getRenderHeight() {
        return this.F;
    }

    public int getRowCount() {
        return this.d.e();
    }

    public boolean getUseDefaultMargins() {
        return this.f41808f;
    }

    public final void h() {
        this.f41809n = 0;
        mx0 mx0Var = this.f41806c;
        mx0Var.k();
        mx0 mx0Var2 = this.d;
        mx0Var2.k();
        if (mx0Var != null && mx0Var2 != null) {
            mx0Var.l();
            mx0Var2.l();
        }
    }

    public final void i(px0 px0Var, int i7, int i10, boolean z10) {
        px0Var.d(e(px0Var, true, false) + e(px0Var, true, true) + i7, e(px0Var, false, false) + e(px0Var, false, true) + i10, z10);
    }

    public final void j(int i7, boolean z10) {
        boolean z11;
        tx0 tx0Var;
        mx0 mx0Var;
        int i10;
        int i11;
        int i12;
        int i13;
        CharSequence charSequence;
        hx0 hx0Var;
        vx0 vx0Var = this.P;
        int i14 = 0;
        if (z10 && this.R && this.f41807e == 0) {
            int childCount = getChildCount();
            int size = View.MeasureSpec.getSize(i7);
            int i15 = this.f41812w * 2;
            if (this.f41805b > 1) {
                i13 = Math.round(size * 0.8f);
            } else {
                i13 = size;
            }
            int max = Math.max(1, i13 - i15);
            ArrayList arrayList = new ArrayList(childCount);
            hx0[] hx0VarArr = new hx0[childCount];
            int i16 = 0;
            while (i16 < childCount) {
                px0 d = d(i16);
                rx0 rx0Var = d.f38592a;
                qx0 qx0Var = rx0Var.f39331b.f40132b;
                d.e(vx0Var.c(d.f38594c, max));
                if (d.f38593b == null) {
                    ((ViewGroup.MarginLayoutParams) rx0Var).width = i14;
                    ((ViewGroup.MarginLayoutParams) rx0Var).height = i14;
                    i(d, i14, i14, true);
                } else {
                    ((ViewGroup.MarginLayoutParams) rx0Var).height = Math.max(this.f41813x, d.f38596f + this.f41810r + this.f41811s);
                    int b10 = d.f38593b.b();
                    if (b10 > 0) {
                        int i17 = qx0Var.f38934a;
                        int a10 = qx0Var.a();
                        int i18 = ((ViewGroup.MarginLayoutParams) rx0Var).height * b10;
                        ?? obj = new Object();
                        obj.f36001a = i17;
                        obj.f36002b = Math.max(1, a10);
                        obj.f36006g = true;
                        int max2 = Math.max(0, i18);
                        obj.f36004e = max2;
                        obj.d = max2;
                        hx0Var = obj;
                    } else {
                        Layout a11 = d.f38593b.a();
                        TextPaint textPaint = null;
                        if (a11 != null) {
                            charSequence = a11.getText();
                        } else {
                            charSequence = null;
                        }
                        if (a11 != null) {
                            textPaint = a11.getPaint();
                        }
                        hx0Var = c8.ta.b(charSequence, textPaint, qx0Var.f38934a, qx0Var.a(), i15, max, d.f38595e);
                    }
                    hx0VarArr[i16] = hx0Var;
                    arrayList.add(hx0Var);
                }
                i16++;
                i14 = 0;
            }
            int[] a12 = c8.ta.a(this.f41805b, size, 0, arrayList);
            for (int i19 = 0; i19 < childCount; i19++) {
                px0 d2 = d(i19);
                hx0 hx0Var2 = hx0VarArr[i19];
                if (hx0Var2 != null) {
                    rx0 rx0Var2 = d2.f38592a;
                    if (d2.f38593b.b() > 0) {
                        ((ViewGroup.MarginLayoutParams) rx0Var2).width = hx0Var2.f36004e;
                    } else {
                        qx0 qx0Var2 = rx0Var2.f39331b.f40132b;
                        int i20 = 0;
                        for (int max3 = Math.max(0, qx0Var2.f38934a); max3 < Math.min(this.f41805b, qx0Var2.f38935b); max3++) {
                            i20 += a12[max3];
                        }
                        int max4 = Math.max(1, i20 - i15);
                        if (d2.f38595e > max4) {
                            d2.e(vx0Var.c(d2.f38594c, max4));
                            ((ViewGroup.MarginLayoutParams) rx0Var2).height = Math.max(this.f41813x, d2.f38596f + this.f41810r + this.f41811s);
                        }
                        ((ViewGroup.MarginLayoutParams) rx0Var2).width = d2.f38595e + i15;
                    }
                    i(d2, ((ViewGroup.MarginLayoutParams) rx0Var2).width, ((ViewGroup.MarginLayoutParams) rx0Var2).height, true);
                }
            }
            return;
        }
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            px0 d10 = d(i21);
            rx0 rx0Var3 = d10.f38592a;
            if (z10) {
                int size2 = View.MeasureSpec.getSize(i7);
                if (this.f41805b == 2) {
                    i11 = ((int) (size2 / 2.0f)) - (this.f41812w * 4);
                } else {
                    i11 = (int) (size2 / 1.5f);
                }
                d10.e(vx0Var.c(d10.f38594c, i11));
                if (d10.f38593b != null) {
                    ((ViewGroup.MarginLayoutParams) rx0Var3).height = Math.max(this.f41813x, d10.f38596f + this.f41810r + this.f41811s);
                    int b11 = d10.f38593b.b();
                    if (b11 > 0) {
                        i12 = ((ViewGroup.MarginLayoutParams) rx0Var3).height * b11;
                    } else {
                        i12 = (this.f41812w * 2) + d10.f38595e;
                    }
                    ((ViewGroup.MarginLayoutParams) rx0Var3).width = i12;
                } else {
                    ((ViewGroup.MarginLayoutParams) rx0Var3).width = 0;
                    ((ViewGroup.MarginLayoutParams) rx0Var3).height = 0;
                }
                i(d10, ((ViewGroup.MarginLayoutParams) rx0Var3).width, ((ViewGroup.MarginLayoutParams) rx0Var3).height, true);
            } else {
                if (this.f41807e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    tx0Var = rx0Var3.f39331b;
                } else {
                    tx0Var = rx0Var3.f39330a;
                }
                if (tx0.a(tx0Var, z11) == W) {
                    qx0 qx0Var3 = tx0Var.f40132b;
                    if (z11) {
                        mx0Var = this.f41806c;
                    } else {
                        mx0Var = this.d;
                    }
                    int[] g10 = mx0Var.g();
                    int e10 = (g10[qx0Var3.f38935b] - g10[qx0Var3.f38934a]) - (e(d10, z11, false) + e(d10, z11, true));
                    if (z11) {
                        ox0 ox0Var = d10.f38593b;
                        if (ox0Var != null) {
                            i10 = ox0Var.b();
                        } else {
                            i10 = 0;
                        }
                        if (i10 > 0) {
                            int max5 = Math.max(1, Math.round(e10 / i10));
                            ((ViewGroup.MarginLayoutParams) rx0Var3).height = max5;
                            d10.f38602m = max5;
                        }
                        i(d10, e10, ((ViewGroup.MarginLayoutParams) rx0Var3).height, false);
                    } else {
                        i(d10, ((ViewGroup.MarginLayoutParams) rx0Var3).width, e10, false);
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
        wx0 wx0Var = this;
        wx0Var.c();
        mx0 mx0Var = wx0Var.d;
        mx0 mx0Var2 = wx0Var.f41806c;
        if (mx0Var2 != null && mx0Var != null) {
            mx0Var2.l();
            mx0Var.l();
        }
        wx0Var.f41805b = 0;
        int childCount = wx0Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            wx0Var.f41805b = Math.max(wx0Var.f41805b, wx0Var.d(i16).f38592a.f39331b.f40132b.f38935b);
        }
        wx0Var.j(i7, true);
        if (wx0Var.f41807e == 0) {
            i11 = mx0Var2.i(i7);
            if (wx0Var.f41814y) {
                i11 = Math.max(i11, View.MeasureSpec.getSize(i7));
                mx0Var2.v.f39862a = i11;
                mx0Var2.f37654w.f39862a = -i11;
                mx0Var2.f37649q = false;
                mx0Var2.g();
            }
            wx0Var.j(i7, false);
            i12 = mx0Var.i(i10);
        } else {
            int i17 = mx0Var.i(i10);
            wx0Var.j(i7, false);
            i11 = mx0Var2.i(i7);
            i12 = i17;
        }
        int max = Math.max(i12, wx0Var.getSuggestedMinimumHeight());
        wx0Var.setMeasuredDimension(i11, max);
        mx0Var2.v.f39862a = i11;
        mx0Var2.f37654w.f39862a = -i11;
        mx0Var2.f37649q = false;
        mx0Var2.g();
        mx0Var.v.f39862a = max;
        mx0Var.f37654w.f39862a = -max;
        mx0Var.f37649q = false;
        mx0Var.g();
        int[] g10 = mx0Var2.g();
        int[] g11 = mx0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = wx0Var.K;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = wx0Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            px0 d = wx0Var.d(i20);
            rx0 rx0Var = d.f38592a;
            tx0 tx0Var = rx0Var.f39331b;
            tx0 tx0Var2 = rx0Var.f39330a;
            qx0 qx0Var = tx0Var.f40132b;
            qx0 qx0Var2 = tx0Var2.f40132b;
            int i21 = childCount2;
            int i22 = g10[qx0Var.f38934a];
            int i23 = g11[qx0Var2.f38934a];
            int i24 = g10[qx0Var.f38935b] - i22;
            int i25 = g11[qx0Var2.f38935b] - i23;
            int i26 = d.f38600k;
            mx0 mx0Var3 = mx0Var;
            int i27 = d.f38601l;
            ix0 a10 = tx0.a(tx0Var, true);
            ix0 a11 = tx0.a(tx0Var2, false);
            h6.m f10 = mx0Var2.f();
            nx0 nx0Var = (nx0) ((Object[]) f10.d)[((int[]) f10.f13936b)[i20]];
            h6.m f11 = mx0Var3.f();
            mx0 mx0Var4 = mx0Var2;
            nx0 nx0Var2 = (nx0) ((Object[]) f11.d)[((int[]) f11.f13936b)[i20]];
            int b10 = a10.b(d, i24 - nx0Var.d(true));
            int b11 = a11.b(d, i25 - nx0Var2.d(true));
            int e10 = wx0Var.e(d, true, true);
            int e11 = wx0Var.e(d, false, true);
            int e12 = wx0Var.e(d, true, false);
            int i28 = e10 + e12;
            int e13 = e11 + wx0Var.e(d, false, false);
            int a12 = nx0Var.a(wx0Var, d, a10, i26 + i28, true);
            wx0Var = this;
            int a13 = nx0Var2.a(wx0Var, d, a11, i27 + e13, false);
            int c10 = a10.c(i26, i24 - i28);
            int c11 = a11.c(i27, i25 - e13);
            int i29 = i22 + b10 + a12;
            if (!wx0Var.J) {
                i14 = e10 + i29;
            } else {
                i14 = ((i18 - c10) - e12) - i29;
            }
            int i30 = i14;
            int i31 = i23 + b11 + a13 + e11;
            if (d.f38594c != null) {
                if (c10 != d.f38600k || c11 != d.f38601l) {
                    i15 = 0;
                    d.d(c10, c11, false);
                } else {
                    i15 = 0;
                }
                int i32 = d.f38602m;
                if (i32 != 0 && i32 != c11) {
                    qx0 qx0Var3 = d.f38592a.f39330a.f40132b;
                    if (qx0Var3.f38935b - qx0Var3.f38934a <= 1) {
                        ArrayList arrayList2 = wx0Var.L;
                        int size = arrayList2.size();
                        int i33 = i15;
                        while (true) {
                            if (i33 < size) {
                                PointF pointF = (PointF) arrayList2.get(i33);
                                float f12 = pointF.x;
                                float f13 = d.f38592a.f39330a.f40132b.f38934a;
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
            d.f38605p = i30;
            d.f38606q = i31;
            i19 = i20 + 1;
            mx0Var = mx0Var3;
            childCount2 = i21;
            mx0Var2 = mx0Var4;
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            px0 px0Var = (px0) arrayList.get(i34);
            int i35 = px0Var.f38601l;
            int i36 = px0Var.d;
            int i37 = i35 - px0Var.f38602m;
            ArrayList arrayList3 = wx0Var.Q;
            int size3 = arrayList3.size();
            for (int i38 = i36 + 1; i38 < size3; i38++) {
                px0 px0Var2 = (px0) arrayList3.get(i38);
                if (px0Var.f38592a.f39330a.f40132b.f38934a != px0Var2.f38592a.f39330a.f40132b.f38934a) {
                    break;
                }
                int i39 = px0Var.f38602m;
                int i40 = px0Var2.f38602m;
                if (i39 < i40) {
                    z10 = true;
                    break;
                }
                int i41 = px0Var2.f38601l - i40;
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
                    px0 px0Var3 = (px0) arrayList3.get(i42);
                    if (px0Var.f38592a.f39330a.f40132b.f38934a != px0Var3.f38592a.f39330a.f40132b.f38934a) {
                        break;
                    }
                    int i43 = px0Var.f38602m;
                    int i44 = px0Var3.f38602m;
                    if (i43 < i44) {
                        z10 = true;
                        break;
                    }
                    int i45 = px0Var3.f38601l - i44;
                    if (i45 > 0) {
                        i37 = Math.min(i37, i45);
                    }
                    i42--;
                }
            }
            if (!z10) {
                px0Var.f38601l = px0Var.f38602m;
                px0Var.g();
                max -= i37;
                int i46 = px0Var.f38592a.f39330a.f40132b.f38934a;
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
                    px0 px0Var4 = (px0) arrayList3.get(i49);
                    if (px0Var == px0Var4) {
                        i13 = i49;
                    } else {
                        int i50 = px0Var.f38592a.f39330a.f40132b.f38934a;
                        int i51 = px0Var4.f38592a.f39330a.f40132b.f38934a;
                        if (i50 == i51) {
                            if (px0Var4.f38602m != px0Var4.f38601l) {
                                arrayList.remove(px0Var4);
                                if (px0Var4.d < i36) {
                                    i48--;
                                }
                                i47--;
                            }
                            int i52 = px0Var4.f38601l - i37;
                            px0Var4.f38601l = i52;
                            i13 = i49;
                            px0Var4.d(px0Var4.f38600k, i52, true);
                        } else {
                            i13 = i49;
                            if (i50 < i51) {
                                px0Var4.f38606q -= i37;
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
        int childCount3 = wx0Var.getChildCount();
        for (int i53 = 0; i53 < childCount3; i53++) {
            px0 d2 = wx0Var.d(i53);
            wx0Var.P.g(d2.f38593b, d2.c());
            d2.f38603n = d2.f38605p;
            d2.f38604o = d2.f38600k;
        }
        wx0Var.E = i18;
        wx0Var.F = max;
        wx0Var.G = copyOf;
        wx0Var.setMeasuredDimension(i18, max);
    }

    @Override
    public final void requestLayout() {
        mx0 mx0Var;
        super.requestLayout();
        mx0 mx0Var2 = this.f41806c;
        if (mx0Var2 != null && (mx0Var = this.d) != null) {
            mx0Var2.l();
            mx0Var.l();
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
        this.f41806c.n(i7);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        mx0 mx0Var = this.f41806c;
        mx0Var.f37653u = z10;
        mx0Var.k();
        h();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.H = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.f41814y == z10) {
            return;
        }
        this.f41814y = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i7) {
        this.f41813x = i7;
        requestLayout();
    }

    public void setOrientation(int i7) {
        if (this.f41807e != i7) {
            this.f41807e = i7;
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
            px0 d = d(i12);
            if (measuredWidth > 0 && (i11 = this.E) != measuredWidth) {
                float f10 = measuredWidth;
                int round = Math.round((d.f38603n * i11) / f10);
                int round2 = Math.round(((d.f38603n + d.f38604o) * this.E) / f10);
                d.f38605p = round;
                d.f38600k = Math.max(0, round2 - round);
                if (d.f38594c != null && d.f38593b != null) {
                    d.f();
                }
            } else {
                int i13 = d.f38603n;
                d.f38605p = i13;
                d.f38600k = Math.max(0, (d.f38604o + i13) - i13);
                if (d.f38594c != null && d.f38593b != null) {
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
                px0 d2 = d(i17);
                ox0 ox0Var = d2.f38593b;
                if (ox0Var != null) {
                    i10 = ox0Var.b();
                } else {
                    i10 = 0;
                }
                if (i10 > 0) {
                    qx0 qx0Var = d2.f38592a.f39330a.f40132b;
                    int max = Math.max(0, qx0Var.f38934a);
                    int min = Math.min(i14, qx0Var.f38935b);
                    if (max < min) {
                        int i18 = 0;
                        for (int i19 = max; i19 < min; i19++) {
                            i18 += iArr2[i19];
                        }
                        int max2 = Math.max(1, Math.round(d2.f38600k / i10)) - i18;
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
                px0 d10 = d(i24);
                qx0 qx0Var2 = d10.f38592a.f39330a.f40132b;
                int max3 = Math.max(0, Math.min(i14, qx0Var2.f38934a));
                int max4 = Math.max(max3, Math.min(i14, qx0Var2.f38935b));
                int i25 = iArr4[max3];
                int i26 = iArr4[max4];
                d10.f38606q = i25;
                d10.f38601l = Math.max(0, i26 - i25);
                if (d10.f38594c != null) {
                    d10.g();
                }
                this.P.g(d10.f38593b, d10.c());
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
        mx0 mx0Var = this.d;
        mx0Var.f37653u = z10;
        mx0Var.k();
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
        this.f41808f = z10;
        requestLayout();
    }
}
