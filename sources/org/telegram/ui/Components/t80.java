package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public class t80 extends org.telegram.ui.ActionBar.h5 {
    public final v80 I0;
    public final Paint J0;
    public z80 K0;

    public t80(Context context) {
        super(context);
        this.I0 = new v80(this);
        this.J0 = new Paint(1);
    }

    private int getLinkColor() {
        return i0.a.k(getTextColor(), (int) (Color.alpha(getTextColor()) * 0.1175f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (isClickable()) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getPaddingRight() + getTextWidth() + getPaddingLeft(), getHeight());
            int linkColor = getLinkColor();
            Paint paint = this.J0;
            paint.setColor(linkColor);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
        }
        super.onDraw(canvas);
        if (isClickable() && this.I0.f(canvas)) {
            invalidate();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isClickable()) {
            return super.onTouchEvent(motionEvent);
        }
        v80 v80Var = this.I0;
        if (v80Var != null) {
            if (motionEvent.getAction() == 0) {
                z80 z80Var = new z80(null, null, motionEvent.getX(), motionEvent.getY(), 0);
                z80Var.d(getLinkColor());
                this.K0 = z80Var;
                v80Var.a(z80Var, null);
                s80 b10 = this.K0.b();
                b10.e(null, 0, 0.0f, 0.0f);
                b10.addRect(0.0f, 0.0f, getPaddingRight() + getTextWidth() + getPaddingLeft(), getHeight(), Path.Direction.CW);
                AndroidUtilities.runOnUIThread(new gt(22, this, z80Var), ViewConfiguration.getLongPressTimeout());
                return true;
            } else if (motionEvent.getAction() == 1) {
                v80Var.d(true);
                if (this.K0 != null) {
                    performClick();
                }
                this.K0 = null;
                return true;
            } else if (motionEvent.getAction() == 3) {
                v80Var.d(true);
                this.K0 = null;
                return true;
            }
        }
        if (this.K0 == null && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
