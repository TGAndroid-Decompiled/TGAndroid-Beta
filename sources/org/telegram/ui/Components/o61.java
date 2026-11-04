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
public final class o61 extends View {
    public ObjectAnimator E;
    public final View F;
    public int[] G;
    public final org.telegram.ui.Cells.f2 H;
    public final Paint I;
    public float J;
    public final org.telegram.ui.ActionBar.e6 f36760a;
    public final Paint f36761b;
    public final Paint f36762c;
    public final TextPaint d;
    public final Paint f36763e;
    public String f36764f;
    public int h;
    public int f36765n;
    public final RectF f36766r;
    public boolean f36767s;
    public final Canvas f36768w;
    public final Bitmap f36769x;
    public float f36770y;

    public o61(Context context, boolean z10, View view, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.G = new int[4];
        this.H = new org.telegram.ui.Cells.f2(this);
        this.I = new Paint(1);
        this.f36760a = e6Var;
        this.f36766r = new RectF();
        if (z10) {
            Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), Bitmap.Config.ARGB_4444);
            this.f36769x = createBitmap;
            this.f36768w = new Canvas(createBitmap);
        }
        this.F = view;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        Paint paint = new Paint(1);
        this.f36762c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setColor(0);
        paint.setStrokeCap(Paint.Cap.ROUND);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        paint.setXfermode(new PorterDuffXfermode(mode));
        Paint paint2 = new Paint(1);
        this.f36761b = paint2;
        paint2.setColor(0);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f36763e = new Paint(1);
    }

    private void setProgress(float f10) {
        if (this.f36770y == f10) {
            return;
        }
        this.f36770y = f10;
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f36767s) {
            return;
        }
        this.f36767s = z10;
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
        this.f36770y = f10;
        invalidate();
    }

    public final void b(int i3, int i10) {
        if (this.G == null) {
            this.G = new int[4];
        }
        this.G[i3] = i10;
        invalidate();
    }

    public TextPaint getTextPaint() {
        return this.d;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        boolean g7;
        float f10;
        float f11;
        float f12;
        Paint paint2;
        Canvas canvas2 = canvas;
        RectF rectF = this.f36766r;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        View view = this.F;
        org.telegram.ui.ActionBar.e6 e6Var = this.f36760a;
        org.telegram.ui.ActionBar.k6.t(this, view, e6Var);
        float measuredHeight = getMeasuredHeight() / 2;
        float measuredHeight2 = getMeasuredHeight() / 2;
        if (e6Var != null) {
            paint = e6Var.d("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.k6.V0("paintChatActionBackground");
        }
        canvas2.drawRoundRect(rectF, measuredHeight, measuredHeight2, paint);
        if (e6Var == null) {
            g7 = org.telegram.ui.ActionBar.k6.d1();
        } else {
            g7 = e6Var.g();
        }
        if (g7) {
            float measuredHeight3 = getMeasuredHeight() / 2;
            float measuredHeight4 = getMeasuredHeight() / 2;
            if (e6Var != null) {
                paint2 = e6Var.d("paintChatActionBackgroundDarken");
            } else {
                paint2 = null;
            }
            if (paint2 == null) {
                paint2 = org.telegram.ui.ActionBar.k6.V0("paintChatActionBackgroundDarken");
            }
            canvas2.drawRoundRect(rectF, measuredHeight3, measuredHeight4, paint2);
        }
        if (this.J > 0.0f) {
            canvas2.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, this.I);
        }
        int i3 = org.telegram.ui.ActionBar.k6.Wc;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        TextPaint textPaint = this.d;
        textPaint.setColor(w02);
        int y9 = org.telegram.messenger.camera.q.y(28.0f, getMeasuredWidth() - this.h, 2);
        canvas2.drawText(this.f36764f, org.telegram.messenger.g0.L(28.0f) + y9, org.telegram.messenger.g0.L(21.0f), textPaint);
        canvas2.save();
        canvas2.translate(y9, org.telegram.messenger.g0.L(7.0f));
        Bitmap bitmap = this.f36769x;
        int i10 = 0;
        Paint paint3 = this.f36763e;
        if (bitmap != null) {
            float f13 = this.f36770y;
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
            paint3.setColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
            Canvas canvas3 = this.f36768w;
            canvas3.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint3);
            if (f11 != 1.0f) {
                float min = Math.min(org.telegram.messenger.g0.L(7.0f), (org.telegram.messenger.g0.L(7.0f) * f11) + L);
                rectF.set(org.telegram.messenger.g0.L(2.0f) + min, org.telegram.messenger.g0.L(2.0f) + min, org.telegram.messenger.g0.L(16.0f) - min, org.telegram.messenger.g0.L(16.0f) - min);
                canvas3.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, this.f36761b);
            }
            if (this.f36770y > 0.5f) {
                Paint paint4 = this.f36762c;
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(org.telegram.messenger.camera.q.B(56.0f, this.f36765n, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
    }

    public void setDimAmount(float f10) {
        this.J = f10;
        this.I.setColor(i0.a.o(-16777216, (int) (f10 * 255.0f)));
        invalidate();
    }
}
