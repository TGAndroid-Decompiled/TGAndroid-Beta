package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Stories.recorder.HintView2;

public class TopViewCell extends LinearLayout implements Theme.Colorable {
    public int imageSize;
    public final BackupImageView imageView;
    private int lastIconResId;
    private final Theme.ResourcesProvider resourcesProvider;
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
        backupImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$0(view);
            }
        });
        addView(backupImageView, LayoutHelper.createLinear(90, 90, 17, 0, 9, 0, 9));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
        this.titleView = linksTextView;
        linksTextView.setTextSize(1, 20.0f);
        linksTextView.setGravity(17);
        linksTextView.setTypeface(AndroidUtilities.bold());
        linksTextView.setTextAlignment(4);
        addView(linksTextView, LayoutHelper.createLinear(-1, -2, 17, 48, 0, 48, 10));
        LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context);
        this.textView = linksTextView2;
        linksTextView2.setTextSize(1, 14.0f);
        linksTextView2.setGravity(17);
        linksTextView2.setTextAlignment(4);
        addView(linksTextView2, LayoutHelper.createLinear(-1, -2, 17, 48, 0, 48, 17));
        updateColors();
    }

    public void lambda$new$0(View view) {
        this.imageView.getImageReceiver().startAnimation();
    }

    @Override
    public void updateColors() {
        LinkSpanDrawable.LinksTextView linksTextView = this.titleView;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        linksTextView.setTextColor(Theme.getColor(i, this.resourcesProvider));
        LinkSpanDrawable.LinksTextView linksTextView2 = this.titleView;
        int i2 = Theme.key_chat_messageLinkIn;
        linksTextView2.setLinkTextColor(Theme.getColor(i2, this.resourcesProvider));
        LinkSpanDrawable.LinksTextView linksTextView3 = this.textView;
        if (this.titleView.getVisibility() != 0) {
            i = Theme.key_windowBackgroundWhiteGrayText4;
        }
        linksTextView3.setTextColor(Theme.getColor(i, this.resourcesProvider));
        this.textView.setLinkTextColor(Theme.getColor(i2, this.resourcesProvider));
        BackupImageView backupImageView = this.imageView;
        int i3 = this.imageSize;
        backupImageView.setLayoutParams(LayoutHelper.createLinear(i3, i3, 17, 0, this.titleView.getVisibility() == 0 ? 0 : 9, 0, 9));
    }

    public void setEmoji(String str, String str2) {
        MediaDataController.getInstance(UserConfig.selectedAccount).setPlaceholderImage(this.imageView, str, str2, "90_90");
    }

    public void setEmojiSize(int i) {
        if (this.imageSize != i) {
            this.imageSize = i;
            updateColors();
        }
    }

    public void setEmoji(int i) {
        if (this.lastIconResId != i) {
            BackupImageView backupImageView = this.imageView;
            this.lastIconResId = i;
            backupImageView.setImageDrawable(new RLottieDrawable(i, "" + i, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f)));
            this.imageView.getImageReceiver().setAutoRepeat(2);
        }
    }

    public void setEmojiStatic(int i) {
        if (this.lastIconResId != i) {
            this.imageView.clearImage();
            BackupImageView backupImageView = this.imageView;
            this.lastIconResId = i;
            backupImageView.setImageResource(i);
        }
    }

    public void setText(CharSequence charSequence) {
        this.titleView.setVisibility(8);
        this.textView.setText(charSequence);
        LinkSpanDrawable.LinksTextView linksTextView = this.textView;
        linksTextView.setMaxWidth(HintView2.cutInFancyHalf(charSequence, linksTextView.getPaint()));
        this.textView.requestLayout();
        updateColors();
    }

    public void setText(CharSequence charSequence, CharSequence charSequence2) {
        this.titleView.setText(charSequence);
        this.titleView.setVisibility(0);
        this.textView.setText(charSequence2);
        LinkSpanDrawable.LinksTextView linksTextView = this.textView;
        linksTextView.setMaxWidth(HintView2.cutInFancyHalf(charSequence2, linksTextView.getPaint()));
        this.textView.requestLayout();
        updateColors();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }
}
