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
public final class oz0 extends View {
    public static final az0 O = new az0(0);
    public static final az0 P = new az0(1);
    public static final az0 Q = new az0(3);
    public static final az0 R = new az0(4);
    public int B;
    public int[] C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final ArrayList G;
    public final ArrayList H;
    public final Path I;
    public final RectF J;
    public final float[] K;
    public final nz0 L;
    public final ArrayList M;
    public final mz0 N;
    public final org.telegram.ui.Cells.m9 f29895a;
    public int f29896b;
    public final ez0 f29897c;
    public final ez0 d;
    public int f29898e;
    public boolean f29899f;
    public int h;
    public int f29900n;
    public int f29901r;
    public int f29902s;
    public int v;
    public int f29903w;
    public boolean f29904x;
    public int f29905y;

    public oz0(Context context, nz0 nz0Var, org.telegram.ui.Cells.m9 m9Var) {
        super(context);
        this.f29897c = new ez0(this, true);
        this.d = new ez0(this, false);
        this.f29898e = 0;
        this.f29899f = false;
        this.h = 1;
        this.f29900n = 0;
        this.f29901r = AndroidUtilities.dp(8.0f);
        this.f29902s = AndroidUtilities.dp(9.0f);
        this.v = AndroidUtilities.dp(12.0f);
        this.f29904x = true;
        this.C = new int[0];
        this.G = new ArrayList();
        this.H = new ArrayList();
        new Path();
        this.I = new Path();
        this.J = new RectF();
        this.K = new float[8];
        this.M = new ArrayList();
        this.f29895a = m9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.L = nz0Var;
        mz0 mz0Var = new mz0(this, this);
        this.N = mz0Var;
        r0.j0.k(this, mz0Var);
    }

    public static void i(jz0 jz0Var, int i10, int i11, int i12, int i13) {
        iz0 iz0Var = new iz0(i10, i11 + i10);
        lz0 lz0Var = jz0Var.f28234a;
        jz0Var.f28234a = new lz0(lz0Var.f28866a, iz0Var, lz0Var.f28868c, lz0Var.d);
        iz0 iz0Var2 = new iz0(i12, i13 + i12);
        lz0 lz0Var2 = jz0Var.f28235b;
        jz0Var.f28235b = new lz0(lz0Var2.f28866a, iz0Var2, lz0Var2.f28868c, lz0Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.M;
        hz0 hz0Var = new hz0(this, arrayList.size());
        jz0 jz0Var = new jz0();
        iz0 iz0Var = new iz0(i11, i13 + i11);
        az0 az0Var = R;
        jz0Var.f28234a = new lz0(false, iz0Var, az0Var, 0.0f);
        jz0Var.f28235b = new lz0(false, new iz0(i10, i12 + i10), az0Var, 0.0f);
        hz0Var.f27612a = jz0Var;
        hz0Var.f27619j = i11;
        arrayList.add(hz0Var);
        g();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.M;
        hz0 hz0Var = new hz0(this, arrayList.size());
        hz0Var.f27614c = pagetablecell;
        jz0 jz0Var = new jz0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        iz0 iz0Var = new iz0(i11, i13 + i11);
        az0 az0Var = R;
        jz0Var.f28234a = new lz0(false, iz0Var, az0Var, 0.0f);
        jz0Var.f28235b = new lz0(false, new iz0(i10, i12 + i10), az0Var, 1.0f);
        hz0Var.f27612a = jz0Var;
        hz0Var.f27619j = i11;
        arrayList.add(hz0Var);
        int i14 = pagetablecell.rowspan;
        if (i14 > 1) {
            this.H.add(new PointF(i11, i11 + i14));
        }
        g();
    }

    public final void c() {
        boolean z4;
        ez0 ez0Var;
        lz0 lz0Var;
        lz0 lz0Var2;
        int i10;
        int i11 = this.f29900n;
        int i12 = 1;
        if (i11 == 0) {
            if (this.f29898e == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                ez0Var = this.f29897c;
            } else {
                ez0Var = this.d;
            }
            int i13 = ez0Var.f26665b;
            if (i13 == Integer.MIN_VALUE) {
                i13 = 0;
            }
            int[] iArr = new int[i13];
            int childCount = getChildCount();
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < childCount; i16++) {
                jz0 jz0Var = d(i16).f27612a;
                if (z4) {
                    lz0Var = jz0Var.f28234a;
                } else {
                    lz0Var = jz0Var.f28235b;
                }
                iz0 iz0Var = lz0Var.f28867b;
                boolean z10 = lz0Var.f28866a;
                int i17 = iz0Var.f27935b;
                int i18 = iz0Var.f27934a;
                int i19 = i17 - i18;
                if (z10) {
                    i14 = i18;
                }
                if (z4) {
                    lz0Var2 = jz0Var.f28235b;
                } else {
                    lz0Var2 = jz0Var.f28234a;
                }
                iz0 iz0Var2 = lz0Var2.f28867b;
                boolean z11 = lz0Var2.f28866a;
                int i20 = iz0Var2.f27935b;
                int i21 = iz0Var2.f27934a;
                int i22 = i20 - i21;
                if (i13 != 0) {
                    if (z11) {
                        i10 = Math.min(i21, i13);
                    } else {
                        i10 = 0;
                    }
                    i22 = Math.min(i22, i13 - i10);
                }
                if (z11) {
                    i15 = i21;
                }
                if (i13 != 0) {
                    if (!z10 || !z11) {
                        while (true) {
                            int i23 = i15 + i22;
                            if (i23 <= i13) {
                                for (int i24 = i15; i24 < i23; i24++) {
                                    if (iArr[i24] <= i14) {
                                    }
                                }
                                break;
                            }
                            if (z11) {
                                i14++;
                            } else if (i23 <= i13) {
                                i15++;
                            } else {
                                i14++;
                                i15 = 0;
                            }
                        }
                    }
                    Arrays.fill(iArr, Math.min(i15, i13), Math.min(i15 + i22, i13), i14 + i19);
                }
                if (z4) {
                    i(jz0Var, i14, i19, i15, i22);
                } else {
                    i(jz0Var, i15, i22, i14, i19);
                }
                i15 += i22;
            }
            int childCount2 = getChildCount();
            for (int i25 = 0; i25 < childCount2; i25++) {
                i12 = (i12 * 31) + d(i25).f27612a.hashCode();
            }
            this.f29900n = i12;
            return;
        }
        int childCount3 = getChildCount();
        int i26 = 1;
        for (int i27 = 0; i27 < childCount3; i27++) {
            i26 = (i26 * 31) + d(i27).f27612a.hashCode();
        }
        if (i11 != i26) {
            g();
            c();
        }
    }

    public final hz0 d(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.M;
            if (i10 < arrayList.size()) {
                return (hz0) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        mz0 mz0Var = this.N;
        if (mz0Var != null && mz0Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(hz0 hz0Var, boolean z4, boolean z10) {
        ez0 ez0Var;
        int[] iArr;
        lz0 lz0Var;
        int i10;
        if (this.h == 1) {
            return f(hz0Var, z4, z10);
        }
        if (z4) {
            ez0Var = this.f29897c;
        } else {
            ez0Var = this.d;
        }
        if (z10) {
            if (ez0Var.f26671j == null) {
                ez0Var.f26671j = new int[ez0Var.e() + 1];
            }
            if (!ez0Var.f26672k) {
                ez0Var.b(true);
                ez0Var.f26672k = true;
            }
            iArr = ez0Var.f26671j;
        } else {
            if (ez0Var.f26673l == null) {
                ez0Var.f26673l = new int[ez0Var.e() + 1];
            }
            if (!ez0Var.f26674m) {
                ez0Var.b(false);
                ez0Var.f26674m = true;
            }
            iArr = ez0Var.f26673l;
        }
        jz0 jz0Var = hz0Var.f27612a;
        if (z4) {
            lz0Var = jz0Var.f28235b;
        } else {
            lz0Var = jz0Var.f28234a;
        }
        iz0 iz0Var = lz0Var.f28867b;
        if (z10) {
            i10 = iz0Var.f27934a;
        } else {
            i10 = iz0Var.f27935b;
        }
        return iArr[i10];
    }

    public final int f(hz0 hz0Var, boolean z4, boolean z10) {
        int i10;
        lz0 lz0Var;
        ez0 ez0Var;
        boolean z11;
        jz0 jz0Var = hz0Var.f27612a;
        if (z4) {
            if (z10) {
                i10 = ((ViewGroup.MarginLayoutParams) jz0Var).leftMargin;
            } else {
                i10 = ((ViewGroup.MarginLayoutParams) jz0Var).rightMargin;
            }
        } else if (z10) {
            i10 = ((ViewGroup.MarginLayoutParams) jz0Var).topMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) jz0Var).bottomMargin;
        }
        if (i10 == Integer.MIN_VALUE) {
            if (!this.f29899f) {
                return 0;
            }
            if (z4) {
                lz0Var = jz0Var.f28235b;
            } else {
                lz0Var = jz0Var.f28234a;
            }
            if (z4) {
                ez0Var = this.f29897c;
            } else {
                ez0Var = this.d;
            }
            iz0 iz0Var = lz0Var.f28867b;
            if (z4 && this.F) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 != z10) {
                int i11 = iz0Var.f27934a;
                return 0;
            }
            int i12 = iz0Var.f27935b;
            ez0Var.e();
            return 0;
        }
        return i10;
    }

    public final void g() {
        this.f29900n = 0;
        ez0 ez0Var = this.f29897c;
        ez0Var.k();
        ez0 ez0Var2 = this.d;
        ez0Var2.k();
        if (ez0Var != null && ez0Var2 != null) {
            ez0Var.l();
            ez0Var2.l();
        }
    }

    public int getAlignmentMode() {
        return this.h;
    }

    public int getChildCount() {
        return this.M.size();
    }

    public int getColumnCount() {
        return this.f29897c.e();
    }

    public int getOrientation() {
        return this.f29898e;
    }

    public int getRenderHeight() {
        return this.B;
    }

    public int getRowCount() {
        return this.d.e();
    }

    public boolean getUseDefaultMargins() {
        return this.f29899f;
    }

    public final void h(int i10, boolean z4) {
        boolean z10;
        lz0 lz0Var;
        ez0 ez0Var;
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            hz0 d = d(i14);
            jz0 jz0Var = d.f27612a;
            if (z4) {
                int size = View.MeasureSpec.getSize(i10);
                if (this.f29896b == 2) {
                    i12 = ((int) (size / 2.0f)) - (this.v * 4);
                } else {
                    i12 = (int) (size / 1.5f);
                }
                d.e(this.L.createTextLayout(d.f27614c, i12));
                if (d.f27613b != null) {
                    ((ViewGroup.MarginLayoutParams) jz0Var).height = Math.max(this.f29903w, d.f27616f + this.f29901r + this.f29902s);
                    int emojiOnlyCount = d.f27613b.getEmojiOnlyCount();
                    if (emojiOnlyCount > 0) {
                        i13 = ((ViewGroup.MarginLayoutParams) jz0Var).height * emojiOnlyCount;
                    } else {
                        i13 = (this.v * 2) + d.f27615e;
                    }
                    ((ViewGroup.MarginLayoutParams) jz0Var).width = i13;
                } else {
                    ((ViewGroup.MarginLayoutParams) jz0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) jz0Var).height = 0;
                }
                int i15 = ((ViewGroup.MarginLayoutParams) jz0Var).width;
                int i16 = ((ViewGroup.MarginLayoutParams) jz0Var).height;
                d.d(e(d, true, false) + e(d, true, true) + i15, e(d, false, false) + e(d, false, true) + i16, true);
            } else {
                if (this.f29898e == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    lz0Var = jz0Var.f28235b;
                } else {
                    lz0Var = jz0Var.f28234a;
                }
                if (lz0.a(lz0Var, z10) == R) {
                    iz0 iz0Var = lz0Var.f28867b;
                    if (z10) {
                        ez0Var = this.f29897c;
                    } else {
                        ez0Var = this.d;
                    }
                    int[] g10 = ez0Var.g();
                    int e6 = (g10[iz0Var.f27935b] - g10[iz0Var.f27934a]) - (e(d, z10, false) + e(d, z10, true));
                    if (z10) {
                        gz0 gz0Var = d.f27613b;
                        if (gz0Var != null) {
                            i11 = gz0Var.getEmojiOnlyCount();
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            int max = Math.max(1, Math.round(e6 / i11));
                            ((ViewGroup.MarginLayoutParams) jz0Var).height = max;
                            d.f27622m = max;
                        }
                        int i17 = ((ViewGroup.MarginLayoutParams) jz0Var).height;
                        d.d(e(d, true, false) + e(d, true, true) + e6, e(d, false, false) + e(d, false, true) + i17, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) jz0Var).width, e(d, false, false) + e(d, false, true) + e6, false);
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
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        c();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        boolean z4;
        int i14;
        int i15;
        oz0 oz0Var = this;
        oz0Var.c();
        ez0 ez0Var = oz0Var.d;
        ez0 ez0Var2 = oz0Var.f29897c;
        if (ez0Var2 != null && ez0Var != null) {
            ez0Var2.l();
            ez0Var.l();
        }
        oz0Var.f29896b = 0;
        int childCount = oz0Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            oz0Var.f29896b = Math.max(oz0Var.f29896b, oz0Var.d(i16).f27612a.f28235b.f28867b.f27935b);
        }
        oz0Var.h(i10, true);
        if (oz0Var.f29898e == 0) {
            i12 = ez0Var2.i(i10);
            if (oz0Var.f29904x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                ez0Var2.v.f28480a = i12;
                ez0Var2.f26683w.f28480a = -i12;
                ez0Var2.f26678q = false;
                ez0Var2.g();
            }
            oz0Var.h(i10, false);
            i13 = ez0Var.i(i11);
        } else {
            int i17 = ez0Var.i(i11);
            oz0Var.h(i10, false);
            i12 = ez0Var2.i(i10);
            i13 = i17;
        }
        int max = Math.max(i13, oz0Var.getSuggestedMinimumHeight());
        oz0Var.setMeasuredDimension(i12, max);
        ez0Var2.v.f28480a = i12;
        ez0Var2.f26683w.f28480a = -i12;
        ez0Var2.f26678q = false;
        ez0Var2.g();
        ez0Var.v.f28480a = max;
        ez0Var.f26683w.f28480a = -max;
        ez0Var.f26678q = false;
        ez0Var.g();
        int[] g10 = ez0Var2.g();
        int[] g11 = ez0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = oz0Var.G;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = oz0Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            hz0 d = oz0Var.d(i20);
            jz0 jz0Var = d.f27612a;
            lz0 lz0Var = jz0Var.f28235b;
            lz0 lz0Var2 = jz0Var.f28234a;
            iz0 iz0Var = lz0Var.f28867b;
            iz0 iz0Var2 = lz0Var2.f28867b;
            int i21 = childCount2;
            int i22 = g10[iz0Var.f27934a];
            int i23 = g11[iz0Var2.f27934a];
            int i24 = g10[iz0Var.f27935b] - i22;
            int i25 = g11[iz0Var2.f27935b] - i23;
            int i26 = d.f27620k;
            ez0 ez0Var3 = ez0Var;
            int i27 = d.f27621l;
            az0 a2 = lz0.a(lz0Var, true);
            az0 a10 = lz0.a(lz0Var2, false);
            l7.w0 f10 = ez0Var2.f();
            fz0 fz0Var = (fz0) ((Object[]) f10.d)[((int[]) f10.f12080b)[i20]];
            l7.w0 f11 = ez0Var3.f();
            ez0 ez0Var4 = ez0Var2;
            fz0 fz0Var2 = (fz0) ((Object[]) f11.d)[((int[]) f11.f12080b)[i20]];
            int b10 = a2.b(d, i24 - fz0Var.d(true));
            int b11 = a10.b(d, i25 - fz0Var2.d(true));
            int e6 = oz0Var.e(d, true, true);
            int e10 = oz0Var.e(d, false, true);
            int e11 = oz0Var.e(d, true, false);
            int i28 = e6 + e11;
            int e12 = e10 + oz0Var.e(d, false, false);
            int a11 = fz0Var.a(oz0Var, d, a2, i26 + i28, true);
            oz0Var = this;
            int a12 = fz0Var2.a(oz0Var, d, a10, i27 + e12, false);
            int c3 = a2.c(i26, i24 - i28);
            int c10 = a10.c(i27, i25 - e12);
            int i29 = i22 + b10 + a11;
            if (!oz0Var.F) {
                i15 = e6 + i29;
            } else {
                i15 = ((i18 - c3) - e11) - i29;
            }
            int i30 = i15;
            int i31 = i23 + b11 + a12 + e10;
            if (d.f27614c != null) {
                if (c3 != d.f27620k || c10 != d.f27621l) {
                    d.d(c3, c10, false);
                }
                int i32 = d.f27622m;
                if (i32 != 0 && i32 != c10) {
                    iz0 iz0Var3 = d.f27612a.f28234a.f28867b;
                    if (iz0Var3.f27935b - iz0Var3.f27934a <= 1) {
                        ArrayList arrayList2 = oz0Var.H;
                        int size = arrayList2.size();
                        int i33 = 0;
                        while (true) {
                            if (i33 < size) {
                                PointF pointF = (PointF) arrayList2.get(i33);
                                float f12 = pointF.x;
                                float f13 = d.f27612a.f28234a.f28867b.f27934a;
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
            d.f27625p = i30;
            d.f27626q = i31;
            i19 = i20 + 1;
            ez0Var = ez0Var3;
            childCount2 = i21;
            ez0Var2 = ez0Var4;
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            hz0 hz0Var = (hz0) arrayList.get(i34);
            int i35 = hz0Var.f27621l;
            int i36 = hz0Var.d;
            int i37 = i35 - hz0Var.f27622m;
            ArrayList arrayList3 = oz0Var.M;
            int size3 = arrayList3.size();
            for (int i38 = i36 + 1; i38 < size3; i38++) {
                hz0 hz0Var2 = (hz0) arrayList3.get(i38);
                if (hz0Var.f27612a.f28234a.f28867b.f27934a != hz0Var2.f27612a.f28234a.f28867b.f27934a) {
                    break;
                }
                int i39 = hz0Var.f27622m;
                int i40 = hz0Var2.f27622m;
                if (i39 < i40) {
                    z4 = true;
                    break;
                }
                int i41 = hz0Var2.f27621l - i40;
                if (i41 > 0) {
                    i37 = Math.min(i37, i41);
                }
            }
            z4 = false;
            if (!z4) {
                int i42 = i36 - 1;
                while (true) {
                    if (i42 < 0) {
                        break;
                    }
                    hz0 hz0Var3 = (hz0) arrayList3.get(i42);
                    if (hz0Var.f27612a.f28234a.f28867b.f27934a != hz0Var3.f27612a.f28234a.f28867b.f27934a) {
                        break;
                    }
                    int i43 = hz0Var.f27622m;
                    int i44 = hz0Var3.f27622m;
                    if (i43 < i44) {
                        z4 = true;
                        break;
                    }
                    int i45 = hz0Var3.f27621l - i44;
                    if (i45 > 0) {
                        i37 = Math.min(i37, i45);
                    }
                    i42--;
                }
            }
            if (!z4) {
                hz0Var.f27621l = hz0Var.f27622m;
                hz0Var.g();
                max -= i37;
                int i46 = hz0Var.f27612a.f28234a.f28867b.f27934a;
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
                    hz0 hz0Var4 = (hz0) arrayList3.get(i49);
                    if (hz0Var == hz0Var4) {
                        i14 = i49;
                    } else {
                        int i50 = hz0Var.f27612a.f28234a.f28867b.f27934a;
                        int i51 = hz0Var4.f27612a.f28234a.f28867b.f27934a;
                        if (i50 == i51) {
                            if (hz0Var4.f27622m != hz0Var4.f27621l) {
                                arrayList.remove(hz0Var4);
                                if (hz0Var4.d < i36) {
                                    i48--;
                                }
                                i47--;
                            }
                            int i52 = hz0Var4.f27621l - i37;
                            hz0Var4.f27621l = i52;
                            i14 = i49;
                            hz0Var4.d(hz0Var4.f27620k, i52, true);
                        } else {
                            i14 = i49;
                            if (i50 < i51) {
                                hz0Var4.f27626q -= i37;
                            }
                        }
                    }
                    i49 = i14 + 1;
                }
                i34 = i48;
                size2 = i47;
            }
            i34++;
        }
        int childCount3 = oz0Var.getChildCount();
        for (int i53 = 0; i53 < childCount3; i53++) {
            hz0 d10 = oz0Var.d(i53);
            oz0Var.L.onLayoutChild(d10.f27613b, d10.b(), d10.c());
            d10.f27623n = d10.f27625p;
            d10.f27624o = d10.f27620k;
        }
        oz0Var.f29905y = i18;
        oz0Var.B = max;
        oz0Var.C = copyOf;
        oz0Var.setMeasuredDimension(i18, max);
    }

    @Override
    public final void requestLayout() {
        ez0 ez0Var;
        super.requestLayout();
        ez0 ez0Var2 = this.f29897c;
        if (ez0Var2 != null && (ez0Var = this.d) != null) {
            ez0Var2.l();
            ez0Var.l();
        }
    }

    public void setAlignmentMode(int i10) {
        this.h = i10;
        requestLayout();
    }

    public void setColumnCount(int i10) {
        this.f29897c.n(i10);
        g();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z4) {
        ez0 ez0Var = this.f29897c;
        ez0Var.f26682u = z4;
        ez0Var.k();
        g();
        requestLayout();
    }

    public void setDrawLines(boolean z4) {
        this.D = z4;
    }

    public void setFillWidth(boolean z4) {
        if (this.f29904x == z4) {
            return;
        }
        this.f29904x = z4;
        requestLayout();
    }

    public void setMinimumCellHeight(int i10) {
        this.f29903w = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        if (this.f29898e != i10) {
            this.f29898e = i10;
            g();
            requestLayout();
        }
    }

    public void setRenderWidth(int i10) {
        int i11;
        int i12;
        int measuredWidth = getMeasuredWidth();
        this.f29905y = Math.max(measuredWidth, i10);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            hz0 d = d(i13);
            if (measuredWidth > 0 && (i12 = this.f29905y) != measuredWidth) {
                float f10 = measuredWidth;
                int round = Math.round((d.f27623n * i12) / f10);
                int round2 = Math.round(((d.f27623n + d.f27624o) * this.f29905y) / f10);
                d.f27625p = round;
                d.f27620k = Math.max(0, round2 - round);
                if (d.f27614c != null && d.f27613b != null) {
                    d.f();
                }
            } else {
                int i14 = d.f27623n;
                d.f27625p = i14;
                d.f27620k = Math.max(0, (d.f27624o + i14) - i14);
                if (d.f27614c != null && d.f27613b != null) {
                    d.f();
                }
            }
        }
        int[] iArr = this.C;
        if (iArr.length < 2) {
            this.B = getMeasuredHeight();
        } else {
            int length = iArr.length;
            int i15 = length - 1;
            int[] iArr2 = new int[i15];
            int i16 = 0;
            while (i16 < i15) {
                int[] iArr3 = this.C;
                int i17 = i16 + 1;
                iArr2[i16] = iArr3[i17] - iArr3[i16];
                i16 = i17;
            }
            for (int i18 = 0; i18 < getChildCount(); i18++) {
                hz0 d10 = d(i18);
                gz0 gz0Var = d10.f27613b;
                if (gz0Var != null) {
                    i11 = gz0Var.getEmojiOnlyCount();
                } else {
                    i11 = 0;
                }
                if (i11 > 0) {
                    iz0 iz0Var = d10.f27612a.f28234a.f28867b;
                    int max = Math.max(0, iz0Var.f27934a);
                    int min = Math.min(i15, iz0Var.f27935b);
                    if (max < min) {
                        int i19 = 0;
                        for (int i20 = max; i20 < min; i20++) {
                            i19 += iArr2[i20];
                        }
                        int max2 = Math.max(1, Math.round(d10.f27620k / i11)) - i19;
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
            this.B = iArr4[i15];
            for (int i25 = 0; i25 < getChildCount(); i25++) {
                hz0 d11 = d(i25);
                iz0 iz0Var2 = d11.f27612a.f28234a.f28867b;
                int max3 = Math.max(0, Math.min(i15, iz0Var2.f27934a));
                int max4 = Math.max(max3, Math.min(i15, iz0Var2.f27935b));
                int i26 = iArr4[max3];
                int i27 = iArr4[max4];
                d11.f27626q = i26;
                d11.f27621l = Math.max(0, i27 - i26);
                if (d11.f27614c != null) {
                    d11.g();
                }
                this.L.onLayoutChild(d11.f27613b, d11.b(), d11.c());
            }
        }
        invalidate();
    }

    public void setRowCount(int i10) {
        this.d.n(i10);
        g();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z4) {
        ez0 ez0Var = this.d;
        ez0Var.f26682u = z4;
        ez0Var.k();
        g();
        requestLayout();
    }

    public void setRtl(boolean z4) {
        this.F = z4;
    }

    public void setStriped(boolean z4) {
        this.E = z4;
    }

    public void setUseDefaultMargins(boolean z4) {
        this.f29899f = z4;
        requestLayout();
    }
}
