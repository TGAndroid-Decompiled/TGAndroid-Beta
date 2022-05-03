package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

public class EmojiReplacementCell extends FrameLayout {
    private String emoji;
    private ImageView imageView;
    private final Theme.ResourcesProvider resourcesProvider;

    public EmojiReplacementCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(this.imageView, LayoutHelper.createFrame(42, 42.0f, 1, 0.0f, 5.0f, 0.0f, 0.0f));
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f) + getPaddingLeft() + getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(54.0f), 1073741824));
    }

    public void setEmoji(String str, int i) {
        this.emoji = str;
        this.imageView.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        if (i == -1) {
            setBackgroundResource(R.drawable.stickers_back_left);
            setPadding(AndroidUtilities.dp(7.0f), 0, 0, 0);
        } else if (i == 0) {
            setBackgroundResource(R.drawable.stickers_back_center);
            setPadding(0, 0, 0, 0);
        } else if (i == 1) {
            setBackgroundResource(R.drawable.stickers_back_right);
            setPadding(0, 0, AndroidUtilities.dp(7.0f), 0);
        } else if (i == 2) {
            setBackgroundResource(R.drawable.stickers_back_all);
            setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        }
        Drawable background = getBackground();
        if (background != null) {
            background.setAlpha(230);
            background.setColorFilter(new PorterDuffColorFilter(getThemedColor("chat_stickersHintPanel"), PorterDuff.Mode.MULTIPLY));
        }
    }

    public String getEmoji() {
        return this.emoji;
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.imageView.invalidate();
    }

    private int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }
}
