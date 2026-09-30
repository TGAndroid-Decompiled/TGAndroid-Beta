package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class fp0 extends LinearLayout {
    public final int f24326a;
    public final int f24327b;

    public fp0(Context context, int i10, int i11) {
        super(context);
        this.f24326a = i10;
        this.f24327b = i11;
    }

    @Override
    public final int getSuggestedMinimumWidth() {
        return AndroidUtilities.dp(260.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), this.f24326a), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), this.f24327b), View.MeasureSpec.getMode(i11)));
    }
}
