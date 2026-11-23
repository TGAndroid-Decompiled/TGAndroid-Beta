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
import org.telegram.ui.v91;
public abstract class zg0 {
    public ValueAnimator A;
    public AnimatorSet B;
    public float C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public org.telegram.ui.Cells.u2 H;
    public ek0 I;
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
    public int f42812a;
    public final yg0 f42813a0;
    public final yg0 f42815b0;
    public int f42817c0;
    public final ik f42818d0;
    public boolean f42820e0;
    public final TextPaint f42825k;
    public final fi.i0 f42826l;
    public final Drawable f42827m;
    public final Path f42828n;
    public float f42829o;
    public float f42830p;
    public boolean f42831q;
    public boolean f42832r;
    public ValueAnimator f42833s;
    public ValueAnimator f42834t;
    public ValueAnimator f42835u;
    public float v;
    public float f42836w;
    public float f42837x;
    public boolean f42838y;
    public ValueAnimator f42839z;
    public final int f42814b = org.telegram.ui.ActionBar.m6.R9;
    public final int f42816c = org.telegram.ui.ActionBar.m6.S9;
    public final int d = org.telegram.ui.ActionBar.m6.N7;
    public final boolean f42819e = true;
    public final Paint f42821f = new Paint(1);
    public final Paint f42822g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f42823i = new Paint();
    public final RectF f42824j = new RectF();

    public zg0(CharSequence charSequence, CharSequence charSequence2) {
        TextPaint textPaint = new TextPaint(1);
        this.f42825k = textPaint;
        fi.i0 i0Var = new fi.i0();
        i0Var.f12125b = new Path();
        i0Var.d = new Paint(1);
        i0Var.f();
        this.f42826l = i0Var;
        this.f42828n = new Path();
        this.f42829o = 1.0f;
        this.f42830p = 1.0f;
        this.v = 1.0f;
        this.f42836w = 1.0f;
        this.P = 1.0f;
        this.U = 1.0f;
        this.f42813a0 = new yg0(this, 3);
        this.f42815b0 = new yg0(this, 4);
        this.f42818d0 = new ik(this, 12);
        this.f42820e0 = false;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        this.Z = ViewConfiguration.get(org.telegram.messenger.t0.f26931b).getScaledTouchSlop();
        this.N = charSequence;
        this.S = charSequence2;
        try {
            this.f42827m = org.telegram.messenger.t0.f26931b.getResources().getDrawable(2131232146).mutate();
        } catch (Exception unused) {
        }
    }

    public final void a(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            if (z10) {
                ValueAnimator valueAnimator = this.f42834t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f42834t = null;
                }
                this.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f42834t = ofFloat;
                ofFloat.addUpdateListener(new yg0(this, 0));
                this.f42834t.setInterpolator(org.telegram.messenger.g0.G);
                this.f42834t.setDuration(230L);
                this.f42834t.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.f42835u;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f42835u = null;
            }
            this.f42836w = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f42835u = ofFloat2;
            ofFloat2.addUpdateListener(new yg0(this, 1));
            this.f42835u.setInterpolator(org.telegram.messenger.g0.G);
            this.f42835u.setDuration(230L);
            this.f42835u.start();
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f42833s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f42839z;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        org.telegram.ui.Cells.u2 u2Var = this.H;
        if (u2Var != null) {
            u2Var.removeCallbacks(this.f42818d0);
        }
        ValueAnimator valueAnimator3 = this.f42834t;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.f42829o = 1.0f;
        this.f42830p = 1.0f;
        this.f42831q = false;
        this.f42832r = false;
        this.f42838y = false;
        this.f42820e0 = false;
        this.f42837x = 0.0f;
        this.Y = true;
        e(1.0f);
        this.G = false;
        this.v = 0.0f;
    }

    public final void c(Canvas canvas, boolean z10) {
        org.telegram.ui.Cells.u2 u2Var;
        float f10;
        float f11;
        int i7;
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
        if (this.X && !this.Y && (u2Var = this.H) != null && this.I != null) {
            boolean z13 = u2Var instanceof v91;
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
            if (width != this.f42817c0) {
                int i19 = org.telegram.messenger.g0.f24046q.x;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                i10 = 0;
                CharSequence charSequence = this.N;
                TextPaint textPaint = this.f42825k;
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
                    ceil = hi.l3.a(this.N, textPaint);
                }
                int i21 = ceil;
                this.O = new StaticLayout(this.N, textPaint, i21, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.Q = i21;
                this.R = 0.0f;
                for (int i22 = 0; i22 < this.O.getLineCount(); i22++) {
                    this.Q = Math.min(this.Q, this.O.getLineLeft(i22));
                    this.R = Math.max(this.R, this.O.getLineWidth(i22));
                }
                this.T = new StaticLayout(this.S, textPaint, org.telegram.messenger.g0.f24046q.x, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                float f23 = 0.0f;
                for (int i23 = 0; i23 < this.T.getLineCount(); i23++) {
                    f23 = Math.max(f23, this.T.getLineWidth(i23));
                }
                this.U = Math.min(1.0f, f22 / f23);
                i7 = L4;
                int ceil2 = (int) Math.ceil(f23);
                if (this.U < 0.8f) {
                    this.U = 0.8f;
                    ceil2 = hi.l3.a(this.S, textPaint);
                }
                int i24 = ceil2;
                this.T = new StaticLayout(this.S, textPaint, i24, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.V = i24;
                this.W = 0.0f;
                for (int i25 = 0; i25 < this.T.getLineCount(); i25++) {
                    this.V = Math.min(this.V, this.T.getLineLeft(i25));
                    this.W = Math.max(this.W, this.T.getLineWidth(i25));
                }
                this.f42817c0 = width;
            } else {
                i7 = L4;
                i10 = 0;
            }
            if (this.J > 0.85f) {
                z11 = 1;
            } else {
                z11 = i10;
            }
            if (this.f42831q != z11) {
                this.f42831q = z11;
                if (this.f42837x == 0.0f) {
                    ValueAnimator valueAnimator = this.f42833s;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (z11 != 0) {
                        f20 = 0.0f;
                    } else {
                        f20 = 1.0f;
                    }
                    this.f42829o = f20;
                } else {
                    ValueAnimator valueAnimator2 = this.f42833s;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f24 = this.f42829o;
                    if (z11 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = 1.0f;
                    }
                    float[] fArr = new float[2];
                    fArr[i10] = f24;
                    fArr[1] = f19;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    this.f42833s = ofFloat;
                    ofFloat.addUpdateListener(this.f42813a0);
                    this.f42833s.setInterpolator(new LinearInterpolator());
                    this.f42833s.setDuration(170L);
                    this.f42833s.start();
                }
            }
            if (z11 != this.f42832r) {
                this.f42832r = z11;
                ValueAnimator valueAnimator3 = this.A;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                float f25 = this.f42830p;
                if (this.f42832r) {
                    f18 = 0.0f;
                } else {
                    f18 = 1.0f;
                }
                float[] fArr2 = new float[2];
                fArr2[i10] = f25;
                fArr2[1] = f18;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr2);
                this.A = ofFloat2;
                ofFloat2.addUpdateListener(new yg0(this, 2));
                this.A.setInterpolator(nr.f37964j);
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
            int i27 = (L2 * 2) + i7;
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
            Paint paint = this.f42823i;
            RectF rectF = this.f42824j;
            if (i29 == 0) {
                if (this.v != 1.0f && this.f42836w != 1.0f) {
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
                float z14 = com.google.android.gms.internal.vision.e2.z(1.0f, this.C, this.H.getWidth() - this.M, (f31 * f11) + f31);
                if (this.v != 1.0f && this.f42836w != 1.0f) {
                    canvas.drawCircle(f27, f28, z14, paint);
                }
                Path path = this.f42828n;
                path.reset();
                f14 = f28;
                rectF.set(f27 - z14, f28 - z14, f27 + z14, f14 + z14);
                path.addOval(rectF, Path.Direction.CW);
                canvas.clipPath(path);
            }
            boolean z15 = this.G;
            Paint paint2 = this.h;
            if (z15) {
                if (this.f42836w > this.v) {
                    canvas.save();
                    float f32 = i26;
                    float f33 = this.C;
                    float f34 = measuredHeight;
                    canvas.translate((f27 - f32) * f33, f33 * (f14 - f34));
                    canvas.drawCircle(f32, f34, this.H.getWidth() * this.f42836w, paint);
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
                if (this.v > this.f42836w) {
                    canvas.save();
                    float f38 = i26;
                    float f39 = this.C;
                    float f40 = measuredHeight;
                    canvas.translate((f27 - f38) * f39, f39 * (f14 - f40));
                    canvas.drawCircle(f38, f40, this.H.getWidth() * this.v, paint2);
                    canvas.restore();
                }
                if (this.f42836w > 0.0f) {
                    canvas.save();
                    float f41 = i26;
                    float f42 = this.C;
                    float f43 = measuredHeight;
                    canvas.translate((f27 - f41) * f42, f42 * (f14 - f43));
                    canvas.drawCircle(f41, f43, this.H.getWidth() * this.f42836w, paint);
                    canvas.restore();
                }
            }
            if (height > i27) {
                Paint paint3 = this.f42821f;
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
                Paint paint4 = this.f42822g;
                paint4.setAlpha((int) ((1.0f - f45) * f30 * 255.0f));
                float f46 = i26;
                float f47 = measuredHeight;
                canvas.drawCircle(f46, f47, i14, paint4);
                fi.i0 i0Var = this.f42826l;
                i0Var.getClass();
                int L5 = org.telegram.messenger.g0.L(18.0f);
                int L6 = org.telegram.messenger.g0.L(18.0f) >> 1;
                f15 = 255.0f;
                int i30 = L5 >> 1;
                i15 = L;
                i0Var.setBounds(i26 - L6, measuredHeight - i30, i26 + L6, measuredHeight + i30);
                float f48 = 1.0f - this.f42830p;
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
                    x02 = org.telegram.ui.ActionBar.m6.x0(null, this.f42814b, false);
                }
                ((Paint) i0Var.d).setColor(x02);
                i0Var.draw(canvas);
                canvas.restore();
            }
            if (this.J > 0.0f && !this.f42838y) {
                if (Math.abs(this.f42812a) < this.Z * 0.5f) {
                    if (!this.f42820e0) {
                        this.f42837x = 1.0f;
                        this.f42838y = true;
                    }
                } else {
                    this.f42820e0 = true;
                    org.telegram.ui.Cells.u2 u2Var2 = this.H;
                    ik ikVar = this.f42818d0;
                    u2Var2.removeCallbacks(ikVar);
                    this.H.postDelayed(ikVar, 200L);
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
                float f51 = this.f42829o;
                if (f51 > 0.0f && f51 < 1.0f) {
                    canvas.save();
                    float f52 = (this.f42829o * 0.2f) + 0.8f;
                    canvas.scale(f52, f52, f50, com.google.android.gms.internal.vision.e2.z(1.0f, this.f42829o, org.telegram.messenger.g0.L(16.0f), height2));
                }
                i18 = i26;
                f16 = f30;
                f17 = f14;
                canvas.saveLayerAlpha(0.0f, 0.0f, this.H.getMeasuredWidth(), this.H.getMeasuredHeight(), (int) (this.f42829o * f15 * f30 * this.f42837x), 31);
                canvas.translate((f50 - this.Q) - (this.R / 2.0f), com.google.android.gms.internal.vision.e2.z(1.0f, this.f42829o, org.telegram.messenger.g0.L(8.0f), height2) - this.O.getHeight());
                float f53 = this.P;
                canvas.scale(f53, f53, (this.R / 2.0f) + this.Q, this.O.getHeight());
                this.O.draw(canvas);
                canvas.restore();
                float f54 = this.f42829o;
                if (f54 > 0.0f && f54 < 1.0f) {
                    canvas.restore();
                }
            } else {
                i18 = i26;
                f16 = f30;
                f17 = f14;
            }
            if (this.T != null) {
                float f55 = this.f42829o;
                if (f55 > 0.0f && f55 < 1.0f) {
                    canvas.save();
                    float z16 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f42829o, 0.1f, 0.9f);
                    canvas.scale(z16, z16, f50, height2 - (org.telegram.messenger.g0.L(8.0f) * this.f42829o));
                }
                canvas.saveLayerAlpha(0.0f, 0.0f, this.H.getMeasuredWidth(), this.H.getMeasuredHeight(), (int) (org.telegram.messenger.f3.A(1.0f, this.f42829o, f15, f16) * this.f42837x), 31);
                canvas.translate((f50 - this.V) - (this.W / 2.0f), ((org.telegram.messenger.g0.L(8.0f) * this.f42829o) + height2) - this.T.getHeight());
                float f56 = this.U;
                canvas.scale(f56, f56, (this.W / 2.0f) + this.V, this.T.getHeight());
                this.T.draw(canvas);
                canvas.restore();
                float f57 = this.f42829o;
                if (f57 > 0.0f && f57 < 1.0f) {
                    canvas.restore();
                }
            }
            canvas.restore();
            if (!z12 && this.f42819e && this.C > 0.0f) {
                canvas.save();
                float f58 = org.telegram.ui.ActionBar.m6.f29692u1.f38206b;
                float L7 = org.telegram.messenger.g0.L(24.0f) / f58;
                float f59 = this.C;
                float e10 = p5.c.e(1.0f - L7, f59, L7, f13);
                float f60 = 1.0f - f59;
                canvas.translate((i18 - f27) * f60, (((this.H.getHeight() - L2) - i14) - f17) * f60);
                canvas.scale(e10, e10, f27, f17);
                org.telegram.ui.ActionBar.m6.f29692u1.T(true, 0.0f);
                if (!org.telegram.ui.ActionBar.m6.C1) {
                    oh0 oh0Var = org.telegram.ui.ActionBar.m6.f29692u1;
                    oh0Var.f38205a0 = true;
                    int i31 = this.d;
                    oh0Var.Q(org.telegram.ui.ActionBar.m6.x0(null, i31, true), "Arrow1");
                    org.telegram.ui.ActionBar.m6.f29692u1.Q(org.telegram.ui.ActionBar.m6.x0(null, i31, true), "Arrow2");
                    org.telegram.ui.ActionBar.m6.f29692u1.o();
                    org.telegram.ui.ActionBar.m6.C1 = true;
                }
                float f61 = f58 / 2.0f;
                org.telegram.ui.ActionBar.m6.f29692u1.setBounds((int) (f27 - f61), (int) (f17 - f61), (int) (f27 + f61), (int) (f61 + f17));
                org.telegram.ui.ActionBar.m6.f29692u1.draw(canvas);
                canvas.restore();
            }
        }
    }

    public abstract float d();

    public final void e(float f10) {
        this.C = f10;
        int f11 = i0.a.f(1.0f - this.C, org.telegram.ui.ActionBar.m6.x0(null, this.d, true), org.telegram.ui.ActionBar.m6.x0(null, this.f42816c, true));
        this.h.setColor(f11);
        if (this.f42819e && this.X && !this.Y) {
            oh0 oh0Var = org.telegram.ui.ActionBar.m6.f29692u1;
            oh0Var.f38205a0 = true;
            oh0Var.Q(f11, "Arrow1");
            org.telegram.ui.ActionBar.m6.f29692u1.Q(f11, "Arrow2");
            org.telegram.ui.ActionBar.m6.f29692u1.o();
            org.telegram.ui.ActionBar.m6.C1 = true;
        }
    }

    public final void f(float f10) {
        if (this.J != f10) {
            this.J = f10;
            org.telegram.ui.Cells.u2 u2Var = this.H;
            if (u2Var != null) {
                u2Var.invalidate();
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
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, this.f42814b, false);
        this.f42825k.setColor(-1);
        this.f42822g.setColor(-1);
        this.f42821f.setColor(i0.a.o(-1, 100));
        this.f42823i.setColor(x02);
        ((Paint) this.f42826l.d).setColor(x02);
        this.h.setColor(org.telegram.ui.ActionBar.m6.x0(null, this.d, false));
    }
}
