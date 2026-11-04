package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public class vj0 extends n61 {
    public final gt0 W;
    public boolean f39139a0;
    public View f39140b0;
    public View f39141c0;

    public vj0(Context context, org.telegram.ui.ActionBar.e6 e6Var, gt0 gt0Var) {
        super(context, e6Var);
        this.W = gt0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final boolean A(MotionEvent motionEvent) {
        boolean z10 = this.I;
        boolean A = super.A(motionEvent);
        if (z10 && !this.I && motionEvent != null && motionEvent.getActionMasked() == 2) {
            View[] viewPages = getViewPages();
            View view = viewPages[0];
            View view2 = viewPages[1];
            if (view != null && view2 != null && view.getTranslationX() == 0.0f && view.getMeasuredWidth() > 0 && Math.abs(view2.getTranslationX()) >= view.getMeasuredWidth()) {
                this.f39140b0 = view;
                this.f39141c0 = view2;
                gt0 gt0Var = this.W;
                gt0Var.g("PAGER_DRAG_ABORTED");
                gt0Var.l();
            }
        }
        return A;
    }

    @Override
    public final void E(View view, float f10) {
        if (view.getTranslationX() == f10) {
            return;
        }
        super.E(view, f10);
        invalidate();
    }

    public final void L(View view) {
        this.f39140b0 = null;
        this.f39141c0 = null;
        gt0 gt0Var = this.W;
        gt0Var.f("PAGE_BOUND", view, 0, 0, true);
        if (gt0Var.P == null) {
            return;
        }
        if (gt0Var.f34194e0) {
            gt0Var.i("page_bound");
        }
        RecyclerView m10 = gt0Var.P.m(view);
        gt0Var.b(m10);
        gt0Var.P.r(m10);
        gt0Var.l();
    }

    public final void M(MotionEvent motionEvent) {
        String str;
        if (motionEvent != null && motionEvent.getActionMasked() == 0) {
            float x10 = motionEvent.getX();
            float y9 = motionEvent.getY();
            gt0 gt0Var = this.W;
            boolean j10 = gt0Var.j(x10, y9);
            this.f39139a0 = j10;
            if (j10) {
                str = "PAGER_DOWN_COMMON";
            } else {
                str = "PAGER_DOWN_PAGE";
            }
            gt0Var.g(str);
        }
    }

    @Override
    public final boolean c(MotionEvent motionEvent) {
        if (!this.f39139a0 && this.W.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int save = canvas.save();
        float x10 = view.getX();
        gt0 gt0Var = this.W;
        canvas.clipRect(x10, -gt0Var.getTopBleed(), view.getX() + view.getWidth(), gt0Var.getBottomBleed() + getHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
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
        if (!this.f39139a0 && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        gt0 gt0Var = this.W;
        if (motionEvent == null) {
            gt0Var.g("PAGER_CANCEL_NULL");
            this.f39139a0 = false;
            return A(null);
        }
        M(motionEvent);
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            if (motionEvent.getActionMasked() == 1) {
                str = "PAGER_UP";
            } else {
                str = "PAGER_CANCEL";
            }
            gt0Var.g(str);
        }
        if (this.f39139a0 || !A(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void s() {
        gt0 gt0Var = this.W;
        gt0Var.g("PAGER_SCROLL_END");
        gt0Var.l();
    }

    @Override
    public final void t() {
        this.f39140b0 = null;
        this.f39141c0 = null;
    }

    @Override
    public final void u(boolean z10) {
        this.W.l();
    }

    @Override
    public final void z(int i3) {
        gt0 gt0Var = this.W;
        gt0Var.g("PAGER_TAB_END");
        gt0Var.l();
    }
}
