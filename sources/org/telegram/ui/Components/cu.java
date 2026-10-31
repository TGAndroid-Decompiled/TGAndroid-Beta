package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
public final class cu extends WebView {
    public final int f25158a;
    public final Context f25159b;
    public final KeyEvent.Callback f25160c;

    public cu(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f25158a = i10;
        this.f25160c = callback;
        this.f25159b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f25158a) {
            case 1:
                org.telegram.ui.mr0 mr0Var = (org.telegram.ui.mr0) this.f25160c;
                super.draw(canvas);
                if (jf0.f27345p0.f27354f == this && mr0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    mr0Var.j(canvas, getWidth(), getHeight());
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
        switch (this.f25158a) {
            case 0:
                org.telegram.messenger.i0.u(this.f25159b, true);
                super.onAttachedToWindow();
                return;
            default:
                org.telegram.messenger.i0.u(this.f25159b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f25158a) {
            case 0:
                org.telegram.messenger.i0.u(this.f25159b, false);
                super.onDetachedFromWindow();
                return;
            default:
                org.telegram.messenger.i0.u(this.f25159b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f25158a) {
            case 0:
                hu huVar = (hu) this.f25160c;
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
