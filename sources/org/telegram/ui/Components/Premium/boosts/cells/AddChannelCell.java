package org.telegram.ui.Components.Premium.boosts.cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CombinedDrawable;

public final class AddChannelCell extends FrameLayout {
    public final ImageView imageView;
    public final SimpleTextView textView;

    public AddChannelCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.textView = simpleTextView;
        simpleTextView.setTextSize(16);
        simpleTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        int i = Theme.key_windowBackgroundWhiteBlueHeader;
        simpleTextView.setTextColor(Theme.getColor(i, resourcesProvider));
        simpleTextView.setTag(Integer.valueOf(i));
        addView(simpleTextView);
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        simpleTextView.setText(LocaleController.getString(R.string.BoostingAddChannelOrGroup), false);
        Drawable drawable = getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = getResources().getDrawable(R.drawable.poll_add_plus);
        int color = Theme.getColor(Theme.key_switchTrackChecked, resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(color, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_checkboxCheck, resourcesProvider), mode));
        imageView.setImageDrawable(new CombinedDrawable(drawable, drawable2));
        setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
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
            iDp = (getMeasuredWidth() - simpleTextView.getMeasuredWidth()) - AndroidUtilities.dp(imageView.getVisibility() == 0 ? 68.0f : 23.0f);
        } else {
            iDp = AndroidUtilities.dp(imageView.getVisibility() == 0 ? 68.0f : 23.0f);
        }
        simpleTextView.layout(iDp, textHeight, simpleTextView.getMeasuredWidth() + iDp, simpleTextView.getMeasuredHeight() + textHeight);
        int iDp2 = !LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : (i5 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(24.0f);
        imageView.layout(iDp2, 0, imageView.getMeasuredWidth() + iDp2, imageView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        this.textView.measure(OKLCH.m(size, 94.0f, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        setMeasuredDimension(size, AndroidUtilities.dp(50.0f));
    }
}
