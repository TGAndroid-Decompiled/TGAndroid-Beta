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
public final class jz0 extends View {
    public static final vy0 R = new vy0(0);
    public static final vy0 S = new vy0(1);
    public static final vy0 T = new vy0(3);
    public static final vy0 U = new vy0(4);
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
    public final iz0 O;
    public final ArrayList P;
    public final hz0 Q;
    public final org.telegram.ui.Cells.q9 f27616a;
    public int f27617b;
    public final zy0 f27618c;
    public final zy0 d;
    public int f27619e;
    public boolean f27620f;
    public int h;
    public int f27621n;
    public int f27622r;
    public int f27623s;
    public int v;
    public int f27624w;
    public boolean f27625x;
    public int f27626y;

    public jz0(Context context, iz0 iz0Var, org.telegram.ui.Cells.q9 q9Var) {
        super(context);
        this.f27618c = new zy0(this, true);
        this.d = new zy0(this, false);
        this.f27619e = 0;
        this.f27620f = false;
        this.h = 1;
        this.f27621n = 0;
        this.f27622r = AndroidUtilities.dp(8.0f);
        this.f27623s = AndroidUtilities.dp(9.0f);
        this.v = AndroidUtilities.dp(12.0f);
        this.f27625x = true;
        this.F = new int[0];
        this.J = new ArrayList();
        this.K = new ArrayList();
        new Path();
        this.L = new Path();
        this.M = new RectF();
        this.N = new float[8];
        this.P = new ArrayList();
        this.f27616a = q9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.O = iz0Var;
        hz0 hz0Var = new hz0(this, this);
        this.Q = hz0Var;
        r0.i0.k(this, hz0Var);
    }

    public static void i(ez0 ez0Var, int i10, int i11, int i12, int i13) {
        dz0 dz0Var = new dz0(i10, i11 + i10);
        gz0 gz0Var = ez0Var.f25843a;
        ez0Var.f25843a = new gz0(gz0Var.f26565a, dz0Var, gz0Var.f26567c, gz0Var.d);
        dz0 dz0Var2 = new dz0(i12, i13 + i12);
        gz0 gz0Var2 = ez0Var.f25844b;
        ez0Var.f25844b = new gz0(gz0Var2.f26565a, dz0Var2, gz0Var2.f26567c, gz0Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        cz0 cz0Var = new cz0(this, arrayList.size());
        ez0 ez0Var = new ez0();
        dz0 dz0Var = new dz0(i11, i13 + i11);
        vy0 vy0Var = U;
        ez0Var.f25843a = new gz0(false, dz0Var, vy0Var, 0.0f);
        ez0Var.f25844b = new gz0(false, new dz0(i10, i12 + i10), vy0Var, 0.0f);
        cz0Var.f25168a = ez0Var;
        cz0Var.f25175j = i11;
        arrayList.add(cz0Var);
        g();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        cz0 cz0Var = new cz0(this, arrayList.size());
        cz0Var.f25170c = pagetablecell;
        ez0 ez0Var = new ez0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        dz0 dz0Var = new dz0(i11, i13 + i11);
        vy0 vy0Var = U;
        ez0Var.f25843a = new gz0(false, dz0Var, vy0Var, 0.0f);
        ez0Var.f25844b = new gz0(false, new dz0(i10, i12 + i10), vy0Var, 1.0f);
        cz0Var.f25168a = ez0Var;
        cz0Var.f25175j = i11;
        arrayList.add(cz0Var);
        int i14 = pagetablecell.rowspan;
        if (i14 > 1) {
            this.K.add(new PointF(i11, i11 + i14));
        }
        g();
    }

    public final void c() {
        boolean z10;
        zy0 zy0Var;
        gz0 gz0Var;
        gz0 gz0Var2;
        int i10;
        int i11 = this.f27621n;
        int i12 = 1;
        if (i11 == 0) {
            if (this.f27619e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                zy0Var = this.f27618c;
            } else {
                zy0Var = this.d;
            }
            int i13 = zy0Var.f33284b;
            if (i13 == Integer.MIN_VALUE) {
                i13 = 0;
            }
            int[] iArr = new int[i13];
            int childCount = getChildCount();
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < childCount; i16++) {
                ez0 ez0Var = d(i16).f25168a;
                if (z10) {
                    gz0Var = ez0Var.f25843a;
                } else {
                    gz0Var = ez0Var.f25844b;
                }
                dz0 dz0Var = gz0Var.f26566b;
                boolean z11 = gz0Var.f26565a;
                int i17 = dz0Var.f25519b;
                int i18 = dz0Var.f25518a;
                int i19 = i17 - i18;
                if (z11) {
                    i14 = i18;
                }
                if (z10) {
                    gz0Var2 = ez0Var.f25844b;
                } else {
                    gz0Var2 = ez0Var.f25843a;
                }
                dz0 dz0Var2 = gz0Var2.f26566b;
                boolean z12 = gz0Var2.f26565a;
                int i20 = dz0Var2.f25519b;
                int i21 = dz0Var2.f25518a;
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
                    i(ez0Var, i14, i19, i15, i22);
                } else {
                    i(ez0Var, i15, i22, i14, i19);
                }
                i15 += i22;
            }
            int childCount2 = getChildCount();
            for (int i25 = 0; i25 < childCount2; i25++) {
                i12 = (i12 * 31) + d(i25).f25168a.hashCode();
            }
            this.f27621n = i12;
            return;
        }
        int childCount3 = getChildCount();
        int i26 = 1;
        for (int i27 = 0; i27 < childCount3; i27++) {
            i26 = (i26 * 31) + d(i27).f25168a.hashCode();
        }
        if (i11 != i26) {
            g();
            c();
        }
    }

    public final cz0 d(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                return (cz0) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        hz0 hz0Var = this.Q;
        if (hz0Var != null && hz0Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(cz0 cz0Var, boolean z10, boolean z11) {
        zy0 zy0Var;
        int[] iArr;
        gz0 gz0Var;
        int i10;
        if (this.h == 1) {
            return f(cz0Var, z10, z11);
        }
        if (z10) {
            zy0Var = this.f27618c;
        } else {
            zy0Var = this.d;
        }
        if (z11) {
            if (zy0Var.f33290j == null) {
                zy0Var.f33290j = new int[zy0Var.e() + 1];
            }
            if (!zy0Var.f33291k) {
                zy0Var.b(true);
                zy0Var.f33291k = true;
            }
            iArr = zy0Var.f33290j;
        } else {
            if (zy0Var.f33292l == null) {
                zy0Var.f33292l = new int[zy0Var.e() + 1];
            }
            if (!zy0Var.f33293m) {
                zy0Var.b(false);
                zy0Var.f33293m = true;
            }
            iArr = zy0Var.f33292l;
        }
        ez0 ez0Var = cz0Var.f25168a;
        if (z10) {
            gz0Var = ez0Var.f25844b;
        } else {
            gz0Var = ez0Var.f25843a;
        }
        dz0 dz0Var = gz0Var.f26566b;
        if (z11) {
            i10 = dz0Var.f25518a;
        } else {
            i10 = dz0Var.f25519b;
        }
        return iArr[i10];
    }

    public final int f(cz0 cz0Var, boolean z10, boolean z11) {
        int i10;
        gz0 gz0Var;
        zy0 zy0Var;
        boolean z12;
        ez0 ez0Var = cz0Var.f25168a;
        if (z10) {
            if (z11) {
                i10 = ((ViewGroup.MarginLayoutParams) ez0Var).leftMargin;
            } else {
                i10 = ((ViewGroup.MarginLayoutParams) ez0Var).rightMargin;
            }
        } else if (z11) {
            i10 = ((ViewGroup.MarginLayoutParams) ez0Var).topMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) ez0Var).bottomMargin;
        }
        if (i10 == Integer.MIN_VALUE) {
            if (!this.f27620f) {
                return 0;
            }
            if (z10) {
                gz0Var = ez0Var.f25844b;
            } else {
                gz0Var = ez0Var.f25843a;
            }
            if (z10) {
                zy0Var = this.f27618c;
            } else {
                zy0Var = this.d;
            }
            dz0 dz0Var = gz0Var.f26566b;
            if (z10 && this.I) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != z11) {
                int i11 = dz0Var.f25518a;
                return 0;
            }
            int i12 = dz0Var.f25519b;
            zy0Var.e();
            return 0;
        }
        return i10;
    }

    public final void g() {
        this.f27621n = 0;
        zy0 zy0Var = this.f27618c;
        zy0Var.k();
        zy0 zy0Var2 = this.d;
        zy0Var2.k();
        if (zy0Var != null && zy0Var2 != null) {
            zy0Var.l();
            zy0Var2.l();
        }
    }

    public int getAlignmentMode() {
        return this.h;
    }

    public int getChildCount() {
        return this.P.size();
    }

    public int getColumnCount() {
        return this.f27618c.e();
    }

    public int getOrientation() {
        return this.f27619e;
    }

    public int getRenderHeight() {
        return this.E;
    }

    public int getRowCount() {
        return this.d.e();
    }

    public boolean getUseDefaultMargins() {
        return this.f27620f;
    }

    public final void h(int i10, boolean z10) {
        boolean z11;
        gz0 gz0Var;
        zy0 zy0Var;
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            cz0 d = d(i14);
            ez0 ez0Var = d.f25168a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                if (this.f27617b == 2) {
                    i12 = ((int) (size / 2.0f)) - (this.v * 4);
                } else {
                    i12 = (int) (size / 1.5f);
                }
                d.e(this.O.createTextLayout(d.f25170c, i12));
                if (d.f25169b != null) {
                    ((ViewGroup.MarginLayoutParams) ez0Var).height = Math.max(this.f27624w, d.f25172f + this.f27622r + this.f27623s);
                    int emojiOnlyCount = d.f25169b.getEmojiOnlyCount();
                    if (emojiOnlyCount > 0) {
                        i13 = ((ViewGroup.MarginLayoutParams) ez0Var).height * emojiOnlyCount;
                    } else {
                        i13 = (this.v * 2) + d.f25171e;
                    }
                    ((ViewGroup.MarginLayoutParams) ez0Var).width = i13;
                } else {
                    ((ViewGroup.MarginLayoutParams) ez0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) ez0Var).height = 0;
                }
                int i15 = ((ViewGroup.MarginLayoutParams) ez0Var).width;
                int i16 = ((ViewGroup.MarginLayoutParams) ez0Var).height;
                d.d(e(d, true, false) + e(d, true, true) + i15, e(d, false, false) + e(d, false, true) + i16, true);
            } else {
                if (this.f27619e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    gz0Var = ez0Var.f25844b;
                } else {
                    gz0Var = ez0Var.f25843a;
                }
                if (gz0.a(gz0Var, z11) == U) {
                    dz0 dz0Var = gz0Var.f26566b;
                    if (z11) {
                        zy0Var = this.f27618c;
                    } else {
                        zy0Var = this.d;
                    }
                    int[] g10 = zy0Var.g();
                    int e7 = (g10[dz0Var.f25519b] - g10[dz0Var.f25518a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        bz0 bz0Var = d.f25169b;
                        if (bz0Var != null) {
                            i11 = bz0Var.getEmojiOnlyCount();
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            int max = Math.max(1, Math.round(e7 / i11));
                            ((ViewGroup.MarginLayoutParams) ez0Var).height = max;
                            d.f25178m = max;
                        }
                        int i17 = ((ViewGroup.MarginLayoutParams) ez0Var).height;
                        d.d(e(d, true, false) + e(d, true, true) + e7, e(d, false, false) + e(d, false, true) + i17, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) ez0Var).width, e(d, false, false) + e(d, false, true) + e7, false);
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
        jz0 jz0Var = this;
        jz0Var.c();
        zy0 zy0Var = jz0Var.d;
        zy0 zy0Var2 = jz0Var.f27618c;
        if (zy0Var2 != null && zy0Var != null) {
            zy0Var2.l();
            zy0Var.l();
        }
        jz0Var.f27617b = 0;
        int childCount = jz0Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            jz0Var.f27617b = Math.max(jz0Var.f27617b, jz0Var.d(i16).f25168a.f25844b.f26566b.f25519b);
        }
        jz0Var.h(i10, true);
        if (jz0Var.f27619e == 0) {
            i12 = zy0Var2.i(i10);
            if (jz0Var.f27625x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                zy0Var2.v.f26238a = i12;
                zy0Var2.f33302w.f26238a = -i12;
                zy0Var2.f33297q = false;
                zy0Var2.g();
            }
            jz0Var.h(i10, false);
            i13 = zy0Var.i(i11);
        } else {
            int i17 = zy0Var.i(i11);
            jz0Var.h(i10, false);
            i12 = zy0Var2.i(i10);
            i13 = i17;
        }
        int max = Math.max(i13, jz0Var.getSuggestedMinimumHeight());
        jz0Var.setMeasuredDimension(i12, max);
        zy0Var2.v.f26238a = i12;
        zy0Var2.f33302w.f26238a = -i12;
        zy0Var2.f33297q = false;
        zy0Var2.g();
        zy0Var.v.f26238a = max;
        zy0Var.f33302w.f26238a = -max;
        zy0Var.f33297q = false;
        zy0Var.g();
        int[] g10 = zy0Var2.g();
        int[] g11 = zy0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = jz0Var.J;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = jz0Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            cz0 d = jz0Var.d(i20);
            ez0 ez0Var = d.f25168a;
            gz0 gz0Var = ez0Var.f25844b;
            gz0 gz0Var2 = ez0Var.f25843a;
            dz0 dz0Var = gz0Var.f26566b;
            dz0 dz0Var2 = gz0Var2.f26566b;
            int i21 = childCount2;
            int i22 = g10[dz0Var.f25518a];
            int i23 = g11[dz0Var2.f25518a];
            int i24 = g10[dz0Var.f25519b] - i22;
            int i25 = g11[dz0Var2.f25519b] - i23;
            int i26 = d.f25176k;
            zy0 zy0Var3 = zy0Var;
            int i27 = d.f25177l;
            vy0 a2 = gz0.a(gz0Var, true);
            vy0 a10 = gz0.a(gz0Var2, false);
            m2.t f7 = zy0Var2.f();
            az0 az0Var = (az0) ((Object[]) f7.d)[((int[]) f7.f15844b)[i20]];
            m2.t f10 = zy0Var3.f();
            zy0 zy0Var4 = zy0Var2;
            az0 az0Var2 = (az0) ((Object[]) f10.d)[((int[]) f10.f15844b)[i20]];
            int b10 = a2.b(d, i24 - az0Var.d(true));
            int b11 = a10.b(d, i25 - az0Var2.d(true));
            int e7 = jz0Var.e(d, true, true);
            int e10 = jz0Var.e(d, false, true);
            int e11 = jz0Var.e(d, true, false);
            int i28 = e7 + e11;
            int e12 = e10 + jz0Var.e(d, false, false);
            int a11 = az0Var.a(jz0Var, d, a2, i26 + i28, true);
            jz0Var = this;
            int a12 = az0Var2.a(jz0Var, d, a10, i27 + e12, false);
            int c10 = a2.c(i26, i24 - i28);
            int c11 = a10.c(i27, i25 - e12);
            int i29 = i22 + b10 + a11;
            if (!jz0Var.I) {
                i15 = e7 + i29;
            } else {
                i15 = ((i18 - c10) - e11) - i29;
            }
            int i30 = i15;
            int i31 = i23 + b11 + a12 + e10;
            if (d.f25170c != null) {
                if (c10 != d.f25176k || c11 != d.f25177l) {
                    d.d(c10, c11, false);
                }
                int i32 = d.f25178m;
                if (i32 != 0 && i32 != c11) {
                    dz0 dz0Var3 = d.f25168a.f25843a.f26566b;
                    if (dz0Var3.f25519b - dz0Var3.f25518a <= 1) {
                        ArrayList arrayList2 = jz0Var.K;
                        int size = arrayList2.size();
                        int i33 = 0;
                        while (true) {
                            if (i33 < size) {
                                PointF pointF = (PointF) arrayList2.get(i33);
                                float f11 = pointF.x;
                                float f12 = d.f25168a.f25843a.f26566b.f25518a;
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
            d.f25181p = i30;
            d.f25182q = i31;
            i19 = i20 + 1;
            zy0Var = zy0Var3;
            childCount2 = i21;
            zy0Var2 = zy0Var4;
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            cz0 cz0Var = (cz0) arrayList.get(i34);
            int i35 = cz0Var.f25177l;
            int i36 = cz0Var.d;
            int i37 = i35 - cz0Var.f25178m;
            ArrayList arrayList3 = jz0Var.P;
            int size3 = arrayList3.size();
            for (int i38 = i36 + 1; i38 < size3; i38++) {
                cz0 cz0Var2 = (cz0) arrayList3.get(i38);
                if (cz0Var.f25168a.f25843a.f26566b.f25518a != cz0Var2.f25168a.f25843a.f26566b.f25518a) {
                    break;
                }
                int i39 = cz0Var.f25178m;
                int i40 = cz0Var2.f25178m;
                if (i39 < i40) {
                    z10 = true;
                    break;
                }
                int i41 = cz0Var2.f25177l - i40;
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
                    cz0 cz0Var3 = (cz0) arrayList3.get(i42);
                    if (cz0Var.f25168a.f25843a.f26566b.f25518a != cz0Var3.f25168a.f25843a.f26566b.f25518a) {
                        break;
                    }
                    int i43 = cz0Var.f25178m;
                    int i44 = cz0Var3.f25178m;
                    if (i43 < i44) {
                        z10 = true;
                        break;
                    }
                    int i45 = cz0Var3.f25177l - i44;
                    if (i45 > 0) {
                        i37 = Math.min(i37, i45);
                    }
                    i42--;
                }
            }
            if (!z10) {
                cz0Var.f25177l = cz0Var.f25178m;
                cz0Var.g();
                max -= i37;
                int i46 = cz0Var.f25168a.f25843a.f26566b.f25518a;
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
                    cz0 cz0Var4 = (cz0) arrayList3.get(i49);
                    if (cz0Var == cz0Var4) {
                        i14 = i49;
                    } else {
                        int i50 = cz0Var.f25168a.f25843a.f26566b.f25518a;
                        int i51 = cz0Var4.f25168a.f25843a.f26566b.f25518a;
                        if (i50 == i51) {
                            if (cz0Var4.f25178m != cz0Var4.f25177l) {
                                arrayList.remove(cz0Var4);
                                if (cz0Var4.d < i36) {
                                    i48--;
                                }
                                i47--;
                            }
                            int i52 = cz0Var4.f25177l - i37;
                            cz0Var4.f25177l = i52;
                            i14 = i49;
                            cz0Var4.d(cz0Var4.f25176k, i52, true);
                        } else {
                            i14 = i49;
                            if (i50 < i51) {
                                cz0Var4.f25182q -= i37;
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
        int childCount3 = jz0Var.getChildCount();
        for (int i53 = 0; i53 < childCount3; i53++) {
            cz0 d10 = jz0Var.d(i53);
            jz0Var.O.onLayoutChild(d10.f25169b, d10.b(), d10.c());
            d10.f25179n = d10.f25181p;
            d10.f25180o = d10.f25176k;
        }
        jz0Var.f27626y = i18;
        jz0Var.E = max;
        jz0Var.F = copyOf;
        jz0Var.setMeasuredDimension(i18, max);
    }

    @Override
    public final void requestLayout() {
        zy0 zy0Var;
        super.requestLayout();
        zy0 zy0Var2 = this.f27618c;
        if (zy0Var2 != null && (zy0Var = this.d) != null) {
            zy0Var2.l();
            zy0Var.l();
        }
    }

    public void setAlignmentMode(int i10) {
        this.h = i10;
        requestLayout();
    }

    public void setColumnCount(int i10) {
        this.f27618c.n(i10);
        g();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        zy0 zy0Var = this.f27618c;
        zy0Var.f33301u = z10;
        zy0Var.k();
        g();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.G = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.f27625x == z10) {
            return;
        }
        this.f27625x = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i10) {
        this.f27624w = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        if (this.f27619e != i10) {
            this.f27619e = i10;
            g();
            requestLayout();
        }
    }

    public void setRenderWidth(int i10) {
        int i11;
        int i12;
        int measuredWidth = getMeasuredWidth();
        this.f27626y = Math.max(measuredWidth, i10);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            cz0 d = d(i13);
            if (measuredWidth > 0 && (i12 = this.f27626y) != measuredWidth) {
                float f7 = measuredWidth;
                int round = Math.round((d.f25179n * i12) / f7);
                int round2 = Math.round(((d.f25179n + d.f25180o) * this.f27626y) / f7);
                d.f25181p = round;
                d.f25176k = Math.max(0, round2 - round);
                if (d.f25170c != null && d.f25169b != null) {
                    d.f();
                }
            } else {
                int i14 = d.f25179n;
                d.f25181p = i14;
                d.f25176k = Math.max(0, (d.f25180o + i14) - i14);
                if (d.f25170c != null && d.f25169b != null) {
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
                cz0 d10 = d(i18);
                bz0 bz0Var = d10.f25169b;
                if (bz0Var != null) {
                    i11 = bz0Var.getEmojiOnlyCount();
                } else {
                    i11 = 0;
                }
                if (i11 > 0) {
                    dz0 dz0Var = d10.f25168a.f25843a.f26566b;
                    int max = Math.max(0, dz0Var.f25518a);
                    int min = Math.min(i15, dz0Var.f25519b);
                    if (max < min) {
                        int i19 = 0;
                        for (int i20 = max; i20 < min; i20++) {
                            i19 += iArr2[i20];
                        }
                        int max2 = Math.max(1, Math.round(d10.f25176k / i11)) - i19;
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
                cz0 d11 = d(i25);
                dz0 dz0Var2 = d11.f25168a.f25843a.f26566b;
                int max3 = Math.max(0, Math.min(i15, dz0Var2.f25518a));
                int max4 = Math.max(max3, Math.min(i15, dz0Var2.f25519b));
                int i26 = iArr4[max3];
                int i27 = iArr4[max4];
                d11.f25182q = i26;
                d11.f25177l = Math.max(0, i27 - i26);
                if (d11.f25170c != null) {
                    d11.g();
                }
                this.O.onLayoutChild(d11.f25169b, d11.b(), d11.c());
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
        zy0 zy0Var = this.d;
        zy0Var.f33301u = z10;
        zy0Var.k();
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
        this.f27620f = z10;
        requestLayout();
    }
}
