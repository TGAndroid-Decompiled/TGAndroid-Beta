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
public final class vq {
    public float A;
    public float B;
    public boolean D;
    public float E;
    public final boolean F;
    public boolean G;
    public View H;
    public final org.telegram.ui.ActionBar.g6 J;
    public boolean f32507a;
    public Paint d;
    public boolean f32512g;
    public int h;
    public String f32513i;
    public boolean f32514j;
    public ValueAnimator f32515k;
    public float f32517m;
    public StaticLayout f32518n;
    public StaticLayout f32519o;
    public StaticLayout f32520p;
    public StaticLayout f32521q;
    public int f32522r;
    public int f32523s;
    public int f32524t;
    public int f32525u;
    public int f32527x;
    public int f32528y;
    public float f32508b = 1.0f;
    public int f32509c = -1;
    public TextPaint f32510e = new TextPaint(1);
    public final RectF f32511f = new RectF();
    public float f32516l = 1.0f;
    public int v = org.telegram.ui.ActionBar.k6.f21937sf;
    public int f32526w = org.telegram.ui.ActionBar.k6.f21953tf;
    public int f32529z = 17;
    public final float C = 11.5f;
    public int I = 0;

    public vq(View view, boolean z4, org.telegram.ui.ActionBar.g6 g6Var) {
        this.H = view;
        this.J = g6Var;
        this.F = z4;
        if (z4) {
            Paint paint = new Paint(1);
            this.d = paint;
            paint.setColor(-16777216);
        }
        this.f32510e.setTypeface(AndroidUtilities.bold());
        this.f32510e.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(Canvas canvas) {
        float f10;
        float w10;
        float f11;
        boolean z4;
        int dp;
        Paint paint;
        float interpolation;
        int i10 = this.I;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            int i11 = this.v;
            org.telegram.ui.ActionBar.g6 g6Var = this.J;
            int v02 = org.telegram.ui.ActionBar.k6.v0(i11, g6Var);
            int v03 = org.telegram.ui.ActionBar.k6.v0(this.f32526w, g6Var);
            if (this.f32525u != v02) {
                this.f32525u = v02;
                this.f32510e.setColor(v02);
            }
            Paint paint2 = this.d;
            if (paint2 != null && this.f32524t != v03) {
                this.f32524t = v03;
                paint2.setColor(v03);
            }
        }
        float f12 = this.f32516l;
        if (f12 != 1.0f) {
            int i12 = this.f32509c;
            if (i12 != 0 && i12 != 1) {
                float f13 = f12 * 2.0f;
                if (f13 > 1.0f) {
                    f13 = 1.0f;
                }
                int i13 = this.f32527x;
                float f14 = this.C;
                float f15 = f14 * 2.0f;
                float dp2 = (i13 - AndroidUtilities.dp(f15)) / 2.0f;
                int i14 = this.f32523s;
                int i15 = this.f32522r;
                if (i14 == i15) {
                    w10 = i14;
                } else {
                    w10 = e2.c.w(1.0f, f13, i15, i14 * f13);
                }
                e(w10);
                if (this.f32514j) {
                    float f16 = this.f32516l;
                    if (f16 <= 0.5f) {
                        interpolation = pr.f30169g.getInterpolation(f16 * 2.0f);
                    } else {
                        interpolation = pr.f30170i.getInterpolation(1.0f - ((f16 - 0.5f) * 2.0f));
                    }
                    f11 = (interpolation * 0.1f) + 1.0f;
                } else {
                    f11 = 1.0f;
                }
                float f17 = this.B;
                RectF rectF = this.f32511f;
                rectF.set(f17, dp2, w10 + f17 + AndroidUtilities.dp(f14 - 0.5f), AndroidUtilities.dp(f15) + dp2);
                canvas.save();
                canvas.scale(f11, f11, rectF.centerX(), rectF.centerY());
                if (this.f32508b != 1.0f) {
                    canvas.save();
                    float f18 = this.f32508b;
                    canvas.scale(f18, f18, rectF.centerX(), rectF.centerY());
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (this.F && (paint = this.d) != null) {
                    float f19 = AndroidUtilities.density * f14;
                    canvas.drawRoundRect(rectF, f19, f19, paint);
                    if (this.f32512g && org.telegram.ui.ActionBar.k6.a1()) {
                        float f20 = f14 * AndroidUtilities.density;
                        canvas.drawRoundRect(rectF, f20, f20, org.telegram.ui.ActionBar.k6.f21730h2);
                    }
                }
                if (z4) {
                    canvas.restore();
                }
                canvas.clipRect(rectF);
                if (this.D == this.f32514j) {
                    z10 = false;
                }
                if (this.f32521q != null) {
                    canvas.save();
                    float f21 = this.A;
                    float dp3 = AndroidUtilities.dp(4.0f) + dp2;
                    int dp4 = AndroidUtilities.dp(13.0f);
                    if (!z10) {
                        dp4 = -dp4;
                    }
                    canvas.translate(f21, e2.c.w(1.0f, f13, dp4, dp3));
                    this.f32510e.setAlpha((int) (f13 * 255.0f));
                    this.f32521q.draw(canvas);
                    canvas.restore();
                } else if (this.f32518n != null) {
                    canvas.save();
                    float f22 = this.A;
                    float dp5 = AndroidUtilities.dp(4.0f) + dp2;
                    int dp6 = AndroidUtilities.dp(13.0f);
                    if (!z10) {
                        dp6 = -dp6;
                    }
                    canvas.translate(f22, e2.c.w(1.0f, f13, dp6, dp5));
                    this.f32510e.setAlpha((int) (f13 * 255.0f));
                    this.f32518n.draw(canvas);
                    canvas.restore();
                }
                if (this.f32519o != null) {
                    canvas.save();
                    float f23 = this.A;
                    float dp7 = AndroidUtilities.dp(4.0f) + dp2;
                    if (z10) {
                        dp = -AndroidUtilities.dp(13.0f);
                    } else {
                        dp = AndroidUtilities.dp(13.0f);
                    }
                    canvas.translate(f23, (dp * f13) + dp7);
                    this.f32510e.setAlpha((int) ((1.0f - f13) * 255.0f));
                    this.f32519o.draw(canvas);
                    canvas.restore();
                }
                if (this.f32520p != null) {
                    canvas.save();
                    canvas.translate(this.A, dp2 + AndroidUtilities.dp(4.0f));
                    this.f32510e.setAlpha(255);
                    this.f32520p.draw(canvas);
                    canvas.restore();
                }
                this.f32510e.setAlpha(255);
                canvas.restore();
                return;
            }
            e(this.f32523s);
            float f24 = (this.f32523s / 2.0f) + this.A;
            float f25 = this.f32527x / 2.0f;
            canvas.save();
            if (this.f32509c == 0) {
                f10 = this.f32516l;
            } else {
                f10 = 1.0f - this.f32516l;
            }
            canvas.scale(f10, f10, f24, f25);
            b(canvas);
            canvas.restore();
            return;
        }
        b(canvas);
    }

    public final void b(Canvas canvas) {
        boolean z4;
        float f10 = this.C;
        float f11 = f10 * 2.0f;
        float dp = (this.f32527x - AndroidUtilities.dp(f11)) / 2.0f;
        e(this.f32523s);
        float f12 = this.B;
        RectF rectF = this.f32511f;
        rectF.set(f12, dp, this.f32523s + f12 + AndroidUtilities.dp(f10 - 0.5f), AndroidUtilities.dp(f11) + dp);
        if (this.d != null && this.F) {
            if (this.f32508b != 1.0f) {
                canvas.save();
                float f13 = this.f32508b;
                canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
                z4 = true;
            } else {
                z4 = false;
            }
            float f14 = AndroidUtilities.density * f10;
            canvas.drawRoundRect(rectF, f14, f14, this.d);
            if (this.f32512g && org.telegram.ui.ActionBar.k6.a1()) {
                float f15 = f10 * AndroidUtilities.density;
                canvas.drawRoundRect(rectF, f15, f15, org.telegram.ui.ActionBar.k6.f21730h2);
            }
            if (z4) {
                canvas.restore();
            }
        }
        if (this.f32518n != null) {
            canvas.save();
            canvas.translate(this.A, dp + AndroidUtilities.dp(4.0f));
            this.f32518n.draw(canvas);
            canvas.restore();
        }
    }

    public final void c(int i10, boolean z4) {
        String valueOf;
        boolean z10;
        boolean z11;
        View view;
        View view2;
        if (this.f32507a) {
            valueOf = AndroidUtilities.formatWholeNumber(i10, 0);
        } else {
            valueOf = String.valueOf(i10);
        }
        String str = valueOf;
        if (!TextUtils.equals(str, this.f32513i)) {
            ValueAnimator valueAnimator = this.f32515k;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (i10 > 0 && this.G && (view2 = this.H) != null) {
                view2.setVisibility(0);
            }
            if (Math.abs(i10 - this.h) > 99) {
                z10 = false;
            } else {
                z10 = z4;
            }
            float f10 = 0.0f;
            if (!z10) {
                this.h = i10;
                this.f32513i = str;
                if (i10 == 0) {
                    if (this.G && (view = this.H) != null) {
                        view.setVisibility(8);
                        return;
                    }
                    return;
                }
                this.f32523s = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.f32510e.measureText(str.toString())));
                StaticLayout staticLayout = new StaticLayout(str, this.f32510e, this.f32523s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f32518n = staticLayout;
                if (staticLayout.getLineCount() >= 1) {
                    f10 = this.f32518n.getLineWidth(0);
                }
                this.f32517m = f10;
                View view3 = this.H;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
            }
            if (z10) {
                ValueAnimator valueAnimator2 = this.f32515k;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.f32516l = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f32515k = ofFloat;
                ofFloat.addUpdateListener(new f6(this, 14));
                this.f32515k.addListener(new a9(this, 14));
                if (this.h <= 0) {
                    this.f32509c = 0;
                    this.f32515k.setDuration(220L);
                    this.f32515k.setInterpolator(new OvershootInterpolator());
                } else if (i10 == 0) {
                    this.f32509c = 1;
                    this.f32515k.setDuration(150L);
                    this.f32515k.setInterpolator(pr.f30168f);
                } else {
                    this.f32509c = 2;
                    this.f32515k.setDuration(430L);
                    this.f32515k.setInterpolator(pr.f30168f);
                }
                if (this.f32518n != null) {
                    String str2 = this.f32513i;
                    if (str2.length() == str.length()) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str);
                        for (int i11 = 0; i11 < str2.length(); i11++) {
                            if (str2.charAt(i11) == str.charAt(i11)) {
                                int i12 = i11 + 1;
                                spannableStringBuilder.setSpan(new nz(false), i11, i12, 0);
                                spannableStringBuilder2.setSpan(new nz(false), i11, i12, 0);
                            } else {
                                spannableStringBuilder3.setSpan(new nz(false), i11, i11 + 1, 0);
                            }
                        }
                        int max = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.f32510e.measureText(str2.toString())));
                        TextPaint textPaint = this.f32510e;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        this.f32519o = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                        this.f32520p = new StaticLayout(spannableStringBuilder3, this.f32510e, max, alignment, 1.0f, 0.0f, false);
                        this.f32521q = new StaticLayout(spannableStringBuilder2, this.f32510e, max, alignment, 1.0f, 0.0f, false);
                    } else {
                        this.f32519o = this.f32518n;
                    }
                }
                this.f32522r = this.f32523s;
                if (i10 > this.h) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f32514j = z11;
                this.f32515k.start();
            }
            if (i10 > 0) {
                this.f32523s = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.f32510e.measureText(str.toString())));
                StaticLayout staticLayout2 = new StaticLayout(str, this.f32510e, this.f32523s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f32518n = staticLayout2;
                if (staticLayout2.getLineCount() >= 1) {
                    f10 = this.f32518n.getLineWidth(0);
                }
                this.f32517m = f10;
            }
            this.h = i10;
            this.f32513i = str;
            View view4 = this.H;
            if (view4 != null) {
                view4.invalidate();
            }
        }
    }

    public final void d(int i10, int i11) {
        boolean z4;
        if (i10 != this.f32527x) {
            int i12 = this.h;
            this.h = -1;
            if (this.f32509c == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            c(i12, z4);
            this.f32527x = i10;
        }
        this.f32528y = i11;
    }

    public final void e(float f10) {
        float f11;
        if (this.F) {
            f11 = AndroidUtilities.dp(5.5f);
        } else {
            f11 = 0.0f;
        }
        int i10 = this.f32529z;
        if (i10 == 5) {
            float f12 = this.f32528y - f11;
            this.A = f12;
            float f13 = this.E;
            if (f13 != 0.0f) {
                this.A = f12 - Math.max((f10 / 2.0f) + f13, f10);
            } else {
                this.A = f12 - f10;
            }
        } else if (i10 == 3) {
            this.A = f11;
        } else {
            this.A = (int) ((this.f32528y - f10) / 2.0f);
        }
        this.B = this.A - f11;
    }
}
