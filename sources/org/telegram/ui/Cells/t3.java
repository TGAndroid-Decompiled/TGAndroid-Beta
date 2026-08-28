package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class t3 extends View {
    public final int f25677a;
    public final int f25678b;

    public t3(Context context, int i9, int i10) {
        super(context);
        this.f25677a = i10;
        this.f25678b = i9;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        switch (this.f25677a) {
            case 0:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f25678b), 1073741824));
                return;
            case 1:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f25678b), 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f25678b, 1073741824));
                return;
        }
    }

    public t3(Context context, int i9) {
        super(context);
        this.f25677a = 0;
        this.f25678b = i9;
    }
}
