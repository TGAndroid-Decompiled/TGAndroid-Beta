package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class s91 extends WebView {
    public final int f30667a = 0;
    public final Object f30668b;

    public s91(org.telegram.ui.so0 so0Var, Context context) {
        super(context);
        this.f30668b = so0Var;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f30667a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f30668b, true);
                super.onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f30667a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f30668b, false);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f30667a) {
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
        switch (this.f30667a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.so0) this.f30668b).fragmentView).requestDisallowInterceptTouchEvent(true);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public s91(Context context, Context context2) {
        super(context);
        this.f30668b = context2;
    }
}
