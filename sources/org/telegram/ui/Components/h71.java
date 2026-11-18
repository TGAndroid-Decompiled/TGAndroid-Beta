package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
public final class h71 extends View {
    public ObjectAnimator E;
    public final View F;
    public int[] G;
    public final org.telegram.ui.Cells.g2 H;
    public final Paint I;
    public float J;
    public final org.telegram.ui.ActionBar.i6 f35789a;
    public final Paint f35790b;
    public final Paint f35791c;
    public final TextPaint d;
    public final Paint f35792e;
    public String f35793f;
    public int h;
    public int f35794n;
    public final RectF f35795r;
    public boolean f35796s;
    public final Canvas f35797w;
    public final Bitmap f35798x;
    public float f35799y;

    public h71(Context context, boolean z10, View view, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.G = new int[4];
        this.H = new org.telegram.ui.Cells.g2(this);
        this.I = new Paint(1);
        this.f35789a = i6Var;
        this.f35795r = new RectF();
        if (z10) {
            Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), Bitmap.Config.ARGB_4444);
            this.f35798x = createBitmap;
            this.f35797w = new Canvas(createBitmap);
        }
        this.F = view;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        Paint paint = new Paint(1);
        this.f35791c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setColor(0);
        paint.setStrokeCap(Paint.Cap.ROUND);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        paint.setXfermode(new PorterDuffXfermode(mode));
        Paint paint2 = new Paint(1);
        this.f35790b = paint2;
        paint2.setColor(0);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f35792e = new Paint(1);
    }

    private void setProgress(float f10) {
        if (this.f35799y == f10) {
            return;
        }
        this.f35799y = f10;
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f35796s) {
            return;
        }
        this.f35796s = z10;
        float f10 = 0.0f;
        if (z11) {
            if (z10) {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, this.H, f10);
            this.E = ofFloat;
            ofFloat.setDuration(300L);
            this.E.start();
            return;
        }
        ObjectAnimator objectAnimator = this.E;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (z10) {
            f10 = 1.0f;
        }
        this.f35799y = f10;
        invalidate();
    }

    public final void b(int i7, int i10) {
        if (this.G == null) {
            this.G = new int[4];
        }
        this.G[i7] = i10;
        invalidate();
    }

    public TextPaint getTextPaint() {
        return this.d;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        boolean j3;
        float f10;
        float f11;
        float f12;
        Paint paint2;
        Canvas canvas2 = canvas;
        RectF rectF = this.f35795r;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        View view = this.F;
        org.telegram.ui.ActionBar.i6 i6Var = this.f35789a;
        org.telegram.ui.ActionBar.n6.t(this, view, i6Var);
        float measuredHeight = getMeasuredHeight() / 2;
        float measuredHeight2 = getMeasuredHeight() / 2;
        if (i6Var != null) {
            paint = i6Var.g("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.n6.V0("paintChatActionBackground");
        }
        canvas2.drawRoundRect(rectF, measuredHeight, measuredHeight2, paint);
        if (i6Var == null) {
            j3 = org.telegram.ui.ActionBar.n6.d1();
        } else {
            j3 = i6Var.j();
        }
        if (j3) {
            float measuredHeight3 = getMeasuredHeight() / 2;
            float measuredHeight4 = getMeasuredHeight() / 2;
            if (i6Var != null) {
                paint2 = i6Var.g("paintChatActionBackgroundDarken");
            } else {
                paint2 = null;
            }
            if (paint2 == null) {
                paint2 = org.telegram.ui.ActionBar.n6.V0("paintChatActionBackgroundDarken");
            }
            canvas2.drawRoundRect(rectF, measuredHeight3, measuredHeight4, paint2);
        }
        if (this.J > 0.0f) {
            canvas2.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, this.I);
        }
        int i7 = org.telegram.ui.ActionBar.n6.Zc;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        TextPaint textPaint = this.d;
        textPaint.setColor(w02);
        int z10 = org.telegram.messenger.n10.z(28.0f, getMeasuredWidth() - this.h, 2);
        canvas2.drawText(this.f35793f, org.telegram.messenger.g0.L(28.0f) + z10, org.telegram.messenger.g0.L(21.0f), textPaint);
        canvas2.save();
        canvas2.translate(z10, org.telegram.messenger.g0.L(7.0f));
        Bitmap bitmap = this.f35798x;
        int i10 = 0;
        Paint paint3 = this.f35792e;
        if (bitmap != null) {
            float f13 = this.f35799y;
            if (f13 <= 0.5f) {
                f10 = f13 / 0.5f;
                f11 = f10;
            } else {
                f10 = 2.0f - (f13 / 0.5f);
                f11 = 1.0f;
            }
            float L = org.telegram.messenger.g0.L(1.0f) * f10;
            rectF.set(L, L, org.telegram.messenger.g0.L(18.0f) - L, org.telegram.messenger.g0.L(18.0f) - L);
            bitmap.eraseColor(0);
            paint3.setColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
            Canvas canvas3 = this.f35797w;
            canvas3.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint3);
            if (f11 != 1.0f) {
                float min = Math.min(org.telegram.messenger.g0.L(7.0f), (org.telegram.messenger.g0.L(7.0f) * f11) + L);
                rectF.set(org.telegram.messenger.g0.L(2.0f) + min, org.telegram.messenger.g0.L(2.0f) + min, org.telegram.messenger.g0.L(16.0f) - min, org.telegram.messenger.g0.L(16.0f) - min);
                canvas3.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, this.f35790b);
            }
            if (this.f35799y > 0.5f) {
                Paint paint4 = this.f35791c;
                canvas3.drawLine(org.telegram.messenger.g0.L(7.3f), org.telegram.messenger.g0.L(13.0f), (int) (org.telegram.messenger.g0.L(7.3f) - (org.telegram.messenger.g0.L(2.5f) * f12)), (int) (org.telegram.messenger.g0.L(13.0f) - (org.telegram.messenger.g0.L(2.5f) * (1.0f - f10))), paint4);
                canvas3.drawLine(org.telegram.messenger.g0.L(7.3f), org.telegram.messenger.g0.L(13.0f), (int) ((org.telegram.messenger.g0.L(6.0f) * f12) + org.telegram.messenger.g0.L(7.3f)), (int) (org.telegram.messenger.g0.L(13.0f) - (org.telegram.messenger.g0.L(6.0f) * f12)), paint4);
            }
            canvas2.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        } else {
            rectF.set(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f));
            int[] iArr = this.G;
            if (iArr[3] != 0) {
                while (i10 < 4) {
                    paint3.setColor(this.G[i10]);
                    RectF rectF2 = rectF;
                    canvas2.drawArc(rectF2, (i10 * 90) - 90, 90.0f, true, paint3);
                    i10++;
                    rectF = rectF2;
                    canvas2 = canvas;
                }
            } else {
                RectF rectF3 = rectF;
                if (iArr[2] != 0) {
                    while (i10 < 3) {
                        paint3.setColor(this.G[i10]);
                        RectF rectF4 = rectF3;
                        canvas.drawArc(rectF4, (i10 * 120) - 90, 120.0f, true, paint3);
                        rectF3 = rectF4;
                        i10++;
                    }
                } else if (iArr[1] != 0) {
                    while (i10 < 2) {
                        paint3.setColor(this.G[i10]);
                        RectF rectF5 = rectF3;
                        canvas.drawArc(rectF5, (i10 * 180) - 90, 180.0f, true, paint3);
                        i10++;
                        rectF3 = rectF5;
                    }
                } else {
                    canvas2 = canvas;
                    paint3.setColor(iArr[0]);
                    canvas2.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.height() / 2.0f, paint3);
                }
            }
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(org.telegram.messenger.n10.C(56.0f, this.f35794n, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
    }

    public void setDimAmount(float f10) {
        this.J = f10;
        this.I.setColor(i0.a.o(-16777216, (int) (f10 * 255.0f)));
        invalidate();
    }
}
