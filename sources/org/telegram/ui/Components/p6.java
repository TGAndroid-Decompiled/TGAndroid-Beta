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
public class p6 extends Drawable {
    public boolean A;
    public boolean B;
    public pg C;
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
    public final TextPaint f29284a;
    public int f29285b;
    public boolean f29286c;
    public float d;
    public float f29287e;
    public m6[] f29288f;
    public CharSequence f29289g;
    public float h;
    public float f29290i;
    public m6[] f29291j;
    public CharSequence f29292k;
    public int f29293l;
    public float f29294m;
    public boolean f29295n;
    public ValueAnimator f29296o;
    public CharSequence f29297p;
    public boolean f29298q;
    public long f29299r;
    public TimeInterpolator f29300s;
    public float f29301t;
    public float f29302u;
    public float v;
    public int f29303w;
    public final Rect f29304x;
    public boolean f29305y;
    public boolean f29306z;

    public p6(int i10) {
        this(false, true, true, false);
    }

    public static boolean j(int r2, int r3, java.lang.CharSequence r4, java.lang.CharSequence r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p6.j(int, int, java.lang.CharSequence, java.lang.CharSequence):boolean");
    }

    public final void a(float f7) {
        TextPaint textPaint = this.f29284a;
        textPaint.setAlpha((int) (this.f29303w * f7));
        if (this.O) {
            textPaint.setShadowLayer(this.P, 0.0f, this.Q, org.telegram.ui.ActionBar.j6.l1(f7, this.R));
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f29296o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void c() {
        if (this.f29291j != null) {
            int i10 = 0;
            while (true) {
                m6[] m6VarArr = this.f29291j;
                if (i10 >= m6VarArr.length) {
                    break;
                }
                m6 m6Var = m6VarArr[i10];
                p6 p6Var = m6Var.f28392g;
                if (p6Var.getCallback() instanceof View) {
                    z5.release((View) p6Var.getCallback(), m6Var.f28387a);
                }
                i10++;
            }
        }
        this.f29291j = null;
    }

    public final float d() {
        if (this.f29288f != null && this.f29291j != null) {
            return AndroidUtilities.lerp(this.h, this.d, this.f29294m);
        }
        return this.d;
    }

    @Override
    public final void draw(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p6.draw(android.graphics.Canvas):void");
    }

    public final float e() {
        return Math.max(this.d, this.h);
    }

    public final boolean f() {
        ValueAnimator valueAnimator = this.f29296o;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final float g() {
        float f7;
        CharSequence charSequence = this.f29292k;
        float f10 = 0.0f;
        float f11 = 1.0f;
        if (charSequence != null && charSequence.length() > 0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        CharSequence charSequence2 = this.f29289g;
        if (charSequence2 != null && charSequence2.length() > 0) {
            f10 = 1.0f;
        }
        if (this.f29292k != null) {
            f11 = this.f29294m;
        }
        return AndroidUtilities.lerp(f7, f10, f11);
    }

    @Override
    public final Rect getDirtyBounds() {
        return this.f29304x;
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
        TextPaint textPaint = this.f29284a;
        if (i12 >= 23) {
            return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i11).setMaxLines(1).setLineSpacing(0.0f, 1.0f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i11).setIncludePad(this.M).build();
        }
        return new StaticLayout(charSequence, 0, charSequence.length(), textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, this.M, TextUtils.TruncateAt.END, i11);
    }

    public final void i(n6 n6Var, CharSequence charSequence, int i10, int i11) {
        if (this.B && charSequence.length() > 1) {
            int i12 = 0;
            while (i12 < charSequence.length()) {
                int i13 = i12 + 1;
                n6Var.d(charSequence.subSequence(i12, i13));
                i12 = i13;
            }
            return;
        }
        n6Var.d(charSequence);
    }

    public final void k(float f7, long j3, TimeInterpolator timeInterpolator) {
        this.f29302u = f7;
        this.f29299r = j3;
        this.f29301t = 1.0f;
        this.f29300s = timeInterpolator;
    }

    public final void l(float f7, float f10, float f11, float f12) {
        int i10 = (int) f7;
        int i11 = (int) f10;
        int i12 = (int) f11;
        int i13 = (int) f12;
        super.setBounds(i10, i11, i12, i13);
        this.f29304x.set(i10, i11, i12, i13);
    }

    public final void m(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void n(boolean z10) {
        this.I = z10;
        invalidateSelf();
    }

    public final void o(boolean z10, boolean z11, boolean z12) {
        this.f29305y = z10;
        this.f29306z = true;
        this.A = z11;
        this.B = z12;
    }

    public final void p(float f7, float f10, int i10) {
        this.O = true;
        this.P = f7;
        this.Q = f10;
        this.R = i10;
        this.f29284a.setShadowLayer(f7, 0.0f, f10, i10);
    }

    public final void q(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        CharSequence charSequence2;
        m6 m6Var;
        CharSequence charSequence3;
        CharSequence charSequence4;
        boolean z13;
        int i10;
        boolean z14;
        boolean z15;
        int i11;
        boolean z16;
        if (this.f29289g != null && charSequence != null) {
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
            i12 = this.f29304x.width();
        }
        boolean z17 = true;
        if (z12) {
            if (!TextUtils.equals(charSequence2, this.f29289g)) {
                if (this.D) {
                    ValueAnimator valueAnimator = this.f29296o;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f29296o = null;
                    }
                } else if (f()) {
                    this.f29297p = charSequence2;
                    this.f29298q = z11;
                    return;
                }
                this.f29292k = this.f29289g;
                this.f29289g = charSequence2;
                final ArrayList arrayList = new ArrayList();
                final int i13 = i12;
                final ArrayList arrayList2 = new ArrayList();
                this.f29287e = 0.0f;
                this.d = 0.0f;
                this.f29290i = 0.0f;
                this.h = 0.0f;
                this.f29286c = AndroidUtilities.isRTL(this.f29289g);
                org.telegram.ui.da daVar = new org.telegram.ui.da(this, i13, arrayList2, arrayList, 1);
                n6 n6Var = new n6(this) {
                    public final p6 f27703b;

                    {
                        this.f27703b = this;
                    }

                    @Override
                    public final void d(CharSequence charSequence5) {
                        StaticLayout h;
                        StaticLayout h10;
                        switch (r4) {
                            case 0:
                                p6 p6Var = this.f27703b;
                                m6 m6Var2 = new m6(p6Var, p6Var.h(i13 - ((int) Math.ceil(p6Var.d)), charSequence5), p6Var.d, -1);
                                arrayList.add(m6Var2);
                                p6Var.d += m6Var2.f28391f;
                                p6Var.f29287e = Math.max(p6Var.f29287e, h.getHeight());
                                return;
                            default:
                                p6 p6Var2 = this.f27703b;
                                m6 m6Var3 = new m6(p6Var2, p6Var2.h(i13 - ((int) Math.ceil(p6Var2.h)), charSequence5), p6Var2.h, -1);
                                arrayList.add(m6Var3);
                                p6Var2.h += m6Var3.f28391f;
                                p6Var2.f29290i = Math.max(p6Var2.f29290i, h10.getHeight());
                                return;
                        }
                    }
                };
                n6 n6Var2 = new n6(this) {
                    public final p6 f27703b;

                    {
                        this.f27703b = this;
                    }

                    @Override
                    public final void d(CharSequence charSequence5) {
                        StaticLayout h;
                        StaticLayout h10;
                        switch (r4) {
                            case 0:
                                p6 p6Var = this.f27703b;
                                m6 m6Var2 = new m6(p6Var, p6Var.h(i13 - ((int) Math.ceil(p6Var.d)), charSequence5), p6Var.d, -1);
                                arrayList2.add(m6Var2);
                                p6Var.d += m6Var2.f28391f;
                                p6Var.f29287e = Math.max(p6Var.f29287e, h.getHeight());
                                return;
                            default:
                                p6 p6Var2 = this.f27703b;
                                m6 m6Var3 = new m6(p6Var2, p6Var2.h(i13 - ((int) Math.ceil(p6Var2.h)), charSequence5), p6Var2.h, -1);
                                arrayList2.add(m6Var3);
                                p6Var2.h += m6Var3.f28391f;
                                p6Var2.f29290i = Math.max(p6Var2.f29290i, h10.getHeight());
                                return;
                        }
                    }
                };
                if (this.f29305y) {
                    charSequence3 = new o6(this.f29292k);
                } else {
                    charSequence3 = this.f29292k;
                }
                if (this.f29305y) {
                    charSequence4 = new o6(this.f29289g);
                } else {
                    charSequence4 = this.f29289g;
                }
                if (this.F) {
                    i(n6Var2, charSequence3, 0, charSequence3.length());
                    i(n6Var, charSequence4, 0, charSequence4.length());
                } else if (this.f29306z) {
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
                            i(n6Var, charSequence4.subSequence(0, length3), 0, length3);
                        }
                        if (length4 > 0) {
                            i(n6Var2, charSequence3.subSequence(0, length4), 0, length4);
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
                                    daVar.d(charSequence4.subSequence(length3, length3 + intValue));
                                } else {
                                    daVar.d(charSequence3.subSequence(length4, length4 + intValue));
                                }
                            } else {
                                i11 = size;
                                int i17 = length3 + intValue;
                                i(n6Var, charSequence4.subSequence(length3, i17), length3, i17);
                                int i18 = length4 + intValue;
                                i(n6Var2, charSequence3.subSequence(length4, i18), length4, i18);
                            }
                            length3 += intValue;
                            length4 += intValue;
                            size = i11 - 1;
                        }
                    } else {
                        boolean z19 = true;
                        int i19 = 0;
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
                                        i(n6Var, charSequence4.subSequence(i19, i20), i19, i20);
                                        i(n6Var2, charSequence3.subSequence(i19, i20), i19, i20);
                                    }
                                }
                                i19 = i20;
                                z19 = z14;
                            }
                        }
                        if (charSequence4.length() - min > 0) {
                            i(n6Var, charSequence4.subSequence(min, charSequence4.length()), min, charSequence4.length());
                        }
                        if (charSequence3.length() - min > 0) {
                            i(n6Var2, charSequence3.subSequence(min, charSequence3.length()), min, charSequence3.length());
                        }
                    }
                } else {
                    int min2 = Math.min(charSequence4.length(), charSequence3.length());
                    boolean z20 = true;
                    int i21 = 0;
                    int i22 = 0;
                    int i23 = 0;
                    int i24 = 0;
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
                                    daVar.d(charSequence4.subSequence(i23, i21));
                                } else {
                                    if (i25 > 0) {
                                        i(n6Var, charSequence4.subSequence(i23, i21), i23, i21);
                                    }
                                    if (i26 > 0) {
                                        i(n6Var2, charSequence3.subSequence(i24, i22), i24, i22);
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
                if (this.f29291j != null) {
                    int i27 = 0;
                    while (true) {
                        m6[] m6VarArr = this.f29291j;
                        if (i27 >= m6VarArr.length) {
                            break;
                        }
                        m6 m6Var2 = m6VarArr[i27];
                        p6 p6Var = m6Var2.f28392g;
                        if (p6Var.getCallback() instanceof View) {
                            z5.release((View) p6Var.getCallback(), m6Var2.f28387a);
                        }
                        i27++;
                    }
                }
                this.f29291j = null;
                m6[] m6VarArr2 = this.f29288f;
                if (m6VarArr2 == null || m6VarArr2.length != arrayList.size()) {
                    this.f29288f = new m6[arrayList.size()];
                }
                arrayList.toArray(this.f29288f);
                c();
                m6[] m6VarArr3 = this.f29291j;
                if (m6VarArr3 == null || m6VarArr3.length != arrayList2.size()) {
                    this.f29291j = new m6[arrayList2.size()];
                }
                arrayList2.toArray(this.f29291j);
                ValueAnimator valueAnimator2 = this.f29296o;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.f29295n = z11;
                this.f29294m = 0.0f;
                this.f29296o = ValueAnimator.ofFloat(0.0f, 1.0f);
                Runnable runnable = this.V;
                if (runnable != null) {
                    runnable.run();
                }
                this.f29296o.addUpdateListener(new l6(this, 0));
                this.f29296o.addListener(new j6(this, 1));
                this.f29296o.setStartDelay(0L);
                this.f29296o.setDuration(this.f29299r);
                this.f29296o.setInterpolator(this.f29300s);
                this.f29296o.start();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator3 = this.f29296o;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.f29296o = null;
        this.f29297p = null;
        this.f29298q = false;
        this.f29294m = 0.0f;
        if (!charSequence2.equals(this.f29289g)) {
            if (this.f29291j != null) {
                int i28 = 0;
                while (true) {
                    m6[] m6VarArr4 = this.f29291j;
                    if (i28 >= m6VarArr4.length) {
                        break;
                    }
                    m6 m6Var3 = m6VarArr4[i28];
                    p6 p6Var2 = m6Var3.f28392g;
                    if (p6Var2.getCallback() instanceof View) {
                        z5.release((View) p6Var2.getCallback(), m6Var3.f28387a);
                    }
                    i28++;
                }
            }
            this.f29291j = null;
            this.f29288f = r0;
            this.f29289g = charSequence2;
            m6[] m6VarArr5 = {new m6(this, h(i12, charSequence2), 0.0f, -1)};
            this.d = this.f29288f[0].f28391f;
            this.f29287e = m6Var.f28388b.getHeight();
            this.f29286c = AndroidUtilities.isRTL(this.f29289g);
        }
        c();
        this.f29292k = null;
        this.h = 0.0f;
        this.f29290i = 0.0f;
        invalidateSelf();
        Runnable runnable2 = this.V;
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    public final void r(int i10) {
        this.f29284a.setColor(i10);
        this.f29303w = Color.alpha(i10);
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
        int color = this.f29284a.getColor();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.S = ofFloat;
        ofFloat.addUpdateListener(new di.d5(this, color, i10, 2));
        this.S.addListener(new fi.v2(this, i10, 4));
        this.S.setDuration(240L);
        this.S.setInterpolator(pr.h);
        this.S.start();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f29303w = i10;
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.f29304x.set(rect);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29284a.setColorFilter(colorFilter);
    }

    public final void t(float f7) {
        TextPaint textPaint = this.f29284a;
        float textSize = textPaint.getTextSize();
        textPaint.setTextSize(f7);
        if (Math.abs(textSize - f7) > 0.5f) {
            int i10 = this.G;
            if (i10 <= 0) {
                i10 = this.f29304x.width();
            }
            int i11 = 0;
            if (this.f29288f != null) {
                this.d = 0.0f;
                this.f29287e = 0.0f;
                int i12 = 0;
                while (true) {
                    m6[] m6VarArr = this.f29288f;
                    if (i12 >= m6VarArr.length) {
                        break;
                    }
                    StaticLayout h = h(i10 - ((int) Math.ceil(Math.min(this.d, this.h))), m6VarArr[i12].f28388b.getText());
                    m6[] m6VarArr2 = this.f29288f;
                    m6 m6Var = m6VarArr2[i12];
                    m6VarArr2[i12] = new m6(this, h, m6Var.f28389c, m6Var.d);
                    float f10 = this.d;
                    m6 m6Var2 = this.f29288f[i12];
                    this.d = f10 + m6Var2.f28391f;
                    this.f29287e = Math.max(this.f29287e, m6Var2.f28388b.getHeight());
                    i12++;
                }
            }
            if (this.f29291j != null) {
                this.h = 0.0f;
                this.f29290i = 0.0f;
                while (true) {
                    m6[] m6VarArr3 = this.f29291j;
                    if (i11 >= m6VarArr3.length) {
                        break;
                    }
                    StaticLayout h10 = h(i10 - ((int) Math.ceil(Math.min(this.d, this.h))), m6VarArr3[i11].f28388b.getText());
                    m6[] m6VarArr4 = this.f29291j;
                    m6 m6Var3 = m6VarArr4[i11];
                    m6VarArr4[i11] = new m6(this, h10, m6Var3.f28389c, m6Var3.d);
                    float f11 = this.h;
                    m6 m6Var4 = this.f29291j[i11];
                    this.h = f11 + m6Var4.f28391f;
                    this.f29290i = Math.max(this.f29290i, m6Var4.f28388b.getHeight());
                    i11++;
                }
            }
            invalidateSelf();
        }
    }

    public final void u(Typeface typeface) {
        this.f29284a.setTypeface(typeface);
    }

    public p6(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f29284a = new TextPaint(1);
        this.f29285b = 0;
        this.f29286c = false;
        this.f29293l = 0;
        this.f29294m = 0.0f;
        this.f29295n = true;
        this.f29299r = 320L;
        this.f29300s = pr.h;
        this.f29301t = -1.0f;
        this.f29302u = 0.3f;
        this.v = 0.0f;
        this.f29303w = 255;
        this.f29304x = new Rect();
        this.M = true;
        this.N = true;
        this.O = false;
        this.f29305y = z10;
        this.f29306z = z11;
        this.A = z12;
        this.B = z13;
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f29304x.set(i10, i11, i12, i13);
    }
}
