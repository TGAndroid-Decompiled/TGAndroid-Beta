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
public final class f01 extends View {
    public static final rz0 R = new rz0(0);
    public static final rz0 S = new rz0(1);
    public static final rz0 T = new rz0(3);
    public static final rz0 U = new rz0(4);
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
    public final e01 O;
    public final ArrayList P;
    public final d01 Q;
    public final org.telegram.ui.Cells.q9 f26196a;
    public int f26197b;
    public final vz0 f26198c;
    public final vz0 d;
    public int f26199e;
    public boolean f26200f;
    public int h;
    public int f26201n;
    public int f26202r;
    public int f26203s;
    public int v;
    public int f26204w;
    public boolean f26205x;
    public int f26206y;

    public f01(Context context, e01 e01Var, org.telegram.ui.Cells.q9 q9Var) {
        super(context);
        this.f26198c = new vz0(this, true);
        this.d = new vz0(this, false);
        this.f26199e = 0;
        this.f26200f = false;
        this.h = 1;
        this.f26201n = 0;
        this.f26202r = AndroidUtilities.dp(8.0f);
        this.f26203s = AndroidUtilities.dp(9.0f);
        this.v = AndroidUtilities.dp(12.0f);
        this.f26205x = true;
        this.F = new int[0];
        this.J = new ArrayList();
        this.K = new ArrayList();
        new Path();
        this.L = new Path();
        this.M = new RectF();
        this.N = new float[8];
        this.P = new ArrayList();
        this.f26196a = q9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.O = e01Var;
        d01 d01Var = new d01(this, this);
        this.Q = d01Var;
        r0.i0.k(this, d01Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(sa.e.v(str, ". "));
    }

    public static void j(a01 a01Var, int i10, int i11, int i12, int i13) {
        zz0 zz0Var = new zz0(i10, i11 + i10);
        c01 c01Var = a01Var.f24400a;
        a01Var.f24400a = new c01(c01Var.f25159a, zz0Var, c01Var.f25161c, c01Var.d);
        zz0 zz0Var2 = new zz0(i12, i13 + i12);
        c01 c01Var2 = a01Var.f24401b;
        a01Var.f24401b = new c01(c01Var2.f25159a, zz0Var2, c01Var2.f25161c, c01Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        yz0 yz0Var = new yz0(this, arrayList.size());
        a01 a01Var = new a01();
        zz0 zz0Var = new zz0(i11, i13 + i11);
        rz0 rz0Var = U;
        a01Var.f24400a = new c01(false, zz0Var, rz0Var, 0.0f);
        a01Var.f24401b = new c01(false, new zz0(i10, i12 + i10), rz0Var, 0.0f);
        yz0Var.f33312a = a01Var;
        yz0Var.f33319j = i11;
        arrayList.add(yz0Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        yz0 yz0Var = new yz0(this, arrayList.size());
        yz0Var.f33314c = pagetablecell;
        a01 a01Var = new a01();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        zz0 zz0Var = new zz0(i11, i13 + i11);
        rz0 rz0Var = U;
        a01Var.f24400a = new c01(false, zz0Var, rz0Var, 0.0f);
        a01Var.f24401b = new c01(false, new zz0(i10, i12 + i10), rz0Var, 1.0f);
        yz0Var.f33312a = a01Var;
        yz0Var.f33319j = i11;
        arrayList.add(yz0Var);
        int i14 = pagetablecell.rowspan;
        if (i14 > 1) {
            this.K.add(new PointF(i11, i11 + i14));
        }
        h();
    }

    public final void c() {
        boolean z10;
        vz0 vz0Var;
        c01 c01Var;
        c01 c01Var2;
        Throwable th2;
        int i10;
        int i11 = this.f26201n;
        if (i11 == 0) {
            if (this.f26199e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                vz0Var = this.f26198c;
            } else {
                vz0Var = this.d;
            }
            int i12 = vz0Var.f32385b;
            if (i12 == Integer.MIN_VALUE) {
                i12 = 0;
            }
            if (i12 >= 0 && i12 <= 1024) {
                int[] iArr = new int[i12];
                int childCount = getChildCount();
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    a01 a01Var = d(i15).f33312a;
                    if (z10) {
                        c01Var = a01Var.f24400a;
                    } else {
                        c01Var = a01Var.f24401b;
                    }
                    zz0 zz0Var = c01Var.f25160b;
                    boolean z11 = c01Var.f25159a;
                    int a2 = zz0Var.a();
                    if (a2 > 0 && a2 <= 1024) {
                        if (z11) {
                            i13 = zz0Var.f33686a;
                        }
                        if (z10) {
                            c01Var2 = a01Var.f24401b;
                        } else {
                            c01Var2 = a01Var.f24400a;
                        }
                        zz0 zz0Var2 = c01Var2.f25160b;
                        int a10 = zz0Var2.a();
                        int i16 = zz0Var2.f33686a;
                        if (a10 > 0) {
                            th2 = null;
                            if (zz0Var2.a() <= 1024) {
                                boolean z12 = c01Var2.f25159a;
                                int a11 = zz0Var2.a();
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
                                    j(a01Var, i13, a2, i14, a11);
                                } else {
                                    j(a01Var, i14, a11, i13, a2);
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
                    i19 = (i19 * 31) + d(i20).f33312a.hashCode();
                }
                this.f26201n = i19;
                return;
            }
            g("Table grid count out of bounds");
            throw null;
        }
        int childCount3 = getChildCount();
        int i21 = 1;
        for (int i22 = 0; i22 < childCount3; i22++) {
            i21 = (i21 * 31) + d(i22).f33312a.hashCode();
        }
        if (i11 != i21) {
            h();
            c();
        }
    }

    public final yz0 d(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                return (yz0) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        d01 d01Var = this.Q;
        if (d01Var != null && d01Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(yz0 yz0Var, boolean z10, boolean z11) {
        vz0 vz0Var;
        int[] iArr;
        c01 c01Var;
        int i10;
        if (this.h == 1) {
            return f(yz0Var, z10, z11);
        }
        if (z10) {
            vz0Var = this.f26198c;
        } else {
            vz0Var = this.d;
        }
        if (z11) {
            if (vz0Var.f32391j == null) {
                vz0Var.f32391j = new int[vz0Var.e() + 1];
            }
            if (!vz0Var.f32392k) {
                vz0Var.b(true);
                vz0Var.f32392k = true;
            }
            iArr = vz0Var.f32391j;
        } else {
            if (vz0Var.f32393l == null) {
                vz0Var.f32393l = new int[vz0Var.e() + 1];
            }
            if (!vz0Var.f32394m) {
                vz0Var.b(false);
                vz0Var.f32394m = true;
            }
            iArr = vz0Var.f32393l;
        }
        a01 a01Var = yz0Var.f33312a;
        if (z10) {
            c01Var = a01Var.f24401b;
        } else {
            c01Var = a01Var.f24400a;
        }
        zz0 zz0Var = c01Var.f25160b;
        if (z11) {
            i10 = zz0Var.f33686a;
        } else {
            i10 = zz0Var.f33687b;
        }
        return iArr[i10];
    }

    public final int f(yz0 yz0Var, boolean z10, boolean z11) {
        int i10;
        c01 c01Var;
        vz0 vz0Var;
        boolean z12;
        a01 a01Var = yz0Var.f33312a;
        if (z10) {
            if (z11) {
                i10 = ((ViewGroup.MarginLayoutParams) a01Var).leftMargin;
            } else {
                i10 = ((ViewGroup.MarginLayoutParams) a01Var).rightMargin;
            }
        } else if (z11) {
            i10 = ((ViewGroup.MarginLayoutParams) a01Var).topMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) a01Var).bottomMargin;
        }
        if (i10 == Integer.MIN_VALUE) {
            if (!this.f26200f) {
                return 0;
            }
            if (z10) {
                c01Var = a01Var.f24401b;
            } else {
                c01Var = a01Var.f24400a;
            }
            if (z10) {
                vz0Var = this.f26198c;
            } else {
                vz0Var = this.d;
            }
            zz0 zz0Var = c01Var.f25160b;
            if (z10 && this.I) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != z11) {
                int i11 = zz0Var.f33686a;
                return 0;
            }
            int i12 = zz0Var.f33687b;
            vz0Var.e();
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
        return this.f26198c.e();
    }

    public int getOrientation() {
        return this.f26199e;
    }

    public int getRenderHeight() {
        return this.E;
    }

    public int getRowCount() {
        return this.d.e();
    }

    public boolean getUseDefaultMargins() {
        return this.f26200f;
    }

    public final void h() {
        this.f26201n = 0;
        vz0 vz0Var = this.f26198c;
        vz0Var.k();
        vz0 vz0Var2 = this.d;
        vz0Var2.k();
        if (vz0Var != null && vz0Var2 != null) {
            vz0Var.l();
            vz0Var2.l();
        }
    }

    public final void i(int i10, boolean z10) {
        boolean z11;
        c01 c01Var;
        vz0 vz0Var;
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            yz0 d = d(i14);
            a01 a01Var = d.f33312a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                if (this.f26197b == 2) {
                    i12 = ((int) (size / 2.0f)) - (this.v * 4);
                } else {
                    i12 = (int) (size / 1.5f);
                }
                d.e(this.O.createTextLayout(d.f33314c, i12));
                if (d.f33313b != null) {
                    ((ViewGroup.MarginLayoutParams) a01Var).height = Math.max(this.f26204w, d.f33316f + this.f26202r + this.f26203s);
                    int emojiOnlyCount = d.f33313b.getEmojiOnlyCount();
                    if (emojiOnlyCount > 0) {
                        i13 = ((ViewGroup.MarginLayoutParams) a01Var).height * emojiOnlyCount;
                    } else {
                        i13 = (this.v * 2) + d.f33315e;
                    }
                    ((ViewGroup.MarginLayoutParams) a01Var).width = i13;
                } else {
                    ((ViewGroup.MarginLayoutParams) a01Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) a01Var).height = 0;
                }
                int i15 = ((ViewGroup.MarginLayoutParams) a01Var).width;
                int i16 = ((ViewGroup.MarginLayoutParams) a01Var).height;
                d.d(e(d, true, false) + e(d, true, true) + i15, e(d, false, false) + e(d, false, true) + i16, true);
            } else {
                if (this.f26199e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    c01Var = a01Var.f24401b;
                } else {
                    c01Var = a01Var.f24400a;
                }
                if (c01.a(c01Var, z11) == U) {
                    zz0 zz0Var = c01Var.f25160b;
                    if (z11) {
                        vz0Var = this.f26198c;
                    } else {
                        vz0Var = this.d;
                    }
                    int[] g10 = vz0Var.g();
                    int e7 = (g10[zz0Var.f33687b] - g10[zz0Var.f33686a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        xz0 xz0Var = d.f33313b;
                        if (xz0Var != null) {
                            i11 = xz0Var.getEmojiOnlyCount();
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            int max = Math.max(1, Math.round(e7 / i11));
                            ((ViewGroup.MarginLayoutParams) a01Var).height = max;
                            d.f33322m = max;
                        }
                        int i17 = ((ViewGroup.MarginLayoutParams) a01Var).height;
                        d.d(e(d, true, false) + e(d, true, true) + e7, e(d, false, false) + e(d, false, true) + i17, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) a01Var).width, e(d, false, false) + e(d, false, true) + e7, false);
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
        f01 f01Var = this;
        f01Var.c();
        vz0 vz0Var = f01Var.d;
        vz0 vz0Var2 = f01Var.f26198c;
        if (vz0Var2 != null && vz0Var != null) {
            vz0Var2.l();
            vz0Var.l();
        }
        f01Var.f26197b = 0;
        int childCount = f01Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            f01Var.f26197b = Math.max(f01Var.f26197b, f01Var.d(i16).f33312a.f24401b.f25160b.f33687b);
        }
        f01Var.i(i10, true);
        if (f01Var.f26199e == 0) {
            i12 = vz0Var2.i(i10);
            if (f01Var.f26205x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                vz0Var2.v.f24745a = i12;
                vz0Var2.f32403w.f24745a = -i12;
                vz0Var2.f32398q = false;
                vz0Var2.g();
            }
            f01Var.i(i10, false);
            i13 = vz0Var.i(i11);
        } else {
            int i17 = vz0Var.i(i11);
            f01Var.i(i10, false);
            i12 = vz0Var2.i(i10);
            i13 = i17;
        }
        int max = Math.max(i13, f01Var.getSuggestedMinimumHeight());
        f01Var.setMeasuredDimension(i12, max);
        vz0Var2.v.f24745a = i12;
        vz0Var2.f32403w.f24745a = -i12;
        vz0Var2.f32398q = false;
        vz0Var2.g();
        vz0Var.v.f24745a = max;
        vz0Var.f32403w.f24745a = -max;
        vz0Var.f32398q = false;
        vz0Var.g();
        int[] g10 = vz0Var2.g();
        int[] g11 = vz0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = f01Var.J;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = f01Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            yz0 d = f01Var.d(i20);
            a01 a01Var = d.f33312a;
            c01 c01Var = a01Var.f24401b;
            c01 c01Var2 = a01Var.f24400a;
            zz0 zz0Var = c01Var.f25160b;
            zz0 zz0Var2 = c01Var2.f25160b;
            int i21 = childCount2;
            int i22 = g10[zz0Var.f33686a];
            int i23 = g11[zz0Var2.f33686a];
            int i24 = g10[zz0Var.f33687b] - i22;
            int i25 = g11[zz0Var2.f33687b] - i23;
            int i26 = d.f33320k;
            vz0 vz0Var3 = vz0Var;
            int i27 = d.f33321l;
            rz0 a2 = c01.a(c01Var, true);
            rz0 a10 = c01.a(c01Var2, false);
            la.h f7 = vz0Var2.f();
            wz0 wz0Var = (wz0) ((Object[]) f7.d)[((int[]) f7.f15399b)[i20]];
            la.h f10 = vz0Var3.f();
            vz0 vz0Var4 = vz0Var2;
            wz0 wz0Var2 = (wz0) ((Object[]) f10.d)[((int[]) f10.f15399b)[i20]];
            int b10 = a2.b(d, i24 - wz0Var.d(true));
            int b11 = a10.b(d, i25 - wz0Var2.d(true));
            int e7 = f01Var.e(d, true, true);
            int e10 = f01Var.e(d, false, true);
            int e11 = f01Var.e(d, true, false);
            int i28 = e7 + e11;
            int e12 = e10 + f01Var.e(d, false, false);
            int a11 = wz0Var.a(f01Var, d, a2, i26 + i28, true);
            f01Var = this;
            int a12 = wz0Var2.a(f01Var, d, a10, i27 + e12, false);
            int c10 = a2.c(i26, i24 - i28);
            int c11 = a10.c(i27, i25 - e12);
            int i29 = i22 + b10 + a11;
            if (!f01Var.I) {
                i15 = e7 + i29;
            } else {
                i15 = ((i18 - c10) - e11) - i29;
            }
            int i30 = i15;
            int i31 = i23 + b11 + a12 + e10;
            if (d.f33314c != null) {
                if (c10 != d.f33320k || c11 != d.f33321l) {
                    d.d(c10, c11, false);
                }
                int i32 = d.f33322m;
                if (i32 != 0 && i32 != c11) {
                    zz0 zz0Var3 = d.f33312a.f24400a.f25160b;
                    if (zz0Var3.f33687b - zz0Var3.f33686a <= 1) {
                        ArrayList arrayList2 = f01Var.K;
                        int size = arrayList2.size();
                        int i33 = 0;
                        while (true) {
                            if (i33 < size) {
                                PointF pointF = (PointF) arrayList2.get(i33);
                                float f11 = pointF.x;
                                float f12 = d.f33312a.f24400a.f25160b.f33686a;
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
            d.f33325p = i30;
            d.f33326q = i31;
            i19 = i20 + 1;
            vz0Var = vz0Var3;
            childCount2 = i21;
            vz0Var2 = vz0Var4;
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            yz0 yz0Var = (yz0) arrayList.get(i34);
            int i35 = yz0Var.f33321l;
            int i36 = yz0Var.d;
            int i37 = i35 - yz0Var.f33322m;
            ArrayList arrayList3 = f01Var.P;
            int size3 = arrayList3.size();
            for (int i38 = i36 + 1; i38 < size3; i38++) {
                yz0 yz0Var2 = (yz0) arrayList3.get(i38);
                if (yz0Var.f33312a.f24400a.f25160b.f33686a != yz0Var2.f33312a.f24400a.f25160b.f33686a) {
                    break;
                }
                int i39 = yz0Var.f33322m;
                int i40 = yz0Var2.f33322m;
                if (i39 < i40) {
                    z10 = true;
                    break;
                }
                int i41 = yz0Var2.f33321l - i40;
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
                    yz0 yz0Var3 = (yz0) arrayList3.get(i42);
                    if (yz0Var.f33312a.f24400a.f25160b.f33686a != yz0Var3.f33312a.f24400a.f25160b.f33686a) {
                        break;
                    }
                    int i43 = yz0Var.f33322m;
                    int i44 = yz0Var3.f33322m;
                    if (i43 < i44) {
                        z10 = true;
                        break;
                    }
                    int i45 = yz0Var3.f33321l - i44;
                    if (i45 > 0) {
                        i37 = Math.min(i37, i45);
                    }
                    i42--;
                }
            }
            if (!z10) {
                yz0Var.f33321l = yz0Var.f33322m;
                yz0Var.g();
                max -= i37;
                int i46 = yz0Var.f33312a.f24400a.f25160b.f33686a;
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
                    yz0 yz0Var4 = (yz0) arrayList3.get(i49);
                    if (yz0Var == yz0Var4) {
                        i14 = i49;
                    } else {
                        int i50 = yz0Var.f33312a.f24400a.f25160b.f33686a;
                        int i51 = yz0Var4.f33312a.f24400a.f25160b.f33686a;
                        if (i50 == i51) {
                            if (yz0Var4.f33322m != yz0Var4.f33321l) {
                                arrayList.remove(yz0Var4);
                                if (yz0Var4.d < i36) {
                                    i48--;
                                }
                                i47--;
                            }
                            int i52 = yz0Var4.f33321l - i37;
                            yz0Var4.f33321l = i52;
                            i14 = i49;
                            yz0Var4.d(yz0Var4.f33320k, i52, true);
                        } else {
                            i14 = i49;
                            if (i50 < i51) {
                                yz0Var4.f33326q -= i37;
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
        int childCount3 = f01Var.getChildCount();
        for (int i53 = 0; i53 < childCount3; i53++) {
            yz0 d10 = f01Var.d(i53);
            f01Var.O.onLayoutChild(d10.f33313b, d10.b(), d10.c());
            d10.f33323n = d10.f33325p;
            d10.f33324o = d10.f33320k;
        }
        f01Var.f26206y = i18;
        f01Var.E = max;
        f01Var.F = copyOf;
        f01Var.setMeasuredDimension(i18, max);
    }

    @Override
    public final void requestLayout() {
        vz0 vz0Var;
        super.requestLayout();
        vz0 vz0Var2 = this.f26198c;
        if (vz0Var2 != null && (vz0Var = this.d) != null) {
            vz0Var2.l();
            vz0Var.l();
        }
    }

    public void setAlignmentMode(int i10) {
        this.h = i10;
        requestLayout();
    }

    public void setColumnCount(int i10) {
        this.f26198c.n(i10);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        vz0 vz0Var = this.f26198c;
        vz0Var.f32402u = z10;
        vz0Var.k();
        h();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.G = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.f26205x == z10) {
            return;
        }
        this.f26205x = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i10) {
        this.f26204w = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        if (this.f26199e != i10) {
            this.f26199e = i10;
            h();
            requestLayout();
        }
    }

    public void setRenderWidth(int i10) {
        int i11;
        int i12;
        int measuredWidth = getMeasuredWidth();
        this.f26206y = Math.max(measuredWidth, i10);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            yz0 d = d(i13);
            if (measuredWidth > 0 && (i12 = this.f26206y) != measuredWidth) {
                float f7 = measuredWidth;
                int round = Math.round((d.f33323n * i12) / f7);
                int round2 = Math.round(((d.f33323n + d.f33324o) * this.f26206y) / f7);
                d.f33325p = round;
                d.f33320k = Math.max(0, round2 - round);
                if (d.f33314c != null && d.f33313b != null) {
                    d.f();
                }
            } else {
                int i14 = d.f33323n;
                d.f33325p = i14;
                d.f33320k = Math.max(0, (d.f33324o + i14) - i14);
                if (d.f33314c != null && d.f33313b != null) {
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
                yz0 d10 = d(i18);
                xz0 xz0Var = d10.f33313b;
                if (xz0Var != null) {
                    i11 = xz0Var.getEmojiOnlyCount();
                } else {
                    i11 = 0;
                }
                if (i11 > 0) {
                    zz0 zz0Var = d10.f33312a.f24400a.f25160b;
                    int max = Math.max(0, zz0Var.f33686a);
                    int min = Math.min(i15, zz0Var.f33687b);
                    if (max < min) {
                        int i19 = 0;
                        for (int i20 = max; i20 < min; i20++) {
                            i19 += iArr2[i20];
                        }
                        int max2 = Math.max(1, Math.round(d10.f33320k / i11)) - i19;
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
                yz0 d11 = d(i25);
                zz0 zz0Var2 = d11.f33312a.f24400a.f25160b;
                int max3 = Math.max(0, Math.min(i15, zz0Var2.f33686a));
                int max4 = Math.max(max3, Math.min(i15, zz0Var2.f33687b));
                int i26 = iArr4[max3];
                int i27 = iArr4[max4];
                d11.f33326q = i26;
                d11.f33321l = Math.max(0, i27 - i26);
                if (d11.f33314c != null) {
                    d11.g();
                }
                this.O.onLayoutChild(d11.f33313b, d11.b(), d11.c());
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
        vz0 vz0Var = this.d;
        vz0Var.f32402u = z10;
        vz0Var.k();
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
        this.f26200f = z10;
        requestLayout();
    }
}
