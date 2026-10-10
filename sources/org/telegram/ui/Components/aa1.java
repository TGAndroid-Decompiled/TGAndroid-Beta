package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class aa1 extends WebView {
    public final int f24527a = 0;
    public final Object f24528b;

    public aa1(org.telegram.ui.vo0 vo0Var, Context context) {
        super(context);
        this.f24528b = vo0Var;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f24527a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f24528b, true);
                super.onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f24527a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f24528b, false);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f24527a) {
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
        switch (this.f24527a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.vo0) this.f24528b).fragmentView).requestDisallowInterceptTouchEvent(true);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public aa1(Context context, Context context2) {
        super(context);
        this.f24528b = context2;
    }
}
