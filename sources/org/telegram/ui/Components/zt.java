package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;

public final class zt extends WebView {

    public final int f35345a;

    public final Context f35346b;

    public final KeyEvent.Callback f35347c;

    public zt(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f35345a = i10;
        this.f35347c = callback;
        this.f35346b = context2;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f35345a) {
            case 1:
                org.telegram.ui.ht0 ht0Var = (org.telegram.ui.ht0) this.f35347c;
                super.draw(canvas);
                if (sf0.f32415l0.f32425f == this && ht0Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    ht0Var.j(canvas, getWidth(), getHeight());
                    break;
                }
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        switch (this.f35345a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f35346b, true);
                super.onAttachedToWindow();
                break;
            default:
                AndroidUtilities.checkAndroidTheme(this.f35346b, true);
                super.onAttachedToWindow();
                break;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f35345a) {
            case 0:
                AndroidUtilities.checkAndroidTheme(this.f35346b, false);
                super.onDetachedFromWindow();
                break;
            default:
                AndroidUtilities.checkAndroidTheme(this.f35346b, false);
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f35345a) {
            case 0:
                fu fuVar = (fu) this.f35347c;
                boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
                if (zOnTouchEvent) {
                    if (motionEvent.getAction() == 1) {
                        fuVar.setDisableScroll(false);
                    } else {
                        fuVar.setDisableScroll(true);
                    }
                }
                return zOnTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
