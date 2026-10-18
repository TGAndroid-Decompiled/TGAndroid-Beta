package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class nu0 extends View {
    public final Paint f39579a;
    public final TextPaint f39580b;
    public int f39581c;
    public int d;
    public int e;
    public int f39582f;
    public final String h;
    public final String f39583n;
    public int f39584r;
    public final PhotoViewer f39585s;

    public nu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f39585s = photoViewer;
        this.f39579a = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f39580b = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setColor(-3289651);
        this.h = LocaleController.getString("AccDescrVideoCompressLow", R.string.AccDescrVideoCompressLow);
        this.f39583n = LocaleController.getString("AccDescrVideoCompressHigh", R.string.AccDescrVideoCompressHigh);
        setImportantForAccessibility(1);
        setFocusable(true);
        setAccessibilityDelegate(new mu0(this));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        if (this.f39585s.Z7 != 1) {
            this.f39582f = (((getMeasuredWidth() - (this.f39581c * this.f39585s.Z7)) - (((this.f39585s.Z7 * 2) - 2) * this.d)) - (this.e * 2)) / (this.f39585s.Z7 - 1);
        } else {
            this.f39582f = ((getMeasuredWidth() - (this.f39581c * this.f39585s.Z7)) - (this.d * 2)) - (this.e * 2);
        }
        int dp = AndroidUtilities.dp(6.0f) + (getMeasuredHeight() / 2);
        for (int i11 = 0; i11 < this.f39585s.Z7; i11++) {
            int i12 = this.e;
            int i13 = (this.d * 2) + this.f39582f;
            int i14 = this.f39581c;
            int i15 = (i14 / 2) + ((i13 + i14) * i11) + i12;
            if (i11 <= this.f39585s.Y7) {
                this.f39579a.setColor(-11292945);
            } else {
                this.f39579a.setColor(1728053247);
            }
            float f10 = i15;
            float f11 = dp;
            if (i11 == this.f39585s.Y7) {
                i10 = AndroidUtilities.dp(6.0f);
            } else {
                i10 = this.f39581c / 2;
            }
            canvas.drawCircle(f10, f11, i10, this.f39579a);
            if (i11 != 0) {
                int i16 = ((i15 - (this.f39581c / 2)) - this.d) - this.f39582f;
                float f12 = 0.0f;
                if (i11 == this.f39585s.Y7 + 1) {
                    f7 = AndroidUtilities.dpf2(2.0f);
                } else {
                    f7 = 0.0f;
                }
                if (i11 == this.f39585s.Y7) {
                    f12 = AndroidUtilities.dpf2(2.0f);
                }
                canvas.drawRect(f7 + i16, dp - AndroidUtilities.dp(1.0f), (i16 + this.f39582f) - f12, AndroidUtilities.dp(2.0f) + dp, this.f39579a);
            }
        }
        canvas.drawText(this.h, this.e, dp - AndroidUtilities.dp(16.0f), this.f39580b);
        canvas.drawText(this.f39583n, (getMeasuredWidth() - this.e) - this.f39580b.measureText(this.f39583n), dp - AndroidUtilities.dp(16.0f), this.f39580b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f39581c = AndroidUtilities.dp(8.0f);
        this.d = AndroidUtilities.dp(2.0f);
        this.e = AndroidUtilities.dp(18.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.f39584r = this.f39585s.Y7;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        int i10 = 0;
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            while (true) {
                if (i10 >= this.f39585s.Z7) {
                    break;
                }
                int i11 = this.e;
                int i12 = this.f39582f;
                int i13 = this.d;
                int i14 = this.f39581c;
                int i15 = i14 / 2;
                int i16 = (((i13 * 2) + i12 + i14) * i10) + i11 + i15;
                int i17 = (i12 / 2) + i15 + i13;
                if (x10 > i16 - i17 && x10 < i16 + i17) {
                    if (this.f39585s.Y7 != i10) {
                        this.f39585s.Y7 = i10;
                        this.f39585s.S0();
                        invalidate();
                        return true;
                    }
                } else {
                    i10++;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.f39585s.Y7 != this.f39584r) {
                this.f39585s.p2(1);
            }
            this.f39585s.L6 = false;
            return true;
        }
        return true;
    }
}
