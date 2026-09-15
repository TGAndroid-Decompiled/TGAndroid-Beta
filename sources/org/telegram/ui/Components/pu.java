package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class pu extends WebView {
    public final int f27147a;
    public final Context f27148b;
    public final KeyEvent.Callback f27149c;

    public pu(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f27147a = i10;
        this.f27149c = callback;
        this.f27148b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f27147a) {
            case 1:
                org.telegram.ui.iu0 iu0Var = (org.telegram.ui.iu0) this.f27149c;
                super.draw(canvas);
                if (eg0.f23638p0.f23647f == this && iu0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    iu0Var.j(canvas, getWidth(), getHeight());
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
        switch (this.f27147a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f27148b, true);
                super.onAttachedToWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f27148b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f27147a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f27148b, false);
                super.onDetachedFromWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f27148b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f27147a) {
            case 0:
                vu vuVar = (vu) this.f27149c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        vuVar.setDisableScroll(false);
                    } else {
                        vuVar.setDisableScroll(true);
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
