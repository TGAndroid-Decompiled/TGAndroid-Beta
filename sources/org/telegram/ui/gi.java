package org.telegram.ui;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class gi extends FrameLayout {
    public final wm f45668a;

    public gi(wm wmVar, Activity activity) {
        super(activity);
        this.f45668a = wmVar;
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            this.f45668a.O7(true);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int min = Math.min(View.MeasureSpec.getSize(i10), org.telegram.messenger.g0.L(300.0f));
        if (min == 0) {
            min = org.telegram.messenger.g0.L(300.0f);
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(min, Integer.MIN_VALUE));
    }
}
