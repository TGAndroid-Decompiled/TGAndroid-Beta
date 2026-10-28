package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public class pm0 extends v91 {
    public final mw0 V;
    public boolean W;
    public View f31641a0;
    public View f31642b0;

    public pm0(Context context, org.telegram.ui.ActionBar.u6 u6Var, mw0 mw0Var) {
        super(context, u6Var);
        this.V = mw0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final void A(int i10) {
        mw0 mw0Var = this.V;
        mw0Var.g("PAGER_TAB_END");
        mw0Var.l();
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
                this.f31641a0 = view;
                this.f31642b0 = view2;
                mw0 mw0Var = this.V;
                mw0Var.g("PAGER_DRAG_ABORTED");
                mw0Var.l();
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
        this.f31641a0 = null;
        this.f31642b0 = null;
        mw0 mw0Var = this.V;
        mw0Var.f("PAGE_BOUND", view, 0, 0, true);
        if (mw0Var.O == null) {
            return;
        }
        if (mw0Var.f30652d0) {
            mw0Var.i("page_bound");
        }
        RecyclerView i10 = mw0Var.O.i(view);
        mw0Var.b(i10);
        mw0Var.O.n(i10);
        mw0Var.l();
    }

    public final void M(MotionEvent motionEvent) {
        String str;
        if (motionEvent != null && motionEvent.getActionMasked() == 0) {
            float x9 = motionEvent.getX();
            float y3 = motionEvent.getY();
            mw0 mw0Var = this.V;
            boolean j10 = mw0Var.j(x9, y3);
            this.W = j10;
            if (j10) {
                str = "PAGER_DOWN_COMMON";
            } else {
                str = "PAGER_DOWN_PAGE";
            }
            mw0Var.g(str);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int save = canvas.save();
        float x9 = view.getX();
        mw0 mw0Var = this.V;
        canvas.clipRect(x9, -mw0Var.getTopBleed(), view.getX() + view.getWidth(), mw0Var.getBottomBleed() + getHeight());
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
        mw0 mw0Var = this.V;
        if (motionEvent == null) {
            mw0Var.g("PAGER_CANCEL_NULL");
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
            mw0Var.g(str);
        }
        if (this.W || !B(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void u() {
        mw0 mw0Var = this.V;
        mw0Var.g("PAGER_SCROLL_END");
        mw0Var.l();
    }

    @Override
    public final void v() {
        this.f31641a0 = null;
        this.f31642b0 = null;
    }

    @Override
    public final void w(boolean z10) {
        this.V.l();
    }
}
