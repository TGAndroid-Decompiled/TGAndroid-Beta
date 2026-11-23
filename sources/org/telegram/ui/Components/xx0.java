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
public final class xx0 extends View {
    public static final jx0 T = new jx0(0);
    public static final jx0 U = new jx0(1);
    public static final jx0 V = new jx0(3);
    public static final jx0 W = new jx0(4);
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
    public final wx0 P;
    public final ArrayList Q;
    public boolean R;
    public final vx0 S;
    public final org.telegram.ui.Cells.i9 f42231a;
    public int f42232b;
    public final nx0 f42233c;
    public final nx0 d;
    public int f42234e;
    public boolean f42235f;
    public int h;
    public int f42236n;
    public int f42237r;
    public int f42238s;
    public int f42239w;
    public int f42240x;
    public boolean f42241y;

    public xx0(Context context, wx0 wx0Var, org.telegram.ui.Cells.i9 i9Var) {
        super(context);
        this.f42233c = new nx0(this, true);
        this.d = new nx0(this, false);
        this.f42234e = 0;
        this.f42235f = false;
        this.h = 1;
        this.f42236n = 0;
        this.f42237r = org.telegram.messenger.g0.L(8.0f);
        this.f42238s = org.telegram.messenger.g0.L(9.0f);
        this.f42239w = org.telegram.messenger.g0.L(12.0f);
        this.f42241y = true;
        this.G = new int[0];
        this.K = new ArrayList();
        this.L = new ArrayList();
        new Path();
        this.M = new Path();
        this.N = new RectF();
        this.O = new float[8];
        this.Q = new ArrayList();
        this.f42231a = i9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.P = wx0Var;
        vx0 vx0Var = new vx0(this, this);
        this.S = vx0Var;
        r0.i0.j(this, vx0Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(p5.c.v(str, ". "));
    }

    public static void k(sx0 sx0Var, int i7, int i10, int i11, int i12) {
        rx0 rx0Var = new rx0(i7, i10 + i7);
        ux0 ux0Var = sx0Var.f39740a;
        sx0Var.f39740a = new ux0(ux0Var.f40501a, rx0Var, ux0Var.f40503c, ux0Var.d);
        rx0 rx0Var2 = new rx0(i11, i12 + i11);
        ux0 ux0Var2 = sx0Var.f39741b;
        sx0Var.f39741b = new ux0(ux0Var2.f40501a, rx0Var2, ux0Var2.f40503c, ux0Var2.d);
    }

    public final void a(int i7, int i10, int i11, int i12) {
        ArrayList arrayList = this.Q;
        qx0 qx0Var = new qx0(this, arrayList.size());
        sx0 sx0Var = new sx0();
        rx0 rx0Var = new rx0(i10, i12 + i10);
        jx0 jx0Var = W;
        sx0Var.f39740a = new ux0(false, rx0Var, jx0Var, 0.0f);
        sx0Var.f39741b = new ux0(false, new rx0(i7, i11 + i7), jx0Var, 0.0f);
        qx0Var.f39017a = sx0Var;
        qx0Var.f39024j = i10;
        arrayList.add(qx0Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i7, int i10, int i11) {
        int i12;
        if (i11 == 0) {
            i11 = 1;
        }
        ArrayList arrayList = this.Q;
        qx0 qx0Var = new qx0(this, arrayList.size());
        qx0Var.f39019c = pagetablecell;
        sx0 sx0Var = new sx0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        rx0 rx0Var = new rx0(i10, i13 + i10);
        jx0 jx0Var = W;
        sx0Var.f39740a = new ux0(false, rx0Var, jx0Var, 0.0f);
        sx0Var.f39741b = new ux0(false, new rx0(i7, i11 + i7), jx0Var, 1.0f);
        qx0Var.f39017a = sx0Var;
        qx0Var.f39024j = i10;
        arrayList.add(qx0Var);
        if (pagetablecell.rowspan > 1) {
            this.L.add(new PointF(i10, i10 + i12));
        }
        h();
    }

    public final void c() {
        boolean z10;
        nx0 nx0Var;
        ux0 ux0Var;
        ux0 ux0Var2;
        Throwable th2;
        int i7;
        int i10 = this.f42236n;
        if (i10 == 0) {
            if (this.f42234e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                nx0Var = this.f42233c;
            } else {
                nx0Var = this.d;
            }
            int i11 = nx0Var.f37935b;
            if (i11 == Integer.MIN_VALUE) {
                i11 = 0;
            }
            if (i11 >= 0 && i11 <= 1024) {
                int[] iArr = new int[i11];
                int childCount = getChildCount();
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < childCount; i14++) {
                    sx0 sx0Var = d(i14).f39017a;
                    if (z10) {
                        ux0Var = sx0Var.f39740a;
                    } else {
                        ux0Var = sx0Var.f39741b;
                    }
                    rx0 rx0Var = ux0Var.f40502b;
                    boolean z11 = ux0Var.f40501a;
                    int a10 = rx0Var.a();
                    if (a10 > 0 && a10 <= 1024) {
                        if (z11) {
                            i12 = rx0Var.f39431a;
                        }
                        if (z10) {
                            ux0Var2 = sx0Var.f39741b;
                        } else {
                            ux0Var2 = sx0Var.f39740a;
                        }
                        rx0 rx0Var2 = ux0Var2.f40502b;
                        int a11 = rx0Var2.a();
                        int i15 = rx0Var2.f39431a;
                        if (a11 > 0) {
                            th2 = null;
                            if (rx0Var2.a() <= 1024) {
                                boolean z12 = ux0Var2.f40501a;
                                int a12 = rx0Var2.a();
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
                                    k(sx0Var, i12, a10, i13, a12);
                                } else {
                                    k(sx0Var, i13, a12, i12, a10);
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
                    i18 = (i18 * 31) + d(i19).f39017a.hashCode();
                }
                this.f42236n = i18;
                return;
            }
            g("Table grid count out of bounds");
            throw null;
        }
        int childCount3 = getChildCount();
        int i20 = 1;
        for (int i21 = 0; i21 < childCount3; i21++) {
            i20 = (i20 * 31) + d(i21).f39017a.hashCode();
        }
        if (i10 != i20) {
            h();
            c();
        }
    }

    public final qx0 d(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.Q;
            if (i7 < arrayList.size()) {
                return (qx0) arrayList.get(i7);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        vx0 vx0Var = this.S;
        if (vx0Var != null && vx0Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(qx0 qx0Var, boolean z10, boolean z11) {
        nx0 nx0Var;
        int[] iArr;
        ux0 ux0Var;
        int i7;
        if (this.h == 1) {
            return f(qx0Var, z10, z11);
        }
        if (z10) {
            nx0Var = this.f42233c;
        } else {
            nx0Var = this.d;
        }
        if (z11) {
            if (nx0Var.f37941j == null) {
                nx0Var.f37941j = new int[nx0Var.e() + 1];
            }
            if (!nx0Var.f37942k) {
                nx0Var.b(true);
                nx0Var.f37942k = true;
            }
            iArr = nx0Var.f37941j;
        } else {
            if (nx0Var.f37943l == null) {
                nx0Var.f37943l = new int[nx0Var.e() + 1];
            }
            if (!nx0Var.f37944m) {
                nx0Var.b(false);
                nx0Var.f37944m = true;
            }
            iArr = nx0Var.f37943l;
        }
        sx0 sx0Var = qx0Var.f39017a;
        if (z10) {
            ux0Var = sx0Var.f39741b;
        } else {
            ux0Var = sx0Var.f39740a;
        }
        rx0 rx0Var = ux0Var.f40502b;
        if (z11) {
            i7 = rx0Var.f39431a;
        } else {
            i7 = rx0Var.f39432b;
        }
        return iArr[i7];
    }

    public final int f(qx0 qx0Var, boolean z10, boolean z11) {
        int i7;
        ux0 ux0Var;
        nx0 nx0Var;
        boolean z12;
        sx0 sx0Var = qx0Var.f39017a;
        if (z10) {
            if (z11) {
                i7 = ((ViewGroup.MarginLayoutParams) sx0Var).leftMargin;
            } else {
                i7 = ((ViewGroup.MarginLayoutParams) sx0Var).rightMargin;
            }
        } else if (z11) {
            i7 = ((ViewGroup.MarginLayoutParams) sx0Var).topMargin;
        } else {
            i7 = ((ViewGroup.MarginLayoutParams) sx0Var).bottomMargin;
        }
        if (i7 == Integer.MIN_VALUE) {
            if (!this.f42235f) {
                return 0;
            }
            if (z10) {
                ux0Var = sx0Var.f39741b;
            } else {
                ux0Var = sx0Var.f39740a;
            }
            if (z10) {
                nx0Var = this.f42233c;
            } else {
                nx0Var = this.d;
            }
            rx0 rx0Var = ux0Var.f40502b;
            if (z10 && this.J) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != z11) {
                int i10 = rx0Var.f39431a;
                return 0;
            }
            int i11 = rx0Var.f39432b;
            nx0Var.e();
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
        return this.f42233c.e();
    }

    public int getOrientation() {
        return this.f42234e;
    }

    public int getRenderHeight() {
        return this.F;
    }

    public int getRowCount() {
        return this.d.e();
    }

    public boolean getUseDefaultMargins() {
        return this.f42235f;
    }

    public final void h() {
        this.f42236n = 0;
        nx0 nx0Var = this.f42233c;
        nx0Var.k();
        nx0 nx0Var2 = this.d;
        nx0Var2.k();
        if (nx0Var != null && nx0Var2 != null) {
            nx0Var.l();
            nx0Var2.l();
        }
    }

    public final void i(qx0 qx0Var, int i7, int i10, boolean z10) {
        qx0Var.d(e(qx0Var, true, false) + e(qx0Var, true, true) + i7, e(qx0Var, false, false) + e(qx0Var, false, true) + i10, z10);
    }

    public final void j(int i7, boolean z10) {
        boolean z11;
        ux0 ux0Var;
        nx0 nx0Var;
        int i10;
        int i11;
        int i12;
        int i13;
        CharSequence charSequence;
        ix0 ix0Var;
        wx0 wx0Var = this.P;
        int i14 = 0;
        if (z10 && this.R && this.f42234e == 0) {
            int childCount = getChildCount();
            int size = View.MeasureSpec.getSize(i7);
            int i15 = this.f42239w * 2;
            if (this.f42232b > 1) {
                i13 = Math.round(size * 0.8f);
            } else {
                i13 = size;
            }
            int max = Math.max(1, i13 - i15);
            ArrayList arrayList = new ArrayList(childCount);
            ix0[] ix0VarArr = new ix0[childCount];
            int i16 = 0;
            while (i16 < childCount) {
                qx0 d = d(i16);
                sx0 sx0Var = d.f39017a;
                rx0 rx0Var = sx0Var.f39741b.f40502b;
                d.e(wx0Var.c(d.f39019c, max));
                if (d.f39018b == null) {
                    ((ViewGroup.MarginLayoutParams) sx0Var).width = i14;
                    ((ViewGroup.MarginLayoutParams) sx0Var).height = i14;
                    i(d, i14, i14, true);
                } else {
                    ((ViewGroup.MarginLayoutParams) sx0Var).height = Math.max(this.f42240x, d.f39021f + this.f42237r + this.f42238s);
                    int b10 = d.f39018b.b();
                    if (b10 > 0) {
                        int i17 = rx0Var.f39431a;
                        int a10 = rx0Var.a();
                        int i18 = ((ViewGroup.MarginLayoutParams) sx0Var).height * b10;
                        ?? obj = new Object();
                        obj.f36191a = i17;
                        obj.f36192b = Math.max(1, a10);
                        obj.f36196g = true;
                        int max2 = Math.max(0, i18);
                        obj.f36194e = max2;
                        obj.d = max2;
                        ix0Var = obj;
                    } else {
                        Layout a11 = d.f39018b.a();
                        TextPaint textPaint = null;
                        if (a11 != null) {
                            charSequence = a11.getText();
                        } else {
                            charSequence = null;
                        }
                        if (a11 != null) {
                            textPaint = a11.getPaint();
                        }
                        ix0Var = c8.va.b(charSequence, textPaint, rx0Var.f39431a, rx0Var.a(), i15, max, d.f39020e);
                    }
                    ix0VarArr[i16] = ix0Var;
                    arrayList.add(ix0Var);
                }
                i16++;
                i14 = 0;
            }
            int[] a12 = c8.va.a(this.f42232b, size, 0, arrayList);
            for (int i19 = 0; i19 < childCount; i19++) {
                qx0 d2 = d(i19);
                ix0 ix0Var2 = ix0VarArr[i19];
                if (ix0Var2 != null) {
                    sx0 sx0Var2 = d2.f39017a;
                    if (d2.f39018b.b() > 0) {
                        ((ViewGroup.MarginLayoutParams) sx0Var2).width = ix0Var2.f36194e;
                    } else {
                        rx0 rx0Var2 = sx0Var2.f39741b.f40502b;
                        int i20 = 0;
                        for (int max3 = Math.max(0, rx0Var2.f39431a); max3 < Math.min(this.f42232b, rx0Var2.f39432b); max3++) {
                            i20 += a12[max3];
                        }
                        int max4 = Math.max(1, i20 - i15);
                        if (d2.f39020e > max4) {
                            d2.e(wx0Var.c(d2.f39019c, max4));
                            ((ViewGroup.MarginLayoutParams) sx0Var2).height = Math.max(this.f42240x, d2.f39021f + this.f42237r + this.f42238s);
                        }
                        ((ViewGroup.MarginLayoutParams) sx0Var2).width = d2.f39020e + i15;
                    }
                    i(d2, ((ViewGroup.MarginLayoutParams) sx0Var2).width, ((ViewGroup.MarginLayoutParams) sx0Var2).height, true);
                }
            }
            return;
        }
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            qx0 d10 = d(i21);
            sx0 sx0Var3 = d10.f39017a;
            if (z10) {
                int size2 = View.MeasureSpec.getSize(i7);
                if (this.f42232b == 2) {
                    i11 = ((int) (size2 / 2.0f)) - (this.f42239w * 4);
                } else {
                    i11 = (int) (size2 / 1.5f);
                }
                d10.e(wx0Var.c(d10.f39019c, i11));
                if (d10.f39018b != null) {
                    ((ViewGroup.MarginLayoutParams) sx0Var3).height = Math.max(this.f42240x, d10.f39021f + this.f42237r + this.f42238s);
                    int b11 = d10.f39018b.b();
                    if (b11 > 0) {
                        i12 = ((ViewGroup.MarginLayoutParams) sx0Var3).height * b11;
                    } else {
                        i12 = (this.f42239w * 2) + d10.f39020e;
                    }
                    ((ViewGroup.MarginLayoutParams) sx0Var3).width = i12;
                } else {
                    ((ViewGroup.MarginLayoutParams) sx0Var3).width = 0;
                    ((ViewGroup.MarginLayoutParams) sx0Var3).height = 0;
                }
                i(d10, ((ViewGroup.MarginLayoutParams) sx0Var3).width, ((ViewGroup.MarginLayoutParams) sx0Var3).height, true);
            } else {
                if (this.f42234e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    ux0Var = sx0Var3.f39741b;
                } else {
                    ux0Var = sx0Var3.f39740a;
                }
                if (ux0.a(ux0Var, z11) == W) {
                    rx0 rx0Var3 = ux0Var.f40502b;
                    if (z11) {
                        nx0Var = this.f42233c;
                    } else {
                        nx0Var = this.d;
                    }
                    int[] g10 = nx0Var.g();
                    int e10 = (g10[rx0Var3.f39432b] - g10[rx0Var3.f39431a]) - (e(d10, z11, false) + e(d10, z11, true));
                    if (z11) {
                        px0 px0Var = d10.f39018b;
                        if (px0Var != null) {
                            i10 = px0Var.b();
                        } else {
                            i10 = 0;
                        }
                        if (i10 > 0) {
                            int max5 = Math.max(1, Math.round(e10 / i10));
                            ((ViewGroup.MarginLayoutParams) sx0Var3).height = max5;
                            d10.f39027m = max5;
                        }
                        i(d10, e10, ((ViewGroup.MarginLayoutParams) sx0Var3).height, false);
                    } else {
                        i(d10, ((ViewGroup.MarginLayoutParams) sx0Var3).width, e10, false);
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
        xx0 xx0Var = this;
        xx0Var.c();
        nx0 nx0Var = xx0Var.d;
        nx0 nx0Var2 = xx0Var.f42233c;
        if (nx0Var2 != null && nx0Var != null) {
            nx0Var2.l();
            nx0Var.l();
        }
        xx0Var.f42232b = 0;
        int childCount = xx0Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            xx0Var.f42232b = Math.max(xx0Var.f42232b, xx0Var.d(i16).f39017a.f39741b.f40502b.f39432b);
        }
        xx0Var.j(i7, true);
        if (xx0Var.f42234e == 0) {
            i11 = nx0Var2.i(i7);
            if (xx0Var.f42241y) {
                i11 = Math.max(i11, View.MeasureSpec.getSize(i7));
                nx0Var2.v.f40187a = i11;
                nx0Var2.f37953w.f40187a = -i11;
                nx0Var2.f37948q = false;
                nx0Var2.g();
            }
            xx0Var.j(i7, false);
            i12 = nx0Var.i(i10);
        } else {
            int i17 = nx0Var.i(i10);
            xx0Var.j(i7, false);
            i11 = nx0Var2.i(i7);
            i12 = i17;
        }
        int max = Math.max(i12, xx0Var.getSuggestedMinimumHeight());
        xx0Var.setMeasuredDimension(i11, max);
        nx0Var2.v.f40187a = i11;
        nx0Var2.f37953w.f40187a = -i11;
        nx0Var2.f37948q = false;
        nx0Var2.g();
        nx0Var.v.f40187a = max;
        nx0Var.f37953w.f40187a = -max;
        nx0Var.f37948q = false;
        nx0Var.g();
        int[] g10 = nx0Var2.g();
        int[] g11 = nx0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = xx0Var.K;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = xx0Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            qx0 d = xx0Var.d(i20);
            sx0 sx0Var = d.f39017a;
            ux0 ux0Var = sx0Var.f39741b;
            ux0 ux0Var2 = sx0Var.f39740a;
            rx0 rx0Var = ux0Var.f40502b;
            rx0 rx0Var2 = ux0Var2.f40502b;
            int i21 = childCount2;
            int i22 = g10[rx0Var.f39431a];
            int i23 = g11[rx0Var2.f39431a];
            int i24 = g10[rx0Var.f39432b] - i22;
            int i25 = g11[rx0Var2.f39432b] - i23;
            int i26 = d.f39025k;
            nx0 nx0Var3 = nx0Var;
            int i27 = d.f39026l;
            jx0 a10 = ux0.a(ux0Var, true);
            jx0 a11 = ux0.a(ux0Var2, false);
            h6.m f10 = nx0Var2.f();
            ox0 ox0Var = (ox0) ((Object[]) f10.d)[((int[]) f10.f13931b)[i20]];
            h6.m f11 = nx0Var3.f();
            nx0 nx0Var4 = nx0Var2;
            ox0 ox0Var2 = (ox0) ((Object[]) f11.d)[((int[]) f11.f13931b)[i20]];
            int b10 = a10.b(d, i24 - ox0Var.d(true));
            int b11 = a11.b(d, i25 - ox0Var2.d(true));
            int e10 = xx0Var.e(d, true, true);
            int e11 = xx0Var.e(d, false, true);
            int e12 = xx0Var.e(d, true, false);
            int i28 = e10 + e12;
            int e13 = e11 + xx0Var.e(d, false, false);
            int a12 = ox0Var.a(xx0Var, d, a10, i26 + i28, true);
            xx0Var = this;
            int a13 = ox0Var2.a(xx0Var, d, a11, i27 + e13, false);
            int c10 = a10.c(i26, i24 - i28);
            int c11 = a11.c(i27, i25 - e13);
            int i29 = i22 + b10 + a12;
            if (!xx0Var.J) {
                i14 = e10 + i29;
            } else {
                i14 = ((i18 - c10) - e12) - i29;
            }
            int i30 = i14;
            int i31 = i23 + b11 + a13 + e11;
            if (d.f39019c != null) {
                if (c10 != d.f39025k || c11 != d.f39026l) {
                    i15 = 0;
                    d.d(c10, c11, false);
                } else {
                    i15 = 0;
                }
                int i32 = d.f39027m;
                if (i32 != 0 && i32 != c11) {
                    rx0 rx0Var3 = d.f39017a.f39740a.f40502b;
                    if (rx0Var3.f39432b - rx0Var3.f39431a <= 1) {
                        ArrayList arrayList2 = xx0Var.L;
                        int size = arrayList2.size();
                        int i33 = i15;
                        while (true) {
                            if (i33 < size) {
                                PointF pointF = (PointF) arrayList2.get(i33);
                                float f12 = pointF.x;
                                float f13 = d.f39017a.f39740a.f40502b.f39431a;
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
            d.f39030p = i30;
            d.f39031q = i31;
            i19 = i20 + 1;
            nx0Var = nx0Var3;
            childCount2 = i21;
            nx0Var2 = nx0Var4;
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            qx0 qx0Var = (qx0) arrayList.get(i34);
            int i35 = qx0Var.f39026l;
            int i36 = qx0Var.d;
            int i37 = i35 - qx0Var.f39027m;
            ArrayList arrayList3 = xx0Var.Q;
            int size3 = arrayList3.size();
            for (int i38 = i36 + 1; i38 < size3; i38++) {
                qx0 qx0Var2 = (qx0) arrayList3.get(i38);
                if (qx0Var.f39017a.f39740a.f40502b.f39431a != qx0Var2.f39017a.f39740a.f40502b.f39431a) {
                    break;
                }
                int i39 = qx0Var.f39027m;
                int i40 = qx0Var2.f39027m;
                if (i39 < i40) {
                    z10 = true;
                    break;
                }
                int i41 = qx0Var2.f39026l - i40;
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
                    qx0 qx0Var3 = (qx0) arrayList3.get(i42);
                    if (qx0Var.f39017a.f39740a.f40502b.f39431a != qx0Var3.f39017a.f39740a.f40502b.f39431a) {
                        break;
                    }
                    int i43 = qx0Var.f39027m;
                    int i44 = qx0Var3.f39027m;
                    if (i43 < i44) {
                        z10 = true;
                        break;
                    }
                    int i45 = qx0Var3.f39026l - i44;
                    if (i45 > 0) {
                        i37 = Math.min(i37, i45);
                    }
                    i42--;
                }
            }
            if (!z10) {
                qx0Var.f39026l = qx0Var.f39027m;
                qx0Var.g();
                max -= i37;
                int i46 = qx0Var.f39017a.f39740a.f40502b.f39431a;
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
                    qx0 qx0Var4 = (qx0) arrayList3.get(i49);
                    if (qx0Var == qx0Var4) {
                        i13 = i49;
                    } else {
                        int i50 = qx0Var.f39017a.f39740a.f40502b.f39431a;
                        int i51 = qx0Var4.f39017a.f39740a.f40502b.f39431a;
                        if (i50 == i51) {
                            if (qx0Var4.f39027m != qx0Var4.f39026l) {
                                arrayList.remove(qx0Var4);
                                if (qx0Var4.d < i36) {
                                    i48--;
                                }
                                i47--;
                            }
                            int i52 = qx0Var4.f39026l - i37;
                            qx0Var4.f39026l = i52;
                            i13 = i49;
                            qx0Var4.d(qx0Var4.f39025k, i52, true);
                        } else {
                            i13 = i49;
                            if (i50 < i51) {
                                qx0Var4.f39031q -= i37;
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
        int childCount3 = xx0Var.getChildCount();
        for (int i53 = 0; i53 < childCount3; i53++) {
            qx0 d2 = xx0Var.d(i53);
            xx0Var.P.g(d2.f39018b, d2.c());
            d2.f39028n = d2.f39030p;
            d2.f39029o = d2.f39025k;
        }
        xx0Var.E = i18;
        xx0Var.F = max;
        xx0Var.G = copyOf;
        xx0Var.setMeasuredDimension(i18, max);
    }

    @Override
    public final void requestLayout() {
        nx0 nx0Var;
        super.requestLayout();
        nx0 nx0Var2 = this.f42233c;
        if (nx0Var2 != null && (nx0Var = this.d) != null) {
            nx0Var2.l();
            nx0Var.l();
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
        this.f42233c.n(i7);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        nx0 nx0Var = this.f42233c;
        nx0Var.f37952u = z10;
        nx0Var.k();
        h();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.H = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.f42241y == z10) {
            return;
        }
        this.f42241y = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i7) {
        this.f42240x = i7;
        requestLayout();
    }

    public void setOrientation(int i7) {
        if (this.f42234e != i7) {
            this.f42234e = i7;
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
            qx0 d = d(i12);
            if (measuredWidth > 0 && (i11 = this.E) != measuredWidth) {
                float f10 = measuredWidth;
                int round = Math.round((d.f39028n * i11) / f10);
                int round2 = Math.round(((d.f39028n + d.f39029o) * this.E) / f10);
                d.f39030p = round;
                d.f39025k = Math.max(0, round2 - round);
                if (d.f39019c != null && d.f39018b != null) {
                    d.f();
                }
            } else {
                int i13 = d.f39028n;
                d.f39030p = i13;
                d.f39025k = Math.max(0, (d.f39029o + i13) - i13);
                if (d.f39019c != null && d.f39018b != null) {
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
                qx0 d2 = d(i17);
                px0 px0Var = d2.f39018b;
                if (px0Var != null) {
                    i10 = px0Var.b();
                } else {
                    i10 = 0;
                }
                if (i10 > 0) {
                    rx0 rx0Var = d2.f39017a.f39740a.f40502b;
                    int max = Math.max(0, rx0Var.f39431a);
                    int min = Math.min(i14, rx0Var.f39432b);
                    if (max < min) {
                        int i18 = 0;
                        for (int i19 = max; i19 < min; i19++) {
                            i18 += iArr2[i19];
                        }
                        int max2 = Math.max(1, Math.round(d2.f39025k / i10)) - i18;
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
                qx0 d10 = d(i24);
                rx0 rx0Var2 = d10.f39017a.f39740a.f40502b;
                int max3 = Math.max(0, Math.min(i14, rx0Var2.f39431a));
                int max4 = Math.max(max3, Math.min(i14, rx0Var2.f39432b));
                int i25 = iArr4[max3];
                int i26 = iArr4[max4];
                d10.f39031q = i25;
                d10.f39026l = Math.max(0, i26 - i25);
                if (d10.f39019c != null) {
                    d10.g();
                }
                this.P.g(d10.f39018b, d10.c());
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
        nx0 nx0Var = this.d;
        nx0Var.f37952u = z10;
        nx0Var.k();
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
        this.f42235f = z10;
        requestLayout();
    }
}
