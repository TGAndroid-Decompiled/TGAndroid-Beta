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
public class z80 extends org.telegram.ui.ActionBar.k5 {
    public final b90 J0;
    public final Paint K0;
    public f90 L0;

    public z80(Context context) {
        super(context);
        this.J0 = new b90(this);
        this.K0 = new Paint(1);
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
            Paint paint = this.K0;
            paint.setColor(linkColor);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
        }
        super.onDraw(canvas);
        if (isClickable() && this.J0.f(canvas)) {
            invalidate();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isClickable()) {
            return super.onTouchEvent(motionEvent);
        }
        b90 b90Var = this.J0;
        if (b90Var != null) {
            if (motionEvent.getAction() == 0) {
                f90 f90Var = new f90(null, null, motionEvent.getX(), motionEvent.getY(), 0);
                f90Var.d(getLinkColor());
                this.L0 = f90Var;
                b90Var.a(f90Var, null);
                y80 b10 = this.L0.b();
                b10.e(null, 0, 0.0f, 0.0f);
                b10.addRect(0.0f, 0.0f, getPaddingRight() + getTextWidth() + getPaddingLeft(), getHeight(), Path.Direction.CW);
                AndroidUtilities.runOnUIThread(new i80(1, this, f90Var), ViewConfiguration.getLongPressTimeout());
                return true;
            } else if (motionEvent.getAction() == 1) {
                b90Var.d(true);
                if (this.L0 != null) {
                    performClick();
                }
                this.L0 = null;
                return true;
            } else if (motionEvent.getAction() == 3) {
                b90Var.d(true);
                this.L0 = null;
                return true;
            }
        }
        if (this.L0 == null && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
