package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class xu extends WebView {
    public final int f34847a;
    public final Context f34848b;
    public final KeyEvent.Callback f34849c;

    public xu(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f34847a = i10;
        this.f34849c = callback;
        this.f34848b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f34847a) {
            case 1:
                org.telegram.ui.xt0 xt0Var = (org.telegram.ui.xt0) this.f34849c;
                super.draw(canvas);
                if (dh0.f27444p0.f27453f == this && xt0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    xt0Var.j(canvas, getWidth(), getHeight());
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
        switch (this.f34847a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f34848b, true);
                super.onAttachedToWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f34848b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f34847a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f34848b, false);
                super.onDetachedFromWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f34848b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f34847a) {
            case 0:
                dv dvVar = (dv) this.f34849c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        dvVar.setDisableScroll(false);
                    } else {
                        dvVar.setDisableScroll(true);
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
