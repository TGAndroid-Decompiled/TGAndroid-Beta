package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class j91 extends WebView {
    public final int f25424a = 0;
    public final Object f25425b;

    public j91(org.telegram.ui.ro0 ro0Var, Context context) {
        super(context);
        this.f25425b = ro0Var;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f25424a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f25425b, true);
                super.onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f25424a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f25425b, false);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f25424a) {
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
        switch (this.f25424a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.ro0) this.f25425b).fragmentView).requestDisallowInterceptTouchEvent(true);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public j91(Context context, Context context2) {
        super(context);
        this.f25425b = context2;
    }
}
