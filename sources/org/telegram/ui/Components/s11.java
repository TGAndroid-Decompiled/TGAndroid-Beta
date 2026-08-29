package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public abstract class s11 extends View {
    public final t11 f32454a;
    public Utilities.Callback f32455b;
    public final org.telegram.ui.ActionBar.c6 f32456c;
    public int d;

    public s11(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f32456c = c6Var;
        t11 t11Var = new t11(i10, this, c6Var, false);
        this.f32454a = t11Var;
        t11Var.f32818r = new fq0(this, 18);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.c6 c6Var = this.f32456c;
        if (c6Var != null) {
            c6Var.l(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.g6.q(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.f32454a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32454a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32454a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(33.0f), 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f32454a.d(motionEvent, false) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void set(MessageObject messageObject) {
        t11 t11Var = this.f32454a;
        t11Var.f(messageObject);
        if (isAttachedToWindow()) {
            t11Var.a();
        }
    }

    public void setBackgroundHeight(int i10) {
        this.d = i10;
    }

    public void setOnTopicClickListener(Utilities.Callback<Long> callback) {
        this.f32455b = callback;
    }
}
