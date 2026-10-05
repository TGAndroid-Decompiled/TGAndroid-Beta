package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public class bm0 extends h91 {
    public final bw0 V;
    public boolean W;
    public View f25025a0;
    public View f25026b0;

    public bm0(Context context, org.telegram.ui.ActionBar.d6 d6Var, bw0 bw0Var) {
        super(context, d6Var);
        this.V = bw0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final void A(int i10) {
        bw0 bw0Var = this.V;
        bw0Var.g("PAGER_TAB_END");
        bw0Var.l();
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
                this.f25025a0 = view;
                this.f25026b0 = view2;
                bw0 bw0Var = this.V;
                bw0Var.g("PAGER_DRAG_ABORTED");
                bw0Var.l();
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
        this.f25025a0 = null;
        this.f25026b0 = null;
        bw0 bw0Var = this.V;
        bw0Var.f("PAGE_BOUND", view, 0, 0, true);
        if (bw0Var.O == null) {
            return;
        }
        if (bw0Var.f25123d0) {
            bw0Var.i("page_bound");
        }
        RecyclerView i10 = bw0Var.O.i(view);
        bw0Var.b(i10);
        bw0Var.O.n(i10);
        bw0Var.l();
    }

    public final void M(MotionEvent motionEvent) {
        String str;
        if (motionEvent != null && motionEvent.getActionMasked() == 0) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            bw0 bw0Var = this.V;
            boolean j3 = bw0Var.j(x10, y3);
            this.W = j3;
            if (j3) {
                str = "PAGER_DOWN_COMMON";
            } else {
                str = "PAGER_DOWN_PAGE";
            }
            bw0Var.g(str);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int save = canvas.save();
        float x10 = view.getX();
        bw0 bw0Var = this.V;
        canvas.clipRect(x10, -bw0Var.getTopBleed(), view.getX() + view.getWidth(), bw0Var.getBottomBleed() + getHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
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
        bw0 bw0Var = this.V;
        if (motionEvent == null) {
            bw0Var.g("PAGER_CANCEL_NULL");
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
            bw0Var.g(str);
        }
        if (this.W || !B(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void u() {
        bw0 bw0Var = this.V;
        bw0Var.g("PAGER_SCROLL_END");
        bw0Var.l();
    }

    @Override
    public final void v() {
        this.f25025a0 = null;
        this.f25026b0 = null;
    }

    @Override
    public final void w(boolean z10) {
        this.V.l();
    }
}
