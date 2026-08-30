package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class b20 extends FrameLayout {
    public org.telegram.ui.ActionBar.k5 f32774a;
    public ImageView f32775b;

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int dp;
        int measuredWidth;
        ImageView imageView = this.f32775b;
        int i14 = i12 - i10;
        org.telegram.ui.ActionBar.k5 k5Var = this.f32774a;
        int textHeight = ((i13 - i11) - k5Var.getTextHeight()) / 2;
        float f10 = 23.0f;
        if (LocaleController.isRTL) {
            int measuredWidth2 = getMeasuredWidth() - k5Var.getMeasuredWidth();
            if (imageView.getVisibility() == 0) {
                f10 = 64.0f;
            }
            dp = measuredWidth2 - AndroidUtilities.dp(f10);
        } else {
            if (imageView.getVisibility() == 0) {
                f10 = 64.0f;
            }
            dp = AndroidUtilities.dp(f10);
        }
        k5Var.layout(dp, textHeight, k5Var.getMeasuredWidth() + dp, k5Var.getMeasuredHeight() + textHeight);
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
        this.f32774a.measure(b.d(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.f32775b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        setMeasuredDimension(size, AndroidUtilities.dp(50.0f));
    }
}
