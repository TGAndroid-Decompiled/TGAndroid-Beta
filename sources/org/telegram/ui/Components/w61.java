package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
public final class w61 extends WebView {
    public final int f39919a = 0;
    public final Object f39920b;

    public w61(org.telegram.ui.dl0 dl0Var, Context context) {
        super(context);
        this.f39920b = dl0Var;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f39919a) {
            case 0:
                org.telegram.messenger.g0.u((Context) this.f39920b, true);
                super.onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f39919a) {
            case 0:
                org.telegram.messenger.g0.u((Context) this.f39920b, false);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f39919a) {
            case 1:
                super.onMeasure(i3, i10);
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f39919a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.dl0) this.f39920b).fragmentView).requestDisallowInterceptTouchEvent(true);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public w61(Context context, Context context2) {
        super(context);
        this.f39920b = context2;
    }
}
