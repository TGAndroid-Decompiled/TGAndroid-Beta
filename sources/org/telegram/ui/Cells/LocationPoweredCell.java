package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
public class LocationPoweredCell extends FrameLayout {
    private ImageView imageView;
    private final Theme.ResourcesProvider resourcesProvider;
    private TextView textView;
    private TextView textView2;

    public LocationPoweredCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        LinearLayout linearLayout = new LinearLayout(context);
        addView(linearLayout, LayoutHelper.createFrame(-2, -2, 17));
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTextSize(1, 16.0f);
        this.textView.setTextColor(getThemedColor("windowBackgroundWhiteGrayText3"));
        this.textView.setText("Powered by");
        linearLayout.addView(this.textView, LayoutHelper.createLinear(-2, -2));
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        imageView.setImageResource(R.drawable.foursquare);
        this.imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor("windowBackgroundWhiteGrayText3"), PorterDuff.Mode.MULTIPLY));
        this.imageView.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        linearLayout.addView(this.imageView, LayoutHelper.createLinear(35, -2));
        TextView textView2 = new TextView(context);
        this.textView2 = textView2;
        textView2.setTextSize(1, 16.0f);
        this.textView2.setTextColor(getThemedColor("windowBackgroundWhiteGrayText3"));
        this.textView2.setText("Foursquare");
        linearLayout.addView(this.textView2, LayoutHelper.createLinear(-2, -2));
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }

    private int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }
}
