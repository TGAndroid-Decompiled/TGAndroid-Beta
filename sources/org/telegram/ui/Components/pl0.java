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
public final class pl0 extends View {
    public boolean E;
    public float F;
    public float G;
    public final TextPaint H;
    public String I;
    public final Path J;
    public final Path K;
    public final float[] L;
    public float M;
    public float N;
    public float O;
    public long P;
    public final int Q;
    public final int R;
    public int S;
    public int T;
    public boolean U;
    public float V;
    public final int[] W;
    public boolean f29335a;
    public boolean f29336a0;
    public final RectF f29337b;
    public final float f29338b0;
    public final Paint f29339c;
    public final Drawable f29340c0;
    public final Paint d;
    public final Drawable f29341d0;
    public float e;
    public dh.d f29342e0;
    public float f29343f;
    public dh.d f29344f0;
    public final boolean f29345g0;
    public float h;
    public int f29346h0;
    public final org.telegram.ui.Cells.k7 f29347i0;
    public float f29348j0;
    public boolean f29349k0;
    public long f29350l0;
    public float m0;
    public boolean f29351n;
    public float f29352n0;
    public final im0 f29353o0;
    public StaticLayout f29354r;
    public StaticLayout f29355s;
    public StaticLayout v;
    public StaticLayout f29356w;
    public StaticLayout f29357x;
    public float f29358y;

    public pl0(im0 im0Var, Context context, int i10) {
        super(context);
        int i11;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.d6 d6Var = im0Var.f27284n2;
        this.f29353o0 = im0Var;
        this.f29335a = true;
        this.f29337b = new RectF();
        this.f29339c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        this.f29358y = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.H = textPaint;
        this.J = new Path();
        this.K = new Path();
        this.L = new float[8];
        this.W = new int[2];
        this.f29347i0 = new org.telegram.ui.Cells.k7(this, 19);
        this.f29352n0 = 1.0f;
        this.R = i10;
        if (i10 == 0) {
            textPaint.setTextSize(AndroidUtilities.dp(45.0f));
            this.f29345g0 = LocaleController.isRTL;
        } else {
            this.f29345g0 = false;
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            int i12 = org.telegram.ui.ActionBar.h6.f20986d6;
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
            Drawable mutate = context.getDrawable(R.drawable.calendar_date).mutate();
            this.f29341d0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(i0.b.f(0.1f, org.telegram.ui.ActionBar.h6.w0(i12, d6Var), -1), PorterDuff.Mode.MULTIPLY));
        }
        for (int i13 = 0; i13 < 8; i13++) {
            this.L[i13] = AndroidUtilities.dp(44.0f);
        }
        if (this.f29345g0) {
            f7 = 10.0f;
        } else {
            if (i10 == 0) {
                i11 = 132;
            } else {
                i11 = 240;
            }
            f7 = i11 - 15;
        }
        int dp = AndroidUtilities.dp(f7);
        this.Q = dp;
        if (im0Var.b1()) {
            if (this.f29345g0) {
                f10 = -4.0f;
            } else {
                f10 = 6.0f;
            }
            this.Q = AndroidUtilities.dp(f10) + dp;
        }
        c();
        setFocusableInTouchMode(true);
        this.f29338b0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f29340c0 = context.getDrawable(R.drawable.fast_scroll_shadow);
    }

    public final void a(boolean z10) {
        im0 im0Var = this.f29353o0;
        s4.n0 layoutManager = im0Var.getLayoutManager();
        if (layoutManager instanceof s4.b0) {
            s4.b0 b0Var = (s4.b0) layoutManager;
            boolean z11 = true;
            if (b0Var.f45926o == 1) {
                s4.g0 adapter = im0Var.getAdapter();
                if (adapter instanceof ql0) {
                    ql0 ql0Var = (ql0) adapter;
                    float f7 = this.e;
                    int[] iArr = this.W;
                    ql0Var.G(im0Var, f7, iArr);
                    if (z10) {
                        b0Var.h1(iArr[0], (-iArr[1]) + im0Var.f27297u1);
                    }
                    String F = ql0Var.F(iArr[0]);
                    if (F == null) {
                        StaticLayout staticLayout = this.f29354r;
                        if (staticLayout != null) {
                            this.f29355s = staticLayout;
                        }
                        this.f29354r = null;
                    } else if (!F.equals(this.I)) {
                        this.I = F;
                        int i10 = this.R;
                        TextPaint textPaint = this.H;
                        if (i10 == 0) {
                            this.f29354r = new StaticLayout(F, textPaint, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        } else {
                            this.v = this.f29354r;
                            int measureText = ((int) textPaint.measureText(F)) + 1;
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                            this.f29354r = new StaticLayout(F, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                            if (this.v != null) {
                                String[] split = F.split(" ");
                                String[] split2 = this.v.getText().toString().split(" ");
                                if (split != null && split2 != null && split.length == 2 && split2.length == 2 && split[1].equals(split2[1])) {
                                    String charSequence = this.v.getText().toString();
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                    spannableStringBuilder.setSpan(new uz(false), split2[0].length(), charSequence.length(), 0);
                                    this.v = new StaticLayout(spannableStringBuilder, textPaint, ((int) textPaint.measureText(charSequence)) + 1, alignment, 1.0f, 0.0f, false);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(F);
                                    spannableStringBuilder2.setSpan(new uz(false), split[0].length(), F.length(), 0);
                                    this.f29356w = new StaticLayout(spannableStringBuilder2, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(F);
                                    spannableStringBuilder3.setSpan(new uz(false), 0, split[0].length(), 0);
                                    this.f29357x = new StaticLayout(spannableStringBuilder3, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                                } else {
                                    this.f29356w = this.f29354r;
                                    this.f29357x = null;
                                }
                                this.G = this.v.getWidth();
                                this.f29358y = 0.0f;
                                if (getProgress() <= this.F) {
                                    z11 = false;
                                }
                                this.E = z11;
                            }
                            this.F = getProgress();
                        }
                        this.f29355s = null;
                        if (this.f29354r.getLineCount() > 0) {
                            this.f29354r.getLineWidth(0);
                            this.f29354r.getLineLeft(0);
                            if (this.f29345g0) {
                                this.M = (((AndroidUtilities.dp(88.0f) - this.f29354r.getLineWidth(0)) / 2.0f) + AndroidUtilities.dp(10.0f)) - this.f29354r.getLineLeft(0);
                            } else {
                                this.M = ((AndroidUtilities.dp(88.0f) - this.f29354r.getLineWidth(0)) / 2.0f) - this.f29354r.getLineLeft(0);
                            }
                            this.N = (AndroidUtilities.dp(88.0f) - this.f29354r.getHeight()) / 2;
                        }
                    }
                }
            }
        }
    }

    public final void b() {
        if (this.R != 1) {
            return;
        }
        if (!this.U) {
            this.U = true;
            invalidate();
        }
        org.telegram.ui.Cells.k7 k7Var = this.f29347i0;
        AndroidUtilities.cancelRunOnUIThread(k7Var);
        AndroidUtilities.runOnUIThread(k7Var, 2000L);
    }

    public final void c() {
        int o10;
        im0 im0Var = this.f29353o0;
        int i10 = this.R;
        if (i10 == 0) {
            o10 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21150m7, im0Var.f27284n2);
        } else {
            o10 = i0.b.o(-16777216, 102);
        }
        this.S = o10;
        this.T = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21131l7, im0Var.f27284n2);
        this.f29339c.setColor(this.S);
        TextPaint textPaint = this.H;
        if (i10 == 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21170n7, im0Var.f27284n2));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, im0Var.f27284n2));
        }
        invalidate();
    }

    @Override
    public float getAlpha() {
        return this.f29352n0;
    }

    public float getProgress() {
        return this.e;
    }

    public int getScrollBarY() {
        return AndroidUtilities.dp(17.0f) + ((int) Math.ceil((getMeasuredHeight() - AndroidUtilities.dp(54.0f)) * this.e));
    }

    @Override
    public final boolean isPressed() {
        return this.f29351n;
    }

    @Override
    public final void layout(int i10, int i11, int i12, int i13) {
        if (!this.f29353o0.H1) {
            return;
        }
        super.layout(i10, i11, i12, i13);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        float f10;
        float f11;
        char c10;
        float f12;
        float f13;
        int i11;
        int i12;
        float f14;
        float dp;
        float dp2;
        float f15;
        float f16;
        if (this.f29335a) {
            i10 = getPaddingTop();
        } else {
            i10 = 0;
        }
        int ceil = i10 + ((int) Math.ceil(((getMeasuredHeight() - i10) - AndroidUtilities.dp(54.0f)) * this.e));
        int i13 = this.Q;
        float f17 = i13;
        RectF rectF = this.f29337b;
        rectF.set(f17, AndroidUtilities.dp(12.0f) + ceil, AndroidUtilities.dp(5.0f) + i13, AndroidUtilities.dp(42.0f) + ceil);
        int i14 = this.R;
        Paint paint = this.f29339c;
        if (i14 == 0) {
            f7 = 12.0f;
            f10 = 36.0f;
            paint.setColor(i0.b.f(this.O, this.S, this.T));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint);
            f11 = 8.0f;
            c10 = 2;
            f12 = 24.0f;
            f13 = 4.0f;
        } else {
            f7 = 12.0f;
            f10 = 36.0f;
            int i15 = org.telegram.ui.ActionBar.h6.f20986d6;
            im0 im0Var = this.f29353o0;
            f11 = 8.0f;
            paint.setColor(i0.b.f(0.1f, org.telegram.ui.ActionBar.h6.w0(i15, im0Var.f27284n2), -1));
            float dp3 = AndroidUtilities.dp(27.0f) + ceil;
            dh.d dVar = this.f29342e0;
            if (dVar != null) {
                c10 = 2;
                f12 = 24.0f;
                dVar.setBounds(AndroidUtilities.dp(-20.0f) + i13, AndroidUtilities.dp(-1.0f) + ceil, AndroidUtilities.dp(36.0f) + i13, AndroidUtilities.dp(55.0f) + ceil);
                this.f29342e0.draw(canvas);
                f13 = 4.0f;
            } else {
                c10 = 2;
                f12 = 24.0f;
                int measuredWidth = getMeasuredWidth();
                Drawable drawable = this.f29340c0;
                f13 = 4.0f;
                drawable.setBounds(measuredWidth - drawable.getIntrinsicWidth(), (int) (dp3 - (drawable.getIntrinsicHeight() / 2)), getMeasuredWidth(), (int) (dp3 + (drawable.getIntrinsicHeight() / 2)));
                drawable.draw(canvas);
                canvas.drawCircle(AndroidUtilities.dp(8.0f) + i13, AndroidUtilities.dp(27.0f) + ceil, AndroidUtilities.dp(24.0f), paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, im0Var.f27284n2));
            canvas.save();
            canvas.translate(AndroidUtilities.dp(f13) + i13, (AndroidUtilities.dp(2.0f) * this.O) + AndroidUtilities.dp(34.0f) + ceil);
            Path path = this.K;
            canvas.drawPath(path, paint);
            canvas.restore();
            canvas.save();
            canvas.translate(AndroidUtilities.dp(f13) + i13, (AndroidUtilities.dp(f12) + ceil) - (AndroidUtilities.dp(2.0f) * this.O));
            canvas.rotate(180.0f, 0.0f, -AndroidUtilities.dp(2.0f));
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        if (i14 == 0) {
            if (this.f29349k0 || this.O != 0.0f) {
                paint.setAlpha((int) (this.O * 255.0f));
                int dp4 = AndroidUtilities.dp(30.0f) + ceil;
                int dp5 = ceil - AndroidUtilities.dp(46.0f);
                if (dp5 <= AndroidUtilities.dp(f7)) {
                    f14 = AndroidUtilities.dp(f7) - dp5;
                    dp5 = AndroidUtilities.dp(f7);
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
                boolean z10 = this.f29345g0;
                Path path2 = this.J;
                float[] fArr = this.L;
                if ((z10 && (fArr[0] != dp || fArr[6] != dp2)) || (!z10 && (fArr[c10] != dp || fArr[4] != dp2))) {
                    if (z10) {
                        fArr[1] = dp;
                        fArr[0] = dp;
                        fArr[7] = dp2;
                        fArr[6] = dp2;
                    } else {
                        fArr[3] = dp;
                        fArr[c10] = dp;
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
                StaticLayout staticLayout = this.f29354r;
                if (staticLayout == null) {
                    staticLayout = this.f29355s;
                }
                if (staticLayout != null) {
                    canvas.save();
                    float f18 = this.O;
                    canvas.scale(f18, f18, f17, dp4 - dp5);
                    canvas.drawPath(path2, paint);
                    canvas.translate(this.M, this.N);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
            }
        } else if (i14 == 1 && this.f29354r != null && this.V != 0.0f) {
            canvas.save();
            float f19 = (this.V * 0.3f) + 0.7f;
            canvas.scale(f19, f19, rectF.right - AndroidUtilities.dp(f7), rectF.centerY());
            float centerY = rectF.centerY();
            float dp6 = (rectF.left - (AndroidUtilities.dp(30.0f) * this.O)) - AndroidUtilities.dp(f11);
            this.f29354r.getHeight();
            AndroidUtilities.dp(6.0f);
            rectF.set((dp6 - (((1.0f - this.f29358y) * this.G) + (this.f29358y * this.f29354r.getWidth()))) - AndroidUtilities.dp(f10), (centerY - (this.f29354r.getHeight() / 2.0f)) - AndroidUtilities.dp(f11), dp6 - AndroidUtilities.dp(f7), (this.f29354r.getHeight() / 2.0f) + centerY + AndroidUtilities.dp(f11));
            Paint paint2 = this.d;
            int alpha = paint2.getAlpha();
            TextPaint textPaint = this.H;
            int alpha2 = textPaint.getAlpha();
            paint2.setAlpha((int) (alpha * this.V));
            if (this.f29344f0 != null) {
                Rect rect = AndroidUtilities.rectTmp2;
                rectF.round(rect);
                rect.inset(-AndroidUtilities.dp(f13), -AndroidUtilities.dp(f13));
                this.f29344f0.setBounds(rect);
                this.f29344f0.draw(canvas);
            } else {
                Drawable drawable2 = this.f29341d0;
                drawable2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                drawable2.setAlpha((int) (this.V * 255.0f));
                drawable2.draw(canvas);
            }
            float f20 = this.f29358y;
            if (f20 != 1.0f) {
                float f21 = f20 + 0.10666667f;
                this.f29358y = f21;
                if (f21 > 1.0f) {
                    this.f29358y = 1.0f;
                } else {
                    invalidate();
                }
            }
            if (this.f29358y != 1.0f) {
                canvas.save();
                rectF.inset(AndroidUtilities.dp(f13), AndroidUtilities.dp(2.0f));
                canvas.clipRect(rectF);
                if (this.v != null) {
                    textPaint.setAlpha((int) ((1.0f - this.f29358y) * alpha2 * this.V));
                    canvas.save();
                    float width = (dp6 - this.v.getWidth()) - AndroidUtilities.dp(f12);
                    float height = centerY - (this.v.getHeight() / 2.0f);
                    if (this.E) {
                        i12 = -1;
                    } else {
                        i12 = 1;
                    }
                    canvas.translate(width, (AndroidUtilities.dp(15.0f) * i12 * this.f29358y) + height);
                    this.v.draw(canvas);
                    canvas.restore();
                }
                if (this.f29356w != null) {
                    textPaint.setAlpha((int) (alpha2 * this.V * this.f29358y));
                    canvas.save();
                    float width2 = (dp6 - this.f29356w.getWidth()) - AndroidUtilities.dp(f12);
                    float height2 = centerY - (this.f29356w.getHeight() / 2.0f);
                    if (this.E) {
                        i11 = 1;
                    } else {
                        i11 = -1;
                    }
                    canvas.translate(width2, com.google.android.gms.internal.cast.a6.x(1.0f, this.f29358y, AndroidUtilities.dp(15.0f) * i11, height2));
                    this.f29356w.draw(canvas);
                    canvas.restore();
                }
                if (this.f29357x != null) {
                    textPaint.setAlpha((int) (alpha2 * this.V));
                    canvas.save();
                    canvas.translate((dp6 - this.f29357x.getWidth()) - AndroidUtilities.dp(f12), centerY - (this.f29357x.getHeight() / 2.0f));
                    this.f29357x.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            } else {
                textPaint.setAlpha((int) (alpha2 * this.V));
                canvas.save();
                canvas.translate((dp6 - this.f29354r.getWidth()) - AndroidUtilities.dp(f12), com.google.android.gms.internal.cast.a6.x(1.0f, this.f29358y, AndroidUtilities.dp(15.0f), centerY - (this.f29354r.getHeight() / 2.0f)));
                this.f29354r.draw(canvas);
                canvas.restore();
            }
            paint2.setAlpha(alpha);
            textPaint.setAlpha(alpha2);
            canvas.restore();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.P;
        if (j10 < 0 || j10 > 17) {
            j10 = 17;
        }
        boolean z11 = this.f29349k0;
        if ((z11 && this.f29354r != null && this.O < 1.0f) || ((!z11 || this.f29354r == null) && this.O > 0.0f)) {
            this.P = currentTimeMillis;
            invalidate();
            if (this.f29349k0 && this.f29354r != null) {
                float f22 = (((float) j10) / 120.0f) + this.O;
                this.O = f22;
                if (f22 > 1.0f) {
                    this.O = 1.0f;
                }
            } else {
                float f23 = this.O - (((float) j10) / 120.0f);
                this.O = f23;
                if (f23 < 0.0f) {
                    this.O = 0.0f;
                }
            }
        }
        boolean z12 = this.U;
        if (z12) {
            float f24 = this.V;
            if (f24 != 1.0f) {
                float f25 = (((float) j10) / 120.0f) + f24;
                this.V = f25;
                if (f25 > 1.0f) {
                    this.V = 1.0f;
                }
                invalidate();
                return;
            }
        }
        if (!z12) {
            float f26 = this.V;
            if (f26 != 0.0f) {
                float f27 = f26 - (((float) j10) / 120.0f);
                this.V = f27;
                if (f27 < 0.0f) {
                    this.V = 0.0f;
                }
                invalidate();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        if (this.R == 0) {
            f7 = 132.0f;
        } else {
            f7 = 240.0f;
        }
        setMeasuredDimension(AndroidUtilities.dp(f7), View.MeasureSpec.getSize(i11));
        Path path = this.K;
        path.reset();
        path.setLastPoint(0.0f, 0.0f);
        path.lineTo(AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        path.lineTo(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        path.close();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pl0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setAlpha(float f7) {
        if (this.f29352n0 != f7) {
            this.f29352n0 = f7;
            super.setAlpha(f7 * this.m0);
        }
    }

    public void setIsVisible(boolean z10) {
        float f7;
        if (this.f29336a0 != z10) {
            this.f29336a0 = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.m0 = f7;
            super.setAlpha(this.f29352n0 * f7);
        }
    }

    public void setProgress(float f7) {
        this.e = f7;
        invalidate();
    }

    public void setVisibilityAlpha(float f7) {
        if (this.m0 != f7) {
            this.m0 = f7;
            super.setAlpha(this.f29352n0 * f7);
        }
    }
}
