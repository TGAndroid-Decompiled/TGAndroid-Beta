package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.em;
public final class f2 extends FrameLayout {
    public final org.telegram.ui.ActionBar.l5 f19105a;
    public final ImageView f19106b;
    public boolean f19107c;
    public int d;

    public f2(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i11;
        this.d = i10;
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f19105a = l5Var;
        l5Var.setTextSize(16);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        l5Var.setGravity(i11);
        int i12 = org.telegram.ui.ActionBar.j6.f18126o6;
        l5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        l5Var.setTag(Integer.valueOf(i12));
        addView(l5Var);
        ImageView imageView = new ImageView(context);
        this.f19106b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f19107c) {
            canvas.drawLine(AndroidUtilities.dp(this.d), getMeasuredHeight() - 1, AndroidUtilities.dp(23.0f) + getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f18049k0);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        int dp;
        int measuredWidth;
        float f10;
        int i14 = i12 - i10;
        org.telegram.ui.ActionBar.l5 l5Var = this.f19105a;
        int textHeight = ((i13 - i11) - l5Var.getTextHeight()) / 2;
        boolean z11 = LocaleController.isRTL;
        ImageView imageView = this.f19106b;
        if (z11) {
            int measuredWidth2 = getMeasuredWidth() - l5Var.getMeasuredWidth();
            if (imageView.getVisibility() == 0) {
                f10 = this.d;
            } else {
                f10 = 25.0f;
            }
            dp = measuredWidth2 - AndroidUtilities.dp(f10);
        } else {
            if (imageView.getVisibility() == 0) {
                f7 = this.d;
            } else {
                f7 = 25.0f;
            }
            dp = AndroidUtilities.dp(f7);
        }
        l5Var.layout(dp, textHeight, l5Var.getMeasuredWidth() + dp, l5Var.getMeasuredHeight() + textHeight);
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
        this.f19105a.measure(em.d(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.f19106b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        setMeasuredDimension(size, AndroidUtilities.dp(50.0f));
    }
}
