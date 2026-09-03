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
public class a90 extends org.telegram.ui.ActionBar.l5 {
    public final d90 J0;
    public final Paint K0;
    public h90 L0;

    public a90(Context context) {
        super(context);
        this.J0 = new d90(this);
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
        d90 d90Var = this.J0;
        if (d90Var != null) {
            if (motionEvent.getAction() == 0) {
                h90 h90Var = new h90(null, null, motionEvent.getX(), motionEvent.getY(), 0);
                h90Var.d(getLinkColor());
                this.L0 = h90Var;
                d90Var.a(h90Var, null);
                z80 b10 = this.L0.b();
                b10.e(null, 0, 0.0f, 0.0f);
                b10.addRect(0.0f, 0.0f, getPaddingRight() + getTextWidth() + getPaddingLeft(), getHeight(), Path.Direction.CW);
                AndroidUtilities.runOnUIThread(new eo(29, this, h90Var), ViewConfiguration.getLongPressTimeout());
                return true;
            } else if (motionEvent.getAction() == 1) {
                d90Var.d(true);
                if (this.L0 != null) {
                    performClick();
                }
                this.L0 = null;
                return true;
            } else if (motionEvent.getAction() == 3) {
                d90Var.d(true);
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
