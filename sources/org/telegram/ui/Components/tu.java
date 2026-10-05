package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class tu extends WebView {
    public final int f31239a;
    public final Context f31240b;
    public final KeyEvent.Callback f31241c;

    public tu(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f31239a = i10;
        this.f31241c = callback;
        this.f31240b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f31239a) {
            case 1:
                org.telegram.ui.du0 du0Var = (org.telegram.ui.du0) this.f31241c;
                super.draw(canvas);
                if (rg0.f30466p0.f30476f == this && du0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    du0Var.j(canvas, getWidth(), getHeight());
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
        switch (this.f31239a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f31240b, true);
                super.onAttachedToWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f31240b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f31239a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f31240b, false);
                super.onDetachedFromWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f31240b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f31239a) {
            case 0:
                zu zuVar = (zu) this.f31241c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        zuVar.setDisableScroll(false);
                    } else {
                        zuVar.setDisableScroll(true);
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
