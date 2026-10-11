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
public final class fv0 extends View {
    public final Paint f37780a;
    public final TextPaint f37781b;
    public int f37782c;
    public int d;
    public int f37783e;
    public int f37784f;
    public final String h;
    public final String f37785n;
    public int f37786r;
    public final PhotoViewer f37787s;

    public fv0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f37787s = photoViewer;
        this.f37780a = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f37781b = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setColor(-3289651);
        this.h = LocaleController.getString("AccDescrVideoCompressLow", R.string.AccDescrVideoCompressLow);
        this.f37785n = LocaleController.getString("AccDescrVideoCompressHigh", R.string.AccDescrVideoCompressHigh);
        setImportantForAccessibility(1);
        setFocusable(true);
        setAccessibilityDelegate(new ev0(this));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        if (this.f37787s.Z7 != 1) {
            this.f37784f = (((getMeasuredWidth() - (this.f37782c * this.f37787s.Z7)) - (((this.f37787s.Z7 * 2) - 2) * this.d)) - (this.f37783e * 2)) / (this.f37787s.Z7 - 1);
        } else {
            this.f37784f = ((getMeasuredWidth() - (this.f37782c * this.f37787s.Z7)) - (this.d * 2)) - (this.f37783e * 2);
        }
        int dp = AndroidUtilities.dp(6.0f) + (getMeasuredHeight() / 2);
        for (int i11 = 0; i11 < this.f37787s.Z7; i11++) {
            int i12 = this.f37783e;
            int i13 = (this.d * 2) + this.f37784f;
            int i14 = this.f37782c;
            int i15 = (i14 / 2) + ((i13 + i14) * i11) + i12;
            if (i11 <= this.f37787s.Y7) {
                this.f37780a.setColor(-11292945);
            } else {
                this.f37780a.setColor(1728053247);
            }
            float f10 = i15;
            float f11 = dp;
            if (i11 == this.f37787s.Y7) {
                i10 = AndroidUtilities.dp(6.0f);
            } else {
                i10 = this.f37782c / 2;
            }
            canvas.drawCircle(f10, f11, i10, this.f37780a);
            if (i11 != 0) {
                int i16 = ((i15 - (this.f37782c / 2)) - this.d) - this.f37784f;
                float f12 = 0.0f;
                if (i11 == this.f37787s.Y7 + 1) {
                    f7 = AndroidUtilities.dpf2(2.0f);
                } else {
                    f7 = 0.0f;
                }
                if (i11 == this.f37787s.Y7) {
                    f12 = AndroidUtilities.dpf2(2.0f);
                }
                canvas.drawRect(f7 + i16, dp - AndroidUtilities.dp(1.0f), (i16 + this.f37784f) - f12, AndroidUtilities.dp(2.0f) + dp, this.f37780a);
            }
        }
        canvas.drawText(this.h, this.f37783e, dp - AndroidUtilities.dp(16.0f), this.f37781b);
        canvas.drawText(this.f37785n, (getMeasuredWidth() - this.f37783e) - this.f37781b.measureText(this.f37785n), dp - AndroidUtilities.dp(16.0f), this.f37781b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f37782c = AndroidUtilities.dp(8.0f);
        this.d = AndroidUtilities.dp(2.0f);
        this.f37783e = AndroidUtilities.dp(18.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.f37786r = this.f37787s.Y7;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        int i10 = 0;
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            while (true) {
                if (i10 >= this.f37787s.Z7) {
                    break;
                }
                int i11 = this.f37783e;
                int i12 = this.f37784f;
                int i13 = this.d;
                int i14 = this.f37782c;
                int i15 = i14 / 2;
                int i16 = (((i13 * 2) + i12 + i14) * i10) + i11 + i15;
                int i17 = (i12 / 2) + i15 + i13;
                if (x10 > i16 - i17 && x10 < i16 + i17) {
                    if (this.f37787s.Y7 != i10) {
                        this.f37787s.Y7 = i10;
                        this.f37787s.R0();
                        invalidate();
                        return true;
                    }
                } else {
                    i10++;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.f37787s.Y7 != this.f37786r) {
                this.f37787s.p2(1);
            }
            this.f37787s.L6 = false;
            return true;
        }
        return true;
    }
}
