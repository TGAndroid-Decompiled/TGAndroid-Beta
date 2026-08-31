package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public abstract class d21 extends View {
    public final e21 f26177a;
    public Utilities.Callback f26178b;
    public final org.telegram.ui.ActionBar.g6 f26179c;
    public int d;

    public d21(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f26179c = g6Var;
        e21 e21Var = new e21(i10, this, g6Var, false);
        this.f26177a = e21Var;
        e21Var.f26394r = new oq0(this, 18);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        org.telegram.ui.ActionBar.g6 g6Var = this.f26179c;
        if (g6Var != null) {
            g6Var.l(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            org.telegram.ui.ActionBar.k6.q(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.f26177a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26177a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26177a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(33.0f), 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f26177a.d(motionEvent, false) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void set(MessageObject messageObject) {
        e21 e21Var = this.f26177a;
        e21Var.f(messageObject);
        if (isAttachedToWindow()) {
            e21Var.a();
        }
    }

    public void setBackgroundHeight(int i10) {
        this.d = i10;
    }

    public void setOnTopicClickListener(Utilities.Callback<Long> callback) {
        this.f26178b = callback;
    }
}
