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
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public class n6 extends Drawable {
    public boolean A;
    public boolean B;
    public rg C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public float H;
    public boolean I;
    public LinearGradient J;
    public Matrix K;
    public Paint L;
    public boolean M;
    public boolean N;
    public boolean O;
    public float P;
    public float Q;
    public int R;
    public ValueAnimator S;
    public int T;
    public ColorFilter U;
    public Runnable V;
    public final TextPaint f25424a;
    public int f25425b;
    public boolean f25426c;
    public float d;
    public float e;
    public k6[] f25427f;
    public CharSequence f25428g;
    public float h;
    public float f25429i;
    public k6[] f25430j;
    public CharSequence f25431k;
    public int f25432l;
    public float f25433m;
    public boolean f25434n;
    public ValueAnimator f25435o;
    public CharSequence f25436p;
    public boolean f25437q;
    public long f25438r;
    public TimeInterpolator f25439s;
    public float f25440t;
    public float f25441u;
    public float v;
    public int f25442w;
    public final Rect f25443x;
    public boolean f25444y;
    public boolean f25445z;

    public n6(int i10) {
        this(false, true, true, false);
    }

    public static boolean j(int r2, int r3, java.lang.CharSequence r4, java.lang.CharSequence r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n6.j(int, int, java.lang.CharSequence, java.lang.CharSequence):boolean");
    }

    public final void a(float f7) {
        TextPaint textPaint = this.f25424a;
        textPaint.setAlpha((int) (this.f25442w * f7));
        if (this.O) {
            textPaint.setShadowLayer(this.P, 0.0f, this.Q, org.telegram.ui.ActionBar.j6.l1(f7, this.R));
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f25435o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void c() {
        if (this.f25430j != null) {
            int i10 = 0;
            while (true) {
                k6[] k6VarArr = this.f25430j;
                if (i10 >= k6VarArr.length) {
                    break;
                }
                k6 k6Var = k6VarArr[i10];
                n6 n6Var = k6Var.f24618g;
                if (n6Var.getCallback() instanceof View) {
                    y5.release((View) n6Var.getCallback(), k6Var.f24614a);
                }
                i10++;
            }
        }
        this.f25430j = null;
    }

    public final float d() {
        if (this.f25427f != null && this.f25430j != null) {
            return AndroidUtilities.lerp(this.h, this.d, this.f25433m);
        }
        return this.d;
    }

    @Override
    public final void draw(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n6.draw(android.graphics.Canvas):void");
    }

    public final float e() {
        return Math.max(this.d, this.h);
    }

    public final boolean f() {
        ValueAnimator valueAnimator = this.f25435o;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final float g() {
        float f7;
        CharSequence charSequence = this.f25431k;
        float f10 = 0.0f;
        float f11 = 1.0f;
        if (charSequence != null && charSequence.length() > 0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        CharSequence charSequence2 = this.f25428g;
        if (charSequence2 != null && charSequence2.length() > 0) {
            f10 = 1.0f;
        }
        if (this.f25431k != null) {
            f11 = this.f25433m;
        }
        return AndroidUtilities.lerp(f7, f10, f11);
    }

    @Override
    public final Rect getDirtyBounds() {
        return this.f25443x;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final StaticLayout h(int i10, CharSequence charSequence) {
        if (i10 <= 0) {
            Point point = AndroidUtilities.displaySize;
            i10 = Math.min(point.x, point.y);
        }
        int i11 = i10;
        int i12 = Build.VERSION.SDK_INT;
        TextPaint textPaint = this.f25424a;
        if (i12 >= 23) {
            return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i11).setMaxLines(1).setLineSpacing(0.0f, 1.0f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i11).setIncludePad(this.M).build();
        }
        return new StaticLayout(charSequence, 0, charSequence.length(), textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, this.M, TextUtils.TruncateAt.END, i11);
    }

    public final void i(l6 l6Var, CharSequence charSequence, int i10, int i11) {
        if (this.B && charSequence.length() > 1) {
            int i12 = 0;
            while (i12 < charSequence.length()) {
                int i13 = i12 + 1;
                l6Var.c(charSequence.subSequence(i12, i13));
                i12 = i13;
            }
            return;
        }
        l6Var.c(charSequence);
    }

    public final void k(float f7, long j3, TimeInterpolator timeInterpolator) {
        this.f25441u = f7;
        this.f25438r = j3;
        this.f25440t = 1.0f;
        this.f25439s = timeInterpolator;
    }

    public final void l(float f7, float f10, float f11, float f12) {
        int i10 = (int) f7;
        int i11 = (int) f10;
        int i12 = (int) f11;
        int i13 = (int) f12;
        super.setBounds(i10, i11, i12, i13);
        this.f25443x.set(i10, i11, i12, i13);
    }

    public final void m(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void n(boolean z10) {
        this.I = z10;
        invalidateSelf();
    }

    public final void o(boolean z10, boolean z11, boolean z12) {
        this.f25444y = z10;
        this.f25445z = true;
        this.A = z11;
        this.B = z12;
    }

    public final void p(float f7, float f10, int i10) {
        this.O = true;
        this.P = f7;
        this.Q = f10;
        this.R = i10;
        this.f25424a.setShadowLayer(f7, 0.0f, f10, i10);
    }

    public final void q(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        CharSequence charSequence2;
        k6 k6Var;
        CharSequence charSequence3;
        CharSequence charSequence4;
        boolean z13;
        int i10;
        boolean z14;
        boolean z15;
        int i11;
        boolean z16;
        if (this.f25428g != null && charSequence != null) {
            z12 = z10;
        } else {
            z12 = false;
        }
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence;
        }
        int i12 = this.G;
        if (i12 <= 0) {
            i12 = this.f25443x.width();
        }
        boolean z17 = true;
        if (z12) {
            if (!TextUtils.equals(charSequence2, this.f25428g)) {
                if (this.D) {
                    ValueAnimator valueAnimator = this.f25435o;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f25435o = null;
                    }
                } else if (f()) {
                    this.f25436p = charSequence2;
                    this.f25437q = z11;
                    return;
                }
                this.f25431k = this.f25428g;
                this.f25428g = charSequence2;
                final ArrayList arrayList = new ArrayList();
                final int i13 = i12;
                final ArrayList arrayList2 = new ArrayList();
                this.e = 0.0f;
                this.d = 0.0f;
                this.f25429i = 0.0f;
                this.h = 0.0f;
                this.f25426c = AndroidUtilities.isRTL(this.f25428g);
                org.telegram.ui.ea eaVar = new org.telegram.ui.ea(this, i13, arrayList2, arrayList, 1);
                l6 l6Var = new l6(this) {
                    public final n6 f23908b;

                    {
                        this.f23908b = this;
                    }

                    @Override
                    public final void c(CharSequence charSequence5) {
                        StaticLayout h;
                        StaticLayout h10;
                        switch (r4) {
                            case 0:
                                n6 n6Var = this.f23908b;
                                k6 k6Var2 = new k6(n6Var, n6Var.h(i13 - ((int) Math.ceil(n6Var.d)), charSequence5), n6Var.d, -1);
                                arrayList.add(k6Var2);
                                n6Var.d += k6Var2.f24617f;
                                n6Var.e = Math.max(n6Var.e, h.getHeight());
                                return;
                            default:
                                n6 n6Var2 = this.f23908b;
                                k6 k6Var3 = new k6(n6Var2, n6Var2.h(i13 - ((int) Math.ceil(n6Var2.h)), charSequence5), n6Var2.h, -1);
                                arrayList.add(k6Var3);
                                n6Var2.h += k6Var3.f24617f;
                                n6Var2.f25429i = Math.max(n6Var2.f25429i, h10.getHeight());
                                return;
                        }
                    }
                };
                l6 l6Var2 = new l6(this) {
                    public final n6 f23908b;

                    {
                        this.f23908b = this;
                    }

                    @Override
                    public final void c(CharSequence charSequence5) {
                        StaticLayout h;
                        StaticLayout h10;
                        switch (r4) {
                            case 0:
                                n6 n6Var = this.f23908b;
                                k6 k6Var2 = new k6(n6Var, n6Var.h(i13 - ((int) Math.ceil(n6Var.d)), charSequence5), n6Var.d, -1);
                                arrayList2.add(k6Var2);
                                n6Var.d += k6Var2.f24617f;
                                n6Var.e = Math.max(n6Var.e, h.getHeight());
                                return;
                            default:
                                n6 n6Var2 = this.f23908b;
                                k6 k6Var3 = new k6(n6Var2, n6Var2.h(i13 - ((int) Math.ceil(n6Var2.h)), charSequence5), n6Var2.h, -1);
                                arrayList2.add(k6Var3);
                                n6Var2.h += k6Var3.f24617f;
                                n6Var2.f25429i = Math.max(n6Var2.f25429i, h10.getHeight());
                                return;
                        }
                    }
                };
                if (this.f25444y) {
                    charSequence3 = new m6(this.f25431k);
                } else {
                    charSequence3 = this.f25431k;
                }
                if (this.f25444y) {
                    charSequence4 = new m6(this.f25428g);
                } else {
                    charSequence4 = this.f25428g;
                }
                if (this.F) {
                    i(l6Var2, charSequence3, 0, charSequence3.length());
                    i(l6Var, charSequence4, 0, charSequence4.length());
                } else if (this.f25445z) {
                    int min = Math.min(charSequence4.length(), charSequence3.length());
                    if (this.A) {
                        ArrayList arrayList3 = new ArrayList();
                        boolean z18 = true;
                        int i14 = 0;
                        for (int i15 = 0; i15 <= min; i15++) {
                            int length = (charSequence4.length() - i15) - 1;
                            int length2 = (charSequence3.length() - i15) - 1;
                            if (length >= 0 && length2 >= 0 && j(length, length2, charSequence4, charSequence3)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (z17 != z16 || i15 == min) {
                                int i16 = i15 - i14;
                                if (i16 > 0) {
                                    if (arrayList3.size() != 0) {
                                        z17 = z18;
                                    }
                                    arrayList3.add(Integer.valueOf(i16));
                                    z18 = z17;
                                }
                                z17 = z16;
                                i14 = i15;
                            }
                        }
                        int length3 = charSequence4.length() - min;
                        int length4 = charSequence3.length() - min;
                        if (length3 > 0) {
                            i(l6Var, charSequence4.subSequence(0, length3), 0, length3);
                        }
                        if (length4 > 0) {
                            i(l6Var2, charSequence3.subSequence(0, length4), 0, length4);
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
                                    eaVar.c(charSequence4.subSequence(length3, length3 + intValue));
                                } else {
                                    eaVar.c(charSequence3.subSequence(length4, length4 + intValue));
                                }
                            } else {
                                i11 = size;
                                int i17 = length3 + intValue;
                                i(l6Var, charSequence4.subSequence(length3, i17), length3, i17);
                                int i18 = length4 + intValue;
                                i(l6Var2, charSequence3.subSequence(length4, i18), length4, i18);
                            }
                            length3 += intValue;
                            length4 += intValue;
                            size = i11 - 1;
                        }
                    } else {
                        int i19 = 0;
                        boolean z19 = true;
                        for (int i20 = 0; i20 <= min; i20++) {
                            if (i20 < min && j(i20, i20, charSequence4, charSequence3)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z19 != z14 || i20 == min) {
                                if (i20 - i19 > 0) {
                                    if (z19) {
                                        i(eaVar, charSequence4.subSequence(i19, i20), i19, i20);
                                    } else {
                                        i(l6Var, charSequence4.subSequence(i19, i20), i19, i20);
                                        i(l6Var2, charSequence3.subSequence(i19, i20), i19, i20);
                                    }
                                }
                                i19 = i20;
                                z19 = z14;
                            }
                        }
                        if (charSequence4.length() - min > 0) {
                            i(l6Var, charSequence4.subSequence(min, charSequence4.length()), min, charSequence4.length());
                        }
                        if (charSequence3.length() - min > 0) {
                            i(l6Var2, charSequence3.subSequence(min, charSequence3.length()), min, charSequence3.length());
                        }
                    }
                } else {
                    int min2 = Math.min(charSequence4.length(), charSequence3.length());
                    int i21 = 0;
                    int i22 = 0;
                    int i23 = 0;
                    int i24 = 0;
                    boolean z20 = true;
                    while (i21 <= min2) {
                        if (i21 < min2 && j(i21, i22, charSequence4, charSequence3)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z20 == z13 && i21 != min2) {
                            i10 = min2;
                        } else {
                            if (i21 == min2) {
                                i21 = charSequence4.length();
                                i22 = charSequence3.length();
                            }
                            i10 = min2;
                            int i25 = i21 - i23;
                            boolean z21 = z20;
                            int i26 = i22 - i24;
                            if (i25 > 0 || i26 > 0) {
                                if (i25 == i26 && z21) {
                                    eaVar.c(charSequence4.subSequence(i23, i21));
                                } else {
                                    if (i25 > 0) {
                                        i(l6Var, charSequence4.subSequence(i23, i21), i23, i21);
                                    }
                                    if (i26 > 0) {
                                        i(l6Var2, charSequence3.subSequence(i24, i22), i24, i22);
                                    }
                                }
                            }
                            i23 = i21;
                            i24 = i22;
                            z20 = z13;
                        }
                        if (z13) {
                            i22++;
                        }
                        i21++;
                        min2 = i10;
                    }
                }
                if (this.f25430j != null) {
                    int i27 = 0;
                    while (true) {
                        k6[] k6VarArr = this.f25430j;
                        if (i27 >= k6VarArr.length) {
                            break;
                        }
                        k6 k6Var2 = k6VarArr[i27];
                        n6 n6Var = k6Var2.f24618g;
                        if (n6Var.getCallback() instanceof View) {
                            y5.release((View) n6Var.getCallback(), k6Var2.f24614a);
                        }
                        i27++;
                    }
                }
                this.f25430j = null;
                k6[] k6VarArr2 = this.f25427f;
                if (k6VarArr2 == null || k6VarArr2.length != arrayList.size()) {
                    this.f25427f = new k6[arrayList.size()];
                }
                arrayList.toArray(this.f25427f);
                c();
                k6[] k6VarArr3 = this.f25430j;
                if (k6VarArr3 == null || k6VarArr3.length != arrayList2.size()) {
                    this.f25430j = new k6[arrayList2.size()];
                }
                arrayList2.toArray(this.f25430j);
                ValueAnimator valueAnimator2 = this.f25435o;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.f25434n = z11;
                this.f25433m = 0.0f;
                this.f25435o = ValueAnimator.ofFloat(0.0f, 1.0f);
                Runnable runnable = this.V;
                if (runnable != null) {
                    runnable.run();
                }
                this.f25435o.addUpdateListener(new j6(this, 0));
                this.f25435o.addListener(new org.telegram.ui.Cells.v5(this, 18));
                this.f25435o.setStartDelay(0L);
                this.f25435o.setDuration(this.f25438r);
                this.f25435o.setInterpolator(this.f25439s);
                this.f25435o.start();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator3 = this.f25435o;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.f25435o = null;
        this.f25436p = null;
        this.f25437q = false;
        this.f25433m = 0.0f;
        if (!charSequence2.equals(this.f25428g)) {
            if (this.f25430j != null) {
                int i28 = 0;
                while (true) {
                    k6[] k6VarArr4 = this.f25430j;
                    if (i28 >= k6VarArr4.length) {
                        break;
                    }
                    k6 k6Var3 = k6VarArr4[i28];
                    n6 n6Var2 = k6Var3.f24618g;
                    if (n6Var2.getCallback() instanceof View) {
                        y5.release((View) n6Var2.getCallback(), k6Var3.f24614a);
                    }
                    i28++;
                }
            }
            this.f25430j = null;
            this.f25427f = r0;
            this.f25428g = charSequence2;
            k6[] k6VarArr5 = {new k6(this, h(i12, charSequence2), 0.0f, -1)};
            this.d = this.f25427f[0].f24617f;
            this.e = k6Var.f24615b.getHeight();
            this.f25426c = AndroidUtilities.isRTL(this.f25428g);
        }
        c();
        this.f25431k = null;
        this.h = 0.0f;
        this.f25429i = 0.0f;
        invalidateSelf();
        Runnable runnable2 = this.V;
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    public final void r(int i10) {
        this.f25424a.setColor(i10);
        this.f25442w = Color.alpha(i10);
    }

    public final void s(int i10, boolean z10) {
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.S = null;
        }
        if (!z10) {
            r(i10);
            return;
        }
        int color = this.f25424a.getColor();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.S = ofFloat;
        ofFloat.addUpdateListener(new bi.z5(this, color, i10, 2));
        this.S.addListener(new di.y2(this, i10, 4));
        this.S.setDuration(240L);
        this.S.setInterpolator(wr.h);
        this.S.start();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f25442w = i10;
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.f25443x.set(rect);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f25424a.setColorFilter(colorFilter);
    }

    public final void t(float f7) {
        TextPaint textPaint = this.f25424a;
        float textSize = textPaint.getTextSize();
        textPaint.setTextSize(f7);
        if (Math.abs(textSize - f7) > 0.5f) {
            int i10 = this.G;
            if (i10 <= 0) {
                i10 = this.f25443x.width();
            }
            int i11 = 0;
            if (this.f25427f != null) {
                this.d = 0.0f;
                this.e = 0.0f;
                int i12 = 0;
                while (true) {
                    k6[] k6VarArr = this.f25427f;
                    if (i12 >= k6VarArr.length) {
                        break;
                    }
                    StaticLayout h = h(i10 - ((int) Math.ceil(Math.min(this.d, this.h))), k6VarArr[i12].f24615b.getText());
                    k6[] k6VarArr2 = this.f25427f;
                    k6 k6Var = k6VarArr2[i12];
                    k6VarArr2[i12] = new k6(this, h, k6Var.f24616c, k6Var.d);
                    float f10 = this.d;
                    k6 k6Var2 = this.f25427f[i12];
                    this.d = f10 + k6Var2.f24617f;
                    this.e = Math.max(this.e, k6Var2.f24615b.getHeight());
                    i12++;
                }
            }
            if (this.f25430j != null) {
                this.h = 0.0f;
                this.f25429i = 0.0f;
                while (true) {
                    k6[] k6VarArr3 = this.f25430j;
                    if (i11 >= k6VarArr3.length) {
                        break;
                    }
                    StaticLayout h10 = h(i10 - ((int) Math.ceil(Math.min(this.d, this.h))), k6VarArr3[i11].f24615b.getText());
                    k6[] k6VarArr4 = this.f25430j;
                    k6 k6Var3 = k6VarArr4[i11];
                    k6VarArr4[i11] = new k6(this, h10, k6Var3.f24616c, k6Var3.d);
                    float f11 = this.h;
                    k6 k6Var4 = this.f25430j[i11];
                    this.h = f11 + k6Var4.f24617f;
                    this.f25429i = Math.max(this.f25429i, k6Var4.f24615b.getHeight());
                    i11++;
                }
            }
            invalidateSelf();
        }
    }

    public final void u(Typeface typeface) {
        this.f25424a.setTypeface(typeface);
    }

    public n6(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f25424a = new TextPaint(1);
        this.f25425b = 0;
        this.f25426c = false;
        this.f25432l = 0;
        this.f25433m = 0.0f;
        this.f25434n = true;
        this.f25438r = 320L;
        this.f25439s = wr.h;
        this.f25440t = -1.0f;
        this.f25441u = 0.3f;
        this.v = 0.0f;
        this.f25442w = 255;
        this.f25443x = new Rect();
        this.M = true;
        this.N = true;
        this.O = false;
        this.f25444y = z10;
        this.f25445z = z11;
        this.A = z12;
        this.B = z13;
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f25443x.set(i10, i11, i12, i13);
    }
}
