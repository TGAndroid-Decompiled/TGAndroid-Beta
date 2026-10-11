package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class lr {
    public float A;
    public float B;
    public boolean D;
    public float E;
    public final boolean F;
    public boolean G;
    public View H;
    public final org.telegram.ui.ActionBar.d6 J;
    public boolean f28582a;
    public Paint d;
    public boolean f28587g;
    public int h;
    public String f28588i;
    public boolean f28589j;
    public ValueAnimator f28590k;
    public float f28592m;
    public StaticLayout f28593n;
    public StaticLayout f28594o;
    public StaticLayout f28595p;
    public StaticLayout f28596q;
    public int f28597r;
    public int f28598s;
    public int f28599t;
    public int f28600u;
    public int f28602x;
    public int f28603y;
    public float f28583b = 1.0f;
    public int f28584c = -1;
    public TextPaint f28585e = new TextPaint(1);
    public final RectF f28586f = new RectF();
    public float f28591l = 1.0f;
    public int v = org.telegram.ui.ActionBar.h6.f21108sf;
    public int f28601w = org.telegram.ui.ActionBar.h6.f21126tf;
    public int f28604z = 17;
    public final float C = 11.5f;
    public int I = 0;

    public lr(View view, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.H = view;
        this.J = d6Var;
        this.F = z10;
        if (z10) {
            Paint paint = new Paint(1);
            this.d = paint;
            paint.setColor(-16777216);
        }
        this.f28585e.setTypeface(AndroidUtilities.bold());
        this.f28585e.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(Canvas canvas) {
        float f7;
        float y3;
        float f10;
        boolean z10;
        int dp;
        Paint paint;
        float interpolation;
        int i10 = this.I;
        boolean z11 = true;
        if (i10 != 1 && i10 != 2) {
            int i11 = this.v;
            org.telegram.ui.ActionBar.d6 d6Var = this.J;
            int w02 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
            int w03 = org.telegram.ui.ActionBar.h6.w0(this.f28601w, d6Var);
            if (this.f28600u != w02) {
                this.f28600u = w02;
                this.f28585e.setColor(w02);
            }
            Paint paint2 = this.d;
            if (paint2 != null && this.f28599t != w03) {
                this.f28599t = w03;
                paint2.setColor(w03);
            }
        }
        float f11 = this.f28591l;
        if (f11 != 1.0f) {
            int i12 = this.f28584c;
            if (i12 != 0 && i12 != 1) {
                float f12 = f11 * 2.0f;
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                int i13 = this.f28602x;
                float f13 = this.C;
                float f14 = f13 * 2.0f;
                float dp2 = (i13 - AndroidUtilities.dp(f14)) / 2.0f;
                int i14 = this.f28598s;
                int i15 = this.f28597r;
                if (i14 == i15) {
                    y3 = i14;
                } else {
                    y3 = com.google.android.gms.internal.vision.e2.y(1.0f, f12, i15, i14 * f12);
                }
                e(y3);
                if (this.f28589j) {
                    float f15 = this.f28591l;
                    if (f15 <= 0.5f) {
                        interpolation = is.f27501g.getInterpolation(f15 * 2.0f);
                    } else {
                        interpolation = is.f27502i.getInterpolation(1.0f - ((f15 - 0.5f) * 2.0f));
                    }
                    f10 = (interpolation * 0.1f) + 1.0f;
                } else {
                    f10 = 1.0f;
                }
                float f16 = this.B;
                RectF rectF = this.f28586f;
                rectF.set(f16, dp2, y3 + f16 + AndroidUtilities.dp(f13 - 0.5f), AndroidUtilities.dp(f14) + dp2);
                canvas.save();
                canvas.scale(f10, f10, rectF.centerX(), rectF.centerY());
                if (this.f28583b != 1.0f) {
                    canvas.save();
                    float f17 = this.f28583b;
                    canvas.scale(f17, f17, rectF.centerX(), rectF.centerY());
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.F && (paint = this.d) != null) {
                    float f18 = AndroidUtilities.density * f13;
                    canvas.drawRoundRect(rectF, f18, f18, paint);
                    if (this.f28587g && org.telegram.ui.ActionBar.h6.b1()) {
                        float f19 = f13 * AndroidUtilities.density;
                        canvas.drawRoundRect(rectF, f19, f19, org.telegram.ui.ActionBar.h6.f20890h2);
                    }
                }
                if (z10) {
                    canvas.restore();
                }
                canvas.clipRect(rectF);
                if (this.D == this.f28589j) {
                    z11 = false;
                }
                if (this.f28596q != null) {
                    canvas.save();
                    float f20 = this.A;
                    float dp3 = AndroidUtilities.dp(4.0f) + dp2;
                    int dp4 = AndroidUtilities.dp(13.0f);
                    if (!z11) {
                        dp4 = -dp4;
                    }
                    canvas.translate(f20, com.google.android.gms.internal.vision.e2.y(1.0f, f12, dp4, dp3));
                    this.f28585e.setAlpha((int) (f12 * 255.0f));
                    this.f28596q.draw(canvas);
                    canvas.restore();
                } else if (this.f28593n != null) {
                    canvas.save();
                    float f21 = this.A;
                    float dp5 = AndroidUtilities.dp(4.0f) + dp2;
                    int dp6 = AndroidUtilities.dp(13.0f);
                    if (!z11) {
                        dp6 = -dp6;
                    }
                    canvas.translate(f21, com.google.android.gms.internal.vision.e2.y(1.0f, f12, dp6, dp5));
                    this.f28585e.setAlpha((int) (f12 * 255.0f));
                    this.f28593n.draw(canvas);
                    canvas.restore();
                }
                if (this.f28594o != null) {
                    canvas.save();
                    float f22 = this.A;
                    float dp7 = AndroidUtilities.dp(4.0f) + dp2;
                    if (z11) {
                        dp = -AndroidUtilities.dp(13.0f);
                    } else {
                        dp = AndroidUtilities.dp(13.0f);
                    }
                    canvas.translate(f22, (dp * f12) + dp7);
                    this.f28585e.setAlpha((int) ((1.0f - f12) * 255.0f));
                    this.f28594o.draw(canvas);
                    canvas.restore();
                }
                if (this.f28595p != null) {
                    canvas.save();
                    canvas.translate(this.A, dp2 + AndroidUtilities.dp(4.0f));
                    this.f28585e.setAlpha(255);
                    this.f28595p.draw(canvas);
                    canvas.restore();
                }
                this.f28585e.setAlpha(255);
                canvas.restore();
                return;
            }
            e(this.f28598s);
            float f23 = (this.f28598s / 2.0f) + this.A;
            float f24 = this.f28602x / 2.0f;
            canvas.save();
            if (this.f28584c == 0) {
                f7 = this.f28591l;
            } else {
                f7 = 1.0f - this.f28591l;
            }
            canvas.scale(f7, f7, f23, f24);
            b(canvas);
            canvas.restore();
            return;
        }
        b(canvas);
    }

    public final void b(Canvas canvas) {
        boolean z10;
        float f7 = this.C;
        float f10 = f7 * 2.0f;
        float dp = (this.f28602x - AndroidUtilities.dp(f10)) / 2.0f;
        e(this.f28598s);
        float f11 = this.B;
        RectF rectF = this.f28586f;
        rectF.set(f11, dp, this.f28598s + f11 + AndroidUtilities.dp(f7 - 0.5f), AndroidUtilities.dp(f10) + dp);
        if (this.d != null && this.F) {
            if (this.f28583b != 1.0f) {
                canvas.save();
                float f12 = this.f28583b;
                canvas.scale(f12, f12, rectF.centerX(), rectF.centerY());
                z10 = true;
            } else {
                z10 = false;
            }
            float f13 = AndroidUtilities.density * f7;
            canvas.drawRoundRect(rectF, f13, f13, this.d);
            if (this.f28587g && org.telegram.ui.ActionBar.h6.b1()) {
                float f14 = f7 * AndroidUtilities.density;
                canvas.drawRoundRect(rectF, f14, f14, org.telegram.ui.ActionBar.h6.f20890h2);
            }
            if (z10) {
                canvas.restore();
            }
        }
        if (this.f28593n != null) {
            canvas.save();
            canvas.translate(this.A, dp + AndroidUtilities.dp(4.0f));
            this.f28593n.draw(canvas);
            canvas.restore();
        }
    }

    public final void c(int i10, boolean z10) {
        String valueOf;
        boolean z11;
        boolean z12;
        View view;
        View view2;
        if (this.f28582a) {
            valueOf = AndroidUtilities.formatWholeNumber(i10, 0);
        } else {
            valueOf = String.valueOf(i10);
        }
        String str = valueOf;
        if (!TextUtils.equals(str, this.f28588i)) {
            ValueAnimator valueAnimator = this.f28590k;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (i10 > 0 && this.G && (view2 = this.H) != null) {
                view2.setVisibility(0);
            }
            if (Math.abs(i10 - this.h) > 99) {
                z11 = false;
            } else {
                z11 = z10;
            }
            float f7 = 0.0f;
            if (!z11) {
                this.h = i10;
                this.f28588i = str;
                if (i10 == 0) {
                    if (this.G && (view = this.H) != null) {
                        view.setVisibility(8);
                        return;
                    }
                    return;
                }
                this.f28598s = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.f28585e.measureText(str.toString())));
                StaticLayout staticLayout = new StaticLayout(str, this.f28585e, this.f28598s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f28593n = staticLayout;
                if (staticLayout.getLineCount() >= 1) {
                    f7 = this.f28593n.getLineWidth(0);
                }
                this.f28592m = f7;
                View view3 = this.H;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
            }
            if (z11) {
                ValueAnimator valueAnimator2 = this.f28590k;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.f28591l = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f28590k = ofFloat;
                ofFloat.addUpdateListener(new m6(this, 15));
                this.f28590k.addListener(new t8(this, 15));
                if (this.h <= 0) {
                    this.f28584c = 0;
                    this.f28590k.setDuration(220L);
                    this.f28590k.setInterpolator(new OvershootInterpolator());
                } else if (i10 == 0) {
                    this.f28584c = 1;
                    this.f28590k.setDuration(150L);
                    this.f28590k.setInterpolator(is.f27500f);
                } else {
                    this.f28584c = 2;
                    this.f28590k.setDuration(430L);
                    this.f28590k.setInterpolator(is.f27500f);
                }
                if (this.f28593n != null) {
                    String str2 = this.f28588i;
                    if (str2.length() == str.length()) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str);
                        for (int i11 = 0; i11 < str2.length(); i11++) {
                            if (str2.charAt(i11) == str.charAt(i11)) {
                                int i12 = i11 + 1;
                                spannableStringBuilder.setSpan(new c00(false), i11, i12, 0);
                                spannableStringBuilder2.setSpan(new c00(false), i11, i12, 0);
                            } else {
                                spannableStringBuilder3.setSpan(new c00(false), i11, i11 + 1, 0);
                            }
                        }
                        int max = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.f28585e.measureText(str2.toString())));
                        TextPaint textPaint = this.f28585e;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        this.f28594o = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                        this.f28595p = new StaticLayout(spannableStringBuilder3, this.f28585e, max, alignment, 1.0f, 0.0f, false);
                        this.f28596q = new StaticLayout(spannableStringBuilder2, this.f28585e, max, alignment, 1.0f, 0.0f, false);
                    } else {
                        this.f28594o = this.f28593n;
                    }
                }
                this.f28597r = this.f28598s;
                if (i10 > this.h) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f28589j = z12;
                this.f28590k.start();
            }
            if (i10 > 0) {
                this.f28598s = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.f28585e.measureText(str.toString())));
                StaticLayout staticLayout2 = new StaticLayout(str, this.f28585e, this.f28598s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f28593n = staticLayout2;
                if (staticLayout2.getLineCount() >= 1) {
                    f7 = this.f28593n.getLineWidth(0);
                }
                this.f28592m = f7;
            }
            this.h = i10;
            this.f28588i = str;
            View view4 = this.H;
            if (view4 != null) {
                view4.invalidate();
            }
        }
    }

    public final void d(int i10, int i11) {
        boolean z10;
        if (i10 != this.f28602x) {
            int i12 = this.h;
            this.h = -1;
            if (this.f28584c == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            c(i12, z10);
            this.f28602x = i10;
        }
        this.f28603y = i11;
    }

    public final void e(float f7) {
        float f10;
        if (this.F) {
            f10 = AndroidUtilities.dp(5.5f);
        } else {
            f10 = 0.0f;
        }
        int i10 = this.f28604z;
        if (i10 == 5) {
            float f11 = this.f28603y - f10;
            this.A = f11;
            float f12 = this.E;
            if (f12 != 0.0f) {
                this.A = f11 - Math.max((f7 / 2.0f) + f12, f7);
            } else {
                this.A = f11 - f7;
            }
        } else if (i10 == 3) {
            this.A = f10;
        } else {
            this.A = (int) ((this.f28603y - f7) / 2.0f);
        }
        this.B = this.A - f10;
    }
}
