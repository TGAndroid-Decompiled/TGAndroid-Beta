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
public final class xz0 extends View {
    public static final jz0 R = new jz0(0);
    public static final jz0 S = new jz0(1);
    public static final jz0 T = new jz0(3);
    public static final jz0 U = new jz0(4);
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
    public final wz0 O;
    public final ArrayList P;
    public final vz0 Q;
    public final org.telegram.ui.Cells.r9 f30445a;
    public int f30446b;
    public final nz0 f30447c;
    public final nz0 d;
    public int e;
    public boolean f30448f;
    public int h;
    public int f30449n;
    public int f30450r;
    public int f30451s;
    public int v;
    public int f30452w;
    public boolean f30453x;
    public int f30454y;

    public xz0(Context context, wz0 wz0Var, org.telegram.ui.Cells.r9 r9Var) {
        super(context);
        this.f30447c = new nz0(this, true);
        this.d = new nz0(this, false);
        this.e = 0;
        this.f30448f = false;
        this.h = 1;
        this.f30449n = 0;
        this.f30450r = AndroidUtilities.dp(8.0f);
        this.f30451s = AndroidUtilities.dp(9.0f);
        this.v = AndroidUtilities.dp(12.0f);
        this.f30453x = true;
        this.F = new int[0];
        this.J = new ArrayList();
        this.K = new ArrayList();
        new Path();
        this.L = new Path();
        this.M = new RectF();
        this.N = new float[8];
        this.P = new ArrayList();
        this.f30445a = r9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.O = wz0Var;
        vz0 vz0Var = new vz0(this, this);
        this.Q = vz0Var;
        r0.i0.k(this, vz0Var);
    }

    public static void i(sz0 sz0Var, int i10, int i11, int i12, int i13) {
        rz0 rz0Var = new rz0(i10, i11 + i10);
        uz0 uz0Var = sz0Var.f28348a;
        sz0Var.f28348a = new uz0(uz0Var.f28921a, rz0Var, uz0Var.f28923c, uz0Var.d);
        rz0 rz0Var2 = new rz0(i12, i13 + i12);
        uz0 uz0Var2 = sz0Var.f28349b;
        sz0Var.f28349b = new uz0(uz0Var2.f28921a, rz0Var2, uz0Var2.f28923c, uz0Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        qz0 qz0Var = new qz0(this, arrayList.size());
        sz0 sz0Var = new sz0();
        rz0 rz0Var = new rz0(i11, i13 + i11);
        jz0 jz0Var = U;
        sz0Var.f28348a = new uz0(false, rz0Var, jz0Var, 0.0f);
        sz0Var.f28349b = new uz0(false, new rz0(i10, i12 + i10), jz0Var, 0.0f);
        qz0Var.f27714a = sz0Var;
        qz0Var.f27720j = i11;
        arrayList.add(qz0Var);
        g();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        qz0 qz0Var = new qz0(this, arrayList.size());
        qz0Var.f27716c = pagetablecell;
        sz0 sz0Var = new sz0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        rz0 rz0Var = new rz0(i11, i13 + i11);
        jz0 jz0Var = U;
        sz0Var.f28348a = new uz0(false, rz0Var, jz0Var, 0.0f);
        sz0Var.f28349b = new uz0(false, new rz0(i10, i12 + i10), jz0Var, 1.0f);
        qz0Var.f27714a = sz0Var;
        qz0Var.f27720j = i11;
        arrayList.add(qz0Var);
        int i14 = pagetablecell.rowspan;
        if (i14 > 1) {
            this.K.add(new PointF(i11, i11 + i14));
        }
        g();
    }

    public final void c() {
        boolean z10;
        nz0 nz0Var;
        uz0 uz0Var;
        uz0 uz0Var2;
        int i10;
        int i11 = this.f30449n;
        int i12 = 1;
        if (i11 == 0) {
            if (this.e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                nz0Var = this.f30447c;
            } else {
                nz0Var = this.d;
            }
            int i13 = nz0Var.f26910b;
            if (i13 == Integer.MIN_VALUE) {
                i13 = 0;
            }
            int[] iArr = new int[i13];
            int childCount = getChildCount();
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < childCount; i16++) {
                sz0 sz0Var = d(i16).f27714a;
                if (z10) {
                    uz0Var = sz0Var.f28348a;
                } else {
                    uz0Var = sz0Var.f28349b;
                }
                rz0 rz0Var = uz0Var.f28922b;
                boolean z11 = uz0Var.f28921a;
                int i17 = rz0Var.f28077b;
                int i18 = rz0Var.f28076a;
                int i19 = i17 - i18;
                if (z11) {
                    i14 = i18;
                }
                if (z10) {
                    uz0Var2 = sz0Var.f28349b;
                } else {
                    uz0Var2 = sz0Var.f28348a;
                }
                rz0 rz0Var2 = uz0Var2.f28922b;
                boolean z12 = uz0Var2.f28921a;
                int i20 = rz0Var2.f28077b;
                int i21 = rz0Var2.f28076a;
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
                    i(sz0Var, i14, i19, i15, i22);
                } else {
                    i(sz0Var, i15, i22, i14, i19);
                }
                i15 += i22;
            }
            int childCount2 = getChildCount();
            for (int i25 = 0; i25 < childCount2; i25++) {
                i12 = (i12 * 31) + d(i25).f27714a.hashCode();
            }
            this.f30449n = i12;
            return;
        }
        int childCount3 = getChildCount();
        int i26 = 1;
        for (int i27 = 0; i27 < childCount3; i27++) {
            i26 = (i26 * 31) + d(i27).f27714a.hashCode();
        }
        if (i11 != i26) {
            g();
            c();
        }
    }

    public final qz0 d(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                return (qz0) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        vz0 vz0Var = this.Q;
        if (vz0Var != null && vz0Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(qz0 qz0Var, boolean z10, boolean z11) {
        nz0 nz0Var;
        int[] iArr;
        uz0 uz0Var;
        int i10;
        if (this.h == 1) {
            return f(qz0Var, z10, z11);
        }
        if (z10) {
            nz0Var = this.f30447c;
        } else {
            nz0Var = this.d;
        }
        if (z11) {
            if (nz0Var.f26915j == null) {
                nz0Var.f26915j = new int[nz0Var.e() + 1];
            }
            if (!nz0Var.f26916k) {
                nz0Var.b(true);
                nz0Var.f26916k = true;
            }
            iArr = nz0Var.f26915j;
        } else {
            if (nz0Var.f26917l == null) {
                nz0Var.f26917l = new int[nz0Var.e() + 1];
            }
            if (!nz0Var.f26918m) {
                nz0Var.b(false);
                nz0Var.f26918m = true;
            }
            iArr = nz0Var.f26917l;
        }
        sz0 sz0Var = qz0Var.f27714a;
        if (z10) {
            uz0Var = sz0Var.f28349b;
        } else {
            uz0Var = sz0Var.f28348a;
        }
        rz0 rz0Var = uz0Var.f28922b;
        if (z11) {
            i10 = rz0Var.f28076a;
        } else {
            i10 = rz0Var.f28077b;
        }
        return iArr[i10];
    }

    public final int f(qz0 qz0Var, boolean z10, boolean z11) {
        int i10;
        uz0 uz0Var;
        nz0 nz0Var;
        boolean z12;
        sz0 sz0Var = qz0Var.f27714a;
        if (z10) {
            if (z11) {
                i10 = ((ViewGroup.MarginLayoutParams) sz0Var).leftMargin;
            } else {
                i10 = ((ViewGroup.MarginLayoutParams) sz0Var).rightMargin;
            }
        } else if (z11) {
            i10 = ((ViewGroup.MarginLayoutParams) sz0Var).topMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) sz0Var).bottomMargin;
        }
        if (i10 == Integer.MIN_VALUE) {
            if (!this.f30448f) {
                return 0;
            }
            if (z10) {
                uz0Var = sz0Var.f28349b;
            } else {
                uz0Var = sz0Var.f28348a;
            }
            if (z10) {
                nz0Var = this.f30447c;
            } else {
                nz0Var = this.d;
            }
            rz0 rz0Var = uz0Var.f28922b;
            if (z10 && this.I) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != z11) {
                int i11 = rz0Var.f28076a;
                return 0;
            }
            int i12 = rz0Var.f28077b;
            nz0Var.e();
            return 0;
        }
        return i10;
    }

    public final void g() {
        this.f30449n = 0;
        nz0 nz0Var = this.f30447c;
        nz0Var.k();
        nz0 nz0Var2 = this.d;
        nz0Var2.k();
        if (nz0Var != null && nz0Var2 != null) {
            nz0Var.l();
            nz0Var2.l();
        }
    }

    public int getAlignmentMode() {
        return this.h;
    }

    public int getChildCount() {
        return this.P.size();
    }

    public int getColumnCount() {
        return this.f30447c.e();
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
        return this.f30448f;
    }

    public final void h(int i10, boolean z10) {
        boolean z11;
        uz0 uz0Var;
        nz0 nz0Var;
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            qz0 d = d(i14);
            sz0 sz0Var = d.f27714a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                if (this.f30446b == 2) {
                    i12 = ((int) (size / 2.0f)) - (this.v * 4);
                } else {
                    i12 = (int) (size / 1.5f);
                }
                d.e(this.O.createTextLayout(d.f27716c, i12));
                if (d.f27715b != null) {
                    ((ViewGroup.MarginLayoutParams) sz0Var).height = Math.max(this.f30452w, d.f27717f + this.f30450r + this.f30451s);
                    int emojiOnlyCount = d.f27715b.getEmojiOnlyCount();
                    if (emojiOnlyCount > 0) {
                        i13 = ((ViewGroup.MarginLayoutParams) sz0Var).height * emojiOnlyCount;
                    } else {
                        i13 = (this.v * 2) + d.e;
                    }
                    ((ViewGroup.MarginLayoutParams) sz0Var).width = i13;
                } else {
                    ((ViewGroup.MarginLayoutParams) sz0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) sz0Var).height = 0;
                }
                int i15 = ((ViewGroup.MarginLayoutParams) sz0Var).width;
                int i16 = ((ViewGroup.MarginLayoutParams) sz0Var).height;
                d.d(e(d, true, false) + e(d, true, true) + i15, e(d, false, false) + e(d, false, true) + i16, true);
            } else {
                if (this.e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    uz0Var = sz0Var.f28349b;
                } else {
                    uz0Var = sz0Var.f28348a;
                }
                if (uz0.a(uz0Var, z11) == U) {
                    rz0 rz0Var = uz0Var.f28922b;
                    if (z11) {
                        nz0Var = this.f30447c;
                    } else {
                        nz0Var = this.d;
                    }
                    int[] g10 = nz0Var.g();
                    int e = (g10[rz0Var.f28077b] - g10[rz0Var.f28076a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        pz0 pz0Var = d.f27715b;
                        if (pz0Var != null) {
                            i11 = pz0Var.getEmojiOnlyCount();
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            int max = Math.max(1, Math.round(e / i11));
                            ((ViewGroup.MarginLayoutParams) sz0Var).height = max;
                            d.f27723m = max;
                        }
                        int i17 = ((ViewGroup.MarginLayoutParams) sz0Var).height;
                        d.d(e(d, true, false) + e(d, true, true) + e, e(d, false, false) + e(d, false, true) + i17, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) sz0Var).width, e(d, false, false) + e(d, false, true) + e, false);
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
        xz0 xz0Var = this;
        xz0Var.c();
        nz0 nz0Var = xz0Var.d;
        nz0 nz0Var2 = xz0Var.f30447c;
        if (nz0Var2 != null && nz0Var != null) {
            nz0Var2.l();
            nz0Var.l();
        }
        xz0Var.f30446b = 0;
        int childCount = xz0Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            xz0Var.f30446b = Math.max(xz0Var.f30446b, xz0Var.d(i16).f27714a.f28349b.f28922b.f28077b);
        }
        xz0Var.h(i10, true);
        if (xz0Var.e == 0) {
            i12 = nz0Var2.i(i10);
            if (xz0Var.f30453x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                nz0Var2.v.f28571a = i12;
                nz0Var2.f26927w.f28571a = -i12;
                nz0Var2.f26922q = false;
                nz0Var2.g();
            }
            xz0Var.h(i10, false);
            i13 = nz0Var.i(i11);
        } else {
            int i17 = nz0Var.i(i11);
            xz0Var.h(i10, false);
            i12 = nz0Var2.i(i10);
            i13 = i17;
        }
        int max = Math.max(i13, xz0Var.getSuggestedMinimumHeight());
        xz0Var.setMeasuredDimension(i12, max);
        nz0Var2.v.f28571a = i12;
        nz0Var2.f26927w.f28571a = -i12;
        nz0Var2.f26922q = false;
        nz0Var2.g();
        nz0Var.v.f28571a = max;
        nz0Var.f26927w.f28571a = -max;
        nz0Var.f26922q = false;
        nz0Var.g();
        int[] g10 = nz0Var2.g();
        int[] g11 = nz0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = xz0Var.J;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = xz0Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            qz0 d = xz0Var.d(i20);
            sz0 sz0Var = d.f27714a;
            uz0 uz0Var = sz0Var.f28349b;
            uz0 uz0Var2 = sz0Var.f28348a;
            rz0 rz0Var = uz0Var.f28922b;
            rz0 rz0Var2 = uz0Var2.f28922b;
            int i21 = childCount2;
            int i22 = g10[rz0Var.f28076a];
            int i23 = g11[rz0Var2.f28076a];
            int i24 = g10[rz0Var.f28077b] - i22;
            int i25 = g11[rz0Var2.f28077b] - i23;
            int i26 = d.f27721k;
            nz0 nz0Var3 = nz0Var;
            int i27 = d.f27722l;
            jz0 a2 = uz0.a(uz0Var, true);
            jz0 a10 = uz0.a(uz0Var2, false);
            lf.h f7 = nz0Var2.f();
            oz0 oz0Var = (oz0) ((Object[]) f7.d)[((int[]) f7.f14230b)[i20]];
            lf.h f10 = nz0Var3.f();
            nz0 nz0Var4 = nz0Var2;
            oz0 oz0Var2 = (oz0) ((Object[]) f10.d)[((int[]) f10.f14230b)[i20]];
            int b10 = a2.b(d, i24 - oz0Var.d(true));
            int b11 = a10.b(d, i25 - oz0Var2.d(true));
            int e = xz0Var.e(d, true, true);
            int e7 = xz0Var.e(d, false, true);
            int e10 = xz0Var.e(d, true, false);
            int i28 = e + e10;
            int e11 = e7 + xz0Var.e(d, false, false);
            int a11 = oz0Var.a(xz0Var, d, a2, i26 + i28, true);
            xz0Var = this;
            int a12 = oz0Var2.a(xz0Var, d, a10, i27 + e11, false);
            int c10 = a2.c(i26, i24 - i28);
            int c11 = a10.c(i27, i25 - e11);
            int i29 = i22 + b10 + a11;
            if (!xz0Var.I) {
                i15 = e + i29;
            } else {
                i15 = ((i18 - c10) - e10) - i29;
            }
            int i30 = i15;
            int i31 = i23 + b11 + a12 + e7;
            if (d.f27716c != null) {
                if (c10 != d.f27721k || c11 != d.f27722l) {
                    d.d(c10, c11, false);
                }
                int i32 = d.f27723m;
                if (i32 != 0 && i32 != c11) {
                    rz0 rz0Var3 = d.f27714a.f28348a.f28922b;
                    if (rz0Var3.f28077b - rz0Var3.f28076a <= 1) {
                        ArrayList arrayList2 = xz0Var.K;
                        int size = arrayList2.size();
                        int i33 = 0;
                        while (true) {
                            if (i33 < size) {
                                PointF pointF = (PointF) arrayList2.get(i33);
                                float f11 = pointF.x;
                                float f12 = d.f27714a.f28348a.f28922b.f28076a;
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
            d.f27726p = i30;
            d.f27727q = i31;
            i19 = i20 + 1;
            nz0Var = nz0Var3;
            childCount2 = i21;
            nz0Var2 = nz0Var4;
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            qz0 qz0Var = (qz0) arrayList.get(i34);
            int i35 = qz0Var.f27722l;
            int i36 = qz0Var.d;
            int i37 = i35 - qz0Var.f27723m;
            ArrayList arrayList3 = xz0Var.P;
            int size3 = arrayList3.size();
            for (int i38 = i36 + 1; i38 < size3; i38++) {
                qz0 qz0Var2 = (qz0) arrayList3.get(i38);
                if (qz0Var.f27714a.f28348a.f28922b.f28076a != qz0Var2.f27714a.f28348a.f28922b.f28076a) {
                    break;
                }
                int i39 = qz0Var.f27723m;
                int i40 = qz0Var2.f27723m;
                if (i39 < i40) {
                    z10 = true;
                    break;
                }
                int i41 = qz0Var2.f27722l - i40;
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
                    qz0 qz0Var3 = (qz0) arrayList3.get(i42);
                    if (qz0Var.f27714a.f28348a.f28922b.f28076a != qz0Var3.f27714a.f28348a.f28922b.f28076a) {
                        break;
                    }
                    int i43 = qz0Var.f27723m;
                    int i44 = qz0Var3.f27723m;
                    if (i43 < i44) {
                        z10 = true;
                        break;
                    }
                    int i45 = qz0Var3.f27722l - i44;
                    if (i45 > 0) {
                        i37 = Math.min(i37, i45);
                    }
                    i42--;
                }
            }
            if (!z10) {
                qz0Var.f27722l = qz0Var.f27723m;
                qz0Var.g();
                max -= i37;
                int i46 = qz0Var.f27714a.f28348a.f28922b.f28076a;
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
                    qz0 qz0Var4 = (qz0) arrayList3.get(i49);
                    if (qz0Var == qz0Var4) {
                        i14 = i49;
                    } else {
                        int i50 = qz0Var.f27714a.f28348a.f28922b.f28076a;
                        int i51 = qz0Var4.f27714a.f28348a.f28922b.f28076a;
                        if (i50 == i51) {
                            if (qz0Var4.f27723m != qz0Var4.f27722l) {
                                arrayList.remove(qz0Var4);
                                if (qz0Var4.d < i36) {
                                    i48--;
                                }
                                i47--;
                            }
                            int i52 = qz0Var4.f27722l - i37;
                            qz0Var4.f27722l = i52;
                            i14 = i49;
                            qz0Var4.d(qz0Var4.f27721k, i52, true);
                        } else {
                            i14 = i49;
                            if (i50 < i51) {
                                qz0Var4.f27727q -= i37;
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
        int childCount3 = xz0Var.getChildCount();
        for (int i53 = 0; i53 < childCount3; i53++) {
            qz0 d10 = xz0Var.d(i53);
            xz0Var.O.onLayoutChild(d10.f27715b, d10.b(), d10.c());
            d10.f27724n = d10.f27726p;
            d10.f27725o = d10.f27721k;
        }
        xz0Var.f30454y = i18;
        xz0Var.E = max;
        xz0Var.F = copyOf;
        xz0Var.setMeasuredDimension(i18, max);
    }

    @Override
    public final void requestLayout() {
        nz0 nz0Var;
        super.requestLayout();
        nz0 nz0Var2 = this.f30447c;
        if (nz0Var2 != null && (nz0Var = this.d) != null) {
            nz0Var2.l();
            nz0Var.l();
        }
    }

    public void setAlignmentMode(int i10) {
        this.h = i10;
        requestLayout();
    }

    public void setColumnCount(int i10) {
        this.f30447c.n(i10);
        g();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        nz0 nz0Var = this.f30447c;
        nz0Var.f26926u = z10;
        nz0Var.k();
        g();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.G = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.f30453x == z10) {
            return;
        }
        this.f30453x = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i10) {
        this.f30452w = i10;
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
        this.f30454y = Math.max(measuredWidth, i10);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            qz0 d = d(i13);
            if (measuredWidth > 0 && (i12 = this.f30454y) != measuredWidth) {
                float f7 = measuredWidth;
                int round = Math.round((d.f27724n * i12) / f7);
                int round2 = Math.round(((d.f27724n + d.f27725o) * this.f30454y) / f7);
                d.f27726p = round;
                d.f27721k = Math.max(0, round2 - round);
                if (d.f27716c != null && d.f27715b != null) {
                    d.f();
                }
            } else {
                int i14 = d.f27724n;
                d.f27726p = i14;
                d.f27721k = Math.max(0, (d.f27725o + i14) - i14);
                if (d.f27716c != null && d.f27715b != null) {
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
                qz0 d10 = d(i18);
                pz0 pz0Var = d10.f27715b;
                if (pz0Var != null) {
                    i11 = pz0Var.getEmojiOnlyCount();
                } else {
                    i11 = 0;
                }
                if (i11 > 0) {
                    rz0 rz0Var = d10.f27714a.f28348a.f28922b;
                    int max = Math.max(0, rz0Var.f28076a);
                    int min = Math.min(i15, rz0Var.f28077b);
                    if (max < min) {
                        int i19 = 0;
                        for (int i20 = max; i20 < min; i20++) {
                            i19 += iArr2[i20];
                        }
                        int max2 = Math.max(1, Math.round(d10.f27721k / i11)) - i19;
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
                qz0 d11 = d(i25);
                rz0 rz0Var2 = d11.f27714a.f28348a.f28922b;
                int max3 = Math.max(0, Math.min(i15, rz0Var2.f28076a));
                int max4 = Math.max(max3, Math.min(i15, rz0Var2.f28077b));
                int i26 = iArr4[max3];
                int i27 = iArr4[max4];
                d11.f27727q = i26;
                d11.f27722l = Math.max(0, i27 - i26);
                if (d11.f27716c != null) {
                    d11.g();
                }
                this.O.onLayoutChild(d11.f27715b, d11.b(), d11.c());
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
        nz0 nz0Var = this.d;
        nz0Var.f26926u = z10;
        nz0Var.k();
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
        this.f30448f = z10;
        requestLayout();
    }
}
