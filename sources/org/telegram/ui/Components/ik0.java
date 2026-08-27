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

public final class ik0 extends View {
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

    public boolean f29380a;

    public lg.d f29381a0;

    public final RectF f29382b;

    public lg.d f29383b0;

    public final Paint f29384c;

    public final boolean f29385c0;
    public final Paint d;

    public int f29386d0;

    public float f29387e;

    public final m.i3 f29388e0;

    public float f29389f;

    public float f29390f0;

    public boolean f29391g0;
    public float h;

    public long f29392h0;

    public float f29393i0;

    public float f29394j0;

    public final zk0 f29395k0;

    public boolean f29396n;

    public StaticLayout f29397r;

    public StaticLayout f29398s;
    public StaticLayout v;

    public StaticLayout f29399w;

    public StaticLayout f29400x;

    public float f29401y;

    public ik0(zk0 zk0Var, Context context, int i10) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var = zk0Var.f35277l2;
        this.f29395k0 = zk0Var;
        this.f29380a = true;
        this.f29382b = new RectF();
        this.f29384c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        this.f29401y = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.D = textPaint;
        this.F = new Path();
        this.G = new Path();
        this.H = new float[8];
        this.S = new int[2];
        this.f29388e0 = new m.i3(this, 27);
        this.f29394j0 = 1.0f;
        this.N = i10;
        if (i10 == 0) {
            textPaint.setTextSize(AndroidUtilities.dp(45.0f));
            this.f29385c0 = LocaleController.isRTL;
        } else {
            this.f29385c0 = false;
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            int i11 = org.telegram.ui.ActionBar.g6.f23053d6;
            paint.setColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
            Drawable drawableMutate = context.getDrawable(R.drawable.calendar_date).mutate();
            this.W = drawableMutate;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(i0.b.d(0.1f, org.telegram.ui.ActionBar.g6.v0(i11, c6Var), -1), PorterDuff.Mode.MULTIPLY));
        }
        for (int i12 = 0; i12 < 8; i12++) {
            this.H[i12] = AndroidUtilities.dp(44.0f);
        }
        int iDp = AndroidUtilities.dp(this.f29385c0 ? 10.0f : (i10 == 0 ? 132 : 240) - 15);
        this.M = iDp;
        if (zk0Var.b1()) {
            this.M = AndroidUtilities.dp(this.f29385c0 ? -4.0f : 6.0f) + iDp;
        }
        c();
        setFocusableInTouchMode(true);
        this.U = ViewConfiguration.get(context).getScaledTouchSlop();
        this.V = context.getDrawable(R.drawable.fast_scroll_shadow);
    }

    public final void a(boolean z10) {
        zk0 zk0Var = this.f29395k0;
        f2.x0 layoutManager = zk0Var.getLayoutManager();
        if (layoutManager instanceof f2.k0) {
            f2.k0 k0Var = (f2.k0) layoutManager;
            if (k0Var.f5720o == 1) {
                f2.q0 adapter = zk0Var.getAdapter();
                if (adapter instanceof jk0) {
                    jk0 jk0Var = (jk0) adapter;
                    float f10 = this.f29387e;
                    int[] iArr = this.S;
                    jk0Var.G(zk0Var, f10, iArr);
                    if (z10) {
                        k0Var.h1(iArr[0], (-iArr[1]) + zk0Var.f35290s1);
                    }
                    String strF = jk0Var.F(iArr[0]);
                    if (strF == null) {
                        StaticLayout staticLayout = this.f29397r;
                        if (staticLayout != null) {
                            this.f29398s = staticLayout;
                        }
                        this.f29397r = null;
                        return;
                    }
                    if (strF.equals(this.E)) {
                        return;
                    }
                    this.E = strF;
                    int i10 = this.N;
                    TextPaint textPaint = this.D;
                    if (i10 == 0) {
                        this.f29397r = new StaticLayout(strF, textPaint, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    } else {
                        this.v = this.f29397r;
                        int iMeasureText = ((int) textPaint.measureText(strF)) + 1;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        this.f29397r = new StaticLayout(strF, textPaint, iMeasureText, alignment, 1.0f, 0.0f, false);
                        if (this.v != null) {
                            String[] strArrSplit = strF.split(" ");
                            String[] strArrSplit2 = this.v.getText().toString().split(" ");
                            if (strArrSplit != null && strArrSplit2 != null && strArrSplit.length == 2 && strArrSplit2.length == 2 && strArrSplit[1].equals(strArrSplit2[1])) {
                                String string = this.v.getText().toString();
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                                spannableStringBuilder.setSpan(new zy(false), strArrSplit2[0].length(), string.length(), 0);
                                this.v = new StaticLayout(spannableStringBuilder, textPaint, ((int) textPaint.measureText(string)) + 1, alignment, 1.0f, 0.0f, false);
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(strF);
                                spannableStringBuilder2.setSpan(new zy(false), strArrSplit[0].length(), strF.length(), 0);
                                this.f29399w = new StaticLayout(spannableStringBuilder2, textPaint, iMeasureText, alignment, 1.0f, 0.0f, false);
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(strF);
                                spannableStringBuilder3.setSpan(new zy(false), 0, strArrSplit[0].length(), 0);
                                this.f29400x = new StaticLayout(spannableStringBuilder3, textPaint, iMeasureText, alignment, 1.0f, 0.0f, false);
                            } else {
                                this.f29399w = this.f29397r;
                                this.f29400x = null;
                            }
                            this.C = this.v.getWidth();
                            this.f29401y = 0.0f;
                            this.A = getProgress() > this.B;
                        }
                        this.B = getProgress();
                    }
                    this.f29398s = null;
                    if (this.f29397r.getLineCount() > 0) {
                        this.f29397r.getLineWidth(0);
                        this.f29397r.getLineLeft(0);
                        if (this.f29385c0) {
                            this.I = (((AndroidUtilities.dp(88.0f) - this.f29397r.getLineWidth(0)) / 2.0f) + AndroidUtilities.dp(10.0f)) - this.f29397r.getLineLeft(0);
                        } else {
                            this.I = ((AndroidUtilities.dp(88.0f) - this.f29397r.getLineWidth(0)) / 2.0f) - this.f29397r.getLineLeft(0);
                        }
                        this.J = (AndroidUtilities.dp(88.0f) - this.f29397r.getHeight()) / 2;
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
        m.i3 i3Var = this.f29388e0;
        AndroidUtilities.cancelRunOnUIThread(i3Var);
        AndroidUtilities.runOnUIThread(i3Var, 2000L);
    }

    public final void c() {
        zk0 zk0Var = this.f29395k0;
        int i10 = this.N;
        this.O = i10 == 0 ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23216m7, zk0Var.f35277l2) : i0.b.k(-16777216, 102);
        this.P = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23199l7, zk0Var.f35277l2);
        this.f29384c.setColor(this.O);
        TextPaint textPaint = this.D;
        if (i10 == 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23235n7, zk0Var.f35277l2));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, zk0Var.f35277l2));
        }
        invalidate();
    }

    @Override
    public float getAlpha() {
        return this.f29394j0;
    }

    public float getProgress() {
        return this.f29387e;
    }

    public int getScrollBarY() {
        return AndroidUtilities.dp(17.0f) + ((int) Math.ceil((getMeasuredHeight() - AndroidUtilities.dp(54.0f)) * this.f29387e));
    }

    @Override
    public final boolean isPressed() {
        return this.f29396n;
    }

    @Override
    public final void layout(int i10, int i11, int i12, int i13) {
        if (this.f29395k0.F1) {
            super.layout(i10, i11, i12, i13);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        char c10;
        float f13;
        float f14;
        float fDp;
        float fDp2;
        float fDp3;
        int paddingTop = this.f29380a ? getPaddingTop() : 0;
        int iCeil = paddingTop + ((int) Math.ceil(((getMeasuredHeight() - paddingTop) - AndroidUtilities.dp(54.0f)) * this.f29387e));
        int i10 = this.M;
        float f15 = i10;
        float fDp4 = AndroidUtilities.dp(12.0f) + iCeil;
        float fDp5 = AndroidUtilities.dp(5.0f) + i10;
        float fDp6 = AndroidUtilities.dp(42.0f) + iCeil;
        RectF rectF = this.f29382b;
        rectF.set(f15, fDp4, fDp5, fDp6);
        int i11 = this.N;
        Paint paint = this.f29384c;
        if (i11 == 0) {
            f10 = 12.0f;
            f11 = 36.0f;
            paint.setColor(i0.b.d(this.K, this.O, this.P));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint);
            f12 = 8.0f;
            c10 = 2;
            f13 = 24.0f;
            f14 = 4.0f;
        } else {
            f10 = 12.0f;
            f11 = 36.0f;
            int i12 = org.telegram.ui.ActionBar.g6.f23053d6;
            zk0 zk0Var = this.f29395k0;
            f12 = 8.0f;
            paint.setColor(i0.b.d(0.1f, org.telegram.ui.ActionBar.g6.v0(i12, zk0Var.f35277l2), -1));
            float fDp7 = AndroidUtilities.dp(27.0f) + iCeil;
            lg.d dVar = this.f29381a0;
            if (dVar != null) {
                c10 = 2;
                f13 = 24.0f;
                dVar.setBounds(AndroidUtilities.dp(-20.0f) + i10, AndroidUtilities.dp(-1.0f) + iCeil, AndroidUtilities.dp(36.0f) + i10, AndroidUtilities.dp(55.0f) + iCeil);
                this.f29381a0.draw(canvas);
                f14 = 4.0f;
            } else {
                c10 = 2;
                f13 = 24.0f;
                int measuredWidth = getMeasuredWidth();
                Drawable drawable = this.V;
                f14 = 4.0f;
                drawable.setBounds(measuredWidth - drawable.getIntrinsicWidth(), (int) (fDp7 - (drawable.getIntrinsicHeight() / 2)), getMeasuredWidth(), (int) (fDp7 + (drawable.getIntrinsicHeight() / 2)));
                drawable.draw(canvas);
                canvas.drawCircle(AndroidUtilities.dp(8.0f) + i10, AndroidUtilities.dp(27.0f) + iCeil, AndroidUtilities.dp(24.0f), paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, zk0Var.f35277l2));
            canvas.save();
            canvas.translate(AndroidUtilities.dp(f14) + i10, (AndroidUtilities.dp(2.0f) * this.K) + AndroidUtilities.dp(34.0f) + iCeil);
            Path path = this.G;
            canvas.drawPath(path, paint);
            canvas.restore();
            canvas.save();
            canvas.translate(AndroidUtilities.dp(f14) + i10, (AndroidUtilities.dp(f13) + iCeil) - (AndroidUtilities.dp(2.0f) * this.K));
            canvas.rotate(180.0f, 0.0f, -AndroidUtilities.dp(2.0f));
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        if (i11 == 0) {
            if (this.f29391g0 || this.K != 0.0f) {
                paint.setAlpha((int) (this.K * 255.0f));
                int iDp = AndroidUtilities.dp(30.0f) + iCeil;
                int iDp2 = iCeil - AndroidUtilities.dp(46.0f);
                if (iDp2 <= AndroidUtilities.dp(f10)) {
                    fDp = AndroidUtilities.dp(f10) - iDp2;
                    iDp2 = AndroidUtilities.dp(f10);
                } else {
                    fDp = 0.0f;
                }
                canvas.translate(AndroidUtilities.dp(10.0f), iDp2);
                if (fDp <= AndroidUtilities.dp(29.0f)) {
                    fDp2 = AndroidUtilities.dp(44.0f);
                    fDp3 = ((fDp / AndroidUtilities.dp(29.0f)) * AndroidUtilities.dp(40.0f)) + AndroidUtilities.dp(f14);
                } else {
                    float fDp8 = fDp - AndroidUtilities.dp(29.0f);
                    float fDp9 = AndroidUtilities.dp(44.0f);
                    fDp2 = ((1.0f - (fDp8 / AndroidUtilities.dp(29.0f))) * AndroidUtilities.dp(40.0f)) + AndroidUtilities.dp(f14);
                    fDp3 = fDp9;
                }
                boolean z10 = this.f29385c0;
                Path path2 = this.F;
                float[] fArr = this.H;
                if ((z10 && (fArr[0] != fDp2 || fArr[6] != fDp3)) || (!z10 && (fArr[c10] != fDp2 || fArr[4] != fDp3))) {
                    if (z10) {
                        fArr[1] = fDp2;
                        fArr[0] = fDp2;
                        fArr[7] = fDp3;
                        fArr[6] = fDp3;
                    } else {
                        fArr[3] = fDp2;
                        fArr[c10] = fDp2;
                        fArr[5] = fDp3;
                        fArr[4] = fDp3;
                    }
                    path2.reset();
                    rectF.set(z10 ? AndroidUtilities.dp(10.0f) : 0.0f, 0.0f, AndroidUtilities.dp(z10 ? 98.0f : 88.0f), AndroidUtilities.dp(88.0f));
                    path2.addRoundRect(rectF, fArr, Path.Direction.CW);
                    path2.close();
                }
                StaticLayout staticLayout = this.f29397r;
                if (staticLayout == null) {
                    staticLayout = this.f29398s;
                }
                if (staticLayout != null) {
                    canvas.save();
                    float f16 = this.K;
                    canvas.scale(f16, f16, f15, iDp - iDp2);
                    canvas.drawPath(path2, paint);
                    canvas.translate(this.I, this.J);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
            }
        } else if (i11 == 1 && this.f29397r != null && this.R != 0.0f) {
            canvas.save();
            float f17 = (this.R * 0.3f) + 0.7f;
            canvas.scale(f17, f17, rectF.right - AndroidUtilities.dp(f10), rectF.centerY());
            float fCenterY = rectF.centerY();
            float fDp10 = (rectF.left - (AndroidUtilities.dp(30.0f) * this.K)) - AndroidUtilities.dp(f12);
            this.f29397r.getHeight();
            AndroidUtilities.dp(6.0f);
            rectF.set((fDp10 - (((1.0f - this.f29401y) * this.C) + (this.f29401y * this.f29397r.getWidth()))) - AndroidUtilities.dp(f11), (fCenterY - (this.f29397r.getHeight() / 2.0f)) - AndroidUtilities.dp(f12), fDp10 - AndroidUtilities.dp(f10), (this.f29397r.getHeight() / 2.0f) + fCenterY + AndroidUtilities.dp(f12));
            Paint paint2 = this.d;
            int alpha = paint2.getAlpha();
            TextPaint textPaint = this.D;
            int alpha2 = textPaint.getAlpha();
            paint2.setAlpha((int) (alpha * this.R));
            if (this.f29383b0 != null) {
                Rect rect = AndroidUtilities.rectTmp2;
                rectF.round(rect);
                rect.inset(-AndroidUtilities.dp(f14), -AndroidUtilities.dp(f14));
                this.f29383b0.setBounds(rect);
                this.f29383b0.draw(canvas);
            } else {
                int i13 = (int) rectF.left;
                int i14 = (int) rectF.top;
                int i15 = (int) rectF.right;
                int i16 = (int) rectF.bottom;
                Drawable drawable2 = this.W;
                drawable2.setBounds(i13, i14, i15, i16);
                drawable2.setAlpha((int) (this.R * 255.0f));
                drawable2.draw(canvas);
            }
            float f18 = this.f29401y;
            if (f18 != 1.0f) {
                float f19 = f18 + 0.10666667f;
                this.f29401y = f19;
                if (f19 > 1.0f) {
                    this.f29401y = 1.0f;
                } else {
                    invalidate();
                }
            }
            if (this.f29401y != 1.0f) {
                canvas.save();
                rectF.inset(AndroidUtilities.dp(f14), AndroidUtilities.dp(2.0f));
                canvas.clipRect(rectF);
                if (this.v != null) {
                    textPaint.setAlpha((int) ((1.0f - this.f29401y) * alpha2 * this.R));
                    canvas.save();
                    canvas.translate((fDp10 - this.v.getWidth()) - AndroidUtilities.dp(f13), (AndroidUtilities.dp(15.0f) * (this.A ? -1 : 1) * this.f29401y) + (fCenterY - (this.v.getHeight() / 2.0f)));
                    this.v.draw(canvas);
                    canvas.restore();
                }
                if (this.f29399w != null) {
                    textPaint.setAlpha((int) (alpha2 * this.R * this.f29401y));
                    canvas.save();
                    canvas.translate((fDp10 - this.f29399w.getWidth()) - AndroidUtilities.dp(f13), com.google.android.recaptcha.internal.a.z(1.0f, this.f29401y, AndroidUtilities.dp(15.0f) * (this.A ? 1 : -1), fCenterY - (this.f29399w.getHeight() / 2.0f)));
                    this.f29399w.draw(canvas);
                    canvas.restore();
                }
                if (this.f29400x != null) {
                    textPaint.setAlpha((int) (alpha2 * this.R));
                    canvas.save();
                    canvas.translate((fDp10 - this.f29400x.getWidth()) - AndroidUtilities.dp(f13), fCenterY - (this.f29400x.getHeight() / 2.0f));
                    this.f29400x.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            } else {
                textPaint.setAlpha((int) (alpha2 * this.R));
                canvas.save();
                canvas.translate((fDp10 - this.f29397r.getWidth()) - AndroidUtilities.dp(f13), com.google.android.recaptcha.internal.a.z(1.0f, this.f29401y, AndroidUtilities.dp(15.0f), fCenterY - (this.f29397r.getHeight() / 2.0f)));
                this.f29397r.draw(canvas);
                canvas.restore();
            }
            paint2.setAlpha(alpha);
            textPaint.setAlpha(alpha2);
            canvas.restore();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = jCurrentTimeMillis - this.L;
        if (j10 < 0 || j10 > 17) {
            j10 = 17;
        }
        boolean z11 = this.f29391g0;
        if ((z11 && this.f29397r != null && this.K < 1.0f) || ((!z11 || this.f29397r == null) && this.K > 0.0f)) {
            this.L = jCurrentTimeMillis;
            invalidate();
            if (!this.f29391g0 || this.f29397r == null) {
                float f20 = this.K - (j10 / 120.0f);
                this.K = f20;
                if (f20 < 0.0f) {
                    this.K = 0.0f;
                }
            } else {
                float f21 = (j10 / 120.0f) + this.K;
                this.K = f21;
                if (f21 > 1.0f) {
                    this.K = 1.0f;
                }
            }
        }
        boolean z12 = this.Q;
        if (z12) {
            float f22 = this.R;
            if (f22 != 1.0f) {
                float f23 = (j10 / 120.0f) + f22;
                this.R = f23;
                if (f23 > 1.0f) {
                    this.R = 1.0f;
                }
                invalidate();
                return;
            }
        }
        if (z12) {
            return;
        }
        float f24 = this.R;
        if (f24 != 0.0f) {
            float f25 = f24 - (j10 / 120.0f);
            this.R = f25;
            if (f25 < 0.0f) {
                this.R = 0.0f;
            }
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(this.N == 0 ? 132.0f : 240.0f), View.MeasureSpec.getSize(i11));
        Path path = this.G;
        path.reset();
        path.setLastPoint(0.0f, 0.0f);
        path.lineTo(AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        path.lineTo(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        path.close();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ik0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setAlpha(float f10) {
        if (this.f29394j0 != f10) {
            this.f29394j0 = f10;
            super.setAlpha(f10 * this.f29393i0);
        }
    }

    public void setIsVisible(boolean z10) {
        if (this.T != z10) {
            this.T = z10;
            float f10 = z10 ? 1.0f : 0.0f;
            this.f29393i0 = f10;
            super.setAlpha(this.f29394j0 * f10);
        }
    }

    public void setProgress(float f10) {
        this.f29387e = f10;
        invalidate();
    }

    public void setVisibilityAlpha(float f10) {
        if (this.f29393i0 != f10) {
            this.f29393i0 = f10;
            super.setAlpha(this.f29394j0 * f10);
        }
    }
}
