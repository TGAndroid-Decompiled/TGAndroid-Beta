package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
public class m6 extends Drawable {
    public static final LinearInterpolator f37391d0 = new LinearInterpolator();
    public boolean A;
    public float B;
    public int C;
    public final Rect D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public ng J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public float O;
    public boolean P;
    public LinearGradient Q;
    public Matrix R;
    public Paint S;
    public boolean T;
    public boolean U;
    public boolean V;
    public float W;
    public float X;
    public int Y;
    public ValueAnimator Z;
    public final TextPaint f37392a;
    public int f37393a0;
    public int f37394b;
    public ColorFilter f37395b0;
    public boolean f37396c;
    public Runnable f37397c0;
    public float d;
    public float f37398e;
    public float f37399f;
    public float f37400g;
    public j6[] h;
    public CharSequence f37401i;
    public float f37402j;
    public float f37403k;
    public float f37404l;
    public float f37405m;
    public j6[] f37406n;
    public CharSequence f37407o;
    public int f37408p;
    public float f37409q;
    public float f37410r;
    public boolean f37411s;
    public ValueAnimator f37412t;
    public CharSequence f37413u;
    public boolean v;
    public long f37414w;
    public TimeInterpolator f37415x;
    public float f37416y;
    public float f37417z;

    public m6(boolean z10, boolean z11, boolean z12) {
        this(z10, z11, z12, false, false);
    }

    public static boolean l(int r2, int r3, java.lang.CharSequence r4, java.lang.CharSequence r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m6.l(int, int, java.lang.CharSequence, java.lang.CharSequence):boolean");
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f37412t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void b() {
        if (this.f37406n != null) {
            int i7 = 0;
            while (true) {
                j6[] j6VarArr = this.f37406n;
                if (i7 >= j6VarArr.length) {
                    break;
                }
                j6 j6Var = j6VarArr[i7];
                m6 m6Var = j6Var.f36305i;
                if (m6Var.getCallback() instanceof View) {
                    x5.release((View) m6Var.getCallback(), j6Var.f36299a);
                }
                i7++;
            }
        }
        this.f37406n = null;
    }

    public final float c() {
        if (this.h != null && this.f37406n != null) {
            return org.telegram.messenger.g0.T1(this.f37402j, this.d, this.f37410r);
        }
        return this.d;
    }

    public final float d(org.telegram.ui.Components.j6 r8, float r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m6.d(org.telegram.ui.Components.j6, float):float");
    }

    @Override
    public final void draw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m6.draw(android.graphics.Canvas):void");
    }

    public final float e() {
        return Math.max(this.d, this.f37402j);
    }

    public final void f(j6 j6Var) {
        this.f37399f = Math.max(this.f37399f, j6Var.f36304g);
        float max = Math.max(this.f37400g, j6Var.h);
        this.f37400g = max;
        this.f37398e = this.f37399f + max;
    }

    public final void g(j6 j6Var) {
        this.f37404l = Math.max(this.f37404l, j6Var.f36304g);
        float max = Math.max(this.f37405m, j6Var.h);
        this.f37405m = max;
        this.f37403k = this.f37404l + max;
    }

    @Override
    public final Rect getDirtyBounds() {
        return this.D;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final boolean h() {
        ValueAnimator valueAnimator = this.f37412t;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final float i() {
        float f10;
        CharSequence charSequence = this.f37407o;
        float f11 = 0.0f;
        float f12 = 1.0f;
        if (charSequence != null && charSequence.length() > 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        CharSequence charSequence2 = this.f37401i;
        if (charSequence2 != null && charSequence2.length() > 0) {
            f11 = 1.0f;
        }
        if (this.f37407o != null) {
            f12 = this.f37410r;
        }
        return org.telegram.messenger.g0.T1(f10, f11, f12);
    }

    public final StaticLayout j(int i7, CharSequence charSequence) {
        if (i7 <= 0) {
            Point point = org.telegram.messenger.g0.f24226q;
            i7 = Math.min(point.x, point.y);
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f37392a, i7).setMaxLines(1).setLineSpacing(0.0f, 1.0f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i7).setIncludePad(this.T).build();
    }

    public final void k(k6 k6Var, CharSequence charSequence, int i7, int i10) {
        if (this.H && charSequence.length() > 1) {
            int i11 = 0;
            while (i11 < charSequence.length()) {
                int i12 = i11 + 1;
                k6Var.c(charSequence.subSequence(i11, i12));
                i11 = i12;
            }
            return;
        }
        k6Var.c(charSequence);
    }

    public final void m(float f10, long j3, float f11, TimeInterpolator timeInterpolator) {
        this.f37417z = f10;
        this.f37414w = j3;
        this.f37416y = f11;
        this.f37415x = timeInterpolator;
    }

    public final void n(float f10, long j3, TimeInterpolator timeInterpolator) {
        m(f10, j3, 1.0f, timeInterpolator);
    }

    public final void o(float f10, float f11, float f12, float f13) {
        int i7 = (int) f10;
        int i10 = (int) f11;
        int i11 = (int) f12;
        int i12 = (int) f13;
        super.setBounds(i7, i10, i11, i12);
        this.D.set(i7, i10, i11, i12);
    }

    public final void p(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void q(boolean z10) {
        this.P = z10;
        invalidateSelf();
    }

    public final void r(boolean z10, boolean z11) {
        this.E = z10;
        this.F = true;
        this.G = z11;
        this.H = false;
        this.I = false;
    }

    public final void s(float f10, float f11, int i7) {
        this.V = true;
        this.W = f10;
        this.X = f11;
        this.Y = i7;
        this.f37392a.setShadowLayer(f10, 0.0f, f11, i7);
    }

    @Override
    public final void setAlpha(int i7) {
        this.C = i7;
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.D.set(rect);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f37392a.setColorFilter(colorFilter);
    }

    public final void t(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        CharSequence charSequence2;
        float f10;
        CharSequence charSequence3;
        CharSequence charSequence4;
        int i7;
        boolean z13;
        int i10;
        boolean z14;
        boolean z15;
        int i11;
        boolean z16;
        if (this.f37401i != null && charSequence != null) {
            z12 = z10;
        } else {
            z12 = false;
        }
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence;
        }
        int i12 = this.N;
        if (i12 <= 0) {
            i12 = this.D.width();
        }
        int i13 = 1;
        if (z12) {
            if (!TextUtils.equals(charSequence2, this.f37401i)) {
                if (this.K) {
                    ValueAnimator valueAnimator = this.f37412t;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f37412t = null;
                    }
                } else if (h()) {
                    this.f37413u = charSequence2;
                    this.v = z11;
                    return;
                }
                this.f37407o = this.f37401i;
                this.f37401i = charSequence2;
                final ArrayList arrayList = new ArrayList();
                final int i14 = i12;
                final ArrayList arrayList2 = new ArrayList();
                this.d = 0.0f;
                this.f37402j = 0.0f;
                this.f37400g = 0.0f;
                this.f37399f = 0.0f;
                this.f37398e = 0.0f;
                this.f37405m = 0.0f;
                this.f37404l = 0.0f;
                this.f37403k = 0.0f;
                this.f37396c = org.telegram.messenger.g0.L1(this.f37401i);
                bg.g0 g0Var = new bg.g0(this, i14, arrayList2, arrayList, 2);
                k6 k6Var = new k6(this) {
                    public final m6 f35935b;

                    {
                        this.f35935b = this;
                    }

                    @Override
                    public final void c(CharSequence charSequence5) {
                        switch (r4) {
                            case 0:
                                m6 m6Var = this.f35935b;
                                j6 j6Var = new j6(m6Var, m6Var.j(i14 - ((int) Math.ceil(m6Var.d)), charSequence5), m6Var.d, -1);
                                arrayList.add(j6Var);
                                m6Var.d += j6Var.f36303f;
                                m6Var.f(j6Var);
                                return;
                            default:
                                m6 m6Var2 = this.f35935b;
                                j6 j6Var2 = new j6(m6Var2, m6Var2.j(i14 - ((int) Math.ceil(m6Var2.f37402j)), charSequence5), m6Var2.f37402j, -1);
                                arrayList.add(j6Var2);
                                m6Var2.f37402j += j6Var2.f36303f;
                                m6Var2.g(j6Var2);
                                return;
                        }
                    }
                };
                k6 k6Var2 = new k6(this) {
                    public final m6 f35935b;

                    {
                        this.f35935b = this;
                    }

                    @Override
                    public final void c(CharSequence charSequence5) {
                        switch (r4) {
                            case 0:
                                m6 m6Var = this.f35935b;
                                j6 j6Var = new j6(m6Var, m6Var.j(i14 - ((int) Math.ceil(m6Var.d)), charSequence5), m6Var.d, -1);
                                arrayList2.add(j6Var);
                                m6Var.d += j6Var.f36303f;
                                m6Var.f(j6Var);
                                return;
                            default:
                                m6 m6Var2 = this.f35935b;
                                j6 j6Var2 = new j6(m6Var2, m6Var2.j(i14 - ((int) Math.ceil(m6Var2.f37402j)), charSequence5), m6Var2.f37402j, -1);
                                arrayList2.add(j6Var2);
                                m6Var2.f37402j += j6Var2.f36303f;
                                m6Var2.g(j6Var2);
                                return;
                        }
                    }
                };
                if (this.E) {
                    charSequence3 = new l6(this.f37407o);
                } else {
                    charSequence3 = this.f37407o;
                }
                if (this.E) {
                    charSequence4 = new l6(this.f37401i);
                } else {
                    charSequence4 = this.f37401i;
                }
                if (this.M) {
                    k(k6Var2, charSequence3, 0, charSequence3.length());
                    k(k6Var, charSequence4, 0, charSequence4.length());
                    i7 = 1;
                } else if (this.I) {
                    int min = Math.min(charSequence4.length(), charSequence3.length());
                    int i15 = 0;
                    while (i15 < min && l(i15, i15, charSequence4, charSequence3)) {
                        i15++;
                    }
                    int length = charSequence4.length();
                    int length2 = charSequence3.length();
                    while (length > i15 && length2 > i15) {
                        i7 = i13;
                        if (!l(length - 1, length2 - 1, charSequence4, charSequence3)) {
                            break;
                        }
                        length--;
                        length2--;
                        i13 = i7;
                    }
                    i7 = i13;
                    if (i15 > 0) {
                        g0Var.c(charSequence4.subSequence(0, i15));
                    }
                    if (length > i15) {
                        k(k6Var, charSequence4.subSequence(i15, length), i15, length);
                    }
                    if (length2 > i15) {
                        k(k6Var2, charSequence3.subSequence(i15, length2), i15, length2);
                    }
                    if (length < charSequence4.length()) {
                        CharSequence subSequence = charSequence4.subSequence(length, charSequence4.length());
                        charSequence4.length();
                        g0Var.c(subSequence);
                    }
                } else {
                    i7 = 1;
                    if (this.F) {
                        int min2 = Math.min(charSequence4.length(), charSequence3.length());
                        if (this.G) {
                            ArrayList arrayList3 = new ArrayList();
                            boolean z17 = true;
                            boolean z18 = true;
                            int i16 = 0;
                            for (int i17 = 0; i17 <= min2; i17++) {
                                int length3 = (charSequence4.length() - i17) - 1;
                                int length4 = (charSequence3.length() - i17) - 1;
                                if (length3 >= 0 && length4 >= 0 && l(length3, length4, charSequence4, charSequence3)) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (z17 != z16 || i17 == min2) {
                                    int i18 = i17 - i16;
                                    if (i18 > 0) {
                                        if (arrayList3.size() != 0) {
                                            z17 = z18;
                                        }
                                        arrayList3.add(Integer.valueOf(i18));
                                        z18 = z17;
                                    }
                                    z17 = z16;
                                    i16 = i17;
                                }
                            }
                            int length5 = charSequence4.length() - min2;
                            int length6 = charSequence3.length() - min2;
                            if (length5 > 0) {
                                k(k6Var, charSequence4.subSequence(0, length5), 0, length5);
                            }
                            if (length6 > 0) {
                                k(k6Var2, charSequence3.subSequence(0, length6), 0, length6);
                            }
                            int size = arrayList3.size() - 1;
                            while (size >= 0) {
                                int intValue = ((Integer) arrayList3.get(size)).intValue();
                                if (size % 2 == 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (z15 == z18) {
                                    i11 = size;
                                    if (charSequence4.length() > charSequence3.length()) {
                                        g0Var.c(charSequence4.subSequence(length5, length5 + intValue));
                                    } else {
                                        g0Var.c(charSequence3.subSequence(length6, length6 + intValue));
                                    }
                                } else {
                                    i11 = size;
                                    int i19 = length5 + intValue;
                                    k(k6Var, charSequence4.subSequence(length5, i19), length5, i19);
                                    int i20 = length6 + intValue;
                                    k(k6Var2, charSequence3.subSequence(length6, i20), length6, i20);
                                }
                                length5 += intValue;
                                length6 += intValue;
                                size = i11 - 1;
                            }
                        } else {
                            boolean z19 = true;
                            int i21 = 0;
                            for (int i22 = 0; i22 <= min2; i22++) {
                                if (i22 < min2 && l(i22, i22, charSequence4, charSequence3)) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (z19 != z14 || i22 == min2) {
                                    if (i22 - i21 > 0) {
                                        if (z19) {
                                            k(g0Var, charSequence4.subSequence(i21, i22), i21, i22);
                                        } else {
                                            k(k6Var, charSequence4.subSequence(i21, i22), i21, i22);
                                            k(k6Var2, charSequence3.subSequence(i21, i22), i21, i22);
                                        }
                                    }
                                    i21 = i22;
                                    z19 = z14;
                                }
                            }
                            if (charSequence4.length() - min2 > 0) {
                                k(k6Var, charSequence4.subSequence(min2, charSequence4.length()), min2, charSequence4.length());
                            }
                            if (charSequence3.length() - min2 > 0) {
                                k(k6Var2, charSequence3.subSequence(min2, charSequence3.length()), min2, charSequence3.length());
                            }
                        }
                    } else {
                        int min3 = Math.min(charSequence4.length(), charSequence3.length());
                        boolean z20 = true;
                        int i23 = 0;
                        int i24 = 0;
                        int i25 = 0;
                        int i26 = 0;
                        while (i23 <= min3) {
                            if (i23 < min3 && l(i23, i24, charSequence4, charSequence3)) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z20 == z13 && i23 != min3) {
                                i10 = min3;
                            } else {
                                if (i23 == min3) {
                                    i23 = charSequence4.length();
                                    i24 = charSequence3.length();
                                }
                                i10 = min3;
                                int i27 = i23 - i25;
                                boolean z21 = z20;
                                int i28 = i24 - i26;
                                if (i27 > 0 || i28 > 0) {
                                    if (i27 == i28 && z21) {
                                        g0Var.c(charSequence4.subSequence(i25, i23));
                                    } else {
                                        if (i27 > 0) {
                                            k(k6Var, charSequence4.subSequence(i25, i23), i25, i23);
                                        }
                                        if (i28 > 0) {
                                            k(k6Var2, charSequence3.subSequence(i26, i24), i26, i24);
                                        }
                                    }
                                }
                                i25 = i23;
                                i26 = i24;
                                z20 = z13;
                            }
                            if (z13) {
                                i24++;
                            }
                            i23++;
                            min3 = i10;
                        }
                    }
                }
                if (this.f37406n != null) {
                    int i29 = 0;
                    while (true) {
                        j6[] j6VarArr = this.f37406n;
                        if (i29 >= j6VarArr.length) {
                            break;
                        }
                        j6 j6Var = j6VarArr[i29];
                        m6 m6Var = j6Var.f36305i;
                        if (m6Var.getCallback() instanceof View) {
                            x5.release((View) m6Var.getCallback(), j6Var.f36299a);
                        }
                        i29++;
                    }
                }
                this.f37406n = null;
                j6[] j6VarArr2 = this.h;
                if (j6VarArr2 == null || j6VarArr2.length != arrayList.size()) {
                    this.h = new j6[arrayList.size()];
                }
                arrayList.toArray(this.h);
                b();
                j6[] j6VarArr3 = this.f37406n;
                if (j6VarArr3 == null || j6VarArr3.length != arrayList2.size()) {
                    this.f37406n = new j6[arrayList2.size()];
                }
                arrayList2.toArray(this.f37406n);
                ValueAnimator valueAnimator2 = this.f37412t;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.f37411s = z11;
                this.f37410r = 0.0f;
                this.f37409q = 0.0f;
                this.f37412t = ValueAnimator.ofFloat(0.0f, 1.0f);
                Runnable runnable = this.f37397c0;
                if (runnable != null) {
                    runnable.run();
                }
                this.f37412t.addUpdateListener(new w(this, i7));
                this.f37412t.addListener(new x(this, 3));
                this.f37412t.setStartDelay(0L);
                this.f37412t.setDuration(this.f37414w);
                this.f37412t.setInterpolator(f37391d0);
                this.f37412t.start();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator3 = this.f37412t;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.f37412t = null;
        this.f37413u = null;
        this.v = false;
        this.f37410r = 0.0f;
        this.f37409q = 0.0f;
        if (!charSequence2.equals(this.f37401i)) {
            if (this.f37406n != null) {
                int i30 = 0;
                while (true) {
                    j6[] j6VarArr4 = this.f37406n;
                    if (i30 >= j6VarArr4.length) {
                        break;
                    }
                    j6 j6Var2 = j6VarArr4[i30];
                    m6 m6Var2 = j6Var2.f36305i;
                    if (m6Var2.getCallback() instanceof View) {
                        x5.release((View) m6Var2.getCallback(), j6Var2.f36299a);
                    }
                    i30++;
                }
            }
            this.f37406n = null;
            this.h = r0;
            this.f37401i = charSequence2;
            f10 = 0.0f;
            j6[] j6VarArr5 = {new j6(this, j(i12, charSequence2), 0.0f, -1)};
            j6 j6Var3 = this.h[0];
            this.d = j6Var3.f36303f;
            this.f37400g = 0.0f;
            this.f37399f = 0.0f;
            this.f37398e = 0.0f;
            f(j6Var3);
            this.f37396c = org.telegram.messenger.g0.L1(this.f37401i);
        } else {
            f10 = 0.0f;
        }
        b();
        this.f37407o = null;
        this.f37402j = f10;
        this.f37405m = f10;
        this.f37404l = f10;
        this.f37403k = f10;
        invalidateSelf();
        Runnable runnable2 = this.f37397c0;
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    public final void u(int i7) {
        this.f37392a.setColor(i7);
        this.C = Color.alpha(i7);
    }

    public final void v(int i7, boolean z10) {
        ValueAnimator valueAnimator = this.Z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Z = null;
        }
        if (!z10) {
            u(i7);
            return;
        }
        int color = this.f37392a.getColor();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Z = ofFloat;
        ofFloat.addUpdateListener(new hi.q4(this, color, i7, 2));
        this.Z.addListener(new ki.e2(this, i7, 7));
        this.Z.setDuration(240L);
        this.Z.setInterpolator(kr.h);
        this.Z.start();
    }

    public final void w(float f10) {
        TextPaint textPaint = this.f37392a;
        float textSize = textPaint.getTextSize();
        textPaint.setTextSize(f10);
        if (Math.abs(textSize - f10) > 0.5f) {
            int i7 = this.N;
            if (i7 <= 0) {
                i7 = this.D.width();
            }
            int i10 = 0;
            if (this.h != null) {
                this.d = 0.0f;
                this.f37400g = 0.0f;
                this.f37399f = 0.0f;
                this.f37398e = 0.0f;
                int i11 = 0;
                while (true) {
                    j6[] j6VarArr = this.h;
                    if (i11 >= j6VarArr.length) {
                        break;
                    }
                    StaticLayout j3 = j(i7 - ((int) Math.ceil(Math.min(this.d, this.f37402j))), j6VarArr[i11].f36300b.getText());
                    j6[] j6VarArr2 = this.h;
                    j6 j6Var = j6VarArr2[i11];
                    j6VarArr2[i11] = new j6(this, j3, j6Var.f36301c, j6Var.d);
                    float f11 = this.d;
                    j6 j6Var2 = this.h[i11];
                    this.d = f11 + j6Var2.f36303f;
                    f(j6Var2);
                    i11++;
                }
            }
            if (this.f37406n != null) {
                this.f37402j = 0.0f;
                this.f37405m = 0.0f;
                this.f37404l = 0.0f;
                this.f37403k = 0.0f;
                while (true) {
                    j6[] j6VarArr3 = this.f37406n;
                    if (i10 >= j6VarArr3.length) {
                        break;
                    }
                    StaticLayout j10 = j(i7 - ((int) Math.ceil(Math.min(this.d, this.f37402j))), j6VarArr3[i10].f36300b.getText());
                    j6[] j6VarArr4 = this.f37406n;
                    j6 j6Var3 = j6VarArr4[i10];
                    j6VarArr4[i10] = new j6(this, j10, j6Var3.f36301c, j6Var3.d);
                    float f12 = this.f37402j;
                    j6 j6Var4 = this.f37406n[i10];
                    this.f37402j = f12 + j6Var4.f36303f;
                    g(j6Var4);
                    i10++;
                }
            }
            invalidateSelf();
        }
    }

    public final void x(Typeface typeface) {
        this.f37392a.setTypeface(typeface);
    }

    public m6(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f37392a = new TextPaint(1);
        this.f37394b = 0;
        this.f37396c = false;
        this.f37408p = 0;
        this.f37409q = 0.0f;
        this.f37410r = 0.0f;
        this.f37411s = true;
        this.f37414w = 320L;
        this.f37415x = kr.h;
        this.f37416y = -1.0f;
        this.f37417z = 0.3f;
        this.B = 0.0f;
        this.C = 255;
        this.D = new Rect();
        this.T = true;
        this.U = true;
        this.V = false;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        this.H = z13;
        this.I = z14;
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        this.D.set(i7, i10, i11, i12);
    }
}
