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

public class k80 extends org.telegram.ui.ActionBar.h5 {
    public final m80 I0;
    public final Paint J0;
    public q80 K0;

    public k80(Context context) {
        super(context);
        this.I0 = new m80(this);
        this.J0 = new Paint(1);
    }

    private int getLinkColor() {
        return i0.b.k(getTextColor(), (int) (Color.alpha(getTextColor()) * 0.1175f));
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
        m80 m80Var = this.I0;
        if (m80Var != null) {
            if (motionEvent.getAction() == 0) {
                q80 q80Var = new q80(null, null, motionEvent.getX(), motionEvent.getY(), 0);
                q80Var.d(getLinkColor());
                this.K0 = q80Var;
                m80Var.a(q80Var, null);
                j80 j80VarB = this.K0.b();
                j80VarB.e(null, 0, 0.0f, 0.0f);
                j80VarB.addRect(0.0f, 0.0f, getPaddingRight() + getTextWidth() + getPaddingLeft(), getHeight(), Path.Direction.CW);
                AndroidUtilities.runOnUIThread(new xq(25, this, q80Var), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                m80Var.d(true);
                if (this.K0 != null) {
                    performClick();
                }
                this.K0 = null;
                return true;
            }
            if (motionEvent.getAction() == 3) {
                m80Var.d(true);
                this.K0 = null;
                return true;
            }
        }
        return this.K0 != null || super.onTouchEvent(motionEvent);
    }
}
