package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class ju extends WebView {
    public final int f26037a;
    public final Context f26038b;
    public final KeyEvent.Callback f26039c;

    public ju(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f26037a = i10;
        this.f26039c = callback;
        this.f26038b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f26037a) {
            case 1:
                org.telegram.ui.nt0 nt0Var = (org.telegram.ui.nt0) this.f26039c;
                super.draw(canvas);
                if (lg0.m0.f26666f == this && nt0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    nt0Var.j(canvas, getWidth(), getHeight());
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
        switch (this.f26037a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f26038b, true);
                super.onAttachedToWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f26038b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f26037a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f26038b, false);
                super.onDetachedFromWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f26038b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f26037a) {
            case 0:
                pu puVar = (pu) this.f26039c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        puVar.setDisableScroll(false);
                    } else {
                        puVar.setDisableScroll(true);
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
