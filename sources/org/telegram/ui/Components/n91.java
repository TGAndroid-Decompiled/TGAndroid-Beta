package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class n91 extends WebView {
    public final int f28686a = 0;
    public final Object f28687b;

    public n91(org.telegram.ui.go0 go0Var, Context context) {
        super(context);
        this.f28687b = go0Var;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f28686a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f28687b, true);
                super.onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f28686a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f28687b, false);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f28686a) {
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
        switch (this.f28686a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.go0) this.f28687b).fragmentView).requestDisallowInterceptTouchEvent(true);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public n91(Context context, Context context2) {
        super(context);
        this.f28687b = context2;
    }
}
