package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public class sj0 extends w61 {
    public final jt0 V;
    public boolean W;
    public View f38090a0;
    public View f38091b0;

    public sj0(Context context, org.telegram.ui.ActionBar.g6 g6Var, jt0 jt0Var) {
        super(context, g6Var);
        this.V = jt0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final void A(int i7) {
        jt0 jt0Var = this.V;
        jt0Var.g("PAGER_TAB_END");
        jt0Var.p();
    }

    @Override
    public final boolean B(MotionEvent motionEvent) {
        boolean z9 = this.H;
        boolean B = super.B(motionEvent);
        if (z9 && !this.H && motionEvent != null && motionEvent.getActionMasked() == 2) {
            View[] viewPages = getViewPages();
            View view = viewPages[0];
            View view2 = viewPages[1];
            if (view != null && view2 != null && view.getTranslationX() == 0.0f && view.getMeasuredWidth() > 0 && Math.abs(view2.getTranslationX()) >= view.getMeasuredWidth()) {
                this.f38090a0 = view;
                this.f38091b0 = view2;
                jt0 jt0Var = this.V;
                jt0Var.g("PAGER_DRAG_ABORTED");
                jt0Var.p();
            }
        }
        return B;
    }

    @Override
    public final void F(View view, float f10) {
        if (view.getTranslationX() == f10) {
            return;
        }
        super.F(view, f10);
        invalidate();
    }

    public final void L(View view) {
        this.f38090a0 = null;
        this.f38091b0 = null;
        jt0 jt0Var = this.V;
        jt0Var.f("PAGE_BOUND", view, 0, 0, true);
        if (jt0Var.O == null) {
            return;
        }
        if (jt0Var.f35137d0) {
            jt0Var.i("page_bound");
        }
        RecyclerView l10 = jt0Var.O.l(view);
        jt0Var.b(l10);
        jt0Var.O.s(l10);
        jt0Var.p();
    }

    public final void M(MotionEvent motionEvent) {
        String str;
        if (motionEvent != null && motionEvent.getActionMasked() == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            jt0 jt0Var = this.V;
            boolean j3 = jt0Var.j(x10, y10);
            this.W = j3;
            if (j3) {
                str = "PAGER_DOWN_COMMON";
            } else {
                str = "PAGER_DOWN_PAGE";
            }
            jt0Var.g(str);
        }
    }

    @Override
    public final boolean b(MotionEvent motionEvent) {
        if (!this.W && this.V.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int save = canvas.save();
        float x10 = view.getX();
        jt0 jt0Var = this.V;
        canvas.clipRect(x10, -jt0Var.getTopBleed(), view.getX() + view.getWidth(), jt0Var.getBottomBleed() + getHeight());
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
        M(motionEvent);
        if (!this.W && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        jt0 jt0Var = this.V;
        if (motionEvent == null) {
            jt0Var.g("PAGER_CANCEL_NULL");
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
            jt0Var.g(str);
        }
        if (this.W || !B(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void u() {
        jt0 jt0Var = this.V;
        jt0Var.g("PAGER_SCROLL_END");
        jt0Var.p();
    }

    @Override
    public final void v() {
        this.f38090a0 = null;
        this.f38091b0 = null;
    }

    @Override
    public final void w(boolean z9) {
        this.V.p();
    }
}
