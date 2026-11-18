package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
public abstract class g80 extends org.telegram.ui.ActionBar.n5 {
    public final n2.o0 N0;
    public final Paint O0;
    public l80 P0;

    public g80(Context context) {
        super(context);
        this.N0 = new n2.o0(this);
        this.O0 = new Paint(1);
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
            Paint paint = this.O0;
            paint.setColor(linkColor);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
        }
        super.onDraw(canvas);
        if (isClickable() && this.N0.h(canvas)) {
            invalidate();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isClickable()) {
            return super.onTouchEvent(motionEvent);
        }
        n2.o0 o0Var = this.N0;
        if (o0Var != null) {
            if (motionEvent.getAction() == 0) {
                l80 l80Var = new l80(null, null, motionEvent.getX(), motionEvent.getY(), 0);
                l80Var.d(getLinkColor());
                this.P0 = l80Var;
                o0Var.b(l80Var, null);
                f80 b10 = this.P0.b();
                b10.e(null, 0, 0.0f, 0.0f);
                b10.addRect(0.0f, 0.0f, getPaddingRight() + getTextWidth() + getPaddingLeft(), getHeight(), Path.Direction.CW);
                org.telegram.messenger.g0.h3(new dw(17, this, l80Var), ViewConfiguration.getLongPressTimeout());
                return true;
            } else if (motionEvent.getAction() == 1) {
                o0Var.f(true);
                if (this.P0 != null) {
                    performClick();
                }
                this.P0 = null;
                return true;
            } else if (motionEvent.getAction() == 3) {
                o0Var.f(true);
                this.P0 = null;
                return true;
            }
        }
        if (this.P0 == null && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
