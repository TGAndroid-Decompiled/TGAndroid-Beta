package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

public final class q10 extends FrameLayout {

    public org.telegram.ui.ActionBar.h5 f41485a;

    public ImageView f41486b;

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iDp;
        ImageView imageView = this.f41486b;
        int i14 = i12 - i10;
        org.telegram.ui.ActionBar.h5 h5Var = this.f41485a;
        int textHeight = ((i13 - i11) - h5Var.getTextHeight()) / 2;
        if (LocaleController.isRTL) {
            iDp = (getMeasuredWidth() - h5Var.getMeasuredWidth()) - AndroidUtilities.dp(imageView.getVisibility() == 0 ? 64.0f : 23.0f);
        } else {
            iDp = AndroidUtilities.dp(imageView.getVisibility() == 0 ? 64.0f : 23.0f);
        }
        h5Var.layout(iDp, textHeight, h5Var.getMeasuredWidth() + iDp, h5Var.getMeasuredHeight() + textHeight);
        int iDp2 = !LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : (i14 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
        imageView.layout(iDp2, 0, imageView.getMeasuredWidth() + iDp2, imageView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        AndroidUtilities.dp(48.0f);
        this.f41485a.measure(org.telegram.messenger.rl.d(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.f41486b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        setMeasuredDimension(size, AndroidUtilities.dp(50.0f));
    }
}
