package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class h91 extends WebView {
    public final int f23555a = 0;
    public final Object f23556b;

    public h91(org.telegram.ui.wo0 wo0Var, Context context) {
        super(context);
        this.f23556b = wo0Var;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f23555a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f23556b, true);
                super.onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f23555a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f23556b, false);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f23555a) {
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
        switch (this.f23555a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.wo0) this.f23556b).fragmentView).requestDisallowInterceptTouchEvent(true);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public h91(Context context, Context context2) {
        super(context);
        this.f23556b = context2;
    }
}
