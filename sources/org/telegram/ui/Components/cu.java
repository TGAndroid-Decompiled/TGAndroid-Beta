package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
public final class cu extends WebView {
    public final int f25237a;
    public final Context f25238b;
    public final KeyEvent.Callback f25239c;

    public cu(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f25237a = i10;
        this.f25239c = callback;
        this.f25238b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f25237a) {
            case 1:
                org.telegram.ui.lr0 lr0Var = (org.telegram.ui.lr0) this.f25239c;
                super.draw(canvas);
                if (jf0.f27400p0.f27409f == this && lr0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    lr0Var.j(canvas, getWidth(), getHeight());
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
        switch (this.f25237a) {
            case 0:
                org.telegram.messenger.i0.u(this.f25238b, true);
                super.onAttachedToWindow();
                return;
            default:
                org.telegram.messenger.i0.u(this.f25238b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f25237a) {
            case 0:
                org.telegram.messenger.i0.u(this.f25238b, false);
                super.onDetachedFromWindow();
                return;
            default:
                org.telegram.messenger.i0.u(this.f25238b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f25237a) {
            case 0:
                hu huVar = (hu) this.f25239c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        huVar.D0 = false;
                    } else {
                        huVar.D0 = true;
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
