package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class iu extends WebView {
    public final int f25771a;
    public final Context f25772b;
    public final KeyEvent.Callback f25773c;

    public iu(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f25771a = i10;
        this.f25773c = callback;
        this.f25772b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f25771a) {
            case 1:
                org.telegram.ui.ut0 ut0Var = (org.telegram.ui.ut0) this.f25773c;
                super.draw(canvas);
                if (mg0.m0.f27045f == this && ut0Var.h.getVisibility() == 0) {
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
        switch (this.f25771a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f25772b, true);
                super.onAttachedToWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f25772b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f25771a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f25772b, false);
                super.onDetachedFromWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f25772b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f25771a) {
            case 0:
                ou ouVar = (ou) this.f25773c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        ouVar.setDisableScroll(false);
                    } else {
                        ouVar.setDisableScroll(true);
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
