package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class pu extends WebView {
    public final int f27131a;
    public final Context f27132b;
    public final KeyEvent.Callback f27133c;

    public pu(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f27131a = i10;
        this.f27133c = callback;
        this.f27132b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f27131a) {
            case 1:
                org.telegram.ui.ku0 ku0Var = (org.telegram.ui.ku0) this.f27133c;
                super.draw(canvas);
                if (fg0.f23911p0.f23920f == this && ku0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    ku0Var.j(canvas, getWidth(), getHeight());
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
        switch (this.f27131a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f27132b, true);
                super.onAttachedToWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f27132b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f27131a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f27132b, false);
                super.onDetachedFromWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f27132b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f27131a) {
            case 0:
                vu vuVar = (vu) this.f27133c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        vuVar.setDisableScroll(false);
                    } else {
                        vuVar.setDisableScroll(true);
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
