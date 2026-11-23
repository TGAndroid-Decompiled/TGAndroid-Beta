package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
public final class sd0 extends View {
    public Paint f39577a;
    public Paint f39578b;
    public int f39579c;
    public int d;
    public float f39580e;
    public boolean f39581f;
    public int h;
    public int f39582n;
    public rd0 f39583r;

    public final void a(int i7, boolean z10) {
        rd0 rd0Var;
        int i10 = this.h;
        if (i7 < i10) {
            i7 = i10;
        } else {
            int i11 = this.f39582n;
            if (i7 > i11) {
                i7 = i11;
            }
        }
        this.f39580e = (i7 - i10) / (this.f39582n - i10);
        invalidate();
        if (z10 && (rd0Var = this.f39583r) != null) {
            rd0Var.l(((Integer) getTag()).intValue(), getProgress());
        }
    }

    public int getProgress() {
        int i7 = this.h;
        return (int) ((this.f39580e * (this.f39582n - i7)) + i7);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        Paint paint = this.f39578b;
        int measuredHeight = getMeasuredHeight();
        int i10 = this.f39579c;
        int i11 = (measuredHeight - i10) / 2;
        int measuredWidth = (int) ((getMeasuredWidth() - i10) * this.f39580e);
        float f10 = i10 / 2;
        canvas.drawRect(f10, (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(1.0f), getMeasuredWidth() - i7, org.telegram.messenger.g0.L(1.0f) + (getMeasuredHeight() / 2), this.f39577a);
        if (this.h == 0) {
            canvas.drawRect(f10, (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(1.0f), measuredWidth, org.telegram.messenger.g0.L(1.0f) + (getMeasuredHeight() / 2), paint);
        } else if (this.f39580e > 0.5f) {
            canvas.drawRect((getMeasuredWidth() / 2) - org.telegram.messenger.g0.L(1.0f), (getMeasuredHeight() - i10) / 2, getMeasuredWidth() / 2, (getMeasuredHeight() + i10) / 2, paint);
            canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(1.0f), measuredWidth, org.telegram.messenger.g0.L(1.0f) + (getMeasuredHeight() / 2), paint);
        } else {
            canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() - i10) / 2, org.telegram.messenger.g0.L(1.0f) + (getMeasuredWidth() / 2), (getMeasuredHeight() + i10) / 2, paint);
            canvas.drawRect(measuredWidth, (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(1.0f), getMeasuredWidth() / 2, org.telegram.messenger.g0.L(1.0f) + (getMeasuredHeight() / 2), paint);
        }
        canvas.drawCircle(measuredWidth + i7, i7 + i11, f10, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7 = this.f39579c;
        if (motionEvent != null) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float measuredWidth = (int) ((getMeasuredWidth() - i7) * this.f39580e);
            float f10 = 0.0f;
            if (motionEvent.getAction() == 0) {
                float measuredHeight = (getMeasuredHeight() - i7) / 2;
                if (measuredWidth - measuredHeight <= x10 && x10 <= i7 + measuredWidth + measuredHeight && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                    this.f39581f = true;
                    this.d = (int) (x10 - measuredWidth);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && this.f39581f) {
                    float f11 = (int) (x10 - this.d);
                    if (f11 >= 0.0f) {
                        if (f11 > getMeasuredWidth() - i7) {
                            f10 = getMeasuredWidth() - i7;
                        } else {
                            f10 = f11;
                        }
                    }
                    this.f39580e = f10 / (getMeasuredWidth() - i7);
                    rd0 rd0Var = this.f39583r;
                    if (rd0Var != null) {
                        rd0Var.l(((Integer) getTag()).intValue(), getProgress());
                    }
                    invalidate();
                    return true;
                }
            } else if (this.f39581f) {
                this.f39581f = false;
                invalidate();
                return true;
            }
        }
        return false;
    }

    public void setDelegate(rd0 rd0Var) {
        this.f39583r = rd0Var;
    }

    public void setProgress(int i7) {
        a(i7, true);
    }
}
