package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class qf0 extends View {
    public Paint f31908a;
    public Paint f31909b;
    public int f31910c;
    public int d;
    public float e;
    public boolean f31911f;
    public int h;
    public int f31912n;
    public pf0 f31913r;

    public final void a(int i10, boolean z10) {
        pf0 pf0Var;
        int i11 = this.h;
        if (i10 < i11) {
            i10 = i11;
        } else {
            int i12 = this.f31912n;
            if (i10 > i12) {
                i10 = i12;
            }
        }
        this.e = (i10 - i11) / (this.f31912n - i11);
        invalidate();
        if (z10 && (pf0Var = this.f31913r) != null) {
            pf0Var.l(((Integer) getTag()).intValue(), getProgress());
        }
    }

    public int getProgress() {
        int i10 = this.h;
        return (int) ((this.e * (this.f31912n - i10)) + i10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        Paint paint = this.f31909b;
        int measuredHeight = getMeasuredHeight();
        int i11 = this.f31910c;
        int i12 = (measuredHeight - i11) / 2;
        int measuredWidth = (int) ((getMeasuredWidth() - i11) * this.e);
        float f7 = i11 / 2;
        canvas.drawRect(f7, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() - i10, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), this.f31908a);
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
        int i10 = this.f31910c;
        if (motionEvent != null) {
            float x9 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float measuredWidth = (int) ((getMeasuredWidth() - i10) * this.e);
            float f7 = 0.0f;
            if (motionEvent.getAction() == 0) {
                float measuredHeight = (getMeasuredHeight() - i10) / 2;
                if (measuredWidth - measuredHeight <= x9 && x9 <= i10 + measuredWidth + measuredHeight && y3 >= 0.0f && y3 <= getMeasuredHeight()) {
                    this.f31911f = true;
                    this.d = (int) (x9 - measuredWidth);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && this.f31911f) {
                    float f10 = (int) (x9 - this.d);
                    if (f10 >= 0.0f) {
                        if (f10 > getMeasuredWidth() - i10) {
                            f7 = getMeasuredWidth() - i10;
                        } else {
                            f7 = f10;
                        }
                    }
                    this.e = f7 / (getMeasuredWidth() - i10);
                    pf0 pf0Var = this.f31913r;
                    if (pf0Var != null) {
                        pf0Var.l(((Integer) getTag()).intValue(), getProgress());
                    }
                    invalidate();
                    return true;
                }
            } else if (this.f31911f) {
                this.f31911f = false;
                invalidate();
                return true;
            }
        }
        return false;
    }

    public void setDelegate(pf0 pf0Var) {
        this.f31913r = pf0Var;
    }

    public void setProgress(int i10) {
        a(i10, true);
    }
}
