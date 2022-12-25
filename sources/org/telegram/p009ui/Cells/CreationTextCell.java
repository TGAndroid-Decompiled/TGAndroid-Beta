package org.telegram.p009ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.ActionBar.SimpleTextView;
import org.telegram.p009ui.ActionBar.Theme;

public class CreationTextCell extends FrameLayout {
    boolean divider;
    private ImageView imageView;
    public int startPadding;
    private SimpleTextView textView;

    public CreationTextCell(Context context) {
        this(context, null);
    }

    public CreationTextCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.startPadding = 70;
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.textView = simpleTextView;
        simpleTextView.setTextSize(16);
        this.textView.setGravity(LocaleController.isRTL ? 5 : 3);
        this.textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlueText2", resourcesProvider));
        this.textView.setTag("windowBackgroundWhiteBlueText2");
        addView(this.textView);
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(this.imageView);
        setWillNotDraw(false);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        AndroidUtilities.m35dp(48.0f);
        this.textView.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.m35dp(94.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(20.0f), 1073741824));
        this.imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(50.0f), 1073741824));
        setMeasuredDimension(size, AndroidUtilities.m35dp(50.0f));
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int m35dp;
        int i5 = i3 - i;
        int textHeight = ((i4 - i2) - this.textView.getTextHeight()) / 2;
        if (LocaleController.isRTL) {
            m35dp = (getMeasuredWidth() - this.textView.getMeasuredWidth()) - AndroidUtilities.m35dp(this.imageView.getVisibility() == 0 ? this.startPadding : 25.0f);
        } else {
            m35dp = AndroidUtilities.m35dp(this.imageView.getVisibility() == 0 ? this.startPadding : 25.0f);
        }
        SimpleTextView simpleTextView = this.textView;
        simpleTextView.layout(m35dp, textHeight, simpleTextView.getMeasuredWidth() + m35dp, this.textView.getMeasuredHeight() + textHeight);
        int m35dp2 = !LocaleController.isRTL ? (AndroidUtilities.m35dp(this.startPadding) - this.imageView.getMeasuredWidth()) / 2 : (i5 - this.imageView.getMeasuredWidth()) - AndroidUtilities.m35dp(25.0f);
        ImageView imageView = this.imageView;
        imageView.layout(m35dp2, 0, imageView.getMeasuredWidth() + m35dp2, this.imageView.getMeasuredHeight());
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.divider) {
            canvas.drawLine(AndroidUtilities.m35dp(this.startPadding), getMeasuredHeight() - 1, getMeasuredWidth() + AndroidUtilities.m35dp(23.0f), getMeasuredHeight(), Theme.dividerPaint);
        }
    }

    public void setTextAndIcon(String str, Drawable drawable, boolean z) {
        this.textView.setText(str);
        this.imageView.setImageDrawable(drawable);
        this.divider = z;
    }
}
