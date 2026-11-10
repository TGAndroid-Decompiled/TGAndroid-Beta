package org.telegram.ui;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class mi extends FrameLayout {
    public final cn f47974a;

    public mi(cn cnVar, Activity activity) {
        super(activity);
        this.f47974a = cnVar;
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            this.f47974a.P7(true);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int min = Math.min(View.MeasureSpec.getSize(i10), org.telegram.messenger.g0.L(300.0f));
        if (min == 0) {
            min = org.telegram.messenger.g0.L(300.0f);
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(min, Integer.MIN_VALUE));
    }
}
