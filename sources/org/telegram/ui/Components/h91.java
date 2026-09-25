package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class h91 extends WebView {
    public final int f24709a = 0;
    public final Object f24710b;

    public h91(org.telegram.ui.oo0 oo0Var, Context context) {
        super(context);
        this.f24710b = oo0Var;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f24709a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f24710b, true);
                super.onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f24709a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f24710b, false);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f24709a) {
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
        switch (this.f24709a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.oo0) this.f24710b).fragmentView).requestDisallowInterceptTouchEvent(true);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public h91(Context context, Context context2) {
        super(context);
        this.f24710b = context2;
    }
}
