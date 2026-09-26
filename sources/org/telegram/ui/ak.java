package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class ak extends org.telegram.ui.Cells.w0 {
    public final wn f32179l2;

    public ak(Context context, org.telegram.ui.ActionBar.d6 d6Var, wn wnVar) {
        super(context, d6Var, false);
        this.f32179l2 = wnVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        wn wnVar = this.f32179l2;
        if (wnVar.B8 == null) {
            float y3 = ((wnVar.f39694x0.getY() + wnVar.f39639s9) - getY()) - AndroidUtilities.dp(4.0f);
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
            wn wnVar = this.f32179l2;
            kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
            if (!kVar.s() && !wnVar.A9()) {
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
            wn wnVar = this.f32179l2;
            kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
            if (!kVar.s() && !wnVar.A9()) {
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
