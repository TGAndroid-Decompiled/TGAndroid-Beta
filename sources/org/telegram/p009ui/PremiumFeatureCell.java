package org.telegram.p009ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.PremiumPreviewFragment;

public class PremiumFeatureCell extends FrameLayout {
    public PremiumPreviewFragment.PremiumFeatureData data;
    private final TextView description;
    boolean drawDivider;
    public ImageView imageView;
    private final TextView title;

    public PremiumFeatureCell(Context context) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.title = textView;
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        textView.setTextSize(1, 15.0f);
        textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
        TextView textView2 = new TextView(context);
        this.description = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText"));
        textView2.setLineSpacing(AndroidUtilities.m35dp(2.0f), 1.0f);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 1, 0, 0));
        addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 0, 62.0f, 8.0f, 48.0f, 9.0f));
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        addView(this.imageView, LayoutHelper.createFrame(28, 28.0f, 0, 18.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView2.setImageResource(C1072R.C1073drawable.msg_arrowright);
        imageView2.setColorFilter(Theme.getColor("switchTrack"));
        addView(imageView2, LayoutHelper.createFrame(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    public void setData(PremiumPreviewFragment.PremiumFeatureData premiumFeatureData, boolean z) {
        this.data = premiumFeatureData;
        this.title.setText(premiumFeatureData.title);
        this.description.setText(premiumFeatureData.description);
        this.imageView.setImageResource(premiumFeatureData.icon);
        this.drawDivider = z;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.drawDivider) {
            canvas.drawRect(AndroidUtilities.m35dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), Theme.dividerPaint);
        }
    }
}
