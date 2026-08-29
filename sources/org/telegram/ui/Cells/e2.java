package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class e2 extends FrameLayout {
    public final org.telegram.ui.ActionBar.h5 f24271a;
    public final ImageView f24272b;
    public boolean f24273c;
    public int d;

    public e2(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i11;
        this.d = i10;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f24271a = h5Var;
        h5Var.setTextSize(16);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        h5Var.setGravity(i11);
        int i12 = org.telegram.ui.ActionBar.g6.f23260o6;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        h5Var.setTag(Integer.valueOf(i12));
        addView(h5Var);
        ImageView imageView = new ImageView(context);
        this.f24272b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f24273c) {
            canvas.drawLine(AndroidUtilities.dp(this.d), getMeasuredHeight() - 1, AndroidUtilities.dp(23.0f) + getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.g6.f23183k0);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f9;
        int dp;
        int measuredWidth;
        float f10;
        int i14 = i12 - i10;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24271a;
        int textHeight = ((i13 - i11) - h5Var.getTextHeight()) / 2;
        boolean z11 = LocaleController.isRTL;
        ImageView imageView = this.f24272b;
        if (z11) {
            int measuredWidth2 = getMeasuredWidth() - h5Var.getMeasuredWidth();
            if (imageView.getVisibility() == 0) {
                f10 = this.d;
            } else {
                f10 = 25.0f;
            }
            dp = measuredWidth2 - AndroidUtilities.dp(f10);
        } else {
            if (imageView.getVisibility() == 0) {
                f9 = this.d;
            } else {
                f9 = 25.0f;
            }
            dp = AndroidUtilities.dp(f9);
        }
        h5Var.layout(dp, textHeight, h5Var.getMeasuredWidth() + dp, h5Var.getMeasuredHeight() + textHeight);
        if (!LocaleController.isRTL) {
            measuredWidth = (AndroidUtilities.dp(this.d) - imageView.getMeasuredWidth()) / 2;
        } else {
            measuredWidth = (i14 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(25.0f);
        }
        imageView.layout(measuredWidth, 0, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        AndroidUtilities.dp(48.0f);
        this.f24271a.measure(org.telegram.ui.b.d(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.f24272b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        setMeasuredDimension(size, AndroidUtilities.dp(50.0f));
    }
}
