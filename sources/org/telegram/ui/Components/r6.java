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
import org.telegram.messenger.AndroidUtilities;
public class r6 extends Drawable {
    public static final LinearInterpolator f28745c0 = new LinearInterpolator();
    public float A;
    public int B;
    public final Rect C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public qg I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public float N;
    public boolean O;
    public LinearGradient P;
    public Matrix Q;
    public Paint R;
    public boolean S;
    public boolean T;
    public boolean U;
    public float V;
    public float W;
    public int X;
    public ValueAnimator Y;
    public int Z;
    public final TextPaint f28746a;
    public ColorFilter f28747a0;
    public int f28748b;
    public Runnable f28749b0;
    public boolean f28750c;
    public float d;
    public float e;
    public float f28751f;
    public float f28752g;
    public o6[] h;
    public CharSequence f28753i;
    public float f28754j;
    public float f28755k;
    public float f28756l;
    public float f28757m;
    public o6[] f28758n;
    public CharSequence f28759o;
    public int f28760p;
    public float f28761q;
    public float f28762r;
    public boolean f28763s;
    public ValueAnimator f28764t;
    public CharSequence f28765u;
    public boolean v;
    public long f28766w;
    public TimeInterpolator f28767x;
    public float f28768y;
    public float f28769z;

    public r6(boolean z10, boolean z11, boolean z12) {
        this(z10, z11, z12, false, false);
    }

    public static boolean l(int r2, int r3, java.lang.CharSequence r4, java.lang.CharSequence r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r6.l(int, int, java.lang.CharSequence, java.lang.CharSequence):boolean");
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f28764t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void b() {
        if (this.f28758n != null) {
            int i10 = 0;
            while (true) {
                o6[] o6VarArr = this.f28758n;
                if (i10 >= o6VarArr.length) {
                    break;
                }
                o6 o6Var = o6VarArr[i10];
                r6 r6Var = o6Var.f27859i;
                if (r6Var.getCallback() instanceof View) {
                    b6.release((View) r6Var.getCallback(), o6Var.f27854a);
                }
                i10++;
            }
        }
        this.f28758n = null;
    }

    public final float c() {
        if (this.h != null && this.f28758n != null) {
            return AndroidUtilities.lerp(this.f28754j, this.d, this.f28762r);
        }
        return this.d;
    }

    public final float d(org.telegram.ui.Components.o6 r8, float r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r6.d(org.telegram.ui.Components.o6, float):float");
    }

    @Override
    public final void draw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r6.draw(android.graphics.Canvas):void");
    }

    public final float e() {
        return Math.max(this.d, this.f28754j);
    }

    public final void f(o6 o6Var) {
        this.f28751f = Math.max(this.f28751f, o6Var.f27858g);
        float max = Math.max(this.f28752g, o6Var.h);
        this.f28752g = max;
        this.e = this.f28751f + max;
    }

    public final void g(o6 o6Var) {
        this.f28756l = Math.max(this.f28756l, o6Var.f27858g);
        float max = Math.max(this.f28757m, o6Var.h);
        this.f28757m = max;
        this.f28755k = this.f28756l + max;
    }

    @Override
    public final Rect getDirtyBounds() {
        return this.C;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final boolean h() {
        ValueAnimator valueAnimator = this.f28764t;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final float i() {
        float f7;
        CharSequence charSequence = this.f28759o;
        float f10 = 0.0f;
        float f11 = 1.0f;
        if (charSequence != null && charSequence.length() > 0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        CharSequence charSequence2 = this.f28753i;
        if (charSequence2 != null && charSequence2.length() > 0) {
            f10 = 1.0f;
        }
        if (this.f28759o != null) {
            f11 = this.f28762r;
        }
        return AndroidUtilities.lerp(f7, f10, f11);
    }

    public final StaticLayout j(int i10, CharSequence charSequence) {
        if (i10 <= 0) {
            Point point = AndroidUtilities.displaySize;
            i10 = Math.min(point.x, point.y);
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f28746a, i10).setMaxLines(1).setLineSpacing(0.0f, 1.0f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i10).setIncludePad(this.S).build();
    }

    public final void k(p6 p6Var, CharSequence charSequence, int i10, int i11) {
        if (this.G && charSequence.length() > 1) {
            int i12 = 0;
            while (i12 < charSequence.length()) {
                int i13 = i12 + 1;
                p6Var.d(charSequence.subSequence(i12, i13));
                i12 = i13;
            }
            return;
        }
        p6Var.d(charSequence);
    }

    public final void m(float f7, long j10, float f10, TimeInterpolator timeInterpolator) {
        this.f28769z = f7;
        this.f28766w = j10;
        this.f28768y = f10;
        this.f28767x = timeInterpolator;
    }

    public final void n(float f7, long j10, TimeInterpolator timeInterpolator) {
        m(f7, j10, 1.0f, timeInterpolator);
    }

    public final void o(float f7, float f10, float f11, float f12) {
        int i10 = (int) f7;
        int i11 = (int) f10;
        int i12 = (int) f11;
        int i13 = (int) f12;
        super.setBounds(i10, i11, i12, i13);
        this.C.set(i10, i11, i12, i13);
    }

    public final void p(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void q(boolean z10) {
        this.O = z10;
        invalidateSelf();
    }

    public final void r(boolean z10, boolean z11) {
        this.D = z10;
        this.E = true;
        this.F = z11;
        this.G = false;
        this.H = false;
    }

    public final void s(float f7, float f10, int i10) {
        this.U = true;
        this.V = f7;
        this.W = f10;
        this.X = i10;
        this.f28746a.setShadowLayer(f7, 0.0f, f10, i10);
    }

    @Override
    public final void setAlpha(int i10) {
        this.B = i10;
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.C.set(rect);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28746a.setColorFilter(colorFilter);
    }

    public final void t(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        CharSequence charSequence2;
        float f7;
        CharSequence charSequence3;
        CharSequence charSequence4;
        int i10;
        boolean z13;
        int i11;
        boolean z14;
        boolean z15;
        int i12;
        boolean z16;
        if (this.f28753i != null && charSequence != null) {
            z12 = z10;
        } else {
            z12 = false;
        }
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence;
        }
        int i13 = this.M;
        if (i13 <= 0) {
            i13 = this.C.width();
        }
        int i14 = 1;
        if (z12) {
            if (!TextUtils.equals(charSequence2, this.f28753i)) {
                if (this.J) {
                    ValueAnimator valueAnimator = this.f28764t;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f28764t = null;
                    }
                } else if (h()) {
                    this.f28765u = charSequence2;
                    this.v = z11;
                    return;
                }
                this.f28759o = this.f28753i;
                this.f28753i = charSequence2;
                final ArrayList arrayList = new ArrayList();
                final int i15 = i13;
                final ArrayList arrayList2 = new ArrayList();
                this.d = 0.0f;
                this.f28754j = 0.0f;
                this.f28752g = 0.0f;
                this.f28751f = 0.0f;
                this.e = 0.0f;
                this.f28757m = 0.0f;
                this.f28756l = 0.0f;
                this.f28755k = 0.0f;
                this.f28750c = AndroidUtilities.isRTL(this.f28753i);
                org.telegram.ui.ia iaVar = new org.telegram.ui.ia(this, i15, arrayList2, arrayList, 1);
                p6 p6Var = new p6(this) {
                    public final r6 f27217b;

                    {
                        this.f27217b = this;
                    }

                    @Override
                    public final void d(CharSequence charSequence5) {
                        switch (r4) {
                            case 0:
                                r6 r6Var = this.f27217b;
                                o6 o6Var = new o6(r6Var, r6Var.j(i15 - ((int) Math.ceil(r6Var.d)), charSequence5), r6Var.d, -1);
                                arrayList.add(o6Var);
                                r6Var.d += o6Var.f27857f;
                                r6Var.f(o6Var);
                                return;
                            default:
                                r6 r6Var2 = this.f27217b;
                                o6 o6Var2 = new o6(r6Var2, r6Var2.j(i15 - ((int) Math.ceil(r6Var2.f28754j)), charSequence5), r6Var2.f28754j, -1);
                                arrayList.add(o6Var2);
                                r6Var2.f28754j += o6Var2.f27857f;
                                r6Var2.g(o6Var2);
                                return;
                        }
                    }
                };
                p6 p6Var2 = new p6(this) {
                    public final r6 f27217b;

                    {
                        this.f27217b = this;
                    }

                    @Override
                    public final void d(CharSequence charSequence5) {
                        switch (r4) {
                            case 0:
                                r6 r6Var = this.f27217b;
                                o6 o6Var = new o6(r6Var, r6Var.j(i15 - ((int) Math.ceil(r6Var.d)), charSequence5), r6Var.d, -1);
                                arrayList2.add(o6Var);
                                r6Var.d += o6Var.f27857f;
                                r6Var.f(o6Var);
                                return;
                            default:
                                r6 r6Var2 = this.f27217b;
                                o6 o6Var2 = new o6(r6Var2, r6Var2.j(i15 - ((int) Math.ceil(r6Var2.f28754j)), charSequence5), r6Var2.f28754j, -1);
                                arrayList2.add(o6Var2);
                                r6Var2.f28754j += o6Var2.f27857f;
                                r6Var2.g(o6Var2);
                                return;
                        }
                    }
                };
                if (this.D) {
                    charSequence3 = new q6(this.f28759o);
                } else {
                    charSequence3 = this.f28759o;
                }
                if (this.D) {
                    charSequence4 = new q6(this.f28753i);
                } else {
                    charSequence4 = this.f28753i;
                }
                if (this.L) {
                    k(p6Var2, charSequence3, 0, charSequence3.length());
                    k(p6Var, charSequence4, 0, charSequence4.length());
                    i10 = 1;
                } else if (this.H) {
                    int min = Math.min(charSequence4.length(), charSequence3.length());
                    int i16 = 0;
                    while (i16 < min && l(i16, i16, charSequence4, charSequence3)) {
                        i16++;
                    }
                    int length = charSequence4.length();
                    int length2 = charSequence3.length();
                    while (length > i16 && length2 > i16) {
                        i10 = i14;
                        if (!l(length - 1, length2 - 1, charSequence4, charSequence3)) {
                            break;
                        }
                        length--;
                        length2--;
                        i14 = i10;
                    }
                    i10 = i14;
                    if (i16 > 0) {
                        iaVar.d(charSequence4.subSequence(0, i16));
                    }
                    if (length > i16) {
                        k(p6Var, charSequence4.subSequence(i16, length), i16, length);
                    }
                    if (length2 > i16) {
                        k(p6Var2, charSequence3.subSequence(i16, length2), i16, length2);
                    }
                    if (length < charSequence4.length()) {
                        CharSequence subSequence = charSequence4.subSequence(length, charSequence4.length());
                        charSequence4.length();
                        iaVar.d(subSequence);
                    }
                } else {
                    i10 = 1;
                    if (this.E) {
                        int min2 = Math.min(charSequence4.length(), charSequence3.length());
                        if (this.F) {
                            ArrayList arrayList3 = new ArrayList();
                            boolean z17 = true;
                            boolean z18 = true;
                            int i17 = 0;
                            for (int i18 = 0; i18 <= min2; i18++) {
                                int length3 = (charSequence4.length() - i18) - 1;
                                int length4 = (charSequence3.length() - i18) - 1;
                                if (length3 >= 0 && length4 >= 0 && l(length3, length4, charSequence4, charSequence3)) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (z17 != z16 || i18 == min2) {
                                    int i19 = i18 - i17;
                                    if (i19 > 0) {
                                        if (arrayList3.size() != 0) {
                                            z17 = z18;
                                        }
                                        arrayList3.add(Integer.valueOf(i19));
                                        z18 = z17;
                                    }
                                    z17 = z16;
                                    i17 = i18;
                                }
                            }
                            int length5 = charSequence4.length() - min2;
                            int length6 = charSequence3.length() - min2;
                            if (length5 > 0) {
                                k(p6Var, charSequence4.subSequence(0, length5), 0, length5);
                            }
                            if (length6 > 0) {
                                k(p6Var2, charSequence3.subSequence(0, length6), 0, length6);
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
                                    i12 = size;
                                    if (charSequence4.length() > charSequence3.length()) {
                                        iaVar.d(charSequence4.subSequence(length5, length5 + intValue));
                                    } else {
                                        iaVar.d(charSequence3.subSequence(length6, length6 + intValue));
                                    }
                                } else {
                                    i12 = size;
                                    int i20 = length5 + intValue;
                                    k(p6Var, charSequence4.subSequence(length5, i20), length5, i20);
                                    int i21 = length6 + intValue;
                                    k(p6Var2, charSequence3.subSequence(length6, i21), length6, i21);
                                }
                                length5 += intValue;
                                length6 += intValue;
                                size = i12 - 1;
                            }
                        } else {
                            boolean z19 = true;
                            int i22 = 0;
                            for (int i23 = 0; i23 <= min2; i23++) {
                                if (i23 < min2 && l(i23, i23, charSequence4, charSequence3)) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (z19 != z14 || i23 == min2) {
                                    if (i23 - i22 > 0) {
                                        if (z19) {
                                            k(iaVar, charSequence4.subSequence(i22, i23), i22, i23);
                                        } else {
                                            k(p6Var, charSequence4.subSequence(i22, i23), i22, i23);
                                            k(p6Var2, charSequence3.subSequence(i22, i23), i22, i23);
                                        }
                                    }
                                    i22 = i23;
                                    z19 = z14;
                                }
                            }
                            if (charSequence4.length() - min2 > 0) {
                                k(p6Var, charSequence4.subSequence(min2, charSequence4.length()), min2, charSequence4.length());
                            }
                            if (charSequence3.length() - min2 > 0) {
                                k(p6Var2, charSequence3.subSequence(min2, charSequence3.length()), min2, charSequence3.length());
                            }
                        }
                    } else {
                        int min3 = Math.min(charSequence4.length(), charSequence3.length());
                        boolean z20 = true;
                        int i24 = 0;
                        int i25 = 0;
                        int i26 = 0;
                        int i27 = 0;
                        while (i24 <= min3) {
                            if (i24 < min3 && l(i24, i25, charSequence4, charSequence3)) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z20 == z13 && i24 != min3) {
                                i11 = min3;
                            } else {
                                if (i24 == min3) {
                                    i24 = charSequence4.length();
                                    i25 = charSequence3.length();
                                }
                                i11 = min3;
                                int i28 = i24 - i26;
                                boolean z21 = z20;
                                int i29 = i25 - i27;
                                if (i28 > 0 || i29 > 0) {
                                    if (i28 == i29 && z21) {
                                        iaVar.d(charSequence4.subSequence(i26, i24));
                                    } else {
                                        if (i28 > 0) {
                                            k(p6Var, charSequence4.subSequence(i26, i24), i26, i24);
                                        }
                                        if (i29 > 0) {
                                            k(p6Var2, charSequence3.subSequence(i27, i25), i27, i25);
                                        }
                                    }
                                }
                                i26 = i24;
                                i27 = i25;
                                z20 = z13;
                            }
                            if (z13) {
                                i25++;
                            }
                            i24++;
                            min3 = i11;
                        }
                    }
                }
                if (this.f28758n != null) {
                    int i30 = 0;
                    while (true) {
                        o6[] o6VarArr = this.f28758n;
                        if (i30 >= o6VarArr.length) {
                            break;
                        }
                        o6 o6Var = o6VarArr[i30];
                        r6 r6Var = o6Var.f27859i;
                        if (r6Var.getCallback() instanceof View) {
                            b6.release((View) r6Var.getCallback(), o6Var.f27854a);
                        }
                        i30++;
                    }
                }
                this.f28758n = null;
                o6[] o6VarArr2 = this.h;
                if (o6VarArr2 == null || o6VarArr2.length != arrayList.size()) {
                    this.h = new o6[arrayList.size()];
                }
                arrayList.toArray(this.h);
                b();
                o6[] o6VarArr3 = this.f28758n;
                if (o6VarArr3 == null || o6VarArr3.length != arrayList2.size()) {
                    this.f28758n = new o6[arrayList2.size()];
                }
                arrayList2.toArray(this.f28758n);
                ValueAnimator valueAnimator2 = this.f28764t;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.f28763s = z11;
                this.f28762r = 0.0f;
                this.f28761q = 0.0f;
                this.f28764t = ValueAnimator.ofFloat(0.0f, 1.0f);
                Runnable runnable = this.f28749b0;
                if (runnable != null) {
                    runnable.run();
                }
                this.f28764t.addUpdateListener(new n6(this, 0));
                this.f28764t.addListener(new l6(this, i10));
                this.f28764t.setStartDelay(0L);
                this.f28764t.setDuration(this.f28766w);
                this.f28764t.setInterpolator(f28745c0);
                this.f28764t.start();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator3 = this.f28764t;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.f28764t = null;
        this.f28765u = null;
        this.v = false;
        this.f28762r = 0.0f;
        this.f28761q = 0.0f;
        if (!charSequence2.equals(this.f28753i)) {
            if (this.f28758n != null) {
                int i31 = 0;
                while (true) {
                    o6[] o6VarArr4 = this.f28758n;
                    if (i31 >= o6VarArr4.length) {
                        break;
                    }
                    o6 o6Var2 = o6VarArr4[i31];
                    r6 r6Var2 = o6Var2.f27859i;
                    if (r6Var2.getCallback() instanceof View) {
                        b6.release((View) r6Var2.getCallback(), o6Var2.f27854a);
                    }
                    i31++;
                }
            }
            this.f28758n = null;
            this.h = r0;
            this.f28753i = charSequence2;
            f7 = 0.0f;
            o6[] o6VarArr5 = {new o6(this, j(i13, charSequence2), 0.0f, -1)};
            o6 o6Var3 = this.h[0];
            this.d = o6Var3.f27857f;
            this.f28752g = 0.0f;
            this.f28751f = 0.0f;
            this.e = 0.0f;
            f(o6Var3);
            this.f28750c = AndroidUtilities.isRTL(this.f28753i);
        } else {
            f7 = 0.0f;
        }
        b();
        this.f28759o = null;
        this.f28754j = f7;
        this.f28757m = f7;
        this.f28756l = f7;
        this.f28755k = f7;
        invalidateSelf();
        Runnable runnable2 = this.f28749b0;
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    public final void u(int i10) {
        this.f28746a.setColor(i10);
        this.B = Color.alpha(i10);
    }

    public final void v(int i10, boolean z10) {
        ValueAnimator valueAnimator = this.Y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Y = null;
        }
        if (!z10) {
            u(i10);
            return;
        }
        int color = this.f28746a.getColor();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Y = ofFloat;
        ofFloat.addUpdateListener(new di.b5(this, color, i10, 2));
        this.Y.addListener(new fi.v2(this, i10, 4));
        this.Y.setDuration(240L);
        this.Y.setInterpolator(es.h);
        this.Y.start();
    }

    public final void w(float f7) {
        TextPaint textPaint = this.f28746a;
        float textSize = textPaint.getTextSize();
        textPaint.setTextSize(f7);
        if (Math.abs(textSize - f7) > 0.5f) {
            int i10 = this.M;
            if (i10 <= 0) {
                i10 = this.C.width();
            }
            int i11 = 0;
            if (this.h != null) {
                this.d = 0.0f;
                this.f28752g = 0.0f;
                this.f28751f = 0.0f;
                this.e = 0.0f;
                int i12 = 0;
                while (true) {
                    o6[] o6VarArr = this.h;
                    if (i12 >= o6VarArr.length) {
                        break;
                    }
                    StaticLayout j10 = j(i10 - ((int) Math.ceil(Math.min(this.d, this.f28754j))), o6VarArr[i12].f27855b.getText());
                    o6[] o6VarArr2 = this.h;
                    o6 o6Var = o6VarArr2[i12];
                    o6VarArr2[i12] = new o6(this, j10, o6Var.f27856c, o6Var.d);
                    float f10 = this.d;
                    o6 o6Var2 = this.h[i12];
                    this.d = f10 + o6Var2.f27857f;
                    f(o6Var2);
                    i12++;
                }
            }
            if (this.f28758n != null) {
                this.f28754j = 0.0f;
                this.f28757m = 0.0f;
                this.f28756l = 0.0f;
                this.f28755k = 0.0f;
                while (true) {
                    o6[] o6VarArr3 = this.f28758n;
                    if (i11 >= o6VarArr3.length) {
                        break;
                    }
                    StaticLayout j11 = j(i10 - ((int) Math.ceil(Math.min(this.d, this.f28754j))), o6VarArr3[i11].f27855b.getText());
                    o6[] o6VarArr4 = this.f28758n;
                    o6 o6Var3 = o6VarArr4[i11];
                    o6VarArr4[i11] = new o6(this, j11, o6Var3.f27856c, o6Var3.d);
                    float f11 = this.f28754j;
                    o6 o6Var4 = this.f28758n[i11];
                    this.f28754j = f11 + o6Var4.f27857f;
                    g(o6Var4);
                    i11++;
                }
            }
            invalidateSelf();
        }
    }

    public final void x(Typeface typeface) {
        this.f28746a.setTypeface(typeface);
    }

    public r6(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f28746a = new TextPaint(1);
        this.f28748b = 0;
        this.f28750c = false;
        this.f28760p = 0;
        this.f28761q = 0.0f;
        this.f28762r = 0.0f;
        this.f28763s = true;
        this.f28766w = 320L;
        this.f28767x = es.h;
        this.f28768y = -1.0f;
        this.f28769z = 0.3f;
        this.A = 0.0f;
        this.B = 255;
        this.C = new Rect();
        this.S = true;
        this.T = true;
        this.U = false;
        this.D = z10;
        this.E = z11;
        this.F = z12;
        this.G = z13;
        this.H = z14;
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.C.set(i10, i11, i12, i13);
    }
}
