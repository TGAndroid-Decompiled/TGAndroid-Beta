package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.vh;
public final class e2 extends FrameLayout {
    public final org.telegram.ui.ActionBar.b6 f24021a;
    public final ImageView f24022b;
    public boolean f24023c;
    public int d;

    public e2(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        int i11;
        this.d = i10;
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.f24021a = b6Var;
        b6Var.setTextSize(16);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        b6Var.setGravity(i11);
        int i12 = org.telegram.ui.ActionBar.y6.f23558o6;
        org.telegram.ui.ActionBar.f7.Y(b6Var, i12, u6Var);
        b6Var.setTag(Integer.valueOf(i12));
        addView(b6Var);
        ImageView imageView = new ImageView(context);
        this.f24022b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f24023c) {
            canvas.drawLine(AndroidUtilities.dp(this.d), getMeasuredHeight() - 1, AndroidUtilities.dp(23.0f) + getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.y6.f23476k0);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        int dp;
        int measuredWidth;
        float f10;
        int i14 = i12 - i10;
        org.telegram.ui.ActionBar.b6 b6Var = this.f24021a;
        int textHeight = ((i13 - i11) - b6Var.getTextHeight()) / 2;
        boolean z11 = LocaleController.isRTL;
        ImageView imageView = this.f24022b;
        if (z11) {
            int measuredWidth2 = getMeasuredWidth() - b6Var.getMeasuredWidth();
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
        b6Var.layout(dp, textHeight, b6Var.getMeasuredWidth() + dp, b6Var.getMeasuredHeight() + textHeight);
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
        this.f24021a.measure(vh.x(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.f24022b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        setMeasuredDimension(size, AndroidUtilities.dp(50.0f));
    }
}
