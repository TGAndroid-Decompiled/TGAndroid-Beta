package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class tu extends WebView {
    public final int f27484a;
    public final Context f27485b;
    public final KeyEvent.Callback f27486c;

    public tu(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f27484a = i10;
        this.f27486c = callback;
        this.f27485b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f27484a) {
            case 1:
                org.telegram.ui.hu0 hu0Var = (org.telegram.ui.hu0) this.f27486c;
                super.draw(canvas);
                if (og0.f25781p0.f25790f == this && hu0Var.h.getVisibility() == 0) {
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
        switch (this.f27484a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f27485b, true);
                super.onAttachedToWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f27485b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f27484a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f27485b, false);
                super.onDetachedFromWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f27485b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f27484a) {
            case 0:
                zu zuVar = (zu) this.f27486c;
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
