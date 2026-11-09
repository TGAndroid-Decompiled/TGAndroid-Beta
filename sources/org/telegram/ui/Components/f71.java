package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
public final class f71 extends WebView {
    public final int f33603a = 0;
    public final Object f33604b;

    public f71(org.telegram.ui.jl0 jl0Var, Context context) {
        super(context);
        this.f33604b = jl0Var;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f33603a) {
            case 0:
                org.telegram.messenger.g0.u((Context) this.f33604b, true);
                super.onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f33603a) {
            case 0:
                org.telegram.messenger.g0.u((Context) this.f33604b, false);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f33603a) {
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
        switch (this.f33603a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.jl0) this.f33604b).fragmentView).requestDisallowInterceptTouchEvent(true);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public f71(Context context, Context context2) {
        super(context);
        this.f33604b = context2;
    }
}
