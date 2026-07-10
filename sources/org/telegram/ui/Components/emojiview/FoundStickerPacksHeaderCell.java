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

public class FoundStickerPacksHeaderCell extends FrameLayout implements Theme.Colorable {
    private final ImageView backButton;
    private final TextView headerText;
    private final Theme.ResourcesProvider resourcesProvider;

    public int[] getColorKeys() {
        return Theme.Colorable.CC.$default$getColorKeys(this);
    }

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

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.backButton.setOnClickListener(onClickListener);
    }

    @Override
    public void updateColors() {
        this.headerText.setTextColor(getGlassIconColor(0.6f));
        this.backButton.setColorFilter(new PorterDuffColorFilter(getGlassIconColor(0.6f), PorterDuff.Mode.MULTIPLY));
        this.backButton.setBackground(Theme.createSelectorDrawable(getGlassIconColor(0.1f), 1));
    }

    private int getGlassIconColor(float f) {
        return ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_glass_defaultIcon, this.resourcesProvider), (int) (f * 255.0f));
    }
}
