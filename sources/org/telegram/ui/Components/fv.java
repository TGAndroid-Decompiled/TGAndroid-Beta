package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class fv extends WebView {
    public final int f26490a;
    public final Context f26491b;
    public final KeyEvent.Callback f26492c;

    public fv(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f26490a = i10;
        this.f26492c = callback;
        this.f26491b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f26490a) {
            case 1:
                org.telegram.ui.ju0 ju0Var = (org.telegram.ui.ju0) this.f26492c;
                super.draw(canvas);
                if (gh0.f26700p0.f26710f == this && ju0Var.h.getVisibility() == 0) {
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
        switch (this.f26490a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f26491b, true);
                super.onAttachedToWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f26491b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f26490a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f26491b, false);
                super.onDetachedFromWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f26491b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f26490a) {
            case 0:
                lv lvVar = (lv) this.f26492c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        lvVar.setDisableScroll(false);
                    } else {
                        lvVar.setDisableScroll(true);
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
