package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
public final class d71 extends WebView {
    public final int f32792a = 0;
    public final Object f32793b;

    public d71(org.telegram.ui.hl0 hl0Var, Context context) {
        super(context);
        this.f32793b = hl0Var;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f32792a) {
            case 0:
                org.telegram.messenger.g0.u((Context) this.f32793b, true);
                super.onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f32792a) {
            case 0:
                org.telegram.messenger.g0.u((Context) this.f32793b, false);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f32792a) {
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
        switch (this.f32792a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.hl0) this.f32793b).fragmentView).requestDisallowInterceptTouchEvent(true);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public d71(Context context, Context context2) {
        super(context);
        this.f32793b = context2;
    }
}
