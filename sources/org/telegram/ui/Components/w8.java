package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class w8 extends yq {
    public final int f34387g0;

    public w8(Context context, boolean z10, xq xqVar, int i10) {
        super(context, z10, xqVar);
        this.f34387g0 = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f34387g0) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(300.0f), 1073741824));
                return;
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(300.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(300.0f), 1073741824));
                return;
        }
    }
}
