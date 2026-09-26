package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class qu extends WebView {
    public final int f27762a;
    public final Context f27763b;
    public final KeyEvent.Callback f27764c;

    public qu(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f27762a = i10;
        this.f27764c = callback;
        this.f27763b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f27762a) {
            case 1:
                org.telegram.ui.au0 au0Var = (org.telegram.ui.au0) this.f27764c;
                super.draw(canvas);
                if (og0.f27046p0.f27055f == this && au0Var.h.getVisibility() == 0) {
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
        switch (this.f27762a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f27763b, true);
                super.onAttachedToWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f27763b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f27762a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f27763b, false);
                super.onDetachedFromWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f27763b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f27762a) {
            case 0:
                wu wuVar = (wu) this.f27764c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        wuVar.setDisableScroll(false);
                    } else {
                        wuVar.setDisableScroll(true);
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
