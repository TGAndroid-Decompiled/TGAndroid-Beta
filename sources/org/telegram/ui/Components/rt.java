package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.WebView;
public final class rt extends WebView {
    public final int f37833a;
    public final Context f37834b;
    public final KeyEvent.Callback f37835c;

    public rt(KeyEvent.Callback callback, Context context, Context context2, int i7) {
        super(context);
        this.f37833a = i7;
        this.f37835c = callback;
        this.f37834b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f37833a) {
            case 1:
                super.draw(canvas);
                ViewParent parent = getParent();
                org.telegram.ui.bq0 bq0Var = (org.telegram.ui.bq0) this.f37835c;
                if (parent != bq0Var && bq0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    bq0Var.j(canvas, getWidth(), getHeight());
                    return;
                }
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        switch (this.f37833a) {
            case 0:
                org.telegram.messenger.g0.u(this.f37834b, true);
                super.onAttachedToWindow();
                return;
            default:
                org.telegram.messenger.g0.u(this.f37834b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f37833a) {
            case 0:
                org.telegram.messenger.g0.u(this.f37834b, false);
                super.onDetachedFromWindow();
                return;
            default:
                org.telegram.messenger.g0.u(this.f37834b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f37833a) {
            case 0:
                vt vtVar = (vt) this.f37835c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        vtVar.D0 = false;
                    } else {
                        vtVar.D0 = true;
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
