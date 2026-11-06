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
public final class bq {
    public float A;
    public float B;
    public boolean D;
    public float E;
    public final boolean F;
    public boolean G;
    public View H;
    public final org.telegram.ui.ActionBar.f6 J;
    public boolean f32284a;
    public Paint d;
    public boolean f32289g;
    public int h;
    public String f32290i;
    public boolean f32291j;
    public ValueAnimator f32292k;
    public float f32294m;
    public StaticLayout f32295n;
    public StaticLayout f32296o;
    public StaticLayout f32297p;
    public StaticLayout f32298q;
    public int f32299r;
    public int f32300s;
    public int f32301t;
    public int f32302u;
    public int f32304x;
    public int f32305y;
    public float f32285b = 1.0f;
    public int f32286c = -1;
    public TextPaint f32287e = new TextPaint(1);
    public final RectF f32288f = new RectF();
    public float f32293l = 1.0f;
    public int v = org.telegram.ui.ActionBar.k6.f27914gg;
    public int f32303w = org.telegram.ui.ActionBar.k6.hg;
    public int f32306z = 17;
    public final float C = 11.5f;
    public int I = 0;

    public bq(View view, boolean z9, org.telegram.ui.ActionBar.f6 f6Var) {
        this.H = view;
        this.J = f6Var;
        this.F = z9;
        if (z9) {
            Paint paint = new Paint(1);
            this.d = paint;
            paint.setColor(-16777216);
        }
        this.f32287e.setTypeface(org.telegram.messenger.g0.o());
        this.f32287e.setTextSize(org.telegram.messenger.g0.L(13.0f));
    }

    public final void a(Canvas canvas) {
        float f10;
        float z9;
        float f11;
        boolean z10;
        int L;
        Paint paint;
        float interpolation;
        int i7 = this.I;
        boolean z11 = true;
        if (i7 != 1 && i7 != 2) {
            int i10 = this.v;
            org.telegram.ui.ActionBar.f6 f6Var = this.J;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
            int w03 = org.telegram.ui.ActionBar.k6.w0(this.f32303w, f6Var);
            if (this.f32302u != w02) {
                this.f32302u = w02;
                this.f32287e.setColor(w02);
            }
            Paint paint2 = this.d;
            if (paint2 != null && this.f32301t != w03) {
                this.f32301t = w03;
                paint2.setColor(w03);
            }
        }
        float f12 = this.f32293l;
        if (f12 != 1.0f) {
            int i11 = this.f32286c;
            if (i11 != 0 && i11 != 1) {
                float f13 = f12 * 2.0f;
                if (f13 > 1.0f) {
                    f13 = 1.0f;
                }
                int i12 = this.f32304x;
                float f14 = this.C;
                float f15 = f14 * 2.0f;
                float L2 = (i12 - org.telegram.messenger.g0.L(f15)) / 2.0f;
                int i13 = this.f32300s;
                int i14 = this.f32299r;
                if (i13 == i14) {
                    z9 = i13;
                } else {
                    z9 = com.google.android.recaptcha.internal.a.z(1.0f, f13, i14, i13 * f13);
                }
                e(z9);
                if (this.f32291j) {
                    float f16 = this.f32293l;
                    if (f16 <= 0.5f) {
                        interpolation = xq.f40346g.getInterpolation(f16 * 2.0f);
                    } else {
                        interpolation = xq.f40347i.getInterpolation(1.0f - ((f16 - 0.5f) * 2.0f));
                    }
                    f11 = (interpolation * 0.1f) + 1.0f;
                } else {
                    f11 = 1.0f;
                }
                float f17 = this.B;
                RectF rectF = this.f32288f;
                rectF.set(f17, L2, z9 + f17 + org.telegram.messenger.g0.L(f14 - 0.5f), org.telegram.messenger.g0.L(f15) + L2);
                canvas.save();
                canvas.scale(f11, f11, rectF.centerX(), rectF.centerY());
                if (this.f32285b != 1.0f) {
                    canvas.save();
                    float f18 = this.f32285b;
                    canvas.scale(f18, f18, rectF.centerX(), rectF.centerY());
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.F && (paint = this.d) != null) {
                    float f19 = org.telegram.messenger.g0.f22543p * f14;
                    canvas.drawRoundRect(rectF, f19, f19, paint);
                    if (this.f32289g && org.telegram.ui.ActionBar.k6.d1()) {
                        float f20 = f14 * org.telegram.messenger.g0.f22543p;
                        canvas.drawRoundRect(rectF, f20, f20, org.telegram.ui.ActionBar.k6.f27919h2);
                    }
                }
                if (z10) {
                    canvas.restore();
                }
                canvas.clipRect(rectF);
                if (this.D == this.f32291j) {
                    z11 = false;
                }
                if (this.f32298q != null) {
                    canvas.save();
                    float f21 = this.A;
                    float L3 = org.telegram.messenger.g0.L(4.0f) + L2;
                    int L4 = org.telegram.messenger.g0.L(13.0f);
                    if (!z11) {
                        L4 = -L4;
                    }
                    canvas.translate(f21, com.google.android.recaptcha.internal.a.z(1.0f, f13, L4, L3));
                    this.f32287e.setAlpha((int) (f13 * 255.0f));
                    this.f32298q.draw(canvas);
                    canvas.restore();
                } else if (this.f32295n != null) {
                    canvas.save();
                    float f22 = this.A;
                    float L5 = org.telegram.messenger.g0.L(4.0f) + L2;
                    int L6 = org.telegram.messenger.g0.L(13.0f);
                    if (!z11) {
                        L6 = -L6;
                    }
                    canvas.translate(f22, com.google.android.recaptcha.internal.a.z(1.0f, f13, L6, L5));
                    this.f32287e.setAlpha((int) (f13 * 255.0f));
                    this.f32295n.draw(canvas);
                    canvas.restore();
                }
                if (this.f32296o != null) {
                    canvas.save();
                    float f23 = this.A;
                    float L7 = org.telegram.messenger.g0.L(4.0f) + L2;
                    if (z11) {
                        L = -org.telegram.messenger.g0.L(13.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(13.0f);
                    }
                    canvas.translate(f23, (L * f13) + L7);
                    this.f32287e.setAlpha((int) ((1.0f - f13) * 255.0f));
                    this.f32296o.draw(canvas);
                    canvas.restore();
                }
                if (this.f32297p != null) {
                    canvas.save();
                    canvas.translate(this.A, L2 + org.telegram.messenger.g0.L(4.0f));
                    this.f32287e.setAlpha(255);
                    this.f32297p.draw(canvas);
                    canvas.restore();
                }
                this.f32287e.setAlpha(255);
                canvas.restore();
                return;
            }
            e(this.f32300s);
            float f24 = (this.f32300s / 2.0f) + this.A;
            float f25 = this.f32304x / 2.0f;
            canvas.save();
            if (this.f32286c == 0) {
                f10 = this.f32293l;
            } else {
                f10 = 1.0f - this.f32293l;
            }
            canvas.scale(f10, f10, f24, f25);
            b(canvas);
            canvas.restore();
            return;
        }
        b(canvas);
    }

    public final void b(Canvas canvas) {
        boolean z9;
        float f10 = this.C;
        float f11 = f10 * 2.0f;
        float L = (this.f32304x - org.telegram.messenger.g0.L(f11)) / 2.0f;
        e(this.f32300s);
        float f12 = this.B;
        RectF rectF = this.f32288f;
        rectF.set(f12, L, this.f32300s + f12 + org.telegram.messenger.g0.L(f10 - 0.5f), org.telegram.messenger.g0.L(f11) + L);
        if (this.d != null && this.F) {
            if (this.f32285b != 1.0f) {
                canvas.save();
                float f13 = this.f32285b;
                canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
                z9 = true;
            } else {
                z9 = false;
            }
            float f14 = org.telegram.messenger.g0.f22543p * f10;
            canvas.drawRoundRect(rectF, f14, f14, this.d);
            if (this.f32289g && org.telegram.ui.ActionBar.k6.d1()) {
                float f15 = f10 * org.telegram.messenger.g0.f22543p;
                canvas.drawRoundRect(rectF, f15, f15, org.telegram.ui.ActionBar.k6.f27919h2);
            }
            if (z9) {
                canvas.restore();
            }
        }
        if (this.f32295n != null) {
            canvas.save();
            canvas.translate(this.A, L + org.telegram.messenger.g0.L(4.0f));
            this.f32295n.draw(canvas);
            canvas.restore();
        }
    }

    public final void c(int i7, boolean z9) {
        String valueOf;
        boolean z10;
        boolean z11;
        View view;
        View view2;
        if (this.f32284a) {
            valueOf = org.telegram.messenger.g0.o0(i7, 0);
        } else {
            valueOf = String.valueOf(i7);
        }
        String str = valueOf;
        if (!TextUtils.equals(str, this.f32290i)) {
            ValueAnimator valueAnimator = this.f32292k;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (i7 > 0 && this.G && (view2 = this.H) != null) {
                view2.setVisibility(0);
            }
            if (Math.abs(i7 - this.h) > 99) {
                z10 = false;
            } else {
                z10 = z9;
            }
            float f10 = 0.0f;
            if (!z10) {
                this.h = i7;
                this.f32290i = str;
                if (i7 == 0) {
                    if (this.G && (view = this.H) != null) {
                        view.setVisibility(8);
                        return;
                    }
                    return;
                }
                this.f32300s = Math.max(org.telegram.messenger.g0.L(12.0f), (int) Math.ceil(this.f32287e.measureText(str.toString())));
                StaticLayout staticLayout = new StaticLayout(str, this.f32287e, this.f32300s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f32295n = staticLayout;
                if (staticLayout.getLineCount() >= 1) {
                    f10 = this.f32295n.getLineWidth(0);
                }
                this.f32294m = f10;
                View view3 = this.H;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
            }
            if (z10) {
                ValueAnimator valueAnimator2 = this.f32292k;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.f32293l = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f32292k = ofFloat;
                ofFloat.addUpdateListener(new e6(this, 15));
                this.f32292k.addListener(new z5(this, 20));
                if (this.h <= 0) {
                    this.f32286c = 0;
                    this.f32292k.setDuration(220L);
                    this.f32292k.setInterpolator(new OvershootInterpolator());
                } else if (i7 == 0) {
                    this.f32286c = 1;
                    this.f32292k.setDuration(150L);
                    this.f32292k.setInterpolator(xq.f40345f);
                } else {
                    this.f32286c = 2;
                    this.f32292k.setDuration(430L);
                    this.f32292k.setInterpolator(xq.f40345f);
                }
                if (this.f32295n != null) {
                    String str2 = this.f32290i;
                    if (str2.length() == str.length()) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str);
                        for (int i10 = 0; i10 < str2.length(); i10++) {
                            if (str2.charAt(i10) == str.charAt(i10)) {
                                int i11 = i10 + 1;
                                spannableStringBuilder.setSpan(new hy(false), i10, i11, 0);
                                spannableStringBuilder2.setSpan(new hy(false), i10, i11, 0);
                            } else {
                                spannableStringBuilder3.setSpan(new hy(false), i10, i10 + 1, 0);
                            }
                        }
                        int max = Math.max(org.telegram.messenger.g0.L(12.0f), (int) Math.ceil(this.f32287e.measureText(str2.toString())));
                        TextPaint textPaint = this.f32287e;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        this.f32296o = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                        this.f32297p = new StaticLayout(spannableStringBuilder3, this.f32287e, max, alignment, 1.0f, 0.0f, false);
                        this.f32298q = new StaticLayout(spannableStringBuilder2, this.f32287e, max, alignment, 1.0f, 0.0f, false);
                    } else {
                        this.f32296o = this.f32295n;
                    }
                }
                this.f32299r = this.f32300s;
                if (i7 > this.h) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f32291j = z11;
                this.f32292k.start();
            }
            if (i7 > 0) {
                this.f32300s = Math.max(org.telegram.messenger.g0.L(12.0f), (int) Math.ceil(this.f32287e.measureText(str.toString())));
                StaticLayout staticLayout2 = new StaticLayout(str, this.f32287e, this.f32300s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f32295n = staticLayout2;
                if (staticLayout2.getLineCount() >= 1) {
                    f10 = this.f32295n.getLineWidth(0);
                }
                this.f32294m = f10;
            }
            this.h = i7;
            this.f32290i = str;
            View view4 = this.H;
            if (view4 != null) {
                view4.invalidate();
            }
        }
    }

    public final void d(int i7, int i10) {
        boolean z9;
        if (i7 != this.f32304x) {
            int i11 = this.h;
            this.h = -1;
            if (this.f32286c == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            c(i11, z9);
            this.f32304x = i7;
        }
        this.f32305y = i10;
    }

    public final void e(float f10) {
        float f11;
        if (this.F) {
            f11 = org.telegram.messenger.g0.L(5.5f);
        } else {
            f11 = 0.0f;
        }
        int i7 = this.f32306z;
        if (i7 == 5) {
            float f12 = this.f32305y - f11;
            this.A = f12;
            float f13 = this.E;
            if (f13 != 0.0f) {
                this.A = f12 - Math.max((f10 / 2.0f) + f13, f10);
            } else {
                this.A = f12 - f10;
            }
        } else if (i7 == 3) {
            this.A = f11;
        } else {
            this.A = (int) ((this.f32305y - f10) / 2.0f);
        }
        this.B = this.A - f11;
    }
}
