package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
public final class dk extends org.telegram.ui.Cells.s0 {
    public final un f36788t2;

    public dk(Context context, org.telegram.ui.ActionBar.p6 p6Var, un unVar) {
        super(context, p6Var, false);
        this.f36788t2 = unVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        un unVar = this.f36788t2;
        if (unVar.P8 == null) {
            float y3 = ((unVar.f42492z0.getY() + unVar.L9) - getY()) - org.telegram.messenger.i0.L(4.0f);
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
        org.telegram.ui.ActionBar.l lVar;
        if (getAlpha() != 0.0f) {
            un unVar = this.f36788t2;
            lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
            if (!lVar.u() && !unVar.M9()) {
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
            un unVar = this.f36788t2;
            lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
            if (!lVar.u() && !unVar.M9()) {
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
