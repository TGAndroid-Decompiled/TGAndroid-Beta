package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class wu extends WebView {
    public final int f32250a;
    public final Context f32251b;
    public final KeyEvent.Callback f32252c;

    public wu(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f32250a = i10;
        this.f32252c = callback;
        this.f32251b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f32250a) {
            case 1:
                org.telegram.ui.ot0 ot0Var = (org.telegram.ui.ot0) this.f32252c;
                super.draw(canvas);
                if (ah0.f24598p0.f24607f == this && ot0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    ot0Var.j(canvas, getWidth(), getHeight());
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
        switch (this.f32250a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f32251b, true);
                super.onAttachedToWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f32251b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f32250a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f32251b, false);
                super.onDetachedFromWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f32251b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f32250a) {
            case 0:
                cv cvVar = (cv) this.f32252c;
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
