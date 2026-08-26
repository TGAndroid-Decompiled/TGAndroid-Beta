package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;

public final class MentionCell extends LinearLayout {
    public boolean attached;
    public final AvatarDrawable avatarDrawable;
    public Drawable emojiDrawable;
    public final BackupImageView imageView;
    public final AnonymousClass1 nameTextView;
    public boolean needsDivider;
    public final Theme.ResourcesProvider resourcesProvider;
    public final TextView usernameTextView;

    public final class AnonymousClass1 extends TextView {
        public final int $r8$classId;

        public AnonymousClass1(Context context, int i) {
            super(context);
            this.$r8$classId = i;
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 1:
                    if (getPaddingLeft() > 0) {
                        canvas.drawCircle((getPaddingLeft() - AndroidUtilities.dp(2.5f)) / 2.0f, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.5f), getPaint());
                    }
                    super.dispatchDraw(canvas);
                    break;
                case 7:
                    super.dispatchDraw(canvas);
                    canvas.drawCircle(AndroidUtilities.dp(3.5f), AndroidUtilities.dp(11.5f), AndroidUtilities.dp(2.5f), getPaint());
                    break;
                default:
                    super.dispatchDraw(canvas);
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 5:
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(ActionBar.getCurrentActionBarHeight(), 1073741824));
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
        }

        @Override
        public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
            switch (this.$r8$classId) {
                case 0:
                    super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                    break;
                case 1:
                case 5:
                case 6:
                case 7:
                default:
                    super.setText(charSequence, bufferType);
                    break;
                case 2:
                    super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                    break;
                case 3:
                    super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                    break;
                case 4:
                    super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                    break;
                case 8:
                    super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                    break;
            }
        }
    }

    public MentionCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.needsDivider = false;
        this.resourcesProvider = resourcesProvider;
        setOrientation(0);
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        this.avatarDrawable = avatarDrawable;
        avatarDrawable.setTextSize(AndroidUtilities.dp(18.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(14.0f));
        addView(backupImageView, LayoutHelper.createLinear(28, 28, 8.0f, 4.0f, 0.0f, 0.0f));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, 0);
        this.nameTextView = anonymousClass1;
        anonymousClass1.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        anonymousClass1.setTextSize(1, 15.0f);
        anonymousClass1.setSingleLine(true);
        anonymousClass1.setGravity(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        anonymousClass1.setEllipsize(truncateAt);
        addView(anonymousClass1, LayoutHelper.createLinear(-2, -2, 16, 12, 0, 0, 0));
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
            AnonymousClass1 anonymousClass1 = this.nameTextView;
            drawable2.setBounds(anonymousClass1.getLeft() + iDp2, ((anonymousClass1.getBottom() + anonymousClass1.getTop()) - iDp) / 2, anonymousClass1.getLeft() + iDp2 + iDp, ((anonymousClass1.getBottom() + anonymousClass1.getTop()) + iDp) / 2);
            Drawable drawable3 = this.emojiDrawable;
            if (drawable3 instanceof AnimatedEmojiDrawable) {
                ((AnimatedEmojiDrawable) drawable3).setTime(System.currentTimeMillis());
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
        AnonymousClass1 anonymousClass1 = this.nameTextView;
        anonymousClass1.setPadding(0, 0, 0, 0);
        Drawable drawable = this.emojiDrawable;
        if (drawable != null) {
            if (drawable instanceof AnimatedEmojiDrawable) {
                ((AnimatedEmojiDrawable) drawable).removeView(this);
            }
            this.emojiDrawable = null;
            super.invalidate();
            anonymousClass1.invalidate();
        }
    }

    public void setChat(TLRPC.Chat chat) {
        resetEmojiSuggestion();
        AnonymousClass1 anonymousClass1 = this.nameTextView;
        BackupImageView backupImageView = this.imageView;
        TextView textView = this.usernameTextView;
        if (chat == null) {
            anonymousClass1.setText("");
            textView.setText("");
            backupImageView.setImageDrawable(null);
            return;
        }
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        avatarDrawable.setInfo(chat);
        TLRPC.ChatPhoto chatPhoto = chat.photo;
        if (chatPhoto == null || chatPhoto.photo_small == null) {
            backupImageView.setImageDrawable(avatarDrawable);
        } else {
            backupImageView.setForUserOrChat(chat, avatarDrawable);
        }
        anonymousClass1.setText(chat.title);
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
                AnimatedEmojiDrawable animatedEmojiDrawableMake = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, 0, Long.parseLong(keywordResult.emoji.substring(9)));
                this.emojiDrawable = animatedEmojiDrawableMake;
                if (this.attached) {
                    animatedEmojiDrawableMake.addView(this);
                }
            } catch (Exception unused) {
                this.emojiDrawable = Emoji.getEmojiDrawable(keywordResult.emoji);
            }
        }
        Drawable drawable2 = this.emojiDrawable;
        AnonymousClass1 anonymousClass1 = this.nameTextView;
        if (drawable2 != null) {
            anonymousClass1.setPadding(AndroidUtilities.dp(22.0f), 0, 0, 0);
            StringBuilder sbM = DiffUtil.m(":  ");
            sbM.append(keywordResult.keyword);
            anonymousClass1.setText(sbM);
            return;
        }
        anonymousClass1.setPadding(0, 0, 0, 0);
        StringBuilder sb = new StringBuilder();
        sb.append(keywordResult.emoji);
        sb.append(":  ");
        sb.append(keywordResult.keyword);
        anonymousClass1.setText(sb);
    }

    public void setIsDarkTheme(boolean z) {
        TextView textView = this.usernameTextView;
        AnonymousClass1 anonymousClass1 = this.nameTextView;
        if (z) {
            anonymousClass1.setTextColor(-1);
            textView.setTextColor(-4473925);
        } else {
            int i = Theme.key_windowBackgroundWhiteBlackText;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            anonymousClass1.setTextColor(Theme.getColor(i, resourcesProvider));
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
        AnonymousClass1 anonymousClass1 = this.nameTextView;
        BackupImageView backupImageView = this.imageView;
        TextView textView = this.usernameTextView;
        if (user == null) {
            anonymousClass1.setText("");
            textView.setText("");
            backupImageView.setImageDrawable(null);
            return;
        }
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        avatarDrawable.setInfo(user);
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto == null || userProfilePhoto.photo_small == null) {
            backupImageView.setImageDrawable(avatarDrawable);
        } else {
            backupImageView.setForUserOrChat(user, avatarDrawable);
        }
        anonymousClass1.setText(UserObject.getUserName(user));
        if (UserObject.getPublicUsername(user) != null) {
            textView.setText("@" + UserObject.getPublicUsername(user));
        } else {
            textView.setText("");
        }
        backupImageView.setVisibility(0);
        textView.setVisibility(0);
    }
}
