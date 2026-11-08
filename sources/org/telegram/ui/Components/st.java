package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.WebView;
public final class st extends WebView {
    public final int f38134a;
    public final Context f38135b;
    public final KeyEvent.Callback f38136c;

    public st(KeyEvent.Callback callback, Context context, Context context2, int i7) {
        super(context);
        this.f38134a = i7;
        this.f38136c = callback;
        this.f38135b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f38134a) {
            case 1:
                super.draw(canvas);
                ViewParent parent = getParent();
                org.telegram.ui.cq0 cq0Var = (org.telegram.ui.cq0) this.f38136c;
                if (parent != cq0Var && cq0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    cq0Var.j(canvas, getWidth(), getHeight());
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
        switch (this.f38134a) {
            case 0:
                org.telegram.messenger.g0.u(this.f38135b, true);
                super.onAttachedToWindow();
                return;
            default:
                org.telegram.messenger.g0.u(this.f38135b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f38134a) {
            case 0:
                org.telegram.messenger.g0.u(this.f38135b, false);
                super.onDetachedFromWindow();
                return;
            default:
                org.telegram.messenger.g0.u(this.f38135b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f38134a) {
            case 0:
                wt wtVar = (wt) this.f38136c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        wtVar.D0 = false;
                    } else {
                        wtVar.D0 = true;
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
