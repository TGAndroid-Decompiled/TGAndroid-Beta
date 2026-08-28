package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class au extends WebView {
    public final int f26905a;
    public final Context f26906b;
    public final KeyEvent.Callback f26907c;

    public au(KeyEvent.Callback callback, Context context, Context context2, int i9) {
        super(context);
        this.f26905a = i9;
        this.f26907c = callback;
        this.f26906b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f26905a) {
            case 1:
                org.telegram.ui.gt0 gt0Var = (org.telegram.ui.gt0) this.f26907c;
                super.draw(canvas);
                if (pf0.f31622l0.f31632f == this && gt0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    gt0Var.j(canvas, getWidth(), getHeight());
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
        switch (this.f26905a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f26906b, true);
                super.onAttachedToWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f26906b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f26905a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f26906b, false);
                super.onDetachedFromWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f26906b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f26905a) {
            case 0:
                gu guVar = (gu) this.f26907c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        guVar.setDisableScroll(false);
                    } else {
                        guVar.setDisableScroll(true);
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
