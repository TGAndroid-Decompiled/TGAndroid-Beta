package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class de0 extends View {
    public Paint f27724a;
    public Paint f27725b;
    public int f27726c;
    public int d;
    public float f27727e;
    public boolean f27728f;
    public int h;
    public int f27729n;
    public ce0 f27730r;

    public final void a(int i9, boolean z10) {
        ce0 ce0Var;
        int i10 = this.h;
        if (i9 < i10) {
            i9 = i10;
        } else {
            int i11 = this.f27729n;
            if (i9 > i11) {
                i9 = i11;
            }
        }
        this.f27727e = (i9 - i10) / (this.f27729n - i10);
        invalidate();
        if (z10 && (ce0Var = this.f27730r) != null) {
            ce0Var.l(((Integer) getTag()).intValue(), getProgress());
        }
    }

    public int getProgress() {
        int i9 = this.h;
        return (int) ((this.f27727e * (this.f27729n - i9)) + i9);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i9;
        Paint paint = this.f27725b;
        int measuredHeight = getMeasuredHeight();
        int i10 = this.f27726c;
        int i11 = (measuredHeight - i10) / 2;
        int measuredWidth = (int) ((getMeasuredWidth() - i10) * this.f27727e);
        float f10 = i10 / 2;
        canvas.drawRect(f10, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() - i9, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), this.f27724a);
        if (this.h == 0) {
            canvas.drawRect(f10, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), measuredWidth, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint);
        } else if (this.f27727e > 0.5f) {
            canvas.drawRect((getMeasuredWidth() / 2) - AndroidUtilities.dp(1.0f), (getMeasuredHeight() - i10) / 2, getMeasuredWidth() / 2, (getMeasuredHeight() + i10) / 2, paint);
            canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), measuredWidth, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint);
        } else {
            canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() - i10) / 2, AndroidUtilities.dp(1.0f) + (getMeasuredWidth() / 2), (getMeasuredHeight() + i10) / 2, paint);
            canvas.drawRect(measuredWidth, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() / 2, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint);
        }
        canvas.drawCircle(measuredWidth + i9, i9 + i11, f10, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i9 = this.f27726c;
        if (motionEvent != null) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float measuredWidth = (int) ((getMeasuredWidth() - i9) * this.f27727e);
            float f10 = 0.0f;
            if (motionEvent.getAction() == 0) {
                float measuredHeight = (getMeasuredHeight() - i9) / 2;
                if (measuredWidth - measuredHeight <= x10 && x10 <= i9 + measuredWidth + measuredHeight && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                    this.f27728f = true;
                    this.d = (int) (x10 - measuredWidth);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && this.f27728f) {
                    float f11 = (int) (x10 - this.d);
                    if (f11 >= 0.0f) {
                        if (f11 > getMeasuredWidth() - i9) {
                            f10 = getMeasuredWidth() - i9;
                        } else {
                            f10 = f11;
                        }
                    }
                    this.f27727e = f10 / (getMeasuredWidth() - i9);
                    ce0 ce0Var = this.f27730r;
                    if (ce0Var != null) {
                        ce0Var.l(((Integer) getTag()).intValue(), getProgress());
                    }
                    invalidate();
                    return true;
                }
            } else if (this.f27728f) {
                this.f27728f = false;
                invalidate();
                return true;
            }
        }
        return false;
    }

    public void setDelegate(ce0 ce0Var) {
        this.f27730r = ce0Var;
    }

    public void setProgress(int i9) {
        a(i9, true);
    }
}
