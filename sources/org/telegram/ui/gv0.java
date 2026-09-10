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
public final class gv0 extends View {
    public final Paint f33191a;
    public final TextPaint f33192b;
    public int f33193c;
    public int d;
    public int e;
    public int f33194f;
    public final String h;
    public final String f33195n;
    public int f33196r;
    public final PhotoViewer f33197s;

    public gv0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f33197s = photoViewer;
        this.f33191a = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f33192b = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setColor(-3289651);
        this.h = LocaleController.getString("AccDescrVideoCompressLow", R.string.AccDescrVideoCompressLow);
        this.f33195n = LocaleController.getString("AccDescrVideoCompressHigh", R.string.AccDescrVideoCompressHigh);
        setImportantForAccessibility(1);
        setFocusable(true);
        setAccessibilityDelegate(new fv0(this));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        if (this.f33197s.Y7 != 1) {
            this.f33194f = (((getMeasuredWidth() - (this.f33193c * this.f33197s.Y7)) - (((this.f33197s.Y7 * 2) - 2) * this.d)) - (this.e * 2)) / (this.f33197s.Y7 - 1);
        } else {
            this.f33194f = ((getMeasuredWidth() - (this.f33193c * this.f33197s.Y7)) - (this.d * 2)) - (this.e * 2);
        }
        int dp = AndroidUtilities.dp(6.0f) + (getMeasuredHeight() / 2);
        for (int i11 = 0; i11 < this.f33197s.Y7; i11++) {
            int i12 = this.e;
            int i13 = (this.d * 2) + this.f33194f;
            int i14 = this.f33193c;
            int i15 = (i14 / 2) + ((i13 + i14) * i11) + i12;
            if (i11 <= this.f33197s.X7) {
                this.f33191a.setColor(-11292945);
            } else {
                this.f33191a.setColor(1728053247);
            }
            float f10 = i15;
            float f11 = dp;
            if (i11 == this.f33197s.X7) {
                i10 = AndroidUtilities.dp(6.0f);
            } else {
                i10 = this.f33193c / 2;
            }
            canvas.drawCircle(f10, f11, i10, this.f33191a);
            if (i11 != 0) {
                int i16 = ((i15 - (this.f33193c / 2)) - this.d) - this.f33194f;
                float f12 = 0.0f;
                if (i11 == this.f33197s.X7 + 1) {
                    f7 = AndroidUtilities.dpf2(2.0f);
                } else {
                    f7 = 0.0f;
                }
                if (i11 == this.f33197s.X7) {
                    f12 = AndroidUtilities.dpf2(2.0f);
                }
                canvas.drawRect(f7 + i16, dp - AndroidUtilities.dp(1.0f), (i16 + this.f33194f) - f12, AndroidUtilities.dp(2.0f) + dp, this.f33191a);
            }
        }
        canvas.drawText(this.h, this.e, dp - AndroidUtilities.dp(16.0f), this.f33192b);
        canvas.drawText(this.f33195n, (getMeasuredWidth() - this.e) - this.f33192b.measureText(this.f33195n), dp - AndroidUtilities.dp(16.0f), this.f33192b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f33193c = AndroidUtilities.dp(8.0f);
        this.d = AndroidUtilities.dp(2.0f);
        this.e = AndroidUtilities.dp(18.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.f33196r = this.f33197s.X7;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        int i10 = 0;
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            while (true) {
                if (i10 >= this.f33197s.Y7) {
                    break;
                }
                int i11 = this.e;
                int i12 = this.f33194f;
                int i13 = this.d;
                int i14 = this.f33193c;
                int i15 = i14 / 2;
                int i16 = (((i13 * 2) + i12 + i14) * i10) + i11 + i15;
                int i17 = (i12 / 2) + i15 + i13;
                if (x10 > i16 - i17 && x10 < i16 + i17) {
                    if (this.f33197s.X7 != i10) {
                        this.f33197s.X7 = i10;
                        this.f33197s.R0();
                        invalidate();
                        return true;
                    }
                } else {
                    i10++;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.f33197s.X7 != this.f33196r) {
                this.f33197s.p2(1);
            }
            this.f33197s.L6 = false;
            return true;
        }
        return true;
    }
}
