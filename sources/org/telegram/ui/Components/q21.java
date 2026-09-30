package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public abstract class q21 extends View {
    public final r21 f27523a;
    public Utilities.Callback f27524b;
    public final org.telegram.ui.ActionBar.d6 f27525c;
    public int d;

    public q21(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f27525c = d6Var;
        r21 r21Var = new r21(i10, this, d6Var, false);
        this.f27523a = r21Var;
        r21Var.f27830r = new zq0(this, 19);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.d6 d6Var = this.f27525c;
        if (d6Var != null) {
            d6Var.m(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.h6.q(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.f27523a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27523a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27523a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(33.0f), 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f27523a.d(motionEvent, false) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void set(MessageObject messageObject) {
        r21 r21Var = this.f27523a;
        r21Var.f(messageObject);
        if (isAttachedToWindow()) {
            r21Var.a();
        }
    }

    public void setBackgroundHeight(int i10) {
        this.d = i10;
    }

    public void setOnTopicClickListener(Utilities.Callback<Long> callback) {
        this.f27524b = callback;
    }
}
