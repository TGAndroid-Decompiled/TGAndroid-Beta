package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
public final class gs0 extends View {
    public final Paint f37556a;
    public final TextPaint f37557b;
    public int f37558c;
    public int d;
    public int e;
    public int f37559f;
    public final String h;
    public final String f37560n;
    public int f37561r;
    public final PhotoViewer f37562s;

    public gs0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f37562s = photoViewer;
        this.f37556a = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f37557b = textPaint;
        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
        textPaint.setColor(-3289651);
        this.h = org.telegram.messenger.dd.L0(2131754737, "AccDescrVideoCompressLow");
        this.f37560n = org.telegram.messenger.dd.L0(2131754738, "AccDescrVideoCompressHigh");
        setImportantForAccessibility(1);
        setFocusable(true);
        setAccessibilityDelegate(new org.telegram.ui.Components.xu0(2, this));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        if (this.f37562s.Z7 != 1) {
            this.f37559f = (((getMeasuredWidth() - (this.f37558c * this.f37562s.Z7)) - (((this.f37562s.Z7 * 2) - 2) * this.d)) - (this.e * 2)) / (this.f37562s.Z7 - 1);
        } else {
            this.f37559f = ((getMeasuredWidth() - (this.f37558c * this.f37562s.Z7)) - (this.d * 2)) - (this.e * 2);
        }
        int L = org.telegram.messenger.i0.L(6.0f) + (getMeasuredHeight() / 2);
        for (int i11 = 0; i11 < this.f37562s.Z7; i11++) {
            int i12 = this.e;
            int i13 = (this.d * 2) + this.f37559f;
            int i14 = this.f37558c;
            int i15 = (i14 / 2) + ((i13 + i14) * i11) + i12;
            if (i11 <= this.f37562s.Y7) {
                this.f37556a.setColor(-11292945);
            } else {
                this.f37556a.setColor(1728053247);
            }
            float f10 = i15;
            float f11 = L;
            if (i11 == this.f37562s.Y7) {
                i10 = org.telegram.messenger.i0.L(6.0f);
            } else {
                i10 = this.f37558c / 2;
            }
            canvas.drawCircle(f10, f11, i10, this.f37556a);
            if (i11 != 0) {
                int i16 = ((i15 - (this.f37558c / 2)) - this.d) - this.f37559f;
                float f12 = 0.0f;
                if (i11 == this.f37562s.Y7 + 1) {
                    f7 = org.telegram.messenger.i0.N(2.0f);
                } else {
                    f7 = 0.0f;
                }
                if (i11 == this.f37562s.Y7) {
                    f12 = org.telegram.messenger.i0.N(2.0f);
                }
                canvas.drawRect(f7 + i16, L - org.telegram.messenger.i0.L(1.0f), (i16 + this.f37559f) - f12, org.telegram.messenger.i0.L(2.0f) + L, this.f37556a);
            }
        }
        canvas.drawText(this.h, this.e, L - org.telegram.messenger.i0.L(16.0f), this.f37557b);
        canvas.drawText(this.f37560n, (getMeasuredWidth() - this.e) - this.f37557b.measureText(this.f37560n), L - org.telegram.messenger.i0.L(16.0f), this.f37557b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f37558c = org.telegram.messenger.i0.L(8.0f);
        this.d = org.telegram.messenger.i0.L(2.0f);
        this.e = org.telegram.messenger.i0.L(18.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.f37561r = this.f37562s.Y7;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        int i10 = 0;
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            while (true) {
                if (i10 >= this.f37562s.Z7) {
                    break;
                }
                int i11 = this.e;
                int i12 = this.f37559f;
                int i13 = this.d;
                int i14 = this.f37558c;
                int i15 = i14 / 2;
                int i16 = (((i13 * 2) + i12 + i14) * i10) + i11 + i15;
                int i17 = (i12 / 2) + i15 + i13;
                if (x10 > i16 - i17 && x10 < i16 + i17) {
                    if (this.f37562s.Y7 != i10) {
                        this.f37562s.Y7 = i10;
                        this.f37562s.S0();
                        invalidate();
                        return true;
                    }
                } else {
                    i10++;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.f37562s.Y7 != this.f37561r) {
                this.f37562s.s2(1);
            }
            this.f37562s.L6 = false;
            return true;
        }
        return true;
    }
}
