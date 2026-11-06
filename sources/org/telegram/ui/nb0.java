package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.ViewSwitcher;
public final class nb0 extends ViewSwitcher {
    public final int f48012a;

    public nb0(Context context, int i7) {
        super(context);
        this.f48012a = i7;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f48012a) {
            case 0:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), Integer.MIN_VALUE));
                return;
            default:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), Integer.MIN_VALUE));
                return;
        }
    }
}
