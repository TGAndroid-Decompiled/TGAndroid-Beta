package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class x81 extends WebView {
    public final int f30543a = 0;
    public final Object f30544b;

    public x81(org.telegram.ui.lo0 lo0Var, Context context) {
        super(context);
        this.f30544b = lo0Var;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f30543a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f30544b, true);
                super.onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f30543a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f30544b, false);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f30543a) {
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
        switch (this.f30543a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.lo0) this.f30544b).fragmentView).requestDisallowInterceptTouchEvent(true);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public x81(Context context, Context context2) {
        super(context);
        this.f30544b = context2;
    }
}
