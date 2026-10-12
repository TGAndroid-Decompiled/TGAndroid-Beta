package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class jk extends org.telegram.ui.Cells.w0 {
    public final eo f39235t2;

    public jk(Context context, org.telegram.ui.ActionBar.c6 c6Var, eo eoVar) {
        super(context, c6Var, false);
        this.f39235t2 = eoVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        eo eoVar = this.f39235t2;
        if (eoVar.B8 == null) {
            float y3 = ((eoVar.f37478x0.getY() + eoVar.f37422s9) - getY()) - AndroidUtilities.dp(4.0f);
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
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() != 0.0f) {
            eo eoVar = this.f39235t2;
            kVar = ((org.telegram.ui.ActionBar.m2) eoVar).actionBar;
            if (!kVar.u() && !eoVar.F9()) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() != 0.0f) {
            eo eoVar = this.f39235t2;
            kVar = ((org.telegram.ui.ActionBar.m2) eoVar).actionBar;
            if (!kVar.u() && !eoVar.F9()) {
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
