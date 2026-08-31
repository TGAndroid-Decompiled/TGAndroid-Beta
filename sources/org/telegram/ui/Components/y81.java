package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class y81 extends WebView {
    public final int f33415a = 0;
    public final Object f33416b;

    public y81(org.telegram.ui.lo0 lo0Var, Context context) {
        super(context);
        this.f33416b = lo0Var;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f33415a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f33416b, true);
                super.onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f33415a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f33416b, false);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f33415a) {
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
        switch (this.f33415a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.lo0) this.f33416b).fragmentView).requestDisallowInterceptTouchEvent(true);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public y81(Context context, Context context2) {
        super(context);
        this.f33416b = context2;
    }
}
