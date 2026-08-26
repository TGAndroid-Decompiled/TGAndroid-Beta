package org.telegram.ui.Components.emojiview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

public final class FoundStickerPacksHeaderCell extends FrameLayout implements Theme.Colorable {
    public final ImageView backButton;
    public final TextView headerText;
    public final Theme.ResourcesProvider resourcesProvider;

    public FoundStickerPacksHeaderCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        ImageView imageView = new ImageView(context);
        this.backButton = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_arrow_back);
        addView(imageView, LayoutHelper.createFrame(48, 48.0f, 8388627, 6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.headerText = textView;
        textView.setText(LocaleController.getString(R.string.EmojiSearchBackToSearch));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, LayoutHelper.createFrame(-2, -2.0f, 8388627, 50.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    public int[] getColorKeys() {
        return null;
    }

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.backButton.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        int i = Theme.key_glass_defaultIcon;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int i2 = (int) 153.0f;
        this.headerText.setTextColor(ColorUtils.setAlphaComponent(Theme.getColor(i, resourcesProvider), i2));
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(ColorUtils.setAlphaComponent(Theme.getColor(i, resourcesProvider), i2), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.backButton;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(Theme.getColor(i, resourcesProvider), (int) 25.5f), 1, -1));
    }
}
