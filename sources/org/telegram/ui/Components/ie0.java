package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class ie0 extends View {

    public Paint f29341a;

    public Paint f29342b;

    public int f29343c;
    public int d;

    public float f29344e;

    public boolean f29345f;
    public int h;

    public int f29346n;

    public he0 f29347r;

    public final void a(int i10, boolean z10) {
        he0 he0Var;
        int i11 = this.h;
        if (i10 < i11) {
            i10 = i11;
        } else {
            int i12 = this.f29346n;
            if (i10 > i12) {
                i10 = i12;
            }
        }
        this.f29344e = (i10 - i11) / (this.f29346n - i11);
        invalidate();
        if (!z10 || (he0Var = this.f29347r) == null) {
            return;
        }
        he0Var.l(((Integer) getTag()).intValue(), getProgress());
    }

    public int getProgress() {
        int i10 = this.h;
        return (int) ((this.f29344e * (this.f29346n - i10)) + i10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f29342b;
        int measuredHeight = getMeasuredHeight();
        int i10 = this.f29343c;
        int i11 = (measuredHeight - i10) / 2;
        int measuredWidth = (int) ((getMeasuredWidth() - i10) * this.f29344e);
        int i12 = i10 / 2;
        float f10 = i12;
        canvas.drawRect(f10, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() - i12, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), this.f29341a);
        if (this.h == 0) {
            canvas.drawRect(f10, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), measuredWidth, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint);
        } else if (this.f29344e > 0.5f) {
            canvas.drawRect((getMeasuredWidth() / 2) - AndroidUtilities.dp(1.0f), (getMeasuredHeight() - i10) / 2, getMeasuredWidth() / 2, (getMeasuredHeight() + i10) / 2, paint);
            canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), measuredWidth, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint);
        } else {
            canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() - i10) / 2, AndroidUtilities.dp(1.0f) + (getMeasuredWidth() / 2), (getMeasuredHeight() + i10) / 2, paint);
            canvas.drawRect(measuredWidth, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() / 2, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint);
        }
        canvas.drawCircle(measuredWidth + i12, i12 + i11, f10, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10 = this.f29343c;
        if (motionEvent != null) {
            float x8 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float measuredWidth = (int) ((getMeasuredWidth() - i10) * this.f29344e);
            float measuredWidth2 = 0.0f;
            if (motionEvent.getAction() == 0) {
                float measuredHeight = (getMeasuredHeight() - i10) / 2;
                if (measuredWidth - measuredHeight <= x8 && x8 <= i10 + measuredWidth + measuredHeight && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                    this.f29345f = true;
                    this.d = (int) (x8 - measuredWidth);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (this.f29345f) {
                    this.f29345f = false;
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() == 2 && this.f29345f) {
                float f10 = (int) (x8 - this.d);
                if (f10 >= 0.0f) {
                    measuredWidth2 = f10 > ((float) (getMeasuredWidth() - i10)) ? getMeasuredWidth() - i10 : f10;
                }
                this.f29344e = measuredWidth2 / (getMeasuredWidth() - i10);
                he0 he0Var = this.f29347r;
                if (he0Var != null) {
                    he0Var.l(((Integer) getTag()).intValue(), getProgress());
                }
                invalidate();
                return true;
            }
        }
        return false;
    }

    public void setDelegate(he0 he0Var) {
        this.f29347r = he0Var;
    }

    public void setProgress(int i10) {
        a(i10, true);
    }
}
