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

public final class q71 extends View {
    public final View A;
    public int[] B;
    public final org.telegram.ui.Cells.b2 C;
    public final Paint D;
    public float E;

    public final org.telegram.ui.ActionBar.c6 f31820a;

    public final Paint f31821b;

    public final Paint f31822c;
    public final TextPaint d;

    public final Paint f31823e;

    public String f31824f;
    public int h;

    public int f31825n;

    public final RectF f31826r;

    public boolean f31827s;
    public final Canvas v;

    public final Bitmap f31828w;

    public float f31829x;

    public ObjectAnimator f31830y;

    public q71(Context context, boolean z10, View view, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.B = new int[4];
        this.C = new org.telegram.ui.Cells.b2(this);
        this.D = new Paint(1);
        this.f31820a = c6Var;
        this.f31826r = new RectF();
        if (z10) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Bitmap.Config.ARGB_4444);
            this.f31828w = bitmapCreateBitmap;
            this.v = new Canvas(bitmapCreateBitmap);
        }
        this.A = view;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        Paint paint = new Paint(1);
        this.f31822c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(0);
        paint.setStrokeCap(Paint.Cap.ROUND);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        paint.setXfermode(new PorterDuffXfermode(mode));
        Paint paint2 = new Paint(1);
        this.f31821b = paint2;
        paint2.setColor(0);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f31823e = new Paint(1);
    }

    private void setProgress(float f10) {
        if (this.f31829x == f10) {
            return;
        }
        this.f31829x = f10;
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f31827s) {
            return;
        }
        this.f31827s = z10;
        if (z11) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, this.C, z10 ? 1.0f : 0.0f);
            this.f31830y = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(300L);
            this.f31830y.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f31830y;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f31829x = z10 ? 1.0f : 0.0f;
        invalidate();
    }

    public final void b(int i10, int i11) {
        if (this.B == null) {
            this.B = new int[4];
        }
        this.B[i10] = i11;
        invalidate();
    }

    public TextPaint getTextPaint() {
        return this.d;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        Canvas canvas2 = canvas;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.f31826r;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        View view = this.A;
        org.telegram.ui.ActionBar.c6 c6Var = this.f31820a;
        org.telegram.ui.ActionBar.g6.s(this, view, c6Var);
        float measuredHeight2 = getMeasuredHeight() / 2;
        float measuredHeight3 = getMeasuredHeight() / 2;
        Paint paintN = c6Var != null ? c6Var.N("paintChatActionBackground") : null;
        if (paintN == null) {
            paintN = org.telegram.ui.ActionBar.g6.S0("paintChatActionBackground");
        }
        canvas2.drawRoundRect(rectF, measuredHeight2, measuredHeight3, paintN);
        if (c6Var == null ? org.telegram.ui.ActionBar.g6.a1() : c6Var.u0()) {
            float measuredHeight4 = getMeasuredHeight() / 2;
            float measuredHeight5 = getMeasuredHeight() / 2;
            Paint paintN2 = c6Var != null ? c6Var.N("paintChatActionBackgroundDarken") : null;
            if (paintN2 == null) {
                paintN2 = org.telegram.ui.ActionBar.g6.S0("paintChatActionBackgroundDarken");
            }
            canvas2.drawRoundRect(rectF, measuredHeight4, measuredHeight5, paintN2);
        }
        if (this.E > 0.0f) {
            canvas2.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, this.D);
        }
        int i10 = org.telegram.ui.ActionBar.g6.f23150ic;
        int iV0 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        TextPaint textPaint = this.d;
        textPaint.setColor(iV0);
        int iX = org.telegram.messenger.rl.x(28.0f, getMeasuredWidth() - this.h, 2);
        canvas2.drawText(this.f31824f, AndroidUtilities.dp(28.0f) + iX, AndroidUtilities.dp(21.0f), textPaint);
        canvas2.save();
        canvas2.translate(iX, AndroidUtilities.dp(7.0f));
        Bitmap bitmap = this.f31828w;
        int i11 = 0;
        Paint paint = this.f31823e;
        if (bitmap != null) {
            float f12 = this.f31829x;
            if (f12 <= 0.5f) {
                f10 = f12 / 0.5f;
                f11 = f10;
            } else {
                f10 = 2.0f - (f12 / 0.5f);
                f11 = 1.0f;
            }
            float fDp = AndroidUtilities.dp(1.0f) * f10;
            rectF.set(fDp, fDp, AndroidUtilities.dp(18.0f) - fDp, AndroidUtilities.dp(18.0f) - fDp);
            bitmap.eraseColor(0);
            paint.setColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
            float fWidth = rectF.width() / 2.0f;
            float fHeight = rectF.height() / 2.0f;
            Canvas canvas3 = this.v;
            canvas3.drawRoundRect(rectF, fWidth, fHeight, paint);
            if (f11 != 1.0f) {
                float fMin = Math.min(AndroidUtilities.dp(7.0f), (AndroidUtilities.dp(7.0f) * f11) + fDp);
                rectF.set(AndroidUtilities.dp(2.0f) + fMin, AndroidUtilities.dp(2.0f) + fMin, AndroidUtilities.dp(16.0f) - fMin, AndroidUtilities.dp(16.0f) - fMin);
                canvas3.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, this.f31821b);
            }
            if (this.f31829x > 0.5f) {
                float f13 = 1.0f - f10;
                int iDp = (int) (AndroidUtilities.dp(7.3f) - (AndroidUtilities.dp(2.5f) * f13));
                int iDp2 = (int) (AndroidUtilities.dp(13.0f) - (AndroidUtilities.dp(2.5f) * f13));
                Paint paint2 = this.f31822c;
                canvas3.drawLine(AndroidUtilities.dp(7.3f), AndroidUtilities.dp(13.0f), iDp, iDp2, paint2);
                canvas3.drawLine(AndroidUtilities.dp(7.3f), AndroidUtilities.dp(13.0f), (int) ((AndroidUtilities.dp(6.0f) * f13) + AndroidUtilities.dp(7.3f)), (int) (AndroidUtilities.dp(13.0f) - (AndroidUtilities.dp(6.0f) * f13)), paint2);
            }
            canvas2.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        } else {
            rectF.set(0.0f, 0.0f, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
            int[] iArr = this.B;
            if (iArr[3] != 0) {
                while (i11 < 4) {
                    paint.setColor(this.B[i11]);
                    RectF rectF2 = rectF;
                    canvas2.drawArc(rectF2, (i11 * 90) - 90, 90.0f, true, paint);
                    i11++;
                    rectF = rectF2;
                    canvas2 = canvas;
                }
            } else {
                RectF rectF3 = rectF;
                if (iArr[2] != 0) {
                    while (i11 < 3) {
                        paint.setColor(this.B[i11]);
                        RectF rectF4 = rectF3;
                        canvas.drawArc(rectF4, (i11 * 120) - 90, 120.0f, true, paint);
                        rectF3 = rectF4;
                        i11++;
                    }
                } else if (iArr[1] != 0) {
                    while (i11 < 2) {
                        paint.setColor(this.B[i11]);
                        RectF rectF5 = rectF3;
                        canvas.drawArc(rectF5, (i11 * 180) - 90, 180.0f, true, paint);
                        i11++;
                        rectF3 = rectF5;
                    }
                } else {
                    canvas2 = canvas;
                    paint.setColor(iArr[0]);
                    canvas2.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.height() / 2.0f, paint);
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
        super.onMeasure(org.telegram.messenger.rl.B(56.0f, this.f31825n, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }

    public void setDimAmount(float f10) {
        this.E = f10;
        this.D.setColor(i0.b.k(-16777216, (int) (f10 * 255.0f)));
        invalidate();
    }
}
