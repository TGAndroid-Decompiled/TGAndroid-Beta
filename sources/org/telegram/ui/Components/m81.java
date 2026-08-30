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
public final class m81 extends View {
    public final View B;
    public int[] C;
    public final org.telegram.ui.Cells.c2 D;
    public final Paint E;
    public float F;
    public final org.telegram.ui.ActionBar.f6 f26981a;
    public final Paint f26982b;
    public final Paint f26983c;
    public final TextPaint d;
    public final Paint e;
    public String f26984f;
    public int h;
    public int f26985n;
    public final RectF f26986r;
    public boolean f26987s;
    public final Canvas v;
    public final Bitmap f26988w;
    public float f26989x;
    public ObjectAnimator f26990y;

    public m81(Context context, boolean z4, View view, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.C = new int[4];
        this.D = new org.telegram.ui.Cells.c2(this);
        this.E = new Paint(1);
        this.f26981a = f6Var;
        this.f26986r = new RectF();
        if (z4) {
            Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Bitmap.Config.ARGB_4444);
            this.f26988w = createBitmap;
            this.v = new Canvas(createBitmap);
        }
        this.B = view;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        Paint paint = new Paint(1);
        this.f26983c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(0);
        paint.setStrokeCap(Paint.Cap.ROUND);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        paint.setXfermode(new PorterDuffXfermode(mode));
        Paint paint2 = new Paint(1);
        this.f26982b = paint2;
        paint2.setColor(0);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.e = new Paint(1);
    }

    private void setProgress(float f10) {
        if (this.f26989x == f10) {
            return;
        }
        this.f26989x = f10;
        invalidate();
    }

    public final void a(boolean z4, boolean z10) {
        if (z4 == this.f26987s) {
            return;
        }
        this.f26987s = z4;
        float f10 = 0.0f;
        if (z10) {
            if (z4) {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, this.D, f10);
            this.f26990y = ofFloat;
            ofFloat.setDuration(300L);
            this.f26990y.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f26990y;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (z4) {
            f10 = 1.0f;
        }
        this.f26989x = f10;
        invalidate();
    }

    public final void b(int i10, int i11) {
        if (this.C == null) {
            this.C = new int[4];
        }
        this.C[i10] = i11;
        invalidate();
    }

    public TextPaint getTextPaint() {
        return this.d;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        boolean m0;
        float f10;
        float f11;
        float f12;
        Paint paint2;
        Canvas canvas2 = canvas;
        RectF rectF = this.f26986r;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        View view = this.B;
        org.telegram.ui.ActionBar.f6 f6Var = this.f26981a;
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
            m0 = org.telegram.ui.ActionBar.j6.a1();
        } else {
            m0 = f6Var.m0();
        }
        if (m0) {
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
        if (this.F > 0.0f) {
            canvas2.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, this.E);
        }
        int i10 = org.telegram.ui.ActionBar.j6.ic;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        TextPaint textPaint = this.d;
        textPaint.setColor(v02);
        int x10 = org.telegram.ui.b.x(28.0f, getMeasuredWidth() - this.h, 2);
        canvas2.drawText(this.f26984f, AndroidUtilities.dp(28.0f) + x10, AndroidUtilities.dp(21.0f), textPaint);
        canvas2.save();
        canvas2.translate(x10, AndroidUtilities.dp(7.0f));
        Bitmap bitmap = this.f26988w;
        int i11 = 0;
        Paint paint3 = this.e;
        if (bitmap != null) {
            float f13 = this.f26989x;
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
            paint3.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
            Canvas canvas3 = this.v;
            canvas3.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint3);
            if (f11 != 1.0f) {
                float min = Math.min(AndroidUtilities.dp(7.0f), (AndroidUtilities.dp(7.0f) * f11) + dp);
                rectF.set(AndroidUtilities.dp(2.0f) + min, AndroidUtilities.dp(2.0f) + min, AndroidUtilities.dp(16.0f) - min, AndroidUtilities.dp(16.0f) - min);
                canvas3.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, this.f26982b);
            }
            if (this.f26989x > 0.5f) {
                Paint paint4 = this.f26983c;
                canvas3.drawLine(AndroidUtilities.dp(7.3f), AndroidUtilities.dp(13.0f), (int) (AndroidUtilities.dp(7.3f) - (AndroidUtilities.dp(2.5f) * f12)), (int) (AndroidUtilities.dp(13.0f) - (AndroidUtilities.dp(2.5f) * (1.0f - f10))), paint4);
                canvas3.drawLine(AndroidUtilities.dp(7.3f), AndroidUtilities.dp(13.0f), (int) ((AndroidUtilities.dp(6.0f) * f12) + AndroidUtilities.dp(7.3f)), (int) (AndroidUtilities.dp(13.0f) - (AndroidUtilities.dp(6.0f) * f12)), paint4);
            }
            canvas2.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        } else {
            rectF.set(0.0f, 0.0f, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
            int[] iArr = this.C;
            if (iArr[3] != 0) {
                while (i11 < 4) {
                    paint3.setColor(this.C[i11]);
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
                        paint3.setColor(this.C[i11]);
                        RectF rectF4 = rectF3;
                        canvas.drawArc(rectF4, (i11 * 120) - 90, 120.0f, true, paint3);
                        rectF3 = rectF4;
                        i11++;
                    }
                } else if (iArr[1] != 0) {
                    while (i11 < 2) {
                        paint3.setColor(this.C[i11]);
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
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(org.telegram.ui.b.B(56.0f, this.f26985n, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }

    public void setDimAmount(float f10) {
        this.F = f10;
        this.E.setColor(i0.a.k(-16777216, (int) (f10 * 255.0f)));
        invalidate();
    }
}
