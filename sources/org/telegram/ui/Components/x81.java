package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class x81 extends WebView {
    public final int f30613a = 0;
    public final Object f30614b;

    public x81(org.telegram.ui.jo0 jo0Var, Context context) {
        super(context);
        this.f30614b = jo0Var;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f30613a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f30614b, true);
                super.onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f30613a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f30614b, false);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f30613a) {
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
        switch (this.f30613a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.jo0) this.f30614b).fragmentView).requestDisallowInterceptTouchEvent(true);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public x81(Context context, Context context2) {
        super(context);
        this.f30614b = context2;
    }
}
