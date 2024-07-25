package org.telegram.ui.Components.Premium.boosts.cells;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
@SuppressLint({"ViewConstructor"})
public class ChatCell extends BaseCell {
    private TLRPC$Chat chat;
    private ChatDeleteListener chatDeleteListener;
    private final ImageView deleteImageView;
    private boolean removable;

    public interface ChatDeleteListener {
        void onChatDeleted(TLRPC$Chat tLRPC$Chat);
    }

    @Override
    protected boolean needCheck() {
        return false;
    }

    public ChatCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider);
        this.titleTextView.setTypeface(AndroidUtilities.bold());
        ImageView imageView = new ImageView(context);
        this.deleteImageView = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_stickers_menuSelector)));
        imageView.setImageResource(R.drawable.poll_remove);
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayIcon), PorterDuff.Mode.MULTIPLY));
        imageView.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        boolean z = LocaleController.isRTL;
        addView(imageView, LayoutHelper.createFrame(48, 50.0f, (z ? 3 : 5) | 17, z ? 3.0f : 0.0f, 0.0f, z ? 0.0f : 3.0f, 0.0f));
        this.titleTextView.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 24.0f : 0.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 24.0f), 0);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.deleteImageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public TLRPC$Chat getChat() {
        return this.chat;
    }

    public void setChat(final TLRPC$Chat tLRPC$Chat, int i, boolean z, int i2) {
        String string;
        this.removable = z;
        this.chat = tLRPC$Chat;
        this.avatarDrawable.setInfo(tLRPC$Chat);
        this.imageView.setRoundRadius(AndroidUtilities.dp(20.0f));
        this.imageView.setForUserOrChat(tLRPC$Chat, this.avatarDrawable);
        this.titleTextView.setText(Emoji.replaceEmoji(tLRPC$Chat.title, this.titleTextView.getPaint().getFontMetricsInt(), false));
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(tLRPC$Chat);
        if (z) {
            if (i2 >= 1) {
                string = LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "Subscribers" : "Members", i2, new Object[0]);
            } else {
                string = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.DiscussChannel : R.string.AccDescrGroup);
            }
            setSubtitle(string);
        } else {
            setSubtitle(LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", i, new Object[0]));
        }
        this.subtitleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray3, this.resourcesProvider));
        setDivider(true);
        if (z) {
            this.deleteImageView.setVisibility(0);
        } else {
            this.deleteImageView.setVisibility(4);
        }
        this.deleteImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatCell.this.lambda$setChat$0(tLRPC$Chat, view);
            }
        });
    }

    public void lambda$setChat$0(TLRPC$Chat tLRPC$Chat, View view) {
        ChatDeleteListener chatDeleteListener = this.chatDeleteListener;
        if (chatDeleteListener != null) {
            chatDeleteListener.onChatDeleted(tLRPC$Chat);
        }
    }

    public void setChatDeleteListener(ChatDeleteListener chatDeleteListener) {
        this.chatDeleteListener = chatDeleteListener;
    }

    public void setCounter(int i, int i2) {
        String string;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(this.chat);
        if (this.removable) {
            if (i2 >= 1) {
                string = LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "Subscribers" : "Members", i2, new Object[0]);
            } else {
                string = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.DiscussChannel : R.string.AccDescrGroup);
            }
            setSubtitle(string);
            return;
        }
        setSubtitle(LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", i, new Object[0]));
    }
}
