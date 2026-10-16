package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class bv extends WebView {
    public final int f23553a;
    public final Context f23554b;
    public final KeyEvent.Callback f23555c;

    public bv(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f23553a = i10;
        this.f23555c = callback;
        this.f23554b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f23553a) {
            case 1:
                org.telegram.ui.ou0 ou0Var = (org.telegram.ui.ou0) this.f23555c;
                super.draw(canvas);
                if (fh0.f24733p0.f24742f == this && ou0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    ou0Var.j(canvas, getWidth(), getHeight());
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
        switch (this.f23553a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f23554b, true);
                super.onAttachedToWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f23554b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f23553a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f23554b, false);
                super.onDetachedFromWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f23554b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f23553a) {
            case 0:
                hv hvVar = (hv) this.f23555c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        hvVar.setDisableScroll(false);
                    } else {
                        hvVar.setDisableScroll(true);
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
