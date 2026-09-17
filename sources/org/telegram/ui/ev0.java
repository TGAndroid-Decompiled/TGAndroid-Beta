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
public final class ev0 extends View {
    public final Paint f36214a;
    public final TextPaint f36215b;
    public int f36216c;
    public int d;
    public int f36217e;
    public int f36218f;
    public final String h;
    public final String f36219n;
    public int f36220r;
    public final PhotoViewer f36221s;

    public ev0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f36221s = photoViewer;
        this.f36214a = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f36215b = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setColor(-3289651);
        this.h = LocaleController.getString("AccDescrVideoCompressLow", R.string.AccDescrVideoCompressLow);
        this.f36219n = LocaleController.getString("AccDescrVideoCompressHigh", R.string.AccDescrVideoCompressHigh);
        setImportantForAccessibility(1);
        setFocusable(true);
        setAccessibilityDelegate(new dv0(this));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        if (this.f36221s.Y7 != 1) {
            this.f36218f = (((getMeasuredWidth() - (this.f36216c * this.f36221s.Y7)) - (((this.f36221s.Y7 * 2) - 2) * this.d)) - (this.f36217e * 2)) / (this.f36221s.Y7 - 1);
        } else {
            this.f36218f = ((getMeasuredWidth() - (this.f36216c * this.f36221s.Y7)) - (this.d * 2)) - (this.f36217e * 2);
        }
        int dp = AndroidUtilities.dp(6.0f) + (getMeasuredHeight() / 2);
        for (int i11 = 0; i11 < this.f36221s.Y7; i11++) {
            int i12 = this.f36217e;
            int i13 = (this.d * 2) + this.f36218f;
            int i14 = this.f36216c;
            int i15 = (i14 / 2) + ((i13 + i14) * i11) + i12;
            if (i11 <= this.f36221s.X7) {
                this.f36214a.setColor(-11292945);
            } else {
                this.f36214a.setColor(1728053247);
            }
            float f10 = i15;
            float f11 = dp;
            if (i11 == this.f36221s.X7) {
                i10 = AndroidUtilities.dp(6.0f);
            } else {
                i10 = this.f36216c / 2;
            }
            canvas.drawCircle(f10, f11, i10, this.f36214a);
            if (i11 != 0) {
                int i16 = ((i15 - (this.f36216c / 2)) - this.d) - this.f36218f;
                float f12 = 0.0f;
                if (i11 == this.f36221s.X7 + 1) {
                    f7 = AndroidUtilities.dpf2(2.0f);
                } else {
                    f7 = 0.0f;
                }
                if (i11 == this.f36221s.X7) {
                    f12 = AndroidUtilities.dpf2(2.0f);
                }
                canvas.drawRect(f7 + i16, dp - AndroidUtilities.dp(1.0f), (i16 + this.f36218f) - f12, AndroidUtilities.dp(2.0f) + dp, this.f36214a);
            }
        }
        canvas.drawText(this.h, this.f36217e, dp - AndroidUtilities.dp(16.0f), this.f36215b);
        canvas.drawText(this.f36219n, (getMeasuredWidth() - this.f36217e) - this.f36215b.measureText(this.f36219n), dp - AndroidUtilities.dp(16.0f), this.f36215b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f36216c = AndroidUtilities.dp(8.0f);
        this.d = AndroidUtilities.dp(2.0f);
        this.f36217e = AndroidUtilities.dp(18.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.f36220r = this.f36221s.X7;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        int i10 = 0;
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            while (true) {
                if (i10 >= this.f36221s.Y7) {
                    break;
                }
                int i11 = this.f36217e;
                int i12 = this.f36218f;
                int i13 = this.d;
                int i14 = this.f36216c;
                int i15 = i14 / 2;
                int i16 = (((i13 * 2) + i12 + i14) * i10) + i11 + i15;
                int i17 = (i12 / 2) + i15 + i13;
                if (x10 > i16 - i17 && x10 < i16 + i17) {
                    if (this.f36221s.X7 != i10) {
                        this.f36221s.X7 = i10;
                        this.f36221s.R0();
                        invalidate();
                        return true;
                    }
                } else {
                    i10++;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.f36221s.X7 != this.f36220r) {
                this.f36221s.p2(1);
            }
            this.f36221s.L6 = false;
            return true;
        }
        return true;
    }
}
