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
import org.telegram.ui.ig1;
public abstract class jj0 {
    public ValueAnimator A;
    public AnimatorSet B;
    public float C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public org.telegram.ui.Cells.s2 H;
    public mm0 I;
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
    public int f26369a;
    public final hj0 f26370a0;
    public final hj0 f26372b0;
    public int f26374c0;
    public final org.telegram.ui.Cells.t6 f26375d0;
    public boolean f26376e0;
    public final TextPaint f26381k;
    public final ij0 f26382l;
    public final Drawable f26383m;
    public final Path f26384n;
    public float f26385o;
    public float f26386p;
    public boolean f26387q;
    public boolean f26388r;
    public ValueAnimator f26389s;
    public ValueAnimator f26390t;
    public ValueAnimator f26391u;
    public float v;
    public float f26392w;
    public float f26393x;
    public boolean f26394y;
    public ValueAnimator f26395z;
    public final int f26371b = org.telegram.ui.ActionBar.g6.R9;
    public final int f26373c = org.telegram.ui.ActionBar.g6.S9;
    public final int d = org.telegram.ui.ActionBar.g6.N7;
    public final boolean e = true;
    public final Paint f26377f = new Paint(1);
    public final Paint f26378g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f26379i = new Paint();
    public final RectF f26380j = new RectF();

    public jj0(CharSequence charSequence, CharSequence charSequence2) {
        TextPaint textPaint = new TextPaint(1);
        this.f26381k = textPaint;
        ?? drawable = new Drawable();
        drawable.f25984a = new Path();
        drawable.f25985b = new Paint(1);
        drawable.a();
        this.f26382l = drawable;
        this.f26384n = new Path();
        this.f26385o = 1.0f;
        this.f26386p = 1.0f;
        this.v = 1.0f;
        this.f26392w = 1.0f;
        this.P = 1.0f;
        this.U = 1.0f;
        this.f26370a0 = new hj0(this, 3);
        this.f26372b0 = new hj0(this, 4);
        this.f26375d0 = new org.telegram.ui.Cells.t6(this, 18);
        this.f26376e0 = false;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        this.Z = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
        this.N = charSequence;
        this.S = charSequence2;
        try {
            this.f26383m = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_filled_general).mutate();
        } catch (Exception unused) {
        }
    }

    public final void a(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            if (z10) {
                ValueAnimator valueAnimator = this.f26390t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f26390t = null;
                }
                this.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f26390t = ofFloat;
                ofFloat.addUpdateListener(new hj0(this, 0));
                this.f26390t.setInterpolator(AndroidUtilities.accelerateInterpolator);
                this.f26390t.setDuration(230L);
                this.f26390t.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.f26391u;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f26391u = null;
            }
            this.f26392w = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f26391u = ofFloat2;
            ofFloat2.addUpdateListener(new hj0(this, 1));
            this.f26391u.setInterpolator(AndroidUtilities.accelerateInterpolator);
            this.f26391u.setDuration(230L);
            this.f26391u.start();
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f26389s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f26395z;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        org.telegram.ui.Cells.s2 s2Var = this.H;
        if (s2Var != null) {
            s2Var.removeCallbacks(this.f26375d0);
        }
        ValueAnimator valueAnimator3 = this.f26390t;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.f26385o = 1.0f;
        this.f26386p = 1.0f;
        this.f26387q = false;
        this.f26388r = false;
        this.f26394y = false;
        this.f26376e0 = false;
        this.f26393x = 0.0f;
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
            boolean z13 = s2Var instanceof ig1;
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
            if (width != this.f26374c0) {
                int i20 = AndroidUtilities.displaySize.x;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                i11 = 0;
                CharSequence charSequence = this.N;
                TextPaint textPaint = this.f26381k;
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
                    ceil = di.d4.a(this.N, textPaint);
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
                    ceil2 = di.d4.a(this.S, textPaint);
                }
                int i25 = ceil2;
                this.T = new StaticLayout(this.S, textPaint, i25, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.V = i25;
                this.W = 0.0f;
                for (int i26 = 0; i26 < this.T.getLineCount(); i26++) {
                    this.V = Math.min(this.V, this.T.getLineLeft(i26));
                    this.W = Math.max(this.W, this.T.getLineWidth(i26));
                }
                this.f26374c0 = width;
            } else {
                i10 = dp4;
                i11 = 0;
            }
            if (this.J > 0.85f) {
                z11 = 1;
            } else {
                z11 = i11;
            }
            if (this.f26387q != z11) {
                this.f26387q = z11;
                if (this.f26393x == 0.0f) {
                    ValueAnimator valueAnimator = this.f26389s;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (z11 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = 1.0f;
                    }
                    this.f26385o = f19;
                } else {
                    ValueAnimator valueAnimator2 = this.f26389s;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f23 = this.f26385o;
                    if (z11 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = 1.0f;
                    }
                    float[] fArr = new float[2];
                    fArr[i11] = f23;
                    fArr[1] = f18;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    this.f26389s = ofFloat;
                    ofFloat.addUpdateListener(this.f26370a0);
                    this.f26389s.setInterpolator(new LinearInterpolator());
                    this.f26389s.setDuration(170L);
                    this.f26389s.start();
                }
            }
            if (z11 != this.f26388r) {
                this.f26388r = z11;
                ValueAnimator valueAnimator3 = this.A;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                float f24 = this.f26386p;
                if (this.f26388r) {
                    f17 = 0.0f;
                } else {
                    f17 = 1.0f;
                }
                float[] fArr2 = new float[2];
                fArr2[i11] = f24;
                fArr2[1] = f17;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr2);
                this.A = ofFloat2;
                ofFloat2.addUpdateListener(new hj0(this, 2));
                this.A.setInterpolator(es.f24774j);
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
            Paint paint = this.f26379i;
            RectF rectF = this.f26380j;
            if (i30 == 0) {
                if (this.v != 1.0f && this.f26392w != 1.0f) {
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
                float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, this.C, this.H.getWidth() - this.M, (f30 * f10) + f30);
                if (this.v != 1.0f && this.f26392w != 1.0f) {
                    canvas.drawCircle(f26, f27, y3, paint);
                }
                Path path = this.f26384n;
                path.reset();
                f13 = f27;
                rectF.set(f26 - y3, f27 - y3, f26 + y3, f13 + y3);
                path.addOval(rectF, Path.Direction.CW);
                canvas.clipPath(path);
            }
            boolean z14 = this.G;
            Paint paint2 = this.h;
            if (z14) {
                if (this.f26392w > this.v) {
                    canvas.save();
                    float f31 = i27;
                    float f32 = this.C;
                    float f33 = measuredHeight;
                    canvas.translate((f26 - f31) * f32, f32 * (f13 - f33));
                    canvas.drawCircle(f31, f33, this.H.getWidth() * this.f26392w, paint);
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
                if (this.v > this.f26392w) {
                    canvas.save();
                    float f37 = i27;
                    float f38 = this.C;
                    float f39 = measuredHeight;
                    canvas.translate((f26 - f37) * f38, f38 * (f13 - f39));
                    canvas.drawCircle(f37, f39, this.H.getWidth() * this.v, paint2);
                    canvas.restore();
                }
                if (this.f26392w > 0.0f) {
                    canvas.save();
                    float f40 = i27;
                    float f41 = this.C;
                    float f42 = measuredHeight;
                    canvas.translate((f26 - f40) * f41, f41 * (f13 - f42));
                    canvas.drawCircle(f40, f42, this.H.getWidth() * this.f26392w, paint);
                    canvas.restore();
                }
            }
            if (height > i28) {
                Paint paint3 = this.f26377f;
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
                Paint paint4 = this.f26378g;
                paint4.setAlpha((int) ((1.0f - f44) * f29 * 255.0f));
                float f45 = i27;
                float f46 = measuredHeight;
                canvas.drawCircle(f45, f46, i15, paint4);
                ij0 ij0Var = this.f26382l;
                ij0Var.getClass();
                int dp5 = AndroidUtilities.dp(18.0f);
                int dp6 = AndroidUtilities.dp(18.0f) >> 1;
                f14 = 255.0f;
                int i31 = dp5 >> 1;
                i16 = dp;
                ij0Var.setBounds(i27 - dp6, measuredHeight - i31, i27 + dp6, measuredHeight + i31);
                float f47 = 1.0f - this.f26386p;
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
                    x02 = org.telegram.ui.ActionBar.g6.x0(null, this.f26371b, false);
                }
                ij0Var.f25985b.setColor(x02);
                ij0Var.draw(canvas);
                canvas.restore();
            }
            if (this.J > 0.0f && !this.f26394y) {
                if (Math.abs(this.f26369a) < this.Z * 0.5f) {
                    if (!this.f26376e0) {
                        this.f26393x = 1.0f;
                        this.f26394y = true;
                    }
                } else {
                    this.f26376e0 = true;
                    org.telegram.ui.Cells.s2 s2Var2 = this.H;
                    org.telegram.ui.Cells.t6 t6Var = this.f26375d0;
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
                float f50 = this.f26385o;
                if (f50 > 0.0f && f50 < 1.0f) {
                    canvas.save();
                    float f51 = (this.f26385o * 0.2f) + 0.8f;
                    canvas.scale(f51, f51, f49, com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f26385o, AndroidUtilities.dp(16.0f), height2));
                }
                i19 = i27;
                f15 = f29;
                f16 = f13;
                canvas.saveLayerAlpha(0.0f, 0.0f, this.H.getMeasuredWidth(), this.H.getMeasuredHeight(), (int) (this.f26385o * f14 * f29 * this.f26393x), 31);
                canvas.translate((f49 - this.Q) - (this.R / 2.0f), com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f26385o, AndroidUtilities.dp(8.0f), height2) - this.O.getHeight());
                float f52 = this.P;
                canvas.scale(f52, f52, (this.R / 2.0f) + this.Q, this.O.getHeight());
                this.O.draw(canvas);
                canvas.restore();
                float f53 = this.f26385o;
                if (f53 > 0.0f && f53 < 1.0f) {
                    canvas.restore();
                }
            } else {
                i19 = i27;
                f15 = f29;
                f16 = f13;
            }
            if (this.T != null) {
                float f54 = this.f26385o;
                if (f54 > 0.0f && f54 < 1.0f) {
                    canvas.save();
                    float y10 = com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f26385o, 0.1f, 0.9f);
                    canvas.scale(y10, y10, f49, height2 - (AndroidUtilities.dp(8.0f) * this.f26385o));
                }
                canvas.saveLayerAlpha(0.0f, 0.0f, this.H.getMeasuredWidth(), this.H.getMeasuredHeight(), (int) (org.telegram.messenger.q.B(1.0f, this.f26385o, f14, f15) * this.f26393x), 31);
                canvas.translate((f49 - this.V) - (this.W / 2.0f), ((AndroidUtilities.dp(8.0f) * this.f26385o) + height2) - this.T.getHeight());
                float f55 = this.U;
                canvas.scale(f55, f55, (this.W / 2.0f) + this.V, this.T.getHeight());
                this.T.draw(canvas);
                canvas.restore();
                float f56 = this.f26385o;
                if (f56 > 0.0f && f56 < 1.0f) {
                    canvas.restore();
                }
            }
            canvas.restore();
            if (!z12 && this.e && this.C > 0.0f) {
                canvas.save();
                float f57 = org.telegram.ui.ActionBar.g6.f20211u1.f31603b;
                float dp7 = AndroidUtilities.dp(24.0f) / f57;
                float f58 = this.C;
                float c10 = t8.b.c(1.0f - dp7, f58, dp7, f12);
                float f59 = 1.0f - f58;
                canvas.translate((i19 - f26) * f59, (((this.H.getHeight() - dp2) - i15) - f16) * f59);
                canvas.scale(c10, c10, f26, f16);
                org.telegram.ui.ActionBar.g6.f20211u1.T(0.0f, true);
                if (!org.telegram.ui.ActionBar.g6.C1) {
                    yj0 yj0Var = org.telegram.ui.ActionBar.g6.f20211u1;
                    yj0Var.Z = true;
                    int i32 = this.d;
                    yj0Var.Q(org.telegram.ui.ActionBar.g6.x0(null, i32, true), "Arrow1");
                    org.telegram.ui.ActionBar.g6.f20211u1.Q(org.telegram.ui.ActionBar.g6.x0(null, i32, true), "Arrow2");
                    org.telegram.ui.ActionBar.g6.f20211u1.o();
                    org.telegram.ui.ActionBar.g6.C1 = true;
                }
                float f60 = f57 / 2.0f;
                org.telegram.ui.ActionBar.g6.f20211u1.setBounds((int) (f26 - f60), (int) (f16 - f60), (int) (f26 + f60), (int) (f60 + f16));
                org.telegram.ui.ActionBar.g6.f20211u1.draw(canvas);
                canvas.restore();
            }
        }
    }

    public abstract float d();

    public final void e(float f7) {
        this.C = f7;
        int d = i0.a.d(1.0f - this.C, org.telegram.ui.ActionBar.g6.x0(null, this.d, true), org.telegram.ui.ActionBar.g6.x0(null, this.f26373c, true));
        this.h.setColor(d);
        if (this.e && this.X && !this.Y) {
            yj0 yj0Var = org.telegram.ui.ActionBar.g6.f20211u1;
            yj0Var.Z = true;
            yj0Var.Q(d, "Arrow1");
            org.telegram.ui.ActionBar.g6.f20211u1.Q(d, "Arrow2");
            org.telegram.ui.ActionBar.g6.f20211u1.o();
            org.telegram.ui.ActionBar.g6.C1 = true;
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
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, this.f26371b, false);
        this.f26381k.setColor(-1);
        this.f26378g.setColor(-1);
        this.f26377f.setColor(i0.a.k(-1, 100));
        this.f26379i.setColor(x02);
        this.f26382l.f25985b.setColor(x02);
        this.h.setColor(org.telegram.ui.ActionBar.g6.x0(null, this.d, false));
    }
}
