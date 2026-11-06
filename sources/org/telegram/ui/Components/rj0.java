package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public class rj0 extends p61 {
    public final ht0 V;
    public boolean W;
    public View f37764a0;
    public View f37765b0;

    public rj0(Context context, org.telegram.ui.ActionBar.f6 f6Var, ht0 ht0Var) {
        super(context, f6Var);
        this.V = ht0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final void A(int i7) {
        ht0 ht0Var = this.V;
        ht0Var.g("PAGER_TAB_END");
        ht0Var.p();
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
                this.f37764a0 = view;
                this.f37765b0 = view2;
                ht0 ht0Var = this.V;
                ht0Var.g("PAGER_DRAG_ABORTED");
                ht0Var.p();
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
        this.f37764a0 = null;
        this.f37765b0 = null;
        ht0 ht0Var = this.V;
        ht0Var.f("PAGE_BOUND", view, 0, 0, true);
        if (ht0Var.O == null) {
            return;
        }
        if (ht0Var.f34420d0) {
            ht0Var.i("page_bound");
        }
        RecyclerView l10 = ht0Var.O.l(view);
        ht0Var.b(l10);
        ht0Var.O.s(l10);
        ht0Var.p();
    }

    public final void M(MotionEvent motionEvent) {
        String str;
        if (motionEvent != null && motionEvent.getActionMasked() == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            ht0 ht0Var = this.V;
            boolean j3 = ht0Var.j(x10, y10);
            this.W = j3;
            if (j3) {
                str = "PAGER_DOWN_COMMON";
            } else {
                str = "PAGER_DOWN_PAGE";
            }
            ht0Var.g(str);
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
        ht0 ht0Var = this.V;
        canvas.clipRect(x10, -ht0Var.getTopBleed(), view.getX() + view.getWidth(), ht0Var.getBottomBleed() + getHeight());
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
        ht0 ht0Var = this.V;
        if (motionEvent == null) {
            ht0Var.g("PAGER_CANCEL_NULL");
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
            ht0Var.g(str);
        }
        if (this.W || !B(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void u() {
        ht0 ht0Var = this.V;
        ht0Var.g("PAGER_SCROLL_END");
        ht0Var.p();
    }

    @Override
    public final void v() {
        this.f37764a0 = null;
        this.f37765b0 = null;
    }

    @Override
    public final void w(boolean z9) {
        this.V.p();
    }
}
