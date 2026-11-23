package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.Arrays;
import java.util.Random;
import org.telegram.messenger.hd;
public final class f9 extends View {
    public ValueAnimator E;
    public final g9 F;
    public final Paint f44261a;
    public final char[] f44262b;
    public final Random f44263c;
    public final int[] d;
    public final float[] f44264e;
    public final float f44265f;
    public final float h;
    public final float f44266n;
    public final float f44267r;
    public final Paint.FontMetrics f44268s;
    public String f44269w;
    public float f44270x;
    public boolean f44271y;

    public f9(g9 g9Var, Context context) {
        super(context);
        this.F = g9Var;
        Paint paint = new Paint(1);
        this.f44261a = paint;
        this.f44262b = new char[1];
        this.f44263c = new Random();
        this.d = new int[48];
        this.f44264e = new float[48];
        paint.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        paint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        this.f44265f = paint.measureText("U");
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        this.f44268s = fontMetrics;
        float f10 = fontMetrics.top;
        this.f44266n = -f10;
        float f11 = fontMetrics.descent - fontMetrics.ascent;
        this.h = f11;
        this.f44267r = (fontMetrics.bottom - f10) + f11;
        setImportantForAccessibility(1);
        setContentDescription(hd.N0(2131748586, null));
    }

    public final float a() {
        String str = this.f44269w;
        int i7 = 24;
        if (str != null) {
            i7 = Math.min(24, str.length());
        }
        return this.f44265f * (Math.max(0, (i7 - 1) / 4) + i7);
    }

    public final int b() {
        int max = Math.max(0, Math.min(24, this.f44269w.length()) - 1);
        return (((max / 4) + max) * 18) + 560;
    }

    public final void c(String str, boolean z10) {
        boolean z11;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        if (!z10 && TextUtils.equals(this.f44269w, str)) {
            return;
        }
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.E = null;
        }
        this.f44269w = str;
        this.f44270x = 0.0f;
        Arrays.fill(this.d, -1);
        String str2 = this.f44269w;
        if (str2 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f44271y = z11;
        if (str2 == null) {
            str2 = hd.N0(2131748586, null);
        }
        setContentDescription(str2);
        requestLayout();
        d();
        invalidate();
    }

    public final void d() {
        if (this.f44271y && isAttachedToWindow() && isShown()) {
            this.f44271y = false;
            int b10 = b();
            if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
                this.f44270x = b10;
                invalidate();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, b10);
            this.E = ofFloat;
            ofFloat.setDuration(b10);
            this.E.setInterpolator(new LinearInterpolator());
            this.E.addUpdateListener(new z3(this, 6));
            this.E.start();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    @Override
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.E = null;
        }
        if (this.f44269w != null && !this.f44271y) {
            this.f44270x = b();
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        float max;
        Canvas canvas2;
        int i10;
        float f10;
        float f11;
        Paint paint;
        float f12;
        float f13;
        float f14;
        float C;
        int i11;
        float f15;
        float cos;
        boolean z10;
        float f16;
        char charAt;
        float[] fArr;
        int i12;
        float f17;
        float f18;
        int i13;
        int i14;
        super.onDraw(canvas);
        int i15 = org.telegram.ui.ActionBar.m6.D6;
        org.telegram.ui.ActionBar.h6 h6Var = this.F.f44315a;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i15, h6Var);
        int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, h6Var);
        String str = this.f44269w;
        int i16 = 48;
        if (str != null) {
            i16 = Math.min(48, str.length());
        }
        int i17 = i16;
        int i18 = 0;
        while (true) {
            int i19 = i18 * 4;
            if (i19 < i17) {
                int i20 = i19 / 24;
                int i21 = (i18 % 6) * 5;
                float f19 = this.f44265f;
                float f20 = i21 * f19;
                float f21 = i20 * this.h;
                float f22 = this.f44266n;
                float f23 = f21 + f22;
                float f24 = this.f44270x - (i7 * 90);
                if (this.f44269w == null) {
                    max = 1.0f;
                } else {
                    max = 1.0f - Math.max(0.0f, Math.min(1.0f, f24 / 180.0f));
                }
                int i22 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
                float f25 = 0.0f;
                Paint.FontMetrics fontMetrics = this.f44268s;
                int i23 = i18;
                Paint paint2 = this.f44261a;
                if (i22 > 0) {
                    paint2.setColor(w02);
                    paint2.setAlpha(Math.round(paint2.getAlpha() * 0.22f * max));
                    float a10 = org.telegram.messenger.f3.a(fontMetrics.ascent, fontMetrics.descent, 2.0f, f23);
                    f10 = f19;
                    f14 = f23;
                    f12 = 1.0f;
                    f11 = f22;
                    i10 = i21;
                    canvas2 = canvas;
                    canvas2.drawRoundRect(f20, a10 - org.telegram.messenger.g0.L(2.0f), (Math.min(4, i17 - i19) * f19) + f20, a10 + org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), paint2);
                    paint = paint2;
                    f13 = f20;
                } else {
                    canvas2 = canvas;
                    i10 = i21;
                    f10 = f19;
                    f11 = f22;
                    paint = paint2;
                    f12 = 1.0f;
                    f13 = f20;
                    f14 = f23;
                }
                if (this.f44269w != null) {
                    int i24 = 0;
                    int i25 = 4;
                    while (i24 < i25) {
                        int i26 = i19 + i24;
                        if (i26 < i17) {
                            float f26 = this.f44270x - ((i10 + i24) * 18);
                            if (f26 <= f25) {
                                i14 = i25;
                                i11 = i19;
                                f18 = f25;
                                i13 = i24;
                            } else {
                                if (a8.p0.C(f26, 560.0f, f12, f25) >= f12) {
                                    f15 = f26;
                                    i11 = i19;
                                    cos = 0.0f;
                                } else {
                                    i11 = i19;
                                    f15 = f26;
                                    cos = (float) (Math.cos(C * 12.0f) * Math.exp((-8.0f) * C));
                                }
                                int i27 = (int) (f15 / 50.0f);
                                if (f15 < 260.0f) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    f16 = f15;
                                    charAt = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(((i27 * 13) + (i26 * 17)) % 64);
                                } else {
                                    f16 = f15;
                                    charAt = this.f44269w.charAt(i26);
                                }
                                this.f44262b[0] = charAt;
                                float[] fArr2 = this.f44264e;
                                if (z10) {
                                    int[] iArr = this.d;
                                    fArr = fArr2;
                                    if (iArr[i26] != i27) {
                                        iArr[i26] = i27;
                                        fArr[i26] = this.f44263c.nextFloat();
                                    }
                                } else {
                                    fArr = fArr2;
                                }
                                if (z10) {
                                    i12 = i0.a.f(fArr[i26], w02, w03);
                                } else if ((i23 + i20) % 2 == 0) {
                                    i12 = w02;
                                } else {
                                    i12 = w03;
                                }
                                paint.setColor(i12);
                                paint.setAlpha(Math.round(Math.max(0.0f, Math.min(1.0f, f16 / 100.0f)) * paint.getAlpha()));
                                int save = canvas2.save();
                                float L = org.telegram.messenger.g0.L(1.0f) + f11 + fontMetrics.descent;
                                if (i20 == 0) {
                                    f17 = 0.0f;
                                } else {
                                    f17 = L;
                                }
                                float width = getWidth();
                                if (i20 != 0) {
                                    L = getHeight();
                                }
                                f18 = 0.0f;
                                canvas2.clipRect(0.0f, f17, width, L);
                                i13 = i24;
                                i14 = 4;
                                canvas2.drawText(this.f44262b, 0, 1, (i24 * f10) + f13, f14 - (org.telegram.messenger.g0.L(24.0f) * cos), paint);
                                canvas2.restoreToCount(save);
                            }
                            i24 = i13 + 1;
                            f25 = f18;
                            i25 = i14;
                            i19 = i11;
                            f12 = 1.0f;
                        }
                    }
                }
                i18 = i23 + 1;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.resolveSize((int) Math.ceil(a()), i7), View.resolveSize((int) Math.ceil(this.f44267r), i10));
    }

    @Override
    public final void onVisibilityChanged(View view, int i7) {
        float b10;
        super.onVisibilityChanged(view, i7);
        if (isShown()) {
            d();
            return;
        }
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.E = null;
            }
            if (this.f44269w == null) {
                b10 = 0.0f;
            } else {
                b10 = b();
            }
            this.f44270x = b10;
        }
    }
}
