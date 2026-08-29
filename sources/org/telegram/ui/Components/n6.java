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
    public ig C;
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
    public final TextPaint f30861a;
    public int f30862b;
    public boolean f30863c;
    public float d;
    public float f30864e;
    public k6[] f30865f;
    public CharSequence f30866g;
    public float h;
    public float f30867i;
    public k6[] f30868j;
    public CharSequence f30869k;
    public int f30870l;
    public float f30871m;
    public boolean f30872n;
    public ValueAnimator f30873o;
    public CharSequence f30874p;
    public boolean f30875q;
    public long f30876r;
    public TimeInterpolator f30877s;
    public float f30878t;
    public float f30879u;
    public float v;
    public int f30880w;
    public final Rect f30881x;
    public boolean f30882y;
    public boolean f30883z;

    public n6(int i10) {
        this(false, true, true, false);
    }

    public static boolean j(int r2, int r3, java.lang.CharSequence r4, java.lang.CharSequence r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n6.j(int, int, java.lang.CharSequence, java.lang.CharSequence):boolean");
    }

    public final void a(float f9) {
        TextPaint textPaint = this.f30861a;
        textPaint.setAlpha((int) (this.f30880w * f9));
        if (this.O) {
            textPaint.setShadowLayer(this.P, 0.0f, this.Q, org.telegram.ui.ActionBar.g6.l1(f9, this.R));
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f30873o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void c() {
        if (this.f30868j != null) {
            int i10 = 0;
            while (true) {
                k6[] k6VarArr = this.f30868j;
                if (i10 >= k6VarArr.length) {
                    break;
                }
                k6 k6Var = k6VarArr[i10];
                n6 n6Var = k6Var.f29949g;
                if (n6Var.getCallback() instanceof View) {
                    y5.release((View) n6Var.getCallback(), k6Var.f29944a);
                }
                i10++;
            }
        }
        this.f30868j = null;
    }

    public final float d() {
        if (this.f30865f != null && this.f30868j != null) {
            return AndroidUtilities.lerp(this.h, this.d, this.f30871m);
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
        ValueAnimator valueAnimator = this.f30873o;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final float g() {
        float f9;
        CharSequence charSequence = this.f30869k;
        float f10 = 0.0f;
        float f11 = 1.0f;
        if (charSequence != null && charSequence.length() > 0) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        CharSequence charSequence2 = this.f30866g;
        if (charSequence2 != null && charSequence2.length() > 0) {
            f10 = 1.0f;
        }
        if (this.f30869k != null) {
            f11 = this.f30871m;
        }
        return AndroidUtilities.lerp(f9, f10, f11);
    }

    @Override
    public final Rect getDirtyBounds() {
        return this.f30881x;
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
        TextPaint textPaint = this.f30861a;
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
                l6Var.a(charSequence.subSequence(i12, i13));
                i12 = i13;
            }
            return;
        }
        l6Var.a(charSequence);
    }

    public final void k(float f9, long j10, TimeInterpolator timeInterpolator) {
        this.f30879u = f9;
        this.f30876r = j10;
        this.f30878t = 1.0f;
        this.f30877s = timeInterpolator;
    }

    public final void l(float f9, float f10, float f11, float f12) {
        int i10 = (int) f9;
        int i11 = (int) f10;
        int i12 = (int) f11;
        int i13 = (int) f12;
        super.setBounds(i10, i11, i12, i13);
        this.f30881x.set(i10, i11, i12, i13);
    }

    public final void m(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void n(boolean z10) {
        this.I = z10;
        invalidateSelf();
    }

    public final void o(boolean z10, boolean z11, boolean z12) {
        this.f30882y = z10;
        this.f30883z = true;
        this.A = z11;
        this.B = z12;
    }

    public final void p(float f9, float f10, int i10) {
        this.O = true;
        this.P = f9;
        this.Q = f10;
        this.R = i10;
        this.f30861a.setShadowLayer(f9, 0.0f, f10, i10);
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
        if (this.f30866g != null && charSequence != null) {
            z12 = z10;
        } else {
            z12 = false;
        }
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence;
        }
        final int i12 = this.G;
        if (i12 <= 0) {
            i12 = this.f30881x.width();
        }
        boolean z17 = true;
        if (z12) {
            if (!TextUtils.equals(charSequence2, this.f30866g)) {
                if (this.D) {
                    ValueAnimator valueAnimator = this.f30873o;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f30873o = null;
                    }
                } else if (f()) {
                    this.f30874p = charSequence2;
                    this.f30875q = z11;
                    return;
                }
                this.f30869k = this.f30866g;
                this.f30866g = charSequence2;
                final ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                this.f30864e = 0.0f;
                this.d = 0.0f;
                this.f30867i = 0.0f;
                this.h = 0.0f;
                this.f30863c = AndroidUtilities.isRTL(this.f30866g);
                eg.b0 b0Var = new eg.b0(this, i12, arrayList2, arrayList);
                l6 l6Var = new l6(this) {
                    public final n6 f29325b;

                    {
                        this.f29325b = this;
                    }

                    @Override
                    public final void a(CharSequence charSequence5) {
                        StaticLayout h;
                        StaticLayout h10;
                        switch (r4) {
                            case 0:
                                n6 n6Var = this.f29325b;
                                k6 k6Var2 = new k6(n6Var, n6Var.h(i12 - ((int) Math.ceil(n6Var.d)), charSequence5), n6Var.d, -1);
                                arrayList.add(k6Var2);
                                n6Var.d += k6Var2.f29948f;
                                n6Var.f30864e = Math.max(n6Var.f30864e, h.getHeight());
                                return;
                            default:
                                n6 n6Var2 = this.f29325b;
                                k6 k6Var3 = new k6(n6Var2, n6Var2.h(i12 - ((int) Math.ceil(n6Var2.h)), charSequence5), n6Var2.h, -1);
                                arrayList.add(k6Var3);
                                n6Var2.h += k6Var3.f29948f;
                                n6Var2.f30867i = Math.max(n6Var2.f30867i, h10.getHeight());
                                return;
                        }
                    }
                };
                l6 l6Var2 = new l6(this) {
                    public final n6 f29325b;

                    {
                        this.f29325b = this;
                    }

                    @Override
                    public final void a(CharSequence charSequence5) {
                        StaticLayout h;
                        StaticLayout h10;
                        switch (r4) {
                            case 0:
                                n6 n6Var = this.f29325b;
                                k6 k6Var2 = new k6(n6Var, n6Var.h(i12 - ((int) Math.ceil(n6Var.d)), charSequence5), n6Var.d, -1);
                                arrayList2.add(k6Var2);
                                n6Var.d += k6Var2.f29948f;
                                n6Var.f30864e = Math.max(n6Var.f30864e, h.getHeight());
                                return;
                            default:
                                n6 n6Var2 = this.f29325b;
                                k6 k6Var3 = new k6(n6Var2, n6Var2.h(i12 - ((int) Math.ceil(n6Var2.h)), charSequence5), n6Var2.h, -1);
                                arrayList2.add(k6Var3);
                                n6Var2.h += k6Var3.f29948f;
                                n6Var2.f30867i = Math.max(n6Var2.f30867i, h10.getHeight());
                                return;
                        }
                    }
                };
                if (this.f30882y) {
                    charSequence3 = new m6(this.f30869k);
                } else {
                    charSequence3 = this.f30869k;
                }
                if (this.f30882y) {
                    charSequence4 = new m6(this.f30866g);
                } else {
                    charSequence4 = this.f30866g;
                }
                if (this.F) {
                    i(l6Var2, charSequence3, 0, charSequence3.length());
                    i(l6Var, charSequence4, 0, charSequence4.length());
                } else if (this.f30883z) {
                    int min = Math.min(charSequence4.length(), charSequence3.length());
                    if (this.A) {
                        ArrayList arrayList3 = new ArrayList();
                        boolean z18 = true;
                        int i13 = 0;
                        for (int i14 = 0; i14 <= min; i14++) {
                            int length = (charSequence4.length() - i14) - 1;
                            int length2 = (charSequence3.length() - i14) - 1;
                            if (length >= 0 && length2 >= 0 && j(length, length2, charSequence4, charSequence3)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (z17 != z16 || i14 == min) {
                                int i15 = i14 - i13;
                                if (i15 > 0) {
                                    if (arrayList3.size() != 0) {
                                        z17 = z18;
                                    }
                                    arrayList3.add(Integer.valueOf(i15));
                                    z18 = z17;
                                }
                                z17 = z16;
                                i13 = i14;
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
                                    b0Var.a(charSequence4.subSequence(length3, length3 + intValue));
                                } else {
                                    b0Var.a(charSequence3.subSequence(length4, length4 + intValue));
                                }
                            } else {
                                i11 = size;
                                int i16 = length3 + intValue;
                                i(l6Var, charSequence4.subSequence(length3, i16), length3, i16);
                                int i17 = length4 + intValue;
                                i(l6Var2, charSequence3.subSequence(length4, i17), length4, i17);
                            }
                            length3 += intValue;
                            length4 += intValue;
                            size = i11 - 1;
                        }
                    } else {
                        int i18 = 0;
                        boolean z19 = true;
                        for (int i19 = 0; i19 <= min; i19++) {
                            if (i19 < min && j(i19, i19, charSequence4, charSequence3)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z19 != z14 || i19 == min) {
                                if (i19 - i18 > 0) {
                                    if (z19) {
                                        i(b0Var, charSequence4.subSequence(i18, i19), i18, i19);
                                    } else {
                                        i(l6Var, charSequence4.subSequence(i18, i19), i18, i19);
                                        i(l6Var2, charSequence3.subSequence(i18, i19), i18, i19);
                                    }
                                }
                                i18 = i19;
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
                    int i20 = 0;
                    int i21 = 0;
                    int i22 = 0;
                    int i23 = 0;
                    boolean z20 = true;
                    while (i20 <= min2) {
                        if (i20 < min2 && j(i20, i21, charSequence4, charSequence3)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z20 == z13 && i20 != min2) {
                            i10 = min2;
                        } else {
                            if (i20 == min2) {
                                i20 = charSequence4.length();
                                i21 = charSequence3.length();
                            }
                            i10 = min2;
                            int i24 = i20 - i22;
                            boolean z21 = z20;
                            int i25 = i21 - i23;
                            if (i24 > 0 || i25 > 0) {
                                if (i24 == i25 && z21) {
                                    b0Var.a(charSequence4.subSequence(i22, i20));
                                } else {
                                    if (i24 > 0) {
                                        i(l6Var, charSequence4.subSequence(i22, i20), i22, i20);
                                    }
                                    if (i25 > 0) {
                                        i(l6Var2, charSequence3.subSequence(i23, i21), i23, i21);
                                    }
                                }
                            }
                            i22 = i20;
                            i23 = i21;
                            z20 = z13;
                        }
                        if (z13) {
                            i21++;
                        }
                        i20++;
                        min2 = i10;
                    }
                }
                if (this.f30868j != null) {
                    int i26 = 0;
                    while (true) {
                        k6[] k6VarArr = this.f30868j;
                        if (i26 >= k6VarArr.length) {
                            break;
                        }
                        k6 k6Var2 = k6VarArr[i26];
                        n6 n6Var = k6Var2.f29949g;
                        if (n6Var.getCallback() instanceof View) {
                            y5.release((View) n6Var.getCallback(), k6Var2.f29944a);
                        }
                        i26++;
                    }
                }
                this.f30868j = null;
                k6[] k6VarArr2 = this.f30865f;
                if (k6VarArr2 == null || k6VarArr2.length != arrayList.size()) {
                    this.f30865f = new k6[arrayList.size()];
                }
                arrayList.toArray(this.f30865f);
                c();
                k6[] k6VarArr3 = this.f30868j;
                if (k6VarArr3 == null || k6VarArr3.length != arrayList2.size()) {
                    this.f30868j = new k6[arrayList2.size()];
                }
                arrayList2.toArray(this.f30868j);
                ValueAnimator valueAnimator2 = this.f30873o;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.f30872n = z11;
                this.f30871m = 0.0f;
                this.f30873o = ValueAnimator.ofFloat(0.0f, 1.0f);
                Runnable runnable = this.V;
                if (runnable != null) {
                    runnable.run();
                }
                this.f30873o.addUpdateListener(new j6(this, 0));
                this.f30873o.addListener(new org.telegram.ui.bm(this, 6));
                this.f30873o.setStartDelay(0L);
                this.f30873o.setDuration(this.f30876r);
                this.f30873o.setInterpolator(this.f30877s);
                this.f30873o.start();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator3 = this.f30873o;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.f30873o = null;
        this.f30874p = null;
        this.f30875q = false;
        this.f30871m = 0.0f;
        if (!charSequence2.equals(this.f30866g)) {
            if (this.f30868j != null) {
                int i27 = 0;
                while (true) {
                    k6[] k6VarArr4 = this.f30868j;
                    if (i27 >= k6VarArr4.length) {
                        break;
                    }
                    k6 k6Var3 = k6VarArr4[i27];
                    n6 n6Var2 = k6Var3.f29949g;
                    if (n6Var2.getCallback() instanceof View) {
                        y5.release((View) n6Var2.getCallback(), k6Var3.f29944a);
                    }
                    i27++;
                }
            }
            this.f30868j = null;
            this.f30865f = r1;
            this.f30866g = charSequence2;
            k6[] k6VarArr5 = {new k6(this, h(i12, charSequence2), 0.0f, -1)};
            this.d = this.f30865f[0].f29948f;
            this.f30864e = k6Var.f29945b.getHeight();
            this.f30863c = AndroidUtilities.isRTL(this.f30866g);
        }
        c();
        this.f30869k = null;
        this.h = 0.0f;
        this.f30867i = 0.0f;
        invalidateSelf();
        Runnable runnable2 = this.V;
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    public final void r(int i10) {
        this.f30861a.setColor(i10);
        this.f30880w = Color.alpha(i10);
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
        int color = this.f30861a.getColor();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.S = ofFloat;
        ofFloat.addUpdateListener(new bg.h0(this, color, i10, 3));
        this.S.addListener(new org.telegram.ui.Cells.z3(this, i10, 1));
        this.S.setDuration(240L);
        this.S.setInterpolator(jr.h);
        this.S.start();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f30880w = i10;
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.f30881x.set(rect);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f30861a.setColorFilter(colorFilter);
    }

    public final void t(float f9) {
        TextPaint textPaint = this.f30861a;
        float textSize = textPaint.getTextSize();
        textPaint.setTextSize(f9);
        if (Math.abs(textSize - f9) > 0.5f) {
            int i10 = this.G;
            if (i10 <= 0) {
                i10 = this.f30881x.width();
            }
            int i11 = 0;
            if (this.f30865f != null) {
                this.d = 0.0f;
                this.f30864e = 0.0f;
                int i12 = 0;
                while (true) {
                    k6[] k6VarArr = this.f30865f;
                    if (i12 >= k6VarArr.length) {
                        break;
                    }
                    StaticLayout h = h(i10 - ((int) Math.ceil(Math.min(this.d, this.h))), k6VarArr[i12].f29945b.getText());
                    k6[] k6VarArr2 = this.f30865f;
                    k6 k6Var = k6VarArr2[i12];
                    k6VarArr2[i12] = new k6(this, h, k6Var.f29946c, k6Var.d);
                    float f10 = this.d;
                    k6 k6Var2 = this.f30865f[i12];
                    this.d = f10 + k6Var2.f29948f;
                    this.f30864e = Math.max(this.f30864e, k6Var2.f29945b.getHeight());
                    i12++;
                }
            }
            if (this.f30868j != null) {
                this.h = 0.0f;
                this.f30867i = 0.0f;
                while (true) {
                    k6[] k6VarArr3 = this.f30868j;
                    if (i11 >= k6VarArr3.length) {
                        break;
                    }
                    StaticLayout h10 = h(i10 - ((int) Math.ceil(Math.min(this.d, this.h))), k6VarArr3[i11].f29945b.getText());
                    k6[] k6VarArr4 = this.f30868j;
                    k6 k6Var3 = k6VarArr4[i11];
                    k6VarArr4[i11] = new k6(this, h10, k6Var3.f29946c, k6Var3.d);
                    float f11 = this.h;
                    k6 k6Var4 = this.f30868j[i11];
                    this.h = f11 + k6Var4.f29948f;
                    this.f30867i = Math.max(this.f30867i, k6Var4.f29945b.getHeight());
                    i11++;
                }
            }
            invalidateSelf();
        }
    }

    public final void u(Typeface typeface) {
        this.f30861a.setTypeface(typeface);
    }

    public n6(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f30861a = new TextPaint(1);
        this.f30862b = 0;
        this.f30863c = false;
        this.f30870l = 0;
        this.f30871m = 0.0f;
        this.f30872n = true;
        this.f30876r = 320L;
        this.f30877s = jr.h;
        this.f30878t = -1.0f;
        this.f30879u = 0.3f;
        this.v = 0.0f;
        this.f30880w = 255;
        this.f30881x = new Rect();
        this.M = true;
        this.N = true;
        this.O = false;
        this.f30882y = z10;
        this.f30883z = z11;
        this.A = z12;
        this.B = z13;
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f30881x.set(i10, i11, i12, i13);
    }
}
