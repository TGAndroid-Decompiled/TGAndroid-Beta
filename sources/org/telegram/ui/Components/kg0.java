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
import org.telegram.ui.w91;
public abstract class kg0 {
    public ValueAnimator A;
    public AnimatorSet B;
    public float C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public org.telegram.ui.Cells.t2 H;
    public pj0 I;
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
    public int f35320a;
    public final jg0 f35321a0;
    public final jg0 f35323b0;
    public int f35325c0;
    public final dt f35326d0;
    public boolean f35328e0;
    public final TextPaint f35333k;
    public final di.j0 f35334l;
    public final Drawable f35335m;
    public final Path f35336n;
    public float f35337o;
    public float f35338p;
    public boolean f35339q;
    public boolean f35340r;
    public ValueAnimator f35341s;
    public ValueAnimator f35342t;
    public ValueAnimator f35343u;
    public float v;
    public float f35344w;
    public float f35345x;
    public boolean f35346y;
    public ValueAnimator f35347z;
    public final int f35322b = org.telegram.ui.ActionBar.m6.R9;
    public final int f35324c = org.telegram.ui.ActionBar.m6.S9;
    public final int d = org.telegram.ui.ActionBar.m6.N7;
    public final boolean f35327e = true;
    public final Paint f35329f = new Paint(1);
    public final Paint f35330g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f35331i = new Paint();
    public final RectF f35332j = new RectF();

    public kg0(CharSequence charSequence, CharSequence charSequence2) {
        TextPaint textPaint = new TextPaint(1);
        this.f35333k = textPaint;
        di.j0 j0Var = new di.j0();
        j0Var.f9154b = new Path();
        j0Var.d = new Paint(1);
        j0Var.f();
        this.f35334l = j0Var;
        this.f35336n = new Path();
        this.f35337o = 1.0f;
        this.f35338p = 1.0f;
        this.v = 1.0f;
        this.f35344w = 1.0f;
        this.P = 1.0f;
        this.U = 1.0f;
        this.f35321a0 = new jg0(this, 3);
        this.f35323b0 = new jg0(this, 4);
        this.f35326d0 = new dt(this, 9);
        this.f35328e0 = false;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        this.Z = ViewConfiguration.get(org.telegram.messenger.t0.f25570b).getScaledTouchSlop();
        this.N = charSequence;
        this.S = charSequence2;
        try {
            this.f35335m = org.telegram.messenger.t0.f25570b.getResources().getDrawable(2131232144).mutate();
        } catch (Exception unused) {
        }
    }

    public final void a(boolean z9) {
        if (this.G != z9) {
            this.G = z9;
            if (z9) {
                ValueAnimator valueAnimator = this.f35342t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f35342t = null;
                }
                this.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f35342t = ofFloat;
                ofFloat.addUpdateListener(new jg0(this, 0));
                this.f35342t.setInterpolator(org.telegram.messenger.g0.G);
                this.f35342t.setDuration(230L);
                this.f35342t.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.f35343u;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f35343u = null;
            }
            this.f35344w = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f35343u = ofFloat2;
            ofFloat2.addUpdateListener(new jg0(this, 1));
            this.f35343u.setInterpolator(org.telegram.messenger.g0.G);
            this.f35343u.setDuration(230L);
            this.f35343u.start();
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f35341s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f35347z;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        org.telegram.ui.Cells.t2 t2Var = this.H;
        if (t2Var != null) {
            t2Var.removeCallbacks(this.f35326d0);
        }
        ValueAnimator valueAnimator3 = this.f35342t;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.f35337o = 1.0f;
        this.f35338p = 1.0f;
        this.f35339q = false;
        this.f35340r = false;
        this.f35346y = false;
        this.f35328e0 = false;
        this.f35345x = 0.0f;
        this.Y = true;
        e(1.0f);
        this.G = false;
        this.v = 0.0f;
    }

    public final void c(Canvas canvas, boolean z9) {
        org.telegram.ui.Cells.t2 t2Var;
        float f10;
        float f11;
        int i7;
        int i10;
        boolean z10;
        float f12;
        int i11;
        boolean z11;
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
            boolean z12 = t2Var instanceof w91;
            if (z12) {
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
            if (width != this.f35325c0) {
                int i19 = org.telegram.messenger.g0.f22567q.x;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                i10 = 0;
                CharSequence charSequence = this.N;
                TextPaint textPaint = this.f35333k;
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
                    ceil = fi.m3.a(this.N, textPaint);
                }
                int i21 = ceil;
                this.O = new StaticLayout(this.N, textPaint, i21, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.Q = i21;
                this.R = 0.0f;
                for (int i22 = 0; i22 < this.O.getLineCount(); i22++) {
                    this.Q = Math.min(this.Q, this.O.getLineLeft(i22));
                    this.R = Math.max(this.R, this.O.getLineWidth(i22));
                }
                this.T = new StaticLayout(this.S, textPaint, org.telegram.messenger.g0.f22567q.x, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                float f23 = 0.0f;
                for (int i23 = 0; i23 < this.T.getLineCount(); i23++) {
                    f23 = Math.max(f23, this.T.getLineWidth(i23));
                }
                this.U = Math.min(1.0f, f22 / f23);
                i7 = L4;
                int ceil2 = (int) Math.ceil(f23);
                if (this.U < 0.8f) {
                    this.U = 0.8f;
                    ceil2 = fi.m3.a(this.S, textPaint);
                }
                int i24 = ceil2;
                this.T = new StaticLayout(this.S, textPaint, i24, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.V = i24;
                this.W = 0.0f;
                for (int i25 = 0; i25 < this.T.getLineCount(); i25++) {
                    this.V = Math.min(this.V, this.T.getLineLeft(i25));
                    this.W = Math.max(this.W, this.T.getLineWidth(i25));
                }
                this.f35325c0 = width;
            } else {
                i7 = L4;
                i10 = 0;
            }
            if (this.J > 0.85f) {
                z10 = 1;
            } else {
                z10 = i10;
            }
            if (this.f35339q != z10) {
                this.f35339q = z10;
                if (this.f35345x == 0.0f) {
                    ValueAnimator valueAnimator = this.f35341s;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (z10 != 0) {
                        f20 = 0.0f;
                    } else {
                        f20 = 1.0f;
                    }
                    this.f35337o = f20;
                } else {
                    ValueAnimator valueAnimator2 = this.f35341s;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f24 = this.f35337o;
                    if (z10 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = 1.0f;
                    }
                    float[] fArr = new float[2];
                    fArr[i10] = f24;
                    fArr[1] = f19;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    this.f35341s = ofFloat;
                    ofFloat.addUpdateListener(this.f35321a0);
                    this.f35341s.setInterpolator(new LinearInterpolator());
                    this.f35341s.setDuration(170L);
                    this.f35341s.start();
                }
            }
            if (z10 != this.f35340r) {
                this.f35340r = z10;
                ValueAnimator valueAnimator3 = this.A;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                float f25 = this.f35338p;
                if (this.f35340r) {
                    f18 = 0.0f;
                } else {
                    f18 = 1.0f;
                }
                float[] fArr2 = new float[2];
                fArr2[i10] = f25;
                fArr2[1] = f18;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr2);
                this.A = ofFloat2;
                ofFloat2.addUpdateListener(new jg0(this, 2));
                this.A.setInterpolator(wq.f40049j);
                this.A.setDuration(250L);
                this.A.start();
            }
            float f26 = this.C * 2.0f;
            if (f26 > 1.0f) {
                f26 = 1.0f;
            }
            float f27 = this.L;
            float f28 = this.K;
            if (z9) {
                f28 += d;
            }
            int i26 = L + L3;
            int measuredHeight = (this.H.getMeasuredHeight() - L2) - L3;
            if (z9) {
                measuredHeight += d;
            }
            int i27 = (L2 * 2) + i7;
            float f29 = f26;
            if (height > i27) {
                f12 = 1.0f;
            } else {
                f12 = height / i27;
            }
            canvas.save();
            float f30 = f12;
            if (z9) {
                i11 = d;
                z11 = z12;
                int i28 = i10;
                canvas.clipRect(i28, i28, this.I.getMeasuredWidth(), i11 + 1);
            } else {
                i11 = d;
                z11 = z12;
            }
            int i29 = (this.C > 0.0f ? 1 : (this.C == 0.0f ? 0 : -1));
            Paint paint = this.f35331i;
            RectF rectF = this.f35332j;
            if (i29 == 0) {
                if (this.v != 1.0f && this.f35344w != 1.0f) {
                    canvas.drawPaint(paint);
                }
                f14 = f28;
                i12 = i7;
                i13 = L3;
                f13 = f11;
            } else {
                float f31 = this.M;
                i12 = i7;
                f13 = f11;
                i13 = L3;
                float z13 = com.google.android.recaptcha.internal.a.z(1.0f, this.C, this.H.getWidth() - this.M, (f31 * f11) + f31);
                if (this.v != 1.0f && this.f35344w != 1.0f) {
                    canvas.drawCircle(f27, f28, z13, paint);
                }
                Path path = this.f35336n;
                path.reset();
                f14 = f28;
                rectF.set(f27 - z13, f28 - z13, f27 + z13, f14 + z13);
                path.addOval(rectF, Path.Direction.CW);
                canvas.clipPath(path);
            }
            boolean z14 = this.G;
            Paint paint2 = this.h;
            if (z14) {
                if (this.f35344w > this.v) {
                    canvas.save();
                    float f32 = i26;
                    float f33 = this.C;
                    float f34 = measuredHeight;
                    canvas.translate((f27 - f32) * f33, f33 * (f14 - f34));
                    canvas.drawCircle(f32, f34, this.H.getWidth() * this.f35344w, paint);
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
                if (this.v > this.f35344w) {
                    canvas.save();
                    float f38 = i26;
                    float f39 = this.C;
                    float f40 = measuredHeight;
                    canvas.translate((f27 - f38) * f39, f39 * (f14 - f40));
                    canvas.drawCircle(f38, f40, this.H.getWidth() * this.v, paint2);
                    canvas.restore();
                }
                if (this.f35344w > 0.0f) {
                    canvas.save();
                    float f41 = i26;
                    float f42 = this.C;
                    float f43 = measuredHeight;
                    canvas.translate((f27 - f41) * f42, f42 * (f14 - f43));
                    canvas.drawCircle(f41, f43, this.H.getWidth() * this.f35344w, paint);
                    canvas.restore();
                }
            }
            if (height > i27) {
                Paint paint3 = this.f35329f;
                paint3.setAlpha((int) ((1.0f - f29) * 0.4f * f30 * 255.0f));
                if (z9) {
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
            if (z9) {
                canvas.restore();
                return;
            }
            if (z11) {
                measuredHeight = (int) (measuredHeight - ((this.H.getMeasuredHeight() - org.telegram.messenger.g0.L(41.0f)) * this.C));
            }
            float f45 = this.C;
            if (f45 != 0.0f && !z11) {
                i15 = L;
                f15 = 255.0f;
                i16 = 0;
            } else {
                Paint paint4 = this.f35330g;
                paint4.setAlpha((int) ((1.0f - f45) * f30 * 255.0f));
                float f46 = i26;
                float f47 = measuredHeight;
                canvas.drawCircle(f46, f47, i14, paint4);
                di.j0 j0Var = this.f35334l;
                j0Var.getClass();
                int L5 = org.telegram.messenger.g0.L(18.0f);
                int L6 = org.telegram.messenger.g0.L(18.0f) >> 1;
                f15 = 255.0f;
                int i30 = L5 >> 1;
                i15 = L;
                j0Var.setBounds(i26 - L6, measuredHeight - i30, i26 + L6, measuredHeight + i30);
                float f48 = 1.0f - this.f35338p;
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
                    x02 = org.telegram.ui.ActionBar.m6.x0(null, this.f35322b, false);
                }
                ((Paint) j0Var.d).setColor(x02);
                j0Var.draw(canvas);
                canvas.restore();
            }
            if (this.J > 0.0f && !this.f35346y) {
                if (Math.abs(this.f35320a) < this.Z * 0.5f) {
                    if (!this.f35328e0) {
                        this.f35345x = 1.0f;
                        this.f35346y = true;
                    }
                } else {
                    this.f35328e0 = true;
                    org.telegram.ui.Cells.t2 t2Var2 = this.H;
                    dt dtVar = this.f35326d0;
                    t2Var2.removeCallbacks(dtVar);
                    this.H.postDelayed(dtVar, 200L);
                }
            }
            float height2 = (this.H.getHeight() - (i27 / 2.0f)) + org.telegram.messenger.g0.L(6.0f);
            int width2 = this.H.getWidth();
            if (z11) {
                i17 = i15 * 2;
            } else {
                i17 = i16;
            }
            float f50 = (width2 + i17) / 2.0f;
            if (this.O != null) {
                float f51 = this.f35337o;
                if (f51 > 0.0f && f51 < 1.0f) {
                    canvas.save();
                    float f52 = (this.f35337o * 0.2f) + 0.8f;
                    canvas.scale(f52, f52, f50, com.google.android.recaptcha.internal.a.z(1.0f, this.f35337o, org.telegram.messenger.g0.L(16.0f), height2));
                }
                i18 = i26;
                f16 = f30;
                f17 = f14;
                canvas.saveLayerAlpha(0.0f, 0.0f, this.H.getMeasuredWidth(), this.H.getMeasuredHeight(), (int) (this.f35337o * f15 * f30 * this.f35345x), 31);
                canvas.translate((f50 - this.Q) - (this.R / 2.0f), com.google.android.recaptcha.internal.a.z(1.0f, this.f35337o, org.telegram.messenger.g0.L(8.0f), height2) - this.O.getHeight());
                float f53 = this.P;
                canvas.scale(f53, f53, (this.R / 2.0f) + this.Q, this.O.getHeight());
                this.O.draw(canvas);
                canvas.restore();
                float f54 = this.f35337o;
                if (f54 > 0.0f && f54 < 1.0f) {
                    canvas.restore();
                }
            } else {
                i18 = i26;
                f16 = f30;
                f17 = f14;
            }
            if (this.T != null) {
                float f55 = this.f35337o;
                if (f55 > 0.0f && f55 < 1.0f) {
                    canvas.save();
                    float z15 = com.google.android.recaptcha.internal.a.z(1.0f, this.f35337o, 0.1f, 0.9f);
                    canvas.scale(z15, z15, f50, height2 - (org.telegram.messenger.g0.L(8.0f) * this.f35337o));
                }
                canvas.saveLayerAlpha(0.0f, 0.0f, this.H.getMeasuredWidth(), this.H.getMeasuredHeight(), (int) (org.telegram.messenger.k5.A(1.0f, this.f35337o, f15, f16) * this.f35345x), 31);
                canvas.translate((f50 - this.V) - (this.W / 2.0f), ((org.telegram.messenger.g0.L(8.0f) * this.f35337o) + height2) - this.T.getHeight());
                float f56 = this.U;
                canvas.scale(f56, f56, (this.W / 2.0f) + this.V, this.T.getHeight());
                this.T.draw(canvas);
                canvas.restore();
                float f57 = this.f35337o;
                if (f57 > 0.0f && f57 < 1.0f) {
                    canvas.restore();
                }
            }
            canvas.restore();
            if (!z11 && this.f35327e && this.C > 0.0f) {
                canvas.save();
                float f58 = org.telegram.ui.ActionBar.m6.f28201u1.f40963b;
                float L7 = org.telegram.messenger.g0.L(24.0f) / f58;
                float f59 = this.C;
                float d2 = rf.b.d(1.0f - L7, f59, L7, f13);
                float f60 = 1.0f - f59;
                canvas.translate((i18 - f27) * f60, (((this.H.getHeight() - L2) - i14) - f17) * f60);
                canvas.scale(d2, d2, f27, f17);
                org.telegram.ui.ActionBar.m6.f28201u1.T(true, 0.0f);
                if (!org.telegram.ui.ActionBar.m6.C1) {
                    zg0 zg0Var = org.telegram.ui.ActionBar.m6.f28201u1;
                    zg0Var.Z = true;
                    int i31 = this.d;
                    zg0Var.Q(org.telegram.ui.ActionBar.m6.x0(null, i31, true), "Arrow1");
                    org.telegram.ui.ActionBar.m6.f28201u1.Q(org.telegram.ui.ActionBar.m6.x0(null, i31, true), "Arrow2");
                    org.telegram.ui.ActionBar.m6.f28201u1.o();
                    org.telegram.ui.ActionBar.m6.C1 = true;
                }
                float f61 = f58 / 2.0f;
                org.telegram.ui.ActionBar.m6.f28201u1.setBounds((int) (f27 - f61), (int) (f17 - f61), (int) (f27 + f61), (int) (f61 + f17));
                org.telegram.ui.ActionBar.m6.f28201u1.draw(canvas);
                canvas.restore();
            }
        }
    }

    public abstract float d();

    public final void e(float f10) {
        this.C = f10;
        int f11 = i0.a.f(1.0f - this.C, org.telegram.ui.ActionBar.m6.x0(null, this.d, true), org.telegram.ui.ActionBar.m6.x0(null, this.f35324c, true));
        this.h.setColor(f11);
        if (this.f35327e && this.X && !this.Y) {
            zg0 zg0Var = org.telegram.ui.ActionBar.m6.f28201u1;
            zg0Var.Z = true;
            zg0Var.Q(f11, "Arrow1");
            org.telegram.ui.ActionBar.m6.f28201u1.Q(f11, "Arrow2");
            org.telegram.ui.ActionBar.m6.f28201u1.o();
            org.telegram.ui.ActionBar.m6.C1 = true;
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

    public final void g(boolean z9) {
        this.X = z9;
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
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, this.f35322b, false);
        this.f35333k.setColor(-1);
        this.f35330g.setColor(-1);
        this.f35329f.setColor(i0.a.o(-1, 100));
        this.f35331i.setColor(x02);
        ((Paint) this.f35334l.d).setColor(x02);
        this.h.setColor(org.telegram.ui.ActionBar.m6.x0(null, this.d, false));
    }
}
