package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class fk extends org.telegram.ui.Cells.w0 {
    public final eo f32854k2;

    public fk(Context context, org.telegram.ui.ActionBar.f6 f6Var, eo eoVar) {
        super(context, f6Var, false);
        this.f32854k2 = eoVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        eo eoVar = this.f32854k2;
        if (eoVar.B8 == null) {
            float y3 = ((eoVar.f32542x0.getY() + eoVar.f32487s9) - getY()) - AndroidUtilities.dp(4.0f);
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
            eo eoVar = this.f32854k2;
            lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
            if (!lVar.s() && !eoVar.A9()) {
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
            eo eoVar = this.f32854k2;
            lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
            if (!lVar.s() && !eoVar.A9()) {
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
