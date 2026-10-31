package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
public abstract class k11 extends View {
    public final l11 f27605a;
    public org.telegram.messenger.q20 f27606b;
    public final org.telegram.ui.ActionBar.p6 f27607c;
    public int d;

    public k11(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f27607c = p6Var;
        l11 l11Var = new l11(i10, this, p6Var, false);
        this.f27605a = l11Var;
        l11Var.f27984s = new uo0(this, 21);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.p6 p6Var = this.f27607c;
        if (p6Var != null) {
            p6Var.b(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.t6.r(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.f27605a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27605a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27605a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(33.0f), 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f27605a.d(motionEvent, false) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void set(org.telegram.messenger.jj jjVar) {
        l11 l11Var = this.f27605a;
        l11Var.e(jjVar);
        if (isAttachedToWindow()) {
            l11Var.a();
        }
    }

    public void setBackgroundHeight(int i10) {
        this.d = i10;
    }

    public void setOnTopicClickListener(org.telegram.messenger.q20 q20Var) {
        this.f27606b = q20Var;
    }
}
