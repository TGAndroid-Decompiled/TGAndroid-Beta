package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public class ek0 extends g71 {
    public final qt0 W;
    public boolean f34730a0;
    public View f34731b0;
    public View f34732c0;

    public ek0(Context context, org.telegram.ui.ActionBar.i6 i6Var, qt0 qt0Var) {
        super(context, i6Var);
        this.W = qt0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final void B(View view, float f10) {
        if (view.getTranslationX() == f10) {
            return;
        }
        super.B(view, f10);
        invalidate();
    }

    public final void H(View view) {
        this.f34731b0 = null;
        this.f34732c0 = null;
        qt0 qt0Var = this.W;
        qt0Var.f("PAGE_BOUND", view, 0, 0, true);
        if (qt0Var.P == null) {
            return;
        }
        if (qt0Var.f38904e0) {
            qt0Var.i("page_bound");
        }
        RecyclerView n10 = qt0Var.P.n(view);
        qt0Var.b(n10);
        qt0Var.P.r(n10);
        qt0Var.p();
    }

    public final void I(MotionEvent motionEvent) {
        String str;
        if (motionEvent != null && motionEvent.getActionMasked() == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            qt0 qt0Var = this.W;
            boolean j3 = qt0Var.j(x10, y10);
            this.f34730a0 = j3;
            if (j3) {
                str = "PAGER_DOWN_COMMON";
            } else {
                str = "PAGER_DOWN_PAGE";
            }
            qt0Var.g(str);
        }
    }

    @Override
    public final boolean b(MotionEvent motionEvent) {
        if (!this.f34730a0 && this.W.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int save = canvas.save();
        float x10 = view.getX();
        qt0 qt0Var = this.W;
        canvas.clipRect(x10, -qt0Var.getTopBleed(), view.getX() + view.getWidth(), qt0Var.getBottomBleed() + getHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restoreToCount(save);
        return drawChild;
    }

    @Override
    public float getAvailableTranslationX() {
        return Math.max(1, getMeasuredWidth());
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        I(motionEvent);
        if (!this.f34730a0 && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        qt0 qt0Var = this.W;
        if (motionEvent == null) {
            qt0Var.g("PAGER_CANCEL_NULL");
            this.f34730a0 = false;
            return x(null);
        }
        I(motionEvent);
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            if (motionEvent.getActionMasked() == 1) {
                str = "PAGER_UP";
            } else {
                str = "PAGER_CANCEL";
            }
            qt0Var.g(str);
        }
        if (this.f34730a0 || !x(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void q() {
        qt0 qt0Var = this.W;
        qt0Var.g("PAGER_SCROLL_END");
        qt0Var.p();
    }

    @Override
    public final void r() {
        this.f34731b0 = null;
        this.f34732c0 = null;
    }

    @Override
    public final void s(boolean z10) {
        this.W.p();
    }

    @Override
    public final void w(int i7) {
        qt0 qt0Var = this.W;
        qt0Var.g("PAGER_TAB_END");
        qt0Var.p();
    }

    @Override
    public final boolean x(MotionEvent motionEvent) {
        boolean z10 = this.I;
        boolean x10 = super.x(motionEvent);
        if (z10 && !this.I && motionEvent != null && motionEvent.getActionMasked() == 2) {
            View[] viewPages = getViewPages();
            View view = viewPages[0];
            View view2 = viewPages[1];
            if (view != null && view2 != null && view.getTranslationX() == 0.0f && view.getMeasuredWidth() > 0 && Math.abs(view2.getTranslationX()) >= view.getMeasuredWidth()) {
                this.f34731b0 = view;
                this.f34732c0 = view2;
                qt0 qt0Var = this.W;
                qt0Var.g("PAGER_DRAG_ABORTED");
                qt0Var.p();
            }
        }
        return x10;
    }
}
