package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class ek extends org.telegram.ui.Cells.w0 {
    public final bo f33425l2;

    public ek(Context context, org.telegram.ui.ActionBar.f6 f6Var, bo boVar) {
        super(context, f6Var, false);
        this.f33425l2 = boVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        bo boVar = this.f33425l2;
        if (boVar.B8 == null) {
            float y3 = ((boVar.f32506x0.getY() + boVar.f32451s9) - getY()) - AndroidUtilities.dp(4.0f);
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
            bo boVar = this.f33425l2;
            kVar = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
            if (!kVar.s() && !boVar.A9()) {
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
            bo boVar = this.f33425l2;
            kVar = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
            if (!kVar.s() && !boVar.A9()) {
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
