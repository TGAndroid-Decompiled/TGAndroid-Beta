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

public final class ty0 extends View {
    public static final fy0 N = new fy0(0);
    public static final fy0 O = new fy0(1);
    public static final fy0 P = new fy0(3);
    public static final fy0 Q = new fy0(4);
    public int A;
    public int[] B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final ArrayList F;
    public final ArrayList G;
    public final Path H;
    public final RectF I;
    public final float[] J;
    public final sy0 K;
    public final ArrayList L;
    public final ry0 M;

    public final org.telegram.ui.Cells.j9 f32915a;

    public int f32916b;

    public final jy0 f32917c;
    public final jy0 d;

    public int f32918e;

    public boolean f32919f;
    public int h;

    public int f32920n;

    public int f32921r;

    public int f32922s;
    public int v;

    public int f32923w;

    public boolean f32924x;

    public int f32925y;

    public ty0(Context context, sy0 sy0Var, org.telegram.ui.Cells.j9 j9Var) {
        super(context);
        this.f32917c = new jy0(this, true);
        this.d = new jy0(this, false);
        this.f32918e = 0;
        this.f32919f = false;
        this.h = 1;
        this.f32920n = 0;
        this.f32921r = AndroidUtilities.dp(8.0f);
        this.f32922s = AndroidUtilities.dp(9.0f);
        this.v = AndroidUtilities.dp(12.0f);
        this.f32924x = true;
        this.B = new int[0];
        this.F = new ArrayList();
        this.G = new ArrayList();
        new Path();
        this.H = new Path();
        this.I = new RectF();
        this.J = new float[8];
        this.L = new ArrayList();
        this.f32915a = j9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.K = sy0Var;
        ry0 ry0Var = new ry0(this, this);
        this.M = ry0Var;
        r0.j0.k(this, ry0Var);
    }

    public static void i(oy0 oy0Var, int i10, int i11, int i12, int i13) {
        ny0 ny0Var = new ny0(i10, i11 + i10);
        qy0 qy0Var = oy0Var.f31445a;
        oy0Var.f31445a = new qy0(qy0Var.f32005a, ny0Var, qy0Var.f32007c, qy0Var.d);
        ny0 ny0Var2 = new ny0(i12, i13 + i12);
        qy0 qy0Var2 = oy0Var.f31446b;
        oy0Var.f31446b = new qy0(qy0Var2.f32005a, ny0Var2, qy0Var2.f32007c, qy0Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.L;
        my0 my0Var = new my0(this, arrayList.size());
        oy0 oy0Var = new oy0();
        ny0 ny0Var = new ny0(i11, i13 + i11);
        fy0 fy0Var = Q;
        oy0Var.f31445a = new qy0(false, ny0Var, fy0Var, 0.0f);
        oy0Var.f31446b = new qy0(false, new ny0(i10, i12 + i10), fy0Var, 0.0f);
        my0Var.f30778a = oy0Var;
        my0Var.f30785j = i11;
        arrayList.add(my0Var);
        g();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.L;
        my0 my0Var = new my0(this, arrayList.size());
        my0Var.f30780c = pagetablecell;
        oy0 oy0Var = new oy0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        ny0 ny0Var = new ny0(i11, i13 + i11);
        fy0 fy0Var = Q;
        oy0Var.f31445a = new qy0(false, ny0Var, fy0Var, 0.0f);
        oy0Var.f31446b = new qy0(false, new ny0(i10, i12 + i10), fy0Var, 1.0f);
        my0Var.f30778a = oy0Var;
        my0Var.f30785j = i11;
        arrayList.add(my0Var);
        int i14 = pagetablecell.rowspan;
        if (i14 > 1) {
            this.G.add(new PointF(i11, i11 + i14));
        }
        g();
    }

    public final void c() {
        int i10 = this.f32920n;
        int iHashCode = 1;
        if (i10 != 0) {
            int childCount = getChildCount();
            int iHashCode2 = 1;
            for (int i11 = 0; i11 < childCount; i11++) {
                iHashCode2 = (iHashCode2 * 31) + d(i11).f30778a.hashCode();
            }
            if (i10 != iHashCode2) {
                g();
                c();
                return;
            }
            return;
        }
        boolean z10 = this.f32918e == 0;
        int i12 = (z10 ? this.f32917c : this.d).f29832b;
        if (i12 == Integer.MIN_VALUE) {
            i12 = 0;
        }
        int[] iArr = new int[i12];
        int childCount2 = getChildCount();
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount2; i15++) {
            oy0 oy0Var = d(i15).f30778a;
            qy0 qy0Var = z10 ? oy0Var.f31445a : oy0Var.f31446b;
            ny0 ny0Var = qy0Var.f32006b;
            boolean z11 = qy0Var.f32005a;
            int i16 = ny0Var.f31062b;
            int i17 = ny0Var.f31061a;
            int i18 = i16 - i17;
            if (z11) {
                i13 = i17;
            }
            qy0 qy0Var2 = z10 ? oy0Var.f31446b : oy0Var.f31445a;
            ny0 ny0Var2 = qy0Var2.f32006b;
            boolean z12 = qy0Var2.f32005a;
            int i19 = ny0Var2.f31062b;
            int i20 = ny0Var2.f31061a;
            int iMin = i19 - i20;
            if (i12 != 0) {
                iMin = Math.min(iMin, i12 - (z12 ? Math.min(i20, i12) : 0));
            }
            if (z12) {
                i14 = i20;
            }
            if (i12 != 0) {
                if (!z11 || !z12) {
                    while (true) {
                        int i21 = i14 + iMin;
                        if (i21 <= i12) {
                            int i22 = i14;
                            while (true) {
                                if (i22 >= i21) {
                                    break;
                                } else if (iArr[i22] > i13) {
                                    break;
                                } else {
                                    i22++;
                                }
                            }
                        }
                        if (z12) {
                            i13++;
                        } else if (i21 <= i12) {
                            i14++;
                        } else {
                            i13++;
                            i14 = 0;
                        }
                    }
                }
                Arrays.fill(iArr, Math.min(i14, i12), Math.min(i14 + iMin, i12), i13 + i18);
            }
            if (z10) {
                i(oy0Var, i13, i18, i14, iMin);
            } else {
                i(oy0Var, i14, iMin, i13, i18);
            }
            i14 += iMin;
        }
        int childCount3 = getChildCount();
        for (int i23 = 0; i23 < childCount3; i23++) {
            iHashCode = (iHashCode * 31) + d(i23).f30778a.hashCode();
        }
        this.f32920n = iHashCode;
    }

    public final my0 d(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.L;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (my0) arrayList.get(i10);
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        ry0 ry0Var = this.M;
        if (ry0Var == null || !ry0Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final int e(my0 my0Var, boolean z10, boolean z11) {
        int[] iArr;
        if (this.h == 1) {
            return f(my0Var, z10, z11);
        }
        jy0 jy0Var = z10 ? this.f32917c : this.d;
        if (z11) {
            if (jy0Var.f29838j == null) {
                jy0Var.f29838j = new int[jy0Var.e() + 1];
            }
            if (!jy0Var.f29839k) {
                jy0Var.b(true);
                jy0Var.f29839k = true;
            }
            iArr = jy0Var.f29838j;
        } else {
            if (jy0Var.f29840l == null) {
                jy0Var.f29840l = new int[jy0Var.e() + 1];
            }
            if (!jy0Var.f29841m) {
                jy0Var.b(false);
                jy0Var.f29841m = true;
            }
            iArr = jy0Var.f29840l;
        }
        oy0 oy0Var = my0Var.f30778a;
        ny0 ny0Var = (z10 ? oy0Var.f31446b : oy0Var.f31445a).f32006b;
        return iArr[z11 ? ny0Var.f31061a : ny0Var.f31062b];
    }

    public final int f(my0 my0Var, boolean z10, boolean z11) {
        int i10;
        oy0 oy0Var = my0Var.f30778a;
        if (z10) {
            i10 = z11 ? ((ViewGroup.MarginLayoutParams) oy0Var).leftMargin : ((ViewGroup.MarginLayoutParams) oy0Var).rightMargin;
        } else {
            i10 = z11 ? ((ViewGroup.MarginLayoutParams) oy0Var).topMargin : ((ViewGroup.MarginLayoutParams) oy0Var).bottomMargin;
        }
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (!this.f32919f) {
            return 0;
        }
        qy0 qy0Var = z10 ? oy0Var.f31446b : oy0Var.f31445a;
        jy0 jy0Var = z10 ? this.f32917c : this.d;
        ny0 ny0Var = qy0Var.f32006b;
        if ((z10 && this.E) != z11) {
            int i11 = ny0Var.f31061a;
            return 0;
        }
        int i12 = ny0Var.f31062b;
        jy0Var.e();
        return 0;
    }

    public final void g() {
        this.f32920n = 0;
        jy0 jy0Var = this.f32917c;
        jy0Var.k();
        jy0 jy0Var2 = this.d;
        jy0Var2.k();
        if (jy0Var == null || jy0Var2 == null) {
            return;
        }
        jy0Var.l();
        jy0Var2.l();
    }

    public int getAlignmentMode() {
        return this.h;
    }

    public int getChildCount() {
        return this.L.size();
    }

    public int getColumnCount() {
        return this.f32917c.e();
    }

    public int getOrientation() {
        return this.f32918e;
    }

    public int getRenderHeight() {
        return this.A;
    }

    public int getRowCount() {
        return this.d.e();
    }

    public boolean getUseDefaultMargins() {
        return this.f32919f;
    }

    public final void h(int i10, boolean z10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            my0 my0VarD = d(i11);
            oy0 oy0Var = my0VarD.f30778a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                my0VarD.e(this.K.createTextLayout(my0VarD.f30780c, this.f32916b == 2 ? ((int) (size / 2.0f)) - (this.v * 4) : (int) (size / 1.5f)));
                if (my0VarD.f30779b != null) {
                    ((ViewGroup.MarginLayoutParams) oy0Var).height = Math.max(this.f32923w, my0VarD.f30782f + this.f32921r + this.f32922s);
                    int emojiOnlyCount = my0VarD.f30779b.getEmojiOnlyCount();
                    ((ViewGroup.MarginLayoutParams) oy0Var).width = emojiOnlyCount > 0 ? ((ViewGroup.MarginLayoutParams) oy0Var).height * emojiOnlyCount : (this.v * 2) + my0VarD.f30781e;
                } else {
                    ((ViewGroup.MarginLayoutParams) oy0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) oy0Var).height = 0;
                }
                my0VarD.d(e(my0VarD, true, false) + e(my0VarD, true, true) + ((ViewGroup.MarginLayoutParams) oy0Var).width, e(my0VarD, false, false) + e(my0VarD, false, true) + ((ViewGroup.MarginLayoutParams) oy0Var).height, true);
            } else {
                boolean z11 = this.f32918e == 0;
                qy0 qy0Var = z11 ? oy0Var.f31446b : oy0Var.f31445a;
                if (qy0.a(qy0Var, z11) == Q) {
                    ny0 ny0Var = qy0Var.f32006b;
                    int[] iArrG = (z11 ? this.f32917c : this.d).g();
                    int iE = (iArrG[ny0Var.f31062b] - iArrG[ny0Var.f31061a]) - (e(my0VarD, z11, false) + e(my0VarD, z11, true));
                    if (z11) {
                        ly0 ly0Var = my0VarD.f30779b;
                        int emojiOnlyCount2 = ly0Var != null ? ly0Var.getEmojiOnlyCount() : 0;
                        if (emojiOnlyCount2 > 0) {
                            int iMax = Math.max(1, Math.round(iE / emojiOnlyCount2));
                            ((ViewGroup.MarginLayoutParams) oy0Var).height = iMax;
                            my0VarD.f30788m = iMax;
                        }
                        my0VarD.d(e(my0VarD, true, false) + e(my0VarD, true, true) + iE, e(my0VarD, false, false) + e(my0VarD, false, true) + ((ViewGroup.MarginLayoutParams) oy0Var).height, false);
                    } else {
                        my0VarD.d(e(my0VarD, true, false) + e(my0VarD, true, true) + ((ViewGroup.MarginLayoutParams) oy0Var).width, e(my0VarD, false, false) + e(my0VarD, false, true) + iE, false);
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
        ty0 ty0Var = this;
        ty0Var.c();
        jy0 jy0Var = ty0Var.d;
        jy0 jy0Var2 = ty0Var.f32917c;
        if (jy0Var2 != null && jy0Var != null) {
            jy0Var2.l();
            jy0Var.l();
        }
        ty0Var.f32916b = 0;
        int childCount = ty0Var.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            ty0Var.f32916b = Math.max(ty0Var.f32916b, ty0Var.d(i15).f30778a.f31446b.f32006b.f31062b);
        }
        ty0Var.h(i10, true);
        if (ty0Var.f32918e == 0) {
            i12 = jy0Var2.i(i10);
            if (ty0Var.f32924x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                jy0Var2.v.f31692a = i12;
                jy0Var2.f29850w.f31692a = -i12;
                jy0Var2.f29845q = false;
                jy0Var2.g();
            }
            ty0Var.h(i10, false);
            i13 = jy0Var.i(i11);
        } else {
            int i16 = jy0Var.i(i11);
            ty0Var.h(i10, false);
            i12 = jy0Var2.i(i10);
            i13 = i16;
        }
        int iMax = Math.max(i13, ty0Var.getSuggestedMinimumHeight());
        ty0Var.setMeasuredDimension(i12, iMax);
        jy0Var2.v.f31692a = i12;
        jy0Var2.f29850w.f31692a = -i12;
        jy0Var2.f29845q = false;
        jy0Var2.g();
        jy0Var.v.f31692a = iMax;
        jy0Var.f29850w.f31692a = -iMax;
        jy0Var.f29845q = false;
        jy0Var.g();
        int[] iArrG = jy0Var2.g();
        int[] iArrG2 = jy0Var.g();
        int[] iArrCopyOf = Arrays.copyOf(iArrG2, iArrG2.length);
        ArrayList arrayList = ty0Var.F;
        arrayList.clear();
        int i17 = iArrG[iArrG.length - 1];
        int childCount2 = ty0Var.getChildCount();
        int i18 = 0;
        while (i18 < childCount2) {
            int i19 = i18;
            my0 my0VarD = ty0Var.d(i19);
            oy0 oy0Var = my0VarD.f30778a;
            qy0 qy0Var = oy0Var.f31446b;
            qy0 qy0Var2 = oy0Var.f31445a;
            ny0 ny0Var = qy0Var.f32006b;
            ny0 ny0Var2 = qy0Var2.f32006b;
            int i20 = childCount2;
            int i21 = iArrG[ny0Var.f31061a];
            int i22 = iArrG2[ny0Var2.f31061a];
            int i23 = iArrG[ny0Var.f31062b];
            int i24 = iArrG2[ny0Var2.f31062b];
            int i25 = i23 - i21;
            int i26 = i24 - i22;
            int i27 = my0VarD.f30786k;
            jy0 jy0Var3 = jy0Var;
            int i28 = my0VarD.f30787l;
            fy0 fy0VarA = qy0.a(qy0Var, true);
            fy0 fy0VarA2 = qy0.a(qy0Var2, false);
            j9.a aVarF = jy0Var2.f();
            ky0 ky0Var = (ky0) ((Object[]) aVarF.d)[((int[]) aVarF.f12863b)[i19]];
            j9.a aVarF2 = jy0Var3.f();
            jy0 jy0Var4 = jy0Var2;
            ky0 ky0Var2 = (ky0) ((Object[]) aVarF2.d)[((int[]) aVarF2.f12863b)[i19]];
            int iB = fy0VarA.b(my0VarD, i25 - ky0Var.d(true));
            int iB2 = fy0VarA2.b(my0VarD, i26 - ky0Var2.d(true));
            int iE = ty0Var.e(my0VarD, true, true);
            int iE2 = ty0Var.e(my0VarD, false, true);
            int iE3 = ty0Var.e(my0VarD, true, false);
            int i29 = iE + iE3;
            int iE4 = iE2 + ty0Var.e(my0VarD, false, false);
            int iA = ky0Var.a(ty0Var, my0VarD, fy0VarA, i27 + i29, true);
            ty0Var = this;
            int iA2 = ky0Var2.a(ty0Var, my0VarD, fy0VarA2, i28 + iE4, false);
            int iC = fy0VarA.c(i27, i25 - i29);
            int iC2 = fy0VarA2.c(i28, i26 - iE4);
            int i30 = i21 + iB + iA;
            int i31 = !ty0Var.E ? iE + i30 : ((i17 - iC) - iE3) - i30;
            int i32 = i22 + iB2 + iA2 + iE2;
            if (my0VarD.f30780c != null) {
                if (iC != my0VarD.f30786k || iC2 != my0VarD.f30787l) {
                    my0VarD.d(iC, iC2, false);
                }
                int i33 = my0VarD.f30788m;
                if (i33 != 0 && i33 != iC2) {
                    ny0 ny0Var3 = my0VarD.f30778a.f31445a.f32006b;
                    if (ny0Var3.f31062b - ny0Var3.f31061a <= 1) {
                        ArrayList arrayList2 = ty0Var.G;
                        int size = arrayList2.size();
                        int i34 = 0;
                        while (true) {
                            if (i34 >= size) {
                                arrayList.add(my0VarD);
                                break;
                            }
                            PointF pointF = (PointF) arrayList2.get(i34);
                            float f10 = pointF.x;
                            float f11 = my0VarD.f30778a.f31445a.f32006b.f31061a;
                            if (f10 <= f11 && pointF.y > f11) {
                                break;
                            } else {
                                i34++;
                            }
                        }
                    }
                }
            }
            my0VarD.f30791p = i31;
            my0VarD.f30792q = i32;
            i18 = i19 + 1;
            jy0Var = jy0Var3;
            childCount2 = i20;
            jy0Var2 = jy0Var4;
        }
        int size2 = arrayList.size();
        int i35 = 0;
        while (i35 < size2) {
            my0 my0Var = (my0) arrayList.get(i35);
            int i36 = my0Var.f30787l;
            int i37 = my0Var.d;
            int iMin = i36 - my0Var.f30788m;
            int i38 = i37 + 1;
            ArrayList arrayList3 = ty0Var.L;
            int size3 = arrayList3.size();
            while (true) {
                if (i38 < size3) {
                    my0 my0Var2 = (my0) arrayList3.get(i38);
                    if (my0Var.f30778a.f31445a.f32006b.f31061a == my0Var2.f30778a.f31445a.f32006b.f31061a) {
                        int i39 = my0Var.f30788m;
                        int i40 = my0Var2.f30788m;
                        if (i39 < i40) {
                            z10 = true;
                            break;
                        }
                        int i41 = my0Var2.f30787l - i40;
                        if (i41 > 0) {
                            iMin = Math.min(iMin, i41);
                        }
                        i38++;
                    }
                }
                z10 = false;
                break;
            }
            if (!z10) {
                for (int i42 = i37 - 1; i42 >= 0; i42--) {
                    my0 my0Var3 = (my0) arrayList3.get(i42);
                    if (my0Var.f30778a.f31445a.f32006b.f31061a != my0Var3.f30778a.f31445a.f32006b.f31061a) {
                        break;
                    }
                    int i43 = my0Var.f30788m;
                    int i44 = my0Var3.f30788m;
                    if (i43 < i44) {
                        z10 = true;
                        break;
                    }
                    int i45 = my0Var3.f30787l - i44;
                    if (i45 > 0) {
                        iMin = Math.min(iMin, i45);
                    }
                }
            }
            if (!z10) {
                my0Var.f30787l = my0Var.f30788m;
                my0Var.g();
                iMax -= iMin;
                int i46 = my0Var.f30778a.f31445a.f32006b.f31061a;
                while (true) {
                    i46++;
                    if (i46 >= iArrCopyOf.length) {
                        break;
                    } else {
                        iArrCopyOf[i46] = iArrCopyOf[i46] - iMin;
                    }
                }
                int size4 = arrayList3.size();
                int i47 = size2;
                int i48 = i35;
                int i49 = 0;
                while (i49 < size4) {
                    my0 my0Var4 = (my0) arrayList3.get(i49);
                    if (my0Var == my0Var4) {
                        i14 = i49;
                    } else {
                        int i50 = my0Var.f30778a.f31445a.f32006b.f31061a;
                        int i51 = my0Var4.f30778a.f31445a.f32006b.f31061a;
                        if (i50 == i51) {
                            if (my0Var4.f30788m != my0Var4.f30787l) {
                                arrayList.remove(my0Var4);
                                if (my0Var4.d < i37) {
                                    i48--;
                                }
                                i47--;
                            }
                            int i52 = my0Var4.f30787l - iMin;
                            my0Var4.f30787l = i52;
                            i14 = i49;
                            my0Var4.d(my0Var4.f30786k, i52, true);
                        } else {
                            i14 = i49;
                            if (i50 < i51) {
                                my0Var4.f30792q -= iMin;
                            }
                        }
                    }
                    i49 = i14 + 1;
                }
                i35 = i48;
                size2 = i47;
            }
            i35++;
        }
        int childCount3 = ty0Var.getChildCount();
        for (int i53 = 0; i53 < childCount3; i53++) {
            my0 my0VarD2 = ty0Var.d(i53);
            ty0Var.K.onLayoutChild(my0VarD2.f30779b, my0VarD2.b(), my0VarD2.c());
            my0VarD2.f30789n = my0VarD2.f30791p;
            my0VarD2.f30790o = my0VarD2.f30786k;
        }
        ty0Var.f32925y = i17;
        ty0Var.A = iMax;
        ty0Var.B = iArrCopyOf;
        ty0Var.setMeasuredDimension(i17, iMax);
    }

    @Override
    public final void requestLayout() {
        jy0 jy0Var;
        super.requestLayout();
        jy0 jy0Var2 = this.f32917c;
        if (jy0Var2 == null || (jy0Var = this.d) == null) {
            return;
        }
        jy0Var2.l();
        jy0Var.l();
    }

    public void setAlignmentMode(int i10) {
        this.h = i10;
        requestLayout();
    }

    public void setColumnCount(int i10) {
        this.f32917c.n(i10);
        g();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        jy0 jy0Var = this.f32917c;
        jy0Var.f29849u = z10;
        jy0Var.k();
        g();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.C = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.f32924x == z10) {
            return;
        }
        this.f32924x = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i10) {
        this.f32923w = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        if (this.f32918e != i10) {
            this.f32918e = i10;
            g();
            requestLayout();
        }
    }

    public void setRenderWidth(int i10) {
        int i11;
        int measuredWidth = getMeasuredWidth();
        this.f32925y = Math.max(measuredWidth, i10);
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            my0 my0VarD = d(i12);
            if (measuredWidth <= 0 || (i11 = this.f32925y) == measuredWidth) {
                int i13 = my0VarD.f30789n;
                int i14 = my0VarD.f30790o + i13;
                my0VarD.f30791p = i13;
                my0VarD.f30786k = Math.max(0, i14 - i13);
                if (my0VarD.f30780c != null && my0VarD.f30779b != null) {
                    my0VarD.f();
                }
            } else {
                float f10 = measuredWidth;
                int iRound = Math.round((my0VarD.f30789n * i11) / f10);
                int iRound2 = Math.round(((my0VarD.f30789n + my0VarD.f30790o) * this.f32925y) / f10);
                my0VarD.f30791p = iRound;
                my0VarD.f30786k = Math.max(0, iRound2 - iRound);
                if (my0VarD.f30780c != null && my0VarD.f30779b != null) {
                    my0VarD.f();
                }
            }
        }
        int[] iArr = this.B;
        if (iArr.length < 2) {
            this.A = getMeasuredHeight();
        } else {
            int length = iArr.length;
            int i15 = length - 1;
            int[] iArr2 = new int[i15];
            int i16 = 0;
            while (i16 < i15) {
                int[] iArr3 = this.B;
                int i17 = i16 + 1;
                iArr2[i16] = iArr3[i17] - iArr3[i16];
                i16 = i17;
            }
            for (int i18 = 0; i18 < getChildCount(); i18++) {
                my0 my0VarD2 = d(i18);
                ly0 ly0Var = my0VarD2.f30779b;
                int emojiOnlyCount = ly0Var != null ? ly0Var.getEmojiOnlyCount() : 0;
                if (emojiOnlyCount > 0) {
                    ny0 ny0Var = my0VarD2.f30778a.f31445a.f32006b;
                    int iMax = Math.max(0, ny0Var.f31061a);
                    int iMin = Math.min(i15, ny0Var.f31062b);
                    if (iMax < iMin) {
                        int i19 = 0;
                        for (int i20 = iMax; i20 < iMin; i20++) {
                            i19 += iArr2[i20];
                        }
                        int iMax2 = Math.max(1, Math.round(my0VarD2.f30786k / emojiOnlyCount)) - i19;
                        while (iMax < iMin && iMax2 > 0) {
                            int i21 = iMin - iMax;
                            int i22 = ((iMax2 + i21) - 1) / i21;
                            iArr2[iMax] = iArr2[iMax] + i22;
                            iMax2 -= i22;
                            iMax++;
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
            this.A = iArr4[i15];
            for (int i25 = 0; i25 < getChildCount(); i25++) {
                my0 my0VarD3 = d(i25);
                ny0 ny0Var2 = my0VarD3.f30778a.f31445a.f32006b;
                int iMax3 = Math.max(0, Math.min(i15, ny0Var2.f31061a));
                int iMax4 = Math.max(iMax3, Math.min(i15, ny0Var2.f31062b));
                int i26 = iArr4[iMax3];
                int i27 = iArr4[iMax4];
                my0VarD3.f30792q = i26;
                my0VarD3.f30787l = Math.max(0, i27 - i26);
                if (my0VarD3.f30780c != null) {
                    my0VarD3.g();
                }
                this.K.onLayoutChild(my0VarD3.f30779b, my0VarD3.b(), my0VarD3.c());
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
        jy0 jy0Var = this.d;
        jy0Var.f29849u = z10;
        jy0Var.k();
        g();
        requestLayout();
    }

    public void setRtl(boolean z10) {
        this.E = z10;
    }

    public void setStriped(boolean z10) {
        this.D = z10;
    }

    public void setUseDefaultMargins(boolean z10) {
        this.f32919f = z10;
        requestLayout();
    }
}
