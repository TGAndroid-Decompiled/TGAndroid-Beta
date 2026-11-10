package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.ViewSwitcher;
public final class qb0 extends ViewSwitcher {
    public final int f49009a;

    public qb0(Context context, int i7) {
        super(context);
        this.f49009a = i7;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f49009a) {
            case 0:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), Integer.MIN_VALUE));
                return;
            default:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), Integer.MIN_VALUE));
                return;
        }
    }
}
