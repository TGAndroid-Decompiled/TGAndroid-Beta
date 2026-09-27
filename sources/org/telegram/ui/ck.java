package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class ck extends org.telegram.ui.Cells.w0 {
    public final xn f32741l2;

    public ck(Context context, org.telegram.ui.ActionBar.e6 e6Var, xn xnVar) {
        super(context, e6Var, false);
        this.f32741l2 = xnVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        xn xnVar = this.f32741l2;
        if (xnVar.B8 == null) {
            float y3 = ((xnVar.f39977x0.getY() + xnVar.f39922s9) - getY()) - AndroidUtilities.dp(4.0f);
            if (y3 > 0.0f) {
                if (y3 < getMeasuredHeight()) {
                    canvas.save();
                    canvas.clipRect(0.0f, y3, getMeasuredWidth(), getMeasuredHeight());
                    super.onDraw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            }
            super.onDraw(canvas);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        if (getAlpha() != 0.0f) {
            xn xnVar = this.f32741l2;
            lVar = ((org.telegram.ui.ActionBar.o2) xnVar).actionBar;
            if (!lVar.t() && !xnVar.A9()) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        if (getAlpha() != 0.0f) {
            xn xnVar = this.f32741l2;
            lVar = ((org.telegram.ui.ActionBar.o2) xnVar).actionBar;
            if (!lVar.t() && !xnVar.A9()) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        return false;
    }

    @Override
    public final void setAlpha(float f7) {
        int i10;
        super.setAlpha(f7);
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        setVisibility(i10);
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            invalidate();
        }
        super.setTranslationY(f7);
    }
}
