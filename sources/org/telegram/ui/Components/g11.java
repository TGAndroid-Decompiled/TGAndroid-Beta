package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public abstract class g11 extends View {
    public final h11 f28627a;
    public Utilities.Callback f28628b;
    public final org.telegram.ui.ActionBar.b6 f28629c;
    public int d;

    public g11(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f28629c = b6Var;
        h11 h11Var = new h11(i9, this, b6Var, false);
        this.f28627a = h11Var;
        h11Var.f28945r = new tp0(this, 18);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.b6 b6Var = this.f28629c;
        if (b6Var != null) {
            b6Var.o(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.f6.q(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.f28627a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28627a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28627a.b();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(33.0f), 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f28627a.d(motionEvent, false) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void set(MessageObject messageObject) {
        h11 h11Var = this.f28627a;
        h11Var.f(messageObject);
        if (isAttachedToWindow()) {
            h11Var.a();
        }
    }

    public void setBackgroundHeight(int i9) {
        this.d = i9;
    }

    public void setOnTopicClickListener(Utilities.Callback<Long> callback) {
        this.f28628b = callback;
    }
}
