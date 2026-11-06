package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
public abstract class s70 extends org.telegram.ui.ActionBar.k5 {
    public final n2.n0 M0;
    public final Paint N0;
    public x70 O0;

    public s70(Context context) {
        super(context);
        this.M0 = new n2.n0(this);
        this.N0 = new Paint(1);
    }

    private int getLinkColor() {
        return i0.a.o(getTextColor(), (int) (Color.alpha(getTextColor()) * 0.1175f));
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (isClickable()) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getPaddingRight() + getTextWidth() + getPaddingLeft(), getHeight());
            int linkColor = getLinkColor();
            Paint paint = this.N0;
            paint.setColor(linkColor);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
        }
        super.onDraw(canvas);
        if (isClickable() && this.M0.h(canvas)) {
            invalidate();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isClickable()) {
            return super.onTouchEvent(motionEvent);
        }
        n2.n0 n0Var = this.M0;
        if (n0Var != null) {
            if (motionEvent.getAction() == 0) {
                x70 x70Var = new x70(null, null, motionEvent.getX(), motionEvent.getY(), 0);
                x70Var.d(getLinkColor());
                this.O0 = x70Var;
                n0Var.b(x70Var, null);
                r70 b10 = this.O0.b();
                b10.e(null, 0, 0.0f, 0.0f);
                b10.addRect(0.0f, 0.0f, getPaddingRight() + getTextWidth() + getPaddingLeft(), getHeight(), Path.Direction.CW);
                org.telegram.messenger.g0.i3(new fq(27, this, x70Var), ViewConfiguration.getLongPressTimeout());
                return true;
            } else if (motionEvent.getAction() == 1) {
                n0Var.f(true);
                if (this.O0 != null) {
                    performClick();
                }
                this.O0 = null;
                return true;
            } else if (motionEvent.getAction() == 3) {
                n0Var.f(true);
                this.O0 = null;
                return true;
            }
        }
        if (this.O0 == null && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
