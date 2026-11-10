package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.WebView;
public final class rt extends WebView {
    public final int f37733a;
    public final Context f37734b;
    public final KeyEvent.Callback f37735c;

    public rt(KeyEvent.Callback callback, Context context, Context context2, int i7) {
        super(context);
        this.f37733a = i7;
        this.f37735c = callback;
        this.f37734b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f37733a) {
            case 1:
                super.draw(canvas);
                ViewParent parent = getParent();
                org.telegram.ui.fq0 fq0Var = (org.telegram.ui.fq0) this.f37735c;
                if (parent != fq0Var && fq0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    fq0Var.j(canvas, getWidth(), getHeight());
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
        switch (this.f37733a) {
            case 0:
                org.telegram.messenger.g0.u(this.f37734b, true);
                super.onAttachedToWindow();
                return;
            default:
                org.telegram.messenger.g0.u(this.f37734b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f37733a) {
            case 0:
                org.telegram.messenger.g0.u(this.f37734b, false);
                super.onDetachedFromWindow();
                return;
            default:
                org.telegram.messenger.g0.u(this.f37734b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f37733a) {
            case 0:
                vt vtVar = (vt) this.f37735c;
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
