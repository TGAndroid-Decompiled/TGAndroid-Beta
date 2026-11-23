package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
public abstract class p01 extends View {
    public final q01 f38354a;
    public org.telegram.messenger.w10 f38355b;
    public final org.telegram.ui.ActionBar.i6 f38356c;
    public int d;

    public p01(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f38356c = i6Var;
        q01 q01Var = new q01(i7, this, i6Var, false);
        this.f38354a = q01Var;
        q01Var.f38655s = new bp0(this, 19);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.i6 i6Var = this.f38356c;
        if (i6Var != null) {
            i6Var.c(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.n6.r(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.f38354a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38354a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38354a.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(33.0f), 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f38354a.d(motionEvent, false) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void set(org.telegram.messenger.fj fjVar) {
        q01 q01Var = this.f38354a;
        q01Var.e(fjVar);
        if (isAttachedToWindow()) {
            q01Var.a();
        }
    }

    public void setBackgroundHeight(int i7) {
        this.d = i7;
    }

    public void setOnTopicClickListener(org.telegram.messenger.w10 w10Var) {
        this.f38355b = w10Var;
    }
}
