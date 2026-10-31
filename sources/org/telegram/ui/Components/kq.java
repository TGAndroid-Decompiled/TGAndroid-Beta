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
public final class kq {
    public float A;
    public float B;
    public boolean D;
    public float E;
    public final boolean F;
    public boolean G;
    public View H;
    public final org.telegram.ui.ActionBar.p6 J;
    public boolean f27867a;
    public Paint d;
    public boolean f27871g;
    public int h;
    public String f27872i;
    public boolean f27873j;
    public ValueAnimator f27874k;
    public float f27876m;
    public StaticLayout f27877n;
    public StaticLayout f27878o;
    public StaticLayout f27879p;
    public StaticLayout f27880q;
    public int f27881r;
    public int f27882s;
    public int f27883t;
    public int f27884u;
    public int f27886x;
    public int f27887y;
    public float f27868b = 1.0f;
    public int f27869c = -1;
    public TextPaint e = new TextPaint(1);
    public final RectF f27870f = new RectF();
    public float f27875l = 1.0f;
    public int v = org.telegram.ui.ActionBar.t6.f20993gg;
    public int f27885w = org.telegram.ui.ActionBar.t6.f21010hg;
    public int f27888z = 17;
    public final float C = 11.5f;
    public int I = 0;

    public kq(View view, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        this.H = view;
        this.J = p6Var;
        this.F = z10;
        if (z10) {
            Paint paint = new Paint(1);
            this.d = paint;
            paint.setColor(-16777216);
        }
        this.e.setTypeface(org.telegram.messenger.i0.o());
        this.e.setTextSize(org.telegram.messenger.i0.L(13.0f));
    }

    public final void a(Canvas canvas) {
        float f7;
        float z10;
        float f10;
        boolean z11;
        int L;
        Paint paint;
        float interpolation;
        int i10 = this.I;
        boolean z12 = true;
        if (i10 != 1 && i10 != 2) {
            int i11 = this.v;
            org.telegram.ui.ActionBar.p6 p6Var = this.J;
            int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
            int w03 = org.telegram.ui.ActionBar.t6.w0(this.f27885w, p6Var);
            if (this.f27884u != w02) {
                this.f27884u = w02;
                this.e.setColor(w02);
            }
            Paint paint2 = this.d;
            if (paint2 != null && this.f27883t != w03) {
                this.f27883t = w03;
                paint2.setColor(w03);
            }
        }
        float f11 = this.f27875l;
        if (f11 != 1.0f) {
            int i12 = this.f27869c;
            if (i12 != 0 && i12 != 1) {
                float f12 = f11 * 2.0f;
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                int i13 = this.f27886x;
                float f13 = this.C;
                float f14 = f13 * 2.0f;
                float L2 = (i13 - org.telegram.messenger.i0.L(f14)) / 2.0f;
                int i14 = this.f27882s;
                int i15 = this.f27881r;
                if (i14 == i15) {
                    z10 = i14;
                } else {
                    z10 = c3.i0.z(1.0f, f12, i15, i14 * f12);
                }
                e(z10);
                if (this.f27873j) {
                    float f15 = this.f27875l;
                    if (f15 <= 0.5f) {
                        interpolation = gr.f26496g.getInterpolation(f15 * 2.0f);
                    } else {
                        interpolation = gr.f26497i.getInterpolation(1.0f - ((f15 - 0.5f) * 2.0f));
                    }
                    f10 = (interpolation * 0.1f) + 1.0f;
                } else {
                    f10 = 1.0f;
                }
                float f16 = this.B;
                RectF rectF = this.f27870f;
                rectF.set(f16, L2, z10 + f16 + org.telegram.messenger.i0.L(f13 - 0.5f), org.telegram.messenger.i0.L(f14) + L2);
                canvas.save();
                canvas.scale(f10, f10, rectF.centerX(), rectF.centerY());
                if (this.f27868b != 1.0f) {
                    canvas.save();
                    float f17 = this.f27868b;
                    canvas.scale(f17, f17, rectF.centerX(), rectF.centerY());
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.F && (paint = this.d) != null) {
                    float f18 = org.telegram.messenger.i0.f16025p * f13;
                    canvas.drawRoundRect(rectF, f18, f18, paint);
                    if (this.f27871g && org.telegram.ui.ActionBar.t6.d1()) {
                        float f19 = f13 * org.telegram.messenger.i0.f16025p;
                        canvas.drawRoundRect(rectF, f19, f19, org.telegram.ui.ActionBar.t6.f20998h2);
                    }
                }
                if (z11) {
                    canvas.restore();
                }
                canvas.clipRect(rectF);
                if (this.D == this.f27873j) {
                    z12 = false;
                }
                if (this.f27880q != null) {
                    canvas.save();
                    float f20 = this.A;
                    float L3 = org.telegram.messenger.i0.L(4.0f) + L2;
                    int L4 = org.telegram.messenger.i0.L(13.0f);
                    if (!z12) {
                        L4 = -L4;
                    }
                    canvas.translate(f20, c3.i0.z(1.0f, f12, L4, L3));
                    this.e.setAlpha((int) (f12 * 255.0f));
                    this.f27880q.draw(canvas);
                    canvas.restore();
                } else if (this.f27877n != null) {
                    canvas.save();
                    float f21 = this.A;
                    float L5 = org.telegram.messenger.i0.L(4.0f) + L2;
                    int L6 = org.telegram.messenger.i0.L(13.0f);
                    if (!z12) {
                        L6 = -L6;
                    }
                    canvas.translate(f21, c3.i0.z(1.0f, f12, L6, L5));
                    this.e.setAlpha((int) (f12 * 255.0f));
                    this.f27877n.draw(canvas);
                    canvas.restore();
                }
                if (this.f27878o != null) {
                    canvas.save();
                    float f22 = this.A;
                    float L7 = org.telegram.messenger.i0.L(4.0f) + L2;
                    if (z12) {
                        L = -org.telegram.messenger.i0.L(13.0f);
                    } else {
                        L = org.telegram.messenger.i0.L(13.0f);
                    }
                    canvas.translate(f22, (L * f12) + L7);
                    this.e.setAlpha((int) ((1.0f - f12) * 255.0f));
                    this.f27878o.draw(canvas);
                    canvas.restore();
                }
                if (this.f27879p != null) {
                    canvas.save();
                    canvas.translate(this.A, L2 + org.telegram.messenger.i0.L(4.0f));
                    this.e.setAlpha(255);
                    this.f27879p.draw(canvas);
                    canvas.restore();
                }
                this.e.setAlpha(255);
                canvas.restore();
                return;
            }
            e(this.f27882s);
            float f23 = (this.f27882s / 2.0f) + this.A;
            float f24 = this.f27886x / 2.0f;
            canvas.save();
            if (this.f27869c == 0) {
                f7 = this.f27875l;
            } else {
                f7 = 1.0f - this.f27875l;
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
        float L = (this.f27886x - org.telegram.messenger.i0.L(f10)) / 2.0f;
        e(this.f27882s);
        float f11 = this.B;
        RectF rectF = this.f27870f;
        rectF.set(f11, L, this.f27882s + f11 + org.telegram.messenger.i0.L(f7 - 0.5f), org.telegram.messenger.i0.L(f10) + L);
        if (this.d != null && this.F) {
            if (this.f27868b != 1.0f) {
                canvas.save();
                float f12 = this.f27868b;
                canvas.scale(f12, f12, rectF.centerX(), rectF.centerY());
                z10 = true;
            } else {
                z10 = false;
            }
            float f13 = org.telegram.messenger.i0.f16025p * f7;
            canvas.drawRoundRect(rectF, f13, f13, this.d);
            if (this.f27871g && org.telegram.ui.ActionBar.t6.d1()) {
                float f14 = f7 * org.telegram.messenger.i0.f16025p;
                canvas.drawRoundRect(rectF, f14, f14, org.telegram.ui.ActionBar.t6.f20998h2);
            }
            if (z10) {
                canvas.restore();
            }
        }
        if (this.f27877n != null) {
            canvas.save();
            canvas.translate(this.A, L + org.telegram.messenger.i0.L(4.0f));
            this.f27877n.draw(canvas);
            canvas.restore();
        }
    }

    public final void c(int i10, boolean z10) {
        String valueOf;
        boolean z11;
        boolean z12;
        View view;
        View view2;
        if (this.f27867a) {
            valueOf = org.telegram.messenger.i0.o0(i10, 0);
        } else {
            valueOf = String.valueOf(i10);
        }
        String str = valueOf;
        if (!TextUtils.equals(str, this.f27872i)) {
            ValueAnimator valueAnimator = this.f27874k;
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
                this.f27872i = str;
                if (i10 == 0) {
                    if (this.G && (view = this.H) != null) {
                        view.setVisibility(8);
                        return;
                    }
                    return;
                }
                this.f27882s = Math.max(org.telegram.messenger.i0.L(12.0f), (int) Math.ceil(this.e.measureText(str.toString())));
                StaticLayout staticLayout = new StaticLayout(str, this.e, this.f27882s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f27877n = staticLayout;
                if (staticLayout.getLineCount() >= 1) {
                    f7 = this.f27877n.getLineWidth(0);
                }
                this.f27876m = f7;
                View view3 = this.H;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
            }
            if (z11) {
                ValueAnimator valueAnimator2 = this.f27874k;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.f27875l = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f27874k = ofFloat;
                ofFloat.addUpdateListener(new a6(this, 15));
                this.f27874k.addListener(new w5(this, 20));
                if (this.h <= 0) {
                    this.f27869c = 0;
                    this.f27874k.setDuration(220L);
                    this.f27874k.setInterpolator(new OvershootInterpolator());
                } else if (i10 == 0) {
                    this.f27869c = 1;
                    this.f27874k.setDuration(150L);
                    this.f27874k.setInterpolator(gr.f26495f);
                } else {
                    this.f27869c = 2;
                    this.f27874k.setDuration(430L);
                    this.f27874k.setInterpolator(gr.f26495f);
                }
                if (this.f27877n != null) {
                    String str2 = this.f27872i;
                    if (str2.length() == str.length()) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str);
                        for (int i11 = 0; i11 < str2.length(); i11++) {
                            if (str2.charAt(i11) == str.charAt(i11)) {
                                int i12 = i11 + 1;
                                spannableStringBuilder.setSpan(new wy(false), i11, i12, 0);
                                spannableStringBuilder2.setSpan(new wy(false), i11, i12, 0);
                            } else {
                                spannableStringBuilder3.setSpan(new wy(false), i11, i11 + 1, 0);
                            }
                        }
                        int max = Math.max(org.telegram.messenger.i0.L(12.0f), (int) Math.ceil(this.e.measureText(str2.toString())));
                        TextPaint textPaint = this.e;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        this.f27878o = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                        this.f27879p = new StaticLayout(spannableStringBuilder3, this.e, max, alignment, 1.0f, 0.0f, false);
                        this.f27880q = new StaticLayout(spannableStringBuilder2, this.e, max, alignment, 1.0f, 0.0f, false);
                    } else {
                        this.f27878o = this.f27877n;
                    }
                }
                this.f27881r = this.f27882s;
                if (i10 > this.h) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f27873j = z12;
                this.f27874k.start();
            }
            if (i10 > 0) {
                this.f27882s = Math.max(org.telegram.messenger.i0.L(12.0f), (int) Math.ceil(this.e.measureText(str.toString())));
                StaticLayout staticLayout2 = new StaticLayout(str, this.e, this.f27882s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f27877n = staticLayout2;
                if (staticLayout2.getLineCount() >= 1) {
                    f7 = this.f27877n.getLineWidth(0);
                }
                this.f27876m = f7;
            }
            this.h = i10;
            this.f27872i = str;
            View view4 = this.H;
            if (view4 != null) {
                view4.invalidate();
            }
        }
    }

    public final void d(int i10, int i11) {
        boolean z10;
        if (i10 != this.f27886x) {
            int i12 = this.h;
            this.h = -1;
            if (this.f27869c == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            c(i12, z10);
            this.f27886x = i10;
        }
        this.f27887y = i11;
    }

    public final void e(float f7) {
        float f10;
        if (this.F) {
            f10 = org.telegram.messenger.i0.L(5.5f);
        } else {
            f10 = 0.0f;
        }
        int i10 = this.f27888z;
        if (i10 == 5) {
            float f11 = this.f27887y - f10;
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
            this.A = (int) ((this.f27887y - f7) / 2.0f);
        }
        this.B = this.A - f10;
    }
}
