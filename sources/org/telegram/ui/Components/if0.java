package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class if0 extends View {
    public Paint f25098a;
    public Paint f25099b;
    public int f25100c;
    public int d;
    public float e;
    public boolean f25101f;
    public int h;
    public int f25102n;
    public hf0 f25103r;

    public final void a(int i10, boolean z10) {
        hf0 hf0Var;
        int i11 = this.h;
        if (i10 < i11) {
            i10 = i11;
        } else {
            int i12 = this.f25102n;
            if (i10 > i12) {
                i10 = i12;
            }
        }
        this.e = (i10 - i11) / (this.f25102n - i11);
        invalidate();
        if (z10 && (hf0Var = this.f25103r) != null) {
            hf0Var.l(((Integer) getTag()).intValue(), getProgress());
        }
    }

    public int getProgress() {
        int i10 = this.h;
        return (int) ((this.e * (this.f25102n - i10)) + i10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        Paint paint = this.f25099b;
        int measuredHeight = getMeasuredHeight();
        int i11 = this.f25100c;
        int i12 = (measuredHeight - i11) / 2;
        int measuredWidth = (int) ((getMeasuredWidth() - i11) * this.e);
        float f7 = i11 / 2;
        canvas.drawRect(f7, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() - i10, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), this.f25098a);
        if (this.h == 0) {
            canvas.drawRect(f7, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), measuredWidth, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint);
        } else if (this.e > 0.5f) {
            canvas.drawRect((getMeasuredWidth() / 2) - AndroidUtilities.dp(1.0f), (getMeasuredHeight() - i11) / 2, getMeasuredWidth() / 2, (getMeasuredHeight() + i11) / 2, paint);
            canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), measuredWidth, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint);
        } else {
            canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() - i11) / 2, AndroidUtilities.dp(1.0f) + (getMeasuredWidth() / 2), (getMeasuredHeight() + i11) / 2, paint);
            canvas.drawRect(measuredWidth, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() / 2, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint);
        }
        canvas.drawCircle(measuredWidth + i10, i10 + i12, f7, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10 = this.f25100c;
        if (motionEvent != null) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float measuredWidth = (int) ((getMeasuredWidth() - i10) * this.e);
            float f7 = 0.0f;
            if (motionEvent.getAction() == 0) {
                float measuredHeight = (getMeasuredHeight() - i10) / 2;
                if (measuredWidth - measuredHeight <= x10 && x10 <= i10 + measuredWidth + measuredHeight && y3 >= 0.0f && y3 <= getMeasuredHeight()) {
                    this.f25101f = true;
                    this.d = (int) (x10 - measuredWidth);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && this.f25101f) {
                    float f10 = (int) (x10 - this.d);
                    if (f10 >= 0.0f) {
                        if (f10 > getMeasuredWidth() - i10) {
                            f7 = getMeasuredWidth() - i10;
                        } else {
                            f7 = f10;
                        }
                    }
                    this.e = f7 / (getMeasuredWidth() - i10);
                    hf0 hf0Var = this.f25103r;
                    if (hf0Var != null) {
                        hf0Var.l(((Integer) getTag()).intValue(), getProgress());
                    }
                    invalidate();
                    return true;
                }
            } else if (this.f25101f) {
                this.f25101f = false;
                invalidate();
                return true;
            }
        }
        return false;
    }

    public void setDelegate(hf0 hf0Var) {
        this.f25103r = hf0Var;
    }

    public void setProgress(int i10) {
        a(i10, true);
    }
}
