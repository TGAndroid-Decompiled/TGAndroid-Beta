package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
public abstract class l80 extends org.telegram.ui.ActionBar.u5 {
    public final ji.a M0;
    public final Paint N0;
    public q80 O0;

    public l80(Context context) {
        super(context);
        this.M0 = new ji.a(this);
        this.N0 = new Paint(1);
    }

    private int getLinkColor() {
        return i0.b.o(getTextColor(), (int) (Color.alpha(getTextColor()) * 0.1175f));
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (isClickable()) {
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, 0.0f, getPaddingRight() + getTextWidth() + getPaddingLeft(), getHeight());
            int linkColor = getLinkColor();
            Paint paint = this.N0;
            paint.setColor(linkColor);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint);
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
        ji.a aVar = this.M0;
        if (aVar != null) {
            if (motionEvent.getAction() == 0) {
                q80 q80Var = new q80(null, null, motionEvent.getX(), motionEvent.getY(), 0);
                q80Var.d(getLinkColor());
                this.O0 = q80Var;
                aVar.b(q80Var, null);
                k80 b10 = this.O0.b();
                b10.e(null, 0, 0.0f, 0.0f);
                b10.addRect(0.0f, 0.0f, getPaddingRight() + getTextWidth() + getPaddingLeft(), getHeight(), Path.Direction.CW);
                org.telegram.messenger.i0.h3(new at(21, this, q80Var), ViewConfiguration.getLongPressTimeout());
                return true;
            } else if (motionEvent.getAction() == 1) {
                aVar.f(true);
                if (this.O0 != null) {
                    performClick();
                }
                this.O0 = null;
                return true;
            } else if (motionEvent.getAction() == 3) {
                aVar.f(true);
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
