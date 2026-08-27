package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;

public final class b81 extends WebView {

    public final int f27047a = 0;

    public final Object f27048b;

    public b81(org.telegram.ui.do0 do0Var, Context context) {
        super(context);
        this.f27048b = do0Var;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f27047a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f27048b, true);
                super.onAttachedToWindow();
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f27047a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f27048b, false);
                super.onDetachedFromWindow();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f27047a) {
            case 1:
                super.onMeasure(i10, i11);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f27047a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.do0) this.f27048b).fragmentView).requestDisallowInterceptTouchEvent(true);
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    public b81(Context context, Context context2) {
        super(context);
        this.f27048b = context2;
    }
}
