package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public abstract class l31 extends View {
    public final m31 f28006a;
    public Utilities.Callback f28007b;
    public final org.telegram.ui.ActionBar.c6 f28008c;
    public int d;

    public l31(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f28008c = c6Var;
        m31 m31Var = new m31(i10, this, c6Var, false);
        this.f28006a = m31Var;
        m31Var.f28386r = new ur0(this, 19);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.c6 c6Var = this.f28008c;
        if (c6Var != null) {
            c6Var.m(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.h6.q(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.f28006a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28006a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28006a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(33.0f), 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f28006a.d(motionEvent, false) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void set(MessageObject messageObject) {
        m31 m31Var = this.f28006a;
        m31Var.e(messageObject);
        if (isAttachedToWindow()) {
            m31Var.a();
        }
    }

    public void setBackgroundHeight(int i10) {
        this.d = i10;
    }

    public void setOnTopicClickListener(Utilities.Callback<Long> callback) {
        this.f28007b = callback;
    }
}
