package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class pu extends WebView {
    public final int f27424a;
    public final Context f27425b;
    public final KeyEvent.Callback f27426c;

    public pu(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f27424a = i10;
        this.f27426c = callback;
        this.f27425b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f27424a) {
            case 1:
                org.telegram.ui.iu0 iu0Var = (org.telegram.ui.iu0) this.f27426c;
                super.draw(canvas);
                if (rg0.f27960p0.f27969f == this && iu0Var.h.getVisibility() == 0) {
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
        switch (this.f27424a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f27425b, true);
                super.onAttachedToWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f27425b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f27424a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f27425b, false);
                super.onDetachedFromWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f27425b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f27424a) {
            case 0:
                vu vuVar = (vu) this.f27426c;
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
