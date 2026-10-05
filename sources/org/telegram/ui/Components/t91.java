package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class t91 extends WebView {
    public final int f31090a = 0;
    public final Object f31091b;

    public t91(org.telegram.ui.so0 so0Var, Context context) {
        super(context);
        this.f31091b = so0Var;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f31090a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f31091b, true);
                super.onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f31090a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f31091b, false);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f31090a) {
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
        switch (this.f31090a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.so0) this.f31091b).fragmentView).requestDisallowInterceptTouchEvent(true);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public t91(Context context, Context context2) {
        super(context);
        this.f31091b = context2;
    }
}
