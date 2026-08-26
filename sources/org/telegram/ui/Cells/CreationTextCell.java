package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;

public final class CreationTextCell extends FrameLayout {
    public boolean divider;
    public final ImageView imageView;
    public int startPadding;
    public final SimpleTextView textView;

    public CreationTextCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.startPadding = i;
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.textView = simpleTextView;
        simpleTextView.setTextSize(16);
        simpleTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        int i2 = Theme.key_windowBackgroundWhiteBlueText2;
        simpleTextView.setTextColor(Theme.getColor(i2, resourcesProvider));
        simpleTextView.setTag(Integer.valueOf(i2));
        addView(simpleTextView);
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.divider) {
            canvas.drawLine(AndroidUtilities.dp(this.startPadding), getMeasuredHeight() - 1, AndroidUtilities.dp(23.0f) + getMeasuredWidth(), getMeasuredHeight(), Theme.dividerPaint);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iDp;
        int i5 = i3 - i;
        SimpleTextView simpleTextView = this.textView;
        int textHeight = ((i4 - i2) - simpleTextView.getTextHeight()) / 2;
        boolean z2 = LocaleController.isRTL;
        ImageView imageView = this.imageView;
        if (z2) {
            iDp = (getMeasuredWidth() - simpleTextView.getMeasuredWidth()) - AndroidUtilities.dp(imageView.getVisibility() == 0 ? this.startPadding : 25.0f);
        } else {
            iDp = AndroidUtilities.dp(imageView.getVisibility() == 0 ? this.startPadding : 25.0f);
        }
        simpleTextView.layout(iDp, textHeight, simpleTextView.getMeasuredWidth() + iDp, simpleTextView.getMeasuredHeight() + textHeight);
        int iDp2 = !LocaleController.isRTL ? (AndroidUtilities.dp(this.startPadding) - imageView.getMeasuredWidth()) / 2 : (i5 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(25.0f);
        imageView.layout(iDp2, 0, imageView.getMeasuredWidth() + iDp2, imageView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        AndroidUtilities.dp(48.0f);
        this.textView.measure(OKLCH.m(size, 94.0f, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        setMeasuredDimension(size, AndroidUtilities.dp(50.0f));
    }
}
