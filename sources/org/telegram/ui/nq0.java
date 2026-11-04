package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
public final class nq0 extends View {
    public final Paint f48106a;
    public final TextPaint f48107b;
    public int f48108c;
    public int d;
    public int f48109e;
    public int f48110f;
    public final String h;
    public final String f48111n;
    public int f48112r;
    public final PhotoViewer f48113s;

    public nq0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f48113s = photoViewer;
        this.f48106a = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f48107b = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setColor(-3289651);
        this.h = org.telegram.messenger.bd.M0(2131754737, "AccDescrVideoCompressLow");
        this.f48111n = org.telegram.messenger.bd.M0(2131754738, "AccDescrVideoCompressHigh");
        setImportantForAccessibility(1);
        setFocusable(true);
        setAccessibilityDelegate(new org.telegram.ui.Components.st0(2, this));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i3;
        float f10;
        if (this.f48113s.f41380a8 != 1) {
            this.f48110f = (((getMeasuredWidth() - (this.f48108c * this.f48113s.f41380a8)) - (((this.f48113s.f41380a8 * 2) - 2) * this.d)) - (this.f48109e * 2)) / (this.f48113s.f41380a8 - 1);
        } else {
            this.f48110f = ((getMeasuredWidth() - (this.f48108c * this.f48113s.f41380a8)) - (this.d * 2)) - (this.f48109e * 2);
        }
        int L = org.telegram.messenger.g0.L(6.0f) + (getMeasuredHeight() / 2);
        for (int i10 = 0; i10 < this.f48113s.f41380a8; i10++) {
            int i11 = this.f48109e;
            int i12 = (this.d * 2) + this.f48110f;
            int i13 = this.f48108c;
            int i14 = (i13 / 2) + ((i12 + i13) * i10) + i11;
            if (i10 <= this.f48113s.Z7) {
                this.f48106a.setColor(-11292945);
            } else {
                this.f48106a.setColor(1728053247);
            }
            float f11 = i14;
            float f12 = L;
            if (i10 == this.f48113s.Z7) {
                i3 = org.telegram.messenger.g0.L(6.0f);
            } else {
                i3 = this.f48108c / 2;
            }
            canvas.drawCircle(f11, f12, i3, this.f48106a);
            if (i10 != 0) {
                int i15 = ((i14 - (this.f48108c / 2)) - this.d) - this.f48110f;
                float f13 = 0.0f;
                if (i10 == this.f48113s.Z7 + 1) {
                    f10 = org.telegram.messenger.g0.N(2.0f);
                } else {
                    f10 = 0.0f;
                }
                if (i10 == this.f48113s.Z7) {
                    f13 = org.telegram.messenger.g0.N(2.0f);
                }
                canvas.drawRect(f10 + i15, L - org.telegram.messenger.g0.L(1.0f), (i15 + this.f48110f) - f13, org.telegram.messenger.g0.L(2.0f) + L, this.f48106a);
            }
        }
        canvas.drawText(this.h, this.f48109e, L - org.telegram.messenger.g0.L(16.0f), this.f48107b);
        canvas.drawText(this.f48111n, (getMeasuredWidth() - this.f48109e) - this.f48107b.measureText(this.f48111n), L - org.telegram.messenger.g0.L(16.0f), this.f48107b);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        this.f48108c = org.telegram.messenger.g0.L(8.0f);
        this.d = org.telegram.messenger.g0.L(2.0f);
        this.f48109e = org.telegram.messenger.g0.L(18.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.f48112r = this.f48113s.Z7;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        int i3 = 0;
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            while (true) {
                if (i3 >= this.f48113s.f41380a8) {
                    break;
                }
                int i10 = this.f48109e;
                int i11 = this.f48110f;
                int i12 = this.d;
                int i13 = this.f48108c;
                int i14 = i13 / 2;
                int i15 = (((i12 * 2) + i11 + i13) * i3) + i10 + i14;
                int i16 = (i11 / 2) + i14 + i12;
                if (x10 > i15 - i16 && x10 < i15 + i16) {
                    if (this.f48113s.Z7 != i3) {
                        this.f48113s.Z7 = i3;
                        this.f48113s.S0();
                        invalidate();
                        return true;
                    }
                } else {
                    i3++;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.f48113s.Z7 != this.f48112r) {
                this.f48113s.s2(1);
            }
            this.f48113s.M6 = false;
            return true;
        }
        return true;
    }
}
