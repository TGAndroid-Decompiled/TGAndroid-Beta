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
public final class vz0 extends View {
    public static final hz0 R = new hz0(0);
    public static final hz0 S = new hz0(1);
    public static final hz0 T = new hz0(3);
    public static final hz0 U = new hz0(4);
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
    public final uz0 O;
    public final ArrayList P;
    public final tz0 Q;
    public final org.telegram.ui.Cells.q9 f29796a;
    public int f29797b;
    public final lz0 f29798c;
    public final lz0 d;
    public int e;
    public boolean f29799f;
    public int h;
    public int f29800n;
    public int f29801r;
    public int f29802s;
    public int v;
    public int f29803w;
    public boolean f29804x;
    public int f29805y;

    public vz0(Context context, uz0 uz0Var, org.telegram.ui.Cells.q9 q9Var) {
        super(context);
        this.f29798c = new lz0(this, true);
        this.d = new lz0(this, false);
        this.e = 0;
        this.f29799f = false;
        this.h = 1;
        this.f29800n = 0;
        this.f29801r = AndroidUtilities.dp(8.0f);
        this.f29802s = AndroidUtilities.dp(9.0f);
        this.v = AndroidUtilities.dp(12.0f);
        this.f29804x = true;
        this.F = new int[0];
        this.J = new ArrayList();
        this.K = new ArrayList();
        new Path();
        this.L = new Path();
        this.M = new RectF();
        this.N = new float[8];
        this.P = new ArrayList();
        this.f29796a = q9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.O = uz0Var;
        tz0 tz0Var = new tz0(this, this);
        this.Q = tz0Var;
        r0.i0.k(this, tz0Var);
    }

    public static void i(qz0 qz0Var, int i10, int i11, int i12, int i13) {
        pz0 pz0Var = new pz0(i10, i11 + i10);
        sz0 sz0Var = qz0Var.f27789a;
        qz0Var.f27789a = new sz0(sz0Var.f28386a, pz0Var, sz0Var.f28388c, sz0Var.d);
        pz0 pz0Var2 = new pz0(i12, i13 + i12);
        sz0 sz0Var2 = qz0Var.f27790b;
        qz0Var.f27790b = new sz0(sz0Var2.f28386a, pz0Var2, sz0Var2.f28388c, sz0Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        oz0 oz0Var = new oz0(this, arrayList.size());
        qz0 qz0Var = new qz0();
        pz0 pz0Var = new pz0(i11, i13 + i11);
        hz0 hz0Var = U;
        qz0Var.f27789a = new sz0(false, pz0Var, hz0Var, 0.0f);
        qz0Var.f27790b = new sz0(false, new pz0(i10, i12 + i10), hz0Var, 0.0f);
        oz0Var.f27153a = qz0Var;
        oz0Var.f27159j = i11;
        arrayList.add(oz0Var);
        g();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        oz0 oz0Var = new oz0(this, arrayList.size());
        oz0Var.f27155c = pagetablecell;
        qz0 qz0Var = new qz0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        pz0 pz0Var = new pz0(i11, i13 + i11);
        hz0 hz0Var = U;
        qz0Var.f27789a = new sz0(false, pz0Var, hz0Var, 0.0f);
        qz0Var.f27790b = new sz0(false, new pz0(i10, i12 + i10), hz0Var, 1.0f);
        oz0Var.f27153a = qz0Var;
        oz0Var.f27159j = i11;
        arrayList.add(oz0Var);
        int i14 = pagetablecell.rowspan;
        if (i14 > 1) {
            this.K.add(new PointF(i11, i11 + i14));
        }
        g();
    }

    public final void c() {
        boolean z10;
        lz0 lz0Var;
        sz0 sz0Var;
        sz0 sz0Var2;
        int i10;
        int i11 = this.f29800n;
        int i12 = 1;
        if (i11 == 0) {
            if (this.e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                lz0Var = this.f29798c;
            } else {
                lz0Var = this.d;
            }
            int i13 = lz0Var.f26203b;
            if (i13 == Integer.MIN_VALUE) {
                i13 = 0;
            }
            int[] iArr = new int[i13];
            int childCount = getChildCount();
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < childCount; i16++) {
                qz0 qz0Var = d(i16).f27153a;
                if (z10) {
                    sz0Var = qz0Var.f27789a;
                } else {
                    sz0Var = qz0Var.f27790b;
                }
                pz0 pz0Var = sz0Var.f28387b;
                boolean z11 = sz0Var.f28386a;
                int i17 = pz0Var.f27525b;
                int i18 = pz0Var.f27524a;
                int i19 = i17 - i18;
                if (z11) {
                    i14 = i18;
                }
                if (z10) {
                    sz0Var2 = qz0Var.f27790b;
                } else {
                    sz0Var2 = qz0Var.f27789a;
                }
                pz0 pz0Var2 = sz0Var2.f28387b;
                boolean z12 = sz0Var2.f28386a;
                int i20 = pz0Var2.f27525b;
                int i21 = pz0Var2.f27524a;
                int i22 = i20 - i21;
                if (i13 != 0) {
                    if (z12) {
                        i10 = Math.min(i21, i13);
                    } else {
                        i10 = 0;
                    }
                    i22 = Math.min(i22, i13 - i10);
                }
                if (z12) {
                    i15 = i21;
                }
                if (i13 != 0) {
                    if (!z11 || !z12) {
                        while (true) {
                            int i23 = i15 + i22;
                            if (i23 <= i13) {
                                for (int i24 = i15; i24 < i23; i24++) {
                                    if (iArr[i24] <= i14) {
                                    }
                                }
                                break;
                            }
                            if (z12) {
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
                if (z10) {
                    i(qz0Var, i14, i19, i15, i22);
                } else {
                    i(qz0Var, i15, i22, i14, i19);
                }
                i15 += i22;
            }
            int childCount2 = getChildCount();
            for (int i25 = 0; i25 < childCount2; i25++) {
                i12 = (i12 * 31) + d(i25).f27153a.hashCode();
            }
            this.f29800n = i12;
            return;
        }
        int childCount3 = getChildCount();
        int i26 = 1;
        for (int i27 = 0; i27 < childCount3; i27++) {
            i26 = (i26 * 31) + d(i27).f27153a.hashCode();
        }
        if (i11 != i26) {
            g();
            c();
        }
    }

    public final oz0 d(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                return (oz0) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        tz0 tz0Var = this.Q;
        if (tz0Var != null && tz0Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(oz0 oz0Var, boolean z10, boolean z11) {
        lz0 lz0Var;
        int[] iArr;
        sz0 sz0Var;
        int i10;
        if (this.h == 1) {
            return f(oz0Var, z10, z11);
        }
        if (z10) {
            lz0Var = this.f29798c;
        } else {
            lz0Var = this.d;
        }
        if (z11) {
            if (lz0Var.f26208j == null) {
                lz0Var.f26208j = new int[lz0Var.e() + 1];
            }
            if (!lz0Var.f26209k) {
                lz0Var.b(true);
                lz0Var.f26209k = true;
            }
            iArr = lz0Var.f26208j;
        } else {
            if (lz0Var.f26210l == null) {
                lz0Var.f26210l = new int[lz0Var.e() + 1];
            }
            if (!lz0Var.f26211m) {
                lz0Var.b(false);
                lz0Var.f26211m = true;
            }
            iArr = lz0Var.f26210l;
        }
        qz0 qz0Var = oz0Var.f27153a;
        if (z10) {
            sz0Var = qz0Var.f27790b;
        } else {
            sz0Var = qz0Var.f27789a;
        }
        pz0 pz0Var = sz0Var.f28387b;
        if (z11) {
            i10 = pz0Var.f27524a;
        } else {
            i10 = pz0Var.f27525b;
        }
        return iArr[i10];
    }

    public final int f(oz0 oz0Var, boolean z10, boolean z11) {
        int i10;
        sz0 sz0Var;
        lz0 lz0Var;
        boolean z12;
        qz0 qz0Var = oz0Var.f27153a;
        if (z10) {
            if (z11) {
                i10 = ((ViewGroup.MarginLayoutParams) qz0Var).leftMargin;
            } else {
                i10 = ((ViewGroup.MarginLayoutParams) qz0Var).rightMargin;
            }
        } else if (z11) {
            i10 = ((ViewGroup.MarginLayoutParams) qz0Var).topMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) qz0Var).bottomMargin;
        }
        if (i10 == Integer.MIN_VALUE) {
            if (!this.f29799f) {
                return 0;
            }
            if (z10) {
                sz0Var = qz0Var.f27790b;
            } else {
                sz0Var = qz0Var.f27789a;
            }
            if (z10) {
                lz0Var = this.f29798c;
            } else {
                lz0Var = this.d;
            }
            pz0 pz0Var = sz0Var.f28387b;
            if (z10 && this.I) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != z11) {
                int i11 = pz0Var.f27524a;
                return 0;
            }
            int i12 = pz0Var.f27525b;
            lz0Var.e();
            return 0;
        }
        return i10;
    }

    public final void g() {
        this.f29800n = 0;
        lz0 lz0Var = this.f29798c;
        lz0Var.k();
        lz0 lz0Var2 = this.d;
        lz0Var2.k();
        if (lz0Var != null && lz0Var2 != null) {
            lz0Var.l();
            lz0Var2.l();
        }
    }

    public int getAlignmentMode() {
        return this.h;
    }

    public int getChildCount() {
        return this.P.size();
    }

    public int getColumnCount() {
        return this.f29798c.e();
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
        return this.f29799f;
    }

    public final void h(int i10, boolean z10) {
        boolean z11;
        sz0 sz0Var;
        lz0 lz0Var;
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            oz0 d = d(i14);
            qz0 qz0Var = d.f27153a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                if (this.f29797b == 2) {
                    i12 = ((int) (size / 2.0f)) - (this.v * 4);
                } else {
                    i12 = (int) (size / 1.5f);
                }
                d.e(this.O.createTextLayout(d.f27155c, i12));
                if (d.f27154b != null) {
                    ((ViewGroup.MarginLayoutParams) qz0Var).height = Math.max(this.f29803w, d.f27156f + this.f29801r + this.f29802s);
                    int emojiOnlyCount = d.f27154b.getEmojiOnlyCount();
                    if (emojiOnlyCount > 0) {
                        i13 = ((ViewGroup.MarginLayoutParams) qz0Var).height * emojiOnlyCount;
                    } else {
                        i13 = (this.v * 2) + d.e;
                    }
                    ((ViewGroup.MarginLayoutParams) qz0Var).width = i13;
                } else {
                    ((ViewGroup.MarginLayoutParams) qz0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) qz0Var).height = 0;
                }
                int i15 = ((ViewGroup.MarginLayoutParams) qz0Var).width;
                int i16 = ((ViewGroup.MarginLayoutParams) qz0Var).height;
                d.d(e(d, true, false) + e(d, true, true) + i15, e(d, false, false) + e(d, false, true) + i16, true);
            } else {
                if (this.e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    sz0Var = qz0Var.f27790b;
                } else {
                    sz0Var = qz0Var.f27789a;
                }
                if (sz0.a(sz0Var, z11) == U) {
                    pz0 pz0Var = sz0Var.f28387b;
                    if (z11) {
                        lz0Var = this.f29798c;
                    } else {
                        lz0Var = this.d;
                    }
                    int[] g10 = lz0Var.g();
                    int e = (g10[pz0Var.f27525b] - g10[pz0Var.f27524a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        nz0 nz0Var = d.f27154b;
                        if (nz0Var != null) {
                            i11 = nz0Var.getEmojiOnlyCount();
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            int max = Math.max(1, Math.round(e / i11));
                            ((ViewGroup.MarginLayoutParams) qz0Var).height = max;
                            d.f27162m = max;
                        }
                        int i17 = ((ViewGroup.MarginLayoutParams) qz0Var).height;
                        d.d(e(d, true, false) + e(d, true, true) + e, e(d, false, false) + e(d, false, true) + i17, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) qz0Var).width, e(d, false, false) + e(d, false, true) + e, false);
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
        vz0 vz0Var = this;
        vz0Var.c();
        lz0 lz0Var = vz0Var.d;
        lz0 lz0Var2 = vz0Var.f29798c;
        if (lz0Var2 != null && lz0Var != null) {
            lz0Var2.l();
            lz0Var.l();
        }
        vz0Var.f29797b = 0;
        int childCount = vz0Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            vz0Var.f29797b = Math.max(vz0Var.f29797b, vz0Var.d(i16).f27153a.f27790b.f28387b.f27525b);
        }
        vz0Var.h(i10, true);
        if (vz0Var.e == 0) {
            i12 = lz0Var2.i(i10);
            if (vz0Var.f29804x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                lz0Var2.v.f28095a = i12;
                lz0Var2.f26220w.f28095a = -i12;
                lz0Var2.f26215q = false;
                lz0Var2.g();
            }
            vz0Var.h(i10, false);
            i13 = lz0Var.i(i11);
        } else {
            int i17 = lz0Var.i(i11);
            vz0Var.h(i10, false);
            i12 = lz0Var2.i(i10);
            i13 = i17;
        }
        int max = Math.max(i13, vz0Var.getSuggestedMinimumHeight());
        vz0Var.setMeasuredDimension(i12, max);
        lz0Var2.v.f28095a = i12;
        lz0Var2.f26220w.f28095a = -i12;
        lz0Var2.f26215q = false;
        lz0Var2.g();
        lz0Var.v.f28095a = max;
        lz0Var.f26220w.f28095a = -max;
        lz0Var.f26215q = false;
        lz0Var.g();
        int[] g10 = lz0Var2.g();
        int[] g11 = lz0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = vz0Var.J;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = vz0Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            oz0 d = vz0Var.d(i20);
            qz0 qz0Var = d.f27153a;
            sz0 sz0Var = qz0Var.f27790b;
            sz0 sz0Var2 = qz0Var.f27789a;
            pz0 pz0Var = sz0Var.f28387b;
            pz0 pz0Var2 = sz0Var2.f28387b;
            int i21 = childCount2;
            int i22 = g10[pz0Var.f27524a];
            int i23 = g11[pz0Var2.f27524a];
            int i24 = g10[pz0Var.f27525b] - i22;
            int i25 = g11[pz0Var2.f27525b] - i23;
            int i26 = d.f27160k;
            lz0 lz0Var3 = lz0Var;
            int i27 = d.f27161l;
            hz0 a2 = sz0.a(sz0Var, true);
            hz0 a10 = sz0.a(sz0Var2, false);
            la.h f7 = lz0Var2.f();
            mz0 mz0Var = (mz0) ((Object[]) f7.d)[((int[]) f7.f14166b)[i20]];
            la.h f10 = lz0Var3.f();
            lz0 lz0Var4 = lz0Var2;
            mz0 mz0Var2 = (mz0) ((Object[]) f10.d)[((int[]) f10.f14166b)[i20]];
            int b10 = a2.b(d, i24 - mz0Var.d(true));
            int b11 = a10.b(d, i25 - mz0Var2.d(true));
            int e = vz0Var.e(d, true, true);
            int e7 = vz0Var.e(d, false, true);
            int e10 = vz0Var.e(d, true, false);
            int i28 = e + e10;
            int e11 = e7 + vz0Var.e(d, false, false);
            int a11 = mz0Var.a(vz0Var, d, a2, i26 + i28, true);
            vz0Var = this;
            int a12 = mz0Var2.a(vz0Var, d, a10, i27 + e11, false);
            int c10 = a2.c(i26, i24 - i28);
            int c11 = a10.c(i27, i25 - e11);
            int i29 = i22 + b10 + a11;
            if (!vz0Var.I) {
                i15 = e + i29;
            } else {
                i15 = ((i18 - c10) - e10) - i29;
            }
            int i30 = i15;
            int i31 = i23 + b11 + a12 + e7;
            if (d.f27155c != null) {
                if (c10 != d.f27160k || c11 != d.f27161l) {
                    d.d(c10, c11, false);
                }
                int i32 = d.f27162m;
                if (i32 != 0 && i32 != c11) {
                    pz0 pz0Var3 = d.f27153a.f27789a.f28387b;
                    if (pz0Var3.f27525b - pz0Var3.f27524a <= 1) {
                        ArrayList arrayList2 = vz0Var.K;
                        int size = arrayList2.size();
                        int i33 = 0;
                        while (true) {
                            if (i33 < size) {
                                PointF pointF = (PointF) arrayList2.get(i33);
                                float f11 = pointF.x;
                                float f12 = d.f27153a.f27789a.f28387b.f27524a;
                                if (f11 > f12 || pointF.y <= f12) {
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
            d.f27165p = i30;
            d.f27166q = i31;
            i19 = i20 + 1;
            lz0Var = lz0Var3;
            childCount2 = i21;
            lz0Var2 = lz0Var4;
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            oz0 oz0Var = (oz0) arrayList.get(i34);
            int i35 = oz0Var.f27161l;
            int i36 = oz0Var.d;
            int i37 = i35 - oz0Var.f27162m;
            ArrayList arrayList3 = vz0Var.P;
            int size3 = arrayList3.size();
            for (int i38 = i36 + 1; i38 < size3; i38++) {
                oz0 oz0Var2 = (oz0) arrayList3.get(i38);
                if (oz0Var.f27153a.f27789a.f28387b.f27524a != oz0Var2.f27153a.f27789a.f28387b.f27524a) {
                    break;
                }
                int i39 = oz0Var.f27162m;
                int i40 = oz0Var2.f27162m;
                if (i39 < i40) {
                    z10 = true;
                    break;
                }
                int i41 = oz0Var2.f27161l - i40;
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
                    oz0 oz0Var3 = (oz0) arrayList3.get(i42);
                    if (oz0Var.f27153a.f27789a.f28387b.f27524a != oz0Var3.f27153a.f27789a.f28387b.f27524a) {
                        break;
                    }
                    int i43 = oz0Var.f27162m;
                    int i44 = oz0Var3.f27162m;
                    if (i43 < i44) {
                        z10 = true;
                        break;
                    }
                    int i45 = oz0Var3.f27161l - i44;
                    if (i45 > 0) {
                        i37 = Math.min(i37, i45);
                    }
                    i42--;
                }
            }
            if (!z10) {
                oz0Var.f27161l = oz0Var.f27162m;
                oz0Var.g();
                max -= i37;
                int i46 = oz0Var.f27153a.f27789a.f28387b.f27524a;
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
                    oz0 oz0Var4 = (oz0) arrayList3.get(i49);
                    if (oz0Var == oz0Var4) {
                        i14 = i49;
                    } else {
                        int i50 = oz0Var.f27153a.f27789a.f28387b.f27524a;
                        int i51 = oz0Var4.f27153a.f27789a.f28387b.f27524a;
                        if (i50 == i51) {
                            if (oz0Var4.f27162m != oz0Var4.f27161l) {
                                arrayList.remove(oz0Var4);
                                if (oz0Var4.d < i36) {
                                    i48--;
                                }
                                i47--;
                            }
                            int i52 = oz0Var4.f27161l - i37;
                            oz0Var4.f27161l = i52;
                            i14 = i49;
                            oz0Var4.d(oz0Var4.f27160k, i52, true);
                        } else {
                            i14 = i49;
                            if (i50 < i51) {
                                oz0Var4.f27166q -= i37;
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
        int childCount3 = vz0Var.getChildCount();
        for (int i53 = 0; i53 < childCount3; i53++) {
            oz0 d10 = vz0Var.d(i53);
            vz0Var.O.onLayoutChild(d10.f27154b, d10.b(), d10.c());
            d10.f27163n = d10.f27165p;
            d10.f27164o = d10.f27160k;
        }
        vz0Var.f29805y = i18;
        vz0Var.E = max;
        vz0Var.F = copyOf;
        vz0Var.setMeasuredDimension(i18, max);
    }

    @Override
    public final void requestLayout() {
        lz0 lz0Var;
        super.requestLayout();
        lz0 lz0Var2 = this.f29798c;
        if (lz0Var2 != null && (lz0Var = this.d) != null) {
            lz0Var2.l();
            lz0Var.l();
        }
    }

    public void setAlignmentMode(int i10) {
        this.h = i10;
        requestLayout();
    }

    public void setColumnCount(int i10) {
        this.f29798c.n(i10);
        g();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        lz0 lz0Var = this.f29798c;
        lz0Var.f26219u = z10;
        lz0Var.k();
        g();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.G = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.f29804x == z10) {
            return;
        }
        this.f29804x = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i10) {
        this.f29803w = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        if (this.e != i10) {
            this.e = i10;
            g();
            requestLayout();
        }
    }

    public void setRenderWidth(int i10) {
        int i11;
        int i12;
        int measuredWidth = getMeasuredWidth();
        this.f29805y = Math.max(measuredWidth, i10);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            oz0 d = d(i13);
            if (measuredWidth > 0 && (i12 = this.f29805y) != measuredWidth) {
                float f7 = measuredWidth;
                int round = Math.round((d.f27163n * i12) / f7);
                int round2 = Math.round(((d.f27163n + d.f27164o) * this.f29805y) / f7);
                d.f27165p = round;
                d.f27160k = Math.max(0, round2 - round);
                if (d.f27155c != null && d.f27154b != null) {
                    d.f();
                }
            } else {
                int i14 = d.f27163n;
                d.f27165p = i14;
                d.f27160k = Math.max(0, (d.f27164o + i14) - i14);
                if (d.f27155c != null && d.f27154b != null) {
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
                oz0 d10 = d(i18);
                nz0 nz0Var = d10.f27154b;
                if (nz0Var != null) {
                    i11 = nz0Var.getEmojiOnlyCount();
                } else {
                    i11 = 0;
                }
                if (i11 > 0) {
                    pz0 pz0Var = d10.f27153a.f27789a.f28387b;
                    int max = Math.max(0, pz0Var.f27524a);
                    int min = Math.min(i15, pz0Var.f27525b);
                    if (max < min) {
                        int i19 = 0;
                        for (int i20 = max; i20 < min; i20++) {
                            i19 += iArr2[i20];
                        }
                        int max2 = Math.max(1, Math.round(d10.f27160k / i11)) - i19;
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
                oz0 d11 = d(i25);
                pz0 pz0Var2 = d11.f27153a.f27789a.f28387b;
                int max3 = Math.max(0, Math.min(i15, pz0Var2.f27524a));
                int max4 = Math.max(max3, Math.min(i15, pz0Var2.f27525b));
                int i26 = iArr4[max3];
                int i27 = iArr4[max4];
                d11.f27166q = i26;
                d11.f27161l = Math.max(0, i27 - i26);
                if (d11.f27155c != null) {
                    d11.g();
                }
                this.O.onLayoutChild(d11.f27154b, d11.b(), d11.c());
            }
        }
        invalidate();
    }

    public void setRowCount(int i10) {
        this.d.n(i10);
        g();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z10) {
        lz0 lz0Var = this.d;
        lz0Var.f26219u = z10;
        lz0Var.k();
        g();
        requestLayout();
    }

    public void setRtl(boolean z10) {
        this.I = z10;
    }

    public void setStriped(boolean z10) {
        this.H = z10;
    }

    public void setUseDefaultMargins(boolean z10) {
        this.f29799f = z10;
        requestLayout();
    }
}
