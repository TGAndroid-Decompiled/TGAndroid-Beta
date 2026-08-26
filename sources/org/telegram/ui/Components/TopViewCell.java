package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.GroupCallSheet$$ExternalSyntheticLambda5;
import org.telegram.ui.Stories.recorder.HintView2;

public final class TopViewCell extends LinearLayout implements Theme.Colorable {
    public int imageSize;
    public final BackupImageView imageView;
    public int lastIconResId;
    public final Theme.ResourcesProvider resourcesProvider;
    public final LinkSpanDrawable.LinksTextView textView;
    public final LinkSpanDrawable.LinksTextView titleView;

    public TopViewCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.imageSize = 90;
        this.resourcesProvider = resourcesProvider;
        setOrientation(1);
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.getImageReceiver().setAutoRepeatCount(1);
        backupImageView.getImageReceiver().setAutoRepeat(1);
        backupImageView.setOnClickListener(new GroupCallSheet$$ExternalSyntheticLambda5(this, 6));
        addView(backupImageView, LayoutHelper.createLinear(90, 90, 17, 0, 9, 0, 9));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, null);
        this.titleView = linksTextView;
        linksTextView.setTextSize(1, 20.0f);
        linksTextView.setGravity(17);
        linksTextView.setTypeface(AndroidUtilities.bold());
        linksTextView.setTextAlignment(4);
        addView(linksTextView, LayoutHelper.createLinear(-1, -2, 17, 48, 0, 48, 10));
        LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context, null);
        this.textView = linksTextView2;
        linksTextView2.setTextSize(1, 14.0f);
        linksTextView2.setGravity(17);
        linksTextView2.setTextAlignment(4);
        addView(linksTextView2, LayoutHelper.createLinear(-1, -2, 17, 48, 0, 48, 17));
        updateColors$1();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    public void setEmoji(int i) {
        if (this.lastIconResId != i) {
            BackupImageView backupImageView = this.imageView;
            this.lastIconResId = i;
            backupImageView.setImageDrawable(new RLottieDrawable(i, DiffUtil.m(i, ""), AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f), true, null));
            backupImageView.getImageReceiver().setAutoRepeat(2);
        }
    }

    public void setEmojiSize(int i) {
        if (this.imageSize != i) {
            this.imageSize = i;
            updateColors$1();
        }
    }

    public void setEmojiStatic(int i) {
        if (this.lastIconResId != i) {
            BackupImageView backupImageView = this.imageView;
            backupImageView.imageReceiver.clearImage();
            this.lastIconResId = i;
            backupImageView.setImageResource(i);
        }
    }

    public void setText(CharSequence charSequence) {
        this.titleView.setVisibility(8);
        LinkSpanDrawable.LinksTextView linksTextView = this.textView;
        linksTextView.setText(charSequence);
        linksTextView.setMaxWidth(HintView2.cutInFancyHalf(charSequence, linksTextView.getPaint()));
        linksTextView.requestLayout();
        updateColors$1();
    }

    @Override
    public final void updateColors$1() {
        int i = Theme.key_windowBackgroundWhiteBlackText;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int color = Theme.getColor(i, resourcesProvider);
        LinkSpanDrawable.LinksTextView linksTextView = this.titleView;
        linksTextView.setTextColor(color);
        int i2 = Theme.key_chat_messageLinkIn;
        linksTextView.setLinkTextColor(Theme.getColor(i2, resourcesProvider));
        if (linksTextView.getVisibility() != 0) {
            i = Theme.key_windowBackgroundWhiteGrayText4;
        }
        int color2 = Theme.getColor(i, resourcesProvider);
        LinkSpanDrawable.LinksTextView linksTextView2 = this.textView;
        linksTextView2.setTextColor(color2);
        linksTextView2.setLinkTextColor(Theme.getColor(i2, resourcesProvider));
        int i3 = this.imageSize;
        this.imageView.setLayoutParams(LayoutHelper.createLinear(i3, i3, 17, 0, linksTextView.getVisibility() == 0 ? 0 : 9, 0, 9));
    }
}
