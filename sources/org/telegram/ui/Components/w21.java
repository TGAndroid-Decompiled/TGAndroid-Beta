package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public abstract class w21 extends View {
    public final x21 f32001a;
    public Utilities.Callback f32002b;
    public final org.telegram.ui.ActionBar.d6 f32003c;
    public int d;

    public w21(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f32003c = d6Var;
        x21 x21Var = new x21(i10, this, d6Var, false);
        this.f32001a = x21Var;
        x21Var.f32288r = new gr0(this, 18);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.d6 d6Var = this.f32003c;
        if (d6Var != null) {
            d6Var.d(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.h6.q(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.f32001a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32001a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32001a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(33.0f), 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f32001a.d(motionEvent, false) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void set(MessageObject messageObject) {
        x21 x21Var = this.f32001a;
        x21Var.e(messageObject);
        if (isAttachedToWindow()) {
            x21Var.a();
        }
    }

    public void setBackgroundHeight(int i10) {
        this.d = i10;
    }

    public void setOnTopicClickListener(Utilities.Callback<Long> callback) {
        this.f32002b = callback;
    }
}
