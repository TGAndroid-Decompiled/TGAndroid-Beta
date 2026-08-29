package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class p10 extends FrameLayout {
    public org.telegram.ui.ActionBar.h5 f41278a;
    public ImageView f41279b;

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp;
        int measuredWidth;
        ImageView imageView = this.f41279b;
        int i14 = i12 - i10;
        org.telegram.ui.ActionBar.h5 h5Var = this.f41278a;
        int textHeight = ((i13 - i11) - h5Var.getTextHeight()) / 2;
        float f9 = 23.0f;
        if (LocaleController.isRTL) {
            int measuredWidth2 = getMeasuredWidth() - h5Var.getMeasuredWidth();
            if (imageView.getVisibility() == 0) {
                f9 = 64.0f;
            }
            dp = measuredWidth2 - AndroidUtilities.dp(f9);
        } else {
            if (imageView.getVisibility() == 0) {
                f9 = 64.0f;
            }
            dp = AndroidUtilities.dp(f9);
        }
        h5Var.layout(dp, textHeight, h5Var.getMeasuredWidth() + dp, h5Var.getMeasuredHeight() + textHeight);
        if (!LocaleController.isRTL) {
            measuredWidth = AndroidUtilities.dp(20.0f);
        } else {
            measuredWidth = (i14 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
        }
        imageView.layout(measuredWidth, 0, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        AndroidUtilities.dp(48.0f);
        this.f41278a.measure(b.d(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.f41279b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        setMeasuredDimension(size, AndroidUtilities.dp(50.0f));
    }
}
