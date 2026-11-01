package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
public final class g81 extends WebView {
    public final int f26355a = 0;
    public final Object f26356b;

    public g81(org.telegram.ui.qm0 qm0Var, Context context) {
        super(context);
        this.f26356b = qm0Var;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f26355a) {
            case 0:
                org.telegram.messenger.i0.u((Context) this.f26356b, true);
                super.onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f26355a) {
            case 0:
                org.telegram.messenger.i0.u((Context) this.f26356b, false);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f26355a) {
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
        switch (this.f26355a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.qm0) this.f26356b).fragmentView).requestDisallowInterceptTouchEvent(true);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public g81(Context context, Context context2) {
        super(context);
        this.f26356b = context2;
    }
}
