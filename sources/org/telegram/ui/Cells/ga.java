package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class ga extends FrameLayout {
    public TextView f24407a;
    public ImageView f24408b;
    public boolean f24409c;

    public final void a(String str, boolean z10, boolean z11) {
        int i9;
        this.f24407a.setText(str);
        ImageView imageView = this.f24408b;
        if (z10) {
            i9 = 0;
        } else {
            i9 = 4;
        }
        imageView.setVisibility(i9);
        this.f24409c = z11;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i9;
        if (this.f24409c) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(20.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i9 = AndroidUtilities.dp(20.0f);
            } else {
                i9 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i9, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.f24409c ? 1 : 0), 1073741824));
    }

    public void setTypeChecked(boolean z10) {
        int i9;
        ImageView imageView = this.f24408b;
        if (z10) {
            i9 = 0;
        } else {
            i9 = 4;
        }
        imageView.setVisibility(i9);
    }
}
