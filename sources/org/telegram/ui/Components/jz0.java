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
    public final org.telegram.ui.Cells.r9 f25441a;
    public int f25442b;
    public final zy0 f25443c;
    public final zy0 d;
    public int e;
    public boolean f25444f;
    public int h;
    public int f25445n;
    public int f25446r;
    public int f25447s;
    public int v;
    public int f25448w;
    public boolean f25449x;
    public int f25450y;

    public jz0(Context context, iz0 iz0Var, org.telegram.ui.Cells.r9 r9Var) {
        super(context);
        this.f25443c = new zy0(this, true);
        this.d = new zy0(this, false);
        this.e = 0;
        this.f25444f = false;
        this.h = 1;
        this.f25445n = 0;
        this.f25446r = AndroidUtilities.dp(8.0f);
        this.f25447s = AndroidUtilities.dp(9.0f);
        this.v = AndroidUtilities.dp(12.0f);
        this.f25449x = true;
        this.F = new int[0];
        this.J = new ArrayList();
        this.K = new ArrayList();
        new Path();
        this.L = new Path();
        this.M = new RectF();
        this.N = new float[8];
        this.P = new ArrayList();
        this.f25441a = r9Var;
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
        gz0 gz0Var = ez0Var.f23776a;
        ez0Var.f23776a = new gz0(gz0Var.f24460a, dz0Var, gz0Var.f24462c, gz0Var.d);
        dz0 dz0Var2 = new dz0(i12, i13 + i12);
        gz0 gz0Var2 = ez0Var.f23777b;
        ez0Var.f23777b = new gz0(gz0Var2.f24460a, dz0Var2, gz0Var2.f24462c, gz0Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        cz0 cz0Var = new cz0(this, arrayList.size());
        ez0 ez0Var = new ez0();
        dz0 dz0Var = new dz0(i11, i13 + i11);
        vy0 vy0Var = U;
        ez0Var.f23776a = new gz0(false, dz0Var, vy0Var, 0.0f);
        ez0Var.f23777b = new gz0(false, new dz0(i10, i12 + i10), vy0Var, 0.0f);
        cz0Var.f23152a = ez0Var;
        cz0Var.f23158j = i11;
        arrayList.add(cz0Var);
        g();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        cz0 cz0Var = new cz0(this, arrayList.size());
        cz0Var.f23154c = pagetablecell;
        ez0 ez0Var = new ez0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        dz0 dz0Var = new dz0(i11, i13 + i11);
        vy0 vy0Var = U;
        ez0Var.f23776a = new gz0(false, dz0Var, vy0Var, 0.0f);
        ez0Var.f23777b = new gz0(false, new dz0(i10, i12 + i10), vy0Var, 1.0f);
        cz0Var.f23152a = ez0Var;
        cz0Var.f23158j = i11;
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
        int i11 = this.f25445n;
        int i12 = 1;
        if (i11 == 0) {
            if (this.e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                zy0Var = this.f25443c;
            } else {
                zy0Var = this.d;
            }
            int i13 = zy0Var.f30683b;
            if (i13 == Integer.MIN_VALUE) {
                i13 = 0;
            }
            int[] iArr = new int[i13];
            int childCount = getChildCount();
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < childCount; i16++) {
                ez0 ez0Var = d(i16).f23152a;
                if (z10) {
                    gz0Var = ez0Var.f23776a;
                } else {
                    gz0Var = ez0Var.f23777b;
                }
                dz0 dz0Var = gz0Var.f24461b;
                boolean z11 = gz0Var.f24460a;
                int i17 = dz0Var.f23492b;
                int i18 = dz0Var.f23491a;
                int i19 = i17 - i18;
                if (z11) {
                    i14 = i18;
                }
                if (z10) {
                    gz0Var2 = ez0Var.f23777b;
                } else {
                    gz0Var2 = ez0Var.f23776a;
                }
                dz0 dz0Var2 = gz0Var2.f24461b;
                boolean z12 = gz0Var2.f24460a;
                int i20 = dz0Var2.f23492b;
                int i21 = dz0Var2.f23491a;
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
                i12 = (i12 * 31) + d(i25).f23152a.hashCode();
            }
            this.f25445n = i12;
            return;
        }
        int childCount3 = getChildCount();
        int i26 = 1;
        for (int i27 = 0; i27 < childCount3; i27++) {
            i26 = (i26 * 31) + d(i27).f23152a.hashCode();
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
            zy0Var = this.f25443c;
        } else {
            zy0Var = this.d;
        }
        if (z11) {
            if (zy0Var.f30688j == null) {
                zy0Var.f30688j = new int[zy0Var.e() + 1];
            }
            if (!zy0Var.f30689k) {
                zy0Var.b(true);
                zy0Var.f30689k = true;
            }
            iArr = zy0Var.f30688j;
        } else {
            if (zy0Var.f30690l == null) {
                zy0Var.f30690l = new int[zy0Var.e() + 1];
            }
            if (!zy0Var.f30691m) {
                zy0Var.b(false);
                zy0Var.f30691m = true;
            }
            iArr = zy0Var.f30690l;
        }
        ez0 ez0Var = cz0Var.f23152a;
        if (z10) {
            gz0Var = ez0Var.f23777b;
        } else {
            gz0Var = ez0Var.f23776a;
        }
        dz0 dz0Var = gz0Var.f24461b;
        if (z11) {
            i10 = dz0Var.f23491a;
        } else {
            i10 = dz0Var.f23492b;
        }
        return iArr[i10];
    }

    public final int f(cz0 cz0Var, boolean z10, boolean z11) {
        int i10;
        gz0 gz0Var;
        zy0 zy0Var;
        boolean z12;
        ez0 ez0Var = cz0Var.f23152a;
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
            if (!this.f25444f) {
                return 0;
            }
            if (z10) {
                gz0Var = ez0Var.f23777b;
            } else {
                gz0Var = ez0Var.f23776a;
            }
            if (z10) {
                zy0Var = this.f25443c;
            } else {
                zy0Var = this.d;
            }
            dz0 dz0Var = gz0Var.f24461b;
            if (z10 && this.I) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != z11) {
                int i11 = dz0Var.f23491a;
                return 0;
            }
            int i12 = dz0Var.f23492b;
            zy0Var.e();
            return 0;
        }
        return i10;
    }

    public final void g() {
        this.f25445n = 0;
        zy0 zy0Var = this.f25443c;
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
        return this.f25443c.e();
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
        return this.f25444f;
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
            ez0 ez0Var = d.f23152a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                if (this.f25442b == 2) {
                    i12 = ((int) (size / 2.0f)) - (this.v * 4);
                } else {
                    i12 = (int) (size / 1.5f);
                }
                d.e(this.O.createTextLayout(d.f23154c, i12));
                if (d.f23153b != null) {
                    ((ViewGroup.MarginLayoutParams) ez0Var).height = Math.max(this.f25448w, d.f23155f + this.f25446r + this.f25447s);
                    int emojiOnlyCount = d.f23153b.getEmojiOnlyCount();
                    if (emojiOnlyCount > 0) {
                        i13 = ((ViewGroup.MarginLayoutParams) ez0Var).height * emojiOnlyCount;
                    } else {
                        i13 = (this.v * 2) + d.e;
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
                if (this.e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    gz0Var = ez0Var.f23777b;
                } else {
                    gz0Var = ez0Var.f23776a;
                }
                if (gz0.a(gz0Var, z11) == U) {
                    dz0 dz0Var = gz0Var.f24461b;
                    if (z11) {
                        zy0Var = this.f25443c;
                    } else {
                        zy0Var = this.d;
                    }
                    int[] g10 = zy0Var.g();
                    int e = (g10[dz0Var.f23492b] - g10[dz0Var.f23491a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        bz0 bz0Var = d.f23153b;
                        if (bz0Var != null) {
                            i11 = bz0Var.getEmojiOnlyCount();
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            int max = Math.max(1, Math.round(e / i11));
                            ((ViewGroup.MarginLayoutParams) ez0Var).height = max;
                            d.f23161m = max;
                        }
                        int i17 = ((ViewGroup.MarginLayoutParams) ez0Var).height;
                        d.d(e(d, true, false) + e(d, true, true) + e, e(d, false, false) + e(d, false, true) + i17, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) ez0Var).width, e(d, false, false) + e(d, false, true) + e, false);
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
        zy0 zy0Var2 = jz0Var.f25443c;
        if (zy0Var2 != null && zy0Var != null) {
            zy0Var2.l();
            zy0Var.l();
        }
        jz0Var.f25442b = 0;
        int childCount = jz0Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            jz0Var.f25442b = Math.max(jz0Var.f25442b, jz0Var.d(i16).f23152a.f23777b.f24461b.f23492b);
        }
        jz0Var.h(i10, true);
        if (jz0Var.e == 0) {
            i12 = zy0Var2.i(i10);
            if (jz0Var.f25449x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                zy0Var2.v.f24113a = i12;
                zy0Var2.f30700w.f24113a = -i12;
                zy0Var2.f30695q = false;
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
        zy0Var2.v.f24113a = i12;
        zy0Var2.f30700w.f24113a = -i12;
        zy0Var2.f30695q = false;
        zy0Var2.g();
        zy0Var.v.f24113a = max;
        zy0Var.f30700w.f24113a = -max;
        zy0Var.f30695q = false;
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
            ez0 ez0Var = d.f23152a;
            gz0 gz0Var = ez0Var.f23777b;
            gz0 gz0Var2 = ez0Var.f23776a;
            dz0 dz0Var = gz0Var.f24461b;
            dz0 dz0Var2 = gz0Var2.f24461b;
            int i21 = childCount2;
            int i22 = g10[dz0Var.f23491a];
            int i23 = g11[dz0Var2.f23491a];
            int i24 = g10[dz0Var.f23492b] - i22;
            int i25 = g11[dz0Var2.f23492b] - i23;
            int i26 = d.f23159k;
            zy0 zy0Var3 = zy0Var;
            int i27 = d.f23160l;
            vy0 a2 = gz0.a(gz0Var, true);
            vy0 a10 = gz0.a(gz0Var2, false);
            lf.i f7 = zy0Var2.f();
            az0 az0Var = (az0) ((Object[]) f7.d)[((int[]) f7.f14011b)[i20]];
            lf.i f10 = zy0Var3.f();
            zy0 zy0Var4 = zy0Var2;
            az0 az0Var2 = (az0) ((Object[]) f10.d)[((int[]) f10.f14011b)[i20]];
            int b10 = a2.b(d, i24 - az0Var.d(true));
            int b11 = a10.b(d, i25 - az0Var2.d(true));
            int e = jz0Var.e(d, true, true);
            int e7 = jz0Var.e(d, false, true);
            int e10 = jz0Var.e(d, true, false);
            int i28 = e + e10;
            int e11 = e7 + jz0Var.e(d, false, false);
            int a11 = az0Var.a(jz0Var, d, a2, i26 + i28, true);
            jz0Var = this;
            int a12 = az0Var2.a(jz0Var, d, a10, i27 + e11, false);
            int c10 = a2.c(i26, i24 - i28);
            int c11 = a10.c(i27, i25 - e11);
            int i29 = i22 + b10 + a11;
            if (!jz0Var.I) {
                i15 = e + i29;
            } else {
                i15 = ((i18 - c10) - e10) - i29;
            }
            int i30 = i15;
            int i31 = i23 + b11 + a12 + e7;
            if (d.f23154c != null) {
                if (c10 != d.f23159k || c11 != d.f23160l) {
                    d.d(c10, c11, false);
                }
                int i32 = d.f23161m;
                if (i32 != 0 && i32 != c11) {
                    dz0 dz0Var3 = d.f23152a.f23776a.f24461b;
                    if (dz0Var3.f23492b - dz0Var3.f23491a <= 1) {
                        ArrayList arrayList2 = jz0Var.K;
                        int size = arrayList2.size();
                        int i33 = 0;
                        while (true) {
                            if (i33 < size) {
                                PointF pointF = (PointF) arrayList2.get(i33);
                                float f11 = pointF.x;
                                float f12 = d.f23152a.f23776a.f24461b.f23491a;
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
            d.f23164p = i30;
            d.f23165q = i31;
            i19 = i20 + 1;
            zy0Var = zy0Var3;
            childCount2 = i21;
            zy0Var2 = zy0Var4;
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            cz0 cz0Var = (cz0) arrayList.get(i34);
            int i35 = cz0Var.f23160l;
            int i36 = cz0Var.d;
            int i37 = i35 - cz0Var.f23161m;
            ArrayList arrayList3 = jz0Var.P;
            int size3 = arrayList3.size();
            for (int i38 = i36 + 1; i38 < size3; i38++) {
                cz0 cz0Var2 = (cz0) arrayList3.get(i38);
                if (cz0Var.f23152a.f23776a.f24461b.f23491a != cz0Var2.f23152a.f23776a.f24461b.f23491a) {
                    break;
                }
                int i39 = cz0Var.f23161m;
                int i40 = cz0Var2.f23161m;
                if (i39 < i40) {
                    z10 = true;
                    break;
                }
                int i41 = cz0Var2.f23160l - i40;
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
                    if (cz0Var.f23152a.f23776a.f24461b.f23491a != cz0Var3.f23152a.f23776a.f24461b.f23491a) {
                        break;
                    }
                    int i43 = cz0Var.f23161m;
                    int i44 = cz0Var3.f23161m;
                    if (i43 < i44) {
                        z10 = true;
                        break;
                    }
                    int i45 = cz0Var3.f23160l - i44;
                    if (i45 > 0) {
                        i37 = Math.min(i37, i45);
                    }
                    i42--;
                }
            }
            if (!z10) {
                cz0Var.f23160l = cz0Var.f23161m;
                cz0Var.g();
                max -= i37;
                int i46 = cz0Var.f23152a.f23776a.f24461b.f23491a;
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
                        int i50 = cz0Var.f23152a.f23776a.f24461b.f23491a;
                        int i51 = cz0Var4.f23152a.f23776a.f24461b.f23491a;
                        if (i50 == i51) {
                            if (cz0Var4.f23161m != cz0Var4.f23160l) {
                                arrayList.remove(cz0Var4);
                                if (cz0Var4.d < i36) {
                                    i48--;
                                }
                                i47--;
                            }
                            int i52 = cz0Var4.f23160l - i37;
                            cz0Var4.f23160l = i52;
                            i14 = i49;
                            cz0Var4.d(cz0Var4.f23159k, i52, true);
                        } else {
                            i14 = i49;
                            if (i50 < i51) {
                                cz0Var4.f23165q -= i37;
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
            jz0Var.O.onLayoutChild(d10.f23153b, d10.b(), d10.c());
            d10.f23162n = d10.f23164p;
            d10.f23163o = d10.f23159k;
        }
        jz0Var.f25450y = i18;
        jz0Var.E = max;
        jz0Var.F = copyOf;
        jz0Var.setMeasuredDimension(i18, max);
    }

    @Override
    public final void requestLayout() {
        zy0 zy0Var;
        super.requestLayout();
        zy0 zy0Var2 = this.f25443c;
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
        this.f25443c.n(i10);
        g();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        zy0 zy0Var = this.f25443c;
        zy0Var.f30699u = z10;
        zy0Var.k();
        g();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.G = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.f25449x == z10) {
            return;
        }
        this.f25449x = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i10) {
        this.f25448w = i10;
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
        this.f25450y = Math.max(measuredWidth, i10);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            cz0 d = d(i13);
            if (measuredWidth > 0 && (i12 = this.f25450y) != measuredWidth) {
                float f7 = measuredWidth;
                int round = Math.round((d.f23162n * i12) / f7);
                int round2 = Math.round(((d.f23162n + d.f23163o) * this.f25450y) / f7);
                d.f23164p = round;
                d.f23159k = Math.max(0, round2 - round);
                if (d.f23154c != null && d.f23153b != null) {
                    d.f();
                }
            } else {
                int i14 = d.f23162n;
                d.f23164p = i14;
                d.f23159k = Math.max(0, (d.f23163o + i14) - i14);
                if (d.f23154c != null && d.f23153b != null) {
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
                bz0 bz0Var = d10.f23153b;
                if (bz0Var != null) {
                    i11 = bz0Var.getEmojiOnlyCount();
                } else {
                    i11 = 0;
                }
                if (i11 > 0) {
                    dz0 dz0Var = d10.f23152a.f23776a.f24461b;
                    int max = Math.max(0, dz0Var.f23491a);
                    int min = Math.min(i15, dz0Var.f23492b);
                    if (max < min) {
                        int i19 = 0;
                        for (int i20 = max; i20 < min; i20++) {
                            i19 += iArr2[i20];
                        }
                        int max2 = Math.max(1, Math.round(d10.f23159k / i11)) - i19;
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
                dz0 dz0Var2 = d11.f23152a.f23776a.f24461b;
                int max3 = Math.max(0, Math.min(i15, dz0Var2.f23491a));
                int max4 = Math.max(max3, Math.min(i15, dz0Var2.f23492b));
                int i26 = iArr4[max3];
                int i27 = iArr4[max4];
                d11.f23165q = i26;
                d11.f23160l = Math.max(0, i27 - i26);
                if (d11.f23154c != null) {
                    d11.g();
                }
                this.O.onLayoutChild(d11.f23153b, d11.b(), d11.c());
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
        zy0Var.f30699u = z10;
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
        this.f25444f = z10;
        requestLayout();
    }
}
