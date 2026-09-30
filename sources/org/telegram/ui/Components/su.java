package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class su extends WebView {
    public final int f28349a;
    public final Context f28350b;
    public final KeyEvent.Callback f28351c;

    public su(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f28349a = i10;
        this.f28351c = callback;
        this.f28350b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f28349a) {
            case 1:
                org.telegram.ui.au0 au0Var = (org.telegram.ui.au0) this.f28351c;
                super.draw(canvas);
                if (rg0.f27987p0.f27996f == this && au0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    au0Var.j(canvas, getWidth(), getHeight());
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
        switch (this.f28349a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f28350b, true);
                super.onAttachedToWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f28350b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f28349a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f28350b, false);
                super.onDetachedFromWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f28350b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28349a) {
            case 0:
                yu yuVar = (yu) this.f28351c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        yuVar.setDisableScroll(false);
                    } else {
                        yuVar.setDisableScroll(true);
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
