package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.ViewSwitcher;
import org.telegram.messenger.AndroidUtilities;
public final class pd0 extends ViewSwitcher {
    public final int f42380a;

    public pd0(Context context, int i10) {
        super(context);
        this.f42380a = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f42380a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), Integer.MIN_VALUE));
                return;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), Integer.MIN_VALUE));
                return;
        }
    }
}
