package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
public final class ij extends org.telegram.ui.Cells.t0 {
    public final an f46681t2;

    public ij(Context context, org.telegram.ui.ActionBar.f6 f6Var, an anVar) {
        super(context, f6Var, false);
        this.f46681t2 = anVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        an anVar = this.f46681t2;
        if (anVar.P8 == null) {
            float y10 = ((anVar.f44043z0.getY() + anVar.L9) - getY()) - org.telegram.messenger.g0.L(4.0f);
            if (y10 > 0.0f) {
                if (y10 < getMeasuredHeight()) {
                    canvas.save();
                    canvas.clipRect(0.0f, y10, getMeasuredWidth(), getMeasuredHeight());
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
            an anVar = this.f46681t2;
            kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
            if (!kVar.v() && !anVar.W9()) {
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
            an anVar = this.f46681t2;
            kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
            if (!kVar.v() && !anVar.W9()) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        return false;
    }

    @Override
    public final void setAlpha(float f10) {
        int i7;
        super.setAlpha(f10);
        if (f10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        setVisibility(i7);
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            invalidate();
        }
        super.setTranslationY(f10);
    }
}
