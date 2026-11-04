package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
public final class cd0 extends View {
    public Paint f32689a;
    public Paint f32690b;
    public int f32691c;
    public int d;
    public float f32692e;
    public boolean f32693f;
    public int h;
    public int f32694n;
    public bd0 f32695r;

    public final void a(int i3, boolean z10) {
        bd0 bd0Var;
        int i10 = this.h;
        if (i3 < i10) {
            i3 = i10;
        } else {
            int i11 = this.f32694n;
            if (i3 > i11) {
                i3 = i11;
            }
        }
        this.f32692e = (i3 - i10) / (this.f32694n - i10);
        invalidate();
        if (z10 && (bd0Var = this.f32695r) != null) {
            bd0Var.m(((Integer) getTag()).intValue(), getProgress());
        }
    }

    public int getProgress() {
        int i3 = this.h;
        return (int) ((this.f32692e * (this.f32694n - i3)) + i3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i3;
        Paint paint = this.f32690b;
        int measuredHeight = getMeasuredHeight();
        int i10 = this.f32691c;
        int i11 = (measuredHeight - i10) / 2;
        int measuredWidth = (int) ((getMeasuredWidth() - i10) * this.f32692e);
        float f10 = i10 / 2;
        canvas.drawRect(f10, (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(1.0f), getMeasuredWidth() - i3, org.telegram.messenger.g0.L(1.0f) + (getMeasuredHeight() / 2), this.f32689a);
        if (this.h == 0) {
            canvas.drawRect(f10, (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(1.0f), measuredWidth, org.telegram.messenger.g0.L(1.0f) + (getMeasuredHeight() / 2), paint);
        } else if (this.f32692e > 0.5f) {
            canvas.drawRect((getMeasuredWidth() / 2) - org.telegram.messenger.g0.L(1.0f), (getMeasuredHeight() - i10) / 2, getMeasuredWidth() / 2, (getMeasuredHeight() + i10) / 2, paint);
            canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(1.0f), measuredWidth, org.telegram.messenger.g0.L(1.0f) + (getMeasuredHeight() / 2), paint);
        } else {
            canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() - i10) / 2, org.telegram.messenger.g0.L(1.0f) + (getMeasuredWidth() / 2), (getMeasuredHeight() + i10) / 2, paint);
            canvas.drawRect(measuredWidth, (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(1.0f), getMeasuredWidth() / 2, org.telegram.messenger.g0.L(1.0f) + (getMeasuredHeight() / 2), paint);
        }
        canvas.drawCircle(measuredWidth + i3, i3 + i11, f10, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i3 = this.f32691c;
        if (motionEvent != null) {
            float x10 = motionEvent.getX();
            float y9 = motionEvent.getY();
            float measuredWidth = (int) ((getMeasuredWidth() - i3) * this.f32692e);
            float f10 = 0.0f;
            if (motionEvent.getAction() == 0) {
                float measuredHeight = (getMeasuredHeight() - i3) / 2;
                if (measuredWidth - measuredHeight <= x10 && x10 <= i3 + measuredWidth + measuredHeight && y9 >= 0.0f && y9 <= getMeasuredHeight()) {
                    this.f32693f = true;
                    this.d = (int) (x10 - measuredWidth);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && this.f32693f) {
                    float f11 = (int) (x10 - this.d);
                    if (f11 >= 0.0f) {
                        if (f11 > getMeasuredWidth() - i3) {
                            f10 = getMeasuredWidth() - i3;
                        } else {
                            f10 = f11;
                        }
                    }
                    this.f32692e = f10 / (getMeasuredWidth() - i3);
                    bd0 bd0Var = this.f32695r;
                    if (bd0Var != null) {
                        bd0Var.m(((Integer) getTag()).intValue(), getProgress());
                    }
                    invalidate();
                    return true;
                }
            } else if (this.f32693f) {
                this.f32693f = false;
                invalidate();
                return true;
            }
        }
        return false;
    }

    public void setDelegate(bd0 bd0Var) {
        this.f32695r = bd0Var;
    }

    public void setProgress(int i3) {
        a(i3, true);
    }
}
