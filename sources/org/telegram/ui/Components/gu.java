package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class gu extends WebView {
    public final int f28986a;
    public final Context f28987b;
    public final KeyEvent.Callback f28988c;

    public gu(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f28986a = i10;
        this.f28988c = callback;
        this.f28987b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f28986a) {
            case 1:
                org.telegram.ui.et0 et0Var = (org.telegram.ui.et0) this.f28988c;
                super.draw(canvas);
                if (bg0.f27076l0.f27086f == this && et0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    et0Var.j(canvas, getWidth(), getHeight());
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
        switch (this.f28986a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f28987b, true);
                super.onAttachedToWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f28987b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f28986a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f28987b, false);
                super.onDetachedFromWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f28987b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28986a) {
            case 0:
                mu muVar = (mu) this.f28988c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        muVar.setDisableScroll(false);
                    } else {
                        muVar.setDisableScroll(true);
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
