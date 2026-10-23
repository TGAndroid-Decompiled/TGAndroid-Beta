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
    public final org.telegram.ui.Cells.n9 f26009a;
    public int f26010b;
    public final vz0 f26011c;
    public final vz0 d;
    public int e;
    public boolean f26012f;
    public int h;
    public int f26013n;
    public int f26014r;
    public int f26015s;
    public int v;
    public int f26016w;
    public boolean f26017x;
    public int f26018y;

    public f01(Context context, e01 e01Var, org.telegram.ui.Cells.n9 n9Var) {
        super(context);
        this.f26011c = new vz0(this, true);
        this.d = new vz0(this, false);
        this.e = 0;
        this.f26012f = false;
        this.h = 1;
        this.f26013n = 0;
        this.f26014r = AndroidUtilities.dp(8.0f);
        this.f26015s = AndroidUtilities.dp(9.0f);
        this.v = AndroidUtilities.dp(12.0f);
        this.f26017x = true;
        this.F = new int[0];
        this.J = new ArrayList();
        this.K = new ArrayList();
        new Path();
        this.L = new Path();
        this.M = new RectF();
        this.N = new float[8];
        this.P = new ArrayList();
        this.f26009a = n9Var;
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
        r0.i0.j(this, d01Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(r4.c.u(str, ". "));
    }

    public static void j(a01 a01Var, int i10, int i11, int i12, int i13) {
        zz0 zz0Var = new zz0(i10, i11 + i10);
        c01 c01Var = a01Var.f24434a;
        a01Var.f24434a = new c01(c01Var.f25084a, zz0Var, c01Var.f25086c, c01Var.d);
        zz0 zz0Var2 = new zz0(i12, i13 + i12);
        c01 c01Var2 = a01Var.f24435b;
        a01Var.f24435b = new c01(c01Var2.f25084a, zz0Var2, c01Var2.f25086c, c01Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        yz0 yz0Var = new yz0(this, arrayList.size());
        a01 a01Var = new a01();
        zz0 zz0Var = new zz0(i11, i13 + i11);
        rz0 rz0Var = U;
        a01Var.f24434a = new c01(false, zz0Var, rz0Var, 0.0f);
        a01Var.f24435b = new c01(false, new zz0(i10, i12 + i10), rz0Var, 0.0f);
        yz0Var.f32773a = a01Var;
        yz0Var.f32779j = i11;
        arrayList.add(yz0Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        int i13;
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        yz0 yz0Var = new yz0(this, arrayList.size());
        yz0Var.f32775c = pagetablecell;
        a01 a01Var = new a01();
        int i14 = pagetablecell.rowspan;
        if (i14 == 0) {
            i14 = 1;
        }
        zz0 zz0Var = new zz0(i11, i14 + i11);
        rz0 rz0Var = U;
        a01Var.f24434a = new c01(false, zz0Var, rz0Var, 0.0f);
        a01Var.f24435b = new c01(false, new zz0(i10, i12 + i10), rz0Var, 1.0f);
        yz0Var.f32773a = a01Var;
        yz0Var.f32779j = i11;
        arrayList.add(yz0Var);
        if (pagetablecell.rowspan > 1) {
            this.K.add(new PointF(i11, i11 + i13));
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
        int i11 = this.f26013n;
        if (i11 == 0) {
            if (this.e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                vz0Var = this.f26011c;
            } else {
                vz0Var = this.d;
            }
            int i12 = vz0Var.f31901b;
            if (i12 == Integer.MIN_VALUE) {
                i12 = 0;
            }
            if (i12 >= 0 && i12 <= 1024) {
                int[] iArr = new int[i12];
                int childCount = getChildCount();
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    a01 a01Var = d(i15).f32773a;
                    if (z10) {
                        c01Var = a01Var.f24434a;
                    } else {
                        c01Var = a01Var.f24435b;
                    }
                    zz0 zz0Var = c01Var.f25085b;
                    boolean z11 = c01Var.f25084a;
                    int a2 = zz0Var.a();
                    if (a2 > 0 && a2 <= 1024) {
                        if (z11) {
                            i13 = zz0Var.f33078a;
                        }
                        if (z10) {
                            c01Var2 = a01Var.f24435b;
                        } else {
                            c01Var2 = a01Var.f24434a;
                        }
                        zz0 zz0Var2 = c01Var2.f25085b;
                        int a10 = zz0Var2.a();
                        int i16 = zz0Var2.f33078a;
                        if (a10 > 0) {
                            th2 = null;
                            if (zz0Var2.a() <= 1024) {
                                boolean z12 = c01Var2.f25084a;
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
                    i19 = (i19 * 31) + d(i20).f32773a.hashCode();
                }
                this.f26013n = i19;
                return;
            }
            g("Table grid count out of bounds");
            throw null;
        }
        int childCount3 = getChildCount();
        int i21 = 1;
        for (int i22 = 0; i22 < childCount3; i22++) {
            i21 = (i21 * 31) + d(i22).f32773a.hashCode();
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
            vz0Var = this.f26011c;
        } else {
            vz0Var = this.d;
        }
        if (z11) {
            if (vz0Var.f31906j == null) {
                vz0Var.f31906j = new int[vz0Var.e() + 1];
            }
            if (!vz0Var.f31907k) {
                vz0Var.b(true);
                vz0Var.f31907k = true;
            }
            iArr = vz0Var.f31906j;
        } else {
            if (vz0Var.f31908l == null) {
                vz0Var.f31908l = new int[vz0Var.e() + 1];
            }
            if (!vz0Var.f31909m) {
                vz0Var.b(false);
                vz0Var.f31909m = true;
            }
            iArr = vz0Var.f31908l;
        }
        a01 a01Var = yz0Var.f32773a;
        if (z10) {
            c01Var = a01Var.f24435b;
        } else {
            c01Var = a01Var.f24434a;
        }
        zz0 zz0Var = c01Var.f25085b;
        if (z11) {
            i10 = zz0Var.f33078a;
        } else {
            i10 = zz0Var.f33079b;
        }
        return iArr[i10];
    }

    public final int f(yz0 yz0Var, boolean z10, boolean z11) {
        int i10;
        c01 c01Var;
        vz0 vz0Var;
        boolean z12;
        a01 a01Var = yz0Var.f32773a;
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
            if (!this.f26012f) {
                return 0;
            }
            if (z10) {
                c01Var = a01Var.f24435b;
            } else {
                c01Var = a01Var.f24434a;
            }
            if (z10) {
                vz0Var = this.f26011c;
            } else {
                vz0Var = this.d;
            }
            zz0 zz0Var = c01Var.f25085b;
            if (z10 && this.I) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != z11) {
                int i11 = zz0Var.f33078a;
                return 0;
            }
            int i12 = zz0Var.f33079b;
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
        return this.f26011c.e();
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
        return this.f26012f;
    }

    public final void h() {
        this.f26013n = 0;
        vz0 vz0Var = this.f26011c;
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
            a01 a01Var = d.f32773a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                if (this.f26010b == 2) {
                    i12 = ((int) (size / 2.0f)) - (this.v * 4);
                } else {
                    i12 = (int) (size / 1.5f);
                }
                d.e(this.O.createTextLayout(d.f32775c, i12));
                if (d.f32774b != null) {
                    ((ViewGroup.MarginLayoutParams) a01Var).height = Math.max(this.f26016w, d.f32776f + this.f26014r + this.f26015s);
                    int emojiOnlyCount = d.f32774b.getEmojiOnlyCount();
                    if (emojiOnlyCount > 0) {
                        i13 = ((ViewGroup.MarginLayoutParams) a01Var).height * emojiOnlyCount;
                    } else {
                        i13 = (this.v * 2) + d.e;
                    }
                    ((ViewGroup.MarginLayoutParams) a01Var).width = i13;
                } else {
                    ((ViewGroup.MarginLayoutParams) a01Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) a01Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) a01Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) a01Var).height, true);
            } else {
                if (this.e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    c01Var = a01Var.f24435b;
                } else {
                    c01Var = a01Var.f24434a;
                }
                if (c01.a(c01Var, z11) == U) {
                    zz0 zz0Var = c01Var.f25085b;
                    if (z11) {
                        vz0Var = this.f26011c;
                    } else {
                        vz0Var = this.d;
                    }
                    int[] g10 = vz0Var.g();
                    int e = (g10[zz0Var.f33079b] - g10[zz0Var.f33078a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        xz0 xz0Var = d.f32774b;
                        if (xz0Var != null) {
                            i11 = xz0Var.getEmojiOnlyCount();
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            int max = Math.max(1, Math.round(e / i11));
                            ((ViewGroup.MarginLayoutParams) a01Var).height = max;
                            d.f32782m = max;
                        }
                        d.d(e(d, true, false) + e(d, true, true) + e, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) a01Var).height, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) a01Var).width, e(d, false, false) + e(d, false, true) + e, false);
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
        int i16;
        f01 f01Var = this;
        f01Var.c();
        vz0 vz0Var = f01Var.d;
        vz0 vz0Var2 = f01Var.f26011c;
        if (vz0Var2 != null && vz0Var != null) {
            vz0Var2.l();
            vz0Var.l();
        }
        f01Var.f26010b = 0;
        int childCount = f01Var.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            f01Var.f26010b = Math.max(f01Var.f26010b, f01Var.d(i17).f32773a.f24435b.f25085b.f33079b);
        }
        f01Var.i(i10, true);
        if (f01Var.e == 0) {
            i12 = vz0Var2.i(i10);
            if (f01Var.f26017x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                vz0Var2.v.f24768a = i12;
                vz0Var2.f31918w.f24768a = -i12;
                vz0Var2.f31913q = false;
                vz0Var2.g();
            }
            f01Var.i(i10, false);
            i13 = vz0Var.i(i11);
        } else {
            int i18 = vz0Var.i(i11);
            f01Var.i(i10, false);
            i12 = vz0Var2.i(i10);
            i13 = i18;
        }
        int max = Math.max(i13, f01Var.getSuggestedMinimumHeight());
        f01Var.setMeasuredDimension(i12, max);
        vz0Var2.v.f24768a = i12;
        vz0Var2.f31918w.f24768a = -i12;
        vz0Var2.f31913q = false;
        vz0Var2.g();
        vz0Var.v.f24768a = max;
        vz0Var.f31918w.f24768a = -max;
        vz0Var.f31913q = false;
        vz0Var.g();
        int[] g10 = vz0Var2.g();
        int[] g11 = vz0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = f01Var.J;
        arrayList.clear();
        int i19 = g10[g10.length - 1];
        int childCount2 = f01Var.getChildCount();
        int i20 = 0;
        while (i20 < childCount2) {
            int i21 = i20;
            yz0 d = f01Var.d(i21);
            a01 a01Var = d.f32773a;
            c01 c01Var = a01Var.f24435b;
            c01 c01Var2 = a01Var.f24434a;
            zz0 zz0Var = c01Var.f25085b;
            zz0 zz0Var2 = c01Var2.f25085b;
            int i22 = childCount2;
            int i23 = g10[zz0Var.f33078a];
            int i24 = g11[zz0Var2.f33078a];
            int i25 = g10[zz0Var.f33079b] - i23;
            int i26 = g11[zz0Var2.f33079b] - i24;
            int i27 = d.f32780k;
            vz0 vz0Var3 = vz0Var;
            int i28 = d.f32781l;
            rz0 a2 = c01.a(c01Var, true);
            rz0 a10 = c01.a(c01Var2, false);
            m.g3 f7 = vz0Var2.f();
            wz0 wz0Var = (wz0) ((Object[]) f7.d)[((int[]) f7.f16202b)[i21]];
            m.g3 f10 = vz0Var3.f();
            vz0 vz0Var4 = vz0Var2;
            wz0 wz0Var2 = (wz0) ((Object[]) f10.d)[((int[]) f10.f16202b)[i21]];
            int b10 = a2.b(d, i25 - wz0Var.d(true));
            int b11 = a10.b(d, i26 - wz0Var2.d(true));
            int e = f01Var.e(d, true, true);
            int e7 = f01Var.e(d, false, true);
            int e10 = f01Var.e(d, true, false);
            int i29 = e + e10;
            int e11 = e7 + f01Var.e(d, false, false);
            int a11 = wz0Var.a(f01Var, d, a2, i27 + i29, true);
            f01Var = this;
            int a12 = wz0Var2.a(f01Var, d, a10, i28 + e11, false);
            int c10 = a2.c(i27, i25 - i29);
            int c11 = a10.c(i28, i26 - e11);
            int i30 = i23 + b10 + a11;
            if (!f01Var.I) {
                i15 = e + i30;
            } else {
                i15 = ((i19 - c10) - e10) - i30;
            }
            int i31 = i15;
            int i32 = i24 + b11 + a12 + e7;
            if (d.f32775c != null) {
                if (c10 != d.f32780k || c11 != d.f32781l) {
                    i16 = 0;
                    d.d(c10, c11, false);
                } else {
                    i16 = 0;
                }
                int i33 = d.f32782m;
                if (i33 != 0 && i33 != c11) {
                    zz0 zz0Var3 = d.f32773a.f24434a.f25085b;
                    if (zz0Var3.f33079b - zz0Var3.f33078a <= 1) {
                        ArrayList arrayList2 = f01Var.K;
                        int size = arrayList2.size();
                        int i34 = i16;
                        while (true) {
                            if (i34 < size) {
                                PointF pointF = (PointF) arrayList2.get(i34);
                                float f11 = pointF.x;
                                float f12 = d.f32773a.f24434a.f25085b.f33078a;
                                if (f11 > f12 || pointF.y <= f12) {
                                    i34++;
                                }
                            } else {
                                arrayList.add(d);
                                break;
                            }
                        }
                    }
                }
            }
            d.f32785p = i31;
            d.f32786q = i32;
            i20 = i21 + 1;
            vz0Var = vz0Var3;
            childCount2 = i22;
            vz0Var2 = vz0Var4;
        }
        int size2 = arrayList.size();
        int i35 = 0;
        while (i35 < size2) {
            yz0 yz0Var = (yz0) arrayList.get(i35);
            int i36 = yz0Var.f32781l;
            int i37 = yz0Var.d;
            int i38 = i36 - yz0Var.f32782m;
            ArrayList arrayList3 = f01Var.P;
            int size3 = arrayList3.size();
            for (int i39 = i37 + 1; i39 < size3; i39++) {
                yz0 yz0Var2 = (yz0) arrayList3.get(i39);
                if (yz0Var.f32773a.f24434a.f25085b.f33078a != yz0Var2.f32773a.f24434a.f25085b.f33078a) {
                    break;
                }
                int i40 = yz0Var.f32782m;
                int i41 = yz0Var2.f32782m;
                if (i40 < i41) {
                    z10 = true;
                    break;
                }
                int i42 = yz0Var2.f32781l - i41;
                if (i42 > 0) {
                    i38 = Math.min(i38, i42);
                }
            }
            z10 = false;
            if (!z10) {
                int i43 = i37 - 1;
                while (true) {
                    if (i43 < 0) {
                        break;
                    }
                    yz0 yz0Var3 = (yz0) arrayList3.get(i43);
                    if (yz0Var.f32773a.f24434a.f25085b.f33078a != yz0Var3.f32773a.f24434a.f25085b.f33078a) {
                        break;
                    }
                    int i44 = yz0Var.f32782m;
                    int i45 = yz0Var3.f32782m;
                    if (i44 < i45) {
                        z10 = true;
                        break;
                    }
                    int i46 = yz0Var3.f32781l - i45;
                    if (i46 > 0) {
                        i38 = Math.min(i38, i46);
                    }
                    i43--;
                }
            }
            if (!z10) {
                yz0Var.f32781l = yz0Var.f32782m;
                yz0Var.g();
                max -= i38;
                int i47 = yz0Var.f32773a.f24434a.f25085b.f33078a;
                while (true) {
                    i47++;
                    if (i47 >= copyOf.length) {
                        break;
                    }
                    copyOf[i47] = copyOf[i47] - i38;
                }
                int size4 = arrayList3.size();
                int i48 = size2;
                int i49 = i35;
                int i50 = 0;
                while (i50 < size4) {
                    yz0 yz0Var4 = (yz0) arrayList3.get(i50);
                    if (yz0Var == yz0Var4) {
                        i14 = i50;
                    } else {
                        int i51 = yz0Var.f32773a.f24434a.f25085b.f33078a;
                        int i52 = yz0Var4.f32773a.f24434a.f25085b.f33078a;
                        if (i51 == i52) {
                            if (yz0Var4.f32782m != yz0Var4.f32781l) {
                                arrayList.remove(yz0Var4);
                                if (yz0Var4.d < i37) {
                                    i49--;
                                }
                                i48--;
                            }
                            int i53 = yz0Var4.f32781l - i38;
                            yz0Var4.f32781l = i53;
                            i14 = i50;
                            yz0Var4.d(yz0Var4.f32780k, i53, true);
                        } else {
                            i14 = i50;
                            if (i51 < i52) {
                                yz0Var4.f32786q -= i38;
                            }
                        }
                    }
                    i50 = i14 + 1;
                }
                i35 = i49;
                size2 = i48;
            }
            i35++;
        }
        int childCount3 = f01Var.getChildCount();
        for (int i54 = 0; i54 < childCount3; i54++) {
            yz0 d10 = f01Var.d(i54);
            f01Var.O.onLayoutChild(d10.f32774b, d10.b(), d10.c());
            d10.f32783n = d10.f32785p;
            d10.f32784o = d10.f32780k;
        }
        f01Var.f26018y = i19;
        f01Var.E = max;
        f01Var.F = copyOf;
        f01Var.setMeasuredDimension(i19, max);
    }

    @Override
    public final void requestLayout() {
        vz0 vz0Var;
        super.requestLayout();
        vz0 vz0Var2 = this.f26011c;
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
        this.f26011c.n(i10);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        vz0 vz0Var = this.f26011c;
        vz0Var.f31917u = z10;
        vz0Var.k();
        h();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.G = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.f26017x == z10) {
            return;
        }
        this.f26017x = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i10) {
        this.f26016w = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        if (this.e != i10) {
            this.e = i10;
            h();
            requestLayout();
        }
    }

    public void setRenderWidth(int i10) {
        int i11;
        int i12;
        int measuredWidth = getMeasuredWidth();
        this.f26018y = Math.max(measuredWidth, i10);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            yz0 d = d(i13);
            if (measuredWidth > 0 && (i12 = this.f26018y) != measuredWidth) {
                float f7 = measuredWidth;
                int round = Math.round((d.f32783n * i12) / f7);
                int round2 = Math.round(((d.f32783n + d.f32784o) * this.f26018y) / f7);
                d.f32785p = round;
                d.f32780k = Math.max(0, round2 - round);
                if (d.f32775c != null && d.f32774b != null) {
                    d.f();
                }
            } else {
                int i14 = d.f32783n;
                d.f32785p = i14;
                d.f32780k = Math.max(0, (d.f32784o + i14) - i14);
                if (d.f32775c != null && d.f32774b != null) {
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
                xz0 xz0Var = d10.f32774b;
                if (xz0Var != null) {
                    i11 = xz0Var.getEmojiOnlyCount();
                } else {
                    i11 = 0;
                }
                if (i11 > 0) {
                    zz0 zz0Var = d10.f32773a.f24434a.f25085b;
                    int max = Math.max(0, zz0Var.f33078a);
                    int min = Math.min(i15, zz0Var.f33079b);
                    if (max < min) {
                        int i19 = 0;
                        for (int i20 = max; i20 < min; i20++) {
                            i19 += iArr2[i20];
                        }
                        int max2 = Math.max(1, Math.round(d10.f32780k / i11)) - i19;
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
                zz0 zz0Var2 = d11.f32773a.f24434a.f25085b;
                int max3 = Math.max(0, Math.min(i15, zz0Var2.f33078a));
                int max4 = Math.max(max3, Math.min(i15, zz0Var2.f33079b));
                int i26 = iArr4[max3];
                int i27 = iArr4[max4];
                d11.f32786q = i26;
                d11.f32781l = Math.max(0, i27 - i26);
                if (d11.f32775c != null) {
                    d11.g();
                }
                this.O.onLayoutChild(d11.f32774b, d11.b(), d11.c());
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
        vz0Var.f31917u = z10;
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
        this.f26012f = z10;
        requestLayout();
    }
}
