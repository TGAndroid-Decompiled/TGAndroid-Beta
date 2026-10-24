package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class uu extends WebView {
    public final int f31223a;
    public final Context f31224b;
    public final KeyEvent.Callback f31225c;

    public uu(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f31223a = i10;
        this.f31225c = callback;
        this.f31224b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f31223a) {
            case 1:
                org.telegram.ui.qt0 qt0Var = (org.telegram.ui.qt0) this.f31225c;
                super.draw(canvas);
                if (ch0.f25313p0.f25322f == this && qt0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    qt0Var.j(canvas, getWidth(), getHeight());
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
        switch (this.f31223a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f31224b, true);
                super.onAttachedToWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f31224b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f31223a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f31224b, false);
                super.onDetachedFromWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f31224b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f31223a) {
            case 0:
                av avVar = (av) this.f31225c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        avVar.setDisableScroll(false);
                    } else {
                        avVar.setDisableScroll(true);
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
