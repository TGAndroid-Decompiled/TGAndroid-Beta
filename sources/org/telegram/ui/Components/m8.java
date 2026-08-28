package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class m8 extends cq {
    public final int f30760b0;

    public m8(Context context, boolean z10, bq bqVar, int i9) {
        super(context, z10, bqVar);
        this.f30760b0 = i9;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        switch (this.f30760b0) {
            case 0:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(300.0f), 1073741824));
                return;
            case 1:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(300.0f), 1073741824));
                return;
            default:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(300.0f), 1073741824));
                return;
        }
    }
}
