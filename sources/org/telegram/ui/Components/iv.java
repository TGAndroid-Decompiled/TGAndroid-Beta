package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class iv extends WebView {
    public final int f27290a;
    public final Context f27291b;
    public final KeyEvent.Callback f27292c;

    public iv(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f27290a = i10;
        this.f27292c = callback;
        this.f27291b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f27290a) {
            case 1:
                org.telegram.ui.lu0 lu0Var = (org.telegram.ui.lu0) this.f27292c;
                super.draw(canvas);
                if (jh0.f27503p0.f27513f == this && lu0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    lu0Var.j(canvas, getWidth(), getHeight());
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
        switch (this.f27290a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f27291b, true);
                super.onAttachedToWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f27291b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f27290a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f27291b, false);
                super.onDetachedFromWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f27291b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f27290a) {
            case 0:
                ov ovVar = (ov) this.f27292c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        ovVar.setDisableScroll(false);
                    } else {
                        ovVar.setDisableScroll(true);
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
