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
public class o6 extends Drawable {
    public boolean A;
    public boolean B;
    public qg C;
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
    public final TextPaint f29239a;
    public int f29240b;
    public boolean f29241c;
    public float d;
    public float f29242e;
    public l6[] f29243f;
    public CharSequence f29244g;
    public float h;
    public float f29245i;
    public l6[] f29246j;
    public CharSequence f29247k;
    public int f29248l;
    public float f29249m;
    public boolean f29250n;
    public ValueAnimator f29251o;
    public CharSequence f29252p;
    public boolean f29253q;
    public long f29254r;
    public TimeInterpolator f29255s;
    public float f29256t;
    public float f29257u;
    public float v;
    public int f29258w;
    public final Rect f29259x;
    public boolean f29260y;
    public boolean f29261z;

    public o6(int i10) {
        this(false, true, true, false);
    }

    public static boolean j(int r2, int r3, java.lang.CharSequence r4, java.lang.CharSequence r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o6.j(int, int, java.lang.CharSequence, java.lang.CharSequence):boolean");
    }

    public final void a(float f7) {
        TextPaint textPaint = this.f29239a;
        textPaint.setAlpha((int) (this.f29258w * f7));
        if (this.O) {
            textPaint.setShadowLayer(this.P, 0.0f, this.Q, org.telegram.ui.ActionBar.i6.l1(f7, this.R));
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f29251o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void c() {
        if (this.f29246j != null) {
            int i10 = 0;
            while (true) {
                l6[] l6VarArr = this.f29246j;
                if (i10 >= l6VarArr.length) {
                    break;
                }
                l6 l6Var = l6VarArr[i10];
                o6 o6Var = l6Var.f28291g;
                if (o6Var.getCallback() instanceof View) {
                    z5.release((View) o6Var.getCallback(), l6Var.f28286a);
                }
                i10++;
            }
        }
        this.f29246j = null;
    }

    public final float d() {
        if (this.f29243f != null && this.f29246j != null) {
            return AndroidUtilities.lerp(this.h, this.d, this.f29249m);
        }
        return this.d;
    }

    @Override
    public final void draw(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o6.draw(android.graphics.Canvas):void");
    }

    public final float e() {
        return Math.max(this.d, this.h);
    }

    public final boolean f() {
        ValueAnimator valueAnimator = this.f29251o;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final float g() {
        float f7;
        CharSequence charSequence = this.f29247k;
        float f10 = 0.0f;
        float f11 = 1.0f;
        if (charSequence != null && charSequence.length() > 0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        CharSequence charSequence2 = this.f29244g;
        if (charSequence2 != null && charSequence2.length() > 0) {
            f10 = 1.0f;
        }
        if (this.f29247k != null) {
            f11 = this.f29249m;
        }
        return AndroidUtilities.lerp(f7, f10, f11);
    }

    @Override
    public final Rect getDirtyBounds() {
        return this.f29259x;
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
        TextPaint textPaint = this.f29239a;
        if (i12 >= 23) {
            return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i11).setMaxLines(1).setLineSpacing(0.0f, 1.0f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i11).setIncludePad(this.M).build();
        }
        return new StaticLayout(charSequence, 0, charSequence.length(), textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, this.M, TextUtils.TruncateAt.END, i11);
    }

    public final void i(m6 m6Var, CharSequence charSequence, int i10, int i11) {
        if (this.B && charSequence.length() > 1) {
            int i12 = 0;
            while (i12 < charSequence.length()) {
                int i13 = i12 + 1;
                m6Var.a(charSequence.subSequence(i12, i13));
                i12 = i13;
            }
            return;
        }
        m6Var.a(charSequence);
    }

    public final void k(float f7, long j3, TimeInterpolator timeInterpolator) {
        this.f29257u = f7;
        this.f29254r = j3;
        this.f29256t = 1.0f;
        this.f29255s = timeInterpolator;
    }

    public final void l(float f7, float f10, float f11, float f12) {
        int i10 = (int) f7;
        int i11 = (int) f10;
        int i12 = (int) f11;
        int i13 = (int) f12;
        super.setBounds(i10, i11, i12, i13);
        this.f29259x.set(i10, i11, i12, i13);
    }

    public final void m(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void n(boolean z10) {
        this.I = z10;
        invalidateSelf();
    }

    public final void o(boolean z10, boolean z11, boolean z12) {
        this.f29260y = z10;
        this.f29261z = true;
        this.A = z11;
        this.B = z12;
    }

    public final void p(float f7, float f10, int i10) {
        this.O = true;
        this.P = f7;
        this.Q = f10;
        this.R = i10;
        this.f29239a.setShadowLayer(f7, 0.0f, f10, i10);
    }

    public final void q(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        CharSequence charSequence2;
        l6 l6Var;
        CharSequence charSequence3;
        CharSequence charSequence4;
        boolean z13;
        int i10;
        boolean z14;
        boolean z15;
        int i11;
        boolean z16;
        if (this.f29244g != null && charSequence != null) {
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
            i12 = this.f29259x.width();
        }
        boolean z17 = true;
        if (z12) {
            if (!TextUtils.equals(charSequence2, this.f29244g)) {
                if (this.D) {
                    ValueAnimator valueAnimator = this.f29251o;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f29251o = null;
                    }
                } else if (f()) {
                    this.f29252p = charSequence2;
                    this.f29253q = z11;
                    return;
                }
                this.f29247k = this.f29244g;
                this.f29244g = charSequence2;
                final ArrayList arrayList = new ArrayList();
                final int i13 = i12;
                final ArrayList arrayList2 = new ArrayList();
                this.f29242e = 0.0f;
                this.d = 0.0f;
                this.f29245i = 0.0f;
                this.h = 0.0f;
                this.f29241c = AndroidUtilities.isRTL(this.f29244g);
                org.telegram.ui.fa faVar = new org.telegram.ui.fa(this, i13, arrayList2, arrayList, 1);
                m6 m6Var = new m6(this) {
                    public final o6 f27606b;

                    {
                        this.f27606b = this;
                    }

                    @Override
                    public final void a(CharSequence charSequence5) {
                        StaticLayout h;
                        StaticLayout h10;
                        switch (r4) {
                            case 0:
                                o6 o6Var = this.f27606b;
                                l6 l6Var2 = new l6(o6Var, o6Var.h(i13 - ((int) Math.ceil(o6Var.d)), charSequence5), o6Var.d, -1);
                                arrayList.add(l6Var2);
                                o6Var.d += l6Var2.f28290f;
                                o6Var.f29242e = Math.max(o6Var.f29242e, h.getHeight());
                                return;
                            default:
                                o6 o6Var2 = this.f27606b;
                                l6 l6Var3 = new l6(o6Var2, o6Var2.h(i13 - ((int) Math.ceil(o6Var2.h)), charSequence5), o6Var2.h, -1);
                                arrayList.add(l6Var3);
                                o6Var2.h += l6Var3.f28290f;
                                o6Var2.f29245i = Math.max(o6Var2.f29245i, h10.getHeight());
                                return;
                        }
                    }
                };
                m6 m6Var2 = new m6(this) {
                    public final o6 f27606b;

                    {
                        this.f27606b = this;
                    }

                    @Override
                    public final void a(CharSequence charSequence5) {
                        StaticLayout h;
                        StaticLayout h10;
                        switch (r4) {
                            case 0:
                                o6 o6Var = this.f27606b;
                                l6 l6Var2 = new l6(o6Var, o6Var.h(i13 - ((int) Math.ceil(o6Var.d)), charSequence5), o6Var.d, -1);
                                arrayList2.add(l6Var2);
                                o6Var.d += l6Var2.f28290f;
                                o6Var.f29242e = Math.max(o6Var.f29242e, h.getHeight());
                                return;
                            default:
                                o6 o6Var2 = this.f27606b;
                                l6 l6Var3 = new l6(o6Var2, o6Var2.h(i13 - ((int) Math.ceil(o6Var2.h)), charSequence5), o6Var2.h, -1);
                                arrayList2.add(l6Var3);
                                o6Var2.h += l6Var3.f28290f;
                                o6Var2.f29245i = Math.max(o6Var2.f29245i, h10.getHeight());
                                return;
                        }
                    }
                };
                if (this.f29260y) {
                    charSequence3 = new n6(this.f29247k);
                } else {
                    charSequence3 = this.f29247k;
                }
                if (this.f29260y) {
                    charSequence4 = new n6(this.f29244g);
                } else {
                    charSequence4 = this.f29244g;
                }
                if (this.F) {
                    i(m6Var2, charSequence3, 0, charSequence3.length());
                    i(m6Var, charSequence4, 0, charSequence4.length());
                } else if (this.f29261z) {
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
                            i(m6Var, charSequence4.subSequence(0, length3), 0, length3);
                        }
                        if (length4 > 0) {
                            i(m6Var2, charSequence3.subSequence(0, length4), 0, length4);
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
                                    faVar.a(charSequence4.subSequence(length3, length3 + intValue));
                                } else {
                                    faVar.a(charSequence3.subSequence(length4, length4 + intValue));
                                }
                            } else {
                                i11 = size;
                                int i17 = length3 + intValue;
                                i(m6Var, charSequence4.subSequence(length3, i17), length3, i17);
                                int i18 = length4 + intValue;
                                i(m6Var2, charSequence3.subSequence(length4, i18), length4, i18);
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
                                        i(faVar, charSequence4.subSequence(i19, i20), i19, i20);
                                    } else {
                                        i(m6Var, charSequence4.subSequence(i19, i20), i19, i20);
                                        i(m6Var2, charSequence3.subSequence(i19, i20), i19, i20);
                                    }
                                }
                                i19 = i20;
                                z19 = z14;
                            }
                        }
                        if (charSequence4.length() - min > 0) {
                            i(m6Var, charSequence4.subSequence(min, charSequence4.length()), min, charSequence4.length());
                        }
                        if (charSequence3.length() - min > 0) {
                            i(m6Var2, charSequence3.subSequence(min, charSequence3.length()), min, charSequence3.length());
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
                                    faVar.a(charSequence4.subSequence(i23, i21));
                                } else {
                                    if (i25 > 0) {
                                        i(m6Var, charSequence4.subSequence(i23, i21), i23, i21);
                                    }
                                    if (i26 > 0) {
                                        i(m6Var2, charSequence3.subSequence(i24, i22), i24, i22);
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
                if (this.f29246j != null) {
                    int i27 = 0;
                    while (true) {
                        l6[] l6VarArr = this.f29246j;
                        if (i27 >= l6VarArr.length) {
                            break;
                        }
                        l6 l6Var2 = l6VarArr[i27];
                        o6 o6Var = l6Var2.f28291g;
                        if (o6Var.getCallback() instanceof View) {
                            z5.release((View) o6Var.getCallback(), l6Var2.f28286a);
                        }
                        i27++;
                    }
                }
                this.f29246j = null;
                l6[] l6VarArr2 = this.f29243f;
                if (l6VarArr2 == null || l6VarArr2.length != arrayList.size()) {
                    this.f29243f = new l6[arrayList.size()];
                }
                arrayList.toArray(this.f29243f);
                c();
                l6[] l6VarArr3 = this.f29246j;
                if (l6VarArr3 == null || l6VarArr3.length != arrayList2.size()) {
                    this.f29246j = new l6[arrayList2.size()];
                }
                arrayList2.toArray(this.f29246j);
                ValueAnimator valueAnimator2 = this.f29251o;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.f29250n = z11;
                this.f29249m = 0.0f;
                this.f29251o = ValueAnimator.ofFloat(0.0f, 1.0f);
                Runnable runnable = this.V;
                if (runnable != null) {
                    runnable.run();
                }
                this.f29251o.addUpdateListener(new k6(this, 0));
                this.f29251o.addListener(new org.telegram.ui.u4(this, 28));
                this.f29251o.setStartDelay(0L);
                this.f29251o.setDuration(this.f29254r);
                this.f29251o.setInterpolator(this.f29255s);
                this.f29251o.start();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator3 = this.f29251o;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.f29251o = null;
        this.f29252p = null;
        this.f29253q = false;
        this.f29249m = 0.0f;
        if (!charSequence2.equals(this.f29244g)) {
            if (this.f29246j != null) {
                int i28 = 0;
                while (true) {
                    l6[] l6VarArr4 = this.f29246j;
                    if (i28 >= l6VarArr4.length) {
                        break;
                    }
                    l6 l6Var3 = l6VarArr4[i28];
                    o6 o6Var2 = l6Var3.f28291g;
                    if (o6Var2.getCallback() instanceof View) {
                        z5.release((View) o6Var2.getCallback(), l6Var3.f28286a);
                    }
                    i28++;
                }
            }
            this.f29246j = null;
            this.f29243f = r0;
            this.f29244g = charSequence2;
            l6[] l6VarArr5 = {new l6(this, h(i12, charSequence2), 0.0f, -1)};
            this.d = this.f29243f[0].f28290f;
            this.f29242e = l6Var.f28287b.getHeight();
            this.f29241c = AndroidUtilities.isRTL(this.f29244g);
        }
        c();
        this.f29247k = null;
        this.h = 0.0f;
        this.f29245i = 0.0f;
        invalidateSelf();
        Runnable runnable2 = this.V;
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    public final void r(int i10) {
        this.f29239a.setColor(i10);
        this.f29258w = Color.alpha(i10);
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
        int color = this.f29239a.getColor();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.S = ofFloat;
        ofFloat.addUpdateListener(new ci.c5(this, color, i10, 2));
        this.S.addListener(new ei.w2(this, i10, 4));
        this.S.setDuration(240L);
        this.S.setInterpolator(tr.h);
        this.S.start();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f29258w = i10;
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.f29259x.set(rect);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29239a.setColorFilter(colorFilter);
    }

    public final void t(float f7) {
        TextPaint textPaint = this.f29239a;
        float textSize = textPaint.getTextSize();
        textPaint.setTextSize(f7);
        if (Math.abs(textSize - f7) > 0.5f) {
            int i10 = this.G;
            if (i10 <= 0) {
                i10 = this.f29259x.width();
            }
            int i11 = 0;
            if (this.f29243f != null) {
                this.d = 0.0f;
                this.f29242e = 0.0f;
                int i12 = 0;
                while (true) {
                    l6[] l6VarArr = this.f29243f;
                    if (i12 >= l6VarArr.length) {
                        break;
                    }
                    StaticLayout h = h(i10 - ((int) Math.ceil(Math.min(this.d, this.h))), l6VarArr[i12].f28287b.getText());
                    l6[] l6VarArr2 = this.f29243f;
                    l6 l6Var = l6VarArr2[i12];
                    l6VarArr2[i12] = new l6(this, h, l6Var.f28288c, l6Var.d);
                    float f10 = this.d;
                    l6 l6Var2 = this.f29243f[i12];
                    this.d = f10 + l6Var2.f28290f;
                    this.f29242e = Math.max(this.f29242e, l6Var2.f28287b.getHeight());
                    i12++;
                }
            }
            if (this.f29246j != null) {
                this.h = 0.0f;
                this.f29245i = 0.0f;
                while (true) {
                    l6[] l6VarArr3 = this.f29246j;
                    if (i11 >= l6VarArr3.length) {
                        break;
                    }
                    StaticLayout h10 = h(i10 - ((int) Math.ceil(Math.min(this.d, this.h))), l6VarArr3[i11].f28287b.getText());
                    l6[] l6VarArr4 = this.f29246j;
                    l6 l6Var3 = l6VarArr4[i11];
                    l6VarArr4[i11] = new l6(this, h10, l6Var3.f28288c, l6Var3.d);
                    float f11 = this.h;
                    l6 l6Var4 = this.f29246j[i11];
                    this.h = f11 + l6Var4.f28290f;
                    this.f29245i = Math.max(this.f29245i, l6Var4.f28287b.getHeight());
                    i11++;
                }
            }
            invalidateSelf();
        }
    }

    public final void u(Typeface typeface) {
        this.f29239a.setTypeface(typeface);
    }

    public o6(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f29239a = new TextPaint(1);
        this.f29240b = 0;
        this.f29241c = false;
        this.f29248l = 0;
        this.f29249m = 0.0f;
        this.f29250n = true;
        this.f29254r = 320L;
        this.f29255s = tr.h;
        this.f29256t = -1.0f;
        this.f29257u = 0.3f;
        this.v = 0.0f;
        this.f29258w = 255;
        this.f29259x = new Rect();
        this.M = true;
        this.N = true;
        this.O = false;
        this.f29260y = z10;
        this.f29261z = z11;
        this.A = z12;
        this.B = z13;
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f29259x.set(i10, i11, i12, i13);
    }
}
