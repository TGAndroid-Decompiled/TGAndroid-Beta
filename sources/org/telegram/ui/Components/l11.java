package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
public abstract class l11 extends View {
    public final m11 f28019a;
    public org.telegram.messenger.r20 f28020b;
    public final org.telegram.ui.ActionBar.p6 f28021c;
    public int d;

    public l11(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f28021c = p6Var;
        m11 m11Var = new m11(i10, this, p6Var, false);
        this.f28019a = m11Var;
        m11Var.f28338s = new vo0(this, 21);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.p6 p6Var = this.f28021c;
        if (p6Var != null) {
            p6Var.b(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.t6.r(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.f28019a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28019a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28019a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(33.0f), 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f28019a.d(motionEvent, false) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void set(org.telegram.messenger.kj kjVar) {
        m11 m11Var = this.f28019a;
        m11Var.e(kjVar);
        if (isAttachedToWindow()) {
            m11Var.a();
        }
    }

    public void setBackgroundHeight(int i10) {
        this.d = i10;
    }

    public void setOnTopicClickListener(org.telegram.messenger.r20 r20Var) {
        this.f28020b = r20Var;
    }
}
