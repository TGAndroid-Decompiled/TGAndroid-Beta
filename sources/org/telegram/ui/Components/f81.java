package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
public final class f81 extends WebView {
    public final int f26012a = 0;
    public final Object f26013b;

    public f81(org.telegram.ui.sm0 sm0Var, Context context) {
        super(context);
        this.f26013b = sm0Var;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f26012a) {
            case 0:
                org.telegram.messenger.i0.u((Context) this.f26013b, true);
                super.onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f26012a) {
            case 0:
                org.telegram.messenger.i0.u((Context) this.f26013b, false);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f26012a) {
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
        switch (this.f26012a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.sm0) this.f26013b).fragmentView).requestDisallowInterceptTouchEvent(true);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public f81(Context context, Context context2) {
        super(context);
        this.f26013b = context2;
    }
}
