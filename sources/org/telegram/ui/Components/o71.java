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
public final class o71 extends View {
    public final View A;
    public int[] B;
    public final org.telegram.ui.Cells.c2 C;
    public final Paint D;
    public float E;
    public final org.telegram.ui.ActionBar.b6 f31310a;
    public final Paint f31311b;
    public final Paint f31312c;
    public final TextPaint d;
    public final Paint f31313e;
    public String f31314f;
    public int h;
    public int f31315n;
    public final RectF f31316r;
    public boolean f31317s;
    public final Canvas v;
    public final Bitmap f31318w;
    public float f31319x;
    public ObjectAnimator f31320y;

    public o71(Context context, boolean z10, View view, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.B = new int[4];
        this.C = new org.telegram.ui.Cells.c2(this);
        this.D = new Paint(1);
        this.f31310a = b6Var;
        this.f31316r = new RectF();
        if (z10) {
            Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Bitmap.Config.ARGB_4444);
            this.f31318w = createBitmap;
            this.v = new Canvas(createBitmap);
        }
        this.A = view;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        Paint paint = new Paint(1);
        this.f31312c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(0);
        paint.setStrokeCap(Paint.Cap.ROUND);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        paint.setXfermode(new PorterDuffXfermode(mode));
        Paint paint2 = new Paint(1);
        this.f31311b = paint2;
        paint2.setColor(0);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f31313e = new Paint(1);
    }

    private void setProgress(float f10) {
        if (this.f31319x == f10) {
            return;
        }
        this.f31319x = f10;
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.f31317s) {
            return;
        }
        this.f31317s = z10;
        float f10 = 0.0f;
        if (z11) {
            if (z10) {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, this.C, f10);
            this.f31320y = ofFloat;
            ofFloat.setDuration(300L);
            this.f31320y.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f31320y;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (z10) {
            f10 = 1.0f;
        }
        this.f31319x = f10;
        invalidate();
    }

    public final void b(int i9, int i10) {
        if (this.B == null) {
            this.B = new int[4];
        }
        this.B[i9] = i10;
        invalidate();
    }

    public TextPaint getTextPaint() {
        return this.d;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        boolean t02;
        float f10;
        float f11;
        float f12;
        Paint paint2;
        Canvas canvas2 = canvas;
        RectF rectF = this.f31316r;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        View view = this.A;
        org.telegram.ui.ActionBar.b6 b6Var = this.f31310a;
        org.telegram.ui.ActionBar.f6.s(this, view, b6Var);
        float measuredHeight = getMeasuredHeight() / 2;
        float measuredHeight2 = getMeasuredHeight() / 2;
        if (b6Var != null) {
            paint = b6Var.O("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.f6.S0("paintChatActionBackground");
        }
        canvas2.drawRoundRect(rectF, measuredHeight, measuredHeight2, paint);
        if (b6Var == null) {
            t02 = org.telegram.ui.ActionBar.f6.a1();
        } else {
            t02 = b6Var.t0();
        }
        if (t02) {
            float measuredHeight3 = getMeasuredHeight() / 2;
            float measuredHeight4 = getMeasuredHeight() / 2;
            if (b6Var != null) {
                paint2 = b6Var.O("paintChatActionBackgroundDarken");
            } else {
                paint2 = null;
            }
            if (paint2 == null) {
                paint2 = org.telegram.ui.ActionBar.f6.S0("paintChatActionBackgroundDarken");
            }
            canvas2.drawRoundRect(rectF, measuredHeight3, measuredHeight4, paint2);
        }
        if (this.E > 0.0f) {
            canvas2.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, this.D);
        }
        int i9 = org.telegram.ui.ActionBar.f6.f23097ic;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
        TextPaint textPaint = this.d;
        textPaint.setColor(v02);
        int y10 = org.telegram.messenger.ll.y(28.0f, getMeasuredWidth() - this.h, 2);
        canvas2.drawText(this.f31314f, AndroidUtilities.dp(28.0f) + y10, AndroidUtilities.dp(21.0f), textPaint);
        canvas2.save();
        canvas2.translate(y10, AndroidUtilities.dp(7.0f));
        Bitmap bitmap = this.f31318w;
        int i10 = 0;
        Paint paint3 = this.f31313e;
        if (bitmap != null) {
            float f13 = this.f31319x;
            if (f13 <= 0.5f) {
                f10 = f13 / 0.5f;
                f11 = f10;
            } else {
                f10 = 2.0f - (f13 / 0.5f);
                f11 = 1.0f;
            }
            float dp = AndroidUtilities.dp(1.0f) * f10;
            rectF.set(dp, dp, AndroidUtilities.dp(18.0f) - dp, AndroidUtilities.dp(18.0f) - dp);
            bitmap.eraseColor(0);
            paint3.setColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
            Canvas canvas3 = this.v;
            canvas3.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint3);
            if (f11 != 1.0f) {
                float min = Math.min(AndroidUtilities.dp(7.0f), (AndroidUtilities.dp(7.0f) * f11) + dp);
                rectF.set(AndroidUtilities.dp(2.0f) + min, AndroidUtilities.dp(2.0f) + min, AndroidUtilities.dp(16.0f) - min, AndroidUtilities.dp(16.0f) - min);
                canvas3.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, this.f31311b);
            }
            if (this.f31319x > 0.5f) {
                Paint paint4 = this.f31312c;
                canvas3.drawLine(AndroidUtilities.dp(7.3f), AndroidUtilities.dp(13.0f), (int) (AndroidUtilities.dp(7.3f) - (AndroidUtilities.dp(2.5f) * f12)), (int) (AndroidUtilities.dp(13.0f) - (AndroidUtilities.dp(2.5f) * (1.0f - f10))), paint4);
                canvas3.drawLine(AndroidUtilities.dp(7.3f), AndroidUtilities.dp(13.0f), (int) ((AndroidUtilities.dp(6.0f) * f12) + AndroidUtilities.dp(7.3f)), (int) (AndroidUtilities.dp(13.0f) - (AndroidUtilities.dp(6.0f) * f12)), paint4);
            }
            canvas2.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        } else {
            rectF.set(0.0f, 0.0f, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
            int[] iArr = this.B;
            if (iArr[3] != 0) {
                while (i10 < 4) {
                    paint3.setColor(this.B[i10]);
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
                        paint3.setColor(this.B[i10]);
                        RectF rectF4 = rectF3;
                        canvas.drawArc(rectF4, (i10 * 120) - 90, 120.0f, true, paint3);
                        rectF3 = rectF4;
                        i10++;
                    }
                } else if (iArr[1] != 0) {
                    while (i10 < 2) {
                        paint3.setColor(this.B[i10]);
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(org.telegram.messenger.ll.C(56.0f, this.f31315n, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }

    public void setDimAmount(float f10) {
        this.E = f10;
        this.D.setColor(i0.a.k(-16777216, (int) (f10 * 255.0f)));
        invalidate();
    }
}
