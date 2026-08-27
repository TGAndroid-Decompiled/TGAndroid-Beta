package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class l8 extends aq {

    public final int f30321b0;

    public l8(Context context, boolean z10, zp zpVar, int i10) {
        super(context, z10, zpVar);
        this.f30321b0 = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f30321b0) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(300.0f), 1073741824));
                break;
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(300.0f), 1073741824));
                break;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(300.0f), 1073741824));
                break;
        }
    }
}
