package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public class gk0 extends j71 {
    public final tt0 W;
    public boolean f35581a0;
    public View f35582b0;
    public View f35583c0;

    public gk0(Context context, org.telegram.ui.ActionBar.h6 h6Var, tt0 tt0Var) {
        super(context, h6Var);
        this.W = tt0Var;
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
        this.f35582b0 = null;
        this.f35583c0 = null;
        tt0 tt0Var = this.W;
        tt0Var.f("PAGE_BOUND", view, 0, 0, true);
        if (tt0Var.P == null) {
            return;
        }
        if (tt0Var.f40053e0) {
            tt0Var.i("page_bound");
        }
        RecyclerView n10 = tt0Var.P.n(view);
        tt0Var.b(n10);
        tt0Var.P.r(n10);
        tt0Var.p();
    }

    public final void I(MotionEvent motionEvent) {
        String str;
        if (motionEvent != null && motionEvent.getActionMasked() == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            tt0 tt0Var = this.W;
            boolean j3 = tt0Var.j(x10, y10);
            this.f35581a0 = j3;
            if (j3) {
                str = "PAGER_DOWN_COMMON";
            } else {
                str = "PAGER_DOWN_PAGE";
            }
            tt0Var.g(str);
        }
    }

    @Override
    public final boolean b(MotionEvent motionEvent) {
        if (!this.f35581a0 && this.W.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int save = canvas.save();
        float x10 = view.getX();
        tt0 tt0Var = this.W;
        canvas.clipRect(x10, -tt0Var.getTopBleed(), view.getX() + view.getWidth(), tt0Var.getBottomBleed() + getHeight());
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
        if (!this.f35581a0 && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        tt0 tt0Var = this.W;
        if (motionEvent == null) {
            tt0Var.g("PAGER_CANCEL_NULL");
            this.f35581a0 = false;
            return x(null);
        }
        I(motionEvent);
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            if (motionEvent.getActionMasked() == 1) {
                str = "PAGER_UP";
            } else {
                str = "PAGER_CANCEL";
            }
            tt0Var.g(str);
        }
        if (this.f35581a0 || !x(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void q() {
        tt0 tt0Var = this.W;
        tt0Var.g("PAGER_SCROLL_END");
        tt0Var.p();
    }

    @Override
    public final void r() {
        this.f35582b0 = null;
        this.f35583c0 = null;
    }

    @Override
    public final void s(boolean z10) {
        this.W.p();
    }

    @Override
    public final void w(int i7) {
        tt0 tt0Var = this.W;
        tt0Var.g("PAGER_TAB_END");
        tt0Var.p();
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
                this.f35582b0 = view;
                this.f35583c0 = view2;
                tt0 tt0Var = this.W;
                tt0Var.g("PAGER_DRAG_ABORTED");
                tt0Var.p();
            }
        }
        return x10;
    }
}
