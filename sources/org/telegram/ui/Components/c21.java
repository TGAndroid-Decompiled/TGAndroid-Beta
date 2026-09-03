package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public abstract class c21 extends View {
    public final d21 f25738a;
    public Utilities.Callback f25739b;
    public final org.telegram.ui.ActionBar.g6 f25740c;
    public int d;

    public c21(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f25740c = g6Var;
        d21 d21Var = new d21(i10, this, g6Var, false);
        this.f25738a = d21Var;
        d21Var.f26152r = new nq0(this, 18);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.g6 g6Var = this.f25740c;
        if (g6Var != null) {
            g6Var.l(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.k6.q(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.f25738a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f25738a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25738a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(33.0f), 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f25738a.d(motionEvent, false) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void set(MessageObject messageObject) {
        d21 d21Var = this.f25738a;
        d21Var.f(messageObject);
        if (isAttachedToWindow()) {
            d21Var.a();
        }
    }

    public void setBackgroundHeight(int i10) {
        this.d = i10;
    }

    public void setOnTopicClickListener(Utilities.Callback<Long> callback) {
        this.f25739b = callback;
    }
}
