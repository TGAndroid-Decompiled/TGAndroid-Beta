package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
public final class ej extends org.telegram.ui.Cells.t0 {
    public final wm f44992u2;

    public ej(Context context, org.telegram.ui.ActionBar.e6 e6Var, wm wmVar) {
        super(context, e6Var, false);
        this.f44992u2 = wmVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        wm wmVar = this.f44992u2;
        if (wmVar.Q8 == null) {
            float y9 = ((wmVar.A0.getY() + wmVar.M9) - getY()) - org.telegram.messenger.g0.L(4.0f);
            if (y9 > 0.0f) {
                if (y9 < getMeasuredHeight()) {
                    canvas.save();
                    canvas.clipRect(0.0f, y9, getMeasuredWidth(), getMeasuredHeight());
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
            wm wmVar = this.f44992u2;
            kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
            if (!kVar.v() && !wmVar.W9()) {
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
            wm wmVar = this.f44992u2;
            kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
            if (!kVar.v() && !wmVar.W9()) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        return false;
    }

    @Override
    public final void setAlpha(float f10) {
        int i3;
        super.setAlpha(f10);
        if (f10 > 0.0f) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        setVisibility(i3);
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            invalidate();
        }
        super.setTranslationY(f10);
    }
}
