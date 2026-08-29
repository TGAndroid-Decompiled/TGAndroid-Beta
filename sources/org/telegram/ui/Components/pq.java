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
public final class pq {
    public float A;
    public float B;
    public boolean D;
    public float E;
    public final boolean F;
    public boolean G;
    public View H;
    public final org.telegram.ui.ActionBar.c6 J;
    public boolean f31731a;
    public Paint d;
    public boolean f31736g;
    public int h;
    public String f31737i;
    public boolean f31738j;
    public ValueAnimator f31739k;
    public float f31741m;
    public StaticLayout f31742n;
    public StaticLayout f31743o;
    public StaticLayout f31744p;
    public StaticLayout f31745q;
    public int f31746r;
    public int f31747s;
    public int f31748t;
    public int f31749u;
    public int f31751x;
    public int f31752y;
    public float f31732b = 1.0f;
    public int f31733c = -1;
    public TextPaint f31734e = new TextPaint(1);
    public final RectF f31735f = new RectF();
    public float f31740l = 1.0f;
    public int v = org.telegram.ui.ActionBar.g6.f23336sf;
    public int f31750w = org.telegram.ui.ActionBar.g6.f23355tf;
    public int f31753z = 17;
    public final float C = 11.5f;
    public int I = 0;

    public pq(View view, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.H = view;
        this.J = c6Var;
        this.F = z10;
        if (z10) {
            Paint paint = new Paint(1);
            this.d = paint;
            paint.setColor(-16777216);
        }
        this.f31734e.setTypeface(AndroidUtilities.bold());
        this.f31734e.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(Canvas canvas) {
        float f9;
        float z10;
        float f10;
        boolean z11;
        int dp;
        Paint paint;
        float interpolation;
        int i10 = this.I;
        boolean z12 = true;
        if (i10 != 1 && i10 != 2) {
            int i11 = this.v;
            org.telegram.ui.ActionBar.c6 c6Var = this.J;
            int v02 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
            int v03 = org.telegram.ui.ActionBar.g6.v0(this.f31750w, c6Var);
            if (this.f31749u != v02) {
                this.f31749u = v02;
                this.f31734e.setColor(v02);
            }
            Paint paint2 = this.d;
            if (paint2 != null && this.f31748t != v03) {
                this.f31748t = v03;
                paint2.setColor(v03);
            }
        }
        float f11 = this.f31740l;
        if (f11 != 1.0f) {
            int i12 = this.f31733c;
            if (i12 != 0 && i12 != 1) {
                float f12 = f11 * 2.0f;
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                int i13 = this.f31751x;
                float f13 = this.C;
                float f14 = f13 * 2.0f;
                float dp2 = (i13 - AndroidUtilities.dp(f14)) / 2.0f;
                int i14 = this.f31747s;
                int i15 = this.f31746r;
                if (i14 == i15) {
                    z10 = i14;
                } else {
                    z10 = com.google.android.recaptcha.internal.a.z(1.0f, f12, i15, i14 * f12);
                }
                e(z10);
                if (this.f31738j) {
                    float f15 = this.f31740l;
                    if (f15 <= 0.5f) {
                        interpolation = jr.f29801g.getInterpolation(f15 * 2.0f);
                    } else {
                        interpolation = jr.f29802i.getInterpolation(1.0f - ((f15 - 0.5f) * 2.0f));
                    }
                    f10 = (interpolation * 0.1f) + 1.0f;
                } else {
                    f10 = 1.0f;
                }
                float f16 = this.B;
                RectF rectF = this.f31735f;
                rectF.set(f16, dp2, z10 + f16 + AndroidUtilities.dp(f13 - 0.5f), AndroidUtilities.dp(f14) + dp2);
                canvas.save();
                canvas.scale(f10, f10, rectF.centerX(), rectF.centerY());
                if (this.f31732b != 1.0f) {
                    canvas.save();
                    float f17 = this.f31732b;
                    canvas.scale(f17, f17, rectF.centerX(), rectF.centerY());
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.F && (paint = this.d) != null) {
                    float f18 = AndroidUtilities.density * f13;
                    canvas.drawRoundRect(rectF, f18, f18, paint);
                    if (this.f31736g && org.telegram.ui.ActionBar.g6.a1()) {
                        float f19 = f13 * AndroidUtilities.density;
                        canvas.drawRoundRect(rectF, f19, f19, org.telegram.ui.ActionBar.g6.f23130h2);
                    }
                }
                if (z11) {
                    canvas.restore();
                }
                canvas.clipRect(rectF);
                if (this.D == this.f31738j) {
                    z12 = false;
                }
                if (this.f31745q != null) {
                    canvas.save();
                    float f20 = this.A;
                    float dp3 = AndroidUtilities.dp(4.0f) + dp2;
                    int dp4 = AndroidUtilities.dp(13.0f);
                    if (!z12) {
                        dp4 = -dp4;
                    }
                    canvas.translate(f20, com.google.android.recaptcha.internal.a.z(1.0f, f12, dp4, dp3));
                    this.f31734e.setAlpha((int) (f12 * 255.0f));
                    this.f31745q.draw(canvas);
                    canvas.restore();
                } else if (this.f31742n != null) {
                    canvas.save();
                    float f21 = this.A;
                    float dp5 = AndroidUtilities.dp(4.0f) + dp2;
                    int dp6 = AndroidUtilities.dp(13.0f);
                    if (!z12) {
                        dp6 = -dp6;
                    }
                    canvas.translate(f21, com.google.android.recaptcha.internal.a.z(1.0f, f12, dp6, dp5));
                    this.f31734e.setAlpha((int) (f12 * 255.0f));
                    this.f31742n.draw(canvas);
                    canvas.restore();
                }
                if (this.f31743o != null) {
                    canvas.save();
                    float f22 = this.A;
                    float dp7 = AndroidUtilities.dp(4.0f) + dp2;
                    if (z12) {
                        dp = -AndroidUtilities.dp(13.0f);
                    } else {
                        dp = AndroidUtilities.dp(13.0f);
                    }
                    canvas.translate(f22, (dp * f12) + dp7);
                    this.f31734e.setAlpha((int) ((1.0f - f12) * 255.0f));
                    this.f31743o.draw(canvas);
                    canvas.restore();
                }
                if (this.f31744p != null) {
                    canvas.save();
                    canvas.translate(this.A, dp2 + AndroidUtilities.dp(4.0f));
                    this.f31734e.setAlpha(255);
                    this.f31744p.draw(canvas);
                    canvas.restore();
                }
                this.f31734e.setAlpha(255);
                canvas.restore();
                return;
            }
            e(this.f31747s);
            float f23 = (this.f31747s / 2.0f) + this.A;
            float f24 = this.f31751x / 2.0f;
            canvas.save();
            if (this.f31733c == 0) {
                f9 = this.f31740l;
            } else {
                f9 = 1.0f - this.f31740l;
            }
            canvas.scale(f9, f9, f23, f24);
            b(canvas);
            canvas.restore();
            return;
        }
        b(canvas);
    }

    public final void b(Canvas canvas) {
        boolean z10;
        float f9 = this.C;
        float f10 = f9 * 2.0f;
        float dp = (this.f31751x - AndroidUtilities.dp(f10)) / 2.0f;
        e(this.f31747s);
        float f11 = this.B;
        RectF rectF = this.f31735f;
        rectF.set(f11, dp, this.f31747s + f11 + AndroidUtilities.dp(f9 - 0.5f), AndroidUtilities.dp(f10) + dp);
        if (this.d != null && this.F) {
            if (this.f31732b != 1.0f) {
                canvas.save();
                float f12 = this.f31732b;
                canvas.scale(f12, f12, rectF.centerX(), rectF.centerY());
                z10 = true;
            } else {
                z10 = false;
            }
            float f13 = AndroidUtilities.density * f9;
            canvas.drawRoundRect(rectF, f13, f13, this.d);
            if (this.f31736g && org.telegram.ui.ActionBar.g6.a1()) {
                float f14 = f9 * AndroidUtilities.density;
                canvas.drawRoundRect(rectF, f14, f14, org.telegram.ui.ActionBar.g6.f23130h2);
            }
            if (z10) {
                canvas.restore();
            }
        }
        if (this.f31742n != null) {
            canvas.save();
            canvas.translate(this.A, dp + AndroidUtilities.dp(4.0f));
            this.f31742n.draw(canvas);
            canvas.restore();
        }
    }

    public final void c(int i10, boolean z10) {
        String valueOf;
        boolean z11;
        boolean z12;
        View view;
        View view2;
        if (this.f31731a) {
            valueOf = AndroidUtilities.formatWholeNumber(i10, 0);
        } else {
            valueOf = String.valueOf(i10);
        }
        String str = valueOf;
        if (!TextUtils.equals(str, this.f31737i)) {
            ValueAnimator valueAnimator = this.f31739k;
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
            float f9 = 0.0f;
            if (!z11) {
                this.h = i10;
                this.f31737i = str;
                if (i10 == 0) {
                    if (this.G && (view = this.H) != null) {
                        view.setVisibility(8);
                        return;
                    }
                    return;
                }
                this.f31747s = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.f31734e.measureText(str.toString())));
                StaticLayout staticLayout = new StaticLayout(str, this.f31734e, this.f31747s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f31742n = staticLayout;
                if (staticLayout.getLineCount() >= 1) {
                    f9 = this.f31742n.getLineWidth(0);
                }
                this.f31741m = f9;
                View view3 = this.H;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
            }
            if (z11) {
                ValueAnimator valueAnimator2 = this.f31739k;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.f31740l = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f31739k = ofFloat;
                ofFloat.addUpdateListener(new j6(this, 14));
                this.f31739k.addListener(new org.telegram.ui.bm(this, 23));
                if (this.h <= 0) {
                    this.f31733c = 0;
                    this.f31739k.setDuration(220L);
                    this.f31739k.setInterpolator(new OvershootInterpolator());
                } else if (i10 == 0) {
                    this.f31733c = 1;
                    this.f31739k.setDuration(150L);
                    this.f31739k.setInterpolator(jr.f29800f);
                } else {
                    this.f31733c = 2;
                    this.f31739k.setDuration(430L);
                    this.f31739k.setInterpolator(jr.f29800f);
                }
                if (this.f31742n != null) {
                    String str2 = this.f31737i;
                    if (str2.length() == str.length()) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str);
                        for (int i11 = 0; i11 < str2.length(); i11++) {
                            if (str2.charAt(i11) == str.charAt(i11)) {
                                int i12 = i11 + 1;
                                spannableStringBuilder.setSpan(new gz(false), i11, i12, 0);
                                spannableStringBuilder2.setSpan(new gz(false), i11, i12, 0);
                            } else {
                                spannableStringBuilder3.setSpan(new gz(false), i11, i11 + 1, 0);
                            }
                        }
                        int max = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.f31734e.measureText(str2.toString())));
                        TextPaint textPaint = this.f31734e;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        this.f31743o = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                        this.f31744p = new StaticLayout(spannableStringBuilder3, this.f31734e, max, alignment, 1.0f, 0.0f, false);
                        this.f31745q = new StaticLayout(spannableStringBuilder2, this.f31734e, max, alignment, 1.0f, 0.0f, false);
                    } else {
                        this.f31743o = this.f31742n;
                    }
                }
                this.f31746r = this.f31747s;
                if (i10 > this.h) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f31738j = z12;
                this.f31739k.start();
            }
            if (i10 > 0) {
                this.f31747s = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.f31734e.measureText(str.toString())));
                StaticLayout staticLayout2 = new StaticLayout(str, this.f31734e, this.f31747s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f31742n = staticLayout2;
                if (staticLayout2.getLineCount() >= 1) {
                    f9 = this.f31742n.getLineWidth(0);
                }
                this.f31741m = f9;
            }
            this.h = i10;
            this.f31737i = str;
            View view4 = this.H;
            if (view4 != null) {
                view4.invalidate();
            }
        }
    }

    public final void d(int i10, int i11) {
        boolean z10;
        if (i10 != this.f31751x) {
            int i12 = this.h;
            this.h = -1;
            if (this.f31733c == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            c(i12, z10);
            this.f31751x = i10;
        }
        this.f31752y = i11;
    }

    public final void e(float f9) {
        float f10;
        if (this.F) {
            f10 = AndroidUtilities.dp(5.5f);
        } else {
            f10 = 0.0f;
        }
        int i10 = this.f31753z;
        if (i10 == 5) {
            float f11 = this.f31752y - f10;
            this.A = f11;
            float f12 = this.E;
            if (f12 != 0.0f) {
                this.A = f11 - Math.max((f9 / 2.0f) + f12, f9);
            } else {
                this.A = f11 - f9;
            }
        } else if (i10 == 3) {
            this.A = f10;
        } else {
            this.A = (int) ((this.f31752y - f9) / 2.0f);
        }
        this.B = this.A - f10;
    }
}
