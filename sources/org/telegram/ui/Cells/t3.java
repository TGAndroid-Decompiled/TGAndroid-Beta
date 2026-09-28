package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class t3 extends View {
    public final int f21193a;
    public final int f21194b;

    public t3(Context context, int i10, int i11) {
        super(context);
        this.f21193a = i11;
        this.f21194b = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f21193a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f21194b), 1073741824));
                return;
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f21194b), 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f21194b, 1073741824));
                return;
        }
    }

    public t3(Context context, int i10) {
        super(context);
        this.f21193a = 0;
        this.f21194b = i10;
    }
}
