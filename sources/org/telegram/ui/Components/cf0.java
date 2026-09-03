package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class cf0 extends View {
    public Paint f25917a;
    public Paint f25918b;
    public int f25919c;
    public int d;
    public float f25920e;
    public boolean f25921f;
    public int h;
    public int f25922n;
    public bf0 f25923r;

    public final void a(int i10, boolean z4) {
        bf0 bf0Var;
        int i11 = this.h;
        if (i10 < i11) {
            i10 = i11;
        } else {
            int i12 = this.f25922n;
            if (i10 > i12) {
                i10 = i12;
            }
        }
        this.f25920e = (i10 - i11) / (this.f25922n - i11);
        invalidate();
        if (z4 && (bf0Var = this.f25923r) != null) {
            bf0Var.l(((Integer) getTag()).intValue(), getProgress());
        }
    }

    public int getProgress() {
        int i10 = this.h;
        return (int) ((this.f25920e * (this.f25922n - i10)) + i10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        Paint paint = this.f25918b;
        int measuredHeight = getMeasuredHeight();
        int i11 = this.f25919c;
        int i12 = (measuredHeight - i11) / 2;
        int measuredWidth = (int) ((getMeasuredWidth() - i11) * this.f25920e);
        float f10 = i11 / 2;
        canvas.drawRect(f10, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() - i10, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), this.f25917a);
        if (this.h == 0) {
            canvas.drawRect(f10, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), measuredWidth, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint);
        } else if (this.f25920e > 0.5f) {
            canvas.drawRect((getMeasuredWidth() / 2) - AndroidUtilities.dp(1.0f), (getMeasuredHeight() - i11) / 2, getMeasuredWidth() / 2, (getMeasuredHeight() + i11) / 2, paint);
            canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), measuredWidth, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint);
        } else {
            canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() - i11) / 2, AndroidUtilities.dp(1.0f) + (getMeasuredWidth() / 2), (getMeasuredHeight() + i11) / 2, paint);
            canvas.drawRect(measuredWidth, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() / 2, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint);
        }
        canvas.drawCircle(measuredWidth + i10, i10 + i12, f10, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10 = this.f25919c;
        if (motionEvent != null) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float measuredWidth = (int) ((getMeasuredWidth() - i10) * this.f25920e);
            float f10 = 0.0f;
            if (motionEvent.getAction() == 0) {
                float measuredHeight = (getMeasuredHeight() - i10) / 2;
                if (measuredWidth - measuredHeight <= x10 && x10 <= i10 + measuredWidth + measuredHeight && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                    this.f25921f = true;
                    this.d = (int) (x10 - measuredWidth);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && this.f25921f) {
                    float f11 = (int) (x10 - this.d);
                    if (f11 >= 0.0f) {
                        if (f11 > getMeasuredWidth() - i10) {
                            f10 = getMeasuredWidth() - i10;
                        } else {
                            f10 = f11;
                        }
                    }
                    this.f25920e = f10 / (getMeasuredWidth() - i10);
                    bf0 bf0Var = this.f25923r;
                    if (bf0Var != null) {
                        bf0Var.l(((Integer) getTag()).intValue(), getProgress());
                    }
                    invalidate();
                    return true;
                }
            } else if (this.f25921f) {
                this.f25921f = false;
                invalidate();
                return true;
            }
        }
        return false;
    }

    public void setDelegate(bf0 bf0Var) {
        this.f25923r = bf0Var;
    }

    public void setProgress(int i10) {
        a(i10, true);
    }
}
