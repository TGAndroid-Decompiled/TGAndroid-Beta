package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
public final class pt extends WebView {
    public final int f37237a;
    public final Context f37238b;
    public final KeyEvent.Callback f37239c;

    public pt(KeyEvent.Callback callback, Context context, Context context2, int i3) {
        super(context);
        this.f37237a = i3;
        this.f37239c = callback;
        this.f37238b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f37237a) {
            case 1:
                org.telegram.ui.tp0 tp0Var = (org.telegram.ui.tp0) this.f37239c;
                super.draw(canvas);
                if (ie0.f34683q0.f34693f == this && tp0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    tp0Var.j(canvas, getWidth(), getHeight());
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
        switch (this.f37237a) {
            case 0:
                org.telegram.messenger.g0.u(this.f37238b, true);
                super.onAttachedToWindow();
                return;
            default:
                org.telegram.messenger.g0.u(this.f37238b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f37237a) {
            case 0:
                org.telegram.messenger.g0.u(this.f37238b, false);
                super.onDetachedFromWindow();
                return;
            default:
                org.telegram.messenger.g0.u(this.f37238b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f37237a) {
            case 0:
                ut utVar = (ut) this.f37239c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        utVar.E0 = false;
                    } else {
                        utVar.E0 = true;
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
