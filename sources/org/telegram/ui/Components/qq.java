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
public final class qq {
    public float A;
    public float B;
    public boolean D;
    public float E;
    public final boolean F;
    public boolean G;
    public View H;
    public final org.telegram.ui.ActionBar.i6 J;
    public boolean f38863a;
    public Paint d;
    public boolean f38868g;
    public int h;
    public String f38869i;
    public boolean f38870j;
    public ValueAnimator f38871k;
    public float f38873m;
    public StaticLayout f38874n;
    public StaticLayout f38875o;
    public StaticLayout f38876p;
    public StaticLayout f38877q;
    public int f38878r;
    public int f38879s;
    public int f38880t;
    public int f38881u;
    public int f38883x;
    public int f38884y;
    public float f38864b = 1.0f;
    public int f38865c = -1;
    public TextPaint f38866e = new TextPaint(1);
    public final RectF f38867f = new RectF();
    public float f38872l = 1.0f;
    public int v = org.telegram.ui.ActionBar.n6.f29513jg;
    public int f38882w = org.telegram.ui.ActionBar.n6.f29532kg;
    public int f38885z = 17;
    public final float C = 11.5f;
    public int I = 0;

    public qq(View view, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        this.H = view;
        this.J = i6Var;
        this.F = z10;
        if (z10) {
            Paint paint = new Paint(1);
            this.d = paint;
            paint.setColor(-16777216);
        }
        this.f38866e.setTypeface(org.telegram.messenger.g0.o());
        this.f38866e.setTextSize(org.telegram.messenger.g0.L(13.0f));
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
            org.telegram.ui.ActionBar.i6 i6Var = this.J;
            int w02 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
            int w03 = org.telegram.ui.ActionBar.n6.w0(this.f38882w, i6Var);
            if (this.f38881u != w02) {
                this.f38881u = w02;
                this.f38866e.setColor(w02);
            }
            Paint paint2 = this.d;
            if (paint2 != null && this.f38880t != w03) {
                this.f38880t = w03;
                paint2.setColor(w03);
            }
        }
        float f12 = this.f38872l;
        if (f12 != 1.0f) {
            int i11 = this.f38865c;
            if (i11 != 0 && i11 != 1) {
                float f13 = f12 * 2.0f;
                if (f13 > 1.0f) {
                    f13 = 1.0f;
                }
                int i12 = this.f38883x;
                float f14 = this.C;
                float f15 = f14 * 2.0f;
                float L2 = (i12 - org.telegram.messenger.g0.L(f15)) / 2.0f;
                int i13 = this.f38879s;
                int i14 = this.f38878r;
                if (i13 == i14) {
                    z10 = i13;
                } else {
                    z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f13, i14, i13 * f13);
                }
                e(z10);
                if (this.f38870j) {
                    float f16 = this.f38872l;
                    if (f16 <= 0.5f) {
                        interpolation = lr.f37209g.getInterpolation(f16 * 2.0f);
                    } else {
                        interpolation = lr.f37210i.getInterpolation(1.0f - ((f16 - 0.5f) * 2.0f));
                    }
                    f11 = (interpolation * 0.1f) + 1.0f;
                } else {
                    f11 = 1.0f;
                }
                float f17 = this.B;
                RectF rectF = this.f38867f;
                rectF.set(f17, L2, z10 + f17 + org.telegram.messenger.g0.L(f14 - 0.5f), org.telegram.messenger.g0.L(f15) + L2);
                canvas.save();
                canvas.scale(f11, f11, rectF.centerX(), rectF.centerY());
                if (this.f38864b != 1.0f) {
                    canvas.save();
                    float f18 = this.f38864b;
                    canvas.scale(f18, f18, rectF.centerX(), rectF.centerY());
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.F && (paint = this.d) != null) {
                    float f19 = org.telegram.messenger.g0.f24117p * f14;
                    canvas.drawRoundRect(rectF, f19, f19, paint);
                    if (this.f38868g && org.telegram.ui.ActionBar.n6.d1()) {
                        float f20 = f14 * org.telegram.messenger.g0.f24117p;
                        canvas.drawRoundRect(rectF, f20, f20, org.telegram.ui.ActionBar.n6.f29464h2);
                    }
                }
                if (z11) {
                    canvas.restore();
                }
                canvas.clipRect(rectF);
                if (this.D == this.f38870j) {
                    z12 = false;
                }
                if (this.f38877q != null) {
                    canvas.save();
                    float f21 = this.A;
                    float L3 = org.telegram.messenger.g0.L(4.0f) + L2;
                    int L4 = org.telegram.messenger.g0.L(13.0f);
                    if (!z12) {
                        L4 = -L4;
                    }
                    canvas.translate(f21, com.google.android.gms.internal.vision.e2.z(1.0f, f13, L4, L3));
                    this.f38866e.setAlpha((int) (f13 * 255.0f));
                    this.f38877q.draw(canvas);
                    canvas.restore();
                } else if (this.f38874n != null) {
                    canvas.save();
                    float f22 = this.A;
                    float L5 = org.telegram.messenger.g0.L(4.0f) + L2;
                    int L6 = org.telegram.messenger.g0.L(13.0f);
                    if (!z12) {
                        L6 = -L6;
                    }
                    canvas.translate(f22, com.google.android.gms.internal.vision.e2.z(1.0f, f13, L6, L5));
                    this.f38866e.setAlpha((int) (f13 * 255.0f));
                    this.f38874n.draw(canvas);
                    canvas.restore();
                }
                if (this.f38875o != null) {
                    canvas.save();
                    float f23 = this.A;
                    float L7 = org.telegram.messenger.g0.L(4.0f) + L2;
                    if (z12) {
                        L = -org.telegram.messenger.g0.L(13.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(13.0f);
                    }
                    canvas.translate(f23, (L * f13) + L7);
                    this.f38866e.setAlpha((int) ((1.0f - f13) * 255.0f));
                    this.f38875o.draw(canvas);
                    canvas.restore();
                }
                if (this.f38876p != null) {
                    canvas.save();
                    canvas.translate(this.A, L2 + org.telegram.messenger.g0.L(4.0f));
                    this.f38866e.setAlpha(255);
                    this.f38876p.draw(canvas);
                    canvas.restore();
                }
                this.f38866e.setAlpha(255);
                canvas.restore();
                return;
            }
            e(this.f38879s);
            float f24 = (this.f38879s / 2.0f) + this.A;
            float f25 = this.f38883x / 2.0f;
            canvas.save();
            if (this.f38865c == 0) {
                f10 = this.f38872l;
            } else {
                f10 = 1.0f - this.f38872l;
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
        float L = (this.f38883x - org.telegram.messenger.g0.L(f11)) / 2.0f;
        e(this.f38879s);
        float f12 = this.B;
        RectF rectF = this.f38867f;
        rectF.set(f12, L, this.f38879s + f12 + org.telegram.messenger.g0.L(f10 - 0.5f), org.telegram.messenger.g0.L(f11) + L);
        if (this.d != null && this.F) {
            if (this.f38864b != 1.0f) {
                canvas.save();
                float f13 = this.f38864b;
                canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
                z10 = true;
            } else {
                z10 = false;
            }
            float f14 = org.telegram.messenger.g0.f24117p * f10;
            canvas.drawRoundRect(rectF, f14, f14, this.d);
            if (this.f38868g && org.telegram.ui.ActionBar.n6.d1()) {
                float f15 = f10 * org.telegram.messenger.g0.f24117p;
                canvas.drawRoundRect(rectF, f15, f15, org.telegram.ui.ActionBar.n6.f29464h2);
            }
            if (z10) {
                canvas.restore();
            }
        }
        if (this.f38874n != null) {
            canvas.save();
            canvas.translate(this.A, L + org.telegram.messenger.g0.L(4.0f));
            this.f38874n.draw(canvas);
            canvas.restore();
        }
    }

    public final void c(int i7, boolean z10) {
        String valueOf;
        boolean z11;
        boolean z12;
        View view;
        View view2;
        if (this.f38863a) {
            valueOf = org.telegram.messenger.g0.o0(i7, 0);
        } else {
            valueOf = String.valueOf(i7);
        }
        String str = valueOf;
        if (!TextUtils.equals(str, this.f38869i)) {
            ValueAnimator valueAnimator = this.f38871k;
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
                this.f38869i = str;
                if (i7 == 0) {
                    if (this.G && (view = this.H) != null) {
                        view.setVisibility(8);
                        return;
                    }
                    return;
                }
                this.f38879s = Math.max(org.telegram.messenger.g0.L(12.0f), (int) Math.ceil(this.f38866e.measureText(str.toString())));
                StaticLayout staticLayout = new StaticLayout(str, this.f38866e, this.f38879s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f38874n = staticLayout;
                if (staticLayout.getLineCount() >= 1) {
                    f10 = this.f38874n.getLineWidth(0);
                }
                this.f38873m = f10;
                View view3 = this.H;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
            }
            if (z11) {
                ValueAnimator valueAnimator2 = this.f38871k;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.f38872l = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f38871k = ofFloat;
                ofFloat.addUpdateListener(new w(this, 16));
                this.f38871k.addListener(new x(this, 21));
                if (this.h <= 0) {
                    this.f38865c = 0;
                    this.f38871k.setDuration(220L);
                    this.f38871k.setInterpolator(new OvershootInterpolator());
                } else if (i7 == 0) {
                    this.f38865c = 1;
                    this.f38871k.setDuration(150L);
                    this.f38871k.setInterpolator(lr.f37208f);
                } else {
                    this.f38865c = 2;
                    this.f38871k.setDuration(430L);
                    this.f38871k.setInterpolator(lr.f37208f);
                }
                if (this.f38874n != null) {
                    String str2 = this.f38869i;
                    if (str2.length() == str.length()) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str);
                        for (int i10 = 0; i10 < str2.length(); i10++) {
                            if (str2.charAt(i10) == str.charAt(i10)) {
                                int i11 = i10 + 1;
                                spannableStringBuilder.setSpan(new sy(false), i10, i11, 0);
                                spannableStringBuilder2.setSpan(new sy(false), i10, i11, 0);
                            } else {
                                spannableStringBuilder3.setSpan(new sy(false), i10, i10 + 1, 0);
                            }
                        }
                        int max = Math.max(org.telegram.messenger.g0.L(12.0f), (int) Math.ceil(this.f38866e.measureText(str2.toString())));
                        TextPaint textPaint = this.f38866e;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        this.f38875o = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                        this.f38876p = new StaticLayout(spannableStringBuilder3, this.f38866e, max, alignment, 1.0f, 0.0f, false);
                        this.f38877q = new StaticLayout(spannableStringBuilder2, this.f38866e, max, alignment, 1.0f, 0.0f, false);
                    } else {
                        this.f38875o = this.f38874n;
                    }
                }
                this.f38878r = this.f38879s;
                if (i7 > this.h) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f38870j = z12;
                this.f38871k.start();
            }
            if (i7 > 0) {
                this.f38879s = Math.max(org.telegram.messenger.g0.L(12.0f), (int) Math.ceil(this.f38866e.measureText(str.toString())));
                StaticLayout staticLayout2 = new StaticLayout(str, this.f38866e, this.f38879s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f38874n = staticLayout2;
                if (staticLayout2.getLineCount() >= 1) {
                    f10 = this.f38874n.getLineWidth(0);
                }
                this.f38873m = f10;
            }
            this.h = i7;
            this.f38869i = str;
            View view4 = this.H;
            if (view4 != null) {
                view4.invalidate();
            }
        }
    }

    public final void d(int i7, int i10) {
        boolean z10;
        if (i7 != this.f38883x) {
            int i11 = this.h;
            this.h = -1;
            if (this.f38865c == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            c(i11, z10);
            this.f38883x = i7;
        }
        this.f38884y = i10;
    }

    public final void e(float f10) {
        float f11;
        if (this.F) {
            f11 = org.telegram.messenger.g0.L(5.5f);
        } else {
            f11 = 0.0f;
        }
        int i7 = this.f38885z;
        if (i7 == 5) {
            float f12 = this.f38884y - f11;
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
            this.A = (int) ((this.f38884y - f10) / 2.0f);
        }
        this.B = this.A - f11;
    }
}
