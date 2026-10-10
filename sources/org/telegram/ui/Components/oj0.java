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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.ui.cg1;
public abstract class oj0 {
    public ValueAnimator A;
    public AnimatorSet B;
    public float C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public org.telegram.ui.Cells.s2 H;
    public rm0 I;
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
    public int f29481a;
    public final mj0 f29482a0;
    public final mj0 f29484b0;
    public int f29486c0;
    public final org.telegram.ui.Cells.t6 f29487d0;
    public boolean f29489e0;
    public final TextPaint f29494k;
    public final nj0 f29495l;
    public final Drawable f29496m;
    public final Path f29497n;
    public float f29498o;
    public float f29499p;
    public boolean f29500q;
    public boolean f29501r;
    public ValueAnimator f29502s;
    public ValueAnimator f29503t;
    public ValueAnimator f29504u;
    public float v;
    public float f29505w;
    public float f29506x;
    public boolean f29507y;
    public ValueAnimator f29508z;
    public final int f29483b = org.telegram.ui.ActionBar.i6.R9;
    public final int f29485c = org.telegram.ui.ActionBar.i6.S9;
    public final int d = org.telegram.ui.ActionBar.i6.N7;
    public final boolean f29488e = true;
    public final Paint f29490f = new Paint(1);
    public final Paint f29491g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f29492i = new Paint();
    public final RectF f29493j = new RectF();

    public oj0(CharSequence charSequence, CharSequence charSequence2) {
        TextPaint textPaint = new TextPaint(1);
        this.f29494k = textPaint;
        ?? drawable = new Drawable();
        drawable.f29133a = new Path();
        drawable.f29134b = new Paint(1);
        drawable.a();
        this.f29495l = drawable;
        this.f29497n = new Path();
        this.f29498o = 1.0f;
        this.f29499p = 1.0f;
        this.v = 1.0f;
        this.f29505w = 1.0f;
        this.P = 1.0f;
        this.U = 1.0f;
        this.f29482a0 = new mj0(this, 3);
        this.f29484b0 = new mj0(this, 4);
        this.f29487d0 = new org.telegram.ui.Cells.t6(this, 18);
        this.f29489e0 = false;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        this.Z = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
        this.N = charSequence;
        this.S = charSequence2;
        try {
            this.f29496m = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_filled_general).mutate();
        } catch (Exception unused) {
        }
    }

    public final void a(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            if (z10) {
                ValueAnimator valueAnimator = this.f29503t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f29503t = null;
                }
                this.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f29503t = ofFloat;
                ofFloat.addUpdateListener(new mj0(this, 0));
                this.f29503t.setInterpolator(AndroidUtilities.accelerateInterpolator);
                this.f29503t.setDuration(230L);
                this.f29503t.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.f29504u;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f29504u = null;
            }
            this.f29505w = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f29504u = ofFloat2;
            ofFloat2.addUpdateListener(new mj0(this, 1));
            this.f29504u.setInterpolator(AndroidUtilities.accelerateInterpolator);
            this.f29504u.setDuration(230L);
            this.f29504u.start();
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f29502s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f29508z;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        org.telegram.ui.Cells.s2 s2Var = this.H;
        if (s2Var != null) {
            s2Var.removeCallbacks(this.f29487d0);
        }
        ValueAnimator valueAnimator3 = this.f29503t;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.f29498o = 1.0f;
        this.f29499p = 1.0f;
        this.f29500q = false;
        this.f29501r = false;
        this.f29507y = false;
        this.f29489e0 = false;
        this.f29506x = 0.0f;
        this.Y = true;
        e(1.0f);
        this.G = false;
        this.v = 0.0f;
    }

    public final void c(Canvas canvas, boolean z10) {
        org.telegram.ui.Cells.s2 s2Var;
        float f7;
        float f10;
        int i10;
        int i11;
        boolean z11;
        float f11;
        int i12;
        boolean z12;
        int i13;
        float f12;
        int i14;
        float f13;
        int i15;
        float f14;
        int i16;
        int i17;
        int x02;
        int i18;
        int i19;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        if (this.X && !this.Y && (s2Var = this.H) != null && this.I != null) {
            boolean z13 = s2Var instanceof cg1;
            if (z13) {
                f7 = 15.0f;
            } else {
                f7 = 28.0f;
            }
            int dp = AndroidUtilities.dp(f7);
            int dp2 = AndroidUtilities.dp(8.0f);
            int dp3 = AndroidUtilities.dp(9.0f);
            int dp4 = AndroidUtilities.dp(18.0f);
            int d = (int) d();
            int height = (int) (this.H.getHeight() * this.J);
            if (this.F) {
                f10 = (this.D * 0.07f) - 0.05f;
            } else {
                f10 = this.D * 0.02f;
            }
            int width = (this.H.getWidth() - (dp * 4)) - AndroidUtilities.dp(16.0f);
            if (width != this.f29486c0) {
                int i20 = AndroidUtilities.displaySize.x;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                i11 = 0;
                CharSequence charSequence = this.N;
                TextPaint textPaint = this.f29494k;
                this.O = new StaticLayout(charSequence, textPaint, i20, alignment, 1.0f, 0.0f, false);
                float f20 = 0.0f;
                for (int i21 = 0; i21 < this.O.getLineCount(); i21++) {
                    f20 = Math.max(f20, this.O.getLineWidth(i21));
                }
                float f21 = width;
                this.P = Math.min(1.0f, f21 / f20);
                int ceil = (int) Math.ceil(f20);
                if (this.P < 0.8f) {
                    this.P = 0.8f;
                    ceil = ci.d4.a(this.N, textPaint);
                }
                int i22 = ceil;
                this.O = new StaticLayout(this.N, textPaint, i22, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.Q = i22;
                this.R = 0.0f;
                for (int i23 = 0; i23 < this.O.getLineCount(); i23++) {
                    this.Q = Math.min(this.Q, this.O.getLineLeft(i23));
                    this.R = Math.max(this.R, this.O.getLineWidth(i23));
                }
                this.T = new StaticLayout(this.S, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                float f22 = 0.0f;
                for (int i24 = 0; i24 < this.T.getLineCount(); i24++) {
                    f22 = Math.max(f22, this.T.getLineWidth(i24));
                }
                this.U = Math.min(1.0f, f21 / f22);
                i10 = dp4;
                int ceil2 = (int) Math.ceil(f22);
                if (this.U < 0.8f) {
                    this.U = 0.8f;
                    ceil2 = ci.d4.a(this.S, textPaint);
                }
                int i25 = ceil2;
                this.T = new StaticLayout(this.S, textPaint, i25, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.V = i25;
                this.W = 0.0f;
                for (int i26 = 0; i26 < this.T.getLineCount(); i26++) {
                    this.V = Math.min(this.V, this.T.getLineLeft(i26));
                    this.W = Math.max(this.W, this.T.getLineWidth(i26));
                }
                this.f29486c0 = width;
            } else {
                i10 = dp4;
                i11 = 0;
            }
            if (this.J > 0.85f) {
                z11 = 1;
            } else {
                z11 = i11;
            }
            if (this.f29500q != z11) {
                this.f29500q = z11;
                if (this.f29506x == 0.0f) {
                    ValueAnimator valueAnimator = this.f29502s;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (z11 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = 1.0f;
                    }
                    this.f29498o = f19;
                } else {
                    ValueAnimator valueAnimator2 = this.f29502s;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f23 = this.f29498o;
                    if (z11 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = 1.0f;
                    }
                    float[] fArr = new float[2];
                    fArr[i11] = f23;
                    fArr[1] = f18;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    this.f29502s = ofFloat;
                    ofFloat.addUpdateListener(this.f29482a0);
                    this.f29502s.setInterpolator(new LinearInterpolator());
                    this.f29502s.setDuration(170L);
                    this.f29502s.start();
                }
            }
            if (z11 != this.f29501r) {
                this.f29501r = z11;
                ValueAnimator valueAnimator3 = this.A;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                float f24 = this.f29499p;
                if (this.f29501r) {
                    f17 = 0.0f;
                } else {
                    f17 = 1.0f;
                }
                float[] fArr2 = new float[2];
                fArr2[i11] = f24;
                fArr2[1] = f17;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr2);
                this.A = ofFloat2;
                ofFloat2.addUpdateListener(new mj0(this, 2));
                this.A.setInterpolator(is.f27446j);
                this.A.setDuration(250L);
                this.A.start();
            }
            float f25 = this.C * 2.0f;
            if (f25 > 1.0f) {
                f25 = 1.0f;
            }
            float f26 = this.L;
            float f27 = this.K;
            if (z10) {
                f27 += d;
            }
            int i27 = dp + dp3;
            int measuredHeight = (this.H.getMeasuredHeight() - dp2) - dp3;
            if (z10) {
                measuredHeight += d;
            }
            int i28 = (dp2 * 2) + i10;
            float f28 = f25;
            if (height > i28) {
                f11 = 1.0f;
            } else {
                f11 = height / i28;
            }
            canvas.save();
            float f29 = f11;
            if (z10) {
                i12 = d;
                z12 = z13;
                int i29 = i11;
                canvas.clipRect(i29, i29, this.I.getMeasuredWidth(), i12 + 1);
            } else {
                i12 = d;
                z12 = z13;
            }
            int i30 = (this.C > 0.0f ? 1 : (this.C == 0.0f ? 0 : -1));
            Paint paint = this.f29492i;
            RectF rectF = this.f29493j;
            if (i30 == 0) {
                if (this.v != 1.0f && this.f29505w != 1.0f) {
                    canvas.drawPaint(paint);
                }
                f13 = f27;
                i13 = i10;
                i14 = dp3;
                f12 = f10;
            } else {
                float f30 = this.M;
                i13 = i10;
                f12 = f10;
                i14 = dp3;
                float y3 = com.google.android.gms.internal.vision.e2.y(1.0f, this.C, this.H.getWidth() - this.M, (f30 * f10) + f30);
                if (this.v != 1.0f && this.f29505w != 1.0f) {
                    canvas.drawCircle(f26, f27, y3, paint);
                }
                Path path = this.f29497n;
                path.reset();
                f13 = f27;
                rectF.set(f26 - y3, f27 - y3, f26 + y3, f13 + y3);
                path.addOval(rectF, Path.Direction.CW);
                canvas.clipPath(path);
            }
            boolean z14 = this.G;
            Paint paint2 = this.h;
            if (z14) {
                if (this.f29505w > this.v) {
                    canvas.save();
                    float f31 = i27;
                    float f32 = this.C;
                    float f33 = measuredHeight;
                    canvas.translate((f26 - f31) * f32, f32 * (f13 - f33));
                    canvas.drawCircle(f31, f33, this.H.getWidth() * this.f29505w, paint);
                    canvas.restore();
                }
                if (this.v > 0.0f) {
                    canvas.save();
                    float f34 = i27;
                    float f35 = this.C;
                    float f36 = measuredHeight;
                    canvas.translate((f26 - f34) * f35, (f13 - f36) * f35);
                    canvas.drawCircle(f34, f36, this.H.getWidth() * this.v, paint2);
                    canvas.restore();
                }
            } else {
                if (this.v > this.f29505w) {
                    canvas.save();
                    float f37 = i27;
                    float f38 = this.C;
                    float f39 = measuredHeight;
                    canvas.translate((f26 - f37) * f38, f38 * (f13 - f39));
                    canvas.drawCircle(f37, f39, this.H.getWidth() * this.v, paint2);
                    canvas.restore();
                }
                if (this.f29505w > 0.0f) {
                    canvas.save();
                    float f40 = i27;
                    float f41 = this.C;
                    float f42 = measuredHeight;
                    canvas.translate((f26 - f40) * f41, f41 * (f13 - f42));
                    canvas.drawCircle(f40, f42, this.H.getWidth() * this.f29505w, paint);
                    canvas.restore();
                }
            }
            if (height > i28) {
                Paint paint3 = this.f29490f;
                paint3.setAlpha((int) ((1.0f - f28) * 0.4f * f29 * 255.0f));
                if (z10) {
                    rectF.set(dp, dp2, dp + i13, dp2 + i12 + i14);
                } else {
                    rectF.set(dp, ((this.H.getHeight() - height) + dp2) - i12, dp + i13, this.H.getHeight() - dp2);
                }
                i15 = i14;
                float f43 = i15;
                canvas.drawRoundRect(rectF, f43, f43, paint3);
            } else {
                i15 = i14;
            }
            if (z10) {
                canvas.restore();
                return;
            }
            if (z12) {
                measuredHeight = (int) (measuredHeight - ((this.H.getMeasuredHeight() - AndroidUtilities.dp(41.0f)) * this.C));
            }
            float f44 = this.C;
            if (f44 != 0.0f && !z12) {
                i16 = dp;
                f14 = 255.0f;
                i17 = 0;
            } else {
                Paint paint4 = this.f29491g;
                paint4.setAlpha((int) ((1.0f - f44) * f29 * 255.0f));
                float f45 = i27;
                float f46 = measuredHeight;
                canvas.drawCircle(f45, f46, i15, paint4);
                nj0 nj0Var = this.f29495l;
                nj0Var.getClass();
                int dp5 = AndroidUtilities.dp(18.0f);
                int dp6 = AndroidUtilities.dp(18.0f) >> 1;
                f14 = 255.0f;
                int i31 = dp5 >> 1;
                i16 = dp;
                nj0Var.setBounds(i27 - dp6, measuredHeight - i31, i27 + dp6, measuredHeight + i31);
                float f47 = 1.0f - this.f29499p;
                if (f47 < 0.0f) {
                    f47 = 0.0f;
                }
                float f48 = 1.0f - f47;
                canvas.save();
                canvas.rotate(180.0f * f48, f45, f46);
                canvas.translate(0.0f, (AndroidUtilities.dpf2(1.0f) * 1.0f) - f48);
                if (this.G) {
                    x02 = paint2.getColor();
                    i17 = 0;
                } else {
                    i17 = 0;
                    x02 = org.telegram.ui.ActionBar.i6.x0(null, this.f29483b, false);
                }
                nj0Var.f29134b.setColor(x02);
                nj0Var.draw(canvas);
                canvas.restore();
            }
            if (this.J > 0.0f && !this.f29507y) {
                if (Math.abs(this.f29481a) < this.Z * 0.5f) {
                    if (!this.f29489e0) {
                        this.f29506x = 1.0f;
                        this.f29507y = true;
                    }
                } else {
                    this.f29489e0 = true;
                    org.telegram.ui.Cells.s2 s2Var2 = this.H;
                    org.telegram.ui.Cells.t6 t6Var = this.f29487d0;
                    s2Var2.removeCallbacks(t6Var);
                    this.H.postDelayed(t6Var, 200L);
                }
            }
            float height2 = (this.H.getHeight() - (i28 / 2.0f)) + AndroidUtilities.dp(6.0f);
            int width2 = this.H.getWidth();
            if (z12) {
                i18 = i16 * 2;
            } else {
                i18 = i17;
            }
            float f49 = (width2 + i18) / 2.0f;
            if (this.O != null) {
                float f50 = this.f29498o;
                if (f50 > 0.0f && f50 < 1.0f) {
                    canvas.save();
                    float f51 = (this.f29498o * 0.2f) + 0.8f;
                    canvas.scale(f51, f51, f49, com.google.android.gms.internal.vision.e2.y(1.0f, this.f29498o, AndroidUtilities.dp(16.0f), height2));
                }
                i19 = i27;
                f15 = f29;
                f16 = f13;
                canvas.saveLayerAlpha(0.0f, 0.0f, this.H.getMeasuredWidth(), this.H.getMeasuredHeight(), (int) (this.f29498o * f14 * f29 * this.f29506x), 31);
                canvas.translate((f49 - this.Q) - (this.R / 2.0f), com.google.android.gms.internal.vision.e2.y(1.0f, this.f29498o, AndroidUtilities.dp(8.0f), height2) - this.O.getHeight());
                float f52 = this.P;
                canvas.scale(f52, f52, (this.R / 2.0f) + this.Q, this.O.getHeight());
                this.O.draw(canvas);
                canvas.restore();
                float f53 = this.f29498o;
                if (f53 > 0.0f && f53 < 1.0f) {
                    canvas.restore();
                }
            } else {
                i19 = i27;
                f15 = f29;
                f16 = f13;
            }
            if (this.T != null) {
                float f54 = this.f29498o;
                if (f54 > 0.0f && f54 < 1.0f) {
                    canvas.save();
                    float y10 = com.google.android.gms.internal.vision.e2.y(1.0f, this.f29498o, 0.1f, 0.9f);
                    canvas.scale(y10, y10, f49, height2 - (AndroidUtilities.dp(8.0f) * this.f29498o));
                }
                canvas.saveLayerAlpha(0.0f, 0.0f, this.H.getMeasuredWidth(), this.H.getMeasuredHeight(), (int) (org.telegram.messenger.q.z(1.0f, this.f29498o, f14, f15) * this.f29506x), 31);
                canvas.translate((f49 - this.V) - (this.W / 2.0f), ((AndroidUtilities.dp(8.0f) * this.f29498o) + height2) - this.T.getHeight());
                float f55 = this.U;
                canvas.scale(f55, f55, (this.W / 2.0f) + this.V, this.T.getHeight());
                this.T.draw(canvas);
                canvas.restore();
                float f56 = this.f29498o;
                if (f56 > 0.0f && f56 < 1.0f) {
                    canvas.restore();
                }
            }
            canvas.restore();
            if (!z12 && this.f29488e && this.C > 0.0f) {
                canvas.save();
                float f57 = org.telegram.ui.ActionBar.i6.f21109u1.f25727b;
                float dp7 = AndroidUtilities.dp(24.0f) / f57;
                float f58 = this.C;
                float d10 = sc.v.d(1.0f - dp7, f58, dp7, f12);
                float f59 = 1.0f - f58;
                canvas.translate((i19 - f26) * f59, (((this.H.getHeight() - dp2) - i15) - f16) * f59);
                canvas.scale(d10, d10, f26, f16);
                org.telegram.ui.ActionBar.i6.f21109u1.T(0.0f, true);
                if (!org.telegram.ui.ActionBar.i6.C1) {
                    dk0 dk0Var = org.telegram.ui.ActionBar.i6.f21109u1;
                    dk0Var.Z = true;
                    int i32 = this.d;
                    dk0Var.Q(org.telegram.ui.ActionBar.i6.x0(null, i32, true), "Arrow1");
                    org.telegram.ui.ActionBar.i6.f21109u1.Q(org.telegram.ui.ActionBar.i6.x0(null, i32, true), "Arrow2");
                    org.telegram.ui.ActionBar.i6.f21109u1.o();
                    org.telegram.ui.ActionBar.i6.C1 = true;
                }
                float f60 = f57 / 2.0f;
                org.telegram.ui.ActionBar.i6.f21109u1.setBounds((int) (f26 - f60), (int) (f16 - f60), (int) (f26 + f60), (int) (f60 + f16));
                org.telegram.ui.ActionBar.i6.f21109u1.draw(canvas);
                canvas.restore();
            }
        }
    }

    public abstract float d();

    public final void e(float f7) {
        this.C = f7;
        int d = i0.a.d(1.0f - this.C, org.telegram.ui.ActionBar.i6.x0(null, this.d, true), org.telegram.ui.ActionBar.i6.x0(null, this.f29485c, true));
        this.h.setColor(d);
        if (this.f29488e && this.X && !this.Y) {
            dk0 dk0Var = org.telegram.ui.ActionBar.i6.f21109u1;
            dk0Var.Z = true;
            dk0Var.Q(d, "Arrow1");
            org.telegram.ui.ActionBar.i6.f21109u1.Q(d, "Arrow2");
            org.telegram.ui.ActionBar.i6.f21109u1.o();
            org.telegram.ui.ActionBar.i6.C1 = true;
        }
    }

    public final void f(float f7) {
        if (this.J != f7) {
            this.J = f7;
            org.telegram.ui.Cells.s2 s2Var = this.H;
            if (s2Var != null) {
                s2Var.invalidate();
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
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, this.f29483b, false);
        this.f29494k.setColor(-1);
        this.f29491g.setColor(-1);
        this.f29490f.setColor(i0.a.k(-1, 100));
        this.f29492i.setColor(x02);
        this.f29495l.f29134b.setColor(x02);
        this.h.setColor(org.telegram.ui.ActionBar.i6.x0(null, this.d, false));
    }
}
