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
public final class du0 extends View {
    public final Paint f37605a;
    public final TextPaint f37606b;
    public int f37607c;
    public int d;
    public int f37608e;
    public int f37609f;
    public final String h;
    public final String f37610n;
    public int f37611r;
    public final PhotoViewer f37612s;

    public du0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f37612s = photoViewer;
        this.f37605a = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f37606b = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setColor(-3289651);
        this.h = LocaleController.getString("AccDescrVideoCompressLow", R.string.AccDescrVideoCompressLow);
        this.f37610n = LocaleController.getString("AccDescrVideoCompressHigh", R.string.AccDescrVideoCompressHigh);
        setImportantForAccessibility(1);
        setFocusable(true);
        setAccessibilityDelegate(new cu0(this));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i9;
        float f10;
        if (this.f37612s.U7 != 1) {
            this.f37609f = (((getMeasuredWidth() - (this.f37607c * this.f37612s.U7)) - (((this.f37612s.U7 * 2) - 2) * this.d)) - (this.f37608e * 2)) / (this.f37612s.U7 - 1);
        } else {
            this.f37609f = ((getMeasuredWidth() - (this.f37607c * this.f37612s.U7)) - (this.d * 2)) - (this.f37608e * 2);
        }
        int dp = AndroidUtilities.dp(6.0f) + (getMeasuredHeight() / 2);
        for (int i10 = 0; i10 < this.f37612s.U7; i10++) {
            int i11 = this.f37608e;
            int i12 = (this.d * 2) + this.f37609f;
            int i13 = this.f37607c;
            int i14 = (i13 / 2) + ((i12 + i13) * i10) + i11;
            if (i10 <= this.f37612s.T7) {
                this.f37605a.setColor(-11292945);
            } else {
                this.f37605a.setColor(1728053247);
            }
            float f11 = i14;
            float f12 = dp;
            if (i10 == this.f37612s.T7) {
                i9 = AndroidUtilities.dp(6.0f);
            } else {
                i9 = this.f37607c / 2;
            }
            canvas.drawCircle(f11, f12, i9, this.f37605a);
            if (i10 != 0) {
                int i15 = ((i14 - (this.f37607c / 2)) - this.d) - this.f37609f;
                float f13 = 0.0f;
                if (i10 == this.f37612s.T7 + 1) {
                    f10 = AndroidUtilities.dpf2(2.0f);
                } else {
                    f10 = 0.0f;
                }
                if (i10 == this.f37612s.T7) {
                    f13 = AndroidUtilities.dpf2(2.0f);
                }
                canvas.drawRect(f10 + i15, dp - AndroidUtilities.dp(1.0f), (i15 + this.f37609f) - f13, AndroidUtilities.dp(2.0f) + dp, this.f37605a);
            }
        }
        canvas.drawText(this.h, this.f37608e, dp - AndroidUtilities.dp(16.0f), this.f37606b);
        canvas.drawText(this.f37610n, (getMeasuredWidth() - this.f37608e) - this.f37606b.measureText(this.f37610n), dp - AndroidUtilities.dp(16.0f), this.f37606b);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        this.f37607c = AndroidUtilities.dp(8.0f);
        this.d = AndroidUtilities.dp(2.0f);
        this.f37608e = AndroidUtilities.dp(18.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.f37611r = this.f37612s.T7;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        int i9 = 0;
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            while (true) {
                if (i9 >= this.f37612s.U7) {
                    break;
                }
                int i10 = this.f37608e;
                int i11 = this.f37609f;
                int i12 = this.d;
                int i13 = this.f37607c;
                int i14 = i13 / 2;
                int i15 = (((i12 * 2) + i11 + i13) * i9) + i10 + i14;
                int i16 = (i11 / 2) + i14 + i12;
                if (x10 > i15 - i16 && x10 < i15 + i16) {
                    if (this.f37612s.T7 != i9) {
                        this.f37612s.T7 = i9;
                        this.f37612s.R0();
                        invalidate();
                        return true;
                    }
                } else {
                    i9++;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.f37612s.T7 != this.f37611r) {
                this.f37612s.p2(1);
            }
            this.f37612s.H6 = false;
            return true;
        }
        return true;
    }
}
