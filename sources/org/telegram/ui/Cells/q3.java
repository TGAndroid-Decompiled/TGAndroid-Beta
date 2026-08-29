package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class q3 extends View {
    public final int f25058a;
    public final int f25059b;

    public q3(Context context, int i10, int i11) {
        super(context);
        this.f25058a = i11;
        this.f25059b = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f25058a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f25059b), 1073741824));
                return;
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f25059b), 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f25059b, 1073741824));
                return;
        }
    }

    public q3(Context context, int i10) {
        super(context);
        this.f25058a = 0;
        this.f25059b = i10;
    }
}
