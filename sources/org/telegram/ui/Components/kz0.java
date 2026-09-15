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
public final class kz0 extends View {
    public static final wy0 R = new wy0(0);
    public static final wy0 S = new wy0(1);
    public static final wy0 T = new wy0(3);
    public static final wy0 U = new wy0(4);
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
    public final jz0 O;
    public final ArrayList P;
    public final iz0 Q;
    public final org.telegram.ui.Cells.q9 f25779a;
    public int f25780b;
    public final az0 f25781c;
    public final az0 d;
    public int e;
    public boolean f25782f;
    public int h;
    public int f25783n;
    public int f25784r;
    public int f25785s;
    public int v;
    public int f25786w;
    public boolean f25787x;
    public int f25788y;

    public kz0(Context context, jz0 jz0Var, org.telegram.ui.Cells.q9 q9Var) {
        super(context);
        this.f25781c = new az0(this, true);
        this.d = new az0(this, false);
        this.e = 0;
        this.f25782f = false;
        this.h = 1;
        this.f25783n = 0;
        this.f25784r = AndroidUtilities.dp(8.0f);
        this.f25785s = AndroidUtilities.dp(9.0f);
        this.v = AndroidUtilities.dp(12.0f);
        this.f25787x = true;
        this.F = new int[0];
        this.J = new ArrayList();
        this.K = new ArrayList();
        new Path();
        this.L = new Path();
        this.M = new RectF();
        this.N = new float[8];
        this.P = new ArrayList();
        this.f25779a = q9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.O = jz0Var;
        iz0 iz0Var = new iz0(this, this);
        this.Q = iz0Var;
        r0.i0.k(this, iz0Var);
    }

    public static void i(fz0 fz0Var, int i10, int i11, int i12, int i13) {
        ez0 ez0Var = new ez0(i10, i11 + i10);
        hz0 hz0Var = fz0Var.f24130a;
        fz0Var.f24130a = new hz0(hz0Var.f24821a, ez0Var, hz0Var.f24823c, hz0Var.d);
        ez0 ez0Var2 = new ez0(i12, i13 + i12);
        hz0 hz0Var2 = fz0Var.f24131b;
        fz0Var.f24131b = new hz0(hz0Var2.f24821a, ez0Var2, hz0Var2.f24823c, hz0Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        dz0 dz0Var = new dz0(this, arrayList.size());
        fz0 fz0Var = new fz0();
        ez0 ez0Var = new ez0(i11, i13 + i11);
        wy0 wy0Var = U;
        fz0Var.f24130a = new hz0(false, ez0Var, wy0Var, 0.0f);
        fz0Var.f24131b = new hz0(false, new ez0(i10, i12 + i10), wy0Var, 0.0f);
        dz0Var.f23436a = fz0Var;
        dz0Var.f23442j = i11;
        arrayList.add(dz0Var);
        g();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        dz0 dz0Var = new dz0(this, arrayList.size());
        dz0Var.f23438c = pagetablecell;
        fz0 fz0Var = new fz0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        ez0 ez0Var = new ez0(i11, i13 + i11);
        wy0 wy0Var = U;
        fz0Var.f24130a = new hz0(false, ez0Var, wy0Var, 0.0f);
        fz0Var.f24131b = new hz0(false, new ez0(i10, i12 + i10), wy0Var, 1.0f);
        dz0Var.f23436a = fz0Var;
        dz0Var.f23442j = i11;
        arrayList.add(dz0Var);
        int i14 = pagetablecell.rowspan;
        if (i14 > 1) {
            this.K.add(new PointF(i11, i11 + i14));
        }
        g();
    }

    public final void c() {
        boolean z10;
        az0 az0Var;
        hz0 hz0Var;
        hz0 hz0Var2;
        int i10;
        int i11 = this.f25783n;
        int i12 = 1;
        if (i11 == 0) {
            if (this.e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                az0Var = this.f25781c;
            } else {
                az0Var = this.d;
            }
            int i13 = az0Var.f22522b;
            if (i13 == Integer.MIN_VALUE) {
                i13 = 0;
            }
            int[] iArr = new int[i13];
            int childCount = getChildCount();
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < childCount; i16++) {
                fz0 fz0Var = d(i16).f23436a;
                if (z10) {
                    hz0Var = fz0Var.f24130a;
                } else {
                    hz0Var = fz0Var.f24131b;
                }
                ez0 ez0Var = hz0Var.f24822b;
                boolean z11 = hz0Var.f24821a;
                int i17 = ez0Var.f23766b;
                int i18 = ez0Var.f23765a;
                int i19 = i17 - i18;
                if (z11) {
                    i14 = i18;
                }
                if (z10) {
                    hz0Var2 = fz0Var.f24131b;
                } else {
                    hz0Var2 = fz0Var.f24130a;
                }
                ez0 ez0Var2 = hz0Var2.f24822b;
                boolean z12 = hz0Var2.f24821a;
                int i20 = ez0Var2.f23766b;
                int i21 = ez0Var2.f23765a;
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
                    i(fz0Var, i14, i19, i15, i22);
                } else {
                    i(fz0Var, i15, i22, i14, i19);
                }
                i15 += i22;
            }
            int childCount2 = getChildCount();
            for (int i25 = 0; i25 < childCount2; i25++) {
                i12 = (i12 * 31) + d(i25).f23436a.hashCode();
            }
            this.f25783n = i12;
            return;
        }
        int childCount3 = getChildCount();
        int i26 = 1;
        for (int i27 = 0; i27 < childCount3; i27++) {
            i26 = (i26 * 31) + d(i27).f23436a.hashCode();
        }
        if (i11 != i26) {
            g();
            c();
        }
    }

    public final dz0 d(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                return (dz0) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        iz0 iz0Var = this.Q;
        if (iz0Var != null && iz0Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(dz0 dz0Var, boolean z10, boolean z11) {
        az0 az0Var;
        int[] iArr;
        hz0 hz0Var;
        int i10;
        if (this.h == 1) {
            return f(dz0Var, z10, z11);
        }
        if (z10) {
            az0Var = this.f25781c;
        } else {
            az0Var = this.d;
        }
        if (z11) {
            if (az0Var.f22527j == null) {
                az0Var.f22527j = new int[az0Var.e() + 1];
            }
            if (!az0Var.f22528k) {
                az0Var.b(true);
                az0Var.f22528k = true;
            }
            iArr = az0Var.f22527j;
        } else {
            if (az0Var.f22529l == null) {
                az0Var.f22529l = new int[az0Var.e() + 1];
            }
            if (!az0Var.f22530m) {
                az0Var.b(false);
                az0Var.f22530m = true;
            }
            iArr = az0Var.f22529l;
        }
        fz0 fz0Var = dz0Var.f23436a;
        if (z10) {
            hz0Var = fz0Var.f24131b;
        } else {
            hz0Var = fz0Var.f24130a;
        }
        ez0 ez0Var = hz0Var.f24822b;
        if (z11) {
            i10 = ez0Var.f23765a;
        } else {
            i10 = ez0Var.f23766b;
        }
        return iArr[i10];
    }

    public final int f(dz0 dz0Var, boolean z10, boolean z11) {
        int i10;
        hz0 hz0Var;
        az0 az0Var;
        boolean z12;
        fz0 fz0Var = dz0Var.f23436a;
        if (z10) {
            if (z11) {
                i10 = ((ViewGroup.MarginLayoutParams) fz0Var).leftMargin;
            } else {
                i10 = ((ViewGroup.MarginLayoutParams) fz0Var).rightMargin;
            }
        } else if (z11) {
            i10 = ((ViewGroup.MarginLayoutParams) fz0Var).topMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) fz0Var).bottomMargin;
        }
        if (i10 == Integer.MIN_VALUE) {
            if (!this.f25782f) {
                return 0;
            }
            if (z10) {
                hz0Var = fz0Var.f24131b;
            } else {
                hz0Var = fz0Var.f24130a;
            }
            if (z10) {
                az0Var = this.f25781c;
            } else {
                az0Var = this.d;
            }
            ez0 ez0Var = hz0Var.f24822b;
            if (z10 && this.I) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != z11) {
                int i11 = ez0Var.f23765a;
                return 0;
            }
            int i12 = ez0Var.f23766b;
            az0Var.e();
            return 0;
        }
        return i10;
    }

    public final void g() {
        this.f25783n = 0;
        az0 az0Var = this.f25781c;
        az0Var.k();
        az0 az0Var2 = this.d;
        az0Var2.k();
        if (az0Var != null && az0Var2 != null) {
            az0Var.l();
            az0Var2.l();
        }
    }

    public int getAlignmentMode() {
        return this.h;
    }

    public int getChildCount() {
        return this.P.size();
    }

    public int getColumnCount() {
        return this.f25781c.e();
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
        return this.f25782f;
    }

    public final void h(int i10, boolean z10) {
        boolean z11;
        hz0 hz0Var;
        az0 az0Var;
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            dz0 d = d(i14);
            fz0 fz0Var = d.f23436a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                if (this.f25780b == 2) {
                    i12 = ((int) (size / 2.0f)) - (this.v * 4);
                } else {
                    i12 = (int) (size / 1.5f);
                }
                d.e(this.O.createTextLayout(d.f23438c, i12));
                if (d.f23437b != null) {
                    ((ViewGroup.MarginLayoutParams) fz0Var).height = Math.max(this.f25786w, d.f23439f + this.f25784r + this.f25785s);
                    int emojiOnlyCount = d.f23437b.getEmojiOnlyCount();
                    if (emojiOnlyCount > 0) {
                        i13 = ((ViewGroup.MarginLayoutParams) fz0Var).height * emojiOnlyCount;
                    } else {
                        i13 = (this.v * 2) + d.e;
                    }
                    ((ViewGroup.MarginLayoutParams) fz0Var).width = i13;
                } else {
                    ((ViewGroup.MarginLayoutParams) fz0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) fz0Var).height = 0;
                }
                int i15 = ((ViewGroup.MarginLayoutParams) fz0Var).width;
                int i16 = ((ViewGroup.MarginLayoutParams) fz0Var).height;
                d.d(e(d, true, false) + e(d, true, true) + i15, e(d, false, false) + e(d, false, true) + i16, true);
            } else {
                if (this.e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    hz0Var = fz0Var.f24131b;
                } else {
                    hz0Var = fz0Var.f24130a;
                }
                if (hz0.a(hz0Var, z11) == U) {
                    ez0 ez0Var = hz0Var.f24822b;
                    if (z11) {
                        az0Var = this.f25781c;
                    } else {
                        az0Var = this.d;
                    }
                    int[] g10 = az0Var.g();
                    int e = (g10[ez0Var.f23766b] - g10[ez0Var.f23765a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        cz0 cz0Var = d.f23437b;
                        if (cz0Var != null) {
                            i11 = cz0Var.getEmojiOnlyCount();
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            int max = Math.max(1, Math.round(e / i11));
                            ((ViewGroup.MarginLayoutParams) fz0Var).height = max;
                            d.f23445m = max;
                        }
                        int i17 = ((ViewGroup.MarginLayoutParams) fz0Var).height;
                        d.d(e(d, true, false) + e(d, true, true) + e, e(d, false, false) + e(d, false, true) + i17, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) fz0Var).width, e(d, false, false) + e(d, false, true) + e, false);
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
        kz0 kz0Var = this;
        kz0Var.c();
        az0 az0Var = kz0Var.d;
        az0 az0Var2 = kz0Var.f25781c;
        if (az0Var2 != null && az0Var != null) {
            az0Var2.l();
            az0Var.l();
        }
        kz0Var.f25780b = 0;
        int childCount = kz0Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            kz0Var.f25780b = Math.max(kz0Var.f25780b, kz0Var.d(i16).f23436a.f24131b.f24822b.f23766b);
        }
        kz0Var.h(i10, true);
        if (kz0Var.e == 0) {
            i12 = az0Var2.i(i10);
            if (kz0Var.f25787x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                az0Var2.v.f24476a = i12;
                az0Var2.f22539w.f24476a = -i12;
                az0Var2.f22534q = false;
                az0Var2.g();
            }
            kz0Var.h(i10, false);
            i13 = az0Var.i(i11);
        } else {
            int i17 = az0Var.i(i11);
            kz0Var.h(i10, false);
            i12 = az0Var2.i(i10);
            i13 = i17;
        }
        int max = Math.max(i13, kz0Var.getSuggestedMinimumHeight());
        kz0Var.setMeasuredDimension(i12, max);
        az0Var2.v.f24476a = i12;
        az0Var2.f22539w.f24476a = -i12;
        az0Var2.f22534q = false;
        az0Var2.g();
        az0Var.v.f24476a = max;
        az0Var.f22539w.f24476a = -max;
        az0Var.f22534q = false;
        az0Var.g();
        int[] g10 = az0Var2.g();
        int[] g11 = az0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = kz0Var.J;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = kz0Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            dz0 d = kz0Var.d(i20);
            fz0 fz0Var = d.f23436a;
            hz0 hz0Var = fz0Var.f24131b;
            hz0 hz0Var2 = fz0Var.f24130a;
            ez0 ez0Var = hz0Var.f24822b;
            ez0 ez0Var2 = hz0Var2.f24822b;
            int i21 = childCount2;
            int i22 = g10[ez0Var.f23765a];
            int i23 = g11[ez0Var2.f23765a];
            int i24 = g10[ez0Var.f23766b] - i22;
            int i25 = g11[ez0Var2.f23766b] - i23;
            int i26 = d.f23443k;
            az0 az0Var3 = az0Var;
            int i27 = d.f23444l;
            wy0 a2 = hz0.a(hz0Var, true);
            wy0 a10 = hz0.a(hz0Var2, false);
            m.e3 f7 = az0Var2.f();
            bz0 bz0Var = (bz0) ((Object[]) f7.d)[((int[]) f7.f14165b)[i20]];
            m.e3 f10 = az0Var3.f();
            az0 az0Var4 = az0Var2;
            bz0 bz0Var2 = (bz0) ((Object[]) f10.d)[((int[]) f10.f14165b)[i20]];
            int b10 = a2.b(d, i24 - bz0Var.d(true));
            int b11 = a10.b(d, i25 - bz0Var2.d(true));
            int e = kz0Var.e(d, true, true);
            int e7 = kz0Var.e(d, false, true);
            int e10 = kz0Var.e(d, true, false);
            int i28 = e + e10;
            int e11 = e7 + kz0Var.e(d, false, false);
            int a11 = bz0Var.a(kz0Var, d, a2, i26 + i28, true);
            kz0Var = this;
            int a12 = bz0Var2.a(kz0Var, d, a10, i27 + e11, false);
            int c10 = a2.c(i26, i24 - i28);
            int c11 = a10.c(i27, i25 - e11);
            int i29 = i22 + b10 + a11;
            if (!kz0Var.I) {
                i15 = e + i29;
            } else {
                i15 = ((i18 - c10) - e10) - i29;
            }
            int i30 = i15;
            int i31 = i23 + b11 + a12 + e7;
            if (d.f23438c != null) {
                if (c10 != d.f23443k || c11 != d.f23444l) {
                    d.d(c10, c11, false);
                }
                int i32 = d.f23445m;
                if (i32 != 0 && i32 != c11) {
                    ez0 ez0Var3 = d.f23436a.f24130a.f24822b;
                    if (ez0Var3.f23766b - ez0Var3.f23765a <= 1) {
                        ArrayList arrayList2 = kz0Var.K;
                        int size = arrayList2.size();
                        int i33 = 0;
                        while (true) {
                            if (i33 < size) {
                                PointF pointF = (PointF) arrayList2.get(i33);
                                float f11 = pointF.x;
                                float f12 = d.f23436a.f24130a.f24822b.f23765a;
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
            d.f23448p = i30;
            d.f23449q = i31;
            i19 = i20 + 1;
            az0Var = az0Var3;
            childCount2 = i21;
            az0Var2 = az0Var4;
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            dz0 dz0Var = (dz0) arrayList.get(i34);
            int i35 = dz0Var.f23444l;
            int i36 = dz0Var.d;
            int i37 = i35 - dz0Var.f23445m;
            ArrayList arrayList3 = kz0Var.P;
            int size3 = arrayList3.size();
            for (int i38 = i36 + 1; i38 < size3; i38++) {
                dz0 dz0Var2 = (dz0) arrayList3.get(i38);
                if (dz0Var.f23436a.f24130a.f24822b.f23765a != dz0Var2.f23436a.f24130a.f24822b.f23765a) {
                    break;
                }
                int i39 = dz0Var.f23445m;
                int i40 = dz0Var2.f23445m;
                if (i39 < i40) {
                    z10 = true;
                    break;
                }
                int i41 = dz0Var2.f23444l - i40;
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
                    dz0 dz0Var3 = (dz0) arrayList3.get(i42);
                    if (dz0Var.f23436a.f24130a.f24822b.f23765a != dz0Var3.f23436a.f24130a.f24822b.f23765a) {
                        break;
                    }
                    int i43 = dz0Var.f23445m;
                    int i44 = dz0Var3.f23445m;
                    if (i43 < i44) {
                        z10 = true;
                        break;
                    }
                    int i45 = dz0Var3.f23444l - i44;
                    if (i45 > 0) {
                        i37 = Math.min(i37, i45);
                    }
                    i42--;
                }
            }
            if (!z10) {
                dz0Var.f23444l = dz0Var.f23445m;
                dz0Var.g();
                max -= i37;
                int i46 = dz0Var.f23436a.f24130a.f24822b.f23765a;
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
                    dz0 dz0Var4 = (dz0) arrayList3.get(i49);
                    if (dz0Var == dz0Var4) {
                        i14 = i49;
                    } else {
                        int i50 = dz0Var.f23436a.f24130a.f24822b.f23765a;
                        int i51 = dz0Var4.f23436a.f24130a.f24822b.f23765a;
                        if (i50 == i51) {
                            if (dz0Var4.f23445m != dz0Var4.f23444l) {
                                arrayList.remove(dz0Var4);
                                if (dz0Var4.d < i36) {
                                    i48--;
                                }
                                i47--;
                            }
                            int i52 = dz0Var4.f23444l - i37;
                            dz0Var4.f23444l = i52;
                            i14 = i49;
                            dz0Var4.d(dz0Var4.f23443k, i52, true);
                        } else {
                            i14 = i49;
                            if (i50 < i51) {
                                dz0Var4.f23449q -= i37;
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
        int childCount3 = kz0Var.getChildCount();
        for (int i53 = 0; i53 < childCount3; i53++) {
            dz0 d10 = kz0Var.d(i53);
            kz0Var.O.onLayoutChild(d10.f23437b, d10.b(), d10.c());
            d10.f23446n = d10.f23448p;
            d10.f23447o = d10.f23443k;
        }
        kz0Var.f25788y = i18;
        kz0Var.E = max;
        kz0Var.F = copyOf;
        kz0Var.setMeasuredDimension(i18, max);
    }

    @Override
    public final void requestLayout() {
        az0 az0Var;
        super.requestLayout();
        az0 az0Var2 = this.f25781c;
        if (az0Var2 != null && (az0Var = this.d) != null) {
            az0Var2.l();
            az0Var.l();
        }
    }

    public void setAlignmentMode(int i10) {
        this.h = i10;
        requestLayout();
    }

    public void setColumnCount(int i10) {
        this.f25781c.n(i10);
        g();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        az0 az0Var = this.f25781c;
        az0Var.f22538u = z10;
        az0Var.k();
        g();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.G = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.f25787x == z10) {
            return;
        }
        this.f25787x = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i10) {
        this.f25786w = i10;
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
        this.f25788y = Math.max(measuredWidth, i10);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            dz0 d = d(i13);
            if (measuredWidth > 0 && (i12 = this.f25788y) != measuredWidth) {
                float f7 = measuredWidth;
                int round = Math.round((d.f23446n * i12) / f7);
                int round2 = Math.round(((d.f23446n + d.f23447o) * this.f25788y) / f7);
                d.f23448p = round;
                d.f23443k = Math.max(0, round2 - round);
                if (d.f23438c != null && d.f23437b != null) {
                    d.f();
                }
            } else {
                int i14 = d.f23446n;
                d.f23448p = i14;
                d.f23443k = Math.max(0, (d.f23447o + i14) - i14);
                if (d.f23438c != null && d.f23437b != null) {
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
                dz0 d10 = d(i18);
                cz0 cz0Var = d10.f23437b;
                if (cz0Var != null) {
                    i11 = cz0Var.getEmojiOnlyCount();
                } else {
                    i11 = 0;
                }
                if (i11 > 0) {
                    ez0 ez0Var = d10.f23436a.f24130a.f24822b;
                    int max = Math.max(0, ez0Var.f23765a);
                    int min = Math.min(i15, ez0Var.f23766b);
                    if (max < min) {
                        int i19 = 0;
                        for (int i20 = max; i20 < min; i20++) {
                            i19 += iArr2[i20];
                        }
                        int max2 = Math.max(1, Math.round(d10.f23443k / i11)) - i19;
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
                dz0 d11 = d(i25);
                ez0 ez0Var2 = d11.f23436a.f24130a.f24822b;
                int max3 = Math.max(0, Math.min(i15, ez0Var2.f23765a));
                int max4 = Math.max(max3, Math.min(i15, ez0Var2.f23766b));
                int i26 = iArr4[max3];
                int i27 = iArr4[max4];
                d11.f23449q = i26;
                d11.f23444l = Math.max(0, i27 - i26);
                if (d11.f23438c != null) {
                    d11.g();
                }
                this.O.onLayoutChild(d11.f23437b, d11.b(), d11.c());
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
        az0 az0Var = this.d;
        az0Var.f22538u = z10;
        az0Var.k();
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
        this.f25782f = z10;
        requestLayout();
    }
}
