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
public final class bu0 extends View {
    public final Paint f36915a;
    public final TextPaint f36916b;
    public int f36917c;
    public int d;
    public int f36918e;
    public int f36919f;
    public final String h;
    public final String f36920n;
    public int f36921r;
    public final PhotoViewer f36922s;

    public bu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f36922s = photoViewer;
        this.f36915a = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f36916b = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setColor(-3289651);
        this.h = LocaleController.getString("AccDescrVideoCompressLow", R.string.AccDescrVideoCompressLow);
        this.f36920n = LocaleController.getString("AccDescrVideoCompressHigh", R.string.AccDescrVideoCompressHigh);
        setImportantForAccessibility(1);
        setFocusable(true);
        setAccessibilityDelegate(new au0(this));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f9;
        if (this.f36922s.U7 != 1) {
            this.f36919f = (((getMeasuredWidth() - (this.f36917c * this.f36922s.U7)) - (((this.f36922s.U7 * 2) - 2) * this.d)) - (this.f36918e * 2)) / (this.f36922s.U7 - 1);
        } else {
            this.f36919f = ((getMeasuredWidth() - (this.f36917c * this.f36922s.U7)) - (this.d * 2)) - (this.f36918e * 2);
        }
        int dp = AndroidUtilities.dp(6.0f) + (getMeasuredHeight() / 2);
        for (int i11 = 0; i11 < this.f36922s.U7; i11++) {
            int i12 = this.f36918e;
            int i13 = (this.d * 2) + this.f36919f;
            int i14 = this.f36917c;
            int i15 = (i14 / 2) + ((i13 + i14) * i11) + i12;
            if (i11 <= this.f36922s.T7) {
                this.f36915a.setColor(-11292945);
            } else {
                this.f36915a.setColor(1728053247);
            }
            float f10 = i15;
            float f11 = dp;
            if (i11 == this.f36922s.T7) {
                i10 = AndroidUtilities.dp(6.0f);
            } else {
                i10 = this.f36917c / 2;
            }
            canvas.drawCircle(f10, f11, i10, this.f36915a);
            if (i11 != 0) {
                int i16 = ((i15 - (this.f36917c / 2)) - this.d) - this.f36919f;
                float f12 = 0.0f;
                if (i11 == this.f36922s.T7 + 1) {
                    f9 = AndroidUtilities.dpf2(2.0f);
                } else {
                    f9 = 0.0f;
                }
                if (i11 == this.f36922s.T7) {
                    f12 = AndroidUtilities.dpf2(2.0f);
                }
                canvas.drawRect(f9 + i16, dp - AndroidUtilities.dp(1.0f), (i16 + this.f36919f) - f12, AndroidUtilities.dp(2.0f) + dp, this.f36915a);
            }
        }
        canvas.drawText(this.h, this.f36918e, dp - AndroidUtilities.dp(16.0f), this.f36916b);
        canvas.drawText(this.f36920n, (getMeasuredWidth() - this.f36918e) - this.f36916b.measureText(this.f36920n), dp - AndroidUtilities.dp(16.0f), this.f36916b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f36917c = AndroidUtilities.dp(8.0f);
        this.d = AndroidUtilities.dp(2.0f);
        this.f36918e = AndroidUtilities.dp(18.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x4 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.f36921r = this.f36922s.T7;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        int i10 = 0;
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            while (true) {
                if (i10 >= this.f36922s.U7) {
                    break;
                }
                int i11 = this.f36918e;
                int i12 = this.f36919f;
                int i13 = this.d;
                int i14 = this.f36917c;
                int i15 = i14 / 2;
                int i16 = (((i13 * 2) + i12 + i14) * i10) + i11 + i15;
                int i17 = (i12 / 2) + i15 + i13;
                if (x4 > i16 - i17 && x4 < i16 + i17) {
                    if (this.f36922s.T7 != i10) {
                        this.f36922s.T7 = i10;
                        this.f36922s.R0();
                        invalidate();
                        return true;
                    }
                } else {
                    i10++;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.f36922s.T7 != this.f36921r) {
                this.f36922s.p2(1);
            }
            this.f36922s.H6 = false;
            return true;
        }
        return true;
    }
}
