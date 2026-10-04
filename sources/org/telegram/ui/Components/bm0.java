package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public class bm0 extends g91 {
    public final aw0 U;
    public boolean V;
    public View W;
    public View f25004a0;

    public bm0(Context context, org.telegram.ui.ActionBar.d6 d6Var, aw0 aw0Var) {
        super(context, d6Var);
        this.U = aw0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final void A(int i10) {
        aw0 aw0Var = this.U;
        aw0Var.f0("PAGER_TAB_END");
        aw0Var.k0();
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
                this.W = view;
                this.f25004a0 = view2;
                aw0 aw0Var = this.U;
                aw0Var.f0("PAGER_DRAG_ABORTED");
                aw0Var.k0();
            }
        }
        return B;
    }

    @Override
    public final void F(View view, float f7) {
        if (view.getTranslationX() == f7) {
            return;
        }
        view.setTranslationX(f7);
        invalidate();
    }

    public final void L(View view) {
        this.W = null;
        this.f25004a0 = null;
        aw0 aw0Var = this.U;
        aw0Var.e0("PAGE_BOUND", view, 0, 0, true);
        if (aw0Var.U0 == null) {
            return;
        }
        if (aw0Var.f24691g1) {
            aw0Var.h0("page_bound");
        }
        RecyclerView i10 = aw0Var.U0.i(view);
        aw0Var.a0(i10);
        aw0Var.U0.n(i10);
        aw0Var.k0();
    }

    public final void M(MotionEvent motionEvent) {
        String str;
        if (motionEvent != null && motionEvent.getActionMasked() == 0) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            aw0 aw0Var = this.U;
            boolean i02 = aw0Var.i0(x10, y3);
            this.V = i02;
            if (i02) {
                str = "PAGER_DOWN_COMMON";
            } else {
                str = "PAGER_DOWN_PAGE";
            }
            aw0Var.f0(str);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int save = canvas.save();
        float x10 = view.getX();
        aw0 aw0Var = this.U;
        canvas.clipRect(x10, -aw0Var.getTopBleed(), view.getX() + view.getWidth(), aw0Var.getBottomBleed() + getHeight());
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
        if (!this.V && this.U.b0()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        M(motionEvent);
        if (!this.V && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        aw0 aw0Var = this.U;
        if (motionEvent == null) {
            aw0Var.f0("PAGER_CANCEL_NULL");
            this.V = false;
            return B(null);
        }
        M(motionEvent);
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            if (motionEvent.getActionMasked() == 1) {
                str = "PAGER_UP";
            } else {
                str = "PAGER_CANCEL";
            }
            aw0Var.f0(str);
        }
        if (this.V || !B(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void u() {
        aw0 aw0Var = this.U;
        aw0Var.f0("PAGER_SCROLL_END");
        aw0Var.k0();
    }

    @Override
    public final void v() {
        this.W = null;
        this.f25004a0 = null;
    }

    @Override
    public final void w(boolean z10) {
        this.U.k0();
    }
}
