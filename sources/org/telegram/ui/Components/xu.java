package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class xu extends WebView {
    public final int f34821a;
    public final Context f34822b;
    public final KeyEvent.Callback f34823c;

    public xu(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f34821a = i10;
        this.f34823c = callback;
        this.f34822b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f34821a) {
            case 1:
                org.telegram.ui.vt0 vt0Var = (org.telegram.ui.vt0) this.f34823c;
                super.draw(canvas);
                if (ch0.f27159p0.f27168f == this && vt0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    vt0Var.j(canvas, getWidth(), getHeight());
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
        switch (this.f34821a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f34822b, true);
                super.onAttachedToWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f34822b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f34821a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f34822b, false);
                super.onDetachedFromWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f34822b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f34821a) {
            case 0:
                dv dvVar = (dv) this.f34823c;
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
