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
import org.telegram.messenger.AndroidUtilities;
public final class j81 extends View {
    public final View E;
    public int[] F;
    public final org.telegram.ui.Cells.c2 G;
    public final Paint H;
    public float I;
    public final org.telegram.ui.ActionBar.f6 f27380a;
    public final Paint f27381b;
    public final Paint f27382c;
    public final TextPaint d;
    public final Paint f27383e;
    public String f27384f;
    public int h;
    public int f27385n;
    public final RectF f27386r;
    public boolean f27387s;
    public final Canvas v;
    public final Bitmap f27388w;
    public float f27389x;
    public ObjectAnimator f27390y;

    public j81(Context context, boolean z10, View view, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.F = new int[4];
        this.G = new org.telegram.ui.Cells.c2(this);
        this.H = new Paint(1);
        this.f27380a = f6Var;
        this.f27386r = new RectF();
        if (z10) {
            Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Bitmap.Config.ARGB_4444);
            this.f27388w = createBitmap;
            this.v = new Canvas(createBitmap);
        }
        this.E = view;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        Paint paint = new Paint(1);
        this.f27382c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(0);
        paint.setStrokeCap(Paint.Cap.ROUND);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        paint.setXfermode(new PorterDuffXfermode(mode));
        Paint paint2 = new Paint(1);
        this.f27381b = paint2;
        paint2.setColor(0);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f27383e = new Paint(1);
    }

    private void setProgress(float f7) {
        if (this.f27389x == f7) {
            return;
        }
        this.f27389x = f7;
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f27387s) {
            return;
        }
        this.f27387s = z10;
        float f7 = 0.0f;
        if (z11) {
            if (z10) {
                f7 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, this.G, f7);
            this.f27390y = ofFloat;
            ofFloat.setDuration(300L);
            this.f27390y.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f27390y;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (z10) {
            f7 = 1.0f;
        }
        this.f27389x = f7;
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
        boolean o02;
        float f7;
        float f10;
        float f11;
        Paint paint2;
        Canvas canvas2 = canvas;
        RectF rectF = this.f27386r;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        View view = this.E;
        org.telegram.ui.ActionBar.f6 f6Var = this.f27380a;
        org.telegram.ui.ActionBar.j6.s(this, view, f6Var);
        float measuredHeight = getMeasuredHeight() / 2;
        float measuredHeight2 = getMeasuredHeight() / 2;
        if (f6Var != null) {
            paint = f6Var.G("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.j6.S0("paintChatActionBackground");
        }
        canvas2.drawRoundRect(rectF, measuredHeight, measuredHeight2, paint);
        if (f6Var == null) {
            o02 = org.telegram.ui.ActionBar.j6.a1();
        } else {
            o02 = f6Var.o0();
        }
        if (o02) {
            float measuredHeight3 = getMeasuredHeight() / 2;
            float measuredHeight4 = getMeasuredHeight() / 2;
            if (f6Var != null) {
                paint2 = f6Var.G("paintChatActionBackgroundDarken");
            } else {
                paint2 = null;
            }
            if (paint2 == null) {
                paint2 = org.telegram.ui.ActionBar.j6.S0("paintChatActionBackgroundDarken");
            }
            canvas2.drawRoundRect(rectF, measuredHeight3, measuredHeight4, paint2);
        }
        if (this.I > 0.0f) {
            canvas2.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, this.H);
        }
        int i10 = org.telegram.ui.ActionBar.j6.f20759ic;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        TextPaint textPaint = this.d;
        textPaint.setColor(v02);
        int y3 = org.telegram.messenger.wl.y(28.0f, getMeasuredWidth() - this.h, 2);
        canvas2.drawText(this.f27384f, AndroidUtilities.dp(28.0f) + y3, AndroidUtilities.dp(21.0f), textPaint);
        canvas2.save();
        canvas2.translate(y3, AndroidUtilities.dp(7.0f));
        Bitmap bitmap = this.f27388w;
        int i11 = 0;
        Paint paint3 = this.f27383e;
        if (bitmap != null) {
            float f12 = this.f27389x;
            if (f12 <= 0.5f) {
                f7 = f12 / 0.5f;
                f10 = f7;
            } else {
                f7 = 2.0f - (f12 / 0.5f);
                f10 = 1.0f;
            }
            float dp = AndroidUtilities.dp(1.0f) * f7;
            rectF.set(dp, dp, AndroidUtilities.dp(18.0f) - dp, AndroidUtilities.dp(18.0f) - dp);
            bitmap.eraseColor(0);
            paint3.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
            Canvas canvas3 = this.v;
            canvas3.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint3);
            if (f10 != 1.0f) {
                float min = Math.min(AndroidUtilities.dp(7.0f), (AndroidUtilities.dp(7.0f) * f10) + dp);
                rectF.set(AndroidUtilities.dp(2.0f) + min, AndroidUtilities.dp(2.0f) + min, AndroidUtilities.dp(16.0f) - min, AndroidUtilities.dp(16.0f) - min);
                canvas3.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, this.f27381b);
            }
            if (this.f27389x > 0.5f) {
                Paint paint4 = this.f27382c;
                canvas3.drawLine(AndroidUtilities.dp(7.3f), AndroidUtilities.dp(13.0f), (int) (AndroidUtilities.dp(7.3f) - (AndroidUtilities.dp(2.5f) * f11)), (int) (AndroidUtilities.dp(13.0f) - (AndroidUtilities.dp(2.5f) * (1.0f - f7))), paint4);
                canvas3.drawLine(AndroidUtilities.dp(7.3f), AndroidUtilities.dp(13.0f), (int) ((AndroidUtilities.dp(6.0f) * f11) + AndroidUtilities.dp(7.3f)), (int) (AndroidUtilities.dp(13.0f) - (AndroidUtilities.dp(6.0f) * f11)), paint4);
            }
            canvas2.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        } else {
            rectF.set(0.0f, 0.0f, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
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
        super.onMeasure(org.telegram.messenger.wl.C(56.0f, this.f27385n, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }

    public void setDimAmount(float f7) {
        this.I = f7;
        this.H.setColor(i0.a.k(-16777216, (int) (f7 * 255.0f)));
        invalidate();
    }
}
