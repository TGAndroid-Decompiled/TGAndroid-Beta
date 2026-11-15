package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
public final class f71 extends WebView {
    public final int f34537a = 0;
    public final Object f34538b;

    public f71(org.telegram.ui.kl0 kl0Var, Context context) {
        super(context);
        this.f34538b = kl0Var;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f34537a) {
            case 0:
                org.telegram.messenger.g0.u((Context) this.f34538b, true);
                super.onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f34537a) {
            case 0:
                org.telegram.messenger.g0.u((Context) this.f34538b, false);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f34537a) {
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
        switch (this.f34537a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.kl0) this.f34538b).fragmentView).requestDisallowInterceptTouchEvent(true);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public f71(Context context, Context context2) {
        super(context);
        this.f34538b = context2;
    }
}
