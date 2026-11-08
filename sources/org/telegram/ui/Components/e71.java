package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
public final class e71 extends WebView {
    public final int f33218a = 0;
    public final Object f33219b;

    public e71(org.telegram.ui.hl0 hl0Var, Context context) {
        super(context);
        this.f33219b = hl0Var;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f33218a) {
            case 0:
                org.telegram.messenger.g0.u((Context) this.f33219b, true);
                super.onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f33218a) {
            case 0:
                org.telegram.messenger.g0.u((Context) this.f33219b, false);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f33218a) {
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
        switch (this.f33218a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.hl0) this.f33219b).fragmentView).requestDisallowInterceptTouchEvent(true);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public e71(Context context, Context context2) {
        super(context);
        this.f33219b = context2;
    }
}
