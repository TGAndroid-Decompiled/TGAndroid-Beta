package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class nu extends WebView {
    public final int f28866a;
    public final Context f28867b;
    public final KeyEvent.Callback f28868c;

    public nu(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f28866a = i10;
        this.f28868c = callback;
        this.f28867b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f28866a) {
            case 1:
                org.telegram.ui.hu0 hu0Var = (org.telegram.ui.hu0) this.f28868c;
                super.draw(canvas);
                if (eg0.f25675p0.f25685f == this && hu0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    hu0Var.j(canvas, getWidth(), getHeight());
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
        switch (this.f28866a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f28867b, true);
                super.onAttachedToWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f28867b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f28866a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f28867b, false);
                super.onDetachedFromWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f28867b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28866a) {
            case 0:
                tu tuVar = (tu) this.f28868c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        tuVar.setDisableScroll(false);
                    } else {
                        tuVar.setDisableScroll(true);
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
