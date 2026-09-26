package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class ru extends WebView {
    public final int f28058a;
    public final Context f28059b;
    public final KeyEvent.Callback f28060c;

    public ru(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f28058a = i10;
        this.f28060c = callback;
        this.f28059b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f28058a) {
            case 1:
                org.telegram.ui.au0 au0Var = (org.telegram.ui.au0) this.f28060c;
                super.draw(canvas);
                if (pg0.f27353p0.f27362f == this && au0Var.h.getVisibility() == 0) {
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
        switch (this.f28058a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f28059b, true);
                super.onAttachedToWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f28059b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f28058a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f28059b, false);
                super.onDetachedFromWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f28059b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28058a) {
            case 0:
                xu xuVar = (xu) this.f28060c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        xuVar.setDisableScroll(false);
                    } else {
                        xuVar.setDisableScroll(true);
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
