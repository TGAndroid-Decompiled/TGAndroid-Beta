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
public final class cq {
    public float A;
    public float B;
    public boolean D;
    public float E;
    public final boolean F;
    public boolean G;
    public View H;
    public final org.telegram.ui.ActionBar.e6 J;
    public boolean f32796a;
    public Paint d;
    public boolean f32801g;
    public int h;
    public String f32802i;
    public boolean f32803j;
    public ValueAnimator f32804k;
    public float f32806m;
    public StaticLayout f32807n;
    public StaticLayout f32808o;
    public StaticLayout f32809p;
    public StaticLayout f32810q;
    public int f32811r;
    public int f32812s;
    public int f32813t;
    public int f32814u;
    public int f32816x;
    public int f32817y;
    public float f32797b = 1.0f;
    public int f32798c = -1;
    public TextPaint f32799e = new TextPaint(1);
    public final RectF f32800f = new RectF();
    public float f32805l = 1.0f;
    public int v = org.telegram.ui.ActionBar.k6.f27946gg;
    public int f32815w = org.telegram.ui.ActionBar.k6.f27963hg;
    public int f32818z = 17;
    public final float C = 11.5f;
    public int I = 0;

    public cq(View view, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.H = view;
        this.J = e6Var;
        this.F = z10;
        if (z10) {
            Paint paint = new Paint(1);
            this.d = paint;
            paint.setColor(-16777216);
        }
        this.f32799e.setTypeface(org.telegram.messenger.g0.o());
        this.f32799e.setTextSize(org.telegram.messenger.g0.L(13.0f));
    }

    public final void a(Canvas canvas) {
        float f10;
        float y9;
        float f11;
        boolean z10;
        int L;
        Paint paint;
        float interpolation;
        int i3 = this.I;
        boolean z11 = true;
        if (i3 != 1 && i3 != 2) {
            int i10 = this.v;
            org.telegram.ui.ActionBar.e6 e6Var = this.J;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
            int w03 = org.telegram.ui.ActionBar.k6.w0(this.f32815w, e6Var);
            if (this.f32814u != w02) {
                this.f32814u = w02;
                this.f32799e.setColor(w02);
            }
            Paint paint2 = this.d;
            if (paint2 != null && this.f32813t != w03) {
                this.f32813t = w03;
                paint2.setColor(w03);
            }
        }
        float f12 = this.f32805l;
        if (f12 != 1.0f) {
            int i11 = this.f32798c;
            if (i11 != 0 && i11 != 1) {
                float f13 = f12 * 2.0f;
                if (f13 > 1.0f) {
                    f13 = 1.0f;
                }
                int i12 = this.f32816x;
                float f14 = this.C;
                float f15 = f14 * 2.0f;
                float L2 = (i12 - org.telegram.messenger.g0.L(f15)) / 2.0f;
                int i13 = this.f32812s;
                int i14 = this.f32811r;
                if (i13 == i14) {
                    y9 = i13;
                } else {
                    y9 = com.google.android.recaptcha.internal.a.y(1.0f, f13, i14, i13 * f13);
                }
                e(y9);
                if (this.f32803j) {
                    float f16 = this.f32805l;
                    if (f16 <= 0.5f) {
                        interpolation = xq.f40453g.getInterpolation(f16 * 2.0f);
                    } else {
                        interpolation = xq.f40454i.getInterpolation(1.0f - ((f16 - 0.5f) * 2.0f));
                    }
                    f11 = (interpolation * 0.1f) + 1.0f;
                } else {
                    f11 = 1.0f;
                }
                float f17 = this.B;
                RectF rectF = this.f32800f;
                rectF.set(f17, L2, y9 + f17 + org.telegram.messenger.g0.L(f14 - 0.5f), org.telegram.messenger.g0.L(f15) + L2);
                canvas.save();
                canvas.scale(f11, f11, rectF.centerX(), rectF.centerY());
                if (this.f32797b != 1.0f) {
                    canvas.save();
                    float f18 = this.f32797b;
                    canvas.scale(f18, f18, rectF.centerX(), rectF.centerY());
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.F && (paint = this.d) != null) {
                    float f19 = org.telegram.messenger.g0.f22607p * f14;
                    canvas.drawRoundRect(rectF, f19, f19, paint);
                    if (this.f32801g && org.telegram.ui.ActionBar.k6.d1()) {
                        float f20 = f14 * org.telegram.messenger.g0.f22607p;
                        canvas.drawRoundRect(rectF, f20, f20, org.telegram.ui.ActionBar.k6.f27951h2);
                    }
                }
                if (z10) {
                    canvas.restore();
                }
                canvas.clipRect(rectF);
                if (this.D == this.f32803j) {
                    z11 = false;
                }
                if (this.f32810q != null) {
                    canvas.save();
                    float f21 = this.A;
                    float L3 = org.telegram.messenger.g0.L(4.0f) + L2;
                    int L4 = org.telegram.messenger.g0.L(13.0f);
                    if (!z11) {
                        L4 = -L4;
                    }
                    canvas.translate(f21, com.google.android.recaptcha.internal.a.y(1.0f, f13, L4, L3));
                    this.f32799e.setAlpha((int) (f13 * 255.0f));
                    this.f32810q.draw(canvas);
                    canvas.restore();
                } else if (this.f32807n != null) {
                    canvas.save();
                    float f22 = this.A;
                    float L5 = org.telegram.messenger.g0.L(4.0f) + L2;
                    int L6 = org.telegram.messenger.g0.L(13.0f);
                    if (!z11) {
                        L6 = -L6;
                    }
                    canvas.translate(f22, com.google.android.recaptcha.internal.a.y(1.0f, f13, L6, L5));
                    this.f32799e.setAlpha((int) (f13 * 255.0f));
                    this.f32807n.draw(canvas);
                    canvas.restore();
                }
                if (this.f32808o != null) {
                    canvas.save();
                    float f23 = this.A;
                    float L7 = org.telegram.messenger.g0.L(4.0f) + L2;
                    if (z11) {
                        L = -org.telegram.messenger.g0.L(13.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(13.0f);
                    }
                    canvas.translate(f23, (L * f13) + L7);
                    this.f32799e.setAlpha((int) ((1.0f - f13) * 255.0f));
                    this.f32808o.draw(canvas);
                    canvas.restore();
                }
                if (this.f32809p != null) {
                    canvas.save();
                    canvas.translate(this.A, L2 + org.telegram.messenger.g0.L(4.0f));
                    this.f32799e.setAlpha(255);
                    this.f32809p.draw(canvas);
                    canvas.restore();
                }
                this.f32799e.setAlpha(255);
                canvas.restore();
                return;
            }
            e(this.f32812s);
            float f24 = (this.f32812s / 2.0f) + this.A;
            float f25 = this.f32816x / 2.0f;
            canvas.save();
            if (this.f32798c == 0) {
                f10 = this.f32805l;
            } else {
                f10 = 1.0f - this.f32805l;
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
        float L = (this.f32816x - org.telegram.messenger.g0.L(f11)) / 2.0f;
        e(this.f32812s);
        float f12 = this.B;
        RectF rectF = this.f32800f;
        rectF.set(f12, L, this.f32812s + f12 + org.telegram.messenger.g0.L(f10 - 0.5f), org.telegram.messenger.g0.L(f11) + L);
        if (this.d != null && this.F) {
            if (this.f32797b != 1.0f) {
                canvas.save();
                float f13 = this.f32797b;
                canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
                z10 = true;
            } else {
                z10 = false;
            }
            float f14 = org.telegram.messenger.g0.f22607p * f10;
            canvas.drawRoundRect(rectF, f14, f14, this.d);
            if (this.f32801g && org.telegram.ui.ActionBar.k6.d1()) {
                float f15 = f10 * org.telegram.messenger.g0.f22607p;
                canvas.drawRoundRect(rectF, f15, f15, org.telegram.ui.ActionBar.k6.f27951h2);
            }
            if (z10) {
                canvas.restore();
            }
        }
        if (this.f32807n != null) {
            canvas.save();
            canvas.translate(this.A, L + org.telegram.messenger.g0.L(4.0f));
            this.f32807n.draw(canvas);
            canvas.restore();
        }
    }

    public final void c(int i3, boolean z10) {
        String valueOf;
        boolean z11;
        boolean z12;
        View view;
        View view2;
        if (this.f32796a) {
            valueOf = org.telegram.messenger.g0.o0(i3, 0);
        } else {
            valueOf = String.valueOf(i3);
        }
        String str = valueOf;
        if (!TextUtils.equals(str, this.f32802i)) {
            ValueAnimator valueAnimator = this.f32804k;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (i3 > 0 && this.G && (view2 = this.H) != null) {
                view2.setVisibility(0);
            }
            if (Math.abs(i3 - this.h) > 99) {
                z11 = false;
            } else {
                z11 = z10;
            }
            float f10 = 0.0f;
            if (!z11) {
                this.h = i3;
                this.f32802i = str;
                if (i3 == 0) {
                    if (this.G && (view = this.H) != null) {
                        view.setVisibility(8);
                        return;
                    }
                    return;
                }
                this.f32812s = Math.max(org.telegram.messenger.g0.L(12.0f), (int) Math.ceil(this.f32799e.measureText(str.toString())));
                StaticLayout staticLayout = new StaticLayout(str, this.f32799e, this.f32812s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f32807n = staticLayout;
                if (staticLayout.getLineCount() >= 1) {
                    f10 = this.f32807n.getLineWidth(0);
                }
                this.f32806m = f10;
                View view3 = this.H;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
            }
            if (z11) {
                ValueAnimator valueAnimator2 = this.f32804k;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.f32805l = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f32804k = ofFloat;
                ofFloat.addUpdateListener(new c6(this, 15));
                this.f32804k.addListener(new x5(this, 20));
                if (this.h <= 0) {
                    this.f32798c = 0;
                    this.f32804k.setDuration(220L);
                    this.f32804k.setInterpolator(new OvershootInterpolator());
                } else if (i3 == 0) {
                    this.f32798c = 1;
                    this.f32804k.setDuration(150L);
                    this.f32804k.setInterpolator(xq.f40452f);
                } else {
                    this.f32798c = 2;
                    this.f32804k.setDuration(430L);
                    this.f32804k.setInterpolator(xq.f40452f);
                }
                if (this.f32807n != null) {
                    String str2 = this.f32802i;
                    if (str2.length() == str.length()) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str);
                        for (int i10 = 0; i10 < str2.length(); i10++) {
                            if (str2.charAt(i10) == str.charAt(i10)) {
                                int i11 = i10 + 1;
                                spannableStringBuilder.setSpan(new fy(false), i10, i11, 0);
                                spannableStringBuilder2.setSpan(new fy(false), i10, i11, 0);
                            } else {
                                spannableStringBuilder3.setSpan(new fy(false), i10, i10 + 1, 0);
                            }
                        }
                        int max = Math.max(org.telegram.messenger.g0.L(12.0f), (int) Math.ceil(this.f32799e.measureText(str2.toString())));
                        TextPaint textPaint = this.f32799e;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        this.f32808o = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                        this.f32809p = new StaticLayout(spannableStringBuilder3, this.f32799e, max, alignment, 1.0f, 0.0f, false);
                        this.f32810q = new StaticLayout(spannableStringBuilder2, this.f32799e, max, alignment, 1.0f, 0.0f, false);
                    } else {
                        this.f32808o = this.f32807n;
                    }
                }
                this.f32811r = this.f32812s;
                if (i3 > this.h) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f32803j = z12;
                this.f32804k.start();
            }
            if (i3 > 0) {
                this.f32812s = Math.max(org.telegram.messenger.g0.L(12.0f), (int) Math.ceil(this.f32799e.measureText(str.toString())));
                StaticLayout staticLayout2 = new StaticLayout(str, this.f32799e, this.f32812s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f32807n = staticLayout2;
                if (staticLayout2.getLineCount() >= 1) {
                    f10 = this.f32807n.getLineWidth(0);
                }
                this.f32806m = f10;
            }
            this.h = i3;
            this.f32802i = str;
            View view4 = this.H;
            if (view4 != null) {
                view4.invalidate();
            }
        }
    }

    public final void d(int i3, int i10) {
        boolean z10;
        if (i3 != this.f32816x) {
            int i11 = this.h;
            this.h = -1;
            if (this.f32798c == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            c(i11, z10);
            this.f32816x = i3;
        }
        this.f32817y = i10;
    }

    public final void e(float f10) {
        float f11;
        if (this.F) {
            f11 = org.telegram.messenger.g0.L(5.5f);
        } else {
            f11 = 0.0f;
        }
        int i3 = this.f32818z;
        if (i3 == 5) {
            float f12 = this.f32817y - f11;
            this.A = f12;
            float f13 = this.E;
            if (f13 != 0.0f) {
                this.A = f12 - Math.max((f10 / 2.0f) + f13, f10);
            } else {
                this.A = f12 - f10;
            }
        } else if (i3 == 3) {
            this.A = f11;
        } else {
            this.A = (int) ((this.f32817y - f10) / 2.0f);
        }
        this.B = this.A - f11;
    }
}
