package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class ck extends org.telegram.ui.Cells.w0 {
    public final zn f32778l2;

    public ck(Context context, org.telegram.ui.ActionBar.f6 f6Var, zn znVar) {
        super(context, f6Var, false);
        this.f32778l2 = znVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        zn znVar = this.f32778l2;
        if (znVar.B8 == null) {
            float y3 = ((znVar.f40530x0.getY() + znVar.f40475s9) - getY()) - AndroidUtilities.dp(4.0f);
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
            zn znVar = this.f32778l2;
            kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
            if (!kVar.s() && !znVar.A9()) {
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
            zn znVar = this.f32778l2;
            kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
            if (!kVar.s() && !znVar.A9()) {
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
