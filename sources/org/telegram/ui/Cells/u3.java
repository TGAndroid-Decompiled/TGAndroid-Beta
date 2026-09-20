package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u3 extends View {
    public final int f21601a;
    public final int f21602b;

    public u3(Context context, int i10, int i11) {
        super(context);
        this.f21601a = i11;
        this.f21602b = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f21601a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f21602b), 1073741824));
                return;
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f21602b), 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f21602b, 1073741824));
                return;
        }
    }

    public u3(Context context, int i10) {
        super(context);
        this.f21601a = 0;
        this.f21602b = i10;
    }
}
