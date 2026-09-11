package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class dk extends org.telegram.ui.Cells.w0 {
    public final co f35810k2;

    public dk(Context context, org.telegram.ui.ActionBar.f6 f6Var, co coVar) {
        super(context, f6Var, false);
        this.f35810k2 = coVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        co coVar = this.f35810k2;
        if (coVar.B8 == null) {
            float y3 = ((coVar.f35473x0.getY() + coVar.f35418s9) - getY()) - AndroidUtilities.dp(4.0f);
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
            co coVar = this.f35810k2;
            kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
            if (!kVar.s() && !coVar.A9()) {
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
            co coVar = this.f35810k2;
            kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
            if (!kVar.s() && !coVar.A9()) {
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
