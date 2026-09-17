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
public final class lz0 extends View {
    public static final xy0 R = new xy0(0);
    public static final xy0 S = new xy0(1);
    public static final xy0 T = new xy0(3);
    public static final xy0 U = new xy0(4);
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
    public final kz0 O;
    public final ArrayList P;
    public final jz0 Q;
    public final org.telegram.ui.Cells.q9 f25987a;
    public int f25988b;
    public final bz0 f25989c;
    public final bz0 d;
    public int e;
    public boolean f25990f;
    public int h;
    public int f25991n;
    public int f25992r;
    public int f25993s;
    public int v;
    public int f25994w;
    public boolean f25995x;
    public int f25996y;

    public lz0(Context context, kz0 kz0Var, org.telegram.ui.Cells.q9 q9Var) {
        super(context);
        this.f25989c = new bz0(this, true);
        this.d = new bz0(this, false);
        this.e = 0;
        this.f25990f = false;
        this.h = 1;
        this.f25991n = 0;
        this.f25992r = AndroidUtilities.dp(8.0f);
        this.f25993s = AndroidUtilities.dp(9.0f);
        this.v = AndroidUtilities.dp(12.0f);
        this.f25995x = true;
        this.F = new int[0];
        this.J = new ArrayList();
        this.K = new ArrayList();
        new Path();
        this.L = new Path();
        this.M = new RectF();
        this.N = new float[8];
        this.P = new ArrayList();
        this.f25987a = q9Var;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.O = kz0Var;
        jz0 jz0Var = new jz0(this, this);
        this.Q = jz0Var;
        r0.i0.k(this, jz0Var);
    }

    public static void i(gz0 gz0Var, int i10, int i11, int i12, int i13) {
        fz0 fz0Var = new fz0(i10, i11 + i10);
        iz0 iz0Var = gz0Var.f24427a;
        gz0Var.f24427a = new iz0(iz0Var.f25059a, fz0Var, iz0Var.f25061c, iz0Var.d);
        fz0 fz0Var2 = new fz0(i12, i13 + i12);
        iz0 iz0Var2 = gz0Var.f24428b;
        gz0Var.f24428b = new iz0(iz0Var2.f25059a, fz0Var2, iz0Var2.f25061c, iz0Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        ez0 ez0Var = new ez0(this, arrayList.size());
        gz0 gz0Var = new gz0();
        fz0 fz0Var = new fz0(i11, i13 + i11);
        xy0 xy0Var = U;
        gz0Var.f24427a = new iz0(false, fz0Var, xy0Var, 0.0f);
        gz0Var.f24428b = new iz0(false, new fz0(i10, i12 + i10), xy0Var, 0.0f);
        ez0Var.f23701a = gz0Var;
        ez0Var.f23707j = i11;
        arrayList.add(ez0Var);
        g();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        ez0 ez0Var = new ez0(this, arrayList.size());
        ez0Var.f23703c = pagetablecell;
        gz0 gz0Var = new gz0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        fz0 fz0Var = new fz0(i11, i13 + i11);
        xy0 xy0Var = U;
        gz0Var.f24427a = new iz0(false, fz0Var, xy0Var, 0.0f);
        gz0Var.f24428b = new iz0(false, new fz0(i10, i12 + i10), xy0Var, 1.0f);
        ez0Var.f23701a = gz0Var;
        ez0Var.f23707j = i11;
        arrayList.add(ez0Var);
        int i14 = pagetablecell.rowspan;
        if (i14 > 1) {
            this.K.add(new PointF(i11, i11 + i14));
        }
        g();
    }

    public final void c() {
        boolean z10;
        bz0 bz0Var;
        iz0 iz0Var;
        iz0 iz0Var2;
        int i10;
        int i11 = this.f25991n;
        int i12 = 1;
        if (i11 == 0) {
            if (this.e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                bz0Var = this.f25989c;
            } else {
                bz0Var = this.d;
            }
            int i13 = bz0Var.f22830b;
            if (i13 == Integer.MIN_VALUE) {
                i13 = 0;
            }
            int[] iArr = new int[i13];
            int childCount = getChildCount();
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < childCount; i16++) {
                gz0 gz0Var = d(i16).f23701a;
                if (z10) {
                    iz0Var = gz0Var.f24427a;
                } else {
                    iz0Var = gz0Var.f24428b;
                }
                fz0 fz0Var = iz0Var.f25060b;
                boolean z11 = iz0Var.f25059a;
                int i17 = fz0Var.f24040b;
                int i18 = fz0Var.f24039a;
                int i19 = i17 - i18;
                if (z11) {
                    i14 = i18;
                }
                if (z10) {
                    iz0Var2 = gz0Var.f24428b;
                } else {
                    iz0Var2 = gz0Var.f24427a;
                }
                fz0 fz0Var2 = iz0Var2.f25060b;
                boolean z12 = iz0Var2.f25059a;
                int i20 = fz0Var2.f24040b;
                int i21 = fz0Var2.f24039a;
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
                    i(gz0Var, i14, i19, i15, i22);
                } else {
                    i(gz0Var, i15, i22, i14, i19);
                }
                i15 += i22;
            }
            int childCount2 = getChildCount();
            for (int i25 = 0; i25 < childCount2; i25++) {
                i12 = (i12 * 31) + d(i25).f23701a.hashCode();
            }
            this.f25991n = i12;
            return;
        }
        int childCount3 = getChildCount();
        int i26 = 1;
        for (int i27 = 0; i27 < childCount3; i27++) {
            i26 = (i26 * 31) + d(i27).f23701a.hashCode();
        }
        if (i11 != i26) {
            g();
            c();
        }
    }

    public final ez0 d(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                return (ez0) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        jz0 jz0Var = this.Q;
        if (jz0Var != null && jz0Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final int e(ez0 ez0Var, boolean z10, boolean z11) {
        bz0 bz0Var;
        int[] iArr;
        iz0 iz0Var;
        int i10;
        if (this.h == 1) {
            return f(ez0Var, z10, z11);
        }
        if (z10) {
            bz0Var = this.f25989c;
        } else {
            bz0Var = this.d;
        }
        if (z11) {
            if (bz0Var.f22835j == null) {
                bz0Var.f22835j = new int[bz0Var.e() + 1];
            }
            if (!bz0Var.f22836k) {
                bz0Var.b(true);
                bz0Var.f22836k = true;
            }
            iArr = bz0Var.f22835j;
        } else {
            if (bz0Var.f22837l == null) {
                bz0Var.f22837l = new int[bz0Var.e() + 1];
            }
            if (!bz0Var.f22838m) {
                bz0Var.b(false);
                bz0Var.f22838m = true;
            }
            iArr = bz0Var.f22837l;
        }
        gz0 gz0Var = ez0Var.f23701a;
        if (z10) {
            iz0Var = gz0Var.f24428b;
        } else {
            iz0Var = gz0Var.f24427a;
        }
        fz0 fz0Var = iz0Var.f25060b;
        if (z11) {
            i10 = fz0Var.f24039a;
        } else {
            i10 = fz0Var.f24040b;
        }
        return iArr[i10];
    }

    public final int f(ez0 ez0Var, boolean z10, boolean z11) {
        int i10;
        iz0 iz0Var;
        bz0 bz0Var;
        boolean z12;
        gz0 gz0Var = ez0Var.f23701a;
        if (z10) {
            if (z11) {
                i10 = ((ViewGroup.MarginLayoutParams) gz0Var).leftMargin;
            } else {
                i10 = ((ViewGroup.MarginLayoutParams) gz0Var).rightMargin;
            }
        } else if (z11) {
            i10 = ((ViewGroup.MarginLayoutParams) gz0Var).topMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) gz0Var).bottomMargin;
        }
        if (i10 == Integer.MIN_VALUE) {
            if (!this.f25990f) {
                return 0;
            }
            if (z10) {
                iz0Var = gz0Var.f24428b;
            } else {
                iz0Var = gz0Var.f24427a;
            }
            if (z10) {
                bz0Var = this.f25989c;
            } else {
                bz0Var = this.d;
            }
            fz0 fz0Var = iz0Var.f25060b;
            if (z10 && this.I) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != z11) {
                int i11 = fz0Var.f24039a;
                return 0;
            }
            int i12 = fz0Var.f24040b;
            bz0Var.e();
            return 0;
        }
        return i10;
    }

    public final void g() {
        this.f25991n = 0;
        bz0 bz0Var = this.f25989c;
        bz0Var.k();
        bz0 bz0Var2 = this.d;
        bz0Var2.k();
        if (bz0Var != null && bz0Var2 != null) {
            bz0Var.l();
            bz0Var2.l();
        }
    }

    public int getAlignmentMode() {
        return this.h;
    }

    public int getChildCount() {
        return this.P.size();
    }

    public int getColumnCount() {
        return this.f25989c.e();
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
        return this.f25990f;
    }

    public final void h(int i10, boolean z10) {
        boolean z11;
        iz0 iz0Var;
        bz0 bz0Var;
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            ez0 d = d(i14);
            gz0 gz0Var = d.f23701a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                if (this.f25988b == 2) {
                    i12 = ((int) (size / 2.0f)) - (this.v * 4);
                } else {
                    i12 = (int) (size / 1.5f);
                }
                d.e(this.O.createTextLayout(d.f23703c, i12));
                if (d.f23702b != null) {
                    ((ViewGroup.MarginLayoutParams) gz0Var).height = Math.max(this.f25994w, d.f23704f + this.f25992r + this.f25993s);
                    int emojiOnlyCount = d.f23702b.getEmojiOnlyCount();
                    if (emojiOnlyCount > 0) {
                        i13 = ((ViewGroup.MarginLayoutParams) gz0Var).height * emojiOnlyCount;
                    } else {
                        i13 = (this.v * 2) + d.e;
                    }
                    ((ViewGroup.MarginLayoutParams) gz0Var).width = i13;
                } else {
                    ((ViewGroup.MarginLayoutParams) gz0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) gz0Var).height = 0;
                }
                int i15 = ((ViewGroup.MarginLayoutParams) gz0Var).width;
                int i16 = ((ViewGroup.MarginLayoutParams) gz0Var).height;
                d.d(e(d, true, false) + e(d, true, true) + i15, e(d, false, false) + e(d, false, true) + i16, true);
            } else {
                if (this.e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    iz0Var = gz0Var.f24428b;
                } else {
                    iz0Var = gz0Var.f24427a;
                }
                if (iz0.a(iz0Var, z11) == U) {
                    fz0 fz0Var = iz0Var.f25060b;
                    if (z11) {
                        bz0Var = this.f25989c;
                    } else {
                        bz0Var = this.d;
                    }
                    int[] g10 = bz0Var.g();
                    int e = (g10[fz0Var.f24040b] - g10[fz0Var.f24039a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        dz0 dz0Var = d.f23702b;
                        if (dz0Var != null) {
                            i11 = dz0Var.getEmojiOnlyCount();
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            int max = Math.max(1, Math.round(e / i11));
                            ((ViewGroup.MarginLayoutParams) gz0Var).height = max;
                            d.f23710m = max;
                        }
                        int i17 = ((ViewGroup.MarginLayoutParams) gz0Var).height;
                        d.d(e(d, true, false) + e(d, true, true) + e, e(d, false, false) + e(d, false, true) + i17, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) gz0Var).width, e(d, false, false) + e(d, false, true) + e, false);
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
        lz0 lz0Var = this;
        lz0Var.c();
        bz0 bz0Var = lz0Var.d;
        bz0 bz0Var2 = lz0Var.f25989c;
        if (bz0Var2 != null && bz0Var != null) {
            bz0Var2.l();
            bz0Var.l();
        }
        lz0Var.f25988b = 0;
        int childCount = lz0Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            lz0Var.f25988b = Math.max(lz0Var.f25988b, lz0Var.d(i16).f23701a.f24428b.f25060b.f24040b);
        }
        lz0Var.h(i10, true);
        if (lz0Var.e == 0) {
            i12 = bz0Var2.i(i10);
            if (lz0Var.f25995x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                bz0Var2.v.f24756a = i12;
                bz0Var2.f22847w.f24756a = -i12;
                bz0Var2.f22842q = false;
                bz0Var2.g();
            }
            lz0Var.h(i10, false);
            i13 = bz0Var.i(i11);
        } else {
            int i17 = bz0Var.i(i11);
            lz0Var.h(i10, false);
            i12 = bz0Var2.i(i10);
            i13 = i17;
        }
        int max = Math.max(i13, lz0Var.getSuggestedMinimumHeight());
        lz0Var.setMeasuredDimension(i12, max);
        bz0Var2.v.f24756a = i12;
        bz0Var2.f22847w.f24756a = -i12;
        bz0Var2.f22842q = false;
        bz0Var2.g();
        bz0Var.v.f24756a = max;
        bz0Var.f22847w.f24756a = -max;
        bz0Var.f22842q = false;
        bz0Var.g();
        int[] g10 = bz0Var2.g();
        int[] g11 = bz0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = lz0Var.J;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = lz0Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            ez0 d = lz0Var.d(i20);
            gz0 gz0Var = d.f23701a;
            iz0 iz0Var = gz0Var.f24428b;
            iz0 iz0Var2 = gz0Var.f24427a;
            fz0 fz0Var = iz0Var.f25060b;
            fz0 fz0Var2 = iz0Var2.f25060b;
            int i21 = childCount2;
            int i22 = g10[fz0Var.f24039a];
            int i23 = g11[fz0Var2.f24039a];
            int i24 = g10[fz0Var.f24040b] - i22;
            int i25 = g11[fz0Var2.f24040b] - i23;
            int i26 = d.f23708k;
            bz0 bz0Var3 = bz0Var;
            int i27 = d.f23709l;
            xy0 a2 = iz0.a(iz0Var, true);
            xy0 a10 = iz0.a(iz0Var2, false);
            lf.i f7 = bz0Var2.f();
            cz0 cz0Var = (cz0) ((Object[]) f7.d)[((int[]) f7.f14033b)[i20]];
            lf.i f10 = bz0Var3.f();
            bz0 bz0Var4 = bz0Var2;
            cz0 cz0Var2 = (cz0) ((Object[]) f10.d)[((int[]) f10.f14033b)[i20]];
            int b10 = a2.b(d, i24 - cz0Var.d(true));
            int b11 = a10.b(d, i25 - cz0Var2.d(true));
            int e = lz0Var.e(d, true, true);
            int e7 = lz0Var.e(d, false, true);
            int e10 = lz0Var.e(d, true, false);
            int i28 = e + e10;
            int e11 = e7 + lz0Var.e(d, false, false);
            int a11 = cz0Var.a(lz0Var, d, a2, i26 + i28, true);
            lz0Var = this;
            int a12 = cz0Var2.a(lz0Var, d, a10, i27 + e11, false);
            int c10 = a2.c(i26, i24 - i28);
            int c11 = a10.c(i27, i25 - e11);
            int i29 = i22 + b10 + a11;
            if (!lz0Var.I) {
                i15 = e + i29;
            } else {
                i15 = ((i18 - c10) - e10) - i29;
            }
            int i30 = i15;
            int i31 = i23 + b11 + a12 + e7;
            if (d.f23703c != null) {
                if (c10 != d.f23708k || c11 != d.f23709l) {
                    d.d(c10, c11, false);
                }
                int i32 = d.f23710m;
                if (i32 != 0 && i32 != c11) {
                    fz0 fz0Var3 = d.f23701a.f24427a.f25060b;
                    if (fz0Var3.f24040b - fz0Var3.f24039a <= 1) {
                        ArrayList arrayList2 = lz0Var.K;
                        int size = arrayList2.size();
                        int i33 = 0;
                        while (true) {
                            if (i33 < size) {
                                PointF pointF = (PointF) arrayList2.get(i33);
                                float f11 = pointF.x;
                                float f12 = d.f23701a.f24427a.f25060b.f24039a;
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
            d.f23713p = i30;
            d.f23714q = i31;
            i19 = i20 + 1;
            bz0Var = bz0Var3;
            childCount2 = i21;
            bz0Var2 = bz0Var4;
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            ez0 ez0Var = (ez0) arrayList.get(i34);
            int i35 = ez0Var.f23709l;
            int i36 = ez0Var.d;
            int i37 = i35 - ez0Var.f23710m;
            ArrayList arrayList3 = lz0Var.P;
            int size3 = arrayList3.size();
            for (int i38 = i36 + 1; i38 < size3; i38++) {
                ez0 ez0Var2 = (ez0) arrayList3.get(i38);
                if (ez0Var.f23701a.f24427a.f25060b.f24039a != ez0Var2.f23701a.f24427a.f25060b.f24039a) {
                    break;
                }
                int i39 = ez0Var.f23710m;
                int i40 = ez0Var2.f23710m;
                if (i39 < i40) {
                    z10 = true;
                    break;
                }
                int i41 = ez0Var2.f23709l - i40;
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
                    ez0 ez0Var3 = (ez0) arrayList3.get(i42);
                    if (ez0Var.f23701a.f24427a.f25060b.f24039a != ez0Var3.f23701a.f24427a.f25060b.f24039a) {
                        break;
                    }
                    int i43 = ez0Var.f23710m;
                    int i44 = ez0Var3.f23710m;
                    if (i43 < i44) {
                        z10 = true;
                        break;
                    }
                    int i45 = ez0Var3.f23709l - i44;
                    if (i45 > 0) {
                        i37 = Math.min(i37, i45);
                    }
                    i42--;
                }
            }
            if (!z10) {
                ez0Var.f23709l = ez0Var.f23710m;
                ez0Var.g();
                max -= i37;
                int i46 = ez0Var.f23701a.f24427a.f25060b.f24039a;
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
                    ez0 ez0Var4 = (ez0) arrayList3.get(i49);
                    if (ez0Var == ez0Var4) {
                        i14 = i49;
                    } else {
                        int i50 = ez0Var.f23701a.f24427a.f25060b.f24039a;
                        int i51 = ez0Var4.f23701a.f24427a.f25060b.f24039a;
                        if (i50 == i51) {
                            if (ez0Var4.f23710m != ez0Var4.f23709l) {
                                arrayList.remove(ez0Var4);
                                if (ez0Var4.d < i36) {
                                    i48--;
                                }
                                i47--;
                            }
                            int i52 = ez0Var4.f23709l - i37;
                            ez0Var4.f23709l = i52;
                            i14 = i49;
                            ez0Var4.d(ez0Var4.f23708k, i52, true);
                        } else {
                            i14 = i49;
                            if (i50 < i51) {
                                ez0Var4.f23714q -= i37;
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
        int childCount3 = lz0Var.getChildCount();
        for (int i53 = 0; i53 < childCount3; i53++) {
            ez0 d10 = lz0Var.d(i53);
            lz0Var.O.onLayoutChild(d10.f23702b, d10.b(), d10.c());
            d10.f23711n = d10.f23713p;
            d10.f23712o = d10.f23708k;
        }
        lz0Var.f25996y = i18;
        lz0Var.E = max;
        lz0Var.F = copyOf;
        lz0Var.setMeasuredDimension(i18, max);
    }

    @Override
    public final void requestLayout() {
        bz0 bz0Var;
        super.requestLayout();
        bz0 bz0Var2 = this.f25989c;
        if (bz0Var2 != null && (bz0Var = this.d) != null) {
            bz0Var2.l();
            bz0Var.l();
        }
    }

    public void setAlignmentMode(int i10) {
        this.h = i10;
        requestLayout();
    }

    public void setColumnCount(int i10) {
        this.f25989c.n(i10);
        g();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        bz0 bz0Var = this.f25989c;
        bz0Var.f22846u = z10;
        bz0Var.k();
        g();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.G = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.f25995x == z10) {
            return;
        }
        this.f25995x = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i10) {
        this.f25994w = i10;
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
        this.f25996y = Math.max(measuredWidth, i10);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            ez0 d = d(i13);
            if (measuredWidth > 0 && (i12 = this.f25996y) != measuredWidth) {
                float f7 = measuredWidth;
                int round = Math.round((d.f23711n * i12) / f7);
                int round2 = Math.round(((d.f23711n + d.f23712o) * this.f25996y) / f7);
                d.f23713p = round;
                d.f23708k = Math.max(0, round2 - round);
                if (d.f23703c != null && d.f23702b != null) {
                    d.f();
                }
            } else {
                int i14 = d.f23711n;
                d.f23713p = i14;
                d.f23708k = Math.max(0, (d.f23712o + i14) - i14);
                if (d.f23703c != null && d.f23702b != null) {
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
                ez0 d10 = d(i18);
                dz0 dz0Var = d10.f23702b;
                if (dz0Var != null) {
                    i11 = dz0Var.getEmojiOnlyCount();
                } else {
                    i11 = 0;
                }
                if (i11 > 0) {
                    fz0 fz0Var = d10.f23701a.f24427a.f25060b;
                    int max = Math.max(0, fz0Var.f24039a);
                    int min = Math.min(i15, fz0Var.f24040b);
                    if (max < min) {
                        int i19 = 0;
                        for (int i20 = max; i20 < min; i20++) {
                            i19 += iArr2[i20];
                        }
                        int max2 = Math.max(1, Math.round(d10.f23708k / i11)) - i19;
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
                ez0 d11 = d(i25);
                fz0 fz0Var2 = d11.f23701a.f24427a.f25060b;
                int max3 = Math.max(0, Math.min(i15, fz0Var2.f24039a));
                int max4 = Math.max(max3, Math.min(i15, fz0Var2.f24040b));
                int i26 = iArr4[max3];
                int i27 = iArr4[max4];
                d11.f23714q = i26;
                d11.f23709l = Math.max(0, i27 - i26);
                if (d11.f23703c != null) {
                    d11.g();
                }
                this.O.onLayoutChild(d11.f23702b, d11.b(), d11.c());
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
        bz0 bz0Var = this.d;
        bz0Var.f22846u = z10;
        bz0Var.k();
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
        this.f25990f = z10;
        requestLayout();
    }
}
