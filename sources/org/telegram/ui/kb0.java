package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.ViewSwitcher;
public final class kb0 extends ViewSwitcher {
    public final int f46892a;

    public kb0(Context context, int i3) {
        super(context);
        this.f46892a = i3;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        switch (this.f46892a) {
            case 0:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), Integer.MIN_VALUE));
                return;
            default:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), Integer.MIN_VALUE));
                return;
        }
    }
}
