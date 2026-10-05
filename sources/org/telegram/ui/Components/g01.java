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
public final class g01 extends View {
    public static final sz0 R = new sz0(0);
    public static final sz0 S = new sz0(1);
    public static final sz0 T = new sz0(3);
    public static final sz0 U = new sz0(4);
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
    public final f01 O;
    public final ArrayList P;
    public final e01 Q;
    public final org.telegram.ui.Cells.q9 f26656a;
    public int f26657b;
    public final wz0 f26658c;
    public final wz0 d;
    public int f26659e;
    public boolean f26660f;
    public int h;
    public int f26661n;
    public int f26662r;
    public int f26663s;
    public int v;
    public int f26664w;
    public boolean f26665x;
    public int f26666y;

    public g01(Context context, f01 f01Var, org.telegram.ui.Cells.q9 q9Var) {
        super(context);
        this.f26658c = new wz0(this, true);
        this.d = new wz0(this, false);
        this.f26659e = 0;
        this.f26660f = false;
        this.h = 1;
        this.f26661n = 0;
        this.f26662r = AndroidUtilities.dp(8.0f);
        this.f26663s = AndroidUtilities.dp(9.0f);
        this.v = AndroidUtilities.dp(12.0f);
        this.f26665x = true;
        this.F = new int[0];
        this.J = new ArrayList();
        this.K = new ArrayList();
        new Path();
        this.L = new Path();
        this.M = new RectF();
        this.N = new float[8];
        this.P = new ArrayList();
        this.f26656a = q9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.O = f01Var;
        e01 e01Var = new e01(this, this);
        this.Q = e01Var;
        r0.i0.k(this, e01Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(sa.e.v(str, ". "));
    }

    public static void j(b01 b01Var, int i10, int i11, int i12, int i13) {
        a01 a01Var = new a01(i10, i11 + i10);
        d01 d01Var = b01Var.f24789a;
        b01Var.f24789a = new d01(d01Var.f25569a, a01Var, d01Var.f25571c, d01Var.d);
        a01 a01Var2 = new a01(i12, i13 + i12);
        d01 d01Var2 = b01Var.f24790b;
        b01Var.f24790b = new d01(d01Var2.f25569a, a01Var2, d01Var2.f25571c, d01Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        zz0 zz0Var = new zz0(this, arrayList.size());
        b01 b01Var = new b01();
        a01 a01Var = new a01(i11, i13 + i11);
        sz0 sz0Var = U;
        b01Var.f24789a = new d01(false, a01Var, sz0Var, 0.0f);
        b01Var.f24790b = new d01(false, new a01(i10, i12 + i10), sz0Var, 0.0f);
        zz0Var.f33684a = b01Var;
        zz0Var.f33691j = i11;
        arrayList.add(zz0Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        zz0 zz0Var = new zz0(this, arrayList.size());
        zz0Var.f33686c = pagetablecell;
        b01 b01Var = new b01();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        a01 a01Var = new a01(i11, i13 + i11);
        sz0 sz0Var = U;
        b01Var.f24789a = new d01(false, a01Var, sz0Var, 0.0f);
        b01Var.f24790b = new d01(false, new a01(i10, i12 + i10), sz0Var, 1.0f);
        zz0Var.f33684a = b01Var;
        zz0Var.f33691j = i11;
        arrayList.add(zz0Var);
        int i14 = pagetablecell.rowspan;
        if (i14 > 1) {
            this.K.add(new PointF(i11, i11 + i14));
        }
        h();
    }

    public final void c() {
        boolean z10;
        wz0 wz0Var;
        d01 d01Var;
        d01 d01Var2;
        Throwable th2;
        int i10;
        int i11 = this.f26661n;
        if (i11 == 0) {
            if (this.f26659e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                wz0Var = this.f26658c;
            } else {
                wz0Var = this.d;
            }
            int i12 = wz0Var.f32754b;
            if (i12 == Integer.MIN_VALUE) {
                i12 = 0;
            }
            if (i12 >= 0 && i12 <= 1024) {
                int[] iArr = new int[i12];
                int childCount = getChildCount();
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    b01 b01Var = d(i15).f33684a;
                    if (z10) {
                        d01Var = b01Var.f24789a;
                    } else {
                        d01Var = b01Var.f24790b;
                    }
                    a01 a01Var = d01Var.f25570b;
                    boolean z11 = d01Var.f25569a;
                    int a2 = a01Var.a();
                    if (a2 > 0 && a2 <= 1024) {
                        if (z11) {
                            i13 = a01Var.f24403a;
                        }
                        if (z10) {
                            d01Var2 = b01Var.f24790b;
                        } else {
                            d01Var2 = b01Var.f24789a;
                        }
                        a01 a01Var2 = d01Var2.f25570b;
                        int a10 = a01Var2.a();
                        int i16 = a01Var2.f24403a;
                        if (a10 > 0) {
                            th2 = null;
                            if (a01Var2.a() <= 1024) {
                                boolean z12 = d01Var2.f25569a;
                                int a11 = a01Var2.a();
                                if (i12 != 0) {
                                    if (z12) {
                                        i10 = Math.min(i16, i12);
                                    } else {
                                        i10 = 0;
                                    }
                                    a11 = Math.min(a11, i12 - i10);
                                }
                                if (z12) {
                                    i14 = i16;
                                }
                                if (i12 != 0) {
                                    if (!z11 || !z12) {
                                        while (true) {
                                            int i17 = i14 + a11;
                                            if (i17 <= i12) {
                                                for (int i18 = i14; i18 < i17; i18++) {
                                                    if (iArr[i18] <= i13) {
                                                    }
                                                }
                                                break;
                                            }
                                            if (z12) {
                                                i13++;
                                            } else if (i17 <= i12) {
                                                i14++;
                                            } else {
                                                i13++;
                                                i14 = 0;
                                            }
                                        }
                                    }
                                    Arrays.fill(iArr, Math.min(i14, i12), Math.min(i14 + a11, i12), i13 + a2);
                                }
                                if (z10) {
                                    j(b01Var, i13, a2, i14, a11);
                                } else {
                                    j(b01Var, i14, a11, i13, a2);
                                }
                                i14 += a11;
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
                int i19 = 1;
                for (int i20 = 0; i20 < childCount2; i20++) {
                    i19 = (i19 * 31) + d(i20).f33684a.hashCode();
                }
                this.f26661n = i19;
                return;
            }
            g("Table grid count out of bounds");
            throw null;
        }
        int childCount3 = getChildCount();
        int i21 = 1;
        for (int i22 = 0; i22 < childCount3; i22++) {
            i21 = (i21 * 31) + d(i22).f33684a.hashCode();
        }
        if (i11 != i21) {
            h();
            c();
        }
    }

    public final zz0 d(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                return (zz0) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        e01 e01Var = this.Q;
        if (e01Var != null && e01Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(zz0 zz0Var, boolean z10, boolean z11) {
        wz0 wz0Var;
        int[] iArr;
        d01 d01Var;
        int i10;
        if (this.h == 1) {
            return f(zz0Var, z10, z11);
        }
        if (z10) {
            wz0Var = this.f26658c;
        } else {
            wz0Var = this.d;
        }
        if (z11) {
            if (wz0Var.f32760j == null) {
                wz0Var.f32760j = new int[wz0Var.e() + 1];
            }
            if (!wz0Var.f32761k) {
                wz0Var.b(true);
                wz0Var.f32761k = true;
            }
            iArr = wz0Var.f32760j;
        } else {
            if (wz0Var.f32762l == null) {
                wz0Var.f32762l = new int[wz0Var.e() + 1];
            }
            if (!wz0Var.f32763m) {
                wz0Var.b(false);
                wz0Var.f32763m = true;
            }
            iArr = wz0Var.f32762l;
        }
        b01 b01Var = zz0Var.f33684a;
        if (z10) {
            d01Var = b01Var.f24790b;
        } else {
            d01Var = b01Var.f24789a;
        }
        a01 a01Var = d01Var.f25570b;
        if (z11) {
            i10 = a01Var.f24403a;
        } else {
            i10 = a01Var.f24404b;
        }
        return iArr[i10];
    }

    public final int f(zz0 zz0Var, boolean z10, boolean z11) {
        int i10;
        d01 d01Var;
        wz0 wz0Var;
        boolean z12;
        b01 b01Var = zz0Var.f33684a;
        if (z10) {
            if (z11) {
                i10 = ((ViewGroup.MarginLayoutParams) b01Var).leftMargin;
            } else {
                i10 = ((ViewGroup.MarginLayoutParams) b01Var).rightMargin;
            }
        } else if (z11) {
            i10 = ((ViewGroup.MarginLayoutParams) b01Var).topMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) b01Var).bottomMargin;
        }
        if (i10 == Integer.MIN_VALUE) {
            if (!this.f26660f) {
                return 0;
            }
            if (z10) {
                d01Var = b01Var.f24790b;
            } else {
                d01Var = b01Var.f24789a;
            }
            if (z10) {
                wz0Var = this.f26658c;
            } else {
                wz0Var = this.d;
            }
            a01 a01Var = d01Var.f25570b;
            if (z10 && this.I) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != z11) {
                int i11 = a01Var.f24403a;
                return 0;
            }
            int i12 = a01Var.f24404b;
            wz0Var.e();
            return 0;
        }
        return i10;
    }

    public int getAlignmentMode() {
        return this.h;
    }

    public int getChildCount() {
        return this.P.size();
    }

    public int getColumnCount() {
        return this.f26658c.e();
    }

    public int getOrientation() {
        return this.f26659e;
    }

    public int getRenderHeight() {
        return this.E;
    }

    public int getRowCount() {
        return this.d.e();
    }

    public boolean getUseDefaultMargins() {
        return this.f26660f;
    }

    public final void h() {
        this.f26661n = 0;
        wz0 wz0Var = this.f26658c;
        wz0Var.k();
        wz0 wz0Var2 = this.d;
        wz0Var2.k();
        if (wz0Var != null && wz0Var2 != null) {
            wz0Var.l();
            wz0Var2.l();
        }
    }

    public final void i(int i10, boolean z10) {
        boolean z11;
        d01 d01Var;
        wz0 wz0Var;
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            zz0 d = d(i14);
            b01 b01Var = d.f33684a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                if (this.f26657b == 2) {
                    i12 = ((int) (size / 2.0f)) - (this.v * 4);
                } else {
                    i12 = (int) (size / 1.5f);
                }
                d.e(this.O.createTextLayout(d.f33686c, i12));
                if (d.f33685b != null) {
                    ((ViewGroup.MarginLayoutParams) b01Var).height = Math.max(this.f26664w, d.f33688f + this.f26662r + this.f26663s);
                    int emojiOnlyCount = d.f33685b.getEmojiOnlyCount();
                    if (emojiOnlyCount > 0) {
                        i13 = ((ViewGroup.MarginLayoutParams) b01Var).height * emojiOnlyCount;
                    } else {
                        i13 = (this.v * 2) + d.f33687e;
                    }
                    ((ViewGroup.MarginLayoutParams) b01Var).width = i13;
                } else {
                    ((ViewGroup.MarginLayoutParams) b01Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) b01Var).height = 0;
                }
                int i15 = ((ViewGroup.MarginLayoutParams) b01Var).width;
                int i16 = ((ViewGroup.MarginLayoutParams) b01Var).height;
                d.d(e(d, true, false) + e(d, true, true) + i15, e(d, false, false) + e(d, false, true) + i16, true);
            } else {
                if (this.f26659e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    d01Var = b01Var.f24790b;
                } else {
                    d01Var = b01Var.f24789a;
                }
                if (d01.a(d01Var, z11) == U) {
                    a01 a01Var = d01Var.f25570b;
                    if (z11) {
                        wz0Var = this.f26658c;
                    } else {
                        wz0Var = this.d;
                    }
                    int[] g10 = wz0Var.g();
                    int e7 = (g10[a01Var.f24404b] - g10[a01Var.f24403a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        yz0 yz0Var = d.f33685b;
                        if (yz0Var != null) {
                            i11 = yz0Var.getEmojiOnlyCount();
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            int max = Math.max(1, Math.round(e7 / i11));
                            ((ViewGroup.MarginLayoutParams) b01Var).height = max;
                            d.f33694m = max;
                        }
                        int i17 = ((ViewGroup.MarginLayoutParams) b01Var).height;
                        d.d(e(d, true, false) + e(d, true, true) + e7, e(d, false, false) + e(d, false, true) + i17, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) b01Var).width, e(d, false, false) + e(d, false, true) + e7, false);
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
        g01 g01Var = this;
        g01Var.c();
        wz0 wz0Var = g01Var.d;
        wz0 wz0Var2 = g01Var.f26658c;
        if (wz0Var2 != null && wz0Var != null) {
            wz0Var2.l();
            wz0Var.l();
        }
        g01Var.f26657b = 0;
        int childCount = g01Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            g01Var.f26657b = Math.max(g01Var.f26657b, g01Var.d(i16).f33684a.f24790b.f25570b.f24404b);
        }
        g01Var.i(i10, true);
        if (g01Var.f26659e == 0) {
            i12 = wz0Var2.i(i10);
            if (g01Var.f26665x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                wz0Var2.v.f25219a = i12;
                wz0Var2.f32772w.f25219a = -i12;
                wz0Var2.f32767q = false;
                wz0Var2.g();
            }
            g01Var.i(i10, false);
            i13 = wz0Var.i(i11);
        } else {
            int i17 = wz0Var.i(i11);
            g01Var.i(i10, false);
            i12 = wz0Var2.i(i10);
            i13 = i17;
        }
        int max = Math.max(i13, g01Var.getSuggestedMinimumHeight());
        g01Var.setMeasuredDimension(i12, max);
        wz0Var2.v.f25219a = i12;
        wz0Var2.f32772w.f25219a = -i12;
        wz0Var2.f32767q = false;
        wz0Var2.g();
        wz0Var.v.f25219a = max;
        wz0Var.f32772w.f25219a = -max;
        wz0Var.f32767q = false;
        wz0Var.g();
        int[] g10 = wz0Var2.g();
        int[] g11 = wz0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = g01Var.J;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = g01Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            zz0 d = g01Var.d(i20);
            b01 b01Var = d.f33684a;
            d01 d01Var = b01Var.f24790b;
            d01 d01Var2 = b01Var.f24789a;
            a01 a01Var = d01Var.f25570b;
            a01 a01Var2 = d01Var2.f25570b;
            int i21 = childCount2;
            int i22 = g10[a01Var.f24403a];
            int i23 = g11[a01Var2.f24403a];
            int i24 = g10[a01Var.f24404b] - i22;
            int i25 = g11[a01Var2.f24404b] - i23;
            int i26 = d.f33692k;
            wz0 wz0Var3 = wz0Var;
            int i27 = d.f33693l;
            sz0 a2 = d01.a(d01Var, true);
            sz0 a10 = d01.a(d01Var2, false);
            la.h f7 = wz0Var2.f();
            xz0 xz0Var = (xz0) ((Object[]) f7.d)[((int[]) f7.f15399b)[i20]];
            la.h f10 = wz0Var3.f();
            wz0 wz0Var4 = wz0Var2;
            xz0 xz0Var2 = (xz0) ((Object[]) f10.d)[((int[]) f10.f15399b)[i20]];
            int b10 = a2.b(d, i24 - xz0Var.d(true));
            int b11 = a10.b(d, i25 - xz0Var2.d(true));
            int e7 = g01Var.e(d, true, true);
            int e10 = g01Var.e(d, false, true);
            int e11 = g01Var.e(d, true, false);
            int i28 = e7 + e11;
            int e12 = e10 + g01Var.e(d, false, false);
            int a11 = xz0Var.a(g01Var, d, a2, i26 + i28, true);
            g01Var = this;
            int a12 = xz0Var2.a(g01Var, d, a10, i27 + e12, false);
            int c10 = a2.c(i26, i24 - i28);
            int c11 = a10.c(i27, i25 - e12);
            int i29 = i22 + b10 + a11;
            if (!g01Var.I) {
                i15 = e7 + i29;
            } else {
                i15 = ((i18 - c10) - e11) - i29;
            }
            int i30 = i15;
            int i31 = i23 + b11 + a12 + e10;
            if (d.f33686c != null) {
                if (c10 != d.f33692k || c11 != d.f33693l) {
                    d.d(c10, c11, false);
                }
                int i32 = d.f33694m;
                if (i32 != 0 && i32 != c11) {
                    a01 a01Var3 = d.f33684a.f24789a.f25570b;
                    if (a01Var3.f24404b - a01Var3.f24403a <= 1) {
                        ArrayList arrayList2 = g01Var.K;
                        int size = arrayList2.size();
                        int i33 = 0;
                        while (true) {
                            if (i33 < size) {
                                PointF pointF = (PointF) arrayList2.get(i33);
                                float f11 = pointF.x;
                                float f12 = d.f33684a.f24789a.f25570b.f24403a;
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
            d.f33697p = i30;
            d.f33698q = i31;
            i19 = i20 + 1;
            wz0Var = wz0Var3;
            childCount2 = i21;
            wz0Var2 = wz0Var4;
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            zz0 zz0Var = (zz0) arrayList.get(i34);
            int i35 = zz0Var.f33693l;
            int i36 = zz0Var.d;
            int i37 = i35 - zz0Var.f33694m;
            ArrayList arrayList3 = g01Var.P;
            int size3 = arrayList3.size();
            for (int i38 = i36 + 1; i38 < size3; i38++) {
                zz0 zz0Var2 = (zz0) arrayList3.get(i38);
                if (zz0Var.f33684a.f24789a.f25570b.f24403a != zz0Var2.f33684a.f24789a.f25570b.f24403a) {
                    break;
                }
                int i39 = zz0Var.f33694m;
                int i40 = zz0Var2.f33694m;
                if (i39 < i40) {
                    z10 = true;
                    break;
                }
                int i41 = zz0Var2.f33693l - i40;
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
                    zz0 zz0Var3 = (zz0) arrayList3.get(i42);
                    if (zz0Var.f33684a.f24789a.f25570b.f24403a != zz0Var3.f33684a.f24789a.f25570b.f24403a) {
                        break;
                    }
                    int i43 = zz0Var.f33694m;
                    int i44 = zz0Var3.f33694m;
                    if (i43 < i44) {
                        z10 = true;
                        break;
                    }
                    int i45 = zz0Var3.f33693l - i44;
                    if (i45 > 0) {
                        i37 = Math.min(i37, i45);
                    }
                    i42--;
                }
            }
            if (!z10) {
                zz0Var.f33693l = zz0Var.f33694m;
                zz0Var.g();
                max -= i37;
                int i46 = zz0Var.f33684a.f24789a.f25570b.f24403a;
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
                    zz0 zz0Var4 = (zz0) arrayList3.get(i49);
                    if (zz0Var == zz0Var4) {
                        i14 = i49;
                    } else {
                        int i50 = zz0Var.f33684a.f24789a.f25570b.f24403a;
                        int i51 = zz0Var4.f33684a.f24789a.f25570b.f24403a;
                        if (i50 == i51) {
                            if (zz0Var4.f33694m != zz0Var4.f33693l) {
                                arrayList.remove(zz0Var4);
                                if (zz0Var4.d < i36) {
                                    i48--;
                                }
                                i47--;
                            }
                            int i52 = zz0Var4.f33693l - i37;
                            zz0Var4.f33693l = i52;
                            i14 = i49;
                            zz0Var4.d(zz0Var4.f33692k, i52, true);
                        } else {
                            i14 = i49;
                            if (i50 < i51) {
                                zz0Var4.f33698q -= i37;
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
        int childCount3 = g01Var.getChildCount();
        for (int i53 = 0; i53 < childCount3; i53++) {
            zz0 d10 = g01Var.d(i53);
            g01Var.O.onLayoutChild(d10.f33685b, d10.b(), d10.c());
            d10.f33695n = d10.f33697p;
            d10.f33696o = d10.f33692k;
        }
        g01Var.f26666y = i18;
        g01Var.E = max;
        g01Var.F = copyOf;
        g01Var.setMeasuredDimension(i18, max);
    }

    @Override
    public final void requestLayout() {
        wz0 wz0Var;
        super.requestLayout();
        wz0 wz0Var2 = this.f26658c;
        if (wz0Var2 != null && (wz0Var = this.d) != null) {
            wz0Var2.l();
            wz0Var.l();
        }
    }

    public void setAlignmentMode(int i10) {
        this.h = i10;
        requestLayout();
    }

    public void setColumnCount(int i10) {
        this.f26658c.n(i10);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        wz0 wz0Var = this.f26658c;
        wz0Var.f32771u = z10;
        wz0Var.k();
        h();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.G = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.f26665x == z10) {
            return;
        }
        this.f26665x = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i10) {
        this.f26664w = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        if (this.f26659e != i10) {
            this.f26659e = i10;
            h();
            requestLayout();
        }
    }

    public void setRenderWidth(int i10) {
        int i11;
        int i12;
        int measuredWidth = getMeasuredWidth();
        this.f26666y = Math.max(measuredWidth, i10);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            zz0 d = d(i13);
            if (measuredWidth > 0 && (i12 = this.f26666y) != measuredWidth) {
                float f7 = measuredWidth;
                int round = Math.round((d.f33695n * i12) / f7);
                int round2 = Math.round(((d.f33695n + d.f33696o) * this.f26666y) / f7);
                d.f33697p = round;
                d.f33692k = Math.max(0, round2 - round);
                if (d.f33686c != null && d.f33685b != null) {
                    d.f();
                }
            } else {
                int i14 = d.f33695n;
                d.f33697p = i14;
                d.f33692k = Math.max(0, (d.f33696o + i14) - i14);
                if (d.f33686c != null && d.f33685b != null) {
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
                zz0 d10 = d(i18);
                yz0 yz0Var = d10.f33685b;
                if (yz0Var != null) {
                    i11 = yz0Var.getEmojiOnlyCount();
                } else {
                    i11 = 0;
                }
                if (i11 > 0) {
                    a01 a01Var = d10.f33684a.f24789a.f25570b;
                    int max = Math.max(0, a01Var.f24403a);
                    int min = Math.min(i15, a01Var.f24404b);
                    if (max < min) {
                        int i19 = 0;
                        for (int i20 = max; i20 < min; i20++) {
                            i19 += iArr2[i20];
                        }
                        int max2 = Math.max(1, Math.round(d10.f33692k / i11)) - i19;
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
                zz0 d11 = d(i25);
                a01 a01Var2 = d11.f33684a.f24789a.f25570b;
                int max3 = Math.max(0, Math.min(i15, a01Var2.f24403a));
                int max4 = Math.max(max3, Math.min(i15, a01Var2.f24404b));
                int i26 = iArr4[max3];
                int i27 = iArr4[max4];
                d11.f33698q = i26;
                d11.f33693l = Math.max(0, i27 - i26);
                if (d11.f33686c != null) {
                    d11.g();
                }
                this.O.onLayoutChild(d11.f33685b, d11.b(), d11.c());
            }
        }
        invalidate();
    }

    public void setRowCount(int i10) {
        this.d.n(i10);
        h();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z10) {
        wz0 wz0Var = this.d;
        wz0Var.f32771u = z10;
        wz0Var.k();
        h();
        requestLayout();
    }

    public void setRtl(boolean z10) {
        this.I = z10;
    }

    public void setStriped(boolean z10) {
        this.H = z10;
    }

    public void setUseDefaultMargins(boolean z10) {
        this.f26660f = z10;
        requestLayout();
    }
}
