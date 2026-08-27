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

public final class eu0 extends View {

    public final Paint f37844a;

    public final TextPaint f37845b;

    public int f37846c;
    public int d;

    public int f37847e;

    public int f37848f;
    public final String h;

    public final String f37849n;

    public int f37850r;

    public final PhotoViewer f37851s;

    public eu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f37851s = photoViewer;
        this.f37844a = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f37845b = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setColor(-3289651);
        this.h = LocaleController.getString("AccDescrVideoCompressLow", R.string.AccDescrVideoCompressLow);
        this.f37849n = LocaleController.getString("AccDescrVideoCompressHigh", R.string.AccDescrVideoCompressHigh);
        setImportantForAccessibility(1);
        setFocusable(true);
        setAccessibilityDelegate(new du0(this));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37851s.U7 != 1) {
            this.f37848f = (((getMeasuredWidth() - (this.f37846c * this.f37851s.U7)) - (((this.f37851s.U7 * 2) - 2) * this.d)) - (this.f37847e * 2)) / (this.f37851s.U7 - 1);
        } else {
            this.f37848f = ((getMeasuredWidth() - (this.f37846c * this.f37851s.U7)) - (this.d * 2)) - (this.f37847e * 2);
        }
        int iDp = AndroidUtilities.dp(6.0f) + (getMeasuredHeight() / 2);
        int i10 = 0;
        while (i10 < this.f37851s.U7) {
            int i11 = this.f37847e;
            int i12 = (this.d * 2) + this.f37848f;
            int i13 = this.f37846c;
            int i14 = (i13 / 2) + ((i12 + i13) * i10) + i11;
            if (i10 <= this.f37851s.T7) {
                this.f37844a.setColor(-11292945);
            } else {
                this.f37844a.setColor(1728053247);
            }
            canvas.drawCircle(i14, iDp, i10 == this.f37851s.T7 ? AndroidUtilities.dp(6.0f) : this.f37846c / 2, this.f37844a);
            if (i10 != 0) {
                int i15 = ((i14 - (this.f37846c / 2)) - this.d) - this.f37848f;
                canvas.drawRect((i10 == this.f37851s.T7 + 1 ? AndroidUtilities.dpf2(2.0f) : 0.0f) + i15, iDp - AndroidUtilities.dp(1.0f), (i15 + this.f37848f) - (i10 == this.f37851s.T7 ? AndroidUtilities.dpf2(2.0f) : 0.0f), AndroidUtilities.dp(2.0f) + iDp, this.f37844a);
            }
            i10++;
        }
        canvas.drawText(this.h, this.f37847e, iDp - AndroidUtilities.dp(16.0f), this.f37845b);
        canvas.drawText(this.f37849n, (getMeasuredWidth() - this.f37847e) - this.f37845b.measureText(this.f37849n), iDp - AndroidUtilities.dp(16.0f), this.f37845b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f37846c = AndroidUtilities.dp(8.0f);
        this.d = AndroidUtilities.dp(2.0f);
        this.f37847e = AndroidUtilities.dp(18.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x8 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.f37850r = this.f37851s.T7;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            for (int i10 = 0; i10 < this.f37851s.U7; i10++) {
                int i11 = this.f37847e;
                int i12 = this.f37848f;
                int i13 = this.d;
                int i14 = this.f37846c;
                int i15 = (((i13 * 2) + i12 + i14) * i10) + i11;
                int i16 = i14 / 2;
                int i17 = i15 + i16;
                int i18 = (i12 / 2) + i16 + i13;
                if (x8 > i17 - i18 && x8 < i17 + i18) {
                    if (this.f37851s.T7 == i10) {
                        break;
                    }
                    this.f37851s.T7 = i10;
                    this.f37851s.R0();
                    invalidate();
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.f37851s.T7 != this.f37850r) {
                this.f37851s.p2(1);
            }
            this.f37851s.H6 = false;
            return true;
        }
        return true;
    }
}
