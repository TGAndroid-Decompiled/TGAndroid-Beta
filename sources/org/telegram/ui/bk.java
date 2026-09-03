package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class bk extends org.telegram.ui.Cells.v0 {
    public final zn f32903h2;

    public bk(Context context, org.telegram.ui.ActionBar.f6 f6Var, zn znVar) {
        super(context, f6Var, false);
        this.f32903h2 = znVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        zn znVar = this.f32903h2;
        if (znVar.f40822y8 == null) {
            float y10 = ((znVar.f40759u0.getY() + znVar.f40707p9) - getY()) - AndroidUtilities.dp(4.0f);
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
            zn znVar = this.f32903h2;
            kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
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
            zn znVar = this.f32903h2;
            kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
            if (!kVar.s() && !znVar.A9()) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        return false;
    }

    @Override
    public final void setAlpha(float f10) {
        int i10;
        super.setAlpha(f10);
        if (f10 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        setVisibility(i10);
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            invalidate();
        }
        super.setTranslationY(f10);
    }
}
