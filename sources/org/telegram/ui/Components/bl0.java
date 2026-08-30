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
public final class bl0 extends View {
    public boolean B;
    public float C;
    public float D;
    public final TextPaint E;
    public String F;
    public final Path G;
    public final Path H;
    public final float[] I;
    public float J;
    public float K;
    public float L;
    public long M;
    public final int N;
    public final int O;
    public int P;
    public int Q;
    public boolean R;
    public float S;
    public final int[] T;
    public boolean U;
    public final float V;
    public final Drawable W;
    public boolean f23697a;
    public final Drawable f23698a0;
    public final RectF f23699b;
    public pg.b f23700b0;
    public final Paint f23701c;
    public pg.b f23702c0;
    public final Paint d;
    public final boolean f23703d0;
    public float e;
    public int f23704e0;
    public float f23705f;
    public final m2.b f23706f0;
    public float f23707g0;
    public float h;
    public boolean f23708h0;
    public long f23709i0;
    public float f23710j0;
    public float f23711k0;
    public final sl0 f23712l0;
    public boolean f23713n;
    public StaticLayout f23714r;
    public StaticLayout f23715s;
    public StaticLayout v;
    public StaticLayout f23716w;
    public StaticLayout f23717x;
    public float f23718y;

    public bl0(sl0 sl0Var, Context context, int i10) {
        super(context);
        int i11;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.f6 f6Var = sl0Var.f28750m2;
        this.f23712l0 = sl0Var;
        this.f23697a = true;
        this.f23699b = new RectF();
        this.f23701c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        this.f23718y = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        this.G = new Path();
        this.H = new Path();
        this.I = new float[8];
        this.T = new int[2];
        this.f23706f0 = new m2.b(this, 29);
        this.f23711k0 = 1.0f;
        this.O = i10;
        if (i10 == 0) {
            textPaint.setTextSize(AndroidUtilities.dp(45.0f));
            this.f23703d0 = LocaleController.isRTL;
        } else {
            this.f23703d0 = false;
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            int i12 = org.telegram.ui.ActionBar.j6.f19906d6;
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
            Drawable mutate = context.getDrawable(R.drawable.calendar_date).mutate();
            this.f23698a0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.1f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var), -1), PorterDuff.Mode.MULTIPLY));
        }
        for (int i13 = 0; i13 < 8; i13++) {
            this.I[i13] = AndroidUtilities.dp(44.0f);
        }
        if (this.f23703d0) {
            f10 = 10.0f;
        } else {
            if (i10 == 0) {
                i11 = 132;
            } else {
                i11 = 240;
            }
            f10 = i11 - 15;
        }
        int dp = AndroidUtilities.dp(f10);
        this.N = dp;
        if (sl0Var.b1()) {
            if (this.f23703d0) {
                f11 = -4.0f;
            } else {
                f11 = 6.0f;
            }
            this.N = AndroidUtilities.dp(f11) + dp;
        }
        c();
        setFocusableInTouchMode(true);
        this.V = ViewConfiguration.get(context).getScaledTouchSlop();
        this.W = context.getDrawable(R.drawable.fast_scroll_shadow);
    }

    public final void a(boolean z4) {
        sl0 sl0Var = this.f23712l0;
        f2.v0 layoutManager = sl0Var.getLayoutManager();
        if (layoutManager instanceof f2.i0) {
            f2.i0 i0Var = (f2.i0) layoutManager;
            boolean z10 = true;
            if (i0Var.f5731o == 1) {
                f2.o0 adapter = sl0Var.getAdapter();
                if (adapter instanceof cl0) {
                    cl0 cl0Var = (cl0) adapter;
                    float f10 = this.e;
                    int[] iArr = this.T;
                    cl0Var.G(sl0Var, f10, iArr);
                    if (z4) {
                        i0Var.h1(iArr[0], (-iArr[1]) + sl0Var.f28763t1);
                    }
                    String F = cl0Var.F(iArr[0]);
                    if (F == null) {
                        StaticLayout staticLayout = this.f23714r;
                        if (staticLayout != null) {
                            this.f23715s = staticLayout;
                        }
                        this.f23714r = null;
                    } else if (!F.equals(this.F)) {
                        this.F = F;
                        int i10 = this.O;
                        TextPaint textPaint = this.E;
                        if (i10 == 0) {
                            this.f23714r = new StaticLayout(F, textPaint, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        } else {
                            this.v = this.f23714r;
                            int measureText = ((int) textPaint.measureText(F)) + 1;
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                            this.f23714r = new StaticLayout(F, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                            if (this.v != null) {
                                String[] split = F.split(" ");
                                String[] split2 = this.v.getText().toString().split(" ");
                                if (split != null && split2 != null && split.length == 2 && split2.length == 2 && split[1].equals(split2[1])) {
                                    String charSequence = this.v.getText().toString();
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                    spannableStringBuilder.setSpan(new lz(false), split2[0].length(), charSequence.length(), 0);
                                    this.v = new StaticLayout(spannableStringBuilder, textPaint, ((int) textPaint.measureText(charSequence)) + 1, alignment, 1.0f, 0.0f, false);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(F);
                                    spannableStringBuilder2.setSpan(new lz(false), split[0].length(), F.length(), 0);
                                    this.f23716w = new StaticLayout(spannableStringBuilder2, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(F);
                                    spannableStringBuilder3.setSpan(new lz(false), 0, split[0].length(), 0);
                                    this.f23717x = new StaticLayout(spannableStringBuilder3, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                                } else {
                                    this.f23716w = this.f23714r;
                                    this.f23717x = null;
                                }
                                this.D = this.v.getWidth();
                                this.f23718y = 0.0f;
                                if (getProgress() <= this.C) {
                                    z10 = false;
                                }
                                this.B = z10;
                            }
                            this.C = getProgress();
                        }
                        this.f23715s = null;
                        if (this.f23714r.getLineCount() > 0) {
                            this.f23714r.getLineWidth(0);
                            this.f23714r.getLineLeft(0);
                            if (this.f23703d0) {
                                this.J = (((AndroidUtilities.dp(88.0f) - this.f23714r.getLineWidth(0)) / 2.0f) + AndroidUtilities.dp(10.0f)) - this.f23714r.getLineLeft(0);
                            } else {
                                this.J = ((AndroidUtilities.dp(88.0f) - this.f23714r.getLineWidth(0)) / 2.0f) - this.f23714r.getLineLeft(0);
                            }
                            this.K = (AndroidUtilities.dp(88.0f) - this.f23714r.getHeight()) / 2;
                        }
                    }
                }
            }
        }
    }

    public final void b() {
        if (this.O != 1) {
            return;
        }
        if (!this.R) {
            this.R = true;
            invalidate();
        }
        m2.b bVar = this.f23706f0;
        AndroidUtilities.cancelRunOnUIThread(bVar);
        AndroidUtilities.runOnUIThread(bVar, 2000L);
    }

    public final void c() {
        int k10;
        sl0 sl0Var = this.f23712l0;
        int i10 = this.O;
        if (i10 == 0) {
            k10 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20068m7, sl0Var.f28750m2);
        } else {
            k10 = i0.a.k(-16777216, 102);
        }
        this.P = k10;
        this.Q = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20050l7, sl0Var.f28750m2);
        this.f23701c.setColor(this.P);
        TextPaint textPaint = this.E;
        if (i10 == 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20086n7, sl0Var.f28750m2));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, sl0Var.f28750m2));
        }
        invalidate();
    }

    @Override
    public float getAlpha() {
        return this.f23711k0;
    }

    public float getProgress() {
        return this.e;
    }

    public int getScrollBarY() {
        return AndroidUtilities.dp(17.0f) + ((int) Math.ceil((getMeasuredHeight() - AndroidUtilities.dp(54.0f)) * this.e));
    }

    @Override
    public final boolean isPressed() {
        return this.f23713n;
    }

    @Override
    public final void layout(int i10, int i11, int i12, int i13) {
        if (!this.f23712l0.G1) {
            return;
        }
        super.layout(i10, i11, i12, i13);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f10;
        float f11;
        float f12;
        char c3;
        float f13;
        float f14;
        int i11;
        int i12;
        float f15;
        float dp;
        float dp2;
        float f16;
        float f17;
        if (this.f23697a) {
            i10 = getPaddingTop();
        } else {
            i10 = 0;
        }
        int ceil = i10 + ((int) Math.ceil(((getMeasuredHeight() - i10) - AndroidUtilities.dp(54.0f)) * this.e));
        int i13 = this.N;
        float f18 = i13;
        RectF rectF = this.f23699b;
        rectF.set(f18, AndroidUtilities.dp(12.0f) + ceil, AndroidUtilities.dp(5.0f) + i13, AndroidUtilities.dp(42.0f) + ceil);
        int i14 = this.O;
        Paint paint = this.f23701c;
        if (i14 == 0) {
            f10 = 12.0f;
            f11 = 36.0f;
            paint.setColor(i0.a.d(this.L, this.P, this.Q));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint);
            f12 = 8.0f;
            c3 = 2;
            f13 = 24.0f;
            f14 = 4.0f;
        } else {
            f10 = 12.0f;
            f11 = 36.0f;
            int i15 = org.telegram.ui.ActionBar.j6.f19906d6;
            sl0 sl0Var = this.f23712l0;
            f12 = 8.0f;
            paint.setColor(i0.a.d(0.1f, org.telegram.ui.ActionBar.j6.v0(i15, sl0Var.f28750m2), -1));
            float dp3 = AndroidUtilities.dp(27.0f) + ceil;
            pg.b bVar = this.f23700b0;
            if (bVar != null) {
                c3 = 2;
                f13 = 24.0f;
                bVar.setBounds(AndroidUtilities.dp(-20.0f) + i13, AndroidUtilities.dp(-1.0f) + ceil, AndroidUtilities.dp(36.0f) + i13, AndroidUtilities.dp(55.0f) + ceil);
                this.f23700b0.draw(canvas);
                f14 = 4.0f;
            } else {
                c3 = 2;
                f13 = 24.0f;
                int measuredWidth = getMeasuredWidth();
                Drawable drawable = this.W;
                f14 = 4.0f;
                drawable.setBounds(measuredWidth - drawable.getIntrinsicWidth(), (int) (dp3 - (drawable.getIntrinsicHeight() / 2)), getMeasuredWidth(), (int) (dp3 + (drawable.getIntrinsicHeight() / 2)));
                drawable.draw(canvas);
                canvas.drawCircle(AndroidUtilities.dp(8.0f) + i13, AndroidUtilities.dp(27.0f) + ceil, AndroidUtilities.dp(24.0f), paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, sl0Var.f28750m2));
            canvas.save();
            canvas.translate(AndroidUtilities.dp(f14) + i13, (AndroidUtilities.dp(2.0f) * this.L) + AndroidUtilities.dp(34.0f) + ceil);
            Path path = this.H;
            canvas.drawPath(path, paint);
            canvas.restore();
            canvas.save();
            canvas.translate(AndroidUtilities.dp(f14) + i13, (AndroidUtilities.dp(f13) + ceil) - (AndroidUtilities.dp(2.0f) * this.L));
            canvas.rotate(180.0f, 0.0f, -AndroidUtilities.dp(2.0f));
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        if (i14 == 0) {
            if (this.f23708h0 || this.L != 0.0f) {
                paint.setAlpha((int) (this.L * 255.0f));
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
                boolean z4 = this.f23703d0;
                Path path2 = this.G;
                float[] fArr = this.I;
                if ((z4 && (fArr[0] != dp || fArr[6] != dp2)) || (!z4 && (fArr[c3] != dp || fArr[4] != dp2))) {
                    if (z4) {
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
                    if (z4) {
                        f16 = AndroidUtilities.dp(10.0f);
                    } else {
                        f16 = 0.0f;
                    }
                    if (z4) {
                        f17 = 98.0f;
                    } else {
                        f17 = 88.0f;
                    }
                    rectF.set(f16, 0.0f, AndroidUtilities.dp(f17), AndroidUtilities.dp(88.0f));
                    path2.addRoundRect(rectF, fArr, Path.Direction.CW);
                    path2.close();
                }
                StaticLayout staticLayout = this.f23714r;
                if (staticLayout == null) {
                    staticLayout = this.f23715s;
                }
                if (staticLayout != null) {
                    canvas.save();
                    float f19 = this.L;
                    canvas.scale(f19, f19, f18, dp4 - dp5);
                    canvas.drawPath(path2, paint);
                    canvas.translate(this.J, this.K);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
            }
        } else if (i14 == 1 && this.f23714r != null && this.S != 0.0f) {
            canvas.save();
            float f20 = (this.S * 0.3f) + 0.7f;
            canvas.scale(f20, f20, rectF.right - AndroidUtilities.dp(f10), rectF.centerY());
            float centerY = rectF.centerY();
            float dp6 = (rectF.left - (AndroidUtilities.dp(30.0f) * this.L)) - AndroidUtilities.dp(f12);
            this.f23714r.getHeight();
            AndroidUtilities.dp(6.0f);
            rectF.set((dp6 - (((1.0f - this.f23718y) * this.D) + (this.f23718y * this.f23714r.getWidth()))) - AndroidUtilities.dp(f11), (centerY - (this.f23714r.getHeight() / 2.0f)) - AndroidUtilities.dp(f12), dp6 - AndroidUtilities.dp(f10), (this.f23714r.getHeight() / 2.0f) + centerY + AndroidUtilities.dp(f12));
            Paint paint2 = this.d;
            int alpha = paint2.getAlpha();
            TextPaint textPaint = this.E;
            int alpha2 = textPaint.getAlpha();
            paint2.setAlpha((int) (alpha * this.S));
            if (this.f23702c0 != null) {
                Rect rect = AndroidUtilities.rectTmp2;
                rectF.round(rect);
                rect.inset(-AndroidUtilities.dp(f14), -AndroidUtilities.dp(f14));
                this.f23702c0.setBounds(rect);
                this.f23702c0.draw(canvas);
            } else {
                Drawable drawable2 = this.f23698a0;
                drawable2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                drawable2.setAlpha((int) (this.S * 255.0f));
                drawable2.draw(canvas);
            }
            float f21 = this.f23718y;
            if (f21 != 1.0f) {
                float f22 = f21 + 0.10666667f;
                this.f23718y = f22;
                if (f22 > 1.0f) {
                    this.f23718y = 1.0f;
                } else {
                    invalidate();
                }
            }
            if (this.f23718y != 1.0f) {
                canvas.save();
                rectF.inset(AndroidUtilities.dp(f14), AndroidUtilities.dp(2.0f));
                canvas.clipRect(rectF);
                if (this.v != null) {
                    textPaint.setAlpha((int) ((1.0f - this.f23718y) * alpha2 * this.S));
                    canvas.save();
                    float width = (dp6 - this.v.getWidth()) - AndroidUtilities.dp(f13);
                    float height = centerY - (this.v.getHeight() / 2.0f);
                    if (this.B) {
                        i12 = -1;
                    } else {
                        i12 = 1;
                    }
                    canvas.translate(width, (AndroidUtilities.dp(15.0f) * i12 * this.f23718y) + height);
                    this.v.draw(canvas);
                    canvas.restore();
                }
                if (this.f23716w != null) {
                    textPaint.setAlpha((int) (alpha2 * this.S * this.f23718y));
                    canvas.save();
                    float width2 = (dp6 - this.f23716w.getWidth()) - AndroidUtilities.dp(f13);
                    float height2 = centerY - (this.f23716w.getHeight() / 2.0f);
                    if (this.B) {
                        i11 = 1;
                    } else {
                        i11 = -1;
                    }
                    canvas.translate(width2, e2.c.w(1.0f, this.f23718y, AndroidUtilities.dp(15.0f) * i11, height2));
                    this.f23716w.draw(canvas);
                    canvas.restore();
                }
                if (this.f23717x != null) {
                    textPaint.setAlpha((int) (alpha2 * this.S));
                    canvas.save();
                    canvas.translate((dp6 - this.f23717x.getWidth()) - AndroidUtilities.dp(f13), centerY - (this.f23717x.getHeight() / 2.0f));
                    this.f23717x.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            } else {
                textPaint.setAlpha((int) (alpha2 * this.S));
                canvas.save();
                canvas.translate((dp6 - this.f23714r.getWidth()) - AndroidUtilities.dp(f13), e2.c.w(1.0f, this.f23718y, AndroidUtilities.dp(15.0f), centerY - (this.f23714r.getHeight() / 2.0f)));
                this.f23714r.draw(canvas);
                canvas.restore();
            }
            paint2.setAlpha(alpha);
            textPaint.setAlpha(alpha2);
            canvas.restore();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.M;
        if (j10 < 0 || j10 > 17) {
            j10 = 17;
        }
        boolean z10 = this.f23708h0;
        if ((z10 && this.f23714r != null && this.L < 1.0f) || ((!z10 || this.f23714r == null) && this.L > 0.0f)) {
            this.M = currentTimeMillis;
            invalidate();
            if (this.f23708h0 && this.f23714r != null) {
                float f23 = (((float) j10) / 120.0f) + this.L;
                this.L = f23;
                if (f23 > 1.0f) {
                    this.L = 1.0f;
                }
            } else {
                float f24 = this.L - (((float) j10) / 120.0f);
                this.L = f24;
                if (f24 < 0.0f) {
                    this.L = 0.0f;
                }
            }
        }
        boolean z11 = this.R;
        if (z11) {
            float f25 = this.S;
            if (f25 != 1.0f) {
                float f26 = (((float) j10) / 120.0f) + f25;
                this.S = f26;
                if (f26 > 1.0f) {
                    this.S = 1.0f;
                }
                invalidate();
                return;
            }
        }
        if (!z11) {
            float f27 = this.S;
            if (f27 != 0.0f) {
                float f28 = f27 - (((float) j10) / 120.0f);
                this.S = f28;
                if (f28 < 0.0f) {
                    this.S = 0.0f;
                }
                invalidate();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        if (this.O == 0) {
            f10 = 132.0f;
        } else {
            f10 = 240.0f;
        }
        setMeasuredDimension(AndroidUtilities.dp(f10), View.MeasureSpec.getSize(i11));
        Path path = this.H;
        path.reset();
        path.setLastPoint(0.0f, 0.0f);
        path.lineTo(AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        path.lineTo(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        path.close();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bl0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setAlpha(float f10) {
        if (this.f23711k0 != f10) {
            this.f23711k0 = f10;
            super.setAlpha(f10 * this.f23710j0);
        }
    }

    public void setIsVisible(boolean z4) {
        float f10;
        if (this.U != z4) {
            this.U = z4;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f23710j0 = f10;
            super.setAlpha(this.f23711k0 * f10);
        }
    }

    public void setProgress(float f10) {
        this.e = f10;
        invalidate();
    }

    public void setVisibilityAlpha(float f10) {
        if (this.f23710j0 != f10) {
            this.f23710j0 = f10;
            super.setAlpha(this.f23711k0 * f10);
        }
    }
}
