package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class jk extends org.telegram.ui.Cells.w0 {
    public final fo f37082t2;

    public jk(Context context, org.telegram.ui.ActionBar.c6 c6Var, fo foVar) {
        super(context, c6Var, false);
        this.f37082t2 = foVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        fo foVar = this.f37082t2;
        if (foVar.B8 == null) {
            float y3 = ((foVar.f35861x0.getY() + foVar.f35805s9) - getY()) - AndroidUtilities.dp(4.0f);
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
            fo foVar = this.f37082t2;
            kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
            if (!kVar.t() && !foVar.F9()) {
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
            fo foVar = this.f37082t2;
            kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
            if (!kVar.t() && !foVar.F9()) {
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
