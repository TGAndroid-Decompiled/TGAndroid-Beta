package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.WebView;
public final class cu extends WebView {
    public final int f34129a;
    public final Context f34130b;
    public final KeyEvent.Callback f34131c;

    public cu(KeyEvent.Callback callback, Context context, Context context2, int i7) {
        super(context);
        this.f34129a = i7;
        this.f34131c = callback;
        this.f34130b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f34129a) {
            case 1:
                super.draw(canvas);
                ViewParent parent = getParent();
                org.telegram.ui.dq0 dq0Var = (org.telegram.ui.dq0) this.f34131c;
                if (parent != dq0Var && dq0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    dq0Var.j(canvas, getWidth(), getHeight());
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
        switch (this.f34129a) {
            case 0:
                org.telegram.messenger.g0.u(this.f34130b, true);
                super.onAttachedToWindow();
                return;
            default:
                org.telegram.messenger.g0.u(this.f34130b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f34129a) {
            case 0:
                org.telegram.messenger.g0.u(this.f34130b, false);
                super.onDetachedFromWindow();
                return;
            default:
                org.telegram.messenger.g0.u(this.f34130b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f34129a) {
            case 0:
                gu guVar = (gu) this.f34131c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        guVar.E0 = false;
                    } else {
                        guVar.E0 = true;
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
