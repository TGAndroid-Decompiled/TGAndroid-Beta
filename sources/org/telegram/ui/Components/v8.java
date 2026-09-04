package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class v8 extends lq {
    public final int f31155f0;

    public v8(Context context, boolean z10, kq kqVar, int i10) {
        super(context, z10, kqVar);
        this.f31155f0 = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f31155f0) {
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
