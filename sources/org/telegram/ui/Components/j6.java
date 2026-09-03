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
public class j6 extends Drawable {
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
    public final TextPaint f25846a;
    public int f25847b;
    public boolean f25848c;
    public float d;
    public float e;
    public g6[] f25849f;
    public CharSequence f25850g;
    public float h;
    public float f25851i;
    public g6[] f25852j;
    public CharSequence f25853k;
    public int f25854l;
    public float f25855m;
    public boolean f25856n;
    public ValueAnimator f25857o;
    public CharSequence f25858p;
    public boolean f25859q;
    public long f25860r;
    public TimeInterpolator f25861s;
    public float f25862t;
    public float f25863u;
    public float v;
    public int f25864w;
    public final Rect f25865x;
    public boolean f25866y;
    public boolean f25867z;

    public j6(int i10) {
        this(false, true, true, false);
    }

    public static boolean j(int r2, int r3, java.lang.CharSequence r4, java.lang.CharSequence r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j6.j(int, int, java.lang.CharSequence, java.lang.CharSequence):boolean");
    }

    public final void a(float f10) {
        TextPaint textPaint = this.f25846a;
        textPaint.setAlpha((int) (this.f25864w * f10));
        if (this.O) {
            textPaint.setShadowLayer(this.P, 0.0f, this.Q, org.telegram.ui.ActionBar.j6.l1(f10, this.R));
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f25857o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void c() {
        if (this.f25852j != null) {
            int i10 = 0;
            while (true) {
                g6[] g6VarArr = this.f25852j;
                if (i10 >= g6VarArr.length) {
                    break;
                }
                g6 g6Var = g6VarArr[i10];
                j6 j6Var = g6Var.f25067g;
                if (j6Var.getCallback() instanceof View) {
                    u5.release((View) j6Var.getCallback(), g6Var.f25063a);
                }
                i10++;
            }
        }
        this.f25852j = null;
    }

    public final float d() {
        if (this.f25849f != null && this.f25852j != null) {
            return AndroidUtilities.lerp(this.h, this.d, this.f25855m);
        }
        return this.d;
    }

    @Override
    public final void draw(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j6.draw(android.graphics.Canvas):void");
    }

    public final float e() {
        return Math.max(this.d, this.h);
    }

    public final boolean f() {
        ValueAnimator valueAnimator = this.f25857o;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final float g() {
        float f10;
        CharSequence charSequence = this.f25853k;
        float f11 = 0.0f;
        float f12 = 1.0f;
        if (charSequence != null && charSequence.length() > 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        CharSequence charSequence2 = this.f25850g;
        if (charSequence2 != null && charSequence2.length() > 0) {
            f11 = 1.0f;
        }
        if (this.f25853k != null) {
            f12 = this.f25855m;
        }
        return AndroidUtilities.lerp(f10, f11, f12);
    }

    @Override
    public final Rect getDirtyBounds() {
        return this.f25865x;
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
        TextPaint textPaint = this.f25846a;
        if (i12 >= 23) {
            return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i11).setMaxLines(1).setLineSpacing(0.0f, 1.0f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i11).setIncludePad(this.M).build();
        }
        return new StaticLayout(charSequence, 0, charSequence.length(), textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, this.M, TextUtils.TruncateAt.END, i11);
    }

    public final void i(h6 h6Var, CharSequence charSequence, int i10, int i11) {
        if (this.B && charSequence.length() > 1) {
            int i12 = 0;
            while (i12 < charSequence.length()) {
                int i13 = i12 + 1;
                h6Var.a(charSequence.subSequence(i12, i13));
                i12 = i13;
            }
            return;
        }
        h6Var.a(charSequence);
    }

    public final void k(float f10, long j10, TimeInterpolator timeInterpolator) {
        this.f25863u = f10;
        this.f25860r = j10;
        this.f25862t = 1.0f;
        this.f25861s = timeInterpolator;
    }

    public final void l(float f10, float f11, float f12, float f13) {
        int i10 = (int) f10;
        int i11 = (int) f11;
        int i12 = (int) f12;
        int i13 = (int) f13;
        super.setBounds(i10, i11, i12, i13);
        this.f25865x.set(i10, i11, i12, i13);
    }

    public final void m(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void n(boolean z4) {
        this.I = z4;
        invalidateSelf();
    }

    public final void o(boolean z4, boolean z10, boolean z11) {
        this.f25866y = z4;
        this.f25867z = true;
        this.A = z10;
        this.B = z11;
    }

    public final void p(float f10, float f11, int i10) {
        this.O = true;
        this.P = f10;
        this.Q = f11;
        this.R = i10;
        this.f25846a.setShadowLayer(f10, 0.0f, f11, i10);
    }

    public final void q(CharSequence charSequence, boolean z4, boolean z10) {
        boolean z11;
        CharSequence charSequence2;
        g6 g6Var;
        CharSequence charSequence3;
        CharSequence charSequence4;
        boolean z12;
        int i10;
        boolean z13;
        boolean z14;
        int i11;
        boolean z15;
        if (this.f25850g != null && charSequence != null) {
            z11 = z4;
        } else {
            z11 = false;
        }
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence;
        }
        final int i12 = this.G;
        if (i12 <= 0) {
            i12 = this.f25865x.width();
        }
        boolean z16 = true;
        if (z11) {
            if (!TextUtils.equals(charSequence2, this.f25850g)) {
                if (this.D) {
                    ValueAnimator valueAnimator = this.f25857o;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f25857o = null;
                    }
                } else if (f()) {
                    this.f25858p = charSequence2;
                    this.f25859q = z10;
                    return;
                }
                this.f25853k = this.f25850g;
                this.f25850g = charSequence2;
                final ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                this.e = 0.0f;
                this.d = 0.0f;
                this.f25851i = 0.0f;
                this.h = 0.0f;
                this.f25848c = AndroidUtilities.isRTL(this.f25850g);
                gg.a0 a0Var = new gg.a0(this, i12, arrayList2, arrayList);
                h6 h6Var = new h6(this) {
                    public final j6 f24490b;

                    {
                        this.f24490b = this;
                    }

                    @Override
                    public final void a(CharSequence charSequence5) {
                        StaticLayout h;
                        StaticLayout h9;
                        switch (r4) {
                            case 0:
                                j6 j6Var = this.f24490b;
                                g6 g6Var2 = new g6(j6Var, j6Var.h(i12 - ((int) Math.ceil(j6Var.d)), charSequence5), j6Var.d, -1);
                                arrayList.add(g6Var2);
                                j6Var.d += g6Var2.f25066f;
                                j6Var.e = Math.max(j6Var.e, h.getHeight());
                                return;
                            default:
                                j6 j6Var2 = this.f24490b;
                                g6 g6Var3 = new g6(j6Var2, j6Var2.h(i12 - ((int) Math.ceil(j6Var2.h)), charSequence5), j6Var2.h, -1);
                                arrayList.add(g6Var3);
                                j6Var2.h += g6Var3.f25066f;
                                j6Var2.f25851i = Math.max(j6Var2.f25851i, h9.getHeight());
                                return;
                        }
                    }
                };
                h6 h6Var2 = new h6(this) {
                    public final j6 f24490b;

                    {
                        this.f24490b = this;
                    }

                    @Override
                    public final void a(CharSequence charSequence5) {
                        StaticLayout h;
                        StaticLayout h9;
                        switch (r4) {
                            case 0:
                                j6 j6Var = this.f24490b;
                                g6 g6Var2 = new g6(j6Var, j6Var.h(i12 - ((int) Math.ceil(j6Var.d)), charSequence5), j6Var.d, -1);
                                arrayList2.add(g6Var2);
                                j6Var.d += g6Var2.f25066f;
                                j6Var.e = Math.max(j6Var.e, h.getHeight());
                                return;
                            default:
                                j6 j6Var2 = this.f24490b;
                                g6 g6Var3 = new g6(j6Var2, j6Var2.h(i12 - ((int) Math.ceil(j6Var2.h)), charSequence5), j6Var2.h, -1);
                                arrayList2.add(g6Var3);
                                j6Var2.h += g6Var3.f25066f;
                                j6Var2.f25851i = Math.max(j6Var2.f25851i, h9.getHeight());
                                return;
                        }
                    }
                };
                if (this.f25866y) {
                    charSequence3 = new i6(this.f25853k);
                } else {
                    charSequence3 = this.f25853k;
                }
                if (this.f25866y) {
                    charSequence4 = new i6(this.f25850g);
                } else {
                    charSequence4 = this.f25850g;
                }
                if (this.F) {
                    i(h6Var2, charSequence3, 0, charSequence3.length());
                    i(h6Var, charSequence4, 0, charSequence4.length());
                } else if (this.f25867z) {
                    int min = Math.min(charSequence4.length(), charSequence3.length());
                    if (this.A) {
                        ArrayList arrayList3 = new ArrayList();
                        boolean z17 = true;
                        int i13 = 0;
                        for (int i14 = 0; i14 <= min; i14++) {
                            int length = (charSequence4.length() - i14) - 1;
                            int length2 = (charSequence3.length() - i14) - 1;
                            if (length >= 0 && length2 >= 0 && j(length, length2, charSequence4, charSequence3)) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z16 != z15 || i14 == min) {
                                int i15 = i14 - i13;
                                if (i15 > 0) {
                                    if (arrayList3.size() != 0) {
                                        z16 = z17;
                                    }
                                    arrayList3.add(Integer.valueOf(i15));
                                    z17 = z16;
                                }
                                z16 = z15;
                                i13 = i14;
                            }
                        }
                        int length3 = charSequence4.length() - min;
                        int length4 = charSequence3.length() - min;
                        if (length3 > 0) {
                            i(h6Var, charSequence4.subSequence(0, length3), 0, length3);
                        }
                        if (length4 > 0) {
                            i(h6Var2, charSequence3.subSequence(0, length4), 0, length4);
                        }
                        int size = arrayList3.size() - 1;
                        while (size >= 0) {
                            int intValue = ((Integer) arrayList3.get(size)).intValue();
                            if (size % 2 == 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z14 == z17) {
                                i11 = size;
                                if (charSequence4.length() > charSequence3.length()) {
                                    a0Var.a(charSequence4.subSequence(length3, length3 + intValue));
                                } else {
                                    a0Var.a(charSequence3.subSequence(length4, length4 + intValue));
                                }
                            } else {
                                i11 = size;
                                int i16 = length3 + intValue;
                                i(h6Var, charSequence4.subSequence(length3, i16), length3, i16);
                                int i17 = length4 + intValue;
                                i(h6Var2, charSequence3.subSequence(length4, i17), length4, i17);
                            }
                            length3 += intValue;
                            length4 += intValue;
                            size = i11 - 1;
                        }
                    } else {
                        int i18 = 0;
                        boolean z18 = true;
                        for (int i19 = 0; i19 <= min; i19++) {
                            if (i19 < min && j(i19, i19, charSequence4, charSequence3)) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z18 != z13 || i19 == min) {
                                if (i19 - i18 > 0) {
                                    if (z18) {
                                        i(a0Var, charSequence4.subSequence(i18, i19), i18, i19);
                                    } else {
                                        i(h6Var, charSequence4.subSequence(i18, i19), i18, i19);
                                        i(h6Var2, charSequence3.subSequence(i18, i19), i18, i19);
                                    }
                                }
                                i18 = i19;
                                z18 = z13;
                            }
                        }
                        if (charSequence4.length() - min > 0) {
                            i(h6Var, charSequence4.subSequence(min, charSequence4.length()), min, charSequence4.length());
                        }
                        if (charSequence3.length() - min > 0) {
                            i(h6Var2, charSequence3.subSequence(min, charSequence3.length()), min, charSequence3.length());
                        }
                    }
                } else {
                    int min2 = Math.min(charSequence4.length(), charSequence3.length());
                    int i20 = 0;
                    int i21 = 0;
                    int i22 = 0;
                    int i23 = 0;
                    boolean z19 = true;
                    while (i20 <= min2) {
                        if (i20 < min2 && j(i20, i21, charSequence4, charSequence3)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z19 == z12 && i20 != min2) {
                            i10 = min2;
                        } else {
                            if (i20 == min2) {
                                i20 = charSequence4.length();
                                i21 = charSequence3.length();
                            }
                            i10 = min2;
                            int i24 = i20 - i22;
                            boolean z20 = z19;
                            int i25 = i21 - i23;
                            if (i24 > 0 || i25 > 0) {
                                if (i24 == i25 && z20) {
                                    a0Var.a(charSequence4.subSequence(i22, i20));
                                } else {
                                    if (i24 > 0) {
                                        i(h6Var, charSequence4.subSequence(i22, i20), i22, i20);
                                    }
                                    if (i25 > 0) {
                                        i(h6Var2, charSequence3.subSequence(i23, i21), i23, i21);
                                    }
                                }
                            }
                            i22 = i20;
                            i23 = i21;
                            z19 = z12;
                        }
                        if (z12) {
                            i21++;
                        }
                        i20++;
                        min2 = i10;
                    }
                }
                if (this.f25852j != null) {
                    int i26 = 0;
                    while (true) {
                        g6[] g6VarArr = this.f25852j;
                        if (i26 >= g6VarArr.length) {
                            break;
                        }
                        g6 g6Var2 = g6VarArr[i26];
                        j6 j6Var = g6Var2.f25067g;
                        if (j6Var.getCallback() instanceof View) {
                            u5.release((View) j6Var.getCallback(), g6Var2.f25063a);
                        }
                        i26++;
                    }
                }
                this.f25852j = null;
                g6[] g6VarArr2 = this.f25849f;
                if (g6VarArr2 == null || g6VarArr2.length != arrayList.size()) {
                    this.f25849f = new g6[arrayList.size()];
                }
                arrayList.toArray(this.f25849f);
                c();
                g6[] g6VarArr3 = this.f25852j;
                if (g6VarArr3 == null || g6VarArr3.length != arrayList2.size()) {
                    this.f25852j = new g6[arrayList2.size()];
                }
                arrayList2.toArray(this.f25852j);
                ValueAnimator valueAnimator2 = this.f25857o;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.f25856n = z10;
                this.f25855m = 0.0f;
                this.f25857o = ValueAnimator.ofFloat(0.0f, 1.0f);
                Runnable runnable = this.V;
                if (runnable != null) {
                    runnable.run();
                }
                this.f25857o.addUpdateListener(new f6(this, 0));
                this.f25857o.addListener(new org.telegram.ui.u5(this, 27));
                this.f25857o.setStartDelay(0L);
                this.f25857o.setDuration(this.f25860r);
                this.f25857o.setInterpolator(this.f25861s);
                this.f25857o.start();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator3 = this.f25857o;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.f25857o = null;
        this.f25858p = null;
        this.f25859q = false;
        this.f25855m = 0.0f;
        if (!charSequence2.equals(this.f25850g)) {
            if (this.f25852j != null) {
                int i27 = 0;
                while (true) {
                    g6[] g6VarArr4 = this.f25852j;
                    if (i27 >= g6VarArr4.length) {
                        break;
                    }
                    g6 g6Var3 = g6VarArr4[i27];
                    j6 j6Var2 = g6Var3.f25067g;
                    if (j6Var2.getCallback() instanceof View) {
                        u5.release((View) j6Var2.getCallback(), g6Var3.f25063a);
                    }
                    i27++;
                }
            }
            this.f25852j = null;
            this.f25849f = r1;
            this.f25850g = charSequence2;
            g6[] g6VarArr5 = {new g6(this, h(i12, charSequence2), 0.0f, -1)};
            this.d = this.f25849f[0].f25066f;
            this.e = g6Var.f25064b.getHeight();
            this.f25848c = AndroidUtilities.isRTL(this.f25850g);
        }
        c();
        this.f25853k = null;
        this.h = 0.0f;
        this.f25851i = 0.0f;
        invalidateSelf();
        Runnable runnable2 = this.V;
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    public final void r(int i10) {
        this.f25846a.setColor(i10);
        this.f25864w = Color.alpha(i10);
    }

    public final void s(int i10, boolean z4) {
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.S = null;
        }
        if (!z4) {
            r(i10);
            return;
        }
        int color = this.f25846a.getColor();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.S = ofFloat;
        ofFloat.addUpdateListener(new dg.g0(this, color, i10, 2));
        this.S.addListener(new org.telegram.ui.Cells.a4(this, i10, 1));
        this.S.setDuration(240L);
        this.S.setInterpolator(mr.h);
        this.S.start();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f25864w = i10;
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.f25865x.set(rect);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f25846a.setColorFilter(colorFilter);
    }

    public final void t(float f10) {
        TextPaint textPaint = this.f25846a;
        float textSize = textPaint.getTextSize();
        textPaint.setTextSize(f10);
        if (Math.abs(textSize - f10) > 0.5f) {
            int i10 = this.G;
            if (i10 <= 0) {
                i10 = this.f25865x.width();
            }
            int i11 = 0;
            if (this.f25849f != null) {
                this.d = 0.0f;
                this.e = 0.0f;
                int i12 = 0;
                while (true) {
                    g6[] g6VarArr = this.f25849f;
                    if (i12 >= g6VarArr.length) {
                        break;
                    }
                    StaticLayout h = h(i10 - ((int) Math.ceil(Math.min(this.d, this.h))), g6VarArr[i12].f25064b.getText());
                    g6[] g6VarArr2 = this.f25849f;
                    g6 g6Var = g6VarArr2[i12];
                    g6VarArr2[i12] = new g6(this, h, g6Var.f25065c, g6Var.d);
                    float f11 = this.d;
                    g6 g6Var2 = this.f25849f[i12];
                    this.d = f11 + g6Var2.f25066f;
                    this.e = Math.max(this.e, g6Var2.f25064b.getHeight());
                    i12++;
                }
            }
            if (this.f25852j != null) {
                this.h = 0.0f;
                this.f25851i = 0.0f;
                while (true) {
                    g6[] g6VarArr3 = this.f25852j;
                    if (i11 >= g6VarArr3.length) {
                        break;
                    }
                    StaticLayout h9 = h(i10 - ((int) Math.ceil(Math.min(this.d, this.h))), g6VarArr3[i11].f25064b.getText());
                    g6[] g6VarArr4 = this.f25852j;
                    g6 g6Var3 = g6VarArr4[i11];
                    g6VarArr4[i11] = new g6(this, h9, g6Var3.f25065c, g6Var3.d);
                    float f12 = this.h;
                    g6 g6Var4 = this.f25852j[i11];
                    this.h = f12 + g6Var4.f25066f;
                    this.f25851i = Math.max(this.f25851i, g6Var4.f25064b.getHeight());
                    i11++;
                }
            }
            invalidateSelf();
        }
    }

    public final void u(Typeface typeface) {
        this.f25846a.setTypeface(typeface);
    }

    public j6(boolean z4, boolean z10, boolean z11, boolean z12) {
        this.f25846a = new TextPaint(1);
        this.f25847b = 0;
        this.f25848c = false;
        this.f25854l = 0;
        this.f25855m = 0.0f;
        this.f25856n = true;
        this.f25860r = 320L;
        this.f25861s = mr.h;
        this.f25862t = -1.0f;
        this.f25863u = 0.3f;
        this.v = 0.0f;
        this.f25864w = 255;
        this.f25865x = new Rect();
        this.M = true;
        this.N = true;
        this.O = false;
        this.f25866y = z4;
        this.f25867z = z10;
        this.A = z11;
        this.B = z12;
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f25865x.set(i10, i11, i12, i13);
    }
}
