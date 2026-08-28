package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class z71 extends WebView {
    public final int f35219a = 0;
    public final Object f35220b;

    public z71(org.telegram.ui.co0 co0Var, Context context) {
        super(context);
        this.f35220b = co0Var;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f35219a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f35220b, true);
                super.onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f35219a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f35220b, false);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        switch (this.f35219a) {
            case 1:
                super.onMeasure(i9, i10);
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f35219a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.co0) this.f35220b).fragmentView).requestDisallowInterceptTouchEvent(true);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public z71(Context context, Context context2) {
        super(context);
        this.f35220b = context2;
    }
}
