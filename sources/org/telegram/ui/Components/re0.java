package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class re0 extends View {
    public Paint f32273a;
    public Paint f32274b;
    public int f32275c;
    public int d;
    public float f32276e;
    public boolean f32277f;
    public int h;
    public int f32278n;
    public qe0 f32279r;

    public final void a(int i10, boolean z10) {
        qe0 qe0Var;
        int i11 = this.h;
        if (i10 < i11) {
            i10 = i11;
        } else {
            int i12 = this.f32278n;
            if (i10 > i12) {
                i10 = i12;
            }
        }
        this.f32276e = (i10 - i11) / (this.f32278n - i11);
        invalidate();
        if (z10 && (qe0Var = this.f32279r) != null) {
            qe0Var.l(((Integer) getTag()).intValue(), getProgress());
        }
    }

    public int getProgress() {
        int i10 = this.h;
        return (int) ((this.f32276e * (this.f32278n - i10)) + i10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        Paint paint = this.f32274b;
        int measuredHeight = getMeasuredHeight();
        int i11 = this.f32275c;
        int i12 = (measuredHeight - i11) / 2;
        int measuredWidth = (int) ((getMeasuredWidth() - i11) * this.f32276e);
        float f9 = i11 / 2;
        canvas.drawRect(f9, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() - i10, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), this.f32273a);
        if (this.h == 0) {
            canvas.drawRect(f9, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), measuredWidth, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint);
        } else if (this.f32276e > 0.5f) {
            canvas.drawRect((getMeasuredWidth() / 2) - AndroidUtilities.dp(1.0f), (getMeasuredHeight() - i11) / 2, getMeasuredWidth() / 2, (getMeasuredHeight() + i11) / 2, paint);
            canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), measuredWidth, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint);
        } else {
            canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() - i11) / 2, AndroidUtilities.dp(1.0f) + (getMeasuredWidth() / 2), (getMeasuredHeight() + i11) / 2, paint);
            canvas.drawRect(measuredWidth, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() / 2, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint);
        }
        canvas.drawCircle(measuredWidth + i10, i10 + i12, f9, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10 = this.f32275c;
        if (motionEvent != null) {
            float x4 = motionEvent.getX();
            float y8 = motionEvent.getY();
            float measuredWidth = (int) ((getMeasuredWidth() - i10) * this.f32276e);
            float f9 = 0.0f;
            if (motionEvent.getAction() == 0) {
                float measuredHeight = (getMeasuredHeight() - i10) / 2;
                if (measuredWidth - measuredHeight <= x4 && x4 <= i10 + measuredWidth + measuredHeight && y8 >= 0.0f && y8 <= getMeasuredHeight()) {
                    this.f32277f = true;
                    this.d = (int) (x4 - measuredWidth);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && this.f32277f) {
                    float f10 = (int) (x4 - this.d);
                    if (f10 >= 0.0f) {
                        if (f10 > getMeasuredWidth() - i10) {
                            f9 = getMeasuredWidth() - i10;
                        } else {
                            f9 = f10;
                        }
                    }
                    this.f32276e = f9 / (getMeasuredWidth() - i10);
                    qe0 qe0Var = this.f32279r;
                    if (qe0Var != null) {
                        qe0Var.l(((Integer) getTag()).intValue(), getProgress());
                    }
                    invalidate();
                    return true;
                }
            } else if (this.f32277f) {
                this.f32277f = false;
                invalidate();
                return true;
            }
        }
        return false;
    }

    public void setDelegate(qe0 qe0Var) {
        this.f32279r = qe0Var;
    }

    public void setProgress(int i10) {
        a(i10, true);
    }
}
