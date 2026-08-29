package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class vy extends org.telegram.ui.Cells.b8 {
    public final int K;

    public vy(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, z10);
        this.K = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.K) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(82.0f), 1073741824));
                return;
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(82.0f), 1073741824));
                return;
            case 2:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(82.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(82.0f), 1073741824));
                return;
        }
    }
}
