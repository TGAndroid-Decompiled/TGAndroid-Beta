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
public final class wz0 extends View {
    public static final iz0 R = new iz0(0);
    public static final iz0 S = new iz0(1);
    public static final iz0 T = new iz0(3);
    public static final iz0 U = new iz0(4);
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
    public final vz0 O;
    public final ArrayList P;
    public final uz0 Q;
    public final org.telegram.ui.Cells.s9 f28871a;
    public int f28872b;
    public final mz0 f28873c;
    public final mz0 d;
    public int e;
    public boolean f28874f;
    public int h;
    public int f28875n;
    public int f28876r;
    public int f28877s;
    public int v;
    public int f28878w;
    public boolean f28879x;
    public int f28880y;

    public wz0(Context context, vz0 vz0Var, org.telegram.ui.Cells.s9 s9Var) {
        super(context);
        this.f28873c = new mz0(this, true);
        this.d = new mz0(this, false);
        this.e = 0;
        this.f28874f = false;
        this.h = 1;
        this.f28875n = 0;
        this.f28876r = AndroidUtilities.dp(8.0f);
        this.f28877s = AndroidUtilities.dp(9.0f);
        this.v = AndroidUtilities.dp(12.0f);
        this.f28879x = true;
        this.F = new int[0];
        this.J = new ArrayList();
        this.K = new ArrayList();
        new Path();
        this.L = new Path();
        this.M = new RectF();
        this.N = new float[8];
        this.P = new ArrayList();
        this.f28871a = s9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.O = vz0Var;
        uz0 uz0Var = new uz0(this, this);
        this.Q = uz0Var;
        r0.i0.k(this, uz0Var);
    }

    public static void i(rz0 rz0Var, int i10, int i11, int i12, int i13) {
        qz0 qz0Var = new qz0(i10, i11 + i10);
        tz0 tz0Var = rz0Var.f26881a;
        rz0Var.f26881a = new tz0(tz0Var.f27525a, qz0Var, tz0Var.f27527c, tz0Var.d);
        qz0 qz0Var2 = new qz0(i12, i13 + i12);
        tz0 tz0Var2 = rz0Var.f26882b;
        rz0Var.f26882b = new tz0(tz0Var2.f27525a, qz0Var2, tz0Var2.f27527c, tz0Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        pz0 pz0Var = new pz0(this, arrayList.size());
        rz0 rz0Var = new rz0();
        qz0 qz0Var = new qz0(i11, i13 + i11);
        iz0 iz0Var = U;
        rz0Var.f26881a = new tz0(false, qz0Var, iz0Var, 0.0f);
        rz0Var.f26882b = new tz0(false, new qz0(i10, i12 + i10), iz0Var, 0.0f);
        pz0Var.f26274a = rz0Var;
        pz0Var.f26280j = i11;
        arrayList.add(pz0Var);
        g();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        pz0 pz0Var = new pz0(this, arrayList.size());
        pz0Var.f26276c = pagetablecell;
        rz0 rz0Var = new rz0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        qz0 qz0Var = new qz0(i11, i13 + i11);
        iz0 iz0Var = U;
        rz0Var.f26881a = new tz0(false, qz0Var, iz0Var, 0.0f);
        rz0Var.f26882b = new tz0(false, new qz0(i10, i12 + i10), iz0Var, 1.0f);
        pz0Var.f26274a = rz0Var;
        pz0Var.f26280j = i11;
        arrayList.add(pz0Var);
        int i14 = pagetablecell.rowspan;
        if (i14 > 1) {
            this.K.add(new PointF(i11, i11 + i14));
        }
        g();
    }

    public final void c() {
        boolean z10;
        mz0 mz0Var;
        tz0 tz0Var;
        tz0 tz0Var2;
        int i10;
        int i11 = this.f28875n;
        int i12 = 1;
        if (i11 == 0) {
            if (this.e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                mz0Var = this.f28873c;
            } else {
                mz0Var = this.d;
            }
            int i13 = mz0Var.f25327b;
            if (i13 == Integer.MIN_VALUE) {
                i13 = 0;
            }
            int[] iArr = new int[i13];
            int childCount = getChildCount();
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < childCount; i16++) {
                rz0 rz0Var = d(i16).f26274a;
                if (z10) {
                    tz0Var = rz0Var.f26881a;
                } else {
                    tz0Var = rz0Var.f26882b;
                }
                qz0 qz0Var = tz0Var.f27526b;
                boolean z11 = tz0Var.f27525a;
                int i17 = qz0Var.f26500b;
                int i18 = qz0Var.f26499a;
                int i19 = i17 - i18;
                if (z11) {
                    i14 = i18;
                }
                if (z10) {
                    tz0Var2 = rz0Var.f26882b;
                } else {
                    tz0Var2 = rz0Var.f26881a;
                }
                qz0 qz0Var2 = tz0Var2.f27526b;
                boolean z12 = tz0Var2.f27525a;
                int i20 = qz0Var2.f26500b;
                int i21 = qz0Var2.f26499a;
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
                    i(rz0Var, i14, i19, i15, i22);
                } else {
                    i(rz0Var, i15, i22, i14, i19);
                }
                i15 += i22;
            }
            int childCount2 = getChildCount();
            for (int i25 = 0; i25 < childCount2; i25++) {
                i12 = (i12 * 31) + d(i25).f26274a.hashCode();
            }
            this.f28875n = i12;
            return;
        }
        int childCount3 = getChildCount();
        int i26 = 1;
        for (int i27 = 0; i27 < childCount3; i27++) {
            i26 = (i26 * 31) + d(i27).f26274a.hashCode();
        }
        if (i11 != i26) {
            g();
            c();
        }
    }

    public final pz0 d(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                return (pz0) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        uz0 uz0Var = this.Q;
        if (uz0Var != null && uz0Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(pz0 pz0Var, boolean z10, boolean z11) {
        mz0 mz0Var;
        int[] iArr;
        tz0 tz0Var;
        int i10;
        if (this.h == 1) {
            return f(pz0Var, z10, z11);
        }
        if (z10) {
            mz0Var = this.f28873c;
        } else {
            mz0Var = this.d;
        }
        if (z11) {
            if (mz0Var.f25332j == null) {
                mz0Var.f25332j = new int[mz0Var.e() + 1];
            }
            if (!mz0Var.f25333k) {
                mz0Var.b(true);
                mz0Var.f25333k = true;
            }
            iArr = mz0Var.f25332j;
        } else {
            if (mz0Var.f25334l == null) {
                mz0Var.f25334l = new int[mz0Var.e() + 1];
            }
            if (!mz0Var.f25335m) {
                mz0Var.b(false);
                mz0Var.f25335m = true;
            }
            iArr = mz0Var.f25334l;
        }
        rz0 rz0Var = pz0Var.f26274a;
        if (z10) {
            tz0Var = rz0Var.f26882b;
        } else {
            tz0Var = rz0Var.f26881a;
        }
        qz0 qz0Var = tz0Var.f27526b;
        if (z11) {
            i10 = qz0Var.f26499a;
        } else {
            i10 = qz0Var.f26500b;
        }
        return iArr[i10];
    }

    public final int f(pz0 pz0Var, boolean z10, boolean z11) {
        int i10;
        tz0 tz0Var;
        mz0 mz0Var;
        boolean z12;
        rz0 rz0Var = pz0Var.f26274a;
        if (z10) {
            if (z11) {
                i10 = ((ViewGroup.MarginLayoutParams) rz0Var).leftMargin;
            } else {
                i10 = ((ViewGroup.MarginLayoutParams) rz0Var).rightMargin;
            }
        } else if (z11) {
            i10 = ((ViewGroup.MarginLayoutParams) rz0Var).topMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) rz0Var).bottomMargin;
        }
        if (i10 == Integer.MIN_VALUE) {
            if (!this.f28874f) {
                return 0;
            }
            if (z10) {
                tz0Var = rz0Var.f26882b;
            } else {
                tz0Var = rz0Var.f26881a;
            }
            if (z10) {
                mz0Var = this.f28873c;
            } else {
                mz0Var = this.d;
            }
            qz0 qz0Var = tz0Var.f27526b;
            if (z10 && this.I) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != z11) {
                int i11 = qz0Var.f26499a;
                return 0;
            }
            int i12 = qz0Var.f26500b;
            mz0Var.e();
            return 0;
        }
        return i10;
    }

    public final void g() {
        this.f28875n = 0;
        mz0 mz0Var = this.f28873c;
        mz0Var.k();
        mz0 mz0Var2 = this.d;
        mz0Var2.k();
        if (mz0Var != null && mz0Var2 != null) {
            mz0Var.l();
            mz0Var2.l();
        }
    }

    public int getAlignmentMode() {
        return this.h;
    }

    public int getChildCount() {
        return this.P.size();
    }

    public int getColumnCount() {
        return this.f28873c.e();
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
        return this.f28874f;
    }

    public final void h(int i10, boolean z10) {
        boolean z11;
        tz0 tz0Var;
        mz0 mz0Var;
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            pz0 d = d(i14);
            rz0 rz0Var = d.f26274a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                if (this.f28872b == 2) {
                    i12 = ((int) (size / 2.0f)) - (this.v * 4);
                } else {
                    i12 = (int) (size / 1.5f);
                }
                d.e(this.O.createTextLayout(d.f26276c, i12));
                if (d.f26275b != null) {
                    ((ViewGroup.MarginLayoutParams) rz0Var).height = Math.max(this.f28878w, d.f26277f + this.f28876r + this.f28877s);
                    int emojiOnlyCount = d.f26275b.getEmojiOnlyCount();
                    if (emojiOnlyCount > 0) {
                        i13 = ((ViewGroup.MarginLayoutParams) rz0Var).height * emojiOnlyCount;
                    } else {
                        i13 = (this.v * 2) + d.e;
                    }
                    ((ViewGroup.MarginLayoutParams) rz0Var).width = i13;
                } else {
                    ((ViewGroup.MarginLayoutParams) rz0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) rz0Var).height = 0;
                }
                int i15 = ((ViewGroup.MarginLayoutParams) rz0Var).width;
                int i16 = ((ViewGroup.MarginLayoutParams) rz0Var).height;
                d.d(e(d, true, false) + e(d, true, true) + i15, e(d, false, false) + e(d, false, true) + i16, true);
            } else {
                if (this.e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    tz0Var = rz0Var.f26882b;
                } else {
                    tz0Var = rz0Var.f26881a;
                }
                if (tz0.a(tz0Var, z11) == U) {
                    qz0 qz0Var = tz0Var.f27526b;
                    if (z11) {
                        mz0Var = this.f28873c;
                    } else {
                        mz0Var = this.d;
                    }
                    int[] g10 = mz0Var.g();
                    int e = (g10[qz0Var.f26500b] - g10[qz0Var.f26499a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        oz0 oz0Var = d.f26275b;
                        if (oz0Var != null) {
                            i11 = oz0Var.getEmojiOnlyCount();
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            int max = Math.max(1, Math.round(e / i11));
                            ((ViewGroup.MarginLayoutParams) rz0Var).height = max;
                            d.f26283m = max;
                        }
                        int i17 = ((ViewGroup.MarginLayoutParams) rz0Var).height;
                        d.d(e(d, true, false) + e(d, true, true) + e, e(d, false, false) + e(d, false, true) + i17, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) rz0Var).width, e(d, false, false) + e(d, false, true) + e, false);
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
        wz0 wz0Var = this;
        wz0Var.c();
        mz0 mz0Var = wz0Var.d;
        mz0 mz0Var2 = wz0Var.f28873c;
        if (mz0Var2 != null && mz0Var != null) {
            mz0Var2.l();
            mz0Var.l();
        }
        wz0Var.f28872b = 0;
        int childCount = wz0Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            wz0Var.f28872b = Math.max(wz0Var.f28872b, wz0Var.d(i16).f26274a.f26882b.f27526b.f26500b);
        }
        wz0Var.h(i10, true);
        if (wz0Var.e == 0) {
            i12 = mz0Var2.i(i10);
            if (wz0Var.f28879x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                mz0Var2.v.f27237a = i12;
                mz0Var2.f25344w.f27237a = -i12;
                mz0Var2.f25339q = false;
                mz0Var2.g();
            }
            wz0Var.h(i10, false);
            i13 = mz0Var.i(i11);
        } else {
            int i17 = mz0Var.i(i11);
            wz0Var.h(i10, false);
            i12 = mz0Var2.i(i10);
            i13 = i17;
        }
        int max = Math.max(i13, wz0Var.getSuggestedMinimumHeight());
        wz0Var.setMeasuredDimension(i12, max);
        mz0Var2.v.f27237a = i12;
        mz0Var2.f25344w.f27237a = -i12;
        mz0Var2.f25339q = false;
        mz0Var2.g();
        mz0Var.v.f27237a = max;
        mz0Var.f25344w.f27237a = -max;
        mz0Var.f25339q = false;
        mz0Var.g();
        int[] g10 = mz0Var2.g();
        int[] g11 = mz0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = wz0Var.J;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = wz0Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            pz0 d = wz0Var.d(i20);
            rz0 rz0Var = d.f26274a;
            tz0 tz0Var = rz0Var.f26882b;
            tz0 tz0Var2 = rz0Var.f26881a;
            qz0 qz0Var = tz0Var.f27526b;
            qz0 qz0Var2 = tz0Var2.f27526b;
            int i21 = childCount2;
            int i22 = g10[qz0Var.f26499a];
            int i23 = g11[qz0Var2.f26499a];
            int i24 = g10[qz0Var.f26500b] - i22;
            int i25 = g11[qz0Var2.f26500b] - i23;
            int i26 = d.f26281k;
            mz0 mz0Var3 = mz0Var;
            int i27 = d.f26282l;
            iz0 a2 = tz0.a(tz0Var, true);
            iz0 a10 = tz0.a(tz0Var2, false);
            m.e3 f7 = mz0Var2.f();
            nz0 nz0Var = (nz0) ((Object[]) f7.d)[((int[]) f7.f13001b)[i20]];
            m.e3 f10 = mz0Var3.f();
            mz0 mz0Var4 = mz0Var2;
            nz0 nz0Var2 = (nz0) ((Object[]) f10.d)[((int[]) f10.f13001b)[i20]];
            int b10 = a2.b(d, i24 - nz0Var.d(true));
            int b11 = a10.b(d, i25 - nz0Var2.d(true));
            int e = wz0Var.e(d, true, true);
            int e7 = wz0Var.e(d, false, true);
            int e10 = wz0Var.e(d, true, false);
            int i28 = e + e10;
            int e11 = e7 + wz0Var.e(d, false, false);
            int a11 = nz0Var.a(wz0Var, d, a2, i26 + i28, true);
            wz0Var = this;
            int a12 = nz0Var2.a(wz0Var, d, a10, i27 + e11, false);
            int c10 = a2.c(i26, i24 - i28);
            int c11 = a10.c(i27, i25 - e11);
            int i29 = i22 + b10 + a11;
            if (!wz0Var.I) {
                i15 = e + i29;
            } else {
                i15 = ((i18 - c10) - e10) - i29;
            }
            int i30 = i15;
            int i31 = i23 + b11 + a12 + e7;
            if (d.f26276c != null) {
                if (c10 != d.f26281k || c11 != d.f26282l) {
                    d.d(c10, c11, false);
                }
                int i32 = d.f26283m;
                if (i32 != 0 && i32 != c11) {
                    qz0 qz0Var3 = d.f26274a.f26881a.f27526b;
                    if (qz0Var3.f26500b - qz0Var3.f26499a <= 1) {
                        ArrayList arrayList2 = wz0Var.K;
                        int size = arrayList2.size();
                        int i33 = 0;
                        while (true) {
                            if (i33 < size) {
                                PointF pointF = (PointF) arrayList2.get(i33);
                                float f11 = pointF.x;
                                float f12 = d.f26274a.f26881a.f27526b.f26499a;
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
            d.f26286p = i30;
            d.f26287q = i31;
            i19 = i20 + 1;
            mz0Var = mz0Var3;
            childCount2 = i21;
            mz0Var2 = mz0Var4;
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            pz0 pz0Var = (pz0) arrayList.get(i34);
            int i35 = pz0Var.f26282l;
            int i36 = pz0Var.d;
            int i37 = i35 - pz0Var.f26283m;
            ArrayList arrayList3 = wz0Var.P;
            int size3 = arrayList3.size();
            for (int i38 = i36 + 1; i38 < size3; i38++) {
                pz0 pz0Var2 = (pz0) arrayList3.get(i38);
                if (pz0Var.f26274a.f26881a.f27526b.f26499a != pz0Var2.f26274a.f26881a.f27526b.f26499a) {
                    break;
                }
                int i39 = pz0Var.f26283m;
                int i40 = pz0Var2.f26283m;
                if (i39 < i40) {
                    z10 = true;
                    break;
                }
                int i41 = pz0Var2.f26282l - i40;
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
                    pz0 pz0Var3 = (pz0) arrayList3.get(i42);
                    if (pz0Var.f26274a.f26881a.f27526b.f26499a != pz0Var3.f26274a.f26881a.f27526b.f26499a) {
                        break;
                    }
                    int i43 = pz0Var.f26283m;
                    int i44 = pz0Var3.f26283m;
                    if (i43 < i44) {
                        z10 = true;
                        break;
                    }
                    int i45 = pz0Var3.f26282l - i44;
                    if (i45 > 0) {
                        i37 = Math.min(i37, i45);
                    }
                    i42--;
                }
            }
            if (!z10) {
                pz0Var.f26282l = pz0Var.f26283m;
                pz0Var.g();
                max -= i37;
                int i46 = pz0Var.f26274a.f26881a.f27526b.f26499a;
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
                    pz0 pz0Var4 = (pz0) arrayList3.get(i49);
                    if (pz0Var == pz0Var4) {
                        i14 = i49;
                    } else {
                        int i50 = pz0Var.f26274a.f26881a.f27526b.f26499a;
                        int i51 = pz0Var4.f26274a.f26881a.f27526b.f26499a;
                        if (i50 == i51) {
                            if (pz0Var4.f26283m != pz0Var4.f26282l) {
                                arrayList.remove(pz0Var4);
                                if (pz0Var4.d < i36) {
                                    i48--;
                                }
                                i47--;
                            }
                            int i52 = pz0Var4.f26282l - i37;
                            pz0Var4.f26282l = i52;
                            i14 = i49;
                            pz0Var4.d(pz0Var4.f26281k, i52, true);
                        } else {
                            i14 = i49;
                            if (i50 < i51) {
                                pz0Var4.f26287q -= i37;
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
        int childCount3 = wz0Var.getChildCount();
        for (int i53 = 0; i53 < childCount3; i53++) {
            pz0 d10 = wz0Var.d(i53);
            wz0Var.O.onLayoutChild(d10.f26275b, d10.b(), d10.c());
            d10.f26284n = d10.f26286p;
            d10.f26285o = d10.f26281k;
        }
        wz0Var.f28880y = i18;
        wz0Var.E = max;
        wz0Var.F = copyOf;
        wz0Var.setMeasuredDimension(i18, max);
    }

    @Override
    public final void requestLayout() {
        mz0 mz0Var;
        super.requestLayout();
        mz0 mz0Var2 = this.f28873c;
        if (mz0Var2 != null && (mz0Var = this.d) != null) {
            mz0Var2.l();
            mz0Var.l();
        }
    }

    public void setAlignmentMode(int i10) {
        this.h = i10;
        requestLayout();
    }

    public void setColumnCount(int i10) {
        this.f28873c.n(i10);
        g();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        mz0 mz0Var = this.f28873c;
        mz0Var.f25343u = z10;
        mz0Var.k();
        g();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.G = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.f28879x == z10) {
            return;
        }
        this.f28879x = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i10) {
        this.f28878w = i10;
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
        this.f28880y = Math.max(measuredWidth, i10);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            pz0 d = d(i13);
            if (measuredWidth > 0 && (i12 = this.f28880y) != measuredWidth) {
                float f7 = measuredWidth;
                int round = Math.round((d.f26284n * i12) / f7);
                int round2 = Math.round(((d.f26284n + d.f26285o) * this.f28880y) / f7);
                d.f26286p = round;
                d.f26281k = Math.max(0, round2 - round);
                if (d.f26276c != null && d.f26275b != null) {
                    d.f();
                }
            } else {
                int i14 = d.f26284n;
                d.f26286p = i14;
                d.f26281k = Math.max(0, (d.f26285o + i14) - i14);
                if (d.f26276c != null && d.f26275b != null) {
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
                pz0 d10 = d(i18);
                oz0 oz0Var = d10.f26275b;
                if (oz0Var != null) {
                    i11 = oz0Var.getEmojiOnlyCount();
                } else {
                    i11 = 0;
                }
                if (i11 > 0) {
                    qz0 qz0Var = d10.f26274a.f26881a.f27526b;
                    int max = Math.max(0, qz0Var.f26499a);
                    int min = Math.min(i15, qz0Var.f26500b);
                    if (max < min) {
                        int i19 = 0;
                        for (int i20 = max; i20 < min; i20++) {
                            i19 += iArr2[i20];
                        }
                        int max2 = Math.max(1, Math.round(d10.f26281k / i11)) - i19;
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
                pz0 d11 = d(i25);
                qz0 qz0Var2 = d11.f26274a.f26881a.f27526b;
                int max3 = Math.max(0, Math.min(i15, qz0Var2.f26499a));
                int max4 = Math.max(max3, Math.min(i15, qz0Var2.f26500b));
                int i26 = iArr4[max3];
                int i27 = iArr4[max4];
                d11.f26287q = i26;
                d11.f26282l = Math.max(0, i27 - i26);
                if (d11.f26276c != null) {
                    d11.g();
                }
                this.O.onLayoutChild(d11.f26275b, d11.b(), d11.c());
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
        mz0 mz0Var = this.d;
        mz0Var.f25343u = z10;
        mz0Var.k();
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
        this.f28874f = z10;
        requestLayout();
    }
}
