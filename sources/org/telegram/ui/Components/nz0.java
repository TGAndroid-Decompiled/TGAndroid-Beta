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
public final class nz0 extends View {
    public static final zy0 O = new zy0(0);
    public static final zy0 P = new zy0(1);
    public static final zy0 Q = new zy0(3);
    public static final zy0 R = new zy0(4);
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
    public final mz0 L;
    public final ArrayList M;
    public final lz0 N;
    public final org.telegram.ui.Cells.m9 f29606a;
    public int f29607b;
    public final dz0 f29608c;
    public final dz0 d;
    public int f29609e;
    public boolean f29610f;
    public int h;
    public int f29611n;
    public int f29612r;
    public int f29613s;
    public int v;
    public int f29614w;
    public boolean f29615x;
    public int f29616y;

    public nz0(Context context, mz0 mz0Var, org.telegram.ui.Cells.m9 m9Var) {
        super(context);
        this.f29608c = new dz0(this, true);
        this.d = new dz0(this, false);
        this.f29609e = 0;
        this.f29610f = false;
        this.h = 1;
        this.f29611n = 0;
        this.f29612r = AndroidUtilities.dp(8.0f);
        this.f29613s = AndroidUtilities.dp(9.0f);
        this.v = AndroidUtilities.dp(12.0f);
        this.f29615x = true;
        this.C = new int[0];
        this.G = new ArrayList();
        this.H = new ArrayList();
        new Path();
        this.I = new Path();
        this.J = new RectF();
        this.K = new float[8];
        this.M = new ArrayList();
        this.f29606a = m9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.L = mz0Var;
        lz0 lz0Var = new lz0(this, this);
        this.N = lz0Var;
        r0.j0.k(this, lz0Var);
    }

    public static void i(iz0 iz0Var, int i10, int i11, int i12, int i13) {
        hz0 hz0Var = new hz0(i10, i11 + i10);
        kz0 kz0Var = iz0Var.f27920a;
        iz0Var.f27920a = new kz0(kz0Var.f28527a, hz0Var, kz0Var.f28529c, kz0Var.d);
        hz0 hz0Var2 = new hz0(i12, i13 + i12);
        kz0 kz0Var2 = iz0Var.f27921b;
        iz0Var.f27921b = new kz0(kz0Var2.f28527a, hz0Var2, kz0Var2.f28529c, kz0Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.M;
        gz0 gz0Var = new gz0(this, arrayList.size());
        iz0 iz0Var = new iz0();
        hz0 hz0Var = new hz0(i11, i13 + i11);
        zy0 zy0Var = R;
        iz0Var.f27920a = new kz0(false, hz0Var, zy0Var, 0.0f);
        iz0Var.f27921b = new kz0(false, new hz0(i10, i12 + i10), zy0Var, 0.0f);
        gz0Var.f27300a = iz0Var;
        gz0Var.f27307j = i11;
        arrayList.add(gz0Var);
        g();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.M;
        gz0 gz0Var = new gz0(this, arrayList.size());
        gz0Var.f27302c = pagetablecell;
        iz0 iz0Var = new iz0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        hz0 hz0Var = new hz0(i11, i13 + i11);
        zy0 zy0Var = R;
        iz0Var.f27920a = new kz0(false, hz0Var, zy0Var, 0.0f);
        iz0Var.f27921b = new kz0(false, new hz0(i10, i12 + i10), zy0Var, 1.0f);
        gz0Var.f27300a = iz0Var;
        gz0Var.f27307j = i11;
        arrayList.add(gz0Var);
        int i14 = pagetablecell.rowspan;
        if (i14 > 1) {
            this.H.add(new PointF(i11, i11 + i14));
        }
        g();
    }

    public final void c() {
        boolean z4;
        dz0 dz0Var;
        kz0 kz0Var;
        kz0 kz0Var2;
        int i10;
        int i11 = this.f29611n;
        int i12 = 1;
        if (i11 == 0) {
            if (this.f29609e == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                dz0Var = this.f29608c;
            } else {
                dz0Var = this.d;
            }
            int i13 = dz0Var.f26382b;
            if (i13 == Integer.MIN_VALUE) {
                i13 = 0;
            }
            int[] iArr = new int[i13];
            int childCount = getChildCount();
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < childCount; i16++) {
                iz0 iz0Var = d(i16).f27300a;
                if (z4) {
                    kz0Var = iz0Var.f27920a;
                } else {
                    kz0Var = iz0Var.f27921b;
                }
                hz0 hz0Var = kz0Var.f28528b;
                boolean z10 = kz0Var.f28527a;
                int i17 = hz0Var.f27670b;
                int i18 = hz0Var.f27669a;
                int i19 = i17 - i18;
                if (z10) {
                    i14 = i18;
                }
                if (z4) {
                    kz0Var2 = iz0Var.f27921b;
                } else {
                    kz0Var2 = iz0Var.f27920a;
                }
                hz0 hz0Var2 = kz0Var2.f28528b;
                boolean z11 = kz0Var2.f28527a;
                int i20 = hz0Var2.f27670b;
                int i21 = hz0Var2.f27669a;
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
                    i(iz0Var, i14, i19, i15, i22);
                } else {
                    i(iz0Var, i15, i22, i14, i19);
                }
                i15 += i22;
            }
            int childCount2 = getChildCount();
            for (int i25 = 0; i25 < childCount2; i25++) {
                i12 = (i12 * 31) + d(i25).f27300a.hashCode();
            }
            this.f29611n = i12;
            return;
        }
        int childCount3 = getChildCount();
        int i26 = 1;
        for (int i27 = 0; i27 < childCount3; i27++) {
            i26 = (i26 * 31) + d(i27).f27300a.hashCode();
        }
        if (i11 != i26) {
            g();
            c();
        }
    }

    public final gz0 d(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.M;
            if (i10 < arrayList.size()) {
                return (gz0) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        lz0 lz0Var = this.N;
        if (lz0Var != null && lz0Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(gz0 gz0Var, boolean z4, boolean z10) {
        dz0 dz0Var;
        int[] iArr;
        kz0 kz0Var;
        int i10;
        if (this.h == 1) {
            return f(gz0Var, z4, z10);
        }
        if (z4) {
            dz0Var = this.f29608c;
        } else {
            dz0Var = this.d;
        }
        if (z10) {
            if (dz0Var.f26388j == null) {
                dz0Var.f26388j = new int[dz0Var.e() + 1];
            }
            if (!dz0Var.f26389k) {
                dz0Var.b(true);
                dz0Var.f26389k = true;
            }
            iArr = dz0Var.f26388j;
        } else {
            if (dz0Var.f26390l == null) {
                dz0Var.f26390l = new int[dz0Var.e() + 1];
            }
            if (!dz0Var.f26391m) {
                dz0Var.b(false);
                dz0Var.f26391m = true;
            }
            iArr = dz0Var.f26390l;
        }
        iz0 iz0Var = gz0Var.f27300a;
        if (z4) {
            kz0Var = iz0Var.f27921b;
        } else {
            kz0Var = iz0Var.f27920a;
        }
        hz0 hz0Var = kz0Var.f28528b;
        if (z10) {
            i10 = hz0Var.f27669a;
        } else {
            i10 = hz0Var.f27670b;
        }
        return iArr[i10];
    }

    public final int f(gz0 gz0Var, boolean z4, boolean z10) {
        int i10;
        kz0 kz0Var;
        dz0 dz0Var;
        boolean z11;
        iz0 iz0Var = gz0Var.f27300a;
        if (z4) {
            if (z10) {
                i10 = ((ViewGroup.MarginLayoutParams) iz0Var).leftMargin;
            } else {
                i10 = ((ViewGroup.MarginLayoutParams) iz0Var).rightMargin;
            }
        } else if (z10) {
            i10 = ((ViewGroup.MarginLayoutParams) iz0Var).topMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) iz0Var).bottomMargin;
        }
        if (i10 == Integer.MIN_VALUE) {
            if (!this.f29610f) {
                return 0;
            }
            if (z4) {
                kz0Var = iz0Var.f27921b;
            } else {
                kz0Var = iz0Var.f27920a;
            }
            if (z4) {
                dz0Var = this.f29608c;
            } else {
                dz0Var = this.d;
            }
            hz0 hz0Var = kz0Var.f28528b;
            if (z4 && this.F) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 != z10) {
                int i11 = hz0Var.f27669a;
                return 0;
            }
            int i12 = hz0Var.f27670b;
            dz0Var.e();
            return 0;
        }
        return i10;
    }

    public final void g() {
        this.f29611n = 0;
        dz0 dz0Var = this.f29608c;
        dz0Var.k();
        dz0 dz0Var2 = this.d;
        dz0Var2.k();
        if (dz0Var != null && dz0Var2 != null) {
            dz0Var.l();
            dz0Var2.l();
        }
    }

    public int getAlignmentMode() {
        return this.h;
    }

    public int getChildCount() {
        return this.M.size();
    }

    public int getColumnCount() {
        return this.f29608c.e();
    }

    public int getOrientation() {
        return this.f29609e;
    }

    public int getRenderHeight() {
        return this.B;
    }

    public int getRowCount() {
        return this.d.e();
    }

    public boolean getUseDefaultMargins() {
        return this.f29610f;
    }

    public final void h(int i10, boolean z4) {
        boolean z10;
        kz0 kz0Var;
        dz0 dz0Var;
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            gz0 d = d(i14);
            iz0 iz0Var = d.f27300a;
            if (z4) {
                int size = View.MeasureSpec.getSize(i10);
                if (this.f29607b == 2) {
                    i12 = ((int) (size / 2.0f)) - (this.v * 4);
                } else {
                    i12 = (int) (size / 1.5f);
                }
                d.e(this.L.createTextLayout(d.f27302c, i12));
                if (d.f27301b != null) {
                    ((ViewGroup.MarginLayoutParams) iz0Var).height = Math.max(this.f29614w, d.f27304f + this.f29612r + this.f29613s);
                    int emojiOnlyCount = d.f27301b.getEmojiOnlyCount();
                    if (emojiOnlyCount > 0) {
                        i13 = ((ViewGroup.MarginLayoutParams) iz0Var).height * emojiOnlyCount;
                    } else {
                        i13 = (this.v * 2) + d.f27303e;
                    }
                    ((ViewGroup.MarginLayoutParams) iz0Var).width = i13;
                } else {
                    ((ViewGroup.MarginLayoutParams) iz0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) iz0Var).height = 0;
                }
                int i15 = ((ViewGroup.MarginLayoutParams) iz0Var).width;
                int i16 = ((ViewGroup.MarginLayoutParams) iz0Var).height;
                d.d(e(d, true, false) + e(d, true, true) + i15, e(d, false, false) + e(d, false, true) + i16, true);
            } else {
                if (this.f29609e == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    kz0Var = iz0Var.f27921b;
                } else {
                    kz0Var = iz0Var.f27920a;
                }
                if (kz0.a(kz0Var, z10) == R) {
                    hz0 hz0Var = kz0Var.f28528b;
                    if (z10) {
                        dz0Var = this.f29608c;
                    } else {
                        dz0Var = this.d;
                    }
                    int[] g10 = dz0Var.g();
                    int e6 = (g10[hz0Var.f27670b] - g10[hz0Var.f27669a]) - (e(d, z10, false) + e(d, z10, true));
                    if (z10) {
                        fz0 fz0Var = d.f27301b;
                        if (fz0Var != null) {
                            i11 = fz0Var.getEmojiOnlyCount();
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            int max = Math.max(1, Math.round(e6 / i11));
                            ((ViewGroup.MarginLayoutParams) iz0Var).height = max;
                            d.f27310m = max;
                        }
                        int i17 = ((ViewGroup.MarginLayoutParams) iz0Var).height;
                        d.d(e(d, true, false) + e(d, true, true) + e6, e(d, false, false) + e(d, false, true) + i17, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) iz0Var).width, e(d, false, false) + e(d, false, true) + e6, false);
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
        nz0 nz0Var = this;
        nz0Var.c();
        dz0 dz0Var = nz0Var.d;
        dz0 dz0Var2 = nz0Var.f29608c;
        if (dz0Var2 != null && dz0Var != null) {
            dz0Var2.l();
            dz0Var.l();
        }
        nz0Var.f29607b = 0;
        int childCount = nz0Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            nz0Var.f29607b = Math.max(nz0Var.f29607b, nz0Var.d(i16).f27300a.f27921b.f28528b.f27670b);
        }
        nz0Var.h(i10, true);
        if (nz0Var.f29609e == 0) {
            i12 = dz0Var2.i(i10);
            if (nz0Var.f29615x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                dz0Var2.v.f28219a = i12;
                dz0Var2.f26400w.f28219a = -i12;
                dz0Var2.f26395q = false;
                dz0Var2.g();
            }
            nz0Var.h(i10, false);
            i13 = dz0Var.i(i11);
        } else {
            int i17 = dz0Var.i(i11);
            nz0Var.h(i10, false);
            i12 = dz0Var2.i(i10);
            i13 = i17;
        }
        int max = Math.max(i13, nz0Var.getSuggestedMinimumHeight());
        nz0Var.setMeasuredDimension(i12, max);
        dz0Var2.v.f28219a = i12;
        dz0Var2.f26400w.f28219a = -i12;
        dz0Var2.f26395q = false;
        dz0Var2.g();
        dz0Var.v.f28219a = max;
        dz0Var.f26400w.f28219a = -max;
        dz0Var.f26395q = false;
        dz0Var.g();
        int[] g10 = dz0Var2.g();
        int[] g11 = dz0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = nz0Var.G;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = nz0Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            gz0 d = nz0Var.d(i20);
            iz0 iz0Var = d.f27300a;
            kz0 kz0Var = iz0Var.f27921b;
            kz0 kz0Var2 = iz0Var.f27920a;
            hz0 hz0Var = kz0Var.f28528b;
            hz0 hz0Var2 = kz0Var2.f28528b;
            int i21 = childCount2;
            int i22 = g10[hz0Var.f27669a];
            int i23 = g11[hz0Var2.f27669a];
            int i24 = g10[hz0Var.f27670b] - i22;
            int i25 = g11[hz0Var2.f27670b] - i23;
            int i26 = d.f27308k;
            dz0 dz0Var3 = dz0Var;
            int i27 = d.f27309l;
            zy0 a2 = kz0.a(kz0Var, true);
            zy0 a10 = kz0.a(kz0Var2, false);
            l7.w0 f10 = dz0Var2.f();
            ez0 ez0Var = (ez0) ((Object[]) f10.d)[((int[]) f10.f12080b)[i20]];
            l7.w0 f11 = dz0Var3.f();
            dz0 dz0Var4 = dz0Var2;
            ez0 ez0Var2 = (ez0) ((Object[]) f11.d)[((int[]) f11.f12080b)[i20]];
            int b10 = a2.b(d, i24 - ez0Var.d(true));
            int b11 = a10.b(d, i25 - ez0Var2.d(true));
            int e6 = nz0Var.e(d, true, true);
            int e10 = nz0Var.e(d, false, true);
            int e11 = nz0Var.e(d, true, false);
            int i28 = e6 + e11;
            int e12 = e10 + nz0Var.e(d, false, false);
            int a11 = ez0Var.a(nz0Var, d, a2, i26 + i28, true);
            nz0Var = this;
            int a12 = ez0Var2.a(nz0Var, d, a10, i27 + e12, false);
            int c3 = a2.c(i26, i24 - i28);
            int c10 = a10.c(i27, i25 - e12);
            int i29 = i22 + b10 + a11;
            if (!nz0Var.F) {
                i15 = e6 + i29;
            } else {
                i15 = ((i18 - c3) - e11) - i29;
            }
            int i30 = i15;
            int i31 = i23 + b11 + a12 + e10;
            if (d.f27302c != null) {
                if (c3 != d.f27308k || c10 != d.f27309l) {
                    d.d(c3, c10, false);
                }
                int i32 = d.f27310m;
                if (i32 != 0 && i32 != c10) {
                    hz0 hz0Var3 = d.f27300a.f27920a.f28528b;
                    if (hz0Var3.f27670b - hz0Var3.f27669a <= 1) {
                        ArrayList arrayList2 = nz0Var.H;
                        int size = arrayList2.size();
                        int i33 = 0;
                        while (true) {
                            if (i33 < size) {
                                PointF pointF = (PointF) arrayList2.get(i33);
                                float f12 = pointF.x;
                                float f13 = d.f27300a.f27920a.f28528b.f27669a;
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
            d.f27313p = i30;
            d.f27314q = i31;
            i19 = i20 + 1;
            dz0Var = dz0Var3;
            childCount2 = i21;
            dz0Var2 = dz0Var4;
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            gz0 gz0Var = (gz0) arrayList.get(i34);
            int i35 = gz0Var.f27309l;
            int i36 = gz0Var.d;
            int i37 = i35 - gz0Var.f27310m;
            ArrayList arrayList3 = nz0Var.M;
            int size3 = arrayList3.size();
            for (int i38 = i36 + 1; i38 < size3; i38++) {
                gz0 gz0Var2 = (gz0) arrayList3.get(i38);
                if (gz0Var.f27300a.f27920a.f28528b.f27669a != gz0Var2.f27300a.f27920a.f28528b.f27669a) {
                    break;
                }
                int i39 = gz0Var.f27310m;
                int i40 = gz0Var2.f27310m;
                if (i39 < i40) {
                    z4 = true;
                    break;
                }
                int i41 = gz0Var2.f27309l - i40;
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
                    gz0 gz0Var3 = (gz0) arrayList3.get(i42);
                    if (gz0Var.f27300a.f27920a.f28528b.f27669a != gz0Var3.f27300a.f27920a.f28528b.f27669a) {
                        break;
                    }
                    int i43 = gz0Var.f27310m;
                    int i44 = gz0Var3.f27310m;
                    if (i43 < i44) {
                        z4 = true;
                        break;
                    }
                    int i45 = gz0Var3.f27309l - i44;
                    if (i45 > 0) {
                        i37 = Math.min(i37, i45);
                    }
                    i42--;
                }
            }
            if (!z4) {
                gz0Var.f27309l = gz0Var.f27310m;
                gz0Var.g();
                max -= i37;
                int i46 = gz0Var.f27300a.f27920a.f28528b.f27669a;
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
                    gz0 gz0Var4 = (gz0) arrayList3.get(i49);
                    if (gz0Var == gz0Var4) {
                        i14 = i49;
                    } else {
                        int i50 = gz0Var.f27300a.f27920a.f28528b.f27669a;
                        int i51 = gz0Var4.f27300a.f27920a.f28528b.f27669a;
                        if (i50 == i51) {
                            if (gz0Var4.f27310m != gz0Var4.f27309l) {
                                arrayList.remove(gz0Var4);
                                if (gz0Var4.d < i36) {
                                    i48--;
                                }
                                i47--;
                            }
                            int i52 = gz0Var4.f27309l - i37;
                            gz0Var4.f27309l = i52;
                            i14 = i49;
                            gz0Var4.d(gz0Var4.f27308k, i52, true);
                        } else {
                            i14 = i49;
                            if (i50 < i51) {
                                gz0Var4.f27314q -= i37;
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
        int childCount3 = nz0Var.getChildCount();
        for (int i53 = 0; i53 < childCount3; i53++) {
            gz0 d10 = nz0Var.d(i53);
            nz0Var.L.onLayoutChild(d10.f27301b, d10.b(), d10.c());
            d10.f27311n = d10.f27313p;
            d10.f27312o = d10.f27308k;
        }
        nz0Var.f29616y = i18;
        nz0Var.B = max;
        nz0Var.C = copyOf;
        nz0Var.setMeasuredDimension(i18, max);
    }

    @Override
    public final void requestLayout() {
        dz0 dz0Var;
        super.requestLayout();
        dz0 dz0Var2 = this.f29608c;
        if (dz0Var2 != null && (dz0Var = this.d) != null) {
            dz0Var2.l();
            dz0Var.l();
        }
    }

    public void setAlignmentMode(int i10) {
        this.h = i10;
        requestLayout();
    }

    public void setColumnCount(int i10) {
        this.f29608c.n(i10);
        g();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z4) {
        dz0 dz0Var = this.f29608c;
        dz0Var.f26399u = z4;
        dz0Var.k();
        g();
        requestLayout();
    }

    public void setDrawLines(boolean z4) {
        this.D = z4;
    }

    public void setFillWidth(boolean z4) {
        if (this.f29615x == z4) {
            return;
        }
        this.f29615x = z4;
        requestLayout();
    }

    public void setMinimumCellHeight(int i10) {
        this.f29614w = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        if (this.f29609e != i10) {
            this.f29609e = i10;
            g();
            requestLayout();
        }
    }

    public void setRenderWidth(int i10) {
        int i11;
        int i12;
        int measuredWidth = getMeasuredWidth();
        this.f29616y = Math.max(measuredWidth, i10);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            gz0 d = d(i13);
            if (measuredWidth > 0 && (i12 = this.f29616y) != measuredWidth) {
                float f10 = measuredWidth;
                int round = Math.round((d.f27311n * i12) / f10);
                int round2 = Math.round(((d.f27311n + d.f27312o) * this.f29616y) / f10);
                d.f27313p = round;
                d.f27308k = Math.max(0, round2 - round);
                if (d.f27302c != null && d.f27301b != null) {
                    d.f();
                }
            } else {
                int i14 = d.f27311n;
                d.f27313p = i14;
                d.f27308k = Math.max(0, (d.f27312o + i14) - i14);
                if (d.f27302c != null && d.f27301b != null) {
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
                gz0 d10 = d(i18);
                fz0 fz0Var = d10.f27301b;
                if (fz0Var != null) {
                    i11 = fz0Var.getEmojiOnlyCount();
                } else {
                    i11 = 0;
                }
                if (i11 > 0) {
                    hz0 hz0Var = d10.f27300a.f27920a.f28528b;
                    int max = Math.max(0, hz0Var.f27669a);
                    int min = Math.min(i15, hz0Var.f27670b);
                    if (max < min) {
                        int i19 = 0;
                        for (int i20 = max; i20 < min; i20++) {
                            i19 += iArr2[i20];
                        }
                        int max2 = Math.max(1, Math.round(d10.f27308k / i11)) - i19;
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
                gz0 d11 = d(i25);
                hz0 hz0Var2 = d11.f27300a.f27920a.f28528b;
                int max3 = Math.max(0, Math.min(i15, hz0Var2.f27669a));
                int max4 = Math.max(max3, Math.min(i15, hz0Var2.f27670b));
                int i26 = iArr4[max3];
                int i27 = iArr4[max4];
                d11.f27314q = i26;
                d11.f27309l = Math.max(0, i27 - i26);
                if (d11.f27302c != null) {
                    d11.g();
                }
                this.L.onLayoutChild(d11.f27301b, d11.b(), d11.c());
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
        dz0 dz0Var = this.d;
        dz0Var.f26399u = z4;
        dz0Var.k();
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
        this.f29610f = z4;
        requestLayout();
    }
}
