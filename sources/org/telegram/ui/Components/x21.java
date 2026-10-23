package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public abstract class x21 extends View {
    public final y21 f32326a;
    public Utilities.Callback f32327b;
    public final org.telegram.ui.ActionBar.d6 f32328c;
    public int d;

    public x21(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f32328c = d6Var;
        y21 y21Var = new y21(i10, this, d6Var, false);
        this.f32326a = y21Var;
        y21Var.f32568r = new hr0(this, 18);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.d6 d6Var = this.f32328c;
        if (d6Var != null) {
            d6Var.d(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.h6.q(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.f32326a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32326a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32326a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(33.0f), 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f32326a.d(motionEvent, false) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void set(MessageObject messageObject) {
        y21 y21Var = this.f32326a;
        y21Var.e(messageObject);
        if (isAttachedToWindow()) {
            y21Var.a();
        }
    }

    public void setBackgroundHeight(int i10) {
        this.d = i10;
    }

    public void setOnTopicClickListener(Utilities.Callback<Long> callback) {
        this.f32327b = callback;
    }
}
