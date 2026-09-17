package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class v81 extends WebView {
    public final int f28657a = 0;
    public final Object f28658b;

    public v81(org.telegram.ui.yo0 yo0Var, Context context) {
        super(context);
        this.f28658b = yo0Var;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f28657a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f28658b, true);
                super.onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f28657a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f28658b, false);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f28657a) {
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
        switch (this.f28657a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.yo0) this.f28658b).fragmentView).requestDisallowInterceptTouchEvent(true);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public v81(Context context, Context context2) {
        super(context);
        this.f28658b = context2;
    }
}
