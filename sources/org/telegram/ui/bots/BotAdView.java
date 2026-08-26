package org.telegram.ui.bots;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda22;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda267;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.ScaleStateListAnimator;

public final class BotAdView extends FrameLayout {
    public static final int $r8$clinit = 0;
    public final TextView channelTitleView;
    public final ImageView closeView;
    public final BackupImageView imageView;
    public final TextView removeView;
    public final Theme.ResourcesProvider resourcesProvider;
    public final LinkSpanDrawable.LinksTextView textView;
    public final TextView titleView;

    public BotAdView(Activity activity, Theme.ResourcesProvider resourcesProvider) {
        super(activity);
        this.resourcesProvider = resourcesProvider;
        LinearLayout linearLayoutM = FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(activity, 0);
        linearLayoutM.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        ScaleStateListAnimator.apply(linearLayoutM, 0.025f, 1.4f);
        addView(linearLayoutM, LayoutHelper.createFrame(-1, -1, 119));
        int i = Theme.key_featuredStickers_addButton;
        setBackground(Theme.createRadSelectorDrawable(Theme.multAlpha(0.1f, Theme.getColor(i, resourcesProvider)), 0, 0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayoutM.addView(linearLayout, LayoutHelper.createLinear(-1, -2, 1.0f, 3));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.titleView = textView;
        textView.setTextSize(1, 14.0f);
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(textView, LayoutHelper.createLinear(-2, -2, 0.0f, 16));
        NotificationCenter.listenEmojiLoading(textView);
        TextView textView2 = new TextView(activity);
        this.removeView = textView2;
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(Theme.getColor(i, resourcesProvider));
        ScaleStateListAnimator.apply(textView2, 0.1f, 1.5f);
        textView2.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        textView2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(9.0f), Theme.multAlpha(0.1f, Theme.getColor(i, resourcesProvider))));
        textView2.setText(LocaleController.getString(R.string.BotAdWhat));
        linearLayout2.addView(textView2, LayoutHelper.createLinear(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.channelTitleView = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView3.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView3, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(textView3);
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(activity, null);
        this.textView = linksTextView;
        linksTextView.setTextSize(1, 13.0f);
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
        linksTextView.setTextColor(Theme.getColor(i2, resourcesProvider));
        linearLayout.addView(linksTextView, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(linksTextView);
        BackupImageView backupImageView = new BackupImageView(activity);
        this.imageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(4.0f));
        backupImageView.setVisibility(8);
        linearLayoutM.addView(backupImageView, LayoutHelper.createLinear(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.closeView = imageView;
        imageView.setBackground(Theme.createSelectorDrawable(5, Theme.multAlpha(0.2f, Theme.getColor(Theme.key_dialogEmptyImage, resourcesProvider)), -1));
        ScaleStateListAnimator.apply(imageView, 0.1f, 1.5f);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_topPanelClose, resourcesProvider), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda267(25));
        imageView.setVisibility(8);
        linearLayoutM.addView(imageView, LayoutHelper.createLinear(32, 32, 53, 10, 3, 0, 2));
    }

    public final void set(final ChatActivity chatActivity, final MessageObject messageObject, ChatActivity$$ExternalSyntheticLambda22 chatActivity$$ExternalSyntheticLambda22, ChatActivity$$ExternalSyntheticLambda22 chatActivity$$ExternalSyntheticLambda23) {
        SpannableStringBuilder spannableStringBuilder;
        if (messageObject == null) {
            return;
        }
        String str = messageObject.sponsoredTitle;
        TextView textView = this.titleView;
        CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false);
        CharSequence charSequence = messageObject.messageText;
        LinkSpanDrawable.LinksTextView linksTextView = this.textView;
        CharSequence charSequenceReplaceEmoji2 = Emoji.replaceEmoji(charSequence, linksTextView.getPaint().getFontMetricsInt(), false);
        String str2 = messageObject.sponsoredUrl;
        TLRPC.MessageMedia messageMedia = messageObject.sponsoredMedia;
        ImageView imageView = this.closeView;
        BackupImageView backupImageView = this.imageView;
        boolean z = true;
        if (messageMedia != null) {
            backupImageView.setVisibility(0);
            imageView.setVisibility(8);
            TLRPC.MessageMedia messageMedia2 = messageObject.sponsoredMedia;
            TLRPC.Document document = messageMedia2.document;
            if (document != null) {
                backupImageView.imageReceiver.setImage(ImageLocation.getForDocument(messageObject.sponsoredMedia.document), "48_48", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 48), messageObject.sponsoredMedia.document), "48_48", null, 0L, null, null, 0);
                backupImageView.onNewImageSet();
            } else {
                TLRPC.Photo photo = messageMedia2.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 48, true, null, true);
                    backupImageView.imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.sponsoredMedia.photo), "48_48", ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageObject.sponsoredMedia.photo.sizes, 48, true, closestPhotoSizeWithSize, false), messageObject.sponsoredMedia.photo), "48_48", null, 0L, null, null, 0);
                    backupImageView.onNewImageSet();
                }
            }
        } else {
            TLRPC.Photo photo2 = messageObject.sponsoredPhoto;
            if (photo2 != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 48, true, null, true);
                backupImageView.imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize2, messageObject.sponsoredPhoto), "48_48", ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageObject.sponsoredPhoto.sizes, 48, true, closestPhotoSizeWithSize2, false), messageObject.sponsoredPhoto), "48_48", null, 0L, null, null, 0);
                backupImageView.onNewImageSet();
                backupImageView.setVisibility(0);
                imageView.setVisibility(8);
            } else {
                backupImageView.setVisibility(8);
                imageView.setVisibility(0);
                z = false;
            }
        }
        int i = R.string.SponsoredMessageAd;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(i));
        int i2 = Theme.key_featuredStickers_addButton;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(Theme.getColor(i2, resourcesProvider)), 0, spannableStringBuilder2.length(), 33);
        spannableStringBuilder2.append((CharSequence) " \u2009");
        spannableStringBuilder2.append(charSequenceReplaceEmoji);
        float fMeasureText = textView.getPaint().measureText(spannableStringBuilder2.toString());
        float fDp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(44.660004f);
        TextView textView2 = this.removeView;
        float fMeasureText2 = ((fDp - textView2.getPaint().measureText(textView2.getText().toString())) - AndroidUtilities.dp(32.0f)) - AndroidUtilities.dp(z ? 58.0f : 0.0f);
        TextView textView3 = this.channelTitleView;
        if (fMeasureText > fMeasureText2) {
            spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(i));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Theme.getColor(i2, resourcesProvider)), 0, spannableStringBuilder.length(), 33);
            textView3.setVisibility(0);
            textView3.setText(charSequenceReplaceEmoji);
        } else {
            textView3.setVisibility(8);
            spannableStringBuilder = spannableStringBuilder2;
        }
        textView.setText(spannableStringBuilder);
        linksTextView.setText(charSequenceReplaceEmoji2);
        linksTextView.setOnLinkPressListener(new LinkSpanDrawable.LinksTextView.OnLinkPress() {
            @Override
            public final void run(ClickableSpan clickableSpan) {
                BotAdView botAdView = this.f$0;
                botAdView.getClass();
                ChatActivity chatActivity2 = chatActivity;
                if (chatActivity2 != null) {
                    chatActivity2.logSponsoredClicked(messageObject, false, false);
                }
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    if (url != null) {
                        url = url.trim();
                    }
                    if (chatActivity2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                        chatActivity2.openHashtagSearch(url, true);
                        return;
                    }
                }
                clickableSpan.onClick(botAdView.textView);
            }
        });
        textView2.setOnClickListener(new BotAdView$$ExternalSyntheticLambda1(chatActivity$$ExternalSyntheticLambda22, 0));
        setOnClickListener(new BotAdView$$ExternalSyntheticLambda2(this, chatActivity, messageObject, str2, 0));
        imageView.setOnClickListener(new BotAdView$$ExternalSyntheticLambda1(chatActivity$$ExternalSyntheticLambda23, 3));
    }
}
