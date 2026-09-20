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
public class f90 extends org.telegram.ui.ActionBar.j5 {
    public final h90 M0;
    public final Paint N0;
    public l90 O0;

    public f90(Context context) {
        super(context);
        this.M0 = new h90(this);
        this.N0 = new Paint(1);
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
            Paint paint = this.N0;
            paint.setColor(linkColor);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
        }
        super.onDraw(canvas);
        if (isClickable() && this.M0.f(canvas)) {
            invalidate();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isClickable()) {
            return super.onTouchEvent(motionEvent);
        }
        h90 h90Var = this.M0;
        if (h90Var != null) {
            if (motionEvent.getAction() == 0) {
                l90 l90Var = new l90(null, null, motionEvent.getX(), motionEvent.getY(), 0);
                l90Var.d(getLinkColor());
                this.O0 = l90Var;
                h90Var.a(l90Var, null);
                e90 b10 = this.O0.b();
                b10.e(null, 0, 0.0f, 0.0f);
                b10.addRect(0.0f, 0.0f, getPaddingRight() + getTextWidth() + getPaddingLeft(), getHeight(), Path.Direction.CW);
                AndroidUtilities.runOnUIThread(new bv(19, this, l90Var), ViewConfiguration.getLongPressTimeout());
                return true;
            } else if (motionEvent.getAction() == 1) {
                h90Var.d(true);
                if (this.O0 != null) {
                    performClick();
                }
                this.O0 = null;
                return true;
            } else if (motionEvent.getAction() == 3) {
                h90Var.d(true);
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
