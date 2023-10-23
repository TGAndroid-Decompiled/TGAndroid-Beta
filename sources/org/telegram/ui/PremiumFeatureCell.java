package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.PremiumPreviewFragment;
public class PremiumFeatureCell extends FrameLayout {
    public PremiumPreviewFragment.PremiumFeatureData data;
    private final TextView description;
    boolean drawDivider;
    public ImageView imageView;
    private final SimpleTextView title;

    public PremiumFeatureCell(Context context) {
        this(context, null);
    }

    public PremiumFeatureCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setClipChildren(false);
        linearLayout.setClipChildren(false);
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.title = simpleTextView;
        simpleTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        simpleTextView.setTextSize(15);
        simpleTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        linearLayout.addView(simpleTextView, LayoutHelper.createLinear(-1, -2));
        TextView textView = new TextView(context);
        this.description = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider));
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 1, 0, 0));
        addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 0, 62.0f, 8.0f, 48.0f, 9.0f));
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        addView(this.imageView, LayoutHelper.createFrame(28, 28.0f, 0, 18.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setColorFilter(Theme.getColor(Theme.key_switchTrack, resourcesProvider));
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
            canvas.drawRect(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), Theme.dividerPaint);
        }
    }
}
