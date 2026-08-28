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
public class i6 extends Drawable {
    public boolean A;
    public boolean B;
    public fg C;
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
    public final TextPaint f29332a;
    public int f29333b;
    public boolean f29334c;
    public float d;
    public float f29335e;
    public f6[] f29336f;
    public CharSequence f29337g;
    public float h;
    public float f29338i;
    public f6[] f29339j;
    public CharSequence f29340k;
    public int f29341l;
    public float f29342m;
    public boolean f29343n;
    public ValueAnimator f29344o;
    public CharSequence f29345p;
    public boolean f29346q;
    public long f29347r;
    public TimeInterpolator f29348s;
    public float f29349t;
    public float f29350u;
    public float v;
    public int f29351w;
    public final Rect f29352x;
    public boolean f29353y;
    public boolean f29354z;

    public i6(int i9) {
        this(false, true, true, false);
    }

    public static boolean j(int r2, int r3, java.lang.CharSequence r4, java.lang.CharSequence r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i6.j(int, int, java.lang.CharSequence, java.lang.CharSequence):boolean");
    }

    public final void a(float f10) {
        TextPaint textPaint = this.f29332a;
        textPaint.setAlpha((int) (this.f29351w * f10));
        if (this.O) {
            textPaint.setShadowLayer(this.P, 0.0f, this.Q, org.telegram.ui.ActionBar.f6.l1(f10, this.R));
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f29344o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void c() {
        if (this.f29339j != null) {
            int i9 = 0;
            while (true) {
                f6[] f6VarArr = this.f29339j;
                if (i9 >= f6VarArr.length) {
                    break;
                }
                f6 f6Var = f6VarArr[i9];
                i6 i6Var = f6Var.f28313g;
                if (i6Var.getCallback() instanceof View) {
                    t5.release((View) i6Var.getCallback(), f6Var.f28308a);
                }
                i9++;
            }
        }
        this.f29339j = null;
    }

    public final float d() {
        if (this.f29336f != null && this.f29339j != null) {
            return AndroidUtilities.lerp(this.h, this.d, this.f29342m);
        }
        return this.d;
    }

    @Override
    public final void draw(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i6.draw(android.graphics.Canvas):void");
    }

    public final float e() {
        return Math.max(this.d, this.h);
    }

    public final boolean f() {
        ValueAnimator valueAnimator = this.f29344o;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final float g() {
        float f10;
        CharSequence charSequence = this.f29340k;
        float f11 = 0.0f;
        float f12 = 1.0f;
        if (charSequence != null && charSequence.length() > 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        CharSequence charSequence2 = this.f29337g;
        if (charSequence2 != null && charSequence2.length() > 0) {
            f11 = 1.0f;
        }
        if (this.f29340k != null) {
            f12 = this.f29342m;
        }
        return AndroidUtilities.lerp(f10, f11, f12);
    }

    @Override
    public final Rect getDirtyBounds() {
        return this.f29352x;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final StaticLayout h(int i9, CharSequence charSequence) {
        if (i9 <= 0) {
            Point point = AndroidUtilities.displaySize;
            i9 = Math.min(point.x, point.y);
        }
        int i10 = i9;
        int i11 = Build.VERSION.SDK_INT;
        TextPaint textPaint = this.f29332a;
        if (i11 >= 23) {
            return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setMaxLines(1).setLineSpacing(0.0f, 1.0f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i10).setIncludePad(this.M).build();
        }
        return new StaticLayout(charSequence, 0, charSequence.length(), textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, this.M, TextUtils.TruncateAt.END, i10);
    }

    public final void i(g6 g6Var, CharSequence charSequence, int i9, int i10) {
        if (this.B && charSequence.length() > 1) {
            int i11 = 0;
            while (i11 < charSequence.length()) {
                int i12 = i11 + 1;
                g6Var.b(charSequence.subSequence(i11, i12));
                i11 = i12;
            }
            return;
        }
        g6Var.b(charSequence);
    }

    public final void k(float f10, long j10, TimeInterpolator timeInterpolator) {
        this.f29350u = f10;
        this.f29347r = j10;
        this.f29349t = 1.0f;
        this.f29348s = timeInterpolator;
    }

    public final void l(float f10, float f11, float f12, float f13) {
        int i9 = (int) f10;
        int i10 = (int) f11;
        int i11 = (int) f12;
        int i12 = (int) f13;
        super.setBounds(i9, i10, i11, i12);
        this.f29352x.set(i9, i10, i11, i12);
    }

    public final void m(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void n(boolean z10) {
        this.I = z10;
        invalidateSelf();
    }

    public final void o(boolean z10, boolean z11, boolean z12) {
        this.f29353y = z10;
        this.f29354z = true;
        this.A = z11;
        this.B = z12;
    }

    public final void p(float f10, float f11, int i9) {
        this.O = true;
        this.P = f10;
        this.Q = f11;
        this.R = i9;
        this.f29332a.setShadowLayer(f10, 0.0f, f11, i9);
    }

    public final void q(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        CharSequence charSequence2;
        f6 f6Var;
        CharSequence charSequence3;
        CharSequence charSequence4;
        boolean z13;
        int i9;
        boolean z14;
        boolean z15;
        int i10;
        boolean z16;
        if (this.f29337g != null && charSequence != null) {
            z12 = z10;
        } else {
            z12 = false;
        }
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence;
        }
        final int i11 = this.G;
        if (i11 <= 0) {
            i11 = this.f29352x.width();
        }
        boolean z17 = true;
        if (z12) {
            if (!TextUtils.equals(charSequence2, this.f29337g)) {
                if (this.D) {
                    ValueAnimator valueAnimator = this.f29344o;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f29344o = null;
                    }
                } else if (f()) {
                    this.f29345p = charSequence2;
                    this.f29346q = z11;
                    return;
                }
                this.f29340k = this.f29337g;
                this.f29337g = charSequence2;
                final ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                this.f29335e = 0.0f;
                this.d = 0.0f;
                this.f29338i = 0.0f;
                this.h = 0.0f;
                this.f29334c = AndroidUtilities.isRTL(this.f29337g);
                bg.d0 d0Var = new bg.d0(this, i11, arrayList2, arrayList);
                g6 g6Var = new g6(this) {
                    public final i6 f27662b;

                    {
                        this.f27662b = this;
                    }

                    @Override
                    public final void b(CharSequence charSequence5) {
                        StaticLayout h;
                        StaticLayout h10;
                        switch (r4) {
                            case 0:
                                i6 i6Var = this.f27662b;
                                f6 f6Var2 = new f6(i6Var, i6Var.h(i11 - ((int) Math.ceil(i6Var.d)), charSequence5), i6Var.d, -1);
                                arrayList.add(f6Var2);
                                i6Var.d += f6Var2.f28312f;
                                i6Var.f29335e = Math.max(i6Var.f29335e, h.getHeight());
                                return;
                            default:
                                i6 i6Var2 = this.f27662b;
                                f6 f6Var3 = new f6(i6Var2, i6Var2.h(i11 - ((int) Math.ceil(i6Var2.h)), charSequence5), i6Var2.h, -1);
                                arrayList.add(f6Var3);
                                i6Var2.h += f6Var3.f28312f;
                                i6Var2.f29338i = Math.max(i6Var2.f29338i, h10.getHeight());
                                return;
                        }
                    }
                };
                g6 g6Var2 = new g6(this) {
                    public final i6 f27662b;

                    {
                        this.f27662b = this;
                    }

                    @Override
                    public final void b(CharSequence charSequence5) {
                        StaticLayout h;
                        StaticLayout h10;
                        switch (r4) {
                            case 0:
                                i6 i6Var = this.f27662b;
                                f6 f6Var2 = new f6(i6Var, i6Var.h(i11 - ((int) Math.ceil(i6Var.d)), charSequence5), i6Var.d, -1);
                                arrayList2.add(f6Var2);
                                i6Var.d += f6Var2.f28312f;
                                i6Var.f29335e = Math.max(i6Var.f29335e, h.getHeight());
                                return;
                            default:
                                i6 i6Var2 = this.f27662b;
                                f6 f6Var3 = new f6(i6Var2, i6Var2.h(i11 - ((int) Math.ceil(i6Var2.h)), charSequence5), i6Var2.h, -1);
                                arrayList2.add(f6Var3);
                                i6Var2.h += f6Var3.f28312f;
                                i6Var2.f29338i = Math.max(i6Var2.f29338i, h10.getHeight());
                                return;
                        }
                    }
                };
                if (this.f29353y) {
                    charSequence3 = new h6(this.f29340k);
                } else {
                    charSequence3 = this.f29340k;
                }
                if (this.f29353y) {
                    charSequence4 = new h6(this.f29337g);
                } else {
                    charSequence4 = this.f29337g;
                }
                if (this.F) {
                    i(g6Var2, charSequence3, 0, charSequence3.length());
                    i(g6Var, charSequence4, 0, charSequence4.length());
                } else if (this.f29354z) {
                    int min = Math.min(charSequence4.length(), charSequence3.length());
                    if (this.A) {
                        ArrayList arrayList3 = new ArrayList();
                        boolean z18 = true;
                        int i12 = 0;
                        for (int i13 = 0; i13 <= min; i13++) {
                            int length = (charSequence4.length() - i13) - 1;
                            int length2 = (charSequence3.length() - i13) - 1;
                            if (length >= 0 && length2 >= 0 && j(length, length2, charSequence4, charSequence3)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (z17 != z16 || i13 == min) {
                                int i14 = i13 - i12;
                                if (i14 > 0) {
                                    if (arrayList3.size() != 0) {
                                        z17 = z18;
                                    }
                                    arrayList3.add(Integer.valueOf(i14));
                                    z18 = z17;
                                }
                                z17 = z16;
                                i12 = i13;
                            }
                        }
                        int length3 = charSequence4.length() - min;
                        int length4 = charSequence3.length() - min;
                        if (length3 > 0) {
                            i(g6Var, charSequence4.subSequence(0, length3), 0, length3);
                        }
                        if (length4 > 0) {
                            i(g6Var2, charSequence3.subSequence(0, length4), 0, length4);
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
                                i10 = size;
                                if (charSequence4.length() > charSequence3.length()) {
                                    d0Var.b(charSequence4.subSequence(length3, length3 + intValue));
                                } else {
                                    d0Var.b(charSequence3.subSequence(length4, length4 + intValue));
                                }
                            } else {
                                i10 = size;
                                int i15 = length3 + intValue;
                                i(g6Var, charSequence4.subSequence(length3, i15), length3, i15);
                                int i16 = length4 + intValue;
                                i(g6Var2, charSequence3.subSequence(length4, i16), length4, i16);
                            }
                            length3 += intValue;
                            length4 += intValue;
                            size = i10 - 1;
                        }
                    } else {
                        int i17 = 0;
                        boolean z19 = true;
                        for (int i18 = 0; i18 <= min; i18++) {
                            if (i18 < min && j(i18, i18, charSequence4, charSequence3)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z19 != z14 || i18 == min) {
                                if (i18 - i17 > 0) {
                                    if (z19) {
                                        i(d0Var, charSequence4.subSequence(i17, i18), i17, i18);
                                    } else {
                                        i(g6Var, charSequence4.subSequence(i17, i18), i17, i18);
                                        i(g6Var2, charSequence3.subSequence(i17, i18), i17, i18);
                                    }
                                }
                                i17 = i18;
                                z19 = z14;
                            }
                        }
                        if (charSequence4.length() - min > 0) {
                            i(g6Var, charSequence4.subSequence(min, charSequence4.length()), min, charSequence4.length());
                        }
                        if (charSequence3.length() - min > 0) {
                            i(g6Var2, charSequence3.subSequence(min, charSequence3.length()), min, charSequence3.length());
                        }
                    }
                } else {
                    int min2 = Math.min(charSequence4.length(), charSequence3.length());
                    int i19 = 0;
                    int i20 = 0;
                    int i21 = 0;
                    int i22 = 0;
                    boolean z20 = true;
                    while (i19 <= min2) {
                        if (i19 < min2 && j(i19, i20, charSequence4, charSequence3)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z20 == z13 && i19 != min2) {
                            i9 = min2;
                        } else {
                            if (i19 == min2) {
                                i19 = charSequence4.length();
                                i20 = charSequence3.length();
                            }
                            i9 = min2;
                            int i23 = i19 - i21;
                            boolean z21 = z20;
                            int i24 = i20 - i22;
                            if (i23 > 0 || i24 > 0) {
                                if (i23 == i24 && z21) {
                                    d0Var.b(charSequence4.subSequence(i21, i19));
                                } else {
                                    if (i23 > 0) {
                                        i(g6Var, charSequence4.subSequence(i21, i19), i21, i19);
                                    }
                                    if (i24 > 0) {
                                        i(g6Var2, charSequence3.subSequence(i22, i20), i22, i20);
                                    }
                                }
                            }
                            i21 = i19;
                            i22 = i20;
                            z20 = z13;
                        }
                        if (z13) {
                            i20++;
                        }
                        i19++;
                        min2 = i9;
                    }
                }
                if (this.f29339j != null) {
                    int i25 = 0;
                    while (true) {
                        f6[] f6VarArr = this.f29339j;
                        if (i25 >= f6VarArr.length) {
                            break;
                        }
                        f6 f6Var2 = f6VarArr[i25];
                        i6 i6Var = f6Var2.f28313g;
                        if (i6Var.getCallback() instanceof View) {
                            t5.release((View) i6Var.getCallback(), f6Var2.f28308a);
                        }
                        i25++;
                    }
                }
                this.f29339j = null;
                f6[] f6VarArr2 = this.f29336f;
                if (f6VarArr2 == null || f6VarArr2.length != arrayList.size()) {
                    this.f29336f = new f6[arrayList.size()];
                }
                arrayList.toArray(this.f29336f);
                c();
                f6[] f6VarArr3 = this.f29339j;
                if (f6VarArr3 == null || f6VarArr3.length != arrayList2.size()) {
                    this.f29339j = new f6[arrayList2.size()];
                }
                arrayList2.toArray(this.f29339j);
                ValueAnimator valueAnimator2 = this.f29344o;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.f29343n = z11;
                this.f29342m = 0.0f;
                this.f29344o = ValueAnimator.ofFloat(0.0f, 1.0f);
                Runnable runnable = this.V;
                if (runnable != null) {
                    runnable.run();
                }
                this.f29344o.addUpdateListener(new e6(this, 0));
                this.f29344o.addListener(new org.telegram.ui.xp(this, 4));
                this.f29344o.setStartDelay(0L);
                this.f29344o.setDuration(this.f29347r);
                this.f29344o.setInterpolator(this.f29348s);
                this.f29344o.start();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator3 = this.f29344o;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.f29344o = null;
        this.f29345p = null;
        this.f29346q = false;
        this.f29342m = 0.0f;
        if (!charSequence2.equals(this.f29337g)) {
            if (this.f29339j != null) {
                int i26 = 0;
                while (true) {
                    f6[] f6VarArr4 = this.f29339j;
                    if (i26 >= f6VarArr4.length) {
                        break;
                    }
                    f6 f6Var3 = f6VarArr4[i26];
                    i6 i6Var2 = f6Var3.f28313g;
                    if (i6Var2.getCallback() instanceof View) {
                        t5.release((View) i6Var2.getCallback(), f6Var3.f28308a);
                    }
                    i26++;
                }
            }
            this.f29339j = null;
            this.f29336f = r1;
            this.f29337g = charSequence2;
            f6[] f6VarArr5 = {new f6(this, h(i11, charSequence2), 0.0f, -1)};
            this.d = this.f29336f[0].f28312f;
            this.f29335e = f6Var.f28309b.getHeight();
            this.f29334c = AndroidUtilities.isRTL(this.f29337g);
        }
        c();
        this.f29340k = null;
        this.h = 0.0f;
        this.f29338i = 0.0f;
        invalidateSelf();
        Runnable runnable2 = this.V;
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    public final void r(int i9) {
        this.f29332a.setColor(i9);
        this.f29351w = Color.alpha(i9);
    }

    public final void s(int i9, boolean z10) {
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.S = null;
        }
        if (!z10) {
            r(i9);
            return;
        }
        int color = this.f29332a.getColor();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.S = ofFloat;
        ofFloat.addUpdateListener(new kh.v4(this, color, i9, 2));
        this.S.addListener(new mh.o2(this, i9, 3));
        this.S.setDuration(240L);
        this.S.setInterpolator(gr.h);
        this.S.start();
    }

    @Override
    public final void setAlpha(int i9) {
        this.f29351w = i9;
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.f29352x.set(rect);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29332a.setColorFilter(colorFilter);
    }

    public final void t(float f10) {
        TextPaint textPaint = this.f29332a;
        float textSize = textPaint.getTextSize();
        textPaint.setTextSize(f10);
        if (Math.abs(textSize - f10) > 0.5f) {
            int i9 = this.G;
            if (i9 <= 0) {
                i9 = this.f29352x.width();
            }
            int i10 = 0;
            if (this.f29336f != null) {
                this.d = 0.0f;
                this.f29335e = 0.0f;
                int i11 = 0;
                while (true) {
                    f6[] f6VarArr = this.f29336f;
                    if (i11 >= f6VarArr.length) {
                        break;
                    }
                    StaticLayout h = h(i9 - ((int) Math.ceil(Math.min(this.d, this.h))), f6VarArr[i11].f28309b.getText());
                    f6[] f6VarArr2 = this.f29336f;
                    f6 f6Var = f6VarArr2[i11];
                    f6VarArr2[i11] = new f6(this, h, f6Var.f28310c, f6Var.d);
                    float f11 = this.d;
                    f6 f6Var2 = this.f29336f[i11];
                    this.d = f11 + f6Var2.f28312f;
                    this.f29335e = Math.max(this.f29335e, f6Var2.f28309b.getHeight());
                    i11++;
                }
            }
            if (this.f29339j != null) {
                this.h = 0.0f;
                this.f29338i = 0.0f;
                while (true) {
                    f6[] f6VarArr3 = this.f29339j;
                    if (i10 >= f6VarArr3.length) {
                        break;
                    }
                    StaticLayout h10 = h(i9 - ((int) Math.ceil(Math.min(this.d, this.h))), f6VarArr3[i10].f28309b.getText());
                    f6[] f6VarArr4 = this.f29339j;
                    f6 f6Var3 = f6VarArr4[i10];
                    f6VarArr4[i10] = new f6(this, h10, f6Var3.f28310c, f6Var3.d);
                    float f12 = this.h;
                    f6 f6Var4 = this.f29339j[i10];
                    this.h = f12 + f6Var4.f28312f;
                    this.f29338i = Math.max(this.f29338i, f6Var4.f28309b.getHeight());
                    i10++;
                }
            }
            invalidateSelf();
        }
    }

    public final void u(Typeface typeface) {
        this.f29332a.setTypeface(typeface);
    }

    public i6(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f29332a = new TextPaint(1);
        this.f29333b = 0;
        this.f29334c = false;
        this.f29341l = 0;
        this.f29342m = 0.0f;
        this.f29343n = true;
        this.f29347r = 320L;
        this.f29348s = gr.h;
        this.f29349t = -1.0f;
        this.f29350u = 0.3f;
        this.v = 0.0f;
        this.f29351w = 255;
        this.f29352x = new Rect();
        this.M = true;
        this.N = true;
        this.O = false;
        this.f29353y = z10;
        this.f29354z = z11;
        this.A = z12;
        this.B = z13;
    }

    @Override
    public final void setBounds(int i9, int i10, int i11, int i12) {
        super.setBounds(i9, i10, i11, i12);
        this.f29352x.set(i9, i10, i11, i12);
    }
}
