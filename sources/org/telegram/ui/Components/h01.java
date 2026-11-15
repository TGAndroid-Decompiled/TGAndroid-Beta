package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
public abstract class h01 extends View {
    public final i01 f35138a;
    public org.telegram.messenger.z10 f35139b;
    public final org.telegram.ui.ActionBar.e6 f35140c;
    public int d;

    public h01(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f35140c = e6Var;
        i01 i01Var = new i01(i7, this, e6Var, false);
        this.f35138a = i01Var;
        i01Var.f35410s = new ro0(this, 19);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.e6 e6Var = this.f35140c;
        if (e6Var != null) {
            e6Var.b(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.j6.r(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.f35138a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35138a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35138a.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(33.0f), 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f35138a.d(motionEvent, false) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void set(org.telegram.messenger.gj gjVar) {
        i01 i01Var = this.f35138a;
        i01Var.e(gjVar);
        if (isAttachedToWindow()) {
            i01Var.a();
        }
    }

    public void setBackgroundHeight(int i7) {
        this.d = i7;
    }

    public void setOnTopicClickListener(org.telegram.messenger.z10 z10Var) {
        this.f35139b = z10Var;
    }
}
