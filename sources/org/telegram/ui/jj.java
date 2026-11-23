package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
public final class jj extends org.telegram.ui.Cells.v0 {
    public final bn f49133z2;

    public jj(Context context, org.telegram.ui.ActionBar.i6 i6Var, bn bnVar) {
        super(context, i6Var, false);
        this.f49133z2 = bnVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        bn bnVar = this.f49133z2;
        if (bnVar.R8 == null) {
            float y10 = ((bnVar.A0.getY() + bnVar.P9) - getY()) - org.telegram.messenger.g0.L(4.0f);
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
            bn bnVar = this.f49133z2;
            kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
            if (!kVar.x() && !bnVar.Y9()) {
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
            bn bnVar = this.f49133z2;
            kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
            if (!kVar.x() && !bnVar.Y9()) {
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
