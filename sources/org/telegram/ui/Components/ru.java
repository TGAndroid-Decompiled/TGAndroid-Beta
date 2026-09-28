package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class ru extends WebView {
    public final int f28054a;
    public final Context f28055b;
    public final KeyEvent.Callback f28056c;

    public ru(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f28054a = i10;
        this.f28056c = callback;
        this.f28055b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f28054a) {
            case 1:
                org.telegram.ui.au0 au0Var = (org.telegram.ui.au0) this.f28056c;
                super.draw(canvas);
                if (qg0.f27690p0.f27699f == this && au0Var.h.getVisibility() == 0) {
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
        switch (this.f28054a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f28055b, true);
                super.onAttachedToWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f28055b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f28054a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f28055b, false);
                super.onDetachedFromWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f28055b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28054a) {
            case 0:
                xu xuVar = (xu) this.f28056c;
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
