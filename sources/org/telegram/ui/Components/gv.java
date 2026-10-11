package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class gv extends WebView {
    public final int f26829a;
    public final Context f26830b;
    public final KeyEvent.Callback f26831c;

    public gv(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f26829a = i10;
        this.f26831c = callback;
        this.f26830b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f26829a) {
            case 1:
                org.telegram.ui.iu0 iu0Var = (org.telegram.ui.iu0) this.f26831c;
                super.draw(canvas);
                if (ih0.f27325p0.f27335f == this && iu0Var.h.getVisibility() == 0) {
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
        switch (this.f26829a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f26830b, true);
                super.onAttachedToWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f26830b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f26829a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f26830b, false);
                super.onDetachedFromWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f26830b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f26829a) {
            case 0:
                mv mvVar = (mv) this.f26831c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        mvVar.setDisableScroll(false);
                    } else {
                        mvVar.setDisableScroll(true);
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
