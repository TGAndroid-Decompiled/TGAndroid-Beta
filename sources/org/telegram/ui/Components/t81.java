package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class t81 extends WebView {
    public final int f28113a = 0;
    public final Object f28114b;

    public t81(org.telegram.ui.qo0 qo0Var, Context context) {
        super(context);
        this.f28114b = qo0Var;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f28113a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f28114b, true);
                super.onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f28113a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f28114b, false);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f28113a) {
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
        switch (this.f28113a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.qo0) this.f28114b).fragmentView).requestDisallowInterceptTouchEvent(true);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public t81(Context context, Context context2) {
        super(context);
        this.f28114b = context2;
    }
}
