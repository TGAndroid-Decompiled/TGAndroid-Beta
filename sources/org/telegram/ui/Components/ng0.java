package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.ViewConfiguration;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.j91;
public abstract class ng0 {
    public ValueAnimator A;
    public AnimatorSet B;
    public float C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public org.telegram.ui.Cells.t2 H;
    public tj0 I;
    public float J;
    public float K;
    public float L;
    public float M;
    public final CharSequence N;
    public StaticLayout O;
    public float P;
    public float Q;
    public float R;
    public final CharSequence S;
    public StaticLayout T;
    public float U;
    public float V;
    public float W;
    public boolean X;
    public boolean Y;
    public final float Z;
    public int f36511a;
    public final mg0 f36512a0;
    public final mg0 f36514b0;
    public int f36516c0;
    public final lt f36517d0;
    public boolean f36519e0;
    public final TextPaint f36524k;
    public final ei.l0 f36525l;
    public final Drawable f36526m;
    public final Path f36527n;
    public float f36528o;
    public float f36529p;
    public boolean f36530q;
    public boolean f36531r;
    public ValueAnimator f36532s;
    public ValueAnimator f36533t;
    public ValueAnimator f36534u;
    public float v;
    public float f36535w;
    public float f36536x;
    public boolean f36537y;
    public ValueAnimator f36538z;
    public final int f36513b = org.telegram.ui.ActionBar.k6.R9;
    public final int f36515c = org.telegram.ui.ActionBar.k6.S9;
    public final int d = org.telegram.ui.ActionBar.k6.N7;
    public final boolean f36518e = true;
    public final Paint f36520f = new Paint(1);
    public final Paint f36521g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f36522i = new Paint();
    public final RectF f36523j = new RectF();

    public ng0(CharSequence charSequence, CharSequence charSequence2) {
        TextPaint textPaint = new TextPaint(1);
        this.f36524k = textPaint;
        ei.l0 l0Var = new ei.l0();
        l0Var.f10600b = new Path();
        l0Var.d = new Paint(1);
        l0Var.f();
        this.f36525l = l0Var;
        this.f36527n = new Path();
        this.f36528o = 1.0f;
        this.f36529p = 1.0f;
        this.v = 1.0f;
        this.f36535w = 1.0f;
        this.P = 1.0f;
        this.U = 1.0f;
        this.f36512a0 = new mg0(this, 3);
        this.f36514b0 = new mg0(this, 4);
        this.f36517d0 = new lt(this, 8);
        this.f36519e0 = false;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        this.Z = ViewConfiguration.get(org.telegram.messenger.t0.f25457b).getScaledTouchSlop();
        this.N = charSequence;
        this.S = charSequence2;
        try {
            this.f36526m = org.telegram.messenger.t0.f25457b.getResources().getDrawable(2131232144).mutate();
        } catch (Exception unused) {
        }
    }

    public final void a(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            if (z10) {
                ValueAnimator valueAnimator = this.f36533t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f36533t = null;
                }
                this.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f36533t = ofFloat;
                ofFloat.addUpdateListener(new mg0(this, 0));
                this.f36533t.setInterpolator(org.telegram.messenger.g0.G);
                this.f36533t.setDuration(230L);
                this.f36533t.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.f36534u;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f36534u = null;
            }
            this.f36535w = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f36534u = ofFloat2;
            ofFloat2.addUpdateListener(new mg0(this, 1));
            this.f36534u.setInterpolator(org.telegram.messenger.g0.G);
            this.f36534u.setDuration(230L);
            this.f36534u.start();
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f36532s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f36538z;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        org.telegram.ui.Cells.t2 t2Var = this.H;
        if (t2Var != null) {
            t2Var.removeCallbacks(this.f36517d0);
        }
        ValueAnimator valueAnimator3 = this.f36533t;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.f36528o = 1.0f;
        this.f36529p = 1.0f;
        this.f36530q = false;
        this.f36531r = false;
        this.f36537y = false;
        this.f36519e0 = false;
        this.f36536x = 0.0f;
        this.Y = true;
        e(1.0f);
        this.G = false;
        this.v = 0.0f;
    }

    public final void c(Canvas canvas, boolean z10) {
        org.telegram.ui.Cells.t2 t2Var;
        float f10;
        float f11;
        int i3;
        int i10;
        boolean z11;
        float f12;
        int i11;
        boolean z12;
        int i12;
        float f13;
        int i13;
        float f14;
        int i14;
        float f15;
        int i15;
        int i16;
        int x02;
        int i17;
        int i18;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        if (this.X && !this.Y && (t2Var = this.H) != null && this.I != null) {
            boolean z13 = t2Var instanceof j91;
            if (z13) {
                f10 = 15.0f;
            } else {
                f10 = 28.0f;
            }
            int L = org.telegram.messenger.g0.L(f10);
            int L2 = org.telegram.messenger.g0.L(8.0f);
            int L3 = org.telegram.messenger.g0.L(9.0f);
            int L4 = org.telegram.messenger.g0.L(18.0f);
            int d = (int) d();
            int height = (int) (this.H.getHeight() * this.J);
            if (this.F) {
                f11 = (this.D * 0.07f) - 0.05f;
            } else {
                f11 = this.D * 0.02f;
            }
            int width = (this.H.getWidth() - (L * 4)) - org.telegram.messenger.g0.L(16.0f);
            if (width != this.f36516c0) {
                int i19 = org.telegram.messenger.g0.f22608q.x;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                i10 = 0;
                CharSequence charSequence = this.N;
                TextPaint textPaint = this.f36524k;
                this.O = new StaticLayout(charSequence, textPaint, i19, alignment, 1.0f, 0.0f, false);
                float f21 = 0.0f;
                for (int i20 = 0; i20 < this.O.getLineCount(); i20++) {
                    f21 = Math.max(f21, this.O.getLineWidth(i20));
                }
                float f22 = width;
                this.P = Math.min(1.0f, f22 / f21);
                int ceil = (int) Math.ceil(f21);
                if (this.P < 0.8f) {
                    this.P = 0.8f;
                    ceil = gi.l3.a(this.N, textPaint);
                }
                int i21 = ceil;
                this.O = new StaticLayout(this.N, textPaint, i21, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.Q = i21;
                this.R = 0.0f;
                for (int i22 = 0; i22 < this.O.getLineCount(); i22++) {
                    this.Q = Math.min(this.Q, this.O.getLineLeft(i22));
                    this.R = Math.max(this.R, this.O.getLineWidth(i22));
                }
                this.T = new StaticLayout(this.S, textPaint, org.telegram.messenger.g0.f22608q.x, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                float f23 = 0.0f;
                for (int i23 = 0; i23 < this.T.getLineCount(); i23++) {
                    f23 = Math.max(f23, this.T.getLineWidth(i23));
                }
                this.U = Math.min(1.0f, f22 / f23);
                i3 = L4;
                int ceil2 = (int) Math.ceil(f23);
                if (this.U < 0.8f) {
                    this.U = 0.8f;
                    ceil2 = gi.l3.a(this.S, textPaint);
                }
                int i24 = ceil2;
                this.T = new StaticLayout(this.S, textPaint, i24, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.V = i24;
                this.W = 0.0f;
                for (int i25 = 0; i25 < this.T.getLineCount(); i25++) {
                    this.V = Math.min(this.V, this.T.getLineLeft(i25));
                    this.W = Math.max(this.W, this.T.getLineWidth(i25));
                }
                this.f36516c0 = width;
            } else {
                i3 = L4;
                i10 = 0;
            }
            if (this.J > 0.85f) {
                z11 = 1;
            } else {
                z11 = i10;
            }
            if (this.f36530q != z11) {
                this.f36530q = z11;
                if (this.f36536x == 0.0f) {
                    ValueAnimator valueAnimator = this.f36532s;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (z11 != 0) {
                        f20 = 0.0f;
                    } else {
                        f20 = 1.0f;
                    }
                    this.f36528o = f20;
                } else {
                    ValueAnimator valueAnimator2 = this.f36532s;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f24 = this.f36528o;
                    if (z11 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = 1.0f;
                    }
                    float[] fArr = new float[2];
                    fArr[i10] = f24;
                    fArr[1] = f19;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    this.f36532s = ofFloat;
                    ofFloat.addUpdateListener(this.f36512a0);
                    this.f36532s.setInterpolator(new LinearInterpolator());
                    this.f36532s.setDuration(170L);
                    this.f36532s.start();
                }
            }
            if (z11 != this.f36531r) {
                this.f36531r = z11;
                ValueAnimator valueAnimator3 = this.A;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                float f25 = this.f36529p;
                if (this.f36531r) {
                    f18 = 0.0f;
                } else {
                    f18 = 1.0f;
                }
                float[] fArr2 = new float[2];
                fArr2[i10] = f25;
                fArr2[1] = f18;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr2);
                this.A = ofFloat2;
                ofFloat2.addUpdateListener(new mg0(this, 2));
                this.A.setInterpolator(xq.f40455j);
                this.A.setDuration(250L);
                this.A.start();
            }
            float f26 = this.C * 2.0f;
            if (f26 > 1.0f) {
                f26 = 1.0f;
            }
            float f27 = this.L;
            float f28 = this.K;
            if (z10) {
                f28 += d;
            }
            int i26 = L + L3;
            int measuredHeight = (this.H.getMeasuredHeight() - L2) - L3;
            if (z10) {
                measuredHeight += d;
            }
            int i27 = (L2 * 2) + i3;
            float f29 = f26;
            if (height > i27) {
                f12 = 1.0f;
            } else {
                f12 = height / i27;
            }
            canvas.save();
            float f30 = f12;
            if (z10) {
                i11 = d;
                z12 = z13;
                int i28 = i10;
                canvas.clipRect(i28, i28, this.I.getMeasuredWidth(), i11 + 1);
            } else {
                i11 = d;
                z12 = z13;
            }
            int i29 = (this.C > 0.0f ? 1 : (this.C == 0.0f ? 0 : -1));
            Paint paint = this.f36522i;
            RectF rectF = this.f36523j;
            if (i29 == 0) {
                if (this.v != 1.0f && this.f36535w != 1.0f) {
                    canvas.drawPaint(paint);
                }
                f14 = f28;
                i12 = i3;
                i13 = L3;
                f13 = f11;
            } else {
                float f31 = this.M;
                i12 = i3;
                f13 = f11;
                i13 = L3;
                float y9 = com.google.android.recaptcha.internal.a.y(1.0f, this.C, this.H.getWidth() - this.M, (f31 * f11) + f31);
                if (this.v != 1.0f && this.f36535w != 1.0f) {
                    canvas.drawCircle(f27, f28, y9, paint);
                }
                Path path = this.f36527n;
                path.reset();
                f14 = f28;
                rectF.set(f27 - y9, f28 - y9, f27 + y9, f14 + y9);
                path.addOval(rectF, Path.Direction.CW);
                canvas.clipPath(path);
            }
            boolean z14 = this.G;
            Paint paint2 = this.h;
            if (z14) {
                if (this.f36535w > this.v) {
                    canvas.save();
                    float f32 = i26;
                    float f33 = this.C;
                    float f34 = measuredHeight;
                    canvas.translate((f27 - f32) * f33, f33 * (f14 - f34));
                    canvas.drawCircle(f32, f34, this.H.getWidth() * this.f36535w, paint);
                    canvas.restore();
                }
                if (this.v > 0.0f) {
                    canvas.save();
                    float f35 = i26;
                    float f36 = this.C;
                    float f37 = measuredHeight;
                    canvas.translate((f27 - f35) * f36, (f14 - f37) * f36);
                    canvas.drawCircle(f35, f37, this.H.getWidth() * this.v, paint2);
                    canvas.restore();
                }
            } else {
                if (this.v > this.f36535w) {
                    canvas.save();
                    float f38 = i26;
                    float f39 = this.C;
                    float f40 = measuredHeight;
                    canvas.translate((f27 - f38) * f39, f39 * (f14 - f40));
                    canvas.drawCircle(f38, f40, this.H.getWidth() * this.v, paint2);
                    canvas.restore();
                }
                if (this.f36535w > 0.0f) {
                    canvas.save();
                    float f41 = i26;
                    float f42 = this.C;
                    float f43 = measuredHeight;
                    canvas.translate((f27 - f41) * f42, f42 * (f14 - f43));
                    canvas.drawCircle(f41, f43, this.H.getWidth() * this.f36535w, paint);
                    canvas.restore();
                }
            }
            if (height > i27) {
                Paint paint3 = this.f36520f;
                paint3.setAlpha((int) ((1.0f - f29) * 0.4f * f30 * 255.0f));
                if (z10) {
                    rectF.set(L, L2, L + i12, L2 + i11 + i13);
                } else {
                    rectF.set(L, ((this.H.getHeight() - height) + L2) - i11, L + i12, this.H.getHeight() - L2);
                }
                i14 = i13;
                float f44 = i14;
                canvas.drawRoundRect(rectF, f44, f44, paint3);
            } else {
                i14 = i13;
            }
            if (z10) {
                canvas.restore();
                return;
            }
            if (z12) {
                measuredHeight = (int) (measuredHeight - ((this.H.getMeasuredHeight() - org.telegram.messenger.g0.L(41.0f)) * this.C));
            }
            float f45 = this.C;
            if (f45 != 0.0f && !z12) {
                i15 = L;
                f15 = 255.0f;
                i16 = 0;
            } else {
                Paint paint4 = this.f36521g;
                paint4.setAlpha((int) ((1.0f - f45) * f30 * 255.0f));
                float f46 = i26;
                float f47 = measuredHeight;
                canvas.drawCircle(f46, f47, i14, paint4);
                ei.l0 l0Var = this.f36525l;
                l0Var.getClass();
                int L5 = org.telegram.messenger.g0.L(18.0f);
                int L6 = org.telegram.messenger.g0.L(18.0f) >> 1;
                f15 = 255.0f;
                int i30 = L5 >> 1;
                i15 = L;
                l0Var.setBounds(i26 - L6, measuredHeight - i30, i26 + L6, measuredHeight + i30);
                float f48 = 1.0f - this.f36529p;
                if (f48 < 0.0f) {
                    f48 = 0.0f;
                }
                float f49 = 1.0f - f48;
                canvas.save();
                canvas.rotate(180.0f * f49, f46, f47);
                canvas.translate(0.0f, (org.telegram.messenger.g0.N(1.0f) * 1.0f) - f49);
                if (this.G) {
                    x02 = paint2.getColor();
                    i16 = 0;
                } else {
                    i16 = 0;
                    x02 = org.telegram.ui.ActionBar.k6.x0(null, this.f36513b, false);
                }
                ((Paint) l0Var.d).setColor(x02);
                l0Var.draw(canvas);
                canvas.restore();
            }
            if (this.J > 0.0f && !this.f36537y) {
                if (Math.abs(this.f36511a) < this.Z * 0.5f) {
                    if (!this.f36519e0) {
                        this.f36536x = 1.0f;
                        this.f36537y = true;
                    }
                } else {
                    this.f36519e0 = true;
                    org.telegram.ui.Cells.t2 t2Var2 = this.H;
                    lt ltVar = this.f36517d0;
                    t2Var2.removeCallbacks(ltVar);
                    this.H.postDelayed(ltVar, 200L);
                }
            }
            float height2 = (this.H.getHeight() - (i27 / 2.0f)) + org.telegram.messenger.g0.L(6.0f);
            int width2 = this.H.getWidth();
            if (z12) {
                i17 = i15 * 2;
            } else {
                i17 = i16;
            }
            float f50 = (width2 + i17) / 2.0f;
            if (this.O != null) {
                float f51 = this.f36528o;
                if (f51 > 0.0f && f51 < 1.0f) {
                    canvas.save();
                    float f52 = (this.f36528o * 0.2f) + 0.8f;
                    canvas.scale(f52, f52, f50, com.google.android.recaptcha.internal.a.y(1.0f, this.f36528o, org.telegram.messenger.g0.L(16.0f), height2));
                }
                i18 = i26;
                f16 = f30;
                f17 = f14;
                canvas.saveLayerAlpha(0.0f, 0.0f, this.H.getMeasuredWidth(), this.H.getMeasuredHeight(), (int) (this.f36528o * f15 * f30 * this.f36536x), 31);
                canvas.translate((f50 - this.Q) - (this.R / 2.0f), com.google.android.recaptcha.internal.a.y(1.0f, this.f36528o, org.telegram.messenger.g0.L(8.0f), height2) - this.O.getHeight());
                float f53 = this.P;
                canvas.scale(f53, f53, (this.R / 2.0f) + this.Q, this.O.getHeight());
                this.O.draw(canvas);
                canvas.restore();
                float f54 = this.f36528o;
                if (f54 > 0.0f && f54 < 1.0f) {
                    canvas.restore();
                }
            } else {
                i18 = i26;
                f16 = f30;
                f17 = f14;
            }
            if (this.T != null) {
                float f55 = this.f36528o;
                if (f55 > 0.0f && f55 < 1.0f) {
                    canvas.save();
                    float y10 = com.google.android.recaptcha.internal.a.y(1.0f, this.f36528o, 0.1f, 0.9f);
                    canvas.scale(y10, y10, f50, height2 - (org.telegram.messenger.g0.L(8.0f) * this.f36528o));
                }
                canvas.saveLayerAlpha(0.0f, 0.0f, this.H.getMeasuredWidth(), this.H.getMeasuredHeight(), (int) (org.telegram.messenger.k5.A(1.0f, this.f36528o, f15, f16) * this.f36536x), 31);
                canvas.translate((f50 - this.V) - (this.W / 2.0f), ((org.telegram.messenger.g0.L(8.0f) * this.f36528o) + height2) - this.T.getHeight());
                float f56 = this.U;
                canvas.scale(f56, f56, (this.W / 2.0f) + this.V, this.T.getHeight());
                this.T.draw(canvas);
                canvas.restore();
                float f57 = this.f36528o;
                if (f57 > 0.0f && f57 < 1.0f) {
                    canvas.restore();
                }
            }
            canvas.restore();
            if (!z12 && this.f36518e && this.C > 0.0f) {
                canvas.save();
                float f58 = org.telegram.ui.ActionBar.k6.f28191u1.f32720b;
                float L7 = org.telegram.messenger.g0.L(24.0f) / f58;
                float f59 = this.C;
                float c2 = t4.c.c(1.0f - L7, f59, L7, f13);
                float f60 = 1.0f - f59;
                canvas.translate((i18 - f27) * f60, (((this.H.getHeight() - L2) - i14) - f17) * f60);
                canvas.scale(c2, c2, f27, f17);
                org.telegram.ui.ActionBar.k6.f28191u1.T(true, 0.0f);
                if (!org.telegram.ui.ActionBar.k6.C1) {
                    ch0 ch0Var = org.telegram.ui.ActionBar.k6.f28191u1;
                    ch0Var.f32719a0 = true;
                    int i31 = this.d;
                    ch0Var.Q(org.telegram.ui.ActionBar.k6.x0(null, i31, true), "Arrow1");
                    org.telegram.ui.ActionBar.k6.f28191u1.Q(org.telegram.ui.ActionBar.k6.x0(null, i31, true), "Arrow2");
                    org.telegram.ui.ActionBar.k6.f28191u1.o();
                    org.telegram.ui.ActionBar.k6.C1 = true;
                }
                float f61 = f58 / 2.0f;
                org.telegram.ui.ActionBar.k6.f28191u1.setBounds((int) (f27 - f61), (int) (f17 - f61), (int) (f27 + f61), (int) (f61 + f17));
                org.telegram.ui.ActionBar.k6.f28191u1.draw(canvas);
                canvas.restore();
            }
        }
    }

    public abstract float d();

    public final void e(float f10) {
        this.C = f10;
        int f11 = i0.a.f(1.0f - this.C, org.telegram.ui.ActionBar.k6.x0(null, this.d, true), org.telegram.ui.ActionBar.k6.x0(null, this.f36515c, true));
        this.h.setColor(f11);
        if (this.f36518e && this.X && !this.Y) {
            ch0 ch0Var = org.telegram.ui.ActionBar.k6.f28191u1;
            ch0Var.f32719a0 = true;
            ch0Var.Q(f11, "Arrow1");
            org.telegram.ui.ActionBar.k6.f28191u1.Q(f11, "Arrow2");
            org.telegram.ui.ActionBar.k6.f28191u1.o();
            org.telegram.ui.ActionBar.k6.C1 = true;
        }
    }

    public final void f(float f10) {
        if (this.J != f10) {
            this.J = f10;
            org.telegram.ui.Cells.t2 t2Var = this.H;
            if (t2Var != null) {
                t2Var.invalidate();
            }
        }
    }

    public final void g(boolean z10) {
        this.X = z10;
    }

    public final void h() {
        AnimatorSet animatorSet = this.B;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.B.cancel();
        }
        e(0.0f);
        this.Y = false;
        this.E = false;
    }

    public final void i() {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, this.f36513b, false);
        this.f36524k.setColor(-1);
        this.f36521g.setColor(-1);
        this.f36520f.setColor(i0.a.o(-1, 100));
        this.f36522i.setColor(x02);
        ((Paint) this.f36525l.d).setColor(x02);
        this.h.setColor(org.telegram.ui.ActionBar.k6.x0(null, this.d, false));
    }
}
