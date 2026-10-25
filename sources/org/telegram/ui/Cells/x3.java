package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class x3 extends View {
    public final int f25691a;
    public final int f25692b;

    public x3(Context context, int i10, int i11) {
        super(context);
        this.f25691a = i11;
        this.f25692b = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f25691a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f25692b), 1073741824));
                return;
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f25692b), 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f25692b, 1073741824));
                return;
        }
    }

    public x3(Context context, int i10) {
        super(context);
        this.f25691a = 0;
        this.f25692b = i10;
    }
}
