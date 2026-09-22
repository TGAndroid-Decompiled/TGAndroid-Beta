package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class k91 extends WebView {
    public final int f25653a = 0;
    public final Object f25654b;

    public k91(org.telegram.ui.xo0 xo0Var, Context context) {
        super(context);
        this.f25654b = xo0Var;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f25653a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f25654b, true);
                super.onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f25653a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f25654b, false);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f25653a) {
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
        switch (this.f25653a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.xo0) this.f25654b).fragmentView).requestDisallowInterceptTouchEvent(true);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public k91(Context context, Context context2) {
        super(context);
        this.f25654b = context2;
    }
}
