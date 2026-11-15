package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public class wj0 extends w61 {
    public final it0 W;
    public boolean f41370a0;
    public View f41371b0;
    public View f41372c0;

    public wj0(Context context, org.telegram.ui.ActionBar.e6 e6Var, it0 it0Var) {
        super(context, e6Var);
        this.W = it0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final void D(View view, float f10) {
        if (view.getTranslationX() == f10) {
            return;
        }
        super.D(view, f10);
        invalidate();
    }

    public final void J(View view) {
        this.f41371b0 = null;
        this.f41372c0 = null;
        it0 it0Var = this.W;
        it0Var.f("PAGE_BOUND", view, 0, 0, true);
        if (it0Var.P == null) {
            return;
        }
        if (it0Var.f35711e0) {
            it0Var.i("page_bound");
        }
        RecyclerView n10 = it0Var.P.n(view);
        it0Var.b(n10);
        it0Var.P.s(n10);
        it0Var.p();
    }

    public final void K(MotionEvent motionEvent) {
        String str;
        if (motionEvent != null && motionEvent.getActionMasked() == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            it0 it0Var = this.W;
            boolean j3 = it0Var.j(x10, y10);
            this.f41370a0 = j3;
            if (j3) {
                str = "PAGER_DOWN_COMMON";
            } else {
                str = "PAGER_DOWN_PAGE";
            }
            it0Var.g(str);
        }
    }

    @Override
    public final boolean b(MotionEvent motionEvent) {
        if (!this.f41370a0 && this.W.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int save = canvas.save();
        float x10 = view.getX();
        it0 it0Var = this.W;
        canvas.clipRect(x10, -it0Var.getTopBleed(), view.getX() + view.getWidth(), it0Var.getBottomBleed() + getHeight());
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
        K(motionEvent);
        if (!this.f41370a0 && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        it0 it0Var = this.W;
        if (motionEvent == null) {
            it0Var.g("PAGER_CANCEL_NULL");
            this.f41370a0 = false;
            return z(null);
        }
        K(motionEvent);
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            if (motionEvent.getActionMasked() == 1) {
                str = "PAGER_UP";
            } else {
                str = "PAGER_CANCEL";
            }
            it0Var.g(str);
        }
        if (this.f41370a0 || !z(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void r() {
        it0 it0Var = this.W;
        it0Var.g("PAGER_SCROLL_END");
        it0Var.p();
    }

    @Override
    public final void s() {
        this.f41371b0 = null;
        this.f41372c0 = null;
    }

    @Override
    public final void t(boolean z10) {
        this.W.p();
    }

    @Override
    public final void x(int i7) {
        it0 it0Var = this.W;
        it0Var.g("PAGER_TAB_END");
        it0Var.p();
    }

    @Override
    public final boolean z(MotionEvent motionEvent) {
        boolean z10 = this.I;
        boolean z11 = super.z(motionEvent);
        if (z10 && !this.I && motionEvent != null && motionEvent.getActionMasked() == 2) {
            View[] viewPages = getViewPages();
            View view = viewPages[0];
            View view2 = viewPages[1];
            if (view != null && view2 != null && view.getTranslationX() == 0.0f && view.getMeasuredWidth() > 0 && Math.abs(view2.getTranslationX()) >= view.getMeasuredWidth()) {
                this.f41371b0 = view;
                this.f41372c0 = view2;
                it0 it0Var = this.W;
                it0Var.g("PAGER_DRAG_ABORTED");
                it0Var.p();
            }
        }
        return z11;
    }
}
