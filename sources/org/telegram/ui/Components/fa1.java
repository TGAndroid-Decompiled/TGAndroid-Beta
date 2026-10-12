package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class fa1 extends WebView {
    public final int f25999a = 0;
    public final Object f26000b;

    public fa1(org.telegram.ui.xo0 xo0Var, Context context) {
        super(context);
        this.f26000b = xo0Var;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f25999a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f26000b, true);
                super.onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f25999a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f26000b, false);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f25999a) {
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
        switch (this.f25999a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.xo0) this.f26000b).fragmentView).requestDisallowInterceptTouchEvent(true);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public fa1(Context context, Context context2) {
        super(context);
        this.f26000b = context2;
    }
}
