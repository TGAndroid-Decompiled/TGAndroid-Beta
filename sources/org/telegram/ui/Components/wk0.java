package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public class wk0 extends x71 {
    public final lu0 V;
    public boolean W;
    public View f32274a0;
    public View f32275b0;

    public wk0(Context context, org.telegram.ui.ActionBar.p6 p6Var, lu0 lu0Var) {
        super(context, p6Var);
        this.V = lu0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final void A(int i10) {
        lu0 lu0Var = this.V;
        lu0Var.g("PAGER_TAB_END");
        lu0Var.p();
    }

    @Override
    public final boolean B(MotionEvent motionEvent) {
        boolean z10 = this.H;
        boolean B = super.B(motionEvent);
        if (z10 && !this.H && motionEvent != null && motionEvent.getActionMasked() == 2) {
            View[] viewPages = getViewPages();
            View view = viewPages[0];
            View view2 = viewPages[1];
            if (view != null && view2 != null && view.getTranslationX() == 0.0f && view.getMeasuredWidth() > 0 && Math.abs(view2.getTranslationX()) >= view.getMeasuredWidth()) {
                this.f32274a0 = view;
                this.f32275b0 = view2;
                lu0 lu0Var = this.V;
                lu0Var.g("PAGER_DRAG_ABORTED");
                lu0Var.p();
            }
        }
        return B;
    }

    @Override
    public final void F(View view, float f7) {
        if (view.getTranslationX() == f7) {
            return;
        }
        super.F(view, f7);
        invalidate();
    }

    public final void L(View view) {
        this.f32274a0 = null;
        this.f32275b0 = null;
        lu0 lu0Var = this.V;
        lu0Var.f("PAGE_BOUND", view, 0, 0, true);
        if (lu0Var.O == null) {
            return;
        }
        if (lu0Var.f28275d0) {
            lu0Var.i("page_bound");
        }
        RecyclerView j10 = lu0Var.O.j(view);
        lu0Var.b(j10);
        lu0Var.O.q(j10);
        lu0Var.p();
    }

    public final void M(MotionEvent motionEvent) {
        String str;
        if (motionEvent != null && motionEvent.getActionMasked() == 0) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            lu0 lu0Var = this.V;
            boolean j10 = lu0Var.j(x10, y3);
            this.W = j10;
            if (j10) {
                str = "PAGER_DOWN_COMMON";
            } else {
                str = "PAGER_DOWN_PAGE";
            }
            lu0Var.g(str);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int save = canvas.save();
        float x10 = view.getX();
        lu0 lu0Var = this.V;
        canvas.clipRect(x10, -lu0Var.getTopBleed(), view.getX() + view.getWidth(), lu0Var.getBottomBleed() + getHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        return drawChild;
    }

    @Override
    public float getAvailableTranslationX() {
        return Math.max(1, getMeasuredWidth());
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        if (!this.W && this.V.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        M(motionEvent);
        if (!this.W && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        lu0 lu0Var = this.V;
        if (motionEvent == null) {
            lu0Var.g("PAGER_CANCEL_NULL");
            this.W = false;
            return B(null);
        }
        M(motionEvent);
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            if (motionEvent.getActionMasked() == 1) {
                str = "PAGER_UP";
            } else {
                str = "PAGER_CANCEL";
            }
            lu0Var.g(str);
        }
        if (this.W || !B(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void u() {
        lu0 lu0Var = this.V;
        lu0Var.g("PAGER_SCROLL_END");
        lu0Var.p();
    }

    @Override
    public final void v() {
        this.f32274a0 = null;
        this.f32275b0 = null;
    }

    @Override
    public final void w(boolean z10) {
        this.V.p();
    }
}
