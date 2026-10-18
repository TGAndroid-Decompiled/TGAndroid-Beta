package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class wu extends WebView {
    public final int f32216a;
    public final Context f32217b;
    public final KeyEvent.Callback f32218c;

    public wu(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f32216a = i10;
        this.f32218c = callback;
        this.f32217b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f32216a) {
            case 1:
                org.telegram.ui.qt0 qt0Var = (org.telegram.ui.qt0) this.f32218c;
                super.draw(canvas);
                if (zg0.f32905p0.f32914f == this && qt0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    qt0Var.j(canvas, getWidth(), getHeight());
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
        switch (this.f32216a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f32217b, true);
                super.onAttachedToWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f32217b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f32216a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f32217b, false);
                super.onDetachedFromWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f32217b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f32216a) {
            case 0:
                cv cvVar = (cv) this.f32218c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        cvVar.setDisableScroll(false);
                    } else {
                        cvVar.setDisableScroll(true);
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
