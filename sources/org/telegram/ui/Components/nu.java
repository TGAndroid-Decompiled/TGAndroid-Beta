package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class nu extends WebView {
    public final int f28894a;
    public final Context f28895b;
    public final KeyEvent.Callback f28896c;

    public nu(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f28894a = i10;
        this.f28896c = callback;
        this.f28895b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f28894a) {
            case 1:
                org.telegram.ui.hu0 hu0Var = (org.telegram.ui.hu0) this.f28896c;
                super.draw(canvas);
                if (eg0.f25703p0.f25713f == this && hu0Var.h.getVisibility() == 0) {
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
        switch (this.f28894a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f28895b, true);
                super.onAttachedToWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f28895b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f28894a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f28895b, false);
                super.onDetachedFromWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f28895b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28894a) {
            case 0:
                tu tuVar = (tu) this.f28896c;
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
