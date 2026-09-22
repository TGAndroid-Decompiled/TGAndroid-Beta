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
public class i90 extends org.telegram.ui.ActionBar.j5 {
    public final k90 M0;
    public final Paint N0;
    public o90 O0;

    public i90(Context context) {
        super(context);
        this.M0 = new k90(this);
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
        k90 k90Var = this.M0;
        if (k90Var != null) {
            if (motionEvent.getAction() == 0) {
                o90 o90Var = new o90(null, null, motionEvent.getX(), motionEvent.getY(), 0);
                o90Var.d(getLinkColor());
                this.O0 = o90Var;
                k90Var.a(o90Var, null);
                h90 b10 = this.O0.b();
                b10.e(null, 0, 0.0f, 0.0f);
                b10.addRect(0.0f, 0.0f, getPaddingRight() + getTextWidth() + getPaddingLeft(), getHeight(), Path.Direction.CW);
                AndroidUtilities.runOnUIThread(new bv(19, this, o90Var), ViewConfiguration.getLongPressTimeout());
                return true;
            } else if (motionEvent.getAction() == 1) {
                k90Var.d(true);
                if (this.O0 != null) {
                    performClick();
                }
                this.O0 = null;
                return true;
            } else if (motionEvent.getAction() == 3) {
                k90Var.d(true);
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
