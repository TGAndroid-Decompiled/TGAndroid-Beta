package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.util.Log;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.PhotoViewer;

public final class MentionCell extends LinearLayout {
    public boolean attached;
    public final AvatarDrawable avatarDrawable;
    public Drawable emojiDrawable;
    public final BackupImageView imageView;
    public final ArticleViewer.AnonymousClass9 nameTextView;
    public boolean needsDivider;
    public final Theme.ResourcesProvider resourcesProvider;
    public final TextView usernameTextView;

    public MentionCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.needsDivider = false;
        this.resourcesProvider = resourcesProvider;
        setOrientation(0);
        AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        this.avatarDrawable = avatarDrawable;
        avatarDrawable.namePaint.setTextSize(AndroidUtilities.dp(18.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(14.0f));
        addView(backupImageView, LayoutHelper.createLinear(8.0f, 4.0f, 0.0f, 0.0f, 28, 28));
        ArticleViewer.AnonymousClass9 anonymousClass9 = new ArticleViewer.AnonymousClass9(context, 3);
        this.nameTextView = anonymousClass9;
        anonymousClass9.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        anonymousClass9.setTextSize(1, 15.0f);
        anonymousClass9.setSingleLine(true);
        anonymousClass9.setGravity(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        anonymousClass9.setEllipsize(truncateAt);
        addView(anonymousClass9, LayoutHelper.createLinear(-2, -2, 16, 12, 0, 0, 0));
        TextView textView = new TextView(context);
        this.usernameTextView = textView;
        OKLCH.m(Theme.key_windowBackgroundWhiteGrayText3, resourcesProvider, textView, 15.0f);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(truncateAt);
        addView(textView, LayoutHelper.createLinear(-2, -2, 16, 12, 0, 8, 0));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = this.emojiDrawable;
        if (drawable != null) {
            int iDp = AndroidUtilities.dp(drawable instanceof AnimatedEmojiDrawable ? 24.0f : 20.0f);
            int iDp2 = AndroidUtilities.dp(this.emojiDrawable instanceof AnimatedEmojiDrawable ? -2.0f : 0.0f);
            Drawable drawable2 = this.emojiDrawable;
            ArticleViewer.AnonymousClass9 anonymousClass9 = this.nameTextView;
            drawable2.setBounds(anonymousClass9.getLeft() + iDp2, ((anonymousClass9.getBottom() + anonymousClass9.getTop()) - iDp) / 2, anonymousClass9.getLeft() + iDp2 + iDp, ((anonymousClass9.getBottom() + anonymousClass9.getTop()) + iDp) / 2);
            Drawable drawable3 = this.emojiDrawable;
            if (drawable3 instanceof AnimatedEmojiDrawable) {
                AnimatedEmojiDrawable animatedEmojiDrawable = (AnimatedEmojiDrawable) drawable3;
                long jCurrentTimeMillis = System.currentTimeMillis();
                PhotoViewer.AnonymousClass11 anonymousClass11 = animatedEmojiDrawable.imageReceiver;
                if (anonymousClass11 != null) {
                    if (animatedEmojiDrawable.cacheType == 8) {
                        jCurrentTimeMillis = 0;
                    }
                    anonymousClass11.setCurrentTime(jCurrentTimeMillis);
                }
            }
            this.emojiDrawable.draw(canvas);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.nameTextView.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        Drawable drawable = this.emojiDrawable;
        if (drawable instanceof AnimatedEmojiDrawable) {
            ((AnimatedEmojiDrawable) drawable).addView(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
        Drawable drawable = this.emojiDrawable;
        if (drawable instanceof AnimatedEmojiDrawable) {
            ((AnimatedEmojiDrawable) drawable).removeView(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.needsDivider) {
            canvas.drawLine(AndroidUtilities.dp(52.0f), getHeight() - 1, getWidth() - AndroidUtilities.dp(8.0f), getHeight() - 1, Theme.dividerPaint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    public final void resetEmojiSuggestion() {
        ArticleViewer.AnonymousClass9 anonymousClass9 = this.nameTextView;
        anonymousClass9.setPadding(0, 0, 0, 0);
        Drawable drawable = this.emojiDrawable;
        if (drawable != null) {
            if (drawable instanceof AnimatedEmojiDrawable) {
                ((AnimatedEmojiDrawable) drawable).removeView(this);
            }
            this.emojiDrawable = null;
            super.invalidate();
            anonymousClass9.invalidate();
        }
    }

    public void setChat(TLRPC.Chat chat) {
        resetEmojiSuggestion();
        ArticleViewer.AnonymousClass9 anonymousClass9 = this.nameTextView;
        BackupImageView backupImageView = this.imageView;
        TextView textView = this.usernameTextView;
        if (chat == null) {
            anonymousClass9.setText("");
            textView.setText("");
            backupImageView.setImageDrawable(null);
            return;
        }
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        avatarDrawable.setInfo(UserConfig.selectedAccount, chat);
        TLRPC.ChatPhoto chatPhoto = chat.photo;
        if (chatPhoto == null || chatPhoto.photo_small == null) {
            backupImageView.setImageDrawable(avatarDrawable);
        } else {
            backupImageView.imageReceiver.setForUserOrChat(chat, avatarDrawable);
            backupImageView.onNewImageSet();
        }
        anonymousClass9.setText(chat.title);
        String publicUsername = ChatObject.getPublicUsername(chat);
        if (publicUsername != null) {
            textView.setText("@".concat(publicUsername));
        } else {
            textView.setText("");
        }
        backupImageView.setVisibility(0);
        textView.setVisibility(0);
    }

    public void setDivider(boolean z) {
        if (z != this.needsDivider) {
            this.needsDivider = z;
            setWillNotDraw(!z);
            super.invalidate();
            this.nameTextView.invalidate();
        }
    }

    public void setEmojiSuggestion(MediaDataController.KeywordResult keywordResult) {
        this.imageView.setVisibility(4);
        this.usernameTextView.setVisibility(4);
        String str = keywordResult.emoji;
        if (str == null || !str.startsWith("animated_")) {
            this.emojiDrawable = Emoji.getEmojiDrawable(keywordResult.emoji);
        } else {
            try {
                Drawable drawable = this.emojiDrawable;
                if (drawable instanceof AnimatedEmojiDrawable) {
                    ((AnimatedEmojiDrawable) drawable).removeView(this);
                    this.emojiDrawable = null;
                }
                AnimatedEmojiDrawable animatedEmojiDrawableMake = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, Long.parseLong(keywordResult.emoji.substring(9)), null, 0);
                this.emojiDrawable = animatedEmojiDrawableMake;
                if (this.attached) {
                    animatedEmojiDrawableMake.addView(this);
                }
            } catch (Exception unused) {
                this.emojiDrawable = Emoji.getEmojiDrawable(keywordResult.emoji);
            }
        }
        Drawable drawable2 = this.emojiDrawable;
        ArticleViewer.AnonymousClass9 anonymousClass9 = this.nameTextView;
        if (drawable2 != null) {
            anonymousClass9.setPadding(AndroidUtilities.dp(22.0f), 0, 0, 0);
            StringBuilder sbM = Log.m(":  ");
            sbM.append(keywordResult.keyword);
            anonymousClass9.setText(sbM);
            return;
        }
        anonymousClass9.setPadding(0, 0, 0, 0);
        StringBuilder sb = new StringBuilder();
        sb.append(keywordResult.emoji);
        sb.append(":  ");
        sb.append(keywordResult.keyword);
        anonymousClass9.setText(sb);
    }

    public void setIsDarkTheme(boolean z) {
        TextView textView = this.usernameTextView;
        ArticleViewer.AnonymousClass9 anonymousClass9 = this.nameTextView;
        if (z) {
            anonymousClass9.setTextColor(-1);
            textView.setTextColor(-4473925);
        } else {
            int i = Theme.key_windowBackgroundWhiteBlackText;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            anonymousClass9.setTextColor(Theme.getColor(i, resourcesProvider));
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3, resourcesProvider));
        }
    }

    public void setText(String str) {
        resetEmojiSuggestion();
        this.imageView.setVisibility(4);
        this.usernameTextView.setVisibility(4);
        this.nameTextView.setText(str);
    }

    public void setUser(TLRPC.User user) {
        resetEmojiSuggestion();
        ArticleViewer.AnonymousClass9 anonymousClass9 = this.nameTextView;
        BackupImageView backupImageView = this.imageView;
        TextView textView = this.usernameTextView;
        if (user == null) {
            anonymousClass9.setText("");
            textView.setText("");
            backupImageView.setImageDrawable(null);
            return;
        }
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        avatarDrawable.setInfo(UserConfig.selectedAccount, user);
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto == null || userProfilePhoto.photo_small == null) {
            backupImageView.setImageDrawable(avatarDrawable);
        } else {
            backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
            backupImageView.onNewImageSet();
        }
        anonymousClass9.setText(UserObject.getUserName(user));
        if (UserObject.getPublicUsername(user) != null) {
            textView.setText("@" + UserObject.getPublicUsername(user));
        } else {
            textView.setText("");
        }
        backupImageView.setVisibility(0);
        textView.setVisibility(0);
    }
}
