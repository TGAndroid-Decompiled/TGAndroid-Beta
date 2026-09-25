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
public final class uz0 extends View {
    public static final gz0 R = new gz0(0);
    public static final gz0 S = new gz0(1);
    public static final gz0 T = new gz0(3);
    public static final gz0 U = new gz0(4);
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
    public final tz0 O;
    public final ArrayList P;
    public final sz0 Q;
    public final org.telegram.ui.Cells.q9 f28955a;
    public int f28956b;
    public final kz0 f28957c;
    public final kz0 d;
    public int e;
    public boolean f28958f;
    public int h;
    public int f28959n;
    public int f28960r;
    public int f28961s;
    public int v;
    public int f28962w;
    public boolean f28963x;
    public int f28964y;

    public uz0(Context context, tz0 tz0Var, org.telegram.ui.Cells.q9 q9Var) {
        super(context);
        this.f28957c = new kz0(this, true);
        this.d = new kz0(this, false);
        this.e = 0;
        this.f28958f = false;
        this.h = 1;
        this.f28959n = 0;
        this.f28960r = AndroidUtilities.dp(8.0f);
        this.f28961s = AndroidUtilities.dp(9.0f);
        this.v = AndroidUtilities.dp(12.0f);
        this.f28963x = true;
        this.F = new int[0];
        this.J = new ArrayList();
        this.K = new ArrayList();
        new Path();
        this.L = new Path();
        this.M = new RectF();
        this.N = new float[8];
        this.P = new ArrayList();
        this.f28955a = q9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.O = tz0Var;
        sz0 sz0Var = new sz0(this, this);
        this.Q = sz0Var;
        r0.i0.k(this, sz0Var);
    }

    public static void i(pz0 pz0Var, int i10, int i11, int i12, int i13) {
        oz0 oz0Var = new oz0(i10, i11 + i10);
        rz0 rz0Var = pz0Var.f27458a;
        pz0Var.f27458a = new rz0(rz0Var.f28078a, oz0Var, rz0Var.f28080c, rz0Var.d);
        oz0 oz0Var2 = new oz0(i12, i13 + i12);
        rz0 rz0Var2 = pz0Var.f27459b;
        pz0Var.f27459b = new rz0(rz0Var2.f28078a, oz0Var2, rz0Var2.f28080c, rz0Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        nz0 nz0Var = new nz0(this, arrayList.size());
        pz0 pz0Var = new pz0();
        oz0 oz0Var = new oz0(i11, i13 + i11);
        gz0 gz0Var = U;
        pz0Var.f27458a = new rz0(false, oz0Var, gz0Var, 0.0f);
        pz0Var.f27459b = new rz0(false, new oz0(i10, i12 + i10), gz0Var, 0.0f);
        nz0Var.f26839a = pz0Var;
        nz0Var.f26845j = i11;
        arrayList.add(nz0Var);
        g();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        nz0 nz0Var = new nz0(this, arrayList.size());
        nz0Var.f26841c = pagetablecell;
        pz0 pz0Var = new pz0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        oz0 oz0Var = new oz0(i11, i13 + i11);
        gz0 gz0Var = U;
        pz0Var.f27458a = new rz0(false, oz0Var, gz0Var, 0.0f);
        pz0Var.f27459b = new rz0(false, new oz0(i10, i12 + i10), gz0Var, 1.0f);
        nz0Var.f26839a = pz0Var;
        nz0Var.f26845j = i11;
        arrayList.add(nz0Var);
        int i14 = pagetablecell.rowspan;
        if (i14 > 1) {
            this.K.add(new PointF(i11, i11 + i14));
        }
        g();
    }

    public final void c() {
        boolean z10;
        kz0 kz0Var;
        rz0 rz0Var;
        rz0 rz0Var2;
        int i10;
        int i11 = this.f28959n;
        int i12 = 1;
        if (i11 == 0) {
            if (this.e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                kz0Var = this.f28957c;
            } else {
                kz0Var = this.d;
            }
            int i13 = kz0Var.f25912b;
            if (i13 == Integer.MIN_VALUE) {
                i13 = 0;
            }
            int[] iArr = new int[i13];
            int childCount = getChildCount();
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < childCount; i16++) {
                pz0 pz0Var = d(i16).f26839a;
                if (z10) {
                    rz0Var = pz0Var.f27458a;
                } else {
                    rz0Var = pz0Var.f27459b;
                }
                oz0 oz0Var = rz0Var.f28079b;
                boolean z11 = rz0Var.f28078a;
                int i17 = oz0Var.f27221b;
                int i18 = oz0Var.f27220a;
                int i19 = i17 - i18;
                if (z11) {
                    i14 = i18;
                }
                if (z10) {
                    rz0Var2 = pz0Var.f27459b;
                } else {
                    rz0Var2 = pz0Var.f27458a;
                }
                oz0 oz0Var2 = rz0Var2.f28079b;
                boolean z12 = rz0Var2.f28078a;
                int i20 = oz0Var2.f27221b;
                int i21 = oz0Var2.f27220a;
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
                    i(pz0Var, i14, i19, i15, i22);
                } else {
                    i(pz0Var, i15, i22, i14, i19);
                }
                i15 += i22;
            }
            int childCount2 = getChildCount();
            for (int i25 = 0; i25 < childCount2; i25++) {
                i12 = (i12 * 31) + d(i25).f26839a.hashCode();
            }
            this.f28959n = i12;
            return;
        }
        int childCount3 = getChildCount();
        int i26 = 1;
        for (int i27 = 0; i27 < childCount3; i27++) {
            i26 = (i26 * 31) + d(i27).f26839a.hashCode();
        }
        if (i11 != i26) {
            g();
            c();
        }
    }

    public final nz0 d(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                return (nz0) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        sz0 sz0Var = this.Q;
        if (sz0Var != null && sz0Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(nz0 nz0Var, boolean z10, boolean z11) {
        kz0 kz0Var;
        int[] iArr;
        rz0 rz0Var;
        int i10;
        if (this.h == 1) {
            return f(nz0Var, z10, z11);
        }
        if (z10) {
            kz0Var = this.f28957c;
        } else {
            kz0Var = this.d;
        }
        if (z11) {
            if (kz0Var.f25917j == null) {
                kz0Var.f25917j = new int[kz0Var.e() + 1];
            }
            if (!kz0Var.f25918k) {
                kz0Var.b(true);
                kz0Var.f25918k = true;
            }
            iArr = kz0Var.f25917j;
        } else {
            if (kz0Var.f25919l == null) {
                kz0Var.f25919l = new int[kz0Var.e() + 1];
            }
            if (!kz0Var.f25920m) {
                kz0Var.b(false);
                kz0Var.f25920m = true;
            }
            iArr = kz0Var.f25919l;
        }
        pz0 pz0Var = nz0Var.f26839a;
        if (z10) {
            rz0Var = pz0Var.f27459b;
        } else {
            rz0Var = pz0Var.f27458a;
        }
        oz0 oz0Var = rz0Var.f28079b;
        if (z11) {
            i10 = oz0Var.f27220a;
        } else {
            i10 = oz0Var.f27221b;
        }
        return iArr[i10];
    }

    public final int f(nz0 nz0Var, boolean z10, boolean z11) {
        int i10;
        rz0 rz0Var;
        kz0 kz0Var;
        boolean z12;
        pz0 pz0Var = nz0Var.f26839a;
        if (z10) {
            if (z11) {
                i10 = ((ViewGroup.MarginLayoutParams) pz0Var).leftMargin;
            } else {
                i10 = ((ViewGroup.MarginLayoutParams) pz0Var).rightMargin;
            }
        } else if (z11) {
            i10 = ((ViewGroup.MarginLayoutParams) pz0Var).topMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) pz0Var).bottomMargin;
        }
        if (i10 == Integer.MIN_VALUE) {
            if (!this.f28958f) {
                return 0;
            }
            if (z10) {
                rz0Var = pz0Var.f27459b;
            } else {
                rz0Var = pz0Var.f27458a;
            }
            if (z10) {
                kz0Var = this.f28957c;
            } else {
                kz0Var = this.d;
            }
            oz0 oz0Var = rz0Var.f28079b;
            if (z10 && this.I) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != z11) {
                int i11 = oz0Var.f27220a;
                return 0;
            }
            int i12 = oz0Var.f27221b;
            kz0Var.e();
            return 0;
        }
        return i10;
    }

    public final void g() {
        this.f28959n = 0;
        kz0 kz0Var = this.f28957c;
        kz0Var.k();
        kz0 kz0Var2 = this.d;
        kz0Var2.k();
        if (kz0Var != null && kz0Var2 != null) {
            kz0Var.l();
            kz0Var2.l();
        }
    }

    public int getAlignmentMode() {
        return this.h;
    }

    public int getChildCount() {
        return this.P.size();
    }

    public int getColumnCount() {
        return this.f28957c.e();
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
        return this.f28958f;
    }

    public final void h(int i10, boolean z10) {
        boolean z11;
        rz0 rz0Var;
        kz0 kz0Var;
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            nz0 d = d(i14);
            pz0 pz0Var = d.f26839a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                if (this.f28956b == 2) {
                    i12 = ((int) (size / 2.0f)) - (this.v * 4);
                } else {
                    i12 = (int) (size / 1.5f);
                }
                d.e(this.O.createTextLayout(d.f26841c, i12));
                if (d.f26840b != null) {
                    ((ViewGroup.MarginLayoutParams) pz0Var).height = Math.max(this.f28962w, d.f26842f + this.f28960r + this.f28961s);
                    int emojiOnlyCount = d.f26840b.getEmojiOnlyCount();
                    if (emojiOnlyCount > 0) {
                        i13 = ((ViewGroup.MarginLayoutParams) pz0Var).height * emojiOnlyCount;
                    } else {
                        i13 = (this.v * 2) + d.e;
                    }
                    ((ViewGroup.MarginLayoutParams) pz0Var).width = i13;
                } else {
                    ((ViewGroup.MarginLayoutParams) pz0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) pz0Var).height = 0;
                }
                int i15 = ((ViewGroup.MarginLayoutParams) pz0Var).width;
                int i16 = ((ViewGroup.MarginLayoutParams) pz0Var).height;
                d.d(e(d, true, false) + e(d, true, true) + i15, e(d, false, false) + e(d, false, true) + i16, true);
            } else {
                if (this.e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    rz0Var = pz0Var.f27459b;
                } else {
                    rz0Var = pz0Var.f27458a;
                }
                if (rz0.a(rz0Var, z11) == U) {
                    oz0 oz0Var = rz0Var.f28079b;
                    if (z11) {
                        kz0Var = this.f28957c;
                    } else {
                        kz0Var = this.d;
                    }
                    int[] g10 = kz0Var.g();
                    int e = (g10[oz0Var.f27221b] - g10[oz0Var.f27220a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        mz0 mz0Var = d.f26840b;
                        if (mz0Var != null) {
                            i11 = mz0Var.getEmojiOnlyCount();
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            int max = Math.max(1, Math.round(e / i11));
                            ((ViewGroup.MarginLayoutParams) pz0Var).height = max;
                            d.f26848m = max;
                        }
                        int i17 = ((ViewGroup.MarginLayoutParams) pz0Var).height;
                        d.d(e(d, true, false) + e(d, true, true) + e, e(d, false, false) + e(d, false, true) + i17, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) pz0Var).width, e(d, false, false) + e(d, false, true) + e, false);
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
        uz0 uz0Var = this;
        uz0Var.c();
        kz0 kz0Var = uz0Var.d;
        kz0 kz0Var2 = uz0Var.f28957c;
        if (kz0Var2 != null && kz0Var != null) {
            kz0Var2.l();
            kz0Var.l();
        }
        uz0Var.f28956b = 0;
        int childCount = uz0Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            uz0Var.f28956b = Math.max(uz0Var.f28956b, uz0Var.d(i16).f26839a.f27459b.f28079b.f27221b);
        }
        uz0Var.h(i10, true);
        if (uz0Var.e == 0) {
            i12 = kz0Var2.i(i10);
            if (uz0Var.f28963x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                kz0Var2.v.f27800a = i12;
                kz0Var2.f25929w.f27800a = -i12;
                kz0Var2.f25924q = false;
                kz0Var2.g();
            }
            uz0Var.h(i10, false);
            i13 = kz0Var.i(i11);
        } else {
            int i17 = kz0Var.i(i11);
            uz0Var.h(i10, false);
            i12 = kz0Var2.i(i10);
            i13 = i17;
        }
        int max = Math.max(i13, uz0Var.getSuggestedMinimumHeight());
        uz0Var.setMeasuredDimension(i12, max);
        kz0Var2.v.f27800a = i12;
        kz0Var2.f25929w.f27800a = -i12;
        kz0Var2.f25924q = false;
        kz0Var2.g();
        kz0Var.v.f27800a = max;
        kz0Var.f25929w.f27800a = -max;
        kz0Var.f25924q = false;
        kz0Var.g();
        int[] g10 = kz0Var2.g();
        int[] g11 = kz0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = uz0Var.J;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = uz0Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            nz0 d = uz0Var.d(i20);
            pz0 pz0Var = d.f26839a;
            rz0 rz0Var = pz0Var.f27459b;
            rz0 rz0Var2 = pz0Var.f27458a;
            oz0 oz0Var = rz0Var.f28079b;
            oz0 oz0Var2 = rz0Var2.f28079b;
            int i21 = childCount2;
            int i22 = g10[oz0Var.f27220a];
            int i23 = g11[oz0Var2.f27220a];
            int i24 = g10[oz0Var.f27221b] - i22;
            int i25 = g11[oz0Var2.f27221b] - i23;
            int i26 = d.f26846k;
            kz0 kz0Var3 = kz0Var;
            int i27 = d.f26847l;
            gz0 a2 = rz0.a(rz0Var, true);
            gz0 a10 = rz0.a(rz0Var2, false);
            la.h f7 = kz0Var2.f();
            lz0 lz0Var = (lz0) ((Object[]) f7.d)[((int[]) f7.f14166b)[i20]];
            la.h f10 = kz0Var3.f();
            kz0 kz0Var4 = kz0Var2;
            lz0 lz0Var2 = (lz0) ((Object[]) f10.d)[((int[]) f10.f14166b)[i20]];
            int b10 = a2.b(d, i24 - lz0Var.d(true));
            int b11 = a10.b(d, i25 - lz0Var2.d(true));
            int e = uz0Var.e(d, true, true);
            int e7 = uz0Var.e(d, false, true);
            int e10 = uz0Var.e(d, true, false);
            int i28 = e + e10;
            int e11 = e7 + uz0Var.e(d, false, false);
            int a11 = lz0Var.a(uz0Var, d, a2, i26 + i28, true);
            uz0Var = this;
            int a12 = lz0Var2.a(uz0Var, d, a10, i27 + e11, false);
            int c10 = a2.c(i26, i24 - i28);
            int c11 = a10.c(i27, i25 - e11);
            int i29 = i22 + b10 + a11;
            if (!uz0Var.I) {
                i15 = e + i29;
            } else {
                i15 = ((i18 - c10) - e10) - i29;
            }
            int i30 = i15;
            int i31 = i23 + b11 + a12 + e7;
            if (d.f26841c != null) {
                if (c10 != d.f26846k || c11 != d.f26847l) {
                    d.d(c10, c11, false);
                }
                int i32 = d.f26848m;
                if (i32 != 0 && i32 != c11) {
                    oz0 oz0Var3 = d.f26839a.f27458a.f28079b;
                    if (oz0Var3.f27221b - oz0Var3.f27220a <= 1) {
                        ArrayList arrayList2 = uz0Var.K;
                        int size = arrayList2.size();
                        int i33 = 0;
                        while (true) {
                            if (i33 < size) {
                                PointF pointF = (PointF) arrayList2.get(i33);
                                float f11 = pointF.x;
                                float f12 = d.f26839a.f27458a.f28079b.f27220a;
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
            d.f26851p = i30;
            d.f26852q = i31;
            i19 = i20 + 1;
            kz0Var = kz0Var3;
            childCount2 = i21;
            kz0Var2 = kz0Var4;
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            nz0 nz0Var = (nz0) arrayList.get(i34);
            int i35 = nz0Var.f26847l;
            int i36 = nz0Var.d;
            int i37 = i35 - nz0Var.f26848m;
            ArrayList arrayList3 = uz0Var.P;
            int size3 = arrayList3.size();
            for (int i38 = i36 + 1; i38 < size3; i38++) {
                nz0 nz0Var2 = (nz0) arrayList3.get(i38);
                if (nz0Var.f26839a.f27458a.f28079b.f27220a != nz0Var2.f26839a.f27458a.f28079b.f27220a) {
                    break;
                }
                int i39 = nz0Var.f26848m;
                int i40 = nz0Var2.f26848m;
                if (i39 < i40) {
                    z10 = true;
                    break;
                }
                int i41 = nz0Var2.f26847l - i40;
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
                    nz0 nz0Var3 = (nz0) arrayList3.get(i42);
                    if (nz0Var.f26839a.f27458a.f28079b.f27220a != nz0Var3.f26839a.f27458a.f28079b.f27220a) {
                        break;
                    }
                    int i43 = nz0Var.f26848m;
                    int i44 = nz0Var3.f26848m;
                    if (i43 < i44) {
                        z10 = true;
                        break;
                    }
                    int i45 = nz0Var3.f26847l - i44;
                    if (i45 > 0) {
                        i37 = Math.min(i37, i45);
                    }
                    i42--;
                }
            }
            if (!z10) {
                nz0Var.f26847l = nz0Var.f26848m;
                nz0Var.g();
                max -= i37;
                int i46 = nz0Var.f26839a.f27458a.f28079b.f27220a;
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
                    nz0 nz0Var4 = (nz0) arrayList3.get(i49);
                    if (nz0Var == nz0Var4) {
                        i14 = i49;
                    } else {
                        int i50 = nz0Var.f26839a.f27458a.f28079b.f27220a;
                        int i51 = nz0Var4.f26839a.f27458a.f28079b.f27220a;
                        if (i50 == i51) {
                            if (nz0Var4.f26848m != nz0Var4.f26847l) {
                                arrayList.remove(nz0Var4);
                                if (nz0Var4.d < i36) {
                                    i48--;
                                }
                                i47--;
                            }
                            int i52 = nz0Var4.f26847l - i37;
                            nz0Var4.f26847l = i52;
                            i14 = i49;
                            nz0Var4.d(nz0Var4.f26846k, i52, true);
                        } else {
                            i14 = i49;
                            if (i50 < i51) {
                                nz0Var4.f26852q -= i37;
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
        int childCount3 = uz0Var.getChildCount();
        for (int i53 = 0; i53 < childCount3; i53++) {
            nz0 d10 = uz0Var.d(i53);
            uz0Var.O.onLayoutChild(d10.f26840b, d10.b(), d10.c());
            d10.f26849n = d10.f26851p;
            d10.f26850o = d10.f26846k;
        }
        uz0Var.f28964y = i18;
        uz0Var.E = max;
        uz0Var.F = copyOf;
        uz0Var.setMeasuredDimension(i18, max);
    }

    @Override
    public final void requestLayout() {
        kz0 kz0Var;
        super.requestLayout();
        kz0 kz0Var2 = this.f28957c;
        if (kz0Var2 != null && (kz0Var = this.d) != null) {
            kz0Var2.l();
            kz0Var.l();
        }
    }

    public void setAlignmentMode(int i10) {
        this.h = i10;
        requestLayout();
    }

    public void setColumnCount(int i10) {
        this.f28957c.n(i10);
        g();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        kz0 kz0Var = this.f28957c;
        kz0Var.f25928u = z10;
        kz0Var.k();
        g();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.G = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.f28963x == z10) {
            return;
        }
        this.f28963x = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i10) {
        this.f28962w = i10;
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
        this.f28964y = Math.max(measuredWidth, i10);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            nz0 d = d(i13);
            if (measuredWidth > 0 && (i12 = this.f28964y) != measuredWidth) {
                float f7 = measuredWidth;
                int round = Math.round((d.f26849n * i12) / f7);
                int round2 = Math.round(((d.f26849n + d.f26850o) * this.f28964y) / f7);
                d.f26851p = round;
                d.f26846k = Math.max(0, round2 - round);
                if (d.f26841c != null && d.f26840b != null) {
                    d.f();
                }
            } else {
                int i14 = d.f26849n;
                d.f26851p = i14;
                d.f26846k = Math.max(0, (d.f26850o + i14) - i14);
                if (d.f26841c != null && d.f26840b != null) {
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
                nz0 d10 = d(i18);
                mz0 mz0Var = d10.f26840b;
                if (mz0Var != null) {
                    i11 = mz0Var.getEmojiOnlyCount();
                } else {
                    i11 = 0;
                }
                if (i11 > 0) {
                    oz0 oz0Var = d10.f26839a.f27458a.f28079b;
                    int max = Math.max(0, oz0Var.f27220a);
                    int min = Math.min(i15, oz0Var.f27221b);
                    if (max < min) {
                        int i19 = 0;
                        for (int i20 = max; i20 < min; i20++) {
                            i19 += iArr2[i20];
                        }
                        int max2 = Math.max(1, Math.round(d10.f26846k / i11)) - i19;
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
                nz0 d11 = d(i25);
                oz0 oz0Var2 = d11.f26839a.f27458a.f28079b;
                int max3 = Math.max(0, Math.min(i15, oz0Var2.f27220a));
                int max4 = Math.max(max3, Math.min(i15, oz0Var2.f27221b));
                int i26 = iArr4[max3];
                int i27 = iArr4[max4];
                d11.f26852q = i26;
                d11.f26847l = Math.max(0, i27 - i26);
                if (d11.f26841c != null) {
                    d11.g();
                }
                this.O.onLayoutChild(d11.f26840b, d11.b(), d11.c());
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
        kz0 kz0Var = this.d;
        kz0Var.f25928u = z10;
        kz0Var.k();
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
        this.f28958f = z10;
        requestLayout();
    }
}
