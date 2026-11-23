package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.WebView;
public final class eu extends WebView {
    public final int f34967a;
    public final Context f34968b;
    public final KeyEvent.Callback f34969c;

    public eu(KeyEvent.Callback callback, Context context, Context context2, int i7) {
        super(context);
        this.f34967a = i7;
        this.f34969c = callback;
        this.f34968b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f34967a) {
            case 1:
                super.draw(canvas);
                ViewParent parent = getParent();
                org.telegram.ui.eq0 eq0Var = (org.telegram.ui.eq0) this.f34969c;
                if (parent != eq0Var && eq0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    eq0Var.j(canvas, getWidth(), getHeight());
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
        switch (this.f34967a) {
            case 0:
                org.telegram.messenger.g0.u(this.f34968b, true);
                super.onAttachedToWindow();
                return;
            default:
                org.telegram.messenger.g0.u(this.f34968b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f34967a) {
            case 0:
                org.telegram.messenger.g0.u(this.f34968b, false);
                super.onDetachedFromWindow();
                return;
            default:
                org.telegram.messenger.g0.u(this.f34968b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f34967a) {
            case 0:
                iu iuVar = (iu) this.f34969c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        iuVar.E0 = false;
                    } else {
                        iuVar.E0 = true;
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
