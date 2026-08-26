package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;

public class ManageChatTextCell extends FrameLayout {
    public boolean divider;
    public int dividerColor;
    public final ImageView imageView;
    public final SimpleTextView textView;
    public final SimpleTextView valueTextView;

    public ManageChatTextCell(Context context) {
        super(context);
        this.dividerColor = 0;
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.textView = simpleTextView;
        simpleTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        simpleTextView.setTextSize(16);
        simpleTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(simpleTextView);
        SimpleTextView simpleTextView2 = new SimpleTextView(context);
        this.valueTextView = simpleTextView2;
        simpleTextView2.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteValueText, false));
        simpleTextView2.setTextSize(16);
        simpleTextView2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(simpleTextView2);
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayIcon, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView);
    }

    public int getFullHeight() {
        return AndroidUtilities.dp(56.0f);
    }

    public SimpleTextView getTextView() {
        return this.textView;
    }

    public SimpleTextView getValueTextView() {
        return this.valueTextView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.divider) {
            int i = this.dividerColor;
            if (i != 0) {
                Theme.dividerExtraPaint.setColor(Theme.getColor(null, i, false));
            }
            canvas.drawLine(AndroidUtilities.dp(71.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, this.dividerColor != 0 ? Theme.dividerExtraPaint : Theme.dividerPaint);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i4 - i2;
        int i6 = i3 - i;
        SimpleTextView simpleTextView = this.valueTextView;
        int textHeight = (i5 - simpleTextView.getTextHeight()) / 2;
        int iDp = LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0;
        simpleTextView.layout(iDp, textHeight, simpleTextView.getMeasuredWidth() + iDp, simpleTextView.getMeasuredHeight() + textHeight);
        SimpleTextView simpleTextView2 = this.textView;
        int textHeight2 = (i5 - simpleTextView2.getTextHeight()) / 2;
        int iDp2 = !LocaleController.isRTL ? AndroidUtilities.dp(71.0f) : AndroidUtilities.dp(24.0f);
        simpleTextView2.layout(iDp2, textHeight2, simpleTextView2.getMeasuredWidth() + iDp2, simpleTextView2.getMeasuredHeight() + textHeight2);
        int iDp3 = AndroidUtilities.dp(9.0f);
        boolean z2 = LocaleController.isRTL;
        ImageView imageView = this.imageView;
        int iDp4 = !z2 ? AndroidUtilities.dp(21.0f) : (i6 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(21.0f);
        imageView.layout(iDp4, iDp3, imageView.getMeasuredWidth() + iDp4, imageView.getMeasuredHeight() + iDp3);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int iDp = AndroidUtilities.dp(48.0f);
        this.valueTextView.measure(OKLCH.m(size, 24.0f, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.textView.measure(OKLCH.m(size, 95.0f, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE));
        setMeasuredDimension(size, getFullHeight() + (this.divider ? 1 : 0));
    }

    public final void setColors(int i, int i2) {
        SimpleTextView simpleTextView = this.textView;
        simpleTextView.setTextColor(Theme.getColor(null, i2, false));
        simpleTextView.setTag(Integer.valueOf(i2));
        ImageView imageView = this.imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), PorterDuff.Mode.MULTIPLY));
        imageView.setTag(Integer.valueOf(i));
    }

    public void setDividerColor(int i) {
        this.dividerColor = i;
    }

    public final void setText(String str, int i, int i2, boolean z) {
        this.textView.setText(str, false);
        this.valueTextView.setVisibility(4);
        ImageView imageView = this.imageView;
        imageView.setPadding(0, AndroidUtilities.dp(i2), 0, 0);
        imageView.setImageResource(i);
        this.divider = z;
        setWillNotDraw(!z);
    }

    public void setTextColor(int i) {
        this.textView.setTextColor(i);
    }
}
