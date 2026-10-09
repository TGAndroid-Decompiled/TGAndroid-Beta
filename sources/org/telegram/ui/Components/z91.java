package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class z91 extends WebView {
    public final int f33508a = 0;
    public final Object f33509b;

    public z91(org.telegram.ui.vo0 vo0Var, Context context) {
        super(context);
        this.f33509b = vo0Var;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f33508a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f33509b, true);
                super.onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f33508a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f33509b, false);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f33508a) {
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
        switch (this.f33508a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.vo0) this.f33509b).fragmentView).requestDisallowInterceptTouchEvent(true);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public z91(Context context, Context context2) {
        super(context);
        this.f33509b = context2;
    }
}
