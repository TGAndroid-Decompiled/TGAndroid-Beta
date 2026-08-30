package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class fa extends FrameLayout {
    public TextView f21073a;
    public ImageView f21074b;
    public boolean f21075c;

    public final void a(String str, boolean z4, boolean z10) {
        int i10;
        this.f21073a.setText(str);
        ImageView imageView = this.f21074b;
        if (z4) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView.setVisibility(i10);
        this.f21075c = z10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.f21075c) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(20.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(20.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20025k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.f21075c ? 1 : 0), 1073741824));
    }

    public void setTypeChecked(boolean z4) {
        int i10;
        ImageView imageView = this.f21074b;
        if (z4) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView.setVisibility(i10);
    }
}
