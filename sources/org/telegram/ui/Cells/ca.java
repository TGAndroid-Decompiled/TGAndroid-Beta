package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

public final class ca extends FrameLayout {

    public TextView f24172a;

    public ImageView f24173b;

    public boolean f24174c;

    public final void a(String str, boolean z10, boolean z11) {
        this.f24172a.setText(str);
        this.f24173b.setVisibility(z10 ? 0 : 4);
        this.f24174c = z11;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f24174c) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.f24174c ? 1 : 0), 1073741824));
    }

    public void setTypeChecked(boolean z10) {
        this.f24173b.setVisibility(z10 ? 0 : 4);
    }
}
