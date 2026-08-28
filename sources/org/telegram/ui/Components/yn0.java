package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class yn0 extends LinearLayout {
    public final int f35039a;
    public final int f35040b;

    public yn0(Context context, int i9, int i10) {
        super(context);
        this.f35039a = i9;
        this.f35040b = i10;
    }

    @Override
    public final int getSuggestedMinimumWidth() {
        return AndroidUtilities.dp(260.0f);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i9), this.f35039a), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), this.f35040b), View.MeasureSpec.getMode(i10)));
    }
}
