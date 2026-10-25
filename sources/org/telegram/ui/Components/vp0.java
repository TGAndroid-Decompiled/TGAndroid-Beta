package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class vp0 extends LinearLayout {
    public final int f34238a;
    public final int f34239b;

    public vp0(Context context, int i10, int i11) {
        super(context);
        this.f34238a = i10;
        this.f34239b = i11;
    }

    @Override
    public final int getSuggestedMinimumWidth() {
        return AndroidUtilities.dp(260.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), this.f34238a), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), this.f34239b), View.MeasureSpec.getMode(i11)));
    }
}
