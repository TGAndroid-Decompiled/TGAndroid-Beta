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
public class m6 extends Drawable {
    public boolean A;
    public boolean B;
    public ng C;
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
    public final TextPaint f26085a;
    public int f26086b;
    public boolean f26087c;
    public float d;
    public float e;
    public j6[] f26088f;
    public CharSequence f26089g;
    public float h;
    public float f26090i;
    public j6[] f26091j;
    public CharSequence f26092k;
    public int f26093l;
    public float f26094m;
    public boolean f26095n;
    public ValueAnimator f26096o;
    public CharSequence f26097p;
    public boolean f26098q;
    public long f26099r;
    public TimeInterpolator f26100s;
    public float f26101t;
    public float f26102u;
    public float v;
    public int f26103w;
    public final Rect f26104x;
    public boolean f26105y;
    public boolean f26106z;

    public m6(int i10) {
        this(false, true, true, false);
    }

    public static boolean j(int r2, int r3, java.lang.CharSequence r4, java.lang.CharSequence r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m6.j(int, int, java.lang.CharSequence, java.lang.CharSequence):boolean");
    }

    public final void a(float f7) {
        TextPaint textPaint = this.f26085a;
        textPaint.setAlpha((int) (this.f26103w * f7));
        if (this.O) {
            textPaint.setShadowLayer(this.P, 0.0f, this.Q, org.telegram.ui.ActionBar.i6.l1(f7, this.R));
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f26096o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void c() {
        if (this.f26091j != null) {
            int i10 = 0;
            while (true) {
                j6[] j6VarArr = this.f26091j;
                if (i10 >= j6VarArr.length) {
                    break;
                }
                j6 j6Var = j6VarArr[i10];
                m6 m6Var = j6Var.f25241g;
                if (m6Var.getCallback() instanceof View) {
                    x5.release((View) m6Var.getCallback(), j6Var.f25237a);
                }
                i10++;
            }
        }
        this.f26091j = null;
    }

    public final float d() {
        if (this.f26088f != null && this.f26091j != null) {
            return AndroidUtilities.lerp(this.h, this.d, this.f26094m);
        }
        return this.d;
    }

    @Override
    public final void draw(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m6.draw(android.graphics.Canvas):void");
    }

    public final float e() {
        return Math.max(this.d, this.h);
    }

    public final boolean f() {
        ValueAnimator valueAnimator = this.f26096o;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final float g() {
        float f7;
        CharSequence charSequence = this.f26092k;
        float f10 = 0.0f;
        float f11 = 1.0f;
        if (charSequence != null && charSequence.length() > 0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        CharSequence charSequence2 = this.f26089g;
        if (charSequence2 != null && charSequence2.length() > 0) {
            f10 = 1.0f;
        }
        if (this.f26092k != null) {
            f11 = this.f26094m;
        }
        return AndroidUtilities.lerp(f7, f10, f11);
    }

    @Override
    public final Rect getDirtyBounds() {
        return this.f26104x;
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
        TextPaint textPaint = this.f26085a;
        if (i12 >= 23) {
            return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i11).setMaxLines(1).setLineSpacing(0.0f, 1.0f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i11).setIncludePad(this.M).build();
        }
        return new StaticLayout(charSequence, 0, charSequence.length(), textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, this.M, TextUtils.TruncateAt.END, i11);
    }

    public final void i(k6 k6Var, CharSequence charSequence, int i10, int i11) {
        if (this.B && charSequence.length() > 1) {
            int i12 = 0;
            while (i12 < charSequence.length()) {
                int i13 = i12 + 1;
                k6Var.b(charSequence.subSequence(i12, i13));
                i12 = i13;
            }
            return;
        }
        k6Var.b(charSequence);
    }

    public final void k(float f7, long j3, TimeInterpolator timeInterpolator) {
        this.f26102u = f7;
        this.f26099r = j3;
        this.f26101t = 1.0f;
        this.f26100s = timeInterpolator;
    }

    public final void l(float f7, float f10, float f11, float f12) {
        int i10 = (int) f7;
        int i11 = (int) f10;
        int i12 = (int) f11;
        int i13 = (int) f12;
        super.setBounds(i10, i11, i12, i13);
        this.f26104x.set(i10, i11, i12, i13);
    }

    public final void m(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void n(boolean z10) {
        this.I = z10;
        invalidateSelf();
    }

    public final void o(boolean z10, boolean z11, boolean z12) {
        this.f26105y = z10;
        this.f26106z = true;
        this.A = z11;
        this.B = z12;
    }

    public final void p(float f7, float f10, int i10) {
        this.O = true;
        this.P = f7;
        this.Q = f10;
        this.R = i10;
        this.f26085a.setShadowLayer(f7, 0.0f, f10, i10);
    }

    public final void q(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        CharSequence charSequence2;
        j6 j6Var;
        CharSequence charSequence3;
        CharSequence charSequence4;
        boolean z13;
        int i10;
        boolean z14;
        boolean z15;
        int i11;
        boolean z16;
        if (this.f26089g != null && charSequence != null) {
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
            i12 = this.f26104x.width();
        }
        boolean z17 = true;
        if (z12) {
            if (!TextUtils.equals(charSequence2, this.f26089g)) {
                if (this.D) {
                    ValueAnimator valueAnimator = this.f26096o;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f26096o = null;
                    }
                } else if (f()) {
                    this.f26097p = charSequence2;
                    this.f26098q = z11;
                    return;
                }
                this.f26092k = this.f26089g;
                this.f26089g = charSequence2;
                final ArrayList arrayList = new ArrayList();
                final int i13 = i12;
                final ArrayList arrayList2 = new ArrayList();
                this.e = 0.0f;
                this.d = 0.0f;
                this.f26090i = 0.0f;
                this.h = 0.0f;
                this.f26087c = AndroidUtilities.isRTL(this.f26089g);
                org.telegram.ui.da daVar = new org.telegram.ui.da(this, i13, arrayList2, arrayList, 1);
                k6 k6Var = new k6(this) {
                    public final m6 f24519b;

                    {
                        this.f24519b = this;
                    }

                    @Override
                    public final void b(CharSequence charSequence5) {
                        StaticLayout h;
                        StaticLayout h10;
                        switch (r4) {
                            case 0:
                                m6 m6Var = this.f24519b;
                                j6 j6Var2 = new j6(m6Var, m6Var.h(i13 - ((int) Math.ceil(m6Var.d)), charSequence5), m6Var.d, -1);
                                arrayList.add(j6Var2);
                                m6Var.d += j6Var2.f25240f;
                                m6Var.e = Math.max(m6Var.e, h.getHeight());
                                return;
                            default:
                                m6 m6Var2 = this.f24519b;
                                j6 j6Var3 = new j6(m6Var2, m6Var2.h(i13 - ((int) Math.ceil(m6Var2.h)), charSequence5), m6Var2.h, -1);
                                arrayList.add(j6Var3);
                                m6Var2.h += j6Var3.f25240f;
                                m6Var2.f26090i = Math.max(m6Var2.f26090i, h10.getHeight());
                                return;
                        }
                    }
                };
                k6 k6Var2 = new k6(this) {
                    public final m6 f24519b;

                    {
                        this.f24519b = this;
                    }

                    @Override
                    public final void b(CharSequence charSequence5) {
                        StaticLayout h;
                        StaticLayout h10;
                        switch (r4) {
                            case 0:
                                m6 m6Var = this.f24519b;
                                j6 j6Var2 = new j6(m6Var, m6Var.h(i13 - ((int) Math.ceil(m6Var.d)), charSequence5), m6Var.d, -1);
                                arrayList2.add(j6Var2);
                                m6Var.d += j6Var2.f25240f;
                                m6Var.e = Math.max(m6Var.e, h.getHeight());
                                return;
                            default:
                                m6 m6Var2 = this.f24519b;
                                j6 j6Var3 = new j6(m6Var2, m6Var2.h(i13 - ((int) Math.ceil(m6Var2.h)), charSequence5), m6Var2.h, -1);
                                arrayList2.add(j6Var3);
                                m6Var2.h += j6Var3.f25240f;
                                m6Var2.f26090i = Math.max(m6Var2.f26090i, h10.getHeight());
                                return;
                        }
                    }
                };
                if (this.f26105y) {
                    charSequence3 = new l6(this.f26092k);
                } else {
                    charSequence3 = this.f26092k;
                }
                if (this.f26105y) {
                    charSequence4 = new l6(this.f26089g);
                } else {
                    charSequence4 = this.f26089g;
                }
                if (this.F) {
                    i(k6Var2, charSequence3, 0, charSequence3.length());
                    i(k6Var, charSequence4, 0, charSequence4.length());
                } else if (this.f26106z) {
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
                            i(k6Var, charSequence4.subSequence(0, length3), 0, length3);
                        }
                        if (length4 > 0) {
                            i(k6Var2, charSequence3.subSequence(0, length4), 0, length4);
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
                                    daVar.b(charSequence4.subSequence(length3, length3 + intValue));
                                } else {
                                    daVar.b(charSequence3.subSequence(length4, length4 + intValue));
                                }
                            } else {
                                i11 = size;
                                int i17 = length3 + intValue;
                                i(k6Var, charSequence4.subSequence(length3, i17), length3, i17);
                                int i18 = length4 + intValue;
                                i(k6Var2, charSequence3.subSequence(length4, i18), length4, i18);
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
                                        i(daVar, charSequence4.subSequence(i19, i20), i19, i20);
                                    } else {
                                        i(k6Var, charSequence4.subSequence(i19, i20), i19, i20);
                                        i(k6Var2, charSequence3.subSequence(i19, i20), i19, i20);
                                    }
                                }
                                i19 = i20;
                                z19 = z14;
                            }
                        }
                        if (charSequence4.length() - min > 0) {
                            i(k6Var, charSequence4.subSequence(min, charSequence4.length()), min, charSequence4.length());
                        }
                        if (charSequence3.length() - min > 0) {
                            i(k6Var2, charSequence3.subSequence(min, charSequence3.length()), min, charSequence3.length());
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
                                    daVar.b(charSequence4.subSequence(i23, i21));
                                } else {
                                    if (i25 > 0) {
                                        i(k6Var, charSequence4.subSequence(i23, i21), i23, i21);
                                    }
                                    if (i26 > 0) {
                                        i(k6Var2, charSequence3.subSequence(i24, i22), i24, i22);
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
                if (this.f26091j != null) {
                    int i27 = 0;
                    while (true) {
                        j6[] j6VarArr = this.f26091j;
                        if (i27 >= j6VarArr.length) {
                            break;
                        }
                        j6 j6Var2 = j6VarArr[i27];
                        m6 m6Var = j6Var2.f25241g;
                        if (m6Var.getCallback() instanceof View) {
                            x5.release((View) m6Var.getCallback(), j6Var2.f25237a);
                        }
                        i27++;
                    }
                }
                this.f26091j = null;
                j6[] j6VarArr2 = this.f26088f;
                if (j6VarArr2 == null || j6VarArr2.length != arrayList.size()) {
                    this.f26088f = new j6[arrayList.size()];
                }
                arrayList.toArray(this.f26088f);
                c();
                j6[] j6VarArr3 = this.f26091j;
                if (j6VarArr3 == null || j6VarArr3.length != arrayList2.size()) {
                    this.f26091j = new j6[arrayList2.size()];
                }
                arrayList2.toArray(this.f26091j);
                ValueAnimator valueAnimator2 = this.f26096o;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.f26095n = z11;
                this.f26094m = 0.0f;
                this.f26096o = ValueAnimator.ofFloat(0.0f, 1.0f);
                Runnable runnable = this.V;
                if (runnable != null) {
                    runnable.run();
                }
                this.f26096o.addUpdateListener(new i6(this, 0));
                this.f26096o.addListener(new org.telegram.ui.t4(this, 28));
                this.f26096o.setStartDelay(0L);
                this.f26096o.setDuration(this.f26099r);
                this.f26096o.setInterpolator(this.f26100s);
                this.f26096o.start();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator3 = this.f26096o;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.f26096o = null;
        this.f26097p = null;
        this.f26098q = false;
        this.f26094m = 0.0f;
        if (!charSequence2.equals(this.f26089g)) {
            if (this.f26091j != null) {
                int i28 = 0;
                while (true) {
                    j6[] j6VarArr4 = this.f26091j;
                    if (i28 >= j6VarArr4.length) {
                        break;
                    }
                    j6 j6Var3 = j6VarArr4[i28];
                    m6 m6Var2 = j6Var3.f25241g;
                    if (m6Var2.getCallback() instanceof View) {
                        x5.release((View) m6Var2.getCallback(), j6Var3.f25237a);
                    }
                    i28++;
                }
            }
            this.f26091j = null;
            this.f26088f = r0;
            this.f26089g = charSequence2;
            j6[] j6VarArr5 = {new j6(this, h(i12, charSequence2), 0.0f, -1)};
            this.d = this.f26088f[0].f25240f;
            this.e = j6Var.f25238b.getHeight();
            this.f26087c = AndroidUtilities.isRTL(this.f26089g);
        }
        c();
        this.f26092k = null;
        this.h = 0.0f;
        this.f26090i = 0.0f;
        invalidateSelf();
        Runnable runnable2 = this.V;
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    public final void r(int i10) {
        this.f26085a.setColor(i10);
        this.f26103w = Color.alpha(i10);
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
        int color = this.f26085a.getColor();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.S = ofFloat;
        ofFloat.addUpdateListener(new ci.d5(this, color, i10, 2));
        this.S.addListener(new ei.v2(this, i10, 4));
        this.S.setDuration(240L);
        this.S.setInterpolator(qr.h);
        this.S.start();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f26103w = i10;
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.f26104x.set(rect);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f26085a.setColorFilter(colorFilter);
    }

    public final void t(float f7) {
        TextPaint textPaint = this.f26085a;
        float textSize = textPaint.getTextSize();
        textPaint.setTextSize(f7);
        if (Math.abs(textSize - f7) > 0.5f) {
            int i10 = this.G;
            if (i10 <= 0) {
                i10 = this.f26104x.width();
            }
            int i11 = 0;
            if (this.f26088f != null) {
                this.d = 0.0f;
                this.e = 0.0f;
                int i12 = 0;
                while (true) {
                    j6[] j6VarArr = this.f26088f;
                    if (i12 >= j6VarArr.length) {
                        break;
                    }
                    StaticLayout h = h(i10 - ((int) Math.ceil(Math.min(this.d, this.h))), j6VarArr[i12].f25238b.getText());
                    j6[] j6VarArr2 = this.f26088f;
                    j6 j6Var = j6VarArr2[i12];
                    j6VarArr2[i12] = new j6(this, h, j6Var.f25239c, j6Var.d);
                    float f10 = this.d;
                    j6 j6Var2 = this.f26088f[i12];
                    this.d = f10 + j6Var2.f25240f;
                    this.e = Math.max(this.e, j6Var2.f25238b.getHeight());
                    i12++;
                }
            }
            if (this.f26091j != null) {
                this.h = 0.0f;
                this.f26090i = 0.0f;
                while (true) {
                    j6[] j6VarArr3 = this.f26091j;
                    if (i11 >= j6VarArr3.length) {
                        break;
                    }
                    StaticLayout h10 = h(i10 - ((int) Math.ceil(Math.min(this.d, this.h))), j6VarArr3[i11].f25238b.getText());
                    j6[] j6VarArr4 = this.f26091j;
                    j6 j6Var3 = j6VarArr4[i11];
                    j6VarArr4[i11] = new j6(this, h10, j6Var3.f25239c, j6Var3.d);
                    float f11 = this.h;
                    j6 j6Var4 = this.f26091j[i11];
                    this.h = f11 + j6Var4.f25240f;
                    this.f26090i = Math.max(this.f26090i, j6Var4.f25238b.getHeight());
                    i11++;
                }
            }
            invalidateSelf();
        }
    }

    public final void u(Typeface typeface) {
        this.f26085a.setTypeface(typeface);
    }

    public m6(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f26085a = new TextPaint(1);
        this.f26086b = 0;
        this.f26087c = false;
        this.f26093l = 0;
        this.f26094m = 0.0f;
        this.f26095n = true;
        this.f26099r = 320L;
        this.f26100s = qr.h;
        this.f26101t = -1.0f;
        this.f26102u = 0.3f;
        this.v = 0.0f;
        this.f26103w = 255;
        this.f26104x = new Rect();
        this.M = true;
        this.N = true;
        this.O = false;
        this.f26105y = z10;
        this.f26106z = z11;
        this.A = z12;
        this.B = z13;
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f26104x.set(i10, i11, i12, i13);
    }
}
