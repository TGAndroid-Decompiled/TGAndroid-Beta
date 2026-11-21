package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
public final class td0 extends View {
    public Paint f39877a;
    public Paint f39878b;
    public int f39879c;
    public int d;
    public float f39880e;
    public boolean f39881f;
    public int h;
    public int f39882n;
    public sd0 f39883r;

    public final void a(int i7, boolean z10) {
        sd0 sd0Var;
        int i10 = this.h;
        if (i7 < i10) {
            i7 = i10;
        } else {
            int i11 = this.f39882n;
            if (i7 > i11) {
                i7 = i11;
            }
        }
        this.f39880e = (i7 - i10) / (this.f39882n - i10);
        invalidate();
        if (z10 && (sd0Var = this.f39883r) != null) {
            sd0Var.j(((Integer) getTag()).intValue(), getProgress());
        }
    }

    public int getProgress() {
        int i7 = this.h;
        return (int) ((this.f39880e * (this.f39882n - i7)) + i7);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        Paint paint = this.f39878b;
        int measuredHeight = getMeasuredHeight();
        int i10 = this.f39879c;
        int i11 = (measuredHeight - i10) / 2;
        int measuredWidth = (int) ((getMeasuredWidth() - i10) * this.f39880e);
        float f10 = i10 / 2;
        canvas.drawRect(f10, (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(1.0f), getMeasuredWidth() - i7, org.telegram.messenger.g0.L(1.0f) + (getMeasuredHeight() / 2), this.f39877a);
        if (this.h == 0) {
            canvas.drawRect(f10, (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(1.0f), measuredWidth, org.telegram.messenger.g0.L(1.0f) + (getMeasuredHeight() / 2), paint);
        } else if (this.f39880e > 0.5f) {
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
        int i7 = this.f39879c;
        if (motionEvent != null) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float measuredWidth = (int) ((getMeasuredWidth() - i7) * this.f39880e);
            float f10 = 0.0f;
            if (motionEvent.getAction() == 0) {
                float measuredHeight = (getMeasuredHeight() - i7) / 2;
                if (measuredWidth - measuredHeight <= x10 && x10 <= i7 + measuredWidth + measuredHeight && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                    this.f39881f = true;
                    this.d = (int) (x10 - measuredWidth);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && this.f39881f) {
                    float f11 = (int) (x10 - this.d);
                    if (f11 >= 0.0f) {
                        if (f11 > getMeasuredWidth() - i7) {
                            f10 = getMeasuredWidth() - i7;
                        } else {
                            f10 = f11;
                        }
                    }
                    this.f39880e = f10 / (getMeasuredWidth() - i7);
                    sd0 sd0Var = this.f39883r;
                    if (sd0Var != null) {
                        sd0Var.j(((Integer) getTag()).intValue(), getProgress());
                    }
                    invalidate();
                    return true;
                }
            } else if (this.f39881f) {
                this.f39881f = false;
                invalidate();
                return true;
            }
        }
        return false;
    }

    public void setDelegate(sd0 sd0Var) {
        this.f39883r = sd0Var;
    }

    public void setProgress(int i7) {
        a(i7, true);
    }
}
