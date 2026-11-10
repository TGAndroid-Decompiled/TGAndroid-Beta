package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
public final class kj extends org.telegram.ui.Cells.t0 {
    public final cn f47314t2;

    public kj(Context context, org.telegram.ui.ActionBar.h6 h6Var, cn cnVar) {
        super(context, h6Var, false);
        this.f47314t2 = cnVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        cn cnVar = this.f47314t2;
        if (cnVar.P8 == null) {
            float y10 = ((cnVar.f44741z0.getY() + cnVar.N9) - getY()) - org.telegram.messenger.g0.L(4.0f);
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
        org.telegram.ui.ActionBar.l lVar;
        if (getAlpha() != 0.0f) {
            cn cnVar = this.f47314t2;
            lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
            if (!lVar.x() && !cnVar.X9()) {
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
            cn cnVar = this.f47314t2;
            lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
            if (!lVar.x() && !cnVar.X9()) {
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
