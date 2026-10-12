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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o7 extends View {
    public final p7 E;
    public final Paint f35179a;
    public final char[] f35180b;
    public final Random f35181c;
    public final int[] d;
    public final float[] f35182e;
    public final float f35183f;
    public final float h;
    public final float f35184n;
    public final float f35185r;
    public final Paint.FontMetrics f35186s;
    public String v;
    public float f35187w;
    public boolean f35188x;
    public ValueAnimator f35189y;

    public o7(p7 p7Var, Context context) {
        super(context);
        this.E = p7Var;
        Paint paint = new Paint(1);
        this.f35179a = paint;
        this.f35180b = new char[1];
        this.f35181c = new Random();
        this.d = new int[48];
        this.f35182e = new float[48];
        paint.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        paint.setTextSize(AndroidUtilities.dp(12.0f));
        this.f35183f = paint.measureText("U");
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        this.f35186s = fontMetrics;
        float f7 = fontMetrics.top;
        this.f35184n = -f7;
        float f10 = fontMetrics.descent - fontMetrics.ascent;
        this.h = f10;
        this.f35185r = (fontMetrics.bottom - f7) + f10;
        setImportantForAccessibility(1);
        setContentDescription(LocaleController.getString(R.string.Loading));
    }

    public final float a() {
        String str = this.v;
        int i10 = 24;
        if (str != null) {
            i10 = Math.min(24, str.length());
        }
        return this.f35183f * (Math.max(0, (i10 - 1) / 4) + i10);
    }

    public final int b() {
        int max = Math.max(0, Math.min(24, this.v.length()) - 1);
        return (((max / 4) + max) * 18) + 560;
    }

    public final void c(String str, boolean z10) {
        boolean z11;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        if (!z10 && TextUtils.equals(this.v, str)) {
            return;
        }
        ValueAnimator valueAnimator = this.f35189y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f35189y = null;
        }
        this.v = str;
        this.f35187w = 0.0f;
        Arrays.fill(this.d, -1);
        String str2 = this.v;
        if (str2 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f35188x = z11;
        if (str2 == null) {
            str2 = LocaleController.getString(R.string.Loading);
        }
        setContentDescription(str2);
        requestLayout();
        d();
        invalidate();
    }

    public final void d() {
        if (this.f35188x && isAttachedToWindow() && isShown()) {
            this.f35188x = false;
            int b10 = b();
            if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
                this.f35187w = b10;
                invalidate();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, b10);
            this.f35189y = ofFloat;
            ofFloat.setDuration(b10);
            this.f35189y.setInterpolator(new LinearInterpolator());
            this.f35189y.addUpdateListener(new u2(this, 6));
            this.f35189y.start();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    @Override
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.f35189y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f35189y = null;
        }
        if (this.v != null && !this.f35188x) {
            this.f35187w = b();
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float max;
        Canvas canvas2;
        int i11;
        float f7;
        float f10;
        Paint paint;
        float f11;
        float f12;
        float f13;
        float max2;
        int i12;
        float f14;
        float cos;
        boolean z10;
        float f15;
        char charAt;
        float[] fArr;
        int i13;
        float f16;
        float f17;
        int i14;
        int i15;
        super.onDraw(canvas);
        int i16 = org.telegram.ui.ActionBar.h6.D6;
        org.telegram.ui.ActionBar.c6 c6Var = this.E.f35235a;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i16, c6Var);
        int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, c6Var);
        String str = this.v;
        int i17 = 48;
        if (str != null) {
            i17 = Math.min(48, str.length());
        }
        int i18 = i17;
        int i19 = 0;
        while (true) {
            int i20 = i19 * 4;
            if (i20 < i18) {
                int i21 = i20 / 24;
                int i22 = (i19 % 6) * 5;
                float f18 = this.f35183f;
                float f19 = i22 * f18;
                float f20 = i21 * this.h;
                float f21 = this.f35184n;
                float f22 = f20 + f21;
                float f23 = this.f35187w - (i10 * 90);
                if (this.v == null) {
                    max = 1.0f;
                } else {
                    max = 1.0f - Math.max(0.0f, Math.min(1.0f, f23 / 180.0f));
                }
                int i23 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
                float f24 = 0.0f;
                Paint.FontMetrics fontMetrics = this.f35186s;
                int i24 = i19;
                Paint paint2 = this.f35179a;
                if (i23 > 0) {
                    paint2.setColor(w02);
                    paint2.setAlpha(Math.round(paint2.getAlpha() * 0.22f * max));
                    float a2 = org.telegram.messenger.v0.a(fontMetrics.ascent, fontMetrics.descent, 2.0f, f22);
                    f7 = f18;
                    f13 = f22;
                    f11 = 1.0f;
                    f10 = f21;
                    i11 = i22;
                    canvas2 = canvas;
                    canvas2.drawRoundRect(f19, a2 - AndroidUtilities.dp(2.0f), (Math.min(4, i18 - i20) * f18) + f19, a2 + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint2);
                    paint = paint2;
                    f12 = f19;
                } else {
                    canvas2 = canvas;
                    i11 = i22;
                    f7 = f18;
                    f10 = f21;
                    paint = paint2;
                    f11 = 1.0f;
                    f12 = f19;
                    f13 = f22;
                }
                if (this.v != null) {
                    int i25 = 0;
                    int i26 = 4;
                    while (i25 < i26) {
                        int i27 = i20 + i25;
                        if (i27 < i18) {
                            float f25 = this.f35187w - ((i11 + i25) * 18);
                            if (f25 <= f24) {
                                i15 = i26;
                                i12 = i20;
                                f17 = f24;
                                i14 = i25;
                            } else {
                                if (Math.max(f24, Math.min(f11, f25 / 560.0f)) >= f11) {
                                    f14 = f25;
                                    i12 = i20;
                                    cos = 0.0f;
                                } else {
                                    i12 = i20;
                                    f14 = f25;
                                    cos = (float) (Math.cos(max2 * 12.0f) * Math.exp((-8.0f) * max2));
                                }
                                int i28 = (int) (f14 / 50.0f);
                                if (f14 < 260.0f) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    f15 = f14;
                                    charAt = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(((i28 * 13) + (i27 * 17)) % 64);
                                } else {
                                    f15 = f14;
                                    charAt = this.v.charAt(i27);
                                }
                                this.f35180b[0] = charAt;
                                float[] fArr2 = this.f35182e;
                                if (z10) {
                                    int[] iArr = this.d;
                                    fArr = fArr2;
                                    if (iArr[i27] != i28) {
                                        iArr[i27] = i28;
                                        fArr[i27] = this.f35181c.nextFloat();
                                    }
                                } else {
                                    fArr = fArr2;
                                }
                                if (z10) {
                                    i13 = i0.a.d(fArr[i27], w02, w03);
                                } else if ((i24 + i21) % 2 == 0) {
                                    i13 = w02;
                                } else {
                                    i13 = w03;
                                }
                                paint.setColor(i13);
                                paint.setAlpha(Math.round(Math.max(0.0f, Math.min(1.0f, f15 / 100.0f)) * paint.getAlpha()));
                                int save = canvas2.save();
                                float dp = AndroidUtilities.dp(1.0f) + f10 + fontMetrics.descent;
                                if (i21 == 0) {
                                    f16 = 0.0f;
                                } else {
                                    f16 = dp;
                                }
                                float width = getWidth();
                                if (i21 != 0) {
                                    dp = getHeight();
                                }
                                f17 = 0.0f;
                                canvas2.clipRect(0.0f, f16, width, dp);
                                i14 = i25;
                                i15 = 4;
                                canvas2.drawText(this.f35180b, 0, 1, (i25 * f7) + f12, f13 - (AndroidUtilities.dp(24.0f) * cos), paint);
                                canvas2.restoreToCount(save);
                            }
                            i25 = i14 + 1;
                            f24 = f17;
                            i26 = i15;
                            i20 = i12;
                            f11 = 1.0f;
                        }
                    }
                }
                i19 = i24 + 1;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.resolveSize((int) Math.ceil(a()), i10), View.resolveSize((int) Math.ceil(this.f35185r), i11));
    }

    @Override
    public final void onVisibilityChanged(View view, int i10) {
        float b10;
        super.onVisibilityChanged(view, i10);
        if (isShown()) {
            d();
            return;
        }
        ValueAnimator valueAnimator = this.f35189y;
        if (valueAnimator != null) {
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f35189y = null;
            }
            if (this.v == null) {
                b10 = 0.0f;
            } else {
                b10 = b();
            }
            this.f35187w = b10;
        }
    }
}
