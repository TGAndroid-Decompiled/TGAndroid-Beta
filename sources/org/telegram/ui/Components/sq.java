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
public final class sq {
    public float A;
    public float B;
    public boolean D;
    public float E;
    public final boolean F;
    public boolean G;
    public View H;
    public final org.telegram.ui.ActionBar.h6 J;
    public boolean f39659a;
    public Paint d;
    public boolean f39664g;
    public int h;
    public String f39665i;
    public boolean f39666j;
    public ValueAnimator f39667k;
    public float f39669m;
    public StaticLayout f39670n;
    public StaticLayout f39671o;
    public StaticLayout f39672p;
    public StaticLayout f39673q;
    public int f39674r;
    public int f39675s;
    public int f39676t;
    public int f39677u;
    public int f39679x;
    public int f39680y;
    public float f39660b = 1.0f;
    public int f39661c = -1;
    public TextPaint f39662e = new TextPaint(1);
    public final RectF f39663f = new RectF();
    public float f39668l = 1.0f;
    public int v = org.telegram.ui.ActionBar.m6.f29497jg;
    public int f39678w = org.telegram.ui.ActionBar.m6.f29516kg;
    public int f39681z = 17;
    public final float C = 11.5f;
    public int I = 0;

    public sq(View view, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        this.H = view;
        this.J = h6Var;
        this.F = z10;
        if (z10) {
            Paint paint = new Paint(1);
            this.d = paint;
            paint.setColor(-16777216);
        }
        this.f39662e.setTypeface(org.telegram.messenger.g0.o());
        this.f39662e.setTextSize(org.telegram.messenger.g0.L(13.0f));
    }

    public final void a(Canvas canvas) {
        float f10;
        float z10;
        float f11;
        boolean z11;
        int L;
        Paint paint;
        float interpolation;
        int i7 = this.I;
        boolean z12 = true;
        if (i7 != 1 && i7 != 2) {
            int i10 = this.v;
            org.telegram.ui.ActionBar.h6 h6Var = this.J;
            int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
            int w03 = org.telegram.ui.ActionBar.m6.w0(this.f39678w, h6Var);
            if (this.f39677u != w02) {
                this.f39677u = w02;
                this.f39662e.setColor(w02);
            }
            Paint paint2 = this.d;
            if (paint2 != null && this.f39676t != w03) {
                this.f39676t = w03;
                paint2.setColor(w03);
            }
        }
        float f12 = this.f39668l;
        if (f12 != 1.0f) {
            int i11 = this.f39661c;
            if (i11 != 0 && i11 != 1) {
                float f13 = f12 * 2.0f;
                if (f13 > 1.0f) {
                    f13 = 1.0f;
                }
                int i12 = this.f39679x;
                float f14 = this.C;
                float f15 = f14 * 2.0f;
                float L2 = (i12 - org.telegram.messenger.g0.L(f15)) / 2.0f;
                int i13 = this.f39675s;
                int i14 = this.f39674r;
                if (i13 == i14) {
                    z10 = i13;
                } else {
                    z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f13, i14, i13 * f13);
                }
                e(z10);
                if (this.f39666j) {
                    float f16 = this.f39668l;
                    if (f16 <= 0.5f) {
                        interpolation = nr.f37957g.getInterpolation(f16 * 2.0f);
                    } else {
                        interpolation = nr.f37958i.getInterpolation(1.0f - ((f16 - 0.5f) * 2.0f));
                    }
                    f11 = (interpolation * 0.1f) + 1.0f;
                } else {
                    f11 = 1.0f;
                }
                float f17 = this.B;
                RectF rectF = this.f39663f;
                rectF.set(f17, L2, z10 + f17 + org.telegram.messenger.g0.L(f14 - 0.5f), org.telegram.messenger.g0.L(f15) + L2);
                canvas.save();
                canvas.scale(f11, f11, rectF.centerX(), rectF.centerY());
                if (this.f39660b != 1.0f) {
                    canvas.save();
                    float f18 = this.f39660b;
                    canvas.scale(f18, f18, rectF.centerX(), rectF.centerY());
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.F && (paint = this.d) != null) {
                    float f19 = org.telegram.messenger.g0.f24145p * f14;
                    canvas.drawRoundRect(rectF, f19, f19, paint);
                    if (this.f39664g && org.telegram.ui.ActionBar.m6.d1()) {
                        float f20 = f14 * org.telegram.messenger.g0.f24145p;
                        canvas.drawRoundRect(rectF, f20, f20, org.telegram.ui.ActionBar.m6.f29448h2);
                    }
                }
                if (z11) {
                    canvas.restore();
                }
                canvas.clipRect(rectF);
                if (this.D == this.f39666j) {
                    z12 = false;
                }
                if (this.f39673q != null) {
                    canvas.save();
                    float f21 = this.A;
                    float L3 = org.telegram.messenger.g0.L(4.0f) + L2;
                    int L4 = org.telegram.messenger.g0.L(13.0f);
                    if (!z12) {
                        L4 = -L4;
                    }
                    canvas.translate(f21, com.google.android.gms.internal.vision.e2.z(1.0f, f13, L4, L3));
                    this.f39662e.setAlpha((int) (f13 * 255.0f));
                    this.f39673q.draw(canvas);
                    canvas.restore();
                } else if (this.f39670n != null) {
                    canvas.save();
                    float f22 = this.A;
                    float L5 = org.telegram.messenger.g0.L(4.0f) + L2;
                    int L6 = org.telegram.messenger.g0.L(13.0f);
                    if (!z12) {
                        L6 = -L6;
                    }
                    canvas.translate(f22, com.google.android.gms.internal.vision.e2.z(1.0f, f13, L6, L5));
                    this.f39662e.setAlpha((int) (f13 * 255.0f));
                    this.f39670n.draw(canvas);
                    canvas.restore();
                }
                if (this.f39671o != null) {
                    canvas.save();
                    float f23 = this.A;
                    float L7 = org.telegram.messenger.g0.L(4.0f) + L2;
                    if (z12) {
                        L = -org.telegram.messenger.g0.L(13.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(13.0f);
                    }
                    canvas.translate(f23, (L * f13) + L7);
                    this.f39662e.setAlpha((int) ((1.0f - f13) * 255.0f));
                    this.f39671o.draw(canvas);
                    canvas.restore();
                }
                if (this.f39672p != null) {
                    canvas.save();
                    canvas.translate(this.A, L2 + org.telegram.messenger.g0.L(4.0f));
                    this.f39662e.setAlpha(255);
                    this.f39672p.draw(canvas);
                    canvas.restore();
                }
                this.f39662e.setAlpha(255);
                canvas.restore();
                return;
            }
            e(this.f39675s);
            float f24 = (this.f39675s / 2.0f) + this.A;
            float f25 = this.f39679x / 2.0f;
            canvas.save();
            if (this.f39661c == 0) {
                f10 = this.f39668l;
            } else {
                f10 = 1.0f - this.f39668l;
            }
            canvas.scale(f10, f10, f24, f25);
            b(canvas);
            canvas.restore();
            return;
        }
        b(canvas);
    }

    public final void b(Canvas canvas) {
        boolean z10;
        float f10 = this.C;
        float f11 = f10 * 2.0f;
        float L = (this.f39679x - org.telegram.messenger.g0.L(f11)) / 2.0f;
        e(this.f39675s);
        float f12 = this.B;
        RectF rectF = this.f39663f;
        rectF.set(f12, L, this.f39675s + f12 + org.telegram.messenger.g0.L(f10 - 0.5f), org.telegram.messenger.g0.L(f11) + L);
        if (this.d != null && this.F) {
            if (this.f39660b != 1.0f) {
                canvas.save();
                float f13 = this.f39660b;
                canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
                z10 = true;
            } else {
                z10 = false;
            }
            float f14 = org.telegram.messenger.g0.f24145p * f10;
            canvas.drawRoundRect(rectF, f14, f14, this.d);
            if (this.f39664g && org.telegram.ui.ActionBar.m6.d1()) {
                float f15 = f10 * org.telegram.messenger.g0.f24145p;
                canvas.drawRoundRect(rectF, f15, f15, org.telegram.ui.ActionBar.m6.f29448h2);
            }
            if (z10) {
                canvas.restore();
            }
        }
        if (this.f39670n != null) {
            canvas.save();
            canvas.translate(this.A, L + org.telegram.messenger.g0.L(4.0f));
            this.f39670n.draw(canvas);
            canvas.restore();
        }
    }

    public final void c(int i7, boolean z10) {
        String valueOf;
        boolean z11;
        boolean z12;
        View view;
        View view2;
        if (this.f39659a) {
            valueOf = org.telegram.messenger.g0.o0(i7, 0);
        } else {
            valueOf = String.valueOf(i7);
        }
        String str = valueOf;
        if (!TextUtils.equals(str, this.f39665i)) {
            ValueAnimator valueAnimator = this.f39667k;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (i7 > 0 && this.G && (view2 = this.H) != null) {
                view2.setVisibility(0);
            }
            if (Math.abs(i7 - this.h) > 99) {
                z11 = false;
            } else {
                z11 = z10;
            }
            float f10 = 0.0f;
            if (!z11) {
                this.h = i7;
                this.f39665i = str;
                if (i7 == 0) {
                    if (this.G && (view = this.H) != null) {
                        view.setVisibility(8);
                        return;
                    }
                    return;
                }
                this.f39675s = Math.max(org.telegram.messenger.g0.L(12.0f), (int) Math.ceil(this.f39662e.measureText(str.toString())));
                StaticLayout staticLayout = new StaticLayout(str, this.f39662e, this.f39675s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f39670n = staticLayout;
                if (staticLayout.getLineCount() >= 1) {
                    f10 = this.f39670n.getLineWidth(0);
                }
                this.f39669m = f10;
                View view3 = this.H;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
            }
            if (z11) {
                ValueAnimator valueAnimator2 = this.f39667k;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.f39668l = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f39667k = ofFloat;
                ofFloat.addUpdateListener(new x(this, 16));
                this.f39667k.addListener(new y(this, 21));
                if (this.h <= 0) {
                    this.f39661c = 0;
                    this.f39667k.setDuration(220L);
                    this.f39667k.setInterpolator(new OvershootInterpolator());
                } else if (i7 == 0) {
                    this.f39661c = 1;
                    this.f39667k.setDuration(150L);
                    this.f39667k.setInterpolator(nr.f37956f);
                } else {
                    this.f39661c = 2;
                    this.f39667k.setDuration(430L);
                    this.f39667k.setInterpolator(nr.f37956f);
                }
                if (this.f39670n != null) {
                    String str2 = this.f39665i;
                    if (str2.length() == str.length()) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str);
                        for (int i10 = 0; i10 < str2.length(); i10++) {
                            if (str2.charAt(i10) == str.charAt(i10)) {
                                int i11 = i10 + 1;
                                spannableStringBuilder.setSpan(new uy(false), i10, i11, 0);
                                spannableStringBuilder2.setSpan(new uy(false), i10, i11, 0);
                            } else {
                                spannableStringBuilder3.setSpan(new uy(false), i10, i10 + 1, 0);
                            }
                        }
                        int max = Math.max(org.telegram.messenger.g0.L(12.0f), (int) Math.ceil(this.f39662e.measureText(str2.toString())));
                        TextPaint textPaint = this.f39662e;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        this.f39671o = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                        this.f39672p = new StaticLayout(spannableStringBuilder3, this.f39662e, max, alignment, 1.0f, 0.0f, false);
                        this.f39673q = new StaticLayout(spannableStringBuilder2, this.f39662e, max, alignment, 1.0f, 0.0f, false);
                    } else {
                        this.f39671o = this.f39670n;
                    }
                }
                this.f39674r = this.f39675s;
                if (i7 > this.h) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f39666j = z12;
                this.f39667k.start();
            }
            if (i7 > 0) {
                this.f39675s = Math.max(org.telegram.messenger.g0.L(12.0f), (int) Math.ceil(this.f39662e.measureText(str.toString())));
                StaticLayout staticLayout2 = new StaticLayout(str, this.f39662e, this.f39675s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f39670n = staticLayout2;
                if (staticLayout2.getLineCount() >= 1) {
                    f10 = this.f39670n.getLineWidth(0);
                }
                this.f39669m = f10;
            }
            this.h = i7;
            this.f39665i = str;
            View view4 = this.H;
            if (view4 != null) {
                view4.invalidate();
            }
        }
    }

    public final void d(int i7, int i10) {
        boolean z10;
        if (i7 != this.f39679x) {
            int i11 = this.h;
            this.h = -1;
            if (this.f39661c == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            c(i11, z10);
            this.f39679x = i7;
        }
        this.f39680y = i10;
    }

    public final void e(float f10) {
        float f11;
        if (this.F) {
            f11 = org.telegram.messenger.g0.L(5.5f);
        } else {
            f11 = 0.0f;
        }
        int i7 = this.f39681z;
        if (i7 == 5) {
            float f12 = this.f39680y - f11;
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
            this.A = (int) ((this.f39680y - f10) / 2.0f);
        }
        this.B = this.A - f11;
    }
}
