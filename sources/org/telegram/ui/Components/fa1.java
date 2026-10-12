package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class fa1 extends WebView {
    public final int f26001a = 0;
    public final Object f26002b;

    public fa1(org.telegram.ui.xo0 xo0Var, Context context) {
        super(context);
        this.f26002b = xo0Var;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f26001a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f26002b, true);
                super.onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f26001a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f26002b, false);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f26001a) {
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
        switch (this.f26001a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.xo0) this.f26002b).fragmentView).requestDisallowInterceptTouchEvent(true);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public fa1(Context context, Context context2) {
        super(context);
        this.f26002b = context2;
    }
}
