package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import org.telegram.messenger.AndroidUtilities;
public final class w91 extends WebView {
    public final int f32171a = 0;
    public final Object f32172b;

    public w91(org.telegram.ui.ho0 ho0Var, Context context) {
        super(context);
        this.f32172b = ho0Var;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f32171a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f32172b, true);
                super.onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f32171a) {
            case 0:
                AndroidUtilities.checkAndroidTheme((Context) this.f32172b, false);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f32171a) {
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
        switch (this.f32171a) {
            case 1:
                ((ViewGroup) ((org.telegram.ui.ho0) this.f32172b).fragmentView).requestDisallowInterceptTouchEvent(true);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public w91(Context context, Context context2) {
        super(context);
        this.f32172b = context2;
    }
}
