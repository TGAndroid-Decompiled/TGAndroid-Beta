package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class u81 extends WebView {
    public final int f30861a = 0;
    public final Object f30862b;

    public u81(org.telegram.ui.xo0 xo0Var, Context context) {
        super(context);
        this.f30862b = xo0Var;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f30861a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f30862b, true);
                super.onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f30861a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f30862b, false);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f30861a) {
            case 1:
                super.onMeasure(i10, i11);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f30861a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.xo0) this.f30862b).fragmentView).requestDisallowInterceptTouchEvent(true);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public u81(Context context, Context context2) {
        super(context);
        this.f30862b = context2;
    }
}
