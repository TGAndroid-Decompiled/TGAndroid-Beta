package org.telegram.p009ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.ActionBar.SimpleTextView;
import org.telegram.p009ui.ActionBar.Theme;

public class InviteTextCell extends FrameLayout {
    private ImageView imageView;
    private SimpleTextView textView;

    public InviteTextCell(Context context) {
        super(context);
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.textView = simpleTextView;
        simpleTextView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        this.textView.setTextSize(17);
        this.textView.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(this.textView);
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor("windowBackgroundWhiteGrayIcon"), PorterDuff.Mode.MULTIPLY));
        addView(this.imageView);
    }

    public SimpleTextView getTextView() {
        return this.textView;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int m35dp = AndroidUtilities.m35dp(72.0f);
        this.textView.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.m35dp(95.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(20.0f), 1073741824));
        this.imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(m35dp, Integer.MIN_VALUE));
        setMeasuredDimension(size, AndroidUtilities.m35dp(72.0f));
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i4 - i2;
        int i6 = i3 - i;
        int textHeight = (i5 - this.textView.getTextHeight()) / 2;
        int m35dp = AndroidUtilities.m35dp(!LocaleController.isRTL ? 71.0f : 24.0f);
        SimpleTextView simpleTextView = this.textView;
        simpleTextView.layout(m35dp, textHeight, simpleTextView.getMeasuredWidth() + m35dp, this.textView.getMeasuredHeight() + textHeight);
        int measuredHeight = (i5 - this.imageView.getMeasuredHeight()) / 2;
        int m35dp2 = !LocaleController.isRTL ? AndroidUtilities.m35dp(20.0f) : (i6 - this.imageView.getMeasuredWidth()) - AndroidUtilities.m35dp(20.0f);
        ImageView imageView = this.imageView;
        imageView.layout(m35dp2, measuredHeight, imageView.getMeasuredWidth() + m35dp2, this.imageView.getMeasuredHeight() + measuredHeight);
    }

    public void setTextColor(int i) {
        this.textView.setTextColor(i);
    }

    public void setTextAndIcon(String str, int i) {
        this.textView.setText(str);
        this.imageView.setImageResource(i);
    }
}
