package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class qu extends WebView {
    public final int f27450a;
    public final Context f27451b;
    public final KeyEvent.Callback f27452c;

    public qu(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f27450a = i10;
        this.f27452c = callback;
        this.f27451b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f27450a) {
            case 1:
                org.telegram.ui.bu0 bu0Var = (org.telegram.ui.bu0) this.f27452c;
                super.draw(canvas);
                if (eg0.f23661p0.f23670f == this && bu0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    bu0Var.j(canvas, getWidth(), getHeight());
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
        switch (this.f27450a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f27451b, true);
                super.onAttachedToWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f27451b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f27450a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f27451b, false);
                super.onDetachedFromWindow();
                return;
            default:
                AndroidUtilities.checkAndroidTheme(this.f27451b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f27450a) {
            case 0:
                wu wuVar = (wu) this.f27452c;
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        wuVar.setDisableScroll(false);
                    } else {
                        wuVar.setDisableScroll(true);
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
