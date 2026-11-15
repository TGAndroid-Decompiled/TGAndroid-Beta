package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.WebView;
public final class xt extends WebView {
    public final int f41754a;
    public final Context f41755b;
    public final KeyEvent.Callback f41756c;

    public xt(KeyEvent.Callback callback, Context context, Context context2, int i7) {
        super(context);
        this.f41754a = i7;
        this.f41756c = callback;
        this.f41755b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f41754a) {
            case 1:
                super.draw(canvas);
                ViewParent parent = getParent();
                org.telegram.ui.bq0 bq0Var = (org.telegram.ui.bq0) this.f41756c;
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
        switch (this.f41754a) {
            case 0:
                org.telegram.messenger.g0.u(this.f41755b, true);
                super.onAttachedToWindow();
                return;
            default:
                org.telegram.messenger.g0.u(this.f41755b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f41754a) {
            case 0:
                org.telegram.messenger.g0.u(this.f41755b, false);
                super.onDetachedFromWindow();
                return;
            default:
                org.telegram.messenger.g0.u(this.f41755b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f41754a) {
            case 0:
                bu buVar = (bu) this.f41756c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        buVar.E0 = false;
                    } else {
                        buVar.E0 = true;
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
