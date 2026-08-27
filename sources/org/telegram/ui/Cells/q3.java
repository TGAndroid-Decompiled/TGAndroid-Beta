package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class q3 extends View {

    public final int f25047a;

    public final int f25048b;

    public q3(Context context, int i10, int i11) {
        super(context);
        this.f25047a = i11;
        this.f25048b = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f25047a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f25048b), 1073741824));
                break;
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f25048b), 1073741824));
                break;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f25048b, 1073741824));
                break;
        }
    }

    public q3(Context context, int i10) {
        super(context);
        this.f25047a = 0;
        this.f25048b = i10;
    }
}
