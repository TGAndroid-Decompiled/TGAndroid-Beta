package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class t3 extends View {
    public final int f23041a;
    public final int f23042b;

    public t3(Context context, int i10, int i11) {
        super(context);
        this.f23041a = i11;
        this.f23042b = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f23041a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f23042b), 1073741824));
                return;
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f23042b), 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f23042b, 1073741824));
                return;
        }
    }

    public t3(Context context, int i10) {
        super(context);
        this.f23041a = 0;
        this.f23042b = i10;
    }
}
