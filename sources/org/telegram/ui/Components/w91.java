package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class w91 extends WebView {
    public final int f30512a = 0;
    public final Object f30513b;

    public w91(org.telegram.ui.ap0 ap0Var, Context context) {
        super(context);
        this.f30513b = ap0Var;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f30512a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f30513b, true);
                super.onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f30512a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f30513b, false);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f30512a) {
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
        switch (this.f30512a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.ap0) this.f30513b).fragmentView).requestDisallowInterceptTouchEvent(true);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public w91(Context context, Context context2) {
        super(context);
        this.f30513b = context2;
    }
}
