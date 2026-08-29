package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sk0 extends View {
    public boolean A;
    public float B;
    public float C;
    public final TextPaint D;
    public String E;
    public final Path F;
    public final Path G;
    public final float[] H;
    public float I;
    public float J;
    public float K;
    public long L;
    public final int M;
    public final int N;
    public int O;
    public int P;
    public boolean Q;
    public float R;
    public final int[] S;
    public boolean T;
    public final float U;
    public final Drawable V;
    public final Drawable W;
    public boolean f32664a;
    public ng.d f32665a0;
    public final RectF f32666b;
    public ng.d f32667b0;
    public final Paint f32668c;
    public final boolean f32669c0;
    public final Paint d;
    public int f32670d0;
    public float f32671e;
    public final rk0 f32672e0;
    public float f32673f;
    public float f32674f0;
    public boolean f32675g0;
    public float h;
    public long f32676h0;
    public float f32677i0;
    public float f32678j0;
    public final jl0 f32679k0;
    public boolean f32680n;
    public StaticLayout f32681r;
    public StaticLayout f32682s;
    public StaticLayout v;
    public StaticLayout f32683w;
    public StaticLayout f32684x;
    public float f32685y;

    public sk0(jl0 jl0Var, Context context, int i10) {
        super(context);
        int i11;
        float f9;
        float f10;
        org.telegram.ui.ActionBar.c6 c6Var = jl0Var.f29709l2;
        this.f32679k0 = jl0Var;
        this.f32664a = true;
        this.f32666b = new RectF();
        this.f32668c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        this.f32685y = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.D = textPaint;
        this.F = new Path();
        this.G = new Path();
        this.H = new float[8];
        this.S = new int[2];
        this.f32672e0 = new rk0(this, 0);
        this.f32678j0 = 1.0f;
        this.N = i10;
        if (i10 == 0) {
            textPaint.setTextSize(AndroidUtilities.dp(45.0f));
            this.f32669c0 = LocaleController.isRTL;
        } else {
            this.f32669c0 = false;
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            int i12 = org.telegram.ui.ActionBar.g6.f23062d6;
            paint.setColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
            Drawable mutate = context.getDrawable(R.drawable.calendar_date).mutate();
            this.W = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.1f, org.telegram.ui.ActionBar.g6.v0(i12, c6Var), -1), PorterDuff.Mode.MULTIPLY));
        }
        for (int i13 = 0; i13 < 8; i13++) {
            this.H[i13] = AndroidUtilities.dp(44.0f);
        }
        if (this.f32669c0) {
            f9 = 10.0f;
        } else {
            if (i10 == 0) {
                i11 = 132;
            } else {
                i11 = 240;
            }
            f9 = i11 - 15;
        }
        int dp = AndroidUtilities.dp(f9);
        this.M = dp;
        if (jl0Var.b1()) {
            if (this.f32669c0) {
                f10 = -4.0f;
            } else {
                f10 = 6.0f;
            }
            this.M = AndroidUtilities.dp(f10) + dp;
        }
        c();
        setFocusableInTouchMode(true);
        this.U = ViewConfiguration.get(context).getScaledTouchSlop();
        this.V = context.getDrawable(R.drawable.fast_scroll_shadow);
    }

    public final void a(boolean z10) {
        jl0 jl0Var = this.f32679k0;
        f2.w0 layoutManager = jl0Var.getLayoutManager();
        if (layoutManager instanceof f2.j0) {
            f2.j0 j0Var = (f2.j0) layoutManager;
            boolean z11 = true;
            if (j0Var.f6362o == 1) {
                f2.p0 adapter = jl0Var.getAdapter();
                if (adapter instanceof tk0) {
                    tk0 tk0Var = (tk0) adapter;
                    float f9 = this.f32671e;
                    int[] iArr = this.S;
                    tk0Var.G(jl0Var, f9, iArr);
                    if (z10) {
                        j0Var.h1(iArr[0], (-iArr[1]) + jl0Var.f29722s1);
                    }
                    String F = tk0Var.F(iArr[0]);
                    if (F == null) {
                        StaticLayout staticLayout = this.f32681r;
                        if (staticLayout != null) {
                            this.f32682s = staticLayout;
                        }
                        this.f32681r = null;
                    } else if (!F.equals(this.E)) {
                        this.E = F;
                        int i10 = this.N;
                        TextPaint textPaint = this.D;
                        if (i10 == 0) {
                            this.f32681r = new StaticLayout(F, textPaint, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        } else {
                            this.v = this.f32681r;
                            int measureText = ((int) textPaint.measureText(F)) + 1;
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                            this.f32681r = new StaticLayout(F, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                            if (this.v != null) {
                                String[] split = F.split(" ");
                                String[] split2 = this.v.getText().toString().split(" ");
                                if (split != null && split2 != null && split.length == 2 && split2.length == 2 && split[1].equals(split2[1])) {
                                    String charSequence = this.v.getText().toString();
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                    spannableStringBuilder.setSpan(new gz(false), split2[0].length(), charSequence.length(), 0);
                                    this.v = new StaticLayout(spannableStringBuilder, textPaint, ((int) textPaint.measureText(charSequence)) + 1, alignment, 1.0f, 0.0f, false);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(F);
                                    spannableStringBuilder2.setSpan(new gz(false), split[0].length(), F.length(), 0);
                                    this.f32683w = new StaticLayout(spannableStringBuilder2, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(F);
                                    spannableStringBuilder3.setSpan(new gz(false), 0, split[0].length(), 0);
                                    this.f32684x = new StaticLayout(spannableStringBuilder3, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                                } else {
                                    this.f32683w = this.f32681r;
                                    this.f32684x = null;
                                }
                                this.C = this.v.getWidth();
                                this.f32685y = 0.0f;
                                if (getProgress() <= this.B) {
                                    z11 = false;
                                }
                                this.A = z11;
                            }
                            this.B = getProgress();
                        }
                        this.f32682s = null;
                        if (this.f32681r.getLineCount() > 0) {
                            this.f32681r.getLineWidth(0);
                            this.f32681r.getLineLeft(0);
                            if (this.f32669c0) {
                                this.I = (((AndroidUtilities.dp(88.0f) - this.f32681r.getLineWidth(0)) / 2.0f) + AndroidUtilities.dp(10.0f)) - this.f32681r.getLineLeft(0);
                            } else {
                                this.I = ((AndroidUtilities.dp(88.0f) - this.f32681r.getLineWidth(0)) / 2.0f) - this.f32681r.getLineLeft(0);
                            }
                            this.J = (AndroidUtilities.dp(88.0f) - this.f32681r.getHeight()) / 2;
                        }
                    }
                }
            }
        }
    }

    public final void b() {
        if (this.N != 1) {
            return;
        }
        if (!this.Q) {
            this.Q = true;
            invalidate();
        }
        rk0 rk0Var = this.f32672e0;
        AndroidUtilities.cancelRunOnUIThread(rk0Var);
        AndroidUtilities.runOnUIThread(rk0Var, 2000L);
    }

    public final void c() {
        int k9;
        jl0 jl0Var = this.f32679k0;
        int i10 = this.N;
        if (i10 == 0) {
            k9 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23224m7, jl0Var.f29709l2);
        } else {
            k9 = i0.a.k(-16777216, 102);
        }
        this.O = k9;
        this.P = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23207l7, jl0Var.f29709l2);
        this.f32668c.setColor(this.O);
        TextPaint textPaint = this.D;
        if (i10 == 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23242n7, jl0Var.f29709l2));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, jl0Var.f29709l2));
        }
        invalidate();
    }

    @Override
    public float getAlpha() {
        return this.f32678j0;
    }

    public float getProgress() {
        return this.f32671e;
    }

    public int getScrollBarY() {
        return AndroidUtilities.dp(17.0f) + ((int) Math.ceil((getMeasuredHeight() - AndroidUtilities.dp(54.0f)) * this.f32671e));
    }

    @Override
    public final boolean isPressed() {
        return this.f32680n;
    }

    @Override
    public final void layout(int i10, int i11, int i12, int i13) {
        if (!this.f32679k0.F1) {
            return;
        }
        super.layout(i10, i11, i12, i13);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f9;
        float f10;
        float f11;
        char c3;
        float f12;
        float f13;
        int i11;
        int i12;
        float f14;
        float dp;
        float dp2;
        float f15;
        float f16;
        if (this.f32664a) {
            i10 = getPaddingTop();
        } else {
            i10 = 0;
        }
        int ceil = i10 + ((int) Math.ceil(((getMeasuredHeight() - i10) - AndroidUtilities.dp(54.0f)) * this.f32671e));
        int i13 = this.M;
        float f17 = i13;
        RectF rectF = this.f32666b;
        rectF.set(f17, AndroidUtilities.dp(12.0f) + ceil, AndroidUtilities.dp(5.0f) + i13, AndroidUtilities.dp(42.0f) + ceil);
        int i14 = this.N;
        Paint paint = this.f32668c;
        if (i14 == 0) {
            f9 = 12.0f;
            f10 = 36.0f;
            paint.setColor(i0.a.d(this.K, this.O, this.P));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint);
            f11 = 8.0f;
            c3 = 2;
            f12 = 24.0f;
            f13 = 4.0f;
        } else {
            f9 = 12.0f;
            f10 = 36.0f;
            int i15 = org.telegram.ui.ActionBar.g6.f23062d6;
            jl0 jl0Var = this.f32679k0;
            f11 = 8.0f;
            paint.setColor(i0.a.d(0.1f, org.telegram.ui.ActionBar.g6.v0(i15, jl0Var.f29709l2), -1));
            float dp3 = AndroidUtilities.dp(27.0f) + ceil;
            ng.d dVar = this.f32665a0;
            if (dVar != null) {
                c3 = 2;
                f12 = 24.0f;
                dVar.setBounds(AndroidUtilities.dp(-20.0f) + i13, AndroidUtilities.dp(-1.0f) + ceil, AndroidUtilities.dp(36.0f) + i13, AndroidUtilities.dp(55.0f) + ceil);
                this.f32665a0.draw(canvas);
                f13 = 4.0f;
            } else {
                c3 = 2;
                f12 = 24.0f;
                int measuredWidth = getMeasuredWidth();
                Drawable drawable = this.V;
                f13 = 4.0f;
                drawable.setBounds(measuredWidth - drawable.getIntrinsicWidth(), (int) (dp3 - (drawable.getIntrinsicHeight() / 2)), getMeasuredWidth(), (int) (dp3 + (drawable.getIntrinsicHeight() / 2)));
                drawable.draw(canvas);
                canvas.drawCircle(AndroidUtilities.dp(8.0f) + i13, AndroidUtilities.dp(27.0f) + ceil, AndroidUtilities.dp(24.0f), paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, jl0Var.f29709l2));
            canvas.save();
            canvas.translate(AndroidUtilities.dp(f13) + i13, (AndroidUtilities.dp(2.0f) * this.K) + AndroidUtilities.dp(34.0f) + ceil);
            Path path = this.G;
            canvas.drawPath(path, paint);
            canvas.restore();
            canvas.save();
            canvas.translate(AndroidUtilities.dp(f13) + i13, (AndroidUtilities.dp(f12) + ceil) - (AndroidUtilities.dp(2.0f) * this.K));
            canvas.rotate(180.0f, 0.0f, -AndroidUtilities.dp(2.0f));
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        if (i14 == 0) {
            if (this.f32675g0 || this.K != 0.0f) {
                paint.setAlpha((int) (this.K * 255.0f));
                int dp4 = AndroidUtilities.dp(30.0f) + ceil;
                int dp5 = ceil - AndroidUtilities.dp(46.0f);
                if (dp5 <= AndroidUtilities.dp(f9)) {
                    f14 = AndroidUtilities.dp(f9) - dp5;
                    dp5 = AndroidUtilities.dp(f9);
                } else {
                    f14 = 0.0f;
                }
                canvas.translate(AndroidUtilities.dp(10.0f), dp5);
                if (f14 <= AndroidUtilities.dp(29.0f)) {
                    dp = AndroidUtilities.dp(44.0f);
                    dp2 = ((f14 / AndroidUtilities.dp(29.0f)) * AndroidUtilities.dp(40.0f)) + AndroidUtilities.dp(f13);
                } else {
                    dp = ((1.0f - ((f14 - AndroidUtilities.dp(29.0f)) / AndroidUtilities.dp(29.0f))) * AndroidUtilities.dp(40.0f)) + AndroidUtilities.dp(f13);
                    dp2 = AndroidUtilities.dp(44.0f);
                }
                boolean z10 = this.f32669c0;
                Path path2 = this.F;
                float[] fArr = this.H;
                if ((z10 && (fArr[0] != dp || fArr[6] != dp2)) || (!z10 && (fArr[c3] != dp || fArr[4] != dp2))) {
                    if (z10) {
                        fArr[1] = dp;
                        fArr[0] = dp;
                        fArr[7] = dp2;
                        fArr[6] = dp2;
                    } else {
                        fArr[3] = dp;
                        fArr[c3] = dp;
                        fArr[5] = dp2;
                        fArr[4] = dp2;
                    }
                    path2.reset();
                    if (z10) {
                        f15 = AndroidUtilities.dp(10.0f);
                    } else {
                        f15 = 0.0f;
                    }
                    if (z10) {
                        f16 = 98.0f;
                    } else {
                        f16 = 88.0f;
                    }
                    rectF.set(f15, 0.0f, AndroidUtilities.dp(f16), AndroidUtilities.dp(88.0f));
                    path2.addRoundRect(rectF, fArr, Path.Direction.CW);
                    path2.close();
                }
                StaticLayout staticLayout = this.f32681r;
                if (staticLayout == null) {
                    staticLayout = this.f32682s;
                }
                if (staticLayout != null) {
                    canvas.save();
                    float f18 = this.K;
                    canvas.scale(f18, f18, f17, dp4 - dp5);
                    canvas.drawPath(path2, paint);
                    canvas.translate(this.I, this.J);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
            }
        } else if (i14 == 1 && this.f32681r != null && this.R != 0.0f) {
            canvas.save();
            float f19 = (this.R * 0.3f) + 0.7f;
            canvas.scale(f19, f19, rectF.right - AndroidUtilities.dp(f9), rectF.centerY());
            float centerY = rectF.centerY();
            float dp6 = (rectF.left - (AndroidUtilities.dp(30.0f) * this.K)) - AndroidUtilities.dp(f11);
            this.f32681r.getHeight();
            AndroidUtilities.dp(6.0f);
            rectF.set((dp6 - (((1.0f - this.f32685y) * this.C) + (this.f32685y * this.f32681r.getWidth()))) - AndroidUtilities.dp(f10), (centerY - (this.f32681r.getHeight() / 2.0f)) - AndroidUtilities.dp(f11), dp6 - AndroidUtilities.dp(f9), (this.f32681r.getHeight() / 2.0f) + centerY + AndroidUtilities.dp(f11));
            Paint paint2 = this.d;
            int alpha = paint2.getAlpha();
            TextPaint textPaint = this.D;
            int alpha2 = textPaint.getAlpha();
            paint2.setAlpha((int) (alpha * this.R));
            if (this.f32667b0 != null) {
                Rect rect = AndroidUtilities.rectTmp2;
                rectF.round(rect);
                rect.inset(-AndroidUtilities.dp(f13), -AndroidUtilities.dp(f13));
                this.f32667b0.setBounds(rect);
                this.f32667b0.draw(canvas);
            } else {
                Drawable drawable2 = this.W;
                drawable2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                drawable2.setAlpha((int) (this.R * 255.0f));
                drawable2.draw(canvas);
            }
            float f20 = this.f32685y;
            if (f20 != 1.0f) {
                float f21 = f20 + 0.10666667f;
                this.f32685y = f21;
                if (f21 > 1.0f) {
                    this.f32685y = 1.0f;
                } else {
                    invalidate();
                }
            }
            if (this.f32685y != 1.0f) {
                canvas.save();
                rectF.inset(AndroidUtilities.dp(f13), AndroidUtilities.dp(2.0f));
                canvas.clipRect(rectF);
                if (this.v != null) {
                    textPaint.setAlpha((int) ((1.0f - this.f32685y) * alpha2 * this.R));
                    canvas.save();
                    float width = (dp6 - this.v.getWidth()) - AndroidUtilities.dp(f12);
                    float height = centerY - (this.v.getHeight() / 2.0f);
                    if (this.A) {
                        i12 = -1;
                    } else {
                        i12 = 1;
                    }
                    canvas.translate(width, (AndroidUtilities.dp(15.0f) * i12 * this.f32685y) + height);
                    this.v.draw(canvas);
                    canvas.restore();
                }
                if (this.f32683w != null) {
                    textPaint.setAlpha((int) (alpha2 * this.R * this.f32685y));
                    canvas.save();
                    float width2 = (dp6 - this.f32683w.getWidth()) - AndroidUtilities.dp(f12);
                    float height2 = centerY - (this.f32683w.getHeight() / 2.0f);
                    if (this.A) {
                        i11 = 1;
                    } else {
                        i11 = -1;
                    }
                    canvas.translate(width2, com.google.android.recaptcha.internal.a.z(1.0f, this.f32685y, AndroidUtilities.dp(15.0f) * i11, height2));
                    this.f32683w.draw(canvas);
                    canvas.restore();
                }
                if (this.f32684x != null) {
                    textPaint.setAlpha((int) (alpha2 * this.R));
                    canvas.save();
                    canvas.translate((dp6 - this.f32684x.getWidth()) - AndroidUtilities.dp(f12), centerY - (this.f32684x.getHeight() / 2.0f));
                    this.f32684x.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            } else {
                textPaint.setAlpha((int) (alpha2 * this.R));
                canvas.save();
                canvas.translate((dp6 - this.f32681r.getWidth()) - AndroidUtilities.dp(f12), com.google.android.recaptcha.internal.a.z(1.0f, this.f32685y, AndroidUtilities.dp(15.0f), centerY - (this.f32681r.getHeight() / 2.0f)));
                this.f32681r.draw(canvas);
                canvas.restore();
            }
            paint2.setAlpha(alpha);
            textPaint.setAlpha(alpha2);
            canvas.restore();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.L;
        if (j10 < 0 || j10 > 17) {
            j10 = 17;
        }
        boolean z11 = this.f32675g0;
        if ((z11 && this.f32681r != null && this.K < 1.0f) || ((!z11 || this.f32681r == null) && this.K > 0.0f)) {
            this.L = currentTimeMillis;
            invalidate();
            if (this.f32675g0 && this.f32681r != null) {
                float f22 = (((float) j10) / 120.0f) + this.K;
                this.K = f22;
                if (f22 > 1.0f) {
                    this.K = 1.0f;
                }
            } else {
                float f23 = this.K - (((float) j10) / 120.0f);
                this.K = f23;
                if (f23 < 0.0f) {
                    this.K = 0.0f;
                }
            }
        }
        boolean z12 = this.Q;
        if (z12) {
            float f24 = this.R;
            if (f24 != 1.0f) {
                float f25 = (((float) j10) / 120.0f) + f24;
                this.R = f25;
                if (f25 > 1.0f) {
                    this.R = 1.0f;
                }
                invalidate();
                return;
            }
        }
        if (!z12) {
            float f26 = this.R;
            if (f26 != 0.0f) {
                float f27 = f26 - (((float) j10) / 120.0f);
                this.R = f27;
                if (f27 < 0.0f) {
                    this.R = 0.0f;
                }
                invalidate();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f9;
        if (this.N == 0) {
            f9 = 132.0f;
        } else {
            f9 = 240.0f;
        }
        setMeasuredDimension(AndroidUtilities.dp(f9), View.MeasureSpec.getSize(i11));
        Path path = this.G;
        path.reset();
        path.setLastPoint(0.0f, 0.0f);
        path.lineTo(AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        path.lineTo(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        path.close();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sk0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setAlpha(float f9) {
        if (this.f32678j0 != f9) {
            this.f32678j0 = f9;
            super.setAlpha(f9 * this.f32677i0);
        }
    }

    public void setIsVisible(boolean z10) {
        float f9;
        if (this.T != z10) {
            this.T = z10;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            this.f32677i0 = f9;
            super.setAlpha(this.f32678j0 * f9);
        }
    }

    public void setProgress(float f9) {
        this.f32671e = f9;
        invalidate();
    }

    public void setVisibilityAlpha(float f9) {
        if (this.f32677i0 != f9) {
            this.f32677i0 = f9;
            super.setAlpha(this.f32678j0 * f9);
        }
    }
}
