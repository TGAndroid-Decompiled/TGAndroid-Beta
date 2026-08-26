package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.ViewOutlineProviderImpl;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;

public final class LocationDirectionCell extends FrameLayout {
    public final FrameLayout frameLayout;

    public LocationDirectionCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.frameLayout = frameLayout;
        int color = Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider);
        frameLayout.setBackground(Theme.AdaptiveRipple.createRect(new float[]{8.0f}, color, Theme.AdaptiveRipple.calcRippleColor(color)));
        addView(frameLayout, LayoutHelper.createFrame(-1, 48.0f, 51, 16.0f, 10.0f, 16.0f, 0.0f));
        SimpleTextView simpleTextView = new SimpleTextView(context);
        simpleTextView.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        simpleTextView.setGravity(17);
        simpleTextView.setDrawablePadding(AndroidUtilities.dp(8.0f));
        simpleTextView.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider));
        simpleTextView.setTextSize(14);
        simpleTextView.setText(LocaleController.getString(R.string.Directions), false);
        simpleTextView.setLeftDrawable(R.drawable.filled_directions);
        simpleTextView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(simpleTextView, LayoutHelper.createFrame(-1.0f, -1));
        frameLayout.setOutlineProvider(ViewOutlineProviderImpl.BOUNDS_ROUND_RECT);
        frameLayout.setClipToOutline(true);
        ScaleStateListAnimator.apply(frameLayout, 0.02f, 1.2f);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(73.0f), 1073741824));
    }

    public void setOnButtonClick(View.OnClickListener onClickListener) {
        this.frameLayout.setOnClickListener(onClickListener);
    }
}
