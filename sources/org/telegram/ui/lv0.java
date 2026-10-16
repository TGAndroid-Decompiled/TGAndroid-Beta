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
public final class lv0 extends View {
    public final Paint f37839a;
    public final TextPaint f37840b;
    public int f37841c;
    public int d;
    public int e;
    public int f37842f;
    public final String h;
    public final String f37843n;
    public int f37844r;
    public final PhotoViewer f37845s;

    public lv0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f37845s = photoViewer;
        this.f37839a = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f37840b = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setColor(-3289651);
        this.h = LocaleController.getString("AccDescrVideoCompressLow", R.string.AccDescrVideoCompressLow);
        this.f37843n = LocaleController.getString("AccDescrVideoCompressHigh", R.string.AccDescrVideoCompressHigh);
        setImportantForAccessibility(1);
        setFocusable(true);
        setAccessibilityDelegate(new kv0(this));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        if (this.f37845s.Z7 != 1) {
            this.f37842f = (((getMeasuredWidth() - (this.f37841c * this.f37845s.Z7)) - (((this.f37845s.Z7 * 2) - 2) * this.d)) - (this.e * 2)) / (this.f37845s.Z7 - 1);
        } else {
            this.f37842f = ((getMeasuredWidth() - (this.f37841c * this.f37845s.Z7)) - (this.d * 2)) - (this.e * 2);
        }
        int dp = AndroidUtilities.dp(6.0f) + (getMeasuredHeight() / 2);
        for (int i11 = 0; i11 < this.f37845s.Z7; i11++) {
            int i12 = this.e;
            int i13 = (this.d * 2) + this.f37842f;
            int i14 = this.f37841c;
            int i15 = (i14 / 2) + ((i13 + i14) * i11) + i12;
            if (i11 <= this.f37845s.Y7) {
                this.f37839a.setColor(-11292945);
            } else {
                this.f37839a.setColor(1728053247);
            }
            float f10 = i15;
            float f11 = dp;
            if (i11 == this.f37845s.Y7) {
                i10 = AndroidUtilities.dp(6.0f);
            } else {
                i10 = this.f37841c / 2;
            }
            canvas.drawCircle(f10, f11, i10, this.f37839a);
            if (i11 != 0) {
                int i16 = ((i15 - (this.f37841c / 2)) - this.d) - this.f37842f;
                float f12 = 0.0f;
                if (i11 == this.f37845s.Y7 + 1) {
                    f7 = AndroidUtilities.dpf2(2.0f);
                } else {
                    f7 = 0.0f;
                }
                if (i11 == this.f37845s.Y7) {
                    f12 = AndroidUtilities.dpf2(2.0f);
                }
                canvas.drawRect(f7 + i16, dp - AndroidUtilities.dp(1.0f), (i16 + this.f37842f) - f12, AndroidUtilities.dp(2.0f) + dp, this.f37839a);
            }
        }
        canvas.drawText(this.h, this.e, dp - AndroidUtilities.dp(16.0f), this.f37840b);
        canvas.drawText(this.f37843n, (getMeasuredWidth() - this.e) - this.f37840b.measureText(this.f37843n), dp - AndroidUtilities.dp(16.0f), this.f37840b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f37841c = AndroidUtilities.dp(8.0f);
        this.d = AndroidUtilities.dp(2.0f);
        this.e = AndroidUtilities.dp(18.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.f37844r = this.f37845s.Y7;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        int i10 = 0;
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            while (true) {
                if (i10 >= this.f37845s.Z7) {
                    break;
                }
                int i11 = this.e;
                int i12 = this.f37842f;
                int i13 = this.d;
                int i14 = this.f37841c;
                int i15 = i14 / 2;
                int i16 = (((i13 * 2) + i12 + i14) * i10) + i11 + i15;
                int i17 = (i12 / 2) + i15 + i13;
                if (x10 > i16 - i17 && x10 < i16 + i17) {
                    if (this.f37845s.Y7 != i10) {
                        this.f37845s.Y7 = i10;
                        this.f37845s.R0();
                        invalidate();
                        return true;
                    }
                } else {
                    i10++;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.f37845s.Y7 != this.f37844r) {
                this.f37845s.p2(1);
            }
            this.f37845s.L6 = false;
            return true;
        }
        return true;
    }
}
