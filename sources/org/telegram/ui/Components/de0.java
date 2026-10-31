package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
public final class de0 extends View {
    public Paint f25397a;
    public Paint f25398b;
    public int f25399c;
    public int d;
    public float e;
    public boolean f25400f;
    public int h;
    public int f25401n;
    public ce0 f25402r;

    public final void a(int i10, boolean z10) {
        ce0 ce0Var;
        int i11 = this.h;
        if (i10 < i11) {
            i10 = i11;
        } else {
            int i12 = this.f25401n;
            if (i10 > i12) {
                i10 = i12;
            }
        }
        this.e = (i10 - i11) / (this.f25401n - i11);
        invalidate();
        if (z10 && (ce0Var = this.f25402r) != null) {
            ce0Var.p(((Integer) getTag()).intValue(), getProgress());
        }
    }

    public int getProgress() {
        int i10 = this.h;
        return (int) ((this.e * (this.f25401n - i10)) + i10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        Paint paint = this.f25398b;
        int measuredHeight = getMeasuredHeight();
        int i11 = this.f25399c;
        int i12 = (measuredHeight - i11) / 2;
        int measuredWidth = (int) ((getMeasuredWidth() - i11) * this.e);
        float f7 = i11 / 2;
        canvas.drawRect(f7, (getMeasuredHeight() / 2) - org.telegram.messenger.i0.L(1.0f), getMeasuredWidth() - i10, org.telegram.messenger.i0.L(1.0f) + (getMeasuredHeight() / 2), this.f25397a);
        if (this.h == 0) {
            canvas.drawRect(f7, (getMeasuredHeight() / 2) - org.telegram.messenger.i0.L(1.0f), measuredWidth, org.telegram.messenger.i0.L(1.0f) + (getMeasuredHeight() / 2), paint);
        } else if (this.e > 0.5f) {
            canvas.drawRect((getMeasuredWidth() / 2) - org.telegram.messenger.i0.L(1.0f), (getMeasuredHeight() - i11) / 2, getMeasuredWidth() / 2, (getMeasuredHeight() + i11) / 2, paint);
            canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - org.telegram.messenger.i0.L(1.0f), measuredWidth, org.telegram.messenger.i0.L(1.0f) + (getMeasuredHeight() / 2), paint);
        } else {
            canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() - i11) / 2, org.telegram.messenger.i0.L(1.0f) + (getMeasuredWidth() / 2), (getMeasuredHeight() + i11) / 2, paint);
            canvas.drawRect(measuredWidth, (getMeasuredHeight() / 2) - org.telegram.messenger.i0.L(1.0f), getMeasuredWidth() / 2, org.telegram.messenger.i0.L(1.0f) + (getMeasuredHeight() / 2), paint);
        }
        canvas.drawCircle(measuredWidth + i10, i10 + i12, f7, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10 = this.f25399c;
        if (motionEvent != null) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float measuredWidth = (int) ((getMeasuredWidth() - i10) * this.e);
            float f7 = 0.0f;
            if (motionEvent.getAction() == 0) {
                float measuredHeight = (getMeasuredHeight() - i10) / 2;
                if (measuredWidth - measuredHeight <= x10 && x10 <= i10 + measuredWidth + measuredHeight && y3 >= 0.0f && y3 <= getMeasuredHeight()) {
                    this.f25400f = true;
                    this.d = (int) (x10 - measuredWidth);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && this.f25400f) {
                    float f10 = (int) (x10 - this.d);
                    if (f10 >= 0.0f) {
                        if (f10 > getMeasuredWidth() - i10) {
                            f7 = getMeasuredWidth() - i10;
                        } else {
                            f7 = f10;
                        }
                    }
                    this.e = f7 / (getMeasuredWidth() - i10);
                    ce0 ce0Var = this.f25402r;
                    if (ce0Var != null) {
                        ce0Var.p(((Integer) getTag()).intValue(), getProgress());
                    }
                    invalidate();
                    return true;
                }
            } else if (this.f25400f) {
                this.f25400f = false;
                invalidate();
                return true;
            }
        }
        return false;
    }

    public void setDelegate(ce0 ce0Var) {
        this.f25402r = ce0Var;
    }

    public void setProgress(int i10) {
        a(i10, true);
    }
}
