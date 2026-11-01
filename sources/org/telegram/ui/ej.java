package org.telegram.ui;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class ej extends FrameLayout {
    public final un f36853a;

    public ej(un unVar, Activity activity) {
        super(activity);
        this.f36853a = unVar;
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            this.f36853a.M7(true);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(View.MeasureSpec.getSize(i11), org.telegram.messenger.i0.L(300.0f));
        if (min == 0) {
            min = org.telegram.messenger.i0.L(300.0f);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(min, Integer.MIN_VALUE));
    }
}
