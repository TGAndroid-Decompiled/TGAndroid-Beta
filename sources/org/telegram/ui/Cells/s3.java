package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class s3 extends View {
    public final int f20953a;
    public final int f20954b;

    public s3(Context context, int i10, int i11) {
        super(context);
        this.f20953a = i11;
        this.f20954b = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f20953a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f20954b), 1073741824));
                return;
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f20954b), 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f20954b, 1073741824));
                return;
        }
    }

    public s3(Context context, int i10) {
        super(context);
        this.f20953a = 0;
        this.f20954b = i10;
    }
}
