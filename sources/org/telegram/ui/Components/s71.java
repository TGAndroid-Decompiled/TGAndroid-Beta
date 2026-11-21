package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
public final class s71 extends WebView {
    public final int f39519a = 0;
    public final Object f39520b;

    public s71(org.telegram.ui.ml0 ml0Var, Context context) {
        super(context);
        this.f39520b = ml0Var;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f39519a) {
            case 0:
                org.telegram.messenger.g0.u((Context) this.f39520b, true);
                super.onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f39519a) {
            case 0:
                org.telegram.messenger.g0.u((Context) this.f39520b, false);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f39519a) {
            case 1:
                super.onMeasure(i7, i10);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f39519a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.ml0) this.f39520b).fragmentView).requestDisallowInterceptTouchEvent(true);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public s71(Context context, Context context2) {
        super(context);
        this.f39520b = context2;
    }
}
