package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class we0 extends View {
    public Paint f32250a;
    public Paint f32251b;
    public int f32252c;
    public int d;
    public float f32253e;
    public boolean f32254f;
    public int h;
    public int f32255n;
    public ve0 f32256r;

    public final void a(int i10, boolean z10) {
        ve0 ve0Var;
        int i11 = this.h;
        if (i10 < i11) {
            i10 = i11;
        } else {
            int i12 = this.f32255n;
            if (i10 > i12) {
                i10 = i12;
            }
        }
        this.f32253e = (i10 - i11) / (this.f32255n - i11);
        invalidate();
        if (z10 && (ve0Var = this.f32256r) != null) {
            ve0Var.k(((Integer) getTag()).intValue(), getProgress());
        }
    }

    public int getProgress() {
        int i10 = this.h;
        return (int) ((this.f32253e * (this.f32255n - i10)) + i10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        Paint paint = this.f32251b;
        int measuredHeight = getMeasuredHeight();
        int i11 = this.f32252c;
        int i12 = (measuredHeight - i11) / 2;
        int measuredWidth = (int) ((getMeasuredWidth() - i11) * this.f32253e);
        float f7 = i11 / 2;
        canvas.drawRect(f7, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() - i10, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), this.f32250a);
        if (this.h == 0) {
            canvas.drawRect(f7, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), measuredWidth, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint);
        } else if (this.f32253e > 0.5f) {
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
        int i10 = this.f32252c;
        if (motionEvent != null) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float measuredWidth = (int) ((getMeasuredWidth() - i10) * this.f32253e);
            float f7 = 0.0f;
            if (motionEvent.getAction() == 0) {
                float measuredHeight = (getMeasuredHeight() - i10) / 2;
                if (measuredWidth - measuredHeight <= x10 && x10 <= i10 + measuredWidth + measuredHeight && y3 >= 0.0f && y3 <= getMeasuredHeight()) {
                    this.f32254f = true;
                    this.d = (int) (x10 - measuredWidth);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && this.f32254f) {
                    float f10 = (int) (x10 - this.d);
                    if (f10 >= 0.0f) {
                        if (f10 > getMeasuredWidth() - i10) {
                            f7 = getMeasuredWidth() - i10;
                        } else {
                            f7 = f10;
                        }
                    }
                    this.f32253e = f7 / (getMeasuredWidth() - i10);
                    ve0 ve0Var = this.f32256r;
                    if (ve0Var != null) {
                        ve0Var.k(((Integer) getTag()).intValue(), getProgress());
                    }
                    invalidate();
                    return true;
                }
            } else if (this.f32254f) {
                this.f32254f = false;
                invalidate();
                return true;
            }
        }
        return false;
    }

    public void setDelegate(ve0 ve0Var) {
        this.f32256r = ve0Var;
    }

    public void setProgress(int i10) {
        a(i10, true);
    }
}
