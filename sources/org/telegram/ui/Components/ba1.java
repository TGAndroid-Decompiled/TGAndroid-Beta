package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class ba1 extends WebView {
    public final int f24894a = 0;
    public final Object f24895b;

    public ba1(org.telegram.ui.uo0 uo0Var, Context context) {
        super(context);
        this.f24895b = uo0Var;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f24894a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f24895b, true);
                super.onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f24894a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f24895b, false);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f24894a) {
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
        switch (this.f24894a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.uo0) this.f24895b).fragmentView).requestDisallowInterceptTouchEvent(true);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public ba1(Context context, Context context2) {
        super(context);
        this.f24895b = context2;
    }
}
