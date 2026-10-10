package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class gv extends WebView {
    public final int f26849a;
    public final Context f26850b;
    public final KeyEvent.Callback f26851c;

    public gv(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f26849a = i10;
        this.f26851c = callback;
        this.f26850b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f26849a) {
            case 1:
                org.telegram.ui.ju0 ju0Var = (org.telegram.ui.ju0) this.f26851c;
                super.draw(canvas);
                if (hh0.f27011p0.f27021f == this && ju0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    ju0Var.j(canvas, getWidth(), getHeight());
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
        switch (this.f26849a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f26850b, true);
                super.onAttachedToWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f26850b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f26849a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f26850b, false);
                super.onDetachedFromWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f26850b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f26849a) {
            case 0:
                mv mvVar = (mv) this.f26851c;
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
