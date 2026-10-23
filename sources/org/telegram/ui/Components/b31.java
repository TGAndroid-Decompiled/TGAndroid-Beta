package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public abstract class b31 extends View {
    public final c31 f24947a;
    public Utilities.Callback f24948b;
    public final org.telegram.ui.ActionBar.g6 f24949c;
    public int d;

    public b31(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f24949c = g6Var;
        c31 c31Var = new c31(i10, this, g6Var, false);
        this.f24947a = c31Var;
        c31Var.f25227s = new kr0(this, 19);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.g6 g6Var = this.f24949c;
        if (g6Var != null) {
            g6Var.b(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.k6.q(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.f24947a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24947a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24947a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(33.0f), 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f24947a.d(motionEvent, false) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void set(MessageObject messageObject) {
        c31 c31Var = this.f24947a;
        c31Var.e(messageObject);
        if (isAttachedToWindow()) {
            c31Var.a();
        }
    }

    public void setBackgroundHeight(int i10) {
        this.d = i10;
    }

    public void setOnTopicClickListener(Utilities.Callback<Long> callback) {
        this.f24948b = callback;
    }
}
