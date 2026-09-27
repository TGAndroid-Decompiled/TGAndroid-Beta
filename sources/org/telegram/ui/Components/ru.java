package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class ru extends WebView {
    public final int f28092a;
    public final Context f28093b;
    public final KeyEvent.Callback f28094c;

    public ru(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f28092a = i10;
        this.f28094c = callback;
        this.f28093b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f28092a) {
            case 1:
                org.telegram.ui.du0 du0Var = (org.telegram.ui.du0) this.f28094c;
                super.draw(canvas);
                if (rg0.f27977p0.f27986f == this && du0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    du0Var.j(canvas, getWidth(), getHeight());
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
        switch (this.f28092a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f28093b, true);
                super.onAttachedToWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f28093b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f28092a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f28093b, false);
                super.onDetachedFromWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f28093b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28092a) {
            case 0:
                xu xuVar = (xu) this.f28094c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        xuVar.setDisableScroll(false);
                    } else {
                        xuVar.setDisableScroll(true);
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
