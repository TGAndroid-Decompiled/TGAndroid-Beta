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
public final class x71 extends View {
    public ObjectAnimator D;
    public final View E;
    public int[] F;
    public final org.telegram.ui.Cells.f2 G;
    public final Paint H;
    public float I;
    public final org.telegram.ui.ActionBar.p6 f32413a;
    public final Paint f32414b;
    public final Paint f32415c;
    public final TextPaint d;
    public final Paint e;
    public String f32416f;
    public int h;
    public int f32417n;
    public final RectF f32418r;
    public boolean f32419s;
    public final Canvas f32420w;
    public final Bitmap f32421x;
    public float f32422y;

    public x71(Context context, boolean z10, View view, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.F = new int[4];
        this.G = new org.telegram.ui.Cells.f2(this);
        this.H = new Paint(1);
        this.f32413a = p6Var;
        this.f32418r = new RectF();
        if (z10) {
            Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), Bitmap.Config.ARGB_4444);
            this.f32421x = createBitmap;
            this.f32420w = new Canvas(createBitmap);
        }
        this.E = view;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        Paint paint = new Paint(1);
        this.f32415c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setColor(0);
        paint.setStrokeCap(Paint.Cap.ROUND);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        paint.setXfermode(new PorterDuffXfermode(mode));
        Paint paint2 = new Paint(1);
        this.f32414b = paint2;
        paint2.setColor(0);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.e = new Paint(1);
    }

    private void setProgress(float f7) {
        if (this.f32422y == f7) {
            return;
        }
        this.f32422y = f7;
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f32419s) {
            return;
        }
        this.f32419s = z10;
        float f7 = 0.0f;
        if (z11) {
            if (z10) {
                f7 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, this.G, f7);
            this.D = ofFloat;
            ofFloat.setDuration(300L);
            this.D.start();
            return;
        }
        ObjectAnimator objectAnimator = this.D;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (z10) {
            f7 = 1.0f;
        }
        this.f32422y = f7;
        invalidate();
    }

    public final void b(int i10, int i11) {
        if (this.F == null) {
            this.F = new int[4];
        }
        this.F[i10] = i11;
        invalidate();
    }

    public TextPaint getTextPaint() {
        return this.d;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        boolean g10;
        float f7;
        float f10;
        float f11;
        Paint paint2;
        Canvas canvas2 = canvas;
        RectF rectF = this.f32418r;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        View view = this.E;
        org.telegram.ui.ActionBar.p6 p6Var = this.f32413a;
        org.telegram.ui.ActionBar.t6.t(this, view, p6Var);
        float measuredHeight = getMeasuredHeight() / 2;
        float measuredHeight2 = getMeasuredHeight() / 2;
        if (p6Var != null) {
            paint = p6Var.d("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.t6.V0("paintChatActionBackground");
        }
        canvas2.drawRoundRect(rectF, measuredHeight, measuredHeight2, paint);
        if (p6Var == null) {
            g10 = org.telegram.ui.ActionBar.t6.d1();
        } else {
            g10 = p6Var.g();
        }
        if (g10) {
            float measuredHeight3 = getMeasuredHeight() / 2;
            float measuredHeight4 = getMeasuredHeight() / 2;
            if (p6Var != null) {
                paint2 = p6Var.d("paintChatActionBackgroundDarken");
            } else {
                paint2 = null;
            }
            if (paint2 == null) {
                paint2 = org.telegram.ui.ActionBar.t6.V0("paintChatActionBackgroundDarken");
            }
            canvas2.drawRoundRect(rectF, measuredHeight3, measuredHeight4, paint2);
        }
        if (this.I > 0.0f) {
            canvas2.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, this.H);
        }
        int i10 = org.telegram.ui.ActionBar.t6.Wc;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        TextPaint textPaint = this.d;
        textPaint.setColor(w02);
        int y3 = org.telegram.messenger.z20.y(28.0f, getMeasuredWidth() - this.h, 2);
        canvas2.drawText(this.f32416f, org.telegram.messenger.i0.L(28.0f) + y3, org.telegram.messenger.i0.L(21.0f), textPaint);
        canvas2.save();
        canvas2.translate(y3, org.telegram.messenger.i0.L(7.0f));
        Bitmap bitmap = this.f32421x;
        int i11 = 0;
        Paint paint3 = this.e;
        if (bitmap != null) {
            float f12 = this.f32422y;
            if (f12 <= 0.5f) {
                f7 = f12 / 0.5f;
                f10 = f7;
            } else {
                f7 = 2.0f - (f12 / 0.5f);
                f10 = 1.0f;
            }
            float L = org.telegram.messenger.i0.L(1.0f) * f7;
            rectF.set(L, L, org.telegram.messenger.i0.L(18.0f) - L, org.telegram.messenger.i0.L(18.0f) - L);
            bitmap.eraseColor(0);
            paint3.setColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
            Canvas canvas3 = this.f32420w;
            canvas3.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint3);
            if (f10 != 1.0f) {
                float min = Math.min(org.telegram.messenger.i0.L(7.0f), (org.telegram.messenger.i0.L(7.0f) * f10) + L);
                rectF.set(org.telegram.messenger.i0.L(2.0f) + min, org.telegram.messenger.i0.L(2.0f) + min, org.telegram.messenger.i0.L(16.0f) - min, org.telegram.messenger.i0.L(16.0f) - min);
                canvas3.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, this.f32414b);
            }
            if (this.f32422y > 0.5f) {
                Paint paint4 = this.f32415c;
                canvas3.drawLine(org.telegram.messenger.i0.L(7.3f), org.telegram.messenger.i0.L(13.0f), (int) (org.telegram.messenger.i0.L(7.3f) - (org.telegram.messenger.i0.L(2.5f) * f11)), (int) (org.telegram.messenger.i0.L(13.0f) - (org.telegram.messenger.i0.L(2.5f) * (1.0f - f7))), paint4);
                canvas3.drawLine(org.telegram.messenger.i0.L(7.3f), org.telegram.messenger.i0.L(13.0f), (int) ((org.telegram.messenger.i0.L(6.0f) * f11) + org.telegram.messenger.i0.L(7.3f)), (int) (org.telegram.messenger.i0.L(13.0f) - (org.telegram.messenger.i0.L(6.0f) * f11)), paint4);
            }
            canvas2.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        } else {
            rectF.set(0.0f, 0.0f, org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f));
            int[] iArr = this.F;
            if (iArr[3] != 0) {
                while (i11 < 4) {
                    paint3.setColor(this.F[i11]);
                    RectF rectF2 = rectF;
                    canvas2.drawArc(rectF2, (i11 * 90) - 90, 90.0f, true, paint3);
                    i11++;
                    rectF = rectF2;
                    canvas2 = canvas;
                }
            } else {
                RectF rectF3 = rectF;
                if (iArr[2] != 0) {
                    while (i11 < 3) {
                        paint3.setColor(this.F[i11]);
                        RectF rectF4 = rectF3;
                        canvas.drawArc(rectF4, (i11 * 120) - 90, 120.0f, true, paint3);
                        rectF3 = rectF4;
                        i11++;
                    }
                } else if (iArr[1] != 0) {
                    while (i11 < 2) {
                        paint3.setColor(this.F[i11]);
                        RectF rectF5 = rectF3;
                        canvas.drawArc(rectF5, (i11 * 180) - 90, 180.0f, true, paint3);
                        i11++;
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(org.telegram.messenger.z20.B(56.0f, this.f32417n, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), 1073741824));
    }

    public void setDimAmount(float f7) {
        this.I = f7;
        this.H.setColor(i0.b.o(-16777216, (int) (f7 * 255.0f)));
        invalidate();
    }
}
