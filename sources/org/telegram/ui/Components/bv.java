package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class bv extends WebView {
    public final int f23858a;
    public final Context f23859b;
    public final KeyEvent.Callback f23860c;

    public bv(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f23858a = i10;
        this.f23860c = callback;
        this.f23859b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f23858a) {
            case 1:
                org.telegram.ui.pu0 pu0Var = (org.telegram.ui.pu0) this.f23860c;
                super.draw(canvas);
                if (fh0.f25035p0.f25044f == this && pu0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    pu0Var.j(canvas, getWidth(), getHeight());
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
        switch (this.f23858a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f23859b, true);
                super.onAttachedToWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f23859b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f23858a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f23859b, false);
                super.onDetachedFromWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f23859b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f23858a) {
            case 0:
                hv hvVar = (hv) this.f23860c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        hvVar.setDisableScroll(false);
                    } else {
                        hvVar.setDisableScroll(true);
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
