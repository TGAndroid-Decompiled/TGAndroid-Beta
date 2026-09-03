package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class lu extends WebView {
    public final int f28876a;
    public final Context f28877b;
    public final KeyEvent.Callback f28878c;

    public lu(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f28876a = i10;
        this.f28878c = callback;
        this.f28877b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f28876a) {
            case 1:
                org.telegram.ui.ut0 ut0Var = (org.telegram.ui.ut0) this.f28878c;
                super.draw(canvas);
                if (ng0.m0.f29472f == this && ut0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    ut0Var.j(canvas, getWidth(), getHeight());
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
        switch (this.f28876a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f28877b, true);
                super.onAttachedToWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f28877b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f28876a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f28877b, false);
                super.onDetachedFromWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f28877b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28876a) {
            case 0:
                ru ruVar = (ru) this.f28878c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        ruVar.setDisableScroll(false);
                    } else {
                        ruVar.setDisableScroll(true);
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
