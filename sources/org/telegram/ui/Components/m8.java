package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class m8 extends kq {
    public final int f26973c0;

    public m8(Context context, boolean z4, jq jqVar, int i10) {
        super(context, z4, jqVar);
        this.f26973c0 = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f26973c0) {
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
