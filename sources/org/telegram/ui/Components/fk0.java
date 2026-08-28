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
public final class fk0 extends View {
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
    public boolean f28464a;
    public kg.d f28465a0;
    public final RectF f28466b;
    public kg.d f28467b0;
    public final Paint f28468c;
    public final boolean f28469c0;
    public final Paint d;
    public int f28470d0;
    public float f28471e;
    public final m.i3 f28472e0;
    public float f28473f;
    public float f28474f0;
    public boolean f28475g0;
    public float h;
    public long f28476h0;
    public float f28477i0;
    public float f28478j0;
    public final wk0 f28479k0;
    public boolean f28480n;
    public StaticLayout f28481r;
    public StaticLayout f28482s;
    public StaticLayout v;
    public StaticLayout f28483w;
    public StaticLayout f28484x;
    public float f28485y;

    public fk0(wk0 wk0Var, Context context, int i9) {
        super(context);
        int i10;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.b6 b6Var = wk0Var.f34260l2;
        this.f28479k0 = wk0Var;
        this.f28464a = true;
        this.f28466b = new RectF();
        this.f28468c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        this.f28485y = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.D = textPaint;
        this.F = new Path();
        this.G = new Path();
        this.H = new float[8];
        this.S = new int[2];
        this.f28472e0 = new m.i3(this, 27);
        this.f28478j0 = 1.0f;
        this.N = i9;
        if (i9 == 0) {
            textPaint.setTextSize(AndroidUtilities.dp(45.0f));
            this.f28469c0 = LocaleController.isRTL;
        } else {
            this.f28469c0 = false;
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            int i11 = org.telegram.ui.ActionBar.f6.f23001d6;
            paint.setColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
            Drawable mutate = context.getDrawable(R.drawable.calendar_date).mutate();
            this.W = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.1f, org.telegram.ui.ActionBar.f6.v0(i11, b6Var), -1), PorterDuff.Mode.MULTIPLY));
        }
        for (int i12 = 0; i12 < 8; i12++) {
            this.H[i12] = AndroidUtilities.dp(44.0f);
        }
        if (this.f28469c0) {
            f10 = 10.0f;
        } else {
            if (i9 == 0) {
                i10 = 132;
            } else {
                i10 = 240;
            }
            f10 = i10 - 15;
        }
        int dp = AndroidUtilities.dp(f10);
        this.M = dp;
        if (wk0Var.b1()) {
            if (this.f28469c0) {
                f11 = -4.0f;
            } else {
                f11 = 6.0f;
            }
            this.M = AndroidUtilities.dp(f11) + dp;
        }
        c();
        setFocusableInTouchMode(true);
        this.U = ViewConfiguration.get(context).getScaledTouchSlop();
        this.V = context.getDrawable(R.drawable.fast_scroll_shadow);
    }

    public final void a(boolean z10) {
        wk0 wk0Var = this.f28479k0;
        f2.z0 layoutManager = wk0Var.getLayoutManager();
        if (layoutManager instanceof f2.m0) {
            f2.m0 m0Var = (f2.m0) layoutManager;
            boolean z11 = true;
            if (m0Var.f5432o == 1) {
                f2.r0 adapter = wk0Var.getAdapter();
                if (adapter instanceof gk0) {
                    gk0 gk0Var = (gk0) adapter;
                    float f10 = this.f28471e;
                    int[] iArr = this.S;
                    gk0Var.G(wk0Var, f10, iArr);
                    if (z10) {
                        m0Var.h1(iArr[0], (-iArr[1]) + wk0Var.f34273s1);
                    }
                    String F = gk0Var.F(iArr[0]);
                    if (F == null) {
                        StaticLayout staticLayout = this.f28481r;
                        if (staticLayout != null) {
                            this.f28482s = staticLayout;
                        }
                        this.f28481r = null;
                    } else if (!F.equals(this.E)) {
                        this.E = F;
                        int i9 = this.N;
                        TextPaint textPaint = this.D;
                        if (i9 == 0) {
                            this.f28481r = new StaticLayout(F, textPaint, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        } else {
                            this.v = this.f28481r;
                            int measureText = ((int) textPaint.measureText(F)) + 1;
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                            this.f28481r = new StaticLayout(F, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                            if (this.v != null) {
                                String[] split = F.split(" ");
                                String[] split2 = this.v.getText().toString().split(" ");
                                if (split != null && split2 != null && split.length == 2 && split2.length == 2 && split[1].equals(split2[1])) {
                                    String charSequence = this.v.getText().toString();
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                    spannableStringBuilder.setSpan(new xy(false), split2[0].length(), charSequence.length(), 0);
                                    this.v = new StaticLayout(spannableStringBuilder, textPaint, ((int) textPaint.measureText(charSequence)) + 1, alignment, 1.0f, 0.0f, false);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(F);
                                    spannableStringBuilder2.setSpan(new xy(false), split[0].length(), F.length(), 0);
                                    this.f28483w = new StaticLayout(spannableStringBuilder2, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(F);
                                    spannableStringBuilder3.setSpan(new xy(false), 0, split[0].length(), 0);
                                    this.f28484x = new StaticLayout(spannableStringBuilder3, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                                } else {
                                    this.f28483w = this.f28481r;
                                    this.f28484x = null;
                                }
                                this.C = this.v.getWidth();
                                this.f28485y = 0.0f;
                                if (getProgress() <= this.B) {
                                    z11 = false;
                                }
                                this.A = z11;
                            }
                            this.B = getProgress();
                        }
                        this.f28482s = null;
                        if (this.f28481r.getLineCount() > 0) {
                            this.f28481r.getLineWidth(0);
                            this.f28481r.getLineLeft(0);
                            if (this.f28469c0) {
                                this.I = (((AndroidUtilities.dp(88.0f) - this.f28481r.getLineWidth(0)) / 2.0f) + AndroidUtilities.dp(10.0f)) - this.f28481r.getLineLeft(0);
                            } else {
                                this.I = ((AndroidUtilities.dp(88.0f) - this.f28481r.getLineWidth(0)) / 2.0f) - this.f28481r.getLineLeft(0);
                            }
                            this.J = (AndroidUtilities.dp(88.0f) - this.f28481r.getHeight()) / 2;
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
        m.i3 i3Var = this.f28472e0;
        AndroidUtilities.cancelRunOnUIThread(i3Var);
        AndroidUtilities.runOnUIThread(i3Var, 2000L);
    }

    public final void c() {
        int k10;
        wk0 wk0Var = this.f28479k0;
        int i9 = this.N;
        if (i9 == 0) {
            k10 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23163m7, wk0Var.f34260l2);
        } else {
            k10 = i0.a.k(-16777216, 102);
        }
        this.O = k10;
        this.P = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23145l7, wk0Var.f34260l2);
        this.f28468c.setColor(this.O);
        TextPaint textPaint = this.D;
        if (i9 == 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23180n7, wk0Var.f34260l2));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, wk0Var.f34260l2));
        }
        invalidate();
    }

    @Override
    public float getAlpha() {
        return this.f28478j0;
    }

    public float getProgress() {
        return this.f28471e;
    }

    public int getScrollBarY() {
        return AndroidUtilities.dp(17.0f) + ((int) Math.ceil((getMeasuredHeight() - AndroidUtilities.dp(54.0f)) * this.f28471e));
    }

    @Override
    public final boolean isPressed() {
        return this.f28480n;
    }

    @Override
    public final void layout(int i9, int i10, int i11, int i12) {
        if (!this.f28479k0.F1) {
            return;
        }
        super.layout(i9, i10, i11, i12);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i9;
        float f10;
        float f11;
        float f12;
        char c10;
        float f13;
        float f14;
        int i10;
        int i11;
        float f15;
        float dp;
        float dp2;
        float f16;
        float f17;
        if (this.f28464a) {
            i9 = getPaddingTop();
        } else {
            i9 = 0;
        }
        int ceil = i9 + ((int) Math.ceil(((getMeasuredHeight() - i9) - AndroidUtilities.dp(54.0f)) * this.f28471e));
        int i12 = this.M;
        float f18 = i12;
        RectF rectF = this.f28466b;
        rectF.set(f18, AndroidUtilities.dp(12.0f) + ceil, AndroidUtilities.dp(5.0f) + i12, AndroidUtilities.dp(42.0f) + ceil);
        int i13 = this.N;
        Paint paint = this.f28468c;
        if (i13 == 0) {
            f10 = 12.0f;
            f11 = 36.0f;
            paint.setColor(i0.a.d(this.K, this.O, this.P));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint);
            f12 = 8.0f;
            c10 = 2;
            f13 = 24.0f;
            f14 = 4.0f;
        } else {
            f10 = 12.0f;
            f11 = 36.0f;
            int i14 = org.telegram.ui.ActionBar.f6.f23001d6;
            wk0 wk0Var = this.f28479k0;
            f12 = 8.0f;
            paint.setColor(i0.a.d(0.1f, org.telegram.ui.ActionBar.f6.v0(i14, wk0Var.f34260l2), -1));
            float dp3 = AndroidUtilities.dp(27.0f) + ceil;
            kg.d dVar = this.f28465a0;
            if (dVar != null) {
                c10 = 2;
                f13 = 24.0f;
                dVar.setBounds(AndroidUtilities.dp(-20.0f) + i12, AndroidUtilities.dp(-1.0f) + ceil, AndroidUtilities.dp(36.0f) + i12, AndroidUtilities.dp(55.0f) + ceil);
                this.f28465a0.draw(canvas);
                f14 = 4.0f;
            } else {
                c10 = 2;
                f13 = 24.0f;
                int measuredWidth = getMeasuredWidth();
                Drawable drawable = this.V;
                f14 = 4.0f;
                drawable.setBounds(measuredWidth - drawable.getIntrinsicWidth(), (int) (dp3 - (drawable.getIntrinsicHeight() / 2)), getMeasuredWidth(), (int) (dp3 + (drawable.getIntrinsicHeight() / 2)));
                drawable.draw(canvas);
                canvas.drawCircle(AndroidUtilities.dp(8.0f) + i12, AndroidUtilities.dp(27.0f) + ceil, AndroidUtilities.dp(24.0f), paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, wk0Var.f34260l2));
            canvas.save();
            canvas.translate(AndroidUtilities.dp(f14) + i12, (AndroidUtilities.dp(2.0f) * this.K) + AndroidUtilities.dp(34.0f) + ceil);
            Path path = this.G;
            canvas.drawPath(path, paint);
            canvas.restore();
            canvas.save();
            canvas.translate(AndroidUtilities.dp(f14) + i12, (AndroidUtilities.dp(f13) + ceil) - (AndroidUtilities.dp(2.0f) * this.K));
            canvas.rotate(180.0f, 0.0f, -AndroidUtilities.dp(2.0f));
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        if (i13 == 0) {
            if (this.f28475g0 || this.K != 0.0f) {
                paint.setAlpha((int) (this.K * 255.0f));
                int dp4 = AndroidUtilities.dp(30.0f) + ceil;
                int dp5 = ceil - AndroidUtilities.dp(46.0f);
                if (dp5 <= AndroidUtilities.dp(f10)) {
                    f15 = AndroidUtilities.dp(f10) - dp5;
                    dp5 = AndroidUtilities.dp(f10);
                } else {
                    f15 = 0.0f;
                }
                canvas.translate(AndroidUtilities.dp(10.0f), dp5);
                if (f15 <= AndroidUtilities.dp(29.0f)) {
                    dp = AndroidUtilities.dp(44.0f);
                    dp2 = ((f15 / AndroidUtilities.dp(29.0f)) * AndroidUtilities.dp(40.0f)) + AndroidUtilities.dp(f14);
                } else {
                    dp = ((1.0f - ((f15 - AndroidUtilities.dp(29.0f)) / AndroidUtilities.dp(29.0f))) * AndroidUtilities.dp(40.0f)) + AndroidUtilities.dp(f14);
                    dp2 = AndroidUtilities.dp(44.0f);
                }
                boolean z10 = this.f28469c0;
                Path path2 = this.F;
                float[] fArr = this.H;
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
                        f16 = AndroidUtilities.dp(10.0f);
                    } else {
                        f16 = 0.0f;
                    }
                    if (z10) {
                        f17 = 98.0f;
                    } else {
                        f17 = 88.0f;
                    }
                    rectF.set(f16, 0.0f, AndroidUtilities.dp(f17), AndroidUtilities.dp(88.0f));
                    path2.addRoundRect(rectF, fArr, Path.Direction.CW);
                    path2.close();
                }
                StaticLayout staticLayout = this.f28481r;
                if (staticLayout == null) {
                    staticLayout = this.f28482s;
                }
                if (staticLayout != null) {
                    canvas.save();
                    float f19 = this.K;
                    canvas.scale(f19, f19, f18, dp4 - dp5);
                    canvas.drawPath(path2, paint);
                    canvas.translate(this.I, this.J);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
            }
        } else if (i13 == 1 && this.f28481r != null && this.R != 0.0f) {
            canvas.save();
            float f20 = (this.R * 0.3f) + 0.7f;
            canvas.scale(f20, f20, rectF.right - AndroidUtilities.dp(f10), rectF.centerY());
            float centerY = rectF.centerY();
            float dp6 = (rectF.left - (AndroidUtilities.dp(30.0f) * this.K)) - AndroidUtilities.dp(f12);
            this.f28481r.getHeight();
            AndroidUtilities.dp(6.0f);
            rectF.set((dp6 - (((1.0f - this.f28485y) * this.C) + (this.f28485y * this.f28481r.getWidth()))) - AndroidUtilities.dp(f11), (centerY - (this.f28481r.getHeight() / 2.0f)) - AndroidUtilities.dp(f12), dp6 - AndroidUtilities.dp(f10), (this.f28481r.getHeight() / 2.0f) + centerY + AndroidUtilities.dp(f12));
            Paint paint2 = this.d;
            int alpha = paint2.getAlpha();
            TextPaint textPaint = this.D;
            int alpha2 = textPaint.getAlpha();
            paint2.setAlpha((int) (alpha * this.R));
            if (this.f28467b0 != null) {
                Rect rect = AndroidUtilities.rectTmp2;
                rectF.round(rect);
                rect.inset(-AndroidUtilities.dp(f14), -AndroidUtilities.dp(f14));
                this.f28467b0.setBounds(rect);
                this.f28467b0.draw(canvas);
            } else {
                Drawable drawable2 = this.W;
                drawable2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                drawable2.setAlpha((int) (this.R * 255.0f));
                drawable2.draw(canvas);
            }
            float f21 = this.f28485y;
            if (f21 != 1.0f) {
                float f22 = f21 + 0.10666667f;
                this.f28485y = f22;
                if (f22 > 1.0f) {
                    this.f28485y = 1.0f;
                } else {
                    invalidate();
                }
            }
            if (this.f28485y != 1.0f) {
                canvas.save();
                rectF.inset(AndroidUtilities.dp(f14), AndroidUtilities.dp(2.0f));
                canvas.clipRect(rectF);
                if (this.v != null) {
                    textPaint.setAlpha((int) ((1.0f - this.f28485y) * alpha2 * this.R));
                    canvas.save();
                    float width = (dp6 - this.v.getWidth()) - AndroidUtilities.dp(f13);
                    float height = centerY - (this.v.getHeight() / 2.0f);
                    if (this.A) {
                        i11 = -1;
                    } else {
                        i11 = 1;
                    }
                    canvas.translate(width, (AndroidUtilities.dp(15.0f) * i11 * this.f28485y) + height);
                    this.v.draw(canvas);
                    canvas.restore();
                }
                if (this.f28483w != null) {
                    textPaint.setAlpha((int) (alpha2 * this.R * this.f28485y));
                    canvas.save();
                    float width2 = (dp6 - this.f28483w.getWidth()) - AndroidUtilities.dp(f13);
                    float height2 = centerY - (this.f28483w.getHeight() / 2.0f);
                    if (this.A) {
                        i10 = 1;
                    } else {
                        i10 = -1;
                    }
                    canvas.translate(width2, e2.c.z(1.0f, this.f28485y, AndroidUtilities.dp(15.0f) * i10, height2));
                    this.f28483w.draw(canvas);
                    canvas.restore();
                }
                if (this.f28484x != null) {
                    textPaint.setAlpha((int) (alpha2 * this.R));
                    canvas.save();
                    canvas.translate((dp6 - this.f28484x.getWidth()) - AndroidUtilities.dp(f13), centerY - (this.f28484x.getHeight() / 2.0f));
                    this.f28484x.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            } else {
                textPaint.setAlpha((int) (alpha2 * this.R));
                canvas.save();
                canvas.translate((dp6 - this.f28481r.getWidth()) - AndroidUtilities.dp(f13), e2.c.z(1.0f, this.f28485y, AndroidUtilities.dp(15.0f), centerY - (this.f28481r.getHeight() / 2.0f)));
                this.f28481r.draw(canvas);
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
        boolean z11 = this.f28475g0;
        if ((z11 && this.f28481r != null && this.K < 1.0f) || ((!z11 || this.f28481r == null) && this.K > 0.0f)) {
            this.L = currentTimeMillis;
            invalidate();
            if (this.f28475g0 && this.f28481r != null) {
                float f23 = (((float) j10) / 120.0f) + this.K;
                this.K = f23;
                if (f23 > 1.0f) {
                    this.K = 1.0f;
                }
            } else {
                float f24 = this.K - (((float) j10) / 120.0f);
                this.K = f24;
                if (f24 < 0.0f) {
                    this.K = 0.0f;
                }
            }
        }
        boolean z12 = this.Q;
        if (z12) {
            float f25 = this.R;
            if (f25 != 1.0f) {
                float f26 = (((float) j10) / 120.0f) + f25;
                this.R = f26;
                if (f26 > 1.0f) {
                    this.R = 1.0f;
                }
                invalidate();
                return;
            }
        }
        if (!z12) {
            float f27 = this.R;
            if (f27 != 0.0f) {
                float f28 = f27 - (((float) j10) / 120.0f);
                this.R = f28;
                if (f28 < 0.0f) {
                    this.R = 0.0f;
                }
                invalidate();
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        if (this.N == 0) {
            f10 = 132.0f;
        } else {
            f10 = 240.0f;
        }
        setMeasuredDimension(AndroidUtilities.dp(f10), View.MeasureSpec.getSize(i10));
        Path path = this.G;
        path.reset();
        path.setLastPoint(0.0f, 0.0f);
        path.lineTo(AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        path.lineTo(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        path.close();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fk0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setAlpha(float f10) {
        if (this.f28478j0 != f10) {
            this.f28478j0 = f10;
            super.setAlpha(f10 * this.f28477i0);
        }
    }

    public void setIsVisible(boolean z10) {
        float f10;
        if (this.T != z10) {
            this.T = z10;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f28477i0 = f10;
            super.setAlpha(this.f28478j0 * f10);
        }
    }

    public void setProgress(float f10) {
        this.f28471e = f10;
        invalidate();
    }

    public void setVisibilityAlpha(float f10) {
        if (this.f28477i0 != f10) {
            this.f28477i0 = f10;
            super.setAlpha(this.f28478j0 * f10);
        }
    }
}
